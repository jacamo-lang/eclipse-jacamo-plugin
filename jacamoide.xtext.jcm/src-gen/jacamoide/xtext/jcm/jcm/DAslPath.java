/**
 * generated by Xtext 2.23.0
 */
package jacamoide.xtext.jcm.jcm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAsl Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.DAslPath#getAslPath <em>Asl Path</em>}</li>
 * </ul>
 *
 * @see jacamoide.xtext.jcm.jcm.JcmPackage#getDAslPath()
 * @model
 * @generated
 */
public interface DAslPath extends EObject
{
  /**
   * Returns the value of the '<em><b>Asl Path</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.FileName}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asl Path</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getDAslPath_AslPath()
   * @model containment="true"
   * @generated
   */
  EList<FileName> getAslPath();

} // DAslPath
