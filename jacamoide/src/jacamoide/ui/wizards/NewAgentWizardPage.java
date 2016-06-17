package jacamoide.ui.wizards;

import jacamoide.core.PluginConstants;
import jacamoide.core.Utils;

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

public class NewAgentWizardPage extends JaCaMoWizardPageNoProject implements Listener {
	private Label agentNameLabel;
	private Text agentNameText;
	
	private Label agentSourceLabel;
	private Text agentSourceText;
	
	private IStatus agentNameStatus, agentSourceStatus;
	
	public NewAgentWizardPage(IWorkbench workbench, IStructuredSelection selection) {
		super("Add Jason Agent", "This wizard adds a new Jason agent into the current project.\nIf the type for the agent is still not created, it will be created automatically.",	"Add a Jason agent in project:", workbench, selection);
		agentNameStatus = new Status(IStatus.OK, "not_used", 0, "", null);
		agentSourceStatus = new Status(IStatus.OK, "not_used", 0, "", null);
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
		
		/*super.createControl(parent);
		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
		gridData.widthHint = 250;*/
		
		//Agent name
		agentNameLabel = new Label(composite, SWT.NONE);
		agentNameLabel.setText("Agent name:");
		 
		agentNameText = new Text(composite, SWT.BORDER | SWT.SINGLE);
		agentNameText.setLayoutData(gridData);
		agentNameText.addListener(SWT.Modify, this);
		agentNameText.setFocus();
		
		//Agent source
		agentSourceLabel = new Label(composite, SWT.NONE);
		agentSourceLabel.setText("Agent type:");
		 
		agentSourceText = new Text(composite, SWT.BORDER | SWT.SINGLE);
		agentSourceText.setLayoutData(gridData);
		agentSourceText.addListener(SWT.Modify, this);
		
	}

	@Override
	public void handleEvent(Event event) {
		Widget source = event.widget;
		
		if (source == agentNameText){
			checkAgentName();
		}
		
		if (source == agentSourceText){
			checkAgentSource();
		}
		showStatus(findMostSevere());
		setPageComplete(isPageComplete());
		getWizard().getContainer().updateButtons();
	}
	
	private IStatus findMostSevere() {
		if (agentNameStatus.matches(IStatus.ERROR)){
			return agentNameStatus;
		}
		
		if (agentSourceStatus.matches(IStatus.ERROR)){
			return agentSourceStatus;
		}
		
		return new Status(IStatus.OK, "not_used", 0, "", null);
	}
	
	private void checkAgentName() {
		Status status = new Status(IStatus.OK, "not_used", 0, "", null);
		String agentNameWithoutExtension = Utils.removeFileExtension(agentNameText.getText());
		String fileExtension =  getAgentFileExtension();
		boolean error = false;
		
		if (agentNameWithoutExtension.length() == 0){
			error = true;
			status = new Status(IStatus.ERROR, "not_used", 0, "Agent name can't be empty", null);
		} else {
			char cFirst = agentNameWithoutExtension.charAt(0);
			
			if (!Character.isLowerCase(cFirst)){
				error = true;
				status = new Status(IStatus.ERROR, "not_used", 0, "Agent name must start with a lowercase letter", null);
			} else {
				for (int i = 1; i < agentNameWithoutExtension.length(); i++){
					char c = agentNameWithoutExtension.charAt(i);
					
					if (!error && !Character.isLetterOrDigit(c) && c != '_'){
						error = true;
						status = new Status(IStatus.ERROR, "not_used", 0, "Agent name must contain only letters, digits or '_'", null);
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
	
	private void checkAgentSource() {
		Status status = new Status(IStatus.OK, "not_used", 0, "", null);
		
		if (agentSourceText.getText().trim().length() == 0) return;
		
		String agentNameWithoutExtension = Utils.removeFileExtension(agentSourceText.getText());
		String fileExtension =  getAgentSourceFileExtension();
		boolean error = false;
		
		if (agentNameWithoutExtension.length() == 0){
			error = true;
			status = new Status(IStatus.ERROR, "not_used", 0, "Agent type can't be empty", null);
		} else {
			char cFirst = agentNameWithoutExtension.charAt(0);
			
			if (!Character.isLowerCase(cFirst)){
				error = true;
				status = new Status(IStatus.ERROR, "not_used", 0, "Agent type  must start with a lowercase letter", null);
			} else {
				for (int i = 1; i < agentNameWithoutExtension.length(); i++){
					char c = agentNameWithoutExtension.charAt(i);
					
					if (!error && !Character.isLetterOrDigit(c) && c != '_'){
						error = true;
						status = new Status(IStatus.ERROR, "not_used", 0, "Agent type must contain only letters, digits or '_'", null);
					}
				}
			}
		}
		
		if (!error) {
			if (!fileExtension.equals("") && !fileExtension.equals("." + PluginConstants.AGENT_EXT)){
				status = new Status(IStatus.ERROR, "not_used", 0, "Invalid file extension. Use '." + PluginConstants.AGENT_EXT + "', or just omit it", null);
			}
		}
		agentSourceStatus = status;
	}
	
	public boolean isPageComplete(){
		if (getErrorMessage() != null){
			return false;
		}
		
		if (agentNameText.getText().trim().length() == 0){
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
	
	public String getAgentName(){
		return agentNameText.getText();
	}
	
	public String getAgentSource() {
		return agentSourceText.getText();
	}
	
	public String getAgentFileExtension() {
		return Utils.getFileExtensionWithDot(agentNameText.getText());
	}
	
	public String getAgentSourceFileExtension() {
		return Utils.getFileExtensionWithDot(agentSourceText.getText());
	}
	
	public String getAgentFileWithoutExtension() {
		return Utils.removeFileExtension(agentSourceText.getText());
	}
}
