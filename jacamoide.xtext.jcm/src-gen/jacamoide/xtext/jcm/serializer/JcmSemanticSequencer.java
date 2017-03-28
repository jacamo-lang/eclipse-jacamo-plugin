package jacamoide.xtext.jcm.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import jacamoide.xtext.jcm.jcm.Agent;
import jacamoide.xtext.jcm.jcm.Artifact;
import jacamoide.xtext.jcm.jcm.ClassDef;
import jacamoide.xtext.jcm.jcm.DAslPath;
import jacamoide.xtext.jcm.jcm.DClassPath;
import jacamoide.xtext.jcm.jcm.DNode;
import jacamoide.xtext.jcm.jcm.DPlatform;
import jacamoide.xtext.jcm.jcm.DUses;
import jacamoide.xtext.jcm.jcm.FileName;
import jacamoide.xtext.jcm.jcm.Group;
import jacamoide.xtext.jcm.jcm.Host;
import jacamoide.xtext.jcm.jcm.JcmModel;
import jacamoide.xtext.jcm.jcm.JcmPackage;
import jacamoide.xtext.jcm.jcm.List;
import jacamoide.xtext.jcm.jcm.ListParameters;
import jacamoide.xtext.jcm.jcm.Literal;
import jacamoide.xtext.jcm.jcm.OAgents;
import jacamoide.xtext.jcm.jcm.OFileName;
import jacamoide.xtext.jcm.jcm.ONode;
import jacamoide.xtext.jcm.jcm.OOthers;
import jacamoide.xtext.jcm.jcm.Organisation;
import jacamoide.xtext.jcm.jcm.Parameter;
import jacamoide.xtext.jcm.jcm.Pred;
import jacamoide.xtext.jcm.jcm.Scheme;
import jacamoide.xtext.jcm.jcm.Term;
import jacamoide.xtext.jcm.jcm.Terms;
import jacamoide.xtext.jcm.jcm.Var;
import jacamoide.xtext.jcm.jcm.Workspace;
import jacamoide.xtext.jcm.services.JcmGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class JcmSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JcmGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == JcmPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JcmPackage.AGENT:
				if(context == grammarAccess.getAgentRule()) {
					sequence_Agent(context, (Agent) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.ARTIFACT:
				if(context == grammarAccess.getArtifactRule()) {
					sequence_Artifact(context, (Artifact) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.CLASS_DEF:
				if(context == grammarAccess.getClassDefRule()) {
					sequence_ClassDef(context, (ClassDef) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.DASL_PATH:
				if(context == grammarAccess.getDAslPathRule()) {
					sequence_DAslPath(context, (DAslPath) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.DCLASS_PATH:
				if(context == grammarAccess.getDClassPathRule()) {
					sequence_DClassPath(context, (DClassPath) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.DNODE:
				if(context == grammarAccess.getDNodeRule()) {
					sequence_DNode(context, (DNode) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.DPLATFORM:
				if(context == grammarAccess.getDPlatformRule()) {
					sequence_DPlatform(context, (DPlatform) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.DUSES:
				if(context == grammarAccess.getDUsesRule()) {
					sequence_DUses(context, (DUses) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.FILE_NAME:
				if(context == grammarAccess.getFileNameRule()) {
					sequence_FileName(context, (FileName) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.GROUP:
				if(context == grammarAccess.getGroupRule()) {
					sequence_Group(context, (Group) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.HOST:
				if(context == grammarAccess.getHostRule()) {
					sequence_Host(context, (Host) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.JCM_MODEL:
				if(context == grammarAccess.getJcmModelRule()) {
					sequence_JcmModel(context, (JcmModel) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.LIST:
				if(context == grammarAccess.getListRule()) {
					sequence_List(context, (List) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.LIST_PARAMETERS:
				if(context == grammarAccess.getListParametersRule()) {
					sequence_ListParameters(context, (ListParameters) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (Literal) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.OAGENTS:
				if(context == grammarAccess.getOAgentsRule()) {
					sequence_OAgents(context, (OAgents) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.OFILE_NAME:
				if(context == grammarAccess.getOFileNameRule()) {
					sequence_OFileName(context, (OFileName) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.ONODE:
				if(context == grammarAccess.getONodeRule()) {
					sequence_ONode(context, (ONode) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.OOTHERS:
				if(context == grammarAccess.getOOthersRule()) {
					sequence_OOthers(context, (OOthers) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.ORGANISATION:
				if(context == grammarAccess.getOrganisationRule()) {
					sequence_Organisation(context, (Organisation) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.PRED:
				if(context == grammarAccess.getPredRule()) {
					sequence_Pred(context, (Pred) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.SCHEME:
				if(context == grammarAccess.getSchemeRule()) {
					sequence_Scheme(context, (Scheme) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.TERM:
				if(context == grammarAccess.getTermRule()) {
					sequence_Term(context, (Term) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.TERMS:
				if(context == grammarAccess.getTermsRule()) {
					sequence_Terms(context, (Terms) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.VAR:
				if(context == grammarAccess.getVarRule()) {
					sequence_Var(context, (Var) semanticObject); 
					return; 
				}
				else break;
			case JcmPackage.WORKSPACE:
				if(context == grammarAccess.getWorkspaceRule()) {
					sequence_Workspace(context, (Workspace) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         name=ATOM 
	 *         source+=FileName? 
	 *         (
	 *             instances+=INT_LITERAL | 
	 *             instancesAtom+=ATOM* | 
	 *             node+=ATOM | 
	 *             agArch+=ClassDef* | 
	 *             agClass+=ClassDef | 
	 *             agbbClass+=ClassDef | 
	 *             beliefs+=Literal* | 
	 *             goals+=Literal* | 
	 *             (focus+=ATOM focusNode+=ATOM?)* | 
	 *             (join+=ATOM joinNode+=ATOM?)* | 
	 *             (role+=ATOM group+=ATOM groupNode+=ATOM?)* | 
	 *             debug+=Literal | 
	 *             verbose+=INT_LITERAL | 
	 *             nrcbp+=INT_LITERAL | 
	 *             (other+=ATOM (string+=STRING | val+=INT_LITERAL | literal+=Literal | val_real+=REAL_LITERAL))
	 *         )*
	 *     )
	 */
	protected void sequence_Agent(EObject context, Agent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ATOM classDef=ClassDef agent+=ATOM*)
	 */
	protected void sequence_Artifact(EObject context, Artifact semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (infrastructure=FQN (parameter+=Parameter parameter+=Parameter*)?)
	 */
	protected void sequence_ClassDef(EObject context, ClassDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (aslPath+=FileName*)
	 */
	protected void sequence_DAslPath(EObject context, DAslPath semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (classPath+=FileName*)
	 */
	protected void sequence_DClassPath(EObject context, DClassPath semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ATOM host=Host?)
	 */
	protected void sequence_DNode(EObject context, DNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (platform+=ClassDef*)
	 */
	protected void sequence_DPlatform(EObject context, DPlatform semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fileName+=FileName fileName+=FileName*)
	 */
	protected void sequence_DUses(EObject context, DUses semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name+=ATOM* | string=STRING)
	 */
	protected void sequence_FileName(EObject context, FileName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ATOM 
	 *         kind=ATOM 
	 *         (
	 *             group+=Group | 
	 *             responsibleFor+=ATOM | 
	 *             owner+=ATOM | 
	 *             debug+=Literal? | 
	 *             (other+=ATOM (string+=STRING | val+=INT_LITERAL | literal+=Literal | val_real+=REAL_LITERAL)) | 
	 *             (agent+=ATOM role+=ATOM)*
	 *         )*
	 *     )
	 */
	protected void sequence_Group(EObject context, Group semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=ATOM | string=STRING | ip=IP) val=INT_LITERAL?)
	 */
	protected void sequence_Host(EObject context, Host semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ATOM 
	 *         uses=DUses? 
	 *         agent+=Agent* 
	 *         workspace+=Workspace* 
	 *         organisation+=Organisation* 
	 *         (dclassPath+=DClassPath | dAslPath+=DAslPath | dPlatform+=DPlatform | dNode+=DNode)*
	 *     )
	 */
	protected void sequence_JcmModel(EObject context, JcmModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameter+=Parameter parameter+=Parameter*)
	 */
	protected void sequence_ListParameters(EObject context, ListParameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((term+=Term term+=Term* (var=VART | unnamedvar=UNNAMEDVART | list=List)?)?)
	 */
	protected void sequence_List(EObject context, List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((pred=Pred | var=Var)?)
	 */
	protected void sequence_Literal(EObject context, Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (agent+=ATOM*)
	 */
	protected void sequence_OAgents(EObject context, OAgents semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=FileName
	 */
	protected void sequence_OFileName(EObject context, OFileName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JcmPackage.Literals.OFILE_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JcmPackage.Literals.OFILE_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOFileNameAccess().getNameFileNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=ATOM
	 */
	protected void sequence_ONode(EObject context, ONode semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JcmPackage.Literals.ONODE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JcmPackage.Literals.ONODE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getONodeAccess().getNameATOMTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ATOM (string+=STRING | val+=INT_LITERAL | literal+=Literal | val_real+=REAL_LITERAL))
	 */
	protected void sequence_OOthers(EObject context, OOthers semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ATOM fileName=OFileName? (group+=Group | scheme+=Scheme | agents+=OAgents | node+=ONode | other+=OOthers)*)
	 */
	protected void sequence_Organisation(EObject context, Organisation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (classDef=ClassDef | val=INT_LITERAL | val_real+=REAL_LITERAL | string=STRING | listParameters=ListParameters)
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (atom=ATOM? terms=Terms? list=List?)
	 */
	protected void sequence_Pred(EObject context, Pred semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ATOM 
	 *         kind=ATOM 
	 *         (debug+=Literal? | owner+=ATOM | (other+=ATOM (string+=STRING | val+=INT_LITERAL | literal+=Literal | val_real+=REAL_LITERAL)))*
	 *     )
	 */
	protected void sequence_Scheme(EObject context, Scheme semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (list=List | literal=Literal | string=STRING | val=INT_LITERAL | val_real+=REAL_LITERAL)
	 */
	protected void sequence_Term(EObject context, Term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (term+=Term term+=Term*)
	 */
	protected void sequence_Terms(EObject context, Terms semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((var=VART | unnamedvar=UNNAMEDVART) list=List?)
	 */
	protected void sequence_Var(EObject context, Var semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ATOM (artifact+=Artifact | agent+=ATOM* | debug+=Literal? | node+=ONode)*)
	 */
	protected void sequence_Workspace(EObject context, Workspace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
