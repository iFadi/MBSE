package de.luh.se.mbse.network.textualeditor.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.luh.se.mbse.network.textualeditor.services.AmfGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAmfParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Network'", "'{'", "'}'", "'Statemachine'", "'init'", "'Channel'", "'Transition'", "'->'", "'('", "')'", "'State'", "'Synchronous'", "'Asynchronous'", "'SEND'", "'RECEIVE'"
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

        public InternalAmfParser(TokenStream input, AmfGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Network";
       	}

       	@Override
       	protected AmfGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNetwork"
    // InternalAmf.g:65:1: entryRuleNetwork returns [EObject current=null] : iv_ruleNetwork= ruleNetwork EOF ;
    public final EObject entryRuleNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetwork = null;


        try {
            // InternalAmf.g:65:48: (iv_ruleNetwork= ruleNetwork EOF )
            // InternalAmf.g:66:2: iv_ruleNetwork= ruleNetwork EOF
            {
             newCompositeNode(grammarAccess.getNetworkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNetwork=ruleNetwork();

            state._fsp--;

             current =iv_ruleNetwork; 
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
    // $ANTLR end "entryRuleNetwork"


    // $ANTLR start "ruleNetwork"
    // InternalAmf.g:72:1: ruleNetwork returns [EObject current=null] : (otherlv_0= 'Network' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_channel_3_0= ruleChannel ) ) ( (lv_channel_4_0= ruleChannel ) )* ) ( ( (lv_statemachine_5_0= ruleStatemachine ) ) ( (lv_statemachine_6_0= ruleStatemachine ) )* ) otherlv_7= '}' ) ;
    public final EObject ruleNetwork() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_channel_3_0 = null;

        EObject lv_channel_4_0 = null;

        EObject lv_statemachine_5_0 = null;

        EObject lv_statemachine_6_0 = null;



        	enterRule();

        try {
            // InternalAmf.g:78:2: ( (otherlv_0= 'Network' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_channel_3_0= ruleChannel ) ) ( (lv_channel_4_0= ruleChannel ) )* ) ( ( (lv_statemachine_5_0= ruleStatemachine ) ) ( (lv_statemachine_6_0= ruleStatemachine ) )* ) otherlv_7= '}' ) )
            // InternalAmf.g:79:2: (otherlv_0= 'Network' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_channel_3_0= ruleChannel ) ) ( (lv_channel_4_0= ruleChannel ) )* ) ( ( (lv_statemachine_5_0= ruleStatemachine ) ) ( (lv_statemachine_6_0= ruleStatemachine ) )* ) otherlv_7= '}' )
            {
            // InternalAmf.g:79:2: (otherlv_0= 'Network' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_channel_3_0= ruleChannel ) ) ( (lv_channel_4_0= ruleChannel ) )* ) ( ( (lv_statemachine_5_0= ruleStatemachine ) ) ( (lv_statemachine_6_0= ruleStatemachine ) )* ) otherlv_7= '}' )
            // InternalAmf.g:80:3: otherlv_0= 'Network' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_channel_3_0= ruleChannel ) ) ( (lv_channel_4_0= ruleChannel ) )* ) ( ( (lv_statemachine_5_0= ruleStatemachine ) ) ( (lv_statemachine_6_0= ruleStatemachine ) )* ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNetworkAccess().getNetworkKeyword_0());
            		
            // InternalAmf.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAmf.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalAmf.g:85:4: (lv_name_1_0= ruleEString )
            // InternalAmf.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNetworkAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNetworkRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"de.luh.se.mbse.network.textualeditor.Amf.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAmf.g:107:3: ( ( (lv_channel_3_0= ruleChannel ) ) ( (lv_channel_4_0= ruleChannel ) )* )
            // InternalAmf.g:108:4: ( (lv_channel_3_0= ruleChannel ) ) ( (lv_channel_4_0= ruleChannel ) )*
            {
            // InternalAmf.g:108:4: ( (lv_channel_3_0= ruleChannel ) )
            // InternalAmf.g:109:5: (lv_channel_3_0= ruleChannel )
            {
            // InternalAmf.g:109:5: (lv_channel_3_0= ruleChannel )
            // InternalAmf.g:110:6: lv_channel_3_0= ruleChannel
            {

            						newCompositeNode(grammarAccess.getNetworkAccess().getChannelChannelParserRuleCall_3_0_0());
            					
            pushFollow(FOLLOW_6);
            lv_channel_3_0=ruleChannel();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getNetworkRule());
            						}
            						add(
            							current,
            							"channel",
            							lv_channel_3_0,
            							"de.luh.se.mbse.network.textualeditor.Amf.Channel");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalAmf.g:127:4: ( (lv_channel_4_0= ruleChannel ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=22 && LA1_0<=23)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAmf.g:128:5: (lv_channel_4_0= ruleChannel )
            	    {
            	    // InternalAmf.g:128:5: (lv_channel_4_0= ruleChannel )
            	    // InternalAmf.g:129:6: lv_channel_4_0= ruleChannel
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkAccess().getChannelChannelParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_channel_4_0=ruleChannel();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"channel",
            	    							lv_channel_4_0,
            	    							"de.luh.se.mbse.network.textualeditor.Amf.Channel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            // InternalAmf.g:147:3: ( ( (lv_statemachine_5_0= ruleStatemachine ) ) ( (lv_statemachine_6_0= ruleStatemachine ) )* )
            // InternalAmf.g:148:4: ( (lv_statemachine_5_0= ruleStatemachine ) ) ( (lv_statemachine_6_0= ruleStatemachine ) )*
            {
            // InternalAmf.g:148:4: ( (lv_statemachine_5_0= ruleStatemachine ) )
            // InternalAmf.g:149:5: (lv_statemachine_5_0= ruleStatemachine )
            {
            // InternalAmf.g:149:5: (lv_statemachine_5_0= ruleStatemachine )
            // InternalAmf.g:150:6: lv_statemachine_5_0= ruleStatemachine
            {

            						newCompositeNode(grammarAccess.getNetworkAccess().getStatemachineStatemachineParserRuleCall_4_0_0());
            					
            pushFollow(FOLLOW_7);
            lv_statemachine_5_0=ruleStatemachine();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getNetworkRule());
            						}
            						add(
            							current,
            							"statemachine",
            							lv_statemachine_5_0,
            							"de.luh.se.mbse.network.textualeditor.Amf.Statemachine");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalAmf.g:167:4: ( (lv_statemachine_6_0= ruleStatemachine ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAmf.g:168:5: (lv_statemachine_6_0= ruleStatemachine )
            	    {
            	    // InternalAmf.g:168:5: (lv_statemachine_6_0= ruleStatemachine )
            	    // InternalAmf.g:169:6: lv_statemachine_6_0= ruleStatemachine
            	    {

            	    						newCompositeNode(grammarAccess.getNetworkAccess().getStatemachineStatemachineParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_statemachine_6_0=ruleStatemachine();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNetworkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"statemachine",
            	    							lv_statemachine_6_0,
            	    							"de.luh.se.mbse.network.textualeditor.Amf.Statemachine");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleNetwork"


    // $ANTLR start "entryRuleStatemachine"
    // InternalAmf.g:195:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // InternalAmf.g:195:53: (iv_ruleStatemachine= ruleStatemachine EOF )
            // InternalAmf.g:196:2: iv_ruleStatemachine= ruleStatemachine EOF
            {
             newCompositeNode(grammarAccess.getStatemachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatemachine=ruleStatemachine();

            state._fsp--;

             current =iv_ruleStatemachine; 
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
    // $ANTLR end "entryRuleStatemachine"


    // $ANTLR start "ruleStatemachine"
    // InternalAmf.g:202:1: ruleStatemachine returns [EObject current=null] : ( () otherlv_1= 'Statemachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'init' ( ( ruleEString ) ) ( ( (lv_state_6_0= ruleState ) ) ( (lv_state_7_0= ruleState ) )* )? ( ( (lv_transition_8_0= ruleTransition ) ) ( (lv_transition_9_0= ruleTransition ) )* ) otherlv_10= '}' ) ;
    public final EObject ruleStatemachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_state_6_0 = null;

        EObject lv_state_7_0 = null;

        EObject lv_transition_8_0 = null;

        EObject lv_transition_9_0 = null;



        	enterRule();

        try {
            // InternalAmf.g:208:2: ( ( () otherlv_1= 'Statemachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'init' ( ( ruleEString ) ) ( ( (lv_state_6_0= ruleState ) ) ( (lv_state_7_0= ruleState ) )* )? ( ( (lv_transition_8_0= ruleTransition ) ) ( (lv_transition_9_0= ruleTransition ) )* ) otherlv_10= '}' ) )
            // InternalAmf.g:209:2: ( () otherlv_1= 'Statemachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'init' ( ( ruleEString ) ) ( ( (lv_state_6_0= ruleState ) ) ( (lv_state_7_0= ruleState ) )* )? ( ( (lv_transition_8_0= ruleTransition ) ) ( (lv_transition_9_0= ruleTransition ) )* ) otherlv_10= '}' )
            {
            // InternalAmf.g:209:2: ( () otherlv_1= 'Statemachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'init' ( ( ruleEString ) ) ( ( (lv_state_6_0= ruleState ) ) ( (lv_state_7_0= ruleState ) )* )? ( ( (lv_transition_8_0= ruleTransition ) ) ( (lv_transition_9_0= ruleTransition ) )* ) otherlv_10= '}' )
            // InternalAmf.g:210:3: () otherlv_1= 'Statemachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'init' ( ( ruleEString ) ) ( ( (lv_state_6_0= ruleState ) ) ( (lv_state_7_0= ruleState ) )* )? ( ( (lv_transition_8_0= ruleTransition ) ) ( (lv_transition_9_0= ruleTransition ) )* ) otherlv_10= '}'
            {
            // InternalAmf.g:210:3: ()
            // InternalAmf.g:211:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStatemachineAccess().getStatemachineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStatemachineAccess().getStatemachineKeyword_1());
            		
            // InternalAmf.g:221:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAmf.g:222:4: (lv_name_2_0= ruleEString )
            {
            // InternalAmf.g:222:4: (lv_name_2_0= ruleEString )
            // InternalAmf.g:223:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStatemachineAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStatemachineRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.luh.se.mbse.network.textualeditor.Amf.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getInitKeyword_4());
            		
            // InternalAmf.g:248:3: ( ( ruleEString ) )
            // InternalAmf.g:249:4: ( ruleEString )
            {
            // InternalAmf.g:249:4: ( ruleEString )
            // InternalAmf.g:250:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStatemachineRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStatemachineAccess().getInitialstateStateCrossReference_5_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAmf.g:264:3: ( ( (lv_state_6_0= ruleState ) ) ( (lv_state_7_0= ruleState ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAmf.g:265:4: ( (lv_state_6_0= ruleState ) ) ( (lv_state_7_0= ruleState ) )*
                    {
                    // InternalAmf.g:265:4: ( (lv_state_6_0= ruleState ) )
                    // InternalAmf.g:266:5: (lv_state_6_0= ruleState )
                    {
                    // InternalAmf.g:266:5: (lv_state_6_0= ruleState )
                    // InternalAmf.g:267:6: lv_state_6_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_6_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_state_6_0=ruleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    						}
                    						add(
                    							current,
                    							"state",
                    							lv_state_6_0,
                    							"de.luh.se.mbse.network.textualeditor.Amf.State");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAmf.g:284:4: ( (lv_state_7_0= ruleState ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==21) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalAmf.g:285:5: (lv_state_7_0= ruleState )
                    	    {
                    	    // InternalAmf.g:285:5: (lv_state_7_0= ruleState )
                    	    // InternalAmf.g:286:6: lv_state_7_0= ruleState
                    	    {

                    	    						newCompositeNode(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_state_7_0=ruleState();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStatemachineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"state",
                    	    							lv_state_7_0,
                    	    							"de.luh.se.mbse.network.textualeditor.Amf.State");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalAmf.g:304:3: ( ( (lv_transition_8_0= ruleTransition ) ) ( (lv_transition_9_0= ruleTransition ) )* )
            // InternalAmf.g:305:4: ( (lv_transition_8_0= ruleTransition ) ) ( (lv_transition_9_0= ruleTransition ) )*
            {
            // InternalAmf.g:305:4: ( (lv_transition_8_0= ruleTransition ) )
            // InternalAmf.g:306:5: (lv_transition_8_0= ruleTransition )
            {
            // InternalAmf.g:306:5: (lv_transition_8_0= ruleTransition )
            // InternalAmf.g:307:6: lv_transition_8_0= ruleTransition
            {

            						newCompositeNode(grammarAccess.getStatemachineAccess().getTransitionTransitionParserRuleCall_7_0_0());
            					
            pushFollow(FOLLOW_10);
            lv_transition_8_0=ruleTransition();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getStatemachineRule());
            						}
            						add(
            							current,
            							"transition",
            							lv_transition_8_0,
            							"de.luh.se.mbse.network.textualeditor.Amf.Transition");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalAmf.g:324:4: ( (lv_transition_9_0= ruleTransition ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAmf.g:325:5: (lv_transition_9_0= ruleTransition )
            	    {
            	    // InternalAmf.g:325:5: (lv_transition_9_0= ruleTransition )
            	    // InternalAmf.g:326:6: lv_transition_9_0= ruleTransition
            	    {

            	    						newCompositeNode(grammarAccess.getStatemachineAccess().getTransitionTransitionParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_transition_9_0=ruleTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStatemachineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transition",
            	    							lv_transition_9_0,
            	    							"de.luh.se.mbse.network.textualeditor.Amf.Transition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            otherlv_10=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleStatemachine"


    // $ANTLR start "entryRuleEString"
    // InternalAmf.g:352:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAmf.g:352:47: (iv_ruleEString= ruleEString EOF )
            // InternalAmf.g:353:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalAmf.g:359:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAmf.g:365:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAmf.g:366:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAmf.g:366:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAmf.g:367:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAmf.g:375:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleChannel"
    // InternalAmf.g:386:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // InternalAmf.g:386:48: (iv_ruleChannel= ruleChannel EOF )
            // InternalAmf.g:387:2: iv_ruleChannel= ruleChannel EOF
            {
             newCompositeNode(grammarAccess.getChannelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChannel=ruleChannel();

            state._fsp--;

             current =iv_ruleChannel; 
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
    // $ANTLR end "entryRuleChannel"


    // $ANTLR start "ruleChannel"
    // InternalAmf.g:393:1: ruleChannel returns [EObject current=null] : ( () ( (lv_Type_1_0= ruleTypeOfChannel ) ) otherlv_2= 'Channel' ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleChannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_Type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalAmf.g:399:2: ( ( () ( (lv_Type_1_0= ruleTypeOfChannel ) ) otherlv_2= 'Channel' ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalAmf.g:400:2: ( () ( (lv_Type_1_0= ruleTypeOfChannel ) ) otherlv_2= 'Channel' ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalAmf.g:400:2: ( () ( (lv_Type_1_0= ruleTypeOfChannel ) ) otherlv_2= 'Channel' ( (lv_name_3_0= ruleEString ) ) )
            // InternalAmf.g:401:3: () ( (lv_Type_1_0= ruleTypeOfChannel ) ) otherlv_2= 'Channel' ( (lv_name_3_0= ruleEString ) )
            {
            // InternalAmf.g:401:3: ()
            // InternalAmf.g:402:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getChannelAccess().getChannelAction_0(),
            					current);
            			

            }

            // InternalAmf.g:408:3: ( (lv_Type_1_0= ruleTypeOfChannel ) )
            // InternalAmf.g:409:4: (lv_Type_1_0= ruleTypeOfChannel )
            {
            // InternalAmf.g:409:4: (lv_Type_1_0= ruleTypeOfChannel )
            // InternalAmf.g:410:5: lv_Type_1_0= ruleTypeOfChannel
            {

            					newCompositeNode(grammarAccess.getChannelAccess().getTypeTypeOfChannelEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_Type_1_0=ruleTypeOfChannel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChannelRule());
            					}
            					add(
            						current,
            						"Type",
            						lv_Type_1_0,
            						"de.luh.se.mbse.network.textualeditor.Amf.TypeOfChannel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getChannelAccess().getChannelKeyword_2());
            		
            // InternalAmf.g:431:3: ( (lv_name_3_0= ruleEString ) )
            // InternalAmf.g:432:4: (lv_name_3_0= ruleEString )
            {
            // InternalAmf.g:432:4: (lv_name_3_0= ruleEString )
            // InternalAmf.g:433:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getChannelAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChannelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"de.luh.se.mbse.network.textualeditor.Amf.EString");
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
    // $ANTLR end "ruleChannel"


    // $ANTLR start "entryRuleTransition"
    // InternalAmf.g:454:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalAmf.g:454:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalAmf.g:455:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
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
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalAmf.g:461:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'Transition' ( ( ruleEString ) ) otherlv_3= '->' otherlv_4= '(' ( ( ruleEString ) ) otherlv_6= ')' ( ( ruleEString ) ) ( (lv_event_8_0= ruleEvent ) ) ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_event_8_0 = null;



        	enterRule();

        try {
            // InternalAmf.g:467:2: ( ( () otherlv_1= 'Transition' ( ( ruleEString ) ) otherlv_3= '->' otherlv_4= '(' ( ( ruleEString ) ) otherlv_6= ')' ( ( ruleEString ) ) ( (lv_event_8_0= ruleEvent ) ) ) )
            // InternalAmf.g:468:2: ( () otherlv_1= 'Transition' ( ( ruleEString ) ) otherlv_3= '->' otherlv_4= '(' ( ( ruleEString ) ) otherlv_6= ')' ( ( ruleEString ) ) ( (lv_event_8_0= ruleEvent ) ) )
            {
            // InternalAmf.g:468:2: ( () otherlv_1= 'Transition' ( ( ruleEString ) ) otherlv_3= '->' otherlv_4= '(' ( ( ruleEString ) ) otherlv_6= ')' ( ( ruleEString ) ) ( (lv_event_8_0= ruleEvent ) ) )
            // InternalAmf.g:469:3: () otherlv_1= 'Transition' ( ( ruleEString ) ) otherlv_3= '->' otherlv_4= '(' ( ( ruleEString ) ) otherlv_6= ')' ( ( ruleEString ) ) ( (lv_event_8_0= ruleEvent ) )
            {
            // InternalAmf.g:469:3: ()
            // InternalAmf.g:470:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTransitionKeyword_1());
            		
            // InternalAmf.g:480:3: ( ( ruleEString ) )
            // InternalAmf.g:481:4: ( ruleEString )
            {
            // InternalAmf.g:481:4: ( ruleEString )
            // InternalAmf.g:482:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_2_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4());
            		
            // InternalAmf.g:504:3: ( ( ruleEString ) )
            // InternalAmf.g:505:4: ( ruleEString )
            {
            // InternalAmf.g:505:4: ( ruleEString )
            // InternalAmf.g:506:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getChannelChannelCrossReference_5_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getRightParenthesisKeyword_6());
            		
            // InternalAmf.g:524:3: ( ( ruleEString ) )
            // InternalAmf.g:525:4: ( ruleEString )
            {
            // InternalAmf.g:525:4: ( ruleEString )
            // InternalAmf.g:526:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_7_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAmf.g:540:3: ( (lv_event_8_0= ruleEvent ) )
            // InternalAmf.g:541:4: (lv_event_8_0= ruleEvent )
            {
            // InternalAmf.g:541:4: (lv_event_8_0= ruleEvent )
            // InternalAmf.g:542:5: lv_event_8_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getEventEventEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_2);
            lv_event_8_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"event",
            						lv_event_8_0,
            						"de.luh.se.mbse.network.textualeditor.Amf.Event");
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
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleState"
    // InternalAmf.g:563:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalAmf.g:563:46: (iv_ruleState= ruleState EOF )
            // InternalAmf.g:564:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalAmf.g:570:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalAmf.g:576:2: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalAmf.g:577:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalAmf.g:577:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) )
            // InternalAmf.g:578:3: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalAmf.g:578:3: ()
            // InternalAmf.g:579:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalAmf.g:589:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAmf.g:590:4: (lv_name_2_0= ruleEString )
            {
            // InternalAmf.g:590:4: (lv_name_2_0= ruleEString )
            // InternalAmf.g:591:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"de.luh.se.mbse.network.textualeditor.Amf.EString");
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
    // $ANTLR end "ruleState"


    // $ANTLR start "ruleTypeOfChannel"
    // InternalAmf.g:612:1: ruleTypeOfChannel returns [Enumerator current=null] : ( (enumLiteral_0= 'Synchronous' ) | (enumLiteral_1= 'Asynchronous' ) ) ;
    public final Enumerator ruleTypeOfChannel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAmf.g:618:2: ( ( (enumLiteral_0= 'Synchronous' ) | (enumLiteral_1= 'Asynchronous' ) ) )
            // InternalAmf.g:619:2: ( (enumLiteral_0= 'Synchronous' ) | (enumLiteral_1= 'Asynchronous' ) )
            {
            // InternalAmf.g:619:2: ( (enumLiteral_0= 'Synchronous' ) | (enumLiteral_1= 'Asynchronous' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            else if ( (LA7_0==23) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAmf.g:620:3: (enumLiteral_0= 'Synchronous' )
                    {
                    // InternalAmf.g:620:3: (enumLiteral_0= 'Synchronous' )
                    // InternalAmf.g:621:4: enumLiteral_0= 'Synchronous'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfChannelAccess().getSynchronousEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeOfChannelAccess().getSynchronousEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAmf.g:628:3: (enumLiteral_1= 'Asynchronous' )
                    {
                    // InternalAmf.g:628:3: (enumLiteral_1= 'Asynchronous' )
                    // InternalAmf.g:629:4: enumLiteral_1= 'Asynchronous'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfChannelAccess().getAsynchronousEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeOfChannelAccess().getAsynchronousEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleTypeOfChannel"


    // $ANTLR start "ruleEvent"
    // InternalAmf.g:639:1: ruleEvent returns [Enumerator current=null] : ( (enumLiteral_0= 'SEND' ) | (enumLiteral_1= 'RECEIVE' ) ) ;
    public final Enumerator ruleEvent() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAmf.g:645:2: ( ( (enumLiteral_0= 'SEND' ) | (enumLiteral_1= 'RECEIVE' ) ) )
            // InternalAmf.g:646:2: ( (enumLiteral_0= 'SEND' ) | (enumLiteral_1= 'RECEIVE' ) )
            {
            // InternalAmf.g:646:2: ( (enumLiteral_0= 'SEND' ) | (enumLiteral_1= 'RECEIVE' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==25) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAmf.g:647:3: (enumLiteral_0= 'SEND' )
                    {
                    // InternalAmf.g:647:3: (enumLiteral_0= 'SEND' )
                    // InternalAmf.g:648:4: enumLiteral_0= 'SEND'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getEventAccess().getSENDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEventAccess().getSENDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAmf.g:655:3: (enumLiteral_1= 'RECEIVE' )
                    {
                    // InternalAmf.g:655:3: (enumLiteral_1= 'RECEIVE' )
                    // InternalAmf.g:656:4: enumLiteral_1= 'RECEIVE'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getEventAccess().getRECEIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getEventAccess().getRECEIVEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleEvent"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000C04000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000C06000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000222000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000000L});

}