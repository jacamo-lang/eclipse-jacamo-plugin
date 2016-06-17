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

public class NewProtocolWizardPage extends JaCaMoWizardPage implements Listener {
	private Label protocolNameLabel;
	private Text protocolNameText;
	
	private IStatus protocolNameStatus, protocolAlreadyExistsStatus;
	
	public NewProtocolWizardPage(IWorkbench workbench, IStructuredSelection selection) {
		super("New Interaction Protocol", "This wizard creates a new interaction protocol",	"Create an interaction protocol in project:", workbench, selection);
		protocolNameStatus = new Status(IStatus.OK, "not_used", 0, "", null);
		protocolAlreadyExistsStatus = new Status(IStatus.OK, "not_used", 0, "", null);
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
		
		//Protocol filename
		protocolNameLabel = new Label(composite, SWT.NONE);
		protocolNameLabel.setText("Protocol filename:");
		 
		protocolNameText = new Text(composite, SWT.BORDER | SWT.SINGLE);
		protocolNameText.setLayoutData(gridData);
		protocolNameText.addListener(SWT.Modify, this);
		protocolNameText.setFocus();
	}

	@Override
	public void handleEvent(Event event) {
		Widget source = event.widget;
		
		if (source == protocolNameText){
			checkProtocolName();
			checkProtocolAlreadyExists();
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
		
		if (protocolNameStatus.matches(IStatus.ERROR)){
			return protocolNameStatus;
		}
		
		if (protocolAlreadyExistsStatus.matches(IStatus.ERROR)){
			return protocolAlreadyExistsStatus;
		}
		return new Status(IStatus.OK, "not_used", 0, "", null);
	}
	
	private void checkProtocolName() {
		Status status = new Status(IStatus.OK, "not_used", 0, "", null);
		String protocolNameWithoutExtension = Utils.removeFileExtension(protocolNameText.getText());
		String fileExtension =  getProtocolFileExtension();
		boolean error = false;
		
		if (protocolNameWithoutExtension.length() == 0){
			error = true;
			status = new Status(IStatus.ERROR, "not_used", 0, "Protocol name can't be empty", null);
		} else {
			char cFirst = protocolNameWithoutExtension.charAt(0);
			
			if (!Character.isLowerCase(cFirst)){
				error = true;
				status = new Status(IStatus.ERROR, "not_used", 0, "Protocol name must start with a lowercase letter", null);
			} else {
				for (int i = 1; i < protocolNameWithoutExtension.length(); i++){
					char c = protocolNameWithoutExtension.charAt(i);
					
					if (!error && !Character.isLetterOrDigit(c) && c != '_'){
						error = true;
						status = new Status(IStatus.ERROR, "not_used", 0, "Protocol name must contain only letters, digits or '_'", null);
					}
				}
			}
		}
		
		if (!error) {
			if (!fileExtension.equals("") && !fileExtension.equals("." + PluginConstants.INTERACTION_EXT)){
				status = new Status(IStatus.ERROR, "not_used", 0, "Invalid file extension. Use '." + PluginConstants.INTERACTION_EXT + "', or just omit it", null);
			}
		}
		protocolNameStatus = status;
	}
	
	private void checkProtocolAlreadyExists() {
		Status status = new Status(IStatus.OK, "not_used", 0, "", null);
		IProject project = getSelectedProject();
		String fileExtension =  getProtocolFileExtension();
		
		if (fileExtension.length() == 0){
			IResource resource = project.findMember("src/int/" + protocolNameText.getText() + "." + PluginConstants.INTERACTION_EXT);
			
			if (resource != null){
				status = new Status(IStatus.ERROR, "not_used", 0, 
						"Protocol '" + protocolNameText.getText() + "." + PluginConstants.INTERACTION_EXT + "' already exists", null);
			}
		} else {
			IResource resource = project.findMember("src/int/" + protocolNameText.getText());
			
			if (resource != null){
				status = new Status(IStatus.ERROR, "not_used", 0, "Protocol '" + protocolNameText.getText() + "' already exists", null);
			}
		}
		protocolAlreadyExistsStatus = status;
	}
	
	public boolean isPageComplete(){
		if (getErrorMessage() != null){
			return false;
		}
		
		if (protocolNameText.getText().trim().length() == 0 || projectsList.getSelectionCount() == 0){
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
	
	public String getProtocolName(){
		return protocolNameText.getText();
	}
	
	public String getProtocolFileExtension() {
		return Utils.getFileExtensionWithDot(protocolNameText.getText());
	}
}
