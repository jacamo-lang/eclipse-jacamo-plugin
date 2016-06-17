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
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class NewAgentTypeWizard extends Wizard implements INewWizard {
	private IWorkbench workbench;
	private IStructuredSelection selection;
	private NewAgentTypeWizardPage page;

	public NewAgentTypeWizard() {
		super();
		setWindowTitle("New Jason Agent Type");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		this.workbench = workbench;
	}
	 
	public void addPages() {
		page = new NewAgentTypeWizardPage(workbench, selection);
		addPage(page);
    }
	
	@Override
	public boolean performFinish() {
		IProject project = page.getSelectedProject();
		String fileExtension = page.getAgentFileExtension();
		String agentName;
		
		if (fileExtension.length() == 0){
			agentName = page.getAgentName() + "." + PluginConstants.AGENT_EXT;
		} else {
			agentName = page.getAgentName();
		}
		String containerName = "/" + project.getName() + "/src/agt";
		IResource agentsFolder = project.findMember("src/agt");
		IContainer container = (IContainer)agentsFolder;
        IFile file = container.getFile(new Path(agentName));
        
        try {
            InputStream stream = PluginTemplates.openContentStreamAgent(containerName, agentName);
            
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
        
		return true;
	}
}
