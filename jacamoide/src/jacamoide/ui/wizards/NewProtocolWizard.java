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

public class NewProtocolWizard extends Wizard implements INewWizard {
	private IWorkbench workbench;
	private IStructuredSelection selection;
	private NewProtocolWizardPage page;

	public NewProtocolWizard() {
		super();
		setWindowTitle("New Interaction Protocol");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		this.workbench = workbench;
	}
	 
	public void addPages() {
		page = new NewProtocolWizardPage(workbench, selection);
		addPage(page);
    }
	
	@Override
	public boolean performFinish() {
		IProject project = page.getSelectedProject();
		String fileExtension = page.getProtocolFileExtension();
		String protocolName;
		
		if (fileExtension.length() == 0){
			protocolName = page.getProtocolName() + "." + PluginConstants.INTERACTION_EXT;
		} else {
			protocolName = page.getProtocolName();
		}
		String containerName = "/" + project.getName() + "/src/int";
		IResource protocolFolder = project.findMember("src/int");
		IContainer container = (IContainer)protocolFolder;
        IFile file = container.getFile(new Path(protocolName));
        
        try {
            InputStream stream = PluginTemplates.openContentStreamProtocol(containerName, protocolName);
            
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
