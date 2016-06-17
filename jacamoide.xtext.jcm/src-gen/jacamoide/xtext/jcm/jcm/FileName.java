/**
 */
package jacamoide.xtext.jcm.jcm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.FileName#getName <em>Name</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.FileName#getString <em>String</em>}</li>
 * </ul>
 * </p>
 *
 * @see jacamoide.xtext.jcm.jcm.JcmPackage#getFileName()
 * @model
 * @generated
 */
public interface FileName extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getFileName_Name()
   * @model unique="false"
   * @generated
   */
  EList<String> getName();

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute.
   * @see #setString(String)
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getFileName_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link jacamoide.xtext.jcm.jcm.FileName#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

} // FileName