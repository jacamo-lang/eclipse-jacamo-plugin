package jacamoide.commands;

import java.io.PrintStream;
import java.io.StringReader;

import jacamoide.core.PluginConstants;
import jacamoide.core.Utils;
import jacamoide.ui.ErrorDialog;
import jacamo.infra.RunJaCaMoProject;
import jacamo.project.JaCaMoProject;
import jacamo.project.parser.ParseException;
import jacamo.project.parser.TokenMgrError;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.handlers.HandlerUtil;

public class RunJaCaMoApplication extends AbstractHandler {  
	public RunJaCaMoApplication() {
		super();
		
		MessageConsole console = findConsole("Console");
		MessageConsoleStream out = console.newMessageStream();
		
		System.setOut(new PrintStream(out));
		System.setErr(new PrintStream(out));
	}
	
	private MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++) {
			if (name.equals(existing[i].getName()))
				return (MessageConsole) existing[i];
		}
		//no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[]{myConsole});
		return myConsole;
	}
	
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getSelection();
		
		boolean debug = event.getCommand().getId().equals("jacamoide.debugJaCaMoApplication");
		
		if (selection instanceof ITreeSelection) {
			ITreeSelection ts = (ITreeSelection)selection;
			Object firstElement = ts.getFirstElement();
			IProject project = null;
			IResource res = null;
			
			if (firstElement instanceof IProject){
				project = (IProject)firstElement;
			} else if (firstElement instanceof IResource){
				res = (IResource)firstElement;
				project = res.getProject();
			} else if (firstElement instanceof IJavaElement){
				IJavaElement javaElement = (IJavaElement)firstElement;
				res = javaElement.getResource();
        		project = res.getProject();
			}
			
			try {
				if (project != null && project.isNatureEnabled("jacamoide.jacamoNature")) {
					run(debug, project, res);
					return null;
				}
			} catch (CoreException e) {
				e.printStackTrace();
				ErrorDialog.open(e);
			}
		} else {
			IEditorPart editor = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage().getActiveEditor();
			IEditorInput input = editor.getEditorInput();
			IResource resource = (IResource) input.getAdapter(IResource.class);
			
			if (resource != null){
				IProject project = resource.getProject();
				run(debug, project, resource);
				return null;
			}
		}
		ErrorDialog.open("JaCaMo application not found.\nPlease select a resource related to a JaCaMo project");
		return null;
	}

	private void run(boolean debug, IProject project, IResource resource) {
		if (!Utils.checkErrorsInProject(project, "run")){
			return;
		}
		
		try {
			project.build(0, null);
		} catch (CoreException e) {
			e.printStackTrace();
			ErrorDialog.open(e);
			return;
		}
//		System.out.println("Running JaCaMo application " + project.getName());
		
		runProject(debug, project, resource);
	}

    public void runProject(final boolean debug, final IProject projectEclipse, final IResource resource) {
    	System.out.println("Launching " + projectEclipse.getName());
        
        new Thread() {
            public void run() {
            	
            	IResource mainFile = null;
            	
				if (resource != null && resource.getFileExtension() != null && resource.getFileExtension().equals(PluginConstants.MASJACAMO_EXT)) {
					mainFile = resource;
				} else {
	            	try {
	        			for (IResource res : projectEclipse.members()) {
	        				if (res.getFileExtension() != null && res.getFileExtension().equals(PluginConstants.MASJACAMO_EXT)) {
	        					mainFile = res;
	        					break;
	        				}
	        			}
	        		} catch (CoreException e) {
	        			e.printStackTrace();
	        		}
				}
            	
				String params[] = {mainFile.getLocation().toString()};
            	RunJaCaMoProject.main(params);
				
				/*
            	JaCaMoProject project = parseProject(mainFile, projectEclipse);
                if (project == null || mainFile == null) // || !parseProjectAS(project)) {
                    return;
                
                // launch the MAS
                try {
                	MASLauncherInfraTier masLauncher;
                    masLauncher = project.getInfrastructureFactory().createMASLauncher();
                    masLauncher.setProject(project);
                    //masLauncher.setListener(arg0)
                    if (masLauncher.writeScripts(debug)) {
                        new Thread(masLauncher, "MAS-Launcher").start();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }*/
            }
        }.start();
    }
    
    private JaCaMoProject parseProject(IResource mainFile, IProject projectEclipse) {
        try {
        	System.out.println("Parsing project file... ");

        	//String text = loadFile(mainFile.getLocation().toString());
        	String text = Utils.loadFile(mainFile.getLocation().toString());
        	
        	jacamo.project.parser.JaCaMoProjectParser parser = new jacamo.project.parser.JaCaMoProjectParser(new StringReader(text));
            JaCaMoProject project = parser.parse("");
            //project.setDirectory(projectEclipse.getLocation().toString());
            //project.setProjectFile(new File(mainFile.getLocation().toString()));
            //project.fixAgentsSrc(null);
            System.out.println(" parsed successfully!\n");
            return project;
        } catch (ParseException ex) {  
        	System.out.println("\njcm: syntactic errors found... \n" + ex + "\n");
        } catch (TokenMgrError ex) {
        	System.out.println("\njcm: lexical errors found... \n" + ex + "\n");
        } catch (Exception ex) {
        	System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace();
        }
        return null;
    }
}
