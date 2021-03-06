/*
 * generated by Xtext 2.9.1
 */
grammar InternalAmf;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package de.luh.se.mbse.network.textualeditor.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleNetwork
entryRuleNetwork returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNetworkRule()); }
	iv_ruleNetwork=ruleNetwork
	{ $current=$iv_ruleNetwork.current; }
	EOF;

// Rule Network
ruleNetwork returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Network'
		{
			newLeafNode(otherlv_0, grammarAccess.getNetworkAccess().getNetworkKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNetworkAccess().getNameEStringParserRuleCall_1_0());
				}
				lv_name_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNetworkRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"de.luh.se.mbse.network.textualeditor.Amf.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getNetworkAccess().getChannelChannelParserRuleCall_3_0_0());
					}
					lv_channel_3_0=ruleChannel
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNetworkRule());
						}
						add(
							$current,
							"channel",
							lv_channel_3_0,
							"de.luh.se.mbse.network.textualeditor.Amf.Channel");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getNetworkAccess().getChannelChannelParserRuleCall_3_1_0());
					}
					lv_channel_4_0=ruleChannel
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNetworkRule());
						}
						add(
							$current,
							"channel",
							lv_channel_4_0,
							"de.luh.se.mbse.network.textualeditor.Amf.Channel");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getNetworkAccess().getStatemachineStatemachineParserRuleCall_4_0_0());
					}
					lv_statemachine_5_0=ruleStatemachine
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNetworkRule());
						}
						add(
							$current,
							"statemachine",
							lv_statemachine_5_0,
							"de.luh.se.mbse.network.textualeditor.Amf.Statemachine");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getNetworkAccess().getStatemachineStatemachineParserRuleCall_4_1_0());
					}
					lv_statemachine_6_0=ruleStatemachine
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNetworkRule());
						}
						add(
							$current,
							"statemachine",
							lv_statemachine_6_0,
							"de.luh.se.mbse.network.textualeditor.Amf.Statemachine");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleStatemachine
entryRuleStatemachine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatemachineRule()); }
	iv_ruleStatemachine=ruleStatemachine
	{ $current=$iv_ruleStatemachine.current; }
	EOF;

// Rule Statemachine
ruleStatemachine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStatemachineAccess().getStatemachineAction_0(),
					$current);
			}
		)
		otherlv_1='Statemachine'
		{
			newLeafNode(otherlv_1, grammarAccess.getStatemachineAccess().getStatemachineKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStatemachineAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStatemachineRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"de.luh.se.mbse.network.textualeditor.Amf.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_3());
		}
		otherlv_4='init'
		{
			newLeafNode(otherlv_4, grammarAccess.getStatemachineAccess().getInitKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStatemachineRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getStatemachineAccess().getInitialstateStateCrossReference_5_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_6_0_0());
					}
					lv_state_6_0=ruleState
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStatemachineRule());
						}
						add(
							$current,
							"state",
							lv_state_6_0,
							"de.luh.se.mbse.network.textualeditor.Amf.State");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_6_1_0());
					}
					lv_state_7_0=ruleState
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStatemachineRule());
						}
						add(
							$current,
							"state",
							lv_state_7_0,
							"de.luh.se.mbse.network.textualeditor.Amf.State");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)?
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getStatemachineAccess().getTransitionTransitionParserRuleCall_7_0_0());
					}
					lv_transition_8_0=ruleTransition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStatemachineRule());
						}
						add(
							$current,
							"transition",
							lv_transition_8_0,
							"de.luh.se.mbse.network.textualeditor.Amf.Transition");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getStatemachineAccess().getTransitionTransitionParserRuleCall_7_1_0());
					}
					lv_transition_9_0=ruleTransition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStatemachineRule());
						}
						add(
							$current,
							"transition",
							lv_transition_9_0,
							"de.luh.se.mbse.network.textualeditor.Amf.Transition");
						afterParserOrEnumRuleCall();
					}
				)
			)*
		)
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleChannel
entryRuleChannel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChannelRule()); }
	iv_ruleChannel=ruleChannel
	{ $current=$iv_ruleChannel.current; }
	EOF;

// Rule Channel
ruleChannel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getChannelAccess().getChannelAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getChannelAccess().getTypeTypeOfChannelEnumRuleCall_1_0());
				}
				lv_Type_1_0=ruleTypeOfChannel
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChannelRule());
					}
					add(
						$current,
						"Type",
						lv_Type_1_0,
						"de.luh.se.mbse.network.textualeditor.Amf.TypeOfChannel");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='Channel'
		{
			newLeafNode(otherlv_2, grammarAccess.getChannelAccess().getChannelKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getChannelAccess().getNameEStringParserRuleCall_3_0());
				}
				lv_name_3_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChannelRule());
					}
					set(
						$current,
						"name",
						lv_name_3_0,
						"de.luh.se.mbse.network.textualeditor.Amf.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current; }
	EOF;

// Rule Transition
ruleTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getTransitionAccess().getTransitionAction_0(),
					$current);
			}
		)
		otherlv_1='Transition'
		{
			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getTransitionKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getSourceStateCrossReference_2_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='->'
		{
			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3());
		}
		otherlv_4='('
		{
			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getChannelChannelCrossReference_5_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getRightParenthesisKeyword_6());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getTargetStateCrossReference_7_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getEventEventEnumRuleCall_8_0());
				}
				lv_event_8_0=ruleEvent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionRule());
					}
					set(
						$current,
						"event",
						lv_event_8_0,
						"de.luh.se.mbse.network.textualeditor.Amf.Event");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStateAccess().getStateAction_0(),
					$current);
			}
		)
		otherlv_1='State'
		{
			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"de.luh.se.mbse.network.textualeditor.Amf.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Rule TypeOfChannel
ruleTypeOfChannel returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='Synchronous'
			{
				$current = grammarAccess.getTypeOfChannelAccess().getSynchronousEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getTypeOfChannelAccess().getSynchronousEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='Asynchronous'
			{
				$current = grammarAccess.getTypeOfChannelAccess().getAsynchronousEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getTypeOfChannelAccess().getAsynchronousEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule Event
ruleEvent returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='SEND'
			{
				$current = grammarAccess.getEventAccess().getSENDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getEventAccess().getSENDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='RECEIVE'
			{
				$current = grammarAccess.getEventAccess().getRECEIVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getEventAccess().getRECEIVEEnumLiteralDeclaration_1());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
