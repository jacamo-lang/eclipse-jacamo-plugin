/*
 * generated by Xtext 2.23.0
 */
package jacamoide.xtext.jcm.ui.labeling;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

import com.google.inject.Inject;

import jacamoide.xtext.jcm.jcm.Agent;
import jacamoide.xtext.jcm.jcm.DAslPath;
import jacamoide.xtext.jcm.jcm.DClassPath;
import jacamoide.xtext.jcm.jcm.DPlatform;
import jacamoide.xtext.jcm.jcm.OAgents;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#label-provider
 */
public class JcmLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	public JcmLabelProvider(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	public String text(Object element) {
		if (element instanceof Agent){
			return ((Agent) element).getName();
		} else if (element instanceof OAgents) {
			return "agents";
		} else if (element instanceof DClassPath) {
			return "class-path";
		} else if (element instanceof DAslPath) {
			return "asl-path";
		} else if (element instanceof DPlatform) {
			return "platform";
		}
		return (String) super.text(element);
	}
/*
	//Labels and icons can be computed like this:
	
	String text(MyModel ele) {
	  return "my "+ele.getName();
	}
	 
    String image(MyModel ele) {
      return "MyModel.gif";
    }
*/
}
