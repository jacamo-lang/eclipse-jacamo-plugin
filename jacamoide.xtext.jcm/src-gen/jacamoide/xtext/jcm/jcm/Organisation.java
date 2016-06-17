/**
 */
package jacamoide.xtext.jcm.jcm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Organisation#getName <em>Name</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Organisation#getFileName <em>File Name</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Organisation#getGroup <em>Group</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Organisation#getScheme <em>Scheme</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Organisation#getAgents <em>Agents</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Organisation#getNode <em>Node</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Organisation#getOther <em>Other</em>}</li>
 * </ul>
 * </p>
 *
 * @see jacamoide.xtext.jcm.jcm.JcmPackage#getOrganisation()
 * @model
 * @generated
 */
public interface Organisation extends EObject
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
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getOrganisation_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jacamoide.xtext.jcm.jcm.Organisation#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>File Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File Name</em>' containment reference.
   * @see #setFileName(OFileName)
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getOrganisation_FileName()
   * @model containment="true"
   * @generated
   */
  OFileName getFileName();

  /**
   * Sets the value of the '{@link jacamoide.xtext.jcm.jcm.Organisation#getFileName <em>File Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File Name</em>' containment reference.
   * @see #getFileName()
   * @generated
   */
  void setFileName(OFileName value);

  /**
   * Returns the value of the '<em><b>Group</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.Group}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getOrganisation_Group()
   * @model containment="true"
   * @generated
   */
  EList<Group> getGroup();

  /**
   * Returns the value of the '<em><b>Scheme</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.Scheme}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scheme</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scheme</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getOrganisation_Scheme()
   * @model containment="true"
   * @generated
   */
  EList<Scheme> getScheme();

  /**
   * Returns the value of the '<em><b>Agents</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.OAgents}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agents</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agents</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getOrganisation_Agents()
   * @model containment="true"
   * @generated
   */
  EList<OAgents> getAgents();

  /**
   * Returns the value of the '<em><b>Node</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.ONode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getOrganisation_Node()
   * @model containment="true"
   * @generated
   */
  EList<ONode> getNode();

  /**
   * Returns the value of the '<em><b>Other</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.OOthers}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Other</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Other</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getOrganisation_Other()
   * @model containment="true"
   * @generated
   */
  EList<OOthers> getOther();

} // Organisation
