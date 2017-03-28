/**
 */
package jacamoide.xtext.jcm.jcm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Scheme#getName <em>Name</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Scheme#getKind <em>Kind</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Scheme#getDebug <em>Debug</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Scheme#getOwner <em>Owner</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Scheme#getOther <em>Other</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Scheme#getString <em>String</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Scheme#getVal <em>Val</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Scheme#getLiteral <em>Literal</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Scheme#getVal_real <em>Val real</em>}</li>
 * </ul>
 * </p>
 *
 * @see jacamoide.xtext.jcm.jcm.JcmPackage#getScheme()
 * @model
 * @generated
 */
public interface Scheme extends EObject
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
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getScheme_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jacamoide.xtext.jcm.jcm.Scheme#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Kind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' attribute.
   * @see #setKind(String)
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getScheme_Kind()
   * @model
   * @generated
   */
  String getKind();

  /**
   * Sets the value of the '{@link jacamoide.xtext.jcm.jcm.Scheme#getKind <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' attribute.
   * @see #getKind()
   * @generated
   */
  void setKind(String value);

  /**
   * Returns the value of the '<em><b>Debug</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.Literal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Debug</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Debug</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getScheme_Debug()
   * @model containment="true"
   * @generated
   */
  EList<Literal> getDebug();

  /**
   * Returns the value of the '<em><b>Owner</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Owner</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Owner</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getScheme_Owner()
   * @model unique="false"
   * @generated
   */
  EList<String> getOwner();

  /**
   * Returns the value of the '<em><b>Other</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Other</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Other</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getScheme_Other()
   * @model unique="false"
   * @generated
   */
  EList<String> getOther();

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getScheme_String()
   * @model unique="false"
   * @generated
   */
  EList<String> getString();

  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getScheme_Val()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getVal();

  /**
   * Returns the value of the '<em><b>Literal</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.Literal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getScheme_Literal()
   * @model containment="true"
   * @generated
   */
  EList<Literal> getLiteral();

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
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getScheme_Val_real()
   * @model unique="false"
   * @generated
   */
  EList<Double> getVal_real();

} // Scheme
