/**
 */
package jacamoide.xtext.jcm.jcm.impl;

import jacamoide.xtext.jcm.jcm.Agent;
import jacamoide.xtext.jcm.jcm.ClassDef;
import jacamoide.xtext.jcm.jcm.FileName;
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
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getName <em>Name</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getSource <em>Source</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getInstances <em>Instances</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getInstancesAtom <em>Instances Atom</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getNode <em>Node</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getAgArch <em>Ag Arch</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getAgClass <em>Ag Class</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getAgbbClass <em>Agbb Class</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getBeliefs <em>Beliefs</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getGoals <em>Goals</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getFocus <em>Focus</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getFocusNode <em>Focus Node</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getJoin <em>Join</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getJoinNode <em>Join Node</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getRole <em>Role</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getGroupNode <em>Group Node</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getDebug <em>Debug</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getVerbose <em>Verbose</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getNrcbp <em>Nrcbp</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getOther <em>Other</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getString <em>String</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getVal <em>Val</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getLiteral <em>Literal</em>}</li>
 *   <li>{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl#getVal_real <em>Val real</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgentImpl extends MinimalEObjectImpl.Container implements Agent
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
   * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected EList<FileName> source;

  /**
   * The cached value of the '{@link #getInstances() <em>Instances</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstances()
   * @generated
   * @ordered
   */
  protected EList<Integer> instances;

  /**
   * The cached value of the '{@link #getInstancesAtom() <em>Instances Atom</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstancesAtom()
   * @generated
   * @ordered
   */
  protected EList<String> instancesAtom;

  /**
   * The cached value of the '{@link #getNode() <em>Node</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNode()
   * @generated
   * @ordered
   */
  protected EList<String> node;

  /**
   * The cached value of the '{@link #getAgArch() <em>Ag Arch</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgArch()
   * @generated
   * @ordered
   */
  protected EList<ClassDef> agArch;

  /**
   * The cached value of the '{@link #getAgClass() <em>Ag Class</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgClass()
   * @generated
   * @ordered
   */
  protected EList<ClassDef> agClass;

  /**
   * The cached value of the '{@link #getAgbbClass() <em>Agbb Class</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgbbClass()
   * @generated
   * @ordered
   */
  protected EList<ClassDef> agbbClass;

  /**
   * The cached value of the '{@link #getBeliefs() <em>Beliefs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBeliefs()
   * @generated
   * @ordered
   */
  protected EList<Literal> beliefs;

  /**
   * The cached value of the '{@link #getGoals() <em>Goals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoals()
   * @generated
   * @ordered
   */
  protected EList<Literal> goals;

  /**
   * The cached value of the '{@link #getFocus() <em>Focus</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFocus()
   * @generated
   * @ordered
   */
  protected EList<String> focus;

  /**
   * The cached value of the '{@link #getFocusNode() <em>Focus Node</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFocusNode()
   * @generated
   * @ordered
   */
  protected EList<String> focusNode;

  /**
   * The cached value of the '{@link #getJoin() <em>Join</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoin()
   * @generated
   * @ordered
   */
  protected EList<String> join;

  /**
   * The cached value of the '{@link #getJoinNode() <em>Join Node</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoinNode()
   * @generated
   * @ordered
   */
  protected EList<String> joinNode;

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
   * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroup()
   * @generated
   * @ordered
   */
  protected EList<String> group;

  /**
   * The cached value of the '{@link #getGroupNode() <em>Group Node</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupNode()
   * @generated
   * @ordered
   */
  protected EList<String> groupNode;

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
   * The cached value of the '{@link #getVerbose() <em>Verbose</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerbose()
   * @generated
   * @ordered
   */
  protected EList<Integer> verbose;

  /**
   * The cached value of the '{@link #getNrcbp() <em>Nrcbp</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNrcbp()
   * @generated
   * @ordered
   */
  protected EList<Integer> nrcbp;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AgentImpl()
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
    return JcmPackage.Literals.AGENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, JcmPackage.AGENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FileName> getSource()
  {
    if (source == null)
    {
      source = new EObjectContainmentEList<FileName>(FileName.class, this, JcmPackage.AGENT__SOURCE);
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getInstances()
  {
    if (instances == null)
    {
      instances = new EDataTypeEList<Integer>(Integer.class, this, JcmPackage.AGENT__INSTANCES);
    }
    return instances;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getInstancesAtom()
  {
    if (instancesAtom == null)
    {
      instancesAtom = new EDataTypeEList<String>(String.class, this, JcmPackage.AGENT__INSTANCES_ATOM);
    }
    return instancesAtom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getNode()
  {
    if (node == null)
    {
      node = new EDataTypeEList<String>(String.class, this, JcmPackage.AGENT__NODE);
    }
    return node;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassDef> getAgArch()
  {
    if (agArch == null)
    {
      agArch = new EObjectContainmentEList<ClassDef>(ClassDef.class, this, JcmPackage.AGENT__AG_ARCH);
    }
    return agArch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassDef> getAgClass()
  {
    if (agClass == null)
    {
      agClass = new EObjectContainmentEList<ClassDef>(ClassDef.class, this, JcmPackage.AGENT__AG_CLASS);
    }
    return agClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ClassDef> getAgbbClass()
  {
    if (agbbClass == null)
    {
      agbbClass = new EObjectContainmentEList<ClassDef>(ClassDef.class, this, JcmPackage.AGENT__AGBB_CLASS);
    }
    return agbbClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Literal> getBeliefs()
  {
    if (beliefs == null)
    {
      beliefs = new EObjectContainmentEList<Literal>(Literal.class, this, JcmPackage.AGENT__BELIEFS);
    }
    return beliefs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Literal> getGoals()
  {
    if (goals == null)
    {
      goals = new EObjectContainmentEList<Literal>(Literal.class, this, JcmPackage.AGENT__GOALS);
    }
    return goals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getFocus()
  {
    if (focus == null)
    {
      focus = new EDataTypeEList<String>(String.class, this, JcmPackage.AGENT__FOCUS);
    }
    return focus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getFocusNode()
  {
    if (focusNode == null)
    {
      focusNode = new EDataTypeEList<String>(String.class, this, JcmPackage.AGENT__FOCUS_NODE);
    }
    return focusNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getJoin()
  {
    if (join == null)
    {
      join = new EDataTypeEList<String>(String.class, this, JcmPackage.AGENT__JOIN);
    }
    return join;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getJoinNode()
  {
    if (joinNode == null)
    {
      joinNode = new EDataTypeEList<String>(String.class, this, JcmPackage.AGENT__JOIN_NODE);
    }
    return joinNode;
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
      role = new EDataTypeEList<String>(String.class, this, JcmPackage.AGENT__ROLE);
    }
    return role;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getGroup()
  {
    if (group == null)
    {
      group = new EDataTypeEList<String>(String.class, this, JcmPackage.AGENT__GROUP);
    }
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getGroupNode()
  {
    if (groupNode == null)
    {
      groupNode = new EDataTypeEList<String>(String.class, this, JcmPackage.AGENT__GROUP_NODE);
    }
    return groupNode;
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
      debug = new EObjectContainmentEList<Literal>(Literal.class, this, JcmPackage.AGENT__DEBUG);
    }
    return debug;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getVerbose()
  {
    if (verbose == null)
    {
      verbose = new EDataTypeEList<Integer>(Integer.class, this, JcmPackage.AGENT__VERBOSE);
    }
    return verbose;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getNrcbp()
  {
    if (nrcbp == null)
    {
      nrcbp = new EDataTypeEList<Integer>(Integer.class, this, JcmPackage.AGENT__NRCBP);
    }
    return nrcbp;
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
      other = new EDataTypeEList<String>(String.class, this, JcmPackage.AGENT__OTHER);
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
      string = new EDataTypeEList<String>(String.class, this, JcmPackage.AGENT__STRING);
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
      val = new EDataTypeEList<Integer>(Integer.class, this, JcmPackage.AGENT__VAL);
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
      literal = new EObjectContainmentEList<Literal>(Literal.class, this, JcmPackage.AGENT__LITERAL);
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
      val_real = new EDataTypeEList<Double>(Double.class, this, JcmPackage.AGENT__VAL_REAL);
    }
    return val_real;
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
      case JcmPackage.AGENT__SOURCE:
        return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
      case JcmPackage.AGENT__AG_ARCH:
        return ((InternalEList<?>)getAgArch()).basicRemove(otherEnd, msgs);
      case JcmPackage.AGENT__AG_CLASS:
        return ((InternalEList<?>)getAgClass()).basicRemove(otherEnd, msgs);
      case JcmPackage.AGENT__AGBB_CLASS:
        return ((InternalEList<?>)getAgbbClass()).basicRemove(otherEnd, msgs);
      case JcmPackage.AGENT__BELIEFS:
        return ((InternalEList<?>)getBeliefs()).basicRemove(otherEnd, msgs);
      case JcmPackage.AGENT__GOALS:
        return ((InternalEList<?>)getGoals()).basicRemove(otherEnd, msgs);
      case JcmPackage.AGENT__DEBUG:
        return ((InternalEList<?>)getDebug()).basicRemove(otherEnd, msgs);
      case JcmPackage.AGENT__LITERAL:
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
      case JcmPackage.AGENT__NAME:
        return getName();
      case JcmPackage.AGENT__SOURCE:
        return getSource();
      case JcmPackage.AGENT__INSTANCES:
        return getInstances();
      case JcmPackage.AGENT__INSTANCES_ATOM:
        return getInstancesAtom();
      case JcmPackage.AGENT__NODE:
        return getNode();
      case JcmPackage.AGENT__AG_ARCH:
        return getAgArch();
      case JcmPackage.AGENT__AG_CLASS:
        return getAgClass();
      case JcmPackage.AGENT__AGBB_CLASS:
        return getAgbbClass();
      case JcmPackage.AGENT__BELIEFS:
        return getBeliefs();
      case JcmPackage.AGENT__GOALS:
        return getGoals();
      case JcmPackage.AGENT__FOCUS:
        return getFocus();
      case JcmPackage.AGENT__FOCUS_NODE:
        return getFocusNode();
      case JcmPackage.AGENT__JOIN:
        return getJoin();
      case JcmPackage.AGENT__JOIN_NODE:
        return getJoinNode();
      case JcmPackage.AGENT__ROLE:
        return getRole();
      case JcmPackage.AGENT__GROUP:
        return getGroup();
      case JcmPackage.AGENT__GROUP_NODE:
        return getGroupNode();
      case JcmPackage.AGENT__DEBUG:
        return getDebug();
      case JcmPackage.AGENT__VERBOSE:
        return getVerbose();
      case JcmPackage.AGENT__NRCBP:
        return getNrcbp();
      case JcmPackage.AGENT__OTHER:
        return getOther();
      case JcmPackage.AGENT__STRING:
        return getString();
      case JcmPackage.AGENT__VAL:
        return getVal();
      case JcmPackage.AGENT__LITERAL:
        return getLiteral();
      case JcmPackage.AGENT__VAL_REAL:
        return getVal_real();
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
      case JcmPackage.AGENT__NAME:
        setName((String)newValue);
        return;
      case JcmPackage.AGENT__SOURCE:
        getSource().clear();
        getSource().addAll((Collection<? extends FileName>)newValue);
        return;
      case JcmPackage.AGENT__INSTANCES:
        getInstances().clear();
        getInstances().addAll((Collection<? extends Integer>)newValue);
        return;
      case JcmPackage.AGENT__INSTANCES_ATOM:
        getInstancesAtom().clear();
        getInstancesAtom().addAll((Collection<? extends String>)newValue);
        return;
      case JcmPackage.AGENT__NODE:
        getNode().clear();
        getNode().addAll((Collection<? extends String>)newValue);
        return;
      case JcmPackage.AGENT__AG_ARCH:
        getAgArch().clear();
        getAgArch().addAll((Collection<? extends ClassDef>)newValue);
        return;
      case JcmPackage.AGENT__AG_CLASS:
        getAgClass().clear();
        getAgClass().addAll((Collection<? extends ClassDef>)newValue);
        return;
      case JcmPackage.AGENT__AGBB_CLASS:
        getAgbbClass().clear();
        getAgbbClass().addAll((Collection<? extends ClassDef>)newValue);
        return;
      case JcmPackage.AGENT__BELIEFS:
        getBeliefs().clear();
        getBeliefs().addAll((Collection<? extends Literal>)newValue);
        return;
      case JcmPackage.AGENT__GOALS:
        getGoals().clear();
        getGoals().addAll((Collection<? extends Literal>)newValue);
        return;
      case JcmPackage.AGENT__FOCUS:
        getFocus().clear();
        getFocus().addAll((Collection<? extends String>)newValue);
        return;
      case JcmPackage.AGENT__FOCUS_NODE:
        getFocusNode().clear();
        getFocusNode().addAll((Collection<? extends String>)newValue);
        return;
      case JcmPackage.AGENT__JOIN:
        getJoin().clear();
        getJoin().addAll((Collection<? extends String>)newValue);
        return;
      case JcmPackage.AGENT__JOIN_NODE:
        getJoinNode().clear();
        getJoinNode().addAll((Collection<? extends String>)newValue);
        return;
      case JcmPackage.AGENT__ROLE:
        getRole().clear();
        getRole().addAll((Collection<? extends String>)newValue);
        return;
      case JcmPackage.AGENT__GROUP:
        getGroup().clear();
        getGroup().addAll((Collection<? extends String>)newValue);
        return;
      case JcmPackage.AGENT__GROUP_NODE:
        getGroupNode().clear();
        getGroupNode().addAll((Collection<? extends String>)newValue);
        return;
      case JcmPackage.AGENT__DEBUG:
        getDebug().clear();
        getDebug().addAll((Collection<? extends Literal>)newValue);
        return;
      case JcmPackage.AGENT__VERBOSE:
        getVerbose().clear();
        getVerbose().addAll((Collection<? extends Integer>)newValue);
        return;
      case JcmPackage.AGENT__NRCBP:
        getNrcbp().clear();
        getNrcbp().addAll((Collection<? extends Integer>)newValue);
        return;
      case JcmPackage.AGENT__OTHER:
        getOther().clear();
        getOther().addAll((Collection<? extends String>)newValue);
        return;
      case JcmPackage.AGENT__STRING:
        getString().clear();
        getString().addAll((Collection<? extends String>)newValue);
        return;
      case JcmPackage.AGENT__VAL:
        getVal().clear();
        getVal().addAll((Collection<? extends Integer>)newValue);
        return;
      case JcmPackage.AGENT__LITERAL:
        getLiteral().clear();
        getLiteral().addAll((Collection<? extends Literal>)newValue);
        return;
      case JcmPackage.AGENT__VAL_REAL:
        getVal_real().clear();
        getVal_real().addAll((Collection<? extends Double>)newValue);
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
      case JcmPackage.AGENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case JcmPackage.AGENT__SOURCE:
        getSource().clear();
        return;
      case JcmPackage.AGENT__INSTANCES:
        getInstances().clear();
        return;
      case JcmPackage.AGENT__INSTANCES_ATOM:
        getInstancesAtom().clear();
        return;
      case JcmPackage.AGENT__NODE:
        getNode().clear();
        return;
      case JcmPackage.AGENT__AG_ARCH:
        getAgArch().clear();
        return;
      case JcmPackage.AGENT__AG_CLASS:
        getAgClass().clear();
        return;
      case JcmPackage.AGENT__AGBB_CLASS:
        getAgbbClass().clear();
        return;
      case JcmPackage.AGENT__BELIEFS:
        getBeliefs().clear();
        return;
      case JcmPackage.AGENT__GOALS:
        getGoals().clear();
        return;
      case JcmPackage.AGENT__FOCUS:
        getFocus().clear();
        return;
      case JcmPackage.AGENT__FOCUS_NODE:
        getFocusNode().clear();
        return;
      case JcmPackage.AGENT__JOIN:
        getJoin().clear();
        return;
      case JcmPackage.AGENT__JOIN_NODE:
        getJoinNode().clear();
        return;
      case JcmPackage.AGENT__ROLE:
        getRole().clear();
        return;
      case JcmPackage.AGENT__GROUP:
        getGroup().clear();
        return;
      case JcmPackage.AGENT__GROUP_NODE:
        getGroupNode().clear();
        return;
      case JcmPackage.AGENT__DEBUG:
        getDebug().clear();
        return;
      case JcmPackage.AGENT__VERBOSE:
        getVerbose().clear();
        return;
      case JcmPackage.AGENT__NRCBP:
        getNrcbp().clear();
        return;
      case JcmPackage.AGENT__OTHER:
        getOther().clear();
        return;
      case JcmPackage.AGENT__STRING:
        getString().clear();
        return;
      case JcmPackage.AGENT__VAL:
        getVal().clear();
        return;
      case JcmPackage.AGENT__LITERAL:
        getLiteral().clear();
        return;
      case JcmPackage.AGENT__VAL_REAL:
        getVal_real().clear();
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
      case JcmPackage.AGENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case JcmPackage.AGENT__SOURCE:
        return source != null && !source.isEmpty();
      case JcmPackage.AGENT__INSTANCES:
        return instances != null && !instances.isEmpty();
      case JcmPackage.AGENT__INSTANCES_ATOM:
        return instancesAtom != null && !instancesAtom.isEmpty();
      case JcmPackage.AGENT__NODE:
        return node != null && !node.isEmpty();
      case JcmPackage.AGENT__AG_ARCH:
        return agArch != null && !agArch.isEmpty();
      case JcmPackage.AGENT__AG_CLASS:
        return agClass != null && !agClass.isEmpty();
      case JcmPackage.AGENT__AGBB_CLASS:
        return agbbClass != null && !agbbClass.isEmpty();
      case JcmPackage.AGENT__BELIEFS:
        return beliefs != null && !beliefs.isEmpty();
      case JcmPackage.AGENT__GOALS:
        return goals != null && !goals.isEmpty();
      case JcmPackage.AGENT__FOCUS:
        return focus != null && !focus.isEmpty();
      case JcmPackage.AGENT__FOCUS_NODE:
        return focusNode != null && !focusNode.isEmpty();
      case JcmPackage.AGENT__JOIN:
        return join != null && !join.isEmpty();
      case JcmPackage.AGENT__JOIN_NODE:
        return joinNode != null && !joinNode.isEmpty();
      case JcmPackage.AGENT__ROLE:
        return role != null && !role.isEmpty();
      case JcmPackage.AGENT__GROUP:
        return group != null && !group.isEmpty();
      case JcmPackage.AGENT__GROUP_NODE:
        return groupNode != null && !groupNode.isEmpty();
      case JcmPackage.AGENT__DEBUG:
        return debug != null && !debug.isEmpty();
      case JcmPackage.AGENT__VERBOSE:
        return verbose != null && !verbose.isEmpty();
      case JcmPackage.AGENT__NRCBP:
        return nrcbp != null && !nrcbp.isEmpty();
      case JcmPackage.AGENT__OTHER:
        return other != null && !other.isEmpty();
      case JcmPackage.AGENT__STRING:
        return string != null && !string.isEmpty();
      case JcmPackage.AGENT__VAL:
        return val != null && !val.isEmpty();
      case JcmPackage.AGENT__LITERAL:
        return literal != null && !literal.isEmpty();
      case JcmPackage.AGENT__VAL_REAL:
        return val_real != null && !val_real.isEmpty();
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
    result.append(", instances: ");
    result.append(instances);
    result.append(", instancesAtom: ");
    result.append(instancesAtom);
    result.append(", node: ");
    result.append(node);
    result.append(", focus: ");
    result.append(focus);
    result.append(", focusNode: ");
    result.append(focusNode);
    result.append(", join: ");
    result.append(join);
    result.append(", joinNode: ");
    result.append(joinNode);
    result.append(", role: ");
    result.append(role);
    result.append(", group: ");
    result.append(group);
    result.append(", groupNode: ");
    result.append(groupNode);
    result.append(", verbose: ");
    result.append(verbose);
    result.append(", nrcbp: ");
    result.append(nrcbp);
    result.append(", other: ");
    result.append(other);
    result.append(", string: ");
    result.append(string);
    result.append(", val: ");
    result.append(val);
    result.append(", val_real: ");
    result.append(val_real);
    result.append(')');
    return result.toString();
  }

} //AgentImpl
