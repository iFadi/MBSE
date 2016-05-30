/*
 * generated by Xtext 2.9.2
 */
package de.luh.se.mbse.statemachine.textualeditor.serializer;

import com.google.inject.Inject;
import de.luh.se.mbse.statemachine.textualeditor.amfRules.AmfRulesPackage;
import de.luh.se.mbse.statemachine.textualeditor.amfRules.Channel;
import de.luh.se.mbse.statemachine.textualeditor.amfRules.Network;
import de.luh.se.mbse.statemachine.textualeditor.amfRules.State;
import de.luh.se.mbse.statemachine.textualeditor.amfRules.Statemachine;
import de.luh.se.mbse.statemachine.textualeditor.amfRules.Transition;
import de.luh.se.mbse.statemachine.textualeditor.services.AMFGrammarAccess;
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
public class AMFSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AMFGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AmfRulesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AmfRulesPackage.CHANNEL:
				sequence_Channel(context, (Channel) semanticObject); 
				return; 
			case AmfRulesPackage.NETWORK:
				sequence_Network(context, (Network) semanticObject); 
				return; 
			case AmfRulesPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case AmfRulesPackage.STATEMACHINE:
				sequence_Statemachine(context, (Statemachine) semanticObject); 
				return; 
			case AmfRulesPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Channel returns Channel
	 *
	 * Constraint:
	 *     (Type+=TypeOfChannel name=EString)
	 */
	protected void sequence_Channel(ISerializationContext context, Channel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Network returns Network
	 *
	 * Constraint:
	 *     (name=EString channel+=Channel channel+=Channel* statemachine+=Statemachine statemachine+=Statemachine*)
	 */
	protected void sequence_Network(ISerializationContext context, Network semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AmfRulesPackage.Literals.STATE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AmfRulesPackage.Literals.STATE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statemachine returns Statemachine
	 *
	 * Constraint:
	 *     (name=EString initialstate=[State|EString] (state+=State state+=State*)? transition+=Transition transition+=Transition*)
	 */
	protected void sequence_Statemachine(ISerializationContext context, Statemachine semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (event=Event? source=[State|EString] target=[State|EString] channel=[Channel|EString])
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
