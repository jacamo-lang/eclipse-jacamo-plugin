package jacamoide.ui.wizards;

import jacamoide.core.PluginConstants;
import jacamoide.core.Utils;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;

public class NewAgentAdvancedWizardPage extends JaCaMoWizardPageNoProject implements Listener {
	private Label agentClassLabel;
	private Text agentClassText;
	
	private Label agentArchitectureClassLabel;
	private Text agentArchitectureClassText;
	
	private Label beliefBaseClassLabel;
	private Text beliefBaseClassText;
	
	private Label agentNumberLabel;
	private Text agentNumberText;

	private Label agentVerboseLabel;
	private Combo agentVerboseCombo;
	
	private Label mindinspectorLabel;
	private Combo mindinspectorCombo;
	
	private Label agentNodeLabel;
	private Text agentNodeText;
	
	private Label agentBeliefsLabel;
	private Text agentBeliefsText;
	
	private Label agentGoalsLabel;
	private Text agentGoalsText;
	
	private IStatus agentNameStatus, agentSourceStatus;
	
	private IProject project;
	
	public NewAgentAdvancedWizardPage(IWorkbench workbench, IStructuredSelection selection, IProject project) {
		super("Add Jason Agent", "This wizard adds a new Jason agent into the current project.\nIf the type for the agent is still not created, it will be created automatically.",	"Add a Jason agent in project:", workbench, selection);
		agentNameStatus = new Status(IStatus.OK, "not_used", 0, "", null);
		agentSourceStatus = new Status(IStatus.OK, "not_used", 0, "", null);
		this.project = project;
	}
	
	private boolean checkDistributedAgent() {
		IResource mainFile = null;
		try {
			for (IResource resMain : project.members()) {
				if (resMain.getFileExtension() != null && resMain.getFileExtension().equals(PluginConstants.MASJACAMO_EXT)) {
					mainFile = resMain;
					break;
				}
			}
		} catch (CoreException e) {
			e.printStackTrace();
		}
		
		if (mainFile != null) {
			try {
				String sourceMainFile = Utils.loadFile(mainFile.getLocation().toString());
				
				if (sourceMainFile.indexOf("Jade") > -1) {
					return true;
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
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
		
		//Agent class
		agentClassLabel = new Label(composite, SWT.NONE);
		agentClassLabel.setText("Agent class:");
		 
		agentClassText = new Text(composite, SWT.BORDER | SWT.SINGLE);
		agentClassText.setLayoutData(gridData);
		
		//Agent architecture class
		agentArchitectureClassLabel = new Label(composite, SWT.NONE);
		agentArchitectureClassLabel.setText("Architecture class:");
		 
		agentArchitectureClassText = new Text(composite, SWT.BORDER | SWT.SINGLE);
		agentArchitectureClassText.setLayoutData(gridData);
		if (checkDistributedAgent()) {
			agentArchitectureClassText.setText("c4jason.CAgentArch");
		}
		
		//Agent architecture class
		beliefBaseClassLabel = new Label(composite, SWT.NONE);
		beliefBaseClassLabel.setText("Belief base class:");
		 
		beliefBaseClassText = new Text(composite, SWT.BORDER | SWT.SINGLE);
		beliefBaseClassText.setLayoutData(gridData);
		
		//Number of agents
		agentNumberLabel = new Label(composite, SWT.NONE);
		agentNumberLabel.setText("Number of agents:");
		 
		agentNumberText = new Text(composite, SWT.BORDER | SWT.SINGLE);
		agentNumberText.setLayoutData(gridData);
		agentNumberText.setText("1");

		//Verbose
		agentVerboseLabel = new Label(composite, SWT.NONE);
		agentVerboseLabel.setText("Verbose:");		
		
		agentVerboseCombo = new Combo(composite, SWT.BORDER | SWT.SINGLE | SWT.READ_ONLY);
		agentVerboseCombo.add("no output");
		agentVerboseCombo.add("normal");
		agentVerboseCombo.add("debug");
		agentVerboseCombo.setText("normal");
		
		//Mind inspector
		mindinspectorLabel = new Label(composite, SWT.NONE);
		mindinspectorLabel.setText("Mind inspector:");		
		
		mindinspectorCombo = new Combo(composite, SWT.BORDER | SWT.SINGLE | SWT.READ_ONLY);
		mindinspectorCombo.add("enabled");
		mindinspectorCombo.add("disabled");
		mindinspectorCombo.setText("disabled");
		
		//Node
		agentNodeLabel = new Label(composite, SWT.NONE);
		agentNodeLabel.setText("Node:");
		 
		agentNodeText = new Text(composite, SWT.BORDER | SWT.SINGLE);
		agentNodeText.setLayoutData(gridData);
		
		//Initial Beliefs
		agentBeliefsLabel = new Label(composite, SWT.NONE);
		agentBeliefsLabel.setText("Initial beliefs:");
		 
		agentBeliefsText = new Text(composite, SWT.BORDER | SWT.SINGLE);
		agentBeliefsText.setLayoutData(gridData);
		
		//Initial Goals
		agentGoalsLabel = new Label(composite, SWT.NONE);
		agentGoalsLabel.setText("Initial goals:");
		 
		agentGoalsText = new Text(composite, SWT.BORDER | SWT.SINGLE);
		agentGoalsText.setLayoutData(gridData);
	}

	@Override
	public void handleEvent(Event event) {
		//Widget source = event.widget;
		
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
	
	public boolean isPageComplete(){
		if (getErrorMessage() != null){
			return false;
		}
		
		return true;
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
	
	public String getAgentClass() {
		return agentClassText.getText();
	}
	
	public String getArchitectureClass() {
		return agentArchitectureClassText.getText();
	}
	
	public String getBeliefBaseClass() {
		return beliefBaseClassText.getText();
	}
	
	public String getAgentNumber() {
		return agentNumberText.getText();
	}
	
	public String getAgentVerbose() {
		return agentVerboseCombo.getText();
	}
	
	public String getMindinspector() {
		return mindinspectorCombo.getText();
	}
	
	public String getAgentNode() {
		return agentNodeText.getText();
	}
	
	public String getBeliefs() {
		return agentBeliefsText.getText();
	}
	
	public String getGoals() {
		return agentGoalsText.getText();
	}
}
