package jacamoide.ui.wizards;


import jacamoide.core.PluginConstants;
import jacamoide.core.PluginTemplates;
import jacamoide.core.Utils;
import jacamoide.ui.ErrorDialog;

import java.io.InputStream;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class NewAgentWizard extends Wizard implements INewWizard {
	private IWorkbench workbench;
	private IStructuredSelection selection;
	private NewAgentWizardPage page;
	private NewAgentAdvancedWizardPage pageAdvanced;
	private IProject project;

	public NewAgentWizard() {
		super();
		setWindowTitle("Add Jason Agent");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		this.workbench = workbench;
		
		if (selection instanceof ITreeSelection) {
			ITreeSelection ts = (ITreeSelection)selection;
			Object firstElement = ts.getFirstElement();
			IProject project = null;
			
			if (firstElement instanceof IProject){
				project = (IProject)firstElement;
			} else if (firstElement instanceof IResource){
				IResource res = (IResource)firstElement;
				project = res.getProject();
			} else if (firstElement instanceof IJavaElement){
				IJavaElement javaElement = (IJavaElement)firstElement;
				IResource res = javaElement.getResource();
				project = res.getProject();
			}
			
			this.project = project;
		}
	}
	 
	public void addPages() {
		page = new NewAgentWizardPage(workbench, selection);
		pageAdvanced = new NewAgentAdvancedWizardPage(workbench, selection, project);
		addPage(page);
		addPage(pageAdvanced);
    }
	
	private int testInsideComment(String sourceMainFile, int idStartIndex) {
		int multiLineComment = 0;
		while (multiLineComment < sourceMainFile.length()) {
			int idxOpen = sourceMainFile.indexOf("/*", multiLineComment);
			int idxClose = sourceMainFile.indexOf("*/", multiLineComment);
			
			if (idxOpen == -1)
				break;
			
			if (idxOpen != -1 && idxClose == -1)
				return sourceMainFile.length();
			
			if (idStartIndex >= idxOpen && idStartIndex <= idxClose)
				return idxClose+2;
			
			multiLineComment = idxClose + 2;
		}
		
		int singleLineComment = 0;
		while (singleLineComment < sourceMainFile.length()) {
			int idxOpen = sourceMainFile.indexOf("//", singleLineComment);
			int idxClose = sourceMainFile.indexOf("\n", singleLineComment);
			
			if (idxOpen == -1)
				break;
			
			if (idxOpen != -1 && idxClose == -1)
				return sourceMainFile.length();
			
			if (idStartIndex >= idxOpen && idStartIndex <= idxClose)
				return idxClose + 1;
			
			singleLineComment = idxClose + 1;
		}
		
		return -1;
	}
	
	@Override
	public boolean performFinish() {
		String fileExtension = page.getAgentFileExtension();
		String agentName;
		String agentSource;
		
		
		if (fileExtension.length() == 0){
			agentName = page.getAgentName() + "." + PluginConstants.AGENT_EXT;
		} else {
			agentName = page.getAgentName();
		}
		
		if (page.getAgentSource() != null && page.getAgentSource().trim().length() > 0) {
			fileExtension = page.getAgentSourceFileExtension();
			if (fileExtension.length() == 0){
				agentSource = page.getAgentSource() + "." + PluginConstants.AGENT_EXT;
			} else {
				agentSource = page.getAgentSource();
			}
		} else {
			agentSource = agentName;
		}
		
		if (!checkAgentAlreadyExists(agentSource)) {
			String containerName = "/" + project.getName() + "/src/agt";
			IResource agentsFolder = project.findMember("src/agt");
			IContainer container = (IContainer)agentsFolder;
	        IFile file = container.getFile(new Path(agentSource));
	        
	        try {
	            InputStream stream = PluginTemplates.openContentStreamAgent(containerName, agentSource);
	            
	            if (file.exists()) {
	                file.setContents(stream, true, true, null);
	            } else {
	                file.create(stream, true, null);
	            }
	            stream.close();
	        } catch (Exception e) {
	        	e.printStackTrace();
	            ErrorDialog.open(e);
	        }
	        Utils.selectAndReveal(getShell(), (IResource)file);
	        Utils.openResource(getShell(), file);
		}
		
        //Add agent in JCM
        IResource mainFile = null;
		try {
			for (IResource res : project.members()) {
				if (res.getFileExtension() != null && res.getFileExtension().equals(PluginConstants.MASJACAMO_EXT)) {
					mainFile = res;
					break;
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
        
		if (mainFile != null) {
	        try {
				String sourceMainFile = Utils.loadFile(mainFile.getLocation().toString());
				
				String agent = "agent " + generateAgente();
				
				int idStartIndex = 0;
				int idxStartReplace = 0;
				int i = -1;
				int x = 0;
				while (idStartIndex < sourceMainFile.length()) {
					i = sourceMainFile.indexOf("mas", idStartIndex);
					
					if (i == -1) break;
					
					x = testInsideComment(sourceMainFile, i);
					
					if (x != -1) {
						idStartIndex = x;
					} else {
						break;
					}
				}
				
				for (; i < sourceMainFile.length(); i++) {
					if (sourceMainFile.charAt(i) == '{') {
						idxStartReplace = i;
						break;
					}
				}
				
				if (idxStartReplace > 0) {
					sourceMainFile = sourceMainFile.substring(0, idxStartReplace+1) + "\n\t" + agent + sourceMainFile.substring(idxStartReplace+1, sourceMainFile.length());
				}
				
				Utils.saveFile(mainFile.getLocation().toString(), sourceMainFile, false);
		        Utils.selectAndReveal(getShell(), mainFile);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
        
		return true;
	}
	
	private String generateAgente() {
		String agent = page.getAgentName().trim();
		boolean params = false;
		
		//Source
		if (page.getAgentSource() != null && page.getAgentSource().trim().length() > 0 &&
			!page.getAgentFileWithoutExtension().trim().equals(page.getAgentName().trim())) {
			
			agent += " : " + page.getAgentFileWithoutExtension().trim() + "." + PluginConstants.AGENT_EXT;
		}
		
		//Instances
		if (pageAdvanced.getAgentNumber() != null  && pageAdvanced.getAgentNumber().trim().length() > 0 && !pageAdvanced.getAgentNumber().trim().equals("1")) {
			
			if (!params) {
				params = true;
				agent += " {\n";
			}
			
			agent += "\t\tinstances: " + pageAdvanced.getAgentNumber() + "\n";
		}
		
		//Node
		if (pageAdvanced.getAgentNode()!= null && pageAdvanced.getAgentNode().trim().length() > 0) {
			if (!params) {
				params = true;
				agent += " {\n";
			}
			
			agent += "\t\tnode: " + pageAdvanced.getAgentNode() + "\n";
		}
		
		//Beliefs
		if (pageAdvanced.getBeliefs()!= null && pageAdvanced.getBeliefs().trim().length() > 0) {
			if (!params) {
				params = true;
				agent += " {\n";
			}
			
			agent += "\t\tbeliefs: " + pageAdvanced.getBeliefs() + "\n";
		}
		
		//Goals
		if (pageAdvanced.getGoals()!= null && pageAdvanced.getGoals().trim().length() > 0) {
			if (!params) {
				params = true;
				agent += " {\n";
			}
			
			agent += "\t\tgoals: " + pageAdvanced.getGoals()+ "\n";
		}
		
		//Verbose
		if (pageAdvanced.getAgentVerbose().equals("no output")) {
			if (!params) {
				params = true;
				agent += " {\n";
			}
			
			agent += "\t\tverbose: 0\n";
		} else if (pageAdvanced.getAgentVerbose().equals("debug")) {
			if (!params) {
				params = true;
				agent += " {\n";
			}
			
			agent += "\t\tverbose: 2\n";
		}
		
		//Mind inspector
		if (pageAdvanced.getMindinspector().equals("enabled")) {
			if (!params) {
				params = true;
				agent += " {\n";
			}
			
			agent += "\t\tdebug: mindinspector(file(cycle,xml,log))\n";
		}
		
		//Architecture class
		if (pageAdvanced.getArchitectureClass() != null && pageAdvanced.getArchitectureClass().trim().length() > 0) {
			if (!params) {
				params = true;
				agent += " {\n";
			}
			
			agent += "\t\tag-arch: " + pageAdvanced.getArchitectureClass().trim() + "\n";
		}
		
		//Agent class
		if (pageAdvanced.getAgentClass() != null && pageAdvanced.getAgentClass().trim().length() > 0) {
			if (!params) {
				params = true;
				agent += " {\n";
			}
			
			agent += "\t\tag-class: " + pageAdvanced.getAgentClass().trim() + "\n";
		}
		
		//Belief base class
		if (pageAdvanced.getBeliefBaseClass() != null && pageAdvanced.getBeliefBaseClass().trim().length() > 0) {
			if (!params) {
				params = true;
				agent += " {\n";
			}
			
			agent += "\t\tag-bb-class: " + pageAdvanced.getBeliefBaseClass().trim() + "\n";
		}
		
		if (params) {
			params = true;
			agent += "\t}\n";
		}
		
		return agent;
	}
	
	private boolean checkAgentAlreadyExists(String agentFileWithDot) {
		IProject project = this.project;
		
		IResource resource = project.findMember("src/agt/" + agentFileWithDot);

		return resource != null;
	}
}
