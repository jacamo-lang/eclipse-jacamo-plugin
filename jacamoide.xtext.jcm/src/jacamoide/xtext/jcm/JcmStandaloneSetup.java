
package jacamoide.xtext.jcm;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class JcmStandaloneSetup extends JcmStandaloneSetupGenerated{

	public static void doSetup() {
		new JcmStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

