package jacamoide.commands;

import jacamoide.ui.wizards.NewAgentWizard;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

public class AddNewAgent implements IObjectActionDelegate {
	private IStructuredSelection selection;
	
	public AddNewAgent() {
		super();
	}
	

	@Override
	public void run(IAction action) {		
		NewAgentWizard wizard = new NewAgentWizard();
		wizard.init(PlatformUI.getWorkbench(), selection);
	      
		WizardDialog dialog = new WizardDialog
	 	         (PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),wizard);
	      
		dialog.create();
		dialog.open();
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
        if (selection != null && selection instanceof ISelection) {
            IStructuredSelection strucSel = (IStructuredSelection) selection;
            this.selection = strucSel;
        }
	}


	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		
	}
}