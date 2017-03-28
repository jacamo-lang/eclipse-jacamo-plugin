/**
 */
package jacamoide.xtext.jcm.jcm.impl;

import jacamoide.xtext.jcm.jcm.Group;
import jacamoide.xtext.jcm.jcm.JcmPackage;
import jacamoide.xtext.jcm.jcm.Literal;

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
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.GroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.GroupImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.GroupImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.GroupImpl#getResponsibleFor <em>Responsible For</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.GroupImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.GroupImpl#getDebug <em>Debug</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.GroupImpl#getOther <em>Other</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.GroupImpl#getString <em>String</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.GroupImpl#getVal <em>Val</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.GroupImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.GroupImpl#getVal_real <em>Val real</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.GroupImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.GroupImpl#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupImpl extends MinimalEObjectImpl.Container implements Group
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
   * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected static final String KIND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected String kind = KIND_EDEFAULT;

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
   * The cached value of the '{@link #getResponsibleFor() <em>Responsible For</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResponsibleFor()
   * @generated
   * @ordered
   */
  protected EList<String> responsibleFor;

  /**
   * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwner()
   * @generated
   * @ordered
   */
  protected EList<String> owner;

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
   * The cached value of the '{@link #getOther() <em>Other</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOther()
   * @generated
   * @ordered
   */
  protected EList<String> other;

  /**
   * The cached value of the '{@link #getString() <em>String</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected EList<String> string;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected EList<Integer> val;

  /**
   * The cached value of the '{@link #getLiteral() <em>Literal</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLiteral()
   * @generated
   * @ordered
   */
  protected EList<Literal> literal;

  /**
   * The cached value of the '{@link #getVal_real() <em>Val real</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal_real()
   * @generated
   * @ordered
   */
  protected EList<Double> val_real;

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
   * The cached value of the '{@link #getRole() <em>Role</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRole()
   * @generated
   * @ordered
   */
  protected EList<String> role;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GroupImpl()
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
    return JcmPackage.Literals.GROUP;
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
      eNotify(new ENotificationImpl(this, Notification.SET, JcmPackage.GROUP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getKind()
  {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKind(String newKind)
  {
    String oldKind = kind;
    kind = newKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JcmPackage.GROUP__KIND, oldKind, kind));
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
      group = new EObjectContainmentEList<Group>(Group.class, this, JcmPackage.GROUP__GROUP);
    }
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getResponsibleFor()
  {
    if (responsibleFor == null)
    {
      responsibleFor = new EDataTypeEList<String>(String.class, this, JcmPackage.GROUP__RESPONSIBLE_FOR);
    }
    return responsibleFor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getOwner()
  {
    if (owner == null)
    {
      owner = new EDataTypeEList<String>(String.class, this, JcmPackage.GROUP__OWNER);
    }
    return owner;
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
      debug = new EObjectContainmentEList<Literal>(Literal.class, this, JcmPackage.GROUP__DEBUG);
    }
    return debug;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getOther()
  {
    if (other == null)
    {
      other = new EDataTypeEList<String>(String.class, this, JcmPackage.GROUP__OTHER);
    }
    return other;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getString()
  {
    if (string == null)
    {
      string = new EDataTypeEList<String>(String.class, this, JcmPackage.GROUP__STRING);
    }
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getVal()
  {
    if (val == null)
    {
      val = new EDataTypeEList<Integer>(Integer.class, this, JcmPackage.GROUP__VAL);
    }
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Literal> getLiteral()
  {
    if (literal == null)
    {
      literal = new EObjectContainmentEList<Literal>(Literal.class, this, JcmPackage.GROUP__LITERAL);
    }
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Double> getVal_real()
  {
    if (val_real == null)
    {
      val_real = new EDataTypeEList<Double>(Double.class, this, JcmPackage.GROUP__VAL_REAL);
    }
    return val_real;
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
      agent = new EDataTypeEList<String>(String.class, this, JcmPackage.GROUP__AGENT);
    }
    return agent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getRole()
  {
    if (role == null)
    {
      role = new EDataTypeEList<String>(String.class, this, JcmPackage.GROUP__ROLE);
    }
    return role;
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
      case JcmPackage.GROUP__GROUP:
        return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
      case JcmPackage.GROUP__DEBUG:
        return ((InternalEList<?>)getDebug()).basicRemove(otherEnd, msgs);
      case JcmPackage.GROUP__LITERAL:
        return ((InternalEList<?>)getLiteral()).basicRemove(otherEnd, msgs);
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
      case JcmPackage.GROUP__NAME:
        return getName();
      case JcmPackage.GROUP__KIND:
        return getKind();
      case JcmPackage.GROUP__GROUP:
        return getGroup();
      case JcmPackage.GROUP__RESPONSIBLE_FOR:
        return getResponsibleFor();
      case JcmPackage.GROUP__OWNER:
        return getOwner();
      case JcmPackage.GROUP__DEBUG:
        return getDebug();
      case JcmPackage.GROUP__OTHER:
        return getOther();
      case JcmPackage.GROUP__STRING:
        return getString();
      case JcmPackage.GROUP__VAL:
        return getVal();
      case JcmPackage.GROUP__LITERAL:
        return getLiteral();
      case JcmPackage.GROUP__VAL_REAL:
        return getVal_real();
      case JcmPackage.GROUP__AGENT:
        return getAgent();
      case JcmPackage.GROUP__ROLE:
        return getRole();
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
      case JcmPackage.GROUP__NAME:
        setName((String)newValue);
        return;
      case JcmPackage.GROUP__KIND:
        setKind((String)newValue);
        return;
      case JcmPackage.GROUP__GROUP:
        getGroup().clear();
        getGroup().addAll((Collection<? extends Group>)newValue);
        return;
      case JcmPackage.GROUP__RESPONSIBLE_FOR:
        getResponsibleFor().clear();
        getResponsibleFor().addAll((Collection<? extends String>)newValue);
        return;
      case JcmPackage.GROUP__OWNER:
        getOwner().clear();
        getOwner().addAll((Collection<? extends String>)newValue);
        return;
      case JcmPackage.GROUP__DEBUG:
        getDebug().clear();
        getDebug().addAll((Collection<? extends Literal>)newValue);
        return;
      case JcmPackage.GROUP__OTHER:
        getOther().clear();
        getOther().addAll((Collection<? extends String>)newValue);
        return;
      case JcmPackage.GROUP__STRING:
        getString().clear();
        getString().addAll((Collection<? extends String>)newValue);
        return;
      case JcmPackage.GROUP__VAL:
        getVal().clear();
        getVal().addAll((Collection<? extends Integer>)newValue);
        return;
      case JcmPackage.GROUP__LITERAL:
        getLiteral().clear();
        getLiteral().addAll((Collection<? extends Literal>)newValue);
        return;
      case JcmPackage.GROUP__VAL_REAL:
        getVal_real().clear();
        getVal_real().addAll((Collection<? extends Double>)newValue);
        return;
      case JcmPackage.GROUP__AGENT:
        getAgent().clear();
        getAgent().addAll((Collection<? extends String>)newValue);
        return;
      case JcmPackage.GROUP__ROLE:
        getRole().clear();
        getRole().addAll((Collection<? extends String>)newValue);
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
      case JcmPackage.GROUP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case JcmPackage.GROUP__KIND:
        setKind(KIND_EDEFAULT);
        return;
      case JcmPackage.GROUP__GROUP:
        getGroup().clear();
        return;
      case JcmPackage.GROUP__RESPONSIBLE_FOR:
        getResponsibleFor().clear();
        return;
      case JcmPackage.GROUP__OWNER:
        getOwner().clear();
        return;
      case JcmPackage.GROUP__DEBUG:
        getDebug().clear();
        return;
      case JcmPackage.GROUP__OTHER:
        getOther().clear();
        return;
      case JcmPackage.GROUP__STRING:
        getString().clear();
        return;
      case JcmPackage.GROUP__VAL:
        getVal().clear();
        return;
      case JcmPackage.GROUP__LITERAL:
        getLiteral().clear();
        return;
      case JcmPackage.GROUP__VAL_REAL:
        getVal_real().clear();
        return;
      case JcmPackage.GROUP__AGENT:
        getAgent().clear();
        return;
      case JcmPackage.GROUP__ROLE:
        getRole().clear();
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
      case JcmPackage.GROUP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case JcmPackage.GROUP__KIND:
        return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT.equals(kind);
      case JcmPackage.GROUP__GROUP:
        return group != null && !group.isEmpty();
      case JcmPackage.GROUP__RESPONSIBLE_FOR:
        return responsibleFor != null && !responsibleFor.isEmpty();
      case JcmPackage.GROUP__OWNER:
        return owner != null && !owner.isEmpty();
      case JcmPackage.GROUP__DEBUG:
        return debug != null && !debug.isEmpty();
      case JcmPackage.GROUP__OTHER:
        return other != null && !other.isEmpty();
      case JcmPackage.GROUP__STRING:
        return string != null && !string.isEmpty();
      case JcmPackage.GROUP__VAL:
        return val != null && !val.isEmpty();
      case JcmPackage.GROUP__LITERAL:
        return literal != null && !literal.isEmpty();
      case JcmPackage.GROUP__VAL_REAL:
        return val_real != null && !val_real.isEmpty();
      case JcmPackage.GROUP__AGENT:
        return agent != null && !agent.isEmpty();
      case JcmPackage.GROUP__ROLE:
        return role != null && !role.isEmpty();
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
    result.append(", kind: ");
    result.append(kind);
    result.append(", responsibleFor: ");
    result.append(responsibleFor);
    result.append(", owner: ");
    result.append(owner);
    result.append(", other: ");
    result.append(other);
    result.append(", string: ");
    result.append(string);
    result.append(", val: ");
    result.append(val);
    result.append(", val_real: ");
    result.append(val_real);
    result.append(", agent: ");
    result.append(agent);
    result.append(", role: ");
    result.append(role);
    result.append(')');
    return result.toString();
  }

} //GroupImpl
