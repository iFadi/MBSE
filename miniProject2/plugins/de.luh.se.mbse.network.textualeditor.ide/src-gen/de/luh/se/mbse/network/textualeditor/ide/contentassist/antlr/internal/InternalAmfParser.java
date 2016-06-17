package de.luh.se.mbse.network.textualeditor.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.luh.se.mbse.network.textualeditor.services.AmfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAmfParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Synchronous'", "'Asynchronous'", "'SEND'", "'RECEIVE'", "'Network'", "'{'", "'}'", "'Statemachine'", "'init'", "'Channel'", "'Transition'", "'->'", "'('", "')'", "'State'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAmfParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAmfParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAmfParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAmf.g"; }


    	private AmfGrammarAccess grammarAccess;

    	public void setGrammarAccess(AmfGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleNetwork"
    // InternalAmf.g:53:1: entryRuleNetwork : ruleNetwork EOF ;
    public final void entryRuleNetwork() throws RecognitionException {
        try {
            // InternalAmf.g:54:1: ( ruleNetwork EOF )
            // InternalAmf.g:55:1: ruleNetwork EOF
            {
             before(grammarAccess.getNetworkRule()); 
            pushFollow(FOLLOW_1);
            ruleNetwork();

            state._fsp--;

             after(grammarAccess.getNetworkRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNetwork"


    // $ANTLR start "ruleNetwork"
    // InternalAmf.g:62:1: ruleNetwork : ( ( rule__Network__Group__0 ) ) ;
    public final void ruleNetwork() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:66:2: ( ( ( rule__Network__Group__0 ) ) )
            // InternalAmf.g:67:2: ( ( rule__Network__Group__0 ) )
            {
            // InternalAmf.g:67:2: ( ( rule__Network__Group__0 ) )
            // InternalAmf.g:68:3: ( rule__Network__Group__0 )
            {
             before(grammarAccess.getNetworkAccess().getGroup()); 
            // InternalAmf.g:69:3: ( rule__Network__Group__0 )
            // InternalAmf.g:69:4: rule__Network__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Network__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNetwork"


    // $ANTLR start "entryRuleStatemachine"
    // InternalAmf.g:78:1: entryRuleStatemachine : ruleStatemachine EOF ;
    public final void entryRuleStatemachine() throws RecognitionException {
        try {
            // InternalAmf.g:79:1: ( ruleStatemachine EOF )
            // InternalAmf.g:80:1: ruleStatemachine EOF
            {
             before(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_1);
            ruleStatemachine();

            state._fsp--;

             after(grammarAccess.getStatemachineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // InternalAmf.g:87:1: ruleStatemachine : ( ( rule__Statemachine__Group__0 ) ) ;
    public final void ruleStatemachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:91:2: ( ( ( rule__Statemachine__Group__0 ) ) )
            // InternalAmf.g:92:2: ( ( rule__Statemachine__Group__0 ) )
            {
            // InternalAmf.g:92:2: ( ( rule__Statemachine__Group__0 ) )
            // InternalAmf.g:93:3: ( rule__Statemachine__Group__0 )
            {
             before(grammarAccess.getStatemachineAccess().getGroup()); 
            // InternalAmf.g:94:3: ( rule__Statemachine__Group__0 )
            // InternalAmf.g:94:4: rule__Statemachine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Statemachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleEString"
    // InternalAmf.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalAmf.g:104:1: ( ruleEString EOF )
            // InternalAmf.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalAmf.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalAmf.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalAmf.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalAmf.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalAmf.g:119:3: ( rule__EString__Alternatives )
            // InternalAmf.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleChannel"
    // InternalAmf.g:128:1: entryRuleChannel : ruleChannel EOF ;
    public final void entryRuleChannel() throws RecognitionException {
        try {
            // InternalAmf.g:129:1: ( ruleChannel EOF )
            // InternalAmf.g:130:1: ruleChannel EOF
            {
             before(grammarAccess.getChannelRule()); 
            pushFollow(FOLLOW_1);
            ruleChannel();

            state._fsp--;

             after(grammarAccess.getChannelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChannel"


    // $ANTLR start "ruleChannel"
    // InternalAmf.g:137:1: ruleChannel : ( ( rule__Channel__Group__0 ) ) ;
    public final void ruleChannel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:141:2: ( ( ( rule__Channel__Group__0 ) ) )
            // InternalAmf.g:142:2: ( ( rule__Channel__Group__0 ) )
            {
            // InternalAmf.g:142:2: ( ( rule__Channel__Group__0 ) )
            // InternalAmf.g:143:3: ( rule__Channel__Group__0 )
            {
             before(grammarAccess.getChannelAccess().getGroup()); 
            // InternalAmf.g:144:3: ( rule__Channel__Group__0 )
            // InternalAmf.g:144:4: rule__Channel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Channel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChannelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChannel"


    // $ANTLR start "entryRuleTransition"
    // InternalAmf.g:153:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // InternalAmf.g:154:1: ( ruleTransition EOF )
            // InternalAmf.g:155:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalAmf.g:162:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:166:2: ( ( ( rule__Transition__Group__0 ) ) )
            // InternalAmf.g:167:2: ( ( rule__Transition__Group__0 ) )
            {
            // InternalAmf.g:167:2: ( ( rule__Transition__Group__0 ) )
            // InternalAmf.g:168:3: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // InternalAmf.g:169:3: ( rule__Transition__Group__0 )
            // InternalAmf.g:169:4: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleState"
    // InternalAmf.g:178:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalAmf.g:179:1: ( ruleState EOF )
            // InternalAmf.g:180:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalAmf.g:187:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:191:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalAmf.g:192:2: ( ( rule__State__Group__0 ) )
            {
            // InternalAmf.g:192:2: ( ( rule__State__Group__0 ) )
            // InternalAmf.g:193:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalAmf.g:194:3: ( rule__State__Group__0 )
            // InternalAmf.g:194:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "ruleTypeOfChannel"
    // InternalAmf.g:203:1: ruleTypeOfChannel : ( ( rule__TypeOfChannel__Alternatives ) ) ;
    public final void ruleTypeOfChannel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:207:1: ( ( ( rule__TypeOfChannel__Alternatives ) ) )
            // InternalAmf.g:208:2: ( ( rule__TypeOfChannel__Alternatives ) )
            {
            // InternalAmf.g:208:2: ( ( rule__TypeOfChannel__Alternatives ) )
            // InternalAmf.g:209:3: ( rule__TypeOfChannel__Alternatives )
            {
             before(grammarAccess.getTypeOfChannelAccess().getAlternatives()); 
            // InternalAmf.g:210:3: ( rule__TypeOfChannel__Alternatives )
            // InternalAmf.g:210:4: rule__TypeOfChannel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeOfChannel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeOfChannelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeOfChannel"


    // $ANTLR start "ruleEvent"
    // InternalAmf.g:219:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:223:1: ( ( ( rule__Event__Alternatives ) ) )
            // InternalAmf.g:224:2: ( ( rule__Event__Alternatives ) )
            {
            // InternalAmf.g:224:2: ( ( rule__Event__Alternatives ) )
            // InternalAmf.g:225:3: ( rule__Event__Alternatives )
            {
             before(grammarAccess.getEventAccess().getAlternatives()); 
            // InternalAmf.g:226:3: ( rule__Event__Alternatives )
            // InternalAmf.g:226:4: rule__Event__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Event__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalAmf.g:234:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:238:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAmf.g:239:2: ( RULE_STRING )
                    {
                    // InternalAmf.g:239:2: ( RULE_STRING )
                    // InternalAmf.g:240:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAmf.g:245:2: ( RULE_ID )
                    {
                    // InternalAmf.g:245:2: ( RULE_ID )
                    // InternalAmf.g:246:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TypeOfChannel__Alternatives"
    // InternalAmf.g:255:1: rule__TypeOfChannel__Alternatives : ( ( ( 'Synchronous' ) ) | ( ( 'Asynchronous' ) ) );
    public final void rule__TypeOfChannel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:259:1: ( ( ( 'Synchronous' ) ) | ( ( 'Asynchronous' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAmf.g:260:2: ( ( 'Synchronous' ) )
                    {
                    // InternalAmf.g:260:2: ( ( 'Synchronous' ) )
                    // InternalAmf.g:261:3: ( 'Synchronous' )
                    {
                     before(grammarAccess.getTypeOfChannelAccess().getSynchronousEnumLiteralDeclaration_0()); 
                    // InternalAmf.g:262:3: ( 'Synchronous' )
                    // InternalAmf.g:262:4: 'Synchronous'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeOfChannelAccess().getSynchronousEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAmf.g:266:2: ( ( 'Asynchronous' ) )
                    {
                    // InternalAmf.g:266:2: ( ( 'Asynchronous' ) )
                    // InternalAmf.g:267:3: ( 'Asynchronous' )
                    {
                     before(grammarAccess.getTypeOfChannelAccess().getAsynchronousEnumLiteralDeclaration_1()); 
                    // InternalAmf.g:268:3: ( 'Asynchronous' )
                    // InternalAmf.g:268:4: 'Asynchronous'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeOfChannelAccess().getAsynchronousEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeOfChannel__Alternatives"


    // $ANTLR start "rule__Event__Alternatives"
    // InternalAmf.g:276:1: rule__Event__Alternatives : ( ( ( 'SEND' ) ) | ( ( 'RECEIVE' ) ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:280:1: ( ( ( 'SEND' ) ) | ( ( 'RECEIVE' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalAmf.g:281:2: ( ( 'SEND' ) )
                    {
                    // InternalAmf.g:281:2: ( ( 'SEND' ) )
                    // InternalAmf.g:282:3: ( 'SEND' )
                    {
                     before(grammarAccess.getEventAccess().getSENDEnumLiteralDeclaration_0()); 
                    // InternalAmf.g:283:3: ( 'SEND' )
                    // InternalAmf.g:283:4: 'SEND'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventAccess().getSENDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAmf.g:287:2: ( ( 'RECEIVE' ) )
                    {
                    // InternalAmf.g:287:2: ( ( 'RECEIVE' ) )
                    // InternalAmf.g:288:3: ( 'RECEIVE' )
                    {
                     before(grammarAccess.getEventAccess().getRECEIVEEnumLiteralDeclaration_1()); 
                    // InternalAmf.g:289:3: ( 'RECEIVE' )
                    // InternalAmf.g:289:4: 'RECEIVE'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getEventAccess().getRECEIVEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Alternatives"


    // $ANTLR start "rule__Network__Group__0"
    // InternalAmf.g:297:1: rule__Network__Group__0 : rule__Network__Group__0__Impl rule__Network__Group__1 ;
    public final void rule__Network__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:301:1: ( rule__Network__Group__0__Impl rule__Network__Group__1 )
            // InternalAmf.g:302:2: rule__Network__Group__0__Impl rule__Network__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Network__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__0"


    // $ANTLR start "rule__Network__Group__0__Impl"
    // InternalAmf.g:309:1: rule__Network__Group__0__Impl : ( 'Network' ) ;
    public final void rule__Network__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:313:1: ( ( 'Network' ) )
            // InternalAmf.g:314:1: ( 'Network' )
            {
            // InternalAmf.g:314:1: ( 'Network' )
            // InternalAmf.g:315:2: 'Network'
            {
             before(grammarAccess.getNetworkAccess().getNetworkKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getNetworkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__0__Impl"


    // $ANTLR start "rule__Network__Group__1"
    // InternalAmf.g:324:1: rule__Network__Group__1 : rule__Network__Group__1__Impl rule__Network__Group__2 ;
    public final void rule__Network__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:328:1: ( rule__Network__Group__1__Impl rule__Network__Group__2 )
            // InternalAmf.g:329:2: rule__Network__Group__1__Impl rule__Network__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Network__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__1"


    // $ANTLR start "rule__Network__Group__1__Impl"
    // InternalAmf.g:336:1: rule__Network__Group__1__Impl : ( ( rule__Network__NameAssignment_1 ) ) ;
    public final void rule__Network__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:340:1: ( ( ( rule__Network__NameAssignment_1 ) ) )
            // InternalAmf.g:341:1: ( ( rule__Network__NameAssignment_1 ) )
            {
            // InternalAmf.g:341:1: ( ( rule__Network__NameAssignment_1 ) )
            // InternalAmf.g:342:2: ( rule__Network__NameAssignment_1 )
            {
             before(grammarAccess.getNetworkAccess().getNameAssignment_1()); 
            // InternalAmf.g:343:2: ( rule__Network__NameAssignment_1 )
            // InternalAmf.g:343:3: rule__Network__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Network__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__1__Impl"


    // $ANTLR start "rule__Network__Group__2"
    // InternalAmf.g:351:1: rule__Network__Group__2 : rule__Network__Group__2__Impl rule__Network__Group__3 ;
    public final void rule__Network__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:355:1: ( rule__Network__Group__2__Impl rule__Network__Group__3 )
            // InternalAmf.g:356:2: rule__Network__Group__2__Impl rule__Network__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Network__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__2"


    // $ANTLR start "rule__Network__Group__2__Impl"
    // InternalAmf.g:363:1: rule__Network__Group__2__Impl : ( '{' ) ;
    public final void rule__Network__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:367:1: ( ( '{' ) )
            // InternalAmf.g:368:1: ( '{' )
            {
            // InternalAmf.g:368:1: ( '{' )
            // InternalAmf.g:369:2: '{'
            {
             before(grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__2__Impl"


    // $ANTLR start "rule__Network__Group__3"
    // InternalAmf.g:378:1: rule__Network__Group__3 : rule__Network__Group__3__Impl rule__Network__Group__4 ;
    public final void rule__Network__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:382:1: ( rule__Network__Group__3__Impl rule__Network__Group__4 )
            // InternalAmf.g:383:2: rule__Network__Group__3__Impl rule__Network__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Network__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__3"


    // $ANTLR start "rule__Network__Group__3__Impl"
    // InternalAmf.g:390:1: rule__Network__Group__3__Impl : ( ( rule__Network__Group_3__0 ) ) ;
    public final void rule__Network__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:394:1: ( ( ( rule__Network__Group_3__0 ) ) )
            // InternalAmf.g:395:1: ( ( rule__Network__Group_3__0 ) )
            {
            // InternalAmf.g:395:1: ( ( rule__Network__Group_3__0 ) )
            // InternalAmf.g:396:2: ( rule__Network__Group_3__0 )
            {
             before(grammarAccess.getNetworkAccess().getGroup_3()); 
            // InternalAmf.g:397:2: ( rule__Network__Group_3__0 )
            // InternalAmf.g:397:3: rule__Network__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__Network__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__3__Impl"


    // $ANTLR start "rule__Network__Group__4"
    // InternalAmf.g:405:1: rule__Network__Group__4 : rule__Network__Group__4__Impl rule__Network__Group__5 ;
    public final void rule__Network__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:409:1: ( rule__Network__Group__4__Impl rule__Network__Group__5 )
            // InternalAmf.g:410:2: rule__Network__Group__4__Impl rule__Network__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Network__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__4"


    // $ANTLR start "rule__Network__Group__4__Impl"
    // InternalAmf.g:417:1: rule__Network__Group__4__Impl : ( ( rule__Network__Group_4__0 ) ) ;
    public final void rule__Network__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:421:1: ( ( ( rule__Network__Group_4__0 ) ) )
            // InternalAmf.g:422:1: ( ( rule__Network__Group_4__0 ) )
            {
            // InternalAmf.g:422:1: ( ( rule__Network__Group_4__0 ) )
            // InternalAmf.g:423:2: ( rule__Network__Group_4__0 )
            {
             before(grammarAccess.getNetworkAccess().getGroup_4()); 
            // InternalAmf.g:424:2: ( rule__Network__Group_4__0 )
            // InternalAmf.g:424:3: rule__Network__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__Network__Group_4__0();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__4__Impl"


    // $ANTLR start "rule__Network__Group__5"
    // InternalAmf.g:432:1: rule__Network__Group__5 : rule__Network__Group__5__Impl ;
    public final void rule__Network__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:436:1: ( rule__Network__Group__5__Impl )
            // InternalAmf.g:437:2: rule__Network__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Network__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__5"


    // $ANTLR start "rule__Network__Group__5__Impl"
    // InternalAmf.g:443:1: rule__Network__Group__5__Impl : ( '}' ) ;
    public final void rule__Network__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:447:1: ( ( '}' ) )
            // InternalAmf.g:448:1: ( '}' )
            {
            // InternalAmf.g:448:1: ( '}' )
            // InternalAmf.g:449:2: '}'
            {
             before(grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group__5__Impl"


    // $ANTLR start "rule__Network__Group_3__0"
    // InternalAmf.g:459:1: rule__Network__Group_3__0 : rule__Network__Group_3__0__Impl rule__Network__Group_3__1 ;
    public final void rule__Network__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:463:1: ( rule__Network__Group_3__0__Impl rule__Network__Group_3__1 )
            // InternalAmf.g:464:2: rule__Network__Group_3__0__Impl rule__Network__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Network__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_3__0"


    // $ANTLR start "rule__Network__Group_3__0__Impl"
    // InternalAmf.g:471:1: rule__Network__Group_3__0__Impl : ( ( rule__Network__ChannelAssignment_3_0 ) ) ;
    public final void rule__Network__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:475:1: ( ( ( rule__Network__ChannelAssignment_3_0 ) ) )
            // InternalAmf.g:476:1: ( ( rule__Network__ChannelAssignment_3_0 ) )
            {
            // InternalAmf.g:476:1: ( ( rule__Network__ChannelAssignment_3_0 ) )
            // InternalAmf.g:477:2: ( rule__Network__ChannelAssignment_3_0 )
            {
             before(grammarAccess.getNetworkAccess().getChannelAssignment_3_0()); 
            // InternalAmf.g:478:2: ( rule__Network__ChannelAssignment_3_0 )
            // InternalAmf.g:478:3: rule__Network__ChannelAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__Network__ChannelAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getChannelAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_3__0__Impl"


    // $ANTLR start "rule__Network__Group_3__1"
    // InternalAmf.g:486:1: rule__Network__Group_3__1 : rule__Network__Group_3__1__Impl ;
    public final void rule__Network__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:490:1: ( rule__Network__Group_3__1__Impl )
            // InternalAmf.g:491:2: rule__Network__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Network__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_3__1"


    // $ANTLR start "rule__Network__Group_3__1__Impl"
    // InternalAmf.g:497:1: rule__Network__Group_3__1__Impl : ( ( rule__Network__ChannelAssignment_3_1 )* ) ;
    public final void rule__Network__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:501:1: ( ( ( rule__Network__ChannelAssignment_3_1 )* ) )
            // InternalAmf.g:502:1: ( ( rule__Network__ChannelAssignment_3_1 )* )
            {
            // InternalAmf.g:502:1: ( ( rule__Network__ChannelAssignment_3_1 )* )
            // InternalAmf.g:503:2: ( rule__Network__ChannelAssignment_3_1 )*
            {
             before(grammarAccess.getNetworkAccess().getChannelAssignment_3_1()); 
            // InternalAmf.g:504:2: ( rule__Network__ChannelAssignment_3_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=11 && LA4_0<=12)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAmf.g:504:3: rule__Network__ChannelAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Network__ChannelAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getNetworkAccess().getChannelAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_3__1__Impl"


    // $ANTLR start "rule__Network__Group_4__0"
    // InternalAmf.g:513:1: rule__Network__Group_4__0 : rule__Network__Group_4__0__Impl rule__Network__Group_4__1 ;
    public final void rule__Network__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:517:1: ( rule__Network__Group_4__0__Impl rule__Network__Group_4__1 )
            // InternalAmf.g:518:2: rule__Network__Group_4__0__Impl rule__Network__Group_4__1
            {
            pushFollow(FOLLOW_6);
            rule__Network__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Network__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_4__0"


    // $ANTLR start "rule__Network__Group_4__0__Impl"
    // InternalAmf.g:525:1: rule__Network__Group_4__0__Impl : ( ( rule__Network__StatemachineAssignment_4_0 ) ) ;
    public final void rule__Network__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:529:1: ( ( ( rule__Network__StatemachineAssignment_4_0 ) ) )
            // InternalAmf.g:530:1: ( ( rule__Network__StatemachineAssignment_4_0 ) )
            {
            // InternalAmf.g:530:1: ( ( rule__Network__StatemachineAssignment_4_0 ) )
            // InternalAmf.g:531:2: ( rule__Network__StatemachineAssignment_4_0 )
            {
             before(grammarAccess.getNetworkAccess().getStatemachineAssignment_4_0()); 
            // InternalAmf.g:532:2: ( rule__Network__StatemachineAssignment_4_0 )
            // InternalAmf.g:532:3: rule__Network__StatemachineAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__Network__StatemachineAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getNetworkAccess().getStatemachineAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_4__0__Impl"


    // $ANTLR start "rule__Network__Group_4__1"
    // InternalAmf.g:540:1: rule__Network__Group_4__1 : rule__Network__Group_4__1__Impl ;
    public final void rule__Network__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:544:1: ( rule__Network__Group_4__1__Impl )
            // InternalAmf.g:545:2: rule__Network__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Network__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_4__1"


    // $ANTLR start "rule__Network__Group_4__1__Impl"
    // InternalAmf.g:551:1: rule__Network__Group_4__1__Impl : ( ( rule__Network__StatemachineAssignment_4_1 )* ) ;
    public final void rule__Network__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:555:1: ( ( ( rule__Network__StatemachineAssignment_4_1 )* ) )
            // InternalAmf.g:556:1: ( ( rule__Network__StatemachineAssignment_4_1 )* )
            {
            // InternalAmf.g:556:1: ( ( rule__Network__StatemachineAssignment_4_1 )* )
            // InternalAmf.g:557:2: ( rule__Network__StatemachineAssignment_4_1 )*
            {
             before(grammarAccess.getNetworkAccess().getStatemachineAssignment_4_1()); 
            // InternalAmf.g:558:2: ( rule__Network__StatemachineAssignment_4_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAmf.g:558:3: rule__Network__StatemachineAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Network__StatemachineAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getNetworkAccess().getStatemachineAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__Group_4__1__Impl"


    // $ANTLR start "rule__Statemachine__Group__0"
    // InternalAmf.g:567:1: rule__Statemachine__Group__0 : rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1 ;
    public final void rule__Statemachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:571:1: ( rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1 )
            // InternalAmf.g:572:2: rule__Statemachine__Group__0__Impl rule__Statemachine__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Statemachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statemachine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__0"


    // $ANTLR start "rule__Statemachine__Group__0__Impl"
    // InternalAmf.g:579:1: rule__Statemachine__Group__0__Impl : ( () ) ;
    public final void rule__Statemachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:583:1: ( ( () ) )
            // InternalAmf.g:584:1: ( () )
            {
            // InternalAmf.g:584:1: ( () )
            // InternalAmf.g:585:2: ()
            {
             before(grammarAccess.getStatemachineAccess().getStatemachineAction_0()); 
            // InternalAmf.g:586:2: ()
            // InternalAmf.g:586:3: 
            {
            }

             after(grammarAccess.getStatemachineAccess().getStatemachineAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__0__Impl"


    // $ANTLR start "rule__Statemachine__Group__1"
    // InternalAmf.g:594:1: rule__Statemachine__Group__1 : rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2 ;
    public final void rule__Statemachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:598:1: ( rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2 )
            // InternalAmf.g:599:2: rule__Statemachine__Group__1__Impl rule__Statemachine__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Statemachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statemachine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__1"


    // $ANTLR start "rule__Statemachine__Group__1__Impl"
    // InternalAmf.g:606:1: rule__Statemachine__Group__1__Impl : ( 'Statemachine' ) ;
    public final void rule__Statemachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:610:1: ( ( 'Statemachine' ) )
            // InternalAmf.g:611:1: ( 'Statemachine' )
            {
            // InternalAmf.g:611:1: ( 'Statemachine' )
            // InternalAmf.g:612:2: 'Statemachine'
            {
             before(grammarAccess.getStatemachineAccess().getStatemachineKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStatemachineAccess().getStatemachineKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__1__Impl"


    // $ANTLR start "rule__Statemachine__Group__2"
    // InternalAmf.g:621:1: rule__Statemachine__Group__2 : rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3 ;
    public final void rule__Statemachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:625:1: ( rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3 )
            // InternalAmf.g:626:2: rule__Statemachine__Group__2__Impl rule__Statemachine__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Statemachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statemachine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__2"


    // $ANTLR start "rule__Statemachine__Group__2__Impl"
    // InternalAmf.g:633:1: rule__Statemachine__Group__2__Impl : ( ( rule__Statemachine__NameAssignment_2 ) ) ;
    public final void rule__Statemachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:637:1: ( ( ( rule__Statemachine__NameAssignment_2 ) ) )
            // InternalAmf.g:638:1: ( ( rule__Statemachine__NameAssignment_2 ) )
            {
            // InternalAmf.g:638:1: ( ( rule__Statemachine__NameAssignment_2 ) )
            // InternalAmf.g:639:2: ( rule__Statemachine__NameAssignment_2 )
            {
             before(grammarAccess.getStatemachineAccess().getNameAssignment_2()); 
            // InternalAmf.g:640:2: ( rule__Statemachine__NameAssignment_2 )
            // InternalAmf.g:640:3: rule__Statemachine__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Statemachine__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__2__Impl"


    // $ANTLR start "rule__Statemachine__Group__3"
    // InternalAmf.g:648:1: rule__Statemachine__Group__3 : rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4 ;
    public final void rule__Statemachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:652:1: ( rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4 )
            // InternalAmf.g:653:2: rule__Statemachine__Group__3__Impl rule__Statemachine__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Statemachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statemachine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__3"


    // $ANTLR start "rule__Statemachine__Group__3__Impl"
    // InternalAmf.g:660:1: rule__Statemachine__Group__3__Impl : ( '{' ) ;
    public final void rule__Statemachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:664:1: ( ( '{' ) )
            // InternalAmf.g:665:1: ( '{' )
            {
            // InternalAmf.g:665:1: ( '{' )
            // InternalAmf.g:666:2: '{'
            {
             before(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__3__Impl"


    // $ANTLR start "rule__Statemachine__Group__4"
    // InternalAmf.g:675:1: rule__Statemachine__Group__4 : rule__Statemachine__Group__4__Impl rule__Statemachine__Group__5 ;
    public final void rule__Statemachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:679:1: ( rule__Statemachine__Group__4__Impl rule__Statemachine__Group__5 )
            // InternalAmf.g:680:2: rule__Statemachine__Group__4__Impl rule__Statemachine__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Statemachine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statemachine__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__4"


    // $ANTLR start "rule__Statemachine__Group__4__Impl"
    // InternalAmf.g:687:1: rule__Statemachine__Group__4__Impl : ( 'init' ) ;
    public final void rule__Statemachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:691:1: ( ( 'init' ) )
            // InternalAmf.g:692:1: ( 'init' )
            {
            // InternalAmf.g:692:1: ( 'init' )
            // InternalAmf.g:693:2: 'init'
            {
             before(grammarAccess.getStatemachineAccess().getInitKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStatemachineAccess().getInitKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__4__Impl"


    // $ANTLR start "rule__Statemachine__Group__5"
    // InternalAmf.g:702:1: rule__Statemachine__Group__5 : rule__Statemachine__Group__5__Impl rule__Statemachine__Group__6 ;
    public final void rule__Statemachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:706:1: ( rule__Statemachine__Group__5__Impl rule__Statemachine__Group__6 )
            // InternalAmf.g:707:2: rule__Statemachine__Group__5__Impl rule__Statemachine__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Statemachine__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statemachine__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__5"


    // $ANTLR start "rule__Statemachine__Group__5__Impl"
    // InternalAmf.g:714:1: rule__Statemachine__Group__5__Impl : ( ( rule__Statemachine__InitialstateAssignment_5 ) ) ;
    public final void rule__Statemachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:718:1: ( ( ( rule__Statemachine__InitialstateAssignment_5 ) ) )
            // InternalAmf.g:719:1: ( ( rule__Statemachine__InitialstateAssignment_5 ) )
            {
            // InternalAmf.g:719:1: ( ( rule__Statemachine__InitialstateAssignment_5 ) )
            // InternalAmf.g:720:2: ( rule__Statemachine__InitialstateAssignment_5 )
            {
             before(grammarAccess.getStatemachineAccess().getInitialstateAssignment_5()); 
            // InternalAmf.g:721:2: ( rule__Statemachine__InitialstateAssignment_5 )
            // InternalAmf.g:721:3: rule__Statemachine__InitialstateAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Statemachine__InitialstateAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getInitialstateAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__5__Impl"


    // $ANTLR start "rule__Statemachine__Group__6"
    // InternalAmf.g:729:1: rule__Statemachine__Group__6 : rule__Statemachine__Group__6__Impl rule__Statemachine__Group__7 ;
    public final void rule__Statemachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:733:1: ( rule__Statemachine__Group__6__Impl rule__Statemachine__Group__7 )
            // InternalAmf.g:734:2: rule__Statemachine__Group__6__Impl rule__Statemachine__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Statemachine__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statemachine__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__6"


    // $ANTLR start "rule__Statemachine__Group__6__Impl"
    // InternalAmf.g:741:1: rule__Statemachine__Group__6__Impl : ( ( rule__Statemachine__Group_6__0 )? ) ;
    public final void rule__Statemachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:745:1: ( ( ( rule__Statemachine__Group_6__0 )? ) )
            // InternalAmf.g:746:1: ( ( rule__Statemachine__Group_6__0 )? )
            {
            // InternalAmf.g:746:1: ( ( rule__Statemachine__Group_6__0 )? )
            // InternalAmf.g:747:2: ( rule__Statemachine__Group_6__0 )?
            {
             before(grammarAccess.getStatemachineAccess().getGroup_6()); 
            // InternalAmf.g:748:2: ( rule__Statemachine__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalAmf.g:748:3: rule__Statemachine__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Statemachine__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatemachineAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__6__Impl"


    // $ANTLR start "rule__Statemachine__Group__7"
    // InternalAmf.g:756:1: rule__Statemachine__Group__7 : rule__Statemachine__Group__7__Impl rule__Statemachine__Group__8 ;
    public final void rule__Statemachine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:760:1: ( rule__Statemachine__Group__7__Impl rule__Statemachine__Group__8 )
            // InternalAmf.g:761:2: rule__Statemachine__Group__7__Impl rule__Statemachine__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Statemachine__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statemachine__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__7"


    // $ANTLR start "rule__Statemachine__Group__7__Impl"
    // InternalAmf.g:768:1: rule__Statemachine__Group__7__Impl : ( ( rule__Statemachine__Group_7__0 ) ) ;
    public final void rule__Statemachine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:772:1: ( ( ( rule__Statemachine__Group_7__0 ) ) )
            // InternalAmf.g:773:1: ( ( rule__Statemachine__Group_7__0 ) )
            {
            // InternalAmf.g:773:1: ( ( rule__Statemachine__Group_7__0 ) )
            // InternalAmf.g:774:2: ( rule__Statemachine__Group_7__0 )
            {
             before(grammarAccess.getStatemachineAccess().getGroup_7()); 
            // InternalAmf.g:775:2: ( rule__Statemachine__Group_7__0 )
            // InternalAmf.g:775:3: rule__Statemachine__Group_7__0
            {
            pushFollow(FOLLOW_2);
            rule__Statemachine__Group_7__0();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__7__Impl"


    // $ANTLR start "rule__Statemachine__Group__8"
    // InternalAmf.g:783:1: rule__Statemachine__Group__8 : rule__Statemachine__Group__8__Impl ;
    public final void rule__Statemachine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:787:1: ( rule__Statemachine__Group__8__Impl )
            // InternalAmf.g:788:2: rule__Statemachine__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statemachine__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__8"


    // $ANTLR start "rule__Statemachine__Group__8__Impl"
    // InternalAmf.g:794:1: rule__Statemachine__Group__8__Impl : ( '}' ) ;
    public final void rule__Statemachine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:798:1: ( ( '}' ) )
            // InternalAmf.g:799:1: ( '}' )
            {
            // InternalAmf.g:799:1: ( '}' )
            // InternalAmf.g:800:2: '}'
            {
             before(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group__8__Impl"


    // $ANTLR start "rule__Statemachine__Group_6__0"
    // InternalAmf.g:810:1: rule__Statemachine__Group_6__0 : rule__Statemachine__Group_6__0__Impl rule__Statemachine__Group_6__1 ;
    public final void rule__Statemachine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:814:1: ( rule__Statemachine__Group_6__0__Impl rule__Statemachine__Group_6__1 )
            // InternalAmf.g:815:2: rule__Statemachine__Group_6__0__Impl rule__Statemachine__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__Statemachine__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statemachine__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6__0"


    // $ANTLR start "rule__Statemachine__Group_6__0__Impl"
    // InternalAmf.g:822:1: rule__Statemachine__Group_6__0__Impl : ( ( rule__Statemachine__StateAssignment_6_0 ) ) ;
    public final void rule__Statemachine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:826:1: ( ( ( rule__Statemachine__StateAssignment_6_0 ) ) )
            // InternalAmf.g:827:1: ( ( rule__Statemachine__StateAssignment_6_0 ) )
            {
            // InternalAmf.g:827:1: ( ( rule__Statemachine__StateAssignment_6_0 ) )
            // InternalAmf.g:828:2: ( rule__Statemachine__StateAssignment_6_0 )
            {
             before(grammarAccess.getStatemachineAccess().getStateAssignment_6_0()); 
            // InternalAmf.g:829:2: ( rule__Statemachine__StateAssignment_6_0 )
            // InternalAmf.g:829:3: rule__Statemachine__StateAssignment_6_0
            {
            pushFollow(FOLLOW_2);
            rule__Statemachine__StateAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getStateAssignment_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_6__1"
    // InternalAmf.g:837:1: rule__Statemachine__Group_6__1 : rule__Statemachine__Group_6__1__Impl ;
    public final void rule__Statemachine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:841:1: ( rule__Statemachine__Group_6__1__Impl )
            // InternalAmf.g:842:2: rule__Statemachine__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statemachine__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6__1"


    // $ANTLR start "rule__Statemachine__Group_6__1__Impl"
    // InternalAmf.g:848:1: rule__Statemachine__Group_6__1__Impl : ( ( rule__Statemachine__StateAssignment_6_1 )* ) ;
    public final void rule__Statemachine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:852:1: ( ( ( rule__Statemachine__StateAssignment_6_1 )* ) )
            // InternalAmf.g:853:1: ( ( rule__Statemachine__StateAssignment_6_1 )* )
            {
            // InternalAmf.g:853:1: ( ( rule__Statemachine__StateAssignment_6_1 )* )
            // InternalAmf.g:854:2: ( rule__Statemachine__StateAssignment_6_1 )*
            {
             before(grammarAccess.getStatemachineAccess().getStateAssignment_6_1()); 
            // InternalAmf.g:855:2: ( rule__Statemachine__StateAssignment_6_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==25) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalAmf.g:855:3: rule__Statemachine__StateAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Statemachine__StateAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getStatemachineAccess().getStateAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_6__1__Impl"


    // $ANTLR start "rule__Statemachine__Group_7__0"
    // InternalAmf.g:864:1: rule__Statemachine__Group_7__0 : rule__Statemachine__Group_7__0__Impl rule__Statemachine__Group_7__1 ;
    public final void rule__Statemachine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:868:1: ( rule__Statemachine__Group_7__0__Impl rule__Statemachine__Group_7__1 )
            // InternalAmf.g:869:2: rule__Statemachine__Group_7__0__Impl rule__Statemachine__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__Statemachine__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Statemachine__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7__0"


    // $ANTLR start "rule__Statemachine__Group_7__0__Impl"
    // InternalAmf.g:876:1: rule__Statemachine__Group_7__0__Impl : ( ( rule__Statemachine__TransitionAssignment_7_0 ) ) ;
    public final void rule__Statemachine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:880:1: ( ( ( rule__Statemachine__TransitionAssignment_7_0 ) ) )
            // InternalAmf.g:881:1: ( ( rule__Statemachine__TransitionAssignment_7_0 ) )
            {
            // InternalAmf.g:881:1: ( ( rule__Statemachine__TransitionAssignment_7_0 ) )
            // InternalAmf.g:882:2: ( rule__Statemachine__TransitionAssignment_7_0 )
            {
             before(grammarAccess.getStatemachineAccess().getTransitionAssignment_7_0()); 
            // InternalAmf.g:883:2: ( rule__Statemachine__TransitionAssignment_7_0 )
            // InternalAmf.g:883:3: rule__Statemachine__TransitionAssignment_7_0
            {
            pushFollow(FOLLOW_2);
            rule__Statemachine__TransitionAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getStatemachineAccess().getTransitionAssignment_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7__0__Impl"


    // $ANTLR start "rule__Statemachine__Group_7__1"
    // InternalAmf.g:891:1: rule__Statemachine__Group_7__1 : rule__Statemachine__Group_7__1__Impl ;
    public final void rule__Statemachine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:895:1: ( rule__Statemachine__Group_7__1__Impl )
            // InternalAmf.g:896:2: rule__Statemachine__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Statemachine__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7__1"


    // $ANTLR start "rule__Statemachine__Group_7__1__Impl"
    // InternalAmf.g:902:1: rule__Statemachine__Group_7__1__Impl : ( ( rule__Statemachine__TransitionAssignment_7_1 )* ) ;
    public final void rule__Statemachine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:906:1: ( ( ( rule__Statemachine__TransitionAssignment_7_1 )* ) )
            // InternalAmf.g:907:1: ( ( rule__Statemachine__TransitionAssignment_7_1 )* )
            {
            // InternalAmf.g:907:1: ( ( rule__Statemachine__TransitionAssignment_7_1 )* )
            // InternalAmf.g:908:2: ( rule__Statemachine__TransitionAssignment_7_1 )*
            {
             before(grammarAccess.getStatemachineAccess().getTransitionAssignment_7_1()); 
            // InternalAmf.g:909:2: ( rule__Statemachine__TransitionAssignment_7_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalAmf.g:909:3: rule__Statemachine__TransitionAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Statemachine__TransitionAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getStatemachineAccess().getTransitionAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__Group_7__1__Impl"


    // $ANTLR start "rule__Channel__Group__0"
    // InternalAmf.g:918:1: rule__Channel__Group__0 : rule__Channel__Group__0__Impl rule__Channel__Group__1 ;
    public final void rule__Channel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:922:1: ( rule__Channel__Group__0__Impl rule__Channel__Group__1 )
            // InternalAmf.g:923:2: rule__Channel__Group__0__Impl rule__Channel__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Channel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__0"


    // $ANTLR start "rule__Channel__Group__0__Impl"
    // InternalAmf.g:930:1: rule__Channel__Group__0__Impl : ( () ) ;
    public final void rule__Channel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:934:1: ( ( () ) )
            // InternalAmf.g:935:1: ( () )
            {
            // InternalAmf.g:935:1: ( () )
            // InternalAmf.g:936:2: ()
            {
             before(grammarAccess.getChannelAccess().getChannelAction_0()); 
            // InternalAmf.g:937:2: ()
            // InternalAmf.g:937:3: 
            {
            }

             after(grammarAccess.getChannelAccess().getChannelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__0__Impl"


    // $ANTLR start "rule__Channel__Group__1"
    // InternalAmf.g:945:1: rule__Channel__Group__1 : rule__Channel__Group__1__Impl rule__Channel__Group__2 ;
    public final void rule__Channel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:949:1: ( rule__Channel__Group__1__Impl rule__Channel__Group__2 )
            // InternalAmf.g:950:2: rule__Channel__Group__1__Impl rule__Channel__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Channel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__1"


    // $ANTLR start "rule__Channel__Group__1__Impl"
    // InternalAmf.g:957:1: rule__Channel__Group__1__Impl : ( ( rule__Channel__TypeAssignment_1 ) ) ;
    public final void rule__Channel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:961:1: ( ( ( rule__Channel__TypeAssignment_1 ) ) )
            // InternalAmf.g:962:1: ( ( rule__Channel__TypeAssignment_1 ) )
            {
            // InternalAmf.g:962:1: ( ( rule__Channel__TypeAssignment_1 ) )
            // InternalAmf.g:963:2: ( rule__Channel__TypeAssignment_1 )
            {
             before(grammarAccess.getChannelAccess().getTypeAssignment_1()); 
            // InternalAmf.g:964:2: ( rule__Channel__TypeAssignment_1 )
            // InternalAmf.g:964:3: rule__Channel__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Channel__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChannelAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__1__Impl"


    // $ANTLR start "rule__Channel__Group__2"
    // InternalAmf.g:972:1: rule__Channel__Group__2 : rule__Channel__Group__2__Impl rule__Channel__Group__3 ;
    public final void rule__Channel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:976:1: ( rule__Channel__Group__2__Impl rule__Channel__Group__3 )
            // InternalAmf.g:977:2: rule__Channel__Group__2__Impl rule__Channel__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Channel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Channel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__2"


    // $ANTLR start "rule__Channel__Group__2__Impl"
    // InternalAmf.g:984:1: rule__Channel__Group__2__Impl : ( 'Channel' ) ;
    public final void rule__Channel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:988:1: ( ( 'Channel' ) )
            // InternalAmf.g:989:1: ( 'Channel' )
            {
            // InternalAmf.g:989:1: ( 'Channel' )
            // InternalAmf.g:990:2: 'Channel'
            {
             before(grammarAccess.getChannelAccess().getChannelKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getChannelAccess().getChannelKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__2__Impl"


    // $ANTLR start "rule__Channel__Group__3"
    // InternalAmf.g:999:1: rule__Channel__Group__3 : rule__Channel__Group__3__Impl ;
    public final void rule__Channel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1003:1: ( rule__Channel__Group__3__Impl )
            // InternalAmf.g:1004:2: rule__Channel__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Channel__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__3"


    // $ANTLR start "rule__Channel__Group__3__Impl"
    // InternalAmf.g:1010:1: rule__Channel__Group__3__Impl : ( ( rule__Channel__NameAssignment_3 ) ) ;
    public final void rule__Channel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1014:1: ( ( ( rule__Channel__NameAssignment_3 ) ) )
            // InternalAmf.g:1015:1: ( ( rule__Channel__NameAssignment_3 ) )
            {
            // InternalAmf.g:1015:1: ( ( rule__Channel__NameAssignment_3 ) )
            // InternalAmf.g:1016:2: ( rule__Channel__NameAssignment_3 )
            {
             before(grammarAccess.getChannelAccess().getNameAssignment_3()); 
            // InternalAmf.g:1017:2: ( rule__Channel__NameAssignment_3 )
            // InternalAmf.g:1017:3: rule__Channel__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Channel__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getChannelAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // InternalAmf.g:1026:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1030:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // InternalAmf.g:1031:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // InternalAmf.g:1038:1: rule__Transition__Group__0__Impl : ( () ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1042:1: ( ( () ) )
            // InternalAmf.g:1043:1: ( () )
            {
            // InternalAmf.g:1043:1: ( () )
            // InternalAmf.g:1044:2: ()
            {
             before(grammarAccess.getTransitionAccess().getTransitionAction_0()); 
            // InternalAmf.g:1045:2: ()
            // InternalAmf.g:1045:3: 
            {
            }

             after(grammarAccess.getTransitionAccess().getTransitionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // InternalAmf.g:1053:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1057:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // InternalAmf.g:1058:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // InternalAmf.g:1065:1: rule__Transition__Group__1__Impl : ( 'Transition' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1069:1: ( ( 'Transition' ) )
            // InternalAmf.g:1070:1: ( 'Transition' )
            {
            // InternalAmf.g:1070:1: ( 'Transition' )
            // InternalAmf.g:1071:2: 'Transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // InternalAmf.g:1080:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1084:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // InternalAmf.g:1085:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // InternalAmf.g:1092:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__SourceAssignment_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1096:1: ( ( ( rule__Transition__SourceAssignment_2 ) ) )
            // InternalAmf.g:1097:1: ( ( rule__Transition__SourceAssignment_2 ) )
            {
            // InternalAmf.g:1097:1: ( ( rule__Transition__SourceAssignment_2 ) )
            // InternalAmf.g:1098:2: ( rule__Transition__SourceAssignment_2 )
            {
             before(grammarAccess.getTransitionAccess().getSourceAssignment_2()); 
            // InternalAmf.g:1099:2: ( rule__Transition__SourceAssignment_2 )
            // InternalAmf.g:1099:3: rule__Transition__SourceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Transition__SourceAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // InternalAmf.g:1107:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1111:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // InternalAmf.g:1112:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // InternalAmf.g:1119:1: rule__Transition__Group__3__Impl : ( '->' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1123:1: ( ( '->' ) )
            // InternalAmf.g:1124:1: ( '->' )
            {
            // InternalAmf.g:1124:1: ( '->' )
            // InternalAmf.g:1125:2: '->'
            {
             before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // InternalAmf.g:1134:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1138:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // InternalAmf.g:1139:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // InternalAmf.g:1146:1: rule__Transition__Group__4__Impl : ( '(' ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1150:1: ( ( '(' ) )
            // InternalAmf.g:1151:1: ( '(' )
            {
            // InternalAmf.g:1151:1: ( '(' )
            // InternalAmf.g:1152:2: '('
            {
             before(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // InternalAmf.g:1161:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1165:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // InternalAmf.g:1166:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Transition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // InternalAmf.g:1173:1: rule__Transition__Group__5__Impl : ( ( rule__Transition__ChannelAssignment_5 ) ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1177:1: ( ( ( rule__Transition__ChannelAssignment_5 ) ) )
            // InternalAmf.g:1178:1: ( ( rule__Transition__ChannelAssignment_5 ) )
            {
            // InternalAmf.g:1178:1: ( ( rule__Transition__ChannelAssignment_5 ) )
            // InternalAmf.g:1179:2: ( rule__Transition__ChannelAssignment_5 )
            {
             before(grammarAccess.getTransitionAccess().getChannelAssignment_5()); 
            // InternalAmf.g:1180:2: ( rule__Transition__ChannelAssignment_5 )
            // InternalAmf.g:1180:3: rule__Transition__ChannelAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Transition__ChannelAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getChannelAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group__6"
    // InternalAmf.g:1188:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl rule__Transition__Group__7 ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1192:1: ( rule__Transition__Group__6__Impl rule__Transition__Group__7 )
            // InternalAmf.g:1193:2: rule__Transition__Group__6__Impl rule__Transition__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Transition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6"


    // $ANTLR start "rule__Transition__Group__6__Impl"
    // InternalAmf.g:1200:1: rule__Transition__Group__6__Impl : ( ')' ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1204:1: ( ( ')' ) )
            // InternalAmf.g:1205:1: ( ')' )
            {
            // InternalAmf.g:1205:1: ( ')' )
            // InternalAmf.g:1206:2: ')'
            {
             before(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6__Impl"


    // $ANTLR start "rule__Transition__Group__7"
    // InternalAmf.g:1215:1: rule__Transition__Group__7 : rule__Transition__Group__7__Impl rule__Transition__Group__8 ;
    public final void rule__Transition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1219:1: ( rule__Transition__Group__7__Impl rule__Transition__Group__8 )
            // InternalAmf.g:1220:2: rule__Transition__Group__7__Impl rule__Transition__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Transition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__7"


    // $ANTLR start "rule__Transition__Group__7__Impl"
    // InternalAmf.g:1227:1: rule__Transition__Group__7__Impl : ( ( rule__Transition__TargetAssignment_7 ) ) ;
    public final void rule__Transition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1231:1: ( ( ( rule__Transition__TargetAssignment_7 ) ) )
            // InternalAmf.g:1232:1: ( ( rule__Transition__TargetAssignment_7 ) )
            {
            // InternalAmf.g:1232:1: ( ( rule__Transition__TargetAssignment_7 ) )
            // InternalAmf.g:1233:2: ( rule__Transition__TargetAssignment_7 )
            {
             before(grammarAccess.getTransitionAccess().getTargetAssignment_7()); 
            // InternalAmf.g:1234:2: ( rule__Transition__TargetAssignment_7 )
            // InternalAmf.g:1234:3: rule__Transition__TargetAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Transition__TargetAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__7__Impl"


    // $ANTLR start "rule__Transition__Group__8"
    // InternalAmf.g:1242:1: rule__Transition__Group__8 : rule__Transition__Group__8__Impl ;
    public final void rule__Transition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1246:1: ( rule__Transition__Group__8__Impl )
            // InternalAmf.g:1247:2: rule__Transition__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transition__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__8"


    // $ANTLR start "rule__Transition__Group__8__Impl"
    // InternalAmf.g:1253:1: rule__Transition__Group__8__Impl : ( ( rule__Transition__EventAssignment_8 ) ) ;
    public final void rule__Transition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1257:1: ( ( ( rule__Transition__EventAssignment_8 ) ) )
            // InternalAmf.g:1258:1: ( ( rule__Transition__EventAssignment_8 ) )
            {
            // InternalAmf.g:1258:1: ( ( rule__Transition__EventAssignment_8 ) )
            // InternalAmf.g:1259:2: ( rule__Transition__EventAssignment_8 )
            {
             before(grammarAccess.getTransitionAccess().getEventAssignment_8()); 
            // InternalAmf.g:1260:2: ( rule__Transition__EventAssignment_8 )
            // InternalAmf.g:1260:3: rule__Transition__EventAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Transition__EventAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getEventAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__8__Impl"


    // $ANTLR start "rule__State__Group__0"
    // InternalAmf.g:1269:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1273:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalAmf.g:1274:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalAmf.g:1281:1: rule__State__Group__0__Impl : ( () ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1285:1: ( ( () ) )
            // InternalAmf.g:1286:1: ( () )
            {
            // InternalAmf.g:1286:1: ( () )
            // InternalAmf.g:1287:2: ()
            {
             before(grammarAccess.getStateAccess().getStateAction_0()); 
            // InternalAmf.g:1288:2: ()
            // InternalAmf.g:1288:3: 
            {
            }

             after(grammarAccess.getStateAccess().getStateAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalAmf.g:1296:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1300:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalAmf.g:1301:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalAmf.g:1308:1: rule__State__Group__1__Impl : ( 'State' ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1312:1: ( ( 'State' ) )
            // InternalAmf.g:1313:1: ( 'State' )
            {
            // InternalAmf.g:1313:1: ( 'State' )
            // InternalAmf.g:1314:2: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getStateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalAmf.g:1323:1: rule__State__Group__2 : rule__State__Group__2__Impl ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1327:1: ( rule__State__Group__2__Impl )
            // InternalAmf.g:1328:2: rule__State__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalAmf.g:1334:1: rule__State__Group__2__Impl : ( ( rule__State__NameAssignment_2 ) ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1338:1: ( ( ( rule__State__NameAssignment_2 ) ) )
            // InternalAmf.g:1339:1: ( ( rule__State__NameAssignment_2 ) )
            {
            // InternalAmf.g:1339:1: ( ( rule__State__NameAssignment_2 ) )
            // InternalAmf.g:1340:2: ( rule__State__NameAssignment_2 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_2()); 
            // InternalAmf.g:1341:2: ( rule__State__NameAssignment_2 )
            // InternalAmf.g:1341:3: rule__State__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__Network__NameAssignment_1"
    // InternalAmf.g:1350:1: rule__Network__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Network__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1354:1: ( ( ruleEString ) )
            // InternalAmf.g:1355:2: ( ruleEString )
            {
            // InternalAmf.g:1355:2: ( ruleEString )
            // InternalAmf.g:1356:3: ruleEString
            {
             before(grammarAccess.getNetworkAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNetworkAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__NameAssignment_1"


    // $ANTLR start "rule__Network__ChannelAssignment_3_0"
    // InternalAmf.g:1365:1: rule__Network__ChannelAssignment_3_0 : ( ruleChannel ) ;
    public final void rule__Network__ChannelAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1369:1: ( ( ruleChannel ) )
            // InternalAmf.g:1370:2: ( ruleChannel )
            {
            // InternalAmf.g:1370:2: ( ruleChannel )
            // InternalAmf.g:1371:3: ruleChannel
            {
             before(grammarAccess.getNetworkAccess().getChannelChannelParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleChannel();

            state._fsp--;

             after(grammarAccess.getNetworkAccess().getChannelChannelParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__ChannelAssignment_3_0"


    // $ANTLR start "rule__Network__ChannelAssignment_3_1"
    // InternalAmf.g:1380:1: rule__Network__ChannelAssignment_3_1 : ( ruleChannel ) ;
    public final void rule__Network__ChannelAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1384:1: ( ( ruleChannel ) )
            // InternalAmf.g:1385:2: ( ruleChannel )
            {
            // InternalAmf.g:1385:2: ( ruleChannel )
            // InternalAmf.g:1386:3: ruleChannel
            {
             before(grammarAccess.getNetworkAccess().getChannelChannelParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleChannel();

            state._fsp--;

             after(grammarAccess.getNetworkAccess().getChannelChannelParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__ChannelAssignment_3_1"


    // $ANTLR start "rule__Network__StatemachineAssignment_4_0"
    // InternalAmf.g:1395:1: rule__Network__StatemachineAssignment_4_0 : ( ruleStatemachine ) ;
    public final void rule__Network__StatemachineAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1399:1: ( ( ruleStatemachine ) )
            // InternalAmf.g:1400:2: ( ruleStatemachine )
            {
            // InternalAmf.g:1400:2: ( ruleStatemachine )
            // InternalAmf.g:1401:3: ruleStatemachine
            {
             before(grammarAccess.getNetworkAccess().getStatemachineStatemachineParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStatemachine();

            state._fsp--;

             after(grammarAccess.getNetworkAccess().getStatemachineStatemachineParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__StatemachineAssignment_4_0"


    // $ANTLR start "rule__Network__StatemachineAssignment_4_1"
    // InternalAmf.g:1410:1: rule__Network__StatemachineAssignment_4_1 : ( ruleStatemachine ) ;
    public final void rule__Network__StatemachineAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1414:1: ( ( ruleStatemachine ) )
            // InternalAmf.g:1415:2: ( ruleStatemachine )
            {
            // InternalAmf.g:1415:2: ( ruleStatemachine )
            // InternalAmf.g:1416:3: ruleStatemachine
            {
             before(grammarAccess.getNetworkAccess().getStatemachineStatemachineParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatemachine();

            state._fsp--;

             after(grammarAccess.getNetworkAccess().getStatemachineStatemachineParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Network__StatemachineAssignment_4_1"


    // $ANTLR start "rule__Statemachine__NameAssignment_2"
    // InternalAmf.g:1425:1: rule__Statemachine__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Statemachine__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1429:1: ( ( ruleEString ) )
            // InternalAmf.g:1430:2: ( ruleEString )
            {
            // InternalAmf.g:1430:2: ( ruleEString )
            // InternalAmf.g:1431:3: ruleEString
            {
             before(grammarAccess.getStatemachineAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__NameAssignment_2"


    // $ANTLR start "rule__Statemachine__InitialstateAssignment_5"
    // InternalAmf.g:1440:1: rule__Statemachine__InitialstateAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Statemachine__InitialstateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1444:1: ( ( ( ruleEString ) ) )
            // InternalAmf.g:1445:2: ( ( ruleEString ) )
            {
            // InternalAmf.g:1445:2: ( ( ruleEString ) )
            // InternalAmf.g:1446:3: ( ruleEString )
            {
             before(grammarAccess.getStatemachineAccess().getInitialstateStateCrossReference_5_0()); 
            // InternalAmf.g:1447:3: ( ruleEString )
            // InternalAmf.g:1448:4: ruleEString
            {
             before(grammarAccess.getStatemachineAccess().getInitialstateStateEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getInitialstateStateEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getStatemachineAccess().getInitialstateStateCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__InitialstateAssignment_5"


    // $ANTLR start "rule__Statemachine__StateAssignment_6_0"
    // InternalAmf.g:1459:1: rule__Statemachine__StateAssignment_6_0 : ( ruleState ) ;
    public final void rule__Statemachine__StateAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1463:1: ( ( ruleState ) )
            // InternalAmf.g:1464:2: ( ruleState )
            {
            // InternalAmf.g:1464:2: ( ruleState )
            // InternalAmf.g:1465:3: ruleState
            {
             before(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__StateAssignment_6_0"


    // $ANTLR start "rule__Statemachine__StateAssignment_6_1"
    // InternalAmf.g:1474:1: rule__Statemachine__StateAssignment_6_1 : ( ruleState ) ;
    public final void rule__Statemachine__StateAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1478:1: ( ( ruleState ) )
            // InternalAmf.g:1479:2: ( ruleState )
            {
            // InternalAmf.g:1479:2: ( ruleState )
            // InternalAmf.g:1480:3: ruleState
            {
             before(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__StateAssignment_6_1"


    // $ANTLR start "rule__Statemachine__TransitionAssignment_7_0"
    // InternalAmf.g:1489:1: rule__Statemachine__TransitionAssignment_7_0 : ( ruleTransition ) ;
    public final void rule__Statemachine__TransitionAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1493:1: ( ( ruleTransition ) )
            // InternalAmf.g:1494:2: ( ruleTransition )
            {
            // InternalAmf.g:1494:2: ( ruleTransition )
            // InternalAmf.g:1495:3: ruleTransition
            {
             before(grammarAccess.getStatemachineAccess().getTransitionTransitionParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getTransitionTransitionParserRuleCall_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__TransitionAssignment_7_0"


    // $ANTLR start "rule__Statemachine__TransitionAssignment_7_1"
    // InternalAmf.g:1504:1: rule__Statemachine__TransitionAssignment_7_1 : ( ruleTransition ) ;
    public final void rule__Statemachine__TransitionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1508:1: ( ( ruleTransition ) )
            // InternalAmf.g:1509:2: ( ruleTransition )
            {
            // InternalAmf.g:1509:2: ( ruleTransition )
            // InternalAmf.g:1510:3: ruleTransition
            {
             before(grammarAccess.getStatemachineAccess().getTransitionTransitionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStatemachineAccess().getTransitionTransitionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statemachine__TransitionAssignment_7_1"


    // $ANTLR start "rule__Channel__TypeAssignment_1"
    // InternalAmf.g:1519:1: rule__Channel__TypeAssignment_1 : ( ruleTypeOfChannel ) ;
    public final void rule__Channel__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1523:1: ( ( ruleTypeOfChannel ) )
            // InternalAmf.g:1524:2: ( ruleTypeOfChannel )
            {
            // InternalAmf.g:1524:2: ( ruleTypeOfChannel )
            // InternalAmf.g:1525:3: ruleTypeOfChannel
            {
             before(grammarAccess.getChannelAccess().getTypeTypeOfChannelEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeOfChannel();

            state._fsp--;

             after(grammarAccess.getChannelAccess().getTypeTypeOfChannelEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__TypeAssignment_1"


    // $ANTLR start "rule__Channel__NameAssignment_3"
    // InternalAmf.g:1534:1: rule__Channel__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Channel__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1538:1: ( ( ruleEString ) )
            // InternalAmf.g:1539:2: ( ruleEString )
            {
            // InternalAmf.g:1539:2: ( ruleEString )
            // InternalAmf.g:1540:3: ruleEString
            {
             before(grammarAccess.getChannelAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChannelAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Channel__NameAssignment_3"


    // $ANTLR start "rule__Transition__SourceAssignment_2"
    // InternalAmf.g:1549:1: rule__Transition__SourceAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__Transition__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1553:1: ( ( ( ruleEString ) ) )
            // InternalAmf.g:1554:2: ( ( ruleEString ) )
            {
            // InternalAmf.g:1554:2: ( ( ruleEString ) )
            // InternalAmf.g:1555:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateCrossReference_2_0()); 
            // InternalAmf.g:1556:3: ( ruleEString )
            // InternalAmf.g:1557:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getSourceStateEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getSourceStateEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getSourceStateCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__SourceAssignment_2"


    // $ANTLR start "rule__Transition__ChannelAssignment_5"
    // InternalAmf.g:1568:1: rule__Transition__ChannelAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__Transition__ChannelAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1572:1: ( ( ( ruleEString ) ) )
            // InternalAmf.g:1573:2: ( ( ruleEString ) )
            {
            // InternalAmf.g:1573:2: ( ( ruleEString ) )
            // InternalAmf.g:1574:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getChannelChannelCrossReference_5_0()); 
            // InternalAmf.g:1575:3: ( ruleEString )
            // InternalAmf.g:1576:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getChannelChannelEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getChannelChannelEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getChannelChannelCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ChannelAssignment_5"


    // $ANTLR start "rule__Transition__TargetAssignment_7"
    // InternalAmf.g:1587:1: rule__Transition__TargetAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__Transition__TargetAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1591:1: ( ( ( ruleEString ) ) )
            // InternalAmf.g:1592:2: ( ( ruleEString ) )
            {
            // InternalAmf.g:1592:2: ( ( ruleEString ) )
            // InternalAmf.g:1593:3: ( ruleEString )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_7_0()); 
            // InternalAmf.g:1594:3: ( ruleEString )
            // InternalAmf.g:1595:4: ruleEString
            {
             before(grammarAccess.getTransitionAccess().getTargetStateEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getTargetStateEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetStateCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TargetAssignment_7"


    // $ANTLR start "rule__Transition__EventAssignment_8"
    // InternalAmf.g:1606:1: rule__Transition__EventAssignment_8 : ( ruleEvent ) ;
    public final void rule__Transition__EventAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1610:1: ( ( ruleEvent ) )
            // InternalAmf.g:1611:2: ( ruleEvent )
            {
            // InternalAmf.g:1611:2: ( ruleEvent )
            // InternalAmf.g:1612:3: ruleEvent
            {
             before(grammarAccess.getTransitionAccess().getEventEventEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getTransitionAccess().getEventEventEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__EventAssignment_8"


    // $ANTLR start "rule__State__NameAssignment_2"
    // InternalAmf.g:1621:1: rule__State__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__State__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAmf.g:1625:1: ( ( ruleEString ) )
            // InternalAmf.g:1626:2: ( ruleEString )
            {
            // InternalAmf.g:1626:2: ( ruleEString )
            // InternalAmf.g:1627:3: ruleEString
            {
             before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002200002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000006000L});

}