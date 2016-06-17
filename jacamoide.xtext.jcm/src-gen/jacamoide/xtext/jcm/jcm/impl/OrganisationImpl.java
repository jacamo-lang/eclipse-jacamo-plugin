/**
 */
package jacamoide.xtext.jcm.jcm.impl;

import jacamoide.xtext.jcm.jcm.Group;
import jacamoide.xtext.jcm.jcm.JcmPackage;
import jacamoide.xtext.jcm.jcm.OAgents;
import jacamoide.xtext.jcm.jcm.OFileName;
import jacamoide.xtext.jcm.jcm.ONode;
import jacamoide.xtext.jcm.jcm.OOthers;
import jacamoide.xtext.jcm.jcm.Organisation;
import jacamoide.xtext.jcm.jcm.Scheme;

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
 * An implementation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.OrganisationImpl#getName <em>Name</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.OrganisationImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.OrganisationImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.OrganisationImpl#getScheme <em>Scheme</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.OrganisationImpl#getAgents <em>Agents</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.OrganisationImpl#getNode <em>Node</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.OrganisationImpl#getOther <em>Other</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganisationImpl extends MinimalEObjectImpl.Container implements Organisation
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
   * The cached value of the '{@link #getFileName() <em>File Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileName()
   * @generated
   * @ordered
   */
  protected OFileName fileName;

  /**
   * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected EList<Group> group;

  /**
   * The cached value of the '{@link #getScheme() <em>Scheme</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScheme()
   * @generated
   * @ordered
   */
  protected EList<Scheme> scheme;

  /**
   * The cached value of the '{@link #getAgents() <em>Agents</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgents()
   * @generated
   * @ordered
   */
  protected EList<OAgents> agents;

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
   * The cached value of the '{@link #getOther() <em>Other</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOther()
   * @generated
   * @ordered
   */
  protected EList<OOthers> other;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrganisationImpl()
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
    return JcmPackage.Literals.ORGANISATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, JcmPackage.ORGANISATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OFileName getFileName()
  {
    return fileName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFileName(OFileName newFileName, NotificationChain msgs)
  {
    OFileName oldFileName = fileName;
    fileName = newFileName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JcmPackage.ORGANISATION__FILE_NAME, oldFileName, newFileName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFileName(OFileName newFileName)
  {
    if (newFileName != fileName)
    {
      NotificationChain msgs = null;
      if (fileName != null)
        msgs = ((InternalEObject)fileName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JcmPackage.ORGANISATION__FILE_NAME, null, msgs);
      if (newFileName != null)
        msgs = ((InternalEObject)newFileName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JcmPackage.ORGANISATION__FILE_NAME, null, msgs);
      msgs = basicSetFileName(newFileName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JcmPackage.ORGANISATION__FILE_NAME, newFileName, newFileName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Group> getGroup()
  {
    if (group == null)
    {
      group = new EObjectContainmentEList<Group>(Group.class, this, JcmPackage.ORGANISATION__GROUP);
    }
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Scheme> getScheme()
  {
    if (scheme == null)
    {
      scheme = new EObjectContainmentEList<Scheme>(Scheme.class, this, JcmPackage.ORGANISATION__SCHEME);
    }
    return scheme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OAgents> getAgents()
  {
    if (agents == null)
    {
      agents = new EObjectContainmentEList<OAgents>(OAgents.class, this, JcmPackage.ORGANISATION__AGENTS);
    }
    return agents;
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
      node = new EObjectContainmentEList<ONode>(ONode.class, this, JcmPackage.ORGANISATION__NODE);
    }
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<OOthers> getOther()
  {
    if (other == null)
    {
      other = new EObjectContainmentEList<OOthers>(OOthers.class, this, JcmPackage.ORGANISATION__OTHER);
    }
    return other;
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
      case JcmPackage.ORGANISATION__FILE_NAME:
        return basicSetFileName(null, msgs);
      case JcmPackage.ORGANISATION__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case JcmPackage.ORGANISATION__SCHEME:
        return ((InternalEList<?>)getScheme()).basicRemove(otherEnd, msgs);
      case JcmPackage.ORGANISATION__AGENTS:
        return ((InternalEList<?>)getAgents()).basicRemove(otherEnd, msgs);
      case JcmPackage.ORGANISATION__NODE:
        return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
      case JcmPackage.ORGANISATION__OTHER:
        return ((InternalEList<?>)getOther()).basicRemove(otherEnd, msgs);
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
      case JcmPackage.ORGANISATION__NAME:
        return getName();
      case JcmPackage.ORGANISATION__FILE_NAME:
        return getFileName();
      case JcmPackage.ORGANISATION__GROUP:
        return getGroup();
      case JcmPackage.ORGANISATION__SCHEME:
        return getScheme();
      case JcmPackage.ORGANISATION__AGENTS:
        return getAgents();
      case JcmPackage.ORGANISATION__NODE:
        return getNode();
      case JcmPackage.ORGANISATION__OTHER:
        return getOther();
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
      case JcmPackage.ORGANISATION__NAME:
        setName((String)newValue);
        return;
      case JcmPackage.ORGANISATION__FILE_NAME:
        setFileName((OFileName)newValue);
        return;
      case JcmPackage.ORGANISATION__GROUP:
        getGroup().clear();
        getGroup().addAll((Collection<? extends Group>)newValue);
        return;
      case JcmPackage.ORGANISATION__SCHEME:
        getScheme().clear();
        getScheme().addAll((Collection<? extends Scheme>)newValue);
        return;
      case JcmPackage.ORGANISATION__AGENTS:
        getAgents().clear();
        getAgents().addAll((Collection<? extends OAgents>)newValue);
        return;
      case JcmPackage.ORGANISATION__NODE:
        getNode().clear();
        getNode().addAll((Collection<? extends ONode>)newValue);
        return;
      case JcmPackage.ORGANISATION__OTHER:
        getOther().clear();
        getOther().addAll((Collection<? extends OOthers>)newValue);
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
      case JcmPackage.ORGANISATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case JcmPackage.ORGANISATION__FILE_NAME:
        setFileName((OFileName)null);
        return;
      case JcmPackage.ORGANISATION__GROUP:
        getGroup().clear();
        return;
      case JcmPackage.ORGANISATION__SCHEME:
        getScheme().clear();
        return;
      case JcmPackage.ORGANISATION__AGENTS:
        getAgents().clear();
        return;
      case JcmPackage.ORGANISATION__NODE:
        getNode().clear();
        return;
      case JcmPackage.ORGANISATION__OTHER:
        getOther().clear();
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
      case JcmPackage.ORGANISATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case JcmPackage.ORGANISATION__FILE_NAME:
        return fileName != null;
      case JcmPackage.ORGANISATION__GROUP:
        return group != null && !group.isEmpty();
      case JcmPackage.ORGANISATION__SCHEME:
        return scheme != null && !scheme.isEmpty();
      case JcmPackage.ORGANISATION__AGENTS:
        return agents != null && !agents.isEmpty();
      case JcmPackage.ORGANISATION__NODE:
        return node != null && !node.isEmpty();
      case JcmPackage.ORGANISATION__OTHER:
        return other != null && !other.isEmpty();
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

} //OrganisationImpl
