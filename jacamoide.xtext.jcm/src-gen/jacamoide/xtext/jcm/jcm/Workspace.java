/**
 */
package jacamoide.xtext.jcm.jcm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workspace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Workspace#getName <em>Name</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Workspace#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Workspace#getAgent <em>Agent</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Workspace#getDebug <em>Debug</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Workspace#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see jacamoide.xtext.jcm.jcm.JcmPackage#getWorkspace()
 * @model
 * @generated
 */
public interface Workspace extends EObject
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
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getWorkspace_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jacamoide.xtext.jcm.jcm.Workspace#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Artifact</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.Artifact}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artifact</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artifact</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getWorkspace_Artifact()
   * @model containment="true"
   * @generated
   */
  EList<Artifact> getArtifact();

  /**
   * Returns the value of the '<em><b>Agent</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Agent</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getWorkspace_Agent()
   * @model unique="false"
   * @generated
   */
  EList<String> getAgent();

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
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getWorkspace_Debug()
   * @model containment="true"
   * @generated
   */
  EList<Literal> getDebug();

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
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getWorkspace_Node()
   * @model containment="true"
   * @generated
   */
  EList<ONode> getNode();

} // Workspace
