/**
 */
package jacamoide.xtext.jcm.jcm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OFile Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.OFileName#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see jacamoide.xtext.jcm.jcm.JcmPackage#getOFileName()
 * @model
 * @generated
 */
public interface OFileName extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(FileName)
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getOFileName_Name()
   * @model containment="true"
   * @generated
   */
  FileName getName();

  /**
   * Sets the value of the '{@link jacamoide.xtext.jcm.jcm.OFileName#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(FileName value);

} // OFileName
