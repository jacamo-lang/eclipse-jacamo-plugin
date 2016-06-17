package jacamoide.ui.wizards;

import jacamoide.core.PluginConstants;
import jacamoide.core.Utils;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.IWorkbench;

public class NewOrganizationWizardPage extends JaCaMoWizardPage implements Listener {
	private Label organizationNameLabel;
	private Text organizationNameText;
	
	private IStatus organizationNameStatus, organizationAlreadyExistsStatus;
	
	public NewOrganizationWizardPage(IWorkbench workbench, IStructuredSelection selection) {
		super("New Moise Organization", "This wizard creates a new Moise organization",	"Create a Moise organization in project:", workbench, selection);
		organizationNameStatus = new Status(IStatus.OK, "not_used", 0, "", null);
		organizationAlreadyExistsStatus = new Status(IStatus.OK, "not_used", 0, "", null);
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		GridLayout layout = new GridLayout();
		int nCols = 2;
		layout.numColumns = nCols;
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_FILL));
		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
		gridData.widthHint = 250;
		
		//Organization filename
		organizationNameLabel = new Label(composite, SWT.NONE);
		organizationNameLabel.setText("Organization filename:");
		 
		organizationNameText = new Text(composite, SWT.BORDER | SWT.SINGLE);
		organizationNameText.setLayoutData(gridData);
		organizationNameText.addListener(SWT.Modify, this);
		organizationNameText.setFocus();
	}

	@Override
	public void handleEvent(Event event) {
		Widget source = event.widget;
		
		if (source == organizationNameText){
			checkOrganizationName();
			checkOrganizationAlreadyExists();
			checkProjectsList();
		} else if (source == projectsList){
			checkProjectsList();
		}
		showStatus(findMostSevere());
		setPageComplete(isPageComplete());
		getWizard().getContainer().updateButtons();
	}
	
	private IStatus findMostSevere() {
		if (projectStatus.matches(IStatus.ERROR)){
			return projectStatus;
		}
		
		if (organizationNameStatus.matches(IStatus.ERROR)){
			return organizationNameStatus;
		}
		
		if (organizationAlreadyExistsStatus.matches(IStatus.ERROR)){
			return organizationAlreadyExistsStatus;
		}
		return new Status(IStatus.OK, "not_used", 0, "", null);
	}
	
	private void checkOrganizationName() {
		Status status = new Status(IStatus.OK, "not_used", 0, "", null);
		String organizationNameWithoutExtension = Utils.removeFileExtension(organizationNameText.getText());
		String fileExtension =  getOrganizationFileExtension();
		boolean error = false;
		
		if (organizationNameWithoutExtension.length() == 0){
			error = true;
			status = new Status(IStatus.ERROR, "not_used", 0, "Organization name can't be empty", null);
		} else {
			char cFirst = organizationNameWithoutExtension.charAt(0);
			
			if (!Character.isLowerCase(cFirst)){
				error = true;
				status = new Status(IStatus.ERROR, "not_used", 0, "Organization name must start with a lowercase letter", null);
			} else {
				for (int i = 1; i < organizationNameWithoutExtension.length(); i++){
					char c = organizationNameWithoutExtension.charAt(i);
					
					if (!error && !Character.isLetterOrDigit(c) && c != '_'){
						error = true;
						status = new Status(IStatus.ERROR, "not_used", 0, "Organization name must contain only letters, digits or '_'", null);
					}
				}
			}
		}
		
		if (!error) {
			if (!fileExtension.equals("") && !fileExtension.equals("." + PluginConstants.ORGANIZATION_EXT)){
				status = new Status(IStatus.ERROR, "not_used", 0, "Invalid file extension. Use '." + PluginConstants.ORGANIZATION_EXT + "', or just omit it", null);
			}
		}
		organizationNameStatus = status;
	}
	
	private void checkOrganizationAlreadyExists() {
		Status status = new Status(IStatus.OK, "not_used", 0, "", null);
		IProject project = getSelectedProject();
		String fileExtension =  getOrganizationFileExtension();
		
		if (fileExtension.length() == 0){
			IResource resource = project.findMember("src/org/" + organizationNameText.getText() + "." + PluginConstants.ORGANIZATION_EXT);
			
			if (resource != null){
				status = new Status(IStatus.ERROR, "not_used", 0, 
						"Organization '" + organizationNameText.getText() + "." + PluginConstants.ORGANIZATION_EXT + "' already exists", null);
			}
		} else {
			IResource resource = project.findMember("src/org/" + organizationNameText.getText());
			
			if (resource != null){
				status = new Status(IStatus.ERROR, "not_used", 0, "Organization '" + organizationNameText.getText() + "' already exists", null);
			}
		}
		organizationAlreadyExistsStatus = status;
	}
	
	public boolean isPageComplete(){
		if (getErrorMessage() != null){
			return false;
		}
		
		if (organizationNameText.getText().trim().length() == 0 || projectsList.getSelectionCount() == 0){
			return false;
		} else {
			return true;
		}
	}
	
	private void showStatus(IStatus status){
		String message = status.getMessage();
		if (message.length() == 0) message= null;
		switch (status.getSeverity()) {
			case IStatus.OK:
				setErrorMessage(null);
				setMessage(message);
				break;
			case IStatus.WARNING:
				setErrorMessage(null);
				setMessage(message, WizardPage.WARNING);
				break;
			case IStatus.INFO:
				setErrorMessage(null);
				setMessage(message, WizardPage.INFORMATION);
				break;
			default:
				setErrorMessage(message);
				setMessage(null);
				break;
		}
	}
	
	public String getOrganizationName(){
		return organizationNameText.getText();
	}
	
	public String getOrganizationFileExtension() {
		return Utils.getFileExtensionWithDot(organizationNameText.getText());
	}
}
