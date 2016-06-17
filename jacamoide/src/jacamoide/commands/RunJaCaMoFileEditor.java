package jacamoide.commands;

import jacamo.infra.RunJaCaMoProject;
import jacamo.project.JaCaMoProject;
import jacamo.project.parser.ParseException;
import jacamo.project.parser.TokenMgrError;
import jacamoide.core.Utils;

import java.io.File;
import java.io.PrintStream;
import java.io.StringReader;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class RunJaCaMoFileEditor implements IEditorActionDelegate {
	private IFile jacamoFile = null; 
	
	public RunJaCaMoFileEditor() {
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
	public void run(IAction action) {
		boolean debug = action.getActionDefinitionId().equals("debug");
		runProject(debug);
	}
	
    private void runProject(final boolean debug) {
    	System.out.println("Launching " + jacamoFile.getProject().getName());
        
        new Thread() {
            public void run() {
            	
            	String params[] = {jacamoFile.getLocation().toString()};
            	RunJaCaMoProject.main(params);
            	
            	/*
            	JaCaMoProject project = parseProject();
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
    
    private JaCaMoProject parseProject() {
        try {
        	System.out.println("Parsing project file... ");

        	//String text = loadFile(mainFile.getLocation().toString());
        	String text = Utils.loadFile(jacamoFile.getLocation().toString());
        	
        	jacamo.project.parser.JaCaMoProjectParser parser = new jacamo.project.parser.JaCaMoProjectParser(new StringReader(text));
            JaCaMoProject project = parser.parse("");
            //project.setDirectory(Utils.getDirectoryOfFile(jacamoFile.getLocation().toString()));
            //project.setProjectFile(new File(jacamoFile.getLocation().toString()));
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

	@Override
	public void setActiveEditor(IAction action, IEditorPart targetEditor) {
		if (targetEditor != null && targetEditor.getEditorInput() instanceof IFileEditorInput)
			jacamoFile = ((IFileEditorInput)targetEditor.getEditorInput()).getFile();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		
	}
}