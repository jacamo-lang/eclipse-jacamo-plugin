/*
 * generated by Xtext 2.23.0
 */
package jacamoide.xtext.jcm.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import jacamoide.xtext.jcm.ide.contentassist.antlr.internal.InternalJcmParser;
import jacamoide.xtext.jcm.services.JcmGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class JcmParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(JcmGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, JcmGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getJcmModelAccess().getAlternatives_11(), "rule__JcmModel__Alternatives_11");
			builder.put(grammarAccess.getDClassPathAccess().getAlternatives_3_1(), "rule__DClassPath__Alternatives_3_1");
			builder.put(grammarAccess.getDAslPathAccess().getAlternatives_3_1(), "rule__DAslPath__Alternatives_3_1");
			builder.put(grammarAccess.getDOrgPathAccess().getAlternatives_3_1(), "rule__DOrgPath__Alternatives_3_1");
			builder.put(grammarAccess.getDJavaPathAccess().getAlternatives_3_1(), "rule__DJavaPath__Alternatives_3_1");
			builder.put(grammarAccess.getDPlatformAccess().getAlternatives_3_1(), "rule__DPlatform__Alternatives_3_1");
			builder.put(grammarAccess.getDNodeAccess().getAlternatives_4(), "rule__DNode__Alternatives_4");
			builder.put(grammarAccess.getAgentAccess().getAlternatives_3_2(), "rule__Agent__Alternatives_3_2");
			builder.put(grammarAccess.getAgentAccess().getAlternatives_3_2_0_2(), "rule__Agent__Alternatives_3_2_0_2");
			builder.put(grammarAccess.getAgentAccess().getAlternatives_3_2_0_2_0_1(), "rule__Agent__Alternatives_3_2_0_2_0_1");
			builder.put(grammarAccess.getAgentAccess().getAlternatives_3_2_0_2_1_1(), "rule__Agent__Alternatives_3_2_0_2_1_1");
			builder.put(grammarAccess.getAgentAccess().getAlternatives_3_2_2_2_1(), "rule__Agent__Alternatives_3_2_2_2_1");
			builder.put(grammarAccess.getAgentAccess().getAlternatives_3_2_5_2_1(), "rule__Agent__Alternatives_3_2_5_2_1");
			builder.put(grammarAccess.getAgentAccess().getAlternatives_3_2_6_2_1(), "rule__Agent__Alternatives_3_2_6_2_1");
			builder.put(grammarAccess.getAgentAccess().getAlternatives_3_2_7_2_3(), "rule__Agent__Alternatives_3_2_7_2_3");
			builder.put(grammarAccess.getAgentAccess().getAlternatives_3_2_8_2_2(), "rule__Agent__Alternatives_3_2_8_2_2");
			builder.put(grammarAccess.getAgentAccess().getAlternatives_3_2_9_2_4(), "rule__Agent__Alternatives_3_2_9_2_4");
			builder.put(grammarAccess.getAgentAccess().getAlternatives_3_2_10_3(), "rule__Agent__Alternatives_3_2_10_3");
			builder.put(grammarAccess.getAgentAccess().getAlternatives_3_2_13_2(), "rule__Agent__Alternatives_3_2_13_2");
			builder.put(grammarAccess.getAgentAccess().getAlternatives_3_2_14_2(), "rule__Agent__Alternatives_3_2_14_2");
			builder.put(grammarAccess.getAgentAccess().getAlternatives_3_2_15_2(), "rule__Agent__Alternatives_3_2_15_2");
			builder.put(grammarAccess.getWorkspaceAccess().getAlternatives_4(), "rule__Workspace__Alternatives_4");
			builder.put(grammarAccess.getWorkspaceAccess().getAlternatives_4_1_2_0(), "rule__Workspace__Alternatives_4_1_2_0");
			builder.put(grammarAccess.getWorkspaceAccess().getAlternatives_4_1_2_1(), "rule__Workspace__Alternatives_4_1_2_1");
			builder.put(grammarAccess.getArtifactAccess().getAlternatives_4_2_2_1(), "rule__Artifact__Alternatives_4_2_2_1");
			builder.put(grammarAccess.getArtifactAccess().getAlternatives_4_2_2_2(), "rule__Artifact__Alternatives_4_2_2_2");
			builder.put(grammarAccess.getInstitutionAccess().getAlternatives_5(), "rule__Institution__Alternatives_5");
			builder.put(grammarAccess.getInstitutionAccess().getAlternatives_5_0_2_1(), "rule__Institution__Alternatives_5_0_2_1");
			builder.put(grammarAccess.getInstitutionAccess().getAlternatives_5_2_2(), "rule__Institution__Alternatives_5_2_2");
			builder.put(grammarAccess.getOrganisationAccess().getAlternatives_5(), "rule__Organisation__Alternatives_5");
			builder.put(grammarAccess.getOAgentsAccess().getAlternatives_3_0(), "rule__OAgents__Alternatives_3_0");
			builder.put(grammarAccess.getOAgentsAccess().getAlternatives_3_1(), "rule__OAgents__Alternatives_3_1");
			builder.put(grammarAccess.getOOthersAccess().getAlternatives_2(), "rule__OOthers__Alternatives_2");
			builder.put(grammarAccess.getGroupAccess().getAlternatives_4_2(), "rule__Group__Alternatives_4_2");
			builder.put(grammarAccess.getGroupAccess().getAlternatives_4_2_1_2_1(), "rule__Group__Alternatives_4_2_1_2_1");
			builder.put(grammarAccess.getGroupAccess().getAlternatives_4_2_4_2(), "rule__Group__Alternatives_4_2_4_2");
			builder.put(grammarAccess.getGroupAccess().getAlternatives_4_2_5_2_2(), "rule__Group__Alternatives_4_2_5_2_2");
			builder.put(grammarAccess.getSchemeAccess().getAlternatives_4_2(), "rule__Scheme__Alternatives_4_2");
			builder.put(grammarAccess.getSchemeAccess().getAlternatives_4_2_2_2(), "rule__Scheme__Alternatives_4_2_2_2");
			builder.put(grammarAccess.getHostAccess().getAlternatives_0(), "rule__Host__Alternatives_0");
			builder.put(grammarAccess.getFileNameAccess().getAlternatives_1(), "rule__FileName__Alternatives_1");
			builder.put(grammarAccess.getFileNameAccess().getAlternatives_1_0(), "rule__FileName__Alternatives_1_0");
			builder.put(grammarAccess.getParameterAccess().getAlternatives(), "rule__Parameter__Alternatives");
			builder.put(grammarAccess.getLiteralAccess().getAlternatives_1(), "rule__Literal__Alternatives_1");
			builder.put(grammarAccess.getLiteralAccess().getAlternatives_1_0_1(), "rule__Literal__Alternatives_1_0_1");
			builder.put(grammarAccess.getPredAccess().getAlternatives_1(), "rule__Pred__Alternatives_1");
			builder.put(grammarAccess.getTermAccess().getAlternatives(), "rule__Term__Alternatives");
			builder.put(grammarAccess.getListAccess().getAlternatives_2_2_1(), "rule__List__Alternatives_2_2_1");
			builder.put(grammarAccess.getVarAccess().getAlternatives_0(), "rule__Var__Alternatives_0");
			builder.put(grammarAccess.getEOLAccess().getAlternatives(), "rule__EOL__Alternatives");
			builder.put(grammarAccess.getFQNAccess().getAlternatives_0(), "rule__FQN__Alternatives_0");
			builder.put(grammarAccess.getFQNAccess().getAlternatives_1_1(), "rule__FQN__Alternatives_1_1");
			builder.put(grammarAccess.getJcmModelAccess().getGroup(), "rule__JcmModel__Group__0");
			builder.put(grammarAccess.getDUsesAccess().getGroup(), "rule__DUses__Group__0");
			builder.put(grammarAccess.getDUsesAccess().getGroup_2(), "rule__DUses__Group_2__0");
			builder.put(grammarAccess.getDClassPathAccess().getGroup(), "rule__DClassPath__Group__0");
			builder.put(grammarAccess.getDClassPathAccess().getGroup_3(), "rule__DClassPath__Group_3__0");
			builder.put(grammarAccess.getDAslPathAccess().getGroup(), "rule__DAslPath__Group__0");
			builder.put(grammarAccess.getDAslPathAccess().getGroup_3(), "rule__DAslPath__Group_3__0");
			builder.put(grammarAccess.getDOrgPathAccess().getGroup(), "rule__DOrgPath__Group__0");
			builder.put(grammarAccess.getDOrgPathAccess().getGroup_3(), "rule__DOrgPath__Group_3__0");
			builder.put(grammarAccess.getDJavaPathAccess().getGroup(), "rule__DJavaPath__Group__0");
			builder.put(grammarAccess.getDJavaPathAccess().getGroup_3(), "rule__DJavaPath__Group_3__0");
			builder.put(grammarAccess.getDPlatformAccess().getGroup(), "rule__DPlatform__Group__0");
			builder.put(grammarAccess.getDPlatformAccess().getGroup_3(), "rule__DPlatform__Group_3__0");
			builder.put(grammarAccess.getDNodeAccess().getGroup(), "rule__DNode__Group__0");
			builder.put(grammarAccess.getDNodeAccess().getGroup_3(), "rule__DNode__Group_3__0");
			builder.put(grammarAccess.getAgentAccess().getGroup(), "rule__Agent__Group__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_2(), "rule__Agent__Group_2__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3(), "rule__Agent__Group_3__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_0(), "rule__Agent__Group_3_2_0__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_0_2_0(), "rule__Agent__Group_3_2_0_2_0__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_0_2_1(), "rule__Agent__Group_3_2_0_2_1__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_1(), "rule__Agent__Group_3_2_1__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_2(), "rule__Agent__Group_3_2_2__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_2_2(), "rule__Agent__Group_3_2_2_2__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_3(), "rule__Agent__Group_3_2_3__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_4(), "rule__Agent__Group_3_2_4__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_5(), "rule__Agent__Group_3_2_5__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_5_2(), "rule__Agent__Group_3_2_5_2__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_6(), "rule__Agent__Group_3_2_6__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_6_2(), "rule__Agent__Group_3_2_6_2__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_7(), "rule__Agent__Group_3_2_7__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_7_2(), "rule__Agent__Group_3_2_7_2__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_7_2_1(), "rule__Agent__Group_3_2_7_2_1__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_7_2_2(), "rule__Agent__Group_3_2_7_2_2__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_8(), "rule__Agent__Group_3_2_8__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_8_2(), "rule__Agent__Group_3_2_8_2__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_8_2_1(), "rule__Agent__Group_3_2_8_2_1__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_9(), "rule__Agent__Group_3_2_9__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_9_2(), "rule__Agent__Group_3_2_9_2__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_9_2_3(), "rule__Agent__Group_3_2_9_2_3__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_10(), "rule__Agent__Group_3_2_10__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_11(), "rule__Agent__Group_3_2_11__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_12(), "rule__Agent__Group_3_2_12__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_13(), "rule__Agent__Group_3_2_13__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_14(), "rule__Agent__Group_3_2_14__0");
			builder.put(grammarAccess.getAgentAccess().getGroup_3_2_15(), "rule__Agent__Group_3_2_15__0");
			builder.put(grammarAccess.getWorkspaceAccess().getGroup(), "rule__Workspace__Group__0");
			builder.put(grammarAccess.getWorkspaceAccess().getGroup_4_1(), "rule__Workspace__Group_4_1__0");
			builder.put(grammarAccess.getWorkspaceAccess().getGroup_4_1_2(), "rule__Workspace__Group_4_1_2__0");
			builder.put(grammarAccess.getWorkspaceAccess().getGroup_4_2(), "rule__Workspace__Group_4_2__0");
			builder.put(grammarAccess.getWorkspaceAccess().getGroup_4_2_1(), "rule__Workspace__Group_4_2_1__0");
			builder.put(grammarAccess.getArtifactAccess().getGroup(), "rule__Artifact__Group__0");
			builder.put(grammarAccess.getArtifactAccess().getGroup_4(), "rule__Artifact__Group_4__0");
			builder.put(grammarAccess.getArtifactAccess().getGroup_4_2(), "rule__Artifact__Group_4_2__0");
			builder.put(grammarAccess.getArtifactAccess().getGroup_4_2_2(), "rule__Artifact__Group_4_2_2__0");
			builder.put(grammarAccess.getArtifactAccess().getGroup_4_2_2_0(), "rule__Artifact__Group_4_2_2_0__0");
			builder.put(grammarAccess.getInstitutionAccess().getGroup(), "rule__Institution__Group__0");
			builder.put(grammarAccess.getInstitutionAccess().getGroup_5_0(), "rule__Institution__Group_5_0__0");
			builder.put(grammarAccess.getInstitutionAccess().getGroup_5_0_2(), "rule__Institution__Group_5_0_2__0");
			builder.put(grammarAccess.getInstitutionAccess().getGroup_5_1(), "rule__Institution__Group_5_1__0");
			builder.put(grammarAccess.getInstitutionAccess().getGroup_5_2(), "rule__Institution__Group_5_2__0");
			builder.put(grammarAccess.getOrganisationAccess().getGroup(), "rule__Organisation__Group__0");
			builder.put(grammarAccess.getOFileNameAccess().getGroup(), "rule__OFileName__Group__0");
			builder.put(grammarAccess.getONodeAccess().getGroup(), "rule__ONode__Group__0");
			builder.put(grammarAccess.getOSituatedAccess().getGroup(), "rule__OSituated__Group__0");
			builder.put(grammarAccess.getOAgentsAccess().getGroup(), "rule__OAgents__Group__0");
			builder.put(grammarAccess.getOAgentsAccess().getGroup_3(), "rule__OAgents__Group_3__0");
			builder.put(grammarAccess.getOOthersAccess().getGroup(), "rule__OOthers__Group__0");
			builder.put(grammarAccess.getGroupAccess().getGroup(), "rule__Group__Group__0");
			builder.put(grammarAccess.getGroupAccess().getGroup_4(), "rule__Group__Group_4__0");
			builder.put(grammarAccess.getGroupAccess().getGroup_4_2_1(), "rule__Group__Group_4_2_1__0");
			builder.put(grammarAccess.getGroupAccess().getGroup_4_2_1_2(), "rule__Group__Group_4_2_1_2__0");
			builder.put(grammarAccess.getGroupAccess().getGroup_4_2_2(), "rule__Group__Group_4_2_2__0");
			builder.put(grammarAccess.getGroupAccess().getGroup_4_2_3(), "rule__Group__Group_4_2_3__0");
			builder.put(grammarAccess.getGroupAccess().getGroup_4_2_3_1(), "rule__Group__Group_4_2_3_1__0");
			builder.put(grammarAccess.getGroupAccess().getGroup_4_2_4(), "rule__Group__Group_4_2_4__0");
			builder.put(grammarAccess.getGroupAccess().getGroup_4_2_5(), "rule__Group__Group_4_2_5__0");
			builder.put(grammarAccess.getGroupAccess().getGroup_4_2_5_2(), "rule__Group__Group_4_2_5_2__0");
			builder.put(grammarAccess.getSchemeAccess().getGroup(), "rule__Scheme__Group__0");
			builder.put(grammarAccess.getSchemeAccess().getGroup_4(), "rule__Scheme__Group_4__0");
			builder.put(grammarAccess.getSchemeAccess().getGroup_4_2_0(), "rule__Scheme__Group_4_2_0__0");
			builder.put(grammarAccess.getSchemeAccess().getGroup_4_2_0_1(), "rule__Scheme__Group_4_2_0_1__0");
			builder.put(grammarAccess.getSchemeAccess().getGroup_4_2_1(), "rule__Scheme__Group_4_2_1__0");
			builder.put(grammarAccess.getSchemeAccess().getGroup_4_2_2(), "rule__Scheme__Group_4_2_2__0");
			builder.put(grammarAccess.getHostAccess().getGroup(), "rule__Host__Group__0");
			builder.put(grammarAccess.getHostAccess().getGroup_1(), "rule__Host__Group_1__0");
			builder.put(grammarAccess.getFileNameAccess().getGroup(), "rule__FileName__Group__0");
			builder.put(grammarAccess.getClassDefAccess().getGroup(), "rule__ClassDef__Group__0");
			builder.put(grammarAccess.getClassDefAccess().getGroup_1(), "rule__ClassDef__Group_1__0");
			builder.put(grammarAccess.getClassDefAccess().getGroup_1_1(), "rule__ClassDef__Group_1_1__0");
			builder.put(grammarAccess.getClassDefAccess().getGroup_1_1_1(), "rule__ClassDef__Group_1_1_1__0");
			builder.put(grammarAccess.getListParametersAccess().getGroup(), "rule__ListParameters__Group__0");
			builder.put(grammarAccess.getListParametersAccess().getGroup_2(), "rule__ListParameters__Group_2__0");
			builder.put(grammarAccess.getLiteralAccess().getGroup(), "rule__Literal__Group__0");
			builder.put(grammarAccess.getLiteralAccess().getGroup_1_0(), "rule__Literal__Group_1_0__0");
			builder.put(grammarAccess.getPredAccess().getGroup(), "rule__Pred__Group__0");
			builder.put(grammarAccess.getPredAccess().getGroup_2(), "rule__Pred__Group_2__0");
			builder.put(grammarAccess.getTermsAccess().getGroup(), "rule__Terms__Group__0");
			builder.put(grammarAccess.getTermsAccess().getGroup_1(), "rule__Terms__Group_1__0");
			builder.put(grammarAccess.getListAccess().getGroup(), "rule__List__Group__0");
			builder.put(grammarAccess.getListAccess().getGroup_2(), "rule__List__Group_2__0");
			builder.put(grammarAccess.getListAccess().getGroup_2_1(), "rule__List__Group_2_1__0");
			builder.put(grammarAccess.getListAccess().getGroup_2_2(), "rule__List__Group_2_2__0");
			builder.put(grammarAccess.getVarAccess().getGroup(), "rule__Var__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup(), "rule__FQN__Group__0");
			builder.put(grammarAccess.getFQNAccess().getGroup_1(), "rule__FQN__Group_1__0");
			builder.put(grammarAccess.getJcmModelAccess().getNameAssignment_2(), "rule__JcmModel__NameAssignment_2");
			builder.put(grammarAccess.getJcmModelAccess().getUsesAssignment_3(), "rule__JcmModel__UsesAssignment_3");
			builder.put(grammarAccess.getJcmModelAccess().getAgentAssignment_7(), "rule__JcmModel__AgentAssignment_7");
			builder.put(grammarAccess.getJcmModelAccess().getWorkspaceAssignment_8(), "rule__JcmModel__WorkspaceAssignment_8");
			builder.put(grammarAccess.getJcmModelAccess().getInstitutionAssignment_9(), "rule__JcmModel__InstitutionAssignment_9");
			builder.put(grammarAccess.getJcmModelAccess().getOrganisationAssignment_10(), "rule__JcmModel__OrganisationAssignment_10");
			builder.put(grammarAccess.getJcmModelAccess().getDclassPathAssignment_11_0(), "rule__JcmModel__DclassPathAssignment_11_0");
			builder.put(grammarAccess.getJcmModelAccess().getDAslPathAssignment_11_1(), "rule__JcmModel__DAslPathAssignment_11_1");
			builder.put(grammarAccess.getJcmModelAccess().getDOrgPathAssignment_11_2(), "rule__JcmModel__DOrgPathAssignment_11_2");
			builder.put(grammarAccess.getJcmModelAccess().getDJavaPathAssignment_11_3(), "rule__JcmModel__DJavaPathAssignment_11_3");
			builder.put(grammarAccess.getJcmModelAccess().getDPlatformAssignment_11_4(), "rule__JcmModel__DPlatformAssignment_11_4");
			builder.put(grammarAccess.getJcmModelAccess().getDNodeAssignment_11_5(), "rule__JcmModel__DNodeAssignment_11_5");
			builder.put(grammarAccess.getDUsesAccess().getFileNameAssignment_1(), "rule__DUses__FileNameAssignment_1");
			builder.put(grammarAccess.getDUsesAccess().getFileNameAssignment_2_1(), "rule__DUses__FileNameAssignment_2_1");
			builder.put(grammarAccess.getDClassPathAccess().getClassPathAssignment_3_0(), "rule__DClassPath__ClassPathAssignment_3_0");
			builder.put(grammarAccess.getDAslPathAccess().getAslPathAssignment_3_0(), "rule__DAslPath__AslPathAssignment_3_0");
			builder.put(grammarAccess.getDOrgPathAccess().getOrgPathAssignment_3_0(), "rule__DOrgPath__OrgPathAssignment_3_0");
			builder.put(grammarAccess.getDJavaPathAccess().getAslPathAssignment_3_0(), "rule__DJavaPath__AslPathAssignment_3_0");
			builder.put(grammarAccess.getDPlatformAccess().getPlatformAssignment_3_0(), "rule__DPlatform__PlatformAssignment_3_0");
			builder.put(grammarAccess.getDNodeAccess().getNameAssignment_1(), "rule__DNode__NameAssignment_1");
			builder.put(grammarAccess.getDNodeAccess().getHostAssignment_3_1(), "rule__DNode__HostAssignment_3_1");
			builder.put(grammarAccess.getAgentAccess().getNameAssignment_1(), "rule__Agent__NameAssignment_1");
			builder.put(grammarAccess.getAgentAccess().getSourceAssignment_2_1(), "rule__Agent__SourceAssignment_2_1");
			builder.put(grammarAccess.getAgentAccess().getInstancesAssignment_3_2_0_2_0_0(), "rule__Agent__InstancesAssignment_3_2_0_2_0_0");
			builder.put(grammarAccess.getAgentAccess().getInstancesAtomAssignment_3_2_0_2_1_0(), "rule__Agent__InstancesAtomAssignment_3_2_0_2_1_0");
			builder.put(grammarAccess.getAgentAccess().getNodeAssignment_3_2_1_2(), "rule__Agent__NodeAssignment_3_2_1_2");
			builder.put(grammarAccess.getAgentAccess().getAgArchAssignment_3_2_2_2_0(), "rule__Agent__AgArchAssignment_3_2_2_2_0");
			builder.put(grammarAccess.getAgentAccess().getAgClassAssignment_3_2_3_2(), "rule__Agent__AgClassAssignment_3_2_3_2");
			builder.put(grammarAccess.getAgentAccess().getAgbbClassAssignment_3_2_4_2(), "rule__Agent__AgbbClassAssignment_3_2_4_2");
			builder.put(grammarAccess.getAgentAccess().getBeliefsAssignment_3_2_5_2_0(), "rule__Agent__BeliefsAssignment_3_2_5_2_0");
			builder.put(grammarAccess.getAgentAccess().getGoalsAssignment_3_2_6_2_0(), "rule__Agent__GoalsAssignment_3_2_6_2_0");
			builder.put(grammarAccess.getAgentAccess().getFocusAssignment_3_2_7_2_0(), "rule__Agent__FocusAssignment_3_2_7_2_0");
			builder.put(grammarAccess.getAgentAccess().getFocusNSAssignment_3_2_7_2_1_1(), "rule__Agent__FocusNSAssignment_3_2_7_2_1_1");
			builder.put(grammarAccess.getAgentAccess().getFocusNodeAssignment_3_2_7_2_2_1(), "rule__Agent__FocusNodeAssignment_3_2_7_2_2_1");
			builder.put(grammarAccess.getAgentAccess().getJoinAssignment_3_2_8_2_0(), "rule__Agent__JoinAssignment_3_2_8_2_0");
			builder.put(grammarAccess.getAgentAccess().getJoinNodeAssignment_3_2_8_2_1_1(), "rule__Agent__JoinNodeAssignment_3_2_8_2_1_1");
			builder.put(grammarAccess.getAgentAccess().getRoleAssignment_3_2_9_2_0(), "rule__Agent__RoleAssignment_3_2_9_2_0");
			builder.put(grammarAccess.getAgentAccess().getGroupAssignment_3_2_9_2_2(), "rule__Agent__GroupAssignment_3_2_9_2_2");
			builder.put(grammarAccess.getAgentAccess().getGroupNodeAssignment_3_2_9_2_3_1(), "rule__Agent__GroupNodeAssignment_3_2_9_2_3_1");
			builder.put(grammarAccess.getAgentAccess().getDebugAssignment_3_2_10_2(), "rule__Agent__DebugAssignment_3_2_10_2");
			builder.put(grammarAccess.getAgentAccess().getVerboseAssignment_3_2_11_2(), "rule__Agent__VerboseAssignment_3_2_11_2");
			builder.put(grammarAccess.getAgentAccess().getNrcbpAssignment_3_2_12_2(), "rule__Agent__NrcbpAssignment_3_2_12_2");
			builder.put(grammarAccess.getAgentAccess().getOtherAssignment_3_2_15_0(), "rule__Agent__OtherAssignment_3_2_15_0");
			builder.put(grammarAccess.getAgentAccess().getStringAssignment_3_2_15_2_0(), "rule__Agent__StringAssignment_3_2_15_2_0");
			builder.put(grammarAccess.getAgentAccess().getValAssignment_3_2_15_2_1(), "rule__Agent__ValAssignment_3_2_15_2_1");
			builder.put(grammarAccess.getAgentAccess().getLiteralAssignment_3_2_15_2_2(), "rule__Agent__LiteralAssignment_3_2_15_2_2");
			builder.put(grammarAccess.getAgentAccess().getVal_realAssignment_3_2_15_2_3(), "rule__Agent__Val_realAssignment_3_2_15_2_3");
			builder.put(grammarAccess.getWorkspaceAccess().getNameAssignment_1(), "rule__Workspace__NameAssignment_1");
			builder.put(grammarAccess.getWorkspaceAccess().getArtifactAssignment_4_0(), "rule__Workspace__ArtifactAssignment_4_0");
			builder.put(grammarAccess.getWorkspaceAccess().getAgentAssignment_4_1_2_0_0(), "rule__Workspace__AgentAssignment_4_1_2_0_0");
			builder.put(grammarAccess.getWorkspaceAccess().getDebugAssignment_4_2_1_1(), "rule__Workspace__DebugAssignment_4_2_1_1");
			builder.put(grammarAccess.getWorkspaceAccess().getNodeAssignment_4_3(), "rule__Workspace__NodeAssignment_4_3");
			builder.put(grammarAccess.getArtifactAccess().getNameAssignment_1(), "rule__Artifact__NameAssignment_1");
			builder.put(grammarAccess.getArtifactAccess().getClassDefAssignment_3(), "rule__Artifact__ClassDefAssignment_3");
			builder.put(grammarAccess.getArtifactAccess().getAgentNSAssignment_4_2_2_0_0(), "rule__Artifact__AgentNSAssignment_4_2_2_0_0");
			builder.put(grammarAccess.getArtifactAccess().getAgentAssignment_4_2_2_1_0(), "rule__Artifact__AgentAssignment_4_2_2_1_0");
			builder.put(grammarAccess.getInstitutionAccess().getNameAssignment_1(), "rule__Institution__NameAssignment_1");
			builder.put(grammarAccess.getInstitutionAccess().getFileNameAssignment_2(), "rule__Institution__FileNameAssignment_2");
			builder.put(grammarAccess.getInstitutionAccess().getWsNamesAssignment_5_0_2_0(), "rule__Institution__WsNamesAssignment_5_0_2_0");
			builder.put(grammarAccess.getInstitutionAccess().getOtherAssignment_5_2_0(), "rule__Institution__OtherAssignment_5_2_0");
			builder.put(grammarAccess.getInstitutionAccess().getStringAssignment_5_2_2_0(), "rule__Institution__StringAssignment_5_2_2_0");
			builder.put(grammarAccess.getInstitutionAccess().getValAssignment_5_2_2_1(), "rule__Institution__ValAssignment_5_2_2_1");
			builder.put(grammarAccess.getInstitutionAccess().getLiteralAssignment_5_2_2_2(), "rule__Institution__LiteralAssignment_5_2_2_2");
			builder.put(grammarAccess.getInstitutionAccess().getVal_realAssignment_5_2_2_3(), "rule__Institution__Val_realAssignment_5_2_2_3");
			builder.put(grammarAccess.getOrganisationAccess().getNameAssignment_1(), "rule__Organisation__NameAssignment_1");
			builder.put(grammarAccess.getOrganisationAccess().getFileNameAssignment_2(), "rule__Organisation__FileNameAssignment_2");
			builder.put(grammarAccess.getOrganisationAccess().getGroupAssignment_5_0(), "rule__Organisation__GroupAssignment_5_0");
			builder.put(grammarAccess.getOrganisationAccess().getSchemeAssignment_5_1(), "rule__Organisation__SchemeAssignment_5_1");
			builder.put(grammarAccess.getOrganisationAccess().getAgentsAssignment_5_2(), "rule__Organisation__AgentsAssignment_5_2");
			builder.put(grammarAccess.getOrganisationAccess().getNodeAssignment_5_3(), "rule__Organisation__NodeAssignment_5_3");
			builder.put(grammarAccess.getOrganisationAccess().getSituatedAssignment_5_4(), "rule__Organisation__SituatedAssignment_5_4");
			builder.put(grammarAccess.getOrganisationAccess().getOtherAssignment_5_5(), "rule__Organisation__OtherAssignment_5_5");
			builder.put(grammarAccess.getOFileNameAccess().getNameAssignment_1(), "rule__OFileName__NameAssignment_1");
			builder.put(grammarAccess.getONodeAccess().getNameAssignment_2(), "rule__ONode__NameAssignment_2");
			builder.put(grammarAccess.getOSituatedAccess().getNameAssignment_2(), "rule__OSituated__NameAssignment_2");
			builder.put(grammarAccess.getOAgentsAccess().getAgentAssignment_3_0_0(), "rule__OAgents__AgentAssignment_3_0_0");
			builder.put(grammarAccess.getOOthersAccess().getNameAssignment_0(), "rule__OOthers__NameAssignment_0");
			builder.put(grammarAccess.getOOthersAccess().getStringAssignment_2_0(), "rule__OOthers__StringAssignment_2_0");
			builder.put(grammarAccess.getOOthersAccess().getValAssignment_2_1(), "rule__OOthers__ValAssignment_2_1");
			builder.put(grammarAccess.getOOthersAccess().getLiteralAssignment_2_2(), "rule__OOthers__LiteralAssignment_2_2");
			builder.put(grammarAccess.getOOthersAccess().getVal_realAssignment_2_3(), "rule__OOthers__Val_realAssignment_2_3");
			builder.put(grammarAccess.getGroupAccess().getNameAssignment_1(), "rule__Group__NameAssignment_1");
			builder.put(grammarAccess.getGroupAccess().getKindAssignment_3(), "rule__Group__KindAssignment_3");
			builder.put(grammarAccess.getGroupAccess().getGroupAssignment_4_2_0(), "rule__Group__GroupAssignment_4_2_0");
			builder.put(grammarAccess.getGroupAccess().getResponsibleForAssignment_4_2_1_2_0(), "rule__Group__ResponsibleForAssignment_4_2_1_2_0");
			builder.put(grammarAccess.getGroupAccess().getOwnerAssignment_4_2_2_2(), "rule__Group__OwnerAssignment_4_2_2_2");
			builder.put(grammarAccess.getGroupAccess().getDebugAssignment_4_2_3_1_1(), "rule__Group__DebugAssignment_4_2_3_1_1");
			builder.put(grammarAccess.getGroupAccess().getOtherAssignment_4_2_4_0(), "rule__Group__OtherAssignment_4_2_4_0");
			builder.put(grammarAccess.getGroupAccess().getStringAssignment_4_2_4_2_0(), "rule__Group__StringAssignment_4_2_4_2_0");
			builder.put(grammarAccess.getGroupAccess().getValAssignment_4_2_4_2_1(), "rule__Group__ValAssignment_4_2_4_2_1");
			builder.put(grammarAccess.getGroupAccess().getLiteralAssignment_4_2_4_2_2(), "rule__Group__LiteralAssignment_4_2_4_2_2");
			builder.put(grammarAccess.getGroupAccess().getVal_realAssignment_4_2_4_2_3(), "rule__Group__Val_realAssignment_4_2_4_2_3");
			builder.put(grammarAccess.getGroupAccess().getAgentAssignment_4_2_5_2_0(), "rule__Group__AgentAssignment_4_2_5_2_0");
			builder.put(grammarAccess.getGroupAccess().getRoleAssignment_4_2_5_2_1(), "rule__Group__RoleAssignment_4_2_5_2_1");
			builder.put(grammarAccess.getSchemeAccess().getNameAssignment_1(), "rule__Scheme__NameAssignment_1");
			builder.put(grammarAccess.getSchemeAccess().getKindAssignment_3(), "rule__Scheme__KindAssignment_3");
			builder.put(grammarAccess.getSchemeAccess().getDebugAssignment_4_2_0_1_1(), "rule__Scheme__DebugAssignment_4_2_0_1_1");
			builder.put(grammarAccess.getSchemeAccess().getOwnerAssignment_4_2_1_2(), "rule__Scheme__OwnerAssignment_4_2_1_2");
			builder.put(grammarAccess.getSchemeAccess().getOtherAssignment_4_2_2_0(), "rule__Scheme__OtherAssignment_4_2_2_0");
			builder.put(grammarAccess.getSchemeAccess().getStringAssignment_4_2_2_2_0(), "rule__Scheme__StringAssignment_4_2_2_2_0");
			builder.put(grammarAccess.getSchemeAccess().getValAssignment_4_2_2_2_1(), "rule__Scheme__ValAssignment_4_2_2_2_1");
			builder.put(grammarAccess.getSchemeAccess().getLiteralAssignment_4_2_2_2_2(), "rule__Scheme__LiteralAssignment_4_2_2_2_2");
			builder.put(grammarAccess.getSchemeAccess().getVal_realAssignment_4_2_2_2_3(), "rule__Scheme__Val_realAssignment_4_2_2_2_3");
			builder.put(grammarAccess.getHostAccess().getNameAssignment_0_0(), "rule__Host__NameAssignment_0_0");
			builder.put(grammarAccess.getHostAccess().getStringAssignment_0_1(), "rule__Host__StringAssignment_0_1");
			builder.put(grammarAccess.getHostAccess().getIpAssignment_0_2(), "rule__Host__IpAssignment_0_2");
			builder.put(grammarAccess.getHostAccess().getValAssignment_1_1(), "rule__Host__ValAssignment_1_1");
			builder.put(grammarAccess.getFileNameAccess().getNameAssignment_1_0_4(), "rule__FileName__NameAssignment_1_0_4");
			builder.put(grammarAccess.getFileNameAccess().getStringAssignment_1_1(), "rule__FileName__StringAssignment_1_1");
			builder.put(grammarAccess.getClassDefAccess().getInfrastructureAssignment_0(), "rule__ClassDef__InfrastructureAssignment_0");
			builder.put(grammarAccess.getClassDefAccess().getParameterAssignment_1_1_0(), "rule__ClassDef__ParameterAssignment_1_1_0");
			builder.put(grammarAccess.getClassDefAccess().getParameterAssignment_1_1_1_1(), "rule__ClassDef__ParameterAssignment_1_1_1_1");
			builder.put(grammarAccess.getParameterAccess().getClassDefAssignment_0(), "rule__Parameter__ClassDefAssignment_0");
			builder.put(grammarAccess.getParameterAccess().getValAssignment_1(), "rule__Parameter__ValAssignment_1");
			builder.put(grammarAccess.getParameterAccess().getVal_realAssignment_2(), "rule__Parameter__Val_realAssignment_2");
			builder.put(grammarAccess.getParameterAccess().getStringAssignment_3(), "rule__Parameter__StringAssignment_3");
			builder.put(grammarAccess.getParameterAccess().getListParametersAssignment_4(), "rule__Parameter__ListParametersAssignment_4");
			builder.put(grammarAccess.getListParametersAccess().getParameterAssignment_1(), "rule__ListParameters__ParameterAssignment_1");
			builder.put(grammarAccess.getListParametersAccess().getParameterAssignment_2_1(), "rule__ListParameters__ParameterAssignment_2_1");
			builder.put(grammarAccess.getLiteralAccess().getPredAssignment_1_0_1_0(), "rule__Literal__PredAssignment_1_0_1_0");
			builder.put(grammarAccess.getLiteralAccess().getVarAssignment_1_0_1_1(), "rule__Literal__VarAssignment_1_0_1_1");
			builder.put(grammarAccess.getPredAccess().getAtomAssignment_1_0(), "rule__Pred__AtomAssignment_1_0");
			builder.put(grammarAccess.getPredAccess().getTermsAssignment_2_1(), "rule__Pred__TermsAssignment_2_1");
			builder.put(grammarAccess.getPredAccess().getListAssignment_3(), "rule__Pred__ListAssignment_3");
			builder.put(grammarAccess.getTermsAccess().getTermAssignment_0(), "rule__Terms__TermAssignment_0");
			builder.put(grammarAccess.getTermsAccess().getTermAssignment_1_1(), "rule__Terms__TermAssignment_1_1");
			builder.put(grammarAccess.getTermAccess().getListAssignment_0(), "rule__Term__ListAssignment_0");
			builder.put(grammarAccess.getTermAccess().getLiteralAssignment_1(), "rule__Term__LiteralAssignment_1");
			builder.put(grammarAccess.getTermAccess().getStringAssignment_2(), "rule__Term__StringAssignment_2");
			builder.put(grammarAccess.getTermAccess().getValAssignment_3(), "rule__Term__ValAssignment_3");
			builder.put(grammarAccess.getTermAccess().getVal_realAssignment_4(), "rule__Term__Val_realAssignment_4");
			builder.put(grammarAccess.getListAccess().getTermAssignment_2_0(), "rule__List__TermAssignment_2_0");
			builder.put(grammarAccess.getListAccess().getTermAssignment_2_1_1(), "rule__List__TermAssignment_2_1_1");
			builder.put(grammarAccess.getListAccess().getVarAssignment_2_2_1_0(), "rule__List__VarAssignment_2_2_1_0");
			builder.put(grammarAccess.getListAccess().getUnnamedvarAssignment_2_2_1_1(), "rule__List__UnnamedvarAssignment_2_2_1_1");
			builder.put(grammarAccess.getListAccess().getListAssignment_2_2_1_2(), "rule__List__ListAssignment_2_2_1_2");
			builder.put(grammarAccess.getVarAccess().getVarAssignment_0_0(), "rule__Var__VarAssignment_0_0");
			builder.put(grammarAccess.getVarAccess().getUnnamedvarAssignment_0_1(), "rule__Var__UnnamedvarAssignment_0_1");
			builder.put(grammarAccess.getVarAccess().getListAssignment_1(), "rule__Var__ListAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private JcmGrammarAccess grammarAccess;

	@Override
	protected InternalJcmParser createParser() {
		InternalJcmParser result = new InternalJcmParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT" };
	}

	public JcmGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(JcmGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
