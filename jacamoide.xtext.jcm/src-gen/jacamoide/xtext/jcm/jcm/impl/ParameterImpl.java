/**
 */
package jacamoide.xtext.jcm.jcm.impl;

import jacamoide.xtext.jcm.jcm.ClassDef;
import jacamoide.xtext.jcm.jcm.JcmPackage;
import jacamoide.xtext.jcm.jcm.ListParameters;
import jacamoide.xtext.jcm.jcm.Parameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.ParameterImpl#getClassDef <em>Class Def</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.ParameterImpl#getVal <em>Val</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.ParameterImpl#getVal_real <em>Val real</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.ParameterImpl#getString <em>String</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.ParameterImpl#getListParameters <em>List Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter
{
  /**
   * The cached value of the '{@link #getClassDef() <em>Class Def</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClassDef()
   * @generated
   * @ordered
   */
  protected ClassDef classDef;

  /**
   * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected static final int VAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected int val = VAL_EDEFAULT;

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
   * The default value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected static final String STRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getString() <em>String</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getString()
   * @generated
   * @ordered
   */
  protected String string = STRING_EDEFAULT;

  /**
   * The cached value of the '{@link #getListParameters() <em>List Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getListParameters()
   * @generated
   * @ordered
   */
  protected ListParameters listParameters;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterImpl()
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
    return JcmPackage.Literals.PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDef getClassDef()
  {
    return classDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetClassDef(ClassDef newClassDef, NotificationChain msgs)
  {
    ClassDef oldClassDef = classDef;
    classDef = newClassDef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JcmPackage.PARAMETER__CLASS_DEF, oldClassDef, newClassDef);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClassDef(ClassDef newClassDef)
  {
    if (newClassDef != classDef)
    {
      NotificationChain msgs = null;
      if (classDef != null)
        msgs = ((InternalEObject)classDef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JcmPackage.PARAMETER__CLASS_DEF, null, msgs);
      if (newClassDef != null)
        msgs = ((InternalEObject)newClassDef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JcmPackage.PARAMETER__CLASS_DEF, null, msgs);
      msgs = basicSetClassDef(newClassDef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JcmPackage.PARAMETER__CLASS_DEF, newClassDef, newClassDef));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal(int newVal)
  {
    int oldVal = val;
    val = newVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JcmPackage.PARAMETER__VAL, oldVal, val));
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
      val_real = new EDataTypeEList<Double>(Double.class, this, JcmPackage.PARAMETER__VAL_REAL);
    }
    return val_real;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getString()
  {
    return string;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setString(String newString)
  {
    String oldString = string;
    string = newString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JcmPackage.PARAMETER__STRING, oldString, string));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListParameters getListParameters()
  {
    return listParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetListParameters(ListParameters newListParameters, NotificationChain msgs)
  {
    ListParameters oldListParameters = listParameters;
    listParameters = newListParameters;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JcmPackage.PARAMETER__LIST_PARAMETERS, oldListParameters, newListParameters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setListParameters(ListParameters newListParameters)
  {
    if (newListParameters != listParameters)
    {
      NotificationChain msgs = null;
      if (listParameters != null)
        msgs = ((InternalEObject)listParameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JcmPackage.PARAMETER__LIST_PARAMETERS, null, msgs);
      if (newListParameters != null)
        msgs = ((InternalEObject)newListParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JcmPackage.PARAMETER__LIST_PARAMETERS, null, msgs);
      msgs = basicSetListParameters(newListParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JcmPackage.PARAMETER__LIST_PARAMETERS, newListParameters, newListParameters));
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
      case JcmPackage.PARAMETER__CLASS_DEF:
        return basicSetClassDef(null, msgs);
      case JcmPackage.PARAMETER__LIST_PARAMETERS:
        return basicSetListParameters(null, msgs);
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
      case JcmPackage.PARAMETER__CLASS_DEF:
        return getClassDef();
      case JcmPackage.PARAMETER__VAL:
        return getVal();
      case JcmPackage.PARAMETER__VAL_REAL:
        return getVal_real();
      case JcmPackage.PARAMETER__STRING:
        return getString();
      case JcmPackage.PARAMETER__LIST_PARAMETERS:
        return getListParameters();
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
      case JcmPackage.PARAMETER__CLASS_DEF:
        setClassDef((ClassDef)newValue);
        return;
      case JcmPackage.PARAMETER__VAL:
        setVal((Integer)newValue);
        return;
      case JcmPackage.PARAMETER__VAL_REAL:
        getVal_real().clear();
        getVal_real().addAll((Collection<? extends Double>)newValue);
        return;
      case JcmPackage.PARAMETER__STRING:
        setString((String)newValue);
        return;
      case JcmPackage.PARAMETER__LIST_PARAMETERS:
        setListParameters((ListParameters)newValue);
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
      case JcmPackage.PARAMETER__CLASS_DEF:
        setClassDef((ClassDef)null);
        return;
      case JcmPackage.PARAMETER__VAL:
        setVal(VAL_EDEFAULT);
        return;
      case JcmPackage.PARAMETER__VAL_REAL:
        getVal_real().clear();
        return;
      case JcmPackage.PARAMETER__STRING:
        setString(STRING_EDEFAULT);
        return;
      case JcmPackage.PARAMETER__LIST_PARAMETERS:
        setListParameters((ListParameters)null);
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
      case JcmPackage.PARAMETER__CLASS_DEF:
        return classDef != null;
      case JcmPackage.PARAMETER__VAL:
        return val != VAL_EDEFAULT;
      case JcmPackage.PARAMETER__VAL_REAL:
        return val_real != null && !val_real.isEmpty();
      case JcmPackage.PARAMETER__STRING:
        return STRING_EDEFAULT == null ? string != null : !STRING_EDEFAULT.equals(string);
      case JcmPackage.PARAMETER__LIST_PARAMETERS:
        return listParameters != null;
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
    result.append(" (val: ");
    result.append(val);
    result.append(", val_real: ");
    result.append(val_real);
    result.append(", string: ");
    result.append(string);
    result.append(')');
    return result.toString();
  }

} //ParameterImpl
