package jacamoide.commands;

import jacamo.infra.RunJaCaMoProject;
import java.io.PrintStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class RunJaCaMoFile implements IObjectActionDelegate {
	private IFile jacamoFile = null; 
	
	public RunJaCaMoFile() {
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
            }
        }.start();
    }
    
    /*
    private JaCaMoProject parseProject() {
        try {
        	System.out.println("Parsing project file... ");

        	String text = Utils.loadFile(jacamoFile.getLocation().toString());
        	
        	jacamo.project.parser.JaCaMoProjectParser parser = new jacamo.project.parser.JaCaMoProjectParser(new StringReader(text));
        	
        	JaCaMoProject project = parser.parse("");
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
    }*/

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
        if (selection != null && selection instanceof ISelection) {
            IStructuredSelection strucSel = (IStructuredSelection) selection;
            
            jacamoFile = (IFile)strucSel.getFirstElement();
        }
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		
	}
}