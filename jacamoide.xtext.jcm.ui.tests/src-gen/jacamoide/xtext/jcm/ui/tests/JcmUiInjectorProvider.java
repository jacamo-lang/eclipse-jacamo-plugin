/*
 * generated by Xtext 2.23.0
 */
package jacamoide.xtext.jcm.ui.tests;

import com.google.inject.Injector;
import jacamoide.xtext.jcm.ui.internal.JcmActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class JcmUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return JcmActivator.getInstance().getInjector("jacamoide.xtext.jcm.Jcm");
	}

}
