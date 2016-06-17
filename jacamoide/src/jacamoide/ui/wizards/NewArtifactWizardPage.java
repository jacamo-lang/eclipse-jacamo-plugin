package jacamoide.ui.wizards;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.ui.wizards.NewTypeWizardPage;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class NewArtifactWizardPage extends NewTypeWizardPage {
	//private ISelection selection;
	
	public NewArtifactWizardPage(boolean isClass, String pageName, ISelection selection) {
		super(isClass, pageName);
		//this.selection = selection;
		setTitle("New CArtAgO Artifact");
		setDescription("This wizard creates a new CArtAgO Artifact");
	}

	@Override
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);

		Composite composite= new Composite(parent, SWT.NONE);
		composite.setFont(parent.getFont());
 
		int nColumns= 4;

		GridLayout layout= new GridLayout();
		layout.numColumns= nColumns;
		composite.setLayout(layout);

		// pick & choose the wanted UI components

		createContainerControls(composite, nColumns);
		createPackageControls(composite, nColumns);
		createEnclosingTypeControls(composite, nColumns);

		createSeparator(composite, nColumns);

		createTypeNameControls(composite, nColumns);
		createModifierControls(composite, nColumns);

		createSuperClassControls(composite, nColumns);
		createSuperInterfacesControls(composite, nColumns);

		//createMethodStubSelectionControls(composite, nColumns);

		createCommentControls(composite, nColumns);
		enableCommentControl(true);

		setControl(composite);
		
		
		//TODO set default source folder
		//http://dev.eclipse.org/svnroot/tools/org.eclipse.objectteams/tags/CQ/CQ_3784/plugins/org.eclipse.objectteams.otdt.pde.ui/src/org/eclipse/objectteams/otdt/internal/pde/ui/ExtensionEditorAdaptor.java
		//method "initFields"
		//Fill up the default source folder
		/*
		if (selection instanceof ITreeSelection) {
			ITreeSelection ts = (ITreeSelection)selection;
			Object firstElement = ts.getFirstElement();
			IProject project = null;
			
			if (firstElement instanceof IProject){
				project = (IProject)firstElement;
			} else if (firstElement instanceof IResource){
				IResource res = (IResource)firstElement;
				project = res.getProject();
			} else if (firstElement instanceof IJavaElement){
				IJavaElement javaElement = (IJavaElement)firstElement;
				IResource res = javaElement.getResource();
        		project = res.getProject();
			}
			
			IResource resSourceFolder = null;
			try {
				
				project.get
				
				for (IResource resMain : project.members()) {
					System.out.println(resMain.getName() + " ## " + resMain.getLocation());
					
			
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
			setPackageFragmentRoot(root, canBeModified);
		}*/
		
		
		
		
		

		Dialog.applyDialogFont(composite);
		//PlatformUI.getWorkbench().getHelpSystem().setHelp(composite, IJavaHelpContextIds.NEW_CLASS_WIZARD_PAGE);
		
		setSuperClass("Artifact", true);
		setFocus();
	}

	public void init(IStructuredSelection selection) {
		IJavaElement jelem = getInitialJavaElement(selection);
		initContainerPage(jelem);
		initTypePage(jelem);
		doStatusUpdate();
	}
	
	// ------ validation --------
	private void doStatusUpdate() {
		// status of all used components
		IStatus[] status= new IStatus[] {
			fContainerStatus,
			isEnclosingTypeSelected() ? fEnclosingTypeStatus : fPackageStatus,
			fTypeNameStatus,
			fModifierStatus,
			fSuperClassStatus,
			fSuperInterfacesStatus
		};

		// the mode severe status will be displayed and the OK button enabled/disabled.
		updateStatus(status);
	}
	
	/*
	 * @see NewContainerWizardPage#handleFieldChanged
	 */
	protected void handleFieldChanged(String fieldName) {
		super.handleFieldChanged(fieldName);
		doStatusUpdate();
	}
}
