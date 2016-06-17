/**
 */
package jacamoide.xtext.jcm.jcm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DPlatform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.DPlatform#getPlatform <em>Platform</em>}</li>
 * </ul>
 * </p>
 *
 * @see jacamoide.xtext.jcm.jcm.JcmPackage#getDPlatform()
 * @model
 * @generated
 */
public interface DPlatform extends EObject
{
  /**
   * Returns the value of the '<em><b>Platform</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.ClassDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Platform</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Platform</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getDPlatform_Platform()
   * @model containment="true"
   * @generated
   */
  EList<ClassDef> getPlatform();

} // DPlatform
