/**
 */
package jacamoide.xtext.jcm.jcm.impl;

import jacamoide.xtext.jcm.jcm.Agent;
import jacamoide.xtext.jcm.jcm.DAslPath;
import jacamoide.xtext.jcm.jcm.DClassPath;
import jacamoide.xtext.jcm.jcm.DNode;
import jacamoide.xtext.jcm.jcm.DPlatform;
import jacamoide.xtext.jcm.jcm.DUses;
import jacamoide.xtext.jcm.jcm.JcmModel;
import jacamoide.xtext.jcm.jcm.JcmPackage;
import jacamoide.xtext.jcm.jcm.Organisation;
import jacamoide.xtext.jcm.jcm.Workspace;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.JcmModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.JcmModelImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.JcmModelImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.JcmModelImpl#getWorkspace <em>Workspace</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.JcmModelImpl#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.JcmModelImpl#getDclassPath <em>Dclass Path</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.JcmModelImpl#getDAslPath <em>DAsl Path</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.JcmModelImpl#getDPlatform <em>DPlatform</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.JcmModelImpl#getDNode <em>DNode</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JcmModelImpl extends MinimalEObjectImpl.Container implements JcmModel
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
   * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUses()
   * @generated
   * @ordered
   */
  protected DUses uses;

  /**
   * The cached value of the '{@link #getAgent() <em>Agent</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgent()
   * @generated
   * @ordered
   */
  protected EList<Agent> agent;

  /**
   * The cached value of the '{@link #getWorkspace() <em>Workspace</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWorkspace()
   * @generated
   * @ordered
   */
  protected EList<Workspace> workspace;

  /**
   * The cached value of the '{@link #getOrganisation() <em>Organisation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrganisation()
   * @generated
   * @ordered
   */
  protected EList<Organisation> organisation;

  /**
   * The cached value of the '{@link #getDclassPath() <em>Dclass Path</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDclassPath()
   * @generated
   * @ordered
   */
  protected EList<DClassPath> dclassPath;

  /**
   * The cached value of the '{@link #getDAslPath() <em>DAsl Path</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDAslPath()
   * @generated
   * @ordered
   */
  protected EList<DAslPath> dAslPath;

  /**
   * The cached value of the '{@link #getDPlatform() <em>DPlatform</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDPlatform()
   * @generated
   * @ordered
   */
  protected EList<DPlatform> dPlatform;

  /**
   * The cached value of the '{@link #getDNode() <em>DNode</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDNode()
   * @generated
   * @ordered
   */
  protected EList<DNode> dNode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JcmModelImpl()
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
    return JcmPackage.Literals.JCM_MODEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, JcmPackage.JCM_MODEL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DUses getUses()
  {
    return uses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUses(DUses newUses, NotificationChain msgs)
  {
    DUses oldUses = uses;
    uses = newUses;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JcmPackage.JCM_MODEL__USES, oldUses, newUses);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUses(DUses newUses)
  {
    if (newUses != uses)
    {
      NotificationChain msgs = null;
      if (uses != null)
        msgs = ((InternalEObject)uses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JcmPackage.JCM_MODEL__USES, null, msgs);
      if (newUses != null)
        msgs = ((InternalEObject)newUses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JcmPackage.JCM_MODEL__USES, null, msgs);
      msgs = basicSetUses(newUses, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JcmPackage.JCM_MODEL__USES, newUses, newUses));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Agent> getAgent()
  {
    if (agent == null)
    {
      agent = new EObjectContainmentEList<Agent>(Agent.class, this, JcmPackage.JCM_MODEL__AGENT);
    }
    return agent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Workspace> getWorkspace()
  {
    if (workspace == null)
    {
      workspace = new EObjectContainmentEList<Workspace>(Workspace.class, this, JcmPackage.JCM_MODEL__WORKSPACE);
    }
    return workspace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Organisation> getOrganisation()
  {
    if (organisation == null)
    {
      organisation = new EObjectContainmentEList<Organisation>(Organisation.class, this, JcmPackage.JCM_MODEL__ORGANISATION);
    }
    return organisation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DClassPath> getDclassPath()
  {
    if (dclassPath == null)
    {
      dclassPath = new EObjectContainmentEList<DClassPath>(DClassPath.class, this, JcmPackage.JCM_MODEL__DCLASS_PATH);
    }
    return dclassPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DAslPath> getDAslPath()
  {
    if (dAslPath == null)
    {
      dAslPath = new EObjectContainmentEList<DAslPath>(DAslPath.class, this, JcmPackage.JCM_MODEL__DASL_PATH);
    }
    return dAslPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DPlatform> getDPlatform()
  {
    if (dPlatform == null)
    {
      dPlatform = new EObjectContainmentEList<DPlatform>(DPlatform.class, this, JcmPackage.JCM_MODEL__DPLATFORM);
    }
    return dPlatform;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DNode> getDNode()
  {
    if (dNode == null)
    {
      dNode = new EObjectContainmentEList<DNode>(DNode.class, this, JcmPackage.JCM_MODEL__DNODE);
    }
    return dNode;
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
      case JcmPackage.JCM_MODEL__USES:
        return basicSetUses(null, msgs);
      case JcmPackage.JCM_MODEL__AGENT:
        return ((InternalEList<?>)getAgent()).basicRemove(otherEnd, msgs);
      case JcmPackage.JCM_MODEL__WORKSPACE:
        return ((InternalEList<?>)getWorkspace()).basicRemove(otherEnd, msgs);
      case JcmPackage.JCM_MODEL__ORGANISATION:
        return ((InternalEList<?>)getOrganisation()).basicRemove(otherEnd, msgs);
      case JcmPackage.JCM_MODEL__DCLASS_PATH:
        return ((InternalEList<?>)getDclassPath()).basicRemove(otherEnd, msgs);
      case JcmPackage.JCM_MODEL__DASL_PATH:
        return ((InternalEList<?>)getDAslPath()).basicRemove(otherEnd, msgs);
      case JcmPackage.JCM_MODEL__DPLATFORM:
        return ((InternalEList<?>)getDPlatform()).basicRemove(otherEnd, msgs);
      case JcmPackage.JCM_MODEL__DNODE:
        return ((InternalEList<?>)getDNode()).basicRemove(otherEnd, msgs);
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
      case JcmPackage.JCM_MODEL__NAME:
        return getName();
      case JcmPackage.JCM_MODEL__USES:
        return getUses();
      case JcmPackage.JCM_MODEL__AGENT:
        return getAgent();
      case JcmPackage.JCM_MODEL__WORKSPACE:
        return getWorkspace();
      case JcmPackage.JCM_MODEL__ORGANISATION:
        return getOrganisation();
      case JcmPackage.JCM_MODEL__DCLASS_PATH:
        return getDclassPath();
      case JcmPackage.JCM_MODEL__DASL_PATH:
        return getDAslPath();
      case JcmPackage.JCM_MODEL__DPLATFORM:
        return getDPlatform();
      case JcmPackage.JCM_MODEL__DNODE:
        return getDNode();
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
      case JcmPackage.JCM_MODEL__NAME:
        setName((String)newValue);
        return;
      case JcmPackage.JCM_MODEL__USES:
        setUses((DUses)newValue);
        return;
      case JcmPackage.JCM_MODEL__AGENT:
        getAgent().clear();
        getAgent().addAll((Collection<? extends Agent>)newValue);
        return;
      case JcmPackage.JCM_MODEL__WORKSPACE:
        getWorkspace().clear();
        getWorkspace().addAll((Collection<? extends Workspace>)newValue);
        return;
      case JcmPackage.JCM_MODEL__ORGANISATION:
        getOrganisation().clear();
        getOrganisation().addAll((Collection<? extends Organisation>)newValue);
        return;
      case JcmPackage.JCM_MODEL__DCLASS_PATH:
        getDclassPath().clear();
        getDclassPath().addAll((Collection<? extends DClassPath>)newValue);
        return;
      case JcmPackage.JCM_MODEL__DASL_PATH:
        getDAslPath().clear();
        getDAslPath().addAll((Collection<? extends DAslPath>)newValue);
        return;
      case JcmPackage.JCM_MODEL__DPLATFORM:
        getDPlatform().clear();
        getDPlatform().addAll((Collection<? extends DPlatform>)newValue);
        return;
      case JcmPackage.JCM_MODEL__DNODE:
        getDNode().clear();
        getDNode().addAll((Collection<? extends DNode>)newValue);
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
      case JcmPackage.JCM_MODEL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case JcmPackage.JCM_MODEL__USES:
        setUses((DUses)null);
        return;
      case JcmPackage.JCM_MODEL__AGENT:
        getAgent().clear();
        return;
      case JcmPackage.JCM_MODEL__WORKSPACE:
        getWorkspace().clear();
        return;
      case JcmPackage.JCM_MODEL__ORGANISATION:
        getOrganisation().clear();
        return;
      case JcmPackage.JCM_MODEL__DCLASS_PATH:
        getDclassPath().clear();
        return;
      case JcmPackage.JCM_MODEL__DASL_PATH:
        getDAslPath().clear();
        return;
      case JcmPackage.JCM_MODEL__DPLATFORM:
        getDPlatform().clear();
        return;
      case JcmPackage.JCM_MODEL__DNODE:
        getDNode().clear();
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
      case JcmPackage.JCM_MODEL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case JcmPackage.JCM_MODEL__USES:
        return uses != null;
      case JcmPackage.JCM_MODEL__AGENT:
        return agent != null && !agent.isEmpty();
      case JcmPackage.JCM_MODEL__WORKSPACE:
        return workspace != null && !workspace.isEmpty();
      case JcmPackage.JCM_MODEL__ORGANISATION:
        return organisation != null && !organisation.isEmpty();
      case JcmPackage.JCM_MODEL__DCLASS_PATH:
        return dclassPath != null && !dclassPath.isEmpty();
      case JcmPackage.JCM_MODEL__DASL_PATH:
        return dAslPath != null && !dAslPath.isEmpty();
      case JcmPackage.JCM_MODEL__DPLATFORM:
        return dPlatform != null && !dPlatform.isEmpty();
      case JcmPackage.JCM_MODEL__DNODE:
        return dNode != null && !dNode.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //JcmModelImpl
