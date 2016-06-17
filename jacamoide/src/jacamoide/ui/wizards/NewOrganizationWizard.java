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

public class NewOrganizationWizard extends Wizard implements INewWizard {
	private IWorkbench workbench;
	private IStructuredSelection selection;
	private NewOrganizationWizardPage page;

	public NewOrganizationWizard() {
		super();
		setWindowTitle("New Moise Organization");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		this.workbench = workbench;
	}
	 
	public void addPages() {
		page = new NewOrganizationWizardPage(workbench, selection);
		addPage(page);
    }
	
	@Override
	public boolean performFinish() {
		IProject project = page.getSelectedProject();
		String fileExtension = page.getOrganizationFileExtension();
		String organizationName;
		
		if (fileExtension.length() == 0){
			organizationName = page.getOrganizationName() + "." + PluginConstants.ORGANIZATION_EXT;
		} else {
			organizationName = page.getOrganizationName();
		}
		String containerName = "/" + project.getName() + "/src/org";
		IResource organizationFolder = project.findMember("src/org");
		IContainer container = (IContainer)organizationFolder;
        IFile file = container.getFile(new Path(organizationName));
        
        try {
            InputStream stream = PluginTemplates.openContentStreamOrganization(containerName, organizationName);
            
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
