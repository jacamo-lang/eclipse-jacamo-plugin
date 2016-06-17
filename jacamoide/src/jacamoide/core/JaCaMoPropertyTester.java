package jacamoide.core;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;

public class JaCaMoPropertyTester extends PropertyTester {

	public JaCaMoPropertyTester() {
	}
 
	@Override
	public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
		if (!(receiver instanceof IAdaptable)){
			return false;
		}
		
		if (property.equals("checkFullPath")){
			IResource res = null;
			
			if (receiver instanceof IResource){
				res = (IResource)receiver;
			} else if (receiver instanceof IPackageFragmentRoot){
				res = ((IPackageFragmentRoot)receiver).getResource();
			} else if (receiver instanceof IPackageFragment){
				res = ((IPackageFragment)receiver).getResource();
			} else if (receiver instanceof ICompilationUnit){
				res = ((ICompilationUnit)receiver).getResource();
			}
			
			String path = res.getFullPath().toString();
			
			if (path.contains((CharSequence)expectedValue)){
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
}