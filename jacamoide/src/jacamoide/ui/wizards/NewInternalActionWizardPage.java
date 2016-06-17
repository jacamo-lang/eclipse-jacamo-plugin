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

public class NewInternalActionWizardPage extends JaCaMoWizardPage implements Listener {
	private Label internalActionLabel;
	private Text internalActionText;
	
	private IStatus agentNameStatus, agentAlreadyExistsStatus;
	
	public NewInternalActionWizardPage(IWorkbench workbench, IStructuredSelection selection) {
		super("New Jason Internal Action", "This wizard creates a new Jason Internal Action",	"Create Jason Internal Action in project:", workbench, selection);
		agentNameStatus = new Status(IStatus.OK, "not_used", 0, "", null);
		agentAlreadyExistsStatus = new Status(IStatus.OK, "not_used", 0, "", null);
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
		
		//IA filename
		internalActionLabel = new Label(composite, SWT.NONE);
		internalActionLabel.setText("Internal action filename:");
		 
		internalActionText = new Text(composite, SWT.BORDER | SWT.SINGLE);
		internalActionText.setLayoutData(gridData);
		internalActionText.addListener(SWT.Modify, this);
		internalActionText.setFocus();
	}

	@Override
	public void handleEvent(Event event) {
		Widget source = event.widget;
		
		if (source == internalActionText){
			checkInternalActionName();
			checkInternalActionAlreadyExists();
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
		
		if (agentNameStatus.matches(IStatus.ERROR)){
			return agentNameStatus;
		}
		
		if (agentAlreadyExistsStatus.matches(IStatus.ERROR)){
			return agentAlreadyExistsStatus;
		}
		return new Status(IStatus.OK, "not_used", 0, "", null);
	}
	
	private void checkInternalActionName() {
		Status status = new Status(IStatus.OK, "not_used", 0, "", null);
		String agentNameWithoutExtension = Utils.removeFileExtension(internalActionText.getText());
		String fileExtension =  getInternalActionFileExtension();
		boolean error = false;
		
		if (agentNameWithoutExtension.length() == 0){
			error = true;
			status = new Status(IStatus.ERROR, "not_used", 0, "Internal action name can't be empty", null);
		} else {
			char cFirst = agentNameWithoutExtension.charAt(0);
			
			if (!Character.isLowerCase(cFirst)){
				error = true;
				status = new Status(IStatus.ERROR, "not_used", 0, "Internal action name must start with a lowercase letter", null);
			} else {
				for (int i = 1; i < agentNameWithoutExtension.length(); i++){
					char c = agentNameWithoutExtension.charAt(i);
					
					if (!error && !Character.isLetterOrDigit(c) && c != '_'){
						error = true;
						status = new Status(IStatus.ERROR, "not_used", 0, "Internal action name must contain only letters, digits or '_'", null);
					}
				}
			}
		}
		
		if (!error) {
			if (!fileExtension.equals("") && !fileExtension.equals("." + PluginConstants.AGENT_EXT)){
				status = new Status(IStatus.ERROR, "not_used", 0, "Invalid file extension. Use '." + PluginConstants.AGENT_EXT + "', or just omit it", null);
			}
		}
		agentNameStatus = status;
	}
	
	private void checkInternalActionAlreadyExists() {
		Status status = new Status(IStatus.OK, "not_used", 0, "", null);
		IProject project = getSelectedProject();
		String fileExtension =  getInternalActionFileExtension();
		
		if (fileExtension.length() == 0){
			IResource resource = project.findMember("src/agt/jia/" + internalActionText.getText() + "." + PluginConstants.AGENT_EXT);
			
			if (resource != null){
				status = new Status(IStatus.ERROR, "not_used", 0, 
						"Internal action '" + internalActionText.getText() + "." + PluginConstants.AGENT_EXT + "' already exists", null);
			}
		} else {
			IResource resource = project.findMember("src/agt/jia/" + internalActionText.getText());
			
			if (resource != null){
				status = new Status(IStatus.ERROR, "not_used", 0, "Internal action '" + internalActionText.getText() + "' already exists", null);
			}
		}
		agentAlreadyExistsStatus = status;
	}
	
	public boolean isPageComplete(){
		if (getErrorMessage() != null){
			return false;
		}
		
		if (internalActionText.getText().trim().length() == 0 || projectsList.getSelectionCount() == 0){
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
	
	public String getInternalActionName(){
		return internalActionText.getText();
	}
	
	public String getInternalActionFileExtension() {
		return Utils.getFileExtensionWithDot(internalActionText.getText());
	}
}
