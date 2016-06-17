/**
 */
package jacamoide.xtext.jcm.jcm.impl;

import jacamoide.xtext.jcm.jcm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JcmFactoryImpl extends EFactoryImpl implements JcmFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JcmFactory init()
  {
    try
    {
      JcmFactory theJcmFactory = (JcmFactory)EPackage.Registry.INSTANCE.getEFactory(JcmPackage.eNS_URI);
      if (theJcmFactory != null)
      {
        return theJcmFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JcmFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JcmFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JcmPackage.JCM_MODEL: return createJcmModel();
      case JcmPackage.DUSES: return createDUses();
      case JcmPackage.DCLASS_PATH: return createDClassPath();
      case JcmPackage.DASL_PATH: return createDAslPath();
      case JcmPackage.DPLATFORM: return createDPlatform();
      case JcmPackage.DNODE: return createDNode();
      case JcmPackage.AGENT: return createAgent();
      case JcmPackage.WORKSPACE: return createWorkspace();
      case JcmPackage.ARTIFACT: return createArtifact();
      case JcmPackage.ORGANISATION: return createOrganisation();
      case JcmPackage.OFILE_NAME: return createOFileName();
      case JcmPackage.ONODE: return createONode();
      case JcmPackage.OAGENTS: return createOAgents();
      case JcmPackage.OOTHERS: return createOOthers();
      case JcmPackage.GROUP: return createGroup();
      case JcmPackage.SCHEME: return createScheme();
      case JcmPackage.HOST: return createHost();
      case JcmPackage.FILE_NAME: return createFileName();
      case JcmPackage.CLASS_DEF: return createClassDef();
      case JcmPackage.PARAMETER: return createParameter();
      case JcmPackage.LIST_PARAMETERS: return createListParameters();
      case JcmPackage.LITERAL: return createLiteral();
      case JcmPackage.PRED: return createPred();
      case JcmPackage.TERMS: return createTerms();
      case JcmPackage.TERM: return createTerm();
      case JcmPackage.LIST: return createList();
      case JcmPackage.VAR: return createVar();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JcmModel createJcmModel()
  {
    JcmModelImpl jcmModel = new JcmModelImpl();
    return jcmModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DUses createDUses()
  {
    DUsesImpl dUses = new DUsesImpl();
    return dUses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DClassPath createDClassPath()
  {
    DClassPathImpl dClassPath = new DClassPathImpl();
    return dClassPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DAslPath createDAslPath()
  {
    DAslPathImpl dAslPath = new DAslPathImpl();
    return dAslPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DPlatform createDPlatform()
  {
    DPlatformImpl dPlatform = new DPlatformImpl();
    return dPlatform;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DNode createDNode()
  {
    DNodeImpl dNode = new DNodeImpl();
    return dNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agent createAgent()
  {
    AgentImpl agent = new AgentImpl();
    return agent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Workspace createWorkspace()
  {
    WorkspaceImpl workspace = new WorkspaceImpl();
    return workspace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Artifact createArtifact()
  {
    ArtifactImpl artifact = new ArtifactImpl();
    return artifact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Organisation createOrganisation()
  {
    OrganisationImpl organisation = new OrganisationImpl();
    return organisation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OFileName createOFileName()
  {
    OFileNameImpl oFileName = new OFileNameImpl();
    return oFileName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ONode createONode()
  {
    ONodeImpl oNode = new ONodeImpl();
    return oNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OAgents createOAgents()
  {
    OAgentsImpl oAgents = new OAgentsImpl();
    return oAgents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OOthers createOOthers()
  {
    OOthersImpl oOthers = new OOthersImpl();
    return oOthers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Group createGroup()
  {
    GroupImpl group = new GroupImpl();
    return group;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Scheme createScheme()
  {
    SchemeImpl scheme = new SchemeImpl();
    return scheme;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Host createHost()
  {
    HostImpl host = new HostImpl();
    return host;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileName createFileName()
  {
    FileNameImpl fileName = new FileNameImpl();
    return fileName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassDef createClassDef()
  {
    ClassDefImpl classDef = new ClassDefImpl();
    return classDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListParameters createListParameters()
  {
    ListParametersImpl listParameters = new ListParametersImpl();
    return listParameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pred createPred()
  {
    PredImpl pred = new PredImpl();
    return pred;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Terms createTerms()
  {
    TermsImpl terms = new TermsImpl();
    return terms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Term createTerm()
  {
    TermImpl term = new TermImpl();
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List createList()
  {
    ListImpl list = new ListImpl();
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Var createVar()
  {
    VarImpl var = new VarImpl();
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JcmPackage getJcmPackage()
  {
    return (JcmPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JcmPackage getPackage()
  {
    return JcmPackage.eINSTANCE;
  }

} //JcmFactoryImpl
