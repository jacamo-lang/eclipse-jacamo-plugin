package jacamoide.xtext.jcm.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import jacamoide.xtext.jcm.services.JcmGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJcmParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ATOM", "RULE_INT_LITERAL", "RULE_STRING", "RULE_REAL_LITERAL", "RULE_IP", "RULE_VART", "RULE_UNNAMEDVART", "RULE_NEWLINE", "RULE_SL_COMMENT", "RULE_LCLETTER", "RULE_CHAR", "RULE_UCLETTER", "RULE_LETTER", "RULE_DIGIT", "RULE_INTEGERNUMBER", "RULE_HEXPREFIX", "RULE_HEXDIGIT", "RULE_WS", "RULE_ML_COMMENT", "'mas'", "'{'", "'}'", "'uses'", "','", "'class-path'", "':'", "'asl-path'", "'org-path'", "'java-path'", "'platform'", "'node'", "'running'", "'@'", "'agent'", "'instances'", "'ag-arch'", "'ag-class'", "'ag-bb-class'", "'beliefs'", "'goals'", "'focus'", "'::'", "'join'", "'roles'", "'in'", "'debug'", "'verbose'", "'nrcbp'", "'events'", "'discard'", "'requeue'", "'retrieve'", "'intBels'", "'sameFocus'", "'newFocus'", "'workspace'", "'agents'", "'*'", "'artifact'", "'focused-by'", "'institution'", "'workspaces'", "'organisation'", "'situated'", "'group'", "'responsible-for'", "'owner'", "'players'", "'scheme'", "'/'", "'-'", "'.'", "'..'", "'('", "')'", "'['", "']'", "'~'", "'true'", "'false'", "'begin'", "'end'", "'|'"
    };
    public static final int T__50=50;
    public static final int RULE_LCLETTER=13;
    public static final int T__59=59;
    public static final int RULE_ATOM=4;
    public static final int T__55=55;
    public static final int RULE_CHAR=14;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_HEXPREFIX=19;
    public static final int T__60=60;
    public static final int RULE_HEXDIGIT=20;
    public static final int T__61=61;
    public static final int RULE_UCLETTER=15;
    public static final int RULE_DIGIT=17;
    public static final int RULE_INT_LITERAL=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=22;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int RULE_VART=9;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_NEWLINE=11;
    public static final int RULE_STRING=6;
    public static final int RULE_REAL_LITERAL=7;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_IP=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=21;
    public static final int RULE_UNNAMEDVART=10;
    public static final int RULE_INTEGERNUMBER=18;
    public static final int RULE_LETTER=16;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalJcmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJcmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJcmParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJcm.g"; }



     	private JcmGrammarAccess grammarAccess;

        public InternalJcmParser(TokenStream input, JcmGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "JcmModel";
       	}

       	@Override
       	protected JcmGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleJcmModel"
    // InternalJcm.g:64:1: entryRuleJcmModel returns [EObject current=null] : iv_ruleJcmModel= ruleJcmModel EOF ;
    public final EObject entryRuleJcmModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJcmModel = null;


        try {
            // InternalJcm.g:64:49: (iv_ruleJcmModel= ruleJcmModel EOF )
            // InternalJcm.g:65:2: iv_ruleJcmModel= ruleJcmModel EOF
            {
             newCompositeNode(grammarAccess.getJcmModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJcmModel=ruleJcmModel();

            state._fsp--;

             current =iv_ruleJcmModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJcmModel"


    // $ANTLR start "ruleJcmModel"
    // InternalJcm.g:71:1: ruleJcmModel returns [EObject current=null] : ( ( ruleEOL )* otherlv_1= 'mas' ( (lv_name_2_0= RULE_ATOM ) ) ( (lv_uses_3_0= ruleDUses ) )? ( ruleEOL )* otherlv_5= '{' ( ruleEOL )* ( (lv_agent_7_0= ruleAgent ) )* ( (lv_workspace_8_0= ruleWorkspace ) )* ( (lv_institution_9_0= ruleInstitution ) )* ( (lv_organisation_10_0= ruleOrganisation ) )* ( ( (lv_dclassPath_11_0= ruleDClassPath ) ) | ( (lv_dAslPath_12_0= ruleDAslPath ) ) | ( (lv_dOrgPath_13_0= ruleDOrgPath ) ) | ( (lv_dJavaPath_14_0= ruleDJavaPath ) ) | ( (lv_dPlatform_15_0= ruleDPlatform ) ) | ( (lv_dNode_16_0= ruleDNode ) ) )* otherlv_17= '}' ( ruleEOL )* ) ;
    public final EObject ruleJcmModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_5=null;
        Token otherlv_17=null;
        EObject lv_uses_3_0 = null;

        EObject lv_agent_7_0 = null;

        EObject lv_workspace_8_0 = null;

        EObject lv_institution_9_0 = null;

        EObject lv_organisation_10_0 = null;

        EObject lv_dclassPath_11_0 = null;

        EObject lv_dAslPath_12_0 = null;

        EObject lv_dOrgPath_13_0 = null;

        EObject lv_dJavaPath_14_0 = null;

        EObject lv_dPlatform_15_0 = null;

        EObject lv_dNode_16_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:77:2: ( ( ( ruleEOL )* otherlv_1= 'mas' ( (lv_name_2_0= RULE_ATOM ) ) ( (lv_uses_3_0= ruleDUses ) )? ( ruleEOL )* otherlv_5= '{' ( ruleEOL )* ( (lv_agent_7_0= ruleAgent ) )* ( (lv_workspace_8_0= ruleWorkspace ) )* ( (lv_institution_9_0= ruleInstitution ) )* ( (lv_organisation_10_0= ruleOrganisation ) )* ( ( (lv_dclassPath_11_0= ruleDClassPath ) ) | ( (lv_dAslPath_12_0= ruleDAslPath ) ) | ( (lv_dOrgPath_13_0= ruleDOrgPath ) ) | ( (lv_dJavaPath_14_0= ruleDJavaPath ) ) | ( (lv_dPlatform_15_0= ruleDPlatform ) ) | ( (lv_dNode_16_0= ruleDNode ) ) )* otherlv_17= '}' ( ruleEOL )* ) )
            // InternalJcm.g:78:2: ( ( ruleEOL )* otherlv_1= 'mas' ( (lv_name_2_0= RULE_ATOM ) ) ( (lv_uses_3_0= ruleDUses ) )? ( ruleEOL )* otherlv_5= '{' ( ruleEOL )* ( (lv_agent_7_0= ruleAgent ) )* ( (lv_workspace_8_0= ruleWorkspace ) )* ( (lv_institution_9_0= ruleInstitution ) )* ( (lv_organisation_10_0= ruleOrganisation ) )* ( ( (lv_dclassPath_11_0= ruleDClassPath ) ) | ( (lv_dAslPath_12_0= ruleDAslPath ) ) | ( (lv_dOrgPath_13_0= ruleDOrgPath ) ) | ( (lv_dJavaPath_14_0= ruleDJavaPath ) ) | ( (lv_dPlatform_15_0= ruleDPlatform ) ) | ( (lv_dNode_16_0= ruleDNode ) ) )* otherlv_17= '}' ( ruleEOL )* )
            {
            // InternalJcm.g:78:2: ( ( ruleEOL )* otherlv_1= 'mas' ( (lv_name_2_0= RULE_ATOM ) ) ( (lv_uses_3_0= ruleDUses ) )? ( ruleEOL )* otherlv_5= '{' ( ruleEOL )* ( (lv_agent_7_0= ruleAgent ) )* ( (lv_workspace_8_0= ruleWorkspace ) )* ( (lv_institution_9_0= ruleInstitution ) )* ( (lv_organisation_10_0= ruleOrganisation ) )* ( ( (lv_dclassPath_11_0= ruleDClassPath ) ) | ( (lv_dAslPath_12_0= ruleDAslPath ) ) | ( (lv_dOrgPath_13_0= ruleDOrgPath ) ) | ( (lv_dJavaPath_14_0= ruleDJavaPath ) ) | ( (lv_dPlatform_15_0= ruleDPlatform ) ) | ( (lv_dNode_16_0= ruleDNode ) ) )* otherlv_17= '}' ( ruleEOL )* )
            // InternalJcm.g:79:3: ( ruleEOL )* otherlv_1= 'mas' ( (lv_name_2_0= RULE_ATOM ) ) ( (lv_uses_3_0= ruleDUses ) )? ( ruleEOL )* otherlv_5= '{' ( ruleEOL )* ( (lv_agent_7_0= ruleAgent ) )* ( (lv_workspace_8_0= ruleWorkspace ) )* ( (lv_institution_9_0= ruleInstitution ) )* ( (lv_organisation_10_0= ruleOrganisation ) )* ( ( (lv_dclassPath_11_0= ruleDClassPath ) ) | ( (lv_dAslPath_12_0= ruleDAslPath ) ) | ( (lv_dOrgPath_13_0= ruleDOrgPath ) ) | ( (lv_dJavaPath_14_0= ruleDJavaPath ) ) | ( (lv_dPlatform_15_0= ruleDPlatform ) ) | ( (lv_dNode_16_0= ruleDNode ) ) )* otherlv_17= '}' ( ruleEOL )*
            {
            // InternalJcm.g:79:3: ( ruleEOL )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_NEWLINE && LA1_0<=RULE_SL_COMMENT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJcm.g:80:4: ruleEOL
            	    {

            	    				newCompositeNode(grammarAccess.getJcmModelAccess().getEOLParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    ruleEOL();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getJcmModelAccess().getMasKeyword_1());
            		
            // InternalJcm.g:92:3: ( (lv_name_2_0= RULE_ATOM ) )
            // InternalJcm.g:93:4: (lv_name_2_0= RULE_ATOM )
            {
            // InternalJcm.g:93:4: (lv_name_2_0= RULE_ATOM )
            // InternalJcm.g:94:5: lv_name_2_0= RULE_ATOM
            {
            lv_name_2_0=(Token)match(input,RULE_ATOM,FOLLOW_5); 

            					newLeafNode(lv_name_2_0, grammarAccess.getJcmModelAccess().getNameATOMTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJcmModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"jacamoide.xtext.jcm.Jcm.ATOM");
            				

            }


            }

            // InternalJcm.g:110:3: ( (lv_uses_3_0= ruleDUses ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalJcm.g:111:4: (lv_uses_3_0= ruleDUses )
                    {
                    // InternalJcm.g:111:4: (lv_uses_3_0= ruleDUses )
                    // InternalJcm.g:112:5: lv_uses_3_0= ruleDUses
                    {

                    					newCompositeNode(grammarAccess.getJcmModelAccess().getUsesDUsesParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_uses_3_0=ruleDUses();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getJcmModelRule());
                    					}
                    					set(
                    						current,
                    						"uses",
                    						lv_uses_3_0,
                    						"jacamoide.xtext.jcm.Jcm.DUses");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalJcm.g:129:3: ( ruleEOL )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_NEWLINE && LA3_0<=RULE_SL_COMMENT)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJcm.g:130:4: ruleEOL
            	    {

            	    				newCompositeNode(grammarAccess.getJcmModelAccess().getEOLParserRuleCall_4());
            	    			
            	    pushFollow(FOLLOW_6);
            	    ruleEOL();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getJcmModelAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalJcm.g:142:3: ( ruleEOL )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_NEWLINE && LA4_0<=RULE_SL_COMMENT)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalJcm.g:143:4: ruleEOL
            	    {

            	    				newCompositeNode(grammarAccess.getJcmModelAccess().getEOLParserRuleCall_6());
            	    			
            	    pushFollow(FOLLOW_7);
            	    ruleEOL();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalJcm.g:151:3: ( (lv_agent_7_0= ruleAgent ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==37) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalJcm.g:152:4: (lv_agent_7_0= ruleAgent )
            	    {
            	    // InternalJcm.g:152:4: (lv_agent_7_0= ruleAgent )
            	    // InternalJcm.g:153:5: lv_agent_7_0= ruleAgent
            	    {

            	    					newCompositeNode(grammarAccess.getJcmModelAccess().getAgentAgentParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_agent_7_0=ruleAgent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJcmModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"agent",
            	    						lv_agent_7_0,
            	    						"jacamoide.xtext.jcm.Jcm.Agent");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalJcm.g:170:3: ( (lv_workspace_8_0= ruleWorkspace ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==59) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalJcm.g:171:4: (lv_workspace_8_0= ruleWorkspace )
            	    {
            	    // InternalJcm.g:171:4: (lv_workspace_8_0= ruleWorkspace )
            	    // InternalJcm.g:172:5: lv_workspace_8_0= ruleWorkspace
            	    {

            	    					newCompositeNode(grammarAccess.getJcmModelAccess().getWorkspaceWorkspaceParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_workspace_8_0=ruleWorkspace();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJcmModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"workspace",
            	    						lv_workspace_8_0,
            	    						"jacamoide.xtext.jcm.Jcm.Workspace");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalJcm.g:189:3: ( (lv_institution_9_0= ruleInstitution ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==64) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalJcm.g:190:4: (lv_institution_9_0= ruleInstitution )
            	    {
            	    // InternalJcm.g:190:4: (lv_institution_9_0= ruleInstitution )
            	    // InternalJcm.g:191:5: lv_institution_9_0= ruleInstitution
            	    {

            	    					newCompositeNode(grammarAccess.getJcmModelAccess().getInstitutionInstitutionParserRuleCall_9_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_institution_9_0=ruleInstitution();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJcmModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"institution",
            	    						lv_institution_9_0,
            	    						"jacamoide.xtext.jcm.Jcm.Institution");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalJcm.g:208:3: ( (lv_organisation_10_0= ruleOrganisation ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==66) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalJcm.g:209:4: (lv_organisation_10_0= ruleOrganisation )
            	    {
            	    // InternalJcm.g:209:4: (lv_organisation_10_0= ruleOrganisation )
            	    // InternalJcm.g:210:5: lv_organisation_10_0= ruleOrganisation
            	    {

            	    					newCompositeNode(grammarAccess.getJcmModelAccess().getOrganisationOrganisationParserRuleCall_10_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_organisation_10_0=ruleOrganisation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getJcmModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"organisation",
            	    						lv_organisation_10_0,
            	    						"jacamoide.xtext.jcm.Jcm.Organisation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalJcm.g:227:3: ( ( (lv_dclassPath_11_0= ruleDClassPath ) ) | ( (lv_dAslPath_12_0= ruleDAslPath ) ) | ( (lv_dOrgPath_13_0= ruleDOrgPath ) ) | ( (lv_dJavaPath_14_0= ruleDJavaPath ) ) | ( (lv_dPlatform_15_0= ruleDPlatform ) ) | ( (lv_dNode_16_0= ruleDNode ) ) )*
            loop9:
            do {
                int alt9=7;
                switch ( input.LA(1) ) {
                case 28:
                    {
                    alt9=1;
                    }
                    break;
                case 30:
                    {
                    alt9=2;
                    }
                    break;
                case 31:
                    {
                    alt9=3;
                    }
                    break;
                case 32:
                    {
                    alt9=4;
                    }
                    break;
                case 33:
                    {
                    alt9=5;
                    }
                    break;
                case 34:
                    {
                    alt9=6;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // InternalJcm.g:228:4: ( (lv_dclassPath_11_0= ruleDClassPath ) )
            	    {
            	    // InternalJcm.g:228:4: ( (lv_dclassPath_11_0= ruleDClassPath ) )
            	    // InternalJcm.g:229:5: (lv_dclassPath_11_0= ruleDClassPath )
            	    {
            	    // InternalJcm.g:229:5: (lv_dclassPath_11_0= ruleDClassPath )
            	    // InternalJcm.g:230:6: lv_dclassPath_11_0= ruleDClassPath
            	    {

            	    						newCompositeNode(grammarAccess.getJcmModelAccess().getDclassPathDClassPathParserRuleCall_11_0_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_dclassPath_11_0=ruleDClassPath();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJcmModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dclassPath",
            	    							lv_dclassPath_11_0,
            	    							"jacamoide.xtext.jcm.Jcm.DClassPath");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalJcm.g:248:4: ( (lv_dAslPath_12_0= ruleDAslPath ) )
            	    {
            	    // InternalJcm.g:248:4: ( (lv_dAslPath_12_0= ruleDAslPath ) )
            	    // InternalJcm.g:249:5: (lv_dAslPath_12_0= ruleDAslPath )
            	    {
            	    // InternalJcm.g:249:5: (lv_dAslPath_12_0= ruleDAslPath )
            	    // InternalJcm.g:250:6: lv_dAslPath_12_0= ruleDAslPath
            	    {

            	    						newCompositeNode(grammarAccess.getJcmModelAccess().getDAslPathDAslPathParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_dAslPath_12_0=ruleDAslPath();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJcmModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dAslPath",
            	    							lv_dAslPath_12_0,
            	    							"jacamoide.xtext.jcm.Jcm.DAslPath");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalJcm.g:268:4: ( (lv_dOrgPath_13_0= ruleDOrgPath ) )
            	    {
            	    // InternalJcm.g:268:4: ( (lv_dOrgPath_13_0= ruleDOrgPath ) )
            	    // InternalJcm.g:269:5: (lv_dOrgPath_13_0= ruleDOrgPath )
            	    {
            	    // InternalJcm.g:269:5: (lv_dOrgPath_13_0= ruleDOrgPath )
            	    // InternalJcm.g:270:6: lv_dOrgPath_13_0= ruleDOrgPath
            	    {

            	    						newCompositeNode(grammarAccess.getJcmModelAccess().getDOrgPathDOrgPathParserRuleCall_11_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_dOrgPath_13_0=ruleDOrgPath();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJcmModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dOrgPath",
            	    							lv_dOrgPath_13_0,
            	    							"jacamoide.xtext.jcm.Jcm.DOrgPath");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalJcm.g:288:4: ( (lv_dJavaPath_14_0= ruleDJavaPath ) )
            	    {
            	    // InternalJcm.g:288:4: ( (lv_dJavaPath_14_0= ruleDJavaPath ) )
            	    // InternalJcm.g:289:5: (lv_dJavaPath_14_0= ruleDJavaPath )
            	    {
            	    // InternalJcm.g:289:5: (lv_dJavaPath_14_0= ruleDJavaPath )
            	    // InternalJcm.g:290:6: lv_dJavaPath_14_0= ruleDJavaPath
            	    {

            	    						newCompositeNode(grammarAccess.getJcmModelAccess().getDJavaPathDJavaPathParserRuleCall_11_3_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_dJavaPath_14_0=ruleDJavaPath();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJcmModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dJavaPath",
            	    							lv_dJavaPath_14_0,
            	    							"jacamoide.xtext.jcm.Jcm.DJavaPath");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalJcm.g:308:4: ( (lv_dPlatform_15_0= ruleDPlatform ) )
            	    {
            	    // InternalJcm.g:308:4: ( (lv_dPlatform_15_0= ruleDPlatform ) )
            	    // InternalJcm.g:309:5: (lv_dPlatform_15_0= ruleDPlatform )
            	    {
            	    // InternalJcm.g:309:5: (lv_dPlatform_15_0= ruleDPlatform )
            	    // InternalJcm.g:310:6: lv_dPlatform_15_0= ruleDPlatform
            	    {

            	    						newCompositeNode(grammarAccess.getJcmModelAccess().getDPlatformDPlatformParserRuleCall_11_4_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_dPlatform_15_0=ruleDPlatform();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJcmModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dPlatform",
            	    							lv_dPlatform_15_0,
            	    							"jacamoide.xtext.jcm.Jcm.DPlatform");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalJcm.g:328:4: ( (lv_dNode_16_0= ruleDNode ) )
            	    {
            	    // InternalJcm.g:328:4: ( (lv_dNode_16_0= ruleDNode ) )
            	    // InternalJcm.g:329:5: (lv_dNode_16_0= ruleDNode )
            	    {
            	    // InternalJcm.g:329:5: (lv_dNode_16_0= ruleDNode )
            	    // InternalJcm.g:330:6: lv_dNode_16_0= ruleDNode
            	    {

            	    						newCompositeNode(grammarAccess.getJcmModelAccess().getDNodeDNodeParserRuleCall_11_5_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_dNode_16_0=ruleDNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getJcmModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"dNode",
            	    							lv_dNode_16_0,
            	    							"jacamoide.xtext.jcm.Jcm.DNode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_17=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_17, grammarAccess.getJcmModelAccess().getRightCurlyBracketKeyword_12());
            		
            // InternalJcm.g:352:3: ( ruleEOL )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_NEWLINE && LA10_0<=RULE_SL_COMMENT)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalJcm.g:353:4: ruleEOL
            	    {

            	    				newCompositeNode(grammarAccess.getJcmModelAccess().getEOLParserRuleCall_13());
            	    			
            	    pushFollow(FOLLOW_13);
            	    ruleEOL();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJcmModel"


    // $ANTLR start "entryRuleDUses"
    // InternalJcm.g:365:1: entryRuleDUses returns [EObject current=null] : iv_ruleDUses= ruleDUses EOF ;
    public final EObject entryRuleDUses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDUses = null;


        try {
            // InternalJcm.g:365:46: (iv_ruleDUses= ruleDUses EOF )
            // InternalJcm.g:366:2: iv_ruleDUses= ruleDUses EOF
            {
             newCompositeNode(grammarAccess.getDUsesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDUses=ruleDUses();

            state._fsp--;

             current =iv_ruleDUses; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDUses"


    // $ANTLR start "ruleDUses"
    // InternalJcm.g:372:1: ruleDUses returns [EObject current=null] : (otherlv_0= 'uses' ( (lv_fileName_1_0= ruleFileName ) ) (otherlv_2= ',' ( (lv_fileName_3_0= ruleFileName ) ) )* ) ;
    public final EObject ruleDUses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fileName_1_0 = null;

        EObject lv_fileName_3_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:378:2: ( (otherlv_0= 'uses' ( (lv_fileName_1_0= ruleFileName ) ) (otherlv_2= ',' ( (lv_fileName_3_0= ruleFileName ) ) )* ) )
            // InternalJcm.g:379:2: (otherlv_0= 'uses' ( (lv_fileName_1_0= ruleFileName ) ) (otherlv_2= ',' ( (lv_fileName_3_0= ruleFileName ) ) )* )
            {
            // InternalJcm.g:379:2: (otherlv_0= 'uses' ( (lv_fileName_1_0= ruleFileName ) ) (otherlv_2= ',' ( (lv_fileName_3_0= ruleFileName ) ) )* )
            // InternalJcm.g:380:3: otherlv_0= 'uses' ( (lv_fileName_1_0= ruleFileName ) ) (otherlv_2= ',' ( (lv_fileName_3_0= ruleFileName ) ) )*
            {
            otherlv_0=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getDUsesAccess().getUsesKeyword_0());
            		
            // InternalJcm.g:384:3: ( (lv_fileName_1_0= ruleFileName ) )
            // InternalJcm.g:385:4: (lv_fileName_1_0= ruleFileName )
            {
            // InternalJcm.g:385:4: (lv_fileName_1_0= ruleFileName )
            // InternalJcm.g:386:5: lv_fileName_1_0= ruleFileName
            {

            					newCompositeNode(grammarAccess.getDUsesAccess().getFileNameFileNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_15);
            lv_fileName_1_0=ruleFileName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDUsesRule());
            					}
            					add(
            						current,
            						"fileName",
            						lv_fileName_1_0,
            						"jacamoide.xtext.jcm.Jcm.FileName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJcm.g:403:3: (otherlv_2= ',' ( (lv_fileName_3_0= ruleFileName ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==27) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJcm.g:404:4: otherlv_2= ',' ( (lv_fileName_3_0= ruleFileName ) )
            	    {
            	    otherlv_2=(Token)match(input,27,FOLLOW_14); 

            	    				newLeafNode(otherlv_2, grammarAccess.getDUsesAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalJcm.g:408:4: ( (lv_fileName_3_0= ruleFileName ) )
            	    // InternalJcm.g:409:5: (lv_fileName_3_0= ruleFileName )
            	    {
            	    // InternalJcm.g:409:5: (lv_fileName_3_0= ruleFileName )
            	    // InternalJcm.g:410:6: lv_fileName_3_0= ruleFileName
            	    {

            	    						newCompositeNode(grammarAccess.getDUsesAccess().getFileNameFileNameParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_fileName_3_0=ruleFileName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDUsesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"fileName",
            	    							lv_fileName_3_0,
            	    							"jacamoide.xtext.jcm.Jcm.FileName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDUses"


    // $ANTLR start "entryRuleDClassPath"
    // InternalJcm.g:432:1: entryRuleDClassPath returns [EObject current=null] : iv_ruleDClassPath= ruleDClassPath EOF ;
    public final EObject entryRuleDClassPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDClassPath = null;


        try {
            // InternalJcm.g:432:51: (iv_ruleDClassPath= ruleDClassPath EOF )
            // InternalJcm.g:433:2: iv_ruleDClassPath= ruleDClassPath EOF
            {
             newCompositeNode(grammarAccess.getDClassPathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDClassPath=ruleDClassPath();

            state._fsp--;

             current =iv_ruleDClassPath; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDClassPath"


    // $ANTLR start "ruleDClassPath"
    // InternalJcm.g:439:1: ruleDClassPath returns [EObject current=null] : ( () otherlv_1= 'class-path' otherlv_2= ':' ( ( (lv_classPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* ) ;
    public final EObject ruleDClassPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_classPath_3_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:445:2: ( ( () otherlv_1= 'class-path' otherlv_2= ':' ( ( (lv_classPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* ) )
            // InternalJcm.g:446:2: ( () otherlv_1= 'class-path' otherlv_2= ':' ( ( (lv_classPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* )
            {
            // InternalJcm.g:446:2: ( () otherlv_1= 'class-path' otherlv_2= ':' ( ( (lv_classPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* )
            // InternalJcm.g:447:3: () otherlv_1= 'class-path' otherlv_2= ':' ( ( (lv_classPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )*
            {
            // InternalJcm.g:447:3: ()
            // InternalJcm.g:448:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDClassPathAccess().getDClassPathAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDClassPathAccess().getClassPathKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getDClassPathAccess().getColonKeyword_2());
            		
            // InternalJcm.g:462:3: ( ( (lv_classPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ATOM||LA13_0==RULE_STRING||(LA13_0>=73 && LA13_0<=76)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalJcm.g:463:4: ( (lv_classPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+
            	    {
            	    // InternalJcm.g:463:4: ( (lv_classPath_3_0= ruleFileName ) )
            	    // InternalJcm.g:464:5: (lv_classPath_3_0= ruleFileName )
            	    {
            	    // InternalJcm.g:464:5: (lv_classPath_3_0= ruleFileName )
            	    // InternalJcm.g:465:6: lv_classPath_3_0= ruleFileName
            	    {

            	    						newCompositeNode(grammarAccess.getDClassPathAccess().getClassPathFileNameParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_classPath_3_0=ruleFileName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDClassPathRule());
            	    						}
            	    						add(
            	    							current,
            	    							"classPath",
            	    							lv_classPath_3_0,
            	    							"jacamoide.xtext.jcm.Jcm.FileName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalJcm.g:482:4: ( ruleEOL | otherlv_5= ',' )+
            	    int cnt12=0;
            	    loop12:
            	    do {
            	        int alt12=3;
            	        int LA12_0 = input.LA(1);

            	        if ( ((LA12_0>=RULE_NEWLINE && LA12_0<=RULE_SL_COMMENT)) ) {
            	            alt12=1;
            	        }
            	        else if ( (LA12_0==27) ) {
            	            alt12=2;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalJcm.g:483:5: ruleEOL
            	    	    {

            	    	    					newCompositeNode(grammarAccess.getDClassPathAccess().getEOLParserRuleCall_3_1_0());
            	    	    				
            	    	    pushFollow(FOLLOW_19);
            	    	    ruleEOL();

            	    	    state._fsp--;


            	    	    					afterParserOrEnumRuleCall();
            	    	    				

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalJcm.g:491:5: otherlv_5= ','
            	    	    {
            	    	    otherlv_5=(Token)match(input,27,FOLLOW_19); 

            	    	    					newLeafNode(otherlv_5, grammarAccess.getDClassPathAccess().getCommaKeyword_3_1_1());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt12 >= 1 ) break loop12;
            	                EarlyExitException eee =
            	                    new EarlyExitException(12, input);
            	                throw eee;
            	        }
            	        cnt12++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDClassPath"


    // $ANTLR start "entryRuleDAslPath"
    // InternalJcm.g:501:1: entryRuleDAslPath returns [EObject current=null] : iv_ruleDAslPath= ruleDAslPath EOF ;
    public final EObject entryRuleDAslPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAslPath = null;


        try {
            // InternalJcm.g:501:49: (iv_ruleDAslPath= ruleDAslPath EOF )
            // InternalJcm.g:502:2: iv_ruleDAslPath= ruleDAslPath EOF
            {
             newCompositeNode(grammarAccess.getDAslPathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDAslPath=ruleDAslPath();

            state._fsp--;

             current =iv_ruleDAslPath; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDAslPath"


    // $ANTLR start "ruleDAslPath"
    // InternalJcm.g:508:1: ruleDAslPath returns [EObject current=null] : ( () otherlv_1= 'asl-path' otherlv_2= ':' ( ( (lv_aslPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* ) ;
    public final EObject ruleDAslPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_aslPath_3_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:514:2: ( ( () otherlv_1= 'asl-path' otherlv_2= ':' ( ( (lv_aslPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* ) )
            // InternalJcm.g:515:2: ( () otherlv_1= 'asl-path' otherlv_2= ':' ( ( (lv_aslPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* )
            {
            // InternalJcm.g:515:2: ( () otherlv_1= 'asl-path' otherlv_2= ':' ( ( (lv_aslPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* )
            // InternalJcm.g:516:3: () otherlv_1= 'asl-path' otherlv_2= ':' ( ( (lv_aslPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )*
            {
            // InternalJcm.g:516:3: ()
            // InternalJcm.g:517:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDAslPathAccess().getDAslPathAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDAslPathAccess().getAslPathKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getDAslPathAccess().getColonKeyword_2());
            		
            // InternalJcm.g:531:3: ( ( (lv_aslPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ATOM||LA15_0==RULE_STRING||(LA15_0>=73 && LA15_0<=76)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalJcm.g:532:4: ( (lv_aslPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+
            	    {
            	    // InternalJcm.g:532:4: ( (lv_aslPath_3_0= ruleFileName ) )
            	    // InternalJcm.g:533:5: (lv_aslPath_3_0= ruleFileName )
            	    {
            	    // InternalJcm.g:533:5: (lv_aslPath_3_0= ruleFileName )
            	    // InternalJcm.g:534:6: lv_aslPath_3_0= ruleFileName
            	    {

            	    						newCompositeNode(grammarAccess.getDAslPathAccess().getAslPathFileNameParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_aslPath_3_0=ruleFileName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDAslPathRule());
            	    						}
            	    						add(
            	    							current,
            	    							"aslPath",
            	    							lv_aslPath_3_0,
            	    							"jacamoide.xtext.jcm.Jcm.FileName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalJcm.g:551:4: ( ruleEOL | otherlv_5= ',' )+
            	    int cnt14=0;
            	    loop14:
            	    do {
            	        int alt14=3;
            	        int LA14_0 = input.LA(1);

            	        if ( ((LA14_0>=RULE_NEWLINE && LA14_0<=RULE_SL_COMMENT)) ) {
            	            alt14=1;
            	        }
            	        else if ( (LA14_0==27) ) {
            	            alt14=2;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // InternalJcm.g:552:5: ruleEOL
            	    	    {

            	    	    					newCompositeNode(grammarAccess.getDAslPathAccess().getEOLParserRuleCall_3_1_0());
            	    	    				
            	    	    pushFollow(FOLLOW_19);
            	    	    ruleEOL();

            	    	    state._fsp--;


            	    	    					afterParserOrEnumRuleCall();
            	    	    				

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalJcm.g:560:5: otherlv_5= ','
            	    	    {
            	    	    otherlv_5=(Token)match(input,27,FOLLOW_19); 

            	    	    					newLeafNode(otherlv_5, grammarAccess.getDAslPathAccess().getCommaKeyword_3_1_1());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt14 >= 1 ) break loop14;
            	                EarlyExitException eee =
            	                    new EarlyExitException(14, input);
            	                throw eee;
            	        }
            	        cnt14++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDAslPath"


    // $ANTLR start "entryRuleDOrgPath"
    // InternalJcm.g:570:1: entryRuleDOrgPath returns [EObject current=null] : iv_ruleDOrgPath= ruleDOrgPath EOF ;
    public final EObject entryRuleDOrgPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDOrgPath = null;


        try {
            // InternalJcm.g:570:49: (iv_ruleDOrgPath= ruleDOrgPath EOF )
            // InternalJcm.g:571:2: iv_ruleDOrgPath= ruleDOrgPath EOF
            {
             newCompositeNode(grammarAccess.getDOrgPathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDOrgPath=ruleDOrgPath();

            state._fsp--;

             current =iv_ruleDOrgPath; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOrgPath"


    // $ANTLR start "ruleDOrgPath"
    // InternalJcm.g:577:1: ruleDOrgPath returns [EObject current=null] : ( () otherlv_1= 'org-path' otherlv_2= ':' ( ( (lv_orgPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* ) ;
    public final EObject ruleDOrgPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_orgPath_3_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:583:2: ( ( () otherlv_1= 'org-path' otherlv_2= ':' ( ( (lv_orgPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* ) )
            // InternalJcm.g:584:2: ( () otherlv_1= 'org-path' otherlv_2= ':' ( ( (lv_orgPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* )
            {
            // InternalJcm.g:584:2: ( () otherlv_1= 'org-path' otherlv_2= ':' ( ( (lv_orgPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* )
            // InternalJcm.g:585:3: () otherlv_1= 'org-path' otherlv_2= ':' ( ( (lv_orgPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )*
            {
            // InternalJcm.g:585:3: ()
            // InternalJcm.g:586:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDOrgPathAccess().getDOrgPathAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDOrgPathAccess().getOrgPathKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getDOrgPathAccess().getColonKeyword_2());
            		
            // InternalJcm.g:600:3: ( ( (lv_orgPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ATOM||LA17_0==RULE_STRING||(LA17_0>=73 && LA17_0<=76)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalJcm.g:601:4: ( (lv_orgPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+
            	    {
            	    // InternalJcm.g:601:4: ( (lv_orgPath_3_0= ruleFileName ) )
            	    // InternalJcm.g:602:5: (lv_orgPath_3_0= ruleFileName )
            	    {
            	    // InternalJcm.g:602:5: (lv_orgPath_3_0= ruleFileName )
            	    // InternalJcm.g:603:6: lv_orgPath_3_0= ruleFileName
            	    {

            	    						newCompositeNode(grammarAccess.getDOrgPathAccess().getOrgPathFileNameParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_orgPath_3_0=ruleFileName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDOrgPathRule());
            	    						}
            	    						add(
            	    							current,
            	    							"orgPath",
            	    							lv_orgPath_3_0,
            	    							"jacamoide.xtext.jcm.Jcm.FileName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalJcm.g:620:4: ( ruleEOL | otherlv_5= ',' )+
            	    int cnt16=0;
            	    loop16:
            	    do {
            	        int alt16=3;
            	        int LA16_0 = input.LA(1);

            	        if ( ((LA16_0>=RULE_NEWLINE && LA16_0<=RULE_SL_COMMENT)) ) {
            	            alt16=1;
            	        }
            	        else if ( (LA16_0==27) ) {
            	            alt16=2;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // InternalJcm.g:621:5: ruleEOL
            	    	    {

            	    	    					newCompositeNode(grammarAccess.getDOrgPathAccess().getEOLParserRuleCall_3_1_0());
            	    	    				
            	    	    pushFollow(FOLLOW_19);
            	    	    ruleEOL();

            	    	    state._fsp--;


            	    	    					afterParserOrEnumRuleCall();
            	    	    				

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalJcm.g:629:5: otherlv_5= ','
            	    	    {
            	    	    otherlv_5=(Token)match(input,27,FOLLOW_19); 

            	    	    					newLeafNode(otherlv_5, grammarAccess.getDOrgPathAccess().getCommaKeyword_3_1_1());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt16 >= 1 ) break loop16;
            	                EarlyExitException eee =
            	                    new EarlyExitException(16, input);
            	                throw eee;
            	        }
            	        cnt16++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOrgPath"


    // $ANTLR start "entryRuleDJavaPath"
    // InternalJcm.g:639:1: entryRuleDJavaPath returns [EObject current=null] : iv_ruleDJavaPath= ruleDJavaPath EOF ;
    public final EObject entryRuleDJavaPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDJavaPath = null;


        try {
            // InternalJcm.g:639:50: (iv_ruleDJavaPath= ruleDJavaPath EOF )
            // InternalJcm.g:640:2: iv_ruleDJavaPath= ruleDJavaPath EOF
            {
             newCompositeNode(grammarAccess.getDJavaPathRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDJavaPath=ruleDJavaPath();

            state._fsp--;

             current =iv_ruleDJavaPath; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDJavaPath"


    // $ANTLR start "ruleDJavaPath"
    // InternalJcm.g:646:1: ruleDJavaPath returns [EObject current=null] : ( () otherlv_1= 'java-path' otherlv_2= ':' ( ( (lv_aslPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* ) ;
    public final EObject ruleDJavaPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_aslPath_3_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:652:2: ( ( () otherlv_1= 'java-path' otherlv_2= ':' ( ( (lv_aslPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* ) )
            // InternalJcm.g:653:2: ( () otherlv_1= 'java-path' otherlv_2= ':' ( ( (lv_aslPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* )
            {
            // InternalJcm.g:653:2: ( () otherlv_1= 'java-path' otherlv_2= ':' ( ( (lv_aslPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* )
            // InternalJcm.g:654:3: () otherlv_1= 'java-path' otherlv_2= ':' ( ( (lv_aslPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )*
            {
            // InternalJcm.g:654:3: ()
            // InternalJcm.g:655:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDJavaPathAccess().getDJavaPathAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDJavaPathAccess().getJavaPathKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getDJavaPathAccess().getColonKeyword_2());
            		
            // InternalJcm.g:669:3: ( ( (lv_aslPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ATOM||LA19_0==RULE_STRING||(LA19_0>=73 && LA19_0<=76)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalJcm.g:670:4: ( (lv_aslPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+
            	    {
            	    // InternalJcm.g:670:4: ( (lv_aslPath_3_0= ruleFileName ) )
            	    // InternalJcm.g:671:5: (lv_aslPath_3_0= ruleFileName )
            	    {
            	    // InternalJcm.g:671:5: (lv_aslPath_3_0= ruleFileName )
            	    // InternalJcm.g:672:6: lv_aslPath_3_0= ruleFileName
            	    {

            	    						newCompositeNode(grammarAccess.getDJavaPathAccess().getAslPathFileNameParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_aslPath_3_0=ruleFileName();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDJavaPathRule());
            	    						}
            	    						add(
            	    							current,
            	    							"aslPath",
            	    							lv_aslPath_3_0,
            	    							"jacamoide.xtext.jcm.Jcm.FileName");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalJcm.g:689:4: ( ruleEOL | otherlv_5= ',' )+
            	    int cnt18=0;
            	    loop18:
            	    do {
            	        int alt18=3;
            	        int LA18_0 = input.LA(1);

            	        if ( ((LA18_0>=RULE_NEWLINE && LA18_0<=RULE_SL_COMMENT)) ) {
            	            alt18=1;
            	        }
            	        else if ( (LA18_0==27) ) {
            	            alt18=2;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // InternalJcm.g:690:5: ruleEOL
            	    	    {

            	    	    					newCompositeNode(grammarAccess.getDJavaPathAccess().getEOLParserRuleCall_3_1_0());
            	    	    				
            	    	    pushFollow(FOLLOW_19);
            	    	    ruleEOL();

            	    	    state._fsp--;


            	    	    					afterParserOrEnumRuleCall();
            	    	    				

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalJcm.g:698:5: otherlv_5= ','
            	    	    {
            	    	    otherlv_5=(Token)match(input,27,FOLLOW_19); 

            	    	    					newLeafNode(otherlv_5, grammarAccess.getDJavaPathAccess().getCommaKeyword_3_1_1());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt18 >= 1 ) break loop18;
            	                EarlyExitException eee =
            	                    new EarlyExitException(18, input);
            	                throw eee;
            	        }
            	        cnt18++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDJavaPath"


    // $ANTLR start "entryRuleDPlatform"
    // InternalJcm.g:708:1: entryRuleDPlatform returns [EObject current=null] : iv_ruleDPlatform= ruleDPlatform EOF ;
    public final EObject entryRuleDPlatform() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDPlatform = null;


        try {
            // InternalJcm.g:708:50: (iv_ruleDPlatform= ruleDPlatform EOF )
            // InternalJcm.g:709:2: iv_ruleDPlatform= ruleDPlatform EOF
            {
             newCompositeNode(grammarAccess.getDPlatformRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDPlatform=ruleDPlatform();

            state._fsp--;

             current =iv_ruleDPlatform; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDPlatform"


    // $ANTLR start "ruleDPlatform"
    // InternalJcm.g:715:1: ruleDPlatform returns [EObject current=null] : ( () otherlv_1= 'platform' otherlv_2= ':' ( ( (lv_platform_3_0= ruleClassDef ) ) ( ruleEOL | otherlv_5= ',' )+ )* ) ;
    public final EObject ruleDPlatform() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_platform_3_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:721:2: ( ( () otherlv_1= 'platform' otherlv_2= ':' ( ( (lv_platform_3_0= ruleClassDef ) ) ( ruleEOL | otherlv_5= ',' )+ )* ) )
            // InternalJcm.g:722:2: ( () otherlv_1= 'platform' otherlv_2= ':' ( ( (lv_platform_3_0= ruleClassDef ) ) ( ruleEOL | otherlv_5= ',' )+ )* )
            {
            // InternalJcm.g:722:2: ( () otherlv_1= 'platform' otherlv_2= ':' ( ( (lv_platform_3_0= ruleClassDef ) ) ( ruleEOL | otherlv_5= ',' )+ )* )
            // InternalJcm.g:723:3: () otherlv_1= 'platform' otherlv_2= ':' ( ( (lv_platform_3_0= ruleClassDef ) ) ( ruleEOL | otherlv_5= ',' )+ )*
            {
            // InternalJcm.g:723:3: ()
            // InternalJcm.g:724:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDPlatformAccess().getDPlatformAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getDPlatformAccess().getPlatformKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getDPlatformAccess().getColonKeyword_2());
            		
            // InternalJcm.g:738:3: ( ( (lv_platform_3_0= ruleClassDef ) ) ( ruleEOL | otherlv_5= ',' )+ )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ATOM||LA21_0==RULE_VART) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalJcm.g:739:4: ( (lv_platform_3_0= ruleClassDef ) ) ( ruleEOL | otherlv_5= ',' )+
            	    {
            	    // InternalJcm.g:739:4: ( (lv_platform_3_0= ruleClassDef ) )
            	    // InternalJcm.g:740:5: (lv_platform_3_0= ruleClassDef )
            	    {
            	    // InternalJcm.g:740:5: (lv_platform_3_0= ruleClassDef )
            	    // InternalJcm.g:741:6: lv_platform_3_0= ruleClassDef
            	    {

            	    						newCompositeNode(grammarAccess.getDPlatformAccess().getPlatformClassDefParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_18);
            	    lv_platform_3_0=ruleClassDef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDPlatformRule());
            	    						}
            	    						add(
            	    							current,
            	    							"platform",
            	    							lv_platform_3_0,
            	    							"jacamoide.xtext.jcm.Jcm.ClassDef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalJcm.g:758:4: ( ruleEOL | otherlv_5= ',' )+
            	    int cnt20=0;
            	    loop20:
            	    do {
            	        int alt20=3;
            	        int LA20_0 = input.LA(1);

            	        if ( ((LA20_0>=RULE_NEWLINE && LA20_0<=RULE_SL_COMMENT)) ) {
            	            alt20=1;
            	        }
            	        else if ( (LA20_0==27) ) {
            	            alt20=2;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // InternalJcm.g:759:5: ruleEOL
            	    	    {

            	    	    					newCompositeNode(grammarAccess.getDPlatformAccess().getEOLParserRuleCall_3_1_0());
            	    	    				
            	    	    pushFollow(FOLLOW_21);
            	    	    ruleEOL();

            	    	    state._fsp--;


            	    	    					afterParserOrEnumRuleCall();
            	    	    				

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalJcm.g:767:5: otherlv_5= ','
            	    	    {
            	    	    otherlv_5=(Token)match(input,27,FOLLOW_21); 

            	    	    					newLeafNode(otherlv_5, grammarAccess.getDPlatformAccess().getCommaKeyword_3_1_1());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt20 >= 1 ) break loop20;
            	                EarlyExitException eee =
            	                    new EarlyExitException(20, input);
            	                throw eee;
            	        }
            	        cnt20++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDPlatform"


    // $ANTLR start "entryRuleDNode"
    // InternalJcm.g:777:1: entryRuleDNode returns [EObject current=null] : iv_ruleDNode= ruleDNode EOF ;
    public final EObject entryRuleDNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNode = null;


        try {
            // InternalJcm.g:777:46: (iv_ruleDNode= ruleDNode EOF )
            // InternalJcm.g:778:2: iv_ruleDNode= ruleDNode EOF
            {
             newCompositeNode(grammarAccess.getDNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDNode=ruleDNode();

            state._fsp--;

             current =iv_ruleDNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDNode"


    // $ANTLR start "ruleDNode"
    // InternalJcm.g:784:1: ruleDNode returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_ATOM ) ) (otherlv_2= 'running' )? (otherlv_3= '@' ( (lv_host_4_0= ruleHost ) ) )? ( ruleEOL | otherlv_6= ',' )+ ) ;
    public final EObject ruleDNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_host_4_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:790:2: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ATOM ) ) (otherlv_2= 'running' )? (otherlv_3= '@' ( (lv_host_4_0= ruleHost ) ) )? ( ruleEOL | otherlv_6= ',' )+ ) )
            // InternalJcm.g:791:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ATOM ) ) (otherlv_2= 'running' )? (otherlv_3= '@' ( (lv_host_4_0= ruleHost ) ) )? ( ruleEOL | otherlv_6= ',' )+ )
            {
            // InternalJcm.g:791:2: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ATOM ) ) (otherlv_2= 'running' )? (otherlv_3= '@' ( (lv_host_4_0= ruleHost ) ) )? ( ruleEOL | otherlv_6= ',' )+ )
            // InternalJcm.g:792:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_ATOM ) ) (otherlv_2= 'running' )? (otherlv_3= '@' ( (lv_host_4_0= ruleHost ) ) )? ( ruleEOL | otherlv_6= ',' )+
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getDNodeAccess().getNodeKeyword_0());
            		
            // InternalJcm.g:796:3: ( (lv_name_1_0= RULE_ATOM ) )
            // InternalJcm.g:797:4: (lv_name_1_0= RULE_ATOM )
            {
            // InternalJcm.g:797:4: (lv_name_1_0= RULE_ATOM )
            // InternalJcm.g:798:5: lv_name_1_0= RULE_ATOM
            {
            lv_name_1_0=(Token)match(input,RULE_ATOM,FOLLOW_22); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDNodeAccess().getNameATOMTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jacamoide.xtext.jcm.Jcm.ATOM");
            				

            }


            }

            // InternalJcm.g:814:3: (otherlv_2= 'running' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJcm.g:815:4: otherlv_2= 'running'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getDNodeAccess().getRunningKeyword_2());
                    			

                    }
                    break;

            }

            // InternalJcm.g:820:3: (otherlv_3= '@' ( (lv_host_4_0= ruleHost ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalJcm.g:821:4: otherlv_3= '@' ( (lv_host_4_0= ruleHost ) )
                    {
                    otherlv_3=(Token)match(input,36,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getDNodeAccess().getCommercialAtKeyword_3_0());
                    			
                    // InternalJcm.g:825:4: ( (lv_host_4_0= ruleHost ) )
                    // InternalJcm.g:826:5: (lv_host_4_0= ruleHost )
                    {
                    // InternalJcm.g:826:5: (lv_host_4_0= ruleHost )
                    // InternalJcm.g:827:6: lv_host_4_0= ruleHost
                    {

                    						newCompositeNode(grammarAccess.getDNodeAccess().getHostHostParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_host_4_0=ruleHost();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDNodeRule());
                    						}
                    						set(
                    							current,
                    							"host",
                    							lv_host_4_0,
                    							"jacamoide.xtext.jcm.Jcm.Host");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJcm.g:845:3: ( ruleEOL | otherlv_6= ',' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=3;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_NEWLINE && LA24_0<=RULE_SL_COMMENT)) ) {
                    alt24=1;
                }
                else if ( (LA24_0==27) ) {
                    alt24=2;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalJcm.g:846:4: ruleEOL
            	    {

            	    				newCompositeNode(grammarAccess.getDNodeAccess().getEOLParserRuleCall_4_0());
            	    			
            	    pushFollow(FOLLOW_25);
            	    ruleEOL();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;
            	case 2 :
            	    // InternalJcm.g:854:4: otherlv_6= ','
            	    {
            	    otherlv_6=(Token)match(input,27,FOLLOW_25); 

            	    				newLeafNode(otherlv_6, grammarAccess.getDNodeAccess().getCommaKeyword_4_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDNode"


    // $ANTLR start "entryRuleAgent"
    // InternalJcm.g:863:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // InternalJcm.g:863:46: (iv_ruleAgent= ruleAgent EOF )
            // InternalJcm.g:864:2: iv_ruleAgent= ruleAgent EOF
            {
             newCompositeNode(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAgent=ruleAgent();

            state._fsp--;

             current =iv_ruleAgent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAgent"


    // $ANTLR start "ruleAgent"
    // InternalJcm.g:870:1: ruleAgent returns [EObject current=null] : (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ATOM ) ) (otherlv_2= ':' ( (lv_source_3_0= ruleFileName ) ) )? (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'instances' otherlv_7= ':' ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* ) ) | (otherlv_14= 'node' otherlv_15= ':' ( (lv_node_16_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_18= 'ag-arch' otherlv_19= ':' ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )* ) | (otherlv_23= 'ag-class' otherlv_24= ':' ( (lv_agClass_25_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_27= 'ag-bb-class' otherlv_28= ':' ( (lv_agbbClass_29_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_31= 'beliefs' otherlv_32= ':' ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )* ) | (otherlv_36= 'goals' otherlv_37= ':' ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )* ) | (otherlv_41= 'focus' otherlv_42= ':' ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '::' ( (lv_focusNS_45_0= RULE_ATOM ) ) )? (otherlv_46= '@' ( (lv_focusNode_47_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_49= ',' )+ )* ) | (otherlv_50= 'join' otherlv_51= ':' ( ( (lv_join_52_0= RULE_ATOM ) ) (otherlv_53= '@' ( (lv_joinNode_54_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_56= ',' )+ )* ) | (otherlv_57= 'roles' otherlv_58= ':' ( ( (lv_role_59_0= RULE_ATOM ) ) otherlv_60= 'in' ( (lv_group_61_0= RULE_ATOM ) ) (otherlv_62= '@' ( (lv_groupNode_63_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_65= ',' )+ )* ) | (otherlv_66= 'debug' otherlv_67= ':' ( (lv_debug_68_0= ruleLiteral ) ) ( ruleEOL | otherlv_70= ',' )+ ) | (otherlv_71= 'verbose' otherlv_72= ':' ( (lv_verbose_73_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_75= 'nrcbp' otherlv_76= ':' ( (lv_nrcbp_77_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_79= 'events' otherlv_80= ':' (otherlv_81= 'discard' | otherlv_82= 'requeue' | otherlv_83= 'retrieve' ) ( ruleEOL )+ ) | (otherlv_85= 'intBels' otherlv_86= ':' (otherlv_87= 'sameFocus' | otherlv_88= 'newFocus' ) ( ruleEOL )+ ) | ( ( (lv_other_90_0= RULE_ATOM ) ) otherlv_91= ':' ( ( (lv_string_92_0= RULE_STRING ) ) | ( (lv_val_93_0= RULE_INT_LITERAL ) ) | ( (lv_literal_94_0= ruleLiteral ) ) | ( (lv_val_real_95_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_97= '}' )? ( ruleEOL )* ) ;
    public final EObject ruleAgent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_instances_8_0=null;
        Token otherlv_10=null;
        Token lv_instancesAtom_11_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_node_16_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token lv_focus_43_0=null;
        Token otherlv_44=null;
        Token lv_focusNS_45_0=null;
        Token otherlv_46=null;
        Token lv_focusNode_47_0=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token lv_join_52_0=null;
        Token otherlv_53=null;
        Token lv_joinNode_54_0=null;
        Token otherlv_56=null;
        Token otherlv_57=null;
        Token otherlv_58=null;
        Token lv_role_59_0=null;
        Token otherlv_60=null;
        Token lv_group_61_0=null;
        Token otherlv_62=null;
        Token lv_groupNode_63_0=null;
        Token otherlv_65=null;
        Token otherlv_66=null;
        Token otherlv_67=null;
        Token otherlv_70=null;
        Token otherlv_71=null;
        Token otherlv_72=null;
        Token lv_verbose_73_0=null;
        Token otherlv_75=null;
        Token otherlv_76=null;
        Token lv_nrcbp_77_0=null;
        Token otherlv_79=null;
        Token otherlv_80=null;
        Token otherlv_81=null;
        Token otherlv_82=null;
        Token otherlv_83=null;
        Token otherlv_85=null;
        Token otherlv_86=null;
        Token otherlv_87=null;
        Token otherlv_88=null;
        Token lv_other_90_0=null;
        Token otherlv_91=null;
        Token lv_string_92_0=null;
        Token lv_val_93_0=null;
        Token lv_val_real_95_0=null;
        Token otherlv_97=null;
        EObject lv_source_3_0 = null;

        EObject lv_agArch_20_0 = null;

        EObject lv_agClass_25_0 = null;

        EObject lv_agbbClass_29_0 = null;

        EObject lv_beliefs_33_0 = null;

        EObject lv_goals_38_0 = null;

        EObject lv_debug_68_0 = null;

        EObject lv_literal_94_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:876:2: ( (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ATOM ) ) (otherlv_2= ':' ( (lv_source_3_0= ruleFileName ) ) )? (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'instances' otherlv_7= ':' ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* ) ) | (otherlv_14= 'node' otherlv_15= ':' ( (lv_node_16_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_18= 'ag-arch' otherlv_19= ':' ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )* ) | (otherlv_23= 'ag-class' otherlv_24= ':' ( (lv_agClass_25_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_27= 'ag-bb-class' otherlv_28= ':' ( (lv_agbbClass_29_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_31= 'beliefs' otherlv_32= ':' ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )* ) | (otherlv_36= 'goals' otherlv_37= ':' ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )* ) | (otherlv_41= 'focus' otherlv_42= ':' ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '::' ( (lv_focusNS_45_0= RULE_ATOM ) ) )? (otherlv_46= '@' ( (lv_focusNode_47_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_49= ',' )+ )* ) | (otherlv_50= 'join' otherlv_51= ':' ( ( (lv_join_52_0= RULE_ATOM ) ) (otherlv_53= '@' ( (lv_joinNode_54_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_56= ',' )+ )* ) | (otherlv_57= 'roles' otherlv_58= ':' ( ( (lv_role_59_0= RULE_ATOM ) ) otherlv_60= 'in' ( (lv_group_61_0= RULE_ATOM ) ) (otherlv_62= '@' ( (lv_groupNode_63_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_65= ',' )+ )* ) | (otherlv_66= 'debug' otherlv_67= ':' ( (lv_debug_68_0= ruleLiteral ) ) ( ruleEOL | otherlv_70= ',' )+ ) | (otherlv_71= 'verbose' otherlv_72= ':' ( (lv_verbose_73_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_75= 'nrcbp' otherlv_76= ':' ( (lv_nrcbp_77_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_79= 'events' otherlv_80= ':' (otherlv_81= 'discard' | otherlv_82= 'requeue' | otherlv_83= 'retrieve' ) ( ruleEOL )+ ) | (otherlv_85= 'intBels' otherlv_86= ':' (otherlv_87= 'sameFocus' | otherlv_88= 'newFocus' ) ( ruleEOL )+ ) | ( ( (lv_other_90_0= RULE_ATOM ) ) otherlv_91= ':' ( ( (lv_string_92_0= RULE_STRING ) ) | ( (lv_val_93_0= RULE_INT_LITERAL ) ) | ( (lv_literal_94_0= ruleLiteral ) ) | ( (lv_val_real_95_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_97= '}' )? ( ruleEOL )* ) )
            // InternalJcm.g:877:2: (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ATOM ) ) (otherlv_2= ':' ( (lv_source_3_0= ruleFileName ) ) )? (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'instances' otherlv_7= ':' ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* ) ) | (otherlv_14= 'node' otherlv_15= ':' ( (lv_node_16_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_18= 'ag-arch' otherlv_19= ':' ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )* ) | (otherlv_23= 'ag-class' otherlv_24= ':' ( (lv_agClass_25_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_27= 'ag-bb-class' otherlv_28= ':' ( (lv_agbbClass_29_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_31= 'beliefs' otherlv_32= ':' ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )* ) | (otherlv_36= 'goals' otherlv_37= ':' ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )* ) | (otherlv_41= 'focus' otherlv_42= ':' ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '::' ( (lv_focusNS_45_0= RULE_ATOM ) ) )? (otherlv_46= '@' ( (lv_focusNode_47_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_49= ',' )+ )* ) | (otherlv_50= 'join' otherlv_51= ':' ( ( (lv_join_52_0= RULE_ATOM ) ) (otherlv_53= '@' ( (lv_joinNode_54_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_56= ',' )+ )* ) | (otherlv_57= 'roles' otherlv_58= ':' ( ( (lv_role_59_0= RULE_ATOM ) ) otherlv_60= 'in' ( (lv_group_61_0= RULE_ATOM ) ) (otherlv_62= '@' ( (lv_groupNode_63_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_65= ',' )+ )* ) | (otherlv_66= 'debug' otherlv_67= ':' ( (lv_debug_68_0= ruleLiteral ) ) ( ruleEOL | otherlv_70= ',' )+ ) | (otherlv_71= 'verbose' otherlv_72= ':' ( (lv_verbose_73_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_75= 'nrcbp' otherlv_76= ':' ( (lv_nrcbp_77_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_79= 'events' otherlv_80= ':' (otherlv_81= 'discard' | otherlv_82= 'requeue' | otherlv_83= 'retrieve' ) ( ruleEOL )+ ) | (otherlv_85= 'intBels' otherlv_86= ':' (otherlv_87= 'sameFocus' | otherlv_88= 'newFocus' ) ( ruleEOL )+ ) | ( ( (lv_other_90_0= RULE_ATOM ) ) otherlv_91= ':' ( ( (lv_string_92_0= RULE_STRING ) ) | ( (lv_val_93_0= RULE_INT_LITERAL ) ) | ( (lv_literal_94_0= ruleLiteral ) ) | ( (lv_val_real_95_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_97= '}' )? ( ruleEOL )* )
            {
            // InternalJcm.g:877:2: (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ATOM ) ) (otherlv_2= ':' ( (lv_source_3_0= ruleFileName ) ) )? (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'instances' otherlv_7= ':' ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* ) ) | (otherlv_14= 'node' otherlv_15= ':' ( (lv_node_16_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_18= 'ag-arch' otherlv_19= ':' ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )* ) | (otherlv_23= 'ag-class' otherlv_24= ':' ( (lv_agClass_25_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_27= 'ag-bb-class' otherlv_28= ':' ( (lv_agbbClass_29_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_31= 'beliefs' otherlv_32= ':' ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )* ) | (otherlv_36= 'goals' otherlv_37= ':' ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )* ) | (otherlv_41= 'focus' otherlv_42= ':' ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '::' ( (lv_focusNS_45_0= RULE_ATOM ) ) )? (otherlv_46= '@' ( (lv_focusNode_47_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_49= ',' )+ )* ) | (otherlv_50= 'join' otherlv_51= ':' ( ( (lv_join_52_0= RULE_ATOM ) ) (otherlv_53= '@' ( (lv_joinNode_54_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_56= ',' )+ )* ) | (otherlv_57= 'roles' otherlv_58= ':' ( ( (lv_role_59_0= RULE_ATOM ) ) otherlv_60= 'in' ( (lv_group_61_0= RULE_ATOM ) ) (otherlv_62= '@' ( (lv_groupNode_63_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_65= ',' )+ )* ) | (otherlv_66= 'debug' otherlv_67= ':' ( (lv_debug_68_0= ruleLiteral ) ) ( ruleEOL | otherlv_70= ',' )+ ) | (otherlv_71= 'verbose' otherlv_72= ':' ( (lv_verbose_73_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_75= 'nrcbp' otherlv_76= ':' ( (lv_nrcbp_77_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_79= 'events' otherlv_80= ':' (otherlv_81= 'discard' | otherlv_82= 'requeue' | otherlv_83= 'retrieve' ) ( ruleEOL )+ ) | (otherlv_85= 'intBels' otherlv_86= ':' (otherlv_87= 'sameFocus' | otherlv_88= 'newFocus' ) ( ruleEOL )+ ) | ( ( (lv_other_90_0= RULE_ATOM ) ) otherlv_91= ':' ( ( (lv_string_92_0= RULE_STRING ) ) | ( (lv_val_93_0= RULE_INT_LITERAL ) ) | ( (lv_literal_94_0= ruleLiteral ) ) | ( (lv_val_real_95_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_97= '}' )? ( ruleEOL )* )
            // InternalJcm.g:878:3: otherlv_0= 'agent' ( (lv_name_1_0= RULE_ATOM ) ) (otherlv_2= ':' ( (lv_source_3_0= ruleFileName ) ) )? (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'instances' otherlv_7= ':' ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* ) ) | (otherlv_14= 'node' otherlv_15= ':' ( (lv_node_16_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_18= 'ag-arch' otherlv_19= ':' ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )* ) | (otherlv_23= 'ag-class' otherlv_24= ':' ( (lv_agClass_25_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_27= 'ag-bb-class' otherlv_28= ':' ( (lv_agbbClass_29_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_31= 'beliefs' otherlv_32= ':' ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )* ) | (otherlv_36= 'goals' otherlv_37= ':' ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )* ) | (otherlv_41= 'focus' otherlv_42= ':' ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '::' ( (lv_focusNS_45_0= RULE_ATOM ) ) )? (otherlv_46= '@' ( (lv_focusNode_47_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_49= ',' )+ )* ) | (otherlv_50= 'join' otherlv_51= ':' ( ( (lv_join_52_0= RULE_ATOM ) ) (otherlv_53= '@' ( (lv_joinNode_54_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_56= ',' )+ )* ) | (otherlv_57= 'roles' otherlv_58= ':' ( ( (lv_role_59_0= RULE_ATOM ) ) otherlv_60= 'in' ( (lv_group_61_0= RULE_ATOM ) ) (otherlv_62= '@' ( (lv_groupNode_63_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_65= ',' )+ )* ) | (otherlv_66= 'debug' otherlv_67= ':' ( (lv_debug_68_0= ruleLiteral ) ) ( ruleEOL | otherlv_70= ',' )+ ) | (otherlv_71= 'verbose' otherlv_72= ':' ( (lv_verbose_73_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_75= 'nrcbp' otherlv_76= ':' ( (lv_nrcbp_77_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_79= 'events' otherlv_80= ':' (otherlv_81= 'discard' | otherlv_82= 'requeue' | otherlv_83= 'retrieve' ) ( ruleEOL )+ ) | (otherlv_85= 'intBels' otherlv_86= ':' (otherlv_87= 'sameFocus' | otherlv_88= 'newFocus' ) ( ruleEOL )+ ) | ( ( (lv_other_90_0= RULE_ATOM ) ) otherlv_91= ':' ( ( (lv_string_92_0= RULE_STRING ) ) | ( (lv_val_93_0= RULE_INT_LITERAL ) ) | ( (lv_literal_94_0= ruleLiteral ) ) | ( (lv_val_real_95_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_97= '}' )? ( ruleEOL )*
            {
            otherlv_0=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAgentAccess().getAgentKeyword_0());
            		
            // InternalJcm.g:882:3: ( (lv_name_1_0= RULE_ATOM ) )
            // InternalJcm.g:883:4: (lv_name_1_0= RULE_ATOM )
            {
            // InternalJcm.g:883:4: (lv_name_1_0= RULE_ATOM )
            // InternalJcm.g:884:5: lv_name_1_0= RULE_ATOM
            {
            lv_name_1_0=(Token)match(input,RULE_ATOM,FOLLOW_26); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAgentAccess().getNameATOMTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAgentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jacamoide.xtext.jcm.Jcm.ATOM");
            				

            }


            }

            // InternalJcm.g:900:3: (otherlv_2= ':' ( (lv_source_3_0= ruleFileName ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJcm.g:901:4: otherlv_2= ':' ( (lv_source_3_0= ruleFileName ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_14); 

                    				newLeafNode(otherlv_2, grammarAccess.getAgentAccess().getColonKeyword_2_0());
                    			
                    // InternalJcm.g:905:4: ( (lv_source_3_0= ruleFileName ) )
                    // InternalJcm.g:906:5: (lv_source_3_0= ruleFileName )
                    {
                    // InternalJcm.g:906:5: (lv_source_3_0= ruleFileName )
                    // InternalJcm.g:907:6: lv_source_3_0= ruleFileName
                    {

                    						newCompositeNode(grammarAccess.getAgentAccess().getSourceFileNameParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_source_3_0=ruleFileName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAgentRule());
                    						}
                    						add(
                    							current,
                    							"source",
                    							lv_source_3_0,
                    							"jacamoide.xtext.jcm.Jcm.FileName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJcm.g:925:3: (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'instances' otherlv_7= ':' ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* ) ) | (otherlv_14= 'node' otherlv_15= ':' ( (lv_node_16_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_18= 'ag-arch' otherlv_19= ':' ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )* ) | (otherlv_23= 'ag-class' otherlv_24= ':' ( (lv_agClass_25_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_27= 'ag-bb-class' otherlv_28= ':' ( (lv_agbbClass_29_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_31= 'beliefs' otherlv_32= ':' ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )* ) | (otherlv_36= 'goals' otherlv_37= ':' ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )* ) | (otherlv_41= 'focus' otherlv_42= ':' ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '::' ( (lv_focusNS_45_0= RULE_ATOM ) ) )? (otherlv_46= '@' ( (lv_focusNode_47_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_49= ',' )+ )* ) | (otherlv_50= 'join' otherlv_51= ':' ( ( (lv_join_52_0= RULE_ATOM ) ) (otherlv_53= '@' ( (lv_joinNode_54_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_56= ',' )+ )* ) | (otherlv_57= 'roles' otherlv_58= ':' ( ( (lv_role_59_0= RULE_ATOM ) ) otherlv_60= 'in' ( (lv_group_61_0= RULE_ATOM ) ) (otherlv_62= '@' ( (lv_groupNode_63_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_65= ',' )+ )* ) | (otherlv_66= 'debug' otherlv_67= ':' ( (lv_debug_68_0= ruleLiteral ) ) ( ruleEOL | otherlv_70= ',' )+ ) | (otherlv_71= 'verbose' otherlv_72= ':' ( (lv_verbose_73_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_75= 'nrcbp' otherlv_76= ':' ( (lv_nrcbp_77_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_79= 'events' otherlv_80= ':' (otherlv_81= 'discard' | otherlv_82= 'requeue' | otherlv_83= 'retrieve' ) ( ruleEOL )+ ) | (otherlv_85= 'intBels' otherlv_86= ':' (otherlv_87= 'sameFocus' | otherlv_88= 'newFocus' ) ( ruleEOL )+ ) | ( ( (lv_other_90_0= RULE_ATOM ) ) otherlv_91= ':' ( ( (lv_string_92_0= RULE_STRING ) ) | ( (lv_val_93_0= RULE_INT_LITERAL ) ) | ( (lv_literal_94_0= ruleLiteral ) ) | ( (lv_val_real_95_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_97= '}' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==24) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalJcm.g:926:4: otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'instances' otherlv_7= ':' ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* ) ) | (otherlv_14= 'node' otherlv_15= ':' ( (lv_node_16_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_18= 'ag-arch' otherlv_19= ':' ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )* ) | (otherlv_23= 'ag-class' otherlv_24= ':' ( (lv_agClass_25_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_27= 'ag-bb-class' otherlv_28= ':' ( (lv_agbbClass_29_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_31= 'beliefs' otherlv_32= ':' ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )* ) | (otherlv_36= 'goals' otherlv_37= ':' ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )* ) | (otherlv_41= 'focus' otherlv_42= ':' ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '::' ( (lv_focusNS_45_0= RULE_ATOM ) ) )? (otherlv_46= '@' ( (lv_focusNode_47_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_49= ',' )+ )* ) | (otherlv_50= 'join' otherlv_51= ':' ( ( (lv_join_52_0= RULE_ATOM ) ) (otherlv_53= '@' ( (lv_joinNode_54_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_56= ',' )+ )* ) | (otherlv_57= 'roles' otherlv_58= ':' ( ( (lv_role_59_0= RULE_ATOM ) ) otherlv_60= 'in' ( (lv_group_61_0= RULE_ATOM ) ) (otherlv_62= '@' ( (lv_groupNode_63_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_65= ',' )+ )* ) | (otherlv_66= 'debug' otherlv_67= ':' ( (lv_debug_68_0= ruleLiteral ) ) ( ruleEOL | otherlv_70= ',' )+ ) | (otherlv_71= 'verbose' otherlv_72= ':' ( (lv_verbose_73_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_75= 'nrcbp' otherlv_76= ':' ( (lv_nrcbp_77_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_79= 'events' otherlv_80= ':' (otherlv_81= 'discard' | otherlv_82= 'requeue' | otherlv_83= 'retrieve' ) ( ruleEOL )+ ) | (otherlv_85= 'intBels' otherlv_86= ':' (otherlv_87= 'sameFocus' | otherlv_88= 'newFocus' ) ( ruleEOL )+ ) | ( ( (lv_other_90_0= RULE_ATOM ) ) otherlv_91= ':' ( ( (lv_string_92_0= RULE_STRING ) ) | ( (lv_val_93_0= RULE_INT_LITERAL ) ) | ( (lv_literal_94_0= ruleLiteral ) ) | ( (lv_val_real_95_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_97= '}'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_3_0());
                    			
                    // InternalJcm.g:930:4: ( ruleEOL )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0>=RULE_NEWLINE && LA26_0<=RULE_SL_COMMENT)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalJcm.g:931:5: ruleEOL
                    	    {

                    	    					newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_1());
                    	    				
                    	    pushFollow(FOLLOW_28);
                    	    ruleEOL();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    // InternalJcm.g:939:4: ( (otherlv_6= 'instances' otherlv_7= ':' ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* ) ) | (otherlv_14= 'node' otherlv_15= ':' ( (lv_node_16_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_18= 'ag-arch' otherlv_19= ':' ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )* ) | (otherlv_23= 'ag-class' otherlv_24= ':' ( (lv_agClass_25_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_27= 'ag-bb-class' otherlv_28= ':' ( (lv_agbbClass_29_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_31= 'beliefs' otherlv_32= ':' ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )* ) | (otherlv_36= 'goals' otherlv_37= ':' ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )* ) | (otherlv_41= 'focus' otherlv_42= ':' ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '::' ( (lv_focusNS_45_0= RULE_ATOM ) ) )? (otherlv_46= '@' ( (lv_focusNode_47_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_49= ',' )+ )* ) | (otherlv_50= 'join' otherlv_51= ':' ( ( (lv_join_52_0= RULE_ATOM ) ) (otherlv_53= '@' ( (lv_joinNode_54_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_56= ',' )+ )* ) | (otherlv_57= 'roles' otherlv_58= ':' ( ( (lv_role_59_0= RULE_ATOM ) ) otherlv_60= 'in' ( (lv_group_61_0= RULE_ATOM ) ) (otherlv_62= '@' ( (lv_groupNode_63_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_65= ',' )+ )* ) | (otherlv_66= 'debug' otherlv_67= ':' ( (lv_debug_68_0= ruleLiteral ) ) ( ruleEOL | otherlv_70= ',' )+ ) | (otherlv_71= 'verbose' otherlv_72= ':' ( (lv_verbose_73_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_75= 'nrcbp' otherlv_76= ':' ( (lv_nrcbp_77_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_79= 'events' otherlv_80= ':' (otherlv_81= 'discard' | otherlv_82= 'requeue' | otherlv_83= 'retrieve' ) ( ruleEOL )+ ) | (otherlv_85= 'intBels' otherlv_86= ':' (otherlv_87= 'sameFocus' | otherlv_88= 'newFocus' ) ( ruleEOL )+ ) | ( ( (lv_other_90_0= RULE_ATOM ) ) otherlv_91= ':' ( ( (lv_string_92_0= RULE_STRING ) ) | ( (lv_val_93_0= RULE_INT_LITERAL ) ) | ( (lv_literal_94_0= ruleLiteral ) ) | ( (lv_val_real_95_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )*
                    loop59:
                    do {
                        int alt59=17;
                        switch ( input.LA(1) ) {
                        case 38:
                            {
                            alt59=1;
                            }
                            break;
                        case 34:
                            {
                            alt59=2;
                            }
                            break;
                        case 39:
                            {
                            alt59=3;
                            }
                            break;
                        case 40:
                            {
                            alt59=4;
                            }
                            break;
                        case 41:
                            {
                            alt59=5;
                            }
                            break;
                        case 42:
                            {
                            alt59=6;
                            }
                            break;
                        case 43:
                            {
                            alt59=7;
                            }
                            break;
                        case 44:
                            {
                            alt59=8;
                            }
                            break;
                        case 46:
                            {
                            alt59=9;
                            }
                            break;
                        case 47:
                            {
                            alt59=10;
                            }
                            break;
                        case 49:
                            {
                            alt59=11;
                            }
                            break;
                        case 50:
                            {
                            alt59=12;
                            }
                            break;
                        case 51:
                            {
                            alt59=13;
                            }
                            break;
                        case 52:
                            {
                            alt59=14;
                            }
                            break;
                        case 56:
                            {
                            alt59=15;
                            }
                            break;
                        case RULE_ATOM:
                            {
                            alt59=16;
                            }
                            break;

                        }

                        switch (alt59) {
                    	case 1 :
                    	    // InternalJcm.g:940:5: (otherlv_6= 'instances' otherlv_7= ':' ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* ) )
                    	    {
                    	    // InternalJcm.g:940:5: (otherlv_6= 'instances' otherlv_7= ':' ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* ) )
                    	    // InternalJcm.g:941:6: otherlv_6= 'instances' otherlv_7= ':' ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* )
                    	    {
                    	    otherlv_6=(Token)match(input,38,FOLLOW_16); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getAgentAccess().getInstancesKeyword_3_2_0_0());
                    	    					
                    	    otherlv_7=(Token)match(input,29,FOLLOW_29); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getAgentAccess().getColonKeyword_3_2_0_1());
                    	    					
                    	    // InternalJcm.g:949:6: ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* )
                    	    int alt30=2;
                    	    int LA30_0 = input.LA(1);

                    	    if ( (LA30_0==RULE_INT_LITERAL) ) {
                    	        alt30=1;
                    	    }
                    	    else if ( (LA30_0==RULE_ATOM||LA30_0==25||LA30_0==34||(LA30_0>=38 && LA30_0<=44)||(LA30_0>=46 && LA30_0<=47)||(LA30_0>=49 && LA30_0<=52)||LA30_0==56) ) {
                    	        alt30=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 30, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt30) {
                    	        case 1 :
                    	            // InternalJcm.g:950:7: ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ )
                    	            {
                    	            // InternalJcm.g:950:7: ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ )
                    	            // InternalJcm.g:951:8: ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+
                    	            {
                    	            // InternalJcm.g:951:8: ( (lv_instances_8_0= RULE_INT_LITERAL ) )
                    	            // InternalJcm.g:952:9: (lv_instances_8_0= RULE_INT_LITERAL )
                    	            {
                    	            // InternalJcm.g:952:9: (lv_instances_8_0= RULE_INT_LITERAL )
                    	            // InternalJcm.g:953:10: lv_instances_8_0= RULE_INT_LITERAL
                    	            {
                    	            lv_instances_8_0=(Token)match(input,RULE_INT_LITERAL,FOLLOW_18); 

                    	            										newLeafNode(lv_instances_8_0, grammarAccess.getAgentAccess().getInstancesINT_LITERALTerminalRuleCall_3_2_0_2_0_0_0());
                    	            									

                    	            										if (current==null) {
                    	            											current = createModelElement(grammarAccess.getAgentRule());
                    	            										}
                    	            										addWithLastConsumed(
                    	            											current,
                    	            											"instances",
                    	            											lv_instances_8_0,
                    	            											"jacamoide.xtext.jcm.Jcm.INT_LITERAL");
                    	            									

                    	            }


                    	            }

                    	            // InternalJcm.g:969:8: ( ruleEOL | otherlv_10= ',' )+
                    	            int cnt27=0;
                    	            loop27:
                    	            do {
                    	                int alt27=3;
                    	                int LA27_0 = input.LA(1);

                    	                if ( ((LA27_0>=RULE_NEWLINE && LA27_0<=RULE_SL_COMMENT)) ) {
                    	                    alt27=1;
                    	                }
                    	                else if ( (LA27_0==27) ) {
                    	                    alt27=2;
                    	                }


                    	                switch (alt27) {
                    	            	case 1 :
                    	            	    // InternalJcm.g:970:9: ruleEOL
                    	            	    {

                    	            	    									newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_0_2_0_1_0());
                    	            	    								
                    	            	    pushFollow(FOLLOW_30);
                    	            	    ruleEOL();

                    	            	    state._fsp--;


                    	            	    									afterParserOrEnumRuleCall();
                    	            	    								

                    	            	    }
                    	            	    break;
                    	            	case 2 :
                    	            	    // InternalJcm.g:978:9: otherlv_10= ','
                    	            	    {
                    	            	    otherlv_10=(Token)match(input,27,FOLLOW_30); 

                    	            	    									newLeafNode(otherlv_10, grammarAccess.getAgentAccess().getCommaKeyword_3_2_0_2_0_1_1());
                    	            	    								

                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    if ( cnt27 >= 1 ) break loop27;
                    	                        EarlyExitException eee =
                    	                            new EarlyExitException(27, input);
                    	                        throw eee;
                    	                }
                    	                cnt27++;
                    	            } while (true);


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalJcm.g:985:7: ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )*
                    	            {
                    	            // InternalJcm.g:985:7: ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )*
                    	            loop29:
                    	            do {
                    	                int alt29=2;
                    	                int LA29_0 = input.LA(1);

                    	                if ( (LA29_0==RULE_ATOM) ) {
                    	                    int LA29_2 = input.LA(2);

                    	                    if ( ((LA29_2>=RULE_NEWLINE && LA29_2<=RULE_SL_COMMENT)||LA29_2==27) ) {
                    	                        alt29=1;
                    	                    }


                    	                }


                    	                switch (alt29) {
                    	            	case 1 :
                    	            	    // InternalJcm.g:986:8: ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+
                    	            	    {
                    	            	    // InternalJcm.g:986:8: ( (lv_instancesAtom_11_0= RULE_ATOM ) )
                    	            	    // InternalJcm.g:987:9: (lv_instancesAtom_11_0= RULE_ATOM )
                    	            	    {
                    	            	    // InternalJcm.g:987:9: (lv_instancesAtom_11_0= RULE_ATOM )
                    	            	    // InternalJcm.g:988:10: lv_instancesAtom_11_0= RULE_ATOM
                    	            	    {
                    	            	    lv_instancesAtom_11_0=(Token)match(input,RULE_ATOM,FOLLOW_18); 

                    	            	    										newLeafNode(lv_instancesAtom_11_0, grammarAccess.getAgentAccess().getInstancesAtomATOMTerminalRuleCall_3_2_0_2_1_0_0());
                    	            	    									

                    	            	    										if (current==null) {
                    	            	    											current = createModelElement(grammarAccess.getAgentRule());
                    	            	    										}
                    	            	    										addWithLastConsumed(
                    	            	    											current,
                    	            	    											"instancesAtom",
                    	            	    											lv_instancesAtom_11_0,
                    	            	    											"jacamoide.xtext.jcm.Jcm.ATOM");
                    	            	    									

                    	            	    }


                    	            	    }

                    	            	    // InternalJcm.g:1004:8: ( ruleEOL | otherlv_13= ',' )+
                    	            	    int cnt28=0;
                    	            	    loop28:
                    	            	    do {
                    	            	        int alt28=3;
                    	            	        int LA28_0 = input.LA(1);

                    	            	        if ( ((LA28_0>=RULE_NEWLINE && LA28_0<=RULE_SL_COMMENT)) ) {
                    	            	            alt28=1;
                    	            	        }
                    	            	        else if ( (LA28_0==27) ) {
                    	            	            alt28=2;
                    	            	        }


                    	            	        switch (alt28) {
                    	            	    	case 1 :
                    	            	    	    // InternalJcm.g:1005:9: ruleEOL
                    	            	    	    {

                    	            	    	    									newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_0_2_1_1_0());
                    	            	    	    								
                    	            	    	    pushFollow(FOLLOW_30);
                    	            	    	    ruleEOL();

                    	            	    	    state._fsp--;


                    	            	    	    									afterParserOrEnumRuleCall();
                    	            	    	    								

                    	            	    	    }
                    	            	    	    break;
                    	            	    	case 2 :
                    	            	    	    // InternalJcm.g:1013:9: otherlv_13= ','
                    	            	    	    {
                    	            	    	    otherlv_13=(Token)match(input,27,FOLLOW_30); 

                    	            	    	    									newLeafNode(otherlv_13, grammarAccess.getAgentAccess().getCommaKeyword_3_2_0_2_1_1_1());
                    	            	    	    								

                    	            	    	    }
                    	            	    	    break;

                    	            	    	default :
                    	            	    	    if ( cnt28 >= 1 ) break loop28;
                    	            	                EarlyExitException eee =
                    	            	                    new EarlyExitException(28, input);
                    	            	                throw eee;
                    	            	        }
                    	            	        cnt28++;
                    	            	    } while (true);


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop29;
                    	                }
                    	            } while (true);


                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJcm.g:1022:5: (otherlv_14= 'node' otherlv_15= ':' ( (lv_node_16_0= RULE_ATOM ) ) ( ruleEOL )+ )
                    	    {
                    	    // InternalJcm.g:1022:5: (otherlv_14= 'node' otherlv_15= ':' ( (lv_node_16_0= RULE_ATOM ) ) ( ruleEOL )+ )
                    	    // InternalJcm.g:1023:6: otherlv_14= 'node' otherlv_15= ':' ( (lv_node_16_0= RULE_ATOM ) ) ( ruleEOL )+
                    	    {
                    	    otherlv_14=(Token)match(input,34,FOLLOW_16); 

                    	    						newLeafNode(otherlv_14, grammarAccess.getAgentAccess().getNodeKeyword_3_2_1_0());
                    	    					
                    	    otherlv_15=(Token)match(input,29,FOLLOW_4); 

                    	    						newLeafNode(otherlv_15, grammarAccess.getAgentAccess().getColonKeyword_3_2_1_1());
                    	    					
                    	    // InternalJcm.g:1031:6: ( (lv_node_16_0= RULE_ATOM ) )
                    	    // InternalJcm.g:1032:7: (lv_node_16_0= RULE_ATOM )
                    	    {
                    	    // InternalJcm.g:1032:7: (lv_node_16_0= RULE_ATOM )
                    	    // InternalJcm.g:1033:8: lv_node_16_0= RULE_ATOM
                    	    {
                    	    lv_node_16_0=(Token)match(input,RULE_ATOM,FOLLOW_3); 

                    	    								newLeafNode(lv_node_16_0, grammarAccess.getAgentAccess().getNodeATOMTerminalRuleCall_3_2_1_2_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getAgentRule());
                    	    								}
                    	    								addWithLastConsumed(
                    	    									current,
                    	    									"node",
                    	    									lv_node_16_0,
                    	    									"jacamoide.xtext.jcm.Jcm.ATOM");
                    	    							

                    	    }


                    	    }

                    	    // InternalJcm.g:1049:6: ( ruleEOL )+
                    	    int cnt31=0;
                    	    loop31:
                    	    do {
                    	        int alt31=2;
                    	        int LA31_0 = input.LA(1);

                    	        if ( ((LA31_0>=RULE_NEWLINE && LA31_0<=RULE_SL_COMMENT)) ) {
                    	            alt31=1;
                    	        }


                    	        switch (alt31) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:1050:7: ruleEOL
                    	    	    {

                    	    	    							newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_1_3());
                    	    	    						
                    	    	    pushFollow(FOLLOW_28);
                    	    	    ruleEOL();

                    	    	    state._fsp--;


                    	    	    							afterParserOrEnumRuleCall();
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt31 >= 1 ) break loop31;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(31, input);
                    	                throw eee;
                    	        }
                    	        cnt31++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalJcm.g:1060:5: (otherlv_18= 'ag-arch' otherlv_19= ':' ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )* )
                    	    {
                    	    // InternalJcm.g:1060:5: (otherlv_18= 'ag-arch' otherlv_19= ':' ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )* )
                    	    // InternalJcm.g:1061:6: otherlv_18= 'ag-arch' otherlv_19= ':' ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )*
                    	    {
                    	    otherlv_18=(Token)match(input,39,FOLLOW_16); 

                    	    						newLeafNode(otherlv_18, grammarAccess.getAgentAccess().getAgArchKeyword_3_2_2_0());
                    	    					
                    	    otherlv_19=(Token)match(input,29,FOLLOW_31); 

                    	    						newLeafNode(otherlv_19, grammarAccess.getAgentAccess().getColonKeyword_3_2_2_1());
                    	    					
                    	    // InternalJcm.g:1069:6: ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )*
                    	    loop33:
                    	    do {
                    	        int alt33=2;
                    	        int LA33_0 = input.LA(1);

                    	        if ( (LA33_0==RULE_ATOM) ) {
                    	            int LA33_2 = input.LA(2);

                    	            if ( ((LA33_2>=RULE_NEWLINE && LA33_2<=RULE_SL_COMMENT)||LA33_2==27||LA33_2==75||LA33_2==77) ) {
                    	                alt33=1;
                    	            }


                    	        }
                    	        else if ( (LA33_0==RULE_VART) ) {
                    	            alt33=1;
                    	        }


                    	        switch (alt33) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:1070:7: ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+
                    	    	    {
                    	    	    // InternalJcm.g:1070:7: ( (lv_agArch_20_0= ruleClassDef ) )
                    	    	    // InternalJcm.g:1071:8: (lv_agArch_20_0= ruleClassDef )
                    	    	    {
                    	    	    // InternalJcm.g:1071:8: (lv_agArch_20_0= ruleClassDef )
                    	    	    // InternalJcm.g:1072:9: lv_agArch_20_0= ruleClassDef
                    	    	    {

                    	    	    									newCompositeNode(grammarAccess.getAgentAccess().getAgArchClassDefParserRuleCall_3_2_2_2_0_0());
                    	    	    								
                    	    	    pushFollow(FOLLOW_18);
                    	    	    lv_agArch_20_0=ruleClassDef();

                    	    	    state._fsp--;


                    	    	    									if (current==null) {
                    	    	    										current = createModelElementForParent(grammarAccess.getAgentRule());
                    	    	    									}
                    	    	    									add(
                    	    	    										current,
                    	    	    										"agArch",
                    	    	    										lv_agArch_20_0,
                    	    	    										"jacamoide.xtext.jcm.Jcm.ClassDef");
                    	    	    									afterParserOrEnumRuleCall();
                    	    	    								

                    	    	    }


                    	    	    }

                    	    	    // InternalJcm.g:1089:7: ( ruleEOL | otherlv_22= ',' )+
                    	    	    int cnt32=0;
                    	    	    loop32:
                    	    	    do {
                    	    	        int alt32=3;
                    	    	        int LA32_0 = input.LA(1);

                    	    	        if ( ((LA32_0>=RULE_NEWLINE && LA32_0<=RULE_SL_COMMENT)) ) {
                    	    	            alt32=1;
                    	    	        }
                    	    	        else if ( (LA32_0==27) ) {
                    	    	            alt32=2;
                    	    	        }


                    	    	        switch (alt32) {
                    	    	    	case 1 :
                    	    	    	    // InternalJcm.g:1090:8: ruleEOL
                    	    	    	    {

                    	    	    	    								newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_2_2_1_0());
                    	    	    	    							
                    	    	    	    pushFollow(FOLLOW_32);
                    	    	    	    ruleEOL();

                    	    	    	    state._fsp--;


                    	    	    	    								afterParserOrEnumRuleCall();
                    	    	    	    							

                    	    	    	    }
                    	    	    	    break;
                    	    	    	case 2 :
                    	    	    	    // InternalJcm.g:1098:8: otherlv_22= ','
                    	    	    	    {
                    	    	    	    otherlv_22=(Token)match(input,27,FOLLOW_32); 

                    	    	    	    								newLeafNode(otherlv_22, grammarAccess.getAgentAccess().getCommaKeyword_3_2_2_2_1_1());
                    	    	    	    							

                    	    	    	    }
                    	    	    	    break;

                    	    	    	default :
                    	    	    	    if ( cnt32 >= 1 ) break loop32;
                    	    	                EarlyExitException eee =
                    	    	                    new EarlyExitException(32, input);
                    	    	                throw eee;
                    	    	        }
                    	    	        cnt32++;
                    	    	    } while (true);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop33;
                    	        }
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalJcm.g:1106:5: (otherlv_23= 'ag-class' otherlv_24= ':' ( (lv_agClass_25_0= ruleClassDef ) ) ( ruleEOL )+ )
                    	    {
                    	    // InternalJcm.g:1106:5: (otherlv_23= 'ag-class' otherlv_24= ':' ( (lv_agClass_25_0= ruleClassDef ) ) ( ruleEOL )+ )
                    	    // InternalJcm.g:1107:6: otherlv_23= 'ag-class' otherlv_24= ':' ( (lv_agClass_25_0= ruleClassDef ) ) ( ruleEOL )+
                    	    {
                    	    otherlv_23=(Token)match(input,40,FOLLOW_16); 

                    	    						newLeafNode(otherlv_23, grammarAccess.getAgentAccess().getAgClassKeyword_3_2_3_0());
                    	    					
                    	    otherlv_24=(Token)match(input,29,FOLLOW_33); 

                    	    						newLeafNode(otherlv_24, grammarAccess.getAgentAccess().getColonKeyword_3_2_3_1());
                    	    					
                    	    // InternalJcm.g:1115:6: ( (lv_agClass_25_0= ruleClassDef ) )
                    	    // InternalJcm.g:1116:7: (lv_agClass_25_0= ruleClassDef )
                    	    {
                    	    // InternalJcm.g:1116:7: (lv_agClass_25_0= ruleClassDef )
                    	    // InternalJcm.g:1117:8: lv_agClass_25_0= ruleClassDef
                    	    {

                    	    								newCompositeNode(grammarAccess.getAgentAccess().getAgClassClassDefParserRuleCall_3_2_3_2_0());
                    	    							
                    	    pushFollow(FOLLOW_3);
                    	    lv_agClass_25_0=ruleClassDef();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAgentRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"agClass",
                    	    									lv_agClass_25_0,
                    	    									"jacamoide.xtext.jcm.Jcm.ClassDef");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    // InternalJcm.g:1134:6: ( ruleEOL )+
                    	    int cnt34=0;
                    	    loop34:
                    	    do {
                    	        int alt34=2;
                    	        int LA34_0 = input.LA(1);

                    	        if ( ((LA34_0>=RULE_NEWLINE && LA34_0<=RULE_SL_COMMENT)) ) {
                    	            alt34=1;
                    	        }


                    	        switch (alt34) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:1135:7: ruleEOL
                    	    	    {

                    	    	    							newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_3_3());
                    	    	    						
                    	    	    pushFollow(FOLLOW_28);
                    	    	    ruleEOL();

                    	    	    state._fsp--;


                    	    	    							afterParserOrEnumRuleCall();
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt34 >= 1 ) break loop34;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(34, input);
                    	                throw eee;
                    	        }
                    	        cnt34++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalJcm.g:1145:5: (otherlv_27= 'ag-bb-class' otherlv_28= ':' ( (lv_agbbClass_29_0= ruleClassDef ) ) ( ruleEOL )+ )
                    	    {
                    	    // InternalJcm.g:1145:5: (otherlv_27= 'ag-bb-class' otherlv_28= ':' ( (lv_agbbClass_29_0= ruleClassDef ) ) ( ruleEOL )+ )
                    	    // InternalJcm.g:1146:6: otherlv_27= 'ag-bb-class' otherlv_28= ':' ( (lv_agbbClass_29_0= ruleClassDef ) ) ( ruleEOL )+
                    	    {
                    	    otherlv_27=(Token)match(input,41,FOLLOW_16); 

                    	    						newLeafNode(otherlv_27, grammarAccess.getAgentAccess().getAgBbClassKeyword_3_2_4_0());
                    	    					
                    	    otherlv_28=(Token)match(input,29,FOLLOW_33); 

                    	    						newLeafNode(otherlv_28, grammarAccess.getAgentAccess().getColonKeyword_3_2_4_1());
                    	    					
                    	    // InternalJcm.g:1154:6: ( (lv_agbbClass_29_0= ruleClassDef ) )
                    	    // InternalJcm.g:1155:7: (lv_agbbClass_29_0= ruleClassDef )
                    	    {
                    	    // InternalJcm.g:1155:7: (lv_agbbClass_29_0= ruleClassDef )
                    	    // InternalJcm.g:1156:8: lv_agbbClass_29_0= ruleClassDef
                    	    {

                    	    								newCompositeNode(grammarAccess.getAgentAccess().getAgbbClassClassDefParserRuleCall_3_2_4_2_0());
                    	    							
                    	    pushFollow(FOLLOW_3);
                    	    lv_agbbClass_29_0=ruleClassDef();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAgentRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"agbbClass",
                    	    									lv_agbbClass_29_0,
                    	    									"jacamoide.xtext.jcm.Jcm.ClassDef");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    // InternalJcm.g:1173:6: ( ruleEOL )+
                    	    int cnt35=0;
                    	    loop35:
                    	    do {
                    	        int alt35=2;
                    	        int LA35_0 = input.LA(1);

                    	        if ( ((LA35_0>=RULE_NEWLINE && LA35_0<=RULE_SL_COMMENT)) ) {
                    	            alt35=1;
                    	        }


                    	        switch (alt35) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:1174:7: ruleEOL
                    	    	    {

                    	    	    							newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_4_3());
                    	    	    						
                    	    	    pushFollow(FOLLOW_28);
                    	    	    ruleEOL();

                    	    	    state._fsp--;


                    	    	    							afterParserOrEnumRuleCall();
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt35 >= 1 ) break loop35;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(35, input);
                    	                throw eee;
                    	        }
                    	        cnt35++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalJcm.g:1184:5: (otherlv_31= 'beliefs' otherlv_32= ':' ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )* )
                    	    {
                    	    // InternalJcm.g:1184:5: (otherlv_31= 'beliefs' otherlv_32= ':' ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )* )
                    	    // InternalJcm.g:1185:6: otherlv_31= 'beliefs' otherlv_32= ':' ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )*
                    	    {
                    	    otherlv_31=(Token)match(input,42,FOLLOW_16); 

                    	    						newLeafNode(otherlv_31, grammarAccess.getAgentAccess().getBeliefsKeyword_3_2_5_0());
                    	    					
                    	    otherlv_32=(Token)match(input,29,FOLLOW_34); 

                    	    						newLeafNode(otherlv_32, grammarAccess.getAgentAccess().getColonKeyword_3_2_5_1());
                    	    					
                    	    // InternalJcm.g:1193:6: ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )*
                    	    loop37:
                    	    do {
                    	        int alt37=2;
                    	        int LA37_0 = input.LA(1);

                    	        if ( (LA37_0==RULE_ATOM) ) {
                    	            int LA37_2 = input.LA(2);

                    	            if ( ((LA37_2>=RULE_NEWLINE && LA37_2<=RULE_SL_COMMENT)||LA37_2==27||LA37_2==77||LA37_2==79) ) {
                    	                alt37=1;
                    	            }


                    	        }
                    	        else if ( ((LA37_0>=RULE_VART && LA37_0<=RULE_UNNAMEDVART)||(LA37_0>=81 && LA37_0<=85)) ) {
                    	            alt37=1;
                    	        }


                    	        switch (alt37) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:1194:7: ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+
                    	    	    {
                    	    	    // InternalJcm.g:1194:7: ( (lv_beliefs_33_0= ruleLiteral ) )
                    	    	    // InternalJcm.g:1195:8: (lv_beliefs_33_0= ruleLiteral )
                    	    	    {
                    	    	    // InternalJcm.g:1195:8: (lv_beliefs_33_0= ruleLiteral )
                    	    	    // InternalJcm.g:1196:9: lv_beliefs_33_0= ruleLiteral
                    	    	    {

                    	    	    									newCompositeNode(grammarAccess.getAgentAccess().getBeliefsLiteralParserRuleCall_3_2_5_2_0_0());
                    	    	    								
                    	    	    pushFollow(FOLLOW_18);
                    	    	    lv_beliefs_33_0=ruleLiteral();

                    	    	    state._fsp--;


                    	    	    									if (current==null) {
                    	    	    										current = createModelElementForParent(grammarAccess.getAgentRule());
                    	    	    									}
                    	    	    									add(
                    	    	    										current,
                    	    	    										"beliefs",
                    	    	    										lv_beliefs_33_0,
                    	    	    										"jacamoide.xtext.jcm.Jcm.Literal");
                    	    	    									afterParserOrEnumRuleCall();
                    	    	    								

                    	    	    }


                    	    	    }

                    	    	    // InternalJcm.g:1213:7: ( ruleEOL | otherlv_35= ',' )+
                    	    	    int cnt36=0;
                    	    	    loop36:
                    	    	    do {
                    	    	        int alt36=3;
                    	    	        int LA36_0 = input.LA(1);

                    	    	        if ( ((LA36_0>=RULE_NEWLINE && LA36_0<=RULE_SL_COMMENT)) ) {
                    	    	            alt36=1;
                    	    	        }
                    	    	        else if ( (LA36_0==27) ) {
                    	    	            alt36=2;
                    	    	        }


                    	    	        switch (alt36) {
                    	    	    	case 1 :
                    	    	    	    // InternalJcm.g:1214:8: ruleEOL
                    	    	    	    {

                    	    	    	    								newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_5_2_1_0());
                    	    	    	    							
                    	    	    	    pushFollow(FOLLOW_35);
                    	    	    	    ruleEOL();

                    	    	    	    state._fsp--;


                    	    	    	    								afterParserOrEnumRuleCall();
                    	    	    	    							

                    	    	    	    }
                    	    	    	    break;
                    	    	    	case 2 :
                    	    	    	    // InternalJcm.g:1222:8: otherlv_35= ','
                    	    	    	    {
                    	    	    	    otherlv_35=(Token)match(input,27,FOLLOW_35); 

                    	    	    	    								newLeafNode(otherlv_35, grammarAccess.getAgentAccess().getCommaKeyword_3_2_5_2_1_1());
                    	    	    	    							

                    	    	    	    }
                    	    	    	    break;

                    	    	    	default :
                    	    	    	    if ( cnt36 >= 1 ) break loop36;
                    	    	                EarlyExitException eee =
                    	    	                    new EarlyExitException(36, input);
                    	    	                throw eee;
                    	    	        }
                    	    	        cnt36++;
                    	    	    } while (true);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop37;
                    	        }
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // InternalJcm.g:1230:5: (otherlv_36= 'goals' otherlv_37= ':' ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )* )
                    	    {
                    	    // InternalJcm.g:1230:5: (otherlv_36= 'goals' otherlv_37= ':' ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )* )
                    	    // InternalJcm.g:1231:6: otherlv_36= 'goals' otherlv_37= ':' ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )*
                    	    {
                    	    otherlv_36=(Token)match(input,43,FOLLOW_16); 

                    	    						newLeafNode(otherlv_36, grammarAccess.getAgentAccess().getGoalsKeyword_3_2_6_0());
                    	    					
                    	    otherlv_37=(Token)match(input,29,FOLLOW_34); 

                    	    						newLeafNode(otherlv_37, grammarAccess.getAgentAccess().getColonKeyword_3_2_6_1());
                    	    					
                    	    // InternalJcm.g:1239:6: ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )*
                    	    loop39:
                    	    do {
                    	        int alt39=2;
                    	        int LA39_0 = input.LA(1);

                    	        if ( (LA39_0==RULE_ATOM) ) {
                    	            int LA39_2 = input.LA(2);

                    	            if ( ((LA39_2>=RULE_NEWLINE && LA39_2<=RULE_SL_COMMENT)||LA39_2==27||LA39_2==77||LA39_2==79) ) {
                    	                alt39=1;
                    	            }


                    	        }
                    	        else if ( ((LA39_0>=RULE_VART && LA39_0<=RULE_UNNAMEDVART)||(LA39_0>=81 && LA39_0<=85)) ) {
                    	            alt39=1;
                    	        }


                    	        switch (alt39) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:1240:7: ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+
                    	    	    {
                    	    	    // InternalJcm.g:1240:7: ( (lv_goals_38_0= ruleLiteral ) )
                    	    	    // InternalJcm.g:1241:8: (lv_goals_38_0= ruleLiteral )
                    	    	    {
                    	    	    // InternalJcm.g:1241:8: (lv_goals_38_0= ruleLiteral )
                    	    	    // InternalJcm.g:1242:9: lv_goals_38_0= ruleLiteral
                    	    	    {

                    	    	    									newCompositeNode(grammarAccess.getAgentAccess().getGoalsLiteralParserRuleCall_3_2_6_2_0_0());
                    	    	    								
                    	    	    pushFollow(FOLLOW_18);
                    	    	    lv_goals_38_0=ruleLiteral();

                    	    	    state._fsp--;


                    	    	    									if (current==null) {
                    	    	    										current = createModelElementForParent(grammarAccess.getAgentRule());
                    	    	    									}
                    	    	    									add(
                    	    	    										current,
                    	    	    										"goals",
                    	    	    										lv_goals_38_0,
                    	    	    										"jacamoide.xtext.jcm.Jcm.Literal");
                    	    	    									afterParserOrEnumRuleCall();
                    	    	    								

                    	    	    }


                    	    	    }

                    	    	    // InternalJcm.g:1259:7: ( ruleEOL | otherlv_40= ',' )+
                    	    	    int cnt38=0;
                    	    	    loop38:
                    	    	    do {
                    	    	        int alt38=3;
                    	    	        int LA38_0 = input.LA(1);

                    	    	        if ( ((LA38_0>=RULE_NEWLINE && LA38_0<=RULE_SL_COMMENT)) ) {
                    	    	            alt38=1;
                    	    	        }
                    	    	        else if ( (LA38_0==27) ) {
                    	    	            alt38=2;
                    	    	        }


                    	    	        switch (alt38) {
                    	    	    	case 1 :
                    	    	    	    // InternalJcm.g:1260:8: ruleEOL
                    	    	    	    {

                    	    	    	    								newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_6_2_1_0());
                    	    	    	    							
                    	    	    	    pushFollow(FOLLOW_35);
                    	    	    	    ruleEOL();

                    	    	    	    state._fsp--;


                    	    	    	    								afterParserOrEnumRuleCall();
                    	    	    	    							

                    	    	    	    }
                    	    	    	    break;
                    	    	    	case 2 :
                    	    	    	    // InternalJcm.g:1268:8: otherlv_40= ','
                    	    	    	    {
                    	    	    	    otherlv_40=(Token)match(input,27,FOLLOW_35); 

                    	    	    	    								newLeafNode(otherlv_40, grammarAccess.getAgentAccess().getCommaKeyword_3_2_6_2_1_1());
                    	    	    	    							

                    	    	    	    }
                    	    	    	    break;

                    	    	    	default :
                    	    	    	    if ( cnt38 >= 1 ) break loop38;
                    	    	                EarlyExitException eee =
                    	    	                    new EarlyExitException(38, input);
                    	    	                throw eee;
                    	    	        }
                    	    	        cnt38++;
                    	    	    } while (true);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop39;
                    	        }
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 8 :
                    	    // InternalJcm.g:1276:5: (otherlv_41= 'focus' otherlv_42= ':' ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '::' ( (lv_focusNS_45_0= RULE_ATOM ) ) )? (otherlv_46= '@' ( (lv_focusNode_47_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_49= ',' )+ )* )
                    	    {
                    	    // InternalJcm.g:1276:5: (otherlv_41= 'focus' otherlv_42= ':' ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '::' ( (lv_focusNS_45_0= RULE_ATOM ) ) )? (otherlv_46= '@' ( (lv_focusNode_47_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_49= ',' )+ )* )
                    	    // InternalJcm.g:1277:6: otherlv_41= 'focus' otherlv_42= ':' ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '::' ( (lv_focusNS_45_0= RULE_ATOM ) ) )? (otherlv_46= '@' ( (lv_focusNode_47_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_49= ',' )+ )*
                    	    {
                    	    otherlv_41=(Token)match(input,44,FOLLOW_16); 

                    	    						newLeafNode(otherlv_41, grammarAccess.getAgentAccess().getFocusKeyword_3_2_7_0());
                    	    					
                    	    otherlv_42=(Token)match(input,29,FOLLOW_36); 

                    	    						newLeafNode(otherlv_42, grammarAccess.getAgentAccess().getColonKeyword_3_2_7_1());
                    	    					
                    	    // InternalJcm.g:1285:6: ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '::' ( (lv_focusNS_45_0= RULE_ATOM ) ) )? (otherlv_46= '@' ( (lv_focusNode_47_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_49= ',' )+ )*
                    	    loop43:
                    	    do {
                    	        int alt43=2;
                    	        int LA43_0 = input.LA(1);

                    	        if ( (LA43_0==RULE_ATOM) ) {
                    	            int LA43_2 = input.LA(2);

                    	            if ( ((LA43_2>=RULE_NEWLINE && LA43_2<=RULE_SL_COMMENT)||LA43_2==27||LA43_2==36||LA43_2==45) ) {
                    	                alt43=1;
                    	            }


                    	        }


                    	        switch (alt43) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:1286:7: ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '::' ( (lv_focusNS_45_0= RULE_ATOM ) ) )? (otherlv_46= '@' ( (lv_focusNode_47_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_49= ',' )+
                    	    	    {
                    	    	    // InternalJcm.g:1286:7: ( (lv_focus_43_0= RULE_ATOM ) )
                    	    	    // InternalJcm.g:1287:8: (lv_focus_43_0= RULE_ATOM )
                    	    	    {
                    	    	    // InternalJcm.g:1287:8: (lv_focus_43_0= RULE_ATOM )
                    	    	    // InternalJcm.g:1288:9: lv_focus_43_0= RULE_ATOM
                    	    	    {
                    	    	    lv_focus_43_0=(Token)match(input,RULE_ATOM,FOLLOW_37); 

                    	    	    									newLeafNode(lv_focus_43_0, grammarAccess.getAgentAccess().getFocusATOMTerminalRuleCall_3_2_7_2_0_0());
                    	    	    								

                    	    	    									if (current==null) {
                    	    	    										current = createModelElement(grammarAccess.getAgentRule());
                    	    	    									}
                    	    	    									addWithLastConsumed(
                    	    	    										current,
                    	    	    										"focus",
                    	    	    										lv_focus_43_0,
                    	    	    										"jacamoide.xtext.jcm.Jcm.ATOM");
                    	    	    								

                    	    	    }


                    	    	    }

                    	    	    // InternalJcm.g:1304:7: (otherlv_44= '::' ( (lv_focusNS_45_0= RULE_ATOM ) ) )?
                    	    	    int alt40=2;
                    	    	    int LA40_0 = input.LA(1);

                    	    	    if ( (LA40_0==45) ) {
                    	    	        alt40=1;
                    	    	    }
                    	    	    switch (alt40) {
                    	    	        case 1 :
                    	    	            // InternalJcm.g:1305:8: otherlv_44= '::' ( (lv_focusNS_45_0= RULE_ATOM ) )
                    	    	            {
                    	    	            otherlv_44=(Token)match(input,45,FOLLOW_4); 

                    	    	            								newLeafNode(otherlv_44, grammarAccess.getAgentAccess().getColonColonKeyword_3_2_7_2_1_0());
                    	    	            							
                    	    	            // InternalJcm.g:1309:8: ( (lv_focusNS_45_0= RULE_ATOM ) )
                    	    	            // InternalJcm.g:1310:9: (lv_focusNS_45_0= RULE_ATOM )
                    	    	            {
                    	    	            // InternalJcm.g:1310:9: (lv_focusNS_45_0= RULE_ATOM )
                    	    	            // InternalJcm.g:1311:10: lv_focusNS_45_0= RULE_ATOM
                    	    	            {
                    	    	            lv_focusNS_45_0=(Token)match(input,RULE_ATOM,FOLLOW_23); 

                    	    	            										newLeafNode(lv_focusNS_45_0, grammarAccess.getAgentAccess().getFocusNSATOMTerminalRuleCall_3_2_7_2_1_1_0());
                    	    	            									

                    	    	            										if (current==null) {
                    	    	            											current = createModelElement(grammarAccess.getAgentRule());
                    	    	            										}
                    	    	            										addWithLastConsumed(
                    	    	            											current,
                    	    	            											"focusNS",
                    	    	            											lv_focusNS_45_0,
                    	    	            											"jacamoide.xtext.jcm.Jcm.ATOM");
                    	    	            									

                    	    	            }


                    	    	            }


                    	    	            }
                    	    	            break;

                    	    	    }

                    	    	    // InternalJcm.g:1328:7: (otherlv_46= '@' ( (lv_focusNode_47_0= RULE_ATOM ) ) )?
                    	    	    int alt41=2;
                    	    	    int LA41_0 = input.LA(1);

                    	    	    if ( (LA41_0==36) ) {
                    	    	        alt41=1;
                    	    	    }
                    	    	    switch (alt41) {
                    	    	        case 1 :
                    	    	            // InternalJcm.g:1329:8: otherlv_46= '@' ( (lv_focusNode_47_0= RULE_ATOM ) )
                    	    	            {
                    	    	            otherlv_46=(Token)match(input,36,FOLLOW_4); 

                    	    	            								newLeafNode(otherlv_46, grammarAccess.getAgentAccess().getCommercialAtKeyword_3_2_7_2_2_0());
                    	    	            							
                    	    	            // InternalJcm.g:1333:8: ( (lv_focusNode_47_0= RULE_ATOM ) )
                    	    	            // InternalJcm.g:1334:9: (lv_focusNode_47_0= RULE_ATOM )
                    	    	            {
                    	    	            // InternalJcm.g:1334:9: (lv_focusNode_47_0= RULE_ATOM )
                    	    	            // InternalJcm.g:1335:10: lv_focusNode_47_0= RULE_ATOM
                    	    	            {
                    	    	            lv_focusNode_47_0=(Token)match(input,RULE_ATOM,FOLLOW_18); 

                    	    	            										newLeafNode(lv_focusNode_47_0, grammarAccess.getAgentAccess().getFocusNodeATOMTerminalRuleCall_3_2_7_2_2_1_0());
                    	    	            									

                    	    	            										if (current==null) {
                    	    	            											current = createModelElement(grammarAccess.getAgentRule());
                    	    	            										}
                    	    	            										addWithLastConsumed(
                    	    	            											current,
                    	    	            											"focusNode",
                    	    	            											lv_focusNode_47_0,
                    	    	            											"jacamoide.xtext.jcm.Jcm.ATOM");
                    	    	            									

                    	    	            }


                    	    	            }


                    	    	            }
                    	    	            break;

                    	    	    }

                    	    	    // InternalJcm.g:1352:7: ( ruleEOL | otherlv_49= ',' )+
                    	    	    int cnt42=0;
                    	    	    loop42:
                    	    	    do {
                    	    	        int alt42=3;
                    	    	        int LA42_0 = input.LA(1);

                    	    	        if ( ((LA42_0>=RULE_NEWLINE && LA42_0<=RULE_SL_COMMENT)) ) {
                    	    	            alt42=1;
                    	    	        }
                    	    	        else if ( (LA42_0==27) ) {
                    	    	            alt42=2;
                    	    	        }


                    	    	        switch (alt42) {
                    	    	    	case 1 :
                    	    	    	    // InternalJcm.g:1353:8: ruleEOL
                    	    	    	    {

                    	    	    	    								newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_7_2_3_0());
                    	    	    	    							
                    	    	    	    pushFollow(FOLLOW_30);
                    	    	    	    ruleEOL();

                    	    	    	    state._fsp--;


                    	    	    	    								afterParserOrEnumRuleCall();
                    	    	    	    							

                    	    	    	    }
                    	    	    	    break;
                    	    	    	case 2 :
                    	    	    	    // InternalJcm.g:1361:8: otherlv_49= ','
                    	    	    	    {
                    	    	    	    otherlv_49=(Token)match(input,27,FOLLOW_30); 

                    	    	    	    								newLeafNode(otherlv_49, grammarAccess.getAgentAccess().getCommaKeyword_3_2_7_2_3_1());
                    	    	    	    							

                    	    	    	    }
                    	    	    	    break;

                    	    	    	default :
                    	    	    	    if ( cnt42 >= 1 ) break loop42;
                    	    	                EarlyExitException eee =
                    	    	                    new EarlyExitException(42, input);
                    	    	                throw eee;
                    	    	        }
                    	    	        cnt42++;
                    	    	    } while (true);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop43;
                    	        }
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 9 :
                    	    // InternalJcm.g:1369:5: (otherlv_50= 'join' otherlv_51= ':' ( ( (lv_join_52_0= RULE_ATOM ) ) (otherlv_53= '@' ( (lv_joinNode_54_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_56= ',' )+ )* )
                    	    {
                    	    // InternalJcm.g:1369:5: (otherlv_50= 'join' otherlv_51= ':' ( ( (lv_join_52_0= RULE_ATOM ) ) (otherlv_53= '@' ( (lv_joinNode_54_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_56= ',' )+ )* )
                    	    // InternalJcm.g:1370:6: otherlv_50= 'join' otherlv_51= ':' ( ( (lv_join_52_0= RULE_ATOM ) ) (otherlv_53= '@' ( (lv_joinNode_54_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_56= ',' )+ )*
                    	    {
                    	    otherlv_50=(Token)match(input,46,FOLLOW_16); 

                    	    						newLeafNode(otherlv_50, grammarAccess.getAgentAccess().getJoinKeyword_3_2_8_0());
                    	    					
                    	    otherlv_51=(Token)match(input,29,FOLLOW_36); 

                    	    						newLeafNode(otherlv_51, grammarAccess.getAgentAccess().getColonKeyword_3_2_8_1());
                    	    					
                    	    // InternalJcm.g:1378:6: ( ( (lv_join_52_0= RULE_ATOM ) ) (otherlv_53= '@' ( (lv_joinNode_54_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_56= ',' )+ )*
                    	    loop46:
                    	    do {
                    	        int alt46=2;
                    	        int LA46_0 = input.LA(1);

                    	        if ( (LA46_0==RULE_ATOM) ) {
                    	            int LA46_2 = input.LA(2);

                    	            if ( ((LA46_2>=RULE_NEWLINE && LA46_2<=RULE_SL_COMMENT)||LA46_2==27||LA46_2==36) ) {
                    	                alt46=1;
                    	            }


                    	        }


                    	        switch (alt46) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:1379:7: ( (lv_join_52_0= RULE_ATOM ) ) (otherlv_53= '@' ( (lv_joinNode_54_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_56= ',' )+
                    	    	    {
                    	    	    // InternalJcm.g:1379:7: ( (lv_join_52_0= RULE_ATOM ) )
                    	    	    // InternalJcm.g:1380:8: (lv_join_52_0= RULE_ATOM )
                    	    	    {
                    	    	    // InternalJcm.g:1380:8: (lv_join_52_0= RULE_ATOM )
                    	    	    // InternalJcm.g:1381:9: lv_join_52_0= RULE_ATOM
                    	    	    {
                    	    	    lv_join_52_0=(Token)match(input,RULE_ATOM,FOLLOW_23); 

                    	    	    									newLeafNode(lv_join_52_0, grammarAccess.getAgentAccess().getJoinATOMTerminalRuleCall_3_2_8_2_0_0());
                    	    	    								

                    	    	    									if (current==null) {
                    	    	    										current = createModelElement(grammarAccess.getAgentRule());
                    	    	    									}
                    	    	    									addWithLastConsumed(
                    	    	    										current,
                    	    	    										"join",
                    	    	    										lv_join_52_0,
                    	    	    										"jacamoide.xtext.jcm.Jcm.ATOM");
                    	    	    								

                    	    	    }


                    	    	    }

                    	    	    // InternalJcm.g:1397:7: (otherlv_53= '@' ( (lv_joinNode_54_0= RULE_ATOM ) ) )?
                    	    	    int alt44=2;
                    	    	    int LA44_0 = input.LA(1);

                    	    	    if ( (LA44_0==36) ) {
                    	    	        alt44=1;
                    	    	    }
                    	    	    switch (alt44) {
                    	    	        case 1 :
                    	    	            // InternalJcm.g:1398:8: otherlv_53= '@' ( (lv_joinNode_54_0= RULE_ATOM ) )
                    	    	            {
                    	    	            otherlv_53=(Token)match(input,36,FOLLOW_4); 

                    	    	            								newLeafNode(otherlv_53, grammarAccess.getAgentAccess().getCommercialAtKeyword_3_2_8_2_1_0());
                    	    	            							
                    	    	            // InternalJcm.g:1402:8: ( (lv_joinNode_54_0= RULE_ATOM ) )
                    	    	            // InternalJcm.g:1403:9: (lv_joinNode_54_0= RULE_ATOM )
                    	    	            {
                    	    	            // InternalJcm.g:1403:9: (lv_joinNode_54_0= RULE_ATOM )
                    	    	            // InternalJcm.g:1404:10: lv_joinNode_54_0= RULE_ATOM
                    	    	            {
                    	    	            lv_joinNode_54_0=(Token)match(input,RULE_ATOM,FOLLOW_18); 

                    	    	            										newLeafNode(lv_joinNode_54_0, grammarAccess.getAgentAccess().getJoinNodeATOMTerminalRuleCall_3_2_8_2_1_1_0());
                    	    	            									

                    	    	            										if (current==null) {
                    	    	            											current = createModelElement(grammarAccess.getAgentRule());
                    	    	            										}
                    	    	            										addWithLastConsumed(
                    	    	            											current,
                    	    	            											"joinNode",
                    	    	            											lv_joinNode_54_0,
                    	    	            											"jacamoide.xtext.jcm.Jcm.ATOM");
                    	    	            									

                    	    	            }


                    	    	            }


                    	    	            }
                    	    	            break;

                    	    	    }

                    	    	    // InternalJcm.g:1421:7: ( ruleEOL | otherlv_56= ',' )+
                    	    	    int cnt45=0;
                    	    	    loop45:
                    	    	    do {
                    	    	        int alt45=3;
                    	    	        int LA45_0 = input.LA(1);

                    	    	        if ( ((LA45_0>=RULE_NEWLINE && LA45_0<=RULE_SL_COMMENT)) ) {
                    	    	            alt45=1;
                    	    	        }
                    	    	        else if ( (LA45_0==27) ) {
                    	    	            alt45=2;
                    	    	        }


                    	    	        switch (alt45) {
                    	    	    	case 1 :
                    	    	    	    // InternalJcm.g:1422:8: ruleEOL
                    	    	    	    {

                    	    	    	    								newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_8_2_2_0());
                    	    	    	    							
                    	    	    	    pushFollow(FOLLOW_30);
                    	    	    	    ruleEOL();

                    	    	    	    state._fsp--;


                    	    	    	    								afterParserOrEnumRuleCall();
                    	    	    	    							

                    	    	    	    }
                    	    	    	    break;
                    	    	    	case 2 :
                    	    	    	    // InternalJcm.g:1430:8: otherlv_56= ','
                    	    	    	    {
                    	    	    	    otherlv_56=(Token)match(input,27,FOLLOW_30); 

                    	    	    	    								newLeafNode(otherlv_56, grammarAccess.getAgentAccess().getCommaKeyword_3_2_8_2_2_1());
                    	    	    	    							

                    	    	    	    }
                    	    	    	    break;

                    	    	    	default :
                    	    	    	    if ( cnt45 >= 1 ) break loop45;
                    	    	                EarlyExitException eee =
                    	    	                    new EarlyExitException(45, input);
                    	    	                throw eee;
                    	    	        }
                    	    	        cnt45++;
                    	    	    } while (true);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop46;
                    	        }
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 10 :
                    	    // InternalJcm.g:1438:5: (otherlv_57= 'roles' otherlv_58= ':' ( ( (lv_role_59_0= RULE_ATOM ) ) otherlv_60= 'in' ( (lv_group_61_0= RULE_ATOM ) ) (otherlv_62= '@' ( (lv_groupNode_63_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_65= ',' )+ )* )
                    	    {
                    	    // InternalJcm.g:1438:5: (otherlv_57= 'roles' otherlv_58= ':' ( ( (lv_role_59_0= RULE_ATOM ) ) otherlv_60= 'in' ( (lv_group_61_0= RULE_ATOM ) ) (otherlv_62= '@' ( (lv_groupNode_63_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_65= ',' )+ )* )
                    	    // InternalJcm.g:1439:6: otherlv_57= 'roles' otherlv_58= ':' ( ( (lv_role_59_0= RULE_ATOM ) ) otherlv_60= 'in' ( (lv_group_61_0= RULE_ATOM ) ) (otherlv_62= '@' ( (lv_groupNode_63_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_65= ',' )+ )*
                    	    {
                    	    otherlv_57=(Token)match(input,47,FOLLOW_16); 

                    	    						newLeafNode(otherlv_57, grammarAccess.getAgentAccess().getRolesKeyword_3_2_9_0());
                    	    					
                    	    otherlv_58=(Token)match(input,29,FOLLOW_36); 

                    	    						newLeafNode(otherlv_58, grammarAccess.getAgentAccess().getColonKeyword_3_2_9_1());
                    	    					
                    	    // InternalJcm.g:1447:6: ( ( (lv_role_59_0= RULE_ATOM ) ) otherlv_60= 'in' ( (lv_group_61_0= RULE_ATOM ) ) (otherlv_62= '@' ( (lv_groupNode_63_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_65= ',' )+ )*
                    	    loop49:
                    	    do {
                    	        int alt49=2;
                    	        int LA49_0 = input.LA(1);

                    	        if ( (LA49_0==RULE_ATOM) ) {
                    	            int LA49_2 = input.LA(2);

                    	            if ( (LA49_2==48) ) {
                    	                alt49=1;
                    	            }


                    	        }


                    	        switch (alt49) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:1448:7: ( (lv_role_59_0= RULE_ATOM ) ) otherlv_60= 'in' ( (lv_group_61_0= RULE_ATOM ) ) (otherlv_62= '@' ( (lv_groupNode_63_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_65= ',' )+
                    	    	    {
                    	    	    // InternalJcm.g:1448:7: ( (lv_role_59_0= RULE_ATOM ) )
                    	    	    // InternalJcm.g:1449:8: (lv_role_59_0= RULE_ATOM )
                    	    	    {
                    	    	    // InternalJcm.g:1449:8: (lv_role_59_0= RULE_ATOM )
                    	    	    // InternalJcm.g:1450:9: lv_role_59_0= RULE_ATOM
                    	    	    {
                    	    	    lv_role_59_0=(Token)match(input,RULE_ATOM,FOLLOW_38); 

                    	    	    									newLeafNode(lv_role_59_0, grammarAccess.getAgentAccess().getRoleATOMTerminalRuleCall_3_2_9_2_0_0());
                    	    	    								

                    	    	    									if (current==null) {
                    	    	    										current = createModelElement(grammarAccess.getAgentRule());
                    	    	    									}
                    	    	    									addWithLastConsumed(
                    	    	    										current,
                    	    	    										"role",
                    	    	    										lv_role_59_0,
                    	    	    										"jacamoide.xtext.jcm.Jcm.ATOM");
                    	    	    								

                    	    	    }


                    	    	    }

                    	    	    otherlv_60=(Token)match(input,48,FOLLOW_4); 

                    	    	    							newLeafNode(otherlv_60, grammarAccess.getAgentAccess().getInKeyword_3_2_9_2_1());
                    	    	    						
                    	    	    // InternalJcm.g:1470:7: ( (lv_group_61_0= RULE_ATOM ) )
                    	    	    // InternalJcm.g:1471:8: (lv_group_61_0= RULE_ATOM )
                    	    	    {
                    	    	    // InternalJcm.g:1471:8: (lv_group_61_0= RULE_ATOM )
                    	    	    // InternalJcm.g:1472:9: lv_group_61_0= RULE_ATOM
                    	    	    {
                    	    	    lv_group_61_0=(Token)match(input,RULE_ATOM,FOLLOW_23); 

                    	    	    									newLeafNode(lv_group_61_0, grammarAccess.getAgentAccess().getGroupATOMTerminalRuleCall_3_2_9_2_2_0());
                    	    	    								

                    	    	    									if (current==null) {
                    	    	    										current = createModelElement(grammarAccess.getAgentRule());
                    	    	    									}
                    	    	    									addWithLastConsumed(
                    	    	    										current,
                    	    	    										"group",
                    	    	    										lv_group_61_0,
                    	    	    										"jacamoide.xtext.jcm.Jcm.ATOM");
                    	    	    								

                    	    	    }


                    	    	    }

                    	    	    // InternalJcm.g:1488:7: (otherlv_62= '@' ( (lv_groupNode_63_0= RULE_ATOM ) ) )?
                    	    	    int alt47=2;
                    	    	    int LA47_0 = input.LA(1);

                    	    	    if ( (LA47_0==36) ) {
                    	    	        alt47=1;
                    	    	    }
                    	    	    switch (alt47) {
                    	    	        case 1 :
                    	    	            // InternalJcm.g:1489:8: otherlv_62= '@' ( (lv_groupNode_63_0= RULE_ATOM ) )
                    	    	            {
                    	    	            otherlv_62=(Token)match(input,36,FOLLOW_4); 

                    	    	            								newLeafNode(otherlv_62, grammarAccess.getAgentAccess().getCommercialAtKeyword_3_2_9_2_3_0());
                    	    	            							
                    	    	            // InternalJcm.g:1493:8: ( (lv_groupNode_63_0= RULE_ATOM ) )
                    	    	            // InternalJcm.g:1494:9: (lv_groupNode_63_0= RULE_ATOM )
                    	    	            {
                    	    	            // InternalJcm.g:1494:9: (lv_groupNode_63_0= RULE_ATOM )
                    	    	            // InternalJcm.g:1495:10: lv_groupNode_63_0= RULE_ATOM
                    	    	            {
                    	    	            lv_groupNode_63_0=(Token)match(input,RULE_ATOM,FOLLOW_18); 

                    	    	            										newLeafNode(lv_groupNode_63_0, grammarAccess.getAgentAccess().getGroupNodeATOMTerminalRuleCall_3_2_9_2_3_1_0());
                    	    	            									

                    	    	            										if (current==null) {
                    	    	            											current = createModelElement(grammarAccess.getAgentRule());
                    	    	            										}
                    	    	            										addWithLastConsumed(
                    	    	            											current,
                    	    	            											"groupNode",
                    	    	            											lv_groupNode_63_0,
                    	    	            											"jacamoide.xtext.jcm.Jcm.ATOM");
                    	    	            									

                    	    	            }


                    	    	            }


                    	    	            }
                    	    	            break;

                    	    	    }

                    	    	    // InternalJcm.g:1512:7: ( ruleEOL | otherlv_65= ',' )+
                    	    	    int cnt48=0;
                    	    	    loop48:
                    	    	    do {
                    	    	        int alt48=3;
                    	    	        int LA48_0 = input.LA(1);

                    	    	        if ( ((LA48_0>=RULE_NEWLINE && LA48_0<=RULE_SL_COMMENT)) ) {
                    	    	            alt48=1;
                    	    	        }
                    	    	        else if ( (LA48_0==27) ) {
                    	    	            alt48=2;
                    	    	        }


                    	    	        switch (alt48) {
                    	    	    	case 1 :
                    	    	    	    // InternalJcm.g:1513:8: ruleEOL
                    	    	    	    {

                    	    	    	    								newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_9_2_4_0());
                    	    	    	    							
                    	    	    	    pushFollow(FOLLOW_30);
                    	    	    	    ruleEOL();

                    	    	    	    state._fsp--;


                    	    	    	    								afterParserOrEnumRuleCall();
                    	    	    	    							

                    	    	    	    }
                    	    	    	    break;
                    	    	    	case 2 :
                    	    	    	    // InternalJcm.g:1521:8: otherlv_65= ','
                    	    	    	    {
                    	    	    	    otherlv_65=(Token)match(input,27,FOLLOW_30); 

                    	    	    	    								newLeafNode(otherlv_65, grammarAccess.getAgentAccess().getCommaKeyword_3_2_9_2_4_1());
                    	    	    	    							

                    	    	    	    }
                    	    	    	    break;

                    	    	    	default :
                    	    	    	    if ( cnt48 >= 1 ) break loop48;
                    	    	                EarlyExitException eee =
                    	    	                    new EarlyExitException(48, input);
                    	    	                throw eee;
                    	    	        }
                    	    	        cnt48++;
                    	    	    } while (true);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop49;
                    	        }
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 11 :
                    	    // InternalJcm.g:1529:5: (otherlv_66= 'debug' otherlv_67= ':' ( (lv_debug_68_0= ruleLiteral ) ) ( ruleEOL | otherlv_70= ',' )+ )
                    	    {
                    	    // InternalJcm.g:1529:5: (otherlv_66= 'debug' otherlv_67= ':' ( (lv_debug_68_0= ruleLiteral ) ) ( ruleEOL | otherlv_70= ',' )+ )
                    	    // InternalJcm.g:1530:6: otherlv_66= 'debug' otherlv_67= ':' ( (lv_debug_68_0= ruleLiteral ) ) ( ruleEOL | otherlv_70= ',' )+
                    	    {
                    	    otherlv_66=(Token)match(input,49,FOLLOW_16); 

                    	    						newLeafNode(otherlv_66, grammarAccess.getAgentAccess().getDebugKeyword_3_2_10_0());
                    	    					
                    	    otherlv_67=(Token)match(input,29,FOLLOW_39); 

                    	    						newLeafNode(otherlv_67, grammarAccess.getAgentAccess().getColonKeyword_3_2_10_1());
                    	    					
                    	    // InternalJcm.g:1538:6: ( (lv_debug_68_0= ruleLiteral ) )
                    	    // InternalJcm.g:1539:7: (lv_debug_68_0= ruleLiteral )
                    	    {
                    	    // InternalJcm.g:1539:7: (lv_debug_68_0= ruleLiteral )
                    	    // InternalJcm.g:1540:8: lv_debug_68_0= ruleLiteral
                    	    {

                    	    								newCompositeNode(grammarAccess.getAgentAccess().getDebugLiteralParserRuleCall_3_2_10_2_0());
                    	    							
                    	    pushFollow(FOLLOW_18);
                    	    lv_debug_68_0=ruleLiteral();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getAgentRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"debug",
                    	    									lv_debug_68_0,
                    	    									"jacamoide.xtext.jcm.Jcm.Literal");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }

                    	    // InternalJcm.g:1557:6: ( ruleEOL | otherlv_70= ',' )+
                    	    int cnt50=0;
                    	    loop50:
                    	    do {
                    	        int alt50=3;
                    	        int LA50_0 = input.LA(1);

                    	        if ( ((LA50_0>=RULE_NEWLINE && LA50_0<=RULE_SL_COMMENT)) ) {
                    	            alt50=1;
                    	        }
                    	        else if ( (LA50_0==27) ) {
                    	            alt50=2;
                    	        }


                    	        switch (alt50) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:1558:7: ruleEOL
                    	    	    {

                    	    	    							newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_10_3_0());
                    	    	    						
                    	    	    pushFollow(FOLLOW_30);
                    	    	    ruleEOL();

                    	    	    state._fsp--;


                    	    	    							afterParserOrEnumRuleCall();
                    	    	    						

                    	    	    }
                    	    	    break;
                    	    	case 2 :
                    	    	    // InternalJcm.g:1566:7: otherlv_70= ','
                    	    	    {
                    	    	    otherlv_70=(Token)match(input,27,FOLLOW_30); 

                    	    	    							newLeafNode(otherlv_70, grammarAccess.getAgentAccess().getCommaKeyword_3_2_10_3_1());
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt50 >= 1 ) break loop50;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(50, input);
                    	                throw eee;
                    	        }
                    	        cnt50++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 12 :
                    	    // InternalJcm.g:1573:5: (otherlv_71= 'verbose' otherlv_72= ':' ( (lv_verbose_73_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ )
                    	    {
                    	    // InternalJcm.g:1573:5: (otherlv_71= 'verbose' otherlv_72= ':' ( (lv_verbose_73_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ )
                    	    // InternalJcm.g:1574:6: otherlv_71= 'verbose' otherlv_72= ':' ( (lv_verbose_73_0= RULE_INT_LITERAL ) ) ( ruleEOL )+
                    	    {
                    	    otherlv_71=(Token)match(input,50,FOLLOW_16); 

                    	    						newLeafNode(otherlv_71, grammarAccess.getAgentAccess().getVerboseKeyword_3_2_11_0());
                    	    					
                    	    otherlv_72=(Token)match(input,29,FOLLOW_40); 

                    	    						newLeafNode(otherlv_72, grammarAccess.getAgentAccess().getColonKeyword_3_2_11_1());
                    	    					
                    	    // InternalJcm.g:1582:6: ( (lv_verbose_73_0= RULE_INT_LITERAL ) )
                    	    // InternalJcm.g:1583:7: (lv_verbose_73_0= RULE_INT_LITERAL )
                    	    {
                    	    // InternalJcm.g:1583:7: (lv_verbose_73_0= RULE_INT_LITERAL )
                    	    // InternalJcm.g:1584:8: lv_verbose_73_0= RULE_INT_LITERAL
                    	    {
                    	    lv_verbose_73_0=(Token)match(input,RULE_INT_LITERAL,FOLLOW_3); 

                    	    								newLeafNode(lv_verbose_73_0, grammarAccess.getAgentAccess().getVerboseINT_LITERALTerminalRuleCall_3_2_11_2_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getAgentRule());
                    	    								}
                    	    								addWithLastConsumed(
                    	    									current,
                    	    									"verbose",
                    	    									lv_verbose_73_0,
                    	    									"jacamoide.xtext.jcm.Jcm.INT_LITERAL");
                    	    							

                    	    }


                    	    }

                    	    // InternalJcm.g:1600:6: ( ruleEOL )+
                    	    int cnt51=0;
                    	    loop51:
                    	    do {
                    	        int alt51=2;
                    	        int LA51_0 = input.LA(1);

                    	        if ( ((LA51_0>=RULE_NEWLINE && LA51_0<=RULE_SL_COMMENT)) ) {
                    	            alt51=1;
                    	        }


                    	        switch (alt51) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:1601:7: ruleEOL
                    	    	    {

                    	    	    							newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_11_3());
                    	    	    						
                    	    	    pushFollow(FOLLOW_28);
                    	    	    ruleEOL();

                    	    	    state._fsp--;


                    	    	    							afterParserOrEnumRuleCall();
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt51 >= 1 ) break loop51;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(51, input);
                    	                throw eee;
                    	        }
                    	        cnt51++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 13 :
                    	    // InternalJcm.g:1611:5: (otherlv_75= 'nrcbp' otherlv_76= ':' ( (lv_nrcbp_77_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ )
                    	    {
                    	    // InternalJcm.g:1611:5: (otherlv_75= 'nrcbp' otherlv_76= ':' ( (lv_nrcbp_77_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ )
                    	    // InternalJcm.g:1612:6: otherlv_75= 'nrcbp' otherlv_76= ':' ( (lv_nrcbp_77_0= RULE_INT_LITERAL ) ) ( ruleEOL )+
                    	    {
                    	    otherlv_75=(Token)match(input,51,FOLLOW_16); 

                    	    						newLeafNode(otherlv_75, grammarAccess.getAgentAccess().getNrcbpKeyword_3_2_12_0());
                    	    					
                    	    otherlv_76=(Token)match(input,29,FOLLOW_40); 

                    	    						newLeafNode(otherlv_76, grammarAccess.getAgentAccess().getColonKeyword_3_2_12_1());
                    	    					
                    	    // InternalJcm.g:1620:6: ( (lv_nrcbp_77_0= RULE_INT_LITERAL ) )
                    	    // InternalJcm.g:1621:7: (lv_nrcbp_77_0= RULE_INT_LITERAL )
                    	    {
                    	    // InternalJcm.g:1621:7: (lv_nrcbp_77_0= RULE_INT_LITERAL )
                    	    // InternalJcm.g:1622:8: lv_nrcbp_77_0= RULE_INT_LITERAL
                    	    {
                    	    lv_nrcbp_77_0=(Token)match(input,RULE_INT_LITERAL,FOLLOW_3); 

                    	    								newLeafNode(lv_nrcbp_77_0, grammarAccess.getAgentAccess().getNrcbpINT_LITERALTerminalRuleCall_3_2_12_2_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getAgentRule());
                    	    								}
                    	    								addWithLastConsumed(
                    	    									current,
                    	    									"nrcbp",
                    	    									lv_nrcbp_77_0,
                    	    									"jacamoide.xtext.jcm.Jcm.INT_LITERAL");
                    	    							

                    	    }


                    	    }

                    	    // InternalJcm.g:1638:6: ( ruleEOL )+
                    	    int cnt52=0;
                    	    loop52:
                    	    do {
                    	        int alt52=2;
                    	        int LA52_0 = input.LA(1);

                    	        if ( ((LA52_0>=RULE_NEWLINE && LA52_0<=RULE_SL_COMMENT)) ) {
                    	            alt52=1;
                    	        }


                    	        switch (alt52) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:1639:7: ruleEOL
                    	    	    {

                    	    	    							newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_12_3());
                    	    	    						
                    	    	    pushFollow(FOLLOW_28);
                    	    	    ruleEOL();

                    	    	    state._fsp--;


                    	    	    							afterParserOrEnumRuleCall();
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt52 >= 1 ) break loop52;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(52, input);
                    	                throw eee;
                    	        }
                    	        cnt52++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 14 :
                    	    // InternalJcm.g:1649:5: (otherlv_79= 'events' otherlv_80= ':' (otherlv_81= 'discard' | otherlv_82= 'requeue' | otherlv_83= 'retrieve' ) ( ruleEOL )+ )
                    	    {
                    	    // InternalJcm.g:1649:5: (otherlv_79= 'events' otherlv_80= ':' (otherlv_81= 'discard' | otherlv_82= 'requeue' | otherlv_83= 'retrieve' ) ( ruleEOL )+ )
                    	    // InternalJcm.g:1650:6: otherlv_79= 'events' otherlv_80= ':' (otherlv_81= 'discard' | otherlv_82= 'requeue' | otherlv_83= 'retrieve' ) ( ruleEOL )+
                    	    {
                    	    otherlv_79=(Token)match(input,52,FOLLOW_16); 

                    	    						newLeafNode(otherlv_79, grammarAccess.getAgentAccess().getEventsKeyword_3_2_13_0());
                    	    					
                    	    otherlv_80=(Token)match(input,29,FOLLOW_41); 

                    	    						newLeafNode(otherlv_80, grammarAccess.getAgentAccess().getColonKeyword_3_2_13_1());
                    	    					
                    	    // InternalJcm.g:1658:6: (otherlv_81= 'discard' | otherlv_82= 'requeue' | otherlv_83= 'retrieve' )
                    	    int alt53=3;
                    	    switch ( input.LA(1) ) {
                    	    case 53:
                    	        {
                    	        alt53=1;
                    	        }
                    	        break;
                    	    case 54:
                    	        {
                    	        alt53=2;
                    	        }
                    	        break;
                    	    case 55:
                    	        {
                    	        alt53=3;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 53, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt53) {
                    	        case 1 :
                    	            // InternalJcm.g:1659:7: otherlv_81= 'discard'
                    	            {
                    	            otherlv_81=(Token)match(input,53,FOLLOW_3); 

                    	            							newLeafNode(otherlv_81, grammarAccess.getAgentAccess().getDiscardKeyword_3_2_13_2_0());
                    	            						

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalJcm.g:1664:7: otherlv_82= 'requeue'
                    	            {
                    	            otherlv_82=(Token)match(input,54,FOLLOW_3); 

                    	            							newLeafNode(otherlv_82, grammarAccess.getAgentAccess().getRequeueKeyword_3_2_13_2_1());
                    	            						

                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalJcm.g:1669:7: otherlv_83= 'retrieve'
                    	            {
                    	            otherlv_83=(Token)match(input,55,FOLLOW_3); 

                    	            							newLeafNode(otherlv_83, grammarAccess.getAgentAccess().getRetrieveKeyword_3_2_13_2_2());
                    	            						

                    	            }
                    	            break;

                    	    }

                    	    // InternalJcm.g:1674:6: ( ruleEOL )+
                    	    int cnt54=0;
                    	    loop54:
                    	    do {
                    	        int alt54=2;
                    	        int LA54_0 = input.LA(1);

                    	        if ( ((LA54_0>=RULE_NEWLINE && LA54_0<=RULE_SL_COMMENT)) ) {
                    	            alt54=1;
                    	        }


                    	        switch (alt54) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:1675:7: ruleEOL
                    	    	    {

                    	    	    							newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_13_3());
                    	    	    						
                    	    	    pushFollow(FOLLOW_28);
                    	    	    ruleEOL();

                    	    	    state._fsp--;


                    	    	    							afterParserOrEnumRuleCall();
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt54 >= 1 ) break loop54;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(54, input);
                    	                throw eee;
                    	        }
                    	        cnt54++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 15 :
                    	    // InternalJcm.g:1685:5: (otherlv_85= 'intBels' otherlv_86= ':' (otherlv_87= 'sameFocus' | otherlv_88= 'newFocus' ) ( ruleEOL )+ )
                    	    {
                    	    // InternalJcm.g:1685:5: (otherlv_85= 'intBels' otherlv_86= ':' (otherlv_87= 'sameFocus' | otherlv_88= 'newFocus' ) ( ruleEOL )+ )
                    	    // InternalJcm.g:1686:6: otherlv_85= 'intBels' otherlv_86= ':' (otherlv_87= 'sameFocus' | otherlv_88= 'newFocus' ) ( ruleEOL )+
                    	    {
                    	    otherlv_85=(Token)match(input,56,FOLLOW_16); 

                    	    						newLeafNode(otherlv_85, grammarAccess.getAgentAccess().getIntBelsKeyword_3_2_14_0());
                    	    					
                    	    otherlv_86=(Token)match(input,29,FOLLOW_42); 

                    	    						newLeafNode(otherlv_86, grammarAccess.getAgentAccess().getColonKeyword_3_2_14_1());
                    	    					
                    	    // InternalJcm.g:1694:6: (otherlv_87= 'sameFocus' | otherlv_88= 'newFocus' )
                    	    int alt55=2;
                    	    int LA55_0 = input.LA(1);

                    	    if ( (LA55_0==57) ) {
                    	        alt55=1;
                    	    }
                    	    else if ( (LA55_0==58) ) {
                    	        alt55=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 55, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt55) {
                    	        case 1 :
                    	            // InternalJcm.g:1695:7: otherlv_87= 'sameFocus'
                    	            {
                    	            otherlv_87=(Token)match(input,57,FOLLOW_3); 

                    	            							newLeafNode(otherlv_87, grammarAccess.getAgentAccess().getSameFocusKeyword_3_2_14_2_0());
                    	            						

                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalJcm.g:1700:7: otherlv_88= 'newFocus'
                    	            {
                    	            otherlv_88=(Token)match(input,58,FOLLOW_3); 

                    	            							newLeafNode(otherlv_88, grammarAccess.getAgentAccess().getNewFocusKeyword_3_2_14_2_1());
                    	            						

                    	            }
                    	            break;

                    	    }

                    	    // InternalJcm.g:1705:6: ( ruleEOL )+
                    	    int cnt56=0;
                    	    loop56:
                    	    do {
                    	        int alt56=2;
                    	        int LA56_0 = input.LA(1);

                    	        if ( ((LA56_0>=RULE_NEWLINE && LA56_0<=RULE_SL_COMMENT)) ) {
                    	            alt56=1;
                    	        }


                    	        switch (alt56) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:1706:7: ruleEOL
                    	    	    {

                    	    	    							newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_14_3());
                    	    	    						
                    	    	    pushFollow(FOLLOW_28);
                    	    	    ruleEOL();

                    	    	    state._fsp--;


                    	    	    							afterParserOrEnumRuleCall();
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt56 >= 1 ) break loop56;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(56, input);
                    	                throw eee;
                    	        }
                    	        cnt56++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 16 :
                    	    // InternalJcm.g:1716:5: ( ( (lv_other_90_0= RULE_ATOM ) ) otherlv_91= ':' ( ( (lv_string_92_0= RULE_STRING ) ) | ( (lv_val_93_0= RULE_INT_LITERAL ) ) | ( (lv_literal_94_0= ruleLiteral ) ) | ( (lv_val_real_95_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ )
                    	    {
                    	    // InternalJcm.g:1716:5: ( ( (lv_other_90_0= RULE_ATOM ) ) otherlv_91= ':' ( ( (lv_string_92_0= RULE_STRING ) ) | ( (lv_val_93_0= RULE_INT_LITERAL ) ) | ( (lv_literal_94_0= ruleLiteral ) ) | ( (lv_val_real_95_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ )
                    	    // InternalJcm.g:1717:6: ( (lv_other_90_0= RULE_ATOM ) ) otherlv_91= ':' ( ( (lv_string_92_0= RULE_STRING ) ) | ( (lv_val_93_0= RULE_INT_LITERAL ) ) | ( (lv_literal_94_0= ruleLiteral ) ) | ( (lv_val_real_95_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+
                    	    {
                    	    // InternalJcm.g:1717:6: ( (lv_other_90_0= RULE_ATOM ) )
                    	    // InternalJcm.g:1718:7: (lv_other_90_0= RULE_ATOM )
                    	    {
                    	    // InternalJcm.g:1718:7: (lv_other_90_0= RULE_ATOM )
                    	    // InternalJcm.g:1719:8: lv_other_90_0= RULE_ATOM
                    	    {
                    	    lv_other_90_0=(Token)match(input,RULE_ATOM,FOLLOW_16); 

                    	    								newLeafNode(lv_other_90_0, grammarAccess.getAgentAccess().getOtherATOMTerminalRuleCall_3_2_15_0_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getAgentRule());
                    	    								}
                    	    								addWithLastConsumed(
                    	    									current,
                    	    									"other",
                    	    									lv_other_90_0,
                    	    									"jacamoide.xtext.jcm.Jcm.ATOM");
                    	    							

                    	    }


                    	    }

                    	    otherlv_91=(Token)match(input,29,FOLLOW_43); 

                    	    						newLeafNode(otherlv_91, grammarAccess.getAgentAccess().getColonKeyword_3_2_15_1());
                    	    					
                    	    // InternalJcm.g:1739:6: ( ( (lv_string_92_0= RULE_STRING ) ) | ( (lv_val_93_0= RULE_INT_LITERAL ) ) | ( (lv_literal_94_0= ruleLiteral ) ) | ( (lv_val_real_95_0= RULE_REAL_LITERAL ) ) )
                    	    int alt57=4;
                    	    switch ( input.LA(1) ) {
                    	    case RULE_STRING:
                    	        {
                    	        alt57=1;
                    	        }
                    	        break;
                    	    case RULE_INT_LITERAL:
                    	        {
                    	        alt57=2;
                    	        }
                    	        break;
                    	    case RULE_ATOM:
                    	    case RULE_VART:
                    	    case RULE_UNNAMEDVART:
                    	    case 81:
                    	    case 82:
                    	    case 83:
                    	    case 84:
                    	    case 85:
                    	        {
                    	        alt57=3;
                    	        }
                    	        break;
                    	    case RULE_REAL_LITERAL:
                    	        {
                    	        alt57=4;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 57, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt57) {
                    	        case 1 :
                    	            // InternalJcm.g:1740:7: ( (lv_string_92_0= RULE_STRING ) )
                    	            {
                    	            // InternalJcm.g:1740:7: ( (lv_string_92_0= RULE_STRING ) )
                    	            // InternalJcm.g:1741:8: (lv_string_92_0= RULE_STRING )
                    	            {
                    	            // InternalJcm.g:1741:8: (lv_string_92_0= RULE_STRING )
                    	            // InternalJcm.g:1742:9: lv_string_92_0= RULE_STRING
                    	            {
                    	            lv_string_92_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

                    	            									newLeafNode(lv_string_92_0, grammarAccess.getAgentAccess().getStringSTRINGTerminalRuleCall_3_2_15_2_0_0());
                    	            								

                    	            									if (current==null) {
                    	            										current = createModelElement(grammarAccess.getAgentRule());
                    	            									}
                    	            									addWithLastConsumed(
                    	            										current,
                    	            										"string",
                    	            										lv_string_92_0,
                    	            										"jacamoide.xtext.jcm.Jcm.STRING");
                    	            								

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalJcm.g:1759:7: ( (lv_val_93_0= RULE_INT_LITERAL ) )
                    	            {
                    	            // InternalJcm.g:1759:7: ( (lv_val_93_0= RULE_INT_LITERAL ) )
                    	            // InternalJcm.g:1760:8: (lv_val_93_0= RULE_INT_LITERAL )
                    	            {
                    	            // InternalJcm.g:1760:8: (lv_val_93_0= RULE_INT_LITERAL )
                    	            // InternalJcm.g:1761:9: lv_val_93_0= RULE_INT_LITERAL
                    	            {
                    	            lv_val_93_0=(Token)match(input,RULE_INT_LITERAL,FOLLOW_3); 

                    	            									newLeafNode(lv_val_93_0, grammarAccess.getAgentAccess().getValINT_LITERALTerminalRuleCall_3_2_15_2_1_0());
                    	            								

                    	            									if (current==null) {
                    	            										current = createModelElement(grammarAccess.getAgentRule());
                    	            									}
                    	            									addWithLastConsumed(
                    	            										current,
                    	            										"val",
                    	            										lv_val_93_0,
                    	            										"jacamoide.xtext.jcm.Jcm.INT_LITERAL");
                    	            								

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalJcm.g:1778:7: ( (lv_literal_94_0= ruleLiteral ) )
                    	            {
                    	            // InternalJcm.g:1778:7: ( (lv_literal_94_0= ruleLiteral ) )
                    	            // InternalJcm.g:1779:8: (lv_literal_94_0= ruleLiteral )
                    	            {
                    	            // InternalJcm.g:1779:8: (lv_literal_94_0= ruleLiteral )
                    	            // InternalJcm.g:1780:9: lv_literal_94_0= ruleLiteral
                    	            {

                    	            									newCompositeNode(grammarAccess.getAgentAccess().getLiteralLiteralParserRuleCall_3_2_15_2_2_0());
                    	            								
                    	            pushFollow(FOLLOW_3);
                    	            lv_literal_94_0=ruleLiteral();

                    	            state._fsp--;


                    	            									if (current==null) {
                    	            										current = createModelElementForParent(grammarAccess.getAgentRule());
                    	            									}
                    	            									add(
                    	            										current,
                    	            										"literal",
                    	            										lv_literal_94_0,
                    	            										"jacamoide.xtext.jcm.Jcm.Literal");
                    	            									afterParserOrEnumRuleCall();
                    	            								

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 4 :
                    	            // InternalJcm.g:1798:7: ( (lv_val_real_95_0= RULE_REAL_LITERAL ) )
                    	            {
                    	            // InternalJcm.g:1798:7: ( (lv_val_real_95_0= RULE_REAL_LITERAL ) )
                    	            // InternalJcm.g:1799:8: (lv_val_real_95_0= RULE_REAL_LITERAL )
                    	            {
                    	            // InternalJcm.g:1799:8: (lv_val_real_95_0= RULE_REAL_LITERAL )
                    	            // InternalJcm.g:1800:9: lv_val_real_95_0= RULE_REAL_LITERAL
                    	            {
                    	            lv_val_real_95_0=(Token)match(input,RULE_REAL_LITERAL,FOLLOW_3); 

                    	            									newLeafNode(lv_val_real_95_0, grammarAccess.getAgentAccess().getVal_realREAL_LITERALTerminalRuleCall_3_2_15_2_3_0());
                    	            								

                    	            									if (current==null) {
                    	            										current = createModelElement(grammarAccess.getAgentRule());
                    	            									}
                    	            									addWithLastConsumed(
                    	            										current,
                    	            										"val_real",
                    	            										lv_val_real_95_0,
                    	            										"jacamoide.xtext.jcm.Jcm.REAL_LITERAL");
                    	            								

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // InternalJcm.g:1817:6: ( ruleEOL )+
                    	    int cnt58=0;
                    	    loop58:
                    	    do {
                    	        int alt58=2;
                    	        int LA58_0 = input.LA(1);

                    	        if ( ((LA58_0>=RULE_NEWLINE && LA58_0<=RULE_SL_COMMENT)) ) {
                    	            alt58=1;
                    	        }


                    	        switch (alt58) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:1818:7: ruleEOL
                    	    	    {

                    	    	    							newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_15_3());
                    	    	    						
                    	    	    pushFollow(FOLLOW_28);
                    	    	    ruleEOL();

                    	    	    state._fsp--;


                    	    	    							afterParserOrEnumRuleCall();
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt58 >= 1 ) break loop58;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(58, input);
                    	                throw eee;
                    	        }
                    	        cnt58++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_97=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_97, grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalJcm.g:1833:3: ( ruleEOL )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=RULE_NEWLINE && LA61_0<=RULE_SL_COMMENT)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalJcm.g:1834:4: ruleEOL
            	    {

            	    				newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_4());
            	    			
            	    pushFollow(FOLLOW_13);
            	    ruleEOL();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAgent"


    // $ANTLR start "entryRuleWorkspace"
    // InternalJcm.g:1846:1: entryRuleWorkspace returns [EObject current=null] : iv_ruleWorkspace= ruleWorkspace EOF ;
    public final EObject entryRuleWorkspace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkspace = null;


        try {
            // InternalJcm.g:1846:50: (iv_ruleWorkspace= ruleWorkspace EOF )
            // InternalJcm.g:1847:2: iv_ruleWorkspace= ruleWorkspace EOF
            {
             newCompositeNode(grammarAccess.getWorkspaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkspace=ruleWorkspace();

            state._fsp--;

             current =iv_ruleWorkspace; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkspace"


    // $ANTLR start "ruleWorkspace"
    // InternalJcm.g:1853:1: ruleWorkspace returns [EObject current=null] : (otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= '{' ( ruleEOL )* ( ( (lv_artifact_4_0= ruleArtifact ) ) | (otherlv_5= 'agents' otherlv_6= ':' ( ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' ) ( ruleEOL | otherlv_10= ',' )+ )* ) | (otherlv_11= 'debug' (otherlv_12= ':' ( (lv_debug_13_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( (lv_node_15_0= ruleONode ) ) )* otherlv_16= '}' ( ruleEOL )* ) ;
    public final EObject ruleWorkspace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_agent_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_16=null;
        EObject lv_artifact_4_0 = null;

        EObject lv_debug_13_0 = null;

        EObject lv_node_15_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:1859:2: ( (otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= '{' ( ruleEOL )* ( ( (lv_artifact_4_0= ruleArtifact ) ) | (otherlv_5= 'agents' otherlv_6= ':' ( ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' ) ( ruleEOL | otherlv_10= ',' )+ )* ) | (otherlv_11= 'debug' (otherlv_12= ':' ( (lv_debug_13_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( (lv_node_15_0= ruleONode ) ) )* otherlv_16= '}' ( ruleEOL )* ) )
            // InternalJcm.g:1860:2: (otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= '{' ( ruleEOL )* ( ( (lv_artifact_4_0= ruleArtifact ) ) | (otherlv_5= 'agents' otherlv_6= ':' ( ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' ) ( ruleEOL | otherlv_10= ',' )+ )* ) | (otherlv_11= 'debug' (otherlv_12= ':' ( (lv_debug_13_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( (lv_node_15_0= ruleONode ) ) )* otherlv_16= '}' ( ruleEOL )* )
            {
            // InternalJcm.g:1860:2: (otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= '{' ( ruleEOL )* ( ( (lv_artifact_4_0= ruleArtifact ) ) | (otherlv_5= 'agents' otherlv_6= ':' ( ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' ) ( ruleEOL | otherlv_10= ',' )+ )* ) | (otherlv_11= 'debug' (otherlv_12= ':' ( (lv_debug_13_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( (lv_node_15_0= ruleONode ) ) )* otherlv_16= '}' ( ruleEOL )* )
            // InternalJcm.g:1861:3: otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= '{' ( ruleEOL )* ( ( (lv_artifact_4_0= ruleArtifact ) ) | (otherlv_5= 'agents' otherlv_6= ':' ( ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' ) ( ruleEOL | otherlv_10= ',' )+ )* ) | (otherlv_11= 'debug' (otherlv_12= ':' ( (lv_debug_13_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( (lv_node_15_0= ruleONode ) ) )* otherlv_16= '}' ( ruleEOL )*
            {
            otherlv_0=(Token)match(input,59,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkspaceAccess().getWorkspaceKeyword_0());
            		
            // InternalJcm.g:1865:3: ( (lv_name_1_0= RULE_ATOM ) )
            // InternalJcm.g:1866:4: (lv_name_1_0= RULE_ATOM )
            {
            // InternalJcm.g:1866:4: (lv_name_1_0= RULE_ATOM )
            // InternalJcm.g:1867:5: lv_name_1_0= RULE_ATOM
            {
            lv_name_1_0=(Token)match(input,RULE_ATOM,FOLLOW_44); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkspaceAccess().getNameATOMTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkspaceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jacamoide.xtext.jcm.Jcm.ATOM");
            				

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_45); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkspaceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJcm.g:1887:3: ( ruleEOL )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=RULE_NEWLINE && LA62_0<=RULE_SL_COMMENT)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalJcm.g:1888:4: ruleEOL
            	    {

            	    				newCompositeNode(grammarAccess.getWorkspaceAccess().getEOLParserRuleCall_3());
            	    			
            	    pushFollow(FOLLOW_45);
            	    ruleEOL();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            // InternalJcm.g:1896:3: ( ( (lv_artifact_4_0= ruleArtifact ) ) | (otherlv_5= 'agents' otherlv_6= ':' ( ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' ) ( ruleEOL | otherlv_10= ',' )+ )* ) | (otherlv_11= 'debug' (otherlv_12= ':' ( (lv_debug_13_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( (lv_node_15_0= ruleONode ) ) )*
            loop68:
            do {
                int alt68=5;
                switch ( input.LA(1) ) {
                case 62:
                    {
                    alt68=1;
                    }
                    break;
                case 60:
                    {
                    alt68=2;
                    }
                    break;
                case 49:
                    {
                    alt68=3;
                    }
                    break;
                case 34:
                    {
                    alt68=4;
                    }
                    break;

                }

                switch (alt68) {
            	case 1 :
            	    // InternalJcm.g:1897:4: ( (lv_artifact_4_0= ruleArtifact ) )
            	    {
            	    // InternalJcm.g:1897:4: ( (lv_artifact_4_0= ruleArtifact ) )
            	    // InternalJcm.g:1898:5: (lv_artifact_4_0= ruleArtifact )
            	    {
            	    // InternalJcm.g:1898:5: (lv_artifact_4_0= ruleArtifact )
            	    // InternalJcm.g:1899:6: lv_artifact_4_0= ruleArtifact
            	    {

            	    						newCompositeNode(grammarAccess.getWorkspaceAccess().getArtifactArtifactParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_artifact_4_0=ruleArtifact();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWorkspaceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"artifact",
            	    							lv_artifact_4_0,
            	    							"jacamoide.xtext.jcm.Jcm.Artifact");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalJcm.g:1917:4: (otherlv_5= 'agents' otherlv_6= ':' ( ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' ) ( ruleEOL | otherlv_10= ',' )+ )* )
            	    {
            	    // InternalJcm.g:1917:4: (otherlv_5= 'agents' otherlv_6= ':' ( ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' ) ( ruleEOL | otherlv_10= ',' )+ )* )
            	    // InternalJcm.g:1918:5: otherlv_5= 'agents' otherlv_6= ':' ( ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' ) ( ruleEOL | otherlv_10= ',' )+ )*
            	    {
            	    otherlv_5=(Token)match(input,60,FOLLOW_16); 

            	    					newLeafNode(otherlv_5, grammarAccess.getWorkspaceAccess().getAgentsKeyword_4_1_0());
            	    				
            	    otherlv_6=(Token)match(input,29,FOLLOW_47); 

            	    					newLeafNode(otherlv_6, grammarAccess.getWorkspaceAccess().getColonKeyword_4_1_1());
            	    				
            	    // InternalJcm.g:1926:5: ( ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' ) ( ruleEOL | otherlv_10= ',' )+ )*
            	    loop65:
            	    do {
            	        int alt65=2;
            	        int LA65_0 = input.LA(1);

            	        if ( (LA65_0==RULE_ATOM||LA65_0==61) ) {
            	            alt65=1;
            	        }


            	        switch (alt65) {
            	    	case 1 :
            	    	    // InternalJcm.g:1927:6: ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' ) ( ruleEOL | otherlv_10= ',' )+
            	    	    {
            	    	    // InternalJcm.g:1927:6: ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' )
            	    	    int alt63=2;
            	    	    int LA63_0 = input.LA(1);

            	    	    if ( (LA63_0==RULE_ATOM) ) {
            	    	        alt63=1;
            	    	    }
            	    	    else if ( (LA63_0==61) ) {
            	    	        alt63=2;
            	    	    }
            	    	    else {
            	    	        NoViableAltException nvae =
            	    	            new NoViableAltException("", 63, 0, input);

            	    	        throw nvae;
            	    	    }
            	    	    switch (alt63) {
            	    	        case 1 :
            	    	            // InternalJcm.g:1928:7: ( (lv_agent_7_0= RULE_ATOM ) )
            	    	            {
            	    	            // InternalJcm.g:1928:7: ( (lv_agent_7_0= RULE_ATOM ) )
            	    	            // InternalJcm.g:1929:8: (lv_agent_7_0= RULE_ATOM )
            	    	            {
            	    	            // InternalJcm.g:1929:8: (lv_agent_7_0= RULE_ATOM )
            	    	            // InternalJcm.g:1930:9: lv_agent_7_0= RULE_ATOM
            	    	            {
            	    	            lv_agent_7_0=(Token)match(input,RULE_ATOM,FOLLOW_18); 

            	    	            									newLeafNode(lv_agent_7_0, grammarAccess.getWorkspaceAccess().getAgentATOMTerminalRuleCall_4_1_2_0_0_0());
            	    	            								

            	    	            									if (current==null) {
            	    	            										current = createModelElement(grammarAccess.getWorkspaceRule());
            	    	            									}
            	    	            									addWithLastConsumed(
            	    	            										current,
            	    	            										"agent",
            	    	            										lv_agent_7_0,
            	    	            										"jacamoide.xtext.jcm.Jcm.ATOM");
            	    	            								

            	    	            }


            	    	            }


            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // InternalJcm.g:1947:7: otherlv_8= '*'
            	    	            {
            	    	            otherlv_8=(Token)match(input,61,FOLLOW_18); 

            	    	            							newLeafNode(otherlv_8, grammarAccess.getWorkspaceAccess().getAsteriskKeyword_4_1_2_0_1());
            	    	            						

            	    	            }
            	    	            break;

            	    	    }

            	    	    // InternalJcm.g:1952:6: ( ruleEOL | otherlv_10= ',' )+
            	    	    int cnt64=0;
            	    	    loop64:
            	    	    do {
            	    	        int alt64=3;
            	    	        int LA64_0 = input.LA(1);

            	    	        if ( ((LA64_0>=RULE_NEWLINE && LA64_0<=RULE_SL_COMMENT)) ) {
            	    	            alt64=1;
            	    	        }
            	    	        else if ( (LA64_0==27) ) {
            	    	            alt64=2;
            	    	        }


            	    	        switch (alt64) {
            	    	    	case 1 :
            	    	    	    // InternalJcm.g:1953:7: ruleEOL
            	    	    	    {

            	    	    	    							newCompositeNode(grammarAccess.getWorkspaceAccess().getEOLParserRuleCall_4_1_2_1_0());
            	    	    	    						
            	    	    	    pushFollow(FOLLOW_48);
            	    	    	    ruleEOL();

            	    	    	    state._fsp--;


            	    	    	    							afterParserOrEnumRuleCall();
            	    	    	    						

            	    	    	    }
            	    	    	    break;
            	    	    	case 2 :
            	    	    	    // InternalJcm.g:1961:7: otherlv_10= ','
            	    	    	    {
            	    	    	    otherlv_10=(Token)match(input,27,FOLLOW_48); 

            	    	    	    							newLeafNode(otherlv_10, grammarAccess.getWorkspaceAccess().getCommaKeyword_4_1_2_1_1());
            	    	    	    						

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    if ( cnt64 >= 1 ) break loop64;
            	    	                EarlyExitException eee =
            	    	                    new EarlyExitException(64, input);
            	    	                throw eee;
            	    	        }
            	    	        cnt64++;
            	    	    } while (true);


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop65;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalJcm.g:1969:4: (otherlv_11= 'debug' (otherlv_12= ':' ( (lv_debug_13_0= ruleLiteral ) ) )? ( ruleEOL )+ )
            	    {
            	    // InternalJcm.g:1969:4: (otherlv_11= 'debug' (otherlv_12= ':' ( (lv_debug_13_0= ruleLiteral ) ) )? ( ruleEOL )+ )
            	    // InternalJcm.g:1970:5: otherlv_11= 'debug' (otherlv_12= ':' ( (lv_debug_13_0= ruleLiteral ) ) )? ( ruleEOL )+
            	    {
            	    otherlv_11=(Token)match(input,49,FOLLOW_49); 

            	    					newLeafNode(otherlv_11, grammarAccess.getWorkspaceAccess().getDebugKeyword_4_2_0());
            	    				
            	    // InternalJcm.g:1974:5: (otherlv_12= ':' ( (lv_debug_13_0= ruleLiteral ) ) )?
            	    int alt66=2;
            	    int LA66_0 = input.LA(1);

            	    if ( (LA66_0==29) ) {
            	        alt66=1;
            	    }
            	    switch (alt66) {
            	        case 1 :
            	            // InternalJcm.g:1975:6: otherlv_12= ':' ( (lv_debug_13_0= ruleLiteral ) )
            	            {
            	            otherlv_12=(Token)match(input,29,FOLLOW_39); 

            	            						newLeafNode(otherlv_12, grammarAccess.getWorkspaceAccess().getColonKeyword_4_2_1_0());
            	            					
            	            // InternalJcm.g:1979:6: ( (lv_debug_13_0= ruleLiteral ) )
            	            // InternalJcm.g:1980:7: (lv_debug_13_0= ruleLiteral )
            	            {
            	            // InternalJcm.g:1980:7: (lv_debug_13_0= ruleLiteral )
            	            // InternalJcm.g:1981:8: lv_debug_13_0= ruleLiteral
            	            {

            	            								newCompositeNode(grammarAccess.getWorkspaceAccess().getDebugLiteralParserRuleCall_4_2_1_1_0());
            	            							
            	            pushFollow(FOLLOW_3);
            	            lv_debug_13_0=ruleLiteral();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getWorkspaceRule());
            	            								}
            	            								add(
            	            									current,
            	            									"debug",
            	            									lv_debug_13_0,
            	            									"jacamoide.xtext.jcm.Jcm.Literal");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalJcm.g:1999:5: ( ruleEOL )+
            	    int cnt67=0;
            	    loop67:
            	    do {
            	        int alt67=2;
            	        int LA67_0 = input.LA(1);

            	        if ( ((LA67_0>=RULE_NEWLINE && LA67_0<=RULE_SL_COMMENT)) ) {
            	            alt67=1;
            	        }


            	        switch (alt67) {
            	    	case 1 :
            	    	    // InternalJcm.g:2000:6: ruleEOL
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getWorkspaceAccess().getEOLParserRuleCall_4_2_2());
            	    	    					
            	    	    pushFollow(FOLLOW_45);
            	    	    ruleEOL();

            	    	    state._fsp--;


            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt67 >= 1 ) break loop67;
            	                EarlyExitException eee =
            	                    new EarlyExitException(67, input);
            	                throw eee;
            	        }
            	        cnt67++;
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalJcm.g:2010:4: ( (lv_node_15_0= ruleONode ) )
            	    {
            	    // InternalJcm.g:2010:4: ( (lv_node_15_0= ruleONode ) )
            	    // InternalJcm.g:2011:5: (lv_node_15_0= ruleONode )
            	    {
            	    // InternalJcm.g:2011:5: (lv_node_15_0= ruleONode )
            	    // InternalJcm.g:2012:6: lv_node_15_0= ruleONode
            	    {

            	    						newCompositeNode(grammarAccess.getWorkspaceAccess().getNodeONodeParserRuleCall_4_3_0());
            	    					
            	    pushFollow(FOLLOW_46);
            	    lv_node_15_0=ruleONode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWorkspaceRule());
            	    						}
            	    						add(
            	    							current,
            	    							"node",
            	    							lv_node_15_0,
            	    							"jacamoide.xtext.jcm.Jcm.ONode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            otherlv_16=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_16, grammarAccess.getWorkspaceAccess().getRightCurlyBracketKeyword_5());
            		
            // InternalJcm.g:2034:3: ( ruleEOL )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( ((LA69_0>=RULE_NEWLINE && LA69_0<=RULE_SL_COMMENT)) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalJcm.g:2035:4: ruleEOL
            	    {

            	    				newCompositeNode(grammarAccess.getWorkspaceAccess().getEOLParserRuleCall_6());
            	    			
            	    pushFollow(FOLLOW_13);
            	    ruleEOL();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWorkspace"


    // $ANTLR start "entryRuleArtifact"
    // InternalJcm.g:2047:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // InternalJcm.g:2047:49: (iv_ruleArtifact= ruleArtifact EOF )
            // InternalJcm.g:2048:2: iv_ruleArtifact= ruleArtifact EOF
            {
             newCompositeNode(grammarAccess.getArtifactRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArtifact=ruleArtifact();

            state._fsp--;

             current =iv_ruleArtifact; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArtifact"


    // $ANTLR start "ruleArtifact"
    // InternalJcm.g:2054:1: ruleArtifact returns [EObject current=null] : (otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_classDef_3_0= ruleClassDef ) ) (otherlv_4= '{' ( ruleEOL )* (otherlv_6= 'focused-by' otherlv_7= ':' ( ( ( (lv_agentNS_8_0= RULE_ATOM ) ) otherlv_9= '::' )? ( ( (lv_agent_10_0= RULE_ATOM ) ) | otherlv_11= '*' ) ( ruleEOL | otherlv_13= ',' )+ )* )? otherlv_14= '}' )? ( ruleEOL )* ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_agentNS_8_0=null;
        Token otherlv_9=null;
        Token lv_agent_10_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_classDef_3_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:2060:2: ( (otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_classDef_3_0= ruleClassDef ) ) (otherlv_4= '{' ( ruleEOL )* (otherlv_6= 'focused-by' otherlv_7= ':' ( ( ( (lv_agentNS_8_0= RULE_ATOM ) ) otherlv_9= '::' )? ( ( (lv_agent_10_0= RULE_ATOM ) ) | otherlv_11= '*' ) ( ruleEOL | otherlv_13= ',' )+ )* )? otherlv_14= '}' )? ( ruleEOL )* ) )
            // InternalJcm.g:2061:2: (otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_classDef_3_0= ruleClassDef ) ) (otherlv_4= '{' ( ruleEOL )* (otherlv_6= 'focused-by' otherlv_7= ':' ( ( ( (lv_agentNS_8_0= RULE_ATOM ) ) otherlv_9= '::' )? ( ( (lv_agent_10_0= RULE_ATOM ) ) | otherlv_11= '*' ) ( ruleEOL | otherlv_13= ',' )+ )* )? otherlv_14= '}' )? ( ruleEOL )* )
            {
            // InternalJcm.g:2061:2: (otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_classDef_3_0= ruleClassDef ) ) (otherlv_4= '{' ( ruleEOL )* (otherlv_6= 'focused-by' otherlv_7= ':' ( ( ( (lv_agentNS_8_0= RULE_ATOM ) ) otherlv_9= '::' )? ( ( (lv_agent_10_0= RULE_ATOM ) ) | otherlv_11= '*' ) ( ruleEOL | otherlv_13= ',' )+ )* )? otherlv_14= '}' )? ( ruleEOL )* )
            // InternalJcm.g:2062:3: otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_classDef_3_0= ruleClassDef ) ) (otherlv_4= '{' ( ruleEOL )* (otherlv_6= 'focused-by' otherlv_7= ':' ( ( ( (lv_agentNS_8_0= RULE_ATOM ) ) otherlv_9= '::' )? ( ( (lv_agent_10_0= RULE_ATOM ) ) | otherlv_11= '*' ) ( ruleEOL | otherlv_13= ',' )+ )* )? otherlv_14= '}' )? ( ruleEOL )*
            {
            otherlv_0=(Token)match(input,62,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getArtifactAccess().getArtifactKeyword_0());
            		
            // InternalJcm.g:2066:3: ( (lv_name_1_0= RULE_ATOM ) )
            // InternalJcm.g:2067:4: (lv_name_1_0= RULE_ATOM )
            {
            // InternalJcm.g:2067:4: (lv_name_1_0= RULE_ATOM )
            // InternalJcm.g:2068:5: lv_name_1_0= RULE_ATOM
            {
            lv_name_1_0=(Token)match(input,RULE_ATOM,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getArtifactAccess().getNameATOMTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArtifactRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jacamoide.xtext.jcm.Jcm.ATOM");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_33); 

            			newLeafNode(otherlv_2, grammarAccess.getArtifactAccess().getColonKeyword_2());
            		
            // InternalJcm.g:2088:3: ( (lv_classDef_3_0= ruleClassDef ) )
            // InternalJcm.g:2089:4: (lv_classDef_3_0= ruleClassDef )
            {
            // InternalJcm.g:2089:4: (lv_classDef_3_0= ruleClassDef )
            // InternalJcm.g:2090:5: lv_classDef_3_0= ruleClassDef
            {

            					newCompositeNode(grammarAccess.getArtifactAccess().getClassDefClassDefParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_27);
            lv_classDef_3_0=ruleClassDef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getArtifactRule());
            					}
            					set(
            						current,
            						"classDef",
            						lv_classDef_3_0,
            						"jacamoide.xtext.jcm.Jcm.ClassDef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJcm.g:2107:3: (otherlv_4= '{' ( ruleEOL )* (otherlv_6= 'focused-by' otherlv_7= ':' ( ( ( (lv_agentNS_8_0= RULE_ATOM ) ) otherlv_9= '::' )? ( ( (lv_agent_10_0= RULE_ATOM ) ) | otherlv_11= '*' ) ( ruleEOL | otherlv_13= ',' )+ )* )? otherlv_14= '}' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==24) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalJcm.g:2108:4: otherlv_4= '{' ( ruleEOL )* (otherlv_6= 'focused-by' otherlv_7= ':' ( ( ( (lv_agentNS_8_0= RULE_ATOM ) ) otherlv_9= '::' )? ( ( (lv_agent_10_0= RULE_ATOM ) ) | otherlv_11= '*' ) ( ruleEOL | otherlv_13= ',' )+ )* )? otherlv_14= '}'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_50); 

                    				newLeafNode(otherlv_4, grammarAccess.getArtifactAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalJcm.g:2112:4: ( ruleEOL )*
                    loop70:
                    do {
                        int alt70=2;
                        int LA70_0 = input.LA(1);

                        if ( ((LA70_0>=RULE_NEWLINE && LA70_0<=RULE_SL_COMMENT)) ) {
                            alt70=1;
                        }


                        switch (alt70) {
                    	case 1 :
                    	    // InternalJcm.g:2113:5: ruleEOL
                    	    {

                    	    					newCompositeNode(grammarAccess.getArtifactAccess().getEOLParserRuleCall_4_1());
                    	    				
                    	    pushFollow(FOLLOW_50);
                    	    ruleEOL();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop70;
                        }
                    } while (true);

                    // InternalJcm.g:2121:4: (otherlv_6= 'focused-by' otherlv_7= ':' ( ( ( (lv_agentNS_8_0= RULE_ATOM ) ) otherlv_9= '::' )? ( ( (lv_agent_10_0= RULE_ATOM ) ) | otherlv_11= '*' ) ( ruleEOL | otherlv_13= ',' )+ )* )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==63) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalJcm.g:2122:5: otherlv_6= 'focused-by' otherlv_7= ':' ( ( ( (lv_agentNS_8_0= RULE_ATOM ) ) otherlv_9= '::' )? ( ( (lv_agent_10_0= RULE_ATOM ) ) | otherlv_11= '*' ) ( ruleEOL | otherlv_13= ',' )+ )*
                            {
                            otherlv_6=(Token)match(input,63,FOLLOW_16); 

                            					newLeafNode(otherlv_6, grammarAccess.getArtifactAccess().getFocusedByKeyword_4_2_0());
                            				
                            otherlv_7=(Token)match(input,29,FOLLOW_51); 

                            					newLeafNode(otherlv_7, grammarAccess.getArtifactAccess().getColonKeyword_4_2_1());
                            				
                            // InternalJcm.g:2130:5: ( ( ( (lv_agentNS_8_0= RULE_ATOM ) ) otherlv_9= '::' )? ( ( (lv_agent_10_0= RULE_ATOM ) ) | otherlv_11= '*' ) ( ruleEOL | otherlv_13= ',' )+ )*
                            loop74:
                            do {
                                int alt74=2;
                                int LA74_0 = input.LA(1);

                                if ( (LA74_0==RULE_ATOM||LA74_0==61) ) {
                                    alt74=1;
                                }


                                switch (alt74) {
                            	case 1 :
                            	    // InternalJcm.g:2131:6: ( ( (lv_agentNS_8_0= RULE_ATOM ) ) otherlv_9= '::' )? ( ( (lv_agent_10_0= RULE_ATOM ) ) | otherlv_11= '*' ) ( ruleEOL | otherlv_13= ',' )+
                            	    {
                            	    // InternalJcm.g:2131:6: ( ( (lv_agentNS_8_0= RULE_ATOM ) ) otherlv_9= '::' )?
                            	    int alt71=2;
                            	    int LA71_0 = input.LA(1);

                            	    if ( (LA71_0==RULE_ATOM) ) {
                            	        int LA71_1 = input.LA(2);

                            	        if ( (LA71_1==45) ) {
                            	            alt71=1;
                            	        }
                            	    }
                            	    switch (alt71) {
                            	        case 1 :
                            	            // InternalJcm.g:2132:7: ( (lv_agentNS_8_0= RULE_ATOM ) ) otherlv_9= '::'
                            	            {
                            	            // InternalJcm.g:2132:7: ( (lv_agentNS_8_0= RULE_ATOM ) )
                            	            // InternalJcm.g:2133:8: (lv_agentNS_8_0= RULE_ATOM )
                            	            {
                            	            // InternalJcm.g:2133:8: (lv_agentNS_8_0= RULE_ATOM )
                            	            // InternalJcm.g:2134:9: lv_agentNS_8_0= RULE_ATOM
                            	            {
                            	            lv_agentNS_8_0=(Token)match(input,RULE_ATOM,FOLLOW_52); 

                            	            									newLeafNode(lv_agentNS_8_0, grammarAccess.getArtifactAccess().getAgentNSATOMTerminalRuleCall_4_2_2_0_0_0());
                            	            								

                            	            									if (current==null) {
                            	            										current = createModelElement(grammarAccess.getArtifactRule());
                            	            									}
                            	            									addWithLastConsumed(
                            	            										current,
                            	            										"agentNS",
                            	            										lv_agentNS_8_0,
                            	            										"jacamoide.xtext.jcm.Jcm.ATOM");
                            	            								

                            	            }


                            	            }

                            	            otherlv_9=(Token)match(input,45,FOLLOW_53); 

                            	            							newLeafNode(otherlv_9, grammarAccess.getArtifactAccess().getColonColonKeyword_4_2_2_0_1());
                            	            						

                            	            }
                            	            break;

                            	    }

                            	    // InternalJcm.g:2155:6: ( ( (lv_agent_10_0= RULE_ATOM ) ) | otherlv_11= '*' )
                            	    int alt72=2;
                            	    int LA72_0 = input.LA(1);

                            	    if ( (LA72_0==RULE_ATOM) ) {
                            	        alt72=1;
                            	    }
                            	    else if ( (LA72_0==61) ) {
                            	        alt72=2;
                            	    }
                            	    else {
                            	        NoViableAltException nvae =
                            	            new NoViableAltException("", 72, 0, input);

                            	        throw nvae;
                            	    }
                            	    switch (alt72) {
                            	        case 1 :
                            	            // InternalJcm.g:2156:7: ( (lv_agent_10_0= RULE_ATOM ) )
                            	            {
                            	            // InternalJcm.g:2156:7: ( (lv_agent_10_0= RULE_ATOM ) )
                            	            // InternalJcm.g:2157:8: (lv_agent_10_0= RULE_ATOM )
                            	            {
                            	            // InternalJcm.g:2157:8: (lv_agent_10_0= RULE_ATOM )
                            	            // InternalJcm.g:2158:9: lv_agent_10_0= RULE_ATOM
                            	            {
                            	            lv_agent_10_0=(Token)match(input,RULE_ATOM,FOLLOW_18); 

                            	            									newLeafNode(lv_agent_10_0, grammarAccess.getArtifactAccess().getAgentATOMTerminalRuleCall_4_2_2_1_0_0());
                            	            								

                            	            									if (current==null) {
                            	            										current = createModelElement(grammarAccess.getArtifactRule());
                            	            									}
                            	            									addWithLastConsumed(
                            	            										current,
                            	            										"agent",
                            	            										lv_agent_10_0,
                            	            										"jacamoide.xtext.jcm.Jcm.ATOM");
                            	            								

                            	            }


                            	            }


                            	            }
                            	            break;
                            	        case 2 :
                            	            // InternalJcm.g:2175:7: otherlv_11= '*'
                            	            {
                            	            otherlv_11=(Token)match(input,61,FOLLOW_18); 

                            	            							newLeafNode(otherlv_11, grammarAccess.getArtifactAccess().getAsteriskKeyword_4_2_2_1_1());
                            	            						

                            	            }
                            	            break;

                            	    }

                            	    // InternalJcm.g:2180:6: ( ruleEOL | otherlv_13= ',' )+
                            	    int cnt73=0;
                            	    loop73:
                            	    do {
                            	        int alt73=3;
                            	        int LA73_0 = input.LA(1);

                            	        if ( ((LA73_0>=RULE_NEWLINE && LA73_0<=RULE_SL_COMMENT)) ) {
                            	            alt73=1;
                            	        }
                            	        else if ( (LA73_0==27) ) {
                            	            alt73=2;
                            	        }


                            	        switch (alt73) {
                            	    	case 1 :
                            	    	    // InternalJcm.g:2181:7: ruleEOL
                            	    	    {

                            	    	    							newCompositeNode(grammarAccess.getArtifactAccess().getEOLParserRuleCall_4_2_2_2_0());
                            	    	    						
                            	    	    pushFollow(FOLLOW_54);
                            	    	    ruleEOL();

                            	    	    state._fsp--;


                            	    	    							afterParserOrEnumRuleCall();
                            	    	    						

                            	    	    }
                            	    	    break;
                            	    	case 2 :
                            	    	    // InternalJcm.g:2189:7: otherlv_13= ','
                            	    	    {
                            	    	    otherlv_13=(Token)match(input,27,FOLLOW_54); 

                            	    	    							newLeafNode(otherlv_13, grammarAccess.getArtifactAccess().getCommaKeyword_4_2_2_2_1());
                            	    	    						

                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    if ( cnt73 >= 1 ) break loop73;
                            	                EarlyExitException eee =
                            	                    new EarlyExitException(73, input);
                            	                throw eee;
                            	        }
                            	        cnt73++;
                            	    } while (true);


                            	    }
                            	    break;

                            	default :
                            	    break loop74;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_14, grammarAccess.getArtifactAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalJcm.g:2201:3: ( ruleEOL )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( ((LA77_0>=RULE_NEWLINE && LA77_0<=RULE_SL_COMMENT)) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // InternalJcm.g:2202:4: ruleEOL
            	    {

            	    				newCompositeNode(grammarAccess.getArtifactAccess().getEOLParserRuleCall_5());
            	    			
            	    pushFollow(FOLLOW_13);
            	    ruleEOL();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArtifact"


    // $ANTLR start "entryRuleInstitution"
    // InternalJcm.g:2214:1: entryRuleInstitution returns [EObject current=null] : iv_ruleInstitution= ruleInstitution EOF ;
    public final EObject entryRuleInstitution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstitution = null;


        try {
            // InternalJcm.g:2214:52: (iv_ruleInstitution= ruleInstitution EOF )
            // InternalJcm.g:2215:2: iv_ruleInstitution= ruleInstitution EOF
            {
             newCompositeNode(grammarAccess.getInstitutionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstitution=ruleInstitution();

            state._fsp--;

             current =iv_ruleInstitution; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstitution"


    // $ANTLR start "ruleInstitution"
    // InternalJcm.g:2221:1: ruleInstitution returns [EObject current=null] : (otherlv_0= 'institution' ( (lv_name_1_0= RULE_ATOM ) ) ( (lv_fileName_2_0= ruleOFileName ) )? otherlv_3= '{' ( ruleEOL )* ( (otherlv_5= 'workspaces' otherlv_6= ':' ( ( (lv_wsNames_7_0= RULE_ATOM ) ) ( ruleEOL | otherlv_9= ',' )+ )+ ) | (otherlv_10= 'debug' ( ruleEOL )+ ) | ( ( (lv_other_12_0= RULE_ATOM ) ) otherlv_13= ':' ( ( (lv_string_14_0= RULE_STRING ) ) | ( (lv_val_15_0= RULE_INT_LITERAL ) ) | ( (lv_literal_16_0= ruleLiteral ) ) | ( (lv_val_real_17_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_19= '}' ( ruleEOL )* ) ;
    public final EObject ruleInstitution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_wsNames_7_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_other_12_0=null;
        Token otherlv_13=null;
        Token lv_string_14_0=null;
        Token lv_val_15_0=null;
        Token lv_val_real_17_0=null;
        Token otherlv_19=null;
        EObject lv_fileName_2_0 = null;

        EObject lv_literal_16_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:2227:2: ( (otherlv_0= 'institution' ( (lv_name_1_0= RULE_ATOM ) ) ( (lv_fileName_2_0= ruleOFileName ) )? otherlv_3= '{' ( ruleEOL )* ( (otherlv_5= 'workspaces' otherlv_6= ':' ( ( (lv_wsNames_7_0= RULE_ATOM ) ) ( ruleEOL | otherlv_9= ',' )+ )+ ) | (otherlv_10= 'debug' ( ruleEOL )+ ) | ( ( (lv_other_12_0= RULE_ATOM ) ) otherlv_13= ':' ( ( (lv_string_14_0= RULE_STRING ) ) | ( (lv_val_15_0= RULE_INT_LITERAL ) ) | ( (lv_literal_16_0= ruleLiteral ) ) | ( (lv_val_real_17_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_19= '}' ( ruleEOL )* ) )
            // InternalJcm.g:2228:2: (otherlv_0= 'institution' ( (lv_name_1_0= RULE_ATOM ) ) ( (lv_fileName_2_0= ruleOFileName ) )? otherlv_3= '{' ( ruleEOL )* ( (otherlv_5= 'workspaces' otherlv_6= ':' ( ( (lv_wsNames_7_0= RULE_ATOM ) ) ( ruleEOL | otherlv_9= ',' )+ )+ ) | (otherlv_10= 'debug' ( ruleEOL )+ ) | ( ( (lv_other_12_0= RULE_ATOM ) ) otherlv_13= ':' ( ( (lv_string_14_0= RULE_STRING ) ) | ( (lv_val_15_0= RULE_INT_LITERAL ) ) | ( (lv_literal_16_0= ruleLiteral ) ) | ( (lv_val_real_17_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_19= '}' ( ruleEOL )* )
            {
            // InternalJcm.g:2228:2: (otherlv_0= 'institution' ( (lv_name_1_0= RULE_ATOM ) ) ( (lv_fileName_2_0= ruleOFileName ) )? otherlv_3= '{' ( ruleEOL )* ( (otherlv_5= 'workspaces' otherlv_6= ':' ( ( (lv_wsNames_7_0= RULE_ATOM ) ) ( ruleEOL | otherlv_9= ',' )+ )+ ) | (otherlv_10= 'debug' ( ruleEOL )+ ) | ( ( (lv_other_12_0= RULE_ATOM ) ) otherlv_13= ':' ( ( (lv_string_14_0= RULE_STRING ) ) | ( (lv_val_15_0= RULE_INT_LITERAL ) ) | ( (lv_literal_16_0= ruleLiteral ) ) | ( (lv_val_real_17_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_19= '}' ( ruleEOL )* )
            // InternalJcm.g:2229:3: otherlv_0= 'institution' ( (lv_name_1_0= RULE_ATOM ) ) ( (lv_fileName_2_0= ruleOFileName ) )? otherlv_3= '{' ( ruleEOL )* ( (otherlv_5= 'workspaces' otherlv_6= ':' ( ( (lv_wsNames_7_0= RULE_ATOM ) ) ( ruleEOL | otherlv_9= ',' )+ )+ ) | (otherlv_10= 'debug' ( ruleEOL )+ ) | ( ( (lv_other_12_0= RULE_ATOM ) ) otherlv_13= ':' ( ( (lv_string_14_0= RULE_STRING ) ) | ( (lv_val_15_0= RULE_INT_LITERAL ) ) | ( (lv_literal_16_0= ruleLiteral ) ) | ( (lv_val_real_17_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_19= '}' ( ruleEOL )*
            {
            otherlv_0=(Token)match(input,64,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getInstitutionAccess().getInstitutionKeyword_0());
            		
            // InternalJcm.g:2233:3: ( (lv_name_1_0= RULE_ATOM ) )
            // InternalJcm.g:2234:4: (lv_name_1_0= RULE_ATOM )
            {
            // InternalJcm.g:2234:4: (lv_name_1_0= RULE_ATOM )
            // InternalJcm.g:2235:5: lv_name_1_0= RULE_ATOM
            {
            lv_name_1_0=(Token)match(input,RULE_ATOM,FOLLOW_55); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInstitutionAccess().getNameATOMTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInstitutionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jacamoide.xtext.jcm.Jcm.ATOM");
            				

            }


            }

            // InternalJcm.g:2251:3: ( (lv_fileName_2_0= ruleOFileName ) )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==29) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalJcm.g:2252:4: (lv_fileName_2_0= ruleOFileName )
                    {
                    // InternalJcm.g:2252:4: (lv_fileName_2_0= ruleOFileName )
                    // InternalJcm.g:2253:5: lv_fileName_2_0= ruleOFileName
                    {

                    					newCompositeNode(grammarAccess.getInstitutionAccess().getFileNameOFileNameParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_44);
                    lv_fileName_2_0=ruleOFileName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getInstitutionRule());
                    					}
                    					set(
                    						current,
                    						"fileName",
                    						lv_fileName_2_0,
                    						"jacamoide.xtext.jcm.Jcm.OFileName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,24,FOLLOW_56); 

            			newLeafNode(otherlv_3, grammarAccess.getInstitutionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJcm.g:2274:3: ( ruleEOL )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( ((LA79_0>=RULE_NEWLINE && LA79_0<=RULE_SL_COMMENT)) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalJcm.g:2275:4: ruleEOL
            	    {

            	    				newCompositeNode(grammarAccess.getInstitutionAccess().getEOLParserRuleCall_4());
            	    			
            	    pushFollow(FOLLOW_56);
            	    ruleEOL();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            // InternalJcm.g:2283:3: ( (otherlv_5= 'workspaces' otherlv_6= ':' ( ( (lv_wsNames_7_0= RULE_ATOM ) ) ( ruleEOL | otherlv_9= ',' )+ )+ ) | (otherlv_10= 'debug' ( ruleEOL )+ ) | ( ( (lv_other_12_0= RULE_ATOM ) ) otherlv_13= ':' ( ( (lv_string_14_0= RULE_STRING ) ) | ( (lv_val_15_0= RULE_INT_LITERAL ) ) | ( (lv_literal_16_0= ruleLiteral ) ) | ( (lv_val_real_17_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )*
            loop85:
            do {
                int alt85=4;
                switch ( input.LA(1) ) {
                case 65:
                    {
                    alt85=1;
                    }
                    break;
                case 49:
                    {
                    alt85=2;
                    }
                    break;
                case RULE_ATOM:
                    {
                    alt85=3;
                    }
                    break;

                }

                switch (alt85) {
            	case 1 :
            	    // InternalJcm.g:2284:4: (otherlv_5= 'workspaces' otherlv_6= ':' ( ( (lv_wsNames_7_0= RULE_ATOM ) ) ( ruleEOL | otherlv_9= ',' )+ )+ )
            	    {
            	    // InternalJcm.g:2284:4: (otherlv_5= 'workspaces' otherlv_6= ':' ( ( (lv_wsNames_7_0= RULE_ATOM ) ) ( ruleEOL | otherlv_9= ',' )+ )+ )
            	    // InternalJcm.g:2285:5: otherlv_5= 'workspaces' otherlv_6= ':' ( ( (lv_wsNames_7_0= RULE_ATOM ) ) ( ruleEOL | otherlv_9= ',' )+ )+
            	    {
            	    otherlv_5=(Token)match(input,65,FOLLOW_16); 

            	    					newLeafNode(otherlv_5, grammarAccess.getInstitutionAccess().getWorkspacesKeyword_5_0_0());
            	    				
            	    otherlv_6=(Token)match(input,29,FOLLOW_4); 

            	    					newLeafNode(otherlv_6, grammarAccess.getInstitutionAccess().getColonKeyword_5_0_1());
            	    				
            	    // InternalJcm.g:2293:5: ( ( (lv_wsNames_7_0= RULE_ATOM ) ) ( ruleEOL | otherlv_9= ',' )+ )+
            	    int cnt81=0;
            	    loop81:
            	    do {
            	        int alt81=2;
            	        int LA81_0 = input.LA(1);

            	        if ( (LA81_0==RULE_ATOM) ) {
            	            int LA81_2 = input.LA(2);

            	            if ( ((LA81_2>=RULE_NEWLINE && LA81_2<=RULE_SL_COMMENT)||LA81_2==27) ) {
            	                alt81=1;
            	            }


            	        }


            	        switch (alt81) {
            	    	case 1 :
            	    	    // InternalJcm.g:2294:6: ( (lv_wsNames_7_0= RULE_ATOM ) ) ( ruleEOL | otherlv_9= ',' )+
            	    	    {
            	    	    // InternalJcm.g:2294:6: ( (lv_wsNames_7_0= RULE_ATOM ) )
            	    	    // InternalJcm.g:2295:7: (lv_wsNames_7_0= RULE_ATOM )
            	    	    {
            	    	    // InternalJcm.g:2295:7: (lv_wsNames_7_0= RULE_ATOM )
            	    	    // InternalJcm.g:2296:8: lv_wsNames_7_0= RULE_ATOM
            	    	    {
            	    	    lv_wsNames_7_0=(Token)match(input,RULE_ATOM,FOLLOW_18); 

            	    	    								newLeafNode(lv_wsNames_7_0, grammarAccess.getInstitutionAccess().getWsNamesATOMTerminalRuleCall_5_0_2_0_0());
            	    	    							

            	    	    								if (current==null) {
            	    	    									current = createModelElement(grammarAccess.getInstitutionRule());
            	    	    								}
            	    	    								addWithLastConsumed(
            	    	    									current,
            	    	    									"wsNames",
            	    	    									lv_wsNames_7_0,
            	    	    									"jacamoide.xtext.jcm.Jcm.ATOM");
            	    	    							

            	    	    }


            	    	    }

            	    	    // InternalJcm.g:2312:6: ( ruleEOL | otherlv_9= ',' )+
            	    	    int cnt80=0;
            	    	    loop80:
            	    	    do {
            	    	        int alt80=3;
            	    	        int LA80_0 = input.LA(1);

            	    	        if ( ((LA80_0>=RULE_NEWLINE && LA80_0<=RULE_SL_COMMENT)) ) {
            	    	            alt80=1;
            	    	        }
            	    	        else if ( (LA80_0==27) ) {
            	    	            alt80=2;
            	    	        }


            	    	        switch (alt80) {
            	    	    	case 1 :
            	    	    	    // InternalJcm.g:2313:7: ruleEOL
            	    	    	    {

            	    	    	    							newCompositeNode(grammarAccess.getInstitutionAccess().getEOLParserRuleCall_5_0_2_1_0());
            	    	    	    						
            	    	    	    pushFollow(FOLLOW_57);
            	    	    	    ruleEOL();

            	    	    	    state._fsp--;


            	    	    	    							afterParserOrEnumRuleCall();
            	    	    	    						

            	    	    	    }
            	    	    	    break;
            	    	    	case 2 :
            	    	    	    // InternalJcm.g:2321:7: otherlv_9= ','
            	    	    	    {
            	    	    	    otherlv_9=(Token)match(input,27,FOLLOW_57); 

            	    	    	    							newLeafNode(otherlv_9, grammarAccess.getInstitutionAccess().getCommaKeyword_5_0_2_1_1());
            	    	    	    						

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    if ( cnt80 >= 1 ) break loop80;
            	    	                EarlyExitException eee =
            	    	                    new EarlyExitException(80, input);
            	    	                throw eee;
            	    	        }
            	    	        cnt80++;
            	    	    } while (true);


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt81 >= 1 ) break loop81;
            	                EarlyExitException eee =
            	                    new EarlyExitException(81, input);
            	                throw eee;
            	        }
            	        cnt81++;
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalJcm.g:2329:4: (otherlv_10= 'debug' ( ruleEOL )+ )
            	    {
            	    // InternalJcm.g:2329:4: (otherlv_10= 'debug' ( ruleEOL )+ )
            	    // InternalJcm.g:2330:5: otherlv_10= 'debug' ( ruleEOL )+
            	    {
            	    otherlv_10=(Token)match(input,49,FOLLOW_3); 

            	    					newLeafNode(otherlv_10, grammarAccess.getInstitutionAccess().getDebugKeyword_5_1_0());
            	    				
            	    // InternalJcm.g:2334:5: ( ruleEOL )+
            	    int cnt82=0;
            	    loop82:
            	    do {
            	        int alt82=2;
            	        int LA82_0 = input.LA(1);

            	        if ( ((LA82_0>=RULE_NEWLINE && LA82_0<=RULE_SL_COMMENT)) ) {
            	            alt82=1;
            	        }


            	        switch (alt82) {
            	    	case 1 :
            	    	    // InternalJcm.g:2335:6: ruleEOL
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getInstitutionAccess().getEOLParserRuleCall_5_1_1());
            	    	    					
            	    	    pushFollow(FOLLOW_56);
            	    	    ruleEOL();

            	    	    state._fsp--;


            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt82 >= 1 ) break loop82;
            	                EarlyExitException eee =
            	                    new EarlyExitException(82, input);
            	                throw eee;
            	        }
            	        cnt82++;
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalJcm.g:2345:4: ( ( (lv_other_12_0= RULE_ATOM ) ) otherlv_13= ':' ( ( (lv_string_14_0= RULE_STRING ) ) | ( (lv_val_15_0= RULE_INT_LITERAL ) ) | ( (lv_literal_16_0= ruleLiteral ) ) | ( (lv_val_real_17_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ )
            	    {
            	    // InternalJcm.g:2345:4: ( ( (lv_other_12_0= RULE_ATOM ) ) otherlv_13= ':' ( ( (lv_string_14_0= RULE_STRING ) ) | ( (lv_val_15_0= RULE_INT_LITERAL ) ) | ( (lv_literal_16_0= ruleLiteral ) ) | ( (lv_val_real_17_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ )
            	    // InternalJcm.g:2346:5: ( (lv_other_12_0= RULE_ATOM ) ) otherlv_13= ':' ( ( (lv_string_14_0= RULE_STRING ) ) | ( (lv_val_15_0= RULE_INT_LITERAL ) ) | ( (lv_literal_16_0= ruleLiteral ) ) | ( (lv_val_real_17_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+
            	    {
            	    // InternalJcm.g:2346:5: ( (lv_other_12_0= RULE_ATOM ) )
            	    // InternalJcm.g:2347:6: (lv_other_12_0= RULE_ATOM )
            	    {
            	    // InternalJcm.g:2347:6: (lv_other_12_0= RULE_ATOM )
            	    // InternalJcm.g:2348:7: lv_other_12_0= RULE_ATOM
            	    {
            	    lv_other_12_0=(Token)match(input,RULE_ATOM,FOLLOW_16); 

            	    							newLeafNode(lv_other_12_0, grammarAccess.getInstitutionAccess().getOtherATOMTerminalRuleCall_5_2_0_0());
            	    						

            	    							if (current==null) {
            	    								current = createModelElement(grammarAccess.getInstitutionRule());
            	    							}
            	    							addWithLastConsumed(
            	    								current,
            	    								"other",
            	    								lv_other_12_0,
            	    								"jacamoide.xtext.jcm.Jcm.ATOM");
            	    						

            	    }


            	    }

            	    otherlv_13=(Token)match(input,29,FOLLOW_43); 

            	    					newLeafNode(otherlv_13, grammarAccess.getInstitutionAccess().getColonKeyword_5_2_1());
            	    				
            	    // InternalJcm.g:2368:5: ( ( (lv_string_14_0= RULE_STRING ) ) | ( (lv_val_15_0= RULE_INT_LITERAL ) ) | ( (lv_literal_16_0= ruleLiteral ) ) | ( (lv_val_real_17_0= RULE_REAL_LITERAL ) ) )
            	    int alt83=4;
            	    switch ( input.LA(1) ) {
            	    case RULE_STRING:
            	        {
            	        alt83=1;
            	        }
            	        break;
            	    case RULE_INT_LITERAL:
            	        {
            	        alt83=2;
            	        }
            	        break;
            	    case RULE_ATOM:
            	    case RULE_VART:
            	    case RULE_UNNAMEDVART:
            	    case 81:
            	    case 82:
            	    case 83:
            	    case 84:
            	    case 85:
            	        {
            	        alt83=3;
            	        }
            	        break;
            	    case RULE_REAL_LITERAL:
            	        {
            	        alt83=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 83, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt83) {
            	        case 1 :
            	            // InternalJcm.g:2369:6: ( (lv_string_14_0= RULE_STRING ) )
            	            {
            	            // InternalJcm.g:2369:6: ( (lv_string_14_0= RULE_STRING ) )
            	            // InternalJcm.g:2370:7: (lv_string_14_0= RULE_STRING )
            	            {
            	            // InternalJcm.g:2370:7: (lv_string_14_0= RULE_STRING )
            	            // InternalJcm.g:2371:8: lv_string_14_0= RULE_STRING
            	            {
            	            lv_string_14_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

            	            								newLeafNode(lv_string_14_0, grammarAccess.getInstitutionAccess().getStringSTRINGTerminalRuleCall_5_2_2_0_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getInstitutionRule());
            	            								}
            	            								addWithLastConsumed(
            	            									current,
            	            									"string",
            	            									lv_string_14_0,
            	            									"jacamoide.xtext.jcm.Jcm.STRING");
            	            							

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalJcm.g:2388:6: ( (lv_val_15_0= RULE_INT_LITERAL ) )
            	            {
            	            // InternalJcm.g:2388:6: ( (lv_val_15_0= RULE_INT_LITERAL ) )
            	            // InternalJcm.g:2389:7: (lv_val_15_0= RULE_INT_LITERAL )
            	            {
            	            // InternalJcm.g:2389:7: (lv_val_15_0= RULE_INT_LITERAL )
            	            // InternalJcm.g:2390:8: lv_val_15_0= RULE_INT_LITERAL
            	            {
            	            lv_val_15_0=(Token)match(input,RULE_INT_LITERAL,FOLLOW_3); 

            	            								newLeafNode(lv_val_15_0, grammarAccess.getInstitutionAccess().getValINT_LITERALTerminalRuleCall_5_2_2_1_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getInstitutionRule());
            	            								}
            	            								addWithLastConsumed(
            	            									current,
            	            									"val",
            	            									lv_val_15_0,
            	            									"jacamoide.xtext.jcm.Jcm.INT_LITERAL");
            	            							

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalJcm.g:2407:6: ( (lv_literal_16_0= ruleLiteral ) )
            	            {
            	            // InternalJcm.g:2407:6: ( (lv_literal_16_0= ruleLiteral ) )
            	            // InternalJcm.g:2408:7: (lv_literal_16_0= ruleLiteral )
            	            {
            	            // InternalJcm.g:2408:7: (lv_literal_16_0= ruleLiteral )
            	            // InternalJcm.g:2409:8: lv_literal_16_0= ruleLiteral
            	            {

            	            								newCompositeNode(grammarAccess.getInstitutionAccess().getLiteralLiteralParserRuleCall_5_2_2_2_0());
            	            							
            	            pushFollow(FOLLOW_3);
            	            lv_literal_16_0=ruleLiteral();

            	            state._fsp--;


            	            								if (current==null) {
            	            									current = createModelElementForParent(grammarAccess.getInstitutionRule());
            	            								}
            	            								add(
            	            									current,
            	            									"literal",
            	            									lv_literal_16_0,
            	            									"jacamoide.xtext.jcm.Jcm.Literal");
            	            								afterParserOrEnumRuleCall();
            	            							

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalJcm.g:2427:6: ( (lv_val_real_17_0= RULE_REAL_LITERAL ) )
            	            {
            	            // InternalJcm.g:2427:6: ( (lv_val_real_17_0= RULE_REAL_LITERAL ) )
            	            // InternalJcm.g:2428:7: (lv_val_real_17_0= RULE_REAL_LITERAL )
            	            {
            	            // InternalJcm.g:2428:7: (lv_val_real_17_0= RULE_REAL_LITERAL )
            	            // InternalJcm.g:2429:8: lv_val_real_17_0= RULE_REAL_LITERAL
            	            {
            	            lv_val_real_17_0=(Token)match(input,RULE_REAL_LITERAL,FOLLOW_3); 

            	            								newLeafNode(lv_val_real_17_0, grammarAccess.getInstitutionAccess().getVal_realREAL_LITERALTerminalRuleCall_5_2_2_3_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getInstitutionRule());
            	            								}
            	            								addWithLastConsumed(
            	            									current,
            	            									"val_real",
            	            									lv_val_real_17_0,
            	            									"jacamoide.xtext.jcm.Jcm.REAL_LITERAL");
            	            							

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalJcm.g:2446:5: ( ruleEOL )+
            	    int cnt84=0;
            	    loop84:
            	    do {
            	        int alt84=2;
            	        int LA84_0 = input.LA(1);

            	        if ( ((LA84_0>=RULE_NEWLINE && LA84_0<=RULE_SL_COMMENT)) ) {
            	            alt84=1;
            	        }


            	        switch (alt84) {
            	    	case 1 :
            	    	    // InternalJcm.g:2447:6: ruleEOL
            	    	    {

            	    	    						newCompositeNode(grammarAccess.getInstitutionAccess().getEOLParserRuleCall_5_2_3());
            	    	    					
            	    	    pushFollow(FOLLOW_56);
            	    	    ruleEOL();

            	    	    state._fsp--;


            	    	    						afterParserOrEnumRuleCall();
            	    	    					

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt84 >= 1 ) break loop84;
            	                EarlyExitException eee =
            	                    new EarlyExitException(84, input);
            	                throw eee;
            	        }
            	        cnt84++;
            	    } while (true);


            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            otherlv_19=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_19, grammarAccess.getInstitutionAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalJcm.g:2461:3: ( ruleEOL )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( ((LA86_0>=RULE_NEWLINE && LA86_0<=RULE_SL_COMMENT)) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // InternalJcm.g:2462:4: ruleEOL
            	    {

            	    				newCompositeNode(grammarAccess.getInstitutionAccess().getEOLParserRuleCall_7());
            	    			
            	    pushFollow(FOLLOW_13);
            	    ruleEOL();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstitution"


    // $ANTLR start "entryRuleOrganisation"
    // InternalJcm.g:2474:1: entryRuleOrganisation returns [EObject current=null] : iv_ruleOrganisation= ruleOrganisation EOF ;
    public final EObject entryRuleOrganisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrganisation = null;


        try {
            // InternalJcm.g:2474:53: (iv_ruleOrganisation= ruleOrganisation EOF )
            // InternalJcm.g:2475:2: iv_ruleOrganisation= ruleOrganisation EOF
            {
             newCompositeNode(grammarAccess.getOrganisationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOrganisation=ruleOrganisation();

            state._fsp--;

             current =iv_ruleOrganisation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrganisation"


    // $ANTLR start "ruleOrganisation"
    // InternalJcm.g:2481:1: ruleOrganisation returns [EObject current=null] : (otherlv_0= 'organisation' ( (lv_name_1_0= RULE_ATOM ) ) ( (lv_fileName_2_0= ruleOFileName ) )? otherlv_3= '{' ( ruleEOL )* ( ( (lv_group_5_0= ruleGroup ) ) | ( (lv_scheme_6_0= ruleScheme ) ) | ( (lv_agents_7_0= ruleOAgents ) ) | ( (lv_node_8_0= ruleONode ) ) | ( (lv_situated_9_0= ruleOSituated ) ) | ( (lv_other_10_0= ruleOOthers ) ) )* otherlv_11= '}' ( ruleEOL )* ) ;
    public final EObject ruleOrganisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_11=null;
        EObject lv_fileName_2_0 = null;

        EObject lv_group_5_0 = null;

        EObject lv_scheme_6_0 = null;

        EObject lv_agents_7_0 = null;

        EObject lv_node_8_0 = null;

        EObject lv_situated_9_0 = null;

        EObject lv_other_10_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:2487:2: ( (otherlv_0= 'organisation' ( (lv_name_1_0= RULE_ATOM ) ) ( (lv_fileName_2_0= ruleOFileName ) )? otherlv_3= '{' ( ruleEOL )* ( ( (lv_group_5_0= ruleGroup ) ) | ( (lv_scheme_6_0= ruleScheme ) ) | ( (lv_agents_7_0= ruleOAgents ) ) | ( (lv_node_8_0= ruleONode ) ) | ( (lv_situated_9_0= ruleOSituated ) ) | ( (lv_other_10_0= ruleOOthers ) ) )* otherlv_11= '}' ( ruleEOL )* ) )
            // InternalJcm.g:2488:2: (otherlv_0= 'organisation' ( (lv_name_1_0= RULE_ATOM ) ) ( (lv_fileName_2_0= ruleOFileName ) )? otherlv_3= '{' ( ruleEOL )* ( ( (lv_group_5_0= ruleGroup ) ) | ( (lv_scheme_6_0= ruleScheme ) ) | ( (lv_agents_7_0= ruleOAgents ) ) | ( (lv_node_8_0= ruleONode ) ) | ( (lv_situated_9_0= ruleOSituated ) ) | ( (lv_other_10_0= ruleOOthers ) ) )* otherlv_11= '}' ( ruleEOL )* )
            {
            // InternalJcm.g:2488:2: (otherlv_0= 'organisation' ( (lv_name_1_0= RULE_ATOM ) ) ( (lv_fileName_2_0= ruleOFileName ) )? otherlv_3= '{' ( ruleEOL )* ( ( (lv_group_5_0= ruleGroup ) ) | ( (lv_scheme_6_0= ruleScheme ) ) | ( (lv_agents_7_0= ruleOAgents ) ) | ( (lv_node_8_0= ruleONode ) ) | ( (lv_situated_9_0= ruleOSituated ) ) | ( (lv_other_10_0= ruleOOthers ) ) )* otherlv_11= '}' ( ruleEOL )* )
            // InternalJcm.g:2489:3: otherlv_0= 'organisation' ( (lv_name_1_0= RULE_ATOM ) ) ( (lv_fileName_2_0= ruleOFileName ) )? otherlv_3= '{' ( ruleEOL )* ( ( (lv_group_5_0= ruleGroup ) ) | ( (lv_scheme_6_0= ruleScheme ) ) | ( (lv_agents_7_0= ruleOAgents ) ) | ( (lv_node_8_0= ruleONode ) ) | ( (lv_situated_9_0= ruleOSituated ) ) | ( (lv_other_10_0= ruleOOthers ) ) )* otherlv_11= '}' ( ruleEOL )*
            {
            otherlv_0=(Token)match(input,66,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getOrganisationAccess().getOrganisationKeyword_0());
            		
            // InternalJcm.g:2493:3: ( (lv_name_1_0= RULE_ATOM ) )
            // InternalJcm.g:2494:4: (lv_name_1_0= RULE_ATOM )
            {
            // InternalJcm.g:2494:4: (lv_name_1_0= RULE_ATOM )
            // InternalJcm.g:2495:5: lv_name_1_0= RULE_ATOM
            {
            lv_name_1_0=(Token)match(input,RULE_ATOM,FOLLOW_55); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOrganisationAccess().getNameATOMTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOrganisationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jacamoide.xtext.jcm.Jcm.ATOM");
            				

            }


            }

            // InternalJcm.g:2511:3: ( (lv_fileName_2_0= ruleOFileName ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==29) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalJcm.g:2512:4: (lv_fileName_2_0= ruleOFileName )
                    {
                    // InternalJcm.g:2512:4: (lv_fileName_2_0= ruleOFileName )
                    // InternalJcm.g:2513:5: lv_fileName_2_0= ruleOFileName
                    {

                    					newCompositeNode(grammarAccess.getOrganisationAccess().getFileNameOFileNameParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_44);
                    lv_fileName_2_0=ruleOFileName();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOrganisationRule());
                    					}
                    					set(
                    						current,
                    						"fileName",
                    						lv_fileName_2_0,
                    						"jacamoide.xtext.jcm.Jcm.OFileName");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,24,FOLLOW_58); 

            			newLeafNode(otherlv_3, grammarAccess.getOrganisationAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalJcm.g:2534:3: ( ruleEOL )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( ((LA88_0>=RULE_NEWLINE && LA88_0<=RULE_SL_COMMENT)) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalJcm.g:2535:4: ruleEOL
            	    {

            	    				newCompositeNode(grammarAccess.getOrganisationAccess().getEOLParserRuleCall_4());
            	    			
            	    pushFollow(FOLLOW_58);
            	    ruleEOL();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);

            // InternalJcm.g:2543:3: ( ( (lv_group_5_0= ruleGroup ) ) | ( (lv_scheme_6_0= ruleScheme ) ) | ( (lv_agents_7_0= ruleOAgents ) ) | ( (lv_node_8_0= ruleONode ) ) | ( (lv_situated_9_0= ruleOSituated ) ) | ( (lv_other_10_0= ruleOOthers ) ) )*
            loop89:
            do {
                int alt89=7;
                switch ( input.LA(1) ) {
                case 68:
                    {
                    alt89=1;
                    }
                    break;
                case 72:
                    {
                    alt89=2;
                    }
                    break;
                case 60:
                    {
                    alt89=3;
                    }
                    break;
                case 34:
                    {
                    alt89=4;
                    }
                    break;
                case 67:
                    {
                    alt89=5;
                    }
                    break;
                case RULE_ATOM:
                    {
                    alt89=6;
                    }
                    break;

                }

                switch (alt89) {
            	case 1 :
            	    // InternalJcm.g:2544:4: ( (lv_group_5_0= ruleGroup ) )
            	    {
            	    // InternalJcm.g:2544:4: ( (lv_group_5_0= ruleGroup ) )
            	    // InternalJcm.g:2545:5: (lv_group_5_0= ruleGroup )
            	    {
            	    // InternalJcm.g:2545:5: (lv_group_5_0= ruleGroup )
            	    // InternalJcm.g:2546:6: lv_group_5_0= ruleGroup
            	    {

            	    						newCompositeNode(grammarAccess.getOrganisationAccess().getGroupGroupParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_59);
            	    lv_group_5_0=ruleGroup();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrganisationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"group",
            	    							lv_group_5_0,
            	    							"jacamoide.xtext.jcm.Jcm.Group");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalJcm.g:2564:4: ( (lv_scheme_6_0= ruleScheme ) )
            	    {
            	    // InternalJcm.g:2564:4: ( (lv_scheme_6_0= ruleScheme ) )
            	    // InternalJcm.g:2565:5: (lv_scheme_6_0= ruleScheme )
            	    {
            	    // InternalJcm.g:2565:5: (lv_scheme_6_0= ruleScheme )
            	    // InternalJcm.g:2566:6: lv_scheme_6_0= ruleScheme
            	    {

            	    						newCompositeNode(grammarAccess.getOrganisationAccess().getSchemeSchemeParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_59);
            	    lv_scheme_6_0=ruleScheme();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrganisationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"scheme",
            	    							lv_scheme_6_0,
            	    							"jacamoide.xtext.jcm.Jcm.Scheme");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalJcm.g:2584:4: ( (lv_agents_7_0= ruleOAgents ) )
            	    {
            	    // InternalJcm.g:2584:4: ( (lv_agents_7_0= ruleOAgents ) )
            	    // InternalJcm.g:2585:5: (lv_agents_7_0= ruleOAgents )
            	    {
            	    // InternalJcm.g:2585:5: (lv_agents_7_0= ruleOAgents )
            	    // InternalJcm.g:2586:6: lv_agents_7_0= ruleOAgents
            	    {

            	    						newCompositeNode(grammarAccess.getOrganisationAccess().getAgentsOAgentsParserRuleCall_5_2_0());
            	    					
            	    pushFollow(FOLLOW_59);
            	    lv_agents_7_0=ruleOAgents();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrganisationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"agents",
            	    							lv_agents_7_0,
            	    							"jacamoide.xtext.jcm.Jcm.OAgents");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalJcm.g:2604:4: ( (lv_node_8_0= ruleONode ) )
            	    {
            	    // InternalJcm.g:2604:4: ( (lv_node_8_0= ruleONode ) )
            	    // InternalJcm.g:2605:5: (lv_node_8_0= ruleONode )
            	    {
            	    // InternalJcm.g:2605:5: (lv_node_8_0= ruleONode )
            	    // InternalJcm.g:2606:6: lv_node_8_0= ruleONode
            	    {

            	    						newCompositeNode(grammarAccess.getOrganisationAccess().getNodeONodeParserRuleCall_5_3_0());
            	    					
            	    pushFollow(FOLLOW_59);
            	    lv_node_8_0=ruleONode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrganisationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"node",
            	    							lv_node_8_0,
            	    							"jacamoide.xtext.jcm.Jcm.ONode");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalJcm.g:2624:4: ( (lv_situated_9_0= ruleOSituated ) )
            	    {
            	    // InternalJcm.g:2624:4: ( (lv_situated_9_0= ruleOSituated ) )
            	    // InternalJcm.g:2625:5: (lv_situated_9_0= ruleOSituated )
            	    {
            	    // InternalJcm.g:2625:5: (lv_situated_9_0= ruleOSituated )
            	    // InternalJcm.g:2626:6: lv_situated_9_0= ruleOSituated
            	    {

            	    						newCompositeNode(grammarAccess.getOrganisationAccess().getSituatedOSituatedParserRuleCall_5_4_0());
            	    					
            	    pushFollow(FOLLOW_59);
            	    lv_situated_9_0=ruleOSituated();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrganisationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"situated",
            	    							lv_situated_9_0,
            	    							"jacamoide.xtext.jcm.Jcm.OSituated");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalJcm.g:2644:4: ( (lv_other_10_0= ruleOOthers ) )
            	    {
            	    // InternalJcm.g:2644:4: ( (lv_other_10_0= ruleOOthers ) )
            	    // InternalJcm.g:2645:5: (lv_other_10_0= ruleOOthers )
            	    {
            	    // InternalJcm.g:2645:5: (lv_other_10_0= ruleOOthers )
            	    // InternalJcm.g:2646:6: lv_other_10_0= ruleOOthers
            	    {

            	    						newCompositeNode(grammarAccess.getOrganisationAccess().getOtherOOthersParserRuleCall_5_5_0());
            	    					
            	    pushFollow(FOLLOW_59);
            	    lv_other_10_0=ruleOOthers();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrganisationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"other",
            	    							lv_other_10_0,
            	    							"jacamoide.xtext.jcm.Jcm.OOthers");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            otherlv_11=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getOrganisationAccess().getRightCurlyBracketKeyword_6());
            		
            // InternalJcm.g:2668:3: ( ruleEOL )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( ((LA90_0>=RULE_NEWLINE && LA90_0<=RULE_SL_COMMENT)) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalJcm.g:2669:4: ruleEOL
            	    {

            	    				newCompositeNode(grammarAccess.getOrganisationAccess().getEOLParserRuleCall_7());
            	    			
            	    pushFollow(FOLLOW_13);
            	    ruleEOL();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrganisation"


    // $ANTLR start "entryRuleOFileName"
    // InternalJcm.g:2681:1: entryRuleOFileName returns [EObject current=null] : iv_ruleOFileName= ruleOFileName EOF ;
    public final EObject entryRuleOFileName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOFileName = null;


        try {
            // InternalJcm.g:2681:50: (iv_ruleOFileName= ruleOFileName EOF )
            // InternalJcm.g:2682:2: iv_ruleOFileName= ruleOFileName EOF
            {
             newCompositeNode(grammarAccess.getOFileNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOFileName=ruleOFileName();

            state._fsp--;

             current =iv_ruleOFileName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOFileName"


    // $ANTLR start "ruleOFileName"
    // InternalJcm.g:2688:1: ruleOFileName returns [EObject current=null] : (otherlv_0= ':' ( (lv_name_1_0= ruleFileName ) ) ) ;
    public final EObject ruleOFileName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:2694:2: ( (otherlv_0= ':' ( (lv_name_1_0= ruleFileName ) ) ) )
            // InternalJcm.g:2695:2: (otherlv_0= ':' ( (lv_name_1_0= ruleFileName ) ) )
            {
            // InternalJcm.g:2695:2: (otherlv_0= ':' ( (lv_name_1_0= ruleFileName ) ) )
            // InternalJcm.g:2696:3: otherlv_0= ':' ( (lv_name_1_0= ruleFileName ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getOFileNameAccess().getColonKeyword_0());
            		
            // InternalJcm.g:2700:3: ( (lv_name_1_0= ruleFileName ) )
            // InternalJcm.g:2701:4: (lv_name_1_0= ruleFileName )
            {
            // InternalJcm.g:2701:4: (lv_name_1_0= ruleFileName )
            // InternalJcm.g:2702:5: lv_name_1_0= ruleFileName
            {

            					newCompositeNode(grammarAccess.getOFileNameAccess().getNameFileNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleFileName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOFileNameRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"jacamoide.xtext.jcm.Jcm.FileName");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOFileName"


    // $ANTLR start "entryRuleONode"
    // InternalJcm.g:2723:1: entryRuleONode returns [EObject current=null] : iv_ruleONode= ruleONode EOF ;
    public final EObject entryRuleONode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleONode = null;


        try {
            // InternalJcm.g:2723:46: (iv_ruleONode= ruleONode EOF )
            // InternalJcm.g:2724:2: iv_ruleONode= ruleONode EOF
            {
             newCompositeNode(grammarAccess.getONodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleONode=ruleONode();

            state._fsp--;

             current =iv_ruleONode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleONode"


    // $ANTLR start "ruleONode"
    // InternalJcm.g:2730:1: ruleONode returns [EObject current=null] : (otherlv_0= 'node' otherlv_1= ':' ( (lv_name_2_0= RULE_ATOM ) ) ( ruleEOL )+ ) ;
    public final EObject ruleONode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalJcm.g:2736:2: ( (otherlv_0= 'node' otherlv_1= ':' ( (lv_name_2_0= RULE_ATOM ) ) ( ruleEOL )+ ) )
            // InternalJcm.g:2737:2: (otherlv_0= 'node' otherlv_1= ':' ( (lv_name_2_0= RULE_ATOM ) ) ( ruleEOL )+ )
            {
            // InternalJcm.g:2737:2: (otherlv_0= 'node' otherlv_1= ':' ( (lv_name_2_0= RULE_ATOM ) ) ( ruleEOL )+ )
            // InternalJcm.g:2738:3: otherlv_0= 'node' otherlv_1= ':' ( (lv_name_2_0= RULE_ATOM ) ) ( ruleEOL )+
            {
            otherlv_0=(Token)match(input,34,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getONodeAccess().getNodeKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getONodeAccess().getColonKeyword_1());
            		
            // InternalJcm.g:2746:3: ( (lv_name_2_0= RULE_ATOM ) )
            // InternalJcm.g:2747:4: (lv_name_2_0= RULE_ATOM )
            {
            // InternalJcm.g:2747:4: (lv_name_2_0= RULE_ATOM )
            // InternalJcm.g:2748:5: lv_name_2_0= RULE_ATOM
            {
            lv_name_2_0=(Token)match(input,RULE_ATOM,FOLLOW_3); 

            					newLeafNode(lv_name_2_0, grammarAccess.getONodeAccess().getNameATOMTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getONodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"jacamoide.xtext.jcm.Jcm.ATOM");
            				

            }


            }

            // InternalJcm.g:2764:3: ( ruleEOL )+
            int cnt91=0;
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( ((LA91_0>=RULE_NEWLINE && LA91_0<=RULE_SL_COMMENT)) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalJcm.g:2765:4: ruleEOL
            	    {

            	    				newCompositeNode(grammarAccess.getONodeAccess().getEOLParserRuleCall_3());
            	    			
            	    pushFollow(FOLLOW_13);
            	    ruleEOL();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt91 >= 1 ) break loop91;
                        EarlyExitException eee =
                            new EarlyExitException(91, input);
                        throw eee;
                }
                cnt91++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleONode"


    // $ANTLR start "entryRuleOSituated"
    // InternalJcm.g:2777:1: entryRuleOSituated returns [EObject current=null] : iv_ruleOSituated= ruleOSituated EOF ;
    public final EObject entryRuleOSituated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOSituated = null;


        try {
            // InternalJcm.g:2777:50: (iv_ruleOSituated= ruleOSituated EOF )
            // InternalJcm.g:2778:2: iv_ruleOSituated= ruleOSituated EOF
            {
             newCompositeNode(grammarAccess.getOSituatedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOSituated=ruleOSituated();

            state._fsp--;

             current =iv_ruleOSituated; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOSituated"


    // $ANTLR start "ruleOSituated"
    // InternalJcm.g:2784:1: ruleOSituated returns [EObject current=null] : (otherlv_0= 'situated' otherlv_1= ':' ( (lv_name_2_0= RULE_ATOM ) ) ( ruleEOL )+ ) ;
    public final EObject ruleOSituated() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalJcm.g:2790:2: ( (otherlv_0= 'situated' otherlv_1= ':' ( (lv_name_2_0= RULE_ATOM ) ) ( ruleEOL )+ ) )
            // InternalJcm.g:2791:2: (otherlv_0= 'situated' otherlv_1= ':' ( (lv_name_2_0= RULE_ATOM ) ) ( ruleEOL )+ )
            {
            // InternalJcm.g:2791:2: (otherlv_0= 'situated' otherlv_1= ':' ( (lv_name_2_0= RULE_ATOM ) ) ( ruleEOL )+ )
            // InternalJcm.g:2792:3: otherlv_0= 'situated' otherlv_1= ':' ( (lv_name_2_0= RULE_ATOM ) ) ( ruleEOL )+
            {
            otherlv_0=(Token)match(input,67,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getOSituatedAccess().getSituatedKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getOSituatedAccess().getColonKeyword_1());
            		
            // InternalJcm.g:2800:3: ( (lv_name_2_0= RULE_ATOM ) )
            // InternalJcm.g:2801:4: (lv_name_2_0= RULE_ATOM )
            {
            // InternalJcm.g:2801:4: (lv_name_2_0= RULE_ATOM )
            // InternalJcm.g:2802:5: lv_name_2_0= RULE_ATOM
            {
            lv_name_2_0=(Token)match(input,RULE_ATOM,FOLLOW_3); 

            					newLeafNode(lv_name_2_0, grammarAccess.getOSituatedAccess().getNameATOMTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOSituatedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"jacamoide.xtext.jcm.Jcm.ATOM");
            				

            }


            }

            // InternalJcm.g:2818:3: ( ruleEOL )+
            int cnt92=0;
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( ((LA92_0>=RULE_NEWLINE && LA92_0<=RULE_SL_COMMENT)) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalJcm.g:2819:4: ruleEOL
            	    {

            	    				newCompositeNode(grammarAccess.getOSituatedAccess().getEOLParserRuleCall_3());
            	    			
            	    pushFollow(FOLLOW_13);
            	    ruleEOL();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt92 >= 1 ) break loop92;
                        EarlyExitException eee =
                            new EarlyExitException(92, input);
                        throw eee;
                }
                cnt92++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOSituated"


    // $ANTLR start "entryRuleOAgents"
    // InternalJcm.g:2831:1: entryRuleOAgents returns [EObject current=null] : iv_ruleOAgents= ruleOAgents EOF ;
    public final EObject entryRuleOAgents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOAgents = null;


        try {
            // InternalJcm.g:2831:48: (iv_ruleOAgents= ruleOAgents EOF )
            // InternalJcm.g:2832:2: iv_ruleOAgents= ruleOAgents EOF
            {
             newCompositeNode(grammarAccess.getOAgentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOAgents=ruleOAgents();

            state._fsp--;

             current =iv_ruleOAgents; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOAgents"


    // $ANTLR start "ruleOAgents"
    // InternalJcm.g:2838:1: ruleOAgents returns [EObject current=null] : ( () otherlv_1= 'agents' otherlv_2= ':' ( ( ( (lv_agent_3_0= RULE_ATOM ) ) | otherlv_4= '*' ) ( ruleEOL | otherlv_6= ',' )+ )* ) ;
    public final EObject ruleOAgents() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_agent_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalJcm.g:2844:2: ( ( () otherlv_1= 'agents' otherlv_2= ':' ( ( ( (lv_agent_3_0= RULE_ATOM ) ) | otherlv_4= '*' ) ( ruleEOL | otherlv_6= ',' )+ )* ) )
            // InternalJcm.g:2845:2: ( () otherlv_1= 'agents' otherlv_2= ':' ( ( ( (lv_agent_3_0= RULE_ATOM ) ) | otherlv_4= '*' ) ( ruleEOL | otherlv_6= ',' )+ )* )
            {
            // InternalJcm.g:2845:2: ( () otherlv_1= 'agents' otherlv_2= ':' ( ( ( (lv_agent_3_0= RULE_ATOM ) ) | otherlv_4= '*' ) ( ruleEOL | otherlv_6= ',' )+ )* )
            // InternalJcm.g:2846:3: () otherlv_1= 'agents' otherlv_2= ':' ( ( ( (lv_agent_3_0= RULE_ATOM ) ) | otherlv_4= '*' ) ( ruleEOL | otherlv_6= ',' )+ )*
            {
            // InternalJcm.g:2846:3: ()
            // InternalJcm.g:2847:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOAgentsAccess().getOAgentsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,60,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getOAgentsAccess().getAgentsKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_60); 

            			newLeafNode(otherlv_2, grammarAccess.getOAgentsAccess().getColonKeyword_2());
            		
            // InternalJcm.g:2861:3: ( ( ( (lv_agent_3_0= RULE_ATOM ) ) | otherlv_4= '*' ) ( ruleEOL | otherlv_6= ',' )+ )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==RULE_ATOM) ) {
                    int LA95_2 = input.LA(2);

                    if ( ((LA95_2>=RULE_NEWLINE && LA95_2<=RULE_SL_COMMENT)||LA95_2==27) ) {
                        alt95=1;
                    }


                }
                else if ( (LA95_0==61) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // InternalJcm.g:2862:4: ( ( (lv_agent_3_0= RULE_ATOM ) ) | otherlv_4= '*' ) ( ruleEOL | otherlv_6= ',' )+
            	    {
            	    // InternalJcm.g:2862:4: ( ( (lv_agent_3_0= RULE_ATOM ) ) | otherlv_4= '*' )
            	    int alt93=2;
            	    int LA93_0 = input.LA(1);

            	    if ( (LA93_0==RULE_ATOM) ) {
            	        alt93=1;
            	    }
            	    else if ( (LA93_0==61) ) {
            	        alt93=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 93, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt93) {
            	        case 1 :
            	            // InternalJcm.g:2863:5: ( (lv_agent_3_0= RULE_ATOM ) )
            	            {
            	            // InternalJcm.g:2863:5: ( (lv_agent_3_0= RULE_ATOM ) )
            	            // InternalJcm.g:2864:6: (lv_agent_3_0= RULE_ATOM )
            	            {
            	            // InternalJcm.g:2864:6: (lv_agent_3_0= RULE_ATOM )
            	            // InternalJcm.g:2865:7: lv_agent_3_0= RULE_ATOM
            	            {
            	            lv_agent_3_0=(Token)match(input,RULE_ATOM,FOLLOW_18); 

            	            							newLeafNode(lv_agent_3_0, grammarAccess.getOAgentsAccess().getAgentATOMTerminalRuleCall_3_0_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getOAgentsRule());
            	            							}
            	            							addWithLastConsumed(
            	            								current,
            	            								"agent",
            	            								lv_agent_3_0,
            	            								"jacamoide.xtext.jcm.Jcm.ATOM");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalJcm.g:2882:5: otherlv_4= '*'
            	            {
            	            otherlv_4=(Token)match(input,61,FOLLOW_18); 

            	            					newLeafNode(otherlv_4, grammarAccess.getOAgentsAccess().getAsteriskKeyword_3_0_1());
            	            				

            	            }
            	            break;

            	    }

            	    // InternalJcm.g:2887:4: ( ruleEOL | otherlv_6= ',' )+
            	    int cnt94=0;
            	    loop94:
            	    do {
            	        int alt94=3;
            	        int LA94_0 = input.LA(1);

            	        if ( ((LA94_0>=RULE_NEWLINE && LA94_0<=RULE_SL_COMMENT)) ) {
            	            alt94=1;
            	        }
            	        else if ( (LA94_0==27) ) {
            	            alt94=2;
            	        }


            	        switch (alt94) {
            	    	case 1 :
            	    	    // InternalJcm.g:2888:5: ruleEOL
            	    	    {

            	    	    					newCompositeNode(grammarAccess.getOAgentsAccess().getEOLParserRuleCall_3_1_0());
            	    	    				
            	    	    pushFollow(FOLLOW_61);
            	    	    ruleEOL();

            	    	    state._fsp--;


            	    	    					afterParserOrEnumRuleCall();
            	    	    				

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // InternalJcm.g:2896:5: otherlv_6= ','
            	    	    {
            	    	    otherlv_6=(Token)match(input,27,FOLLOW_61); 

            	    	    					newLeafNode(otherlv_6, grammarAccess.getOAgentsAccess().getCommaKeyword_3_1_1());
            	    	    				

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt94 >= 1 ) break loop94;
            	                EarlyExitException eee =
            	                    new EarlyExitException(94, input);
            	                throw eee;
            	        }
            	        cnt94++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOAgents"


    // $ANTLR start "entryRuleOOthers"
    // InternalJcm.g:2906:1: entryRuleOOthers returns [EObject current=null] : iv_ruleOOthers= ruleOOthers EOF ;
    public final EObject entryRuleOOthers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOOthers = null;


        try {
            // InternalJcm.g:2906:48: (iv_ruleOOthers= ruleOOthers EOF )
            // InternalJcm.g:2907:2: iv_ruleOOthers= ruleOOthers EOF
            {
             newCompositeNode(grammarAccess.getOOthersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOOthers=ruleOOthers();

            state._fsp--;

             current =iv_ruleOOthers; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOOthers"


    // $ANTLR start "ruleOOthers"
    // InternalJcm.g:2913:1: ruleOOthers returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ATOM ) ) otherlv_1= ':' ( ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_val_3_0= RULE_INT_LITERAL ) ) | ( (lv_literal_4_0= ruleLiteral ) ) | ( (lv_val_real_5_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) ;
    public final EObject ruleOOthers() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_string_2_0=null;
        Token lv_val_3_0=null;
        Token lv_val_real_5_0=null;
        EObject lv_literal_4_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:2919:2: ( ( ( (lv_name_0_0= RULE_ATOM ) ) otherlv_1= ':' ( ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_val_3_0= RULE_INT_LITERAL ) ) | ( (lv_literal_4_0= ruleLiteral ) ) | ( (lv_val_real_5_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )
            // InternalJcm.g:2920:2: ( ( (lv_name_0_0= RULE_ATOM ) ) otherlv_1= ':' ( ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_val_3_0= RULE_INT_LITERAL ) ) | ( (lv_literal_4_0= ruleLiteral ) ) | ( (lv_val_real_5_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ )
            {
            // InternalJcm.g:2920:2: ( ( (lv_name_0_0= RULE_ATOM ) ) otherlv_1= ':' ( ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_val_3_0= RULE_INT_LITERAL ) ) | ( (lv_literal_4_0= ruleLiteral ) ) | ( (lv_val_real_5_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ )
            // InternalJcm.g:2921:3: ( (lv_name_0_0= RULE_ATOM ) ) otherlv_1= ':' ( ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_val_3_0= RULE_INT_LITERAL ) ) | ( (lv_literal_4_0= ruleLiteral ) ) | ( (lv_val_real_5_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+
            {
            // InternalJcm.g:2921:3: ( (lv_name_0_0= RULE_ATOM ) )
            // InternalJcm.g:2922:4: (lv_name_0_0= RULE_ATOM )
            {
            // InternalJcm.g:2922:4: (lv_name_0_0= RULE_ATOM )
            // InternalJcm.g:2923:5: lv_name_0_0= RULE_ATOM
            {
            lv_name_0_0=(Token)match(input,RULE_ATOM,FOLLOW_16); 

            					newLeafNode(lv_name_0_0, grammarAccess.getOOthersAccess().getNameATOMTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOOthersRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"jacamoide.xtext.jcm.Jcm.ATOM");
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getOOthersAccess().getColonKeyword_1());
            		
            // InternalJcm.g:2943:3: ( ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_val_3_0= RULE_INT_LITERAL ) ) | ( (lv_literal_4_0= ruleLiteral ) ) | ( (lv_val_real_5_0= RULE_REAL_LITERAL ) ) )
            int alt96=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt96=1;
                }
                break;
            case RULE_INT_LITERAL:
                {
                alt96=2;
                }
                break;
            case RULE_ATOM:
            case RULE_VART:
            case RULE_UNNAMEDVART:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
                {
                alt96=3;
                }
                break;
            case RULE_REAL_LITERAL:
                {
                alt96=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // InternalJcm.g:2944:4: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalJcm.g:2944:4: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalJcm.g:2945:5: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalJcm.g:2945:5: (lv_string_2_0= RULE_STRING )
                    // InternalJcm.g:2946:6: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

                    						newLeafNode(lv_string_2_0, grammarAccess.getOOthersAccess().getStringSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOOthersRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"string",
                    							lv_string_2_0,
                    							"jacamoide.xtext.jcm.Jcm.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJcm.g:2963:4: ( (lv_val_3_0= RULE_INT_LITERAL ) )
                    {
                    // InternalJcm.g:2963:4: ( (lv_val_3_0= RULE_INT_LITERAL ) )
                    // InternalJcm.g:2964:5: (lv_val_3_0= RULE_INT_LITERAL )
                    {
                    // InternalJcm.g:2964:5: (lv_val_3_0= RULE_INT_LITERAL )
                    // InternalJcm.g:2965:6: lv_val_3_0= RULE_INT_LITERAL
                    {
                    lv_val_3_0=(Token)match(input,RULE_INT_LITERAL,FOLLOW_3); 

                    						newLeafNode(lv_val_3_0, grammarAccess.getOOthersAccess().getValINT_LITERALTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOOthersRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"val",
                    							lv_val_3_0,
                    							"jacamoide.xtext.jcm.Jcm.INT_LITERAL");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalJcm.g:2982:4: ( (lv_literal_4_0= ruleLiteral ) )
                    {
                    // InternalJcm.g:2982:4: ( (lv_literal_4_0= ruleLiteral ) )
                    // InternalJcm.g:2983:5: (lv_literal_4_0= ruleLiteral )
                    {
                    // InternalJcm.g:2983:5: (lv_literal_4_0= ruleLiteral )
                    // InternalJcm.g:2984:6: lv_literal_4_0= ruleLiteral
                    {

                    						newCompositeNode(grammarAccess.getOOthersAccess().getLiteralLiteralParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_literal_4_0=ruleLiteral();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOOthersRule());
                    						}
                    						add(
                    							current,
                    							"literal",
                    							lv_literal_4_0,
                    							"jacamoide.xtext.jcm.Jcm.Literal");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalJcm.g:3002:4: ( (lv_val_real_5_0= RULE_REAL_LITERAL ) )
                    {
                    // InternalJcm.g:3002:4: ( (lv_val_real_5_0= RULE_REAL_LITERAL ) )
                    // InternalJcm.g:3003:5: (lv_val_real_5_0= RULE_REAL_LITERAL )
                    {
                    // InternalJcm.g:3003:5: (lv_val_real_5_0= RULE_REAL_LITERAL )
                    // InternalJcm.g:3004:6: lv_val_real_5_0= RULE_REAL_LITERAL
                    {
                    lv_val_real_5_0=(Token)match(input,RULE_REAL_LITERAL,FOLLOW_3); 

                    						newLeafNode(lv_val_real_5_0, grammarAccess.getOOthersAccess().getVal_realREAL_LITERALTerminalRuleCall_2_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getOOthersRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"val_real",
                    							lv_val_real_5_0,
                    							"jacamoide.xtext.jcm.Jcm.REAL_LITERAL");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJcm.g:3021:3: ( ruleEOL )+
            int cnt97=0;
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( ((LA97_0>=RULE_NEWLINE && LA97_0<=RULE_SL_COMMENT)) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalJcm.g:3022:4: ruleEOL
            	    {

            	    				newCompositeNode(grammarAccess.getOOthersAccess().getEOLParserRuleCall_3());
            	    			
            	    pushFollow(FOLLOW_13);
            	    ruleEOL();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt97 >= 1 ) break loop97;
                        EarlyExitException eee =
                            new EarlyExitException(97, input);
                        throw eee;
                }
                cnt97++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOOthers"


    // $ANTLR start "entryRuleGroup"
    // InternalJcm.g:3034:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // InternalJcm.g:3034:46: (iv_ruleGroup= ruleGroup EOF )
            // InternalJcm.g:3035:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroup"


    // $ANTLR start "ruleGroup"
    // InternalJcm.g:3041:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_kind_3_0= RULE_ATOM ) ) (otherlv_4= '{' ( ruleEOL )* ( ( (lv_group_6_0= ruleGroup ) ) | (otherlv_7= 'responsible-for' otherlv_8= ':' ( ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL | otherlv_11= ',' )+ )+ ) | (otherlv_12= 'owner' otherlv_13= ':' ( (lv_owner_14_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_16= 'debug' (otherlv_17= ':' ( (lv_debug_18_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( ( (lv_other_20_0= RULE_ATOM ) ) otherlv_21= ':' ( ( (lv_string_22_0= RULE_STRING ) ) | ( (lv_val_23_0= RULE_INT_LITERAL ) ) | ( (lv_literal_24_0= ruleLiteral ) ) | ( (lv_val_real_25_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) | (otherlv_27= 'players' otherlv_28= ':' ( ( (lv_agent_29_0= RULE_ATOM ) ) ( (lv_role_30_0= RULE_ATOM ) ) ( ruleEOL | otherlv_32= ',' )+ )* ) )* otherlv_33= '}' )? ( ruleEOL )* ) ;
    public final EObject ruleGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_kind_3_0=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_responsibleFor_9_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_owner_14_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_other_20_0=null;
        Token otherlv_21=null;
        Token lv_string_22_0=null;
        Token lv_val_23_0=null;
        Token lv_val_real_25_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_agent_29_0=null;
        Token lv_role_30_0=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        EObject lv_group_6_0 = null;

        EObject lv_debug_18_0 = null;

        EObject lv_literal_24_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:3047:2: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_kind_3_0= RULE_ATOM ) ) (otherlv_4= '{' ( ruleEOL )* ( ( (lv_group_6_0= ruleGroup ) ) | (otherlv_7= 'responsible-for' otherlv_8= ':' ( ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL | otherlv_11= ',' )+ )+ ) | (otherlv_12= 'owner' otherlv_13= ':' ( (lv_owner_14_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_16= 'debug' (otherlv_17= ':' ( (lv_debug_18_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( ( (lv_other_20_0= RULE_ATOM ) ) otherlv_21= ':' ( ( (lv_string_22_0= RULE_STRING ) ) | ( (lv_val_23_0= RULE_INT_LITERAL ) ) | ( (lv_literal_24_0= ruleLiteral ) ) | ( (lv_val_real_25_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) | (otherlv_27= 'players' otherlv_28= ':' ( ( (lv_agent_29_0= RULE_ATOM ) ) ( (lv_role_30_0= RULE_ATOM ) ) ( ruleEOL | otherlv_32= ',' )+ )* ) )* otherlv_33= '}' )? ( ruleEOL )* ) )
            // InternalJcm.g:3048:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_kind_3_0= RULE_ATOM ) ) (otherlv_4= '{' ( ruleEOL )* ( ( (lv_group_6_0= ruleGroup ) ) | (otherlv_7= 'responsible-for' otherlv_8= ':' ( ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL | otherlv_11= ',' )+ )+ ) | (otherlv_12= 'owner' otherlv_13= ':' ( (lv_owner_14_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_16= 'debug' (otherlv_17= ':' ( (lv_debug_18_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( ( (lv_other_20_0= RULE_ATOM ) ) otherlv_21= ':' ( ( (lv_string_22_0= RULE_STRING ) ) | ( (lv_val_23_0= RULE_INT_LITERAL ) ) | ( (lv_literal_24_0= ruleLiteral ) ) | ( (lv_val_real_25_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) | (otherlv_27= 'players' otherlv_28= ':' ( ( (lv_agent_29_0= RULE_ATOM ) ) ( (lv_role_30_0= RULE_ATOM ) ) ( ruleEOL | otherlv_32= ',' )+ )* ) )* otherlv_33= '}' )? ( ruleEOL )* )
            {
            // InternalJcm.g:3048:2: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_kind_3_0= RULE_ATOM ) ) (otherlv_4= '{' ( ruleEOL )* ( ( (lv_group_6_0= ruleGroup ) ) | (otherlv_7= 'responsible-for' otherlv_8= ':' ( ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL | otherlv_11= ',' )+ )+ ) | (otherlv_12= 'owner' otherlv_13= ':' ( (lv_owner_14_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_16= 'debug' (otherlv_17= ':' ( (lv_debug_18_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( ( (lv_other_20_0= RULE_ATOM ) ) otherlv_21= ':' ( ( (lv_string_22_0= RULE_STRING ) ) | ( (lv_val_23_0= RULE_INT_LITERAL ) ) | ( (lv_literal_24_0= ruleLiteral ) ) | ( (lv_val_real_25_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) | (otherlv_27= 'players' otherlv_28= ':' ( ( (lv_agent_29_0= RULE_ATOM ) ) ( (lv_role_30_0= RULE_ATOM ) ) ( ruleEOL | otherlv_32= ',' )+ )* ) )* otherlv_33= '}' )? ( ruleEOL )* )
            // InternalJcm.g:3049:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_kind_3_0= RULE_ATOM ) ) (otherlv_4= '{' ( ruleEOL )* ( ( (lv_group_6_0= ruleGroup ) ) | (otherlv_7= 'responsible-for' otherlv_8= ':' ( ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL | otherlv_11= ',' )+ )+ ) | (otherlv_12= 'owner' otherlv_13= ':' ( (lv_owner_14_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_16= 'debug' (otherlv_17= ':' ( (lv_debug_18_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( ( (lv_other_20_0= RULE_ATOM ) ) otherlv_21= ':' ( ( (lv_string_22_0= RULE_STRING ) ) | ( (lv_val_23_0= RULE_INT_LITERAL ) ) | ( (lv_literal_24_0= ruleLiteral ) ) | ( (lv_val_real_25_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) | (otherlv_27= 'players' otherlv_28= ':' ( ( (lv_agent_29_0= RULE_ATOM ) ) ( (lv_role_30_0= RULE_ATOM ) ) ( ruleEOL | otherlv_32= ',' )+ )* ) )* otherlv_33= '}' )? ( ruleEOL )*
            {
            otherlv_0=(Token)match(input,68,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
            		
            // InternalJcm.g:3053:3: ( (lv_name_1_0= RULE_ATOM ) )
            // InternalJcm.g:3054:4: (lv_name_1_0= RULE_ATOM )
            {
            // InternalJcm.g:3054:4: (lv_name_1_0= RULE_ATOM )
            // InternalJcm.g:3055:5: lv_name_1_0= RULE_ATOM
            {
            lv_name_1_0=(Token)match(input,RULE_ATOM,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGroupAccess().getNameATOMTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jacamoide.xtext.jcm.Jcm.ATOM");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getColonKeyword_2());
            		
            // InternalJcm.g:3075:3: ( (lv_kind_3_0= RULE_ATOM ) )
            // InternalJcm.g:3076:4: (lv_kind_3_0= RULE_ATOM )
            {
            // InternalJcm.g:3076:4: (lv_kind_3_0= RULE_ATOM )
            // InternalJcm.g:3077:5: lv_kind_3_0= RULE_ATOM
            {
            lv_kind_3_0=(Token)match(input,RULE_ATOM,FOLLOW_27); 

            					newLeafNode(lv_kind_3_0, grammarAccess.getGroupAccess().getKindATOMTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"kind",
            						lv_kind_3_0,
            						"jacamoide.xtext.jcm.Jcm.ATOM");
            				

            }


            }

            // InternalJcm.g:3093:3: (otherlv_4= '{' ( ruleEOL )* ( ( (lv_group_6_0= ruleGroup ) ) | (otherlv_7= 'responsible-for' otherlv_8= ':' ( ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL | otherlv_11= ',' )+ )+ ) | (otherlv_12= 'owner' otherlv_13= ':' ( (lv_owner_14_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_16= 'debug' (otherlv_17= ':' ( (lv_debug_18_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( ( (lv_other_20_0= RULE_ATOM ) ) otherlv_21= ':' ( ( (lv_string_22_0= RULE_STRING ) ) | ( (lv_val_23_0= RULE_INT_LITERAL ) ) | ( (lv_literal_24_0= ruleLiteral ) ) | ( (lv_val_real_25_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) | (otherlv_27= 'players' otherlv_28= ':' ( ( (lv_agent_29_0= RULE_ATOM ) ) ( (lv_role_30_0= RULE_ATOM ) ) ( ruleEOL | otherlv_32= ',' )+ )* ) )* otherlv_33= '}' )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==24) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalJcm.g:3094:4: otherlv_4= '{' ( ruleEOL )* ( ( (lv_group_6_0= ruleGroup ) ) | (otherlv_7= 'responsible-for' otherlv_8= ':' ( ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL | otherlv_11= ',' )+ )+ ) | (otherlv_12= 'owner' otherlv_13= ':' ( (lv_owner_14_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_16= 'debug' (otherlv_17= ':' ( (lv_debug_18_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( ( (lv_other_20_0= RULE_ATOM ) ) otherlv_21= ':' ( ( (lv_string_22_0= RULE_STRING ) ) | ( (lv_val_23_0= RULE_INT_LITERAL ) ) | ( (lv_literal_24_0= ruleLiteral ) ) | ( (lv_val_real_25_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) | (otherlv_27= 'players' otherlv_28= ':' ( ( (lv_agent_29_0= RULE_ATOM ) ) ( (lv_role_30_0= RULE_ATOM ) ) ( ruleEOL | otherlv_32= ',' )+ )* ) )* otherlv_33= '}'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_62); 

                    				newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalJcm.g:3098:4: ( ruleEOL )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( ((LA98_0>=RULE_NEWLINE && LA98_0<=RULE_SL_COMMENT)) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // InternalJcm.g:3099:5: ruleEOL
                    	    {

                    	    					newCompositeNode(grammarAccess.getGroupAccess().getEOLParserRuleCall_4_1());
                    	    				
                    	    pushFollow(FOLLOW_62);
                    	    ruleEOL();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop98;
                        }
                    } while (true);

                    // InternalJcm.g:3107:4: ( ( (lv_group_6_0= ruleGroup ) ) | (otherlv_7= 'responsible-for' otherlv_8= ':' ( ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL | otherlv_11= ',' )+ )+ ) | (otherlv_12= 'owner' otherlv_13= ':' ( (lv_owner_14_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_16= 'debug' (otherlv_17= ':' ( (lv_debug_18_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( ( (lv_other_20_0= RULE_ATOM ) ) otherlv_21= ':' ( ( (lv_string_22_0= RULE_STRING ) ) | ( (lv_val_23_0= RULE_INT_LITERAL ) ) | ( (lv_literal_24_0= ruleLiteral ) ) | ( (lv_val_real_25_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) | (otherlv_27= 'players' otherlv_28= ':' ( ( (lv_agent_29_0= RULE_ATOM ) ) ( (lv_role_30_0= RULE_ATOM ) ) ( ruleEOL | otherlv_32= ',' )+ )* ) )*
                    loop108:
                    do {
                        int alt108=7;
                        switch ( input.LA(1) ) {
                        case 68:
                            {
                            alt108=1;
                            }
                            break;
                        case 69:
                            {
                            alt108=2;
                            }
                            break;
                        case 70:
                            {
                            alt108=3;
                            }
                            break;
                        case 49:
                            {
                            alt108=4;
                            }
                            break;
                        case RULE_ATOM:
                            {
                            alt108=5;
                            }
                            break;
                        case 71:
                            {
                            alt108=6;
                            }
                            break;

                        }

                        switch (alt108) {
                    	case 1 :
                    	    // InternalJcm.g:3108:5: ( (lv_group_6_0= ruleGroup ) )
                    	    {
                    	    // InternalJcm.g:3108:5: ( (lv_group_6_0= ruleGroup ) )
                    	    // InternalJcm.g:3109:6: (lv_group_6_0= ruleGroup )
                    	    {
                    	    // InternalJcm.g:3109:6: (lv_group_6_0= ruleGroup )
                    	    // InternalJcm.g:3110:7: lv_group_6_0= ruleGroup
                    	    {

                    	    							newCompositeNode(grammarAccess.getGroupAccess().getGroupGroupParserRuleCall_4_2_0_0());
                    	    						
                    	    pushFollow(FOLLOW_63);
                    	    lv_group_6_0=ruleGroup();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"group",
                    	    								lv_group_6_0,
                    	    								"jacamoide.xtext.jcm.Jcm.Group");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJcm.g:3128:5: (otherlv_7= 'responsible-for' otherlv_8= ':' ( ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL | otherlv_11= ',' )+ )+ )
                    	    {
                    	    // InternalJcm.g:3128:5: (otherlv_7= 'responsible-for' otherlv_8= ':' ( ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL | otherlv_11= ',' )+ )+ )
                    	    // InternalJcm.g:3129:6: otherlv_7= 'responsible-for' otherlv_8= ':' ( ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL | otherlv_11= ',' )+ )+
                    	    {
                    	    otherlv_7=(Token)match(input,69,FOLLOW_16); 

                    	    						newLeafNode(otherlv_7, grammarAccess.getGroupAccess().getResponsibleForKeyword_4_2_1_0());
                    	    					
                    	    otherlv_8=(Token)match(input,29,FOLLOW_4); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getColonKeyword_4_2_1_1());
                    	    					
                    	    // InternalJcm.g:3137:6: ( ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL | otherlv_11= ',' )+ )+
                    	    int cnt100=0;
                    	    loop100:
                    	    do {
                    	        int alt100=2;
                    	        int LA100_0 = input.LA(1);

                    	        if ( (LA100_0==RULE_ATOM) ) {
                    	            int LA100_2 = input.LA(2);

                    	            if ( ((LA100_2>=RULE_NEWLINE && LA100_2<=RULE_SL_COMMENT)||LA100_2==27) ) {
                    	                alt100=1;
                    	            }


                    	        }


                    	        switch (alt100) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:3138:7: ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL | otherlv_11= ',' )+
                    	    	    {
                    	    	    // InternalJcm.g:3138:7: ( (lv_responsibleFor_9_0= RULE_ATOM ) )
                    	    	    // InternalJcm.g:3139:8: (lv_responsibleFor_9_0= RULE_ATOM )
                    	    	    {
                    	    	    // InternalJcm.g:3139:8: (lv_responsibleFor_9_0= RULE_ATOM )
                    	    	    // InternalJcm.g:3140:9: lv_responsibleFor_9_0= RULE_ATOM
                    	    	    {
                    	    	    lv_responsibleFor_9_0=(Token)match(input,RULE_ATOM,FOLLOW_18); 

                    	    	    									newLeafNode(lv_responsibleFor_9_0, grammarAccess.getGroupAccess().getResponsibleForATOMTerminalRuleCall_4_2_1_2_0_0());
                    	    	    								

                    	    	    									if (current==null) {
                    	    	    										current = createModelElement(grammarAccess.getGroupRule());
                    	    	    									}
                    	    	    									addWithLastConsumed(
                    	    	    										current,
                    	    	    										"responsibleFor",
                    	    	    										lv_responsibleFor_9_0,
                    	    	    										"jacamoide.xtext.jcm.Jcm.ATOM");
                    	    	    								

                    	    	    }


                    	    	    }

                    	    	    // InternalJcm.g:3156:7: ( ruleEOL | otherlv_11= ',' )+
                    	    	    int cnt99=0;
                    	    	    loop99:
                    	    	    do {
                    	    	        int alt99=3;
                    	    	        int LA99_0 = input.LA(1);

                    	    	        if ( ((LA99_0>=RULE_NEWLINE && LA99_0<=RULE_SL_COMMENT)) ) {
                    	    	            alt99=1;
                    	    	        }
                    	    	        else if ( (LA99_0==27) ) {
                    	    	            alt99=2;
                    	    	        }


                    	    	        switch (alt99) {
                    	    	    	case 1 :
                    	    	    	    // InternalJcm.g:3157:8: ruleEOL
                    	    	    	    {

                    	    	    	    								newCompositeNode(grammarAccess.getGroupAccess().getEOLParserRuleCall_4_2_1_2_1_0());
                    	    	    	    							
                    	    	    	    pushFollow(FOLLOW_64);
                    	    	    	    ruleEOL();

                    	    	    	    state._fsp--;


                    	    	    	    								afterParserOrEnumRuleCall();
                    	    	    	    							

                    	    	    	    }
                    	    	    	    break;
                    	    	    	case 2 :
                    	    	    	    // InternalJcm.g:3165:8: otherlv_11= ','
                    	    	    	    {
                    	    	    	    otherlv_11=(Token)match(input,27,FOLLOW_64); 

                    	    	    	    								newLeafNode(otherlv_11, grammarAccess.getGroupAccess().getCommaKeyword_4_2_1_2_1_1());
                    	    	    	    							

                    	    	    	    }
                    	    	    	    break;

                    	    	    	default :
                    	    	    	    if ( cnt99 >= 1 ) break loop99;
                    	    	                EarlyExitException eee =
                    	    	                    new EarlyExitException(99, input);
                    	    	                throw eee;
                    	    	        }
                    	    	        cnt99++;
                    	    	    } while (true);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt100 >= 1 ) break loop100;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(100, input);
                    	                throw eee;
                    	        }
                    	        cnt100++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalJcm.g:3173:5: (otherlv_12= 'owner' otherlv_13= ':' ( (lv_owner_14_0= RULE_ATOM ) ) ( ruleEOL )+ )
                    	    {
                    	    // InternalJcm.g:3173:5: (otherlv_12= 'owner' otherlv_13= ':' ( (lv_owner_14_0= RULE_ATOM ) ) ( ruleEOL )+ )
                    	    // InternalJcm.g:3174:6: otherlv_12= 'owner' otherlv_13= ':' ( (lv_owner_14_0= RULE_ATOM ) ) ( ruleEOL )+
                    	    {
                    	    otherlv_12=(Token)match(input,70,FOLLOW_16); 

                    	    						newLeafNode(otherlv_12, grammarAccess.getGroupAccess().getOwnerKeyword_4_2_2_0());
                    	    					
                    	    otherlv_13=(Token)match(input,29,FOLLOW_4); 

                    	    						newLeafNode(otherlv_13, grammarAccess.getGroupAccess().getColonKeyword_4_2_2_1());
                    	    					
                    	    // InternalJcm.g:3182:6: ( (lv_owner_14_0= RULE_ATOM ) )
                    	    // InternalJcm.g:3183:7: (lv_owner_14_0= RULE_ATOM )
                    	    {
                    	    // InternalJcm.g:3183:7: (lv_owner_14_0= RULE_ATOM )
                    	    // InternalJcm.g:3184:8: lv_owner_14_0= RULE_ATOM
                    	    {
                    	    lv_owner_14_0=(Token)match(input,RULE_ATOM,FOLLOW_3); 

                    	    								newLeafNode(lv_owner_14_0, grammarAccess.getGroupAccess().getOwnerATOMTerminalRuleCall_4_2_2_2_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getGroupRule());
                    	    								}
                    	    								addWithLastConsumed(
                    	    									current,
                    	    									"owner",
                    	    									lv_owner_14_0,
                    	    									"jacamoide.xtext.jcm.Jcm.ATOM");
                    	    							

                    	    }


                    	    }

                    	    // InternalJcm.g:3200:6: ( ruleEOL )+
                    	    int cnt101=0;
                    	    loop101:
                    	    do {
                    	        int alt101=2;
                    	        int LA101_0 = input.LA(1);

                    	        if ( ((LA101_0>=RULE_NEWLINE && LA101_0<=RULE_SL_COMMENT)) ) {
                    	            alt101=1;
                    	        }


                    	        switch (alt101) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:3201:7: ruleEOL
                    	    	    {

                    	    	    							newCompositeNode(grammarAccess.getGroupAccess().getEOLParserRuleCall_4_2_2_3());
                    	    	    						
                    	    	    pushFollow(FOLLOW_62);
                    	    	    ruleEOL();

                    	    	    state._fsp--;


                    	    	    							afterParserOrEnumRuleCall();
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt101 >= 1 ) break loop101;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(101, input);
                    	                throw eee;
                    	        }
                    	        cnt101++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalJcm.g:3211:5: (otherlv_16= 'debug' (otherlv_17= ':' ( (lv_debug_18_0= ruleLiteral ) ) )? ( ruleEOL )+ )
                    	    {
                    	    // InternalJcm.g:3211:5: (otherlv_16= 'debug' (otherlv_17= ':' ( (lv_debug_18_0= ruleLiteral ) ) )? ( ruleEOL )+ )
                    	    // InternalJcm.g:3212:6: otherlv_16= 'debug' (otherlv_17= ':' ( (lv_debug_18_0= ruleLiteral ) ) )? ( ruleEOL )+
                    	    {
                    	    otherlv_16=(Token)match(input,49,FOLLOW_49); 

                    	    						newLeafNode(otherlv_16, grammarAccess.getGroupAccess().getDebugKeyword_4_2_3_0());
                    	    					
                    	    // InternalJcm.g:3216:6: (otherlv_17= ':' ( (lv_debug_18_0= ruleLiteral ) ) )?
                    	    int alt102=2;
                    	    int LA102_0 = input.LA(1);

                    	    if ( (LA102_0==29) ) {
                    	        alt102=1;
                    	    }
                    	    switch (alt102) {
                    	        case 1 :
                    	            // InternalJcm.g:3217:7: otherlv_17= ':' ( (lv_debug_18_0= ruleLiteral ) )
                    	            {
                    	            otherlv_17=(Token)match(input,29,FOLLOW_39); 

                    	            							newLeafNode(otherlv_17, grammarAccess.getGroupAccess().getColonKeyword_4_2_3_1_0());
                    	            						
                    	            // InternalJcm.g:3221:7: ( (lv_debug_18_0= ruleLiteral ) )
                    	            // InternalJcm.g:3222:8: (lv_debug_18_0= ruleLiteral )
                    	            {
                    	            // InternalJcm.g:3222:8: (lv_debug_18_0= ruleLiteral )
                    	            // InternalJcm.g:3223:9: lv_debug_18_0= ruleLiteral
                    	            {

                    	            									newCompositeNode(grammarAccess.getGroupAccess().getDebugLiteralParserRuleCall_4_2_3_1_1_0());
                    	            								
                    	            pushFollow(FOLLOW_3);
                    	            lv_debug_18_0=ruleLiteral();

                    	            state._fsp--;


                    	            									if (current==null) {
                    	            										current = createModelElementForParent(grammarAccess.getGroupRule());
                    	            									}
                    	            									add(
                    	            										current,
                    	            										"debug",
                    	            										lv_debug_18_0,
                    	            										"jacamoide.xtext.jcm.Jcm.Literal");
                    	            									afterParserOrEnumRuleCall();
                    	            								

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // InternalJcm.g:3241:6: ( ruleEOL )+
                    	    int cnt103=0;
                    	    loop103:
                    	    do {
                    	        int alt103=2;
                    	        int LA103_0 = input.LA(1);

                    	        if ( ((LA103_0>=RULE_NEWLINE && LA103_0<=RULE_SL_COMMENT)) ) {
                    	            alt103=1;
                    	        }


                    	        switch (alt103) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:3242:7: ruleEOL
                    	    	    {

                    	    	    							newCompositeNode(grammarAccess.getGroupAccess().getEOLParserRuleCall_4_2_3_2());
                    	    	    						
                    	    	    pushFollow(FOLLOW_62);
                    	    	    ruleEOL();

                    	    	    state._fsp--;


                    	    	    							afterParserOrEnumRuleCall();
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt103 >= 1 ) break loop103;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(103, input);
                    	                throw eee;
                    	        }
                    	        cnt103++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalJcm.g:3252:5: ( ( (lv_other_20_0= RULE_ATOM ) ) otherlv_21= ':' ( ( (lv_string_22_0= RULE_STRING ) ) | ( (lv_val_23_0= RULE_INT_LITERAL ) ) | ( (lv_literal_24_0= ruleLiteral ) ) | ( (lv_val_real_25_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ )
                    	    {
                    	    // InternalJcm.g:3252:5: ( ( (lv_other_20_0= RULE_ATOM ) ) otherlv_21= ':' ( ( (lv_string_22_0= RULE_STRING ) ) | ( (lv_val_23_0= RULE_INT_LITERAL ) ) | ( (lv_literal_24_0= ruleLiteral ) ) | ( (lv_val_real_25_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ )
                    	    // InternalJcm.g:3253:6: ( (lv_other_20_0= RULE_ATOM ) ) otherlv_21= ':' ( ( (lv_string_22_0= RULE_STRING ) ) | ( (lv_val_23_0= RULE_INT_LITERAL ) ) | ( (lv_literal_24_0= ruleLiteral ) ) | ( (lv_val_real_25_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+
                    	    {
                    	    // InternalJcm.g:3253:6: ( (lv_other_20_0= RULE_ATOM ) )
                    	    // InternalJcm.g:3254:7: (lv_other_20_0= RULE_ATOM )
                    	    {
                    	    // InternalJcm.g:3254:7: (lv_other_20_0= RULE_ATOM )
                    	    // InternalJcm.g:3255:8: lv_other_20_0= RULE_ATOM
                    	    {
                    	    lv_other_20_0=(Token)match(input,RULE_ATOM,FOLLOW_16); 

                    	    								newLeafNode(lv_other_20_0, grammarAccess.getGroupAccess().getOtherATOMTerminalRuleCall_4_2_4_0_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getGroupRule());
                    	    								}
                    	    								addWithLastConsumed(
                    	    									current,
                    	    									"other",
                    	    									lv_other_20_0,
                    	    									"jacamoide.xtext.jcm.Jcm.ATOM");
                    	    							

                    	    }


                    	    }

                    	    otherlv_21=(Token)match(input,29,FOLLOW_43); 

                    	    						newLeafNode(otherlv_21, grammarAccess.getGroupAccess().getColonKeyword_4_2_4_1());
                    	    					
                    	    // InternalJcm.g:3275:6: ( ( (lv_string_22_0= RULE_STRING ) ) | ( (lv_val_23_0= RULE_INT_LITERAL ) ) | ( (lv_literal_24_0= ruleLiteral ) ) | ( (lv_val_real_25_0= RULE_REAL_LITERAL ) ) )
                    	    int alt104=4;
                    	    switch ( input.LA(1) ) {
                    	    case RULE_STRING:
                    	        {
                    	        alt104=1;
                    	        }
                    	        break;
                    	    case RULE_INT_LITERAL:
                    	        {
                    	        alt104=2;
                    	        }
                    	        break;
                    	    case RULE_ATOM:
                    	    case RULE_VART:
                    	    case RULE_UNNAMEDVART:
                    	    case 81:
                    	    case 82:
                    	    case 83:
                    	    case 84:
                    	    case 85:
                    	        {
                    	        alt104=3;
                    	        }
                    	        break;
                    	    case RULE_REAL_LITERAL:
                    	        {
                    	        alt104=4;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 104, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt104) {
                    	        case 1 :
                    	            // InternalJcm.g:3276:7: ( (lv_string_22_0= RULE_STRING ) )
                    	            {
                    	            // InternalJcm.g:3276:7: ( (lv_string_22_0= RULE_STRING ) )
                    	            // InternalJcm.g:3277:8: (lv_string_22_0= RULE_STRING )
                    	            {
                    	            // InternalJcm.g:3277:8: (lv_string_22_0= RULE_STRING )
                    	            // InternalJcm.g:3278:9: lv_string_22_0= RULE_STRING
                    	            {
                    	            lv_string_22_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

                    	            									newLeafNode(lv_string_22_0, grammarAccess.getGroupAccess().getStringSTRINGTerminalRuleCall_4_2_4_2_0_0());
                    	            								

                    	            									if (current==null) {
                    	            										current = createModelElement(grammarAccess.getGroupRule());
                    	            									}
                    	            									addWithLastConsumed(
                    	            										current,
                    	            										"string",
                    	            										lv_string_22_0,
                    	            										"jacamoide.xtext.jcm.Jcm.STRING");
                    	            								

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalJcm.g:3295:7: ( (lv_val_23_0= RULE_INT_LITERAL ) )
                    	            {
                    	            // InternalJcm.g:3295:7: ( (lv_val_23_0= RULE_INT_LITERAL ) )
                    	            // InternalJcm.g:3296:8: (lv_val_23_0= RULE_INT_LITERAL )
                    	            {
                    	            // InternalJcm.g:3296:8: (lv_val_23_0= RULE_INT_LITERAL )
                    	            // InternalJcm.g:3297:9: lv_val_23_0= RULE_INT_LITERAL
                    	            {
                    	            lv_val_23_0=(Token)match(input,RULE_INT_LITERAL,FOLLOW_3); 

                    	            									newLeafNode(lv_val_23_0, grammarAccess.getGroupAccess().getValINT_LITERALTerminalRuleCall_4_2_4_2_1_0());
                    	            								

                    	            									if (current==null) {
                    	            										current = createModelElement(grammarAccess.getGroupRule());
                    	            									}
                    	            									addWithLastConsumed(
                    	            										current,
                    	            										"val",
                    	            										lv_val_23_0,
                    	            										"jacamoide.xtext.jcm.Jcm.INT_LITERAL");
                    	            								

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalJcm.g:3314:7: ( (lv_literal_24_0= ruleLiteral ) )
                    	            {
                    	            // InternalJcm.g:3314:7: ( (lv_literal_24_0= ruleLiteral ) )
                    	            // InternalJcm.g:3315:8: (lv_literal_24_0= ruleLiteral )
                    	            {
                    	            // InternalJcm.g:3315:8: (lv_literal_24_0= ruleLiteral )
                    	            // InternalJcm.g:3316:9: lv_literal_24_0= ruleLiteral
                    	            {

                    	            									newCompositeNode(grammarAccess.getGroupAccess().getLiteralLiteralParserRuleCall_4_2_4_2_2_0());
                    	            								
                    	            pushFollow(FOLLOW_3);
                    	            lv_literal_24_0=ruleLiteral();

                    	            state._fsp--;


                    	            									if (current==null) {
                    	            										current = createModelElementForParent(grammarAccess.getGroupRule());
                    	            									}
                    	            									add(
                    	            										current,
                    	            										"literal",
                    	            										lv_literal_24_0,
                    	            										"jacamoide.xtext.jcm.Jcm.Literal");
                    	            									afterParserOrEnumRuleCall();
                    	            								

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 4 :
                    	            // InternalJcm.g:3334:7: ( (lv_val_real_25_0= RULE_REAL_LITERAL ) )
                    	            {
                    	            // InternalJcm.g:3334:7: ( (lv_val_real_25_0= RULE_REAL_LITERAL ) )
                    	            // InternalJcm.g:3335:8: (lv_val_real_25_0= RULE_REAL_LITERAL )
                    	            {
                    	            // InternalJcm.g:3335:8: (lv_val_real_25_0= RULE_REAL_LITERAL )
                    	            // InternalJcm.g:3336:9: lv_val_real_25_0= RULE_REAL_LITERAL
                    	            {
                    	            lv_val_real_25_0=(Token)match(input,RULE_REAL_LITERAL,FOLLOW_3); 

                    	            									newLeafNode(lv_val_real_25_0, grammarAccess.getGroupAccess().getVal_realREAL_LITERALTerminalRuleCall_4_2_4_2_3_0());
                    	            								

                    	            									if (current==null) {
                    	            										current = createModelElement(grammarAccess.getGroupRule());
                    	            									}
                    	            									addWithLastConsumed(
                    	            										current,
                    	            										"val_real",
                    	            										lv_val_real_25_0,
                    	            										"jacamoide.xtext.jcm.Jcm.REAL_LITERAL");
                    	            								

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // InternalJcm.g:3353:6: ( ruleEOL )+
                    	    int cnt105=0;
                    	    loop105:
                    	    do {
                    	        int alt105=2;
                    	        int LA105_0 = input.LA(1);

                    	        if ( ((LA105_0>=RULE_NEWLINE && LA105_0<=RULE_SL_COMMENT)) ) {
                    	            alt105=1;
                    	        }


                    	        switch (alt105) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:3354:7: ruleEOL
                    	    	    {

                    	    	    							newCompositeNode(grammarAccess.getGroupAccess().getEOLParserRuleCall_4_2_4_3());
                    	    	    						
                    	    	    pushFollow(FOLLOW_62);
                    	    	    ruleEOL();

                    	    	    state._fsp--;


                    	    	    							afterParserOrEnumRuleCall();
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt105 >= 1 ) break loop105;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(105, input);
                    	                throw eee;
                    	        }
                    	        cnt105++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // InternalJcm.g:3364:5: (otherlv_27= 'players' otherlv_28= ':' ( ( (lv_agent_29_0= RULE_ATOM ) ) ( (lv_role_30_0= RULE_ATOM ) ) ( ruleEOL | otherlv_32= ',' )+ )* )
                    	    {
                    	    // InternalJcm.g:3364:5: (otherlv_27= 'players' otherlv_28= ':' ( ( (lv_agent_29_0= RULE_ATOM ) ) ( (lv_role_30_0= RULE_ATOM ) ) ( ruleEOL | otherlv_32= ',' )+ )* )
                    	    // InternalJcm.g:3365:6: otherlv_27= 'players' otherlv_28= ':' ( ( (lv_agent_29_0= RULE_ATOM ) ) ( (lv_role_30_0= RULE_ATOM ) ) ( ruleEOL | otherlv_32= ',' )+ )*
                    	    {
                    	    otherlv_27=(Token)match(input,71,FOLLOW_16); 

                    	    						newLeafNode(otherlv_27, grammarAccess.getGroupAccess().getPlayersKeyword_4_2_5_0());
                    	    					
                    	    otherlv_28=(Token)match(input,29,FOLLOW_63); 

                    	    						newLeafNode(otherlv_28, grammarAccess.getGroupAccess().getColonKeyword_4_2_5_1());
                    	    					
                    	    // InternalJcm.g:3373:6: ( ( (lv_agent_29_0= RULE_ATOM ) ) ( (lv_role_30_0= RULE_ATOM ) ) ( ruleEOL | otherlv_32= ',' )+ )*
                    	    loop107:
                    	    do {
                    	        int alt107=2;
                    	        int LA107_0 = input.LA(1);

                    	        if ( (LA107_0==RULE_ATOM) ) {
                    	            int LA107_2 = input.LA(2);

                    	            if ( (LA107_2==RULE_ATOM) ) {
                    	                alt107=1;
                    	            }


                    	        }


                    	        switch (alt107) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:3374:7: ( (lv_agent_29_0= RULE_ATOM ) ) ( (lv_role_30_0= RULE_ATOM ) ) ( ruleEOL | otherlv_32= ',' )+
                    	    	    {
                    	    	    // InternalJcm.g:3374:7: ( (lv_agent_29_0= RULE_ATOM ) )
                    	    	    // InternalJcm.g:3375:8: (lv_agent_29_0= RULE_ATOM )
                    	    	    {
                    	    	    // InternalJcm.g:3375:8: (lv_agent_29_0= RULE_ATOM )
                    	    	    // InternalJcm.g:3376:9: lv_agent_29_0= RULE_ATOM
                    	    	    {
                    	    	    lv_agent_29_0=(Token)match(input,RULE_ATOM,FOLLOW_4); 

                    	    	    									newLeafNode(lv_agent_29_0, grammarAccess.getGroupAccess().getAgentATOMTerminalRuleCall_4_2_5_2_0_0());
                    	    	    								

                    	    	    									if (current==null) {
                    	    	    										current = createModelElement(grammarAccess.getGroupRule());
                    	    	    									}
                    	    	    									addWithLastConsumed(
                    	    	    										current,
                    	    	    										"agent",
                    	    	    										lv_agent_29_0,
                    	    	    										"jacamoide.xtext.jcm.Jcm.ATOM");
                    	    	    								

                    	    	    }


                    	    	    }

                    	    	    // InternalJcm.g:3392:7: ( (lv_role_30_0= RULE_ATOM ) )
                    	    	    // InternalJcm.g:3393:8: (lv_role_30_0= RULE_ATOM )
                    	    	    {
                    	    	    // InternalJcm.g:3393:8: (lv_role_30_0= RULE_ATOM )
                    	    	    // InternalJcm.g:3394:9: lv_role_30_0= RULE_ATOM
                    	    	    {
                    	    	    lv_role_30_0=(Token)match(input,RULE_ATOM,FOLLOW_18); 

                    	    	    									newLeafNode(lv_role_30_0, grammarAccess.getGroupAccess().getRoleATOMTerminalRuleCall_4_2_5_2_1_0());
                    	    	    								

                    	    	    									if (current==null) {
                    	    	    										current = createModelElement(grammarAccess.getGroupRule());
                    	    	    									}
                    	    	    									addWithLastConsumed(
                    	    	    										current,
                    	    	    										"role",
                    	    	    										lv_role_30_0,
                    	    	    										"jacamoide.xtext.jcm.Jcm.ATOM");
                    	    	    								

                    	    	    }


                    	    	    }

                    	    	    // InternalJcm.g:3410:7: ( ruleEOL | otherlv_32= ',' )+
                    	    	    int cnt106=0;
                    	    	    loop106:
                    	    	    do {
                    	    	        int alt106=3;
                    	    	        int LA106_0 = input.LA(1);

                    	    	        if ( ((LA106_0>=RULE_NEWLINE && LA106_0<=RULE_SL_COMMENT)) ) {
                    	    	            alt106=1;
                    	    	        }
                    	    	        else if ( (LA106_0==27) ) {
                    	    	            alt106=2;
                    	    	        }


                    	    	        switch (alt106) {
                    	    	    	case 1 :
                    	    	    	    // InternalJcm.g:3411:8: ruleEOL
                    	    	    	    {

                    	    	    	    								newCompositeNode(grammarAccess.getGroupAccess().getEOLParserRuleCall_4_2_5_2_2_0());
                    	    	    	    							
                    	    	    	    pushFollow(FOLLOW_64);
                    	    	    	    ruleEOL();

                    	    	    	    state._fsp--;


                    	    	    	    								afterParserOrEnumRuleCall();
                    	    	    	    							

                    	    	    	    }
                    	    	    	    break;
                    	    	    	case 2 :
                    	    	    	    // InternalJcm.g:3419:8: otherlv_32= ','
                    	    	    	    {
                    	    	    	    otherlv_32=(Token)match(input,27,FOLLOW_64); 

                    	    	    	    								newLeafNode(otherlv_32, grammarAccess.getGroupAccess().getCommaKeyword_4_2_5_2_2_1());
                    	    	    	    							

                    	    	    	    }
                    	    	    	    break;

                    	    	    	default :
                    	    	    	    if ( cnt106 >= 1 ) break loop106;
                    	    	                EarlyExitException eee =
                    	    	                    new EarlyExitException(106, input);
                    	    	                throw eee;
                    	    	        }
                    	    	        cnt106++;
                    	    	    } while (true);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop107;
                    	        }
                    	    } while (true);


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop108;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_33, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalJcm.g:3432:3: ( ruleEOL )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( ((LA110_0>=RULE_NEWLINE && LA110_0<=RULE_SL_COMMENT)) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // InternalJcm.g:3433:4: ruleEOL
            	    {

            	    				newCompositeNode(grammarAccess.getGroupAccess().getEOLParserRuleCall_5());
            	    			
            	    pushFollow(FOLLOW_13);
            	    ruleEOL();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroup"


    // $ANTLR start "entryRuleScheme"
    // InternalJcm.g:3445:1: entryRuleScheme returns [EObject current=null] : iv_ruleScheme= ruleScheme EOF ;
    public final EObject entryRuleScheme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheme = null;


        try {
            // InternalJcm.g:3445:47: (iv_ruleScheme= ruleScheme EOF )
            // InternalJcm.g:3446:2: iv_ruleScheme= ruleScheme EOF
            {
             newCompositeNode(grammarAccess.getSchemeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScheme=ruleScheme();

            state._fsp--;

             current =iv_ruleScheme; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScheme"


    // $ANTLR start "ruleScheme"
    // InternalJcm.g:3452:1: ruleScheme returns [EObject current=null] : (otherlv_0= 'scheme' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_kind_3_0= RULE_ATOM ) ) (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'debug' (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | (otherlv_10= 'owner' otherlv_11= ':' ( (lv_owner_12_0= RULE_ATOM ) ) ( ruleEOL )+ ) | ( ( (lv_other_14_0= RULE_ATOM ) ) otherlv_15= ':' ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_21= '}' )? ( ruleEOL )* ) ;
    public final EObject ruleScheme() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_kind_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_owner_12_0=null;
        Token lv_other_14_0=null;
        Token otherlv_15=null;
        Token lv_string_16_0=null;
        Token lv_val_17_0=null;
        Token lv_val_real_19_0=null;
        Token otherlv_21=null;
        EObject lv_debug_8_0 = null;

        EObject lv_literal_18_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:3458:2: ( (otherlv_0= 'scheme' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_kind_3_0= RULE_ATOM ) ) (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'debug' (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | (otherlv_10= 'owner' otherlv_11= ':' ( (lv_owner_12_0= RULE_ATOM ) ) ( ruleEOL )+ ) | ( ( (lv_other_14_0= RULE_ATOM ) ) otherlv_15= ':' ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_21= '}' )? ( ruleEOL )* ) )
            // InternalJcm.g:3459:2: (otherlv_0= 'scheme' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_kind_3_0= RULE_ATOM ) ) (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'debug' (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | (otherlv_10= 'owner' otherlv_11= ':' ( (lv_owner_12_0= RULE_ATOM ) ) ( ruleEOL )+ ) | ( ( (lv_other_14_0= RULE_ATOM ) ) otherlv_15= ':' ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_21= '}' )? ( ruleEOL )* )
            {
            // InternalJcm.g:3459:2: (otherlv_0= 'scheme' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_kind_3_0= RULE_ATOM ) ) (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'debug' (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | (otherlv_10= 'owner' otherlv_11= ':' ( (lv_owner_12_0= RULE_ATOM ) ) ( ruleEOL )+ ) | ( ( (lv_other_14_0= RULE_ATOM ) ) otherlv_15= ':' ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_21= '}' )? ( ruleEOL )* )
            // InternalJcm.g:3460:3: otherlv_0= 'scheme' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_kind_3_0= RULE_ATOM ) ) (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'debug' (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | (otherlv_10= 'owner' otherlv_11= ':' ( (lv_owner_12_0= RULE_ATOM ) ) ( ruleEOL )+ ) | ( ( (lv_other_14_0= RULE_ATOM ) ) otherlv_15= ':' ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_21= '}' )? ( ruleEOL )*
            {
            otherlv_0=(Token)match(input,72,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSchemeAccess().getSchemeKeyword_0());
            		
            // InternalJcm.g:3464:3: ( (lv_name_1_0= RULE_ATOM ) )
            // InternalJcm.g:3465:4: (lv_name_1_0= RULE_ATOM )
            {
            // InternalJcm.g:3465:4: (lv_name_1_0= RULE_ATOM )
            // InternalJcm.g:3466:5: lv_name_1_0= RULE_ATOM
            {
            lv_name_1_0=(Token)match(input,RULE_ATOM,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSchemeAccess().getNameATOMTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSchemeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"jacamoide.xtext.jcm.Jcm.ATOM");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getSchemeAccess().getColonKeyword_2());
            		
            // InternalJcm.g:3486:3: ( (lv_kind_3_0= RULE_ATOM ) )
            // InternalJcm.g:3487:4: (lv_kind_3_0= RULE_ATOM )
            {
            // InternalJcm.g:3487:4: (lv_kind_3_0= RULE_ATOM )
            // InternalJcm.g:3488:5: lv_kind_3_0= RULE_ATOM
            {
            lv_kind_3_0=(Token)match(input,RULE_ATOM,FOLLOW_27); 

            					newLeafNode(lv_kind_3_0, grammarAccess.getSchemeAccess().getKindATOMTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSchemeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"kind",
            						lv_kind_3_0,
            						"jacamoide.xtext.jcm.Jcm.ATOM");
            				

            }


            }

            // InternalJcm.g:3504:3: (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'debug' (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | (otherlv_10= 'owner' otherlv_11= ':' ( (lv_owner_12_0= RULE_ATOM ) ) ( ruleEOL )+ ) | ( ( (lv_other_14_0= RULE_ATOM ) ) otherlv_15= ':' ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_21= '}' )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( (LA118_0==24) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // InternalJcm.g:3505:4: otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'debug' (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | (otherlv_10= 'owner' otherlv_11= ':' ( (lv_owner_12_0= RULE_ATOM ) ) ( ruleEOL )+ ) | ( ( (lv_other_14_0= RULE_ATOM ) ) otherlv_15= ':' ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_21= '}'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_65); 

                    				newLeafNode(otherlv_4, grammarAccess.getSchemeAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalJcm.g:3509:4: ( ruleEOL )*
                    loop111:
                    do {
                        int alt111=2;
                        int LA111_0 = input.LA(1);

                        if ( ((LA111_0>=RULE_NEWLINE && LA111_0<=RULE_SL_COMMENT)) ) {
                            alt111=1;
                        }


                        switch (alt111) {
                    	case 1 :
                    	    // InternalJcm.g:3510:5: ruleEOL
                    	    {

                    	    					newCompositeNode(grammarAccess.getSchemeAccess().getEOLParserRuleCall_4_1());
                    	    				
                    	    pushFollow(FOLLOW_65);
                    	    ruleEOL();

                    	    state._fsp--;


                    	    					afterParserOrEnumRuleCall();
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop111;
                        }
                    } while (true);

                    // InternalJcm.g:3518:4: ( (otherlv_6= 'debug' (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | (otherlv_10= 'owner' otherlv_11= ':' ( (lv_owner_12_0= RULE_ATOM ) ) ( ruleEOL )+ ) | ( ( (lv_other_14_0= RULE_ATOM ) ) otherlv_15= ':' ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )*
                    loop117:
                    do {
                        int alt117=4;
                        switch ( input.LA(1) ) {
                        case 49:
                            {
                            alt117=1;
                            }
                            break;
                        case 70:
                            {
                            alt117=2;
                            }
                            break;
                        case RULE_ATOM:
                            {
                            alt117=3;
                            }
                            break;

                        }

                        switch (alt117) {
                    	case 1 :
                    	    // InternalJcm.g:3519:5: (otherlv_6= 'debug' (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )? ( ruleEOL )+ )
                    	    {
                    	    // InternalJcm.g:3519:5: (otherlv_6= 'debug' (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )? ( ruleEOL )+ )
                    	    // InternalJcm.g:3520:6: otherlv_6= 'debug' (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )? ( ruleEOL )+
                    	    {
                    	    otherlv_6=(Token)match(input,49,FOLLOW_49); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getSchemeAccess().getDebugKeyword_4_2_0_0());
                    	    					
                    	    // InternalJcm.g:3524:6: (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )?
                    	    int alt112=2;
                    	    int LA112_0 = input.LA(1);

                    	    if ( (LA112_0==29) ) {
                    	        alt112=1;
                    	    }
                    	    switch (alt112) {
                    	        case 1 :
                    	            // InternalJcm.g:3525:7: otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) )
                    	            {
                    	            otherlv_7=(Token)match(input,29,FOLLOW_39); 

                    	            							newLeafNode(otherlv_7, grammarAccess.getSchemeAccess().getColonKeyword_4_2_0_1_0());
                    	            						
                    	            // InternalJcm.g:3529:7: ( (lv_debug_8_0= ruleLiteral ) )
                    	            // InternalJcm.g:3530:8: (lv_debug_8_0= ruleLiteral )
                    	            {
                    	            // InternalJcm.g:3530:8: (lv_debug_8_0= ruleLiteral )
                    	            // InternalJcm.g:3531:9: lv_debug_8_0= ruleLiteral
                    	            {

                    	            									newCompositeNode(grammarAccess.getSchemeAccess().getDebugLiteralParserRuleCall_4_2_0_1_1_0());
                    	            								
                    	            pushFollow(FOLLOW_3);
                    	            lv_debug_8_0=ruleLiteral();

                    	            state._fsp--;


                    	            									if (current==null) {
                    	            										current = createModelElementForParent(grammarAccess.getSchemeRule());
                    	            									}
                    	            									add(
                    	            										current,
                    	            										"debug",
                    	            										lv_debug_8_0,
                    	            										"jacamoide.xtext.jcm.Jcm.Literal");
                    	            									afterParserOrEnumRuleCall();
                    	            								

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // InternalJcm.g:3549:6: ( ruleEOL )+
                    	    int cnt113=0;
                    	    loop113:
                    	    do {
                    	        int alt113=2;
                    	        int LA113_0 = input.LA(1);

                    	        if ( ((LA113_0>=RULE_NEWLINE && LA113_0<=RULE_SL_COMMENT)) ) {
                    	            alt113=1;
                    	        }


                    	        switch (alt113) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:3550:7: ruleEOL
                    	    	    {

                    	    	    							newCompositeNode(grammarAccess.getSchemeAccess().getEOLParserRuleCall_4_2_0_2());
                    	    	    						
                    	    	    pushFollow(FOLLOW_65);
                    	    	    ruleEOL();

                    	    	    state._fsp--;


                    	    	    							afterParserOrEnumRuleCall();
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt113 >= 1 ) break loop113;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(113, input);
                    	                throw eee;
                    	        }
                    	        cnt113++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJcm.g:3560:5: (otherlv_10= 'owner' otherlv_11= ':' ( (lv_owner_12_0= RULE_ATOM ) ) ( ruleEOL )+ )
                    	    {
                    	    // InternalJcm.g:3560:5: (otherlv_10= 'owner' otherlv_11= ':' ( (lv_owner_12_0= RULE_ATOM ) ) ( ruleEOL )+ )
                    	    // InternalJcm.g:3561:6: otherlv_10= 'owner' otherlv_11= ':' ( (lv_owner_12_0= RULE_ATOM ) ) ( ruleEOL )+
                    	    {
                    	    otherlv_10=(Token)match(input,70,FOLLOW_16); 

                    	    						newLeafNode(otherlv_10, grammarAccess.getSchemeAccess().getOwnerKeyword_4_2_1_0());
                    	    					
                    	    otherlv_11=(Token)match(input,29,FOLLOW_4); 

                    	    						newLeafNode(otherlv_11, grammarAccess.getSchemeAccess().getColonKeyword_4_2_1_1());
                    	    					
                    	    // InternalJcm.g:3569:6: ( (lv_owner_12_0= RULE_ATOM ) )
                    	    // InternalJcm.g:3570:7: (lv_owner_12_0= RULE_ATOM )
                    	    {
                    	    // InternalJcm.g:3570:7: (lv_owner_12_0= RULE_ATOM )
                    	    // InternalJcm.g:3571:8: lv_owner_12_0= RULE_ATOM
                    	    {
                    	    lv_owner_12_0=(Token)match(input,RULE_ATOM,FOLLOW_3); 

                    	    								newLeafNode(lv_owner_12_0, grammarAccess.getSchemeAccess().getOwnerATOMTerminalRuleCall_4_2_1_2_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getSchemeRule());
                    	    								}
                    	    								addWithLastConsumed(
                    	    									current,
                    	    									"owner",
                    	    									lv_owner_12_0,
                    	    									"jacamoide.xtext.jcm.Jcm.ATOM");
                    	    							

                    	    }


                    	    }

                    	    // InternalJcm.g:3587:6: ( ruleEOL )+
                    	    int cnt114=0;
                    	    loop114:
                    	    do {
                    	        int alt114=2;
                    	        int LA114_0 = input.LA(1);

                    	        if ( ((LA114_0>=RULE_NEWLINE && LA114_0<=RULE_SL_COMMENT)) ) {
                    	            alt114=1;
                    	        }


                    	        switch (alt114) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:3588:7: ruleEOL
                    	    	    {

                    	    	    							newCompositeNode(grammarAccess.getSchemeAccess().getEOLParserRuleCall_4_2_1_3());
                    	    	    						
                    	    	    pushFollow(FOLLOW_65);
                    	    	    ruleEOL();

                    	    	    state._fsp--;


                    	    	    							afterParserOrEnumRuleCall();
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt114 >= 1 ) break loop114;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(114, input);
                    	                throw eee;
                    	        }
                    	        cnt114++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalJcm.g:3598:5: ( ( (lv_other_14_0= RULE_ATOM ) ) otherlv_15= ':' ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ )
                    	    {
                    	    // InternalJcm.g:3598:5: ( ( (lv_other_14_0= RULE_ATOM ) ) otherlv_15= ':' ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ )
                    	    // InternalJcm.g:3599:6: ( (lv_other_14_0= RULE_ATOM ) ) otherlv_15= ':' ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+
                    	    {
                    	    // InternalJcm.g:3599:6: ( (lv_other_14_0= RULE_ATOM ) )
                    	    // InternalJcm.g:3600:7: (lv_other_14_0= RULE_ATOM )
                    	    {
                    	    // InternalJcm.g:3600:7: (lv_other_14_0= RULE_ATOM )
                    	    // InternalJcm.g:3601:8: lv_other_14_0= RULE_ATOM
                    	    {
                    	    lv_other_14_0=(Token)match(input,RULE_ATOM,FOLLOW_16); 

                    	    								newLeafNode(lv_other_14_0, grammarAccess.getSchemeAccess().getOtherATOMTerminalRuleCall_4_2_2_0_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getSchemeRule());
                    	    								}
                    	    								addWithLastConsumed(
                    	    									current,
                    	    									"other",
                    	    									lv_other_14_0,
                    	    									"jacamoide.xtext.jcm.Jcm.ATOM");
                    	    							

                    	    }


                    	    }

                    	    otherlv_15=(Token)match(input,29,FOLLOW_43); 

                    	    						newLeafNode(otherlv_15, grammarAccess.getSchemeAccess().getColonKeyword_4_2_2_1());
                    	    					
                    	    // InternalJcm.g:3621:6: ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) )
                    	    int alt115=4;
                    	    switch ( input.LA(1) ) {
                    	    case RULE_STRING:
                    	        {
                    	        alt115=1;
                    	        }
                    	        break;
                    	    case RULE_INT_LITERAL:
                    	        {
                    	        alt115=2;
                    	        }
                    	        break;
                    	    case RULE_ATOM:
                    	    case RULE_VART:
                    	    case RULE_UNNAMEDVART:
                    	    case 81:
                    	    case 82:
                    	    case 83:
                    	    case 84:
                    	    case 85:
                    	        {
                    	        alt115=3;
                    	        }
                    	        break;
                    	    case RULE_REAL_LITERAL:
                    	        {
                    	        alt115=4;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 115, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt115) {
                    	        case 1 :
                    	            // InternalJcm.g:3622:7: ( (lv_string_16_0= RULE_STRING ) )
                    	            {
                    	            // InternalJcm.g:3622:7: ( (lv_string_16_0= RULE_STRING ) )
                    	            // InternalJcm.g:3623:8: (lv_string_16_0= RULE_STRING )
                    	            {
                    	            // InternalJcm.g:3623:8: (lv_string_16_0= RULE_STRING )
                    	            // InternalJcm.g:3624:9: lv_string_16_0= RULE_STRING
                    	            {
                    	            lv_string_16_0=(Token)match(input,RULE_STRING,FOLLOW_3); 

                    	            									newLeafNode(lv_string_16_0, grammarAccess.getSchemeAccess().getStringSTRINGTerminalRuleCall_4_2_2_2_0_0());
                    	            								

                    	            									if (current==null) {
                    	            										current = createModelElement(grammarAccess.getSchemeRule());
                    	            									}
                    	            									addWithLastConsumed(
                    	            										current,
                    	            										"string",
                    	            										lv_string_16_0,
                    	            										"jacamoide.xtext.jcm.Jcm.STRING");
                    	            								

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalJcm.g:3641:7: ( (lv_val_17_0= RULE_INT_LITERAL ) )
                    	            {
                    	            // InternalJcm.g:3641:7: ( (lv_val_17_0= RULE_INT_LITERAL ) )
                    	            // InternalJcm.g:3642:8: (lv_val_17_0= RULE_INT_LITERAL )
                    	            {
                    	            // InternalJcm.g:3642:8: (lv_val_17_0= RULE_INT_LITERAL )
                    	            // InternalJcm.g:3643:9: lv_val_17_0= RULE_INT_LITERAL
                    	            {
                    	            lv_val_17_0=(Token)match(input,RULE_INT_LITERAL,FOLLOW_3); 

                    	            									newLeafNode(lv_val_17_0, grammarAccess.getSchemeAccess().getValINT_LITERALTerminalRuleCall_4_2_2_2_1_0());
                    	            								

                    	            									if (current==null) {
                    	            										current = createModelElement(grammarAccess.getSchemeRule());
                    	            									}
                    	            									addWithLastConsumed(
                    	            										current,
                    	            										"val",
                    	            										lv_val_17_0,
                    	            										"jacamoide.xtext.jcm.Jcm.INT_LITERAL");
                    	            								

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 3 :
                    	            // InternalJcm.g:3660:7: ( (lv_literal_18_0= ruleLiteral ) )
                    	            {
                    	            // InternalJcm.g:3660:7: ( (lv_literal_18_0= ruleLiteral ) )
                    	            // InternalJcm.g:3661:8: (lv_literal_18_0= ruleLiteral )
                    	            {
                    	            // InternalJcm.g:3661:8: (lv_literal_18_0= ruleLiteral )
                    	            // InternalJcm.g:3662:9: lv_literal_18_0= ruleLiteral
                    	            {

                    	            									newCompositeNode(grammarAccess.getSchemeAccess().getLiteralLiteralParserRuleCall_4_2_2_2_2_0());
                    	            								
                    	            pushFollow(FOLLOW_3);
                    	            lv_literal_18_0=ruleLiteral();

                    	            state._fsp--;


                    	            									if (current==null) {
                    	            										current = createModelElementForParent(grammarAccess.getSchemeRule());
                    	            									}
                    	            									add(
                    	            										current,
                    	            										"literal",
                    	            										lv_literal_18_0,
                    	            										"jacamoide.xtext.jcm.Jcm.Literal");
                    	            									afterParserOrEnumRuleCall();
                    	            								

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 4 :
                    	            // InternalJcm.g:3680:7: ( (lv_val_real_19_0= RULE_REAL_LITERAL ) )
                    	            {
                    	            // InternalJcm.g:3680:7: ( (lv_val_real_19_0= RULE_REAL_LITERAL ) )
                    	            // InternalJcm.g:3681:8: (lv_val_real_19_0= RULE_REAL_LITERAL )
                    	            {
                    	            // InternalJcm.g:3681:8: (lv_val_real_19_0= RULE_REAL_LITERAL )
                    	            // InternalJcm.g:3682:9: lv_val_real_19_0= RULE_REAL_LITERAL
                    	            {
                    	            lv_val_real_19_0=(Token)match(input,RULE_REAL_LITERAL,FOLLOW_3); 

                    	            									newLeafNode(lv_val_real_19_0, grammarAccess.getSchemeAccess().getVal_realREAL_LITERALTerminalRuleCall_4_2_2_2_3_0());
                    	            								

                    	            									if (current==null) {
                    	            										current = createModelElement(grammarAccess.getSchemeRule());
                    	            									}
                    	            									addWithLastConsumed(
                    	            										current,
                    	            										"val_real",
                    	            										lv_val_real_19_0,
                    	            										"jacamoide.xtext.jcm.Jcm.REAL_LITERAL");
                    	            								

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // InternalJcm.g:3699:6: ( ruleEOL )+
                    	    int cnt116=0;
                    	    loop116:
                    	    do {
                    	        int alt116=2;
                    	        int LA116_0 = input.LA(1);

                    	        if ( ((LA116_0>=RULE_NEWLINE && LA116_0<=RULE_SL_COMMENT)) ) {
                    	            alt116=1;
                    	        }


                    	        switch (alt116) {
                    	    	case 1 :
                    	    	    // InternalJcm.g:3700:7: ruleEOL
                    	    	    {

                    	    	    							newCompositeNode(grammarAccess.getSchemeAccess().getEOLParserRuleCall_4_2_2_3());
                    	    	    						
                    	    	    pushFollow(FOLLOW_65);
                    	    	    ruleEOL();

                    	    	    state._fsp--;


                    	    	    							afterParserOrEnumRuleCall();
                    	    	    						

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt116 >= 1 ) break loop116;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(116, input);
                    	                throw eee;
                    	        }
                    	        cnt116++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop117;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,25,FOLLOW_13); 

                    				newLeafNode(otherlv_21, grammarAccess.getSchemeAccess().getRightCurlyBracketKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalJcm.g:3715:3: ( ruleEOL )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( ((LA119_0>=RULE_NEWLINE && LA119_0<=RULE_SL_COMMENT)) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // InternalJcm.g:3716:4: ruleEOL
            	    {

            	    				newCompositeNode(grammarAccess.getSchemeAccess().getEOLParserRuleCall_5());
            	    			
            	    pushFollow(FOLLOW_13);
            	    ruleEOL();

            	    state._fsp--;


            	    				afterParserOrEnumRuleCall();
            	    			

            	    }
            	    break;

            	default :
            	    break loop119;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScheme"


    // $ANTLR start "entryRuleHost"
    // InternalJcm.g:3728:1: entryRuleHost returns [EObject current=null] : iv_ruleHost= ruleHost EOF ;
    public final EObject entryRuleHost() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHost = null;


        try {
            // InternalJcm.g:3728:45: (iv_ruleHost= ruleHost EOF )
            // InternalJcm.g:3729:2: iv_ruleHost= ruleHost EOF
            {
             newCompositeNode(grammarAccess.getHostRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHost=ruleHost();

            state._fsp--;

             current =iv_ruleHost; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHost"


    // $ANTLR start "ruleHost"
    // InternalJcm.g:3735:1: ruleHost returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ATOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_ip_2_0= RULE_IP ) ) ) (otherlv_3= ':' ( (lv_val_4_0= RULE_INT_LITERAL ) ) )? ) ;
    public final EObject ruleHost() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_string_1_0=null;
        Token lv_ip_2_0=null;
        Token otherlv_3=null;
        Token lv_val_4_0=null;


        	enterRule();

        try {
            // InternalJcm.g:3741:2: ( ( ( ( (lv_name_0_0= RULE_ATOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_ip_2_0= RULE_IP ) ) ) (otherlv_3= ':' ( (lv_val_4_0= RULE_INT_LITERAL ) ) )? ) )
            // InternalJcm.g:3742:2: ( ( ( (lv_name_0_0= RULE_ATOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_ip_2_0= RULE_IP ) ) ) (otherlv_3= ':' ( (lv_val_4_0= RULE_INT_LITERAL ) ) )? )
            {
            // InternalJcm.g:3742:2: ( ( ( (lv_name_0_0= RULE_ATOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_ip_2_0= RULE_IP ) ) ) (otherlv_3= ':' ( (lv_val_4_0= RULE_INT_LITERAL ) ) )? )
            // InternalJcm.g:3743:3: ( ( (lv_name_0_0= RULE_ATOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_ip_2_0= RULE_IP ) ) ) (otherlv_3= ':' ( (lv_val_4_0= RULE_INT_LITERAL ) ) )?
            {
            // InternalJcm.g:3743:3: ( ( (lv_name_0_0= RULE_ATOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_ip_2_0= RULE_IP ) ) )
            int alt120=3;
            switch ( input.LA(1) ) {
            case RULE_ATOM:
                {
                alt120=1;
                }
                break;
            case RULE_STRING:
                {
                alt120=2;
                }
                break;
            case RULE_IP:
                {
                alt120=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // InternalJcm.g:3744:4: ( (lv_name_0_0= RULE_ATOM ) )
                    {
                    // InternalJcm.g:3744:4: ( (lv_name_0_0= RULE_ATOM ) )
                    // InternalJcm.g:3745:5: (lv_name_0_0= RULE_ATOM )
                    {
                    // InternalJcm.g:3745:5: (lv_name_0_0= RULE_ATOM )
                    // InternalJcm.g:3746:6: lv_name_0_0= RULE_ATOM
                    {
                    lv_name_0_0=(Token)match(input,RULE_ATOM,FOLLOW_66); 

                    						newLeafNode(lv_name_0_0, grammarAccess.getHostAccess().getNameATOMTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHostRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_0_0,
                    							"jacamoide.xtext.jcm.Jcm.ATOM");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJcm.g:3763:4: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // InternalJcm.g:3763:4: ( (lv_string_1_0= RULE_STRING ) )
                    // InternalJcm.g:3764:5: (lv_string_1_0= RULE_STRING )
                    {
                    // InternalJcm.g:3764:5: (lv_string_1_0= RULE_STRING )
                    // InternalJcm.g:3765:6: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_66); 

                    						newLeafNode(lv_string_1_0, grammarAccess.getHostAccess().getStringSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHostRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"string",
                    							lv_string_1_0,
                    							"jacamoide.xtext.jcm.Jcm.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalJcm.g:3782:4: ( (lv_ip_2_0= RULE_IP ) )
                    {
                    // InternalJcm.g:3782:4: ( (lv_ip_2_0= RULE_IP ) )
                    // InternalJcm.g:3783:5: (lv_ip_2_0= RULE_IP )
                    {
                    // InternalJcm.g:3783:5: (lv_ip_2_0= RULE_IP )
                    // InternalJcm.g:3784:6: lv_ip_2_0= RULE_IP
                    {
                    lv_ip_2_0=(Token)match(input,RULE_IP,FOLLOW_66); 

                    						newLeafNode(lv_ip_2_0, grammarAccess.getHostAccess().getIpIPTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHostRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ip",
                    							lv_ip_2_0,
                    							"jacamoide.xtext.jcm.Jcm.IP");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJcm.g:3801:3: (otherlv_3= ':' ( (lv_val_4_0= RULE_INT_LITERAL ) ) )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==29) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // InternalJcm.g:3802:4: otherlv_3= ':' ( (lv_val_4_0= RULE_INT_LITERAL ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_40); 

                    				newLeafNode(otherlv_3, grammarAccess.getHostAccess().getColonKeyword_1_0());
                    			
                    // InternalJcm.g:3806:4: ( (lv_val_4_0= RULE_INT_LITERAL ) )
                    // InternalJcm.g:3807:5: (lv_val_4_0= RULE_INT_LITERAL )
                    {
                    // InternalJcm.g:3807:5: (lv_val_4_0= RULE_INT_LITERAL )
                    // InternalJcm.g:3808:6: lv_val_4_0= RULE_INT_LITERAL
                    {
                    lv_val_4_0=(Token)match(input,RULE_INT_LITERAL,FOLLOW_2); 

                    						newLeafNode(lv_val_4_0, grammarAccess.getHostAccess().getValINT_LITERALTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getHostRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"val",
                    							lv_val_4_0,
                    							"jacamoide.xtext.jcm.Jcm.INT_LITERAL");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHost"


    // $ANTLR start "entryRuleFileName"
    // InternalJcm.g:3829:1: entryRuleFileName returns [EObject current=null] : iv_ruleFileName= ruleFileName EOF ;
    public final EObject entryRuleFileName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileName = null;


        try {
            // InternalJcm.g:3829:49: (iv_ruleFileName= ruleFileName EOF )
            // InternalJcm.g:3830:2: iv_ruleFileName= ruleFileName EOF
            {
             newCompositeNode(grammarAccess.getFileNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFileName=ruleFileName();

            state._fsp--;

             current =iv_ruleFileName; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFileName"


    // $ANTLR start "ruleFileName"
    // InternalJcm.g:3836:1: ruleFileName returns [EObject current=null] : ( () ( (otherlv_1= '/' | otherlv_2= '-' | otherlv_3= '.' | otherlv_4= '..' | ( (lv_name_5_0= RULE_ATOM ) ) )+ | ( (lv_string_6_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleFileName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_name_5_0=null;
        Token lv_string_6_0=null;


        	enterRule();

        try {
            // InternalJcm.g:3842:2: ( ( () ( (otherlv_1= '/' | otherlv_2= '-' | otherlv_3= '.' | otherlv_4= '..' | ( (lv_name_5_0= RULE_ATOM ) ) )+ | ( (lv_string_6_0= RULE_STRING ) ) ) ) )
            // InternalJcm.g:3843:2: ( () ( (otherlv_1= '/' | otherlv_2= '-' | otherlv_3= '.' | otherlv_4= '..' | ( (lv_name_5_0= RULE_ATOM ) ) )+ | ( (lv_string_6_0= RULE_STRING ) ) ) )
            {
            // InternalJcm.g:3843:2: ( () ( (otherlv_1= '/' | otherlv_2= '-' | otherlv_3= '.' | otherlv_4= '..' | ( (lv_name_5_0= RULE_ATOM ) ) )+ | ( (lv_string_6_0= RULE_STRING ) ) ) )
            // InternalJcm.g:3844:3: () ( (otherlv_1= '/' | otherlv_2= '-' | otherlv_3= '.' | otherlv_4= '..' | ( (lv_name_5_0= RULE_ATOM ) ) )+ | ( (lv_string_6_0= RULE_STRING ) ) )
            {
            // InternalJcm.g:3844:3: ()
            // InternalJcm.g:3845:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFileNameAccess().getFileNameAction_0(),
            					current);
            			

            }

            // InternalJcm.g:3851:3: ( (otherlv_1= '/' | otherlv_2= '-' | otherlv_3= '.' | otherlv_4= '..' | ( (lv_name_5_0= RULE_ATOM ) ) )+ | ( (lv_string_6_0= RULE_STRING ) ) )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==RULE_ATOM||(LA123_0>=73 && LA123_0<=76)) ) {
                alt123=1;
            }
            else if ( (LA123_0==RULE_STRING) ) {
                alt123=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // InternalJcm.g:3852:4: (otherlv_1= '/' | otherlv_2= '-' | otherlv_3= '.' | otherlv_4= '..' | ( (lv_name_5_0= RULE_ATOM ) ) )+
                    {
                    // InternalJcm.g:3852:4: (otherlv_1= '/' | otherlv_2= '-' | otherlv_3= '.' | otherlv_4= '..' | ( (lv_name_5_0= RULE_ATOM ) ) )+
                    int cnt122=0;
                    loop122:
                    do {
                        int alt122=6;
                        switch ( input.LA(1) ) {
                        case 73:
                            {
                            alt122=1;
                            }
                            break;
                        case 74:
                            {
                            alt122=2;
                            }
                            break;
                        case 75:
                            {
                            alt122=3;
                            }
                            break;
                        case 76:
                            {
                            alt122=4;
                            }
                            break;
                        case RULE_ATOM:
                            {
                            alt122=5;
                            }
                            break;

                        }

                        switch (alt122) {
                    	case 1 :
                    	    // InternalJcm.g:3853:5: otherlv_1= '/'
                    	    {
                    	    otherlv_1=(Token)match(input,73,FOLLOW_67); 

                    	    					newLeafNode(otherlv_1, grammarAccess.getFileNameAccess().getSolidusKeyword_1_0_0());
                    	    				

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalJcm.g:3858:5: otherlv_2= '-'
                    	    {
                    	    otherlv_2=(Token)match(input,74,FOLLOW_67); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getFileNameAccess().getHyphenMinusKeyword_1_0_1());
                    	    				

                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalJcm.g:3863:5: otherlv_3= '.'
                    	    {
                    	    otherlv_3=(Token)match(input,75,FOLLOW_67); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getFileNameAccess().getFullStopKeyword_1_0_2());
                    	    				

                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalJcm.g:3868:5: otherlv_4= '..'
                    	    {
                    	    otherlv_4=(Token)match(input,76,FOLLOW_67); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getFileNameAccess().getFullStopFullStopKeyword_1_0_3());
                    	    				

                    	    }
                    	    break;
                    	case 5 :
                    	    // InternalJcm.g:3873:5: ( (lv_name_5_0= RULE_ATOM ) )
                    	    {
                    	    // InternalJcm.g:3873:5: ( (lv_name_5_0= RULE_ATOM ) )
                    	    // InternalJcm.g:3874:6: (lv_name_5_0= RULE_ATOM )
                    	    {
                    	    // InternalJcm.g:3874:6: (lv_name_5_0= RULE_ATOM )
                    	    // InternalJcm.g:3875:7: lv_name_5_0= RULE_ATOM
                    	    {
                    	    lv_name_5_0=(Token)match(input,RULE_ATOM,FOLLOW_67); 

                    	    							newLeafNode(lv_name_5_0, grammarAccess.getFileNameAccess().getNameATOMTerminalRuleCall_1_0_4_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFileNameRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"name",
                    	    								lv_name_5_0,
                    	    								"jacamoide.xtext.jcm.Jcm.ATOM");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt122 >= 1 ) break loop122;
                                EarlyExitException eee =
                                    new EarlyExitException(122, input);
                                throw eee;
                        }
                        cnt122++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalJcm.g:3893:4: ( (lv_string_6_0= RULE_STRING ) )
                    {
                    // InternalJcm.g:3893:4: ( (lv_string_6_0= RULE_STRING ) )
                    // InternalJcm.g:3894:5: (lv_string_6_0= RULE_STRING )
                    {
                    // InternalJcm.g:3894:5: (lv_string_6_0= RULE_STRING )
                    // InternalJcm.g:3895:6: lv_string_6_0= RULE_STRING
                    {
                    lv_string_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_string_6_0, grammarAccess.getFileNameAccess().getStringSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFileNameRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"string",
                    							lv_string_6_0,
                    							"jacamoide.xtext.jcm.Jcm.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFileName"


    // $ANTLR start "entryRuleClassDef"
    // InternalJcm.g:3916:1: entryRuleClassDef returns [EObject current=null] : iv_ruleClassDef= ruleClassDef EOF ;
    public final EObject entryRuleClassDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDef = null;


        try {
            // InternalJcm.g:3916:49: (iv_ruleClassDef= ruleClassDef EOF )
            // InternalJcm.g:3917:2: iv_ruleClassDef= ruleClassDef EOF
            {
             newCompositeNode(grammarAccess.getClassDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassDef=ruleClassDef();

            state._fsp--;

             current =iv_ruleClassDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassDef"


    // $ANTLR start "ruleClassDef"
    // InternalJcm.g:3923:1: ruleClassDef returns [EObject current=null] : ( ( (lv_infrastructure_0_0= ruleFQN ) ) (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )* )? otherlv_5= ')' )? ) ;
    public final EObject ruleClassDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_infrastructure_0_0 = null;

        EObject lv_parameter_2_0 = null;

        EObject lv_parameter_4_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:3929:2: ( ( ( (lv_infrastructure_0_0= ruleFQN ) ) (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )* )? otherlv_5= ')' )? ) )
            // InternalJcm.g:3930:2: ( ( (lv_infrastructure_0_0= ruleFQN ) ) (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )* )? otherlv_5= ')' )? )
            {
            // InternalJcm.g:3930:2: ( ( (lv_infrastructure_0_0= ruleFQN ) ) (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )* )? otherlv_5= ')' )? )
            // InternalJcm.g:3931:3: ( (lv_infrastructure_0_0= ruleFQN ) ) (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )* )? otherlv_5= ')' )?
            {
            // InternalJcm.g:3931:3: ( (lv_infrastructure_0_0= ruleFQN ) )
            // InternalJcm.g:3932:4: (lv_infrastructure_0_0= ruleFQN )
            {
            // InternalJcm.g:3932:4: (lv_infrastructure_0_0= ruleFQN )
            // InternalJcm.g:3933:5: lv_infrastructure_0_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getClassDefAccess().getInfrastructureFQNParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_68);
            lv_infrastructure_0_0=ruleFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getClassDefRule());
            					}
            					set(
            						current,
            						"infrastructure",
            						lv_infrastructure_0_0,
            						"jacamoide.xtext.jcm.Jcm.FQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJcm.g:3950:3: (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )* )? otherlv_5= ')' )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==77) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // InternalJcm.g:3951:4: otherlv_1= '(' ( ( (lv_parameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,77,FOLLOW_69); 

                    				newLeafNode(otherlv_1, grammarAccess.getClassDefAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalJcm.g:3955:4: ( ( (lv_parameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )* )?
                    int alt125=2;
                    int LA125_0 = input.LA(1);

                    if ( ((LA125_0>=RULE_ATOM && LA125_0<=RULE_REAL_LITERAL)||LA125_0==RULE_VART||LA125_0==79) ) {
                        alt125=1;
                    }
                    switch (alt125) {
                        case 1 :
                            // InternalJcm.g:3956:5: ( (lv_parameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )*
                            {
                            // InternalJcm.g:3956:5: ( (lv_parameter_2_0= ruleParameter ) )
                            // InternalJcm.g:3957:6: (lv_parameter_2_0= ruleParameter )
                            {
                            // InternalJcm.g:3957:6: (lv_parameter_2_0= ruleParameter )
                            // InternalJcm.g:3958:7: lv_parameter_2_0= ruleParameter
                            {

                            							newCompositeNode(grammarAccess.getClassDefAccess().getParameterParameterParserRuleCall_1_1_0_0());
                            						
                            pushFollow(FOLLOW_70);
                            lv_parameter_2_0=ruleParameter();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getClassDefRule());
                            							}
                            							add(
                            								current,
                            								"parameter",
                            								lv_parameter_2_0,
                            								"jacamoide.xtext.jcm.Jcm.Parameter");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalJcm.g:3975:5: (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )*
                            loop124:
                            do {
                                int alt124=2;
                                int LA124_0 = input.LA(1);

                                if ( (LA124_0==27) ) {
                                    alt124=1;
                                }


                                switch (alt124) {
                            	case 1 :
                            	    // InternalJcm.g:3976:6: otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,27,FOLLOW_71); 

                            	    						newLeafNode(otherlv_3, grammarAccess.getClassDefAccess().getCommaKeyword_1_1_1_0());
                            	    					
                            	    // InternalJcm.g:3980:6: ( (lv_parameter_4_0= ruleParameter ) )
                            	    // InternalJcm.g:3981:7: (lv_parameter_4_0= ruleParameter )
                            	    {
                            	    // InternalJcm.g:3981:7: (lv_parameter_4_0= ruleParameter )
                            	    // InternalJcm.g:3982:8: lv_parameter_4_0= ruleParameter
                            	    {

                            	    								newCompositeNode(grammarAccess.getClassDefAccess().getParameterParameterParserRuleCall_1_1_1_1_0());
                            	    							
                            	    pushFollow(FOLLOW_70);
                            	    lv_parameter_4_0=ruleParameter();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getClassDefRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"parameter",
                            	    									lv_parameter_4_0,
                            	    									"jacamoide.xtext.jcm.Jcm.Parameter");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop124;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,78,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getClassDefAccess().getRightParenthesisKeyword_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassDef"


    // $ANTLR start "entryRuleParameter"
    // InternalJcm.g:4010:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalJcm.g:4010:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalJcm.g:4011:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalJcm.g:4017:1: ruleParameter returns [EObject current=null] : ( ( (lv_classDef_0_0= ruleClassDef ) ) | ( (lv_val_1_0= RULE_INT_LITERAL ) ) | ( (lv_val_real_2_0= RULE_REAL_LITERAL ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_listParameters_4_0= ruleListParameters ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_val_1_0=null;
        Token lv_val_real_2_0=null;
        Token lv_string_3_0=null;
        EObject lv_classDef_0_0 = null;

        EObject lv_listParameters_4_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:4023:2: ( ( ( (lv_classDef_0_0= ruleClassDef ) ) | ( (lv_val_1_0= RULE_INT_LITERAL ) ) | ( (lv_val_real_2_0= RULE_REAL_LITERAL ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_listParameters_4_0= ruleListParameters ) ) ) )
            // InternalJcm.g:4024:2: ( ( (lv_classDef_0_0= ruleClassDef ) ) | ( (lv_val_1_0= RULE_INT_LITERAL ) ) | ( (lv_val_real_2_0= RULE_REAL_LITERAL ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_listParameters_4_0= ruleListParameters ) ) )
            {
            // InternalJcm.g:4024:2: ( ( (lv_classDef_0_0= ruleClassDef ) ) | ( (lv_val_1_0= RULE_INT_LITERAL ) ) | ( (lv_val_real_2_0= RULE_REAL_LITERAL ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_listParameters_4_0= ruleListParameters ) ) )
            int alt127=5;
            switch ( input.LA(1) ) {
            case RULE_ATOM:
            case RULE_VART:
                {
                alt127=1;
                }
                break;
            case RULE_INT_LITERAL:
                {
                alt127=2;
                }
                break;
            case RULE_REAL_LITERAL:
                {
                alt127=3;
                }
                break;
            case RULE_STRING:
                {
                alt127=4;
                }
                break;
            case 79:
                {
                alt127=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }

            switch (alt127) {
                case 1 :
                    // InternalJcm.g:4025:3: ( (lv_classDef_0_0= ruleClassDef ) )
                    {
                    // InternalJcm.g:4025:3: ( (lv_classDef_0_0= ruleClassDef ) )
                    // InternalJcm.g:4026:4: (lv_classDef_0_0= ruleClassDef )
                    {
                    // InternalJcm.g:4026:4: (lv_classDef_0_0= ruleClassDef )
                    // InternalJcm.g:4027:5: lv_classDef_0_0= ruleClassDef
                    {

                    					newCompositeNode(grammarAccess.getParameterAccess().getClassDefClassDefParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_classDef_0_0=ruleClassDef();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameterRule());
                    					}
                    					set(
                    						current,
                    						"classDef",
                    						lv_classDef_0_0,
                    						"jacamoide.xtext.jcm.Jcm.ClassDef");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJcm.g:4045:3: ( (lv_val_1_0= RULE_INT_LITERAL ) )
                    {
                    // InternalJcm.g:4045:3: ( (lv_val_1_0= RULE_INT_LITERAL ) )
                    // InternalJcm.g:4046:4: (lv_val_1_0= RULE_INT_LITERAL )
                    {
                    // InternalJcm.g:4046:4: (lv_val_1_0= RULE_INT_LITERAL )
                    // InternalJcm.g:4047:5: lv_val_1_0= RULE_INT_LITERAL
                    {
                    lv_val_1_0=(Token)match(input,RULE_INT_LITERAL,FOLLOW_2); 

                    					newLeafNode(lv_val_1_0, grammarAccess.getParameterAccess().getValINT_LITERALTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"val",
                    						lv_val_1_0,
                    						"jacamoide.xtext.jcm.Jcm.INT_LITERAL");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalJcm.g:4064:3: ( (lv_val_real_2_0= RULE_REAL_LITERAL ) )
                    {
                    // InternalJcm.g:4064:3: ( (lv_val_real_2_0= RULE_REAL_LITERAL ) )
                    // InternalJcm.g:4065:4: (lv_val_real_2_0= RULE_REAL_LITERAL )
                    {
                    // InternalJcm.g:4065:4: (lv_val_real_2_0= RULE_REAL_LITERAL )
                    // InternalJcm.g:4066:5: lv_val_real_2_0= RULE_REAL_LITERAL
                    {
                    lv_val_real_2_0=(Token)match(input,RULE_REAL_LITERAL,FOLLOW_2); 

                    					newLeafNode(lv_val_real_2_0, grammarAccess.getParameterAccess().getVal_realREAL_LITERALTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"val_real",
                    						lv_val_real_2_0,
                    						"jacamoide.xtext.jcm.Jcm.REAL_LITERAL");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalJcm.g:4083:3: ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // InternalJcm.g:4083:3: ( (lv_string_3_0= RULE_STRING ) )
                    // InternalJcm.g:4084:4: (lv_string_3_0= RULE_STRING )
                    {
                    // InternalJcm.g:4084:4: (lv_string_3_0= RULE_STRING )
                    // InternalJcm.g:4085:5: lv_string_3_0= RULE_STRING
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_3_0, grammarAccess.getParameterAccess().getStringSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParameterRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_3_0,
                    						"jacamoide.xtext.jcm.Jcm.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalJcm.g:4102:3: ( (lv_listParameters_4_0= ruleListParameters ) )
                    {
                    // InternalJcm.g:4102:3: ( (lv_listParameters_4_0= ruleListParameters ) )
                    // InternalJcm.g:4103:4: (lv_listParameters_4_0= ruleListParameters )
                    {
                    // InternalJcm.g:4103:4: (lv_listParameters_4_0= ruleListParameters )
                    // InternalJcm.g:4104:5: lv_listParameters_4_0= ruleListParameters
                    {

                    					newCompositeNode(grammarAccess.getParameterAccess().getListParametersListParametersParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_listParameters_4_0=ruleListParameters();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParameterRule());
                    					}
                    					set(
                    						current,
                    						"listParameters",
                    						lv_listParameters_4_0,
                    						"jacamoide.xtext.jcm.Jcm.ListParameters");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleListParameters"
    // InternalJcm.g:4125:1: entryRuleListParameters returns [EObject current=null] : iv_ruleListParameters= ruleListParameters EOF ;
    public final EObject entryRuleListParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListParameters = null;


        try {
            // InternalJcm.g:4125:55: (iv_ruleListParameters= ruleListParameters EOF )
            // InternalJcm.g:4126:2: iv_ruleListParameters= ruleListParameters EOF
            {
             newCompositeNode(grammarAccess.getListParametersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListParameters=ruleListParameters();

            state._fsp--;

             current =iv_ruleListParameters; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleListParameters"


    // $ANTLR start "ruleListParameters"
    // InternalJcm.g:4132:1: ruleListParameters returns [EObject current=null] : (otherlv_0= '[' ( (lv_parameter_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameter_3_0= ruleParameter ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleListParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameter_1_0 = null;

        EObject lv_parameter_3_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:4138:2: ( (otherlv_0= '[' ( (lv_parameter_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameter_3_0= ruleParameter ) ) )* otherlv_4= ']' ) )
            // InternalJcm.g:4139:2: (otherlv_0= '[' ( (lv_parameter_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameter_3_0= ruleParameter ) ) )* otherlv_4= ']' )
            {
            // InternalJcm.g:4139:2: (otherlv_0= '[' ( (lv_parameter_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameter_3_0= ruleParameter ) ) )* otherlv_4= ']' )
            // InternalJcm.g:4140:3: otherlv_0= '[' ( (lv_parameter_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameter_3_0= ruleParameter ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,79,FOLLOW_71); 

            			newLeafNode(otherlv_0, grammarAccess.getListParametersAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalJcm.g:4144:3: ( (lv_parameter_1_0= ruleParameter ) )
            // InternalJcm.g:4145:4: (lv_parameter_1_0= ruleParameter )
            {
            // InternalJcm.g:4145:4: (lv_parameter_1_0= ruleParameter )
            // InternalJcm.g:4146:5: lv_parameter_1_0= ruleParameter
            {

            					newCompositeNode(grammarAccess.getListParametersAccess().getParameterParameterParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_72);
            lv_parameter_1_0=ruleParameter();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListParametersRule());
            					}
            					add(
            						current,
            						"parameter",
            						lv_parameter_1_0,
            						"jacamoide.xtext.jcm.Jcm.Parameter");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJcm.g:4163:3: (otherlv_2= ',' ( (lv_parameter_3_0= ruleParameter ) ) )*
            loop128:
            do {
                int alt128=2;
                int LA128_0 = input.LA(1);

                if ( (LA128_0==27) ) {
                    alt128=1;
                }


                switch (alt128) {
            	case 1 :
            	    // InternalJcm.g:4164:4: otherlv_2= ',' ( (lv_parameter_3_0= ruleParameter ) )
            	    {
            	    otherlv_2=(Token)match(input,27,FOLLOW_71); 

            	    				newLeafNode(otherlv_2, grammarAccess.getListParametersAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalJcm.g:4168:4: ( (lv_parameter_3_0= ruleParameter ) )
            	    // InternalJcm.g:4169:5: (lv_parameter_3_0= ruleParameter )
            	    {
            	    // InternalJcm.g:4169:5: (lv_parameter_3_0= ruleParameter )
            	    // InternalJcm.g:4170:6: lv_parameter_3_0= ruleParameter
            	    {

            	    						newCompositeNode(grammarAccess.getListParametersAccess().getParameterParameterParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_72);
            	    lv_parameter_3_0=ruleParameter();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getListParametersRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameter",
            	    							lv_parameter_3_0,
            	    							"jacamoide.xtext.jcm.Jcm.Parameter");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop128;
                }
            } while (true);

            otherlv_4=(Token)match(input,80,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getListParametersAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleListParameters"


    // $ANTLR start "entryRuleLiteral"
    // InternalJcm.g:4196:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalJcm.g:4196:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalJcm.g:4197:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalJcm.g:4203:1: ruleLiteral returns [EObject current=null] : ( () ( ( (otherlv_1= '~' )? ( ( (lv_pred_2_0= rulePred ) ) | ( (lv_var_3_0= ruleVar ) ) ) ) | otherlv_4= 'true' | otherlv_5= 'false' ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_pred_2_0 = null;

        EObject lv_var_3_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:4209:2: ( ( () ( ( (otherlv_1= '~' )? ( ( (lv_pred_2_0= rulePred ) ) | ( (lv_var_3_0= ruleVar ) ) ) ) | otherlv_4= 'true' | otherlv_5= 'false' ) ) )
            // InternalJcm.g:4210:2: ( () ( ( (otherlv_1= '~' )? ( ( (lv_pred_2_0= rulePred ) ) | ( (lv_var_3_0= ruleVar ) ) ) ) | otherlv_4= 'true' | otherlv_5= 'false' ) )
            {
            // InternalJcm.g:4210:2: ( () ( ( (otherlv_1= '~' )? ( ( (lv_pred_2_0= rulePred ) ) | ( (lv_var_3_0= ruleVar ) ) ) ) | otherlv_4= 'true' | otherlv_5= 'false' ) )
            // InternalJcm.g:4211:3: () ( ( (otherlv_1= '~' )? ( ( (lv_pred_2_0= rulePred ) ) | ( (lv_var_3_0= ruleVar ) ) ) ) | otherlv_4= 'true' | otherlv_5= 'false' )
            {
            // InternalJcm.g:4211:3: ()
            // InternalJcm.g:4212:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLiteralAccess().getLiteralAction_0(),
            					current);
            			

            }

            // InternalJcm.g:4218:3: ( ( (otherlv_1= '~' )? ( ( (lv_pred_2_0= rulePred ) ) | ( (lv_var_3_0= ruleVar ) ) ) ) | otherlv_4= 'true' | otherlv_5= 'false' )
            int alt131=3;
            switch ( input.LA(1) ) {
            case RULE_ATOM:
            case RULE_VART:
            case RULE_UNNAMEDVART:
            case 81:
            case 84:
            case 85:
                {
                alt131=1;
                }
                break;
            case 82:
                {
                alt131=2;
                }
                break;
            case 83:
                {
                alt131=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }

            switch (alt131) {
                case 1 :
                    // InternalJcm.g:4219:4: ( (otherlv_1= '~' )? ( ( (lv_pred_2_0= rulePred ) ) | ( (lv_var_3_0= ruleVar ) ) ) )
                    {
                    // InternalJcm.g:4219:4: ( (otherlv_1= '~' )? ( ( (lv_pred_2_0= rulePred ) ) | ( (lv_var_3_0= ruleVar ) ) ) )
                    // InternalJcm.g:4220:5: (otherlv_1= '~' )? ( ( (lv_pred_2_0= rulePred ) ) | ( (lv_var_3_0= ruleVar ) ) )
                    {
                    // InternalJcm.g:4220:5: (otherlv_1= '~' )?
                    int alt129=2;
                    int LA129_0 = input.LA(1);

                    if ( (LA129_0==81) ) {
                        alt129=1;
                    }
                    switch (alt129) {
                        case 1 :
                            // InternalJcm.g:4221:6: otherlv_1= '~'
                            {
                            otherlv_1=(Token)match(input,81,FOLLOW_73); 

                            						newLeafNode(otherlv_1, grammarAccess.getLiteralAccess().getTildeKeyword_1_0_0());
                            					

                            }
                            break;

                    }

                    // InternalJcm.g:4226:5: ( ( (lv_pred_2_0= rulePred ) ) | ( (lv_var_3_0= ruleVar ) ) )
                    int alt130=2;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==RULE_ATOM||(LA130_0>=84 && LA130_0<=85)) ) {
                        alt130=1;
                    }
                    else if ( ((LA130_0>=RULE_VART && LA130_0<=RULE_UNNAMEDVART)) ) {
                        alt130=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 130, 0, input);

                        throw nvae;
                    }
                    switch (alt130) {
                        case 1 :
                            // InternalJcm.g:4227:6: ( (lv_pred_2_0= rulePred ) )
                            {
                            // InternalJcm.g:4227:6: ( (lv_pred_2_0= rulePred ) )
                            // InternalJcm.g:4228:7: (lv_pred_2_0= rulePred )
                            {
                            // InternalJcm.g:4228:7: (lv_pred_2_0= rulePred )
                            // InternalJcm.g:4229:8: lv_pred_2_0= rulePred
                            {

                            								newCompositeNode(grammarAccess.getLiteralAccess().getPredPredParserRuleCall_1_0_1_0_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_pred_2_0=rulePred();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getLiteralRule());
                            								}
                            								set(
                            									current,
                            									"pred",
                            									lv_pred_2_0,
                            									"jacamoide.xtext.jcm.Jcm.Pred");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalJcm.g:4247:6: ( (lv_var_3_0= ruleVar ) )
                            {
                            // InternalJcm.g:4247:6: ( (lv_var_3_0= ruleVar ) )
                            // InternalJcm.g:4248:7: (lv_var_3_0= ruleVar )
                            {
                            // InternalJcm.g:4248:7: (lv_var_3_0= ruleVar )
                            // InternalJcm.g:4249:8: lv_var_3_0= ruleVar
                            {

                            								newCompositeNode(grammarAccess.getLiteralAccess().getVarVarParserRuleCall_1_0_1_1_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_var_3_0=ruleVar();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getLiteralRule());
                            								}
                            								set(
                            									current,
                            									"var",
                            									lv_var_3_0,
                            									"jacamoide.xtext.jcm.Jcm.Var");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJcm.g:4269:4: otherlv_4= 'true'
                    {
                    otherlv_4=(Token)match(input,82,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getLiteralAccess().getTrueKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalJcm.g:4274:4: otherlv_5= 'false'
                    {
                    otherlv_5=(Token)match(input,83,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getLiteralAccess().getFalseKeyword_1_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRulePred"
    // InternalJcm.g:4283:1: entryRulePred returns [EObject current=null] : iv_rulePred= rulePred EOF ;
    public final EObject entryRulePred() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePred = null;


        try {
            // InternalJcm.g:4283:45: (iv_rulePred= rulePred EOF )
            // InternalJcm.g:4284:2: iv_rulePred= rulePred EOF
            {
             newCompositeNode(grammarAccess.getPredRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePred=rulePred();

            state._fsp--;

             current =iv_rulePred; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePred"


    // $ANTLR start "rulePred"
    // InternalJcm.g:4290:1: rulePred returns [EObject current=null] : ( () ( ( (lv_atom_1_0= RULE_ATOM ) ) | otherlv_2= 'begin' | otherlv_3= 'end' ) (otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' )? ( (lv_list_7_0= ruleList ) )? ) ;
    public final EObject rulePred() throws RecognitionException {
        EObject current = null;

        Token lv_atom_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_terms_5_0 = null;

        EObject lv_list_7_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:4296:2: ( ( () ( ( (lv_atom_1_0= RULE_ATOM ) ) | otherlv_2= 'begin' | otherlv_3= 'end' ) (otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' )? ( (lv_list_7_0= ruleList ) )? ) )
            // InternalJcm.g:4297:2: ( () ( ( (lv_atom_1_0= RULE_ATOM ) ) | otherlv_2= 'begin' | otherlv_3= 'end' ) (otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' )? ( (lv_list_7_0= ruleList ) )? )
            {
            // InternalJcm.g:4297:2: ( () ( ( (lv_atom_1_0= RULE_ATOM ) ) | otherlv_2= 'begin' | otherlv_3= 'end' ) (otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' )? ( (lv_list_7_0= ruleList ) )? )
            // InternalJcm.g:4298:3: () ( ( (lv_atom_1_0= RULE_ATOM ) ) | otherlv_2= 'begin' | otherlv_3= 'end' ) (otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' )? ( (lv_list_7_0= ruleList ) )?
            {
            // InternalJcm.g:4298:3: ()
            // InternalJcm.g:4299:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPredAccess().getPredAction_0(),
            					current);
            			

            }

            // InternalJcm.g:4305:3: ( ( (lv_atom_1_0= RULE_ATOM ) ) | otherlv_2= 'begin' | otherlv_3= 'end' )
            int alt132=3;
            switch ( input.LA(1) ) {
            case RULE_ATOM:
                {
                alt132=1;
                }
                break;
            case 84:
                {
                alt132=2;
                }
                break;
            case 85:
                {
                alt132=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }

            switch (alt132) {
                case 1 :
                    // InternalJcm.g:4306:4: ( (lv_atom_1_0= RULE_ATOM ) )
                    {
                    // InternalJcm.g:4306:4: ( (lv_atom_1_0= RULE_ATOM ) )
                    // InternalJcm.g:4307:5: (lv_atom_1_0= RULE_ATOM )
                    {
                    // InternalJcm.g:4307:5: (lv_atom_1_0= RULE_ATOM )
                    // InternalJcm.g:4308:6: lv_atom_1_0= RULE_ATOM
                    {
                    lv_atom_1_0=(Token)match(input,RULE_ATOM,FOLLOW_74); 

                    						newLeafNode(lv_atom_1_0, grammarAccess.getPredAccess().getAtomATOMTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPredRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"atom",
                    							lv_atom_1_0,
                    							"jacamoide.xtext.jcm.Jcm.ATOM");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJcm.g:4325:4: otherlv_2= 'begin'
                    {
                    otherlv_2=(Token)match(input,84,FOLLOW_74); 

                    				newLeafNode(otherlv_2, grammarAccess.getPredAccess().getBeginKeyword_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalJcm.g:4330:4: otherlv_3= 'end'
                    {
                    otherlv_3=(Token)match(input,85,FOLLOW_74); 

                    				newLeafNode(otherlv_3, grammarAccess.getPredAccess().getEndKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalJcm.g:4335:3: (otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==77) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // InternalJcm.g:4336:4: otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,77,FOLLOW_75); 

                    				newLeafNode(otherlv_4, grammarAccess.getPredAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalJcm.g:4340:4: ( (lv_terms_5_0= ruleTerms ) )
                    // InternalJcm.g:4341:5: (lv_terms_5_0= ruleTerms )
                    {
                    // InternalJcm.g:4341:5: (lv_terms_5_0= ruleTerms )
                    // InternalJcm.g:4342:6: lv_terms_5_0= ruleTerms
                    {

                    						newCompositeNode(grammarAccess.getPredAccess().getTermsTermsParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_76);
                    lv_terms_5_0=ruleTerms();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPredRule());
                    						}
                    						set(
                    							current,
                    							"terms",
                    							lv_terms_5_0,
                    							"jacamoide.xtext.jcm.Jcm.Terms");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,78,FOLLOW_77); 

                    				newLeafNode(otherlv_6, grammarAccess.getPredAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalJcm.g:4364:3: ( (lv_list_7_0= ruleList ) )?
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==79) ) {
                alt134=1;
            }
            switch (alt134) {
                case 1 :
                    // InternalJcm.g:4365:4: (lv_list_7_0= ruleList )
                    {
                    // InternalJcm.g:4365:4: (lv_list_7_0= ruleList )
                    // InternalJcm.g:4366:5: lv_list_7_0= ruleList
                    {

                    					newCompositeNode(grammarAccess.getPredAccess().getListListParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_list_7_0=ruleList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPredRule());
                    					}
                    					set(
                    						current,
                    						"list",
                    						lv_list_7_0,
                    						"jacamoide.xtext.jcm.Jcm.List");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePred"


    // $ANTLR start "entryRuleTerms"
    // InternalJcm.g:4387:1: entryRuleTerms returns [EObject current=null] : iv_ruleTerms= ruleTerms EOF ;
    public final EObject entryRuleTerms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerms = null;


        try {
            // InternalJcm.g:4387:46: (iv_ruleTerms= ruleTerms EOF )
            // InternalJcm.g:4388:2: iv_ruleTerms= ruleTerms EOF
            {
             newCompositeNode(grammarAccess.getTermsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerms=ruleTerms();

            state._fsp--;

             current =iv_ruleTerms; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerms"


    // $ANTLR start "ruleTerms"
    // InternalJcm.g:4394:1: ruleTerms returns [EObject current=null] : ( ( (lv_term_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )* ) ;
    public final EObject ruleTerms() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_term_0_0 = null;

        EObject lv_term_2_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:4400:2: ( ( ( (lv_term_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )* ) )
            // InternalJcm.g:4401:2: ( ( (lv_term_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )* )
            {
            // InternalJcm.g:4401:2: ( ( (lv_term_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )* )
            // InternalJcm.g:4402:3: ( (lv_term_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )*
            {
            // InternalJcm.g:4402:3: ( (lv_term_0_0= ruleTerm ) )
            // InternalJcm.g:4403:4: (lv_term_0_0= ruleTerm )
            {
            // InternalJcm.g:4403:4: (lv_term_0_0= ruleTerm )
            // InternalJcm.g:4404:5: lv_term_0_0= ruleTerm
            {

            					newCompositeNode(grammarAccess.getTermsAccess().getTermTermParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_term_0_0=ruleTerm();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermsRule());
            					}
            					add(
            						current,
            						"term",
            						lv_term_0_0,
            						"jacamoide.xtext.jcm.Jcm.Term");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJcm.g:4421:3: (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )*
            loop135:
            do {
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==27) ) {
                    alt135=1;
                }


                switch (alt135) {
            	case 1 :
            	    // InternalJcm.g:4422:4: otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_75); 

            	    				newLeafNode(otherlv_1, grammarAccess.getTermsAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalJcm.g:4426:4: ( (lv_term_2_0= ruleTerm ) )
            	    // InternalJcm.g:4427:5: (lv_term_2_0= ruleTerm )
            	    {
            	    // InternalJcm.g:4427:5: (lv_term_2_0= ruleTerm )
            	    // InternalJcm.g:4428:6: lv_term_2_0= ruleTerm
            	    {

            	    						newCompositeNode(grammarAccess.getTermsAccess().getTermTermParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_term_2_0=ruleTerm();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"term",
            	    							lv_term_2_0,
            	    							"jacamoide.xtext.jcm.Jcm.Term");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop135;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerms"


    // $ANTLR start "entryRuleTerm"
    // InternalJcm.g:4450:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalJcm.g:4450:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalJcm.g:4451:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalJcm.g:4457:1: ruleTerm returns [EObject current=null] : ( ( (lv_list_0_0= ruleList ) ) | ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_val_3_0= RULE_INT_LITERAL ) ) | ( (lv_val_real_4_0= RULE_REAL_LITERAL ) ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_string_2_0=null;
        Token lv_val_3_0=null;
        Token lv_val_real_4_0=null;
        EObject lv_list_0_0 = null;

        EObject lv_literal_1_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:4463:2: ( ( ( (lv_list_0_0= ruleList ) ) | ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_val_3_0= RULE_INT_LITERAL ) ) | ( (lv_val_real_4_0= RULE_REAL_LITERAL ) ) ) )
            // InternalJcm.g:4464:2: ( ( (lv_list_0_0= ruleList ) ) | ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_val_3_0= RULE_INT_LITERAL ) ) | ( (lv_val_real_4_0= RULE_REAL_LITERAL ) ) )
            {
            // InternalJcm.g:4464:2: ( ( (lv_list_0_0= ruleList ) ) | ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_val_3_0= RULE_INT_LITERAL ) ) | ( (lv_val_real_4_0= RULE_REAL_LITERAL ) ) )
            int alt136=5;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt136=1;
                }
                break;
            case RULE_ATOM:
            case RULE_VART:
            case RULE_UNNAMEDVART:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
                {
                alt136=2;
                }
                break;
            case RULE_STRING:
                {
                alt136=3;
                }
                break;
            case RULE_INT_LITERAL:
                {
                alt136=4;
                }
                break;
            case RULE_REAL_LITERAL:
                {
                alt136=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 136, 0, input);

                throw nvae;
            }

            switch (alt136) {
                case 1 :
                    // InternalJcm.g:4465:3: ( (lv_list_0_0= ruleList ) )
                    {
                    // InternalJcm.g:4465:3: ( (lv_list_0_0= ruleList ) )
                    // InternalJcm.g:4466:4: (lv_list_0_0= ruleList )
                    {
                    // InternalJcm.g:4466:4: (lv_list_0_0= ruleList )
                    // InternalJcm.g:4467:5: lv_list_0_0= ruleList
                    {

                    					newCompositeNode(grammarAccess.getTermAccess().getListListParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_list_0_0=ruleList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTermRule());
                    					}
                    					set(
                    						current,
                    						"list",
                    						lv_list_0_0,
                    						"jacamoide.xtext.jcm.Jcm.List");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJcm.g:4485:3: ( (lv_literal_1_0= ruleLiteral ) )
                    {
                    // InternalJcm.g:4485:3: ( (lv_literal_1_0= ruleLiteral ) )
                    // InternalJcm.g:4486:4: (lv_literal_1_0= ruleLiteral )
                    {
                    // InternalJcm.g:4486:4: (lv_literal_1_0= ruleLiteral )
                    // InternalJcm.g:4487:5: lv_literal_1_0= ruleLiteral
                    {

                    					newCompositeNode(grammarAccess.getTermAccess().getLiteralLiteralParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_literal_1_0=ruleLiteral();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTermRule());
                    					}
                    					set(
                    						current,
                    						"literal",
                    						lv_literal_1_0,
                    						"jacamoide.xtext.jcm.Jcm.Literal");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalJcm.g:4505:3: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // InternalJcm.g:4505:3: ( (lv_string_2_0= RULE_STRING ) )
                    // InternalJcm.g:4506:4: (lv_string_2_0= RULE_STRING )
                    {
                    // InternalJcm.g:4506:4: (lv_string_2_0= RULE_STRING )
                    // InternalJcm.g:4507:5: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_string_2_0, grammarAccess.getTermAccess().getStringSTRINGTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTermRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"string",
                    						lv_string_2_0,
                    						"jacamoide.xtext.jcm.Jcm.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalJcm.g:4524:3: ( (lv_val_3_0= RULE_INT_LITERAL ) )
                    {
                    // InternalJcm.g:4524:3: ( (lv_val_3_0= RULE_INT_LITERAL ) )
                    // InternalJcm.g:4525:4: (lv_val_3_0= RULE_INT_LITERAL )
                    {
                    // InternalJcm.g:4525:4: (lv_val_3_0= RULE_INT_LITERAL )
                    // InternalJcm.g:4526:5: lv_val_3_0= RULE_INT_LITERAL
                    {
                    lv_val_3_0=(Token)match(input,RULE_INT_LITERAL,FOLLOW_2); 

                    					newLeafNode(lv_val_3_0, grammarAccess.getTermAccess().getValINT_LITERALTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTermRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"val",
                    						lv_val_3_0,
                    						"jacamoide.xtext.jcm.Jcm.INT_LITERAL");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalJcm.g:4543:3: ( (lv_val_real_4_0= RULE_REAL_LITERAL ) )
                    {
                    // InternalJcm.g:4543:3: ( (lv_val_real_4_0= RULE_REAL_LITERAL ) )
                    // InternalJcm.g:4544:4: (lv_val_real_4_0= RULE_REAL_LITERAL )
                    {
                    // InternalJcm.g:4544:4: (lv_val_real_4_0= RULE_REAL_LITERAL )
                    // InternalJcm.g:4545:5: lv_val_real_4_0= RULE_REAL_LITERAL
                    {
                    lv_val_real_4_0=(Token)match(input,RULE_REAL_LITERAL,FOLLOW_2); 

                    					newLeafNode(lv_val_real_4_0, grammarAccess.getTermAccess().getVal_realREAL_LITERALTerminalRuleCall_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTermRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"val_real",
                    						lv_val_real_4_0,
                    						"jacamoide.xtext.jcm.Jcm.REAL_LITERAL");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRuleList"
    // InternalJcm.g:4565:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // InternalJcm.g:4565:45: (iv_ruleList= ruleList EOF )
            // InternalJcm.g:4566:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // InternalJcm.g:4572:1: ruleList returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )? otherlv_9= ']' ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_var_6_0=null;
        Token lv_unnamedvar_7_0=null;
        Token otherlv_9=null;
        EObject lv_term_2_0 = null;

        EObject lv_term_4_0 = null;

        EObject lv_list_8_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:4578:2: ( ( () otherlv_1= '[' ( ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )? otherlv_9= ']' ) )
            // InternalJcm.g:4579:2: ( () otherlv_1= '[' ( ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )? otherlv_9= ']' )
            {
            // InternalJcm.g:4579:2: ( () otherlv_1= '[' ( ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )? otherlv_9= ']' )
            // InternalJcm.g:4580:3: () otherlv_1= '[' ( ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )? otherlv_9= ']'
            {
            // InternalJcm.g:4580:3: ()
            // InternalJcm.g:4581:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListAccess().getListAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,79,FOLLOW_78); 

            			newLeafNode(otherlv_1, grammarAccess.getListAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalJcm.g:4591:3: ( ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( ((LA140_0>=RULE_ATOM && LA140_0<=RULE_REAL_LITERAL)||(LA140_0>=RULE_VART && LA140_0<=RULE_UNNAMEDVART)||LA140_0==79||(LA140_0>=81 && LA140_0<=85)) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // InternalJcm.g:4592:4: ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )?
                    {
                    // InternalJcm.g:4592:4: ( (lv_term_2_0= ruleTerm ) )
                    // InternalJcm.g:4593:5: (lv_term_2_0= ruleTerm )
                    {
                    // InternalJcm.g:4593:5: (lv_term_2_0= ruleTerm )
                    // InternalJcm.g:4594:6: lv_term_2_0= ruleTerm
                    {

                    						newCompositeNode(grammarAccess.getListAccess().getTermTermParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_79);
                    lv_term_2_0=ruleTerm();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getListRule());
                    						}
                    						add(
                    							current,
                    							"term",
                    							lv_term_2_0,
                    							"jacamoide.xtext.jcm.Jcm.Term");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJcm.g:4611:4: (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )*
                    loop137:
                    do {
                        int alt137=2;
                        int LA137_0 = input.LA(1);

                        if ( (LA137_0==27) ) {
                            alt137=1;
                        }


                        switch (alt137) {
                    	case 1 :
                    	    // InternalJcm.g:4612:5: otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) )
                    	    {
                    	    otherlv_3=(Token)match(input,27,FOLLOW_75); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getListAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalJcm.g:4616:5: ( (lv_term_4_0= ruleTerm ) )
                    	    // InternalJcm.g:4617:6: (lv_term_4_0= ruleTerm )
                    	    {
                    	    // InternalJcm.g:4617:6: (lv_term_4_0= ruleTerm )
                    	    // InternalJcm.g:4618:7: lv_term_4_0= ruleTerm
                    	    {

                    	    							newCompositeNode(grammarAccess.getListAccess().getTermTermParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_79);
                    	    lv_term_4_0=ruleTerm();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getListRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"term",
                    	    								lv_term_4_0,
                    	    								"jacamoide.xtext.jcm.Jcm.Term");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop137;
                        }
                    } while (true);

                    // InternalJcm.g:4636:4: (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )?
                    int alt139=2;
                    int LA139_0 = input.LA(1);

                    if ( (LA139_0==86) ) {
                        alt139=1;
                    }
                    switch (alt139) {
                        case 1 :
                            // InternalJcm.g:4637:5: otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) )
                            {
                            otherlv_5=(Token)match(input,86,FOLLOW_80); 

                            					newLeafNode(otherlv_5, grammarAccess.getListAccess().getVerticalLineKeyword_2_2_0());
                            				
                            // InternalJcm.g:4641:5: ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) )
                            int alt138=3;
                            switch ( input.LA(1) ) {
                            case RULE_VART:
                                {
                                alt138=1;
                                }
                                break;
                            case RULE_UNNAMEDVART:
                                {
                                alt138=2;
                                }
                                break;
                            case 79:
                                {
                                alt138=3;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 138, 0, input);

                                throw nvae;
                            }

                            switch (alt138) {
                                case 1 :
                                    // InternalJcm.g:4642:6: ( (lv_var_6_0= RULE_VART ) )
                                    {
                                    // InternalJcm.g:4642:6: ( (lv_var_6_0= RULE_VART ) )
                                    // InternalJcm.g:4643:7: (lv_var_6_0= RULE_VART )
                                    {
                                    // InternalJcm.g:4643:7: (lv_var_6_0= RULE_VART )
                                    // InternalJcm.g:4644:8: lv_var_6_0= RULE_VART
                                    {
                                    lv_var_6_0=(Token)match(input,RULE_VART,FOLLOW_81); 

                                    								newLeafNode(lv_var_6_0, grammarAccess.getListAccess().getVarVARTTerminalRuleCall_2_2_1_0_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getListRule());
                                    								}
                                    								setWithLastConsumed(
                                    									current,
                                    									"var",
                                    									lv_var_6_0,
                                    									"jacamoide.xtext.jcm.Jcm.VART");
                                    							

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // InternalJcm.g:4661:6: ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) )
                                    {
                                    // InternalJcm.g:4661:6: ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) )
                                    // InternalJcm.g:4662:7: (lv_unnamedvar_7_0= RULE_UNNAMEDVART )
                                    {
                                    // InternalJcm.g:4662:7: (lv_unnamedvar_7_0= RULE_UNNAMEDVART )
                                    // InternalJcm.g:4663:8: lv_unnamedvar_7_0= RULE_UNNAMEDVART
                                    {
                                    lv_unnamedvar_7_0=(Token)match(input,RULE_UNNAMEDVART,FOLLOW_81); 

                                    								newLeafNode(lv_unnamedvar_7_0, grammarAccess.getListAccess().getUnnamedvarUNNAMEDVARTTerminalRuleCall_2_2_1_1_0());
                                    							

                                    								if (current==null) {
                                    									current = createModelElement(grammarAccess.getListRule());
                                    								}
                                    								setWithLastConsumed(
                                    									current,
                                    									"unnamedvar",
                                    									lv_unnamedvar_7_0,
                                    									"jacamoide.xtext.jcm.Jcm.UNNAMEDVART");
                                    							

                                    }


                                    }


                                    }
                                    break;
                                case 3 :
                                    // InternalJcm.g:4680:6: ( (lv_list_8_0= ruleList ) )
                                    {
                                    // InternalJcm.g:4680:6: ( (lv_list_8_0= ruleList ) )
                                    // InternalJcm.g:4681:7: (lv_list_8_0= ruleList )
                                    {
                                    // InternalJcm.g:4681:7: (lv_list_8_0= ruleList )
                                    // InternalJcm.g:4682:8: lv_list_8_0= ruleList
                                    {

                                    								newCompositeNode(grammarAccess.getListAccess().getListListParserRuleCall_2_2_1_2_0());
                                    							
                                    pushFollow(FOLLOW_81);
                                    lv_list_8_0=ruleList();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getListRule());
                                    								}
                                    								set(
                                    									current,
                                    									"list",
                                    									lv_list_8_0,
                                    									"jacamoide.xtext.jcm.Jcm.List");
                                    								afterParserOrEnumRuleCall();
                                    							

                                    }


                                    }


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,80,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getListAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleVar"
    // InternalJcm.g:4710:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // InternalJcm.g:4710:44: (iv_ruleVar= ruleVar EOF )
            // InternalJcm.g:4711:2: iv_ruleVar= ruleVar EOF
            {
             newCompositeNode(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVar"


    // $ANTLR start "ruleVar"
    // InternalJcm.g:4717:1: ruleVar returns [EObject current=null] : ( ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) ) ( (lv_list_2_0= ruleList ) )? ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token lv_unnamedvar_1_0=null;
        EObject lv_list_2_0 = null;



        	enterRule();

        try {
            // InternalJcm.g:4723:2: ( ( ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) ) ( (lv_list_2_0= ruleList ) )? ) )
            // InternalJcm.g:4724:2: ( ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) ) ( (lv_list_2_0= ruleList ) )? )
            {
            // InternalJcm.g:4724:2: ( ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) ) ( (lv_list_2_0= ruleList ) )? )
            // InternalJcm.g:4725:3: ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) ) ( (lv_list_2_0= ruleList ) )?
            {
            // InternalJcm.g:4725:3: ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) )
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==RULE_VART) ) {
                alt141=1;
            }
            else if ( (LA141_0==RULE_UNNAMEDVART) ) {
                alt141=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 141, 0, input);

                throw nvae;
            }
            switch (alt141) {
                case 1 :
                    // InternalJcm.g:4726:4: ( (lv_var_0_0= RULE_VART ) )
                    {
                    // InternalJcm.g:4726:4: ( (lv_var_0_0= RULE_VART ) )
                    // InternalJcm.g:4727:5: (lv_var_0_0= RULE_VART )
                    {
                    // InternalJcm.g:4727:5: (lv_var_0_0= RULE_VART )
                    // InternalJcm.g:4728:6: lv_var_0_0= RULE_VART
                    {
                    lv_var_0_0=(Token)match(input,RULE_VART,FOLLOW_77); 

                    						newLeafNode(lv_var_0_0, grammarAccess.getVarAccess().getVarVARTTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"var",
                    							lv_var_0_0,
                    							"jacamoide.xtext.jcm.Jcm.VART");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJcm.g:4745:4: ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) )
                    {
                    // InternalJcm.g:4745:4: ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) )
                    // InternalJcm.g:4746:5: (lv_unnamedvar_1_0= RULE_UNNAMEDVART )
                    {
                    // InternalJcm.g:4746:5: (lv_unnamedvar_1_0= RULE_UNNAMEDVART )
                    // InternalJcm.g:4747:6: lv_unnamedvar_1_0= RULE_UNNAMEDVART
                    {
                    lv_unnamedvar_1_0=(Token)match(input,RULE_UNNAMEDVART,FOLLOW_77); 

                    						newLeafNode(lv_unnamedvar_1_0, grammarAccess.getVarAccess().getUnnamedvarUNNAMEDVARTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"unnamedvar",
                    							lv_unnamedvar_1_0,
                    							"jacamoide.xtext.jcm.Jcm.UNNAMEDVART");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJcm.g:4764:3: ( (lv_list_2_0= ruleList ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==79) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // InternalJcm.g:4765:4: (lv_list_2_0= ruleList )
                    {
                    // InternalJcm.g:4765:4: (lv_list_2_0= ruleList )
                    // InternalJcm.g:4766:5: lv_list_2_0= ruleList
                    {

                    					newCompositeNode(grammarAccess.getVarAccess().getListListParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_list_2_0=ruleList();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVarRule());
                    					}
                    					set(
                    						current,
                    						"list",
                    						lv_list_2_0,
                    						"jacamoide.xtext.jcm.Jcm.List");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVar"


    // $ANTLR start "entryRuleEOL"
    // InternalJcm.g:4787:1: entryRuleEOL returns [String current=null] : iv_ruleEOL= ruleEOL EOF ;
    public final String entryRuleEOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEOL = null;


        try {
            // InternalJcm.g:4787:43: (iv_ruleEOL= ruleEOL EOF )
            // InternalJcm.g:4788:2: iv_ruleEOL= ruleEOL EOF
            {
             newCompositeNode(grammarAccess.getEOLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOL=ruleEOL();

            state._fsp--;

             current =iv_ruleEOL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEOL"


    // $ANTLR start "ruleEOL"
    // InternalJcm.g:4794:1: ruleEOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NEWLINE_0= RULE_NEWLINE | this_SL_COMMENT_1= RULE_SL_COMMENT ) ;
    public final AntlrDatatypeRuleToken ruleEOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NEWLINE_0=null;
        Token this_SL_COMMENT_1=null;


        	enterRule();

        try {
            // InternalJcm.g:4800:2: ( (this_NEWLINE_0= RULE_NEWLINE | this_SL_COMMENT_1= RULE_SL_COMMENT ) )
            // InternalJcm.g:4801:2: (this_NEWLINE_0= RULE_NEWLINE | this_SL_COMMENT_1= RULE_SL_COMMENT )
            {
            // InternalJcm.g:4801:2: (this_NEWLINE_0= RULE_NEWLINE | this_SL_COMMENT_1= RULE_SL_COMMENT )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==RULE_NEWLINE) ) {
                alt143=1;
            }
            else if ( (LA143_0==RULE_SL_COMMENT) ) {
                alt143=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }
            switch (alt143) {
                case 1 :
                    // InternalJcm.g:4802:3: this_NEWLINE_0= RULE_NEWLINE
                    {
                    this_NEWLINE_0=(Token)match(input,RULE_NEWLINE,FOLLOW_2); 

                    			current.merge(this_NEWLINE_0);
                    		

                    			newLeafNode(this_NEWLINE_0, grammarAccess.getEOLAccess().getNEWLINETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJcm.g:4810:3: this_SL_COMMENT_1= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_1=(Token)match(input,RULE_SL_COMMENT,FOLLOW_2); 

                    			current.merge(this_SL_COMMENT_1);
                    		

                    			newLeafNode(this_SL_COMMENT_1, grammarAccess.getEOLAccess().getSL_COMMENTTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEOL"


    // $ANTLR start "entryRuleFQN"
    // InternalJcm.g:4821:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalJcm.g:4821:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalJcm.g:4822:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalJcm.g:4828:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VART_0= RULE_VART | this_ATOM_1= RULE_ATOM ) (kw= '.' (this_VART_3= RULE_VART | this_ATOM_4= RULE_ATOM ) )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VART_0=null;
        Token this_ATOM_1=null;
        Token kw=null;
        Token this_VART_3=null;
        Token this_ATOM_4=null;


        	enterRule();

        try {
            // InternalJcm.g:4834:2: ( ( (this_VART_0= RULE_VART | this_ATOM_1= RULE_ATOM ) (kw= '.' (this_VART_3= RULE_VART | this_ATOM_4= RULE_ATOM ) )* ) )
            // InternalJcm.g:4835:2: ( (this_VART_0= RULE_VART | this_ATOM_1= RULE_ATOM ) (kw= '.' (this_VART_3= RULE_VART | this_ATOM_4= RULE_ATOM ) )* )
            {
            // InternalJcm.g:4835:2: ( (this_VART_0= RULE_VART | this_ATOM_1= RULE_ATOM ) (kw= '.' (this_VART_3= RULE_VART | this_ATOM_4= RULE_ATOM ) )* )
            // InternalJcm.g:4836:3: (this_VART_0= RULE_VART | this_ATOM_1= RULE_ATOM ) (kw= '.' (this_VART_3= RULE_VART | this_ATOM_4= RULE_ATOM ) )*
            {
            // InternalJcm.g:4836:3: (this_VART_0= RULE_VART | this_ATOM_1= RULE_ATOM )
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==RULE_VART) ) {
                alt144=1;
            }
            else if ( (LA144_0==RULE_ATOM) ) {
                alt144=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 144, 0, input);

                throw nvae;
            }
            switch (alt144) {
                case 1 :
                    // InternalJcm.g:4837:4: this_VART_0= RULE_VART
                    {
                    this_VART_0=(Token)match(input,RULE_VART,FOLLOW_82); 

                    				current.merge(this_VART_0);
                    			

                    				newLeafNode(this_VART_0, grammarAccess.getFQNAccess().getVARTTerminalRuleCall_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJcm.g:4845:4: this_ATOM_1= RULE_ATOM
                    {
                    this_ATOM_1=(Token)match(input,RULE_ATOM,FOLLOW_82); 

                    				current.merge(this_ATOM_1);
                    			

                    				newLeafNode(this_ATOM_1, grammarAccess.getFQNAccess().getATOMTerminalRuleCall_0_1());
                    			

                    }
                    break;

            }

            // InternalJcm.g:4853:3: (kw= '.' (this_VART_3= RULE_VART | this_ATOM_4= RULE_ATOM ) )*
            loop146:
            do {
                int alt146=2;
                int LA146_0 = input.LA(1);

                if ( (LA146_0==75) ) {
                    alt146=1;
                }


                switch (alt146) {
            	case 1 :
            	    // InternalJcm.g:4854:4: kw= '.' (this_VART_3= RULE_VART | this_ATOM_4= RULE_ATOM )
            	    {
            	    kw=(Token)match(input,75,FOLLOW_33); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    // InternalJcm.g:4859:4: (this_VART_3= RULE_VART | this_ATOM_4= RULE_ATOM )
            	    int alt145=2;
            	    int LA145_0 = input.LA(1);

            	    if ( (LA145_0==RULE_VART) ) {
            	        alt145=1;
            	    }
            	    else if ( (LA145_0==RULE_ATOM) ) {
            	        alt145=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 145, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt145) {
            	        case 1 :
            	            // InternalJcm.g:4860:5: this_VART_3= RULE_VART
            	            {
            	            this_VART_3=(Token)match(input,RULE_VART,FOLLOW_82); 

            	            					current.merge(this_VART_3);
            	            				

            	            					newLeafNode(this_VART_3, grammarAccess.getFQNAccess().getVARTTerminalRuleCall_1_1_0());
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalJcm.g:4868:5: this_ATOM_4= RULE_ATOM
            	            {
            	            this_ATOM_4=(Token)match(input,RULE_ATOM,FOLLOW_82); 

            	            					current.merge(this_ATOM_4);
            	            				

            	            					newLeafNode(this_ATOM_4, grammarAccess.getFQNAccess().getATOMTerminalRuleCall_1_1_1());
            	            				

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop146;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFQN"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000005801800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001801800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x08000027D2801800L,0x0000000000000005L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x08000027D2000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x08000007D2000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000007D2000000L,0x0000000000000005L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000007D2000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000007D2000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000801802L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000050L,0x0000000000001E00L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000052L,0x0000000000001E00L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008801800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008801852L,0x0000000000001E00L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000212L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008801A12L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001808801800L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001008801800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000150L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008801802L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000021801802L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000001801802L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x011EDFC402801810L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x011EDFC402000030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x011EDFC40A801810L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x011EDFC402000210L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x011EDFC40A801A10L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x011EDFC402000610L,0x00000000003E0000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x011EDFC40A801E10L,0x00000000003E0000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x011EDFC402000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000201008801800L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000610L,0x00000000003E0000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00E0000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0600000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000000000006F0L,0x00000000003E0000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x5002000402801800L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x5002000402000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x7002000402000010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x700200040A801810L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000020801800L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x8000000002801800L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x2000000002000010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x2000000000000010L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x200000000A801810L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0002000002801810L,0x0000000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x000200000A801810L,0x0000000000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x5002000402801810L,0x0000000000000118L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x5002000402000010L,0x0000000000000118L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x2000000000000012L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x2000000008801812L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0002000002801810L,0x00000000000000F0L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0002000002000010L,0x00000000000000F0L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x000200000A801810L,0x00000000000000F0L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0002000002801810L,0x0000000000000040L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000012L,0x0000000000001E00L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x00000000000002F0L,0x000000000000C000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000008000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x00000000000002F0L,0x0000000000008000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000008000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000610L,0x0000000000320000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000002L,0x000000000000A000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x00000000000006F0L,0x00000000003E8000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x00000000000006F0L,0x00000000003F8000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000008000000L,0x0000000000410000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000600L,0x0000000000008000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});

}