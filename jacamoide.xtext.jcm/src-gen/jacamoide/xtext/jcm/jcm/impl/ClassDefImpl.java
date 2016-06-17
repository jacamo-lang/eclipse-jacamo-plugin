/**
 */
package jacamoide.xtext.jcm.jcm.impl;

import jacamoide.xtext.jcm.jcm.ClassDef;
import jacamoide.xtext.jcm.jcm.JcmPackage;
import jacamoide.xtext.jcm.jcm.Parameter;

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
 * An implementation of the model object '<em><b>Class Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.ClassDefImpl#getInfrastructure <em>Infrastructure</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.ClassDefImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassDefImpl extends MinimalEObjectImpl.Container implements ClassDef
{
  /**
   * The default value of the '{@link #getInfrastructure() <em>Infrastructure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfrastructure()
   * @generated
   * @ordered
   */
  protected static final String INFRASTRUCTURE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInfrastructure() <em>Infrastructure</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInfrastructure()
   * @generated
   * @ordered
   */
  protected String infrastructure = INFRASTRUCTURE_EDEFAULT;

  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClassDefImpl()
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
    return JcmPackage.Literals.CLASS_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInfrastructure()
  {
    return infrastructure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInfrastructure(String newInfrastructure)
  {
    String oldInfrastructure = infrastructure;
    infrastructure = newInfrastructure;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JcmPackage.CLASS_DEF__INFRASTRUCTURE, oldInfrastructure, infrastructure));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParameter()
  {
    if (parameter == null)
    {
      parameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, JcmPackage.CLASS_DEF__PARAMETER);
    }
    return parameter;
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
      case JcmPackage.CLASS_DEF__PARAMETER:
        return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
      case JcmPackage.CLASS_DEF__INFRASTRUCTURE:
        return getInfrastructure();
      case JcmPackage.CLASS_DEF__PARAMETER:
        return getParameter();
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
      case JcmPackage.CLASS_DEF__INFRASTRUCTURE:
        setInfrastructure((String)newValue);
        return;
      case JcmPackage.CLASS_DEF__PARAMETER:
        getParameter().clear();
        getParameter().addAll((Collection<? extends Parameter>)newValue);
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
      case JcmPackage.CLASS_DEF__INFRASTRUCTURE:
        setInfrastructure(INFRASTRUCTURE_EDEFAULT);
        return;
      case JcmPackage.CLASS_DEF__PARAMETER:
        getParameter().clear();
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
      case JcmPackage.CLASS_DEF__INFRASTRUCTURE:
        return INFRASTRUCTURE_EDEFAULT == null ? infrastructure != null : !INFRASTRUCTURE_EDEFAULT.equals(infrastructure);
      case JcmPackage.CLASS_DEF__PARAMETER:
        return parameter != null && !parameter.isEmpty();
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
    result.append(" (infrastructure: ");
    result.append(infrastructure);
    result.append(')');
    return result.toString();
  }

} //ClassDefImpl
