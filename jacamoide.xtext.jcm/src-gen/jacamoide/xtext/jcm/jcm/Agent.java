/**
 * generated by Xtext 2.23.0
 */
package jacamoide.xtext.jcm.jcm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getName <em>Name</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getSource <em>Source</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getInstances <em>Instances</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getInstancesAtom <em>Instances Atom</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getNode <em>Node</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getAgArch <em>Ag Arch</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getAgClass <em>Ag Class</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getAgbbClass <em>Agbb Class</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getBeliefs <em>Beliefs</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getGoals <em>Goals</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getFocus <em>Focus</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getFocusNS <em>Focus NS</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getFocusNode <em>Focus Node</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getJoin <em>Join</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getJoinNode <em>Join Node</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getRole <em>Role</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getGroup <em>Group</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getGroupNode <em>Group Node</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getDebug <em>Debug</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getVerbose <em>Verbose</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getNrcbp <em>Nrcbp</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getOther <em>Other</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getString <em>String</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getVal <em>Val</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getLiteral <em>Literal</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.Agent#getVal_real <em>Val real</em>}</li>
 * </ul>
 *
 * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jacamoide.xtext.jcm.jcm.Agent#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Source</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.FileName}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_Source()
   * @model containment="true"
   * @generated
   */
  EList<FileName> getSource();

  /**
   * Returns the value of the '<em><b>Instances</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instances</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_Instances()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getInstances();

  /**
   * Returns the value of the '<em><b>Instances Atom</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instances Atom</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_InstancesAtom()
   * @model unique="false"
   * @generated
   */
  EList<String> getInstancesAtom();

  /**
   * Returns the value of the '<em><b>Node</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_Node()
   * @model unique="false"
   * @generated
   */
  EList<String> getNode();

  /**
   * Returns the value of the '<em><b>Ag Arch</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.ClassDef}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ag Arch</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_AgArch()
   * @model containment="true"
   * @generated
   */
  EList<ClassDef> getAgArch();

  /**
   * Returns the value of the '<em><b>Ag Class</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.ClassDef}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ag Class</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_AgClass()
   * @model containment="true"
   * @generated
   */
  EList<ClassDef> getAgClass();

  /**
   * Returns the value of the '<em><b>Agbb Class</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.ClassDef}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agbb Class</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_AgbbClass()
   * @model containment="true"
   * @generated
   */
  EList<ClassDef> getAgbbClass();

  /**
   * Returns the value of the '<em><b>Beliefs</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.Literal}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Beliefs</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_Beliefs()
   * @model containment="true"
   * @generated
   */
  EList<Literal> getBeliefs();

  /**
   * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.Literal}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goals</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_Goals()
   * @model containment="true"
   * @generated
   */
  EList<Literal> getGoals();

  /**
   * Returns the value of the '<em><b>Focus</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Focus</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_Focus()
   * @model unique="false"
   * @generated
   */
  EList<String> getFocus();

  /**
   * Returns the value of the '<em><b>Focus NS</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Focus NS</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_FocusNS()
   * @model unique="false"
   * @generated
   */
  EList<String> getFocusNS();

  /**
   * Returns the value of the '<em><b>Focus Node</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Focus Node</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_FocusNode()
   * @model unique="false"
   * @generated
   */
  EList<String> getFocusNode();

  /**
   * Returns the value of the '<em><b>Join</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_Join()
   * @model unique="false"
   * @generated
   */
  EList<String> getJoin();

  /**
   * Returns the value of the '<em><b>Join Node</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Join Node</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_JoinNode()
   * @model unique="false"
   * @generated
   */
  EList<String> getJoinNode();

  /**
   * Returns the value of the '<em><b>Role</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Role</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_Role()
   * @model unique="false"
   * @generated
   */
  EList<String> getRole();

  /**
   * Returns the value of the '<em><b>Group</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_Group()
   * @model unique="false"
   * @generated
   */
  EList<String> getGroup();

  /**
   * Returns the value of the '<em><b>Group Node</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group Node</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_GroupNode()
   * @model unique="false"
   * @generated
   */
  EList<String> getGroupNode();

  /**
   * Returns the value of the '<em><b>Debug</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.Literal}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Debug</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_Debug()
   * @model containment="true"
   * @generated
   */
  EList<Literal> getDebug();

  /**
   * Returns the value of the '<em><b>Verbose</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verbose</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_Verbose()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getVerbose();

  /**
   * Returns the value of the '<em><b>Nrcbp</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nrcbp</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_Nrcbp()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getNrcbp();

  /**
   * Returns the value of the '<em><b>Other</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Other</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_Other()
   * @model unique="false"
   * @generated
   */
  EList<String> getOther();

  /**
   * Returns the value of the '<em><b>String</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>String</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_String()
   * @model unique="false"
   * @generated
   */
  EList<String> getString();

  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Integer}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_Val()
   * @model unique="false"
   * @generated
   */
  EList<Integer> getVal();

  /**
   * Returns the value of the '<em><b>Literal</b></em>' containment reference list.
   * The list contents are of type {@link jacamoide.xtext.jcm.jcm.Literal}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal</em>' containment reference list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_Literal()
   * @model containment="true"
   * @generated
   */
  EList<Literal> getLiteral();

  /**
   * Returns the value of the '<em><b>Val real</b></em>' attribute list.
   * The list contents are of type {@link java.lang.Double}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val real</em>' attribute list.
   * @see jacamoide.xtext.jcm.jcm.JcmPackage#getAgent_Val_real()
   * @model unique="false"
   * @generated
   */
  EList<Double> getVal_real();

} // Agent
