/*
 * generated by Xtext 2.34.0
 */
package org.xtext.example.mydsl1.serializer;

import com.google.inject.Inject;
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
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;
import project2.Button;
import project2.Event;
import project2.Expression;
import project2.LightAction;
import project2.MotorAction;
import project2.MusicSetting;
import project2.Project2Package;
import project2.RobotModel;
import project2.Sensor;
import project2.Sound;
import project2.SoundAction;
import project2.Tap;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Project2Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Project2Package.BUTTON:
				sequence_Button(context, (Button) semanticObject); 
				return; 
			case Project2Package.EVENT:
				sequence_Event(context, (Event) semanticObject); 
				return; 
			case Project2Package.EXPRESSION:
				if (rule == grammarAccess.getExpressionRule()
						|| rule == grammarAccess.getOrRule()
						|| action == grammarAccess.getOrAccess().getExpressionLeftAction_1_0()
						|| rule == grammarAccess.getAndRule()
						|| action == grammarAccess.getAndAccess().getExpressionLeftAction_1_0()
						|| rule == grammarAccess.getEqualityRule()
						|| action == grammarAccess.getEqualityAccess().getExpressionLeftAction_1_0()
						|| rule == grammarAccess.getComparisonRule()
						|| action == grammarAccess.getComparisonAccess().getExpressionLeftAction_1_0()
						|| rule == grammarAccess.getPlusOrMinusRule()
						|| action == grammarAccess.getPlusOrMinusAccess().getExpressionLeftAction_1_0_0()
						|| rule == grammarAccess.getMultOrDivRule()
						|| action == grammarAccess.getMultOrDivAccess().getExpressionLeftAction_1_0()
						|| rule == grammarAccess.getPrimaryRule()) {
					sequence_And_Atomic_Comparison_Equality_If_MultOrDiv_Or_PlusOrMinus_Primary(context, (Expression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getAtomicRule()) {
					sequence_Atomic(context, (Expression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getElseRule()) {
					sequence_Else(context, (Expression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getIfRule()) {
					sequence_If(context, (Expression) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getThenRule()) {
					sequence_Then(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case Project2Package.LIGHT_ACTION:
				sequence_LightAction(context, (LightAction) semanticObject); 
				return; 
			case Project2Package.MOTOR_ACTION:
				sequence_MotorAction(context, (MotorAction) semanticObject); 
				return; 
			case Project2Package.MUSIC_SETTING:
				sequence_MusicSetting(context, (MusicSetting) semanticObject); 
				return; 
			case Project2Package.ROBOT_MODEL:
				sequence_RobotModel(context, (RobotModel) semanticObject); 
				return; 
			case Project2Package.SENSOR:
				sequence_Sensor(context, (Sensor) semanticObject); 
				return; 
			case Project2Package.SOUND:
				sequence_Sound(context, (Sound) semanticObject); 
				return; 
			case Project2Package.SOUND_ACTION:
				sequence_SoundAction(context, (SoundAction) semanticObject); 
				return; 
			case Project2Package.TAP:
				sequence_Tap(context, (Tap) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns Expression
	 *     Or returns Expression
	 *     Or.Expression_1_0 returns Expression
	 *     And returns Expression
	 *     And.Expression_1_0 returns Expression
	 *     Equality returns Expression
	 *     Equality.Expression_1_0 returns Expression
	 *     Comparison returns Expression
	 *     Comparison.Expression_1_0 returns Expression
	 *     PlusOrMinus returns Expression
	 *     PlusOrMinus.Expression_1_0_0 returns Expression
	 *     MultOrDiv returns Expression
	 *     MultOrDiv.Expression_1_0 returns Expression
	 *     Primary returns Expression
	 *
	 * Constraint:
	 *     (
	 *         (left=Or_Expression_1_0 operation='||' right=And) | 
	 *         (left=And_Expression_1_0 operation='&&' right=Equality) | 
	 *         (left=Equality_Expression_1_0 (operation='==' | operation='!=') right=Comparison) | 
	 *         (left=Comparison_Expression_1_0 (operation='&gt;=' | operation='&lt;=' | operation='&gt;' | operation='&lt;') right=PlusOrMinus) | 
	 *         (operation='if' left=Expression right=Then) | 
	 *         (left=PlusOrMinus_Expression_1_0_0 (operation='+' | operation='-') right=MultOrDiv) | 
	 *         (left=MultOrDiv_Expression_1_0 (operation='*' | operation='/') right=Primary) | 
	 *         (operation='!' left=Primary) | 
	 *         value=EInt | 
	 *         bool='TRUE' | 
	 *         bool='FALSE'
	 *     )
	 * </pre>
	 */
	protected void sequence_And_Atomic_Comparison_Equality_If_MultOrDiv_Or_PlusOrMinus_Primary(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Atomic returns Expression
	 *
	 * Constraint:
	 *     (value=EInt | bool='TRUE' | bool='FALSE')
	 * </pre>
	 */
	protected void sequence_Atomic(ISerializationContext context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Condition returns Button
	 *     Button returns Button
	 *
	 * Constraint:
	 *     (conditionname=EString button=ButtonType)
	 * </pre>
	 */
	protected void sequence_Button(ISerializationContext context, Button semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Project2Package.Literals.CONDITION__CONDITIONNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Project2Package.Literals.CONDITION__CONDITIONNAME));
			if (transientValues.isValueTransient(semanticObject, Project2Package.Literals.BUTTON__BUTTON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Project2Package.Literals.BUTTON__BUTTON));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getButtonAccess().getConditionnameEStringParserRuleCall_2_0(), semanticObject.getConditionname());
		feeder.accept(grammarAccess.getButtonAccess().getButtonButtonTypeEnumRuleCall_4_0(), semanticObject.getButton());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Else returns Expression
	 *
	 * Constraint:
	 *     (operation='else' left=Expression)
	 * </pre>
	 */
	protected void sequence_Else(ISerializationContext context, Expression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Project2Package.Literals.EXPRESSION__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Project2Package.Literals.EXPRESSION__OPERATION));
			if (transientValues.isValueTransient(semanticObject, Project2Package.Literals.EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Project2Package.Literals.EXPRESSION__LEFT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getElseAccess().getOperationElseKeyword_1_0(), semanticObject.getOperation());
		feeder.accept(grammarAccess.getElseAccess().getLeftExpressionParserRuleCall_2_0(), semanticObject.getLeft());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Event returns Event
	 *
	 * Constraint:
	 *     (name=EString (conditions+=[Condition|EString] conditions+=[Condition|EString]*)? (actions+=[Action|EString] actions+=[Action|EString]*)?)
	 * </pre>
	 */
	protected void sequence_Event(ISerializationContext context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     If returns Expression
	 *
	 * Constraint:
	 *     (operation='if' left=Expression right=Then)
	 * </pre>
	 */
	protected void sequence_If(ISerializationContext context, Expression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Project2Package.Literals.EXPRESSION__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Project2Package.Literals.EXPRESSION__OPERATION));
			if (transientValues.isValueTransient(semanticObject, Project2Package.Literals.EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Project2Package.Literals.EXPRESSION__LEFT));
			if (transientValues.isValueTransient(semanticObject, Project2Package.Literals.EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Project2Package.Literals.EXPRESSION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIfAccess().getOperationIfKeyword_1_0(), semanticObject.getOperation());
		feeder.accept(grammarAccess.getIfAccess().getLeftExpressionParserRuleCall_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getIfAccess().getRightThenParserRuleCall_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Action returns LightAction
	 *     LightAction returns LightAction
	 *
	 * Constraint:
	 *     (actionname=EString pos=LightPos red=EInt? green=EInt? blue=EInt?)
	 * </pre>
	 */
	protected void sequence_LightAction(ISerializationContext context, LightAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Action returns MotorAction
	 *     MotorAction returns MotorAction
	 *
	 * Constraint:
	 *     (actionname=EString left=Expression? right=Expression?)
	 * </pre>
	 */
	protected void sequence_MotorAction(ISerializationContext context, MotorAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     MusicSetting returns MusicSetting
	 *
	 * Constraint:
	 *     (note=EInt duration=Duration pos=EInt)
	 * </pre>
	 */
	protected void sequence_MusicSetting(ISerializationContext context, MusicSetting semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Project2Package.Literals.MUSIC_SETTING__NOTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Project2Package.Literals.MUSIC_SETTING__NOTE));
			if (transientValues.isValueTransient(semanticObject, Project2Package.Literals.MUSIC_SETTING__DURATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Project2Package.Literals.MUSIC_SETTING__DURATION));
			if (transientValues.isValueTransient(semanticObject, Project2Package.Literals.MUSIC_SETTING__POS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Project2Package.Literals.MUSIC_SETTING__POS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMusicSettingAccess().getNoteEIntParserRuleCall_2_0(), semanticObject.getNote());
		feeder.accept(grammarAccess.getMusicSettingAccess().getDurationDurationEnumRuleCall_4_0(), semanticObject.getDuration());
		feeder.accept(grammarAccess.getMusicSettingAccess().getPosEIntParserRuleCall_6_0(), semanticObject.getPos());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     RobotModel returns RobotModel
	 *
	 * Constraint:
	 *     ((events+=Event | expressions+=Expression)? (actions+=Action actions+=Action*)? (conditions+=Condition conditions+=Condition*)?)+
	 * </pre>
	 */
	protected void sequence_RobotModel(ISerializationContext context, RobotModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Condition returns Sensor
	 *     Sensor returns Sensor
	 *
	 * Constraint:
	 *     (conditionname=EString sensorPos=EInt distance=Distance)
	 * </pre>
	 */
	protected void sequence_Sensor(ISerializationContext context, Sensor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Project2Package.Literals.CONDITION__CONDITIONNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Project2Package.Literals.CONDITION__CONDITIONNAME));
			if (transientValues.isValueTransient(semanticObject, Project2Package.Literals.SENSOR__SENSOR_POS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Project2Package.Literals.SENSOR__SENSOR_POS));
			if (transientValues.isValueTransient(semanticObject, Project2Package.Literals.SENSOR__DISTANCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Project2Package.Literals.SENSOR__DISTANCE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSensorAccess().getConditionnameEStringParserRuleCall_2_0(), semanticObject.getConditionname());
		feeder.accept(grammarAccess.getSensorAccess().getSensorPosEIntParserRuleCall_4_0(), semanticObject.getSensorPos());
		feeder.accept(grammarAccess.getSensorAccess().getDistanceDistanceEnumRuleCall_6_0(), semanticObject.getDistance());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Action returns SoundAction
	 *     SoundAction returns SoundAction
	 *
	 * Constraint:
	 *     (actionname=EString (musicsettings+=MusicSetting musicsettings+=MusicSetting*)?)
	 * </pre>
	 */
	protected void sequence_SoundAction(ISerializationContext context, SoundAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Condition returns Sound
	 *     Sound returns Sound
	 *
	 * Constraint:
	 *     conditionname=EString
	 * </pre>
	 */
	protected void sequence_Sound(ISerializationContext context, Sound semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Project2Package.Literals.CONDITION__CONDITIONNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Project2Package.Literals.CONDITION__CONDITIONNAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSoundAccess().getConditionnameEStringParserRuleCall_2_0(), semanticObject.getConditionname());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Condition returns Tap
	 *     Tap returns Tap
	 *
	 * Constraint:
	 *     conditionname=EString
	 * </pre>
	 */
	protected void sequence_Tap(ISerializationContext context, Tap semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Project2Package.Literals.CONDITION__CONDITIONNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Project2Package.Literals.CONDITION__CONDITIONNAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTapAccess().getConditionnameEStringParserRuleCall_2_0(), semanticObject.getConditionname());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Then returns Expression
	 *
	 * Constraint:
	 *     (operation='then' left=Expression right=Else)
	 * </pre>
	 */
	protected void sequence_Then(ISerializationContext context, Expression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Project2Package.Literals.EXPRESSION__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Project2Package.Literals.EXPRESSION__OPERATION));
			if (transientValues.isValueTransient(semanticObject, Project2Package.Literals.EXPRESSION__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Project2Package.Literals.EXPRESSION__LEFT));
			if (transientValues.isValueTransient(semanticObject, Project2Package.Literals.EXPRESSION__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Project2Package.Literals.EXPRESSION__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getThenAccess().getOperationThenKeyword_1_0(), semanticObject.getOperation());
		feeder.accept(grammarAccess.getThenAccess().getLeftExpressionParserRuleCall_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getThenAccess().getRightElseParserRuleCall_3_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
}
