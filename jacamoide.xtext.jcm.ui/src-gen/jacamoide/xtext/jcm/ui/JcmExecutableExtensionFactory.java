/*
 * generated by Xtext 2.23.0
 */
package jacamoide.xtext.jcm.ui;

import com.google.inject.Injector;
import jacamoide.xtext.jcm.ui.internal.JcmActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class JcmExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(JcmActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		JcmActivator activator = JcmActivator.getInstance();
		return activator != null ? activator.getInjector(JcmActivator.JACAMOIDE_XTEXT_JCM_JCM) : null;
	}

}
