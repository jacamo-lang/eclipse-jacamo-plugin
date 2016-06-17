/**
 */
package jacamoide.xtext.jcm.jcm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Var#getVar <em>Var</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Var#getUnnamedvar <em>Unnamedvar</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Var#getList <em>List</em>}</li>
 * </ul>
 * </p>
 *
 * @see jacamoide.xtext.jcm.jcm.JcmPackage#getVar()
 * @model
 * @generated
 */
public interface Var extends EObject
{
  /**
   * Returns the value of the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' attribute.
   * @see #setVar(String)
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getVar_Var()
   * @model
   * @generated
   */
  String getVar();

  /**
   * Sets the value of the '{@link jacamoide.xtext.jcm.jcm.Var#getVar <em>Var</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' attribute.
   * @see #getVar()
   * @generated
   */
  void setVar(String value);

  /**
   * Returns the value of the '<em><b>Unnamedvar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unnamedvar</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unnamedvar</em>' attribute.
   * @see #setUnnamedvar(String)
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getVar_Unnamedvar()
   * @model
   * @generated
   */
  String getUnnamedvar();

  /**
   * Sets the value of the '{@link jacamoide.xtext.jcm.jcm.Var#getUnnamedvar <em>Unnamedvar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unnamedvar</em>' attribute.
   * @see #getUnnamedvar()
   * @generated
   */
  void setUnnamedvar(String value);

  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference.
   * @see #setList(List)
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getVar_List()
   * @model containment="true"
   * @generated
   */
  List getList();

  /**
   * Sets the value of the '{@link jacamoide.xtext.jcm.jcm.Var#getList <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' containment reference.
   * @see #getList()
   * @generated
   */
  void setList(List value);

} // Var
