/**
 * generated by Xtext 2.23.0
 */
package jacamoide.xtext.jcm.jcm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DClass Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.DClassPath#getClassPath <em>Class Path</em>}</li>
 * </ul>
 *
 * @see jacamoide.xtext.jcm.jcm.JcmPackage#getDClassPath()
 * @model
 * @generated
 */
public interface DClassPath extends EObject
{
  /**
   * Returns the value of the '<em><b>Class Path</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.FileName}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Path</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getDClassPath_ClassPath()
   * @model containment="true"
   * @generated
   */
  EList<FileName> getClassPath();

} // DClassPath
