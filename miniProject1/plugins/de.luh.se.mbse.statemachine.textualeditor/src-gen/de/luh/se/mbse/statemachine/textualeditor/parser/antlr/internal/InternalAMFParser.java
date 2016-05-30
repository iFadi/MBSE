package de.luh.se.mbse.statemachine.textualeditor.parser.antlr.internal;

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
import de.luh.se.mbse.statemachine.textualeditor.services.AMFGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAMFParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Network'", "'{'", "'}'", "'Statemachine'", "'init'", "'Channel'", "'Transition'", "'Label'", "'Source'", "'Target'", "'State'", "'Synchronous'", "'Asynchronous'", "'SEND'", "'RECEIVE'"
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


        public InternalAMFParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAMFParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAMFParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAMF.g"; }



     	private AMFGrammarAccess grammarAccess;

        public InternalAMFParser(TokenStream input, AMFGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Network";
       	}

       	@Override
       	protected AMFGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNetwork"
    // InternalAMF.g:65:1: entryRuleNetwork returns [EObject current=null] : iv_ruleNetwork= ruleNetwork EOF ;
    public final EObject entryRuleNetwork() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNetwork = null;


        try {
            // InternalAMF.g:65:48: (iv_ruleNetwork= ruleNetwork EOF )
            // InternalAMF.g:66:2: iv_ruleNetwork= ruleNetwork EOF
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
    // InternalAMF.g:72:1: ruleNetwork returns [EObject current=null] : (otherlv_0= 'Network' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_channel_3_0= ruleChannel ) ) ( (lv_channel_4_0= ruleChannel ) )* ) ( ( (lv_statemachine_5_0= ruleStatemachine ) ) ( (lv_statemachine_6_0= ruleStatemachine ) )* ) otherlv_7= '}' ) ;
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
            // InternalAMF.g:78:2: ( (otherlv_0= 'Network' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_channel_3_0= ruleChannel ) ) ( (lv_channel_4_0= ruleChannel ) )* ) ( ( (lv_statemachine_5_0= ruleStatemachine ) ) ( (lv_statemachine_6_0= ruleStatemachine ) )* ) otherlv_7= '}' ) )
            // InternalAMF.g:79:2: (otherlv_0= 'Network' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_channel_3_0= ruleChannel ) ) ( (lv_channel_4_0= ruleChannel ) )* ) ( ( (lv_statemachine_5_0= ruleStatemachine ) ) ( (lv_statemachine_6_0= ruleStatemachine ) )* ) otherlv_7= '}' )
            {
            // InternalAMF.g:79:2: (otherlv_0= 'Network' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_channel_3_0= ruleChannel ) ) ( (lv_channel_4_0= ruleChannel ) )* ) ( ( (lv_statemachine_5_0= ruleStatemachine ) ) ( (lv_statemachine_6_0= ruleStatemachine ) )* ) otherlv_7= '}' )
            // InternalAMF.g:80:3: otherlv_0= 'Network' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( ( (lv_channel_3_0= ruleChannel ) ) ( (lv_channel_4_0= ruleChannel ) )* ) ( ( (lv_statemachine_5_0= ruleStatemachine ) ) ( (lv_statemachine_6_0= ruleStatemachine ) )* ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNetworkAccess().getNetworkKeyword_0());
            		
            // InternalAMF.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalAMF.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalAMF.g:85:4: (lv_name_1_0= ruleEString )
            // InternalAMF.g:86:5: lv_name_1_0= ruleEString
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
            						"de.luh.se.mbse.statemachine.textualeditor.AMF.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAMF.g:107:3: ( ( (lv_channel_3_0= ruleChannel ) ) ( (lv_channel_4_0= ruleChannel ) )* )
            // InternalAMF.g:108:4: ( (lv_channel_3_0= ruleChannel ) ) ( (lv_channel_4_0= ruleChannel ) )*
            {
            // InternalAMF.g:108:4: ( (lv_channel_3_0= ruleChannel ) )
            // InternalAMF.g:109:5: (lv_channel_3_0= ruleChannel )
            {
            // InternalAMF.g:109:5: (lv_channel_3_0= ruleChannel )
            // InternalAMF.g:110:6: lv_channel_3_0= ruleChannel
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
            							"de.luh.se.mbse.statemachine.textualeditor.AMF.Channel");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalAMF.g:127:4: ( (lv_channel_4_0= ruleChannel ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=22 && LA1_0<=23)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAMF.g:128:5: (lv_channel_4_0= ruleChannel )
            	    {
            	    // InternalAMF.g:128:5: (lv_channel_4_0= ruleChannel )
            	    // InternalAMF.g:129:6: lv_channel_4_0= ruleChannel
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
            	    							"de.luh.se.mbse.statemachine.textualeditor.AMF.Channel");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            // InternalAMF.g:147:3: ( ( (lv_statemachine_5_0= ruleStatemachine ) ) ( (lv_statemachine_6_0= ruleStatemachine ) )* )
            // InternalAMF.g:148:4: ( (lv_statemachine_5_0= ruleStatemachine ) ) ( (lv_statemachine_6_0= ruleStatemachine ) )*
            {
            // InternalAMF.g:148:4: ( (lv_statemachine_5_0= ruleStatemachine ) )
            // InternalAMF.g:149:5: (lv_statemachine_5_0= ruleStatemachine )
            {
            // InternalAMF.g:149:5: (lv_statemachine_5_0= ruleStatemachine )
            // InternalAMF.g:150:6: lv_statemachine_5_0= ruleStatemachine
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
            							"de.luh.se.mbse.statemachine.textualeditor.AMF.Statemachine");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalAMF.g:167:4: ( (lv_statemachine_6_0= ruleStatemachine ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalAMF.g:168:5: (lv_statemachine_6_0= ruleStatemachine )
            	    {
            	    // InternalAMF.g:168:5: (lv_statemachine_6_0= ruleStatemachine )
            	    // InternalAMF.g:169:6: lv_statemachine_6_0= ruleStatemachine
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
            	    							"de.luh.se.mbse.statemachine.textualeditor.AMF.Statemachine");
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
    // InternalAMF.g:195:1: entryRuleStatemachine returns [EObject current=null] : iv_ruleStatemachine= ruleStatemachine EOF ;
    public final EObject entryRuleStatemachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatemachine = null;


        try {
            // InternalAMF.g:195:53: (iv_ruleStatemachine= ruleStatemachine EOF )
            // InternalAMF.g:196:2: iv_ruleStatemachine= ruleStatemachine EOF
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
    // InternalAMF.g:202:1: ruleStatemachine returns [EObject current=null] : ( () otherlv_1= 'Statemachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'init' ( ( ruleEString ) ) ( ( (lv_state_6_0= ruleState ) ) ( (lv_state_7_0= ruleState ) )* )? ( ( (lv_transition_8_0= ruleTransition ) ) ( (lv_transition_9_0= ruleTransition ) )* ) otherlv_10= '}' ) ;
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
            // InternalAMF.g:208:2: ( ( () otherlv_1= 'Statemachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'init' ( ( ruleEString ) ) ( ( (lv_state_6_0= ruleState ) ) ( (lv_state_7_0= ruleState ) )* )? ( ( (lv_transition_8_0= ruleTransition ) ) ( (lv_transition_9_0= ruleTransition ) )* ) otherlv_10= '}' ) )
            // InternalAMF.g:209:2: ( () otherlv_1= 'Statemachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'init' ( ( ruleEString ) ) ( ( (lv_state_6_0= ruleState ) ) ( (lv_state_7_0= ruleState ) )* )? ( ( (lv_transition_8_0= ruleTransition ) ) ( (lv_transition_9_0= ruleTransition ) )* ) otherlv_10= '}' )
            {
            // InternalAMF.g:209:2: ( () otherlv_1= 'Statemachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'init' ( ( ruleEString ) ) ( ( (lv_state_6_0= ruleState ) ) ( (lv_state_7_0= ruleState ) )* )? ( ( (lv_transition_8_0= ruleTransition ) ) ( (lv_transition_9_0= ruleTransition ) )* ) otherlv_10= '}' )
            // InternalAMF.g:210:3: () otherlv_1= 'Statemachine' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'init' ( ( ruleEString ) ) ( ( (lv_state_6_0= ruleState ) ) ( (lv_state_7_0= ruleState ) )* )? ( ( (lv_transition_8_0= ruleTransition ) ) ( (lv_transition_9_0= ruleTransition ) )* ) otherlv_10= '}'
            {
            // InternalAMF.g:210:3: ()
            // InternalAMF.g:211:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStatemachineAccess().getStatemachineAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStatemachineAccess().getStatemachineKeyword_1());
            		
            // InternalAMF.g:221:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAMF.g:222:4: (lv_name_2_0= ruleEString )
            {
            // InternalAMF.g:222:4: (lv_name_2_0= ruleEString )
            // InternalAMF.g:223:5: lv_name_2_0= ruleEString
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
            						"de.luh.se.mbse.statemachine.textualeditor.AMF.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getInitKeyword_4());
            		
            // InternalAMF.g:248:3: ( ( ruleEString ) )
            // InternalAMF.g:249:4: ( ruleEString )
            {
            // InternalAMF.g:249:4: ( ruleEString )
            // InternalAMF.g:250:5: ruleEString
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

            // InternalAMF.g:264:3: ( ( (lv_state_6_0= ruleState ) ) ( (lv_state_7_0= ruleState ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAMF.g:265:4: ( (lv_state_6_0= ruleState ) ) ( (lv_state_7_0= ruleState ) )*
                    {
                    // InternalAMF.g:265:4: ( (lv_state_6_0= ruleState ) )
                    // InternalAMF.g:266:5: (lv_state_6_0= ruleState )
                    {
                    // InternalAMF.g:266:5: (lv_state_6_0= ruleState )
                    // InternalAMF.g:267:6: lv_state_6_0= ruleState
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
                    							"de.luh.se.mbse.statemachine.textualeditor.AMF.State");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalAMF.g:284:4: ( (lv_state_7_0= ruleState ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==21) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalAMF.g:285:5: (lv_state_7_0= ruleState )
                    	    {
                    	    // InternalAMF.g:285:5: (lv_state_7_0= ruleState )
                    	    // InternalAMF.g:286:6: lv_state_7_0= ruleState
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
                    	    							"de.luh.se.mbse.statemachine.textualeditor.AMF.State");
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

            // InternalAMF.g:304:3: ( ( (lv_transition_8_0= ruleTransition ) ) ( (lv_transition_9_0= ruleTransition ) )* )
            // InternalAMF.g:305:4: ( (lv_transition_8_0= ruleTransition ) ) ( (lv_transition_9_0= ruleTransition ) )*
            {
            // InternalAMF.g:305:4: ( (lv_transition_8_0= ruleTransition ) )
            // InternalAMF.g:306:5: (lv_transition_8_0= ruleTransition )
            {
            // InternalAMF.g:306:5: (lv_transition_8_0= ruleTransition )
            // InternalAMF.g:307:6: lv_transition_8_0= ruleTransition
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
            							"de.luh.se.mbse.statemachine.textualeditor.AMF.Transition");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalAMF.g:324:4: ( (lv_transition_9_0= ruleTransition ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalAMF.g:325:5: (lv_transition_9_0= ruleTransition )
            	    {
            	    // InternalAMF.g:325:5: (lv_transition_9_0= ruleTransition )
            	    // InternalAMF.g:326:6: lv_transition_9_0= ruleTransition
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
            	    							"de.luh.se.mbse.statemachine.textualeditor.AMF.Transition");
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
    // InternalAMF.g:352:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalAMF.g:352:47: (iv_ruleEString= ruleEString EOF )
            // InternalAMF.g:353:2: iv_ruleEString= ruleEString EOF
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
    // InternalAMF.g:359:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalAMF.g:365:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalAMF.g:366:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalAMF.g:366:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalAMF.g:367:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalAMF.g:375:3: this_ID_1= RULE_ID
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
    // InternalAMF.g:386:1: entryRuleChannel returns [EObject current=null] : iv_ruleChannel= ruleChannel EOF ;
    public final EObject entryRuleChannel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChannel = null;


        try {
            // InternalAMF.g:386:48: (iv_ruleChannel= ruleChannel EOF )
            // InternalAMF.g:387:2: iv_ruleChannel= ruleChannel EOF
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
    // InternalAMF.g:393:1: ruleChannel returns [EObject current=null] : ( () ( (lv_Type_1_0= ruleTypeOfChannel ) ) otherlv_2= 'Channel' ( (lv_name_3_0= ruleEString ) ) ) ;
    public final EObject ruleChannel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_Type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalAMF.g:399:2: ( ( () ( (lv_Type_1_0= ruleTypeOfChannel ) ) otherlv_2= 'Channel' ( (lv_name_3_0= ruleEString ) ) ) )
            // InternalAMF.g:400:2: ( () ( (lv_Type_1_0= ruleTypeOfChannel ) ) otherlv_2= 'Channel' ( (lv_name_3_0= ruleEString ) ) )
            {
            // InternalAMF.g:400:2: ( () ( (lv_Type_1_0= ruleTypeOfChannel ) ) otherlv_2= 'Channel' ( (lv_name_3_0= ruleEString ) ) )
            // InternalAMF.g:401:3: () ( (lv_Type_1_0= ruleTypeOfChannel ) ) otherlv_2= 'Channel' ( (lv_name_3_0= ruleEString ) )
            {
            // InternalAMF.g:401:3: ()
            // InternalAMF.g:402:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getChannelAccess().getChannelAction_0(),
            					current);
            			

            }

            // InternalAMF.g:408:3: ( (lv_Type_1_0= ruleTypeOfChannel ) )
            // InternalAMF.g:409:4: (lv_Type_1_0= ruleTypeOfChannel )
            {
            // InternalAMF.g:409:4: (lv_Type_1_0= ruleTypeOfChannel )
            // InternalAMF.g:410:5: lv_Type_1_0= ruleTypeOfChannel
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
            						"de.luh.se.mbse.statemachine.textualeditor.AMF.TypeOfChannel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getChannelAccess().getChannelKeyword_2());
            		
            // InternalAMF.g:431:3: ( (lv_name_3_0= ruleEString ) )
            // InternalAMF.g:432:4: (lv_name_3_0= ruleEString )
            {
            // InternalAMF.g:432:4: (lv_name_3_0= ruleEString )
            // InternalAMF.g:433:5: lv_name_3_0= ruleEString
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
            						"de.luh.se.mbse.statemachine.textualeditor.AMF.EString");
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
    // InternalAMF.g:454:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalAMF.g:454:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalAMF.g:455:2: iv_ruleTransition= ruleTransition EOF
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
    // InternalAMF.g:461:1: ruleTransition returns [EObject current=null] : ( () otherlv_1= 'Transition' otherlv_2= '{' (otherlv_3= 'Label' ( (lv_event_4_0= ruleEvent ) ) )? otherlv_5= 'Source' ( ( ruleEString ) ) otherlv_7= 'Target' ( ( ruleEString ) ) otherlv_9= 'Channel' ( ( ruleEString ) ) otherlv_11= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_event_4_0 = null;



        	enterRule();

        try {
            // InternalAMF.g:467:2: ( ( () otherlv_1= 'Transition' otherlv_2= '{' (otherlv_3= 'Label' ( (lv_event_4_0= ruleEvent ) ) )? otherlv_5= 'Source' ( ( ruleEString ) ) otherlv_7= 'Target' ( ( ruleEString ) ) otherlv_9= 'Channel' ( ( ruleEString ) ) otherlv_11= '}' ) )
            // InternalAMF.g:468:2: ( () otherlv_1= 'Transition' otherlv_2= '{' (otherlv_3= 'Label' ( (lv_event_4_0= ruleEvent ) ) )? otherlv_5= 'Source' ( ( ruleEString ) ) otherlv_7= 'Target' ( ( ruleEString ) ) otherlv_9= 'Channel' ( ( ruleEString ) ) otherlv_11= '}' )
            {
            // InternalAMF.g:468:2: ( () otherlv_1= 'Transition' otherlv_2= '{' (otherlv_3= 'Label' ( (lv_event_4_0= ruleEvent ) ) )? otherlv_5= 'Source' ( ( ruleEString ) ) otherlv_7= 'Target' ( ( ruleEString ) ) otherlv_9= 'Channel' ( ( ruleEString ) ) otherlv_11= '}' )
            // InternalAMF.g:469:3: () otherlv_1= 'Transition' otherlv_2= '{' (otherlv_3= 'Label' ( (lv_event_4_0= ruleEvent ) ) )? otherlv_5= 'Source' ( ( ruleEString ) ) otherlv_7= 'Target' ( ( ruleEString ) ) otherlv_9= 'Channel' ( ( ruleEString ) ) otherlv_11= '}'
            {
            // InternalAMF.g:469:3: ()
            // InternalAMF.g:470:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransitionAccess().getTransitionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTransitionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAMF.g:484:3: (otherlv_3= 'Label' ( (lv_event_4_0= ruleEvent ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAMF.g:485:4: otherlv_3= 'Label' ( (lv_event_4_0= ruleEvent ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getLabelKeyword_3_0());
                    			
                    // InternalAMF.g:489:4: ( (lv_event_4_0= ruleEvent ) )
                    // InternalAMF.g:490:5: (lv_event_4_0= ruleEvent )
                    {
                    // InternalAMF.g:490:5: (lv_event_4_0= ruleEvent )
                    // InternalAMF.g:491:6: lv_event_4_0= ruleEvent
                    {

                    						newCompositeNode(grammarAccess.getTransitionAccess().getEventEventEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_event_4_0=ruleEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTransitionRule());
                    						}
                    						set(
                    							current,
                    							"event",
                    							lv_event_4_0,
                    							"de.luh.se.mbse.statemachine.textualeditor.AMF.Event");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getSourceKeyword_4());
            		
            // InternalAMF.g:513:3: ( ( ruleEString ) )
            // InternalAMF.g:514:4: ( ruleEString )
            {
            // InternalAMF.g:514:4: ( ruleEString )
            // InternalAMF.g:515:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_5_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getTargetKeyword_6());
            		
            // InternalAMF.g:533:3: ( ( ruleEString ) )
            // InternalAMF.g:534:4: ( ruleEString )
            {
            // InternalAMF.g:534:4: ( ruleEString )
            // InternalAMF.g:535:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_7_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getChannelKeyword_8());
            		
            // InternalAMF.g:553:3: ( ( ruleEString ) )
            // InternalAMF.g:554:4: ( ruleEString )
            {
            // InternalAMF.g:554:4: ( ruleEString )
            // InternalAMF.g:555:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getChannelChannelCrossReference_9_0());
            				
            pushFollow(FOLLOW_16);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalAMF.g:577:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalAMF.g:577:46: (iv_ruleState= ruleState EOF )
            // InternalAMF.g:578:2: iv_ruleState= ruleState EOF
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
    // InternalAMF.g:584:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalAMF.g:590:2: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalAMF.g:591:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalAMF.g:591:2: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) )
            // InternalAMF.g:592:3: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalAMF.g:592:3: ()
            // InternalAMF.g:593:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStateAccess().getStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
            		
            // InternalAMF.g:603:3: ( (lv_name_2_0= ruleEString ) )
            // InternalAMF.g:604:4: (lv_name_2_0= ruleEString )
            {
            // InternalAMF.g:604:4: (lv_name_2_0= ruleEString )
            // InternalAMF.g:605:5: lv_name_2_0= ruleEString
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
            						"de.luh.se.mbse.statemachine.textualeditor.AMF.EString");
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
    // InternalAMF.g:626:1: ruleTypeOfChannel returns [Enumerator current=null] : ( (enumLiteral_0= 'Synchronous' ) | (enumLiteral_1= 'Asynchronous' ) ) ;
    public final Enumerator ruleTypeOfChannel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAMF.g:632:2: ( ( (enumLiteral_0= 'Synchronous' ) | (enumLiteral_1= 'Asynchronous' ) ) )
            // InternalAMF.g:633:2: ( (enumLiteral_0= 'Synchronous' ) | (enumLiteral_1= 'Asynchronous' ) )
            {
            // InternalAMF.g:633:2: ( (enumLiteral_0= 'Synchronous' ) | (enumLiteral_1= 'Asynchronous' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==23) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalAMF.g:634:3: (enumLiteral_0= 'Synchronous' )
                    {
                    // InternalAMF.g:634:3: (enumLiteral_0= 'Synchronous' )
                    // InternalAMF.g:635:4: enumLiteral_0= 'Synchronous'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getTypeOfChannelAccess().getSynchronousEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeOfChannelAccess().getSynchronousEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAMF.g:642:3: (enumLiteral_1= 'Asynchronous' )
                    {
                    // InternalAMF.g:642:3: (enumLiteral_1= 'Asynchronous' )
                    // InternalAMF.g:643:4: enumLiteral_1= 'Asynchronous'
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
    // InternalAMF.g:653:1: ruleEvent returns [Enumerator current=null] : ( (enumLiteral_0= 'SEND' ) | (enumLiteral_1= 'RECEIVE' ) ) ;
    public final Enumerator ruleEvent() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAMF.g:659:2: ( ( (enumLiteral_0= 'SEND' ) | (enumLiteral_1= 'RECEIVE' ) ) )
            // InternalAMF.g:660:2: ( (enumLiteral_0= 'SEND' ) | (enumLiteral_1= 'RECEIVE' ) )
            {
            // InternalAMF.g:660:2: ( (enumLiteral_0= 'SEND' ) | (enumLiteral_1= 'RECEIVE' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAMF.g:661:3: (enumLiteral_0= 'SEND' )
                    {
                    // InternalAMF.g:661:3: (enumLiteral_0= 'SEND' )
                    // InternalAMF.g:662:4: enumLiteral_0= 'SEND'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getEventAccess().getSENDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getEventAccess().getSENDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAMF.g:669:3: (enumLiteral_1= 'RECEIVE' )
                    {
                    // InternalAMF.g:669:3: (enumLiteral_1= 'RECEIVE' )
                    // InternalAMF.g:670:4: enumLiteral_1= 'RECEIVE'
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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000002000L});

}