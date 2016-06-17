/**
 */
package jacamoide.xtext.jcm.jcm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jacamoide.xtext.jcm.jcm.JcmFactory
 * @model kind="package"
 * @generated
 */
public interface JcmPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "jcm";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.jacamoide/jcm/Jcm";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "jcm";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  JcmPackage eINSTANCE = jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl.init();

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.JcmModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.JcmModelImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getJcmModel()
   * @generated
   */
  int JCM_MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JCM_MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Uses</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JCM_MODEL__USES = 1;

  /**
   * The feature id for the '<em><b>Agent</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JCM_MODEL__AGENT = 2;

  /**
   * The feature id for the '<em><b>Workspace</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JCM_MODEL__WORKSPACE = 3;

  /**
   * The feature id for the '<em><b>Organisation</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JCM_MODEL__ORGANISATION = 4;

  /**
   * The feature id for the '<em><b>Dclass Path</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JCM_MODEL__DCLASS_PATH = 5;

  /**
   * The feature id for the '<em><b>DAsl Path</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JCM_MODEL__DASL_PATH = 6;

  /**
   * The feature id for the '<em><b>DPlatform</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JCM_MODEL__DPLATFORM = 7;

  /**
   * The feature id for the '<em><b>DNode</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JCM_MODEL__DNODE = 8;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JCM_MODEL_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.DUsesImpl <em>DUses</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.DUsesImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getDUses()
   * @generated
   */
  int DUSES = 1;

  /**
   * The feature id for the '<em><b>File Name</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUSES__FILE_NAME = 0;

  /**
   * The number of structural features of the '<em>DUses</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DUSES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.DClassPathImpl <em>DClass Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.DClassPathImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getDClassPath()
   * @generated
   */
  int DCLASS_PATH = 2;

  /**
   * The feature id for the '<em><b>Class Path</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCLASS_PATH__CLASS_PATH = 0;

  /**
   * The number of structural features of the '<em>DClass Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DCLASS_PATH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.DAslPathImpl <em>DAsl Path</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.DAslPathImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getDAslPath()
   * @generated
   */
  int DASL_PATH = 3;

  /**
   * The feature id for the '<em><b>Asl Path</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DASL_PATH__ASL_PATH = 0;

  /**
   * The number of structural features of the '<em>DAsl Path</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DASL_PATH_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.DPlatformImpl <em>DPlatform</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.DPlatformImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getDPlatform()
   * @generated
   */
  int DPLATFORM = 4;

  /**
   * The feature id for the '<em><b>Platform</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DPLATFORM__PLATFORM = 0;

  /**
   * The number of structural features of the '<em>DPlatform</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DPLATFORM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.DNodeImpl <em>DNode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.DNodeImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getDNode()
   * @generated
   */
  int DNODE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DNODE__NAME = 0;

  /**
   * The feature id for the '<em><b>Host</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DNODE__HOST = 1;

  /**
   * The number of structural features of the '<em>DNode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DNODE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl <em>Agent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.AgentImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getAgent()
   * @generated
   */
  int AGENT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Source</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__SOURCE = 1;

  /**
   * The feature id for the '<em><b>Instances</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__INSTANCES = 2;

  /**
   * The feature id for the '<em><b>Instances Atom</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__INSTANCES_ATOM = 3;

  /**
   * The feature id for the '<em><b>Node</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__NODE = 4;

  /**
   * The feature id for the '<em><b>Ag Arch</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__AG_ARCH = 5;

  /**
   * The feature id for the '<em><b>Ag Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__AG_CLASS = 6;

  /**
   * The feature id for the '<em><b>Agbb Class</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__AGBB_CLASS = 7;

  /**
   * The feature id for the '<em><b>Beliefs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__BELIEFS = 8;

  /**
   * The feature id for the '<em><b>Goals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__GOALS = 9;

  /**
   * The feature id for the '<em><b>Focus</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__FOCUS = 10;

  /**
   * The feature id for the '<em><b>Focus Node</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__FOCUS_NODE = 11;

  /**
   * The feature id for the '<em><b>Join</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__JOIN = 12;

  /**
   * The feature id for the '<em><b>Join Node</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__JOIN_NODE = 13;

  /**
   * The feature id for the '<em><b>Role</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__ROLE = 14;

  /**
   * The feature id for the '<em><b>Group</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__GROUP = 15;

  /**
   * The feature id for the '<em><b>Group Node</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__GROUP_NODE = 16;

  /**
   * The feature id for the '<em><b>Debug</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__DEBUG = 17;

  /**
   * The feature id for the '<em><b>Verbose</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__VERBOSE = 18;

  /**
   * The feature id for the '<em><b>Nrcbp</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__NRCBP = 19;

  /**
   * The feature id for the '<em><b>Other</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__OTHER = 20;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__STRING = 21;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__VAL = 22;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__LITERAL = 23;

  /**
   * The feature id for the '<em><b>Val real</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__VAL_REAL = 24;

  /**
   * The number of structural features of the '<em>Agent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_FEATURE_COUNT = 25;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.WorkspaceImpl <em>Workspace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.WorkspaceImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getWorkspace()
   * @generated
   */
  int WORKSPACE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE__NAME = 0;

  /**
   * The feature id for the '<em><b>Artifact</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE__ARTIFACT = 1;

  /**
   * The feature id for the '<em><b>Agent</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE__AGENT = 2;

  /**
   * The feature id for the '<em><b>Node</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE__NODE = 3;

  /**
   * The number of structural features of the '<em>Workspace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WORKSPACE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.ArtifactImpl <em>Artifact</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.ArtifactImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getArtifact()
   * @generated
   */
  int ARTIFACT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__NAME = 0;

  /**
   * The feature id for the '<em><b>Class Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__CLASS_DEF = 1;

  /**
   * The feature id for the '<em><b>Agent</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT__AGENT = 2;

  /**
   * The number of structural features of the '<em>Artifact</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.OrganisationImpl <em>Organisation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.OrganisationImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getOrganisation()
   * @generated
   */
  int ORGANISATION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANISATION__NAME = 0;

  /**
   * The feature id for the '<em><b>File Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANISATION__FILE_NAME = 1;

  /**
   * The feature id for the '<em><b>Group</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANISATION__GROUP = 2;

  /**
   * The feature id for the '<em><b>Scheme</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANISATION__SCHEME = 3;

  /**
   * The feature id for the '<em><b>Agents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANISATION__AGENTS = 4;

  /**
   * The feature id for the '<em><b>Node</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANISATION__NODE = 5;

  /**
   * The feature id for the '<em><b>Other</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANISATION__OTHER = 6;

  /**
   * The number of structural features of the '<em>Organisation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANISATION_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.OFileNameImpl <em>OFile Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.OFileNameImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getOFileName()
   * @generated
   */
  int OFILE_NAME = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OFILE_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>OFile Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OFILE_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.ONodeImpl <em>ONode</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.ONodeImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getONode()
   * @generated
   */
  int ONODE = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONODE__NAME = 0;

  /**
   * The number of structural features of the '<em>ONode</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONODE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.OAgentsImpl <em>OAgents</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.OAgentsImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getOAgents()
   * @generated
   */
  int OAGENTS = 12;

  /**
   * The feature id for the '<em><b>Agent</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OAGENTS__AGENT = 0;

  /**
   * The number of structural features of the '<em>OAgents</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OAGENTS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.OOthersImpl <em>OOthers</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.OOthersImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getOOthers()
   * @generated
   */
  int OOTHERS = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OOTHERS__NAME = 0;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OOTHERS__STRING = 1;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OOTHERS__VAL = 2;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OOTHERS__LITERAL = 3;

  /**
   * The feature id for the '<em><b>Val real</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OOTHERS__VAL_REAL = 4;

  /**
   * The number of structural features of the '<em>OOthers</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OOTHERS_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.GroupImpl <em>Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.GroupImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getGroup()
   * @generated
   */
  int GROUP = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__NAME = 0;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__KIND = 1;

  /**
   * The feature id for the '<em><b>Group</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__GROUP = 2;

  /**
   * The feature id for the '<em><b>Responsible For</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__RESPONSIBLE_FOR = 3;

  /**
   * The feature id for the '<em><b>Owner</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__OWNER = 4;

  /**
   * The feature id for the '<em><b>Other</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__OTHER = 5;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__STRING = 6;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__VAL = 7;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__LITERAL = 8;

  /**
   * The feature id for the '<em><b>Val real</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__VAL_REAL = 9;

  /**
   * The feature id for the '<em><b>Agent</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__AGENT = 10;

  /**
   * The feature id for the '<em><b>Role</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP__ROLE = 11;

  /**
   * The number of structural features of the '<em>Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUP_FEATURE_COUNT = 12;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.SchemeImpl <em>Scheme</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.SchemeImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getScheme()
   * @generated
   */
  int SCHEME = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME__NAME = 0;

  /**
   * The feature id for the '<em><b>Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME__KIND = 1;

  /**
   * The feature id for the '<em><b>Owner</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME__OWNER = 2;

  /**
   * The feature id for the '<em><b>Other</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME__OTHER = 3;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME__STRING = 4;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME__VAL = 5;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME__LITERAL = 6;

  /**
   * The feature id for the '<em><b>Val real</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME__VAL_REAL = 7;

  /**
   * The number of structural features of the '<em>Scheme</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEME_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.HostImpl <em>Host</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.HostImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getHost()
   * @generated
   */
  int HOST = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOST__NAME = 0;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOST__STRING = 1;

  /**
   * The feature id for the '<em><b>Ip</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOST__IP = 2;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOST__VAL = 3;

  /**
   * The number of structural features of the '<em>Host</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOST_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.FileNameImpl <em>File Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.FileNameImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getFileName()
   * @generated
   */
  int FILE_NAME = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_NAME__NAME = 0;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_NAME__STRING = 1;

  /**
   * The number of structural features of the '<em>File Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILE_NAME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.ClassDefImpl <em>Class Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.ClassDefImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getClassDef()
   * @generated
   */
  int CLASS_DEF = 18;

  /**
   * The feature id for the '<em><b>Infrastructure</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DEF__INFRASTRUCTURE = 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DEF__PARAMETER = 1;

  /**
   * The number of structural features of the '<em>Class Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DEF_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.ParameterImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 19;

  /**
   * The feature id for the '<em><b>Class Def</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__CLASS_DEF = 0;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__VAL = 1;

  /**
   * The feature id for the '<em><b>Val real</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__VAL_REAL = 2;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__STRING = 3;

  /**
   * The feature id for the '<em><b>List Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__LIST_PARAMETERS = 4;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.ListParametersImpl <em>List Parameters</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.ListParametersImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getListParameters()
   * @generated
   */
  int LIST_PARAMETERS = 20;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PARAMETERS__PARAMETER = 0;

  /**
   * The number of structural features of the '<em>List Parameters</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_PARAMETERS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.LiteralImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 21;

  /**
   * The feature id for the '<em><b>Pred</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__PRED = 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__VAR = 1;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.PredImpl <em>Pred</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.PredImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getPred()
   * @generated
   */
  int PRED = 22;

  /**
   * The feature id for the '<em><b>Atom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED__ATOM = 0;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED__TERMS = 1;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED__LIST = 2;

  /**
   * The number of structural features of the '<em>Pred</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRED_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.TermsImpl <em>Terms</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.TermsImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getTerms()
   * @generated
   */
  int TERMS = 23;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS__TERM = 0;

  /**
   * The number of structural features of the '<em>Terms</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERMS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.TermImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getTerm()
   * @generated
   */
  int TERM = 24;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__LIST = 0;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__LITERAL = 1;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__STRING = 2;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__VAL = 3;

  /**
   * The feature id for the '<em><b>Val real</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__VAL_REAL = 4;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.ListImpl <em>List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.ListImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getList()
   * @generated
   */
  int LIST = 25;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__TERM = 0;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__VAR = 1;

  /**
   * The feature id for the '<em><b>Unnamedvar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__UNNAMEDVAR = 2;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST__LIST = 3;

  /**
   * The number of structural features of the '<em>List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link jacamoide.xtext.jcm.jcm.impl.VarImpl <em>Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jacamoide.xtext.jcm.jcm.impl.VarImpl
   * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getVar()
   * @generated
   */
  int VAR = 26;

  /**
   * The feature id for the '<em><b>Var</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__VAR = 0;

  /**
   * The feature id for the '<em><b>Unnamedvar</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__UNNAMEDVAR = 1;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR__LIST = 2;

  /**
   * The number of structural features of the '<em>Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VAR_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.JcmModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see jacamoide.xtext.jcm.jcm.JcmModel
   * @generated
   */
  EClass getJcmModel();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.JcmModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jacamoide.xtext.jcm.jcm.JcmModel#getName()
   * @see #getJcmModel()
   * @generated
   */
  EAttribute getJcmModel_Name();

  /**
   * Returns the meta object for the containment reference '{@link jacamoide.xtext.jcm.jcm.JcmModel#getUses <em>Uses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uses</em>'.
   * @see jacamoide.xtext.jcm.jcm.JcmModel#getUses()
   * @see #getJcmModel()
   * @generated
   */
  EReference getJcmModel_Uses();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.JcmModel#getAgent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Agent</em>'.
   * @see jacamoide.xtext.jcm.jcm.JcmModel#getAgent()
   * @see #getJcmModel()
   * @generated
   */
  EReference getJcmModel_Agent();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.JcmModel#getWorkspace <em>Workspace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Workspace</em>'.
   * @see jacamoide.xtext.jcm.jcm.JcmModel#getWorkspace()
   * @see #getJcmModel()
   * @generated
   */
  EReference getJcmModel_Workspace();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.JcmModel#getOrganisation <em>Organisation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Organisation</em>'.
   * @see jacamoide.xtext.jcm.jcm.JcmModel#getOrganisation()
   * @see #getJcmModel()
   * @generated
   */
  EReference getJcmModel_Organisation();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.JcmModel#getDclassPath <em>Dclass Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dclass Path</em>'.
   * @see jacamoide.xtext.jcm.jcm.JcmModel#getDclassPath()
   * @see #getJcmModel()
   * @generated
   */
  EReference getJcmModel_DclassPath();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.JcmModel#getDAslPath <em>DAsl Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>DAsl Path</em>'.
   * @see jacamoide.xtext.jcm.jcm.JcmModel#getDAslPath()
   * @see #getJcmModel()
   * @generated
   */
  EReference getJcmModel_DAslPath();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.JcmModel#getDPlatform <em>DPlatform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>DPlatform</em>'.
   * @see jacamoide.xtext.jcm.jcm.JcmModel#getDPlatform()
   * @see #getJcmModel()
   * @generated
   */
  EReference getJcmModel_DPlatform();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.JcmModel#getDNode <em>DNode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>DNode</em>'.
   * @see jacamoide.xtext.jcm.jcm.JcmModel#getDNode()
   * @see #getJcmModel()
   * @generated
   */
  EReference getJcmModel_DNode();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.DUses <em>DUses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DUses</em>'.
   * @see jacamoide.xtext.jcm.jcm.DUses
   * @generated
   */
  EClass getDUses();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.DUses#getFileName <em>File Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>File Name</em>'.
   * @see jacamoide.xtext.jcm.jcm.DUses#getFileName()
   * @see #getDUses()
   * @generated
   */
  EReference getDUses_FileName();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.DClassPath <em>DClass Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DClass Path</em>'.
   * @see jacamoide.xtext.jcm.jcm.DClassPath
   * @generated
   */
  EClass getDClassPath();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.DClassPath#getClassPath <em>Class Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Class Path</em>'.
   * @see jacamoide.xtext.jcm.jcm.DClassPath#getClassPath()
   * @see #getDClassPath()
   * @generated
   */
  EReference getDClassPath_ClassPath();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.DAslPath <em>DAsl Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DAsl Path</em>'.
   * @see jacamoide.xtext.jcm.jcm.DAslPath
   * @generated
   */
  EClass getDAslPath();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.DAslPath#getAslPath <em>Asl Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Asl Path</em>'.
   * @see jacamoide.xtext.jcm.jcm.DAslPath#getAslPath()
   * @see #getDAslPath()
   * @generated
   */
  EReference getDAslPath_AslPath();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.DPlatform <em>DPlatform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DPlatform</em>'.
   * @see jacamoide.xtext.jcm.jcm.DPlatform
   * @generated
   */
  EClass getDPlatform();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.DPlatform#getPlatform <em>Platform</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Platform</em>'.
   * @see jacamoide.xtext.jcm.jcm.DPlatform#getPlatform()
   * @see #getDPlatform()
   * @generated
   */
  EReference getDPlatform_Platform();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.DNode <em>DNode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>DNode</em>'.
   * @see jacamoide.xtext.jcm.jcm.DNode
   * @generated
   */
  EClass getDNode();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.DNode#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jacamoide.xtext.jcm.jcm.DNode#getName()
   * @see #getDNode()
   * @generated
   */
  EAttribute getDNode_Name();

  /**
   * Returns the meta object for the containment reference '{@link jacamoide.xtext.jcm.jcm.DNode#getHost <em>Host</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Host</em>'.
   * @see jacamoide.xtext.jcm.jcm.DNode#getHost()
   * @see #getDNode()
   * @generated
   */
  EReference getDNode_Host();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.Agent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Agent</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent
   * @generated
   */
  EClass getAgent();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.Agent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getName()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.Agent#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Source</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getSource()
   * @see #getAgent()
   * @generated
   */
  EReference getAgent_Source();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Agent#getInstances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Instances</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getInstances()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_Instances();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Agent#getInstancesAtom <em>Instances Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Instances Atom</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getInstancesAtom()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_InstancesAtom();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Agent#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Node</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getNode()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_Node();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.Agent#getAgArch <em>Ag Arch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ag Arch</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getAgArch()
   * @see #getAgent()
   * @generated
   */
  EReference getAgent_AgArch();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.Agent#getAgClass <em>Ag Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ag Class</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getAgClass()
   * @see #getAgent()
   * @generated
   */
  EReference getAgent_AgClass();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.Agent#getAgbbClass <em>Agbb Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Agbb Class</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getAgbbClass()
   * @see #getAgent()
   * @generated
   */
  EReference getAgent_AgbbClass();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.Agent#getBeliefs <em>Beliefs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Beliefs</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getBeliefs()
   * @see #getAgent()
   * @generated
   */
  EReference getAgent_Beliefs();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.Agent#getGoals <em>Goals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Goals</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getGoals()
   * @see #getAgent()
   * @generated
   */
  EReference getAgent_Goals();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Agent#getFocus <em>Focus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Focus</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getFocus()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_Focus();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Agent#getFocusNode <em>Focus Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Focus Node</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getFocusNode()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_FocusNode();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Agent#getJoin <em>Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Join</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getJoin()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_Join();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Agent#getJoinNode <em>Join Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Join Node</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getJoinNode()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_JoinNode();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Agent#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Role</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getRole()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_Role();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Agent#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getGroup()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_Group();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Agent#getGroupNode <em>Group Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Group Node</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getGroupNode()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_GroupNode();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.Agent#getDebug <em>Debug</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Debug</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getDebug()
   * @see #getAgent()
   * @generated
   */
  EReference getAgent_Debug();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Agent#getVerbose <em>Verbose</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Verbose</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getVerbose()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_Verbose();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Agent#getNrcbp <em>Nrcbp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Nrcbp</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getNrcbp()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_Nrcbp();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Agent#getOther <em>Other</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Other</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getOther()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_Other();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Agent#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>String</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getString()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_String();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Agent#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Val</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getVal()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_Val();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.Agent#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literal</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getLiteral()
   * @see #getAgent()
   * @generated
   */
  EReference getAgent_Literal();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Agent#getVal_real <em>Val real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Val real</em>'.
   * @see jacamoide.xtext.jcm.jcm.Agent#getVal_real()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_Val_real();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.Workspace <em>Workspace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Workspace</em>'.
   * @see jacamoide.xtext.jcm.jcm.Workspace
   * @generated
   */
  EClass getWorkspace();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.Workspace#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jacamoide.xtext.jcm.jcm.Workspace#getName()
   * @see #getWorkspace()
   * @generated
   */
  EAttribute getWorkspace_Name();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.Workspace#getArtifact <em>Artifact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Artifact</em>'.
   * @see jacamoide.xtext.jcm.jcm.Workspace#getArtifact()
   * @see #getWorkspace()
   * @generated
   */
  EReference getWorkspace_Artifact();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Workspace#getAgent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Agent</em>'.
   * @see jacamoide.xtext.jcm.jcm.Workspace#getAgent()
   * @see #getWorkspace()
   * @generated
   */
  EAttribute getWorkspace_Agent();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.Workspace#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Node</em>'.
   * @see jacamoide.xtext.jcm.jcm.Workspace#getNode()
   * @see #getWorkspace()
   * @generated
   */
  EReference getWorkspace_Node();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.Artifact <em>Artifact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artifact</em>'.
   * @see jacamoide.xtext.jcm.jcm.Artifact
   * @generated
   */
  EClass getArtifact();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.Artifact#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jacamoide.xtext.jcm.jcm.Artifact#getName()
   * @see #getArtifact()
   * @generated
   */
  EAttribute getArtifact_Name();

  /**
   * Returns the meta object for the containment reference '{@link jacamoide.xtext.jcm.jcm.Artifact#getClassDef <em>Class Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Def</em>'.
   * @see jacamoide.xtext.jcm.jcm.Artifact#getClassDef()
   * @see #getArtifact()
   * @generated
   */
  EReference getArtifact_ClassDef();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Artifact#getAgent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Agent</em>'.
   * @see jacamoide.xtext.jcm.jcm.Artifact#getAgent()
   * @see #getArtifact()
   * @generated
   */
  EAttribute getArtifact_Agent();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.Organisation <em>Organisation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Organisation</em>'.
   * @see jacamoide.xtext.jcm.jcm.Organisation
   * @generated
   */
  EClass getOrganisation();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.Organisation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jacamoide.xtext.jcm.jcm.Organisation#getName()
   * @see #getOrganisation()
   * @generated
   */
  EAttribute getOrganisation_Name();

  /**
   * Returns the meta object for the containment reference '{@link jacamoide.xtext.jcm.jcm.Organisation#getFileName <em>File Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>File Name</em>'.
   * @see jacamoide.xtext.jcm.jcm.Organisation#getFileName()
   * @see #getOrganisation()
   * @generated
   */
  EReference getOrganisation_FileName();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.Organisation#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group</em>'.
   * @see jacamoide.xtext.jcm.jcm.Organisation#getGroup()
   * @see #getOrganisation()
   * @generated
   */
  EReference getOrganisation_Group();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.Organisation#getScheme <em>Scheme</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scheme</em>'.
   * @see jacamoide.xtext.jcm.jcm.Organisation#getScheme()
   * @see #getOrganisation()
   * @generated
   */
  EReference getOrganisation_Scheme();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.Organisation#getAgents <em>Agents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Agents</em>'.
   * @see jacamoide.xtext.jcm.jcm.Organisation#getAgents()
   * @see #getOrganisation()
   * @generated
   */
  EReference getOrganisation_Agents();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.Organisation#getNode <em>Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Node</em>'.
   * @see jacamoide.xtext.jcm.jcm.Organisation#getNode()
   * @see #getOrganisation()
   * @generated
   */
  EReference getOrganisation_Node();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.Organisation#getOther <em>Other</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Other</em>'.
   * @see jacamoide.xtext.jcm.jcm.Organisation#getOther()
   * @see #getOrganisation()
   * @generated
   */
  EReference getOrganisation_Other();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.OFileName <em>OFile Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OFile Name</em>'.
   * @see jacamoide.xtext.jcm.jcm.OFileName
   * @generated
   */
  EClass getOFileName();

  /**
   * Returns the meta object for the containment reference '{@link jacamoide.xtext.jcm.jcm.OFileName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see jacamoide.xtext.jcm.jcm.OFileName#getName()
   * @see #getOFileName()
   * @generated
   */
  EReference getOFileName_Name();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.ONode <em>ONode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ONode</em>'.
   * @see jacamoide.xtext.jcm.jcm.ONode
   * @generated
   */
  EClass getONode();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.ONode#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jacamoide.xtext.jcm.jcm.ONode#getName()
   * @see #getONode()
   * @generated
   */
  EAttribute getONode_Name();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.OAgents <em>OAgents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OAgents</em>'.
   * @see jacamoide.xtext.jcm.jcm.OAgents
   * @generated
   */
  EClass getOAgents();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.OAgents#getAgent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Agent</em>'.
   * @see jacamoide.xtext.jcm.jcm.OAgents#getAgent()
   * @see #getOAgents()
   * @generated
   */
  EAttribute getOAgents_Agent();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.OOthers <em>OOthers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>OOthers</em>'.
   * @see jacamoide.xtext.jcm.jcm.OOthers
   * @generated
   */
  EClass getOOthers();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.OOthers#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jacamoide.xtext.jcm.jcm.OOthers#getName()
   * @see #getOOthers()
   * @generated
   */
  EAttribute getOOthers_Name();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.OOthers#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>String</em>'.
   * @see jacamoide.xtext.jcm.jcm.OOthers#getString()
   * @see #getOOthers()
   * @generated
   */
  EAttribute getOOthers_String();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.OOthers#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Val</em>'.
   * @see jacamoide.xtext.jcm.jcm.OOthers#getVal()
   * @see #getOOthers()
   * @generated
   */
  EAttribute getOOthers_Val();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.OOthers#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literal</em>'.
   * @see jacamoide.xtext.jcm.jcm.OOthers#getLiteral()
   * @see #getOOthers()
   * @generated
   */
  EReference getOOthers_Literal();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.OOthers#getVal_real <em>Val real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Val real</em>'.
   * @see jacamoide.xtext.jcm.jcm.OOthers#getVal_real()
   * @see #getOOthers()
   * @generated
   */
  EAttribute getOOthers_Val_real();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.Group <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Group</em>'.
   * @see jacamoide.xtext.jcm.jcm.Group
   * @generated
   */
  EClass getGroup();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.Group#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jacamoide.xtext.jcm.jcm.Group#getName()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_Name();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.Group#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see jacamoide.xtext.jcm.jcm.Group#getKind()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_Kind();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.Group#getGroup <em>Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Group</em>'.
   * @see jacamoide.xtext.jcm.jcm.Group#getGroup()
   * @see #getGroup()
   * @generated
   */
  EReference getGroup_Group();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Group#getResponsibleFor <em>Responsible For</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Responsible For</em>'.
   * @see jacamoide.xtext.jcm.jcm.Group#getResponsibleFor()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_ResponsibleFor();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Group#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Owner</em>'.
   * @see jacamoide.xtext.jcm.jcm.Group#getOwner()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_Owner();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Group#getOther <em>Other</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Other</em>'.
   * @see jacamoide.xtext.jcm.jcm.Group#getOther()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_Other();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Group#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>String</em>'.
   * @see jacamoide.xtext.jcm.jcm.Group#getString()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_String();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Group#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Val</em>'.
   * @see jacamoide.xtext.jcm.jcm.Group#getVal()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_Val();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.Group#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literal</em>'.
   * @see jacamoide.xtext.jcm.jcm.Group#getLiteral()
   * @see #getGroup()
   * @generated
   */
  EReference getGroup_Literal();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Group#getVal_real <em>Val real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Val real</em>'.
   * @see jacamoide.xtext.jcm.jcm.Group#getVal_real()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_Val_real();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Group#getAgent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Agent</em>'.
   * @see jacamoide.xtext.jcm.jcm.Group#getAgent()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_Agent();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Group#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Role</em>'.
   * @see jacamoide.xtext.jcm.jcm.Group#getRole()
   * @see #getGroup()
   * @generated
   */
  EAttribute getGroup_Role();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.Scheme <em>Scheme</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scheme</em>'.
   * @see jacamoide.xtext.jcm.jcm.Scheme
   * @generated
   */
  EClass getScheme();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.Scheme#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jacamoide.xtext.jcm.jcm.Scheme#getName()
   * @see #getScheme()
   * @generated
   */
  EAttribute getScheme_Name();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.Scheme#getKind <em>Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Kind</em>'.
   * @see jacamoide.xtext.jcm.jcm.Scheme#getKind()
   * @see #getScheme()
   * @generated
   */
  EAttribute getScheme_Kind();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Scheme#getOwner <em>Owner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Owner</em>'.
   * @see jacamoide.xtext.jcm.jcm.Scheme#getOwner()
   * @see #getScheme()
   * @generated
   */
  EAttribute getScheme_Owner();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Scheme#getOther <em>Other</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Other</em>'.
   * @see jacamoide.xtext.jcm.jcm.Scheme#getOther()
   * @see #getScheme()
   * @generated
   */
  EAttribute getScheme_Other();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Scheme#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>String</em>'.
   * @see jacamoide.xtext.jcm.jcm.Scheme#getString()
   * @see #getScheme()
   * @generated
   */
  EAttribute getScheme_String();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Scheme#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Val</em>'.
   * @see jacamoide.xtext.jcm.jcm.Scheme#getVal()
   * @see #getScheme()
   * @generated
   */
  EAttribute getScheme_Val();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.Scheme#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literal</em>'.
   * @see jacamoide.xtext.jcm.jcm.Scheme#getLiteral()
   * @see #getScheme()
   * @generated
   */
  EReference getScheme_Literal();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Scheme#getVal_real <em>Val real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Val real</em>'.
   * @see jacamoide.xtext.jcm.jcm.Scheme#getVal_real()
   * @see #getScheme()
   * @generated
   */
  EAttribute getScheme_Val_real();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.Host <em>Host</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Host</em>'.
   * @see jacamoide.xtext.jcm.jcm.Host
   * @generated
   */
  EClass getHost();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.Host#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jacamoide.xtext.jcm.jcm.Host#getName()
   * @see #getHost()
   * @generated
   */
  EAttribute getHost_Name();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.Host#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see jacamoide.xtext.jcm.jcm.Host#getString()
   * @see #getHost()
   * @generated
   */
  EAttribute getHost_String();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.Host#getIp <em>Ip</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ip</em>'.
   * @see jacamoide.xtext.jcm.jcm.Host#getIp()
   * @see #getHost()
   * @generated
   */
  EAttribute getHost_Ip();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.Host#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see jacamoide.xtext.jcm.jcm.Host#getVal()
   * @see #getHost()
   * @generated
   */
  EAttribute getHost_Val();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.FileName <em>File Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>File Name</em>'.
   * @see jacamoide.xtext.jcm.jcm.FileName
   * @generated
   */
  EClass getFileName();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.FileName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see jacamoide.xtext.jcm.jcm.FileName#getName()
   * @see #getFileName()
   * @generated
   */
  EAttribute getFileName_Name();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.FileName#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see jacamoide.xtext.jcm.jcm.FileName#getString()
   * @see #getFileName()
   * @generated
   */
  EAttribute getFileName_String();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.ClassDef <em>Class Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class Def</em>'.
   * @see jacamoide.xtext.jcm.jcm.ClassDef
   * @generated
   */
  EClass getClassDef();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.ClassDef#getInfrastructure <em>Infrastructure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Infrastructure</em>'.
   * @see jacamoide.xtext.jcm.jcm.ClassDef#getInfrastructure()
   * @see #getClassDef()
   * @generated
   */
  EAttribute getClassDef_Infrastructure();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.ClassDef#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter</em>'.
   * @see jacamoide.xtext.jcm.jcm.ClassDef#getParameter()
   * @see #getClassDef()
   * @generated
   */
  EReference getClassDef_Parameter();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see jacamoide.xtext.jcm.jcm.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link jacamoide.xtext.jcm.jcm.Parameter#getClassDef <em>Class Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Def</em>'.
   * @see jacamoide.xtext.jcm.jcm.Parameter#getClassDef()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_ClassDef();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.Parameter#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see jacamoide.xtext.jcm.jcm.Parameter#getVal()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Val();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Parameter#getVal_real <em>Val real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Val real</em>'.
   * @see jacamoide.xtext.jcm.jcm.Parameter#getVal_real()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Val_real();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.Parameter#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see jacamoide.xtext.jcm.jcm.Parameter#getString()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_String();

  /**
   * Returns the meta object for the containment reference '{@link jacamoide.xtext.jcm.jcm.Parameter#getListParameters <em>List Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List Parameters</em>'.
   * @see jacamoide.xtext.jcm.jcm.Parameter#getListParameters()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_ListParameters();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.ListParameters <em>List Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Parameters</em>'.
   * @see jacamoide.xtext.jcm.jcm.ListParameters
   * @generated
   */
  EClass getListParameters();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.ListParameters#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter</em>'.
   * @see jacamoide.xtext.jcm.jcm.ListParameters#getParameter()
   * @see #getListParameters()
   * @generated
   */
  EReference getListParameters_Parameter();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see jacamoide.xtext.jcm.jcm.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the containment reference '{@link jacamoide.xtext.jcm.jcm.Literal#getPred <em>Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pred</em>'.
   * @see jacamoide.xtext.jcm.jcm.Literal#getPred()
   * @see #getLiteral()
   * @generated
   */
  EReference getLiteral_Pred();

  /**
   * Returns the meta object for the containment reference '{@link jacamoide.xtext.jcm.jcm.Literal#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Var</em>'.
   * @see jacamoide.xtext.jcm.jcm.Literal#getVar()
   * @see #getLiteral()
   * @generated
   */
  EReference getLiteral_Var();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.Pred <em>Pred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pred</em>'.
   * @see jacamoide.xtext.jcm.jcm.Pred
   * @generated
   */
  EClass getPred();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.Pred#getAtom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Atom</em>'.
   * @see jacamoide.xtext.jcm.jcm.Pred#getAtom()
   * @see #getPred()
   * @generated
   */
  EAttribute getPred_Atom();

  /**
   * Returns the meta object for the containment reference '{@link jacamoide.xtext.jcm.jcm.Pred#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Terms</em>'.
   * @see jacamoide.xtext.jcm.jcm.Pred#getTerms()
   * @see #getPred()
   * @generated
   */
  EReference getPred_Terms();

  /**
   * Returns the meta object for the containment reference '{@link jacamoide.xtext.jcm.jcm.Pred#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see jacamoide.xtext.jcm.jcm.Pred#getList()
   * @see #getPred()
   * @generated
   */
  EReference getPred_List();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.Terms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Terms</em>'.
   * @see jacamoide.xtext.jcm.jcm.Terms
   * @generated
   */
  EClass getTerms();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.Terms#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Term</em>'.
   * @see jacamoide.xtext.jcm.jcm.Terms#getTerm()
   * @see #getTerms()
   * @generated
   */
  EReference getTerms_Term();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see jacamoide.xtext.jcm.jcm.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for the containment reference '{@link jacamoide.xtext.jcm.jcm.Term#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see jacamoide.xtext.jcm.jcm.Term#getList()
   * @see #getTerm()
   * @generated
   */
  EReference getTerm_List();

  /**
   * Returns the meta object for the containment reference '{@link jacamoide.xtext.jcm.jcm.Term#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal</em>'.
   * @see jacamoide.xtext.jcm.jcm.Term#getLiteral()
   * @see #getTerm()
   * @generated
   */
  EReference getTerm_Literal();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.Term#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see jacamoide.xtext.jcm.jcm.Term#getString()
   * @see #getTerm()
   * @generated
   */
  EAttribute getTerm_String();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.Term#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see jacamoide.xtext.jcm.jcm.Term#getVal()
   * @see #getTerm()
   * @generated
   */
  EAttribute getTerm_Val();

  /**
   * Returns the meta object for the attribute list '{@link jacamoide.xtext.jcm.jcm.Term#getVal_real <em>Val real</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Val real</em>'.
   * @see jacamoide.xtext.jcm.jcm.Term#getVal_real()
   * @see #getTerm()
   * @generated
   */
  EAttribute getTerm_Val_real();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.List <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List</em>'.
   * @see jacamoide.xtext.jcm.jcm.List
   * @generated
   */
  EClass getList();

  /**
   * Returns the meta object for the containment reference list '{@link jacamoide.xtext.jcm.jcm.List#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Term</em>'.
   * @see jacamoide.xtext.jcm.jcm.List#getTerm()
   * @see #getList()
   * @generated
   */
  EReference getList_Term();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.List#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see jacamoide.xtext.jcm.jcm.List#getVar()
   * @see #getList()
   * @generated
   */
  EAttribute getList_Var();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.List#getUnnamedvar <em>Unnamedvar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unnamedvar</em>'.
   * @see jacamoide.xtext.jcm.jcm.List#getUnnamedvar()
   * @see #getList()
   * @generated
   */
  EAttribute getList_Unnamedvar();

  /**
   * Returns the meta object for the containment reference '{@link jacamoide.xtext.jcm.jcm.List#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see jacamoide.xtext.jcm.jcm.List#getList()
   * @see #getList()
   * @generated
   */
  EReference getList_List();

  /**
   * Returns the meta object for class '{@link jacamoide.xtext.jcm.jcm.Var <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Var</em>'.
   * @see jacamoide.xtext.jcm.jcm.Var
   * @generated
   */
  EClass getVar();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.Var#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Var</em>'.
   * @see jacamoide.xtext.jcm.jcm.Var#getVar()
   * @see #getVar()
   * @generated
   */
  EAttribute getVar_Var();

  /**
   * Returns the meta object for the attribute '{@link jacamoide.xtext.jcm.jcm.Var#getUnnamedvar <em>Unnamedvar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unnamedvar</em>'.
   * @see jacamoide.xtext.jcm.jcm.Var#getUnnamedvar()
   * @see #getVar()
   * @generated
   */
  EAttribute getVar_Unnamedvar();

  /**
   * Returns the meta object for the containment reference '{@link jacamoide.xtext.jcm.jcm.Var#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see jacamoide.xtext.jcm.jcm.Var#getList()
   * @see #getVar()
   * @generated
   */
  EReference getVar_List();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  JcmFactory getJcmFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.JcmModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.JcmModelImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getJcmModel()
     * @generated
     */
    EClass JCM_MODEL = eINSTANCE.getJcmModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute JCM_MODEL__NAME = eINSTANCE.getJcmModel_Name();

    /**
     * The meta object literal for the '<em><b>Uses</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JCM_MODEL__USES = eINSTANCE.getJcmModel_Uses();

    /**
     * The meta object literal for the '<em><b>Agent</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JCM_MODEL__AGENT = eINSTANCE.getJcmModel_Agent();

    /**
     * The meta object literal for the '<em><b>Workspace</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JCM_MODEL__WORKSPACE = eINSTANCE.getJcmModel_Workspace();

    /**
     * The meta object literal for the '<em><b>Organisation</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JCM_MODEL__ORGANISATION = eINSTANCE.getJcmModel_Organisation();

    /**
     * The meta object literal for the '<em><b>Dclass Path</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JCM_MODEL__DCLASS_PATH = eINSTANCE.getJcmModel_DclassPath();

    /**
     * The meta object literal for the '<em><b>DAsl Path</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JCM_MODEL__DASL_PATH = eINSTANCE.getJcmModel_DAslPath();

    /**
     * The meta object literal for the '<em><b>DPlatform</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JCM_MODEL__DPLATFORM = eINSTANCE.getJcmModel_DPlatform();

    /**
     * The meta object literal for the '<em><b>DNode</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JCM_MODEL__DNODE = eINSTANCE.getJcmModel_DNode();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.DUsesImpl <em>DUses</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.DUsesImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getDUses()
     * @generated
     */
    EClass DUSES = eINSTANCE.getDUses();

    /**
     * The meta object literal for the '<em><b>File Name</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DUSES__FILE_NAME = eINSTANCE.getDUses_FileName();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.DClassPathImpl <em>DClass Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.DClassPathImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getDClassPath()
     * @generated
     */
    EClass DCLASS_PATH = eINSTANCE.getDClassPath();

    /**
     * The meta object literal for the '<em><b>Class Path</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DCLASS_PATH__CLASS_PATH = eINSTANCE.getDClassPath_ClassPath();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.DAslPathImpl <em>DAsl Path</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.DAslPathImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getDAslPath()
     * @generated
     */
    EClass DASL_PATH = eINSTANCE.getDAslPath();

    /**
     * The meta object literal for the '<em><b>Asl Path</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DASL_PATH__ASL_PATH = eINSTANCE.getDAslPath_AslPath();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.DPlatformImpl <em>DPlatform</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.DPlatformImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getDPlatform()
     * @generated
     */
    EClass DPLATFORM = eINSTANCE.getDPlatform();

    /**
     * The meta object literal for the '<em><b>Platform</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DPLATFORM__PLATFORM = eINSTANCE.getDPlatform_Platform();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.DNodeImpl <em>DNode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.DNodeImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getDNode()
     * @generated
     */
    EClass DNODE = eINSTANCE.getDNode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DNODE__NAME = eINSTANCE.getDNode_Name();

    /**
     * The meta object literal for the '<em><b>Host</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DNODE__HOST = eINSTANCE.getDNode_Host();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.AgentImpl <em>Agent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.AgentImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getAgent()
     * @generated
     */
    EClass AGENT = eINSTANCE.getAgent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__NAME = eINSTANCE.getAgent_Name();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT__SOURCE = eINSTANCE.getAgent_Source();

    /**
     * The meta object literal for the '<em><b>Instances</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__INSTANCES = eINSTANCE.getAgent_Instances();

    /**
     * The meta object literal for the '<em><b>Instances Atom</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__INSTANCES_ATOM = eINSTANCE.getAgent_InstancesAtom();

    /**
     * The meta object literal for the '<em><b>Node</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__NODE = eINSTANCE.getAgent_Node();

    /**
     * The meta object literal for the '<em><b>Ag Arch</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT__AG_ARCH = eINSTANCE.getAgent_AgArch();

    /**
     * The meta object literal for the '<em><b>Ag Class</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT__AG_CLASS = eINSTANCE.getAgent_AgClass();

    /**
     * The meta object literal for the '<em><b>Agbb Class</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT__AGBB_CLASS = eINSTANCE.getAgent_AgbbClass();

    /**
     * The meta object literal for the '<em><b>Beliefs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT__BELIEFS = eINSTANCE.getAgent_Beliefs();

    /**
     * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT__GOALS = eINSTANCE.getAgent_Goals();

    /**
     * The meta object literal for the '<em><b>Focus</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__FOCUS = eINSTANCE.getAgent_Focus();

    /**
     * The meta object literal for the '<em><b>Focus Node</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__FOCUS_NODE = eINSTANCE.getAgent_FocusNode();

    /**
     * The meta object literal for the '<em><b>Join</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__JOIN = eINSTANCE.getAgent_Join();

    /**
     * The meta object literal for the '<em><b>Join Node</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__JOIN_NODE = eINSTANCE.getAgent_JoinNode();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__ROLE = eINSTANCE.getAgent_Role();

    /**
     * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__GROUP = eINSTANCE.getAgent_Group();

    /**
     * The meta object literal for the '<em><b>Group Node</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__GROUP_NODE = eINSTANCE.getAgent_GroupNode();

    /**
     * The meta object literal for the '<em><b>Debug</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT__DEBUG = eINSTANCE.getAgent_Debug();

    /**
     * The meta object literal for the '<em><b>Verbose</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__VERBOSE = eINSTANCE.getAgent_Verbose();

    /**
     * The meta object literal for the '<em><b>Nrcbp</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__NRCBP = eINSTANCE.getAgent_Nrcbp();

    /**
     * The meta object literal for the '<em><b>Other</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__OTHER = eINSTANCE.getAgent_Other();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__STRING = eINSTANCE.getAgent_String();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__VAL = eINSTANCE.getAgent_Val();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT__LITERAL = eINSTANCE.getAgent_Literal();

    /**
     * The meta object literal for the '<em><b>Val real</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__VAL_REAL = eINSTANCE.getAgent_Val_real();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.WorkspaceImpl <em>Workspace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.WorkspaceImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getWorkspace()
     * @generated
     */
    EClass WORKSPACE = eINSTANCE.getWorkspace();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORKSPACE__NAME = eINSTANCE.getWorkspace_Name();

    /**
     * The meta object literal for the '<em><b>Artifact</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKSPACE__ARTIFACT = eINSTANCE.getWorkspace_Artifact();

    /**
     * The meta object literal for the '<em><b>Agent</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WORKSPACE__AGENT = eINSTANCE.getWorkspace_Agent();

    /**
     * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WORKSPACE__NODE = eINSTANCE.getWorkspace_Node();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.ArtifactImpl <em>Artifact</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.ArtifactImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getArtifact()
     * @generated
     */
    EClass ARTIFACT = eINSTANCE.getArtifact();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACT__NAME = eINSTANCE.getArtifact_Name();

    /**
     * The meta object literal for the '<em><b>Class Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACT__CLASS_DEF = eINSTANCE.getArtifact_ClassDef();

    /**
     * The meta object literal for the '<em><b>Agent</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARTIFACT__AGENT = eINSTANCE.getArtifact_Agent();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.OrganisationImpl <em>Organisation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.OrganisationImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getOrganisation()
     * @generated
     */
    EClass ORGANISATION = eINSTANCE.getOrganisation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ORGANISATION__NAME = eINSTANCE.getOrganisation_Name();

    /**
     * The meta object literal for the '<em><b>File Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORGANISATION__FILE_NAME = eINSTANCE.getOrganisation_FileName();

    /**
     * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORGANISATION__GROUP = eINSTANCE.getOrganisation_Group();

    /**
     * The meta object literal for the '<em><b>Scheme</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORGANISATION__SCHEME = eINSTANCE.getOrganisation_Scheme();

    /**
     * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORGANISATION__AGENTS = eINSTANCE.getOrganisation_Agents();

    /**
     * The meta object literal for the '<em><b>Node</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORGANISATION__NODE = eINSTANCE.getOrganisation_Node();

    /**
     * The meta object literal for the '<em><b>Other</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORGANISATION__OTHER = eINSTANCE.getOrganisation_Other();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.OFileNameImpl <em>OFile Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.OFileNameImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getOFileName()
     * @generated
     */
    EClass OFILE_NAME = eINSTANCE.getOFileName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OFILE_NAME__NAME = eINSTANCE.getOFileName_Name();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.ONodeImpl <em>ONode</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.ONodeImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getONode()
     * @generated
     */
    EClass ONODE = eINSTANCE.getONode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONODE__NAME = eINSTANCE.getONode_Name();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.OAgentsImpl <em>OAgents</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.OAgentsImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getOAgents()
     * @generated
     */
    EClass OAGENTS = eINSTANCE.getOAgents();

    /**
     * The meta object literal for the '<em><b>Agent</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OAGENTS__AGENT = eINSTANCE.getOAgents_Agent();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.OOthersImpl <em>OOthers</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.OOthersImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getOOthers()
     * @generated
     */
    EClass OOTHERS = eINSTANCE.getOOthers();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OOTHERS__NAME = eINSTANCE.getOOthers_Name();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OOTHERS__STRING = eINSTANCE.getOOthers_String();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OOTHERS__VAL = eINSTANCE.getOOthers_Val();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OOTHERS__LITERAL = eINSTANCE.getOOthers_Literal();

    /**
     * The meta object literal for the '<em><b>Val real</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OOTHERS__VAL_REAL = eINSTANCE.getOOthers_Val_real();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.GroupImpl <em>Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.GroupImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getGroup()
     * @generated
     */
    EClass GROUP = eINSTANCE.getGroup();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__NAME = eINSTANCE.getGroup_Name();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__KIND = eINSTANCE.getGroup_Kind();

    /**
     * The meta object literal for the '<em><b>Group</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP__GROUP = eINSTANCE.getGroup_Group();

    /**
     * The meta object literal for the '<em><b>Responsible For</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__RESPONSIBLE_FOR = eINSTANCE.getGroup_ResponsibleFor();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__OWNER = eINSTANCE.getGroup_Owner();

    /**
     * The meta object literal for the '<em><b>Other</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__OTHER = eINSTANCE.getGroup_Other();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__STRING = eINSTANCE.getGroup_String();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__VAL = eINSTANCE.getGroup_Val();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUP__LITERAL = eINSTANCE.getGroup_Literal();

    /**
     * The meta object literal for the '<em><b>Val real</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__VAL_REAL = eINSTANCE.getGroup_Val_real();

    /**
     * The meta object literal for the '<em><b>Agent</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__AGENT = eINSTANCE.getGroup_Agent();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GROUP__ROLE = eINSTANCE.getGroup_Role();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.SchemeImpl <em>Scheme</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.SchemeImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getScheme()
     * @generated
     */
    EClass SCHEME = eINSTANCE.getScheme();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEME__NAME = eINSTANCE.getScheme_Name();

    /**
     * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEME__KIND = eINSTANCE.getScheme_Kind();

    /**
     * The meta object literal for the '<em><b>Owner</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEME__OWNER = eINSTANCE.getScheme_Owner();

    /**
     * The meta object literal for the '<em><b>Other</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEME__OTHER = eINSTANCE.getScheme_Other();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEME__STRING = eINSTANCE.getScheme_String();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEME__VAL = eINSTANCE.getScheme_Val();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCHEME__LITERAL = eINSTANCE.getScheme_Literal();

    /**
     * The meta object literal for the '<em><b>Val real</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCHEME__VAL_REAL = eINSTANCE.getScheme_Val_real();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.HostImpl <em>Host</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.HostImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getHost()
     * @generated
     */
    EClass HOST = eINSTANCE.getHost();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HOST__NAME = eINSTANCE.getHost_Name();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HOST__STRING = eINSTANCE.getHost_String();

    /**
     * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HOST__IP = eINSTANCE.getHost_Ip();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HOST__VAL = eINSTANCE.getHost_Val();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.FileNameImpl <em>File Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.FileNameImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getFileName()
     * @generated
     */
    EClass FILE_NAME = eINSTANCE.getFileName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE_NAME__NAME = eINSTANCE.getFileName_Name();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FILE_NAME__STRING = eINSTANCE.getFileName_String();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.ClassDefImpl <em>Class Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.ClassDefImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getClassDef()
     * @generated
     */
    EClass CLASS_DEF = eINSTANCE.getClassDef();

    /**
     * The meta object literal for the '<em><b>Infrastructure</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DEF__INFRASTRUCTURE = eINSTANCE.getClassDef_Infrastructure();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DEF__PARAMETER = eINSTANCE.getClassDef_Parameter();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.ParameterImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Class Def</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__CLASS_DEF = eINSTANCE.getParameter_ClassDef();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__VAL = eINSTANCE.getParameter_Val();

    /**
     * The meta object literal for the '<em><b>Val real</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__VAL_REAL = eINSTANCE.getParameter_Val_real();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__STRING = eINSTANCE.getParameter_String();

    /**
     * The meta object literal for the '<em><b>List Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__LIST_PARAMETERS = eINSTANCE.getParameter_ListParameters();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.ListParametersImpl <em>List Parameters</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.ListParametersImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getListParameters()
     * @generated
     */
    EClass LIST_PARAMETERS = eINSTANCE.getListParameters();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_PARAMETERS__PARAMETER = eINSTANCE.getListParameters_Parameter();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.LiteralImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '<em><b>Pred</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LITERAL__PRED = eINSTANCE.getLiteral_Pred();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LITERAL__VAR = eINSTANCE.getLiteral_Var();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.PredImpl <em>Pred</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.PredImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getPred()
     * @generated
     */
    EClass PRED = eINSTANCE.getPred();

    /**
     * The meta object literal for the '<em><b>Atom</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRED__ATOM = eINSTANCE.getPred_Atom();

    /**
     * The meta object literal for the '<em><b>Terms</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRED__TERMS = eINSTANCE.getPred_Terms();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRED__LIST = eINSTANCE.getPred_List();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.TermsImpl <em>Terms</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.TermsImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getTerms()
     * @generated
     */
    EClass TERMS = eINSTANCE.getTerms();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERMS__TERM = eINSTANCE.getTerms_Term();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.TermImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__LIST = eINSTANCE.getTerm_List();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TERM__LITERAL = eINSTANCE.getTerm_Literal();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM__STRING = eINSTANCE.getTerm_String();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM__VAL = eINSTANCE.getTerm_Val();

    /**
     * The meta object literal for the '<em><b>Val real</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM__VAL_REAL = eINSTANCE.getTerm_Val_real();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.ListImpl <em>List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.ListImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getList()
     * @generated
     */
    EClass LIST = eINSTANCE.getList();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST__TERM = eINSTANCE.getList_Term();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIST__VAR = eINSTANCE.getList_Var();

    /**
     * The meta object literal for the '<em><b>Unnamedvar</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LIST__UNNAMEDVAR = eINSTANCE.getList_Unnamedvar();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST__LIST = eINSTANCE.getList_List();

    /**
     * The meta object literal for the '{@link jacamoide.xtext.jcm.jcm.impl.VarImpl <em>Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jacamoide.xtext.jcm.jcm.impl.VarImpl
     * @see jacamoide.xtext.jcm.jcm.impl.JcmPackageImpl#getVar()
     * @generated
     */
    EClass VAR = eINSTANCE.getVar();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR__VAR = eINSTANCE.getVar_Var();

    /**
     * The meta object literal for the '<em><b>Unnamedvar</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VAR__UNNAMEDVAR = eINSTANCE.getVar_Unnamedvar();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VAR__LIST = eINSTANCE.getVar_List();

  }

} //JcmPackage
