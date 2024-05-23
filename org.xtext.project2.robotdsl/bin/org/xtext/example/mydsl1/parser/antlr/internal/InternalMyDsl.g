/*
 * generated by Xtext 2.34.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl1.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl1.parser.antlr.internal;

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
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;

    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "RobotModel";
   	}

   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRobotModel
entryRuleRobotModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRobotModelRule()); }
	iv_ruleRobotModel=ruleRobotModel
	{ $current=$iv_ruleRobotModel.current; }
	EOF;

// Rule RobotModel
ruleRobotModel returns [EObject current=null]
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
					grammarAccess.getRobotModelAccess().getRobotModelAction_0(),
					$current);
			}
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getRobotModelAccess().getEventsEventParserRuleCall_1_0_0());
					}
					lv_events_1_0=ruleEvent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRobotModelRule());
						}
						add(
							$current,
							"events",
							lv_events_1_0,
							"org.xtext.example.mydsl1.MyDsl.Event");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				otherlv_2='Action:'
				{
					newLeafNode(otherlv_2, grammarAccess.getRobotModelAccess().getActionKeyword_1_1_0());
				}
				otherlv_3='-'
				{
					newLeafNode(otherlv_3, grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_1_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRobotModelAccess().getActionsActionParserRuleCall_1_1_2_0());
						}
						lv_actions_4_0=ruleAction
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRobotModelRule());
							}
							add(
								$current,
								"actions",
								lv_actions_4_0,
								"org.xtext.example.mydsl1.MyDsl.Action");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_5='-'
					{
						newLeafNode(otherlv_5, grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_1_3_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getRobotModelAccess().getActionsActionParserRuleCall_1_1_3_1_0());
							}
							lv_actions_6_0=ruleAction
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getRobotModelRule());
								}
								add(
									$current,
									"actions",
									lv_actions_6_0,
									"org.xtext.example.mydsl1.MyDsl.Action");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)
			    |
			(
				otherlv_7='Condition:'
				{
					newLeafNode(otherlv_7, grammarAccess.getRobotModelAccess().getConditionKeyword_1_2_0());
				}
				otherlv_8='-'
				{
					newLeafNode(otherlv_8, grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_2_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRobotModelAccess().getConditionsConditionParserRuleCall_1_2_2_0());
						}
						lv_conditions_9_0=ruleCondition
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRobotModelRule());
							}
							add(
								$current,
								"conditions",
								lv_conditions_9_0,
								"org.xtext.example.mydsl1.MyDsl.Condition");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_10='-'
					{
						newLeafNode(otherlv_10, grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_2_3_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getRobotModelAccess().getConditionsConditionParserRuleCall_1_2_3_1_0());
							}
							lv_conditions_11_0=ruleCondition
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getRobotModelRule());
								}
								add(
									$current,
									"conditions",
									lv_conditions_11_0,
									"org.xtext.example.mydsl1.MyDsl.Condition");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getRobotModelAccess().getExpressionsExpressionParserRuleCall_1_3_0());
					}
					lv_expressions_12_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRobotModelRule());
						}
						add(
							$current,
							"expressions",
							lv_expressions_12_0,
							"org.xtext.example.mydsl1.MyDsl.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getExpressionAccess().getPlusOrMinusParserRuleCall());
	}
	this_PlusOrMinus_0=rulePlusOrMinus
	{
		$current = $this_PlusOrMinus_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRulePlusOrMinus
entryRulePlusOrMinus returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlusOrMinusRule()); }
	iv_rulePlusOrMinus=rulePlusOrMinus
	{ $current=$iv_rulePlusOrMinus.current; }
	EOF;

// Rule PlusOrMinus
rulePlusOrMinus returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMultOrDivParserRuleCall_0());
		}
		this_MultOrDiv_0=ruleMultOrDiv
		{
			$current = $this_MultOrDiv_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getPlusOrMinusAccess().getExpressionLeftAction_1_0_0(),
							$current);
					}
				)
				(
					(
						(
							lv_operation_2_1='+'
							{
								newLeafNode(lv_operation_2_1, grammarAccess.getPlusOrMinusAccess().getOperationPlusSignKeyword_1_0_1_0_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getPlusOrMinusRule());
								}
								setWithLastConsumed($current, "operation", lv_operation_2_1, null);
							}
							    |
							lv_operation_2_2='-'
							{
								newLeafNode(lv_operation_2_2, grammarAccess.getPlusOrMinusAccess().getOperationHyphenMinusKeyword_1_0_1_0_1());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getPlusOrMinusRule());
								}
								setWithLastConsumed($current, "operation", lv_operation_2_2, null);
							}
						)
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMultOrDivParserRuleCall_1_1_0());
					}
					lv_right_3_0=ruleMultOrDiv
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.example.mydsl1.MyDsl.MultOrDiv");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMultOrDiv
entryRuleMultOrDiv returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultOrDivRule()); }
	iv_ruleMultOrDiv=ruleMultOrDiv
	{ $current=$iv_ruleMultOrDiv.current; }
	EOF;

// Rule MultOrDiv
ruleMultOrDiv returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMultOrDivAccess().getPrimaryParserRuleCall_0());
		}
		this_Primary_0=rulePrimary
		{
			$current = $this_Primary_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMultOrDivAccess().getExpressionLeftAction_1_0(),
						$current);
				}
			)
			(
				(
					(
						lv_operation_2_1='*'
						{
							newLeafNode(lv_operation_2_1, grammarAccess.getMultOrDivAccess().getOperationAsteriskKeyword_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMultOrDivRule());
							}
							setWithLastConsumed($current, "operation", lv_operation_2_1, null);
						}
						    |
						lv_operation_2_2='/'
						{
							newLeafNode(lv_operation_2_2, grammarAccess.getMultOrDivAccess().getOperationSolidusKeyword_1_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getMultOrDivRule());
							}
							setWithLastConsumed($current, "operation", lv_operation_2_2, null);
						}
					)
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getMultOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultOrDivRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.xtext.example.mydsl1.MyDsl.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	iv_rulePrimary=rulePrimary
	{ $current=$iv_rulePrimary.current; }
	EOF;

// Rule Primary
rulePrimary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='('
			{
				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
			}
			{
				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
			}
			this_Expression_1=ruleExpression
			{
				$current = $this_Expression_1.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_2=')'
			{
				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_1());
		}
		this_Atomic_3=ruleAtomic
		{
			$current = $this_Atomic_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAtomic
entryRuleAtomic returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtomicRule()); }
	iv_ruleAtomic=ruleAtomic
	{ $current=$iv_ruleAtomic.current; }
	EOF;

// Rule Atomic
ruleAtomic returns [EObject current=null]
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
					grammarAccess.getAtomicAccess().getExpressionAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAtomicAccess().getValueEIntParserRuleCall_1_0());
				}
				lv_value_1_0=ruleEInt
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAtomicRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"org.xtext.example.mydsl1.MyDsl.EInt");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEvent
entryRuleEvent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEventRule()); }
	iv_ruleEvent=ruleEvent
	{ $current=$iv_ruleEvent.current; }
	EOF;

// Rule Event
ruleEvent returns [EObject current=null]
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
					grammarAccess.getEventAccess().getEventAction_0(),
					$current);
			}
		)
		otherlv_1='Event'
		{
			newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEventKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEventRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.example.mydsl1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='conditions:'
			{
				newLeafNode(otherlv_3, grammarAccess.getEventAccess().getConditionsKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEventRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getEventAccess().getConditionsConditionCrossReference_3_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5='and'
				{
					newLeafNode(otherlv_5, grammarAccess.getEventAccess().getAndKeyword_3_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getEventRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getEventAccess().getConditionsConditionCrossReference_3_2_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		(
			otherlv_7='actions:'
			{
				newLeafNode(otherlv_7, grammarAccess.getEventAccess().getActionsKeyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEventRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getEventAccess().getActionsActionCrossReference_4_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_9=','
				{
					newLeafNode(otherlv_9, grammarAccess.getEventAccess().getCommaKeyword_4_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getEventRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getEventAccess().getActionsActionCrossReference_4_2_1_0());
						}
						ruleEString
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
	)
;

// Entry rule entryRuleCondition
entryRuleCondition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionRule()); }
	iv_ruleCondition=ruleCondition
	{ $current=$iv_ruleCondition.current; }
	EOF;

// Rule Condition
ruleCondition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getConditionAccess().getButtonParserRuleCall_0());
		}
		this_Button_0=ruleButton
		{
			$current = $this_Button_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConditionAccess().getSensorParserRuleCall_1());
		}
		this_Sensor_1=ruleSensor
		{
			$current = $this_Sensor_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConditionAccess().getSoundParserRuleCall_2());
		}
		this_Sound_2=ruleSound
		{
			$current = $this_Sound_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getConditionAccess().getTapParserRuleCall_3());
		}
		this_Tap_3=ruleTap
		{
			$current = $this_Tap_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSound
entryRuleSound returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSoundRule()); }
	iv_ruleSound=ruleSound
	{ $current=$iv_ruleSound.current; }
	EOF;

// Rule Sound
ruleSound returns [EObject current=null]
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
					grammarAccess.getSoundAccess().getSoundAction_0(),
					$current);
			}
		)
		otherlv_1='Sound'
		{
			newLeafNode(otherlv_1, grammarAccess.getSoundAccess().getSoundKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSoundAccess().getConditionnameEStringParserRuleCall_2_0());
				}
				lv_conditionname_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSoundRule());
					}
					set(
						$current,
						"conditionname",
						lv_conditionname_2_0,
						"org.xtext.example.mydsl1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleButton
entryRuleButton returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getButtonRule()); }
	iv_ruleButton=ruleButton
	{ $current=$iv_ruleButton.current; }
	EOF;

// Rule Button
ruleButton returns [EObject current=null]
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
					grammarAccess.getButtonAccess().getButtonAction_0(),
					$current);
			}
		)
		otherlv_1='Button'
		{
			newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getButtonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getButtonAccess().getConditionnameEStringParserRuleCall_2_0());
				}
				lv_conditionname_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getButtonRule());
					}
					set(
						$current,
						"conditionname",
						lv_conditionname_2_0,
						"org.xtext.example.mydsl1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='button'
		{
			newLeafNode(otherlv_3, grammarAccess.getButtonAccess().getButtonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getButtonAccess().getButtonButtonTypeEnumRuleCall_4_0());
				}
				lv_button_4_0=ruleButtonType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getButtonRule());
					}
					set(
						$current,
						"button",
						lv_button_4_0,
						"org.xtext.example.mydsl1.MyDsl.ButtonType");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSensor
entryRuleSensor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSensorRule()); }
	iv_ruleSensor=ruleSensor
	{ $current=$iv_ruleSensor.current; }
	EOF;

// Rule Sensor
ruleSensor returns [EObject current=null]
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
					grammarAccess.getSensorAccess().getSensorAction_0(),
					$current);
			}
		)
		otherlv_1='Sensor'
		{
			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSensorAccess().getConditionnameEStringParserRuleCall_2_0());
				}
				lv_conditionname_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSensorRule());
					}
					set(
						$current,
						"conditionname",
						lv_conditionname_2_0,
						"org.xtext.example.mydsl1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='sensorPos'
		{
			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getSensorPosKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSensorAccess().getPosExExpressionParserRuleCall_4_0());
				}
				lv_posEx_4_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSensorRule());
					}
					set(
						$current,
						"posEx",
						lv_posEx_4_0,
						"org.xtext.example.mydsl1.MyDsl.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='detectObstacle'
		{
			newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getDetectObstacleKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSensorAccess().getDistanceDistanceEnumRuleCall_6_0());
				}
				lv_distance_6_0=ruleDistance
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSensorRule());
					}
					set(
						$current,
						"distance",
						lv_distance_6_0,
						"org.xtext.example.mydsl1.MyDsl.Distance");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTap
entryRuleTap returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTapRule()); }
	iv_ruleTap=ruleTap
	{ $current=$iv_ruleTap.current; }
	EOF;

// Rule Tap
ruleTap returns [EObject current=null]
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
					grammarAccess.getTapAccess().getTapAction_0(),
					$current);
			}
		)
		otherlv_1='Tap'
		{
			newLeafNode(otherlv_1, grammarAccess.getTapAccess().getTapKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTapAccess().getConditionnameEStringParserRuleCall_2_0());
				}
				lv_conditionname_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTapRule());
					}
					set(
						$current,
						"conditionname",
						lv_conditionname_2_0,
						"org.xtext.example.mydsl1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getActionAccess().getMotorActionParserRuleCall_0());
		}
		this_MotorAction_0=ruleMotorAction
		{
			$current = $this_MotorAction_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getSoundActionParserRuleCall_1());
		}
		this_SoundAction_1=ruleSoundAction
		{
			$current = $this_SoundAction_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getLightActionParserRuleCall_2());
		}
		this_LightAction_2=ruleLightAction
		{
			$current = $this_LightAction_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMotorAction
entryRuleMotorAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMotorActionRule()); }
	iv_ruleMotorAction=ruleMotorAction
	{ $current=$iv_ruleMotorAction.current; }
	EOF;

// Rule MotorAction
ruleMotorAction returns [EObject current=null]
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
					grammarAccess.getMotorActionAccess().getMotorActionAction_0(),
					$current);
			}
		)
		otherlv_1='MotorAction'
		{
			newLeafNode(otherlv_1, grammarAccess.getMotorActionAccess().getMotorActionKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMotorActionAccess().getActionnameEStringParserRuleCall_2_0());
				}
				lv_actionname_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMotorActionRule());
					}
					set(
						$current,
						"actionname",
						lv_actionname_2_0,
						"org.xtext.example.mydsl1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='motorLeft'
			{
				newLeafNode(otherlv_3, grammarAccess.getMotorActionAccess().getMotorLeftKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMotorActionAccess().getLeftExpressionParserRuleCall_3_1_0());
					}
					lv_left_4_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMotorActionRule());
						}
						set(
							$current,
							"left",
							lv_left_4_0,
							"org.xtext.example.mydsl1.MyDsl.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='motorRight'
			{
				newLeafNode(otherlv_5, grammarAccess.getMotorActionAccess().getMotorRightKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMotorActionAccess().getRightExpressionParserRuleCall_4_1_0());
					}
					lv_right_6_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMotorActionRule());
						}
						set(
							$current,
							"right",
							lv_right_6_0,
							"org.xtext.example.mydsl1.MyDsl.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleSoundAction
entryRuleSoundAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSoundActionRule()); }
	iv_ruleSoundAction=ruleSoundAction
	{ $current=$iv_ruleSoundAction.current; }
	EOF;

// Rule SoundAction
ruleSoundAction returns [EObject current=null]
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
					grammarAccess.getSoundActionAccess().getSoundActionAction_0(),
					$current);
			}
		)
		otherlv_1='SoundAction'
		{
			newLeafNode(otherlv_1, grammarAccess.getSoundActionAccess().getSoundActionKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSoundActionAccess().getActionnameEStringParserRuleCall_2_0());
				}
				lv_actionname_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSoundActionRule());
					}
					set(
						$current,
						"actionname",
						lv_actionname_2_0,
						"org.xtext.example.mydsl1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3='set:'
			{
				newLeafNode(otherlv_3, grammarAccess.getSoundActionAccess().getSetKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSoundActionAccess().getMusicsettingsMusicSettingParserRuleCall_3_1_0());
					}
					lv_musicsettings_4_0=ruleMusicSetting
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSoundActionRule());
						}
						add(
							$current,
							"musicsettings",
							lv_musicsettings_4_0,
							"org.xtext.example.mydsl1.MyDsl.MusicSetting");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getSoundActionAccess().getCommaKeyword_3_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSoundActionAccess().getMusicsettingsMusicSettingParserRuleCall_3_2_1_0());
						}
						lv_musicsettings_6_0=ruleMusicSetting
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSoundActionRule());
							}
							add(
								$current,
								"musicsettings",
								lv_musicsettings_6_0,
								"org.xtext.example.mydsl1.MyDsl.MusicSetting");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
	)
;

// Entry rule entryRuleLightAction
entryRuleLightAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLightActionRule()); }
	iv_ruleLightAction=ruleLightAction
	{ $current=$iv_ruleLightAction.current; }
	EOF;

// Rule LightAction
ruleLightAction returns [EObject current=null]
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
					grammarAccess.getLightActionAccess().getLightActionAction_0(),
					$current);
			}
		)
		otherlv_1='LightAction'
		{
			newLeafNode(otherlv_1, grammarAccess.getLightActionAccess().getLightActionKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLightActionAccess().getActionnameEStringParserRuleCall_2_0());
				}
				lv_actionname_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLightActionRule());
					}
					set(
						$current,
						"actionname",
						lv_actionname_2_0,
						"org.xtext.example.mydsl1.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3='pos:'
		{
			newLeafNode(otherlv_3, grammarAccess.getLightActionAccess().getPosKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLightActionAccess().getPosLightPosEnumRuleCall_4_0());
				}
				lv_pos_4_0=ruleLightPos
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLightActionRule());
					}
					set(
						$current,
						"pos",
						lv_pos_4_0,
						"org.xtext.example.mydsl1.MyDsl.LightPos");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_5='red:'
			{
				newLeafNode(otherlv_5, grammarAccess.getLightActionAccess().getRedKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLightActionAccess().getRedExExpressionParserRuleCall_5_1_0());
					}
					lv_redEx_6_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLightActionRule());
						}
						set(
							$current,
							"redEx",
							lv_redEx_6_0,
							"org.xtext.example.mydsl1.MyDsl.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='green:'
			{
				newLeafNode(otherlv_7, grammarAccess.getLightActionAccess().getGreenKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLightActionAccess().getGreenExExpressionParserRuleCall_6_1_0());
					}
					lv_greenEx_8_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLightActionRule());
						}
						set(
							$current,
							"greenEx",
							lv_greenEx_8_0,
							"org.xtext.example.mydsl1.MyDsl.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_9='blue:'
			{
				newLeafNode(otherlv_9, grammarAccess.getLightActionAccess().getBlueKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getLightActionAccess().getBlueExExpressionParserRuleCall_7_1_0());
					}
					lv_blueEx_10_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLightActionRule());
						}
						set(
							$current,
							"blueEx",
							lv_blueEx_10_0,
							"org.xtext.example.mydsl1.MyDsl.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleMusicSetting
entryRuleMusicSetting returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMusicSettingRule()); }
	iv_ruleMusicSetting=ruleMusicSetting
	{ $current=$iv_ruleMusicSetting.current; }
	EOF;

// Rule MusicSetting
ruleMusicSetting returns [EObject current=null]
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
					grammarAccess.getMusicSettingAccess().getMusicSettingAction_0(),
					$current);
			}
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getMusicSettingAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMusicSettingAccess().getNoteExExpressionParserRuleCall_2_0());
				}
				lv_noteEx_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMusicSettingRule());
					}
					set(
						$current,
						"noteEx",
						lv_noteEx_2_0,
						"org.xtext.example.mydsl1.MyDsl.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=','
		{
			newLeafNode(otherlv_3, grammarAccess.getMusicSettingAccess().getCommaKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMusicSettingAccess().getDurationDurationEnumRuleCall_4_0());
				}
				lv_duration_4_0=ruleDuration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMusicSettingRule());
					}
					set(
						$current,
						"duration",
						lv_duration_4_0,
						"org.xtext.example.mydsl1.MyDsl.Duration");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=','
		{
			newLeafNode(otherlv_5, grammarAccess.getMusicSettingAccess().getCommaKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMusicSettingAccess().getPosExExpressionParserRuleCall_6_0());
				}
				lv_posEx_6_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMusicSettingRule());
					}
					set(
						$current,
						"posEx",
						lv_posEx_6_0,
						"org.xtext.example.mydsl1.MyDsl.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getMusicSettingAccess().getRightParenthesisKeyword_7());
		}
	)
;

// Entry rule entryRuleEInt
entryRuleEInt returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEIntRule()); }
	iv_ruleEInt=ruleEInt
	{ $current=$iv_ruleEInt.current.getText(); }
	EOF;

// Rule EInt
ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='-'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
			}
		)?
		this_INT_1=RULE_INT
		{
			$current.merge(this_INT_1);
		}
		{
			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
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

// Rule Duration
ruleDuration returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='NONE'
			{
				$current = grammarAccess.getDurationAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDurationAccess().getNONEEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='MEDIUM'
			{
				$current = grammarAccess.getDurationAccess().getMEDIUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDurationAccess().getMEDIUMEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='LONG'
			{
				$current = grammarAccess.getDurationAccess().getLONGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getDurationAccess().getLONGEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule LightPos
ruleLightPos returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='TOP'
			{
				$current = grammarAccess.getLightPosAccess().getTOPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getLightPosAccess().getTOPEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='BOT'
			{
				$current = grammarAccess.getLightPosAccess().getBOTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getLightPosAccess().getBOTEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule Distance
ruleDistance returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='OBSTACLE'
			{
				$current = grammarAccess.getDistanceAccess().getFAREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getDistanceAccess().getFAREnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='NOOBSTACLE'
			{
				$current = grammarAccess.getDistanceAccess().getCLOSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getDistanceAccess().getCLOSEEnumLiteralDeclaration_1());
			}
		)
	)
;

// Rule ButtonType
ruleButtonType returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='BACKWARD'
			{
				$current = grammarAccess.getButtonTypeAccess().getBACKWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getButtonTypeAccess().getBACKWARDEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='LEFT'
			{
				$current = grammarAccess.getButtonTypeAccess().getLEFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getButtonTypeAccess().getLEFTEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='RIGHT'
			{
				$current = grammarAccess.getButtonTypeAccess().getRIGHTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getButtonTypeAccess().getRIGHTEnumLiteralDeclaration_2());
			}
		)
		    |
		(
			enumLiteral_3='CENTER'
			{
				$current = grammarAccess.getButtonTypeAccess().getCENTEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_3, grammarAccess.getButtonTypeAccess().getCENTEREnumLiteralDeclaration_3());
			}
		)
		    |
		(
			enumLiteral_4='FORWARD'
			{
				$current = grammarAccess.getButtonTypeAccess().getFORWARDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_4, grammarAccess.getButtonTypeAccess().getFORWARDEnumLiteralDeclaration_4());
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
