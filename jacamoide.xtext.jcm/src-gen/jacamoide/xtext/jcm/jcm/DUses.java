/**
 */
package jacamoide.xtext.jcm.jcm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DUses</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.DUses#getFileName <em>File Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see jacamoide.xtext.jcm.jcm.JcmPackage#getDUses()
 * @model
 * @generated
 */
public interface DUses extends EObject
{
  /**
   * Returns the value of the '<em><b>File Name</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.FileName}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File Name</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File Name</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getDUses_FileName()
   * @model containment="true"
   * @generated
   */
  EList<FileName> getFileName();

} // DUses
