package jacamoide.ui.wizards;

import jacamoide.core.Utils;

import org.eclipse.ui.wizards.datatransfer.ExternalProjectImportWizard;

public class ImportJaCaMoApplicationWizard extends ExternalProjectImportWizard {

	public ImportJaCaMoApplicationWizard() {
		super();
	}
	
    public boolean performFinish() {
    	boolean result = super.performFinish();
    	
    	if (!result)
    		return false;
    	
    	Utils.createUserLibrary();
    	
    	return true;
    }
}
