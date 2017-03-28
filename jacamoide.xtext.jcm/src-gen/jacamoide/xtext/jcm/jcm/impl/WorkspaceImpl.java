/**
 */
package jacamoide.xtext.jcm.jcm.impl;

import jacamoide.xtext.jcm.jcm.Artifact;
import jacamoide.xtext.jcm.jcm.JcmPackage;
import jacamoide.xtext.jcm.jcm.Literal;
import jacamoide.xtext.jcm.jcm.ONode;
import jacamoide.xtext.jcm.jcm.Workspace;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workspace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.WorkspaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.WorkspaceImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.WorkspaceImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.WorkspaceImpl#getDebug <em>Debug</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.WorkspaceImpl#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkspaceImpl extends MinimalEObjectImpl.Container implements Workspace
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifact()
   * @generated
   * @ordered
   */
  protected EList<Artifact> artifact;

  /**
   * The cached value of the '{@link #getAgent() <em>Agent</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgent()
   * @generated
   * @ordered
   */
  protected EList<String> agent;

  /**
   * The cached value of the '{@link #getDebug() <em>Debug</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDebug()
   * @generated
   * @ordered
   */
  protected EList<Literal> debug;

  /**
   * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNode()
   * @generated
   * @ordered
   */
  protected EList<ONode> node;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WorkspaceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return JcmPackage.Literals.WORKSPACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JcmPackage.WORKSPACE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Artifact> getArtifact()
  {
    if (artifact == null)
    {
      artifact = new EObjectContainmentEList<Artifact>(Artifact.class, this, JcmPackage.WORKSPACE__ARTIFACT);
    }
    return artifact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getAgent()
  {
    if (agent == null)
    {
      agent = new EDataTypeEList<String>(String.class, this, JcmPackage.WORKSPACE__AGENT);
    }
    return agent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Literal> getDebug()
  {
    if (debug == null)
    {
      debug = new EObjectContainmentEList<Literal>(Literal.class, this, JcmPackage.WORKSPACE__DEBUG);
    }
    return debug;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ONode> getNode()
  {
    if (node == null)
    {
      node = new EObjectContainmentEList<ONode>(ONode.class, this, JcmPackage.WORKSPACE__NODE);
    }
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case JcmPackage.WORKSPACE__ARTIFACT:
        return ((InternalEList<?>)getArtifact()).basicRemove(otherEnd, msgs);
      case JcmPackage.WORKSPACE__DEBUG:
        return ((InternalEList<?>)getDebug()).basicRemove(otherEnd, msgs);
      case JcmPackage.WORKSPACE__NODE:
        return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case JcmPackage.WORKSPACE__NAME:
        return getName();
      case JcmPackage.WORKSPACE__ARTIFACT:
        return getArtifact();
      case JcmPackage.WORKSPACE__AGENT:
        return getAgent();
      case JcmPackage.WORKSPACE__DEBUG:
        return getDebug();
      case JcmPackage.WORKSPACE__NODE:
        return getNode();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case JcmPackage.WORKSPACE__NAME:
        setName((String)newValue);
        return;
      case JcmPackage.WORKSPACE__ARTIFACT:
        getArtifact().clear();
        getArtifact().addAll((Collection<? extends Artifact>)newValue);
        return;
      case JcmPackage.WORKSPACE__AGENT:
        getAgent().clear();
        getAgent().addAll((Collection<? extends String>)newValue);
        return;
      case JcmPackage.WORKSPACE__DEBUG:
        getDebug().clear();
        getDebug().addAll((Collection<? extends Literal>)newValue);
        return;
      case JcmPackage.WORKSPACE__NODE:
        getNode().clear();
        getNode().addAll((Collection<? extends ONode>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case JcmPackage.WORKSPACE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case JcmPackage.WORKSPACE__ARTIFACT:
        getArtifact().clear();
        return;
      case JcmPackage.WORKSPACE__AGENT:
        getAgent().clear();
        return;
      case JcmPackage.WORKSPACE__DEBUG:
        getDebug().clear();
        return;
      case JcmPackage.WORKSPACE__NODE:
        getNode().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case JcmPackage.WORKSPACE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case JcmPackage.WORKSPACE__ARTIFACT:
        return artifact != null && !artifact.isEmpty();
      case JcmPackage.WORKSPACE__AGENT:
        return agent != null && !agent.isEmpty();
      case JcmPackage.WORKSPACE__DEBUG:
        return debug != null && !debug.isEmpty();
      case JcmPackage.WORKSPACE__NODE:
        return node != null && !node.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", agent: ");
    result.append(agent);
    result.append(')');
    return result.toString();
  }

} //WorkspaceImpl
