/**
 */
package jacamoide.xtext.jcm.jcm.impl;

import jacamoide.xtext.jcm.jcm.ClassDef;
import jacamoide.xtext.jcm.jcm.DPlatform;
import jacamoide.xtext.jcm.jcm.JcmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DPlatform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.DPlatformImpl#getPlatform <em>Platform</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DPlatformImpl extends MinimalEObjectImpl.Container implements DPlatform
{
  /**
   * The cached value of the '{@link #getPlatform() <em>Platform</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlatform()
   * @generated
   * @ordered
   */
  protected EList<ClassDef> platform;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DPlatformImpl()
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
    return JcmPackage.Literals.DPLATFORM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassDef> getPlatform()
  {
    if (platform == null)
    {
      platform = new EObjectContainmentEList<ClassDef>(ClassDef.class, this, JcmPackage.DPLATFORM__PLATFORM);
    }
    return platform;
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
      case JcmPackage.DPLATFORM__PLATFORM:
        return ((InternalEList<?>)getPlatform()).basicRemove(otherEnd, msgs);
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
      case JcmPackage.DPLATFORM__PLATFORM:
        return getPlatform();
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
      case JcmPackage.DPLATFORM__PLATFORM:
        getPlatform().clear();
        getPlatform().addAll((Collection<? extends ClassDef>)newValue);
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
      case JcmPackage.DPLATFORM__PLATFORM:
        getPlatform().clear();
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
      case JcmPackage.DPLATFORM__PLATFORM:
        return platform != null && !platform.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DPlatformImpl
