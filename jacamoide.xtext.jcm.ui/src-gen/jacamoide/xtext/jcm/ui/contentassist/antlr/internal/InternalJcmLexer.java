package jacamoide.xtext.jcm.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJcmLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int RULE_HEXDIGIT=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int RULE_ATOM=7;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_REAL_LITERAL=10;
    public static final int T__59=59;
    public static final int RULE_INT_LITERAL=8;
    public static final int RULE_CHAR=14;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_VART=6;
    public static final int T__40=40;
    public static final int RULE_NEWLINE=4;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__80=80;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_HEXPREFIX=19;
    public static final int RULE_SL_COMMENT=5;
    public static final int RULE_LETTER=16;
    public static final int RULE_ML_COMMENT=22;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=9;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int T__34=34;
    public static final int T__72=72;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_LCLETTER=13;
    public static final int T__39=39;
    public static final int RULE_UCLETTER=15;
    public static final int RULE_INTEGERNUMBER=18;
    public static final int RULE_IP=11;
    public static final int RULE_UNNAMEDVART=12;
    public static final int T__76=76;
    public static final int RULE_WS=21;
    public static final int T__75=75;
    public static final int RULE_DIGIT=17;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators

    public InternalJcmLexer() {;} 
    public InternalJcmLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalJcmLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g"; }

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:11:7: ( ',' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:11:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:12:7: ( 'discard' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:12:9: 'discard'
            {
            match("discard"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13:7: ( 'requeue' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13:9: 'requeue'
            {
            match("requeue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:14:7: ( 'retrieve' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:14:9: 'retrieve'
            {
            match("retrieve"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:15:7: ( 'sameFocus' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:15:9: 'sameFocus'
            {
            match("sameFocus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:16:7: ( 'newFocus' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:16:9: 'newFocus'
            {
            match("newFocus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:17:7: ( '*' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:17:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:18:7: ( '/' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:18:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:19:7: ( '-' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:19:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:20:7: ( '.' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:20:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:21:7: ( '..' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:21:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:22:7: ( 'true' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:22:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:23:7: ( 'false' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:23:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:24:7: ( 'begin' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:24:9: 'begin'
            {
            match("begin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:25:7: ( 'end' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:25:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:26:7: ( 'mas' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:26:9: 'mas'
            {
            match("mas"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:27:7: ( '{' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:27:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:28:7: ( '}' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:28:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:29:7: ( 'uses' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:29:9: 'uses'
            {
            match("uses"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:30:7: ( 'class-path' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:30:9: 'class-path'
            {
            match("class-path"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:31:7: ( ':' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:31:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:32:7: ( 'asl-path' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:32:9: 'asl-path'
            {
            match("asl-path"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:33:7: ( 'platform' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:33:9: 'platform'
            {
            match("platform"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:34:7: ( 'node' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:34:9: 'node'
            {
            match("node"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:35:7: ( 'running' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:35:9: 'running'
            {
            match("running"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:36:7: ( '@' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:36:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:37:7: ( 'agent' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:37:9: 'agent'
            {
            match("agent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:38:7: ( 'instances' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:38:9: 'instances'
            {
            match("instances"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:39:7: ( 'ag-arch' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:39:9: 'ag-arch'
            {
            match("ag-arch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:40:7: ( 'ag-class' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:40:9: 'ag-class'
            {
            match("ag-class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:41:7: ( 'ag-bb-class' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:41:9: 'ag-bb-class'
            {
            match("ag-bb-class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:42:7: ( 'beliefs' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:42:9: 'beliefs'
            {
            match("beliefs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:43:7: ( 'goals' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:43:9: 'goals'
            {
            match("goals"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:44:7: ( 'focus' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:44:9: 'focus'
            {
            match("focus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:45:7: ( 'join' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:45:9: 'join'
            {
            match("join"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:46:7: ( 'roles' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:46:9: 'roles'
            {
            match("roles"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:47:7: ( 'in' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:47:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:48:7: ( 'debug' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:48:9: 'debug'
            {
            match("debug"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:49:7: ( 'verbose' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:49:9: 'verbose'
            {
            match("verbose"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:50:7: ( 'nrcbp' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:50:9: 'nrcbp'
            {
            match("nrcbp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:51:7: ( 'events' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:51:9: 'events'
            {
            match("events"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:52:7: ( 'intBels' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:52:9: 'intBels'
            {
            match("intBels"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:53:7: ( 'workspace' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:53:9: 'workspace'
            {
            match("workspace"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:54:7: ( 'agents' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:54:9: 'agents'
            {
            match("agents"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:55:7: ( 'artifact' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:55:9: 'artifact'
            {
            match("artifact"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:56:7: ( 'focused-by' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:56:9: 'focused-by'
            {
            match("focused-by"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:57:7: ( 'organisation' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:57:9: 'organisation'
            {
            match("organisation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:58:7: ( 'group' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:58:9: 'group'
            {
            match("group"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:59:7: ( 'responsible-for' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:59:9: 'responsible-for'
            {
            match("responsible-for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:60:7: ( 'owner' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:60:9: 'owner'
            {
            match("owner"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:61:7: ( 'players' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:61:9: 'players'
            {
            match("players"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:62:7: ( 'scheme' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:62:9: 'scheme'
            {
            match("scheme"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:63:7: ( '(' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:63:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:64:7: ( ')' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:64:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:65:7: ( '[' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:65:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:66:7: ( ']' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:66:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:67:7: ( '~' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:67:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:68:7: ( '|' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:68:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "RULE_IP"
    public final void mRULE_IP() throws RecognitionException {
        try {
            int _type = RULE_IP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13539:9: ( ( RULE_INT_LITERAL )+ '.' ( RULE_INT_LITERAL )+ '.' ( RULE_INT_LITERAL )+ '.' ( RULE_INT_LITERAL )+ )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13539:11: ( RULE_INT_LITERAL )+ '.' ( RULE_INT_LITERAL )+ '.' ( RULE_INT_LITERAL )+ '.' ( RULE_INT_LITERAL )+
            {
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13539:11: ( RULE_INT_LITERAL )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13539:11: RULE_INT_LITERAL
            	    {
            	    mRULE_INT_LITERAL(); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            match('.'); 
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13539:33: ( RULE_INT_LITERAL )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13539:33: RULE_INT_LITERAL
            	    {
            	    mRULE_INT_LITERAL(); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            match('.'); 
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13539:55: ( RULE_INT_LITERAL )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13539:55: RULE_INT_LITERAL
            	    {
            	    mRULE_INT_LITERAL(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            match('.'); 
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13539:77: ( RULE_INT_LITERAL )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13539:77: RULE_INT_LITERAL
            	    {
            	    mRULE_INT_LITERAL(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IP"

    // $ANTLR start "RULE_ATOM"
    public final void mRULE_ATOM() throws RecognitionException {
        try {
            int _type = RULE_ATOM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13541:11: ( ( RULE_LCLETTER | '.' RULE_CHAR ) ( RULE_CHAR | '.' RULE_CHAR )* )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13541:13: ( RULE_LCLETTER | '.' RULE_CHAR ) ( RULE_CHAR | '.' RULE_CHAR )*
            {
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13541:13: ( RULE_LCLETTER | '.' RULE_CHAR )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>='a' && LA5_0<='z')) ) {
                alt5=1;
            }
            else if ( (LA5_0=='.') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13541:14: RULE_LCLETTER
                    {
                    mRULE_LCLETTER(); 

                    }
                    break;
                case 2 :
                    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13541:28: '.' RULE_CHAR
                    {
                    match('.'); 
                    mRULE_CHAR(); 

                    }
                    break;

            }

            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13541:43: ( RULE_CHAR | '.' RULE_CHAR )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }
                else if ( (LA6_0=='.') ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13541:44: RULE_CHAR
            	    {
            	    mRULE_CHAR(); 

            	    }
            	    break;
            	case 2 :
            	    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13541:54: '.' RULE_CHAR
            	    {
            	    match('.'); 
            	    mRULE_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ATOM"

    // $ANTLR start "RULE_VART"
    public final void mRULE_VART() throws RecognitionException {
        try {
            int _type = RULE_VART;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13543:11: ( RULE_UCLETTER ( RULE_CHAR )* )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13543:13: RULE_UCLETTER ( RULE_CHAR )*
            {
            mRULE_UCLETTER(); 
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13543:27: ( RULE_CHAR )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_'||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13543:27: RULE_CHAR
            	    {
            	    mRULE_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VART"

    // $ANTLR start "RULE_UNNAMEDVART"
    public final void mRULE_UNNAMEDVART() throws RecognitionException {
        try {
            int _type = RULE_UNNAMEDVART;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13545:18: ( '_' ( RULE_CHAR )* )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13545:20: '_' ( RULE_CHAR )*
            {
            match('_'); 
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13545:24: ( RULE_CHAR )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13545:24: RULE_CHAR
            	    {
            	    mRULE_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UNNAMEDVART"

    // $ANTLR start "RULE_CHAR"
    public final void mRULE_CHAR() throws RecognitionException {
        try {
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13547:20: ( ( RULE_LETTER | RULE_DIGIT | '_' ) )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13547:22: ( RULE_LETTER | RULE_DIGIT | '_' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_CHAR"

    // $ANTLR start "RULE_LETTER"
    public final void mRULE_LETTER() throws RecognitionException {
        try {
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13549:22: ( ( RULE_LCLETTER | RULE_UCLETTER ) )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13549:24: ( RULE_LCLETTER | RULE_UCLETTER )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LETTER"

    // $ANTLR start "RULE_LCLETTER"
    public final void mRULE_LCLETTER() throws RecognitionException {
        try {
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13551:24: ( 'a' .. 'z' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13551:26: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LCLETTER"

    // $ANTLR start "RULE_UCLETTER"
    public final void mRULE_UCLETTER() throws RecognitionException {
        try {
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13553:24: ( 'A' .. 'Z' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13553:26: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_UCLETTER"

    // $ANTLR start "RULE_DIGIT"
    public final void mRULE_DIGIT() throws RecognitionException {
        try {
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13555:21: ( '0' .. '9' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13555:23: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13557:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13557:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13557:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\\') ) {
                    alt9=1;
                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='!')||(LA9_0>='#' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13557:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13557:61: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_INT_LITERAL"
    public final void mRULE_INT_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_INT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13559:18: ( RULE_INTEGERNUMBER )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13559:20: RULE_INTEGERNUMBER
            {
            mRULE_INTEGERNUMBER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT_LITERAL"

    // $ANTLR start "RULE_REAL_LITERAL"
    public final void mRULE_REAL_LITERAL() throws RecognitionException {
        try {
            int _type = RULE_REAL_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13561:19: ( ( RULE_INTEGERNUMBER )? '.' RULE_INTEGERNUMBER )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13561:21: ( RULE_INTEGERNUMBER )? '.' RULE_INTEGERNUMBER
            {
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13561:21: ( RULE_INTEGERNUMBER )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13561:21: RULE_INTEGERNUMBER
                    {
                    mRULE_INTEGERNUMBER(); 

                    }
                    break;

            }

            match('.'); 
            mRULE_INTEGERNUMBER(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL_LITERAL"

    // $ANTLR start "RULE_INTEGERNUMBER"
    public final void mRULE_INTEGERNUMBER() throws RecognitionException {
        try {
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13563:29: ( ( '0' | '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )+ | RULE_HEXPREFIX ( RULE_HEXDIGIT )+ ) )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13563:31: ( '0' | '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )+ | RULE_HEXPREFIX ( RULE_HEXDIGIT )+ )
            {
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13563:31: ( '0' | '1' .. '9' ( '0' .. '9' )* | '0' ( '0' .. '7' )+ | RULE_HEXPREFIX ( RULE_HEXDIGIT )+ )
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'X':
                case 'x':
                    {
                    alt14=4;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt14=3;
                    }
                    break;
                default:
                    alt14=1;}

            }
            else if ( ((LA14_0>='1' && LA14_0<='9')) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13563:32: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13563:36: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13563:45: ( '0' .. '9' )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13563:46: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13563:57: '0' ( '0' .. '7' )+
                    {
                    match('0'); 
                    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13563:61: ( '0' .. '7' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='7')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13563:62: '0' .. '7'
                    	    {
                    	    matchRange('0','7'); 

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
                case 4 :
                    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13563:73: RULE_HEXPREFIX ( RULE_HEXDIGIT )+
                    {
                    mRULE_HEXPREFIX(); 
                    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13563:88: ( RULE_HEXDIGIT )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0>='0' && LA13_0<='9')||(LA13_0>='A' && LA13_0<='F')||(LA13_0>='a' && LA13_0<='f')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13563:88: RULE_HEXDIGIT
                    	    {
                    	    mRULE_HEXDIGIT(); 

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

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INTEGERNUMBER"

    // $ANTLR start "RULE_HEXPREFIX"
    public final void mRULE_HEXPREFIX() throws RecognitionException {
        try {
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13565:25: ( ( '0x' | '0X' ) )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13565:27: ( '0x' | '0X' )
            {
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13565:27: ( '0x' | '0X' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='0') ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1=='x') ) {
                    alt15=1;
                }
                else if ( (LA15_1=='X') ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13565:28: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13565:33: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXPREFIX"

    // $ANTLR start "RULE_HEXDIGIT"
    public final void mRULE_HEXDIGIT() throws RecognitionException {
        try {
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13567:24: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13567:26: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEXDIGIT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13569:9: ( ( ' ' | '\\t' | '\\r' )+ )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13569:11: ( ' ' | '\\t' | '\\r' )+
            {
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13569:11: ( ' ' | '\\t' | '\\r' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='\t'||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13571:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13571:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13571:24: ( options {greedy=false; } : . )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0=='*') ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1=='/') ) {
                        alt17=2;
                    }
                    else if ( ((LA17_1>='\u0000' && LA17_1<='.')||(LA17_1>='0' && LA17_1<='\uFFFF')) ) {
                        alt17=1;
                    }


                }
                else if ( ((LA17_0>='\u0000' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13571:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13573:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13573:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13573:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\u0000' && LA18_0<='\t')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13573:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13573:40: ( ( '\\r' )? '\\n' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\n'||LA20_0=='\r') ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13573:41: ( '\\r' )? '\\n'
                    {
                    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13573:41: ( '\\r' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0=='\r') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13573:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            int _type = RULE_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13575:14: ( ( '\\r' )? '\\n' )
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13575:16: ( '\\r' )? '\\n'
            {
            // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13575:16: ( '\\r' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\r') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:13575:16: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEWLINE"

    public void mTokens() throws RecognitionException {
        // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:8: ( T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | RULE_IP | RULE_ATOM | RULE_VART | RULE_UNNAMEDVART | RULE_STRING | RULE_INT_LITERAL | RULE_REAL_LITERAL | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_NEWLINE )
        int alt22=69;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:10: T__23
                {
                mT__23(); 

                }
                break;
            case 2 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:16: T__24
                {
                mT__24(); 

                }
                break;
            case 3 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:22: T__25
                {
                mT__25(); 

                }
                break;
            case 4 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:28: T__26
                {
                mT__26(); 

                }
                break;
            case 5 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:34: T__27
                {
                mT__27(); 

                }
                break;
            case 6 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:40: T__28
                {
                mT__28(); 

                }
                break;
            case 7 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:46: T__29
                {
                mT__29(); 

                }
                break;
            case 8 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:52: T__30
                {
                mT__30(); 

                }
                break;
            case 9 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:58: T__31
                {
                mT__31(); 

                }
                break;
            case 10 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:64: T__32
                {
                mT__32(); 

                }
                break;
            case 11 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:70: T__33
                {
                mT__33(); 

                }
                break;
            case 12 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:76: T__34
                {
                mT__34(); 

                }
                break;
            case 13 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:82: T__35
                {
                mT__35(); 

                }
                break;
            case 14 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:88: T__36
                {
                mT__36(); 

                }
                break;
            case 15 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:94: T__37
                {
                mT__37(); 

                }
                break;
            case 16 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:100: T__38
                {
                mT__38(); 

                }
                break;
            case 17 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:106: T__39
                {
                mT__39(); 

                }
                break;
            case 18 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:112: T__40
                {
                mT__40(); 

                }
                break;
            case 19 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:118: T__41
                {
                mT__41(); 

                }
                break;
            case 20 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:124: T__42
                {
                mT__42(); 

                }
                break;
            case 21 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:130: T__43
                {
                mT__43(); 

                }
                break;
            case 22 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:136: T__44
                {
                mT__44(); 

                }
                break;
            case 23 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:142: T__45
                {
                mT__45(); 

                }
                break;
            case 24 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:148: T__46
                {
                mT__46(); 

                }
                break;
            case 25 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:154: T__47
                {
                mT__47(); 

                }
                break;
            case 26 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:160: T__48
                {
                mT__48(); 

                }
                break;
            case 27 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:166: T__49
                {
                mT__49(); 

                }
                break;
            case 28 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:172: T__50
                {
                mT__50(); 

                }
                break;
            case 29 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:178: T__51
                {
                mT__51(); 

                }
                break;
            case 30 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:184: T__52
                {
                mT__52(); 

                }
                break;
            case 31 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:190: T__53
                {
                mT__53(); 

                }
                break;
            case 32 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:196: T__54
                {
                mT__54(); 

                }
                break;
            case 33 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:202: T__55
                {
                mT__55(); 

                }
                break;
            case 34 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:208: T__56
                {
                mT__56(); 

                }
                break;
            case 35 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:214: T__57
                {
                mT__57(); 

                }
                break;
            case 36 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:220: T__58
                {
                mT__58(); 

                }
                break;
            case 37 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:226: T__59
                {
                mT__59(); 

                }
                break;
            case 38 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:232: T__60
                {
                mT__60(); 

                }
                break;
            case 39 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:238: T__61
                {
                mT__61(); 

                }
                break;
            case 40 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:244: T__62
                {
                mT__62(); 

                }
                break;
            case 41 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:250: T__63
                {
                mT__63(); 

                }
                break;
            case 42 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:256: T__64
                {
                mT__64(); 

                }
                break;
            case 43 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:262: T__65
                {
                mT__65(); 

                }
                break;
            case 44 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:268: T__66
                {
                mT__66(); 

                }
                break;
            case 45 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:274: T__67
                {
                mT__67(); 

                }
                break;
            case 46 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:280: T__68
                {
                mT__68(); 

                }
                break;
            case 47 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:286: T__69
                {
                mT__69(); 

                }
                break;
            case 48 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:292: T__70
                {
                mT__70(); 

                }
                break;
            case 49 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:298: T__71
                {
                mT__71(); 

                }
                break;
            case 50 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:304: T__72
                {
                mT__72(); 

                }
                break;
            case 51 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:310: T__73
                {
                mT__73(); 

                }
                break;
            case 52 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:316: T__74
                {
                mT__74(); 

                }
                break;
            case 53 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:322: T__75
                {
                mT__75(); 

                }
                break;
            case 54 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:328: T__76
                {
                mT__76(); 

                }
                break;
            case 55 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:334: T__77
                {
                mT__77(); 

                }
                break;
            case 56 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:340: T__78
                {
                mT__78(); 

                }
                break;
            case 57 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:346: T__79
                {
                mT__79(); 

                }
                break;
            case 58 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:352: T__80
                {
                mT__80(); 

                }
                break;
            case 59 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:358: RULE_IP
                {
                mRULE_IP(); 

                }
                break;
            case 60 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:366: RULE_ATOM
                {
                mRULE_ATOM(); 

                }
                break;
            case 61 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:376: RULE_VART
                {
                mRULE_VART(); 

                }
                break;
            case 62 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:386: RULE_UNNAMEDVART
                {
                mRULE_UNNAMEDVART(); 

                }
                break;
            case 63 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:403: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 64 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:415: RULE_INT_LITERAL
                {
                mRULE_INT_LITERAL(); 

                }
                break;
            case 65 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:432: RULE_REAL_LITERAL
                {
                mRULE_REAL_LITERAL(); 

                }
                break;
            case 66 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:450: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 67 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:458: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 68 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:474: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 69 :
                // ../jacamoide.xtext.jcm.ui/src-gen/jacamoide/xtext/jcm/ui/contentassist/antlr/internal/InternalJcm.g:1:490: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;

        }

    }


    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA22_eotS =
        "\2\uffff\4\45\1\uffff\1\70\1\uffff\1\74\5\45\2\uffff\2\45\1\uffff"+
        "\2\45\1\uffff\6\45\6\uffff\2\124\4\uffff\1\52\2\uffff\12\45\4\uffff"+
        "\2\45\1\uffff\15\45\1\174\7\45\3\uffff\1\124\1\uffff\1\124\1\uffff"+
        "\2\124\25\45\1\u009d\1\45\1\u009f\4\45\1\uffff\4\45\1\uffff\7\45"+
        "\1\124\2\u00b7\4\124\12\45\1\u00c6\2\45\1\u00c8\4\45\1\uffff\1\45"+
        "\1\uffff\1\u00ce\1\45\1\uffff\1\45\3\uffff\7\45\1\u00d8\4\45\2\124"+
        "\3\uffff\4\u00b7\1\45\1\u00e7\4\45\1\u00ec\3\45\1\uffff\1\u00f0"+
        "\1\uffff\1\u00f1\1\u00f3\1\u00f4\2\45\1\uffff\1\45\1\u00f9\5\45"+
        "\1\u00ff\1\u0100\1\uffff\3\45\1\u0104\4\124\5\u00b7\1\45\1\uffff"+
        "\4\45\1\uffff\1\45\1\u010f\1\45\2\uffff\1\45\2\uffff\1\45\1\u0113"+
        "\1\uffff\1\u0114\1\uffff\5\45\2\uffff\3\45\1\uffff\2\124\2\u00b7"+
        "\1\u0121\1\u0122\2\45\1\u0125\1\45\1\uffff\2\45\1\u0129\2\uffff"+
        "\2\45\1\u012c\1\45\1\u012e\1\u012f\2\45\4\u00b7\2\uffff\1\u0134"+
        "\1\45\1\uffff\1\45\1\u0137\2\uffff\1\u0138\1\u0139\1\uffff\1\45"+
        "\2\uffff\2\45\2\u00b7\1\uffff\1\45\1\u013e\3\uffff\1\u013f\1\u0140"+
        "\2\45\3\uffff\3\45\1\uffff\1\u0146\1\uffff";
    static final String DFA22_eofS =
        "\u0147\uffff";
    static final String DFA22_minS =
        "\1\11\1\uffff\2\145\1\141\1\145\1\uffff\1\52\1\uffff\1\56\1\162"+
        "\1\141\1\145\1\156\1\141\2\uffff\1\163\1\154\1\uffff\1\147\1\154"+
        "\1\uffff\1\156\2\157\1\145\1\157\1\162\6\uffff\2\56\4\uffff\1\12"+
        "\2\uffff\1\163\1\142\1\161\1\156\1\154\1\155\1\150\1\167\1\144\1"+
        "\143\4\uffff\2\60\1\uffff\1\165\1\154\1\143\1\147\1\144\1\145\1"+
        "\163\1\145\1\141\1\154\1\55\1\164\1\141\1\56\1\141\1\157\1\151\2"+
        "\162\1\147\1\156\2\60\1\uffff\1\56\1\60\1\56\1\uffff\2\56\1\143"+
        "\2\165\1\162\1\160\1\156\3\145\1\106\1\145\1\142\4\60\1\145\1\163"+
        "\1\165\2\151\1\56\1\156\1\56\2\163\1\55\1\156\1\141\1\151\2\164"+
        "\1\102\1\uffff\1\154\1\165\1\156\1\142\1\153\1\141\1\145\7\56\1"+
        "\141\1\147\1\145\1\151\1\157\1\151\1\163\1\106\1\155\1\157\1\56"+
        "\1\160\1\60\1\56\1\145\1\163\1\156\1\145\1\uffff\1\164\1\uffff\1"+
        "\56\1\163\1\uffff\1\164\3\uffff\2\146\1\145\1\141\1\145\1\163\1"+
        "\160\1\56\1\157\1\163\1\156\1\162\2\56\2\60\1\uffff\4\56\1\162\1"+
        "\56\1\165\1\145\2\156\1\56\1\157\1\145\1\143\1\uffff\1\56\1\uffff"+
        "\3\56\1\146\1\163\1\uffff\1\55\1\56\1\141\1\157\1\162\1\156\1\154"+
        "\2\56\1\uffff\1\163\1\160\1\151\12\56\1\144\1\uffff\1\145\1\166"+
        "\1\163\1\147\1\uffff\1\143\1\56\1\165\2\uffff\1\144\2\uffff\1\163"+
        "\1\56\1\uffff\1\56\1\uffff\1\143\1\162\1\163\1\143\1\163\2\uffff"+
        "\1\145\1\141\1\163\1\uffff\6\56\1\145\1\151\1\56\1\165\1\uffff\1"+
        "\163\1\55\1\56\2\uffff\1\164\1\155\1\56\1\145\2\56\1\143\1\141\4"+
        "\56\2\uffff\1\56\1\142\1\uffff\1\163\1\56\2\uffff\2\56\1\uffff\1"+
        "\163\2\uffff\1\145\1\164\2\56\1\uffff\1\154\1\56\3\uffff\2\56\1"+
        "\151\1\145\3\uffff\1\157\1\55\1\156\1\uffff\1\56\1\uffff";
    static final String DFA22_maxS =
        "\1\176\1\uffff\1\151\1\165\1\143\1\162\1\uffff\1\57\1\uffff\1\172"+
        "\1\162\1\157\1\145\1\166\1\141\2\uffff\1\163\1\154\1\uffff\1\163"+
        "\1\154\1\uffff\1\156\1\162\1\157\1\145\1\157\1\167\6\uffff\1\170"+
        "\1\71\4\uffff\1\12\2\uffff\1\163\1\142\1\164\1\156\1\154\1\155\1"+
        "\150\1\167\1\144\1\143\4\uffff\1\170\1\71\1\uffff\1\165\1\154\1"+
        "\143\1\154\1\144\1\145\1\163\1\145\1\141\1\154\1\145\1\164\1\141"+
        "\1\172\1\141\1\157\1\151\2\162\1\147\1\156\2\146\1\uffff\1\170\2"+
        "\71\1\uffff\1\170\1\71\1\143\2\165\1\162\1\160\1\156\3\145\1\106"+
        "\1\145\1\142\2\146\1\67\1\71\1\145\1\163\1\165\2\151\1\172\1\156"+
        "\1\172\2\163\1\55\1\156\1\143\1\151\1\171\1\164\1\102\1\uffff\1"+
        "\154\1\165\1\156\1\142\1\153\1\141\1\145\1\146\1\170\1\71\1\170"+
        "\1\71\1\170\1\71\1\141\1\147\1\145\1\151\1\157\1\151\1\163\1\106"+
        "\1\155\1\157\1\172\1\160\1\146\1\172\1\145\1\163\1\156\1\145\1\uffff"+
        "\1\164\1\uffff\1\172\1\163\1\uffff\1\164\3\uffff\2\146\1\145\1\141"+
        "\1\145\1\163\1\160\1\172\1\157\1\163\1\156\1\162\1\170\3\146\1\uffff"+
        "\1\170\1\71\1\170\1\71\1\162\1\172\1\165\1\145\2\156\1\172\1\157"+
        "\1\145\1\143\1\uffff\1\172\1\uffff\3\172\1\146\1\163\1\uffff\1\55"+
        "\1\172\1\141\1\157\1\162\1\156\1\154\2\172\1\uffff\1\163\1\160\1"+
        "\151\1\172\1\170\1\146\1\170\2\146\1\170\1\71\1\170\1\71\1\144\1"+
        "\uffff\1\145\1\166\1\163\1\147\1\uffff\1\143\1\172\1\165\2\uffff"+
        "\1\144\2\uffff\1\163\1\172\1\uffff\1\172\1\uffff\1\143\1\162\1\163"+
        "\1\143\1\163\2\uffff\1\145\1\141\1\163\1\uffff\1\170\1\146\1\170"+
        "\1\146\2\172\1\145\1\151\1\172\1\165\1\uffff\1\163\1\55\1\172\2"+
        "\uffff\1\164\1\155\1\172\1\145\2\172\1\143\1\141\1\170\1\146\1\170"+
        "\1\146\2\uffff\1\172\1\142\1\uffff\1\163\1\172\2\uffff\2\172\1\uffff"+
        "\1\163\2\uffff\1\145\1\164\1\170\1\146\1\uffff\1\154\1\172\3\uffff"+
        "\2\172\1\151\1\145\3\uffff\1\157\1\55\1\156\1\uffff\1\172\1\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\4\uffff\1\7\1\uffff\1\11\6\uffff\1\21\1\22\2\uffff"+
        "\1\25\2\uffff\1\32\6\uffff\1\65\1\66\1\67\1\70\1\71\1\72\2\uffff"+
        "\1\74\1\75\1\76\1\77\1\uffff\1\102\1\105\12\uffff\1\103\1\104\1"+
        "\10\1\13\2\uffff\1\12\27\uffff\1\100\3\uffff\1\73\43\uffff\1\45"+
        "\40\uffff\1\17\1\uffff\1\20\2\uffff\1\26\1\uffff\1\35\1\36\1\37"+
        "\20\uffff\1\101\16\uffff\1\30\1\uffff\1\14\5\uffff\1\23\11\uffff"+
        "\1\43\16\uffff\1\46\4\uffff\1\44\3\uffff\1\50\1\15\1\uffff\1\42"+
        "\1\16\2\uffff\1\24\1\uffff\1\33\5\uffff\1\41\1\60\3\uffff\1\62\12"+
        "\uffff\1\64\3\uffff\1\51\1\54\14\uffff\1\2\1\3\2\uffff\1\31\2\uffff"+
        "\1\56\1\40\2\uffff\1\63\1\uffff\1\52\1\47\4\uffff\1\4\2\uffff\1"+
        "\6\1\55\1\27\4\uffff\1\5\1\34\1\53\3\uffff\1\61\1\uffff\1\57";
    static final String DFA22_specialS =
        "\u0147\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\52\1\53\2\uffff\1\51\22\uffff\1\52\1\uffff\1\50\5\uffff\1"+
            "\35\1\36\1\6\1\uffff\1\1\1\10\1\11\1\7\1\43\11\44\1\23\5\uffff"+
            "\1\26\32\46\1\37\1\uffff\1\40\1\uffff\1\47\1\uffff\1\24\1\14"+
            "\1\22\1\2\1\15\1\13\1\30\1\45\1\27\1\31\2\45\1\16\1\5\1\34\1"+
            "\25\1\45\1\3\1\4\1\12\1\21\1\32\1\33\3\45\1\17\1\42\1\20\1\41",
            "",
            "\1\55\3\uffff\1\54",
            "\1\56\11\uffff\1\60\5\uffff\1\57",
            "\1\61\1\uffff\1\62",
            "\1\63\11\uffff\1\64\2\uffff\1\65",
            "",
            "\1\66\4\uffff\1\67",
            "",
            "\1\71\1\uffff\1\72\11\73\7\uffff\32\45\4\uffff\1\45\1\uffff"+
            "\32\45",
            "\1\75",
            "\1\76\15\uffff\1\77",
            "\1\100",
            "\1\101\7\uffff\1\102",
            "\1\103",
            "",
            "",
            "\1\104",
            "\1\105",
            "",
            "\1\107\12\uffff\1\110\1\106",
            "\1\111",
            "",
            "\1\112",
            "\1\113\2\uffff\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120\4\uffff\1\121",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\126\1\uffff\1\125\7\127\2\130\36\uffff\1\123\37\uffff\1"+
            "\122",
            "\1\126\1\uffff\1\131\11\132",
            "",
            "",
            "",
            "",
            "\1\53",
            "",
            "",
            "\1\133",
            "\1\134",
            "\1\135\1\uffff\1\137\1\136",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "",
            "",
            "",
            "",
            "\10\151\40\uffff\1\150\37\uffff\1\147",
            "\12\152",
            "",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156\4\uffff\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\167\67\uffff\1\166",
            "\1\170",
            "\1\171",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45"+
            "\1\172\1\173\6\45",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\12\u0084\7\uffff\6\u0084\32\uffff\6\u0084",
            "\12\u0084\7\uffff\6\u0084\32\uffff\6\u0084",
            "",
            "\1\126\1\uffff\1\125\7\127\2\130\36\uffff\1\130\37\uffff\1"+
            "\130",
            "\1\u0085\11\u0086",
            "\1\126\1\uffff\1\u0087\7\u0088\2\130",
            "",
            "\1\126\1\uffff\1\u0089\7\u008a\2\132\36\uffff\1\130\37\uffff"+
            "\1\130",
            "\1\126\1\uffff\1\131\11\132",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\12\u0097\7\uffff\6\u0097\32\uffff\6\u0097",
            "\12\u0097\7\uffff\6\u0097\32\uffff\6\u0097",
            "\10\151",
            "\12\152",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u009e",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4\1\u00a6\1\u00a5",
            "\1\u00a7",
            "\1\u00a8\4\uffff\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\126\1\uffff\1\u00b3\11\u00b4\7\uffff\6\u0084\32\uffff\6"+
            "\u0084",
            "\1\130\1\uffff\1\u00b8\7\u00b9\2\130\36\uffff\1\u00b6\37\uffff"+
            "\1\u00b5",
            "\1\130\1\uffff\1\u00ba\11\u00bb",
            "\1\126\1\uffff\1\u0087\7\u0088\2\130\36\uffff\1\130\37\uffff"+
            "\1\130",
            "\1\126\1\uffff\1\u0087\7\u0088\2\130",
            "\1\126\1\uffff\1\u0089\7\u008a\2\132\36\uffff\1\130\37\uffff"+
            "\1\130",
            "\1\126\1\uffff\1\u0089\7\u008a\2\132",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00c7",
            "\12\u0097\7\uffff\6\u0097\32\uffff\6\u0097",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "\1\u00cd",
            "",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00cf",
            "",
            "\1\u00d0",
            "",
            "",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\126\1\uffff\1\u00dd\7\u00de\2\u00b4\7\uffff\6\u0084\21\uffff"+
            "\1\130\10\uffff\6\u0084\21\uffff\1\130",
            "\1\126\1\uffff\1\u00df\11\u00e0\7\uffff\6\u0084\32\uffff\6"+
            "\u0084",
            "\12\u00e1\7\uffff\6\u00e1\32\uffff\6\u00e1",
            "\12\u00e1\7\uffff\6\u00e1\32\uffff\6\u00e1",
            "",
            "\1\130\1\uffff\1\u00b8\7\u00b9\2\130\36\uffff\1\130\37\uffff"+
            "\1\130",
            "\1\130\1\uffff\1\u00e2\7\u00e3\2\130",
            "\1\130\1\uffff\1\u00e4\7\u00e5\2\u00bb\36\uffff\1\130\37\uffff"+
            "\1\130",
            "\1\130\1\uffff\1\u00ba\11\u00bb",
            "\1\u00e6",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\4\45"+
            "\1\u00f2\25\45",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u00f5",
            "\1\u00f6",
            "",
            "\1\u00f7",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\22\45"+
            "\1\u00f8\7\45",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\126\1\uffff\1\u00dd\7\u00de\2\u00b4\7\uffff\6\u0084\21\uffff"+
            "\1\130\10\uffff\6\u0084\21\uffff\1\130",
            "\1\126\1\uffff\1\u0105\7\u0106\2\u00e0\7\uffff\6\u0084\32\uffff"+
            "\6\u0084",
            "\1\126\1\uffff\1\u0105\7\u0106\2\u00e0\7\uffff\6\u0084\21\uffff"+
            "\1\130\10\uffff\6\u0084\21\uffff\1\130",
            "\1\126\1\uffff\1\u00df\11\u00e0\7\uffff\6\u0084\32\uffff\6"+
            "\u0084",
            "\1\130\1\uffff\1\u0107\11\u0108\7\uffff\6\u00e1\32\uffff\6"+
            "\u00e1",
            "\1\130\1\uffff\1\u00e2\7\u00e3\2\130\36\uffff\1\130\37\uffff"+
            "\1\130",
            "\1\130\1\uffff\1\u00e2\7\u00e3\2\130",
            "\1\130\1\uffff\1\u00e4\7\u00e5\2\u00bb\36\uffff\1\130\37\uffff"+
            "\1\130",
            "\1\130\1\uffff\1\u00e4\7\u00e5\2\u00bb",
            "\1\u0109",
            "",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "",
            "\1\u010e",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0110",
            "",
            "",
            "\1\u0111",
            "",
            "",
            "\1\u0112",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "",
            "",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "",
            "\1\126\1\uffff\1\u0105\7\u0106\2\u00e0\7\uffff\6\u0084\21\uffff"+
            "\1\130\10\uffff\6\u0084\21\uffff\1\130",
            "\1\126\1\uffff\1\u0105\7\u0106\2\u00e0\7\uffff\6\u0084\32\uffff"+
            "\6\u0084",
            "\1\130\1\uffff\1\u011d\7\u011e\2\u0108\7\uffff\6\u00e1\21\uffff"+
            "\1\130\10\uffff\6\u00e1\21\uffff\1\130",
            "\1\130\1\uffff\1\u011f\11\u0120\7\uffff\6\u00e1\32\uffff\6"+
            "\u00e1",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0123",
            "\1\u0124",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0126",
            "",
            "\1\u0127",
            "\1\u0128",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\u012a",
            "\1\u012b",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u012d",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0130",
            "\1\u0131",
            "\1\130\1\uffff\1\u011d\7\u011e\2\u0108\7\uffff\6\u00e1\21\uffff"+
            "\1\130\10\uffff\6\u00e1\21\uffff\1\130",
            "\1\130\1\uffff\1\u0132\7\u0133\2\u0120\7\uffff\6\u00e1\32\uffff"+
            "\6\u00e1",
            "\1\130\1\uffff\1\u0132\7\u0133\2\u0120\7\uffff\6\u00e1\21\uffff"+
            "\1\130\10\uffff\6\u00e1\21\uffff\1\130",
            "\1\130\1\uffff\1\u011f\11\u0120\7\uffff\6\u00e1\32\uffff\6"+
            "\u00e1",
            "",
            "",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0135",
            "",
            "\1\u0136",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "\1\u013a",
            "",
            "",
            "\1\u013b",
            "\1\u013c",
            "\1\130\1\uffff\1\u0132\7\u0133\2\u0120\7\uffff\6\u00e1\21\uffff"+
            "\1\130\10\uffff\6\u00e1\21\uffff\1\130",
            "\1\130\1\uffff\1\u0132\7\u0133\2\u0120\7\uffff\6\u00e1\32\uffff"+
            "\6\u00e1",
            "",
            "\1\u013d",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "",
            "",
            "",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            "\1\u0141",
            "\1\u0142",
            "",
            "",
            "",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "",
            "\1\45\1\uffff\12\45\7\uffff\32\45\4\uffff\1\45\1\uffff\32\45",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | RULE_IP | RULE_ATOM | RULE_VART | RULE_UNNAMEDVART | RULE_STRING | RULE_INT_LITERAL | RULE_REAL_LITERAL | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_NEWLINE );";
        }
    }
 

}