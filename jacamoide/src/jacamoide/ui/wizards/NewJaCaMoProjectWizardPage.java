package jacamoide.ui.wizards;

import org.eclipse.core.resources.IProject;

import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Widget;

public class NewJaCaMoProjectWizardPage extends WizardPage implements Listener {
	private Composite composite;
	private Label projectNameLabel;
	private Text projectNameText;
	
	private Label projectAgentLabel;
	private Combo projectAgentCombo;
	
	private Label projectEnvironmentLabel;
	private Combo projectEnvironmentCombo;
	
	private IStatus projectNameStatus, projectAlreadyExistsStatus;
	
	public NewJaCaMoProjectWizardPage() {
		super("wizardPage");
		setTitle("New JaCaMo Project");
		setDescription("This wizard creates a new JaCaMo Project");
		projectNameStatus = new Status(IStatus.OK, "not_used", 0, "", null);
		projectAlreadyExistsStatus = new Status(IStatus.OK, "not_used", 0, "", null);
	}
 
	@Override
	public void createControl(Composite parent) {
		composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		int nCols = 2;
		layout.numColumns = nCols;
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_FILL));
		GridData gridData = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
		gridData.widthHint = 250;
		
		//Project name
		projectNameLabel = new Label(composite, SWT.NONE);
		projectNameLabel.setText("Project name:");
		
		projectNameText = new Text(composite, SWT.BORDER | SWT.SINGLE);
		projectNameText.setLayoutData(gridData);
		projectNameText.addListener(SWT.Modify, this);
		projectNameText.setFocus();
		
		//Project infrastructure
		projectAgentLabel = new Label(composite, SWT.NONE);
		projectAgentLabel.setText("Agent:");
		
		projectAgentCombo = new Combo(composite, SWT.BORDER | SWT.SINGLE | SWT.READ_ONLY);
		projectAgentCombo.add("Centralised");
		projectAgentCombo.add("Distributed");
		projectAgentCombo.setText("Centralised");
		projectAgentCombo.addListener(SWT.Modify, this);
		
		//Project environment
		projectEnvironmentLabel = new Label(composite, SWT.NONE);
		projectEnvironmentLabel.setText("Environment");
		
		projectEnvironmentCombo = new Combo(composite, SWT.BORDER | SWT.SINGLE | SWT.READ_ONLY);
		projectEnvironmentCombo.add("Centralised");
		projectEnvironmentCombo.add("Distributed");
		projectEnvironmentCombo.setText("Centralised");
		projectEnvironmentCombo.addListener(SWT.Modify, this);
		
		setControl(composite);
	}
	
	@Override
	public void handleEvent(Event event) {
		Widget source = event.widget;
		
		if (source == projectNameText){
			checkProjectName();
			checkProjectAlreadyExists();
		} 
		showStatus(findMostSevere());
		setPageComplete(isPageComplete());
		getWizard().getContainer().updateButtons();
	}

	private IStatus findMostSevere() {
		if (projectNameStatus.matches(IStatus.ERROR)){
			return projectNameStatus;
		} else {
			return projectAlreadyExistsStatus;
		}
	}

	private void checkProjectName() {
		Status status = new Status(IStatus.OK, "not_used", 0, "", null);
		String projectName = projectNameText.getText();
		
		if (projectName.length() == 0){
			status = new Status(IStatus.ERROR, "not_used", 0, "Project name can't be empty", null);
		} else {
			char cFirst = projectName.charAt(0);
			
			if (!Character.isLowerCase(cFirst)){
				status = new Status(IStatus.ERROR, "not_used", 0, "Project name must start with a lowercase letter", null);
			} else {
				for (int i = 1; i < projectName.length(); i++){
					char c = projectName.charAt(i);
					
					if (!Character.isLetterOrDigit(c) && c != '_'){
						status = new Status(IStatus.ERROR, "not_used", 0, "Project name must contain only letters, digits or '_'", null);
					}
				}
			}
		}
		projectNameStatus = status;
	}
	
	private void checkProjectAlreadyExists() {
		Status status = new Status(IStatus.OK, "not_used", 0, "", null);
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		String projectName = projectNameText.getText();
		IProject project = root.getProject(projectName);
		
		if (project.exists()){
			status = new Status(IStatus.ERROR, "not_used", 0, "Project '" + projectName + "' already exists", null);
		}
		projectAlreadyExistsStatus = status;
	}
	
	public boolean isPageComplete(){
		if (getErrorMessage() != null){
			return false;
		}
		
		if (projectNameText.getText().length() == 0){
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
	
	public IProject getProjectHandle() {
        return ResourcesPlugin.getWorkspace().getRoot().getProject(
                getProjectName());
    }
	
	public String getProjectName(){
		return projectNameText.getText();
	}
	
	public String getInfrastructure() {
		return projectAgentCombo.getText();
	}
	
	public String getEnvironment() {
		return projectEnvironmentCombo.getText();
	}
}
