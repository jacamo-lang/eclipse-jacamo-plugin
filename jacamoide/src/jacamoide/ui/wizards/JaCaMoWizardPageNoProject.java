package jacamoide.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;

public class JaCaMoWizardPageNoProject extends WizardPage implements Listener {
	protected String projectsListLabel;
	protected IWorkbench workbench;
	protected IStructuredSelection selection;
	protected Shell shell;
	protected Composite composite;
	
	public JaCaMoWizardPageNoProject(String title, String description, String projectsListLabel, 
			IWorkbench workbench, IStructuredSelection selection) {
		super(title);
		this.projectsListLabel = projectsListLabel;
		this.workbench = workbench;
		this.selection = selection;
		shell = workbench.getActiveWorkbenchWindow().getShell();
		setTitle(title);
		setDescription(description);
	} 

	@Override
	public void createControl(Composite parent) {
		composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		int nCols = 3;
		layout.numColumns = nCols;
		composite.setLayout(layout);
		composite.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.VERTICAL_ALIGN_FILL));
		
		setControl(composite);
	}
	
	@Override
	public void handleEvent(Event event){
	}
}
