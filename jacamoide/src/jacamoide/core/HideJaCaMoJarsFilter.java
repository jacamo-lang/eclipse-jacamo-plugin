package jacamoide.core;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;


public class HideJaCaMoJarsFilter extends ViewerFilter {

	public HideJaCaMoJarsFilter() {
	}
 
	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		return true;
	}

}