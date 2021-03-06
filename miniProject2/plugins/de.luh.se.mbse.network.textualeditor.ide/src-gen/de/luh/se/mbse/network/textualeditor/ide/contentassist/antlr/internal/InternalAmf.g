/*
 * generated by Xtext 2.9.1
 */
grammar InternalAmf;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package de.luh.se.mbse.network.textualeditor.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleNetwork
entryRuleNetwork
:
{ before(grammarAccess.getNetworkRule()); }
	 ruleNetwork
{ after(grammarAccess.getNetworkRule()); } 
	 EOF 
;

// Rule Network
ruleNetwork 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNetworkAccess().getGroup()); }
		(rule__Network__Group__0)
		{ after(grammarAccess.getNetworkAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStatemachine
entryRuleStatemachine
:
{ before(grammarAccess.getStatemachineRule()); }
	 ruleStatemachine
{ after(grammarAccess.getStatemachineRule()); } 
	 EOF 
;

// Rule Statemachine
ruleStatemachine 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStatemachineAccess().getGroup()); }
		(rule__Statemachine__Group__0)
		{ after(grammarAccess.getStatemachineAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChannel
entryRuleChannel
:
{ before(grammarAccess.getChannelRule()); }
	 ruleChannel
{ after(grammarAccess.getChannelRule()); } 
	 EOF 
;

// Rule Channel
ruleChannel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChannelAccess().getGroup()); }
		(rule__Channel__Group__0)
		{ after(grammarAccess.getChannelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTransition
entryRuleTransition
:
{ before(grammarAccess.getTransitionRule()); }
	 ruleTransition
{ after(grammarAccess.getTransitionRule()); } 
	 EOF 
;

// Rule Transition
ruleTransition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTransitionAccess().getGroup()); }
		(rule__Transition__Group__0)
		{ after(grammarAccess.getTransitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleState
entryRuleState
:
{ before(grammarAccess.getStateRule()); }
	 ruleState
{ after(grammarAccess.getStateRule()); } 
	 EOF 
;

// Rule State
ruleState 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateAccess().getGroup()); }
		(rule__State__Group__0)
		{ after(grammarAccess.getStateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule TypeOfChannel
ruleTypeOfChannel
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeOfChannelAccess().getAlternatives()); }
		(rule__TypeOfChannel__Alternatives)
		{ after(grammarAccess.getTypeOfChannelAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Rule Event
ruleEvent
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEventAccess().getAlternatives()); }
		(rule__Event__Alternatives)
		{ after(grammarAccess.getEventAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeOfChannel__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeOfChannelAccess().getSynchronousEnumLiteralDeclaration_0()); }
		('Synchronous')
		{ after(grammarAccess.getTypeOfChannelAccess().getSynchronousEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeOfChannelAccess().getAsynchronousEnumLiteralDeclaration_1()); }
		('Asynchronous')
		{ after(grammarAccess.getTypeOfChannelAccess().getAsynchronousEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Event__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEventAccess().getSENDEnumLiteralDeclaration_0()); }
		('SEND')
		{ after(grammarAccess.getEventAccess().getSENDEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getEventAccess().getRECEIVEEnumLiteralDeclaration_1()); }
		('RECEIVE')
		{ after(grammarAccess.getEventAccess().getRECEIVEEnumLiteralDeclaration_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Network__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Network__Group__0__Impl
	rule__Network__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Network__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkAccess().getNetworkKeyword_0()); }
	'Network'
	{ after(grammarAccess.getNetworkAccess().getNetworkKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Network__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Network__Group__1__Impl
	rule__Network__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Network__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkAccess().getNameAssignment_1()); }
	(rule__Network__NameAssignment_1)
	{ after(grammarAccess.getNetworkAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Network__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Network__Group__2__Impl
	rule__Network__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Network__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getNetworkAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Network__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Network__Group__3__Impl
	rule__Network__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Network__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkAccess().getGroup_3()); }
	(rule__Network__Group_3__0)
	{ after(grammarAccess.getNetworkAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Network__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Network__Group__4__Impl
	rule__Network__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Network__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkAccess().getGroup_4()); }
	(rule__Network__Group_4__0)
	{ after(grammarAccess.getNetworkAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Network__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Network__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Network__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getNetworkAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Network__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Network__Group_3__0__Impl
	rule__Network__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Network__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkAccess().getChannelAssignment_3_0()); }
	(rule__Network__ChannelAssignment_3_0)
	{ after(grammarAccess.getNetworkAccess().getChannelAssignment_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Network__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Network__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Network__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkAccess().getChannelAssignment_3_1()); }
	(rule__Network__ChannelAssignment_3_1)*
	{ after(grammarAccess.getNetworkAccess().getChannelAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Network__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Network__Group_4__0__Impl
	rule__Network__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Network__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkAccess().getStatemachineAssignment_4_0()); }
	(rule__Network__StatemachineAssignment_4_0)
	{ after(grammarAccess.getNetworkAccess().getStatemachineAssignment_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Network__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Network__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Network__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNetworkAccess().getStatemachineAssignment_4_1()); }
	(rule__Network__StatemachineAssignment_4_1)*
	{ after(grammarAccess.getNetworkAccess().getStatemachineAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Statemachine__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Statemachine__Group__0__Impl
	rule__Statemachine__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatemachineAccess().getStatemachineAction_0()); }
	()
	{ after(grammarAccess.getStatemachineAccess().getStatemachineAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Statemachine__Group__1__Impl
	rule__Statemachine__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatemachineAccess().getStatemachineKeyword_1()); }
	'Statemachine'
	{ after(grammarAccess.getStatemachineAccess().getStatemachineKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Statemachine__Group__2__Impl
	rule__Statemachine__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatemachineAccess().getNameAssignment_2()); }
	(rule__Statemachine__NameAssignment_2)
	{ after(grammarAccess.getStatemachineAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Statemachine__Group__3__Impl
	rule__Statemachine__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getStatemachineAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Statemachine__Group__4__Impl
	rule__Statemachine__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatemachineAccess().getInitKeyword_4()); }
	'init'
	{ after(grammarAccess.getStatemachineAccess().getInitKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Statemachine__Group__5__Impl
	rule__Statemachine__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatemachineAccess().getInitialstateAssignment_5()); }
	(rule__Statemachine__InitialstateAssignment_5)
	{ after(grammarAccess.getStatemachineAccess().getInitialstateAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Statemachine__Group__6__Impl
	rule__Statemachine__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatemachineAccess().getGroup_6()); }
	(rule__Statemachine__Group_6__0)?
	{ after(grammarAccess.getStatemachineAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Statemachine__Group__7__Impl
	rule__Statemachine__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatemachineAccess().getGroup_7()); }
	(rule__Statemachine__Group_7__0)
	{ after(grammarAccess.getStatemachineAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Statemachine__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getStatemachineAccess().getRightCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Statemachine__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Statemachine__Group_6__0__Impl
	rule__Statemachine__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatemachineAccess().getStateAssignment_6_0()); }
	(rule__Statemachine__StateAssignment_6_0)
	{ after(grammarAccess.getStatemachineAccess().getStateAssignment_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Statemachine__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatemachineAccess().getStateAssignment_6_1()); }
	(rule__Statemachine__StateAssignment_6_1)*
	{ after(grammarAccess.getStatemachineAccess().getStateAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Statemachine__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Statemachine__Group_7__0__Impl
	rule__Statemachine__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatemachineAccess().getTransitionAssignment_7_0()); }
	(rule__Statemachine__TransitionAssignment_7_0)
	{ after(grammarAccess.getStatemachineAccess().getTransitionAssignment_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Statemachine__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStatemachineAccess().getTransitionAssignment_7_1()); }
	(rule__Statemachine__TransitionAssignment_7_1)*
	{ after(grammarAccess.getStatemachineAccess().getTransitionAssignment_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Channel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Channel__Group__0__Impl
	rule__Channel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Channel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChannelAccess().getChannelAction_0()); }
	()
	{ after(grammarAccess.getChannelAccess().getChannelAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Channel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Channel__Group__1__Impl
	rule__Channel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Channel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChannelAccess().getTypeAssignment_1()); }
	(rule__Channel__TypeAssignment_1)
	{ after(grammarAccess.getChannelAccess().getTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Channel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Channel__Group__2__Impl
	rule__Channel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Channel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChannelAccess().getChannelKeyword_2()); }
	'Channel'
	{ after(grammarAccess.getChannelAccess().getChannelKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Channel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Channel__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Channel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChannelAccess().getNameAssignment_3()); }
	(rule__Channel__NameAssignment_3)
	{ after(grammarAccess.getChannelAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__0__Impl
	rule__Transition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getTransitionAction_0()); }
	()
	{ after(grammarAccess.getTransitionAccess().getTransitionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__1__Impl
	rule__Transition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getTransitionKeyword_1()); }
	'Transition'
	{ after(grammarAccess.getTransitionAccess().getTransitionKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__2__Impl
	rule__Transition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getSourceAssignment_2()); }
	(rule__Transition__SourceAssignment_2)
	{ after(grammarAccess.getTransitionAccess().getSourceAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__3__Impl
	rule__Transition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3()); }
	'->'
	{ after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__4__Impl
	rule__Transition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4()); }
	'('
	{ after(grammarAccess.getTransitionAccess().getLeftParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__5__Impl
	rule__Transition__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getChannelAssignment_5()); }
	(rule__Transition__ChannelAssignment_5)
	{ after(grammarAccess.getTransitionAccess().getChannelAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__6__Impl
	rule__Transition__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_6()); }
	')'
	{ after(grammarAccess.getTransitionAccess().getRightParenthesisKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__7__Impl
	rule__Transition__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getTargetAssignment_7()); }
	(rule__Transition__TargetAssignment_7)
	{ after(grammarAccess.getTransitionAccess().getTargetAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getEventAssignment_8()); }
	(rule__Transition__EventAssignment_8)
	{ after(grammarAccess.getTransitionAccess().getEventAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__0__Impl
	rule__State__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getStateAction_0()); }
	()
	{ after(grammarAccess.getStateAccess().getStateAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__1__Impl
	rule__State__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getStateKeyword_1()); }
	'State'
	{ after(grammarAccess.getStateAccess().getStateKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getNameAssignment_2()); }
	(rule__State__NameAssignment_2)
	{ after(grammarAccess.getStateAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Network__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNetworkAccess().getNameEStringParserRuleCall_1_0()); }
		ruleEString
		{ after(grammarAccess.getNetworkAccess().getNameEStringParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Network__ChannelAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNetworkAccess().getChannelChannelParserRuleCall_3_0_0()); }
		ruleChannel
		{ after(grammarAccess.getNetworkAccess().getChannelChannelParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Network__ChannelAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNetworkAccess().getChannelChannelParserRuleCall_3_1_0()); }
		ruleChannel
		{ after(grammarAccess.getNetworkAccess().getChannelChannelParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Network__StatemachineAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNetworkAccess().getStatemachineStatemachineParserRuleCall_4_0_0()); }
		ruleStatemachine
		{ after(grammarAccess.getNetworkAccess().getStatemachineStatemachineParserRuleCall_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Network__StatemachineAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNetworkAccess().getStatemachineStatemachineParserRuleCall_4_1_0()); }
		ruleStatemachine
		{ after(grammarAccess.getNetworkAccess().getStatemachineStatemachineParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatemachineAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getStatemachineAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__InitialstateAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatemachineAccess().getInitialstateStateCrossReference_5_0()); }
		(
			{ before(grammarAccess.getStatemachineAccess().getInitialstateStateEStringParserRuleCall_5_0_1()); }
			ruleEString
			{ after(grammarAccess.getStatemachineAccess().getInitialstateStateEStringParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getStatemachineAccess().getInitialstateStateCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__StateAssignment_6_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_6_0_0()); }
		ruleState
		{ after(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_6_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__StateAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_6_1_0()); }
		ruleState
		{ after(grammarAccess.getStatemachineAccess().getStateStateParserRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__TransitionAssignment_7_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatemachineAccess().getTransitionTransitionParserRuleCall_7_0_0()); }
		ruleTransition
		{ after(grammarAccess.getStatemachineAccess().getTransitionTransitionParserRuleCall_7_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Statemachine__TransitionAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStatemachineAccess().getTransitionTransitionParserRuleCall_7_1_0()); }
		ruleTransition
		{ after(grammarAccess.getStatemachineAccess().getTransitionTransitionParserRuleCall_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Channel__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChannelAccess().getTypeTypeOfChannelEnumRuleCall_1_0()); }
		ruleTypeOfChannel
		{ after(grammarAccess.getChannelAccess().getTypeTypeOfChannelEnumRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Channel__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChannelAccess().getNameEStringParserRuleCall_3_0()); }
		ruleEString
		{ after(grammarAccess.getChannelAccess().getNameEStringParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__SourceAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getSourceStateCrossReference_2_0()); }
		(
			{ before(grammarAccess.getTransitionAccess().getSourceStateEStringParserRuleCall_2_0_1()); }
			ruleEString
			{ after(grammarAccess.getTransitionAccess().getSourceStateEStringParserRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getTransitionAccess().getSourceStateCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__ChannelAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getChannelChannelCrossReference_5_0()); }
		(
			{ before(grammarAccess.getTransitionAccess().getChannelChannelEStringParserRuleCall_5_0_1()); }
			ruleEString
			{ after(grammarAccess.getTransitionAccess().getChannelChannelEStringParserRuleCall_5_0_1()); }
		)
		{ after(grammarAccess.getTransitionAccess().getChannelChannelCrossReference_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__TargetAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_7_0()); }
		(
			{ before(grammarAccess.getTransitionAccess().getTargetStateEStringParserRuleCall_7_0_1()); }
			ruleEString
			{ after(grammarAccess.getTransitionAccess().getTargetStateEStringParserRuleCall_7_0_1()); }
		)
		{ after(grammarAccess.getTransitionAccess().getTargetStateCrossReference_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__EventAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getEventEventEnumRuleCall_8_0()); }
		ruleEvent
		{ after(grammarAccess.getTransitionAccess().getEventEventEnumRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
