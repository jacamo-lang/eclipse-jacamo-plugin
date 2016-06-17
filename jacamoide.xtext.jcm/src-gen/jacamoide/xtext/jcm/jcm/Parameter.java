/**
 */
package jacamoide.xtext.jcm.jcm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Parameter#getClassDef <em>Class Def</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Parameter#getVal <em>Val</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Parameter#getVal_real <em>Val real</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Parameter#getString <em>String</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Parameter#getListParameters <em>List Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see jacamoide.xtext.jcm.jcm.JcmPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject
{
  /**
   * Returns the value of the '<em><b>Class Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class Def</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class Def</em>' containment reference.
   * @see #setClassDef(ClassDef)
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getParameter_ClassDef()
   * @model containment="true"
   * @generated
   */
  ClassDef getClassDef();

  /**
   * Sets the value of the '{@link jacamoide.xtext.jcm.jcm.Parameter#getClassDef <em>Class Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class Def</em>' containment reference.
   * @see #getClassDef()
   * @generated
   */
  void setClassDef(ClassDef value);

  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see #setVal(int)
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getParameter_Val()
   * @model
   * @generated
   */
  int getVal();

  /**
   * Sets the value of the '{@link jacamoide.xtext.jcm.jcm.Parameter#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(int value);

  /**
   * Returns the value of the '<em><b>Val real</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Double}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val real</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val real</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getParameter_Val_real()
   * @model unique="false"
   * @generated
   */
  EList<Double> getVal_real();

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
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getParameter_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link jacamoide.xtext.jcm.jcm.Parameter#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

  /**
   * Returns the value of the '<em><b>List Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Parameters</em>' containment reference.
   * @see #setListParameters(ListParameters)
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getParameter_ListParameters()
   * @model containment="true"
   * @generated
   */
  ListParameters getListParameters();

  /**
   * Sets the value of the '{@link jacamoide.xtext.jcm.jcm.Parameter#getListParameters <em>List Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Parameters</em>' containment reference.
   * @see #getListParameters()
   * @generated
   */
  void setListParameters(ListParameters value);

} // Parameter