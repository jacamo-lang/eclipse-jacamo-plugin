/**
 */
package jacamoide.xtext.jcm.jcm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.JcmModel#getName <em>Name</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.JcmModel#getUses <em>Uses</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.JcmModel#getAgent <em>Agent</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.JcmModel#getWorkspace <em>Workspace</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.JcmModel#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.JcmModel#getDclassPath <em>Dclass Path</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.JcmModel#getDAslPath <em>DAsl Path</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.JcmModel#getDPlatform <em>DPlatform</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.JcmModel#getDNode <em>DNode</em>}</li>
 * </ul>
 * </p>
 *
 * @see jacamoide.xtext.jcm.jcm.JcmPackage#getJcmModel()
 * @model
 * @generated
 */
public interface JcmModel extends EObject
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
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getJcmModel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jacamoide.xtext.jcm.jcm.JcmModel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Uses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uses</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uses</em>' containment reference.
   * @see #setUses(DUses)
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getJcmModel_Uses()
   * @model containment="true"
   * @generated
   */
  DUses getUses();

  /**
   * Sets the value of the '{@link jacamoide.xtext.jcm.jcm.JcmModel#getUses <em>Uses</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uses</em>' containment reference.
   * @see #getUses()
   * @generated
   */
  void setUses(DUses value);

  /**
   * Returns the value of the '<em><b>Agent</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.Agent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agent</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getJcmModel_Agent()
   * @model containment="true"
   * @generated
   */
  EList<Agent> getAgent();

  /**
   * Returns the value of the '<em><b>Workspace</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.Workspace}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Workspace</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Workspace</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getJcmModel_Workspace()
   * @model containment="true"
   * @generated
   */
  EList<Workspace> getWorkspace();

  /**
   * Returns the value of the '<em><b>Organisation</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.Organisation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Organisation</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Organisation</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getJcmModel_Organisation()
   * @model containment="true"
   * @generated
   */
  EList<Organisation> getOrganisation();

  /**
   * Returns the value of the '<em><b>Dclass Path</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.DClassPath}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dclass Path</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dclass Path</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getJcmModel_DclassPath()
   * @model containment="true"
   * @generated
   */
  EList<DClassPath> getDclassPath();

  /**
   * Returns the value of the '<em><b>DAsl Path</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.DAslPath}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>DAsl Path</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>DAsl Path</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getJcmModel_DAslPath()
   * @model containment="true"
   * @generated
   */
  EList<DAslPath> getDAslPath();

  /**
   * Returns the value of the '<em><b>DPlatform</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.DPlatform}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>DPlatform</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>DPlatform</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getJcmModel_DPlatform()
   * @model containment="true"
   * @generated
   */
  EList<DPlatform> getDPlatform();

  /**
   * Returns the value of the '<em><b>DNode</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.DNode}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>DNode</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>DNode</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getJcmModel_DNode()
   * @model containment="true"
   * @generated
   */
  EList<DNode> getDNode();

} // JcmModel
