/*
 * generated by Xtext 2.23.0
 */
package jacamoide.xtext.jcm.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractJcmValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(jacamoide.xtext.jcm.jcm.JcmPackage.eINSTANCE);
		return result;
	}
}
