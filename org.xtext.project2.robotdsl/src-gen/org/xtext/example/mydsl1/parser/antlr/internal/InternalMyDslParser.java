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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Action:'", "'-'", "'Condition:'", "'+'", "'*'", "'/'", "'('", "')'", "'Event'", "'conditions:'", "'and'", "'actions:'", "','", "'Sound'", "'Button'", "'button'", "'Sensor'", "'sensorPos'", "'detectObstacle'", "'Tap'", "'MotorAction'", "'motorLeft'", "'motorRight'", "'SoundAction'", "'set:'", "'LightAction'", "'pos:'", "'red:'", "'green:'", "'blue:'", "'NONE'", "'MEDIUM'", "'LONG'", "'TOP'", "'BOT'", "'OBSTACLE'", "'NOOBSTACLE'", "'BACKWARD'", "'LEFT'", "'RIGHT'", "'CENTER'", "'FORWARD'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



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




    // $ANTLR start "entryRuleRobotModel"
    // InternalMyDsl.g:65:1: entryRuleRobotModel returns [EObject current=null] : iv_ruleRobotModel= ruleRobotModel EOF ;
    public final EObject entryRuleRobotModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotModel = null;


        try {
            // InternalMyDsl.g:65:51: (iv_ruleRobotModel= ruleRobotModel EOF )
            // InternalMyDsl.g:66:2: iv_ruleRobotModel= ruleRobotModel EOF
            {
             newCompositeNode(grammarAccess.getRobotModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobotModel=ruleRobotModel();

            state._fsp--;

             current =iv_ruleRobotModel; 
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
    // $ANTLR end "entryRuleRobotModel"


    // $ANTLR start "ruleRobotModel"
    // InternalMyDsl.g:72:1: ruleRobotModel returns [EObject current=null] : ( () ( ( (lv_events_1_0= ruleEvent ) ) | (otherlv_2= 'Action:' otherlv_3= '-' ( (lv_actions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_actions_6_0= ruleAction ) ) )* ) | (otherlv_7= 'Condition:' otherlv_8= '-' ( (lv_conditions_9_0= ruleCondition ) ) (otherlv_10= '-' ( (lv_conditions_11_0= ruleCondition ) ) )* ) | ( (lv_expressions_12_0= ruleExpression ) ) )* ) ;
    public final EObject ruleRobotModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_events_1_0 = null;

        EObject lv_actions_4_0 = null;

        EObject lv_actions_6_0 = null;

        EObject lv_conditions_9_0 = null;

        EObject lv_conditions_11_0 = null;

        EObject lv_expressions_12_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( () ( ( (lv_events_1_0= ruleEvent ) ) | (otherlv_2= 'Action:' otherlv_3= '-' ( (lv_actions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_actions_6_0= ruleAction ) ) )* ) | (otherlv_7= 'Condition:' otherlv_8= '-' ( (lv_conditions_9_0= ruleCondition ) ) (otherlv_10= '-' ( (lv_conditions_11_0= ruleCondition ) ) )* ) | ( (lv_expressions_12_0= ruleExpression ) ) )* ) )
            // InternalMyDsl.g:79:2: ( () ( ( (lv_events_1_0= ruleEvent ) ) | (otherlv_2= 'Action:' otherlv_3= '-' ( (lv_actions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_actions_6_0= ruleAction ) ) )* ) | (otherlv_7= 'Condition:' otherlv_8= '-' ( (lv_conditions_9_0= ruleCondition ) ) (otherlv_10= '-' ( (lv_conditions_11_0= ruleCondition ) ) )* ) | ( (lv_expressions_12_0= ruleExpression ) ) )* )
            {
            // InternalMyDsl.g:79:2: ( () ( ( (lv_events_1_0= ruleEvent ) ) | (otherlv_2= 'Action:' otherlv_3= '-' ( (lv_actions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_actions_6_0= ruleAction ) ) )* ) | (otherlv_7= 'Condition:' otherlv_8= '-' ( (lv_conditions_9_0= ruleCondition ) ) (otherlv_10= '-' ( (lv_conditions_11_0= ruleCondition ) ) )* ) | ( (lv_expressions_12_0= ruleExpression ) ) )* )
            // InternalMyDsl.g:80:3: () ( ( (lv_events_1_0= ruleEvent ) ) | (otherlv_2= 'Action:' otherlv_3= '-' ( (lv_actions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_actions_6_0= ruleAction ) ) )* ) | (otherlv_7= 'Condition:' otherlv_8= '-' ( (lv_conditions_9_0= ruleCondition ) ) (otherlv_10= '-' ( (lv_conditions_11_0= ruleCondition ) ) )* ) | ( (lv_expressions_12_0= ruleExpression ) ) )*
            {
            // InternalMyDsl.g:80:3: ()
            // InternalMyDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotModelAccess().getRobotModelAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:87:3: ( ( (lv_events_1_0= ruleEvent ) ) | (otherlv_2= 'Action:' otherlv_3= '-' ( (lv_actions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_actions_6_0= ruleAction ) ) )* ) | (otherlv_7= 'Condition:' otherlv_8= '-' ( (lv_conditions_9_0= ruleCondition ) ) (otherlv_10= '-' ( (lv_conditions_11_0= ruleCondition ) ) )* ) | ( (lv_expressions_12_0= ruleExpression ) ) )*
            loop3:
            do {
                int alt3=5;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    alt3=1;
                    }
                    break;
                case 11:
                    {
                    alt3=2;
                    }
                    break;
                case 13:
                    {
                    alt3=3;
                    }
                    break;
                case RULE_INT:
                case 12:
                case 17:
                    {
                    alt3=4;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:88:4: ( (lv_events_1_0= ruleEvent ) )
            	    {
            	    // InternalMyDsl.g:88:4: ( (lv_events_1_0= ruleEvent ) )
            	    // InternalMyDsl.g:89:5: (lv_events_1_0= ruleEvent )
            	    {
            	    // InternalMyDsl.g:89:5: (lv_events_1_0= ruleEvent )
            	    // InternalMyDsl.g:90:6: lv_events_1_0= ruleEvent
            	    {

            	    						newCompositeNode(grammarAccess.getRobotModelAccess().getEventsEventParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_events_1_0=ruleEvent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRobotModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"events",
            	    							lv_events_1_0,
            	    							"org.xtext.example.mydsl1.MyDsl.Event");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:108:4: (otherlv_2= 'Action:' otherlv_3= '-' ( (lv_actions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_actions_6_0= ruleAction ) ) )* )
            	    {
            	    // InternalMyDsl.g:108:4: (otherlv_2= 'Action:' otherlv_3= '-' ( (lv_actions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_actions_6_0= ruleAction ) ) )* )
            	    // InternalMyDsl.g:109:5: otherlv_2= 'Action:' otherlv_3= '-' ( (lv_actions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_actions_6_0= ruleAction ) ) )*
            	    {
            	    otherlv_2=(Token)match(input,11,FOLLOW_4); 

            	    					newLeafNode(otherlv_2, grammarAccess.getRobotModelAccess().getActionKeyword_1_1_0());
            	    				
            	    otherlv_3=(Token)match(input,12,FOLLOW_5); 

            	    					newLeafNode(otherlv_3, grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_1_1());
            	    				
            	    // InternalMyDsl.g:117:5: ( (lv_actions_4_0= ruleAction ) )
            	    // InternalMyDsl.g:118:6: (lv_actions_4_0= ruleAction )
            	    {
            	    // InternalMyDsl.g:118:6: (lv_actions_4_0= ruleAction )
            	    // InternalMyDsl.g:119:7: lv_actions_4_0= ruleAction
            	    {

            	    							newCompositeNode(grammarAccess.getRobotModelAccess().getActionsActionParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_3);
            	    lv_actions_4_0=ruleAction();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getRobotModelRule());
            	    							}
            	    							add(
            	    								current,
            	    								"actions",
            	    								lv_actions_4_0,
            	    								"org.xtext.example.mydsl1.MyDsl.Action");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMyDsl.g:136:5: (otherlv_5= '-' ( (lv_actions_6_0= ruleAction ) ) )*
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==12) ) {
            	            int LA1_2 = input.LA(2);

            	            if ( (LA1_2==31||LA1_2==34||LA1_2==36) ) {
            	                alt1=1;
            	            }


            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:137:6: otherlv_5= '-' ( (lv_actions_6_0= ruleAction ) )
            	    	    {
            	    	    otherlv_5=(Token)match(input,12,FOLLOW_5); 

            	    	    						newLeafNode(otherlv_5, grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_1_3_0());
            	    	    					
            	    	    // InternalMyDsl.g:141:6: ( (lv_actions_6_0= ruleAction ) )
            	    	    // InternalMyDsl.g:142:7: (lv_actions_6_0= ruleAction )
            	    	    {
            	    	    // InternalMyDsl.g:142:7: (lv_actions_6_0= ruleAction )
            	    	    // InternalMyDsl.g:143:8: lv_actions_6_0= ruleAction
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getRobotModelAccess().getActionsActionParserRuleCall_1_1_3_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_actions_6_0=ruleAction();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getRobotModelRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"actions",
            	    	    									lv_actions_6_0,
            	    	    									"org.xtext.example.mydsl1.MyDsl.Action");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop1;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMyDsl.g:163:4: (otherlv_7= 'Condition:' otherlv_8= '-' ( (lv_conditions_9_0= ruleCondition ) ) (otherlv_10= '-' ( (lv_conditions_11_0= ruleCondition ) ) )* )
            	    {
            	    // InternalMyDsl.g:163:4: (otherlv_7= 'Condition:' otherlv_8= '-' ( (lv_conditions_9_0= ruleCondition ) ) (otherlv_10= '-' ( (lv_conditions_11_0= ruleCondition ) ) )* )
            	    // InternalMyDsl.g:164:5: otherlv_7= 'Condition:' otherlv_8= '-' ( (lv_conditions_9_0= ruleCondition ) ) (otherlv_10= '-' ( (lv_conditions_11_0= ruleCondition ) ) )*
            	    {
            	    otherlv_7=(Token)match(input,13,FOLLOW_4); 

            	    					newLeafNode(otherlv_7, grammarAccess.getRobotModelAccess().getConditionKeyword_1_2_0());
            	    				
            	    otherlv_8=(Token)match(input,12,FOLLOW_6); 

            	    					newLeafNode(otherlv_8, grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_2_1());
            	    				
            	    // InternalMyDsl.g:172:5: ( (lv_conditions_9_0= ruleCondition ) )
            	    // InternalMyDsl.g:173:6: (lv_conditions_9_0= ruleCondition )
            	    {
            	    // InternalMyDsl.g:173:6: (lv_conditions_9_0= ruleCondition )
            	    // InternalMyDsl.g:174:7: lv_conditions_9_0= ruleCondition
            	    {

            	    							newCompositeNode(grammarAccess.getRobotModelAccess().getConditionsConditionParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_3);
            	    lv_conditions_9_0=ruleCondition();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getRobotModelRule());
            	    							}
            	    							add(
            	    								current,
            	    								"conditions",
            	    								lv_conditions_9_0,
            	    								"org.xtext.example.mydsl1.MyDsl.Condition");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }

            	    // InternalMyDsl.g:191:5: (otherlv_10= '-' ( (lv_conditions_11_0= ruleCondition ) ) )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==12) ) {
            	            int LA2_2 = input.LA(2);

            	            if ( ((LA2_2>=24 && LA2_2<=25)||LA2_2==27||LA2_2==30) ) {
            	                alt2=1;
            	            }


            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:192:6: otherlv_10= '-' ( (lv_conditions_11_0= ruleCondition ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,12,FOLLOW_6); 

            	    	    						newLeafNode(otherlv_10, grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_2_3_0());
            	    	    					
            	    	    // InternalMyDsl.g:196:6: ( (lv_conditions_11_0= ruleCondition ) )
            	    	    // InternalMyDsl.g:197:7: (lv_conditions_11_0= ruleCondition )
            	    	    {
            	    	    // InternalMyDsl.g:197:7: (lv_conditions_11_0= ruleCondition )
            	    	    // InternalMyDsl.g:198:8: lv_conditions_11_0= ruleCondition
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getRobotModelAccess().getConditionsConditionParserRuleCall_1_2_3_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_3);
            	    	    lv_conditions_11_0=ruleCondition();

            	    	    state._fsp--;


            	    	    								if (current==null) {
            	    	    									current = createModelElementForParent(grammarAccess.getRobotModelRule());
            	    	    								}
            	    	    								add(
            	    	    									current,
            	    	    									"conditions",
            	    	    									lv_conditions_11_0,
            	    	    									"org.xtext.example.mydsl1.MyDsl.Condition");
            	    	    								afterParserOrEnumRuleCall();
            	    	    							

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMyDsl.g:218:4: ( (lv_expressions_12_0= ruleExpression ) )
            	    {
            	    // InternalMyDsl.g:218:4: ( (lv_expressions_12_0= ruleExpression ) )
            	    // InternalMyDsl.g:219:5: (lv_expressions_12_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:219:5: (lv_expressions_12_0= ruleExpression )
            	    // InternalMyDsl.g:220:6: lv_expressions_12_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getRobotModelAccess().getExpressionsExpressionParserRuleCall_1_3_0());
            	    					
            	    pushFollow(FOLLOW_3);
            	    lv_expressions_12_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRobotModelRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expressions",
            	    							lv_expressions_12_0,
            	    							"org.xtext.example.mydsl1.MyDsl.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleRobotModel"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:242:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:242:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:243:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:249:1: ruleExpression returns [EObject current=null] : this_PlusOrMinus_0= rulePlusOrMinus ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PlusOrMinus_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:255:2: (this_PlusOrMinus_0= rulePlusOrMinus )
            // InternalMyDsl.g:256:2: this_PlusOrMinus_0= rulePlusOrMinus
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getPlusOrMinusParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            		current = this_PlusOrMinus_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalMyDsl.g:267:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalMyDsl.g:267:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalMyDsl.g:268:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
             newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;

             current =iv_rulePlusOrMinus; 
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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalMyDsl.g:274:1: rulePlusOrMinus returns [EObject current=null] : (this_MultOrDiv_0= ruleMultOrDiv ( ( () ( ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleMultOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token lv_operation_2_1=null;
        Token lv_operation_2_2=null;
        EObject this_MultOrDiv_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:280:2: ( (this_MultOrDiv_0= ruleMultOrDiv ( ( () ( ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleMultOrDiv ) ) )* ) )
            // InternalMyDsl.g:281:2: (this_MultOrDiv_0= ruleMultOrDiv ( ( () ( ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleMultOrDiv ) ) )* )
            {
            // InternalMyDsl.g:281:2: (this_MultOrDiv_0= ruleMultOrDiv ( ( () ( ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleMultOrDiv ) ) )* )
            // InternalMyDsl.g:282:3: this_MultOrDiv_0= ruleMultOrDiv ( ( () ( ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleMultOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMultOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_7);
            this_MultOrDiv_0=ruleMultOrDiv();

            state._fsp--;


            			current = this_MultOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:290:3: ( ( () ( ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleMultOrDiv ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==12) ) {
                    int LA5_2 = input.LA(2);

                    if ( (LA5_2==RULE_INT||LA5_2==12||LA5_2==17) ) {
                        alt5=1;
                    }


                }
                else if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:291:4: ( () ( ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleMultOrDiv ) )
            	    {
            	    // InternalMyDsl.g:291:4: ( () ( ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) ) ) )
            	    // InternalMyDsl.g:292:5: () ( ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) ) )
            	    {
            	    // InternalMyDsl.g:292:5: ()
            	    // InternalMyDsl.g:293:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusOrMinusAccess().getExpressionLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalMyDsl.g:299:5: ( ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) ) )
            	    // InternalMyDsl.g:300:6: ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) )
            	    {
            	    // InternalMyDsl.g:300:6: ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) )
            	    // InternalMyDsl.g:301:7: (lv_operation_2_1= '+' | lv_operation_2_2= '-' )
            	    {
            	    // InternalMyDsl.g:301:7: (lv_operation_2_1= '+' | lv_operation_2_2= '-' )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==14) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==12) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalMyDsl.g:302:8: lv_operation_2_1= '+'
            	            {
            	            lv_operation_2_1=(Token)match(input,14,FOLLOW_8); 

            	            								newLeafNode(lv_operation_2_1, grammarAccess.getPlusOrMinusAccess().getOperationPlusSignKeyword_1_0_1_0_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getPlusOrMinusRule());
            	            								}
            	            								setWithLastConsumed(current, "operation", lv_operation_2_1, null);
            	            							

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:313:8: lv_operation_2_2= '-'
            	            {
            	            lv_operation_2_2=(Token)match(input,12,FOLLOW_8); 

            	            								newLeafNode(lv_operation_2_2, grammarAccess.getPlusOrMinusAccess().getOperationHyphenMinusKeyword_1_0_1_0_1());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getPlusOrMinusRule());
            	            								}
            	            								setWithLastConsumed(current, "operation", lv_operation_2_2, null);
            	            							

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }

            	    // InternalMyDsl.g:327:4: ( (lv_right_3_0= ruleMultOrDiv ) )
            	    // InternalMyDsl.g:328:5: (lv_right_3_0= ruleMultOrDiv )
            	    {
            	    // InternalMyDsl.g:328:5: (lv_right_3_0= ruleMultOrDiv )
            	    // InternalMyDsl.g:329:6: lv_right_3_0= ruleMultOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMultOrDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_right_3_0=ruleMultOrDiv();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl1.MyDsl.MultOrDiv");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMultOrDiv"
    // InternalMyDsl.g:351:1: entryRuleMultOrDiv returns [EObject current=null] : iv_ruleMultOrDiv= ruleMultOrDiv EOF ;
    public final EObject entryRuleMultOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultOrDiv = null;


        try {
            // InternalMyDsl.g:351:50: (iv_ruleMultOrDiv= ruleMultOrDiv EOF )
            // InternalMyDsl.g:352:2: iv_ruleMultOrDiv= ruleMultOrDiv EOF
            {
             newCompositeNode(grammarAccess.getMultOrDivRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultOrDiv=ruleMultOrDiv();

            state._fsp--;

             current =iv_ruleMultOrDiv; 
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
    // $ANTLR end "entryRuleMultOrDiv"


    // $ANTLR start "ruleMultOrDiv"
    // InternalMyDsl.g:358:1: ruleMultOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_operation_2_1= '*' | lv_operation_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_operation_2_1=null;
        Token lv_operation_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:364:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_operation_2_1= '*' | lv_operation_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalMyDsl.g:365:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operation_2_1= '*' | lv_operation_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalMyDsl.g:365:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operation_2_1= '*' | lv_operation_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalMyDsl.g:366:3: this_Primary_0= rulePrimary ( () ( ( (lv_operation_2_1= '*' | lv_operation_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:374:3: ( () ( ( (lv_operation_2_1= '*' | lv_operation_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=15 && LA7_0<=16)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:375:4: () ( ( (lv_operation_2_1= '*' | lv_operation_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalMyDsl.g:375:4: ()
            	    // InternalMyDsl.g:376:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultOrDivAccess().getExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMyDsl.g:382:4: ( ( (lv_operation_2_1= '*' | lv_operation_2_2= '/' ) ) )
            	    // InternalMyDsl.g:383:5: ( (lv_operation_2_1= '*' | lv_operation_2_2= '/' ) )
            	    {
            	    // InternalMyDsl.g:383:5: ( (lv_operation_2_1= '*' | lv_operation_2_2= '/' ) )
            	    // InternalMyDsl.g:384:6: (lv_operation_2_1= '*' | lv_operation_2_2= '/' )
            	    {
            	    // InternalMyDsl.g:384:6: (lv_operation_2_1= '*' | lv_operation_2_2= '/' )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==15) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==16) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalMyDsl.g:385:7: lv_operation_2_1= '*'
            	            {
            	            lv_operation_2_1=(Token)match(input,15,FOLLOW_10); 

            	            							newLeafNode(lv_operation_2_1, grammarAccess.getMultOrDivAccess().getOperationAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "operation", lv_operation_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:396:7: lv_operation_2_2= '/'
            	            {
            	            lv_operation_2_2=(Token)match(input,16,FOLLOW_10); 

            	            							newLeafNode(lv_operation_2_2, grammarAccess.getMultOrDivAccess().getOperationSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "operation", lv_operation_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMyDsl.g:409:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalMyDsl.g:410:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalMyDsl.g:410:5: (lv_right_3_0= rulePrimary )
            	    // InternalMyDsl.g:411:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultOrDivRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl1.MyDsl.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleMultOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalMyDsl.g:433:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMyDsl.g:433:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMyDsl.g:434:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMyDsl.g:440:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Atomic_3= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Expression_1 = null;

        EObject this_Atomic_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:446:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Atomic_3= ruleAtomic ) )
            // InternalMyDsl.g:447:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Atomic_3= ruleAtomic )
            {
            // InternalMyDsl.g:447:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | this_Atomic_3= ruleAtomic )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT||LA8_0==12) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:448:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalMyDsl.g:448:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalMyDsl.g:449:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_12);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:467:3: this_Atomic_3= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_3=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalMyDsl.g:479:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalMyDsl.g:479:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalMyDsl.g:480:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalMyDsl.g:486:1: ruleAtomic returns [EObject current=null] : ( () ( (lv_value_1_0= ruleEInt ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:492:2: ( ( () ( (lv_value_1_0= ruleEInt ) ) ) )
            // InternalMyDsl.g:493:2: ( () ( (lv_value_1_0= ruleEInt ) ) )
            {
            // InternalMyDsl.g:493:2: ( () ( (lv_value_1_0= ruleEInt ) ) )
            // InternalMyDsl.g:494:3: () ( (lv_value_1_0= ruleEInt ) )
            {
            // InternalMyDsl.g:494:3: ()
            // InternalMyDsl.g:495:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAtomicAccess().getExpressionAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:501:3: ( (lv_value_1_0= ruleEInt ) )
            // InternalMyDsl.g:502:4: (lv_value_1_0= ruleEInt )
            {
            // InternalMyDsl.g:502:4: (lv_value_1_0= ruleEInt )
            // InternalMyDsl.g:503:5: lv_value_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getAtomicAccess().getValueEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAtomicRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.xtext.example.mydsl1.MyDsl.EInt");
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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleEvent"
    // InternalMyDsl.g:524:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalMyDsl.g:524:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalMyDsl.g:525:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalMyDsl.g:531:1: ruleEvent returns [EObject current=null] : ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'conditions:' ( ( ruleEString ) ) (otherlv_5= 'and' ( ( ruleEString ) ) )* )? (otherlv_7= 'actions:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:537:2: ( ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'conditions:' ( ( ruleEString ) ) (otherlv_5= 'and' ( ( ruleEString ) ) )* )? (otherlv_7= 'actions:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? ) )
            // InternalMyDsl.g:538:2: ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'conditions:' ( ( ruleEString ) ) (otherlv_5= 'and' ( ( ruleEString ) ) )* )? (otherlv_7= 'actions:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? )
            {
            // InternalMyDsl.g:538:2: ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'conditions:' ( ( ruleEString ) ) (otherlv_5= 'and' ( ( ruleEString ) ) )* )? (otherlv_7= 'actions:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? )
            // InternalMyDsl.g:539:3: () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'conditions:' ( ( ruleEString ) ) (otherlv_5= 'and' ( ( ruleEString ) ) )* )? (otherlv_7= 'actions:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )?
            {
            // InternalMyDsl.g:539:3: ()
            // InternalMyDsl.g:540:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventAccess().getEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEventKeyword_1());
            		
            // InternalMyDsl.g:550:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:551:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:551:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:552:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEventRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:569:3: (otherlv_3= 'conditions:' ( ( ruleEString ) ) (otherlv_5= 'and' ( ( ruleEString ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:570:4: otherlv_3= 'conditions:' ( ( ruleEString ) ) (otherlv_5= 'and' ( ( ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getEventAccess().getConditionsKeyword_3_0());
                    			
                    // InternalMyDsl.g:574:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:575:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:575:5: ( ruleEString )
                    // InternalMyDsl.g:576:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEventAccess().getConditionsConditionCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:590:4: (otherlv_5= 'and' ( ( ruleEString ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==21) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:591:5: otherlv_5= 'and' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_13); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEventAccess().getAndKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:595:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:596:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:596:6: ( ruleEString )
                    	    // InternalMyDsl.g:597:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEventRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEventAccess().getConditionsConditionCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:613:3: (otherlv_7= 'actions:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:614:4: otherlv_7= 'actions:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getEventAccess().getActionsKeyword_4_0());
                    			
                    // InternalMyDsl.g:618:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:619:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:619:5: ( ruleEString )
                    // InternalMyDsl.g:620:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEventAccess().getActionsActionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:634:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==23) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDsl.g:635:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,23,FOLLOW_13); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getEventAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:639:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:640:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:640:6: ( ruleEString )
                    	    // InternalMyDsl.g:641:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEventRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEventAccess().getActionsActionCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:661:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:661:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:662:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyDsl.g:668:1: ruleCondition returns [EObject current=null] : (this_Button_0= ruleButton | this_Sensor_1= ruleSensor | this_Sound_2= ruleSound | this_Tap_3= ruleTap ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Button_0 = null;

        EObject this_Sensor_1 = null;

        EObject this_Sound_2 = null;

        EObject this_Tap_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:674:2: ( (this_Button_0= ruleButton | this_Sensor_1= ruleSensor | this_Sound_2= ruleSound | this_Tap_3= ruleTap ) )
            // InternalMyDsl.g:675:2: (this_Button_0= ruleButton | this_Sensor_1= ruleSensor | this_Sound_2= ruleSound | this_Tap_3= ruleTap )
            {
            // InternalMyDsl.g:675:2: (this_Button_0= ruleButton | this_Sensor_1= ruleSensor | this_Sound_2= ruleSound | this_Tap_3= ruleTap )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt13=1;
                }
                break;
            case 27:
                {
                alt13=2;
                }
                break;
            case 24:
                {
                alt13=3;
                }
                break;
            case 30:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:676:3: this_Button_0= ruleButton
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getButtonParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Button_0=ruleButton();

                    state._fsp--;


                    			current = this_Button_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:685:3: this_Sensor_1= ruleSensor
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getSensorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sensor_1=ruleSensor();

                    state._fsp--;


                    			current = this_Sensor_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:694:3: this_Sound_2= ruleSound
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getSoundParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sound_2=ruleSound();

                    state._fsp--;


                    			current = this_Sound_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:703:3: this_Tap_3= ruleTap
                    {

                    			newCompositeNode(grammarAccess.getConditionAccess().getTapParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tap_3=ruleTap();

                    state._fsp--;


                    			current = this_Tap_3;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleSound"
    // InternalMyDsl.g:715:1: entryRuleSound returns [EObject current=null] : iv_ruleSound= ruleSound EOF ;
    public final EObject entryRuleSound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSound = null;


        try {
            // InternalMyDsl.g:715:46: (iv_ruleSound= ruleSound EOF )
            // InternalMyDsl.g:716:2: iv_ruleSound= ruleSound EOF
            {
             newCompositeNode(grammarAccess.getSoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSound=ruleSound();

            state._fsp--;

             current =iv_ruleSound; 
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
    // $ANTLR end "entryRuleSound"


    // $ANTLR start "ruleSound"
    // InternalMyDsl.g:722:1: ruleSound returns [EObject current=null] : ( () otherlv_1= 'Sound' ( (lv_conditionname_2_0= ruleEString ) ) ) ;
    public final EObject ruleSound() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_conditionname_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:728:2: ( ( () otherlv_1= 'Sound' ( (lv_conditionname_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:729:2: ( () otherlv_1= 'Sound' ( (lv_conditionname_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:729:2: ( () otherlv_1= 'Sound' ( (lv_conditionname_2_0= ruleEString ) ) )
            // InternalMyDsl.g:730:3: () otherlv_1= 'Sound' ( (lv_conditionname_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:730:3: ()
            // InternalMyDsl.g:731:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSoundAccess().getSoundAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSoundAccess().getSoundKeyword_1());
            		
            // InternalMyDsl.g:741:3: ( (lv_conditionname_2_0= ruleEString ) )
            // InternalMyDsl.g:742:4: (lv_conditionname_2_0= ruleEString )
            {
            // InternalMyDsl.g:742:4: (lv_conditionname_2_0= ruleEString )
            // InternalMyDsl.g:743:5: lv_conditionname_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSoundAccess().getConditionnameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_conditionname_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSoundRule());
            					}
            					set(
            						current,
            						"conditionname",
            						lv_conditionname_2_0,
            						"org.xtext.example.mydsl1.MyDsl.EString");
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
    // $ANTLR end "ruleSound"


    // $ANTLR start "entryRuleButton"
    // InternalMyDsl.g:764:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalMyDsl.g:764:47: (iv_ruleButton= ruleButton EOF )
            // InternalMyDsl.g:765:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalMyDsl.g:771:1: ruleButton returns [EObject current=null] : ( () otherlv_1= 'Button' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'button' ( (lv_button_4_0= ruleButtonType ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_conditionname_2_0 = null;

        Enumerator lv_button_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:777:2: ( ( () otherlv_1= 'Button' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'button' ( (lv_button_4_0= ruleButtonType ) ) ) )
            // InternalMyDsl.g:778:2: ( () otherlv_1= 'Button' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'button' ( (lv_button_4_0= ruleButtonType ) ) )
            {
            // InternalMyDsl.g:778:2: ( () otherlv_1= 'Button' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'button' ( (lv_button_4_0= ruleButtonType ) ) )
            // InternalMyDsl.g:779:3: () otherlv_1= 'Button' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'button' ( (lv_button_4_0= ruleButtonType ) )
            {
            // InternalMyDsl.g:779:3: ()
            // InternalMyDsl.g:780:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getButtonAccess().getButtonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getButtonKeyword_1());
            		
            // InternalMyDsl.g:790:3: ( (lv_conditionname_2_0= ruleEString ) )
            // InternalMyDsl.g:791:4: (lv_conditionname_2_0= ruleEString )
            {
            // InternalMyDsl.g:791:4: (lv_conditionname_2_0= ruleEString )
            // InternalMyDsl.g:792:5: lv_conditionname_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getButtonAccess().getConditionnameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_conditionname_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getButtonRule());
            					}
            					set(
            						current,
            						"conditionname",
            						lv_conditionname_2_0,
            						"org.xtext.example.mydsl1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getButtonAccess().getButtonKeyword_3());
            		
            // InternalMyDsl.g:813:3: ( (lv_button_4_0= ruleButtonType ) )
            // InternalMyDsl.g:814:4: (lv_button_4_0= ruleButtonType )
            {
            // InternalMyDsl.g:814:4: (lv_button_4_0= ruleButtonType )
            // InternalMyDsl.g:815:5: lv_button_4_0= ruleButtonType
            {

            					newCompositeNode(grammarAccess.getButtonAccess().getButtonButtonTypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_button_4_0=ruleButtonType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getButtonRule());
            					}
            					set(
            						current,
            						"button",
            						lv_button_4_0,
            						"org.xtext.example.mydsl1.MyDsl.ButtonType");
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
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleSensor"
    // InternalMyDsl.g:836:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalMyDsl.g:836:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalMyDsl.g:837:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
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
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalMyDsl.g:843:1: ruleSensor returns [EObject current=null] : ( () otherlv_1= 'Sensor' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'sensorPos' ( (lv_posEx_4_0= ruleExpression ) ) otherlv_5= 'detectObstacle' ( (lv_distance_6_0= ruleDistance ) ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_conditionname_2_0 = null;

        EObject lv_posEx_4_0 = null;

        Enumerator lv_distance_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:849:2: ( ( () otherlv_1= 'Sensor' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'sensorPos' ( (lv_posEx_4_0= ruleExpression ) ) otherlv_5= 'detectObstacle' ( (lv_distance_6_0= ruleDistance ) ) ) )
            // InternalMyDsl.g:850:2: ( () otherlv_1= 'Sensor' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'sensorPos' ( (lv_posEx_4_0= ruleExpression ) ) otherlv_5= 'detectObstacle' ( (lv_distance_6_0= ruleDistance ) ) )
            {
            // InternalMyDsl.g:850:2: ( () otherlv_1= 'Sensor' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'sensorPos' ( (lv_posEx_4_0= ruleExpression ) ) otherlv_5= 'detectObstacle' ( (lv_distance_6_0= ruleDistance ) ) )
            // InternalMyDsl.g:851:3: () otherlv_1= 'Sensor' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'sensorPos' ( (lv_posEx_4_0= ruleExpression ) ) otherlv_5= 'detectObstacle' ( (lv_distance_6_0= ruleDistance ) )
            {
            // InternalMyDsl.g:851:3: ()
            // InternalMyDsl.g:852:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorAccess().getSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
            		
            // InternalMyDsl.g:862:3: ( (lv_conditionname_2_0= ruleEString ) )
            // InternalMyDsl.g:863:4: (lv_conditionname_2_0= ruleEString )
            {
            // InternalMyDsl.g:863:4: (lv_conditionname_2_0= ruleEString )
            // InternalMyDsl.g:864:5: lv_conditionname_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getConditionnameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_conditionname_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"conditionname",
            						lv_conditionname_2_0,
            						"org.xtext.example.mydsl1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getSensorPosKeyword_3());
            		
            // InternalMyDsl.g:885:3: ( (lv_posEx_4_0= ruleExpression ) )
            // InternalMyDsl.g:886:4: (lv_posEx_4_0= ruleExpression )
            {
            // InternalMyDsl.g:886:4: (lv_posEx_4_0= ruleExpression )
            // InternalMyDsl.g:887:5: lv_posEx_4_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getPosExExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_21);
            lv_posEx_4_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"posEx",
            						lv_posEx_4_0,
            						"org.xtext.example.mydsl1.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,29,FOLLOW_22); 

            			newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getDetectObstacleKeyword_5());
            		
            // InternalMyDsl.g:908:3: ( (lv_distance_6_0= ruleDistance ) )
            // InternalMyDsl.g:909:4: (lv_distance_6_0= ruleDistance )
            {
            // InternalMyDsl.g:909:4: (lv_distance_6_0= ruleDistance )
            // InternalMyDsl.g:910:5: lv_distance_6_0= ruleDistance
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getDistanceDistanceEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_2);
            lv_distance_6_0=ruleDistance();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"distance",
            						lv_distance_6_0,
            						"org.xtext.example.mydsl1.MyDsl.Distance");
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
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleTap"
    // InternalMyDsl.g:931:1: entryRuleTap returns [EObject current=null] : iv_ruleTap= ruleTap EOF ;
    public final EObject entryRuleTap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTap = null;


        try {
            // InternalMyDsl.g:931:44: (iv_ruleTap= ruleTap EOF )
            // InternalMyDsl.g:932:2: iv_ruleTap= ruleTap EOF
            {
             newCompositeNode(grammarAccess.getTapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTap=ruleTap();

            state._fsp--;

             current =iv_ruleTap; 
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
    // $ANTLR end "entryRuleTap"


    // $ANTLR start "ruleTap"
    // InternalMyDsl.g:938:1: ruleTap returns [EObject current=null] : ( () otherlv_1= 'Tap' ( (lv_conditionname_2_0= ruleEString ) ) ) ;
    public final EObject ruleTap() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_conditionname_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:944:2: ( ( () otherlv_1= 'Tap' ( (lv_conditionname_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:945:2: ( () otherlv_1= 'Tap' ( (lv_conditionname_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:945:2: ( () otherlv_1= 'Tap' ( (lv_conditionname_2_0= ruleEString ) ) )
            // InternalMyDsl.g:946:3: () otherlv_1= 'Tap' ( (lv_conditionname_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:946:3: ()
            // InternalMyDsl.g:947:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTapAccess().getTapAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getTapAccess().getTapKeyword_1());
            		
            // InternalMyDsl.g:957:3: ( (lv_conditionname_2_0= ruleEString ) )
            // InternalMyDsl.g:958:4: (lv_conditionname_2_0= ruleEString )
            {
            // InternalMyDsl.g:958:4: (lv_conditionname_2_0= ruleEString )
            // InternalMyDsl.g:959:5: lv_conditionname_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTapAccess().getConditionnameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_conditionname_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTapRule());
            					}
            					set(
            						current,
            						"conditionname",
            						lv_conditionname_2_0,
            						"org.xtext.example.mydsl1.MyDsl.EString");
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
    // $ANTLR end "ruleTap"


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:980:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDsl.g:980:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDsl.g:981:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMyDsl.g:987:1: ruleAction returns [EObject current=null] : (this_MotorAction_0= ruleMotorAction | this_SoundAction_1= ruleSoundAction | this_LightAction_2= ruleLightAction ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_MotorAction_0 = null;

        EObject this_SoundAction_1 = null;

        EObject this_LightAction_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:993:2: ( (this_MotorAction_0= ruleMotorAction | this_SoundAction_1= ruleSoundAction | this_LightAction_2= ruleLightAction ) )
            // InternalMyDsl.g:994:2: (this_MotorAction_0= ruleMotorAction | this_SoundAction_1= ruleSoundAction | this_LightAction_2= ruleLightAction )
            {
            // InternalMyDsl.g:994:2: (this_MotorAction_0= ruleMotorAction | this_SoundAction_1= ruleSoundAction | this_LightAction_2= ruleLightAction )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt14=1;
                }
                break;
            case 34:
                {
                alt14=2;
                }
                break;
            case 36:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:995:3: this_MotorAction_0= ruleMotorAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getMotorActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MotorAction_0=ruleMotorAction();

                    state._fsp--;


                    			current = this_MotorAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1004:3: this_SoundAction_1= ruleSoundAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getSoundActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SoundAction_1=ruleSoundAction();

                    state._fsp--;


                    			current = this_SoundAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1013:3: this_LightAction_2= ruleLightAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getLightActionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_LightAction_2=ruleLightAction();

                    state._fsp--;


                    			current = this_LightAction_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleMotorAction"
    // InternalMyDsl.g:1025:1: entryRuleMotorAction returns [EObject current=null] : iv_ruleMotorAction= ruleMotorAction EOF ;
    public final EObject entryRuleMotorAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotorAction = null;


        try {
            // InternalMyDsl.g:1025:52: (iv_ruleMotorAction= ruleMotorAction EOF )
            // InternalMyDsl.g:1026:2: iv_ruleMotorAction= ruleMotorAction EOF
            {
             newCompositeNode(grammarAccess.getMotorActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMotorAction=ruleMotorAction();

            state._fsp--;

             current =iv_ruleMotorAction; 
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
    // $ANTLR end "entryRuleMotorAction"


    // $ANTLR start "ruleMotorAction"
    // InternalMyDsl.g:1032:1: ruleMotorAction returns [EObject current=null] : ( () otherlv_1= 'MotorAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'motorLeft' ( (lv_left_4_0= ruleExpression ) ) )? (otherlv_5= 'motorRight' ( (lv_right_6_0= ruleExpression ) ) )? ) ;
    public final EObject ruleMotorAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_actionname_2_0 = null;

        EObject lv_left_4_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1038:2: ( ( () otherlv_1= 'MotorAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'motorLeft' ( (lv_left_4_0= ruleExpression ) ) )? (otherlv_5= 'motorRight' ( (lv_right_6_0= ruleExpression ) ) )? ) )
            // InternalMyDsl.g:1039:2: ( () otherlv_1= 'MotorAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'motorLeft' ( (lv_left_4_0= ruleExpression ) ) )? (otherlv_5= 'motorRight' ( (lv_right_6_0= ruleExpression ) ) )? )
            {
            // InternalMyDsl.g:1039:2: ( () otherlv_1= 'MotorAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'motorLeft' ( (lv_left_4_0= ruleExpression ) ) )? (otherlv_5= 'motorRight' ( (lv_right_6_0= ruleExpression ) ) )? )
            // InternalMyDsl.g:1040:3: () otherlv_1= 'MotorAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'motorLeft' ( (lv_left_4_0= ruleExpression ) ) )? (otherlv_5= 'motorRight' ( (lv_right_6_0= ruleExpression ) ) )?
            {
            // InternalMyDsl.g:1040:3: ()
            // InternalMyDsl.g:1041:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMotorActionAccess().getMotorActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getMotorActionAccess().getMotorActionKeyword_1());
            		
            // InternalMyDsl.g:1051:3: ( (lv_actionname_2_0= ruleEString ) )
            // InternalMyDsl.g:1052:4: (lv_actionname_2_0= ruleEString )
            {
            // InternalMyDsl.g:1052:4: (lv_actionname_2_0= ruleEString )
            // InternalMyDsl.g:1053:5: lv_actionname_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMotorActionAccess().getActionnameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_actionname_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMotorActionRule());
            					}
            					set(
            						current,
            						"actionname",
            						lv_actionname_2_0,
            						"org.xtext.example.mydsl1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1070:3: (otherlv_3= 'motorLeft' ( (lv_left_4_0= ruleExpression ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1071:4: otherlv_3= 'motorLeft' ( (lv_left_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,32,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getMotorActionAccess().getMotorLeftKeyword_3_0());
                    			
                    // InternalMyDsl.g:1075:4: ( (lv_left_4_0= ruleExpression ) )
                    // InternalMyDsl.g:1076:5: (lv_left_4_0= ruleExpression )
                    {
                    // InternalMyDsl.g:1076:5: (lv_left_4_0= ruleExpression )
                    // InternalMyDsl.g:1077:6: lv_left_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getMotorActionAccess().getLeftExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_left_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMotorActionRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_4_0,
                    							"org.xtext.example.mydsl1.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1095:3: (otherlv_5= 'motorRight' ( (lv_right_6_0= ruleExpression ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1096:4: otherlv_5= 'motorRight' ( (lv_right_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_26); 

                    				newLeafNode(otherlv_5, grammarAccess.getMotorActionAccess().getMotorRightKeyword_4_0());
                    			
                    // InternalMyDsl.g:1100:4: ( (lv_right_6_0= ruleExpression ) )
                    // InternalMyDsl.g:1101:5: (lv_right_6_0= ruleExpression )
                    {
                    // InternalMyDsl.g:1101:5: (lv_right_6_0= ruleExpression )
                    // InternalMyDsl.g:1102:6: lv_right_6_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getMotorActionAccess().getRightExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_right_6_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMotorActionRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_6_0,
                    							"org.xtext.example.mydsl1.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleMotorAction"


    // $ANTLR start "entryRuleSoundAction"
    // InternalMyDsl.g:1124:1: entryRuleSoundAction returns [EObject current=null] : iv_ruleSoundAction= ruleSoundAction EOF ;
    public final EObject entryRuleSoundAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoundAction = null;


        try {
            // InternalMyDsl.g:1124:52: (iv_ruleSoundAction= ruleSoundAction EOF )
            // InternalMyDsl.g:1125:2: iv_ruleSoundAction= ruleSoundAction EOF
            {
             newCompositeNode(grammarAccess.getSoundActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSoundAction=ruleSoundAction();

            state._fsp--;

             current =iv_ruleSoundAction; 
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
    // $ANTLR end "entryRuleSoundAction"


    // $ANTLR start "ruleSoundAction"
    // InternalMyDsl.g:1131:1: ruleSoundAction returns [EObject current=null] : ( () otherlv_1= 'SoundAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'set:' ( (lv_musicsettings_4_0= ruleMusicSetting ) ) (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )* )? ) ;
    public final EObject ruleSoundAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_actionname_2_0 = null;

        EObject lv_musicsettings_4_0 = null;

        EObject lv_musicsettings_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1137:2: ( ( () otherlv_1= 'SoundAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'set:' ( (lv_musicsettings_4_0= ruleMusicSetting ) ) (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )* )? ) )
            // InternalMyDsl.g:1138:2: ( () otherlv_1= 'SoundAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'set:' ( (lv_musicsettings_4_0= ruleMusicSetting ) ) (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )* )? )
            {
            // InternalMyDsl.g:1138:2: ( () otherlv_1= 'SoundAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'set:' ( (lv_musicsettings_4_0= ruleMusicSetting ) ) (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )* )? )
            // InternalMyDsl.g:1139:3: () otherlv_1= 'SoundAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'set:' ( (lv_musicsettings_4_0= ruleMusicSetting ) ) (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )* )?
            {
            // InternalMyDsl.g:1139:3: ()
            // InternalMyDsl.g:1140:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSoundActionAccess().getSoundActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSoundActionAccess().getSoundActionKeyword_1());
            		
            // InternalMyDsl.g:1150:3: ( (lv_actionname_2_0= ruleEString ) )
            // InternalMyDsl.g:1151:4: (lv_actionname_2_0= ruleEString )
            {
            // InternalMyDsl.g:1151:4: (lv_actionname_2_0= ruleEString )
            // InternalMyDsl.g:1152:5: lv_actionname_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSoundActionAccess().getActionnameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_27);
            lv_actionname_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSoundActionRule());
            					}
            					set(
            						current,
            						"actionname",
            						lv_actionname_2_0,
            						"org.xtext.example.mydsl1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1169:3: (otherlv_3= 'set:' ( (lv_musicsettings_4_0= ruleMusicSetting ) ) (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1170:4: otherlv_3= 'set:' ( (lv_musicsettings_4_0= ruleMusicSetting ) ) (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )*
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_28); 

                    				newLeafNode(otherlv_3, grammarAccess.getSoundActionAccess().getSetKeyword_3_0());
                    			
                    // InternalMyDsl.g:1174:4: ( (lv_musicsettings_4_0= ruleMusicSetting ) )
                    // InternalMyDsl.g:1175:5: (lv_musicsettings_4_0= ruleMusicSetting )
                    {
                    // InternalMyDsl.g:1175:5: (lv_musicsettings_4_0= ruleMusicSetting )
                    // InternalMyDsl.g:1176:6: lv_musicsettings_4_0= ruleMusicSetting
                    {

                    						newCompositeNode(grammarAccess.getSoundActionAccess().getMusicsettingsMusicSettingParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_musicsettings_4_0=ruleMusicSetting();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSoundActionRule());
                    						}
                    						add(
                    							current,
                    							"musicsettings",
                    							lv_musicsettings_4_0,
                    							"org.xtext.example.mydsl1.MyDsl.MusicSetting");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1193:4: (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==23) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalMyDsl.g:1194:5: otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) )
                    	    {
                    	    otherlv_5=(Token)match(input,23,FOLLOW_28); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getSoundActionAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:1198:5: ( (lv_musicsettings_6_0= ruleMusicSetting ) )
                    	    // InternalMyDsl.g:1199:6: (lv_musicsettings_6_0= ruleMusicSetting )
                    	    {
                    	    // InternalMyDsl.g:1199:6: (lv_musicsettings_6_0= ruleMusicSetting )
                    	    // InternalMyDsl.g:1200:7: lv_musicsettings_6_0= ruleMusicSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getSoundActionAccess().getMusicsettingsMusicSettingParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_musicsettings_6_0=ruleMusicSetting();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSoundActionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"musicsettings",
                    	    								lv_musicsettings_6_0,
                    	    								"org.xtext.example.mydsl1.MyDsl.MusicSetting");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


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
    // $ANTLR end "ruleSoundAction"


    // $ANTLR start "entryRuleLightAction"
    // InternalMyDsl.g:1223:1: entryRuleLightAction returns [EObject current=null] : iv_ruleLightAction= ruleLightAction EOF ;
    public final EObject entryRuleLightAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightAction = null;


        try {
            // InternalMyDsl.g:1223:52: (iv_ruleLightAction= ruleLightAction EOF )
            // InternalMyDsl.g:1224:2: iv_ruleLightAction= ruleLightAction EOF
            {
             newCompositeNode(grammarAccess.getLightActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLightAction=ruleLightAction();

            state._fsp--;

             current =iv_ruleLightAction; 
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
    // $ANTLR end "entryRuleLightAction"


    // $ANTLR start "ruleLightAction"
    // InternalMyDsl.g:1230:1: ruleLightAction returns [EObject current=null] : ( () otherlv_1= 'LightAction' ( (lv_actionname_2_0= ruleEString ) ) otherlv_3= 'pos:' ( (lv_pos_4_0= ruleLightPos ) ) (otherlv_5= 'red:' ( (lv_redEx_6_0= ruleExpression ) ) )? (otherlv_7= 'green:' ( (lv_greenEx_8_0= ruleExpression ) ) )? (otherlv_9= 'blue:' ( (lv_blueEx_10_0= ruleExpression ) ) )? ) ;
    public final EObject ruleLightAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_actionname_2_0 = null;

        Enumerator lv_pos_4_0 = null;

        EObject lv_redEx_6_0 = null;

        EObject lv_greenEx_8_0 = null;

        EObject lv_blueEx_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1236:2: ( ( () otherlv_1= 'LightAction' ( (lv_actionname_2_0= ruleEString ) ) otherlv_3= 'pos:' ( (lv_pos_4_0= ruleLightPos ) ) (otherlv_5= 'red:' ( (lv_redEx_6_0= ruleExpression ) ) )? (otherlv_7= 'green:' ( (lv_greenEx_8_0= ruleExpression ) ) )? (otherlv_9= 'blue:' ( (lv_blueEx_10_0= ruleExpression ) ) )? ) )
            // InternalMyDsl.g:1237:2: ( () otherlv_1= 'LightAction' ( (lv_actionname_2_0= ruleEString ) ) otherlv_3= 'pos:' ( (lv_pos_4_0= ruleLightPos ) ) (otherlv_5= 'red:' ( (lv_redEx_6_0= ruleExpression ) ) )? (otherlv_7= 'green:' ( (lv_greenEx_8_0= ruleExpression ) ) )? (otherlv_9= 'blue:' ( (lv_blueEx_10_0= ruleExpression ) ) )? )
            {
            // InternalMyDsl.g:1237:2: ( () otherlv_1= 'LightAction' ( (lv_actionname_2_0= ruleEString ) ) otherlv_3= 'pos:' ( (lv_pos_4_0= ruleLightPos ) ) (otherlv_5= 'red:' ( (lv_redEx_6_0= ruleExpression ) ) )? (otherlv_7= 'green:' ( (lv_greenEx_8_0= ruleExpression ) ) )? (otherlv_9= 'blue:' ( (lv_blueEx_10_0= ruleExpression ) ) )? )
            // InternalMyDsl.g:1238:3: () otherlv_1= 'LightAction' ( (lv_actionname_2_0= ruleEString ) ) otherlv_3= 'pos:' ( (lv_pos_4_0= ruleLightPos ) ) (otherlv_5= 'red:' ( (lv_redEx_6_0= ruleExpression ) ) )? (otherlv_7= 'green:' ( (lv_greenEx_8_0= ruleExpression ) ) )? (otherlv_9= 'blue:' ( (lv_blueEx_10_0= ruleExpression ) ) )?
            {
            // InternalMyDsl.g:1238:3: ()
            // InternalMyDsl.g:1239:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLightActionAccess().getLightActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getLightActionAccess().getLightActionKeyword_1());
            		
            // InternalMyDsl.g:1249:3: ( (lv_actionname_2_0= ruleEString ) )
            // InternalMyDsl.g:1250:4: (lv_actionname_2_0= ruleEString )
            {
            // InternalMyDsl.g:1250:4: (lv_actionname_2_0= ruleEString )
            // InternalMyDsl.g:1251:5: lv_actionname_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLightActionAccess().getActionnameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_29);
            lv_actionname_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLightActionRule());
            					}
            					set(
            						current,
            						"actionname",
            						lv_actionname_2_0,
            						"org.xtext.example.mydsl1.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getLightActionAccess().getPosKeyword_3());
            		
            // InternalMyDsl.g:1272:3: ( (lv_pos_4_0= ruleLightPos ) )
            // InternalMyDsl.g:1273:4: (lv_pos_4_0= ruleLightPos )
            {
            // InternalMyDsl.g:1273:4: (lv_pos_4_0= ruleLightPos )
            // InternalMyDsl.g:1274:5: lv_pos_4_0= ruleLightPos
            {

            					newCompositeNode(grammarAccess.getLightActionAccess().getPosLightPosEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
            lv_pos_4_0=ruleLightPos();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLightActionRule());
            					}
            					set(
            						current,
            						"pos",
            						lv_pos_4_0,
            						"org.xtext.example.mydsl1.MyDsl.LightPos");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1291:3: (otherlv_5= 'red:' ( (lv_redEx_6_0= ruleExpression ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1292:4: otherlv_5= 'red:' ( (lv_redEx_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,38,FOLLOW_32); 

                    				newLeafNode(otherlv_5, grammarAccess.getLightActionAccess().getRedKeyword_5_0());
                    			
                    // InternalMyDsl.g:1296:4: ( (lv_redEx_6_0= ruleExpression ) )
                    // InternalMyDsl.g:1297:5: (lv_redEx_6_0= ruleExpression )
                    {
                    // InternalMyDsl.g:1297:5: (lv_redEx_6_0= ruleExpression )
                    // InternalMyDsl.g:1298:6: lv_redEx_6_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getLightActionAccess().getRedExExpressionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_redEx_6_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLightActionRule());
                    						}
                    						set(
                    							current,
                    							"redEx",
                    							lv_redEx_6_0,
                    							"org.xtext.example.mydsl1.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1316:3: (otherlv_7= 'green:' ( (lv_greenEx_8_0= ruleExpression ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==39) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1317:4: otherlv_7= 'green:' ( (lv_greenEx_8_0= ruleExpression ) )
                    {
                    otherlv_7=(Token)match(input,39,FOLLOW_34); 

                    				newLeafNode(otherlv_7, grammarAccess.getLightActionAccess().getGreenKeyword_6_0());
                    			
                    // InternalMyDsl.g:1321:4: ( (lv_greenEx_8_0= ruleExpression ) )
                    // InternalMyDsl.g:1322:5: (lv_greenEx_8_0= ruleExpression )
                    {
                    // InternalMyDsl.g:1322:5: (lv_greenEx_8_0= ruleExpression )
                    // InternalMyDsl.g:1323:6: lv_greenEx_8_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getLightActionAccess().getGreenExExpressionParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_greenEx_8_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLightActionRule());
                    						}
                    						set(
                    							current,
                    							"greenEx",
                    							lv_greenEx_8_0,
                    							"org.xtext.example.mydsl1.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1341:3: (otherlv_9= 'blue:' ( (lv_blueEx_10_0= ruleExpression ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1342:4: otherlv_9= 'blue:' ( (lv_blueEx_10_0= ruleExpression ) )
                    {
                    otherlv_9=(Token)match(input,40,FOLLOW_26); 

                    				newLeafNode(otherlv_9, grammarAccess.getLightActionAccess().getBlueKeyword_7_0());
                    			
                    // InternalMyDsl.g:1346:4: ( (lv_blueEx_10_0= ruleExpression ) )
                    // InternalMyDsl.g:1347:5: (lv_blueEx_10_0= ruleExpression )
                    {
                    // InternalMyDsl.g:1347:5: (lv_blueEx_10_0= ruleExpression )
                    // InternalMyDsl.g:1348:6: lv_blueEx_10_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getLightActionAccess().getBlueExExpressionParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_blueEx_10_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLightActionRule());
                    						}
                    						set(
                    							current,
                    							"blueEx",
                    							lv_blueEx_10_0,
                    							"org.xtext.example.mydsl1.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

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
    // $ANTLR end "ruleLightAction"


    // $ANTLR start "entryRuleMusicSetting"
    // InternalMyDsl.g:1370:1: entryRuleMusicSetting returns [EObject current=null] : iv_ruleMusicSetting= ruleMusicSetting EOF ;
    public final EObject entryRuleMusicSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMusicSetting = null;


        try {
            // InternalMyDsl.g:1370:53: (iv_ruleMusicSetting= ruleMusicSetting EOF )
            // InternalMyDsl.g:1371:2: iv_ruleMusicSetting= ruleMusicSetting EOF
            {
             newCompositeNode(grammarAccess.getMusicSettingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMusicSetting=ruleMusicSetting();

            state._fsp--;

             current =iv_ruleMusicSetting; 
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
    // $ANTLR end "entryRuleMusicSetting"


    // $ANTLR start "ruleMusicSetting"
    // InternalMyDsl.g:1377:1: ruleMusicSetting returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_noteEx_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_duration_4_0= ruleDuration ) ) otherlv_5= ',' ( (lv_posEx_6_0= ruleExpression ) ) otherlv_7= ')' ) ;
    public final EObject ruleMusicSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_noteEx_2_0 = null;

        Enumerator lv_duration_4_0 = null;

        EObject lv_posEx_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1383:2: ( ( () otherlv_1= '(' ( (lv_noteEx_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_duration_4_0= ruleDuration ) ) otherlv_5= ',' ( (lv_posEx_6_0= ruleExpression ) ) otherlv_7= ')' ) )
            // InternalMyDsl.g:1384:2: ( () otherlv_1= '(' ( (lv_noteEx_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_duration_4_0= ruleDuration ) ) otherlv_5= ',' ( (lv_posEx_6_0= ruleExpression ) ) otherlv_7= ')' )
            {
            // InternalMyDsl.g:1384:2: ( () otherlv_1= '(' ( (lv_noteEx_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_duration_4_0= ruleDuration ) ) otherlv_5= ',' ( (lv_posEx_6_0= ruleExpression ) ) otherlv_7= ')' )
            // InternalMyDsl.g:1385:3: () otherlv_1= '(' ( (lv_noteEx_2_0= ruleExpression ) ) otherlv_3= ',' ( (lv_duration_4_0= ruleDuration ) ) otherlv_5= ',' ( (lv_posEx_6_0= ruleExpression ) ) otherlv_7= ')'
            {
            // InternalMyDsl.g:1385:3: ()
            // InternalMyDsl.g:1386:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMusicSettingAccess().getMusicSettingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getMusicSettingAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:1396:3: ( (lv_noteEx_2_0= ruleExpression ) )
            // InternalMyDsl.g:1397:4: (lv_noteEx_2_0= ruleExpression )
            {
            // InternalMyDsl.g:1397:4: (lv_noteEx_2_0= ruleExpression )
            // InternalMyDsl.g:1398:5: lv_noteEx_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMusicSettingAccess().getNoteExExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_37);
            lv_noteEx_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMusicSettingRule());
            					}
            					set(
            						current,
            						"noteEx",
            						lv_noteEx_2_0,
            						"org.xtext.example.mydsl1.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_38); 

            			newLeafNode(otherlv_3, grammarAccess.getMusicSettingAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:1419:3: ( (lv_duration_4_0= ruleDuration ) )
            // InternalMyDsl.g:1420:4: (lv_duration_4_0= ruleDuration )
            {
            // InternalMyDsl.g:1420:4: (lv_duration_4_0= ruleDuration )
            // InternalMyDsl.g:1421:5: lv_duration_4_0= ruleDuration
            {

            					newCompositeNode(grammarAccess.getMusicSettingAccess().getDurationDurationEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_37);
            lv_duration_4_0=ruleDuration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMusicSettingRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_4_0,
            						"org.xtext.example.mydsl1.MyDsl.Duration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getMusicSettingAccess().getCommaKeyword_5());
            		
            // InternalMyDsl.g:1442:3: ( (lv_posEx_6_0= ruleExpression ) )
            // InternalMyDsl.g:1443:4: (lv_posEx_6_0= ruleExpression )
            {
            // InternalMyDsl.g:1443:4: (lv_posEx_6_0= ruleExpression )
            // InternalMyDsl.g:1444:5: lv_posEx_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getMusicSettingAccess().getPosExExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_12);
            lv_posEx_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMusicSettingRule());
            					}
            					set(
            						current,
            						"posEx",
            						lv_posEx_6_0,
            						"org.xtext.example.mydsl1.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMusicSettingAccess().getRightParenthesisKeyword_7());
            		

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
    // $ANTLR end "ruleMusicSetting"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:1469:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:1469:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:1470:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:1476:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1482:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:1483:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:1483:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:1484:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:1484:3: (kw= '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==12) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1485:4: kw= '-'
                    {
                    kw=(Token)match(input,12,FOLLOW_39); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:1502:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:1502:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:1503:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:1509:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1515:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:1516:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:1516:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING) ) {
                alt23=1;
            }
            else if ( (LA23_0==RULE_ID) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1517:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1525:3: this_ID_1= RULE_ID
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


    // $ANTLR start "ruleDuration"
    // InternalMyDsl.g:1536:1: ruleDuration returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LONG' ) ) ;
    public final Enumerator ruleDuration() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1542:2: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LONG' ) ) )
            // InternalMyDsl.g:1543:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LONG' ) )
            {
            // InternalMyDsl.g:1543:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LONG' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt24=1;
                }
                break;
            case 42:
                {
                alt24=2;
                }
                break;
            case 43:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1544:3: (enumLiteral_0= 'NONE' )
                    {
                    // InternalMyDsl.g:1544:3: (enumLiteral_0= 'NONE' )
                    // InternalMyDsl.g:1545:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getDurationAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDurationAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1552:3: (enumLiteral_1= 'MEDIUM' )
                    {
                    // InternalMyDsl.g:1552:3: (enumLiteral_1= 'MEDIUM' )
                    // InternalMyDsl.g:1553:4: enumLiteral_1= 'MEDIUM'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getDurationAccess().getMEDIUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDurationAccess().getMEDIUMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1560:3: (enumLiteral_2= 'LONG' )
                    {
                    // InternalMyDsl.g:1560:3: (enumLiteral_2= 'LONG' )
                    // InternalMyDsl.g:1561:4: enumLiteral_2= 'LONG'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getDurationAccess().getLONGEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDurationAccess().getLONGEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleDuration"


    // $ANTLR start "ruleLightPos"
    // InternalMyDsl.g:1571:1: ruleLightPos returns [Enumerator current=null] : ( (enumLiteral_0= 'TOP' ) | (enumLiteral_1= 'BOT' ) ) ;
    public final Enumerator ruleLightPos() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1577:2: ( ( (enumLiteral_0= 'TOP' ) | (enumLiteral_1= 'BOT' ) ) )
            // InternalMyDsl.g:1578:2: ( (enumLiteral_0= 'TOP' ) | (enumLiteral_1= 'BOT' ) )
            {
            // InternalMyDsl.g:1578:2: ( (enumLiteral_0= 'TOP' ) | (enumLiteral_1= 'BOT' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==44) ) {
                alt25=1;
            }
            else if ( (LA25_0==45) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1579:3: (enumLiteral_0= 'TOP' )
                    {
                    // InternalMyDsl.g:1579:3: (enumLiteral_0= 'TOP' )
                    // InternalMyDsl.g:1580:4: enumLiteral_0= 'TOP'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getLightPosAccess().getTOPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLightPosAccess().getTOPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1587:3: (enumLiteral_1= 'BOT' )
                    {
                    // InternalMyDsl.g:1587:3: (enumLiteral_1= 'BOT' )
                    // InternalMyDsl.g:1588:4: enumLiteral_1= 'BOT'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getLightPosAccess().getBOTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLightPosAccess().getBOTEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleLightPos"


    // $ANTLR start "ruleDistance"
    // InternalMyDsl.g:1598:1: ruleDistance returns [Enumerator current=null] : ( (enumLiteral_0= 'OBSTACLE' ) | (enumLiteral_1= 'NOOBSTACLE' ) ) ;
    public final Enumerator ruleDistance() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1604:2: ( ( (enumLiteral_0= 'OBSTACLE' ) | (enumLiteral_1= 'NOOBSTACLE' ) ) )
            // InternalMyDsl.g:1605:2: ( (enumLiteral_0= 'OBSTACLE' ) | (enumLiteral_1= 'NOOBSTACLE' ) )
            {
            // InternalMyDsl.g:1605:2: ( (enumLiteral_0= 'OBSTACLE' ) | (enumLiteral_1= 'NOOBSTACLE' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            else if ( (LA26_0==47) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1606:3: (enumLiteral_0= 'OBSTACLE' )
                    {
                    // InternalMyDsl.g:1606:3: (enumLiteral_0= 'OBSTACLE' )
                    // InternalMyDsl.g:1607:4: enumLiteral_0= 'OBSTACLE'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getDistanceAccess().getFAREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDistanceAccess().getFAREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1614:3: (enumLiteral_1= 'NOOBSTACLE' )
                    {
                    // InternalMyDsl.g:1614:3: (enumLiteral_1= 'NOOBSTACLE' )
                    // InternalMyDsl.g:1615:4: enumLiteral_1= 'NOOBSTACLE'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getDistanceAccess().getCLOSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDistanceAccess().getCLOSEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleDistance"


    // $ANTLR start "ruleButtonType"
    // InternalMyDsl.g:1625:1: ruleButtonType returns [Enumerator current=null] : ( (enumLiteral_0= 'BACKWARD' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) | (enumLiteral_3= 'CENTER' ) | (enumLiteral_4= 'FORWARD' ) ) ;
    public final Enumerator ruleButtonType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1631:2: ( ( (enumLiteral_0= 'BACKWARD' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) | (enumLiteral_3= 'CENTER' ) | (enumLiteral_4= 'FORWARD' ) ) )
            // InternalMyDsl.g:1632:2: ( (enumLiteral_0= 'BACKWARD' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) | (enumLiteral_3= 'CENTER' ) | (enumLiteral_4= 'FORWARD' ) )
            {
            // InternalMyDsl.g:1632:2: ( (enumLiteral_0= 'BACKWARD' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) | (enumLiteral_3= 'CENTER' ) | (enumLiteral_4= 'FORWARD' ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt27=1;
                }
                break;
            case 49:
                {
                alt27=2;
                }
                break;
            case 50:
                {
                alt27=3;
                }
                break;
            case 51:
                {
                alt27=4;
                }
                break;
            case 52:
                {
                alt27=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1633:3: (enumLiteral_0= 'BACKWARD' )
                    {
                    // InternalMyDsl.g:1633:3: (enumLiteral_0= 'BACKWARD' )
                    // InternalMyDsl.g:1634:4: enumLiteral_0= 'BACKWARD'
                    {
                    enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getButtonTypeAccess().getBACKWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getButtonTypeAccess().getBACKWARDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1641:3: (enumLiteral_1= 'LEFT' )
                    {
                    // InternalMyDsl.g:1641:3: (enumLiteral_1= 'LEFT' )
                    // InternalMyDsl.g:1642:4: enumLiteral_1= 'LEFT'
                    {
                    enumLiteral_1=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getButtonTypeAccess().getLEFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getButtonTypeAccess().getLEFTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1649:3: (enumLiteral_2= 'RIGHT' )
                    {
                    // InternalMyDsl.g:1649:3: (enumLiteral_2= 'RIGHT' )
                    // InternalMyDsl.g:1650:4: enumLiteral_2= 'RIGHT'
                    {
                    enumLiteral_2=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getButtonTypeAccess().getRIGHTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getButtonTypeAccess().getRIGHTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1657:3: (enumLiteral_3= 'CENTER' )
                    {
                    // InternalMyDsl.g:1657:3: (enumLiteral_3= 'CENTER' )
                    // InternalMyDsl.g:1658:4: enumLiteral_3= 'CENTER'
                    {
                    enumLiteral_3=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getButtonTypeAccess().getCENTEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getButtonTypeAccess().getCENTEREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1665:3: (enumLiteral_4= 'FORWARD' )
                    {
                    // InternalMyDsl.g:1665:3: (enumLiteral_4= 'FORWARD' )
                    // InternalMyDsl.g:1666:4: enumLiteral_4= 'FORWARD'
                    {
                    enumLiteral_4=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getButtonTypeAccess().getFORWARDEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getButtonTypeAccess().getFORWARDEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleButtonType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000A3812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001480000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000004B000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000A7810L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000BB810L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000E3810L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000500002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x001F000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000200A3810L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000002000A3810L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000000A3810L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x00000180000A3810L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000100000A3810L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000000008A3810L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000010L});

}