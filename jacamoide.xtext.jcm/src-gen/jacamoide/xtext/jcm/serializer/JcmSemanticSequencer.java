/*
 * generated by Xtext 2.23.0
 */
package jacamoide.xtext.jcm.serializer;

import com.google.inject.Inject;
import jacamoide.xtext.jcm.jcm.Agent;
import jacamoide.xtext.jcm.jcm.Artifact;
import jacamoide.xtext.jcm.jcm.ClassDef;
import jacamoide.xtext.jcm.jcm.DAslPath;
import jacamoide.xtext.jcm.jcm.DClassPath;
import jacamoide.xtext.jcm.jcm.DJavaPath;
import jacamoide.xtext.jcm.jcm.DNode;
import jacamoide.xtext.jcm.jcm.DOrgPath;
import jacamoide.xtext.jcm.jcm.DPlatform;
import jacamoide.xtext.jcm.jcm.DUses;
import jacamoide.xtext.jcm.jcm.FileName;
import jacamoide.xtext.jcm.jcm.Group;
import jacamoide.xtext.jcm.jcm.Host;
import jacamoide.xtext.jcm.jcm.Institution;
import jacamoide.xtext.jcm.jcm.JcmModel;
import jacamoide.xtext.jcm.jcm.JcmPackage;
import jacamoide.xtext.jcm.jcm.List;
import jacamoide.xtext.jcm.jcm.ListParameters;
import jacamoide.xtext.jcm.jcm.Literal;
import jacamoide.xtext.jcm.jcm.OAgents;
import jacamoide.xtext.jcm.jcm.OFileName;
import jacamoide.xtext.jcm.jcm.ONode;
import jacamoide.xtext.jcm.jcm.OOthers;
import jacamoide.xtext.jcm.jcm.OSituated;
import jacamoide.xtext.jcm.jcm.Organisation;
import jacamoide.xtext.jcm.jcm.Pred;
import jacamoide.xtext.jcm.jcm.Scheme;
import jacamoide.xtext.jcm.jcm.Term;
import jacamoide.xtext.jcm.jcm.Terms;
import jacamoide.xtext.jcm.jcm.Var;
import jacamoide.xtext.jcm.jcm.Workspace;
import jacamoide.xtext.jcm.services.JcmGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class JcmSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JcmGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == JcmPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case JcmPackage.AGENT:
				sequence_Agent(context, (Agent) semanticObject); 
				return; 
			case JcmPackage.ARTIFACT:
				sequence_Artifact(context, (Artifact) semanticObject); 
				return; 
			case JcmPackage.CLASS_DEF:
				sequence_ClassDef(context, (ClassDef) semanticObject); 
				return; 
			case JcmPackage.DASL_PATH:
				sequence_DAslPath(context, (DAslPath) semanticObject); 
				return; 
			case JcmPackage.DCLASS_PATH:
				sequence_DClassPath(context, (DClassPath) semanticObject); 
				return; 
			case JcmPackage.DJAVA_PATH:
				sequence_DJavaPath(context, (DJavaPath) semanticObject); 
				return; 
			case JcmPackage.DNODE:
				sequence_DNode(context, (DNode) semanticObject); 
				return; 
			case JcmPackage.DORG_PATH:
				sequence_DOrgPath(context, (DOrgPath) semanticObject); 
				return; 
			case JcmPackage.DPLATFORM:
				sequence_DPlatform(context, (DPlatform) semanticObject); 
				return; 
			case JcmPackage.DUSES:
				sequence_DUses(context, (DUses) semanticObject); 
				return; 
			case JcmPackage.FILE_NAME:
				sequence_FileName(context, (FileName) semanticObject); 
				return; 
			case JcmPackage.GROUP:
				sequence_Group(context, (Group) semanticObject); 
				return; 
			case JcmPackage.HOST:
				sequence_Host(context, (Host) semanticObject); 
				return; 
			case JcmPackage.INSTITUTION:
				sequence_Institution(context, (Institution) semanticObject); 
				return; 
			case JcmPackage.JCM_MODEL:
				sequence_JcmModel(context, (JcmModel) semanticObject); 
				return; 
			case JcmPackage.LIST:
				sequence_List(context, (List) semanticObject); 
				return; 
			case JcmPackage.LIST_PARAMETERS:
				sequence_ListParameters(context, (ListParameters) semanticObject); 
				return; 
			case JcmPackage.LITERAL:
				sequence_Literal(context, (Literal) semanticObject); 
				return; 
			case JcmPackage.OAGENTS:
				sequence_OAgents(context, (OAgents) semanticObject); 
				return; 
			case JcmPackage.OFILE_NAME:
				sequence_OFileName(context, (OFileName) semanticObject); 
				return; 
			case JcmPackage.ONODE:
				sequence_ONode(context, (ONode) semanticObject); 
				return; 
			case JcmPackage.OOTHERS:
				sequence_OOthers(context, (OOthers) semanticObject); 
				return; 
			case JcmPackage.OSITUATED:
				sequence_OSituated(context, (OSituated) semanticObject); 
				return; 
			case JcmPackage.ORGANISATION:
				sequence_Organisation(context, (Organisation) semanticObject); 
				return; 
			case JcmPackage.PARAMETER:
				sequence_Parameter(context, (jacamoide.xtext.jcm.jcm.Parameter) semanticObject); 
				return; 
			case JcmPackage.PRED:
				sequence_Pred(context, (Pred) semanticObject); 
				return; 
			case JcmPackage.SCHEME:
				sequence_Scheme(context, (Scheme) semanticObject); 
				return; 
			case JcmPackage.TERM:
				sequence_Term(context, (Term) semanticObject); 
				return; 
			case JcmPackage.TERMS:
				sequence_Terms(context, (Terms) semanticObject); 
				return; 
			case JcmPackage.VAR:
				sequence_Var(context, (Var) semanticObject); 
				return; 
			case JcmPackage.WORKSPACE:
				sequence_Workspace(context, (Workspace) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Agent returns Agent
	 *
	 * Constraint:
	 *     (
	 *         name=ATOM 
	 *         source+=FileName? 
	 *         (
	 *             (
	 *                 instances+=INT_LITERAL | 
	 *                 instancesAtom+=ATOM | 
	 *                 node+=ATOM | 
	 *                 agArch+=ClassDef | 
	 *                 agClass+=ClassDef | 
	 *                 agbbClass+=ClassDef | 
	 *                 beliefs+=Literal | 
	 *                 goals+=Literal | 
	 *                 debug+=Literal | 
	 *                 verbose+=INT_LITERAL | 
	 *                 nrcbp+=INT_LITERAL
	 *             )? 
	 *             (join+=ATOM joinNode+=ATOM?)? 
	 *             (focus+=ATOM focusNS+=ATOM? focusNode+=ATOM?)? 
	 *             (role+=ATOM group+=ATOM groupNode+=ATOM?)? 
	 *             (other+=ATOM (string+=STRING | val+=INT_LITERAL | literal+=Literal | val_real+=REAL_LITERAL))?
	 *         )+
	 *     )
	 */
	protected void sequence_Agent(ISerializationContext context, Agent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Artifact returns Artifact
	 *
	 * Constraint:
	 *     (name=ATOM classDef=ClassDef (agentNS+=ATOM | agent+=ATOM)*)
	 */
	protected void sequence_Artifact(ISerializationContext context, Artifact semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ClassDef returns ClassDef
	 *
	 * Constraint:
	 *     (infrastructure=FQN (parameter+=Parameter parameter+=Parameter*)?)
	 */
	protected void sequence_ClassDef(ISerializationContext context, ClassDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DAslPath returns DAslPath
	 *
	 * Constraint:
	 *     aslPath+=FileName*
	 */
	protected void sequence_DAslPath(ISerializationContext context, DAslPath semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DClassPath returns DClassPath
	 *
	 * Constraint:
	 *     classPath+=FileName*
	 */
	protected void sequence_DClassPath(ISerializationContext context, DClassPath semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DJavaPath returns DJavaPath
	 *
	 * Constraint:
	 *     aslPath+=FileName*
	 */
	protected void sequence_DJavaPath(ISerializationContext context, DJavaPath semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DNode returns DNode
	 *
	 * Constraint:
	 *     (name=ATOM host=Host?)
	 */
	protected void sequence_DNode(ISerializationContext context, DNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DOrgPath returns DOrgPath
	 *
	 * Constraint:
	 *     orgPath+=FileName*
	 */
	protected void sequence_DOrgPath(ISerializationContext context, DOrgPath semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DPlatform returns DPlatform
	 *
	 * Constraint:
	 *     platform+=ClassDef*
	 */
	protected void sequence_DPlatform(ISerializationContext context, DPlatform semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DUses returns DUses
	 *
	 * Constraint:
	 *     (fileName+=FileName fileName+=FileName*)
	 */
	protected void sequence_DUses(ISerializationContext context, DUses semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FileName returns FileName
	 *
	 * Constraint:
	 *     (name+=ATOM+ | string=STRING)?
	 */
	protected void sequence_FileName(ISerializationContext context, FileName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Group returns Group
	 *
	 * Constraint:
	 *     (
	 *         name=ATOM 
	 *         kind=ATOM 
	 *         (
	 *             (group+=Group | responsibleFor+=ATOM | owner+=ATOM | debug+=Literal)? 
	 *             (agent+=ATOM role+=ATOM)? 
	 *             (other+=ATOM (string+=STRING | val+=INT_LITERAL | literal+=Literal | val_real+=REAL_LITERAL))?
	 *         )+
	 *     )
	 */
	protected void sequence_Group(ISerializationContext context, Group semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Host returns Host
	 *
	 * Constraint:
	 *     ((name=ATOM | string=STRING | ip=IP) val=INT_LITERAL?)
	 */
	protected void sequence_Host(ISerializationContext context, Host semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Institution returns Institution
	 *
	 * Constraint:
	 *     (name=ATOM fileName=OFileName? (wsNames+=ATOM? (other+=ATOM (string+=STRING | val+=INT_LITERAL | literal+=Literal | val_real+=REAL_LITERAL))?)+)
	 */
	protected void sequence_Institution(ISerializationContext context, Institution semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     JcmModel returns JcmModel
	 *
	 * Constraint:
	 *     (
	 *         name=ATOM 
	 *         uses=DUses? 
	 *         agent+=Agent* 
	 *         workspace+=Workspace* 
	 *         institution+=Institution* 
	 *         organisation+=Organisation* 
	 *         (
	 *             dclassPath+=DClassPath | 
	 *             dAslPath+=DAslPath | 
	 *             dOrgPath+=DOrgPath | 
	 *             dJavaPath+=DJavaPath | 
	 *             dPlatform+=DPlatform | 
	 *             dNode+=DNode
	 *         )*
	 *     )
	 */
	protected void sequence_JcmModel(ISerializationContext context, JcmModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ListParameters returns ListParameters
	 *
	 * Constraint:
	 *     (parameter+=Parameter parameter+=Parameter*)
	 */
	protected void sequence_ListParameters(ISerializationContext context, ListParameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     List returns List
	 *
	 * Constraint:
	 *     (term+=Term term+=Term* (var=VART | unnamedvar=UNNAMEDVART | list=List)?)?
	 */
	protected void sequence_List(ISerializationContext context, List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns Literal
	 *
	 * Constraint:
	 *     (pred=Pred | var=Var)?
	 */
	protected void sequence_Literal(ISerializationContext context, Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OAgents returns OAgents
	 *
	 * Constraint:
	 *     agent+=ATOM*
	 */
	protected void sequence_OAgents(ISerializationContext context, OAgents semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OFileName returns OFileName
	 *
	 * Constraint:
	 *     name=FileName
	 */
	protected void sequence_OFileName(ISerializationContext context, OFileName semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JcmPackage.Literals.OFILE_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JcmPackage.Literals.OFILE_NAME__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOFileNameAccess().getNameFileNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ONode returns ONode
	 *
	 * Constraint:
	 *     name=ATOM
	 */
	protected void sequence_ONode(ISerializationContext context, ONode semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JcmPackage.Literals.ONODE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JcmPackage.Literals.ONODE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getONodeAccess().getNameATOMTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     OOthers returns OOthers
	 *
	 * Constraint:
	 *     (name=ATOM (string+=STRING | val+=INT_LITERAL | literal+=Literal | val_real+=REAL_LITERAL))
	 */
	protected void sequence_OOthers(ISerializationContext context, OOthers semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     OSituated returns OSituated
	 *
	 * Constraint:
	 *     name=ATOM
	 */
	protected void sequence_OSituated(ISerializationContext context, OSituated semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JcmPackage.Literals.OSITUATED__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JcmPackage.Literals.OSITUATED__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOSituatedAccess().getNameATOMTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Organisation returns Organisation
	 *
	 * Constraint:
	 *     (
	 *         name=ATOM 
	 *         fileName=OFileName? 
	 *         (
	 *             group+=Group | 
	 *             scheme+=Scheme | 
	 *             agents+=OAgents | 
	 *             node+=ONode | 
	 *             situated+=OSituated | 
	 *             other+=OOthers
	 *         )*
	 *     )
	 */
	protected void sequence_Organisation(ISerializationContext context, Organisation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (classDef=ClassDef | val=INT_LITERAL | val_real+=REAL_LITERAL | string=STRING | listParameters=ListParameters)
	 */
	protected void sequence_Parameter(ISerializationContext context, jacamoide.xtext.jcm.jcm.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Pred returns Pred
	 *
	 * Constraint:
	 *     (atom=ATOM? terms=Terms? list=List?)
	 */
	protected void sequence_Pred(ISerializationContext context, Pred semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Scheme returns Scheme
	 *
	 * Constraint:
	 *     (
	 *         name=ATOM 
	 *         kind=ATOM 
	 *         ((debug+=Literal | owner+=ATOM)? (other+=ATOM (string+=STRING | val+=INT_LITERAL | literal+=Literal | val_real+=REAL_LITERAL))?)+
	 *     )
	 */
	protected void sequence_Scheme(ISerializationContext context, Scheme semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Term returns Term
	 *
	 * Constraint:
	 *     (list=List | literal=Literal | string=STRING | val=INT_LITERAL | val_real+=REAL_LITERAL)
	 */
	protected void sequence_Term(ISerializationContext context, Term semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Terms returns Terms
	 *
	 * Constraint:
	 *     (term+=Term term+=Term*)
	 */
	protected void sequence_Terms(ISerializationContext context, Terms semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Var returns Var
	 *
	 * Constraint:
	 *     ((var=VART | unnamedvar=UNNAMEDVART) list=List?)
	 */
	protected void sequence_Var(ISerializationContext context, Var semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Workspace returns Workspace
	 *
	 * Constraint:
	 *     (name=ATOM (artifact+=Artifact | agent+=ATOM | debug+=Literal | node+=ONode)*)
	 */
	protected void sequence_Workspace(ISerializationContext context, Workspace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}