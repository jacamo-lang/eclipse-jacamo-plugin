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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ATOM", "RULE_INT_LITERAL", "RULE_STRING", "RULE_REAL_LITERAL", "RULE_IP", "RULE_VART", "RULE_UNNAMEDVART", "RULE_NEWLINE", "RULE_SL_COMMENT", "RULE_LCLETTER", "RULE_CHAR", "RULE_UCLETTER", "RULE_LETTER", "RULE_DIGIT", "RULE_INTEGERNUMBER", "RULE_HEXPREFIX", "RULE_HEXDIGIT", "RULE_WS", "RULE_ML_COMMENT", "'mas'", "'{'", "'}'", "'uses'", "','", "'class-path'", "':'", "'asl-path'", "'platform'", "'node'", "'running'", "'@'", "'agent'", "'instances'", "'ag-arch'", "'ag-class'", "'ag-bb-class'", "'beliefs'", "'goals'", "'focus'", "'join'", "'roles'", "'in'", "'debug'", "'verbose'", "'nrcbp'", "'events'", "'discard'", "'requeue'", "'retrieve'", "'intBels'", "'sameFocus'", "'newFocus'", "'workspace'", "'agents'", "'*'", "'artifact'", "'focused-by'", "'organisation'", "'group'", "'responsible-for'", "'owner'", "'players'", "'scheme'", "'/'", "'-'", "'.'", "'..'", "'('", "')'", "'['", "']'", "'~'", "'true'", "'false'", "'begin'", "'end'", "'|'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int RULE_HEXDIGIT=20;
    public static final int T__61=61;
    public static final int RULE_ATOM=4;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_REAL_LITERAL=7;
    public static final int T__59=59;
    public static final int RULE_INT_LITERAL=5;
    public static final int RULE_CHAR=14;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_VART=9;
    public static final int T__40=40;
    public static final int RULE_NEWLINE=11;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_HEXPREFIX=19;
    public static final int RULE_SL_COMMENT=12;
    public static final int RULE_LETTER=16;
    public static final int RULE_ML_COMMENT=22;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_LCLETTER=13;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_UCLETTER=15;
    public static final int RULE_INTEGERNUMBER=18;
    public static final int RULE_IP=8;
    public static final int RULE_UNNAMEDVART=10;
    public static final int RULE_WS=21;
    public static final int T__76=76;
    public static final int RULE_DIGIT=17;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalJcmParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJcmParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJcmParser.tokenNames; }
    public String getGrammarFileName() { return "../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g"; }



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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:67:1: entryRuleJcmModel returns [EObject current=null] : iv_ruleJcmModel= ruleJcmModel EOF ;
    public final EObject entryRuleJcmModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJcmModel = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:68:2: (iv_ruleJcmModel= ruleJcmModel EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:69:2: iv_ruleJcmModel= ruleJcmModel EOF
            {
             newCompositeNode(grammarAccess.getJcmModelRule()); 
            pushFollow(FOLLOW_ruleJcmModel_in_entryRuleJcmModel75);
            iv_ruleJcmModel=ruleJcmModel();

            state._fsp--;

             current =iv_ruleJcmModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJcmModel85); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:76:1: ruleJcmModel returns [EObject current=null] : ( ( ruleEOL )* otherlv_1= 'mas' ( (lv_name_2_0= RULE_ATOM ) ) ( (lv_uses_3_0= ruleDUses ) )? ( ruleEOL )* otherlv_5= '{' ( ruleEOL )* ( (lv_agent_7_0= ruleAgent ) )* ( (lv_workspace_8_0= ruleWorkspace ) )* ( (lv_organisation_9_0= ruleOrganisation ) )* ( ( (lv_dclassPath_10_0= ruleDClassPath ) ) | ( (lv_dAslPath_11_0= ruleDAslPath ) ) | ( (lv_dPlatform_12_0= ruleDPlatform ) ) | ( (lv_dNode_13_0= ruleDNode ) ) )* otherlv_14= '}' ( ruleEOL )* ) ;
    public final EObject ruleJcmModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_5=null;
        Token otherlv_14=null;
        EObject lv_uses_3_0 = null;

        EObject lv_agent_7_0 = null;

        EObject lv_workspace_8_0 = null;

        EObject lv_organisation_9_0 = null;

        EObject lv_dclassPath_10_0 = null;

        EObject lv_dAslPath_11_0 = null;

        EObject lv_dPlatform_12_0 = null;

        EObject lv_dNode_13_0 = null;


         enterRule(); 
            
        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:79:28: ( ( ( ruleEOL )* otherlv_1= 'mas' ( (lv_name_2_0= RULE_ATOM ) ) ( (lv_uses_3_0= ruleDUses ) )? ( ruleEOL )* otherlv_5= '{' ( ruleEOL )* ( (lv_agent_7_0= ruleAgent ) )* ( (lv_workspace_8_0= ruleWorkspace ) )* ( (lv_organisation_9_0= ruleOrganisation ) )* ( ( (lv_dclassPath_10_0= ruleDClassPath ) ) | ( (lv_dAslPath_11_0= ruleDAslPath ) ) | ( (lv_dPlatform_12_0= ruleDPlatform ) ) | ( (lv_dNode_13_0= ruleDNode ) ) )* otherlv_14= '}' ( ruleEOL )* ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:80:1: ( ( ruleEOL )* otherlv_1= 'mas' ( (lv_name_2_0= RULE_ATOM ) ) ( (lv_uses_3_0= ruleDUses ) )? ( ruleEOL )* otherlv_5= '{' ( ruleEOL )* ( (lv_agent_7_0= ruleAgent ) )* ( (lv_workspace_8_0= ruleWorkspace ) )* ( (lv_organisation_9_0= ruleOrganisation ) )* ( ( (lv_dclassPath_10_0= ruleDClassPath ) ) | ( (lv_dAslPath_11_0= ruleDAslPath ) ) | ( (lv_dPlatform_12_0= ruleDPlatform ) ) | ( (lv_dNode_13_0= ruleDNode ) ) )* otherlv_14= '}' ( ruleEOL )* )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:80:1: ( ( ruleEOL )* otherlv_1= 'mas' ( (lv_name_2_0= RULE_ATOM ) ) ( (lv_uses_3_0= ruleDUses ) )? ( ruleEOL )* otherlv_5= '{' ( ruleEOL )* ( (lv_agent_7_0= ruleAgent ) )* ( (lv_workspace_8_0= ruleWorkspace ) )* ( (lv_organisation_9_0= ruleOrganisation ) )* ( ( (lv_dclassPath_10_0= ruleDClassPath ) ) | ( (lv_dAslPath_11_0= ruleDAslPath ) ) | ( (lv_dPlatform_12_0= ruleDPlatform ) ) | ( (lv_dNode_13_0= ruleDNode ) ) )* otherlv_14= '}' ( ruleEOL )* )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:80:2: ( ruleEOL )* otherlv_1= 'mas' ( (lv_name_2_0= RULE_ATOM ) ) ( (lv_uses_3_0= ruleDUses ) )? ( ruleEOL )* otherlv_5= '{' ( ruleEOL )* ( (lv_agent_7_0= ruleAgent ) )* ( (lv_workspace_8_0= ruleWorkspace ) )* ( (lv_organisation_9_0= ruleOrganisation ) )* ( ( (lv_dclassPath_10_0= ruleDClassPath ) ) | ( (lv_dAslPath_11_0= ruleDAslPath ) ) | ( (lv_dPlatform_12_0= ruleDPlatform ) ) | ( (lv_dNode_13_0= ruleDNode ) ) )* otherlv_14= '}' ( ruleEOL )*
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:80:2: ( ruleEOL )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_NEWLINE && LA1_0<=RULE_SL_COMMENT)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:81:5: ruleEOL
            	    {
            	     
            	            newCompositeNode(grammarAccess.getJcmModelAccess().getEOLParserRuleCall_0()); 
            	        
            	    pushFollow(FOLLOW_ruleEOL_in_ruleJcmModel127);
            	    ruleEOL();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleJcmModel140); 

                	newLeafNode(otherlv_1, grammarAccess.getJcmModelAccess().getMasKeyword_1());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:92:1: ( (lv_name_2_0= RULE_ATOM ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:93:1: (lv_name_2_0= RULE_ATOM )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:93:1: (lv_name_2_0= RULE_ATOM )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:94:3: lv_name_2_0= RULE_ATOM
            {
            lv_name_2_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleJcmModel157); 

            			newLeafNode(lv_name_2_0, grammarAccess.getJcmModelAccess().getNameATOMTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getJcmModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ATOM");
            	    

            }


            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:110:2: ( (lv_uses_3_0= ruleDUses ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:111:1: (lv_uses_3_0= ruleDUses )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:111:1: (lv_uses_3_0= ruleDUses )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:112:3: lv_uses_3_0= ruleDUses
                    {
                     
                    	        newCompositeNode(grammarAccess.getJcmModelAccess().getUsesDUsesParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDUses_in_ruleJcmModel183);
                    lv_uses_3_0=ruleDUses();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJcmModelRule());
                    	        }
                           		set(
                           			current, 
                           			"uses",
                            		lv_uses_3_0, 
                            		"DUses");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:128:3: ( ruleEOL )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_NEWLINE && LA3_0<=RULE_SL_COMMENT)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:129:5: ruleEOL
            	    {
            	     
            	            newCompositeNode(grammarAccess.getJcmModelAccess().getEOLParserRuleCall_4()); 
            	        
            	    pushFollow(FOLLOW_ruleEOL_in_ruleJcmModel201);
            	    ruleEOL();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleJcmModel214); 

                	newLeafNode(otherlv_5, grammarAccess.getJcmModelAccess().getLeftCurlyBracketKeyword_5());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:140:1: ( ruleEOL )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_NEWLINE && LA4_0<=RULE_SL_COMMENT)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:141:5: ruleEOL
            	    {
            	     
            	            newCompositeNode(grammarAccess.getJcmModelAccess().getEOLParserRuleCall_6()); 
            	        
            	    pushFollow(FOLLOW_ruleEOL_in_ruleJcmModel231);
            	    ruleEOL();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:148:3: ( (lv_agent_7_0= ruleAgent ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==35) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:149:1: (lv_agent_7_0= ruleAgent )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:149:1: (lv_agent_7_0= ruleAgent )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:150:3: lv_agent_7_0= ruleAgent
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJcmModelAccess().getAgentAgentParserRuleCall_7_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAgent_in_ruleJcmModel253);
            	    lv_agent_7_0=ruleAgent();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJcmModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"agent",
            	            		lv_agent_7_0, 
            	            		"Agent");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:166:3: ( (lv_workspace_8_0= ruleWorkspace ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==56) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:167:1: (lv_workspace_8_0= ruleWorkspace )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:167:1: (lv_workspace_8_0= ruleWorkspace )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:168:3: lv_workspace_8_0= ruleWorkspace
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJcmModelAccess().getWorkspaceWorkspaceParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleWorkspace_in_ruleJcmModel275);
            	    lv_workspace_8_0=ruleWorkspace();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJcmModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"workspace",
            	            		lv_workspace_8_0, 
            	            		"Workspace");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:184:3: ( (lv_organisation_9_0= ruleOrganisation ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==61) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:185:1: (lv_organisation_9_0= ruleOrganisation )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:185:1: (lv_organisation_9_0= ruleOrganisation )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:186:3: lv_organisation_9_0= ruleOrganisation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJcmModelAccess().getOrganisationOrganisationParserRuleCall_9_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOrganisation_in_ruleJcmModel297);
            	    lv_organisation_9_0=ruleOrganisation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJcmModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"organisation",
            	            		lv_organisation_9_0, 
            	            		"Organisation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:202:3: ( ( (lv_dclassPath_10_0= ruleDClassPath ) ) | ( (lv_dAslPath_11_0= ruleDAslPath ) ) | ( (lv_dPlatform_12_0= ruleDPlatform ) ) | ( (lv_dNode_13_0= ruleDNode ) ) )*
            loop8:
            do {
                int alt8=5;
                switch ( input.LA(1) ) {
                case 28:
                    {
                    alt8=1;
                    }
                    break;
                case 30:
                    {
                    alt8=2;
                    }
                    break;
                case 31:
                    {
                    alt8=3;
                    }
                    break;
                case 32:
                    {
                    alt8=4;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:202:4: ( (lv_dclassPath_10_0= ruleDClassPath ) )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:202:4: ( (lv_dclassPath_10_0= ruleDClassPath ) )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:203:1: (lv_dclassPath_10_0= ruleDClassPath )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:203:1: (lv_dclassPath_10_0= ruleDClassPath )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:204:3: lv_dclassPath_10_0= ruleDClassPath
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJcmModelAccess().getDclassPathDClassPathParserRuleCall_10_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDClassPath_in_ruleJcmModel320);
            	    lv_dclassPath_10_0=ruleDClassPath();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJcmModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dclassPath",
            	            		lv_dclassPath_10_0, 
            	            		"DClassPath");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:221:6: ( (lv_dAslPath_11_0= ruleDAslPath ) )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:221:6: ( (lv_dAslPath_11_0= ruleDAslPath ) )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:222:1: (lv_dAslPath_11_0= ruleDAslPath )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:222:1: (lv_dAslPath_11_0= ruleDAslPath )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:223:3: lv_dAslPath_11_0= ruleDAslPath
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJcmModelAccess().getDAslPathDAslPathParserRuleCall_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDAslPath_in_ruleJcmModel347);
            	    lv_dAslPath_11_0=ruleDAslPath();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJcmModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dAslPath",
            	            		lv_dAslPath_11_0, 
            	            		"DAslPath");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:240:6: ( (lv_dPlatform_12_0= ruleDPlatform ) )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:240:6: ( (lv_dPlatform_12_0= ruleDPlatform ) )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:241:1: (lv_dPlatform_12_0= ruleDPlatform )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:241:1: (lv_dPlatform_12_0= ruleDPlatform )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:242:3: lv_dPlatform_12_0= ruleDPlatform
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJcmModelAccess().getDPlatformDPlatformParserRuleCall_10_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDPlatform_in_ruleJcmModel374);
            	    lv_dPlatform_12_0=ruleDPlatform();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJcmModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dPlatform",
            	            		lv_dPlatform_12_0, 
            	            		"DPlatform");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:259:6: ( (lv_dNode_13_0= ruleDNode ) )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:259:6: ( (lv_dNode_13_0= ruleDNode ) )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:260:1: (lv_dNode_13_0= ruleDNode )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:260:1: (lv_dNode_13_0= ruleDNode )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:261:3: lv_dNode_13_0= ruleDNode
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJcmModelAccess().getDNodeDNodeParserRuleCall_10_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDNode_in_ruleJcmModel401);
            	    lv_dNode_13_0=ruleDNode();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJcmModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dNode",
            	            		lv_dNode_13_0, 
            	            		"DNode");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_14=(Token)match(input,25,FOLLOW_25_in_ruleJcmModel415); 

                	newLeafNode(otherlv_14, grammarAccess.getJcmModelAccess().getRightCurlyBracketKeyword_11());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:281:1: ( ruleEOL )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_NEWLINE && LA9_0<=RULE_SL_COMMENT)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:282:5: ruleEOL
            	    {
            	     
            	            newCompositeNode(grammarAccess.getJcmModelAccess().getEOLParserRuleCall_12()); 
            	        
            	    pushFollow(FOLLOW_ruleEOL_in_ruleJcmModel432);
            	    ruleEOL();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:297:1: entryRuleDUses returns [EObject current=null] : iv_ruleDUses= ruleDUses EOF ;
    public final EObject entryRuleDUses() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDUses = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:298:2: (iv_ruleDUses= ruleDUses EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:299:2: iv_ruleDUses= ruleDUses EOF
            {
             newCompositeNode(grammarAccess.getDUsesRule()); 
            pushFollow(FOLLOW_ruleDUses_in_entryRuleDUses469);
            iv_ruleDUses=ruleDUses();

            state._fsp--;

             current =iv_ruleDUses; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDUses479); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:306:1: ruleDUses returns [EObject current=null] : (otherlv_0= 'uses' ( (lv_fileName_1_0= ruleFileName ) ) (otherlv_2= ',' ( (lv_fileName_3_0= ruleFileName ) ) )* ) ;
    public final EObject ruleDUses() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_fileName_1_0 = null;

        EObject lv_fileName_3_0 = null;


         enterRule(); 
            
        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:309:28: ( (otherlv_0= 'uses' ( (lv_fileName_1_0= ruleFileName ) ) (otherlv_2= ',' ( (lv_fileName_3_0= ruleFileName ) ) )* ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:310:1: (otherlv_0= 'uses' ( (lv_fileName_1_0= ruleFileName ) ) (otherlv_2= ',' ( (lv_fileName_3_0= ruleFileName ) ) )* )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:310:1: (otherlv_0= 'uses' ( (lv_fileName_1_0= ruleFileName ) ) (otherlv_2= ',' ( (lv_fileName_3_0= ruleFileName ) ) )* )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:310:3: otherlv_0= 'uses' ( (lv_fileName_1_0= ruleFileName ) ) (otherlv_2= ',' ( (lv_fileName_3_0= ruleFileName ) ) )*
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleDUses516); 

                	newLeafNode(otherlv_0, grammarAccess.getDUsesAccess().getUsesKeyword_0());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:314:1: ( (lv_fileName_1_0= ruleFileName ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:315:1: (lv_fileName_1_0= ruleFileName )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:315:1: (lv_fileName_1_0= ruleFileName )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:316:3: lv_fileName_1_0= ruleFileName
            {
             
            	        newCompositeNode(grammarAccess.getDUsesAccess().getFileNameFileNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFileName_in_ruleDUses537);
            lv_fileName_1_0=ruleFileName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDUsesRule());
            	        }
                   		add(
                   			current, 
                   			"fileName",
                    		lv_fileName_1_0, 
                    		"FileName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:332:2: (otherlv_2= ',' ( (lv_fileName_3_0= ruleFileName ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==27) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:332:4: otherlv_2= ',' ( (lv_fileName_3_0= ruleFileName ) )
            	    {
            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleDUses550); 

            	        	newLeafNode(otherlv_2, grammarAccess.getDUsesAccess().getCommaKeyword_2_0());
            	        
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:336:1: ( (lv_fileName_3_0= ruleFileName ) )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:337:1: (lv_fileName_3_0= ruleFileName )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:337:1: (lv_fileName_3_0= ruleFileName )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:338:3: lv_fileName_3_0= ruleFileName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDUsesAccess().getFileNameFileNameParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFileName_in_ruleDUses571);
            	    lv_fileName_3_0=ruleFileName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDUsesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"fileName",
            	            		lv_fileName_3_0, 
            	            		"FileName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


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
    // $ANTLR end "ruleDUses"


    // $ANTLR start "entryRuleDClassPath"
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:362:1: entryRuleDClassPath returns [EObject current=null] : iv_ruleDClassPath= ruleDClassPath EOF ;
    public final EObject entryRuleDClassPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDClassPath = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:363:2: (iv_ruleDClassPath= ruleDClassPath EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:364:2: iv_ruleDClassPath= ruleDClassPath EOF
            {
             newCompositeNode(grammarAccess.getDClassPathRule()); 
            pushFollow(FOLLOW_ruleDClassPath_in_entryRuleDClassPath609);
            iv_ruleDClassPath=ruleDClassPath();

            state._fsp--;

             current =iv_ruleDClassPath; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDClassPath619); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:371:1: ruleDClassPath returns [EObject current=null] : ( () otherlv_1= 'class-path' otherlv_2= ':' ( ( (lv_classPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* ) ;
    public final EObject ruleDClassPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_classPath_3_0 = null;


         enterRule(); 
            
        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:374:28: ( ( () otherlv_1= 'class-path' otherlv_2= ':' ( ( (lv_classPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:375:1: ( () otherlv_1= 'class-path' otherlv_2= ':' ( ( (lv_classPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:375:1: ( () otherlv_1= 'class-path' otherlv_2= ':' ( ( (lv_classPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:375:2: () otherlv_1= 'class-path' otherlv_2= ':' ( ( (lv_classPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )*
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:375:2: ()
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:376:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDClassPathAccess().getDClassPathAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleDClassPath665); 

                	newLeafNode(otherlv_1, grammarAccess.getDClassPathAccess().getClassPathKeyword_1());
                
            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleDClassPath677); 

                	newLeafNode(otherlv_2, grammarAccess.getDClassPathAccess().getColonKeyword_2());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:389:1: ( ( (lv_classPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ATOM||LA12_0==RULE_STRING||(LA12_0>=67 && LA12_0<=70)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:389:2: ( (lv_classPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:389:2: ( (lv_classPath_3_0= ruleFileName ) )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:390:1: (lv_classPath_3_0= ruleFileName )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:390:1: (lv_classPath_3_0= ruleFileName )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:391:3: lv_classPath_3_0= ruleFileName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDClassPathAccess().getClassPathFileNameParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFileName_in_ruleDClassPath699);
            	    lv_classPath_3_0=ruleFileName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDClassPathRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"classPath",
            	            		lv_classPath_3_0, 
            	            		"FileName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:407:2: ( ruleEOL | otherlv_5= ',' )+
            	    int cnt11=0;
            	    loop11:
            	    do {
            	        int alt11=3;
            	        int LA11_0 = input.LA(1);

            	        if ( ((LA11_0>=RULE_NEWLINE && LA11_0<=RULE_SL_COMMENT)) ) {
            	            alt11=1;
            	        }
            	        else if ( (LA11_0==27) ) {
            	            alt11=2;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:408:5: ruleEOL
            	    	    {
            	    	     
            	    	            newCompositeNode(grammarAccess.getDClassPathAccess().getEOLParserRuleCall_3_1_0()); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleEOL_in_ruleDClassPath716);
            	    	    ruleEOL();

            	    	    state._fsp--;

            	    	     
            	    	            afterParserOrEnumRuleCall();
            	    	        

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:416:7: otherlv_5= ','
            	    	    {
            	    	    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleDClassPath733); 

            	    	        	newLeafNode(otherlv_5, grammarAccess.getDClassPathAccess().getCommaKeyword_3_1_1());
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt11 >= 1 ) break loop11;
            	                EarlyExitException eee =
            	                    new EarlyExitException(11, input);
            	                throw eee;
            	        }
            	        cnt11++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:428:1: entryRuleDAslPath returns [EObject current=null] : iv_ruleDAslPath= ruleDAslPath EOF ;
    public final EObject entryRuleDAslPath() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDAslPath = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:429:2: (iv_ruleDAslPath= ruleDAslPath EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:430:2: iv_ruleDAslPath= ruleDAslPath EOF
            {
             newCompositeNode(grammarAccess.getDAslPathRule()); 
            pushFollow(FOLLOW_ruleDAslPath_in_entryRuleDAslPath773);
            iv_ruleDAslPath=ruleDAslPath();

            state._fsp--;

             current =iv_ruleDAslPath; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDAslPath783); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:437:1: ruleDAslPath returns [EObject current=null] : ( () otherlv_1= 'asl-path' otherlv_2= ':' ( ( (lv_aslPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* ) ;
    public final EObject ruleDAslPath() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_aslPath_3_0 = null;


         enterRule(); 
            
        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:440:28: ( ( () otherlv_1= 'asl-path' otherlv_2= ':' ( ( (lv_aslPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:441:1: ( () otherlv_1= 'asl-path' otherlv_2= ':' ( ( (lv_aslPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:441:1: ( () otherlv_1= 'asl-path' otherlv_2= ':' ( ( (lv_aslPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )* )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:441:2: () otherlv_1= 'asl-path' otherlv_2= ':' ( ( (lv_aslPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )*
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:441:2: ()
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:442:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDAslPathAccess().getDAslPathAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleDAslPath829); 

                	newLeafNode(otherlv_1, grammarAccess.getDAslPathAccess().getAslPathKeyword_1());
                
            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleDAslPath841); 

                	newLeafNode(otherlv_2, grammarAccess.getDAslPathAccess().getColonKeyword_2());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:455:1: ( ( (lv_aslPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+ )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ATOM||LA14_0==RULE_STRING||(LA14_0>=67 && LA14_0<=70)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:455:2: ( (lv_aslPath_3_0= ruleFileName ) ) ( ruleEOL | otherlv_5= ',' )+
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:455:2: ( (lv_aslPath_3_0= ruleFileName ) )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:456:1: (lv_aslPath_3_0= ruleFileName )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:456:1: (lv_aslPath_3_0= ruleFileName )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:457:3: lv_aslPath_3_0= ruleFileName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDAslPathAccess().getAslPathFileNameParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleFileName_in_ruleDAslPath863);
            	    lv_aslPath_3_0=ruleFileName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDAslPathRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"aslPath",
            	            		lv_aslPath_3_0, 
            	            		"FileName");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:473:2: ( ruleEOL | otherlv_5= ',' )+
            	    int cnt13=0;
            	    loop13:
            	    do {
            	        int alt13=3;
            	        int LA13_0 = input.LA(1);

            	        if ( ((LA13_0>=RULE_NEWLINE && LA13_0<=RULE_SL_COMMENT)) ) {
            	            alt13=1;
            	        }
            	        else if ( (LA13_0==27) ) {
            	            alt13=2;
            	        }


            	        switch (alt13) {
            	    	case 1 :
            	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:474:5: ruleEOL
            	    	    {
            	    	     
            	    	            newCompositeNode(grammarAccess.getDAslPathAccess().getEOLParserRuleCall_3_1_0()); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleEOL_in_ruleDAslPath880);
            	    	    ruleEOL();

            	    	    state._fsp--;

            	    	     
            	    	            afterParserOrEnumRuleCall();
            	    	        

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:482:7: otherlv_5= ','
            	    	    {
            	    	    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleDAslPath897); 

            	    	        	newLeafNode(otherlv_5, grammarAccess.getDAslPathAccess().getCommaKeyword_3_1_1());
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt13 >= 1 ) break loop13;
            	                EarlyExitException eee =
            	                    new EarlyExitException(13, input);
            	                throw eee;
            	        }
            	        cnt13++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop14;
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


    // $ANTLR start "entryRuleDPlatform"
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:494:1: entryRuleDPlatform returns [EObject current=null] : iv_ruleDPlatform= ruleDPlatform EOF ;
    public final EObject entryRuleDPlatform() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDPlatform = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:495:2: (iv_ruleDPlatform= ruleDPlatform EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:496:2: iv_ruleDPlatform= ruleDPlatform EOF
            {
             newCompositeNode(grammarAccess.getDPlatformRule()); 
            pushFollow(FOLLOW_ruleDPlatform_in_entryRuleDPlatform937);
            iv_ruleDPlatform=ruleDPlatform();

            state._fsp--;

             current =iv_ruleDPlatform; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDPlatform947); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:503:1: ruleDPlatform returns [EObject current=null] : ( () otherlv_1= 'platform' otherlv_2= ':' ( ( (lv_platform_3_0= ruleClassDef ) ) ( ruleEOL | otherlv_5= ',' )+ )* ) ;
    public final EObject ruleDPlatform() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_platform_3_0 = null;


         enterRule(); 
            
        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:506:28: ( ( () otherlv_1= 'platform' otherlv_2= ':' ( ( (lv_platform_3_0= ruleClassDef ) ) ( ruleEOL | otherlv_5= ',' )+ )* ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:507:1: ( () otherlv_1= 'platform' otherlv_2= ':' ( ( (lv_platform_3_0= ruleClassDef ) ) ( ruleEOL | otherlv_5= ',' )+ )* )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:507:1: ( () otherlv_1= 'platform' otherlv_2= ':' ( ( (lv_platform_3_0= ruleClassDef ) ) ( ruleEOL | otherlv_5= ',' )+ )* )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:507:2: () otherlv_1= 'platform' otherlv_2= ':' ( ( (lv_platform_3_0= ruleClassDef ) ) ( ruleEOL | otherlv_5= ',' )+ )*
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:507:2: ()
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:508:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDPlatformAccess().getDPlatformAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleDPlatform993); 

                	newLeafNode(otherlv_1, grammarAccess.getDPlatformAccess().getPlatformKeyword_1());
                
            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleDPlatform1005); 

                	newLeafNode(otherlv_2, grammarAccess.getDPlatformAccess().getColonKeyword_2());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:521:1: ( ( (lv_platform_3_0= ruleClassDef ) ) ( ruleEOL | otherlv_5= ',' )+ )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ATOM||LA16_0==RULE_VART) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:521:2: ( (lv_platform_3_0= ruleClassDef ) ) ( ruleEOL | otherlv_5= ',' )+
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:521:2: ( (lv_platform_3_0= ruleClassDef ) )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:522:1: (lv_platform_3_0= ruleClassDef )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:522:1: (lv_platform_3_0= ruleClassDef )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:523:3: lv_platform_3_0= ruleClassDef
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDPlatformAccess().getPlatformClassDefParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleClassDef_in_ruleDPlatform1027);
            	    lv_platform_3_0=ruleClassDef();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDPlatformRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"platform",
            	            		lv_platform_3_0, 
            	            		"ClassDef");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:539:2: ( ruleEOL | otherlv_5= ',' )+
            	    int cnt15=0;
            	    loop15:
            	    do {
            	        int alt15=3;
            	        int LA15_0 = input.LA(1);

            	        if ( ((LA15_0>=RULE_NEWLINE && LA15_0<=RULE_SL_COMMENT)) ) {
            	            alt15=1;
            	        }
            	        else if ( (LA15_0==27) ) {
            	            alt15=2;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:540:5: ruleEOL
            	    	    {
            	    	     
            	    	            newCompositeNode(grammarAccess.getDPlatformAccess().getEOLParserRuleCall_3_1_0()); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleEOL_in_ruleDPlatform1044);
            	    	    ruleEOL();

            	    	    state._fsp--;

            	    	     
            	    	            afterParserOrEnumRuleCall();
            	    	        

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:548:7: otherlv_5= ','
            	    	    {
            	    	    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleDPlatform1061); 

            	    	        	newLeafNode(otherlv_5, grammarAccess.getDPlatformAccess().getCommaKeyword_3_1_1());
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt15 >= 1 ) break loop15;
            	                EarlyExitException eee =
            	                    new EarlyExitException(15, input);
            	                throw eee;
            	        }
            	        cnt15++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:560:1: entryRuleDNode returns [EObject current=null] : iv_ruleDNode= ruleDNode EOF ;
    public final EObject entryRuleDNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDNode = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:561:2: (iv_ruleDNode= ruleDNode EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:562:2: iv_ruleDNode= ruleDNode EOF
            {
             newCompositeNode(grammarAccess.getDNodeRule()); 
            pushFollow(FOLLOW_ruleDNode_in_entryRuleDNode1101);
            iv_ruleDNode=ruleDNode();

            state._fsp--;

             current =iv_ruleDNode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDNode1111); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:569:1: ruleDNode returns [EObject current=null] : (otherlv_0= 'node' ( (lv_name_1_0= RULE_ATOM ) ) (otherlv_2= 'running' )? (otherlv_3= '@' ( (lv_host_4_0= ruleHost ) ) )? ( ruleEOL | otherlv_6= ',' )+ ) ;
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
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:572:28: ( (otherlv_0= 'node' ( (lv_name_1_0= RULE_ATOM ) ) (otherlv_2= 'running' )? (otherlv_3= '@' ( (lv_host_4_0= ruleHost ) ) )? ( ruleEOL | otherlv_6= ',' )+ ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:573:1: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ATOM ) ) (otherlv_2= 'running' )? (otherlv_3= '@' ( (lv_host_4_0= ruleHost ) ) )? ( ruleEOL | otherlv_6= ',' )+ )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:573:1: (otherlv_0= 'node' ( (lv_name_1_0= RULE_ATOM ) ) (otherlv_2= 'running' )? (otherlv_3= '@' ( (lv_host_4_0= ruleHost ) ) )? ( ruleEOL | otherlv_6= ',' )+ )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:573:3: otherlv_0= 'node' ( (lv_name_1_0= RULE_ATOM ) ) (otherlv_2= 'running' )? (otherlv_3= '@' ( (lv_host_4_0= ruleHost ) ) )? ( ruleEOL | otherlv_6= ',' )+
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleDNode1148); 

                	newLeafNode(otherlv_0, grammarAccess.getDNodeAccess().getNodeKeyword_0());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:577:1: ( (lv_name_1_0= RULE_ATOM ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:578:1: (lv_name_1_0= RULE_ATOM )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:578:1: (lv_name_1_0= RULE_ATOM )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:579:3: lv_name_1_0= RULE_ATOM
            {
            lv_name_1_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleDNode1165); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDNodeAccess().getNameATOMTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDNodeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ATOM");
            	    

            }


            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:595:2: (otherlv_2= 'running' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:595:4: otherlv_2= 'running'
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleDNode1183); 

                        	newLeafNode(otherlv_2, grammarAccess.getDNodeAccess().getRunningKeyword_2());
                        

                    }
                    break;

            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:599:3: (otherlv_3= '@' ( (lv_host_4_0= ruleHost ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:599:5: otherlv_3= '@' ( (lv_host_4_0= ruleHost ) )
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleDNode1198); 

                        	newLeafNode(otherlv_3, grammarAccess.getDNodeAccess().getCommercialAtKeyword_3_0());
                        
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:603:1: ( (lv_host_4_0= ruleHost ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:604:1: (lv_host_4_0= ruleHost )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:604:1: (lv_host_4_0= ruleHost )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:605:3: lv_host_4_0= ruleHost
                    {
                     
                    	        newCompositeNode(grammarAccess.getDNodeAccess().getHostHostParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleHost_in_ruleDNode1219);
                    lv_host_4_0=ruleHost();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDNodeRule());
                    	        }
                           		set(
                           			current, 
                           			"host",
                            		lv_host_4_0, 
                            		"Host");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:621:4: ( ruleEOL | otherlv_6= ',' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=RULE_NEWLINE && LA19_0<=RULE_SL_COMMENT)) ) {
                    alt19=1;
                }
                else if ( (LA19_0==27) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:622:5: ruleEOL
            	    {
            	     
            	            newCompositeNode(grammarAccess.getDNodeAccess().getEOLParserRuleCall_4_0()); 
            	        
            	    pushFollow(FOLLOW_ruleEOL_in_ruleDNode1238);
            	    ruleEOL();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:630:7: otherlv_6= ','
            	    {
            	    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleDNode1255); 

            	        	newLeafNode(otherlv_6, grammarAccess.getDNodeAccess().getCommaKeyword_4_1());
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:642:1: entryRuleAgent returns [EObject current=null] : iv_ruleAgent= ruleAgent EOF ;
    public final EObject entryRuleAgent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAgent = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:643:2: (iv_ruleAgent= ruleAgent EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:644:2: iv_ruleAgent= ruleAgent EOF
            {
             newCompositeNode(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_ruleAgent_in_entryRuleAgent1293);
            iv_ruleAgent=ruleAgent();

            state._fsp--;

             current =iv_ruleAgent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAgent1303); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:651:1: ruleAgent returns [EObject current=null] : (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ATOM ) ) (otherlv_2= ':' ( (lv_source_3_0= ruleFileName ) ) )? (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'instances' otherlv_7= ':' ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* ) ) | (otherlv_14= 'node' otherlv_15= ':' ( (lv_node_16_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_18= 'ag-arch' otherlv_19= ':' ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )* ) | (otherlv_23= 'ag-class' otherlv_24= ':' ( (lv_agClass_25_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_27= 'ag-bb-class' otherlv_28= ':' ( (lv_agbbClass_29_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_31= 'beliefs' otherlv_32= ':' ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )* ) | (otherlv_36= 'goals' otherlv_37= ':' ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )* ) | (otherlv_41= 'focus' otherlv_42= ':' ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '@' ( (lv_focusNode_45_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_47= ',' )+ )* ) | (otherlv_48= 'join' otherlv_49= ':' ( ( (lv_join_50_0= RULE_ATOM ) ) (otherlv_51= '@' ( (lv_joinNode_52_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_54= ',' )+ )* ) | (otherlv_55= 'roles' otherlv_56= ':' ( ( (lv_role_57_0= RULE_ATOM ) ) otherlv_58= 'in' ( (lv_group_59_0= RULE_ATOM ) ) (otherlv_60= '@' ( (lv_groupNode_61_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_63= ',' )+ )* ) | (otherlv_64= 'debug' otherlv_65= ':' ( (lv_debug_66_0= ruleLiteral ) ) ( ruleEOL | otherlv_68= ',' )+ ) | (otherlv_69= 'verbose' otherlv_70= ':' ( (lv_verbose_71_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_73= 'nrcbp' otherlv_74= ':' ( (lv_nrcbp_75_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_77= 'events' otherlv_78= ':' (otherlv_79= 'discard' | otherlv_80= 'requeue' | otherlv_81= 'retrieve' ) ( ruleEOL )+ ) | (otherlv_83= 'intBels' otherlv_84= ':' (otherlv_85= 'sameFocus' | otherlv_86= 'newFocus' ) ( ruleEOL )+ ) | ( ( (lv_other_88_0= RULE_ATOM ) ) otherlv_89= ':' ( ( (lv_string_90_0= RULE_STRING ) ) | ( (lv_val_91_0= RULE_INT_LITERAL ) ) | ( (lv_literal_92_0= ruleLiteral ) ) | ( (lv_val_real_93_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_95= '}' )? ( ruleEOL )* ) ;
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
        Token lv_focusNode_45_0=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token lv_join_50_0=null;
        Token otherlv_51=null;
        Token lv_joinNode_52_0=null;
        Token otherlv_54=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token lv_role_57_0=null;
        Token otherlv_58=null;
        Token lv_group_59_0=null;
        Token otherlv_60=null;
        Token lv_groupNode_61_0=null;
        Token otherlv_63=null;
        Token otherlv_64=null;
        Token otherlv_65=null;
        Token otherlv_68=null;
        Token otherlv_69=null;
        Token otherlv_70=null;
        Token lv_verbose_71_0=null;
        Token otherlv_73=null;
        Token otherlv_74=null;
        Token lv_nrcbp_75_0=null;
        Token otherlv_77=null;
        Token otherlv_78=null;
        Token otherlv_79=null;
        Token otherlv_80=null;
        Token otherlv_81=null;
        Token otherlv_83=null;
        Token otherlv_84=null;
        Token otherlv_85=null;
        Token otherlv_86=null;
        Token lv_other_88_0=null;
        Token otherlv_89=null;
        Token lv_string_90_0=null;
        Token lv_val_91_0=null;
        Token lv_val_real_93_0=null;
        Token otherlv_95=null;
        EObject lv_source_3_0 = null;

        EObject lv_agArch_20_0 = null;

        EObject lv_agClass_25_0 = null;

        EObject lv_agbbClass_29_0 = null;

        EObject lv_beliefs_33_0 = null;

        EObject lv_goals_38_0 = null;

        EObject lv_debug_66_0 = null;

        EObject lv_literal_92_0 = null;


         enterRule(); 
            
        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:654:28: ( (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ATOM ) ) (otherlv_2= ':' ( (lv_source_3_0= ruleFileName ) ) )? (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'instances' otherlv_7= ':' ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* ) ) | (otherlv_14= 'node' otherlv_15= ':' ( (lv_node_16_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_18= 'ag-arch' otherlv_19= ':' ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )* ) | (otherlv_23= 'ag-class' otherlv_24= ':' ( (lv_agClass_25_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_27= 'ag-bb-class' otherlv_28= ':' ( (lv_agbbClass_29_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_31= 'beliefs' otherlv_32= ':' ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )* ) | (otherlv_36= 'goals' otherlv_37= ':' ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )* ) | (otherlv_41= 'focus' otherlv_42= ':' ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '@' ( (lv_focusNode_45_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_47= ',' )+ )* ) | (otherlv_48= 'join' otherlv_49= ':' ( ( (lv_join_50_0= RULE_ATOM ) ) (otherlv_51= '@' ( (lv_joinNode_52_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_54= ',' )+ )* ) | (otherlv_55= 'roles' otherlv_56= ':' ( ( (lv_role_57_0= RULE_ATOM ) ) otherlv_58= 'in' ( (lv_group_59_0= RULE_ATOM ) ) (otherlv_60= '@' ( (lv_groupNode_61_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_63= ',' )+ )* ) | (otherlv_64= 'debug' otherlv_65= ':' ( (lv_debug_66_0= ruleLiteral ) ) ( ruleEOL | otherlv_68= ',' )+ ) | (otherlv_69= 'verbose' otherlv_70= ':' ( (lv_verbose_71_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_73= 'nrcbp' otherlv_74= ':' ( (lv_nrcbp_75_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_77= 'events' otherlv_78= ':' (otherlv_79= 'discard' | otherlv_80= 'requeue' | otherlv_81= 'retrieve' ) ( ruleEOL )+ ) | (otherlv_83= 'intBels' otherlv_84= ':' (otherlv_85= 'sameFocus' | otherlv_86= 'newFocus' ) ( ruleEOL )+ ) | ( ( (lv_other_88_0= RULE_ATOM ) ) otherlv_89= ':' ( ( (lv_string_90_0= RULE_STRING ) ) | ( (lv_val_91_0= RULE_INT_LITERAL ) ) | ( (lv_literal_92_0= ruleLiteral ) ) | ( (lv_val_real_93_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_95= '}' )? ( ruleEOL )* ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:655:1: (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ATOM ) ) (otherlv_2= ':' ( (lv_source_3_0= ruleFileName ) ) )? (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'instances' otherlv_7= ':' ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* ) ) | (otherlv_14= 'node' otherlv_15= ':' ( (lv_node_16_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_18= 'ag-arch' otherlv_19= ':' ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )* ) | (otherlv_23= 'ag-class' otherlv_24= ':' ( (lv_agClass_25_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_27= 'ag-bb-class' otherlv_28= ':' ( (lv_agbbClass_29_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_31= 'beliefs' otherlv_32= ':' ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )* ) | (otherlv_36= 'goals' otherlv_37= ':' ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )* ) | (otherlv_41= 'focus' otherlv_42= ':' ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '@' ( (lv_focusNode_45_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_47= ',' )+ )* ) | (otherlv_48= 'join' otherlv_49= ':' ( ( (lv_join_50_0= RULE_ATOM ) ) (otherlv_51= '@' ( (lv_joinNode_52_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_54= ',' )+ )* ) | (otherlv_55= 'roles' otherlv_56= ':' ( ( (lv_role_57_0= RULE_ATOM ) ) otherlv_58= 'in' ( (lv_group_59_0= RULE_ATOM ) ) (otherlv_60= '@' ( (lv_groupNode_61_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_63= ',' )+ )* ) | (otherlv_64= 'debug' otherlv_65= ':' ( (lv_debug_66_0= ruleLiteral ) ) ( ruleEOL | otherlv_68= ',' )+ ) | (otherlv_69= 'verbose' otherlv_70= ':' ( (lv_verbose_71_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_73= 'nrcbp' otherlv_74= ':' ( (lv_nrcbp_75_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_77= 'events' otherlv_78= ':' (otherlv_79= 'discard' | otherlv_80= 'requeue' | otherlv_81= 'retrieve' ) ( ruleEOL )+ ) | (otherlv_83= 'intBels' otherlv_84= ':' (otherlv_85= 'sameFocus' | otherlv_86= 'newFocus' ) ( ruleEOL )+ ) | ( ( (lv_other_88_0= RULE_ATOM ) ) otherlv_89= ':' ( ( (lv_string_90_0= RULE_STRING ) ) | ( (lv_val_91_0= RULE_INT_LITERAL ) ) | ( (lv_literal_92_0= ruleLiteral ) ) | ( (lv_val_real_93_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_95= '}' )? ( ruleEOL )* )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:655:1: (otherlv_0= 'agent' ( (lv_name_1_0= RULE_ATOM ) ) (otherlv_2= ':' ( (lv_source_3_0= ruleFileName ) ) )? (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'instances' otherlv_7= ':' ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* ) ) | (otherlv_14= 'node' otherlv_15= ':' ( (lv_node_16_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_18= 'ag-arch' otherlv_19= ':' ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )* ) | (otherlv_23= 'ag-class' otherlv_24= ':' ( (lv_agClass_25_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_27= 'ag-bb-class' otherlv_28= ':' ( (lv_agbbClass_29_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_31= 'beliefs' otherlv_32= ':' ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )* ) | (otherlv_36= 'goals' otherlv_37= ':' ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )* ) | (otherlv_41= 'focus' otherlv_42= ':' ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '@' ( (lv_focusNode_45_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_47= ',' )+ )* ) | (otherlv_48= 'join' otherlv_49= ':' ( ( (lv_join_50_0= RULE_ATOM ) ) (otherlv_51= '@' ( (lv_joinNode_52_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_54= ',' )+ )* ) | (otherlv_55= 'roles' otherlv_56= ':' ( ( (lv_role_57_0= RULE_ATOM ) ) otherlv_58= 'in' ( (lv_group_59_0= RULE_ATOM ) ) (otherlv_60= '@' ( (lv_groupNode_61_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_63= ',' )+ )* ) | (otherlv_64= 'debug' otherlv_65= ':' ( (lv_debug_66_0= ruleLiteral ) ) ( ruleEOL | otherlv_68= ',' )+ ) | (otherlv_69= 'verbose' otherlv_70= ':' ( (lv_verbose_71_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_73= 'nrcbp' otherlv_74= ':' ( (lv_nrcbp_75_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_77= 'events' otherlv_78= ':' (otherlv_79= 'discard' | otherlv_80= 'requeue' | otherlv_81= 'retrieve' ) ( ruleEOL )+ ) | (otherlv_83= 'intBels' otherlv_84= ':' (otherlv_85= 'sameFocus' | otherlv_86= 'newFocus' ) ( ruleEOL )+ ) | ( ( (lv_other_88_0= RULE_ATOM ) ) otherlv_89= ':' ( ( (lv_string_90_0= RULE_STRING ) ) | ( (lv_val_91_0= RULE_INT_LITERAL ) ) | ( (lv_literal_92_0= ruleLiteral ) ) | ( (lv_val_real_93_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_95= '}' )? ( ruleEOL )* )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:655:3: otherlv_0= 'agent' ( (lv_name_1_0= RULE_ATOM ) ) (otherlv_2= ':' ( (lv_source_3_0= ruleFileName ) ) )? (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'instances' otherlv_7= ':' ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* ) ) | (otherlv_14= 'node' otherlv_15= ':' ( (lv_node_16_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_18= 'ag-arch' otherlv_19= ':' ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )* ) | (otherlv_23= 'ag-class' otherlv_24= ':' ( (lv_agClass_25_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_27= 'ag-bb-class' otherlv_28= ':' ( (lv_agbbClass_29_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_31= 'beliefs' otherlv_32= ':' ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )* ) | (otherlv_36= 'goals' otherlv_37= ':' ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )* ) | (otherlv_41= 'focus' otherlv_42= ':' ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '@' ( (lv_focusNode_45_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_47= ',' )+ )* ) | (otherlv_48= 'join' otherlv_49= ':' ( ( (lv_join_50_0= RULE_ATOM ) ) (otherlv_51= '@' ( (lv_joinNode_52_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_54= ',' )+ )* ) | (otherlv_55= 'roles' otherlv_56= ':' ( ( (lv_role_57_0= RULE_ATOM ) ) otherlv_58= 'in' ( (lv_group_59_0= RULE_ATOM ) ) (otherlv_60= '@' ( (lv_groupNode_61_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_63= ',' )+ )* ) | (otherlv_64= 'debug' otherlv_65= ':' ( (lv_debug_66_0= ruleLiteral ) ) ( ruleEOL | otherlv_68= ',' )+ ) | (otherlv_69= 'verbose' otherlv_70= ':' ( (lv_verbose_71_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_73= 'nrcbp' otherlv_74= ':' ( (lv_nrcbp_75_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_77= 'events' otherlv_78= ':' (otherlv_79= 'discard' | otherlv_80= 'requeue' | otherlv_81= 'retrieve' ) ( ruleEOL )+ ) | (otherlv_83= 'intBels' otherlv_84= ':' (otherlv_85= 'sameFocus' | otherlv_86= 'newFocus' ) ( ruleEOL )+ ) | ( ( (lv_other_88_0= RULE_ATOM ) ) otherlv_89= ':' ( ( (lv_string_90_0= RULE_STRING ) ) | ( (lv_val_91_0= RULE_INT_LITERAL ) ) | ( (lv_literal_92_0= ruleLiteral ) ) | ( (lv_val_real_93_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_95= '}' )? ( ruleEOL )*
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleAgent1340); 

                	newLeafNode(otherlv_0, grammarAccess.getAgentAccess().getAgentKeyword_0());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:659:1: ( (lv_name_1_0= RULE_ATOM ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:660:1: (lv_name_1_0= RULE_ATOM )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:660:1: (lv_name_1_0= RULE_ATOM )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:661:3: lv_name_1_0= RULE_ATOM
            {
            lv_name_1_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleAgent1357); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAgentAccess().getNameATOMTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAgentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ATOM");
            	    

            }


            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:677:2: (otherlv_2= ':' ( (lv_source_3_0= ruleFileName ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:677:4: otherlv_2= ':' ( (lv_source_3_0= ruleFileName ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleAgent1375); 

                        	newLeafNode(otherlv_2, grammarAccess.getAgentAccess().getColonKeyword_2_0());
                        
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:681:1: ( (lv_source_3_0= ruleFileName ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:682:1: (lv_source_3_0= ruleFileName )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:682:1: (lv_source_3_0= ruleFileName )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:683:3: lv_source_3_0= ruleFileName
                    {
                     
                    	        newCompositeNode(grammarAccess.getAgentAccess().getSourceFileNameParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFileName_in_ruleAgent1396);
                    lv_source_3_0=ruleFileName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAgentRule());
                    	        }
                           		add(
                           			current, 
                           			"source",
                            		lv_source_3_0, 
                            		"FileName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:699:4: (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'instances' otherlv_7= ':' ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* ) ) | (otherlv_14= 'node' otherlv_15= ':' ( (lv_node_16_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_18= 'ag-arch' otherlv_19= ':' ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )* ) | (otherlv_23= 'ag-class' otherlv_24= ':' ( (lv_agClass_25_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_27= 'ag-bb-class' otherlv_28= ':' ( (lv_agbbClass_29_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_31= 'beliefs' otherlv_32= ':' ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )* ) | (otherlv_36= 'goals' otherlv_37= ':' ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )* ) | (otherlv_41= 'focus' otherlv_42= ':' ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '@' ( (lv_focusNode_45_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_47= ',' )+ )* ) | (otherlv_48= 'join' otherlv_49= ':' ( ( (lv_join_50_0= RULE_ATOM ) ) (otherlv_51= '@' ( (lv_joinNode_52_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_54= ',' )+ )* ) | (otherlv_55= 'roles' otherlv_56= ':' ( ( (lv_role_57_0= RULE_ATOM ) ) otherlv_58= 'in' ( (lv_group_59_0= RULE_ATOM ) ) (otherlv_60= '@' ( (lv_groupNode_61_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_63= ',' )+ )* ) | (otherlv_64= 'debug' otherlv_65= ':' ( (lv_debug_66_0= ruleLiteral ) ) ( ruleEOL | otherlv_68= ',' )+ ) | (otherlv_69= 'verbose' otherlv_70= ':' ( (lv_verbose_71_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_73= 'nrcbp' otherlv_74= ':' ( (lv_nrcbp_75_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_77= 'events' otherlv_78= ':' (otherlv_79= 'discard' | otherlv_80= 'requeue' | otherlv_81= 'retrieve' ) ( ruleEOL )+ ) | (otherlv_83= 'intBels' otherlv_84= ':' (otherlv_85= 'sameFocus' | otherlv_86= 'newFocus' ) ( ruleEOL )+ ) | ( ( (lv_other_88_0= RULE_ATOM ) ) otherlv_89= ':' ( ( (lv_string_90_0= RULE_STRING ) ) | ( (lv_val_91_0= RULE_INT_LITERAL ) ) | ( (lv_literal_92_0= ruleLiteral ) ) | ( (lv_val_real_93_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_95= '}' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==24) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:699:6: otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'instances' otherlv_7= ':' ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* ) ) | (otherlv_14= 'node' otherlv_15= ':' ( (lv_node_16_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_18= 'ag-arch' otherlv_19= ':' ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )* ) | (otherlv_23= 'ag-class' otherlv_24= ':' ( (lv_agClass_25_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_27= 'ag-bb-class' otherlv_28= ':' ( (lv_agbbClass_29_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_31= 'beliefs' otherlv_32= ':' ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )* ) | (otherlv_36= 'goals' otherlv_37= ':' ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )* ) | (otherlv_41= 'focus' otherlv_42= ':' ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '@' ( (lv_focusNode_45_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_47= ',' )+ )* ) | (otherlv_48= 'join' otherlv_49= ':' ( ( (lv_join_50_0= RULE_ATOM ) ) (otherlv_51= '@' ( (lv_joinNode_52_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_54= ',' )+ )* ) | (otherlv_55= 'roles' otherlv_56= ':' ( ( (lv_role_57_0= RULE_ATOM ) ) otherlv_58= 'in' ( (lv_group_59_0= RULE_ATOM ) ) (otherlv_60= '@' ( (lv_groupNode_61_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_63= ',' )+ )* ) | (otherlv_64= 'debug' otherlv_65= ':' ( (lv_debug_66_0= ruleLiteral ) ) ( ruleEOL | otherlv_68= ',' )+ ) | (otherlv_69= 'verbose' otherlv_70= ':' ( (lv_verbose_71_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_73= 'nrcbp' otherlv_74= ':' ( (lv_nrcbp_75_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_77= 'events' otherlv_78= ':' (otherlv_79= 'discard' | otherlv_80= 'requeue' | otherlv_81= 'retrieve' ) ( ruleEOL )+ ) | (otherlv_83= 'intBels' otherlv_84= ':' (otherlv_85= 'sameFocus' | otherlv_86= 'newFocus' ) ( ruleEOL )+ ) | ( ( (lv_other_88_0= RULE_ATOM ) ) otherlv_89= ':' ( ( (lv_string_90_0= RULE_STRING ) ) | ( (lv_val_91_0= RULE_INT_LITERAL ) ) | ( (lv_literal_92_0= ruleLiteral ) ) | ( (lv_val_real_93_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_95= '}'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleAgent1411); 

                        	newLeafNode(otherlv_4, grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:703:1: ( ruleEOL )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>=RULE_NEWLINE && LA21_0<=RULE_SL_COMMENT)) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:704:5: ruleEOL
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleEOL_in_ruleAgent1428);
                    	    ruleEOL();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:711:3: ( (otherlv_6= 'instances' otherlv_7= ':' ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* ) ) | (otherlv_14= 'node' otherlv_15= ':' ( (lv_node_16_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_18= 'ag-arch' otherlv_19= ':' ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )* ) | (otherlv_23= 'ag-class' otherlv_24= ':' ( (lv_agClass_25_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_27= 'ag-bb-class' otherlv_28= ':' ( (lv_agbbClass_29_0= ruleClassDef ) ) ( ruleEOL )+ ) | (otherlv_31= 'beliefs' otherlv_32= ':' ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )* ) | (otherlv_36= 'goals' otherlv_37= ':' ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )* ) | (otherlv_41= 'focus' otherlv_42= ':' ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '@' ( (lv_focusNode_45_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_47= ',' )+ )* ) | (otherlv_48= 'join' otherlv_49= ':' ( ( (lv_join_50_0= RULE_ATOM ) ) (otherlv_51= '@' ( (lv_joinNode_52_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_54= ',' )+ )* ) | (otherlv_55= 'roles' otherlv_56= ':' ( ( (lv_role_57_0= RULE_ATOM ) ) otherlv_58= 'in' ( (lv_group_59_0= RULE_ATOM ) ) (otherlv_60= '@' ( (lv_groupNode_61_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_63= ',' )+ )* ) | (otherlv_64= 'debug' otherlv_65= ':' ( (lv_debug_66_0= ruleLiteral ) ) ( ruleEOL | otherlv_68= ',' )+ ) | (otherlv_69= 'verbose' otherlv_70= ':' ( (lv_verbose_71_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_73= 'nrcbp' otherlv_74= ':' ( (lv_nrcbp_75_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ ) | (otherlv_77= 'events' otherlv_78= ':' (otherlv_79= 'discard' | otherlv_80= 'requeue' | otherlv_81= 'retrieve' ) ( ruleEOL )+ ) | (otherlv_83= 'intBels' otherlv_84= ':' (otherlv_85= 'sameFocus' | otherlv_86= 'newFocus' ) ( ruleEOL )+ ) | ( ( (lv_other_88_0= RULE_ATOM ) ) otherlv_89= ':' ( ( (lv_string_90_0= RULE_STRING ) ) | ( (lv_val_91_0= RULE_INT_LITERAL ) ) | ( (lv_literal_92_0= ruleLiteral ) ) | ( (lv_val_real_93_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )*
                    loop53:
                    do {
                        int alt53=17;
                        switch ( input.LA(1) ) {
                        case 36:
                            {
                            alt53=1;
                            }
                            break;
                        case 32:
                            {
                            alt53=2;
                            }
                            break;
                        case 37:
                            {
                            alt53=3;
                            }
                            break;
                        case 38:
                            {
                            alt53=4;
                            }
                            break;
                        case 39:
                            {
                            alt53=5;
                            }
                            break;
                        case 40:
                            {
                            alt53=6;
                            }
                            break;
                        case 41:
                            {
                            alt53=7;
                            }
                            break;
                        case 42:
                            {
                            alt53=8;
                            }
                            break;
                        case 43:
                            {
                            alt53=9;
                            }
                            break;
                        case 44:
                            {
                            alt53=10;
                            }
                            break;
                        case 46:
                            {
                            alt53=11;
                            }
                            break;
                        case 47:
                            {
                            alt53=12;
                            }
                            break;
                        case 48:
                            {
                            alt53=13;
                            }
                            break;
                        case 49:
                            {
                            alt53=14;
                            }
                            break;
                        case 53:
                            {
                            alt53=15;
                            }
                            break;
                        case RULE_ATOM:
                            {
                            alt53=16;
                            }
                            break;

                        }

                        switch (alt53) {
                    	case 1 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:711:4: (otherlv_6= 'instances' otherlv_7= ':' ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* ) )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:711:4: (otherlv_6= 'instances' otherlv_7= ':' ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* ) )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:711:6: otherlv_6= 'instances' otherlv_7= ':' ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* )
                    	    {
                    	    otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleAgent1443); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getAgentAccess().getInstancesKeyword_3_2_0_0());
                    	        
                    	    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleAgent1455); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getAgentAccess().getColonKeyword_3_2_0_1());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:719:1: ( ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ ) | ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )* )
                    	    int alt25=2;
                    	    int LA25_0 = input.LA(1);

                    	    if ( (LA25_0==RULE_INT_LITERAL) ) {
                    	        alt25=1;
                    	    }
                    	    else if ( (LA25_0==RULE_ATOM||LA25_0==25||LA25_0==32||(LA25_0>=36 && LA25_0<=44)||(LA25_0>=46 && LA25_0<=49)||LA25_0==53) ) {
                    	        alt25=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 25, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt25) {
                    	        case 1 :
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:719:2: ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:719:2: ( ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+ )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:719:3: ( (lv_instances_8_0= RULE_INT_LITERAL ) ) ( ruleEOL | otherlv_10= ',' )+
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:719:3: ( (lv_instances_8_0= RULE_INT_LITERAL ) )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:720:1: (lv_instances_8_0= RULE_INT_LITERAL )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:720:1: (lv_instances_8_0= RULE_INT_LITERAL )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:721:3: lv_instances_8_0= RULE_INT_LITERAL
                    	            {
                    	            lv_instances_8_0=(Token)match(input,RULE_INT_LITERAL,FOLLOW_RULE_INT_LITERAL_in_ruleAgent1474); 

                    	            			newLeafNode(lv_instances_8_0, grammarAccess.getAgentAccess().getInstancesINT_LITERALTerminalRuleCall_3_2_0_2_0_0_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getAgentRule());
                    	            	        }
                    	                   		addWithLastConsumed(
                    	                   			current, 
                    	                   			"instances",
                    	                    		lv_instances_8_0, 
                    	                    		"INT_LITERAL");
                    	            	    

                    	            }


                    	            }

                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:737:2: ( ruleEOL | otherlv_10= ',' )+
                    	            int cnt22=0;
                    	            loop22:
                    	            do {
                    	                int alt22=3;
                    	                int LA22_0 = input.LA(1);

                    	                if ( ((LA22_0>=RULE_NEWLINE && LA22_0<=RULE_SL_COMMENT)) ) {
                    	                    alt22=1;
                    	                }
                    	                else if ( (LA22_0==27) ) {
                    	                    alt22=2;
                    	                }


                    	                switch (alt22) {
                    	            	case 1 :
                    	            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:738:5: ruleEOL
                    	            	    {
                    	            	     
                    	            	            newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_0_2_0_1_0()); 
                    	            	        
                    	            	    pushFollow(FOLLOW_ruleEOL_in_ruleAgent1496);
                    	            	    ruleEOL();

                    	            	    state._fsp--;

                    	            	     
                    	            	            afterParserOrEnumRuleCall();
                    	            	        

                    	            	    }
                    	            	    break;
                    	            	case 2 :
                    	            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:746:7: otherlv_10= ','
                    	            	    {
                    	            	    otherlv_10=(Token)match(input,27,FOLLOW_27_in_ruleAgent1513); 

                    	            	        	newLeafNode(otherlv_10, grammarAccess.getAgentAccess().getCommaKeyword_3_2_0_2_0_1_1());
                    	            	        

                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    if ( cnt22 >= 1 ) break loop22;
                    	                        EarlyExitException eee =
                    	                            new EarlyExitException(22, input);
                    	                        throw eee;
                    	                }
                    	                cnt22++;
                    	            } while (true);


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:751:6: ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )*
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:751:6: ( ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+ )*
                    	            loop24:
                    	            do {
                    	                int alt24=2;
                    	                int LA24_0 = input.LA(1);

                    	                if ( (LA24_0==RULE_ATOM) ) {
                    	                    int LA24_2 = input.LA(2);

                    	                    if ( ((LA24_2>=RULE_NEWLINE && LA24_2<=RULE_SL_COMMENT)||LA24_2==27) ) {
                    	                        alt24=1;
                    	                    }


                    	                }


                    	                switch (alt24) {
                    	            	case 1 :
                    	            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:751:7: ( (lv_instancesAtom_11_0= RULE_ATOM ) ) ( ruleEOL | otherlv_13= ',' )+
                    	            	    {
                    	            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:751:7: ( (lv_instancesAtom_11_0= RULE_ATOM ) )
                    	            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:752:1: (lv_instancesAtom_11_0= RULE_ATOM )
                    	            	    {
                    	            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:752:1: (lv_instancesAtom_11_0= RULE_ATOM )
                    	            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:753:3: lv_instancesAtom_11_0= RULE_ATOM
                    	            	    {
                    	            	    lv_instancesAtom_11_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleAgent1540); 

                    	            	    			newLeafNode(lv_instancesAtom_11_0, grammarAccess.getAgentAccess().getInstancesAtomATOMTerminalRuleCall_3_2_0_2_1_0_0()); 
                    	            	    		

                    	            	    	        if (current==null) {
                    	            	    	            current = createModelElement(grammarAccess.getAgentRule());
                    	            	    	        }
                    	            	           		addWithLastConsumed(
                    	            	           			current, 
                    	            	           			"instancesAtom",
                    	            	            		lv_instancesAtom_11_0, 
                    	            	            		"ATOM");
                    	            	    	    

                    	            	    }


                    	            	    }

                    	            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:769:2: ( ruleEOL | otherlv_13= ',' )+
                    	            	    int cnt23=0;
                    	            	    loop23:
                    	            	    do {
                    	            	        int alt23=3;
                    	            	        int LA23_0 = input.LA(1);

                    	            	        if ( ((LA23_0>=RULE_NEWLINE && LA23_0<=RULE_SL_COMMENT)) ) {
                    	            	            alt23=1;
                    	            	        }
                    	            	        else if ( (LA23_0==27) ) {
                    	            	            alt23=2;
                    	            	        }


                    	            	        switch (alt23) {
                    	            	    	case 1 :
                    	            	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:770:5: ruleEOL
                    	            	    	    {
                    	            	    	     
                    	            	    	            newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_0_2_1_1_0()); 
                    	            	    	        
                    	            	    	    pushFollow(FOLLOW_ruleEOL_in_ruleAgent1562);
                    	            	    	    ruleEOL();

                    	            	    	    state._fsp--;

                    	            	    	     
                    	            	    	            afterParserOrEnumRuleCall();
                    	            	    	        

                    	            	    	    }
                    	            	    	    break;
                    	            	    	case 2 :
                    	            	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:778:7: otherlv_13= ','
                    	            	    	    {
                    	            	    	    otherlv_13=(Token)match(input,27,FOLLOW_27_in_ruleAgent1579); 

                    	            	    	        	newLeafNode(otherlv_13, grammarAccess.getAgentAccess().getCommaKeyword_3_2_0_2_1_1_1());
                    	            	    	        

                    	            	    	    }
                    	            	    	    break;

                    	            	    	default :
                    	            	    	    if ( cnt23 >= 1 ) break loop23;
                    	            	                EarlyExitException eee =
                    	            	                    new EarlyExitException(23, input);
                    	            	                throw eee;
                    	            	        }
                    	            	        cnt23++;
                    	            	    } while (true);


                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    break loop24;
                    	                }
                    	            } while (true);


                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:783:6: (otherlv_14= 'node' otherlv_15= ':' ( (lv_node_16_0= RULE_ATOM ) ) ( ruleEOL )+ )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:783:6: (otherlv_14= 'node' otherlv_15= ':' ( (lv_node_16_0= RULE_ATOM ) ) ( ruleEOL )+ )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:783:8: otherlv_14= 'node' otherlv_15= ':' ( (lv_node_16_0= RULE_ATOM ) ) ( ruleEOL )+
                    	    {
                    	    otherlv_14=(Token)match(input,32,FOLLOW_32_in_ruleAgent1604); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getAgentAccess().getNodeKeyword_3_2_1_0());
                    	        
                    	    otherlv_15=(Token)match(input,29,FOLLOW_29_in_ruleAgent1616); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getAgentAccess().getColonKeyword_3_2_1_1());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:791:1: ( (lv_node_16_0= RULE_ATOM ) )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:792:1: (lv_node_16_0= RULE_ATOM )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:792:1: (lv_node_16_0= RULE_ATOM )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:793:3: lv_node_16_0= RULE_ATOM
                    	    {
                    	    lv_node_16_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleAgent1633); 

                    	    			newLeafNode(lv_node_16_0, grammarAccess.getAgentAccess().getNodeATOMTerminalRuleCall_3_2_1_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAgentRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"node",
                    	            		lv_node_16_0, 
                    	            		"ATOM");
                    	    	    

                    	    }


                    	    }

                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:809:2: ( ruleEOL )+
                    	    int cnt26=0;
                    	    loop26:
                    	    do {
                    	        int alt26=2;
                    	        int LA26_0 = input.LA(1);

                    	        if ( ((LA26_0>=RULE_NEWLINE && LA26_0<=RULE_SL_COMMENT)) ) {
                    	            alt26=1;
                    	        }


                    	        switch (alt26) {
                    	    	case 1 :
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:810:5: ruleEOL
                    	    	    {
                    	    	     
                    	    	            newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_1_3()); 
                    	    	        
                    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleAgent1655);
                    	    	    ruleEOL();

                    	    	    state._fsp--;

                    	    	     
                    	    	            afterParserOrEnumRuleCall();
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt26 >= 1 ) break loop26;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(26, input);
                    	                throw eee;
                    	        }
                    	        cnt26++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:818:6: (otherlv_18= 'ag-arch' otherlv_19= ':' ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )* )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:818:6: (otherlv_18= 'ag-arch' otherlv_19= ':' ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )* )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:818:8: otherlv_18= 'ag-arch' otherlv_19= ':' ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )*
                    	    {
                    	    otherlv_18=(Token)match(input,37,FOLLOW_37_in_ruleAgent1676); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getAgentAccess().getAgArchKeyword_3_2_2_0());
                    	        
                    	    otherlv_19=(Token)match(input,29,FOLLOW_29_in_ruleAgent1688); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getAgentAccess().getColonKeyword_3_2_2_1());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:826:1: ( ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+ )*
                    	    loop28:
                    	    do {
                    	        int alt28=2;
                    	        int LA28_0 = input.LA(1);

                    	        if ( (LA28_0==RULE_ATOM) ) {
                    	            int LA28_2 = input.LA(2);

                    	            if ( ((LA28_2>=RULE_NEWLINE && LA28_2<=RULE_SL_COMMENT)||LA28_2==27||LA28_2==69||LA28_2==71) ) {
                    	                alt28=1;
                    	            }


                    	        }
                    	        else if ( (LA28_0==RULE_VART) ) {
                    	            alt28=1;
                    	        }


                    	        switch (alt28) {
                    	    	case 1 :
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:826:2: ( (lv_agArch_20_0= ruleClassDef ) ) ( ruleEOL | otherlv_22= ',' )+
                    	    	    {
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:826:2: ( (lv_agArch_20_0= ruleClassDef ) )
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:827:1: (lv_agArch_20_0= ruleClassDef )
                    	    	    {
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:827:1: (lv_agArch_20_0= ruleClassDef )
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:828:3: lv_agArch_20_0= ruleClassDef
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getAgentAccess().getAgArchClassDefParserRuleCall_3_2_2_2_0_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleClassDef_in_ruleAgent1710);
                    	    	    lv_agArch_20_0=ruleClassDef();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getAgentRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"agArch",
                    	    	            		lv_agArch_20_0, 
                    	    	            		"ClassDef");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }

                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:844:2: ( ruleEOL | otherlv_22= ',' )+
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
                    	    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:845:5: ruleEOL
                    	    	    	    {
                    	    	    	     
                    	    	    	            newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_2_2_1_0()); 
                    	    	    	        
                    	    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleAgent1727);
                    	    	    	    ruleEOL();

                    	    	    	    state._fsp--;

                    	    	    	     
                    	    	    	            afterParserOrEnumRuleCall();
                    	    	    	        

                    	    	    	    }
                    	    	    	    break;
                    	    	    	case 2 :
                    	    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:853:7: otherlv_22= ','
                    	    	    	    {
                    	    	    	    otherlv_22=(Token)match(input,27,FOLLOW_27_in_ruleAgent1744); 

                    	    	    	        	newLeafNode(otherlv_22, grammarAccess.getAgentAccess().getCommaKeyword_3_2_2_2_1_1());
                    	    	    	        

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
                    	    	    break;

                    	    	default :
                    	    	    break loop28;
                    	        }
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:858:6: (otherlv_23= 'ag-class' otherlv_24= ':' ( (lv_agClass_25_0= ruleClassDef ) ) ( ruleEOL )+ )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:858:6: (otherlv_23= 'ag-class' otherlv_24= ':' ( (lv_agClass_25_0= ruleClassDef ) ) ( ruleEOL )+ )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:858:8: otherlv_23= 'ag-class' otherlv_24= ':' ( (lv_agClass_25_0= ruleClassDef ) ) ( ruleEOL )+
                    	    {
                    	    otherlv_23=(Token)match(input,38,FOLLOW_38_in_ruleAgent1768); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getAgentAccess().getAgClassKeyword_3_2_3_0());
                    	        
                    	    otherlv_24=(Token)match(input,29,FOLLOW_29_in_ruleAgent1780); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getAgentAccess().getColonKeyword_3_2_3_1());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:866:1: ( (lv_agClass_25_0= ruleClassDef ) )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:867:1: (lv_agClass_25_0= ruleClassDef )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:867:1: (lv_agClass_25_0= ruleClassDef )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:868:3: lv_agClass_25_0= ruleClassDef
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAgentAccess().getAgClassClassDefParserRuleCall_3_2_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleClassDef_in_ruleAgent1801);
                    	    lv_agClass_25_0=ruleClassDef();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAgentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"agClass",
                    	            		lv_agClass_25_0, 
                    	            		"ClassDef");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:884:2: ( ruleEOL )+
                    	    int cnt29=0;
                    	    loop29:
                    	    do {
                    	        int alt29=2;
                    	        int LA29_0 = input.LA(1);

                    	        if ( ((LA29_0>=RULE_NEWLINE && LA29_0<=RULE_SL_COMMENT)) ) {
                    	            alt29=1;
                    	        }


                    	        switch (alt29) {
                    	    	case 1 :
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:885:5: ruleEOL
                    	    	    {
                    	    	     
                    	    	            newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_3_3()); 
                    	    	        
                    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleAgent1818);
                    	    	    ruleEOL();

                    	    	    state._fsp--;

                    	    	     
                    	    	            afterParserOrEnumRuleCall();
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt29 >= 1 ) break loop29;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(29, input);
                    	                throw eee;
                    	        }
                    	        cnt29++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:893:6: (otherlv_27= 'ag-bb-class' otherlv_28= ':' ( (lv_agbbClass_29_0= ruleClassDef ) ) ( ruleEOL )+ )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:893:6: (otherlv_27= 'ag-bb-class' otherlv_28= ':' ( (lv_agbbClass_29_0= ruleClassDef ) ) ( ruleEOL )+ )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:893:8: otherlv_27= 'ag-bb-class' otherlv_28= ':' ( (lv_agbbClass_29_0= ruleClassDef ) ) ( ruleEOL )+
                    	    {
                    	    otherlv_27=(Token)match(input,39,FOLLOW_39_in_ruleAgent1839); 

                    	        	newLeafNode(otherlv_27, grammarAccess.getAgentAccess().getAgBbClassKeyword_3_2_4_0());
                    	        
                    	    otherlv_28=(Token)match(input,29,FOLLOW_29_in_ruleAgent1851); 

                    	        	newLeafNode(otherlv_28, grammarAccess.getAgentAccess().getColonKeyword_3_2_4_1());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:901:1: ( (lv_agbbClass_29_0= ruleClassDef ) )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:902:1: (lv_agbbClass_29_0= ruleClassDef )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:902:1: (lv_agbbClass_29_0= ruleClassDef )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:903:3: lv_agbbClass_29_0= ruleClassDef
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAgentAccess().getAgbbClassClassDefParserRuleCall_3_2_4_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleClassDef_in_ruleAgent1872);
                    	    lv_agbbClass_29_0=ruleClassDef();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAgentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"agbbClass",
                    	            		lv_agbbClass_29_0, 
                    	            		"ClassDef");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:919:2: ( ruleEOL )+
                    	    int cnt30=0;
                    	    loop30:
                    	    do {
                    	        int alt30=2;
                    	        int LA30_0 = input.LA(1);

                    	        if ( ((LA30_0>=RULE_NEWLINE && LA30_0<=RULE_SL_COMMENT)) ) {
                    	            alt30=1;
                    	        }


                    	        switch (alt30) {
                    	    	case 1 :
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:920:5: ruleEOL
                    	    	    {
                    	    	     
                    	    	            newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_4_3()); 
                    	    	        
                    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleAgent1889);
                    	    	    ruleEOL();

                    	    	    state._fsp--;

                    	    	     
                    	    	            afterParserOrEnumRuleCall();
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt30 >= 1 ) break loop30;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(30, input);
                    	                throw eee;
                    	        }
                    	        cnt30++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:928:6: (otherlv_31= 'beliefs' otherlv_32= ':' ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )* )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:928:6: (otherlv_31= 'beliefs' otherlv_32= ':' ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )* )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:928:8: otherlv_31= 'beliefs' otherlv_32= ':' ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )*
                    	    {
                    	    otherlv_31=(Token)match(input,40,FOLLOW_40_in_ruleAgent1910); 

                    	        	newLeafNode(otherlv_31, grammarAccess.getAgentAccess().getBeliefsKeyword_3_2_5_0());
                    	        
                    	    otherlv_32=(Token)match(input,29,FOLLOW_29_in_ruleAgent1922); 

                    	        	newLeafNode(otherlv_32, grammarAccess.getAgentAccess().getColonKeyword_3_2_5_1());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:936:1: ( ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+ )*
                    	    loop32:
                    	    do {
                    	        int alt32=2;
                    	        int LA32_0 = input.LA(1);

                    	        if ( (LA32_0==RULE_ATOM) ) {
                    	            int LA32_2 = input.LA(2);

                    	            if ( ((LA32_2>=RULE_NEWLINE && LA32_2<=RULE_SL_COMMENT)||LA32_2==27||LA32_2==71||LA32_2==73) ) {
                    	                alt32=1;
                    	            }


                    	        }
                    	        else if ( ((LA32_0>=RULE_VART && LA32_0<=RULE_UNNAMEDVART)||(LA32_0>=75 && LA32_0<=79)) ) {
                    	            alt32=1;
                    	        }


                    	        switch (alt32) {
                    	    	case 1 :
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:936:2: ( (lv_beliefs_33_0= ruleLiteral ) ) ( ruleEOL | otherlv_35= ',' )+
                    	    	    {
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:936:2: ( (lv_beliefs_33_0= ruleLiteral ) )
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:937:1: (lv_beliefs_33_0= ruleLiteral )
                    	    	    {
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:937:1: (lv_beliefs_33_0= ruleLiteral )
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:938:3: lv_beliefs_33_0= ruleLiteral
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getAgentAccess().getBeliefsLiteralParserRuleCall_3_2_5_2_0_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleLiteral_in_ruleAgent1944);
                    	    	    lv_beliefs_33_0=ruleLiteral();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getAgentRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"beliefs",
                    	    	            		lv_beliefs_33_0, 
                    	    	            		"Literal");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }

                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:954:2: ( ruleEOL | otherlv_35= ',' )+
                    	    	    int cnt31=0;
                    	    	    loop31:
                    	    	    do {
                    	    	        int alt31=3;
                    	    	        int LA31_0 = input.LA(1);

                    	    	        if ( ((LA31_0>=RULE_NEWLINE && LA31_0<=RULE_SL_COMMENT)) ) {
                    	    	            alt31=1;
                    	    	        }
                    	    	        else if ( (LA31_0==27) ) {
                    	    	            alt31=2;
                    	    	        }


                    	    	        switch (alt31) {
                    	    	    	case 1 :
                    	    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:955:5: ruleEOL
                    	    	    	    {
                    	    	    	     
                    	    	    	            newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_5_2_1_0()); 
                    	    	    	        
                    	    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleAgent1961);
                    	    	    	    ruleEOL();

                    	    	    	    state._fsp--;

                    	    	    	     
                    	    	    	            afterParserOrEnumRuleCall();
                    	    	    	        

                    	    	    	    }
                    	    	    	    break;
                    	    	    	case 2 :
                    	    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:963:7: otherlv_35= ','
                    	    	    	    {
                    	    	    	    otherlv_35=(Token)match(input,27,FOLLOW_27_in_ruleAgent1978); 

                    	    	    	        	newLeafNode(otherlv_35, grammarAccess.getAgentAccess().getCommaKeyword_3_2_5_2_1_1());
                    	    	    	        

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
                    	    	    break;

                    	    	default :
                    	    	    break loop32;
                    	        }
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:968:6: (otherlv_36= 'goals' otherlv_37= ':' ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )* )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:968:6: (otherlv_36= 'goals' otherlv_37= ':' ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )* )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:968:8: otherlv_36= 'goals' otherlv_37= ':' ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )*
                    	    {
                    	    otherlv_36=(Token)match(input,41,FOLLOW_41_in_ruleAgent2002); 

                    	        	newLeafNode(otherlv_36, grammarAccess.getAgentAccess().getGoalsKeyword_3_2_6_0());
                    	        
                    	    otherlv_37=(Token)match(input,29,FOLLOW_29_in_ruleAgent2014); 

                    	        	newLeafNode(otherlv_37, grammarAccess.getAgentAccess().getColonKeyword_3_2_6_1());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:976:1: ( ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+ )*
                    	    loop34:
                    	    do {
                    	        int alt34=2;
                    	        int LA34_0 = input.LA(1);

                    	        if ( (LA34_0==RULE_ATOM) ) {
                    	            int LA34_2 = input.LA(2);

                    	            if ( ((LA34_2>=RULE_NEWLINE && LA34_2<=RULE_SL_COMMENT)||LA34_2==27||LA34_2==71||LA34_2==73) ) {
                    	                alt34=1;
                    	            }


                    	        }
                    	        else if ( ((LA34_0>=RULE_VART && LA34_0<=RULE_UNNAMEDVART)||(LA34_0>=75 && LA34_0<=79)) ) {
                    	            alt34=1;
                    	        }


                    	        switch (alt34) {
                    	    	case 1 :
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:976:2: ( (lv_goals_38_0= ruleLiteral ) ) ( ruleEOL | otherlv_40= ',' )+
                    	    	    {
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:976:2: ( (lv_goals_38_0= ruleLiteral ) )
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:977:1: (lv_goals_38_0= ruleLiteral )
                    	    	    {
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:977:1: (lv_goals_38_0= ruleLiteral )
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:978:3: lv_goals_38_0= ruleLiteral
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getAgentAccess().getGoalsLiteralParserRuleCall_3_2_6_2_0_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleLiteral_in_ruleAgent2036);
                    	    	    lv_goals_38_0=ruleLiteral();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getAgentRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"goals",
                    	    	            		lv_goals_38_0, 
                    	    	            		"Literal");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }

                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:994:2: ( ruleEOL | otherlv_40= ',' )+
                    	    	    int cnt33=0;
                    	    	    loop33:
                    	    	    do {
                    	    	        int alt33=3;
                    	    	        int LA33_0 = input.LA(1);

                    	    	        if ( ((LA33_0>=RULE_NEWLINE && LA33_0<=RULE_SL_COMMENT)) ) {
                    	    	            alt33=1;
                    	    	        }
                    	    	        else if ( (LA33_0==27) ) {
                    	    	            alt33=2;
                    	    	        }


                    	    	        switch (alt33) {
                    	    	    	case 1 :
                    	    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:995:5: ruleEOL
                    	    	    	    {
                    	    	    	     
                    	    	    	            newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_6_2_1_0()); 
                    	    	    	        
                    	    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleAgent2053);
                    	    	    	    ruleEOL();

                    	    	    	    state._fsp--;

                    	    	    	     
                    	    	    	            afterParserOrEnumRuleCall();
                    	    	    	        

                    	    	    	    }
                    	    	    	    break;
                    	    	    	case 2 :
                    	    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1003:7: otherlv_40= ','
                    	    	    	    {
                    	    	    	    otherlv_40=(Token)match(input,27,FOLLOW_27_in_ruleAgent2070); 

                    	    	    	        	newLeafNode(otherlv_40, grammarAccess.getAgentAccess().getCommaKeyword_3_2_6_2_1_1());
                    	    	    	        

                    	    	    	    }
                    	    	    	    break;

                    	    	    	default :
                    	    	    	    if ( cnt33 >= 1 ) break loop33;
                    	    	                EarlyExitException eee =
                    	    	                    new EarlyExitException(33, input);
                    	    	                throw eee;
                    	    	        }
                    	    	        cnt33++;
                    	    	    } while (true);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop34;
                    	        }
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 8 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1008:6: (otherlv_41= 'focus' otherlv_42= ':' ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '@' ( (lv_focusNode_45_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_47= ',' )+ )* )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1008:6: (otherlv_41= 'focus' otherlv_42= ':' ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '@' ( (lv_focusNode_45_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_47= ',' )+ )* )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1008:8: otherlv_41= 'focus' otherlv_42= ':' ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '@' ( (lv_focusNode_45_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_47= ',' )+ )*
                    	    {
                    	    otherlv_41=(Token)match(input,42,FOLLOW_42_in_ruleAgent2094); 

                    	        	newLeafNode(otherlv_41, grammarAccess.getAgentAccess().getFocusKeyword_3_2_7_0());
                    	        
                    	    otherlv_42=(Token)match(input,29,FOLLOW_29_in_ruleAgent2106); 

                    	        	newLeafNode(otherlv_42, grammarAccess.getAgentAccess().getColonKeyword_3_2_7_1());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1016:1: ( ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '@' ( (lv_focusNode_45_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_47= ',' )+ )*
                    	    loop37:
                    	    do {
                    	        int alt37=2;
                    	        int LA37_0 = input.LA(1);

                    	        if ( (LA37_0==RULE_ATOM) ) {
                    	            int LA37_2 = input.LA(2);

                    	            if ( ((LA37_2>=RULE_NEWLINE && LA37_2<=RULE_SL_COMMENT)||LA37_2==27||LA37_2==34) ) {
                    	                alt37=1;
                    	            }


                    	        }


                    	        switch (alt37) {
                    	    	case 1 :
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1016:2: ( (lv_focus_43_0= RULE_ATOM ) ) (otherlv_44= '@' ( (lv_focusNode_45_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_47= ',' )+
                    	    	    {
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1016:2: ( (lv_focus_43_0= RULE_ATOM ) )
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1017:1: (lv_focus_43_0= RULE_ATOM )
                    	    	    {
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1017:1: (lv_focus_43_0= RULE_ATOM )
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1018:3: lv_focus_43_0= RULE_ATOM
                    	    	    {
                    	    	    lv_focus_43_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleAgent2124); 

                    	    	    			newLeafNode(lv_focus_43_0, grammarAccess.getAgentAccess().getFocusATOMTerminalRuleCall_3_2_7_2_0_0()); 
                    	    	    		

                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElement(grammarAccess.getAgentRule());
                    	    	    	        }
                    	    	           		addWithLastConsumed(
                    	    	           			current, 
                    	    	           			"focus",
                    	    	            		lv_focus_43_0, 
                    	    	            		"ATOM");
                    	    	    	    

                    	    	    }


                    	    	    }

                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1034:2: (otherlv_44= '@' ( (lv_focusNode_45_0= RULE_ATOM ) ) )?
                    	    	    int alt35=2;
                    	    	    int LA35_0 = input.LA(1);

                    	    	    if ( (LA35_0==34) ) {
                    	    	        alt35=1;
                    	    	    }
                    	    	    switch (alt35) {
                    	    	        case 1 :
                    	    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1034:4: otherlv_44= '@' ( (lv_focusNode_45_0= RULE_ATOM ) )
                    	    	            {
                    	    	            otherlv_44=(Token)match(input,34,FOLLOW_34_in_ruleAgent2142); 

                    	    	                	newLeafNode(otherlv_44, grammarAccess.getAgentAccess().getCommercialAtKeyword_3_2_7_2_1_0());
                    	    	                
                    	    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1038:1: ( (lv_focusNode_45_0= RULE_ATOM ) )
                    	    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1039:1: (lv_focusNode_45_0= RULE_ATOM )
                    	    	            {
                    	    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1039:1: (lv_focusNode_45_0= RULE_ATOM )
                    	    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1040:3: lv_focusNode_45_0= RULE_ATOM
                    	    	            {
                    	    	            lv_focusNode_45_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleAgent2159); 

                    	    	            			newLeafNode(lv_focusNode_45_0, grammarAccess.getAgentAccess().getFocusNodeATOMTerminalRuleCall_3_2_7_2_1_1_0()); 
                    	    	            		

                    	    	            	        if (current==null) {
                    	    	            	            current = createModelElement(grammarAccess.getAgentRule());
                    	    	            	        }
                    	    	                   		addWithLastConsumed(
                    	    	                   			current, 
                    	    	                   			"focusNode",
                    	    	                    		lv_focusNode_45_0, 
                    	    	                    		"ATOM");
                    	    	            	    

                    	    	            }


                    	    	            }


                    	    	            }
                    	    	            break;

                    	    	    }

                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1056:4: ( ruleEOL | otherlv_47= ',' )+
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
                    	    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1057:5: ruleEOL
                    	    	    	    {
                    	    	    	     
                    	    	    	            newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_7_2_2_0()); 
                    	    	    	        
                    	    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleAgent2183);
                    	    	    	    ruleEOL();

                    	    	    	    state._fsp--;

                    	    	    	     
                    	    	    	            afterParserOrEnumRuleCall();
                    	    	    	        

                    	    	    	    }
                    	    	    	    break;
                    	    	    	case 2 :
                    	    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1065:7: otherlv_47= ','
                    	    	    	    {
                    	    	    	    otherlv_47=(Token)match(input,27,FOLLOW_27_in_ruleAgent2200); 

                    	    	    	        	newLeafNode(otherlv_47, grammarAccess.getAgentAccess().getCommaKeyword_3_2_7_2_2_1());
                    	    	    	        

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
                    	case 9 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1070:6: (otherlv_48= 'join' otherlv_49= ':' ( ( (lv_join_50_0= RULE_ATOM ) ) (otherlv_51= '@' ( (lv_joinNode_52_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_54= ',' )+ )* )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1070:6: (otherlv_48= 'join' otherlv_49= ':' ( ( (lv_join_50_0= RULE_ATOM ) ) (otherlv_51= '@' ( (lv_joinNode_52_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_54= ',' )+ )* )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1070:8: otherlv_48= 'join' otherlv_49= ':' ( ( (lv_join_50_0= RULE_ATOM ) ) (otherlv_51= '@' ( (lv_joinNode_52_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_54= ',' )+ )*
                    	    {
                    	    otherlv_48=(Token)match(input,43,FOLLOW_43_in_ruleAgent2224); 

                    	        	newLeafNode(otherlv_48, grammarAccess.getAgentAccess().getJoinKeyword_3_2_8_0());
                    	        
                    	    otherlv_49=(Token)match(input,29,FOLLOW_29_in_ruleAgent2236); 

                    	        	newLeafNode(otherlv_49, grammarAccess.getAgentAccess().getColonKeyword_3_2_8_1());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1078:1: ( ( (lv_join_50_0= RULE_ATOM ) ) (otherlv_51= '@' ( (lv_joinNode_52_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_54= ',' )+ )*
                    	    loop40:
                    	    do {
                    	        int alt40=2;
                    	        int LA40_0 = input.LA(1);

                    	        if ( (LA40_0==RULE_ATOM) ) {
                    	            int LA40_2 = input.LA(2);

                    	            if ( ((LA40_2>=RULE_NEWLINE && LA40_2<=RULE_SL_COMMENT)||LA40_2==27||LA40_2==34) ) {
                    	                alt40=1;
                    	            }


                    	        }


                    	        switch (alt40) {
                    	    	case 1 :
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1078:2: ( (lv_join_50_0= RULE_ATOM ) ) (otherlv_51= '@' ( (lv_joinNode_52_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_54= ',' )+
                    	    	    {
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1078:2: ( (lv_join_50_0= RULE_ATOM ) )
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1079:1: (lv_join_50_0= RULE_ATOM )
                    	    	    {
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1079:1: (lv_join_50_0= RULE_ATOM )
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1080:3: lv_join_50_0= RULE_ATOM
                    	    	    {
                    	    	    lv_join_50_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleAgent2254); 

                    	    	    			newLeafNode(lv_join_50_0, grammarAccess.getAgentAccess().getJoinATOMTerminalRuleCall_3_2_8_2_0_0()); 
                    	    	    		

                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElement(grammarAccess.getAgentRule());
                    	    	    	        }
                    	    	           		addWithLastConsumed(
                    	    	           			current, 
                    	    	           			"join",
                    	    	            		lv_join_50_0, 
                    	    	            		"ATOM");
                    	    	    	    

                    	    	    }


                    	    	    }

                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1096:2: (otherlv_51= '@' ( (lv_joinNode_52_0= RULE_ATOM ) ) )?
                    	    	    int alt38=2;
                    	    	    int LA38_0 = input.LA(1);

                    	    	    if ( (LA38_0==34) ) {
                    	    	        alt38=1;
                    	    	    }
                    	    	    switch (alt38) {
                    	    	        case 1 :
                    	    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1096:4: otherlv_51= '@' ( (lv_joinNode_52_0= RULE_ATOM ) )
                    	    	            {
                    	    	            otherlv_51=(Token)match(input,34,FOLLOW_34_in_ruleAgent2272); 

                    	    	                	newLeafNode(otherlv_51, grammarAccess.getAgentAccess().getCommercialAtKeyword_3_2_8_2_1_0());
                    	    	                
                    	    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1100:1: ( (lv_joinNode_52_0= RULE_ATOM ) )
                    	    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1101:1: (lv_joinNode_52_0= RULE_ATOM )
                    	    	            {
                    	    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1101:1: (lv_joinNode_52_0= RULE_ATOM )
                    	    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1102:3: lv_joinNode_52_0= RULE_ATOM
                    	    	            {
                    	    	            lv_joinNode_52_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleAgent2289); 

                    	    	            			newLeafNode(lv_joinNode_52_0, grammarAccess.getAgentAccess().getJoinNodeATOMTerminalRuleCall_3_2_8_2_1_1_0()); 
                    	    	            		

                    	    	            	        if (current==null) {
                    	    	            	            current = createModelElement(grammarAccess.getAgentRule());
                    	    	            	        }
                    	    	                   		addWithLastConsumed(
                    	    	                   			current, 
                    	    	                   			"joinNode",
                    	    	                    		lv_joinNode_52_0, 
                    	    	                    		"ATOM");
                    	    	            	    

                    	    	            }


                    	    	            }


                    	    	            }
                    	    	            break;

                    	    	    }

                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1118:4: ( ruleEOL | otherlv_54= ',' )+
                    	    	    int cnt39=0;
                    	    	    loop39:
                    	    	    do {
                    	    	        int alt39=3;
                    	    	        int LA39_0 = input.LA(1);

                    	    	        if ( ((LA39_0>=RULE_NEWLINE && LA39_0<=RULE_SL_COMMENT)) ) {
                    	    	            alt39=1;
                    	    	        }
                    	    	        else if ( (LA39_0==27) ) {
                    	    	            alt39=2;
                    	    	        }


                    	    	        switch (alt39) {
                    	    	    	case 1 :
                    	    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1119:5: ruleEOL
                    	    	    	    {
                    	    	    	     
                    	    	    	            newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_8_2_2_0()); 
                    	    	    	        
                    	    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleAgent2313);
                    	    	    	    ruleEOL();

                    	    	    	    state._fsp--;

                    	    	    	     
                    	    	    	            afterParserOrEnumRuleCall();
                    	    	    	        

                    	    	    	    }
                    	    	    	    break;
                    	    	    	case 2 :
                    	    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1127:7: otherlv_54= ','
                    	    	    	    {
                    	    	    	    otherlv_54=(Token)match(input,27,FOLLOW_27_in_ruleAgent2330); 

                    	    	    	        	newLeafNode(otherlv_54, grammarAccess.getAgentAccess().getCommaKeyword_3_2_8_2_2_1());
                    	    	    	        

                    	    	    	    }
                    	    	    	    break;

                    	    	    	default :
                    	    	    	    if ( cnt39 >= 1 ) break loop39;
                    	    	                EarlyExitException eee =
                    	    	                    new EarlyExitException(39, input);
                    	    	                throw eee;
                    	    	        }
                    	    	        cnt39++;
                    	    	    } while (true);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop40;
                    	        }
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 10 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1132:6: (otherlv_55= 'roles' otherlv_56= ':' ( ( (lv_role_57_0= RULE_ATOM ) ) otherlv_58= 'in' ( (lv_group_59_0= RULE_ATOM ) ) (otherlv_60= '@' ( (lv_groupNode_61_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_63= ',' )+ )* )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1132:6: (otherlv_55= 'roles' otherlv_56= ':' ( ( (lv_role_57_0= RULE_ATOM ) ) otherlv_58= 'in' ( (lv_group_59_0= RULE_ATOM ) ) (otherlv_60= '@' ( (lv_groupNode_61_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_63= ',' )+ )* )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1132:8: otherlv_55= 'roles' otherlv_56= ':' ( ( (lv_role_57_0= RULE_ATOM ) ) otherlv_58= 'in' ( (lv_group_59_0= RULE_ATOM ) ) (otherlv_60= '@' ( (lv_groupNode_61_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_63= ',' )+ )*
                    	    {
                    	    otherlv_55=(Token)match(input,44,FOLLOW_44_in_ruleAgent2354); 

                    	        	newLeafNode(otherlv_55, grammarAccess.getAgentAccess().getRolesKeyword_3_2_9_0());
                    	        
                    	    otherlv_56=(Token)match(input,29,FOLLOW_29_in_ruleAgent2366); 

                    	        	newLeafNode(otherlv_56, grammarAccess.getAgentAccess().getColonKeyword_3_2_9_1());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1140:1: ( ( (lv_role_57_0= RULE_ATOM ) ) otherlv_58= 'in' ( (lv_group_59_0= RULE_ATOM ) ) (otherlv_60= '@' ( (lv_groupNode_61_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_63= ',' )+ )*
                    	    loop43:
                    	    do {
                    	        int alt43=2;
                    	        int LA43_0 = input.LA(1);

                    	        if ( (LA43_0==RULE_ATOM) ) {
                    	            int LA43_2 = input.LA(2);

                    	            if ( (LA43_2==45) ) {
                    	                alt43=1;
                    	            }


                    	        }


                    	        switch (alt43) {
                    	    	case 1 :
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1140:2: ( (lv_role_57_0= RULE_ATOM ) ) otherlv_58= 'in' ( (lv_group_59_0= RULE_ATOM ) ) (otherlv_60= '@' ( (lv_groupNode_61_0= RULE_ATOM ) ) )? ( ruleEOL | otherlv_63= ',' )+
                    	    	    {
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1140:2: ( (lv_role_57_0= RULE_ATOM ) )
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1141:1: (lv_role_57_0= RULE_ATOM )
                    	    	    {
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1141:1: (lv_role_57_0= RULE_ATOM )
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1142:3: lv_role_57_0= RULE_ATOM
                    	    	    {
                    	    	    lv_role_57_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleAgent2384); 

                    	    	    			newLeafNode(lv_role_57_0, grammarAccess.getAgentAccess().getRoleATOMTerminalRuleCall_3_2_9_2_0_0()); 
                    	    	    		

                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElement(grammarAccess.getAgentRule());
                    	    	    	        }
                    	    	           		addWithLastConsumed(
                    	    	           			current, 
                    	    	           			"role",
                    	    	            		lv_role_57_0, 
                    	    	            		"ATOM");
                    	    	    	    

                    	    	    }


                    	    	    }

                    	    	    otherlv_58=(Token)match(input,45,FOLLOW_45_in_ruleAgent2401); 

                    	    	        	newLeafNode(otherlv_58, grammarAccess.getAgentAccess().getInKeyword_3_2_9_2_1());
                    	    	        
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1162:1: ( (lv_group_59_0= RULE_ATOM ) )
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1163:1: (lv_group_59_0= RULE_ATOM )
                    	    	    {
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1163:1: (lv_group_59_0= RULE_ATOM )
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1164:3: lv_group_59_0= RULE_ATOM
                    	    	    {
                    	    	    lv_group_59_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleAgent2418); 

                    	    	    			newLeafNode(lv_group_59_0, grammarAccess.getAgentAccess().getGroupATOMTerminalRuleCall_3_2_9_2_2_0()); 
                    	    	    		

                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElement(grammarAccess.getAgentRule());
                    	    	    	        }
                    	    	           		addWithLastConsumed(
                    	    	           			current, 
                    	    	           			"group",
                    	    	            		lv_group_59_0, 
                    	    	            		"ATOM");
                    	    	    	    

                    	    	    }


                    	    	    }

                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1180:2: (otherlv_60= '@' ( (lv_groupNode_61_0= RULE_ATOM ) ) )?
                    	    	    int alt41=2;
                    	    	    int LA41_0 = input.LA(1);

                    	    	    if ( (LA41_0==34) ) {
                    	    	        alt41=1;
                    	    	    }
                    	    	    switch (alt41) {
                    	    	        case 1 :
                    	    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1180:4: otherlv_60= '@' ( (lv_groupNode_61_0= RULE_ATOM ) )
                    	    	            {
                    	    	            otherlv_60=(Token)match(input,34,FOLLOW_34_in_ruleAgent2436); 

                    	    	                	newLeafNode(otherlv_60, grammarAccess.getAgentAccess().getCommercialAtKeyword_3_2_9_2_3_0());
                    	    	                
                    	    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1184:1: ( (lv_groupNode_61_0= RULE_ATOM ) )
                    	    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1185:1: (lv_groupNode_61_0= RULE_ATOM )
                    	    	            {
                    	    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1185:1: (lv_groupNode_61_0= RULE_ATOM )
                    	    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1186:3: lv_groupNode_61_0= RULE_ATOM
                    	    	            {
                    	    	            lv_groupNode_61_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleAgent2453); 

                    	    	            			newLeafNode(lv_groupNode_61_0, grammarAccess.getAgentAccess().getGroupNodeATOMTerminalRuleCall_3_2_9_2_3_1_0()); 
                    	    	            		

                    	    	            	        if (current==null) {
                    	    	            	            current = createModelElement(grammarAccess.getAgentRule());
                    	    	            	        }
                    	    	                   		addWithLastConsumed(
                    	    	                   			current, 
                    	    	                   			"groupNode",
                    	    	                    		lv_groupNode_61_0, 
                    	    	                    		"ATOM");
                    	    	            	    

                    	    	            }


                    	    	            }


                    	    	            }
                    	    	            break;

                    	    	    }

                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1202:4: ( ruleEOL | otherlv_63= ',' )+
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
                    	    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1203:5: ruleEOL
                    	    	    	    {
                    	    	    	     
                    	    	    	            newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_9_2_4_0()); 
                    	    	    	        
                    	    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleAgent2477);
                    	    	    	    ruleEOL();

                    	    	    	    state._fsp--;

                    	    	    	     
                    	    	    	            afterParserOrEnumRuleCall();
                    	    	    	        

                    	    	    	    }
                    	    	    	    break;
                    	    	    	case 2 :
                    	    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1211:7: otherlv_63= ','
                    	    	    	    {
                    	    	    	    otherlv_63=(Token)match(input,27,FOLLOW_27_in_ruleAgent2494); 

                    	    	    	        	newLeafNode(otherlv_63, grammarAccess.getAgentAccess().getCommaKeyword_3_2_9_2_4_1());
                    	    	    	        

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
                    	case 11 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1216:6: (otherlv_64= 'debug' otherlv_65= ':' ( (lv_debug_66_0= ruleLiteral ) ) ( ruleEOL | otherlv_68= ',' )+ )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1216:6: (otherlv_64= 'debug' otherlv_65= ':' ( (lv_debug_66_0= ruleLiteral ) ) ( ruleEOL | otherlv_68= ',' )+ )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1216:8: otherlv_64= 'debug' otherlv_65= ':' ( (lv_debug_66_0= ruleLiteral ) ) ( ruleEOL | otherlv_68= ',' )+
                    	    {
                    	    otherlv_64=(Token)match(input,46,FOLLOW_46_in_ruleAgent2518); 

                    	        	newLeafNode(otherlv_64, grammarAccess.getAgentAccess().getDebugKeyword_3_2_10_0());
                    	        
                    	    otherlv_65=(Token)match(input,29,FOLLOW_29_in_ruleAgent2530); 

                    	        	newLeafNode(otherlv_65, grammarAccess.getAgentAccess().getColonKeyword_3_2_10_1());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1224:1: ( (lv_debug_66_0= ruleLiteral ) )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1225:1: (lv_debug_66_0= ruleLiteral )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1225:1: (lv_debug_66_0= ruleLiteral )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1226:3: lv_debug_66_0= ruleLiteral
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAgentAccess().getDebugLiteralParserRuleCall_3_2_10_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleLiteral_in_ruleAgent2551);
                    	    lv_debug_66_0=ruleLiteral();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAgentRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"debug",
                    	            		lv_debug_66_0, 
                    	            		"Literal");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1242:2: ( ruleEOL | otherlv_68= ',' )+
                    	    int cnt44=0;
                    	    loop44:
                    	    do {
                    	        int alt44=3;
                    	        int LA44_0 = input.LA(1);

                    	        if ( ((LA44_0>=RULE_NEWLINE && LA44_0<=RULE_SL_COMMENT)) ) {
                    	            alt44=1;
                    	        }
                    	        else if ( (LA44_0==27) ) {
                    	            alt44=2;
                    	        }


                    	        switch (alt44) {
                    	    	case 1 :
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1243:5: ruleEOL
                    	    	    {
                    	    	     
                    	    	            newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_10_3_0()); 
                    	    	        
                    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleAgent2568);
                    	    	    ruleEOL();

                    	    	    state._fsp--;

                    	    	     
                    	    	            afterParserOrEnumRuleCall();
                    	    	        

                    	    	    }
                    	    	    break;
                    	    	case 2 :
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1251:7: otherlv_68= ','
                    	    	    {
                    	    	    otherlv_68=(Token)match(input,27,FOLLOW_27_in_ruleAgent2585); 

                    	    	        	newLeafNode(otherlv_68, grammarAccess.getAgentAccess().getCommaKeyword_3_2_10_3_1());
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt44 >= 1 ) break loop44;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(44, input);
                    	                throw eee;
                    	        }
                    	        cnt44++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 12 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1256:6: (otherlv_69= 'verbose' otherlv_70= ':' ( (lv_verbose_71_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1256:6: (otherlv_69= 'verbose' otherlv_70= ':' ( (lv_verbose_71_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1256:8: otherlv_69= 'verbose' otherlv_70= ':' ( (lv_verbose_71_0= RULE_INT_LITERAL ) ) ( ruleEOL )+
                    	    {
                    	    otherlv_69=(Token)match(input,47,FOLLOW_47_in_ruleAgent2607); 

                    	        	newLeafNode(otherlv_69, grammarAccess.getAgentAccess().getVerboseKeyword_3_2_11_0());
                    	        
                    	    otherlv_70=(Token)match(input,29,FOLLOW_29_in_ruleAgent2619); 

                    	        	newLeafNode(otherlv_70, grammarAccess.getAgentAccess().getColonKeyword_3_2_11_1());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1264:1: ( (lv_verbose_71_0= RULE_INT_LITERAL ) )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1265:1: (lv_verbose_71_0= RULE_INT_LITERAL )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1265:1: (lv_verbose_71_0= RULE_INT_LITERAL )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1266:3: lv_verbose_71_0= RULE_INT_LITERAL
                    	    {
                    	    lv_verbose_71_0=(Token)match(input,RULE_INT_LITERAL,FOLLOW_RULE_INT_LITERAL_in_ruleAgent2636); 

                    	    			newLeafNode(lv_verbose_71_0, grammarAccess.getAgentAccess().getVerboseINT_LITERALTerminalRuleCall_3_2_11_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAgentRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"verbose",
                    	            		lv_verbose_71_0, 
                    	            		"INT_LITERAL");
                    	    	    

                    	    }


                    	    }

                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1282:2: ( ruleEOL )+
                    	    int cnt45=0;
                    	    loop45:
                    	    do {
                    	        int alt45=2;
                    	        int LA45_0 = input.LA(1);

                    	        if ( ((LA45_0>=RULE_NEWLINE && LA45_0<=RULE_SL_COMMENT)) ) {
                    	            alt45=1;
                    	        }


                    	        switch (alt45) {
                    	    	case 1 :
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1283:5: ruleEOL
                    	    	    {
                    	    	     
                    	    	            newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_11_3()); 
                    	    	        
                    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleAgent2658);
                    	    	    ruleEOL();

                    	    	    state._fsp--;

                    	    	     
                    	    	            afterParserOrEnumRuleCall();
                    	    	        

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


                    	    }
                    	    break;
                    	case 13 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1291:6: (otherlv_73= 'nrcbp' otherlv_74= ':' ( (lv_nrcbp_75_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1291:6: (otherlv_73= 'nrcbp' otherlv_74= ':' ( (lv_nrcbp_75_0= RULE_INT_LITERAL ) ) ( ruleEOL )+ )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1291:8: otherlv_73= 'nrcbp' otherlv_74= ':' ( (lv_nrcbp_75_0= RULE_INT_LITERAL ) ) ( ruleEOL )+
                    	    {
                    	    otherlv_73=(Token)match(input,48,FOLLOW_48_in_ruleAgent2679); 

                    	        	newLeafNode(otherlv_73, grammarAccess.getAgentAccess().getNrcbpKeyword_3_2_12_0());
                    	        
                    	    otherlv_74=(Token)match(input,29,FOLLOW_29_in_ruleAgent2691); 

                    	        	newLeafNode(otherlv_74, grammarAccess.getAgentAccess().getColonKeyword_3_2_12_1());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1299:1: ( (lv_nrcbp_75_0= RULE_INT_LITERAL ) )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1300:1: (lv_nrcbp_75_0= RULE_INT_LITERAL )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1300:1: (lv_nrcbp_75_0= RULE_INT_LITERAL )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1301:3: lv_nrcbp_75_0= RULE_INT_LITERAL
                    	    {
                    	    lv_nrcbp_75_0=(Token)match(input,RULE_INT_LITERAL,FOLLOW_RULE_INT_LITERAL_in_ruleAgent2708); 

                    	    			newLeafNode(lv_nrcbp_75_0, grammarAccess.getAgentAccess().getNrcbpINT_LITERALTerminalRuleCall_3_2_12_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAgentRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"nrcbp",
                    	            		lv_nrcbp_75_0, 
                    	            		"INT_LITERAL");
                    	    	    

                    	    }


                    	    }

                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1317:2: ( ruleEOL )+
                    	    int cnt46=0;
                    	    loop46:
                    	    do {
                    	        int alt46=2;
                    	        int LA46_0 = input.LA(1);

                    	        if ( ((LA46_0>=RULE_NEWLINE && LA46_0<=RULE_SL_COMMENT)) ) {
                    	            alt46=1;
                    	        }


                    	        switch (alt46) {
                    	    	case 1 :
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1318:5: ruleEOL
                    	    	    {
                    	    	     
                    	    	            newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_12_3()); 
                    	    	        
                    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleAgent2730);
                    	    	    ruleEOL();

                    	    	    state._fsp--;

                    	    	     
                    	    	            afterParserOrEnumRuleCall();
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt46 >= 1 ) break loop46;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(46, input);
                    	                throw eee;
                    	        }
                    	        cnt46++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 14 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1326:6: (otherlv_77= 'events' otherlv_78= ':' (otherlv_79= 'discard' | otherlv_80= 'requeue' | otherlv_81= 'retrieve' ) ( ruleEOL )+ )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1326:6: (otherlv_77= 'events' otherlv_78= ':' (otherlv_79= 'discard' | otherlv_80= 'requeue' | otherlv_81= 'retrieve' ) ( ruleEOL )+ )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1326:8: otherlv_77= 'events' otherlv_78= ':' (otherlv_79= 'discard' | otherlv_80= 'requeue' | otherlv_81= 'retrieve' ) ( ruleEOL )+
                    	    {
                    	    otherlv_77=(Token)match(input,49,FOLLOW_49_in_ruleAgent2751); 

                    	        	newLeafNode(otherlv_77, grammarAccess.getAgentAccess().getEventsKeyword_3_2_13_0());
                    	        
                    	    otherlv_78=(Token)match(input,29,FOLLOW_29_in_ruleAgent2763); 

                    	        	newLeafNode(otherlv_78, grammarAccess.getAgentAccess().getColonKeyword_3_2_13_1());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1334:1: (otherlv_79= 'discard' | otherlv_80= 'requeue' | otherlv_81= 'retrieve' )
                    	    int alt47=3;
                    	    switch ( input.LA(1) ) {
                    	    case 50:
                    	        {
                    	        alt47=1;
                    	        }
                    	        break;
                    	    case 51:
                    	        {
                    	        alt47=2;
                    	        }
                    	        break;
                    	    case 52:
                    	        {
                    	        alt47=3;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 47, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt47) {
                    	        case 1 :
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1334:3: otherlv_79= 'discard'
                    	            {
                    	            otherlv_79=(Token)match(input,50,FOLLOW_50_in_ruleAgent2776); 

                    	                	newLeafNode(otherlv_79, grammarAccess.getAgentAccess().getDiscardKeyword_3_2_13_2_0());
                    	                

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1339:7: otherlv_80= 'requeue'
                    	            {
                    	            otherlv_80=(Token)match(input,51,FOLLOW_51_in_ruleAgent2794); 

                    	                	newLeafNode(otherlv_80, grammarAccess.getAgentAccess().getRequeueKeyword_3_2_13_2_1());
                    	                

                    	            }
                    	            break;
                    	        case 3 :
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1344:7: otherlv_81= 'retrieve'
                    	            {
                    	            otherlv_81=(Token)match(input,52,FOLLOW_52_in_ruleAgent2812); 

                    	                	newLeafNode(otherlv_81, grammarAccess.getAgentAccess().getRetrieveKeyword_3_2_13_2_2());
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1348:2: ( ruleEOL )+
                    	    int cnt48=0;
                    	    loop48:
                    	    do {
                    	        int alt48=2;
                    	        int LA48_0 = input.LA(1);

                    	        if ( ((LA48_0>=RULE_NEWLINE && LA48_0<=RULE_SL_COMMENT)) ) {
                    	            alt48=1;
                    	        }


                    	        switch (alt48) {
                    	    	case 1 :
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1349:5: ruleEOL
                    	    	    {
                    	    	     
                    	    	            newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_13_3()); 
                    	    	        
                    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleAgent2830);
                    	    	    ruleEOL();

                    	    	    state._fsp--;

                    	    	     
                    	    	            afterParserOrEnumRuleCall();
                    	    	        

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


                    	    }
                    	    break;
                    	case 15 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1357:6: (otherlv_83= 'intBels' otherlv_84= ':' (otherlv_85= 'sameFocus' | otherlv_86= 'newFocus' ) ( ruleEOL )+ )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1357:6: (otherlv_83= 'intBels' otherlv_84= ':' (otherlv_85= 'sameFocus' | otherlv_86= 'newFocus' ) ( ruleEOL )+ )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1357:8: otherlv_83= 'intBels' otherlv_84= ':' (otherlv_85= 'sameFocus' | otherlv_86= 'newFocus' ) ( ruleEOL )+
                    	    {
                    	    otherlv_83=(Token)match(input,53,FOLLOW_53_in_ruleAgent2851); 

                    	        	newLeafNode(otherlv_83, grammarAccess.getAgentAccess().getIntBelsKeyword_3_2_14_0());
                    	        
                    	    otherlv_84=(Token)match(input,29,FOLLOW_29_in_ruleAgent2863); 

                    	        	newLeafNode(otherlv_84, grammarAccess.getAgentAccess().getColonKeyword_3_2_14_1());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1365:1: (otherlv_85= 'sameFocus' | otherlv_86= 'newFocus' )
                    	    int alt49=2;
                    	    int LA49_0 = input.LA(1);

                    	    if ( (LA49_0==54) ) {
                    	        alt49=1;
                    	    }
                    	    else if ( (LA49_0==55) ) {
                    	        alt49=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 49, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt49) {
                    	        case 1 :
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1365:3: otherlv_85= 'sameFocus'
                    	            {
                    	            otherlv_85=(Token)match(input,54,FOLLOW_54_in_ruleAgent2876); 

                    	                	newLeafNode(otherlv_85, grammarAccess.getAgentAccess().getSameFocusKeyword_3_2_14_2_0());
                    	                

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1370:7: otherlv_86= 'newFocus'
                    	            {
                    	            otherlv_86=(Token)match(input,55,FOLLOW_55_in_ruleAgent2894); 

                    	                	newLeafNode(otherlv_86, grammarAccess.getAgentAccess().getNewFocusKeyword_3_2_14_2_1());
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1374:2: ( ruleEOL )+
                    	    int cnt50=0;
                    	    loop50:
                    	    do {
                    	        int alt50=2;
                    	        int LA50_0 = input.LA(1);

                    	        if ( ((LA50_0>=RULE_NEWLINE && LA50_0<=RULE_SL_COMMENT)) ) {
                    	            alt50=1;
                    	        }


                    	        switch (alt50) {
                    	    	case 1 :
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1375:5: ruleEOL
                    	    	    {
                    	    	     
                    	    	            newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_14_3()); 
                    	    	        
                    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleAgent2912);
                    	    	    ruleEOL();

                    	    	    state._fsp--;

                    	    	     
                    	    	            afterParserOrEnumRuleCall();
                    	    	        

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
                    	case 16 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1383:6: ( ( (lv_other_88_0= RULE_ATOM ) ) otherlv_89= ':' ( ( (lv_string_90_0= RULE_STRING ) ) | ( (lv_val_91_0= RULE_INT_LITERAL ) ) | ( (lv_literal_92_0= ruleLiteral ) ) | ( (lv_val_real_93_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1383:6: ( ( (lv_other_88_0= RULE_ATOM ) ) otherlv_89= ':' ( ( (lv_string_90_0= RULE_STRING ) ) | ( (lv_val_91_0= RULE_INT_LITERAL ) ) | ( (lv_literal_92_0= ruleLiteral ) ) | ( (lv_val_real_93_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1383:7: ( (lv_other_88_0= RULE_ATOM ) ) otherlv_89= ':' ( ( (lv_string_90_0= RULE_STRING ) ) | ( (lv_val_91_0= RULE_INT_LITERAL ) ) | ( (lv_literal_92_0= ruleLiteral ) ) | ( (lv_val_real_93_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1383:7: ( (lv_other_88_0= RULE_ATOM ) )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1384:1: (lv_other_88_0= RULE_ATOM )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1384:1: (lv_other_88_0= RULE_ATOM )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1385:3: lv_other_88_0= RULE_ATOM
                    	    {
                    	    lv_other_88_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleAgent2938); 

                    	    			newLeafNode(lv_other_88_0, grammarAccess.getAgentAccess().getOtherATOMTerminalRuleCall_3_2_15_0_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getAgentRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"other",
                    	            		lv_other_88_0, 
                    	            		"ATOM");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_89=(Token)match(input,29,FOLLOW_29_in_ruleAgent2955); 

                    	        	newLeafNode(otherlv_89, grammarAccess.getAgentAccess().getColonKeyword_3_2_15_1());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1405:1: ( ( (lv_string_90_0= RULE_STRING ) ) | ( (lv_val_91_0= RULE_INT_LITERAL ) ) | ( (lv_literal_92_0= ruleLiteral ) ) | ( (lv_val_real_93_0= RULE_REAL_LITERAL ) ) )
                    	    int alt51=4;
                    	    switch ( input.LA(1) ) {
                    	    case RULE_STRING:
                    	        {
                    	        alt51=1;
                    	        }
                    	        break;
                    	    case RULE_INT_LITERAL:
                    	        {
                    	        alt51=2;
                    	        }
                    	        break;
                    	    case RULE_ATOM:
                    	    case RULE_VART:
                    	    case RULE_UNNAMEDVART:
                    	    case 75:
                    	    case 76:
                    	    case 77:
                    	    case 78:
                    	    case 79:
                    	        {
                    	        alt51=3;
                    	        }
                    	        break;
                    	    case RULE_REAL_LITERAL:
                    	        {
                    	        alt51=4;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 51, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt51) {
                    	        case 1 :
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1405:2: ( (lv_string_90_0= RULE_STRING ) )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1405:2: ( (lv_string_90_0= RULE_STRING ) )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1406:1: (lv_string_90_0= RULE_STRING )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1406:1: (lv_string_90_0= RULE_STRING )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1407:3: lv_string_90_0= RULE_STRING
                    	            {
                    	            lv_string_90_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAgent2973); 

                    	            			newLeafNode(lv_string_90_0, grammarAccess.getAgentAccess().getStringSTRINGTerminalRuleCall_3_2_15_2_0_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getAgentRule());
                    	            	        }
                    	                   		addWithLastConsumed(
                    	                   			current, 
                    	                   			"string",
                    	                    		lv_string_90_0, 
                    	                    		"STRING");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1424:6: ( (lv_val_91_0= RULE_INT_LITERAL ) )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1424:6: ( (lv_val_91_0= RULE_INT_LITERAL ) )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1425:1: (lv_val_91_0= RULE_INT_LITERAL )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1425:1: (lv_val_91_0= RULE_INT_LITERAL )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1426:3: lv_val_91_0= RULE_INT_LITERAL
                    	            {
                    	            lv_val_91_0=(Token)match(input,RULE_INT_LITERAL,FOLLOW_RULE_INT_LITERAL_in_ruleAgent3001); 

                    	            			newLeafNode(lv_val_91_0, grammarAccess.getAgentAccess().getValINT_LITERALTerminalRuleCall_3_2_15_2_1_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getAgentRule());
                    	            	        }
                    	                   		addWithLastConsumed(
                    	                   			current, 
                    	                   			"val",
                    	                    		lv_val_91_0, 
                    	                    		"INT_LITERAL");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 3 :
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1443:6: ( (lv_literal_92_0= ruleLiteral ) )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1443:6: ( (lv_literal_92_0= ruleLiteral ) )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1444:1: (lv_literal_92_0= ruleLiteral )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1444:1: (lv_literal_92_0= ruleLiteral )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1445:3: lv_literal_92_0= ruleLiteral
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getAgentAccess().getLiteralLiteralParserRuleCall_3_2_15_2_2_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleLiteral_in_ruleAgent3033);
                    	            lv_literal_92_0=ruleLiteral();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getAgentRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"literal",
                    	                    		lv_literal_92_0, 
                    	                    		"Literal");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 4 :
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1462:6: ( (lv_val_real_93_0= RULE_REAL_LITERAL ) )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1462:6: ( (lv_val_real_93_0= RULE_REAL_LITERAL ) )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1463:1: (lv_val_real_93_0= RULE_REAL_LITERAL )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1463:1: (lv_val_real_93_0= RULE_REAL_LITERAL )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1464:3: lv_val_real_93_0= RULE_REAL_LITERAL
                    	            {
                    	            lv_val_real_93_0=(Token)match(input,RULE_REAL_LITERAL,FOLLOW_RULE_REAL_LITERAL_in_ruleAgent3056); 

                    	            			newLeafNode(lv_val_real_93_0, grammarAccess.getAgentAccess().getVal_realREAL_LITERALTerminalRuleCall_3_2_15_2_3_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getAgentRule());
                    	            	        }
                    	                   		addWithLastConsumed(
                    	                   			current, 
                    	                   			"val_real",
                    	                    		lv_val_real_93_0, 
                    	                    		"REAL_LITERAL");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1480:3: ( ruleEOL )+
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
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1481:5: ruleEOL
                    	    	    {
                    	    	     
                    	    	            newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_3_2_15_3()); 
                    	    	        
                    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleAgent3079);
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

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    otherlv_95=(Token)match(input,25,FOLLOW_25_in_ruleAgent3095); 

                        	newLeafNode(otherlv_95, grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_3_3());
                        

                    }
                    break;

            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1492:3: ( ruleEOL )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=RULE_NEWLINE && LA55_0<=RULE_SL_COMMENT)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1493:5: ruleEOL
            	    {
            	     
            	            newCompositeNode(grammarAccess.getAgentAccess().getEOLParserRuleCall_4()); 
            	        
            	    pushFollow(FOLLOW_ruleEOL_in_ruleAgent3114);
            	    ruleEOL();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1508:1: entryRuleWorkspace returns [EObject current=null] : iv_ruleWorkspace= ruleWorkspace EOF ;
    public final EObject entryRuleWorkspace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkspace = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1509:2: (iv_ruleWorkspace= ruleWorkspace EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1510:2: iv_ruleWorkspace= ruleWorkspace EOF
            {
             newCompositeNode(grammarAccess.getWorkspaceRule()); 
            pushFollow(FOLLOW_ruleWorkspace_in_entryRuleWorkspace3151);
            iv_ruleWorkspace=ruleWorkspace();

            state._fsp--;

             current =iv_ruleWorkspace; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkspace3161); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1517:1: ruleWorkspace returns [EObject current=null] : (otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= '{' ( ruleEOL )* ( ( (lv_artifact_4_0= ruleArtifact ) ) | (otherlv_5= 'agents' otherlv_6= ':' ( ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' ) ( ruleEOL | otherlv_10= ',' )+ )* ) | (otherlv_11= 'debug' (otherlv_12= ':' ( (lv_debug_13_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( (lv_node_15_0= ruleONode ) ) )* otherlv_16= '}' ( ruleEOL )* ) ;
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
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1520:28: ( (otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= '{' ( ruleEOL )* ( ( (lv_artifact_4_0= ruleArtifact ) ) | (otherlv_5= 'agents' otherlv_6= ':' ( ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' ) ( ruleEOL | otherlv_10= ',' )+ )* ) | (otherlv_11= 'debug' (otherlv_12= ':' ( (lv_debug_13_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( (lv_node_15_0= ruleONode ) ) )* otherlv_16= '}' ( ruleEOL )* ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1521:1: (otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= '{' ( ruleEOL )* ( ( (lv_artifact_4_0= ruleArtifact ) ) | (otherlv_5= 'agents' otherlv_6= ':' ( ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' ) ( ruleEOL | otherlv_10= ',' )+ )* ) | (otherlv_11= 'debug' (otherlv_12= ':' ( (lv_debug_13_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( (lv_node_15_0= ruleONode ) ) )* otherlv_16= '}' ( ruleEOL )* )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1521:1: (otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= '{' ( ruleEOL )* ( ( (lv_artifact_4_0= ruleArtifact ) ) | (otherlv_5= 'agents' otherlv_6= ':' ( ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' ) ( ruleEOL | otherlv_10= ',' )+ )* ) | (otherlv_11= 'debug' (otherlv_12= ':' ( (lv_debug_13_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( (lv_node_15_0= ruleONode ) ) )* otherlv_16= '}' ( ruleEOL )* )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1521:3: otherlv_0= 'workspace' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= '{' ( ruleEOL )* ( ( (lv_artifact_4_0= ruleArtifact ) ) | (otherlv_5= 'agents' otherlv_6= ':' ( ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' ) ( ruleEOL | otherlv_10= ',' )+ )* ) | (otherlv_11= 'debug' (otherlv_12= ':' ( (lv_debug_13_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( (lv_node_15_0= ruleONode ) ) )* otherlv_16= '}' ( ruleEOL )*
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleWorkspace3198); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkspaceAccess().getWorkspaceKeyword_0());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1525:1: ( (lv_name_1_0= RULE_ATOM ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1526:1: (lv_name_1_0= RULE_ATOM )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1526:1: (lv_name_1_0= RULE_ATOM )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1527:3: lv_name_1_0= RULE_ATOM
            {
            lv_name_1_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleWorkspace3215); 

            			newLeafNode(lv_name_1_0, grammarAccess.getWorkspaceAccess().getNameATOMTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkspaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ATOM");
            	    

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleWorkspace3232); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkspaceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1547:1: ( ruleEOL )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=RULE_NEWLINE && LA56_0<=RULE_SL_COMMENT)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1548:5: ruleEOL
            	    {
            	     
            	            newCompositeNode(grammarAccess.getWorkspaceAccess().getEOLParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleEOL_in_ruleWorkspace3249);
            	    ruleEOL();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1555:3: ( ( (lv_artifact_4_0= ruleArtifact ) ) | (otherlv_5= 'agents' otherlv_6= ':' ( ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' ) ( ruleEOL | otherlv_10= ',' )+ )* ) | (otherlv_11= 'debug' (otherlv_12= ':' ( (lv_debug_13_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( (lv_node_15_0= ruleONode ) ) )*
            loop62:
            do {
                int alt62=5;
                switch ( input.LA(1) ) {
                case 59:
                    {
                    alt62=1;
                    }
                    break;
                case 57:
                    {
                    alt62=2;
                    }
                    break;
                case 46:
                    {
                    alt62=3;
                    }
                    break;
                case 32:
                    {
                    alt62=4;
                    }
                    break;

                }

                switch (alt62) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1555:4: ( (lv_artifact_4_0= ruleArtifact ) )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1555:4: ( (lv_artifact_4_0= ruleArtifact ) )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1556:1: (lv_artifact_4_0= ruleArtifact )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1556:1: (lv_artifact_4_0= ruleArtifact )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1557:3: lv_artifact_4_0= ruleArtifact
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWorkspaceAccess().getArtifactArtifactParserRuleCall_4_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleArtifact_in_ruleWorkspace3272);
            	    lv_artifact_4_0=ruleArtifact();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWorkspaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"artifact",
            	            		lv_artifact_4_0, 
            	            		"Artifact");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1574:6: (otherlv_5= 'agents' otherlv_6= ':' ( ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' ) ( ruleEOL | otherlv_10= ',' )+ )* )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1574:6: (otherlv_5= 'agents' otherlv_6= ':' ( ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' ) ( ruleEOL | otherlv_10= ',' )+ )* )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1574:8: otherlv_5= 'agents' otherlv_6= ':' ( ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' ) ( ruleEOL | otherlv_10= ',' )+ )*
            	    {
            	    otherlv_5=(Token)match(input,57,FOLLOW_57_in_ruleWorkspace3291); 

            	        	newLeafNode(otherlv_5, grammarAccess.getWorkspaceAccess().getAgentsKeyword_4_1_0());
            	        
            	    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleWorkspace3303); 

            	        	newLeafNode(otherlv_6, grammarAccess.getWorkspaceAccess().getColonKeyword_4_1_1());
            	        
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1582:1: ( ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' ) ( ruleEOL | otherlv_10= ',' )+ )*
            	    loop59:
            	    do {
            	        int alt59=2;
            	        int LA59_0 = input.LA(1);

            	        if ( (LA59_0==RULE_ATOM||LA59_0==58) ) {
            	            alt59=1;
            	        }


            	        switch (alt59) {
            	    	case 1 :
            	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1582:2: ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' ) ( ruleEOL | otherlv_10= ',' )+
            	    	    {
            	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1582:2: ( ( (lv_agent_7_0= RULE_ATOM ) ) | otherlv_8= '*' )
            	    	    int alt57=2;
            	    	    int LA57_0 = input.LA(1);

            	    	    if ( (LA57_0==RULE_ATOM) ) {
            	    	        alt57=1;
            	    	    }
            	    	    else if ( (LA57_0==58) ) {
            	    	        alt57=2;
            	    	    }
            	    	    else {
            	    	        NoViableAltException nvae =
            	    	            new NoViableAltException("", 57, 0, input);

            	    	        throw nvae;
            	    	    }
            	    	    switch (alt57) {
            	    	        case 1 :
            	    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1582:3: ( (lv_agent_7_0= RULE_ATOM ) )
            	    	            {
            	    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1582:3: ( (lv_agent_7_0= RULE_ATOM ) )
            	    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1583:1: (lv_agent_7_0= RULE_ATOM )
            	    	            {
            	    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1583:1: (lv_agent_7_0= RULE_ATOM )
            	    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1584:3: lv_agent_7_0= RULE_ATOM
            	    	            {
            	    	            lv_agent_7_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleWorkspace3322); 

            	    	            			newLeafNode(lv_agent_7_0, grammarAccess.getWorkspaceAccess().getAgentATOMTerminalRuleCall_4_1_2_0_0_0()); 
            	    	            		

            	    	            	        if (current==null) {
            	    	            	            current = createModelElement(grammarAccess.getWorkspaceRule());
            	    	            	        }
            	    	                   		addWithLastConsumed(
            	    	                   			current, 
            	    	                   			"agent",
            	    	                    		lv_agent_7_0, 
            	    	                    		"ATOM");
            	    	            	    

            	    	            }


            	    	            }


            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1601:7: otherlv_8= '*'
            	    	            {
            	    	            otherlv_8=(Token)match(input,58,FOLLOW_58_in_ruleWorkspace3345); 

            	    	                	newLeafNode(otherlv_8, grammarAccess.getWorkspaceAccess().getAsteriskKeyword_4_1_2_0_1());
            	    	                

            	    	            }
            	    	            break;

            	    	    }

            	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1605:2: ( ruleEOL | otherlv_10= ',' )+
            	    	    int cnt58=0;
            	    	    loop58:
            	    	    do {
            	    	        int alt58=3;
            	    	        int LA58_0 = input.LA(1);

            	    	        if ( ((LA58_0>=RULE_NEWLINE && LA58_0<=RULE_SL_COMMENT)) ) {
            	    	            alt58=1;
            	    	        }
            	    	        else if ( (LA58_0==27) ) {
            	    	            alt58=2;
            	    	        }


            	    	        switch (alt58) {
            	    	    	case 1 :
            	    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1606:5: ruleEOL
            	    	    	    {
            	    	    	     
            	    	    	            newCompositeNode(grammarAccess.getWorkspaceAccess().getEOLParserRuleCall_4_1_2_1_0()); 
            	    	    	        
            	    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleWorkspace3363);
            	    	    	    ruleEOL();

            	    	    	    state._fsp--;

            	    	    	     
            	    	    	            afterParserOrEnumRuleCall();
            	    	    	        

            	    	    	    }
            	    	    	    break;
            	    	    	case 2 :
            	    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1614:7: otherlv_10= ','
            	    	    	    {
            	    	    	    otherlv_10=(Token)match(input,27,FOLLOW_27_in_ruleWorkspace3380); 

            	    	    	        	newLeafNode(otherlv_10, grammarAccess.getWorkspaceAccess().getCommaKeyword_4_1_2_1_1());
            	    	    	        

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
            	    	    break;

            	    	default :
            	    	    break loop59;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1619:6: (otherlv_11= 'debug' (otherlv_12= ':' ( (lv_debug_13_0= ruleLiteral ) ) )? ( ruleEOL )+ )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1619:6: (otherlv_11= 'debug' (otherlv_12= ':' ( (lv_debug_13_0= ruleLiteral ) ) )? ( ruleEOL )+ )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1619:8: otherlv_11= 'debug' (otherlv_12= ':' ( (lv_debug_13_0= ruleLiteral ) ) )? ( ruleEOL )+
            	    {
            	    otherlv_11=(Token)match(input,46,FOLLOW_46_in_ruleWorkspace3404); 

            	        	newLeafNode(otherlv_11, grammarAccess.getWorkspaceAccess().getDebugKeyword_4_2_0());
            	        
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1623:1: (otherlv_12= ':' ( (lv_debug_13_0= ruleLiteral ) ) )?
            	    int alt60=2;
            	    int LA60_0 = input.LA(1);

            	    if ( (LA60_0==29) ) {
            	        alt60=1;
            	    }
            	    switch (alt60) {
            	        case 1 :
            	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1623:3: otherlv_12= ':' ( (lv_debug_13_0= ruleLiteral ) )
            	            {
            	            otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleWorkspace3417); 

            	                	newLeafNode(otherlv_12, grammarAccess.getWorkspaceAccess().getColonKeyword_4_2_1_0());
            	                
            	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1627:1: ( (lv_debug_13_0= ruleLiteral ) )
            	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1628:1: (lv_debug_13_0= ruleLiteral )
            	            {
            	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1628:1: (lv_debug_13_0= ruleLiteral )
            	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1629:3: lv_debug_13_0= ruleLiteral
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getWorkspaceAccess().getDebugLiteralParserRuleCall_4_2_1_1_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleLiteral_in_ruleWorkspace3438);
            	            lv_debug_13_0=ruleLiteral();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getWorkspaceRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"debug",
            	                    		lv_debug_13_0, 
            	                    		"Literal");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1645:4: ( ruleEOL )+
            	    int cnt61=0;
            	    loop61:
            	    do {
            	        int alt61=2;
            	        int LA61_0 = input.LA(1);

            	        if ( ((LA61_0>=RULE_NEWLINE && LA61_0<=RULE_SL_COMMENT)) ) {
            	            alt61=1;
            	        }


            	        switch (alt61) {
            	    	case 1 :
            	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1646:5: ruleEOL
            	    	    {
            	    	     
            	    	            newCompositeNode(grammarAccess.getWorkspaceAccess().getEOLParserRuleCall_4_2_2()); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleEOL_in_ruleWorkspace3457);
            	    	    ruleEOL();

            	    	    state._fsp--;

            	    	     
            	    	            afterParserOrEnumRuleCall();
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt61 >= 1 ) break loop61;
            	                EarlyExitException eee =
            	                    new EarlyExitException(61, input);
            	                throw eee;
            	        }
            	        cnt61++;
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1654:6: ( (lv_node_15_0= ruleONode ) )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1654:6: ( (lv_node_15_0= ruleONode ) )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1655:1: (lv_node_15_0= ruleONode )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1655:1: (lv_node_15_0= ruleONode )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1656:3: lv_node_15_0= ruleONode
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWorkspaceAccess().getNodeONodeParserRuleCall_4_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleONode_in_ruleWorkspace3486);
            	    lv_node_15_0=ruleONode();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWorkspaceRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"node",
            	            		lv_node_15_0, 
            	            		"ONode");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            otherlv_16=(Token)match(input,25,FOLLOW_25_in_ruleWorkspace3500); 

                	newLeafNode(otherlv_16, grammarAccess.getWorkspaceAccess().getRightCurlyBracketKeyword_5());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1676:1: ( ruleEOL )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=RULE_NEWLINE && LA63_0<=RULE_SL_COMMENT)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1677:5: ruleEOL
            	    {
            	     
            	            newCompositeNode(grammarAccess.getWorkspaceAccess().getEOLParserRuleCall_6()); 
            	        
            	    pushFollow(FOLLOW_ruleEOL_in_ruleWorkspace3517);
            	    ruleEOL();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop63;
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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1692:1: entryRuleArtifact returns [EObject current=null] : iv_ruleArtifact= ruleArtifact EOF ;
    public final EObject entryRuleArtifact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArtifact = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1693:2: (iv_ruleArtifact= ruleArtifact EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1694:2: iv_ruleArtifact= ruleArtifact EOF
            {
             newCompositeNode(grammarAccess.getArtifactRule()); 
            pushFollow(FOLLOW_ruleArtifact_in_entryRuleArtifact3554);
            iv_ruleArtifact=ruleArtifact();

            state._fsp--;

             current =iv_ruleArtifact; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArtifact3564); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1701:1: ruleArtifact returns [EObject current=null] : (otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_classDef_3_0= ruleClassDef ) ) (otherlv_4= '{' ( ruleEOL )* (otherlv_6= 'focused-by' otherlv_7= ':' ( ( ( (lv_agent_8_0= RULE_ATOM ) ) | otherlv_9= '*' ) ( ruleEOL | otherlv_11= ',' )+ )* )? otherlv_12= '}' )? ( ruleEOL )* ) ;
    public final EObject ruleArtifact() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_agent_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_classDef_3_0 = null;


         enterRule(); 
            
        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1704:28: ( (otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_classDef_3_0= ruleClassDef ) ) (otherlv_4= '{' ( ruleEOL )* (otherlv_6= 'focused-by' otherlv_7= ':' ( ( ( (lv_agent_8_0= RULE_ATOM ) ) | otherlv_9= '*' ) ( ruleEOL | otherlv_11= ',' )+ )* )? otherlv_12= '}' )? ( ruleEOL )* ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1705:1: (otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_classDef_3_0= ruleClassDef ) ) (otherlv_4= '{' ( ruleEOL )* (otherlv_6= 'focused-by' otherlv_7= ':' ( ( ( (lv_agent_8_0= RULE_ATOM ) ) | otherlv_9= '*' ) ( ruleEOL | otherlv_11= ',' )+ )* )? otherlv_12= '}' )? ( ruleEOL )* )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1705:1: (otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_classDef_3_0= ruleClassDef ) ) (otherlv_4= '{' ( ruleEOL )* (otherlv_6= 'focused-by' otherlv_7= ':' ( ( ( (lv_agent_8_0= RULE_ATOM ) ) | otherlv_9= '*' ) ( ruleEOL | otherlv_11= ',' )+ )* )? otherlv_12= '}' )? ( ruleEOL )* )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1705:3: otherlv_0= 'artifact' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_classDef_3_0= ruleClassDef ) ) (otherlv_4= '{' ( ruleEOL )* (otherlv_6= 'focused-by' otherlv_7= ':' ( ( ( (lv_agent_8_0= RULE_ATOM ) ) | otherlv_9= '*' ) ( ruleEOL | otherlv_11= ',' )+ )* )? otherlv_12= '}' )? ( ruleEOL )*
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleArtifact3601); 

                	newLeafNode(otherlv_0, grammarAccess.getArtifactAccess().getArtifactKeyword_0());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1709:1: ( (lv_name_1_0= RULE_ATOM ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1710:1: (lv_name_1_0= RULE_ATOM )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1710:1: (lv_name_1_0= RULE_ATOM )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1711:3: lv_name_1_0= RULE_ATOM
            {
            lv_name_1_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleArtifact3618); 

            			newLeafNode(lv_name_1_0, grammarAccess.getArtifactAccess().getNameATOMTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArtifactRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ATOM");
            	    

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleArtifact3635); 

                	newLeafNode(otherlv_2, grammarAccess.getArtifactAccess().getColonKeyword_2());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1731:1: ( (lv_classDef_3_0= ruleClassDef ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1732:1: (lv_classDef_3_0= ruleClassDef )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1732:1: (lv_classDef_3_0= ruleClassDef )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1733:3: lv_classDef_3_0= ruleClassDef
            {
             
            	        newCompositeNode(grammarAccess.getArtifactAccess().getClassDefClassDefParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleClassDef_in_ruleArtifact3656);
            lv_classDef_3_0=ruleClassDef();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArtifactRule());
            	        }
                   		set(
                   			current, 
                   			"classDef",
                    		lv_classDef_3_0, 
                    		"ClassDef");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1749:2: (otherlv_4= '{' ( ruleEOL )* (otherlv_6= 'focused-by' otherlv_7= ':' ( ( ( (lv_agent_8_0= RULE_ATOM ) ) | otherlv_9= '*' ) ( ruleEOL | otherlv_11= ',' )+ )* )? otherlv_12= '}' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==24) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1749:4: otherlv_4= '{' ( ruleEOL )* (otherlv_6= 'focused-by' otherlv_7= ':' ( ( ( (lv_agent_8_0= RULE_ATOM ) ) | otherlv_9= '*' ) ( ruleEOL | otherlv_11= ',' )+ )* )? otherlv_12= '}'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleArtifact3669); 

                        	newLeafNode(otherlv_4, grammarAccess.getArtifactAccess().getLeftCurlyBracketKeyword_4_0());
                        
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1753:1: ( ruleEOL )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( ((LA64_0>=RULE_NEWLINE && LA64_0<=RULE_SL_COMMENT)) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1754:5: ruleEOL
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getArtifactAccess().getEOLParserRuleCall_4_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleEOL_in_ruleArtifact3686);
                    	    ruleEOL();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);

                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1761:3: (otherlv_6= 'focused-by' otherlv_7= ':' ( ( ( (lv_agent_8_0= RULE_ATOM ) ) | otherlv_9= '*' ) ( ruleEOL | otherlv_11= ',' )+ )* )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==60) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1761:5: otherlv_6= 'focused-by' otherlv_7= ':' ( ( ( (lv_agent_8_0= RULE_ATOM ) ) | otherlv_9= '*' ) ( ruleEOL | otherlv_11= ',' )+ )*
                            {
                            otherlv_6=(Token)match(input,60,FOLLOW_60_in_ruleArtifact3700); 

                                	newLeafNode(otherlv_6, grammarAccess.getArtifactAccess().getFocusedByKeyword_4_2_0());
                                
                            otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleArtifact3712); 

                                	newLeafNode(otherlv_7, grammarAccess.getArtifactAccess().getColonKeyword_4_2_1());
                                
                            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1769:1: ( ( ( (lv_agent_8_0= RULE_ATOM ) ) | otherlv_9= '*' ) ( ruleEOL | otherlv_11= ',' )+ )*
                            loop67:
                            do {
                                int alt67=2;
                                int LA67_0 = input.LA(1);

                                if ( (LA67_0==RULE_ATOM||LA67_0==58) ) {
                                    alt67=1;
                                }


                                switch (alt67) {
                            	case 1 :
                            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1769:2: ( ( (lv_agent_8_0= RULE_ATOM ) ) | otherlv_9= '*' ) ( ruleEOL | otherlv_11= ',' )+
                            	    {
                            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1769:2: ( ( (lv_agent_8_0= RULE_ATOM ) ) | otherlv_9= '*' )
                            	    int alt65=2;
                            	    int LA65_0 = input.LA(1);

                            	    if ( (LA65_0==RULE_ATOM) ) {
                            	        alt65=1;
                            	    }
                            	    else if ( (LA65_0==58) ) {
                            	        alt65=2;
                            	    }
                            	    else {
                            	        NoViableAltException nvae =
                            	            new NoViableAltException("", 65, 0, input);

                            	        throw nvae;
                            	    }
                            	    switch (alt65) {
                            	        case 1 :
                            	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1769:3: ( (lv_agent_8_0= RULE_ATOM ) )
                            	            {
                            	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1769:3: ( (lv_agent_8_0= RULE_ATOM ) )
                            	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1770:1: (lv_agent_8_0= RULE_ATOM )
                            	            {
                            	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1770:1: (lv_agent_8_0= RULE_ATOM )
                            	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1771:3: lv_agent_8_0= RULE_ATOM
                            	            {
                            	            lv_agent_8_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleArtifact3731); 

                            	            			newLeafNode(lv_agent_8_0, grammarAccess.getArtifactAccess().getAgentATOMTerminalRuleCall_4_2_2_0_0_0()); 
                            	            		

                            	            	        if (current==null) {
                            	            	            current = createModelElement(grammarAccess.getArtifactRule());
                            	            	        }
                            	                   		addWithLastConsumed(
                            	                   			current, 
                            	                   			"agent",
                            	                    		lv_agent_8_0, 
                            	                    		"ATOM");
                            	            	    

                            	            }


                            	            }


                            	            }
                            	            break;
                            	        case 2 :
                            	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1788:7: otherlv_9= '*'
                            	            {
                            	            otherlv_9=(Token)match(input,58,FOLLOW_58_in_ruleArtifact3754); 

                            	                	newLeafNode(otherlv_9, grammarAccess.getArtifactAccess().getAsteriskKeyword_4_2_2_0_1());
                            	                

                            	            }
                            	            break;

                            	    }

                            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1792:2: ( ruleEOL | otherlv_11= ',' )+
                            	    int cnt66=0;
                            	    loop66:
                            	    do {
                            	        int alt66=3;
                            	        int LA66_0 = input.LA(1);

                            	        if ( ((LA66_0>=RULE_NEWLINE && LA66_0<=RULE_SL_COMMENT)) ) {
                            	            alt66=1;
                            	        }
                            	        else if ( (LA66_0==27) ) {
                            	            alt66=2;
                            	        }


                            	        switch (alt66) {
                            	    	case 1 :
                            	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1793:5: ruleEOL
                            	    	    {
                            	    	     
                            	    	            newCompositeNode(grammarAccess.getArtifactAccess().getEOLParserRuleCall_4_2_2_1_0()); 
                            	    	        
                            	    	    pushFollow(FOLLOW_ruleEOL_in_ruleArtifact3772);
                            	    	    ruleEOL();

                            	    	    state._fsp--;

                            	    	     
                            	    	            afterParserOrEnumRuleCall();
                            	    	        

                            	    	    }
                            	    	    break;
                            	    	case 2 :
                            	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1801:7: otherlv_11= ','
                            	    	    {
                            	    	    otherlv_11=(Token)match(input,27,FOLLOW_27_in_ruleArtifact3789); 

                            	    	        	newLeafNode(otherlv_11, grammarAccess.getArtifactAccess().getCommaKeyword_4_2_2_1_1());
                            	    	        

                            	    	    }
                            	    	    break;

                            	    	default :
                            	    	    if ( cnt66 >= 1 ) break loop66;
                            	                EarlyExitException eee =
                            	                    new EarlyExitException(66, input);
                            	                throw eee;
                            	        }
                            	        cnt66++;
                            	    } while (true);


                            	    }
                            	    break;

                            	default :
                            	    break loop67;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_12=(Token)match(input,25,FOLLOW_25_in_ruleArtifact3807); 

                        	newLeafNode(otherlv_12, grammarAccess.getArtifactAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1809:3: ( ruleEOL )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( ((LA70_0>=RULE_NEWLINE && LA70_0<=RULE_SL_COMMENT)) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1810:5: ruleEOL
            	    {
            	     
            	            newCompositeNode(grammarAccess.getArtifactAccess().getEOLParserRuleCall_5()); 
            	        
            	    pushFollow(FOLLOW_ruleEOL_in_ruleArtifact3826);
            	    ruleEOL();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop70;
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


    // $ANTLR start "entryRuleOrganisation"
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1825:1: entryRuleOrganisation returns [EObject current=null] : iv_ruleOrganisation= ruleOrganisation EOF ;
    public final EObject entryRuleOrganisation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrganisation = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1826:2: (iv_ruleOrganisation= ruleOrganisation EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1827:2: iv_ruleOrganisation= ruleOrganisation EOF
            {
             newCompositeNode(grammarAccess.getOrganisationRule()); 
            pushFollow(FOLLOW_ruleOrganisation_in_entryRuleOrganisation3863);
            iv_ruleOrganisation=ruleOrganisation();

            state._fsp--;

             current =iv_ruleOrganisation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrganisation3873); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1834:1: ruleOrganisation returns [EObject current=null] : (otherlv_0= 'organisation' ( (lv_name_1_0= RULE_ATOM ) ) ( (lv_fileName_2_0= ruleOFileName ) )? otherlv_3= '{' ( ruleEOL )* ( ( (lv_group_5_0= ruleGroup ) ) | ( (lv_scheme_6_0= ruleScheme ) ) | ( (lv_agents_7_0= ruleOAgents ) ) | ( (lv_node_8_0= ruleONode ) ) | ( (lv_other_9_0= ruleOOthers ) ) )* otherlv_10= '}' ( ruleEOL )* ) ;
    public final EObject ruleOrganisation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_10=null;
        EObject lv_fileName_2_0 = null;

        EObject lv_group_5_0 = null;

        EObject lv_scheme_6_0 = null;

        EObject lv_agents_7_0 = null;

        EObject lv_node_8_0 = null;

        EObject lv_other_9_0 = null;


         enterRule(); 
            
        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1837:28: ( (otherlv_0= 'organisation' ( (lv_name_1_0= RULE_ATOM ) ) ( (lv_fileName_2_0= ruleOFileName ) )? otherlv_3= '{' ( ruleEOL )* ( ( (lv_group_5_0= ruleGroup ) ) | ( (lv_scheme_6_0= ruleScheme ) ) | ( (lv_agents_7_0= ruleOAgents ) ) | ( (lv_node_8_0= ruleONode ) ) | ( (lv_other_9_0= ruleOOthers ) ) )* otherlv_10= '}' ( ruleEOL )* ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1838:1: (otherlv_0= 'organisation' ( (lv_name_1_0= RULE_ATOM ) ) ( (lv_fileName_2_0= ruleOFileName ) )? otherlv_3= '{' ( ruleEOL )* ( ( (lv_group_5_0= ruleGroup ) ) | ( (lv_scheme_6_0= ruleScheme ) ) | ( (lv_agents_7_0= ruleOAgents ) ) | ( (lv_node_8_0= ruleONode ) ) | ( (lv_other_9_0= ruleOOthers ) ) )* otherlv_10= '}' ( ruleEOL )* )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1838:1: (otherlv_0= 'organisation' ( (lv_name_1_0= RULE_ATOM ) ) ( (lv_fileName_2_0= ruleOFileName ) )? otherlv_3= '{' ( ruleEOL )* ( ( (lv_group_5_0= ruleGroup ) ) | ( (lv_scheme_6_0= ruleScheme ) ) | ( (lv_agents_7_0= ruleOAgents ) ) | ( (lv_node_8_0= ruleONode ) ) | ( (lv_other_9_0= ruleOOthers ) ) )* otherlv_10= '}' ( ruleEOL )* )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1838:3: otherlv_0= 'organisation' ( (lv_name_1_0= RULE_ATOM ) ) ( (lv_fileName_2_0= ruleOFileName ) )? otherlv_3= '{' ( ruleEOL )* ( ( (lv_group_5_0= ruleGroup ) ) | ( (lv_scheme_6_0= ruleScheme ) ) | ( (lv_agents_7_0= ruleOAgents ) ) | ( (lv_node_8_0= ruleONode ) ) | ( (lv_other_9_0= ruleOOthers ) ) )* otherlv_10= '}' ( ruleEOL )*
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleOrganisation3910); 

                	newLeafNode(otherlv_0, grammarAccess.getOrganisationAccess().getOrganisationKeyword_0());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1842:1: ( (lv_name_1_0= RULE_ATOM ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1843:1: (lv_name_1_0= RULE_ATOM )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1843:1: (lv_name_1_0= RULE_ATOM )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1844:3: lv_name_1_0= RULE_ATOM
            {
            lv_name_1_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleOrganisation3927); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOrganisationAccess().getNameATOMTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOrganisationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ATOM");
            	    

            }


            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1860:2: ( (lv_fileName_2_0= ruleOFileName ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==29) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1861:1: (lv_fileName_2_0= ruleOFileName )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1861:1: (lv_fileName_2_0= ruleOFileName )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1862:3: lv_fileName_2_0= ruleOFileName
                    {
                     
                    	        newCompositeNode(grammarAccess.getOrganisationAccess().getFileNameOFileNameParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOFileName_in_ruleOrganisation3953);
                    lv_fileName_2_0=ruleOFileName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOrganisationRule());
                    	        }
                           		set(
                           			current, 
                           			"fileName",
                            		lv_fileName_2_0, 
                            		"OFileName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleOrganisation3966); 

                	newLeafNode(otherlv_3, grammarAccess.getOrganisationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1882:1: ( ruleEOL )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( ((LA72_0>=RULE_NEWLINE && LA72_0<=RULE_SL_COMMENT)) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1883:5: ruleEOL
            	    {
            	     
            	            newCompositeNode(grammarAccess.getOrganisationAccess().getEOLParserRuleCall_4()); 
            	        
            	    pushFollow(FOLLOW_ruleEOL_in_ruleOrganisation3983);
            	    ruleEOL();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1890:3: ( ( (lv_group_5_0= ruleGroup ) ) | ( (lv_scheme_6_0= ruleScheme ) ) | ( (lv_agents_7_0= ruleOAgents ) ) | ( (lv_node_8_0= ruleONode ) ) | ( (lv_other_9_0= ruleOOthers ) ) )*
            loop73:
            do {
                int alt73=6;
                switch ( input.LA(1) ) {
                case 62:
                    {
                    alt73=1;
                    }
                    break;
                case 66:
                    {
                    alt73=2;
                    }
                    break;
                case 57:
                    {
                    alt73=3;
                    }
                    break;
                case 32:
                    {
                    alt73=4;
                    }
                    break;
                case RULE_ATOM:
                    {
                    alt73=5;
                    }
                    break;

                }

                switch (alt73) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1890:4: ( (lv_group_5_0= ruleGroup ) )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1890:4: ( (lv_group_5_0= ruleGroup ) )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1891:1: (lv_group_5_0= ruleGroup )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1891:1: (lv_group_5_0= ruleGroup )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1892:3: lv_group_5_0= ruleGroup
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrganisationAccess().getGroupGroupParserRuleCall_5_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGroup_in_ruleOrganisation4006);
            	    lv_group_5_0=ruleGroup();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrganisationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"group",
            	            		lv_group_5_0, 
            	            		"Group");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1909:6: ( (lv_scheme_6_0= ruleScheme ) )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1909:6: ( (lv_scheme_6_0= ruleScheme ) )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1910:1: (lv_scheme_6_0= ruleScheme )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1910:1: (lv_scheme_6_0= ruleScheme )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1911:3: lv_scheme_6_0= ruleScheme
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrganisationAccess().getSchemeSchemeParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleScheme_in_ruleOrganisation4033);
            	    lv_scheme_6_0=ruleScheme();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrganisationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"scheme",
            	            		lv_scheme_6_0, 
            	            		"Scheme");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1928:6: ( (lv_agents_7_0= ruleOAgents ) )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1928:6: ( (lv_agents_7_0= ruleOAgents ) )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1929:1: (lv_agents_7_0= ruleOAgents )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1929:1: (lv_agents_7_0= ruleOAgents )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1930:3: lv_agents_7_0= ruleOAgents
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrganisationAccess().getAgentsOAgentsParserRuleCall_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOAgents_in_ruleOrganisation4060);
            	    lv_agents_7_0=ruleOAgents();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrganisationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"agents",
            	            		lv_agents_7_0, 
            	            		"OAgents");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1947:6: ( (lv_node_8_0= ruleONode ) )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1947:6: ( (lv_node_8_0= ruleONode ) )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1948:1: (lv_node_8_0= ruleONode )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1948:1: (lv_node_8_0= ruleONode )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1949:3: lv_node_8_0= ruleONode
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrganisationAccess().getNodeONodeParserRuleCall_5_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleONode_in_ruleOrganisation4087);
            	    lv_node_8_0=ruleONode();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrganisationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"node",
            	            		lv_node_8_0, 
            	            		"ONode");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1966:6: ( (lv_other_9_0= ruleOOthers ) )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1966:6: ( (lv_other_9_0= ruleOOthers ) )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1967:1: (lv_other_9_0= ruleOOthers )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1967:1: (lv_other_9_0= ruleOOthers )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1968:3: lv_other_9_0= ruleOOthers
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrganisationAccess().getOtherOOthersParserRuleCall_5_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOOthers_in_ruleOrganisation4114);
            	    lv_other_9_0=ruleOOthers();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrganisationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"other",
            	            		lv_other_9_0, 
            	            		"OOthers");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleOrganisation4128); 

                	newLeafNode(otherlv_10, grammarAccess.getOrganisationAccess().getRightCurlyBracketKeyword_6());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1988:1: ( ruleEOL )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( ((LA74_0>=RULE_NEWLINE && LA74_0<=RULE_SL_COMMENT)) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:1989:5: ruleEOL
            	    {
            	     
            	            newCompositeNode(grammarAccess.getOrganisationAccess().getEOLParserRuleCall_7()); 
            	        
            	    pushFollow(FOLLOW_ruleEOL_in_ruleOrganisation4145);
            	    ruleEOL();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop74;
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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2004:1: entryRuleOFileName returns [EObject current=null] : iv_ruleOFileName= ruleOFileName EOF ;
    public final EObject entryRuleOFileName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOFileName = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2005:2: (iv_ruleOFileName= ruleOFileName EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2006:2: iv_ruleOFileName= ruleOFileName EOF
            {
             newCompositeNode(grammarAccess.getOFileNameRule()); 
            pushFollow(FOLLOW_ruleOFileName_in_entryRuleOFileName4182);
            iv_ruleOFileName=ruleOFileName();

            state._fsp--;

             current =iv_ruleOFileName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOFileName4192); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2013:1: ruleOFileName returns [EObject current=null] : (otherlv_0= ':' ( (lv_name_1_0= ruleFileName ) ) ) ;
    public final EObject ruleOFileName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2016:28: ( (otherlv_0= ':' ( (lv_name_1_0= ruleFileName ) ) ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2017:1: (otherlv_0= ':' ( (lv_name_1_0= ruleFileName ) ) )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2017:1: (otherlv_0= ':' ( (lv_name_1_0= ruleFileName ) ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2017:3: otherlv_0= ':' ( (lv_name_1_0= ruleFileName ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleOFileName4229); 

                	newLeafNode(otherlv_0, grammarAccess.getOFileNameAccess().getColonKeyword_0());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2021:1: ( (lv_name_1_0= ruleFileName ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2022:1: (lv_name_1_0= ruleFileName )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2022:1: (lv_name_1_0= ruleFileName )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2023:3: lv_name_1_0= ruleFileName
            {
             
            	        newCompositeNode(grammarAccess.getOFileNameAccess().getNameFileNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFileName_in_ruleOFileName4250);
            lv_name_1_0=ruleFileName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOFileNameRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"FileName");
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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2047:1: entryRuleONode returns [EObject current=null] : iv_ruleONode= ruleONode EOF ;
    public final EObject entryRuleONode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleONode = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2048:2: (iv_ruleONode= ruleONode EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2049:2: iv_ruleONode= ruleONode EOF
            {
             newCompositeNode(grammarAccess.getONodeRule()); 
            pushFollow(FOLLOW_ruleONode_in_entryRuleONode4286);
            iv_ruleONode=ruleONode();

            state._fsp--;

             current =iv_ruleONode; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleONode4296); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2056:1: ruleONode returns [EObject current=null] : (otherlv_0= 'node' otherlv_1= ':' ( (lv_name_2_0= RULE_ATOM ) ) ( ruleEOL )+ ) ;
    public final EObject ruleONode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;

         enterRule(); 
            
        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2059:28: ( (otherlv_0= 'node' otherlv_1= ':' ( (lv_name_2_0= RULE_ATOM ) ) ( ruleEOL )+ ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2060:1: (otherlv_0= 'node' otherlv_1= ':' ( (lv_name_2_0= RULE_ATOM ) ) ( ruleEOL )+ )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2060:1: (otherlv_0= 'node' otherlv_1= ':' ( (lv_name_2_0= RULE_ATOM ) ) ( ruleEOL )+ )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2060:3: otherlv_0= 'node' otherlv_1= ':' ( (lv_name_2_0= RULE_ATOM ) ) ( ruleEOL )+
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleONode4333); 

                	newLeafNode(otherlv_0, grammarAccess.getONodeAccess().getNodeKeyword_0());
                
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleONode4345); 

                	newLeafNode(otherlv_1, grammarAccess.getONodeAccess().getColonKeyword_1());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2068:1: ( (lv_name_2_0= RULE_ATOM ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2069:1: (lv_name_2_0= RULE_ATOM )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2069:1: (lv_name_2_0= RULE_ATOM )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2070:3: lv_name_2_0= RULE_ATOM
            {
            lv_name_2_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleONode4362); 

            			newLeafNode(lv_name_2_0, grammarAccess.getONodeAccess().getNameATOMTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getONodeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ATOM");
            	    

            }


            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2086:2: ( ruleEOL )+
            int cnt75=0;
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( ((LA75_0>=RULE_NEWLINE && LA75_0<=RULE_SL_COMMENT)) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2087:5: ruleEOL
            	    {
            	     
            	            newCompositeNode(grammarAccess.getONodeAccess().getEOLParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleEOL_in_ruleONode4384);
            	    ruleEOL();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt75 >= 1 ) break loop75;
                        EarlyExitException eee =
                            new EarlyExitException(75, input);
                        throw eee;
                }
                cnt75++;
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


    // $ANTLR start "entryRuleOAgents"
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2102:1: entryRuleOAgents returns [EObject current=null] : iv_ruleOAgents= ruleOAgents EOF ;
    public final EObject entryRuleOAgents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOAgents = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2103:2: (iv_ruleOAgents= ruleOAgents EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2104:2: iv_ruleOAgents= ruleOAgents EOF
            {
             newCompositeNode(grammarAccess.getOAgentsRule()); 
            pushFollow(FOLLOW_ruleOAgents_in_entryRuleOAgents4421);
            iv_ruleOAgents=ruleOAgents();

            state._fsp--;

             current =iv_ruleOAgents; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOAgents4431); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2111:1: ruleOAgents returns [EObject current=null] : ( () otherlv_1= 'agents' otherlv_2= ':' ( ( ( (lv_agent_3_0= RULE_ATOM ) ) | otherlv_4= '*' ) ( ruleEOL | otherlv_6= ',' )+ )* ) ;
    public final EObject ruleOAgents() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_agent_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2114:28: ( ( () otherlv_1= 'agents' otherlv_2= ':' ( ( ( (lv_agent_3_0= RULE_ATOM ) ) | otherlv_4= '*' ) ( ruleEOL | otherlv_6= ',' )+ )* ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2115:1: ( () otherlv_1= 'agents' otherlv_2= ':' ( ( ( (lv_agent_3_0= RULE_ATOM ) ) | otherlv_4= '*' ) ( ruleEOL | otherlv_6= ',' )+ )* )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2115:1: ( () otherlv_1= 'agents' otherlv_2= ':' ( ( ( (lv_agent_3_0= RULE_ATOM ) ) | otherlv_4= '*' ) ( ruleEOL | otherlv_6= ',' )+ )* )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2115:2: () otherlv_1= 'agents' otherlv_2= ':' ( ( ( (lv_agent_3_0= RULE_ATOM ) ) | otherlv_4= '*' ) ( ruleEOL | otherlv_6= ',' )+ )*
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2115:2: ()
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2116:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getOAgentsAccess().getOAgentsAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleOAgents4477); 

                	newLeafNode(otherlv_1, grammarAccess.getOAgentsAccess().getAgentsKeyword_1());
                
            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleOAgents4489); 

                	newLeafNode(otherlv_2, grammarAccess.getOAgentsAccess().getColonKeyword_2());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2129:1: ( ( ( (lv_agent_3_0= RULE_ATOM ) ) | otherlv_4= '*' ) ( ruleEOL | otherlv_6= ',' )+ )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==RULE_ATOM) ) {
                    int LA78_2 = input.LA(2);

                    if ( ((LA78_2>=RULE_NEWLINE && LA78_2<=RULE_SL_COMMENT)||LA78_2==27) ) {
                        alt78=1;
                    }


                }
                else if ( (LA78_0==58) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2129:2: ( ( (lv_agent_3_0= RULE_ATOM ) ) | otherlv_4= '*' ) ( ruleEOL | otherlv_6= ',' )+
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2129:2: ( ( (lv_agent_3_0= RULE_ATOM ) ) | otherlv_4= '*' )
            	    int alt76=2;
            	    int LA76_0 = input.LA(1);

            	    if ( (LA76_0==RULE_ATOM) ) {
            	        alt76=1;
            	    }
            	    else if ( (LA76_0==58) ) {
            	        alt76=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 76, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt76) {
            	        case 1 :
            	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2129:3: ( (lv_agent_3_0= RULE_ATOM ) )
            	            {
            	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2129:3: ( (lv_agent_3_0= RULE_ATOM ) )
            	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2130:1: (lv_agent_3_0= RULE_ATOM )
            	            {
            	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2130:1: (lv_agent_3_0= RULE_ATOM )
            	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2131:3: lv_agent_3_0= RULE_ATOM
            	            {
            	            lv_agent_3_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleOAgents4508); 

            	            			newLeafNode(lv_agent_3_0, grammarAccess.getOAgentsAccess().getAgentATOMTerminalRuleCall_3_0_0_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getOAgentsRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"agent",
            	                    		lv_agent_3_0, 
            	                    		"ATOM");
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2148:7: otherlv_4= '*'
            	            {
            	            otherlv_4=(Token)match(input,58,FOLLOW_58_in_ruleOAgents4531); 

            	                	newLeafNode(otherlv_4, grammarAccess.getOAgentsAccess().getAsteriskKeyword_3_0_1());
            	                

            	            }
            	            break;

            	    }

            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2152:2: ( ruleEOL | otherlv_6= ',' )+
            	    int cnt77=0;
            	    loop77:
            	    do {
            	        int alt77=3;
            	        int LA77_0 = input.LA(1);

            	        if ( ((LA77_0>=RULE_NEWLINE && LA77_0<=RULE_SL_COMMENT)) ) {
            	            alt77=1;
            	        }
            	        else if ( (LA77_0==27) ) {
            	            alt77=2;
            	        }


            	        switch (alt77) {
            	    	case 1 :
            	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2153:5: ruleEOL
            	    	    {
            	    	     
            	    	            newCompositeNode(grammarAccess.getOAgentsAccess().getEOLParserRuleCall_3_1_0()); 
            	    	        
            	    	    pushFollow(FOLLOW_ruleEOL_in_ruleOAgents4549);
            	    	    ruleEOL();

            	    	    state._fsp--;

            	    	     
            	    	            afterParserOrEnumRuleCall();
            	    	        

            	    	    }
            	    	    break;
            	    	case 2 :
            	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2161:7: otherlv_6= ','
            	    	    {
            	    	    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleOAgents4566); 

            	    	        	newLeafNode(otherlv_6, grammarAccess.getOAgentsAccess().getCommaKeyword_3_1_1());
            	    	        

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt77 >= 1 ) break loop77;
            	                EarlyExitException eee =
            	                    new EarlyExitException(77, input);
            	                throw eee;
            	        }
            	        cnt77++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop78;
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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2173:1: entryRuleOOthers returns [EObject current=null] : iv_ruleOOthers= ruleOOthers EOF ;
    public final EObject entryRuleOOthers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOOthers = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2174:2: (iv_ruleOOthers= ruleOOthers EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2175:2: iv_ruleOOthers= ruleOOthers EOF
            {
             newCompositeNode(grammarAccess.getOOthersRule()); 
            pushFollow(FOLLOW_ruleOOthers_in_entryRuleOOthers4606);
            iv_ruleOOthers=ruleOOthers();

            state._fsp--;

             current =iv_ruleOOthers; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOOthers4616); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2182:1: ruleOOthers returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ATOM ) ) otherlv_1= ':' ( ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_val_3_0= RULE_INT_LITERAL ) ) | ( (lv_literal_4_0= ruleLiteral ) ) | ( (lv_val_real_5_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) ;
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
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2185:28: ( ( ( (lv_name_0_0= RULE_ATOM ) ) otherlv_1= ':' ( ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_val_3_0= RULE_INT_LITERAL ) ) | ( (lv_literal_4_0= ruleLiteral ) ) | ( (lv_val_real_5_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2186:1: ( ( (lv_name_0_0= RULE_ATOM ) ) otherlv_1= ':' ( ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_val_3_0= RULE_INT_LITERAL ) ) | ( (lv_literal_4_0= ruleLiteral ) ) | ( (lv_val_real_5_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2186:1: ( ( (lv_name_0_0= RULE_ATOM ) ) otherlv_1= ':' ( ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_val_3_0= RULE_INT_LITERAL ) ) | ( (lv_literal_4_0= ruleLiteral ) ) | ( (lv_val_real_5_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2186:2: ( (lv_name_0_0= RULE_ATOM ) ) otherlv_1= ':' ( ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_val_3_0= RULE_INT_LITERAL ) ) | ( (lv_literal_4_0= ruleLiteral ) ) | ( (lv_val_real_5_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2186:2: ( (lv_name_0_0= RULE_ATOM ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2187:1: (lv_name_0_0= RULE_ATOM )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2187:1: (lv_name_0_0= RULE_ATOM )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2188:3: lv_name_0_0= RULE_ATOM
            {
            lv_name_0_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleOOthers4658); 

            			newLeafNode(lv_name_0_0, grammarAccess.getOOthersAccess().getNameATOMTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOOthersRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ATOM");
            	    

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleOOthers4675); 

                	newLeafNode(otherlv_1, grammarAccess.getOOthersAccess().getColonKeyword_1());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2208:1: ( ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_val_3_0= RULE_INT_LITERAL ) ) | ( (lv_literal_4_0= ruleLiteral ) ) | ( (lv_val_real_5_0= RULE_REAL_LITERAL ) ) )
            int alt79=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt79=1;
                }
                break;
            case RULE_INT_LITERAL:
                {
                alt79=2;
                }
                break;
            case RULE_ATOM:
            case RULE_VART:
            case RULE_UNNAMEDVART:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
                {
                alt79=3;
                }
                break;
            case RULE_REAL_LITERAL:
                {
                alt79=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2208:2: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2208:2: ( (lv_string_2_0= RULE_STRING ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2209:1: (lv_string_2_0= RULE_STRING )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2209:1: (lv_string_2_0= RULE_STRING )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2210:3: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOOthers4693); 

                    			newLeafNode(lv_string_2_0, grammarAccess.getOOthersAccess().getStringSTRINGTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOOthersRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"string",
                            		lv_string_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2227:6: ( (lv_val_3_0= RULE_INT_LITERAL ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2227:6: ( (lv_val_3_0= RULE_INT_LITERAL ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2228:1: (lv_val_3_0= RULE_INT_LITERAL )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2228:1: (lv_val_3_0= RULE_INT_LITERAL )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2229:3: lv_val_3_0= RULE_INT_LITERAL
                    {
                    lv_val_3_0=(Token)match(input,RULE_INT_LITERAL,FOLLOW_RULE_INT_LITERAL_in_ruleOOthers4721); 

                    			newLeafNode(lv_val_3_0, grammarAccess.getOOthersAccess().getValINT_LITERALTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOOthersRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_3_0, 
                            		"INT_LITERAL");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2246:6: ( (lv_literal_4_0= ruleLiteral ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2246:6: ( (lv_literal_4_0= ruleLiteral ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2247:1: (lv_literal_4_0= ruleLiteral )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2247:1: (lv_literal_4_0= ruleLiteral )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2248:3: lv_literal_4_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getOOthersAccess().getLiteralLiteralParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleOOthers4753);
                    lv_literal_4_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getOOthersRule());
                    	        }
                           		add(
                           			current, 
                           			"literal",
                            		lv_literal_4_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2265:6: ( (lv_val_real_5_0= RULE_REAL_LITERAL ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2265:6: ( (lv_val_real_5_0= RULE_REAL_LITERAL ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2266:1: (lv_val_real_5_0= RULE_REAL_LITERAL )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2266:1: (lv_val_real_5_0= RULE_REAL_LITERAL )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2267:3: lv_val_real_5_0= RULE_REAL_LITERAL
                    {
                    lv_val_real_5_0=(Token)match(input,RULE_REAL_LITERAL,FOLLOW_RULE_REAL_LITERAL_in_ruleOOthers4776); 

                    			newLeafNode(lv_val_real_5_0, grammarAccess.getOOthersAccess().getVal_realREAL_LITERALTerminalRuleCall_2_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOOthersRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"val_real",
                            		lv_val_real_5_0, 
                            		"REAL_LITERAL");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2283:3: ( ruleEOL )+
            int cnt80=0;
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( ((LA80_0>=RULE_NEWLINE && LA80_0<=RULE_SL_COMMENT)) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2284:5: ruleEOL
            	    {
            	     
            	            newCompositeNode(grammarAccess.getOOthersAccess().getEOLParserRuleCall_3()); 
            	        
            	    pushFollow(FOLLOW_ruleEOL_in_ruleOOthers4799);
            	    ruleEOL();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2299:1: entryRuleGroup returns [EObject current=null] : iv_ruleGroup= ruleGroup EOF ;
    public final EObject entryRuleGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroup = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2300:2: (iv_ruleGroup= ruleGroup EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2301:2: iv_ruleGroup= ruleGroup EOF
            {
             newCompositeNode(grammarAccess.getGroupRule()); 
            pushFollow(FOLLOW_ruleGroup_in_entryRuleGroup4836);
            iv_ruleGroup=ruleGroup();

            state._fsp--;

             current =iv_ruleGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGroup4846); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2308:1: ruleGroup returns [EObject current=null] : (otherlv_0= 'group' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_kind_3_0= RULE_ATOM ) ) (otherlv_4= '{' ( ruleEOL )* ( ( (lv_group_6_0= ruleGroup ) ) | (otherlv_7= 'responsible-for' otherlv_8= ':' ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_11= 'owner' otherlv_12= ':' ( (lv_owner_13_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_15= 'debug' (otherlv_16= ':' ( (lv_debug_17_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( ( (lv_other_19_0= RULE_ATOM ) ) otherlv_20= ':' ( ( (lv_string_21_0= RULE_STRING ) ) | ( (lv_val_22_0= RULE_INT_LITERAL ) ) | ( (lv_literal_23_0= ruleLiteral ) ) | ( (lv_val_real_24_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) | (otherlv_26= 'players' otherlv_27= ':' ( ( (lv_agent_28_0= RULE_ATOM ) ) ( (lv_role_29_0= RULE_ATOM ) ) ( ruleEOL | otherlv_31= ',' )+ )* ) )* otherlv_32= '}' )? ( ruleEOL )* ) ;
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
        Token lv_owner_13_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_other_19_0=null;
        Token otherlv_20=null;
        Token lv_string_21_0=null;
        Token lv_val_22_0=null;
        Token lv_val_real_24_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token lv_agent_28_0=null;
        Token lv_role_29_0=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        EObject lv_group_6_0 = null;

        EObject lv_debug_17_0 = null;

        EObject lv_literal_23_0 = null;


         enterRule(); 
            
        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2311:28: ( (otherlv_0= 'group' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_kind_3_0= RULE_ATOM ) ) (otherlv_4= '{' ( ruleEOL )* ( ( (lv_group_6_0= ruleGroup ) ) | (otherlv_7= 'responsible-for' otherlv_8= ':' ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_11= 'owner' otherlv_12= ':' ( (lv_owner_13_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_15= 'debug' (otherlv_16= ':' ( (lv_debug_17_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( ( (lv_other_19_0= RULE_ATOM ) ) otherlv_20= ':' ( ( (lv_string_21_0= RULE_STRING ) ) | ( (lv_val_22_0= RULE_INT_LITERAL ) ) | ( (lv_literal_23_0= ruleLiteral ) ) | ( (lv_val_real_24_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) | (otherlv_26= 'players' otherlv_27= ':' ( ( (lv_agent_28_0= RULE_ATOM ) ) ( (lv_role_29_0= RULE_ATOM ) ) ( ruleEOL | otherlv_31= ',' )+ )* ) )* otherlv_32= '}' )? ( ruleEOL )* ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2312:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_kind_3_0= RULE_ATOM ) ) (otherlv_4= '{' ( ruleEOL )* ( ( (lv_group_6_0= ruleGroup ) ) | (otherlv_7= 'responsible-for' otherlv_8= ':' ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_11= 'owner' otherlv_12= ':' ( (lv_owner_13_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_15= 'debug' (otherlv_16= ':' ( (lv_debug_17_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( ( (lv_other_19_0= RULE_ATOM ) ) otherlv_20= ':' ( ( (lv_string_21_0= RULE_STRING ) ) | ( (lv_val_22_0= RULE_INT_LITERAL ) ) | ( (lv_literal_23_0= ruleLiteral ) ) | ( (lv_val_real_24_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) | (otherlv_26= 'players' otherlv_27= ':' ( ( (lv_agent_28_0= RULE_ATOM ) ) ( (lv_role_29_0= RULE_ATOM ) ) ( ruleEOL | otherlv_31= ',' )+ )* ) )* otherlv_32= '}' )? ( ruleEOL )* )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2312:1: (otherlv_0= 'group' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_kind_3_0= RULE_ATOM ) ) (otherlv_4= '{' ( ruleEOL )* ( ( (lv_group_6_0= ruleGroup ) ) | (otherlv_7= 'responsible-for' otherlv_8= ':' ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_11= 'owner' otherlv_12= ':' ( (lv_owner_13_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_15= 'debug' (otherlv_16= ':' ( (lv_debug_17_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( ( (lv_other_19_0= RULE_ATOM ) ) otherlv_20= ':' ( ( (lv_string_21_0= RULE_STRING ) ) | ( (lv_val_22_0= RULE_INT_LITERAL ) ) | ( (lv_literal_23_0= ruleLiteral ) ) | ( (lv_val_real_24_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) | (otherlv_26= 'players' otherlv_27= ':' ( ( (lv_agent_28_0= RULE_ATOM ) ) ( (lv_role_29_0= RULE_ATOM ) ) ( ruleEOL | otherlv_31= ',' )+ )* ) )* otherlv_32= '}' )? ( ruleEOL )* )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2312:3: otherlv_0= 'group' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_kind_3_0= RULE_ATOM ) ) (otherlv_4= '{' ( ruleEOL )* ( ( (lv_group_6_0= ruleGroup ) ) | (otherlv_7= 'responsible-for' otherlv_8= ':' ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_11= 'owner' otherlv_12= ':' ( (lv_owner_13_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_15= 'debug' (otherlv_16= ':' ( (lv_debug_17_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( ( (lv_other_19_0= RULE_ATOM ) ) otherlv_20= ':' ( ( (lv_string_21_0= RULE_STRING ) ) | ( (lv_val_22_0= RULE_INT_LITERAL ) ) | ( (lv_literal_23_0= ruleLiteral ) ) | ( (lv_val_real_24_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) | (otherlv_26= 'players' otherlv_27= ':' ( ( (lv_agent_28_0= RULE_ATOM ) ) ( (lv_role_29_0= RULE_ATOM ) ) ( ruleEOL | otherlv_31= ',' )+ )* ) )* otherlv_32= '}' )? ( ruleEOL )*
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleGroup4883); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupAccess().getGroupKeyword_0());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2316:1: ( (lv_name_1_0= RULE_ATOM ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2317:1: (lv_name_1_0= RULE_ATOM )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2317:1: (lv_name_1_0= RULE_ATOM )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2318:3: lv_name_1_0= RULE_ATOM
            {
            lv_name_1_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleGroup4900); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGroupAccess().getNameATOMTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ATOM");
            	    

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleGroup4917); 

                	newLeafNode(otherlv_2, grammarAccess.getGroupAccess().getColonKeyword_2());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2338:1: ( (lv_kind_3_0= RULE_ATOM ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2339:1: (lv_kind_3_0= RULE_ATOM )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2339:1: (lv_kind_3_0= RULE_ATOM )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2340:3: lv_kind_3_0= RULE_ATOM
            {
            lv_kind_3_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleGroup4934); 

            			newLeafNode(lv_kind_3_0, grammarAccess.getGroupAccess().getKindATOMTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"kind",
                    		lv_kind_3_0, 
                    		"ATOM");
            	    

            }


            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2356:2: (otherlv_4= '{' ( ruleEOL )* ( ( (lv_group_6_0= ruleGroup ) ) | (otherlv_7= 'responsible-for' otherlv_8= ':' ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_11= 'owner' otherlv_12= ':' ( (lv_owner_13_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_15= 'debug' (otherlv_16= ':' ( (lv_debug_17_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( ( (lv_other_19_0= RULE_ATOM ) ) otherlv_20= ':' ( ( (lv_string_21_0= RULE_STRING ) ) | ( (lv_val_22_0= RULE_INT_LITERAL ) ) | ( (lv_literal_23_0= ruleLiteral ) ) | ( (lv_val_real_24_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) | (otherlv_26= 'players' otherlv_27= ':' ( ( (lv_agent_28_0= RULE_ATOM ) ) ( (lv_role_29_0= RULE_ATOM ) ) ( ruleEOL | otherlv_31= ',' )+ )* ) )* otherlv_32= '}' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==24) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2356:4: otherlv_4= '{' ( ruleEOL )* ( ( (lv_group_6_0= ruleGroup ) ) | (otherlv_7= 'responsible-for' otherlv_8= ':' ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_11= 'owner' otherlv_12= ':' ( (lv_owner_13_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_15= 'debug' (otherlv_16= ':' ( (lv_debug_17_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( ( (lv_other_19_0= RULE_ATOM ) ) otherlv_20= ':' ( ( (lv_string_21_0= RULE_STRING ) ) | ( (lv_val_22_0= RULE_INT_LITERAL ) ) | ( (lv_literal_23_0= ruleLiteral ) ) | ( (lv_val_real_24_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) | (otherlv_26= 'players' otherlv_27= ':' ( ( (lv_agent_28_0= RULE_ATOM ) ) ( (lv_role_29_0= RULE_ATOM ) ) ( ruleEOL | otherlv_31= ',' )+ )* ) )* otherlv_32= '}'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleGroup4952); 

                        	newLeafNode(otherlv_4, grammarAccess.getGroupAccess().getLeftCurlyBracketKeyword_4_0());
                        
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2360:1: ( ruleEOL )*
                    loop81:
                    do {
                        int alt81=2;
                        int LA81_0 = input.LA(1);

                        if ( ((LA81_0>=RULE_NEWLINE && LA81_0<=RULE_SL_COMMENT)) ) {
                            alt81=1;
                        }


                        switch (alt81) {
                    	case 1 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2361:5: ruleEOL
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getGroupAccess().getEOLParserRuleCall_4_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleEOL_in_ruleGroup4969);
                    	    ruleEOL();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop81;
                        }
                    } while (true);

                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2368:3: ( ( (lv_group_6_0= ruleGroup ) ) | (otherlv_7= 'responsible-for' otherlv_8= ':' ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_11= 'owner' otherlv_12= ':' ( (lv_owner_13_0= RULE_ATOM ) ) ( ruleEOL )+ ) | (otherlv_15= 'debug' (otherlv_16= ':' ( (lv_debug_17_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | ( ( (lv_other_19_0= RULE_ATOM ) ) otherlv_20= ':' ( ( (lv_string_21_0= RULE_STRING ) ) | ( (lv_val_22_0= RULE_INT_LITERAL ) ) | ( (lv_literal_23_0= ruleLiteral ) ) | ( (lv_val_real_24_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) | (otherlv_26= 'players' otherlv_27= ':' ( ( (lv_agent_28_0= RULE_ATOM ) ) ( (lv_role_29_0= RULE_ATOM ) ) ( ruleEOL | otherlv_31= ',' )+ )* ) )*
                    loop90:
                    do {
                        int alt90=7;
                        switch ( input.LA(1) ) {
                        case 62:
                            {
                            alt90=1;
                            }
                            break;
                        case 63:
                            {
                            alt90=2;
                            }
                            break;
                        case 64:
                            {
                            alt90=3;
                            }
                            break;
                        case 46:
                            {
                            alt90=4;
                            }
                            break;
                        case RULE_ATOM:
                            {
                            alt90=5;
                            }
                            break;
                        case 65:
                            {
                            alt90=6;
                            }
                            break;

                        }

                        switch (alt90) {
                    	case 1 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2368:4: ( (lv_group_6_0= ruleGroup ) )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2368:4: ( (lv_group_6_0= ruleGroup ) )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2369:1: (lv_group_6_0= ruleGroup )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2369:1: (lv_group_6_0= ruleGroup )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2370:3: lv_group_6_0= ruleGroup
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGroupAccess().getGroupGroupParserRuleCall_4_2_0_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGroup_in_ruleGroup4992);
                    	    lv_group_6_0=ruleGroup();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGroupRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"group",
                    	            		lv_group_6_0, 
                    	            		"Group");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2387:6: (otherlv_7= 'responsible-for' otherlv_8= ':' ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL )+ )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2387:6: (otherlv_7= 'responsible-for' otherlv_8= ':' ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL )+ )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2387:8: otherlv_7= 'responsible-for' otherlv_8= ':' ( (lv_responsibleFor_9_0= RULE_ATOM ) ) ( ruleEOL )+
                    	    {
                    	    otherlv_7=(Token)match(input,63,FOLLOW_63_in_ruleGroup5011); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getGroupAccess().getResponsibleForKeyword_4_2_1_0());
                    	        
                    	    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleGroup5023); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getGroupAccess().getColonKeyword_4_2_1_1());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2395:1: ( (lv_responsibleFor_9_0= RULE_ATOM ) )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2396:1: (lv_responsibleFor_9_0= RULE_ATOM )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2396:1: (lv_responsibleFor_9_0= RULE_ATOM )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2397:3: lv_responsibleFor_9_0= RULE_ATOM
                    	    {
                    	    lv_responsibleFor_9_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleGroup5040); 

                    	    			newLeafNode(lv_responsibleFor_9_0, grammarAccess.getGroupAccess().getResponsibleForATOMTerminalRuleCall_4_2_1_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getGroupRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"responsibleFor",
                    	            		lv_responsibleFor_9_0, 
                    	            		"ATOM");
                    	    	    

                    	    }


                    	    }

                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2413:2: ( ruleEOL )+
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
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2414:5: ruleEOL
                    	    	    {
                    	    	     
                    	    	            newCompositeNode(grammarAccess.getGroupAccess().getEOLParserRuleCall_4_2_1_3()); 
                    	    	        
                    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleGroup5062);
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
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2422:6: (otherlv_11= 'owner' otherlv_12= ':' ( (lv_owner_13_0= RULE_ATOM ) ) ( ruleEOL )+ )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2422:6: (otherlv_11= 'owner' otherlv_12= ':' ( (lv_owner_13_0= RULE_ATOM ) ) ( ruleEOL )+ )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2422:8: otherlv_11= 'owner' otherlv_12= ':' ( (lv_owner_13_0= RULE_ATOM ) ) ( ruleEOL )+
                    	    {
                    	    otherlv_11=(Token)match(input,64,FOLLOW_64_in_ruleGroup5083); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getGroupAccess().getOwnerKeyword_4_2_2_0());
                    	        
                    	    otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleGroup5095); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getGroupAccess().getColonKeyword_4_2_2_1());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2430:1: ( (lv_owner_13_0= RULE_ATOM ) )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2431:1: (lv_owner_13_0= RULE_ATOM )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2431:1: (lv_owner_13_0= RULE_ATOM )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2432:3: lv_owner_13_0= RULE_ATOM
                    	    {
                    	    lv_owner_13_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleGroup5112); 

                    	    			newLeafNode(lv_owner_13_0, grammarAccess.getGroupAccess().getOwnerATOMTerminalRuleCall_4_2_2_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getGroupRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"owner",
                    	            		lv_owner_13_0, 
                    	            		"ATOM");
                    	    	    

                    	    }


                    	    }

                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2448:2: ( ruleEOL )+
                    	    int cnt83=0;
                    	    loop83:
                    	    do {
                    	        int alt83=2;
                    	        int LA83_0 = input.LA(1);

                    	        if ( ((LA83_0>=RULE_NEWLINE && LA83_0<=RULE_SL_COMMENT)) ) {
                    	            alt83=1;
                    	        }


                    	        switch (alt83) {
                    	    	case 1 :
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2449:5: ruleEOL
                    	    	    {
                    	    	     
                    	    	            newCompositeNode(grammarAccess.getGroupAccess().getEOLParserRuleCall_4_2_2_3()); 
                    	    	        
                    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleGroup5134);
                    	    	    ruleEOL();

                    	    	    state._fsp--;

                    	    	     
                    	    	            afterParserOrEnumRuleCall();
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt83 >= 1 ) break loop83;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(83, input);
                    	                throw eee;
                    	        }
                    	        cnt83++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2457:6: (otherlv_15= 'debug' (otherlv_16= ':' ( (lv_debug_17_0= ruleLiteral ) ) )? ( ruleEOL )+ )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2457:6: (otherlv_15= 'debug' (otherlv_16= ':' ( (lv_debug_17_0= ruleLiteral ) ) )? ( ruleEOL )+ )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2457:8: otherlv_15= 'debug' (otherlv_16= ':' ( (lv_debug_17_0= ruleLiteral ) ) )? ( ruleEOL )+
                    	    {
                    	    otherlv_15=(Token)match(input,46,FOLLOW_46_in_ruleGroup5155); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getGroupAccess().getDebugKeyword_4_2_3_0());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2461:1: (otherlv_16= ':' ( (lv_debug_17_0= ruleLiteral ) ) )?
                    	    int alt84=2;
                    	    int LA84_0 = input.LA(1);

                    	    if ( (LA84_0==29) ) {
                    	        alt84=1;
                    	    }
                    	    switch (alt84) {
                    	        case 1 :
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2461:3: otherlv_16= ':' ( (lv_debug_17_0= ruleLiteral ) )
                    	            {
                    	            otherlv_16=(Token)match(input,29,FOLLOW_29_in_ruleGroup5168); 

                    	                	newLeafNode(otherlv_16, grammarAccess.getGroupAccess().getColonKeyword_4_2_3_1_0());
                    	                
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2465:1: ( (lv_debug_17_0= ruleLiteral ) )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2466:1: (lv_debug_17_0= ruleLiteral )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2466:1: (lv_debug_17_0= ruleLiteral )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2467:3: lv_debug_17_0= ruleLiteral
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getGroupAccess().getDebugLiteralParserRuleCall_4_2_3_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleLiteral_in_ruleGroup5189);
                    	            lv_debug_17_0=ruleLiteral();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getGroupRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"debug",
                    	                    		lv_debug_17_0, 
                    	                    		"Literal");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2483:4: ( ruleEOL )+
                    	    int cnt85=0;
                    	    loop85:
                    	    do {
                    	        int alt85=2;
                    	        int LA85_0 = input.LA(1);

                    	        if ( ((LA85_0>=RULE_NEWLINE && LA85_0<=RULE_SL_COMMENT)) ) {
                    	            alt85=1;
                    	        }


                    	        switch (alt85) {
                    	    	case 1 :
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2484:5: ruleEOL
                    	    	    {
                    	    	     
                    	    	            newCompositeNode(grammarAccess.getGroupAccess().getEOLParserRuleCall_4_2_3_2()); 
                    	    	        
                    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleGroup5208);
                    	    	    ruleEOL();

                    	    	    state._fsp--;

                    	    	     
                    	    	            afterParserOrEnumRuleCall();
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt85 >= 1 ) break loop85;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(85, input);
                    	                throw eee;
                    	        }
                    	        cnt85++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2492:6: ( ( (lv_other_19_0= RULE_ATOM ) ) otherlv_20= ':' ( ( (lv_string_21_0= RULE_STRING ) ) | ( (lv_val_22_0= RULE_INT_LITERAL ) ) | ( (lv_literal_23_0= ruleLiteral ) ) | ( (lv_val_real_24_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2492:6: ( ( (lv_other_19_0= RULE_ATOM ) ) otherlv_20= ':' ( ( (lv_string_21_0= RULE_STRING ) ) | ( (lv_val_22_0= RULE_INT_LITERAL ) ) | ( (lv_literal_23_0= ruleLiteral ) ) | ( (lv_val_real_24_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2492:7: ( (lv_other_19_0= RULE_ATOM ) ) otherlv_20= ':' ( ( (lv_string_21_0= RULE_STRING ) ) | ( (lv_val_22_0= RULE_INT_LITERAL ) ) | ( (lv_literal_23_0= ruleLiteral ) ) | ( (lv_val_real_24_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2492:7: ( (lv_other_19_0= RULE_ATOM ) )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2493:1: (lv_other_19_0= RULE_ATOM )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2493:1: (lv_other_19_0= RULE_ATOM )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2494:3: lv_other_19_0= RULE_ATOM
                    	    {
                    	    lv_other_19_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleGroup5234); 

                    	    			newLeafNode(lv_other_19_0, grammarAccess.getGroupAccess().getOtherATOMTerminalRuleCall_4_2_4_0_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getGroupRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"other",
                    	            		lv_other_19_0, 
                    	            		"ATOM");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_20=(Token)match(input,29,FOLLOW_29_in_ruleGroup5251); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getGroupAccess().getColonKeyword_4_2_4_1());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2514:1: ( ( (lv_string_21_0= RULE_STRING ) ) | ( (lv_val_22_0= RULE_INT_LITERAL ) ) | ( (lv_literal_23_0= ruleLiteral ) ) | ( (lv_val_real_24_0= RULE_REAL_LITERAL ) ) )
                    	    int alt86=4;
                    	    switch ( input.LA(1) ) {
                    	    case RULE_STRING:
                    	        {
                    	        alt86=1;
                    	        }
                    	        break;
                    	    case RULE_INT_LITERAL:
                    	        {
                    	        alt86=2;
                    	        }
                    	        break;
                    	    case RULE_ATOM:
                    	    case RULE_VART:
                    	    case RULE_UNNAMEDVART:
                    	    case 75:
                    	    case 76:
                    	    case 77:
                    	    case 78:
                    	    case 79:
                    	        {
                    	        alt86=3;
                    	        }
                    	        break;
                    	    case RULE_REAL_LITERAL:
                    	        {
                    	        alt86=4;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 86, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt86) {
                    	        case 1 :
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2514:2: ( (lv_string_21_0= RULE_STRING ) )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2514:2: ( (lv_string_21_0= RULE_STRING ) )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2515:1: (lv_string_21_0= RULE_STRING )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2515:1: (lv_string_21_0= RULE_STRING )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2516:3: lv_string_21_0= RULE_STRING
                    	            {
                    	            lv_string_21_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGroup5269); 

                    	            			newLeafNode(lv_string_21_0, grammarAccess.getGroupAccess().getStringSTRINGTerminalRuleCall_4_2_4_2_0_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getGroupRule());
                    	            	        }
                    	                   		addWithLastConsumed(
                    	                   			current, 
                    	                   			"string",
                    	                    		lv_string_21_0, 
                    	                    		"STRING");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2533:6: ( (lv_val_22_0= RULE_INT_LITERAL ) )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2533:6: ( (lv_val_22_0= RULE_INT_LITERAL ) )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2534:1: (lv_val_22_0= RULE_INT_LITERAL )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2534:1: (lv_val_22_0= RULE_INT_LITERAL )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2535:3: lv_val_22_0= RULE_INT_LITERAL
                    	            {
                    	            lv_val_22_0=(Token)match(input,RULE_INT_LITERAL,FOLLOW_RULE_INT_LITERAL_in_ruleGroup5297); 

                    	            			newLeafNode(lv_val_22_0, grammarAccess.getGroupAccess().getValINT_LITERALTerminalRuleCall_4_2_4_2_1_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getGroupRule());
                    	            	        }
                    	                   		addWithLastConsumed(
                    	                   			current, 
                    	                   			"val",
                    	                    		lv_val_22_0, 
                    	                    		"INT_LITERAL");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 3 :
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2552:6: ( (lv_literal_23_0= ruleLiteral ) )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2552:6: ( (lv_literal_23_0= ruleLiteral ) )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2553:1: (lv_literal_23_0= ruleLiteral )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2553:1: (lv_literal_23_0= ruleLiteral )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2554:3: lv_literal_23_0= ruleLiteral
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getGroupAccess().getLiteralLiteralParserRuleCall_4_2_4_2_2_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleLiteral_in_ruleGroup5329);
                    	            lv_literal_23_0=ruleLiteral();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getGroupRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"literal",
                    	                    		lv_literal_23_0, 
                    	                    		"Literal");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 4 :
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2571:6: ( (lv_val_real_24_0= RULE_REAL_LITERAL ) )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2571:6: ( (lv_val_real_24_0= RULE_REAL_LITERAL ) )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2572:1: (lv_val_real_24_0= RULE_REAL_LITERAL )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2572:1: (lv_val_real_24_0= RULE_REAL_LITERAL )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2573:3: lv_val_real_24_0= RULE_REAL_LITERAL
                    	            {
                    	            lv_val_real_24_0=(Token)match(input,RULE_REAL_LITERAL,FOLLOW_RULE_REAL_LITERAL_in_ruleGroup5352); 

                    	            			newLeafNode(lv_val_real_24_0, grammarAccess.getGroupAccess().getVal_realREAL_LITERALTerminalRuleCall_4_2_4_2_3_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getGroupRule());
                    	            	        }
                    	                   		addWithLastConsumed(
                    	                   			current, 
                    	                   			"val_real",
                    	                    		lv_val_real_24_0, 
                    	                    		"REAL_LITERAL");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2589:3: ( ruleEOL )+
                    	    int cnt87=0;
                    	    loop87:
                    	    do {
                    	        int alt87=2;
                    	        int LA87_0 = input.LA(1);

                    	        if ( ((LA87_0>=RULE_NEWLINE && LA87_0<=RULE_SL_COMMENT)) ) {
                    	            alt87=1;
                    	        }


                    	        switch (alt87) {
                    	    	case 1 :
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2590:5: ruleEOL
                    	    	    {
                    	    	     
                    	    	            newCompositeNode(grammarAccess.getGroupAccess().getEOLParserRuleCall_4_2_4_3()); 
                    	    	        
                    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleGroup5375);
                    	    	    ruleEOL();

                    	    	    state._fsp--;

                    	    	     
                    	    	            afterParserOrEnumRuleCall();
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt87 >= 1 ) break loop87;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(87, input);
                    	                throw eee;
                    	        }
                    	        cnt87++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2598:6: (otherlv_26= 'players' otherlv_27= ':' ( ( (lv_agent_28_0= RULE_ATOM ) ) ( (lv_role_29_0= RULE_ATOM ) ) ( ruleEOL | otherlv_31= ',' )+ )* )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2598:6: (otherlv_26= 'players' otherlv_27= ':' ( ( (lv_agent_28_0= RULE_ATOM ) ) ( (lv_role_29_0= RULE_ATOM ) ) ( ruleEOL | otherlv_31= ',' )+ )* )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2598:8: otherlv_26= 'players' otherlv_27= ':' ( ( (lv_agent_28_0= RULE_ATOM ) ) ( (lv_role_29_0= RULE_ATOM ) ) ( ruleEOL | otherlv_31= ',' )+ )*
                    	    {
                    	    otherlv_26=(Token)match(input,65,FOLLOW_65_in_ruleGroup5396); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getGroupAccess().getPlayersKeyword_4_2_5_0());
                    	        
                    	    otherlv_27=(Token)match(input,29,FOLLOW_29_in_ruleGroup5408); 

                    	        	newLeafNode(otherlv_27, grammarAccess.getGroupAccess().getColonKeyword_4_2_5_1());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2606:1: ( ( (lv_agent_28_0= RULE_ATOM ) ) ( (lv_role_29_0= RULE_ATOM ) ) ( ruleEOL | otherlv_31= ',' )+ )*
                    	    loop89:
                    	    do {
                    	        int alt89=2;
                    	        int LA89_0 = input.LA(1);

                    	        if ( (LA89_0==RULE_ATOM) ) {
                    	            int LA89_2 = input.LA(2);

                    	            if ( (LA89_2==RULE_ATOM) ) {
                    	                alt89=1;
                    	            }


                    	        }


                    	        switch (alt89) {
                    	    	case 1 :
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2606:2: ( (lv_agent_28_0= RULE_ATOM ) ) ( (lv_role_29_0= RULE_ATOM ) ) ( ruleEOL | otherlv_31= ',' )+
                    	    	    {
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2606:2: ( (lv_agent_28_0= RULE_ATOM ) )
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2607:1: (lv_agent_28_0= RULE_ATOM )
                    	    	    {
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2607:1: (lv_agent_28_0= RULE_ATOM )
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2608:3: lv_agent_28_0= RULE_ATOM
                    	    	    {
                    	    	    lv_agent_28_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleGroup5426); 

                    	    	    			newLeafNode(lv_agent_28_0, grammarAccess.getGroupAccess().getAgentATOMTerminalRuleCall_4_2_5_2_0_0()); 
                    	    	    		

                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElement(grammarAccess.getGroupRule());
                    	    	    	        }
                    	    	           		addWithLastConsumed(
                    	    	           			current, 
                    	    	           			"agent",
                    	    	            		lv_agent_28_0, 
                    	    	            		"ATOM");
                    	    	    	    

                    	    	    }


                    	    	    }

                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2624:2: ( (lv_role_29_0= RULE_ATOM ) )
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2625:1: (lv_role_29_0= RULE_ATOM )
                    	    	    {
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2625:1: (lv_role_29_0= RULE_ATOM )
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2626:3: lv_role_29_0= RULE_ATOM
                    	    	    {
                    	    	    lv_role_29_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleGroup5448); 

                    	    	    			newLeafNode(lv_role_29_0, grammarAccess.getGroupAccess().getRoleATOMTerminalRuleCall_4_2_5_2_1_0()); 
                    	    	    		

                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElement(grammarAccess.getGroupRule());
                    	    	    	        }
                    	    	           		addWithLastConsumed(
                    	    	           			current, 
                    	    	           			"role",
                    	    	            		lv_role_29_0, 
                    	    	            		"ATOM");
                    	    	    	    

                    	    	    }


                    	    	    }

                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2642:2: ( ruleEOL | otherlv_31= ',' )+
                    	    	    int cnt88=0;
                    	    	    loop88:
                    	    	    do {
                    	    	        int alt88=3;
                    	    	        int LA88_0 = input.LA(1);

                    	    	        if ( ((LA88_0>=RULE_NEWLINE && LA88_0<=RULE_SL_COMMENT)) ) {
                    	    	            alt88=1;
                    	    	        }
                    	    	        else if ( (LA88_0==27) ) {
                    	    	            alt88=2;
                    	    	        }


                    	    	        switch (alt88) {
                    	    	    	case 1 :
                    	    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2643:5: ruleEOL
                    	    	    	    {
                    	    	    	     
                    	    	    	            newCompositeNode(grammarAccess.getGroupAccess().getEOLParserRuleCall_4_2_5_2_2_0()); 
                    	    	    	        
                    	    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleGroup5470);
                    	    	    	    ruleEOL();

                    	    	    	    state._fsp--;

                    	    	    	     
                    	    	    	            afterParserOrEnumRuleCall();
                    	    	    	        

                    	    	    	    }
                    	    	    	    break;
                    	    	    	case 2 :
                    	    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2651:7: otherlv_31= ','
                    	    	    	    {
                    	    	    	    otherlv_31=(Token)match(input,27,FOLLOW_27_in_ruleGroup5487); 

                    	    	    	        	newLeafNode(otherlv_31, grammarAccess.getGroupAccess().getCommaKeyword_4_2_5_2_2_1());
                    	    	    	        

                    	    	    	    }
                    	    	    	    break;

                    	    	    	default :
                    	    	    	    if ( cnt88 >= 1 ) break loop88;
                    	    	                EarlyExitException eee =
                    	    	                    new EarlyExitException(88, input);
                    	    	                throw eee;
                    	    	        }
                    	    	        cnt88++;
                    	    	    } while (true);


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop89;
                    	        }
                    	    } while (true);


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop90;
                        }
                    } while (true);

                    otherlv_32=(Token)match(input,25,FOLLOW_25_in_ruleGroup5506); 

                        	newLeafNode(otherlv_32, grammarAccess.getGroupAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2659:3: ( ruleEOL )*
            loop92:
            do {
                int alt92=2;
                int LA92_0 = input.LA(1);

                if ( ((LA92_0>=RULE_NEWLINE && LA92_0<=RULE_SL_COMMENT)) ) {
                    alt92=1;
                }


                switch (alt92) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2660:5: ruleEOL
            	    {
            	     
            	            newCompositeNode(grammarAccess.getGroupAccess().getEOLParserRuleCall_5()); 
            	        
            	    pushFollow(FOLLOW_ruleEOL_in_ruleGroup5525);
            	    ruleEOL();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop92;
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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2675:1: entryRuleScheme returns [EObject current=null] : iv_ruleScheme= ruleScheme EOF ;
    public final EObject entryRuleScheme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScheme = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2676:2: (iv_ruleScheme= ruleScheme EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2677:2: iv_ruleScheme= ruleScheme EOF
            {
             newCompositeNode(grammarAccess.getSchemeRule()); 
            pushFollow(FOLLOW_ruleScheme_in_entryRuleScheme5562);
            iv_ruleScheme=ruleScheme();

            state._fsp--;

             current =iv_ruleScheme; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScheme5572); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2684:1: ruleScheme returns [EObject current=null] : (otherlv_0= 'scheme' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_kind_3_0= RULE_ATOM ) ) (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'debug' (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | (otherlv_10= 'owner' otherlv_11= ':' ( (lv_owner_12_0= RULE_ATOM ) ) ( ruleEOL )+ ) | ( ( (lv_other_14_0= RULE_ATOM ) ) otherlv_15= ':' ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_21= '}' )? ( ruleEOL )* ) ;
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
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2687:28: ( (otherlv_0= 'scheme' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_kind_3_0= RULE_ATOM ) ) (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'debug' (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | (otherlv_10= 'owner' otherlv_11= ':' ( (lv_owner_12_0= RULE_ATOM ) ) ( ruleEOL )+ ) | ( ( (lv_other_14_0= RULE_ATOM ) ) otherlv_15= ':' ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_21= '}' )? ( ruleEOL )* ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2688:1: (otherlv_0= 'scheme' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_kind_3_0= RULE_ATOM ) ) (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'debug' (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | (otherlv_10= 'owner' otherlv_11= ':' ( (lv_owner_12_0= RULE_ATOM ) ) ( ruleEOL )+ ) | ( ( (lv_other_14_0= RULE_ATOM ) ) otherlv_15= ':' ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_21= '}' )? ( ruleEOL )* )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2688:1: (otherlv_0= 'scheme' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_kind_3_0= RULE_ATOM ) ) (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'debug' (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | (otherlv_10= 'owner' otherlv_11= ':' ( (lv_owner_12_0= RULE_ATOM ) ) ( ruleEOL )+ ) | ( ( (lv_other_14_0= RULE_ATOM ) ) otherlv_15= ':' ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_21= '}' )? ( ruleEOL )* )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2688:3: otherlv_0= 'scheme' ( (lv_name_1_0= RULE_ATOM ) ) otherlv_2= ':' ( (lv_kind_3_0= RULE_ATOM ) ) (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'debug' (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | (otherlv_10= 'owner' otherlv_11= ':' ( (lv_owner_12_0= RULE_ATOM ) ) ( ruleEOL )+ ) | ( ( (lv_other_14_0= RULE_ATOM ) ) otherlv_15= ':' ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_21= '}' )? ( ruleEOL )*
            {
            otherlv_0=(Token)match(input,66,FOLLOW_66_in_ruleScheme5609); 

                	newLeafNode(otherlv_0, grammarAccess.getSchemeAccess().getSchemeKeyword_0());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2692:1: ( (lv_name_1_0= RULE_ATOM ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2693:1: (lv_name_1_0= RULE_ATOM )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2693:1: (lv_name_1_0= RULE_ATOM )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2694:3: lv_name_1_0= RULE_ATOM
            {
            lv_name_1_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleScheme5626); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSchemeAccess().getNameATOMTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSchemeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ATOM");
            	    

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleScheme5643); 

                	newLeafNode(otherlv_2, grammarAccess.getSchemeAccess().getColonKeyword_2());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2714:1: ( (lv_kind_3_0= RULE_ATOM ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2715:1: (lv_kind_3_0= RULE_ATOM )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2715:1: (lv_kind_3_0= RULE_ATOM )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2716:3: lv_kind_3_0= RULE_ATOM
            {
            lv_kind_3_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleScheme5660); 

            			newLeafNode(lv_kind_3_0, grammarAccess.getSchemeAccess().getKindATOMTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSchemeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"kind",
                    		lv_kind_3_0, 
                    		"ATOM");
            	    

            }


            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2732:2: (otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'debug' (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | (otherlv_10= 'owner' otherlv_11= ':' ( (lv_owner_12_0= RULE_ATOM ) ) ( ruleEOL )+ ) | ( ( (lv_other_14_0= RULE_ATOM ) ) otherlv_15= ':' ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_21= '}' )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==24) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2732:4: otherlv_4= '{' ( ruleEOL )* ( (otherlv_6= 'debug' (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | (otherlv_10= 'owner' otherlv_11= ':' ( (lv_owner_12_0= RULE_ATOM ) ) ( ruleEOL )+ ) | ( ( (lv_other_14_0= RULE_ATOM ) ) otherlv_15= ':' ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )* otherlv_21= '}'
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleScheme5678); 

                        	newLeafNode(otherlv_4, grammarAccess.getSchemeAccess().getLeftCurlyBracketKeyword_4_0());
                        
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2736:1: ( ruleEOL )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( ((LA93_0>=RULE_NEWLINE && LA93_0<=RULE_SL_COMMENT)) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2737:5: ruleEOL
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getSchemeAccess().getEOLParserRuleCall_4_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleEOL_in_ruleScheme5695);
                    	    ruleEOL();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);

                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2744:3: ( (otherlv_6= 'debug' (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )? ( ruleEOL )+ ) | (otherlv_10= 'owner' otherlv_11= ':' ( (lv_owner_12_0= RULE_ATOM ) ) ( ruleEOL )+ ) | ( ( (lv_other_14_0= RULE_ATOM ) ) otherlv_15= ':' ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ ) )*
                    loop99:
                    do {
                        int alt99=4;
                        switch ( input.LA(1) ) {
                        case 46:
                            {
                            alt99=1;
                            }
                            break;
                        case 64:
                            {
                            alt99=2;
                            }
                            break;
                        case RULE_ATOM:
                            {
                            alt99=3;
                            }
                            break;

                        }

                        switch (alt99) {
                    	case 1 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2744:4: (otherlv_6= 'debug' (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )? ( ruleEOL )+ )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2744:4: (otherlv_6= 'debug' (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )? ( ruleEOL )+ )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2744:6: otherlv_6= 'debug' (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )? ( ruleEOL )+
                    	    {
                    	    otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleScheme5710); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getSchemeAccess().getDebugKeyword_4_2_0_0());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2748:1: (otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) ) )?
                    	    int alt94=2;
                    	    int LA94_0 = input.LA(1);

                    	    if ( (LA94_0==29) ) {
                    	        alt94=1;
                    	    }
                    	    switch (alt94) {
                    	        case 1 :
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2748:3: otherlv_7= ':' ( (lv_debug_8_0= ruleLiteral ) )
                    	            {
                    	            otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleScheme5723); 

                    	                	newLeafNode(otherlv_7, grammarAccess.getSchemeAccess().getColonKeyword_4_2_0_1_0());
                    	                
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2752:1: ( (lv_debug_8_0= ruleLiteral ) )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2753:1: (lv_debug_8_0= ruleLiteral )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2753:1: (lv_debug_8_0= ruleLiteral )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2754:3: lv_debug_8_0= ruleLiteral
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getSchemeAccess().getDebugLiteralParserRuleCall_4_2_0_1_1_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleLiteral_in_ruleScheme5744);
                    	            lv_debug_8_0=ruleLiteral();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getSchemeRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"debug",
                    	                    		lv_debug_8_0, 
                    	                    		"Literal");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2770:4: ( ruleEOL )+
                    	    int cnt95=0;
                    	    loop95:
                    	    do {
                    	        int alt95=2;
                    	        int LA95_0 = input.LA(1);

                    	        if ( ((LA95_0>=RULE_NEWLINE && LA95_0<=RULE_SL_COMMENT)) ) {
                    	            alt95=1;
                    	        }


                    	        switch (alt95) {
                    	    	case 1 :
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2771:5: ruleEOL
                    	    	    {
                    	    	     
                    	    	            newCompositeNode(grammarAccess.getSchemeAccess().getEOLParserRuleCall_4_2_0_2()); 
                    	    	        
                    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleScheme5763);
                    	    	    ruleEOL();

                    	    	    state._fsp--;

                    	    	     
                    	    	            afterParserOrEnumRuleCall();
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt95 >= 1 ) break loop95;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(95, input);
                    	                throw eee;
                    	        }
                    	        cnt95++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2779:6: (otherlv_10= 'owner' otherlv_11= ':' ( (lv_owner_12_0= RULE_ATOM ) ) ( ruleEOL )+ )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2779:6: (otherlv_10= 'owner' otherlv_11= ':' ( (lv_owner_12_0= RULE_ATOM ) ) ( ruleEOL )+ )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2779:8: otherlv_10= 'owner' otherlv_11= ':' ( (lv_owner_12_0= RULE_ATOM ) ) ( ruleEOL )+
                    	    {
                    	    otherlv_10=(Token)match(input,64,FOLLOW_64_in_ruleScheme5784); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getSchemeAccess().getOwnerKeyword_4_2_1_0());
                    	        
                    	    otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleScheme5796); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getSchemeAccess().getColonKeyword_4_2_1_1());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2787:1: ( (lv_owner_12_0= RULE_ATOM ) )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2788:1: (lv_owner_12_0= RULE_ATOM )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2788:1: (lv_owner_12_0= RULE_ATOM )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2789:3: lv_owner_12_0= RULE_ATOM
                    	    {
                    	    lv_owner_12_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleScheme5813); 

                    	    			newLeafNode(lv_owner_12_0, grammarAccess.getSchemeAccess().getOwnerATOMTerminalRuleCall_4_2_1_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSchemeRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"owner",
                    	            		lv_owner_12_0, 
                    	            		"ATOM");
                    	    	    

                    	    }


                    	    }

                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2805:2: ( ruleEOL )+
                    	    int cnt96=0;
                    	    loop96:
                    	    do {
                    	        int alt96=2;
                    	        int LA96_0 = input.LA(1);

                    	        if ( ((LA96_0>=RULE_NEWLINE && LA96_0<=RULE_SL_COMMENT)) ) {
                    	            alt96=1;
                    	        }


                    	        switch (alt96) {
                    	    	case 1 :
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2806:5: ruleEOL
                    	    	    {
                    	    	     
                    	    	            newCompositeNode(grammarAccess.getSchemeAccess().getEOLParserRuleCall_4_2_1_3()); 
                    	    	        
                    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleScheme5835);
                    	    	    ruleEOL();

                    	    	    state._fsp--;

                    	    	     
                    	    	            afterParserOrEnumRuleCall();
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt96 >= 1 ) break loop96;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(96, input);
                    	                throw eee;
                    	        }
                    	        cnt96++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2814:6: ( ( (lv_other_14_0= RULE_ATOM ) ) otherlv_15= ':' ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2814:6: ( ( (lv_other_14_0= RULE_ATOM ) ) otherlv_15= ':' ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+ )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2814:7: ( (lv_other_14_0= RULE_ATOM ) ) otherlv_15= ':' ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) ) ( ruleEOL )+
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2814:7: ( (lv_other_14_0= RULE_ATOM ) )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2815:1: (lv_other_14_0= RULE_ATOM )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2815:1: (lv_other_14_0= RULE_ATOM )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2816:3: lv_other_14_0= RULE_ATOM
                    	    {
                    	    lv_other_14_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleScheme5861); 

                    	    			newLeafNode(lv_other_14_0, grammarAccess.getSchemeAccess().getOtherATOMTerminalRuleCall_4_2_2_0_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSchemeRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"other",
                    	            		lv_other_14_0, 
                    	            		"ATOM");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_15=(Token)match(input,29,FOLLOW_29_in_ruleScheme5878); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getSchemeAccess().getColonKeyword_4_2_2_1());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2836:1: ( ( (lv_string_16_0= RULE_STRING ) ) | ( (lv_val_17_0= RULE_INT_LITERAL ) ) | ( (lv_literal_18_0= ruleLiteral ) ) | ( (lv_val_real_19_0= RULE_REAL_LITERAL ) ) )
                    	    int alt97=4;
                    	    switch ( input.LA(1) ) {
                    	    case RULE_STRING:
                    	        {
                    	        alt97=1;
                    	        }
                    	        break;
                    	    case RULE_INT_LITERAL:
                    	        {
                    	        alt97=2;
                    	        }
                    	        break;
                    	    case RULE_ATOM:
                    	    case RULE_VART:
                    	    case RULE_UNNAMEDVART:
                    	    case 75:
                    	    case 76:
                    	    case 77:
                    	    case 78:
                    	    case 79:
                    	        {
                    	        alt97=3;
                    	        }
                    	        break;
                    	    case RULE_REAL_LITERAL:
                    	        {
                    	        alt97=4;
                    	        }
                    	        break;
                    	    default:
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 97, 0, input);

                    	        throw nvae;
                    	    }

                    	    switch (alt97) {
                    	        case 1 :
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2836:2: ( (lv_string_16_0= RULE_STRING ) )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2836:2: ( (lv_string_16_0= RULE_STRING ) )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2837:1: (lv_string_16_0= RULE_STRING )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2837:1: (lv_string_16_0= RULE_STRING )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2838:3: lv_string_16_0= RULE_STRING
                    	            {
                    	            lv_string_16_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleScheme5896); 

                    	            			newLeafNode(lv_string_16_0, grammarAccess.getSchemeAccess().getStringSTRINGTerminalRuleCall_4_2_2_2_0_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getSchemeRule());
                    	            	        }
                    	                   		addWithLastConsumed(
                    	                   			current, 
                    	                   			"string",
                    	                    		lv_string_16_0, 
                    	                    		"STRING");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2855:6: ( (lv_val_17_0= RULE_INT_LITERAL ) )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2855:6: ( (lv_val_17_0= RULE_INT_LITERAL ) )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2856:1: (lv_val_17_0= RULE_INT_LITERAL )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2856:1: (lv_val_17_0= RULE_INT_LITERAL )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2857:3: lv_val_17_0= RULE_INT_LITERAL
                    	            {
                    	            lv_val_17_0=(Token)match(input,RULE_INT_LITERAL,FOLLOW_RULE_INT_LITERAL_in_ruleScheme5924); 

                    	            			newLeafNode(lv_val_17_0, grammarAccess.getSchemeAccess().getValINT_LITERALTerminalRuleCall_4_2_2_2_1_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getSchemeRule());
                    	            	        }
                    	                   		addWithLastConsumed(
                    	                   			current, 
                    	                   			"val",
                    	                    		lv_val_17_0, 
                    	                    		"INT_LITERAL");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 3 :
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2874:6: ( (lv_literal_18_0= ruleLiteral ) )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2874:6: ( (lv_literal_18_0= ruleLiteral ) )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2875:1: (lv_literal_18_0= ruleLiteral )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2875:1: (lv_literal_18_0= ruleLiteral )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2876:3: lv_literal_18_0= ruleLiteral
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getSchemeAccess().getLiteralLiteralParserRuleCall_4_2_2_2_2_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleLiteral_in_ruleScheme5956);
                    	            lv_literal_18_0=ruleLiteral();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getSchemeRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"literal",
                    	                    		lv_literal_18_0, 
                    	                    		"Literal");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 4 :
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2893:6: ( (lv_val_real_19_0= RULE_REAL_LITERAL ) )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2893:6: ( (lv_val_real_19_0= RULE_REAL_LITERAL ) )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2894:1: (lv_val_real_19_0= RULE_REAL_LITERAL )
                    	            {
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2894:1: (lv_val_real_19_0= RULE_REAL_LITERAL )
                    	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2895:3: lv_val_real_19_0= RULE_REAL_LITERAL
                    	            {
                    	            lv_val_real_19_0=(Token)match(input,RULE_REAL_LITERAL,FOLLOW_RULE_REAL_LITERAL_in_ruleScheme5979); 

                    	            			newLeafNode(lv_val_real_19_0, grammarAccess.getSchemeAccess().getVal_realREAL_LITERALTerminalRuleCall_4_2_2_2_3_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getSchemeRule());
                    	            	        }
                    	                   		addWithLastConsumed(
                    	                   			current, 
                    	                   			"val_real",
                    	                    		lv_val_real_19_0, 
                    	                    		"REAL_LITERAL");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2911:3: ( ruleEOL )+
                    	    int cnt98=0;
                    	    loop98:
                    	    do {
                    	        int alt98=2;
                    	        int LA98_0 = input.LA(1);

                    	        if ( ((LA98_0>=RULE_NEWLINE && LA98_0<=RULE_SL_COMMENT)) ) {
                    	            alt98=1;
                    	        }


                    	        switch (alt98) {
                    	    	case 1 :
                    	    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2912:5: ruleEOL
                    	    	    {
                    	    	     
                    	    	            newCompositeNode(grammarAccess.getSchemeAccess().getEOLParserRuleCall_4_2_2_3()); 
                    	    	        
                    	    	    pushFollow(FOLLOW_ruleEOL_in_ruleScheme6002);
                    	    	    ruleEOL();

                    	    	    state._fsp--;

                    	    	     
                    	    	            afterParserOrEnumRuleCall();
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt98 >= 1 ) break loop98;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(98, input);
                    	                throw eee;
                    	        }
                    	        cnt98++;
                    	    } while (true);


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop99;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,25,FOLLOW_25_in_ruleScheme6018); 

                        	newLeafNode(otherlv_21, grammarAccess.getSchemeAccess().getRightCurlyBracketKeyword_4_3());
                        

                    }
                    break;

            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2923:3: ( ruleEOL )*
            loop101:
            do {
                int alt101=2;
                int LA101_0 = input.LA(1);

                if ( ((LA101_0>=RULE_NEWLINE && LA101_0<=RULE_SL_COMMENT)) ) {
                    alt101=1;
                }


                switch (alt101) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2924:5: ruleEOL
            	    {
            	     
            	            newCompositeNode(grammarAccess.getSchemeAccess().getEOLParserRuleCall_5()); 
            	        
            	    pushFollow(FOLLOW_ruleEOL_in_ruleScheme6037);
            	    ruleEOL();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop101;
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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2939:1: entryRuleHost returns [EObject current=null] : iv_ruleHost= ruleHost EOF ;
    public final EObject entryRuleHost() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHost = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2940:2: (iv_ruleHost= ruleHost EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2941:2: iv_ruleHost= ruleHost EOF
            {
             newCompositeNode(grammarAccess.getHostRule()); 
            pushFollow(FOLLOW_ruleHost_in_entryRuleHost6074);
            iv_ruleHost=ruleHost();

            state._fsp--;

             current =iv_ruleHost; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHost6084); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2948:1: ruleHost returns [EObject current=null] : ( ( ( (lv_name_0_0= RULE_ATOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_ip_2_0= RULE_IP ) ) ) (otherlv_3= ':' ( (lv_val_4_0= RULE_INT_LITERAL ) ) )? ) ;
    public final EObject ruleHost() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_string_1_0=null;
        Token lv_ip_2_0=null;
        Token otherlv_3=null;
        Token lv_val_4_0=null;

         enterRule(); 
            
        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2951:28: ( ( ( ( (lv_name_0_0= RULE_ATOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_ip_2_0= RULE_IP ) ) ) (otherlv_3= ':' ( (lv_val_4_0= RULE_INT_LITERAL ) ) )? ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2952:1: ( ( ( (lv_name_0_0= RULE_ATOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_ip_2_0= RULE_IP ) ) ) (otherlv_3= ':' ( (lv_val_4_0= RULE_INT_LITERAL ) ) )? )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2952:1: ( ( ( (lv_name_0_0= RULE_ATOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_ip_2_0= RULE_IP ) ) ) (otherlv_3= ':' ( (lv_val_4_0= RULE_INT_LITERAL ) ) )? )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2952:2: ( ( (lv_name_0_0= RULE_ATOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_ip_2_0= RULE_IP ) ) ) (otherlv_3= ':' ( (lv_val_4_0= RULE_INT_LITERAL ) ) )?
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2952:2: ( ( (lv_name_0_0= RULE_ATOM ) ) | ( (lv_string_1_0= RULE_STRING ) ) | ( (lv_ip_2_0= RULE_IP ) ) )
            int alt102=3;
            switch ( input.LA(1) ) {
            case RULE_ATOM:
                {
                alt102=1;
                }
                break;
            case RULE_STRING:
                {
                alt102=2;
                }
                break;
            case RULE_IP:
                {
                alt102=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2952:3: ( (lv_name_0_0= RULE_ATOM ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2952:3: ( (lv_name_0_0= RULE_ATOM ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2953:1: (lv_name_0_0= RULE_ATOM )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2953:1: (lv_name_0_0= RULE_ATOM )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2954:3: lv_name_0_0= RULE_ATOM
                    {
                    lv_name_0_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleHost6127); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getHostAccess().getNameATOMTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHostRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ATOM");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2971:6: ( (lv_string_1_0= RULE_STRING ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2971:6: ( (lv_string_1_0= RULE_STRING ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2972:1: (lv_string_1_0= RULE_STRING )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2972:1: (lv_string_1_0= RULE_STRING )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2973:3: lv_string_1_0= RULE_STRING
                    {
                    lv_string_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHost6155); 

                    			newLeafNode(lv_string_1_0, grammarAccess.getHostAccess().getStringSTRINGTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHostRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"string",
                            		lv_string_1_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2990:6: ( (lv_ip_2_0= RULE_IP ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2990:6: ( (lv_ip_2_0= RULE_IP ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2991:1: (lv_ip_2_0= RULE_IP )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2991:1: (lv_ip_2_0= RULE_IP )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:2992:3: lv_ip_2_0= RULE_IP
                    {
                    lv_ip_2_0=(Token)match(input,RULE_IP,FOLLOW_RULE_IP_in_ruleHost6183); 

                    			newLeafNode(lv_ip_2_0, grammarAccess.getHostAccess().getIpIPTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHostRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ip",
                            		lv_ip_2_0, 
                            		"IP");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3008:3: (otherlv_3= ':' ( (lv_val_4_0= RULE_INT_LITERAL ) ) )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==29) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3008:5: otherlv_3= ':' ( (lv_val_4_0= RULE_INT_LITERAL ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleHost6202); 

                        	newLeafNode(otherlv_3, grammarAccess.getHostAccess().getColonKeyword_1_0());
                        
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3012:1: ( (lv_val_4_0= RULE_INT_LITERAL ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3013:1: (lv_val_4_0= RULE_INT_LITERAL )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3013:1: (lv_val_4_0= RULE_INT_LITERAL )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3014:3: lv_val_4_0= RULE_INT_LITERAL
                    {
                    lv_val_4_0=(Token)match(input,RULE_INT_LITERAL,FOLLOW_RULE_INT_LITERAL_in_ruleHost6219); 

                    			newLeafNode(lv_val_4_0, grammarAccess.getHostAccess().getValINT_LITERALTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getHostRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_4_0, 
                            		"INT_LITERAL");
                    	    

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3038:1: entryRuleFileName returns [EObject current=null] : iv_ruleFileName= ruleFileName EOF ;
    public final EObject entryRuleFileName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileName = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3039:2: (iv_ruleFileName= ruleFileName EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3040:2: iv_ruleFileName= ruleFileName EOF
            {
             newCompositeNode(grammarAccess.getFileNameRule()); 
            pushFollow(FOLLOW_ruleFileName_in_entryRuleFileName6262);
            iv_ruleFileName=ruleFileName();

            state._fsp--;

             current =iv_ruleFileName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFileName6272); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3047:1: ruleFileName returns [EObject current=null] : ( () ( (otherlv_1= '/' | otherlv_2= '-' | otherlv_3= '.' | otherlv_4= '..' | ( (lv_name_5_0= RULE_ATOM ) ) )+ | ( (lv_string_6_0= RULE_STRING ) ) ) ) ;
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
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3050:28: ( ( () ( (otherlv_1= '/' | otherlv_2= '-' | otherlv_3= '.' | otherlv_4= '..' | ( (lv_name_5_0= RULE_ATOM ) ) )+ | ( (lv_string_6_0= RULE_STRING ) ) ) ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3051:1: ( () ( (otherlv_1= '/' | otherlv_2= '-' | otherlv_3= '.' | otherlv_4= '..' | ( (lv_name_5_0= RULE_ATOM ) ) )+ | ( (lv_string_6_0= RULE_STRING ) ) ) )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3051:1: ( () ( (otherlv_1= '/' | otherlv_2= '-' | otherlv_3= '.' | otherlv_4= '..' | ( (lv_name_5_0= RULE_ATOM ) ) )+ | ( (lv_string_6_0= RULE_STRING ) ) ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3051:2: () ( (otherlv_1= '/' | otherlv_2= '-' | otherlv_3= '.' | otherlv_4= '..' | ( (lv_name_5_0= RULE_ATOM ) ) )+ | ( (lv_string_6_0= RULE_STRING ) ) )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3051:2: ()
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3052:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFileNameAccess().getFileNameAction_0(),
                        current);
                

            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3057:2: ( (otherlv_1= '/' | otherlv_2= '-' | otherlv_3= '.' | otherlv_4= '..' | ( (lv_name_5_0= RULE_ATOM ) ) )+ | ( (lv_string_6_0= RULE_STRING ) ) )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==RULE_ATOM||(LA105_0>=67 && LA105_0<=70)) ) {
                alt105=1;
            }
            else if ( (LA105_0==RULE_STRING) ) {
                alt105=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3057:3: (otherlv_1= '/' | otherlv_2= '-' | otherlv_3= '.' | otherlv_4= '..' | ( (lv_name_5_0= RULE_ATOM ) ) )+
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3057:3: (otherlv_1= '/' | otherlv_2= '-' | otherlv_3= '.' | otherlv_4= '..' | ( (lv_name_5_0= RULE_ATOM ) ) )+
                    int cnt104=0;
                    loop104:
                    do {
                        int alt104=6;
                        switch ( input.LA(1) ) {
                        case 67:
                            {
                            alt104=1;
                            }
                            break;
                        case 68:
                            {
                            alt104=2;
                            }
                            break;
                        case 69:
                            {
                            alt104=3;
                            }
                            break;
                        case 70:
                            {
                            alt104=4;
                            }
                            break;
                        case RULE_ATOM:
                            {
                            alt104=5;
                            }
                            break;

                        }

                        switch (alt104) {
                    	case 1 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3057:5: otherlv_1= '/'
                    	    {
                    	    otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleFileName6320); 

                    	        	newLeafNode(otherlv_1, grammarAccess.getFileNameAccess().getSolidusKeyword_1_0_0());
                    	        

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3062:7: otherlv_2= '-'
                    	    {
                    	    otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleFileName6338); 

                    	        	newLeafNode(otherlv_2, grammarAccess.getFileNameAccess().getHyphenMinusKeyword_1_0_1());
                    	        

                    	    }
                    	    break;
                    	case 3 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3067:7: otherlv_3= '.'
                    	    {
                    	    otherlv_3=(Token)match(input,69,FOLLOW_69_in_ruleFileName6356); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getFileNameAccess().getFullStopKeyword_1_0_2());
                    	        

                    	    }
                    	    break;
                    	case 4 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3072:7: otherlv_4= '..'
                    	    {
                    	    otherlv_4=(Token)match(input,70,FOLLOW_70_in_ruleFileName6374); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getFileNameAccess().getFullStopFullStopKeyword_1_0_3());
                    	        

                    	    }
                    	    break;
                    	case 5 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3077:6: ( (lv_name_5_0= RULE_ATOM ) )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3077:6: ( (lv_name_5_0= RULE_ATOM ) )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3078:1: (lv_name_5_0= RULE_ATOM )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3078:1: (lv_name_5_0= RULE_ATOM )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3079:3: lv_name_5_0= RULE_ATOM
                    	    {
                    	    lv_name_5_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleFileName6397); 

                    	    			newLeafNode(lv_name_5_0, grammarAccess.getFileNameAccess().getNameATOMTerminalRuleCall_1_0_4_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getFileNameRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"name",
                    	            		lv_name_5_0, 
                    	            		"ATOM");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt104 >= 1 ) break loop104;
                                EarlyExitException eee =
                                    new EarlyExitException(104, input);
                                throw eee;
                        }
                        cnt104++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3096:6: ( (lv_string_6_0= RULE_STRING ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3096:6: ( (lv_string_6_0= RULE_STRING ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3097:1: (lv_string_6_0= RULE_STRING )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3097:1: (lv_string_6_0= RULE_STRING )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3098:3: lv_string_6_0= RULE_STRING
                    {
                    lv_string_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFileName6427); 

                    			newLeafNode(lv_string_6_0, grammarAccess.getFileNameAccess().getStringSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFileNameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"string",
                            		lv_string_6_0, 
                            		"STRING");
                    	    

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3122:1: entryRuleClassDef returns [EObject current=null] : iv_ruleClassDef= ruleClassDef EOF ;
    public final EObject entryRuleClassDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassDef = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3123:2: (iv_ruleClassDef= ruleClassDef EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3124:2: iv_ruleClassDef= ruleClassDef EOF
            {
             newCompositeNode(grammarAccess.getClassDefRule()); 
            pushFollow(FOLLOW_ruleClassDef_in_entryRuleClassDef6469);
            iv_ruleClassDef=ruleClassDef();

            state._fsp--;

             current =iv_ruleClassDef; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClassDef6479); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3131:1: ruleClassDef returns [EObject current=null] : ( ( (lv_infrastructure_0_0= ruleFQN ) ) (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )* )? otherlv_5= ')' )? ) ;
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
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3134:28: ( ( ( (lv_infrastructure_0_0= ruleFQN ) ) (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )* )? otherlv_5= ')' )? ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3135:1: ( ( (lv_infrastructure_0_0= ruleFQN ) ) (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )* )? otherlv_5= ')' )? )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3135:1: ( ( (lv_infrastructure_0_0= ruleFQN ) ) (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )* )? otherlv_5= ')' )? )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3135:2: ( (lv_infrastructure_0_0= ruleFQN ) ) (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )* )? otherlv_5= ')' )?
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3135:2: ( (lv_infrastructure_0_0= ruleFQN ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3136:1: (lv_infrastructure_0_0= ruleFQN )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3136:1: (lv_infrastructure_0_0= ruleFQN )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3137:3: lv_infrastructure_0_0= ruleFQN
            {
             
            	        newCompositeNode(grammarAccess.getClassDefAccess().getInfrastructureFQNParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleFQN_in_ruleClassDef6525);
            lv_infrastructure_0_0=ruleFQN();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassDefRule());
            	        }
                   		set(
                   			current, 
                   			"infrastructure",
                    		lv_infrastructure_0_0, 
                    		"FQN");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3153:2: (otherlv_1= '(' ( ( (lv_parameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )* )? otherlv_5= ')' )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==71) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3153:4: otherlv_1= '(' ( ( (lv_parameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )* )? otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleClassDef6538); 

                        	newLeafNode(otherlv_1, grammarAccess.getClassDefAccess().getLeftParenthesisKeyword_1_0());
                        
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3157:1: ( ( (lv_parameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )* )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( ((LA107_0>=RULE_ATOM && LA107_0<=RULE_REAL_LITERAL)||LA107_0==RULE_VART||LA107_0==73) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3157:2: ( (lv_parameter_2_0= ruleParameter ) ) (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )*
                            {
                            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3157:2: ( (lv_parameter_2_0= ruleParameter ) )
                            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3158:1: (lv_parameter_2_0= ruleParameter )
                            {
                            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3158:1: (lv_parameter_2_0= ruleParameter )
                            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3159:3: lv_parameter_2_0= ruleParameter
                            {
                             
                            	        newCompositeNode(grammarAccess.getClassDefAccess().getParameterParameterParserRuleCall_1_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameter_in_ruleClassDef6560);
                            lv_parameter_2_0=ruleParameter();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getClassDefRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"parameter",
                                    		lv_parameter_2_0, 
                                    		"Parameter");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3175:2: (otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) ) )*
                            loop106:
                            do {
                                int alt106=2;
                                int LA106_0 = input.LA(1);

                                if ( (LA106_0==27) ) {
                                    alt106=1;
                                }


                                switch (alt106) {
                            	case 1 :
                            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3175:4: otherlv_3= ',' ( (lv_parameter_4_0= ruleParameter ) )
                            	    {
                            	    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleClassDef6573); 

                            	        	newLeafNode(otherlv_3, grammarAccess.getClassDefAccess().getCommaKeyword_1_1_1_0());
                            	        
                            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3179:1: ( (lv_parameter_4_0= ruleParameter ) )
                            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3180:1: (lv_parameter_4_0= ruleParameter )
                            	    {
                            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3180:1: (lv_parameter_4_0= ruleParameter )
                            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3181:3: lv_parameter_4_0= ruleParameter
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getClassDefAccess().getParameterParameterParserRuleCall_1_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleClassDef6594);
                            	    lv_parameter_4_0=ruleParameter();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getClassDefRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"parameter",
                            	            		lv_parameter_4_0, 
                            	            		"Parameter");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop106;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,72,FOLLOW_72_in_ruleClassDef6610); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3209:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3210:2: (iv_ruleParameter= ruleParameter EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3211:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter6648);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter6658); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3218:1: ruleParameter returns [EObject current=null] : ( ( (lv_classDef_0_0= ruleClassDef ) ) | ( (lv_val_1_0= RULE_INT_LITERAL ) ) | ( (lv_val_real_2_0= RULE_REAL_LITERAL ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_listParameters_4_0= ruleListParameters ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_val_1_0=null;
        Token lv_val_real_2_0=null;
        Token lv_string_3_0=null;
        EObject lv_classDef_0_0 = null;

        EObject lv_listParameters_4_0 = null;


         enterRule(); 
            
        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3221:28: ( ( ( (lv_classDef_0_0= ruleClassDef ) ) | ( (lv_val_1_0= RULE_INT_LITERAL ) ) | ( (lv_val_real_2_0= RULE_REAL_LITERAL ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_listParameters_4_0= ruleListParameters ) ) ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3222:1: ( ( (lv_classDef_0_0= ruleClassDef ) ) | ( (lv_val_1_0= RULE_INT_LITERAL ) ) | ( (lv_val_real_2_0= RULE_REAL_LITERAL ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_listParameters_4_0= ruleListParameters ) ) )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3222:1: ( ( (lv_classDef_0_0= ruleClassDef ) ) | ( (lv_val_1_0= RULE_INT_LITERAL ) ) | ( (lv_val_real_2_0= RULE_REAL_LITERAL ) ) | ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_listParameters_4_0= ruleListParameters ) ) )
            int alt109=5;
            switch ( input.LA(1) ) {
            case RULE_ATOM:
            case RULE_VART:
                {
                alt109=1;
                }
                break;
            case RULE_INT_LITERAL:
                {
                alt109=2;
                }
                break;
            case RULE_REAL_LITERAL:
                {
                alt109=3;
                }
                break;
            case RULE_STRING:
                {
                alt109=4;
                }
                break;
            case 73:
                {
                alt109=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3222:2: ( (lv_classDef_0_0= ruleClassDef ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3222:2: ( (lv_classDef_0_0= ruleClassDef ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3223:1: (lv_classDef_0_0= ruleClassDef )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3223:1: (lv_classDef_0_0= ruleClassDef )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3224:3: lv_classDef_0_0= ruleClassDef
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getClassDefClassDefParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleClassDef_in_ruleParameter6704);
                    lv_classDef_0_0=ruleClassDef();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"classDef",
                            		lv_classDef_0_0, 
                            		"ClassDef");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3241:6: ( (lv_val_1_0= RULE_INT_LITERAL ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3241:6: ( (lv_val_1_0= RULE_INT_LITERAL ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3242:1: (lv_val_1_0= RULE_INT_LITERAL )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3242:1: (lv_val_1_0= RULE_INT_LITERAL )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3243:3: lv_val_1_0= RULE_INT_LITERAL
                    {
                    lv_val_1_0=(Token)match(input,RULE_INT_LITERAL,FOLLOW_RULE_INT_LITERAL_in_ruleParameter6727); 

                    			newLeafNode(lv_val_1_0, grammarAccess.getParameterAccess().getValINT_LITERALTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_1_0, 
                            		"INT_LITERAL");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3260:6: ( (lv_val_real_2_0= RULE_REAL_LITERAL ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3260:6: ( (lv_val_real_2_0= RULE_REAL_LITERAL ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3261:1: (lv_val_real_2_0= RULE_REAL_LITERAL )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3261:1: (lv_val_real_2_0= RULE_REAL_LITERAL )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3262:3: lv_val_real_2_0= RULE_REAL_LITERAL
                    {
                    lv_val_real_2_0=(Token)match(input,RULE_REAL_LITERAL,FOLLOW_RULE_REAL_LITERAL_in_ruleParameter6755); 

                    			newLeafNode(lv_val_real_2_0, grammarAccess.getParameterAccess().getVal_realREAL_LITERALTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"val_real",
                            		lv_val_real_2_0, 
                            		"REAL_LITERAL");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3279:6: ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3279:6: ( (lv_string_3_0= RULE_STRING ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3280:1: (lv_string_3_0= RULE_STRING )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3280:1: (lv_string_3_0= RULE_STRING )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3281:3: lv_string_3_0= RULE_STRING
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleParameter6783); 

                    			newLeafNode(lv_string_3_0, grammarAccess.getParameterAccess().getStringSTRINGTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getParameterRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"string",
                            		lv_string_3_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3298:6: ( (lv_listParameters_4_0= ruleListParameters ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3298:6: ( (lv_listParameters_4_0= ruleListParameters ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3299:1: (lv_listParameters_4_0= ruleListParameters )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3299:1: (lv_listParameters_4_0= ruleListParameters )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3300:3: lv_listParameters_4_0= ruleListParameters
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getListParametersListParametersParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleListParameters_in_ruleParameter6815);
                    lv_listParameters_4_0=ruleListParameters();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"listParameters",
                            		lv_listParameters_4_0, 
                            		"ListParameters");
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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3324:1: entryRuleListParameters returns [EObject current=null] : iv_ruleListParameters= ruleListParameters EOF ;
    public final EObject entryRuleListParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListParameters = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3325:2: (iv_ruleListParameters= ruleListParameters EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3326:2: iv_ruleListParameters= ruleListParameters EOF
            {
             newCompositeNode(grammarAccess.getListParametersRule()); 
            pushFollow(FOLLOW_ruleListParameters_in_entryRuleListParameters6851);
            iv_ruleListParameters=ruleListParameters();

            state._fsp--;

             current =iv_ruleListParameters; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListParameters6861); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3333:1: ruleListParameters returns [EObject current=null] : (otherlv_0= '[' ( (lv_parameter_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameter_3_0= ruleParameter ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleListParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameter_1_0 = null;

        EObject lv_parameter_3_0 = null;


         enterRule(); 
            
        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3336:28: ( (otherlv_0= '[' ( (lv_parameter_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameter_3_0= ruleParameter ) ) )* otherlv_4= ']' ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3337:1: (otherlv_0= '[' ( (lv_parameter_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameter_3_0= ruleParameter ) ) )* otherlv_4= ']' )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3337:1: (otherlv_0= '[' ( (lv_parameter_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameter_3_0= ruleParameter ) ) )* otherlv_4= ']' )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3337:3: otherlv_0= '[' ( (lv_parameter_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameter_3_0= ruleParameter ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_73_in_ruleListParameters6898); 

                	newLeafNode(otherlv_0, grammarAccess.getListParametersAccess().getLeftSquareBracketKeyword_0());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3341:1: ( (lv_parameter_1_0= ruleParameter ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3342:1: (lv_parameter_1_0= ruleParameter )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3342:1: (lv_parameter_1_0= ruleParameter )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3343:3: lv_parameter_1_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getListParametersAccess().getParameterParameterParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleListParameters6919);
            lv_parameter_1_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getListParametersRule());
            	        }
                   		add(
                   			current, 
                   			"parameter",
                    		lv_parameter_1_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3359:2: (otherlv_2= ',' ( (lv_parameter_3_0= ruleParameter ) ) )*
            loop110:
            do {
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==27) ) {
                    alt110=1;
                }


                switch (alt110) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3359:4: otherlv_2= ',' ( (lv_parameter_3_0= ruleParameter ) )
            	    {
            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleListParameters6932); 

            	        	newLeafNode(otherlv_2, grammarAccess.getListParametersAccess().getCommaKeyword_2_0());
            	        
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3363:1: ( (lv_parameter_3_0= ruleParameter ) )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3364:1: (lv_parameter_3_0= ruleParameter )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3364:1: (lv_parameter_3_0= ruleParameter )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3365:3: lv_parameter_3_0= ruleParameter
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getListParametersAccess().getParameterParameterParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleParameter_in_ruleListParameters6953);
            	    lv_parameter_3_0=ruleParameter();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getListParametersRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"parameter",
            	            		lv_parameter_3_0, 
            	            		"Parameter");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop110;
                }
            } while (true);

            otherlv_4=(Token)match(input,74,FOLLOW_74_in_ruleListParameters6967); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3393:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3394:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3395:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral7003);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral7013); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3402:1: ruleLiteral returns [EObject current=null] : ( () ( ( (otherlv_1= '~' )? ( ( (lv_pred_2_0= rulePred ) ) | ( (lv_var_3_0= ruleVar ) ) ) ) | otherlv_4= 'true' | otherlv_5= 'false' ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_pred_2_0 = null;

        EObject lv_var_3_0 = null;


         enterRule(); 
            
        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3405:28: ( ( () ( ( (otherlv_1= '~' )? ( ( (lv_pred_2_0= rulePred ) ) | ( (lv_var_3_0= ruleVar ) ) ) ) | otherlv_4= 'true' | otherlv_5= 'false' ) ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3406:1: ( () ( ( (otherlv_1= '~' )? ( ( (lv_pred_2_0= rulePred ) ) | ( (lv_var_3_0= ruleVar ) ) ) ) | otherlv_4= 'true' | otherlv_5= 'false' ) )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3406:1: ( () ( ( (otherlv_1= '~' )? ( ( (lv_pred_2_0= rulePred ) ) | ( (lv_var_3_0= ruleVar ) ) ) ) | otherlv_4= 'true' | otherlv_5= 'false' ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3406:2: () ( ( (otherlv_1= '~' )? ( ( (lv_pred_2_0= rulePred ) ) | ( (lv_var_3_0= ruleVar ) ) ) ) | otherlv_4= 'true' | otherlv_5= 'false' )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3406:2: ()
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3407:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getLiteralAccess().getLiteralAction_0(),
                        current);
                

            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3412:2: ( ( (otherlv_1= '~' )? ( ( (lv_pred_2_0= rulePred ) ) | ( (lv_var_3_0= ruleVar ) ) ) ) | otherlv_4= 'true' | otherlv_5= 'false' )
            int alt113=3;
            switch ( input.LA(1) ) {
            case RULE_ATOM:
            case RULE_VART:
            case RULE_UNNAMEDVART:
            case 75:
            case 78:
            case 79:
                {
                alt113=1;
                }
                break;
            case 76:
                {
                alt113=2;
                }
                break;
            case 77:
                {
                alt113=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3412:3: ( (otherlv_1= '~' )? ( ( (lv_pred_2_0= rulePred ) ) | ( (lv_var_3_0= ruleVar ) ) ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3412:3: ( (otherlv_1= '~' )? ( ( (lv_pred_2_0= rulePred ) ) | ( (lv_var_3_0= ruleVar ) ) ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3412:4: (otherlv_1= '~' )? ( ( (lv_pred_2_0= rulePred ) ) | ( (lv_var_3_0= ruleVar ) ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3412:4: (otherlv_1= '~' )?
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==75) ) {
                        alt111=1;
                    }
                    switch (alt111) {
                        case 1 :
                            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3412:6: otherlv_1= '~'
                            {
                            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleLiteral7062); 

                                	newLeafNode(otherlv_1, grammarAccess.getLiteralAccess().getTildeKeyword_1_0_0());
                                

                            }
                            break;

                    }

                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3416:3: ( ( (lv_pred_2_0= rulePred ) ) | ( (lv_var_3_0= ruleVar ) ) )
                    int alt112=2;
                    int LA112_0 = input.LA(1);

                    if ( (LA112_0==RULE_ATOM||(LA112_0>=78 && LA112_0<=79)) ) {
                        alt112=1;
                    }
                    else if ( ((LA112_0>=RULE_VART && LA112_0<=RULE_UNNAMEDVART)) ) {
                        alt112=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 112, 0, input);

                        throw nvae;
                    }
                    switch (alt112) {
                        case 1 :
                            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3416:4: ( (lv_pred_2_0= rulePred ) )
                            {
                            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3416:4: ( (lv_pred_2_0= rulePred ) )
                            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3417:1: (lv_pred_2_0= rulePred )
                            {
                            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3417:1: (lv_pred_2_0= rulePred )
                            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3418:3: lv_pred_2_0= rulePred
                            {
                             
                            	        newCompositeNode(grammarAccess.getLiteralAccess().getPredPredParserRuleCall_1_0_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_rulePred_in_ruleLiteral7086);
                            lv_pred_2_0=rulePred();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"pred",
                                    		lv_pred_2_0, 
                                    		"Pred");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3435:6: ( (lv_var_3_0= ruleVar ) )
                            {
                            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3435:6: ( (lv_var_3_0= ruleVar ) )
                            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3436:1: (lv_var_3_0= ruleVar )
                            {
                            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3436:1: (lv_var_3_0= ruleVar )
                            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3437:3: lv_var_3_0= ruleVar
                            {
                             
                            	        newCompositeNode(grammarAccess.getLiteralAccess().getVarVarParserRuleCall_1_0_1_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleVar_in_ruleLiteral7113);
                            lv_var_3_0=ruleVar();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"var",
                                    		lv_var_3_0, 
                                    		"Var");
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
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3454:7: otherlv_4= 'true'
                    {
                    otherlv_4=(Token)match(input,76,FOLLOW_76_in_ruleLiteral7133); 

                        	newLeafNode(otherlv_4, grammarAccess.getLiteralAccess().getTrueKeyword_1_1());
                        

                    }
                    break;
                case 3 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3459:7: otherlv_5= 'false'
                    {
                    otherlv_5=(Token)match(input,77,FOLLOW_77_in_ruleLiteral7151); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3471:1: entryRulePred returns [EObject current=null] : iv_rulePred= rulePred EOF ;
    public final EObject entryRulePred() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePred = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3472:2: (iv_rulePred= rulePred EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3473:2: iv_rulePred= rulePred EOF
            {
             newCompositeNode(grammarAccess.getPredRule()); 
            pushFollow(FOLLOW_rulePred_in_entryRulePred7188);
            iv_rulePred=rulePred();

            state._fsp--;

             current =iv_rulePred; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePred7198); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3480:1: rulePred returns [EObject current=null] : ( () ( ( (lv_atom_1_0= RULE_ATOM ) ) | otherlv_2= 'begin' | otherlv_3= 'end' ) (otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' )? ( (lv_list_7_0= ruleList ) )? ) ;
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
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3483:28: ( ( () ( ( (lv_atom_1_0= RULE_ATOM ) ) | otherlv_2= 'begin' | otherlv_3= 'end' ) (otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' )? ( (lv_list_7_0= ruleList ) )? ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3484:1: ( () ( ( (lv_atom_1_0= RULE_ATOM ) ) | otherlv_2= 'begin' | otherlv_3= 'end' ) (otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' )? ( (lv_list_7_0= ruleList ) )? )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3484:1: ( () ( ( (lv_atom_1_0= RULE_ATOM ) ) | otherlv_2= 'begin' | otherlv_3= 'end' ) (otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' )? ( (lv_list_7_0= ruleList ) )? )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3484:2: () ( ( (lv_atom_1_0= RULE_ATOM ) ) | otherlv_2= 'begin' | otherlv_3= 'end' ) (otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' )? ( (lv_list_7_0= ruleList ) )?
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3484:2: ()
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3485:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPredAccess().getPredAction_0(),
                        current);
                

            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3490:2: ( ( (lv_atom_1_0= RULE_ATOM ) ) | otherlv_2= 'begin' | otherlv_3= 'end' )
            int alt114=3;
            switch ( input.LA(1) ) {
            case RULE_ATOM:
                {
                alt114=1;
                }
                break;
            case 78:
                {
                alt114=2;
                }
                break;
            case 79:
                {
                alt114=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3490:3: ( (lv_atom_1_0= RULE_ATOM ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3490:3: ( (lv_atom_1_0= RULE_ATOM ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3491:1: (lv_atom_1_0= RULE_ATOM )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3491:1: (lv_atom_1_0= RULE_ATOM )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3492:3: lv_atom_1_0= RULE_ATOM
                    {
                    lv_atom_1_0=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_rulePred7250); 

                    			newLeafNode(lv_atom_1_0, grammarAccess.getPredAccess().getAtomATOMTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPredRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"atom",
                            		lv_atom_1_0, 
                            		"ATOM");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3509:7: otherlv_2= 'begin'
                    {
                    otherlv_2=(Token)match(input,78,FOLLOW_78_in_rulePred7273); 

                        	newLeafNode(otherlv_2, grammarAccess.getPredAccess().getBeginKeyword_1_1());
                        

                    }
                    break;
                case 3 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3514:7: otherlv_3= 'end'
                    {
                    otherlv_3=(Token)match(input,79,FOLLOW_79_in_rulePred7291); 

                        	newLeafNode(otherlv_3, grammarAccess.getPredAccess().getEndKeyword_1_2());
                        

                    }
                    break;

            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3518:2: (otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')' )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==71) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3518:4: otherlv_4= '(' ( (lv_terms_5_0= ruleTerms ) ) otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,71,FOLLOW_71_in_rulePred7305); 

                        	newLeafNode(otherlv_4, grammarAccess.getPredAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3522:1: ( (lv_terms_5_0= ruleTerms ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3523:1: (lv_terms_5_0= ruleTerms )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3523:1: (lv_terms_5_0= ruleTerms )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3524:3: lv_terms_5_0= ruleTerms
                    {
                     
                    	        newCompositeNode(grammarAccess.getPredAccess().getTermsTermsParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTerms_in_rulePred7326);
                    lv_terms_5_0=ruleTerms();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPredRule());
                    	        }
                           		set(
                           			current, 
                           			"terms",
                            		lv_terms_5_0, 
                            		"Terms");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,72,FOLLOW_72_in_rulePred7338); 

                        	newLeafNode(otherlv_6, grammarAccess.getPredAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3544:3: ( (lv_list_7_0= ruleList ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==73) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3545:1: (lv_list_7_0= ruleList )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3545:1: (lv_list_7_0= ruleList )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3546:3: lv_list_7_0= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getPredAccess().getListListParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleList_in_rulePred7361);
                    lv_list_7_0=ruleList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPredRule());
                    	        }
                           		set(
                           			current, 
                           			"list",
                            		lv_list_7_0, 
                            		"List");
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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3570:1: entryRuleTerms returns [EObject current=null] : iv_ruleTerms= ruleTerms EOF ;
    public final EObject entryRuleTerms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerms = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3571:2: (iv_ruleTerms= ruleTerms EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3572:2: iv_ruleTerms= ruleTerms EOF
            {
             newCompositeNode(grammarAccess.getTermsRule()); 
            pushFollow(FOLLOW_ruleTerms_in_entryRuleTerms7398);
            iv_ruleTerms=ruleTerms();

            state._fsp--;

             current =iv_ruleTerms; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerms7408); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3579:1: ruleTerms returns [EObject current=null] : ( ( (lv_term_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )* ) ;
    public final EObject ruleTerms() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_term_0_0 = null;

        EObject lv_term_2_0 = null;


         enterRule(); 
            
        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3582:28: ( ( ( (lv_term_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )* ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3583:1: ( ( (lv_term_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )* )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3583:1: ( ( (lv_term_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )* )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3583:2: ( (lv_term_0_0= ruleTerm ) ) (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )*
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3583:2: ( (lv_term_0_0= ruleTerm ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3584:1: (lv_term_0_0= ruleTerm )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3584:1: (lv_term_0_0= ruleTerm )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3585:3: lv_term_0_0= ruleTerm
            {
             
            	        newCompositeNode(grammarAccess.getTermsAccess().getTermTermParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTerm_in_ruleTerms7454);
            lv_term_0_0=ruleTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTermsRule());
            	        }
                   		add(
                   			current, 
                   			"term",
                    		lv_term_0_0, 
                    		"Term");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3601:2: (otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) ) )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==27) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3601:4: otherlv_1= ',' ( (lv_term_2_0= ruleTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleTerms7467); 

            	        	newLeafNode(otherlv_1, grammarAccess.getTermsAccess().getCommaKeyword_1_0());
            	        
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3605:1: ( (lv_term_2_0= ruleTerm ) )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3606:1: (lv_term_2_0= ruleTerm )
            	    {
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3606:1: (lv_term_2_0= ruleTerm )
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3607:3: lv_term_2_0= ruleTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTermsAccess().getTermTermParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTerm_in_ruleTerms7488);
            	    lv_term_2_0=ruleTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTermsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"term",
            	            		lv_term_2_0, 
            	            		"Term");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop117;
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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3631:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3632:2: (iv_ruleTerm= ruleTerm EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3633:2: iv_ruleTerm= ruleTerm EOF
            {
             newCompositeNode(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm7526);
            iv_ruleTerm=ruleTerm();

            state._fsp--;

             current =iv_ruleTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm7536); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3640:1: ruleTerm returns [EObject current=null] : ( ( (lv_list_0_0= ruleList ) ) | ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_val_3_0= RULE_INT_LITERAL ) ) | ( (lv_val_real_4_0= RULE_REAL_LITERAL ) ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Token lv_string_2_0=null;
        Token lv_val_3_0=null;
        Token lv_val_real_4_0=null;
        EObject lv_list_0_0 = null;

        EObject lv_literal_1_0 = null;


         enterRule(); 
            
        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3643:28: ( ( ( (lv_list_0_0= ruleList ) ) | ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_val_3_0= RULE_INT_LITERAL ) ) | ( (lv_val_real_4_0= RULE_REAL_LITERAL ) ) ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3644:1: ( ( (lv_list_0_0= ruleList ) ) | ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_val_3_0= RULE_INT_LITERAL ) ) | ( (lv_val_real_4_0= RULE_REAL_LITERAL ) ) )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3644:1: ( ( (lv_list_0_0= ruleList ) ) | ( (lv_literal_1_0= ruleLiteral ) ) | ( (lv_string_2_0= RULE_STRING ) ) | ( (lv_val_3_0= RULE_INT_LITERAL ) ) | ( (lv_val_real_4_0= RULE_REAL_LITERAL ) ) )
            int alt118=5;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt118=1;
                }
                break;
            case RULE_ATOM:
            case RULE_VART:
            case RULE_UNNAMEDVART:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
                {
                alt118=2;
                }
                break;
            case RULE_STRING:
                {
                alt118=3;
                }
                break;
            case RULE_INT_LITERAL:
                {
                alt118=4;
                }
                break;
            case RULE_REAL_LITERAL:
                {
                alt118=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3644:2: ( (lv_list_0_0= ruleList ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3644:2: ( (lv_list_0_0= ruleList ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3645:1: (lv_list_0_0= ruleList )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3645:1: (lv_list_0_0= ruleList )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3646:3: lv_list_0_0= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getListListParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleList_in_ruleTerm7582);
                    lv_list_0_0=ruleList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermRule());
                    	        }
                           		set(
                           			current, 
                           			"list",
                            		lv_list_0_0, 
                            		"List");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3663:6: ( (lv_literal_1_0= ruleLiteral ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3663:6: ( (lv_literal_1_0= ruleLiteral ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3664:1: (lv_literal_1_0= ruleLiteral )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3664:1: (lv_literal_1_0= ruleLiteral )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3665:3: lv_literal_1_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getTermAccess().getLiteralLiteralParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleTerm7609);
                    lv_literal_1_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTermRule());
                    	        }
                           		set(
                           			current, 
                           			"literal",
                            		lv_literal_1_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3682:6: ( (lv_string_2_0= RULE_STRING ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3682:6: ( (lv_string_2_0= RULE_STRING ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3683:1: (lv_string_2_0= RULE_STRING )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3683:1: (lv_string_2_0= RULE_STRING )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3684:3: lv_string_2_0= RULE_STRING
                    {
                    lv_string_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTerm7632); 

                    			newLeafNode(lv_string_2_0, grammarAccess.getTermAccess().getStringSTRINGTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"string",
                            		lv_string_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3701:6: ( (lv_val_3_0= RULE_INT_LITERAL ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3701:6: ( (lv_val_3_0= RULE_INT_LITERAL ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3702:1: (lv_val_3_0= RULE_INT_LITERAL )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3702:1: (lv_val_3_0= RULE_INT_LITERAL )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3703:3: lv_val_3_0= RULE_INT_LITERAL
                    {
                    lv_val_3_0=(Token)match(input,RULE_INT_LITERAL,FOLLOW_RULE_INT_LITERAL_in_ruleTerm7660); 

                    			newLeafNode(lv_val_3_0, grammarAccess.getTermAccess().getValINT_LITERALTerminalRuleCall_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_3_0, 
                            		"INT_LITERAL");
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3720:6: ( (lv_val_real_4_0= RULE_REAL_LITERAL ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3720:6: ( (lv_val_real_4_0= RULE_REAL_LITERAL ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3721:1: (lv_val_real_4_0= RULE_REAL_LITERAL )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3721:1: (lv_val_real_4_0= RULE_REAL_LITERAL )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3722:3: lv_val_real_4_0= RULE_REAL_LITERAL
                    {
                    lv_val_real_4_0=(Token)match(input,RULE_REAL_LITERAL,FOLLOW_RULE_REAL_LITERAL_in_ruleTerm7688); 

                    			newLeafNode(lv_val_real_4_0, grammarAccess.getTermAccess().getVal_realREAL_LITERALTerminalRuleCall_4_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTermRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"val_real",
                            		lv_val_real_4_0, 
                            		"REAL_LITERAL");
                    	    

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3746:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3747:2: (iv_ruleList= ruleList EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3748:2: iv_ruleList= ruleList EOF
            {
             newCompositeNode(grammarAccess.getListRule()); 
            pushFollow(FOLLOW_ruleList_in_entryRuleList7729);
            iv_ruleList=ruleList();

            state._fsp--;

             current =iv_ruleList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleList7739); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3755:1: ruleList returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )? otherlv_9= ']' ) ;
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
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3758:28: ( ( () otherlv_1= '[' ( ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )? otherlv_9= ']' ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3759:1: ( () otherlv_1= '[' ( ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )? otherlv_9= ']' )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3759:1: ( () otherlv_1= '[' ( ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )? otherlv_9= ']' )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3759:2: () otherlv_1= '[' ( ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )? otherlv_9= ']'
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3759:2: ()
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3760:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getListAccess().getListAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleList7785); 

                	newLeafNode(otherlv_1, grammarAccess.getListAccess().getLeftSquareBracketKeyword_1());
                
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3769:1: ( ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )? )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( ((LA122_0>=RULE_ATOM && LA122_0<=RULE_REAL_LITERAL)||(LA122_0>=RULE_VART && LA122_0<=RULE_UNNAMEDVART)||LA122_0==73||(LA122_0>=75 && LA122_0<=79)) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3769:2: ( (lv_term_2_0= ruleTerm ) ) (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )* (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )?
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3769:2: ( (lv_term_2_0= ruleTerm ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3770:1: (lv_term_2_0= ruleTerm )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3770:1: (lv_term_2_0= ruleTerm )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3771:3: lv_term_2_0= ruleTerm
                    {
                     
                    	        newCompositeNode(grammarAccess.getListAccess().getTermTermParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTerm_in_ruleList7807);
                    lv_term_2_0=ruleTerm();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListRule());
                    	        }
                           		add(
                           			current, 
                           			"term",
                            		lv_term_2_0, 
                            		"Term");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3787:2: (otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) ) )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==27) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3787:4: otherlv_3= ',' ( (lv_term_4_0= ruleTerm ) )
                    	    {
                    	    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleList7820); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getListAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3791:1: ( (lv_term_4_0= ruleTerm ) )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3792:1: (lv_term_4_0= ruleTerm )
                    	    {
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3792:1: (lv_term_4_0= ruleTerm )
                    	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3793:3: lv_term_4_0= ruleTerm
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getListAccess().getTermTermParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTerm_in_ruleList7841);
                    	    lv_term_4_0=ruleTerm();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getListRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"term",
                    	            		lv_term_4_0, 
                    	            		"Term");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop119;
                        }
                    } while (true);

                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3809:4: (otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) ) )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==80) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3809:6: otherlv_5= '|' ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) )
                            {
                            otherlv_5=(Token)match(input,80,FOLLOW_80_in_ruleList7856); 

                                	newLeafNode(otherlv_5, grammarAccess.getListAccess().getVerticalLineKeyword_2_2_0());
                                
                            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3813:1: ( ( (lv_var_6_0= RULE_VART ) ) | ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) ) | ( (lv_list_8_0= ruleList ) ) )
                            int alt120=3;
                            switch ( input.LA(1) ) {
                            case RULE_VART:
                                {
                                alt120=1;
                                }
                                break;
                            case RULE_UNNAMEDVART:
                                {
                                alt120=2;
                                }
                                break;
                            case 73:
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
                                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3813:2: ( (lv_var_6_0= RULE_VART ) )
                                    {
                                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3813:2: ( (lv_var_6_0= RULE_VART ) )
                                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3814:1: (lv_var_6_0= RULE_VART )
                                    {
                                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3814:1: (lv_var_6_0= RULE_VART )
                                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3815:3: lv_var_6_0= RULE_VART
                                    {
                                    lv_var_6_0=(Token)match(input,RULE_VART,FOLLOW_RULE_VART_in_ruleList7874); 

                                    			newLeafNode(lv_var_6_0, grammarAccess.getListAccess().getVarVARTTerminalRuleCall_2_2_1_0_0()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getListRule());
                                    	        }
                                           		setWithLastConsumed(
                                           			current, 
                                           			"var",
                                            		lv_var_6_0, 
                                            		"VART");
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3832:6: ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) )
                                    {
                                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3832:6: ( (lv_unnamedvar_7_0= RULE_UNNAMEDVART ) )
                                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3833:1: (lv_unnamedvar_7_0= RULE_UNNAMEDVART )
                                    {
                                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3833:1: (lv_unnamedvar_7_0= RULE_UNNAMEDVART )
                                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3834:3: lv_unnamedvar_7_0= RULE_UNNAMEDVART
                                    {
                                    lv_unnamedvar_7_0=(Token)match(input,RULE_UNNAMEDVART,FOLLOW_RULE_UNNAMEDVART_in_ruleList7902); 

                                    			newLeafNode(lv_unnamedvar_7_0, grammarAccess.getListAccess().getUnnamedvarUNNAMEDVARTTerminalRuleCall_2_2_1_1_0()); 
                                    		

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getListRule());
                                    	        }
                                           		setWithLastConsumed(
                                           			current, 
                                           			"unnamedvar",
                                            		lv_unnamedvar_7_0, 
                                            		"UNNAMEDVART");
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 3 :
                                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3851:6: ( (lv_list_8_0= ruleList ) )
                                    {
                                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3851:6: ( (lv_list_8_0= ruleList ) )
                                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3852:1: (lv_list_8_0= ruleList )
                                    {
                                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3852:1: (lv_list_8_0= ruleList )
                                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3853:3: lv_list_8_0= ruleList
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getListAccess().getListListParserRuleCall_2_2_1_2_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleList_in_ruleList7934);
                                    lv_list_8_0=ruleList();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getListRule());
                                    	        }
                                           		set(
                                           			current, 
                                           			"list",
                                            		lv_list_8_0, 
                                            		"List");
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

            otherlv_9=(Token)match(input,74,FOLLOW_74_in_ruleList7951); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3881:1: entryRuleVar returns [EObject current=null] : iv_ruleVar= ruleVar EOF ;
    public final EObject entryRuleVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVar = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3882:2: (iv_ruleVar= ruleVar EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3883:2: iv_ruleVar= ruleVar EOF
            {
             newCompositeNode(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar7987);
            iv_ruleVar=ruleVar();

            state._fsp--;

             current =iv_ruleVar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar7997); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3890:1: ruleVar returns [EObject current=null] : ( ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) ) ( (lv_list_2_0= ruleList ) )? ) ;
    public final EObject ruleVar() throws RecognitionException {
        EObject current = null;

        Token lv_var_0_0=null;
        Token lv_unnamedvar_1_0=null;
        EObject lv_list_2_0 = null;


         enterRule(); 
            
        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3893:28: ( ( ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) ) ( (lv_list_2_0= ruleList ) )? ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3894:1: ( ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) ) ( (lv_list_2_0= ruleList ) )? )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3894:1: ( ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) ) ( (lv_list_2_0= ruleList ) )? )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3894:2: ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) ) ( (lv_list_2_0= ruleList ) )?
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3894:2: ( ( (lv_var_0_0= RULE_VART ) ) | ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) ) )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==RULE_VART) ) {
                alt123=1;
            }
            else if ( (LA123_0==RULE_UNNAMEDVART) ) {
                alt123=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3894:3: ( (lv_var_0_0= RULE_VART ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3894:3: ( (lv_var_0_0= RULE_VART ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3895:1: (lv_var_0_0= RULE_VART )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3895:1: (lv_var_0_0= RULE_VART )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3896:3: lv_var_0_0= RULE_VART
                    {
                    lv_var_0_0=(Token)match(input,RULE_VART,FOLLOW_RULE_VART_in_ruleVar8040); 

                    			newLeafNode(lv_var_0_0, grammarAccess.getVarAccess().getVarVARTTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVarRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"var",
                            		lv_var_0_0, 
                            		"VART");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3913:6: ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3913:6: ( (lv_unnamedvar_1_0= RULE_UNNAMEDVART ) )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3914:1: (lv_unnamedvar_1_0= RULE_UNNAMEDVART )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3914:1: (lv_unnamedvar_1_0= RULE_UNNAMEDVART )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3915:3: lv_unnamedvar_1_0= RULE_UNNAMEDVART
                    {
                    lv_unnamedvar_1_0=(Token)match(input,RULE_UNNAMEDVART,FOLLOW_RULE_UNNAMEDVART_in_ruleVar8068); 

                    			newLeafNode(lv_unnamedvar_1_0, grammarAccess.getVarAccess().getUnnamedvarUNNAMEDVARTTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getVarRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"unnamedvar",
                            		lv_unnamedvar_1_0, 
                            		"UNNAMEDVART");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3931:3: ( (lv_list_2_0= ruleList ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( (LA124_0==73) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3932:1: (lv_list_2_0= ruleList )
                    {
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3932:1: (lv_list_2_0= ruleList )
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3933:3: lv_list_2_0= ruleList
                    {
                     
                    	        newCompositeNode(grammarAccess.getVarAccess().getListListParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleList_in_ruleVar8095);
                    lv_list_2_0=ruleList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVarRule());
                    	        }
                           		set(
                           			current, 
                           			"list",
                            		lv_list_2_0, 
                            		"List");
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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3957:1: entryRuleEOL returns [String current=null] : iv_ruleEOL= ruleEOL EOF ;
    public final String entryRuleEOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEOL = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3958:2: (iv_ruleEOL= ruleEOL EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3959:2: iv_ruleEOL= ruleEOL EOF
            {
             newCompositeNode(grammarAccess.getEOLRule()); 
            pushFollow(FOLLOW_ruleEOL_in_entryRuleEOL8133);
            iv_ruleEOL=ruleEOL();

            state._fsp--;

             current =iv_ruleEOL.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEOL8144); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3966:1: ruleEOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NEWLINE_0= RULE_NEWLINE | this_SL_COMMENT_1= RULE_SL_COMMENT ) ;
    public final AntlrDatatypeRuleToken ruleEOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NEWLINE_0=null;
        Token this_SL_COMMENT_1=null;

         enterRule(); 
            
        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3969:28: ( (this_NEWLINE_0= RULE_NEWLINE | this_SL_COMMENT_1= RULE_SL_COMMENT ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3970:1: (this_NEWLINE_0= RULE_NEWLINE | this_SL_COMMENT_1= RULE_SL_COMMENT )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3970:1: (this_NEWLINE_0= RULE_NEWLINE | this_SL_COMMENT_1= RULE_SL_COMMENT )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==RULE_NEWLINE) ) {
                alt125=1;
            }
            else if ( (LA125_0==RULE_SL_COMMENT) ) {
                alt125=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3970:6: this_NEWLINE_0= RULE_NEWLINE
                    {
                    this_NEWLINE_0=(Token)match(input,RULE_NEWLINE,FOLLOW_RULE_NEWLINE_in_ruleEOL8184); 

                    		current.merge(this_NEWLINE_0);
                        
                     
                        newLeafNode(this_NEWLINE_0, grammarAccess.getEOLAccess().getNEWLINETerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3978:10: this_SL_COMMENT_1= RULE_SL_COMMENT
                    {
                    this_SL_COMMENT_1=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleEOL8210); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3993:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3994:2: (iv_ruleFQN= ruleFQN EOF )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:3995:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_ruleFQN_in_entryRuleFQN8256);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFQN8267); 

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
    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:4002:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_VART_0= RULE_VART | this_ATOM_1= RULE_ATOM ) (kw= '.' (this_VART_3= RULE_VART | this_ATOM_4= RULE_ATOM ) )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VART_0=null;
        Token this_ATOM_1=null;
        Token kw=null;
        Token this_VART_3=null;
        Token this_ATOM_4=null;

         enterRule(); 
            
        try {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:4005:28: ( ( (this_VART_0= RULE_VART | this_ATOM_1= RULE_ATOM ) (kw= '.' (this_VART_3= RULE_VART | this_ATOM_4= RULE_ATOM ) )* ) )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:4006:1: ( (this_VART_0= RULE_VART | this_ATOM_1= RULE_ATOM ) (kw= '.' (this_VART_3= RULE_VART | this_ATOM_4= RULE_ATOM ) )* )
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:4006:1: ( (this_VART_0= RULE_VART | this_ATOM_1= RULE_ATOM ) (kw= '.' (this_VART_3= RULE_VART | this_ATOM_4= RULE_ATOM ) )* )
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:4006:2: (this_VART_0= RULE_VART | this_ATOM_1= RULE_ATOM ) (kw= '.' (this_VART_3= RULE_VART | this_ATOM_4= RULE_ATOM ) )*
            {
            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:4006:2: (this_VART_0= RULE_VART | this_ATOM_1= RULE_ATOM )
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==RULE_VART) ) {
                alt126=1;
            }
            else if ( (LA126_0==RULE_ATOM) ) {
                alt126=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }
            switch (alt126) {
                case 1 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:4006:7: this_VART_0= RULE_VART
                    {
                    this_VART_0=(Token)match(input,RULE_VART,FOLLOW_RULE_VART_in_ruleFQN8308); 

                    		current.merge(this_VART_0);
                        
                     
                        newLeafNode(this_VART_0, grammarAccess.getFQNAccess().getVARTTerminalRuleCall_0_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:4014:10: this_ATOM_1= RULE_ATOM
                    {
                    this_ATOM_1=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleFQN8334); 

                    		current.merge(this_ATOM_1);
                        
                     
                        newLeafNode(this_ATOM_1, grammarAccess.getFQNAccess().getATOMTerminalRuleCall_0_1()); 
                        

                    }
                    break;

            }

            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:4021:2: (kw= '.' (this_VART_3= RULE_VART | this_ATOM_4= RULE_ATOM ) )*
            loop128:
            do {
                int alt128=2;
                int LA128_0 = input.LA(1);

                if ( (LA128_0==69) ) {
                    alt128=1;
                }


                switch (alt128) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:4022:2: kw= '.' (this_VART_3= RULE_VART | this_ATOM_4= RULE_ATOM )
            	    {
            	    kw=(Token)match(input,69,FOLLOW_69_in_ruleFQN8354); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            	        
            	    // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:4027:1: (this_VART_3= RULE_VART | this_ATOM_4= RULE_ATOM )
            	    int alt127=2;
            	    int LA127_0 = input.LA(1);

            	    if ( (LA127_0==RULE_VART) ) {
            	        alt127=1;
            	    }
            	    else if ( (LA127_0==RULE_ATOM) ) {
            	        alt127=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 127, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt127) {
            	        case 1 :
            	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:4027:6: this_VART_3= RULE_VART
            	            {
            	            this_VART_3=(Token)match(input,RULE_VART,FOLLOW_RULE_VART_in_ruleFQN8370); 

            	            		current.merge(this_VART_3);
            	                
            	             
            	                newLeafNode(this_VART_3, grammarAccess.getFQNAccess().getVARTTerminalRuleCall_1_1_0()); 
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../jacamoide.xtext.jcm/src-gen/jacamoide/xtext/jcm/parser/antlr/internal/InternalJcm.g:4035:10: this_ATOM_4= RULE_ATOM
            	            {
            	            this_ATOM_4=(Token)match(input,RULE_ATOM,FOLLOW_RULE_ATOM_in_ruleFQN8396); 

            	            		current.merge(this_ATOM_4);
            	                
            	             
            	                newLeafNode(this_ATOM_4, grammarAccess.getFQNAccess().getATOMTerminalRuleCall_1_1_1()); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop128;
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


 

    public static final BitSet FOLLOW_ruleJcmModel_in_entryRuleJcmModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJcmModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleJcmModel127 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_23_in_ruleJcmModel140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleJcmModel157 = new BitSet(new long[]{0x0000000005801800L});
    public static final BitSet FOLLOW_ruleDUses_in_ruleJcmModel183 = new BitSet(new long[]{0x0000000001801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleJcmModel201 = new BitSet(new long[]{0x0000000001801800L});
    public static final BitSet FOLLOW_24_in_ruleJcmModel214 = new BitSet(new long[]{0x21000009D2801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleJcmModel231 = new BitSet(new long[]{0x21000009D2801800L});
    public static final BitSet FOLLOW_ruleAgent_in_ruleJcmModel253 = new BitSet(new long[]{0x21000009D2000000L});
    public static final BitSet FOLLOW_ruleWorkspace_in_ruleJcmModel275 = new BitSet(new long[]{0x21000001D2000000L});
    public static final BitSet FOLLOW_ruleOrganisation_in_ruleJcmModel297 = new BitSet(new long[]{0x20000001D2000000L});
    public static final BitSet FOLLOW_ruleDClassPath_in_ruleJcmModel320 = new BitSet(new long[]{0x00000001D2000000L});
    public static final BitSet FOLLOW_ruleDAslPath_in_ruleJcmModel347 = new BitSet(new long[]{0x00000001D2000000L});
    public static final BitSet FOLLOW_ruleDPlatform_in_ruleJcmModel374 = new BitSet(new long[]{0x00000001D2000000L});
    public static final BitSet FOLLOW_ruleDNode_in_ruleJcmModel401 = new BitSet(new long[]{0x00000001D2000000L});
    public static final BitSet FOLLOW_25_in_ruleJcmModel415 = new BitSet(new long[]{0x0000000000801802L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleJcmModel432 = new BitSet(new long[]{0x0000000000801802L});
    public static final BitSet FOLLOW_ruleDUses_in_entryRuleDUses469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDUses479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleDUses516 = new BitSet(new long[]{0x0000000000000050L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleFileName_in_ruleDUses537 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleDUses550 = new BitSet(new long[]{0x0000000000000050L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleFileName_in_ruleDUses571 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleDClassPath_in_entryRuleDClassPath609 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDClassPath619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleDClassPath665 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleDClassPath677 = new BitSet(new long[]{0x0000000000000052L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleFileName_in_ruleDClassPath699 = new BitSet(new long[]{0x0000000008801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleDClassPath716 = new BitSet(new long[]{0x0000000008801852L,0x0000000000000078L});
    public static final BitSet FOLLOW_27_in_ruleDClassPath733 = new BitSet(new long[]{0x0000000008801852L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleDAslPath_in_entryRuleDAslPath773 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDAslPath783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleDAslPath829 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleDAslPath841 = new BitSet(new long[]{0x0000000000000052L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleFileName_in_ruleDAslPath863 = new BitSet(new long[]{0x0000000008801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleDAslPath880 = new BitSet(new long[]{0x0000000008801852L,0x0000000000000078L});
    public static final BitSet FOLLOW_27_in_ruleDAslPath897 = new BitSet(new long[]{0x0000000008801852L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleDPlatform_in_entryRuleDPlatform937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDPlatform947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDPlatform993 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleDPlatform1005 = new BitSet(new long[]{0x0000000000000212L});
    public static final BitSet FOLLOW_ruleClassDef_in_ruleDPlatform1027 = new BitSet(new long[]{0x0000000008801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleDPlatform1044 = new BitSet(new long[]{0x0000000008801A12L});
    public static final BitSet FOLLOW_27_in_ruleDPlatform1061 = new BitSet(new long[]{0x0000000008801A12L});
    public static final BitSet FOLLOW_ruleDNode_in_entryRuleDNode1101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDNode1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDNode1148 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleDNode1165 = new BitSet(new long[]{0x0000000608801800L});
    public static final BitSet FOLLOW_33_in_ruleDNode1183 = new BitSet(new long[]{0x0000000408801800L});
    public static final BitSet FOLLOW_34_in_ruleDNode1198 = new BitSet(new long[]{0x0000000000000150L});
    public static final BitSet FOLLOW_ruleHost_in_ruleDNode1219 = new BitSet(new long[]{0x0000000008801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleDNode1238 = new BitSet(new long[]{0x0000000008801802L});
    public static final BitSet FOLLOW_27_in_ruleDNode1255 = new BitSet(new long[]{0x0000000008801802L});
    public static final BitSet FOLLOW_ruleAgent_in_entryRuleAgent1293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAgent1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleAgent1340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleAgent1357 = new BitSet(new long[]{0x0000000021801802L});
    public static final BitSet FOLLOW_29_in_ruleAgent1375 = new BitSet(new long[]{0x0000000000000050L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleFileName_in_ruleAgent1396 = new BitSet(new long[]{0x0000000001801802L});
    public static final BitSet FOLLOW_24_in_ruleAgent1411 = new BitSet(new long[]{0x0023DFF102801810L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleAgent1428 = new BitSet(new long[]{0x0023DFF102801810L});
    public static final BitSet FOLLOW_36_in_ruleAgent1443 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAgent1455 = new BitSet(new long[]{0x0023DFF102000030L});
    public static final BitSet FOLLOW_RULE_INT_LITERAL_in_ruleAgent1474 = new BitSet(new long[]{0x0000000008801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleAgent1496 = new BitSet(new long[]{0x0023DFF10A801810L});
    public static final BitSet FOLLOW_27_in_ruleAgent1513 = new BitSet(new long[]{0x0023DFF10A801810L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleAgent1540 = new BitSet(new long[]{0x0000000008801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleAgent1562 = new BitSet(new long[]{0x0023DFF10A801810L});
    public static final BitSet FOLLOW_27_in_ruleAgent1579 = new BitSet(new long[]{0x0023DFF10A801810L});
    public static final BitSet FOLLOW_32_in_ruleAgent1604 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAgent1616 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleAgent1633 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleAgent1655 = new BitSet(new long[]{0x0023DFF102801810L});
    public static final BitSet FOLLOW_37_in_ruleAgent1676 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAgent1688 = new BitSet(new long[]{0x0023DFF102000210L});
    public static final BitSet FOLLOW_ruleClassDef_in_ruleAgent1710 = new BitSet(new long[]{0x0000000008801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleAgent1727 = new BitSet(new long[]{0x0023DFF10A801A10L});
    public static final BitSet FOLLOW_27_in_ruleAgent1744 = new BitSet(new long[]{0x0023DFF10A801A10L});
    public static final BitSet FOLLOW_38_in_ruleAgent1768 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAgent1780 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ruleClassDef_in_ruleAgent1801 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleAgent1818 = new BitSet(new long[]{0x0023DFF102801810L});
    public static final BitSet FOLLOW_39_in_ruleAgent1839 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAgent1851 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ruleClassDef_in_ruleAgent1872 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleAgent1889 = new BitSet(new long[]{0x0023DFF102801810L});
    public static final BitSet FOLLOW_40_in_ruleAgent1910 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAgent1922 = new BitSet(new long[]{0x0023DFF102000610L,0x000000000000F800L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAgent1944 = new BitSet(new long[]{0x0000000008801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleAgent1961 = new BitSet(new long[]{0x0023DFF10A801E10L,0x000000000000F800L});
    public static final BitSet FOLLOW_27_in_ruleAgent1978 = new BitSet(new long[]{0x0023DFF10A801E10L,0x000000000000F800L});
    public static final BitSet FOLLOW_41_in_ruleAgent2002 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAgent2014 = new BitSet(new long[]{0x0023DFF102000610L,0x000000000000F800L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAgent2036 = new BitSet(new long[]{0x0000000008801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleAgent2053 = new BitSet(new long[]{0x0023DFF10A801E10L,0x000000000000F800L});
    public static final BitSet FOLLOW_27_in_ruleAgent2070 = new BitSet(new long[]{0x0023DFF10A801E10L,0x000000000000F800L});
    public static final BitSet FOLLOW_42_in_ruleAgent2094 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAgent2106 = new BitSet(new long[]{0x0023DFF102000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleAgent2124 = new BitSet(new long[]{0x0000000408801800L});
    public static final BitSet FOLLOW_34_in_ruleAgent2142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleAgent2159 = new BitSet(new long[]{0x0000000008801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleAgent2183 = new BitSet(new long[]{0x0023DFF10A801810L});
    public static final BitSet FOLLOW_27_in_ruleAgent2200 = new BitSet(new long[]{0x0023DFF10A801810L});
    public static final BitSet FOLLOW_43_in_ruleAgent2224 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAgent2236 = new BitSet(new long[]{0x0023DFF102000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleAgent2254 = new BitSet(new long[]{0x0000000408801800L});
    public static final BitSet FOLLOW_34_in_ruleAgent2272 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleAgent2289 = new BitSet(new long[]{0x0000000008801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleAgent2313 = new BitSet(new long[]{0x0023DFF10A801810L});
    public static final BitSet FOLLOW_27_in_ruleAgent2330 = new BitSet(new long[]{0x0023DFF10A801810L});
    public static final BitSet FOLLOW_44_in_ruleAgent2354 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAgent2366 = new BitSet(new long[]{0x0023DFF102000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleAgent2384 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleAgent2401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleAgent2418 = new BitSet(new long[]{0x0000000408801800L});
    public static final BitSet FOLLOW_34_in_ruleAgent2436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleAgent2453 = new BitSet(new long[]{0x0000000008801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleAgent2477 = new BitSet(new long[]{0x0023DFF10A801810L});
    public static final BitSet FOLLOW_27_in_ruleAgent2494 = new BitSet(new long[]{0x0023DFF10A801810L});
    public static final BitSet FOLLOW_46_in_ruleAgent2518 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAgent2530 = new BitSet(new long[]{0x0000000000000610L,0x000000000000F800L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAgent2551 = new BitSet(new long[]{0x0000000008801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleAgent2568 = new BitSet(new long[]{0x0023DFF10A801810L});
    public static final BitSet FOLLOW_27_in_ruleAgent2585 = new BitSet(new long[]{0x0023DFF10A801810L});
    public static final BitSet FOLLOW_47_in_ruleAgent2607 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAgent2619 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_LITERAL_in_ruleAgent2636 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleAgent2658 = new BitSet(new long[]{0x0023DFF102801810L});
    public static final BitSet FOLLOW_48_in_ruleAgent2679 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAgent2691 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_LITERAL_in_ruleAgent2708 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleAgent2730 = new BitSet(new long[]{0x0023DFF102801810L});
    public static final BitSet FOLLOW_49_in_ruleAgent2751 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAgent2763 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_50_in_ruleAgent2776 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_51_in_ruleAgent2794 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_52_in_ruleAgent2812 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleAgent2830 = new BitSet(new long[]{0x0023DFF102801810L});
    public static final BitSet FOLLOW_53_in_ruleAgent2851 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAgent2863 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_54_in_ruleAgent2876 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_55_in_ruleAgent2894 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleAgent2912 = new BitSet(new long[]{0x0023DFF102801810L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleAgent2938 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAgent2955 = new BitSet(new long[]{0x00000000000006F0L,0x000000000000F800L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAgent2973 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_RULE_INT_LITERAL_in_ruleAgent3001 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAgent3033 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_RULE_REAL_LITERAL_in_ruleAgent3056 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleAgent3079 = new BitSet(new long[]{0x0023DFF102801810L});
    public static final BitSet FOLLOW_25_in_ruleAgent3095 = new BitSet(new long[]{0x0000000000801802L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleAgent3114 = new BitSet(new long[]{0x0000000000801802L});
    public static final BitSet FOLLOW_ruleWorkspace_in_entryRuleWorkspace3151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkspace3161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleWorkspace3198 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleWorkspace3215 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleWorkspace3232 = new BitSet(new long[]{0x0A00400102801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleWorkspace3249 = new BitSet(new long[]{0x0A00400102801800L});
    public static final BitSet FOLLOW_ruleArtifact_in_ruleWorkspace3272 = new BitSet(new long[]{0x0A00400102000000L});
    public static final BitSet FOLLOW_57_in_ruleWorkspace3291 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleWorkspace3303 = new BitSet(new long[]{0x0E00400102000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleWorkspace3322 = new BitSet(new long[]{0x0000000008801800L});
    public static final BitSet FOLLOW_58_in_ruleWorkspace3345 = new BitSet(new long[]{0x0000000008801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleWorkspace3363 = new BitSet(new long[]{0x0E0040010A801810L});
    public static final BitSet FOLLOW_27_in_ruleWorkspace3380 = new BitSet(new long[]{0x0E0040010A801810L});
    public static final BitSet FOLLOW_46_in_ruleWorkspace3404 = new BitSet(new long[]{0x0000000020801800L});
    public static final BitSet FOLLOW_29_in_ruleWorkspace3417 = new BitSet(new long[]{0x0000000000000610L,0x000000000000F800L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleWorkspace3438 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleWorkspace3457 = new BitSet(new long[]{0x0A00400102801800L});
    public static final BitSet FOLLOW_ruleONode_in_ruleWorkspace3486 = new BitSet(new long[]{0x0A00400102000000L});
    public static final BitSet FOLLOW_25_in_ruleWorkspace3500 = new BitSet(new long[]{0x0000000000801802L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleWorkspace3517 = new BitSet(new long[]{0x0000000000801802L});
    public static final BitSet FOLLOW_ruleArtifact_in_entryRuleArtifact3554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArtifact3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleArtifact3601 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleArtifact3618 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleArtifact3635 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_ruleClassDef_in_ruleArtifact3656 = new BitSet(new long[]{0x0000000001801802L});
    public static final BitSet FOLLOW_24_in_ruleArtifact3669 = new BitSet(new long[]{0x1000000002801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleArtifact3686 = new BitSet(new long[]{0x1000000002801800L});
    public static final BitSet FOLLOW_60_in_ruleArtifact3700 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleArtifact3712 = new BitSet(new long[]{0x0400000002000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleArtifact3731 = new BitSet(new long[]{0x0000000008801800L});
    public static final BitSet FOLLOW_58_in_ruleArtifact3754 = new BitSet(new long[]{0x0000000008801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleArtifact3772 = new BitSet(new long[]{0x040000000A801810L});
    public static final BitSet FOLLOW_27_in_ruleArtifact3789 = new BitSet(new long[]{0x040000000A801810L});
    public static final BitSet FOLLOW_25_in_ruleArtifact3807 = new BitSet(new long[]{0x0000000000801802L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleArtifact3826 = new BitSet(new long[]{0x0000000000801802L});
    public static final BitSet FOLLOW_ruleOrganisation_in_entryRuleOrganisation3863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrganisation3873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleOrganisation3910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleOrganisation3927 = new BitSet(new long[]{0x0000000021000000L});
    public static final BitSet FOLLOW_ruleOFileName_in_ruleOrganisation3953 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleOrganisation3966 = new BitSet(new long[]{0x4A00400102801810L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleOrganisation3983 = new BitSet(new long[]{0x4A00400102801810L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleOrganisation4006 = new BitSet(new long[]{0x4A00400102000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleScheme_in_ruleOrganisation4033 = new BitSet(new long[]{0x4A00400102000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleOAgents_in_ruleOrganisation4060 = new BitSet(new long[]{0x4A00400102000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleONode_in_ruleOrganisation4087 = new BitSet(new long[]{0x4A00400102000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleOOthers_in_ruleOrganisation4114 = new BitSet(new long[]{0x4A00400102000010L,0x0000000000000004L});
    public static final BitSet FOLLOW_25_in_ruleOrganisation4128 = new BitSet(new long[]{0x0000000000801802L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleOrganisation4145 = new BitSet(new long[]{0x0000000000801802L});
    public static final BitSet FOLLOW_ruleOFileName_in_entryRuleOFileName4182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOFileName4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleOFileName4229 = new BitSet(new long[]{0x0000000000000050L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleFileName_in_ruleOFileName4250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleONode_in_entryRuleONode4286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleONode4296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleONode4333 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleONode4345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleONode4362 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleONode4384 = new BitSet(new long[]{0x0000000000801802L});
    public static final BitSet FOLLOW_ruleOAgents_in_entryRuleOAgents4421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOAgents4431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleOAgents4477 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleOAgents4489 = new BitSet(new long[]{0x0400000000000012L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleOAgents4508 = new BitSet(new long[]{0x0000000008801800L});
    public static final BitSet FOLLOW_58_in_ruleOAgents4531 = new BitSet(new long[]{0x0000000008801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleOAgents4549 = new BitSet(new long[]{0x0400000008801812L});
    public static final BitSet FOLLOW_27_in_ruleOAgents4566 = new BitSet(new long[]{0x0400000008801812L});
    public static final BitSet FOLLOW_ruleOOthers_in_entryRuleOOthers4606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOOthers4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleOOthers4658 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleOOthers4675 = new BitSet(new long[]{0x00000000000006F0L,0x000000000000F800L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOOthers4693 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_RULE_INT_LITERAL_in_ruleOOthers4721 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleOOthers4753 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_RULE_REAL_LITERAL_in_ruleOOthers4776 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleOOthers4799 = new BitSet(new long[]{0x0000000000801802L});
    public static final BitSet FOLLOW_ruleGroup_in_entryRuleGroup4836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGroup4846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleGroup4883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleGroup4900 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleGroup4917 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleGroup4934 = new BitSet(new long[]{0x0000000001801802L});
    public static final BitSet FOLLOW_24_in_ruleGroup4952 = new BitSet(new long[]{0xC000400002801810L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleGroup4969 = new BitSet(new long[]{0xC000400002801810L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleGroup_in_ruleGroup4992 = new BitSet(new long[]{0xC000400002000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_63_in_ruleGroup5011 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleGroup5023 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleGroup5040 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleGroup5062 = new BitSet(new long[]{0xC000400002801810L,0x0000000000000003L});
    public static final BitSet FOLLOW_64_in_ruleGroup5083 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleGroup5095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleGroup5112 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleGroup5134 = new BitSet(new long[]{0xC000400002801810L,0x0000000000000003L});
    public static final BitSet FOLLOW_46_in_ruleGroup5155 = new BitSet(new long[]{0x0000000020801800L});
    public static final BitSet FOLLOW_29_in_ruleGroup5168 = new BitSet(new long[]{0x0000000000000610L,0x000000000000F800L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleGroup5189 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleGroup5208 = new BitSet(new long[]{0xC000400002801810L,0x0000000000000003L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleGroup5234 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleGroup5251 = new BitSet(new long[]{0x00000000000006F0L,0x000000000000F800L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGroup5269 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_RULE_INT_LITERAL_in_ruleGroup5297 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleGroup5329 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_RULE_REAL_LITERAL_in_ruleGroup5352 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleGroup5375 = new BitSet(new long[]{0xC000400002801810L,0x0000000000000003L});
    public static final BitSet FOLLOW_65_in_ruleGroup5396 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleGroup5408 = new BitSet(new long[]{0xC000400002000010L,0x0000000000000003L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleGroup5426 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleGroup5448 = new BitSet(new long[]{0x0000000008801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleGroup5470 = new BitSet(new long[]{0xC00040000A801810L,0x0000000000000003L});
    public static final BitSet FOLLOW_27_in_ruleGroup5487 = new BitSet(new long[]{0xC00040000A801810L,0x0000000000000003L});
    public static final BitSet FOLLOW_25_in_ruleGroup5506 = new BitSet(new long[]{0x0000000000801802L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleGroup5525 = new BitSet(new long[]{0x0000000000801802L});
    public static final BitSet FOLLOW_ruleScheme_in_entryRuleScheme5562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScheme5572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleScheme5609 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleScheme5626 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleScheme5643 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleScheme5660 = new BitSet(new long[]{0x0000000001801802L});
    public static final BitSet FOLLOW_24_in_ruleScheme5678 = new BitSet(new long[]{0x0000400002801810L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleScheme5695 = new BitSet(new long[]{0x0000400002801810L,0x0000000000000001L});
    public static final BitSet FOLLOW_46_in_ruleScheme5710 = new BitSet(new long[]{0x0000000020801800L});
    public static final BitSet FOLLOW_29_in_ruleScheme5723 = new BitSet(new long[]{0x0000000000000610L,0x000000000000F800L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleScheme5744 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleScheme5763 = new BitSet(new long[]{0x0000400002801810L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleScheme5784 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleScheme5796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleScheme5813 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleScheme5835 = new BitSet(new long[]{0x0000400002801810L,0x0000000000000001L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleScheme5861 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleScheme5878 = new BitSet(new long[]{0x00000000000006F0L,0x000000000000F800L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleScheme5896 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_RULE_INT_LITERAL_in_ruleScheme5924 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleScheme5956 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_RULE_REAL_LITERAL_in_ruleScheme5979 = new BitSet(new long[]{0x0000000000801800L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleScheme6002 = new BitSet(new long[]{0x0000400002801810L,0x0000000000000001L});
    public static final BitSet FOLLOW_25_in_ruleScheme6018 = new BitSet(new long[]{0x0000000000801802L});
    public static final BitSet FOLLOW_ruleEOL_in_ruleScheme6037 = new BitSet(new long[]{0x0000000000801802L});
    public static final BitSet FOLLOW_ruleHost_in_entryRuleHost6074 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHost6084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleHost6127 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHost6155 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_RULE_IP_in_ruleHost6183 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29_in_ruleHost6202 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_LITERAL_in_ruleHost6219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileName_in_entryRuleFileName6262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFileName6272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleFileName6320 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000078L});
    public static final BitSet FOLLOW_68_in_ruleFileName6338 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000078L});
    public static final BitSet FOLLOW_69_in_ruleFileName6356 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000078L});
    public static final BitSet FOLLOW_70_in_ruleFileName6374 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000078L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleFileName6397 = new BitSet(new long[]{0x0000000000000012L,0x0000000000000078L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFileName6427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDef_in_entryRuleClassDef6469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClassDef6479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_ruleClassDef6525 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_ruleClassDef6538 = new BitSet(new long[]{0x00000000000002F0L,0x0000000000000300L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleClassDef6560 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_27_in_ruleClassDef6573 = new BitSet(new long[]{0x00000000000002F0L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleClassDef6594 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleClassDef6610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter6648 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter6658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleClassDef_in_ruleParameter6704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_LITERAL_in_ruleParameter6727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_LITERAL_in_ruleParameter6755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleParameter6783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListParameters_in_ruleParameter6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListParameters_in_entryRuleListParameters6851 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListParameters6861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleListParameters6898 = new BitSet(new long[]{0x00000000000002F0L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleListParameters6919 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_27_in_ruleListParameters6932 = new BitSet(new long[]{0x00000000000002F0L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleListParameters6953 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleListParameters6967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral7003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral7013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleLiteral7062 = new BitSet(new long[]{0x0000000000000610L,0x000000000000C800L});
    public static final BitSet FOLLOW_rulePred_in_ruleLiteral7086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_ruleLiteral7113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleLiteral7133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleLiteral7151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePred_in_entryRulePred7188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePred7198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ATOM_in_rulePred7250 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000280L});
    public static final BitSet FOLLOW_78_in_rulePred7273 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000280L});
    public static final BitSet FOLLOW_79_in_rulePred7291 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000280L});
    public static final BitSet FOLLOW_71_in_rulePred7305 = new BitSet(new long[]{0x00000000000006F0L,0x000000000000FA00L});
    public static final BitSet FOLLOW_ruleTerms_in_rulePred7326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_rulePred7338 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleList_in_rulePred7361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerms_in_entryRuleTerms7398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerms7408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleTerms7454 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleTerms7467 = new BitSet(new long[]{0x00000000000006F0L,0x000000000000FA00L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleTerms7488 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm7526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm7536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_ruleTerm7582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleTerm7609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTerm7632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_LITERAL_in_ruleTerm7660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_REAL_LITERAL_in_ruleTerm7688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleList_in_entryRuleList7729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleList7739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleList7785 = new BitSet(new long[]{0x00000000000006F0L,0x000000000000FE00L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleList7807 = new BitSet(new long[]{0x0000000008000000L,0x0000000000010400L});
    public static final BitSet FOLLOW_27_in_ruleList7820 = new BitSet(new long[]{0x00000000000006F0L,0x000000000000FA00L});
    public static final BitSet FOLLOW_ruleTerm_in_ruleList7841 = new BitSet(new long[]{0x0000000008000000L,0x0000000000010400L});
    public static final BitSet FOLLOW_80_in_ruleList7856 = new BitSet(new long[]{0x0000000000000600L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_VART_in_ruleList7874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_UNNAMEDVART_in_ruleList7902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_ruleList_in_ruleList7934 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_ruleList7951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar7987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar7997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VART_in_ruleVar8040 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_UNNAMEDVART_in_ruleVar8068 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleList_in_ruleVar8095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEOL_in_entryRuleEOL8133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEOL8144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NEWLINE_in_ruleEOL8184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleEOL8210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFQN_in_entryRuleFQN8256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFQN8267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VART_in_ruleFQN8308 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleFQN8334 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleFQN8354 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_RULE_VART_in_ruleFQN8370 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ATOM_in_ruleFQN8396 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});

}