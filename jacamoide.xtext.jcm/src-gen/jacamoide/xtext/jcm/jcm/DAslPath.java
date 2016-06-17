/**
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
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.DAslPath#getAslPath <em>Asl Path</em>}</li>
 * </ul>
 * </p>
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
   * <p>
   * If the meaning of the '<em>Asl Path</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Asl Path</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getDAslPath_AslPath()
   * @model containment="true"
   * @generated
   */
  EList<FileName> getAslPath();

} // DAslPath
