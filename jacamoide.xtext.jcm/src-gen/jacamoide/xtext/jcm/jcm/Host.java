/**
 */
package jacamoide.xtext.jcm.jcm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Host</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Host#getName <em>Name</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Host#getString <em>String</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Host#getIp <em>Ip</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Host#getVal <em>Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see jacamoide.xtext.jcm.jcm.JcmPackage#getHost()
 * @model
 * @generated
 */
public interface Host extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getHost_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jacamoide.xtext.jcm.jcm.Host#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getHost_String()
   * @model
   * @generated
   */
  String getString();

  /**
   * Sets the value of the '{@link jacamoide.xtext.jcm.jcm.Host#getString <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String</em>' attribute.
   * @see #getString()
   * @generated
   */
  void setString(String value);

  /**
   * Returns the value of the '<em><b>Ip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ip</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ip</em>' attribute.
   * @see #setIp(String)
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getHost_Ip()
   * @model
   * @generated
   */
  String getIp();

  /**
   * Sets the value of the '{@link jacamoide.xtext.jcm.jcm.Host#getIp <em>Ip</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ip</em>' attribute.
   * @see #getIp()
   * @generated
   */
  void setIp(String value);

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
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getHost_Val()
   * @model
   * @generated
   */
  int getVal();

  /**
   * Sets the value of the '{@link jacamoide.xtext.jcm.jcm.Host#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(int value);

} // Host
