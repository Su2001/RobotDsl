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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Action:'", "'-'", "'Condition:'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'if'", "'then'", "'else'", "'+'", "'*'", "'/'", "'('", "')'", "'!'", "'TRUE'", "'FALSE'", "'Event'", "'conditions:'", "'and'", "'actions:'", "','", "'Sound'", "'Button'", "'button'", "'Sensor'", "'sensorPos'", "'distance'", "'Tap'", "'MotorAction'", "'motorLeft'", "'motorRight'", "'SoundAction'", "'set:'", "'LightAction'", "'pos:'", "'red:'", "'green:'", "'blue:'", "'NONE'", "'MEDIUM'", "'LONG'", "'TOP'", "'BOT'", "'FAR'", "'CLOSE'", "'BACKWARD'", "'LEFT'", "'RIGHT'", "'CENTER'", "'FORWARD'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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
                case 33:
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
                case 22:
                case 28:
                case 30:
                case 31:
                case 32:
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
            	    						
            	    pushFollow(FOLLOW_6);
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
            	            alt1=1;
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
            	    	    							
            	    	    pushFollow(FOLLOW_6);
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
            	    				
            	    otherlv_8=(Token)match(input,12,FOLLOW_7); 

            	    					newLeafNode(otherlv_8, grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_2_1());
            	    				
            	    // InternalMyDsl.g:172:5: ( (lv_conditions_9_0= ruleCondition ) )
            	    // InternalMyDsl.g:173:6: (lv_conditions_9_0= ruleCondition )
            	    {
            	    // InternalMyDsl.g:173:6: (lv_conditions_9_0= ruleCondition )
            	    // InternalMyDsl.g:174:7: lv_conditions_9_0= ruleCondition
            	    {

            	    							newCompositeNode(grammarAccess.getRobotModelAccess().getConditionsConditionParserRuleCall_1_2_2_0());
            	    						
            	    pushFollow(FOLLOW_6);
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
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalMyDsl.g:192:6: otherlv_10= '-' ( (lv_conditions_11_0= ruleCondition ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,12,FOLLOW_7); 

            	    	    						newLeafNode(otherlv_10, grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_2_3_0());
            	    	    					
            	    	    // InternalMyDsl.g:196:6: ( (lv_conditions_11_0= ruleCondition ) )
            	    	    // InternalMyDsl.g:197:7: (lv_conditions_11_0= ruleCondition )
            	    	    {
            	    	    // InternalMyDsl.g:197:7: (lv_conditions_11_0= ruleCondition )
            	    	    // InternalMyDsl.g:198:8: lv_conditions_11_0= ruleCondition
            	    	    {

            	    	    								newCompositeNode(grammarAccess.getRobotModelAccess().getConditionsConditionParserRuleCall_1_2_3_1_0());
            	    	    							
            	    	    pushFollow(FOLLOW_6);
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
    // InternalMyDsl.g:249:1: ruleExpression returns [EObject current=null] : (this_Or_0= ruleOr | this_If_1= ruleIf ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;

        EObject this_If_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:255:2: ( (this_Or_0= ruleOr | this_If_1= ruleIf ) )
            // InternalMyDsl.g:256:2: (this_Or_0= ruleOr | this_If_1= ruleIf )
            {
            // InternalMyDsl.g:256:2: (this_Or_0= ruleOr | this_If_1= ruleIf )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT||LA4_0==28||(LA4_0>=30 && LA4_0<=32)) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:257:3: this_Or_0= ruleOr
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Or_0=ruleOr();

                    state._fsp--;


                    			current = this_Or_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:266:3: this_If_1= ruleIf
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getIfParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_If_1=ruleIf();

                    state._fsp--;


                    			current = this_If_1;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalMyDsl.g:278:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalMyDsl.g:278:43: (iv_ruleOr= ruleOr EOF )
            // InternalMyDsl.g:279:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalMyDsl.g:285:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () ( (lv_operation_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token lv_operation_2_0=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:291:2: ( (this_And_0= ruleAnd ( () ( (lv_operation_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalMyDsl.g:292:2: (this_And_0= ruleAnd ( () ( (lv_operation_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalMyDsl.g:292:2: (this_And_0= ruleAnd ( () ( (lv_operation_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalMyDsl.g:293:3: this_And_0= ruleAnd ( () ( (lv_operation_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_8);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:301:3: ( () ( (lv_operation_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:302:4: () ( (lv_operation_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalMyDsl.g:302:4: ()
            	    // InternalMyDsl.g:303:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMyDsl.g:309:4: ( (lv_operation_2_0= '||' ) )
            	    // InternalMyDsl.g:310:5: (lv_operation_2_0= '||' )
            	    {
            	    // InternalMyDsl.g:310:5: (lv_operation_2_0= '||' )
            	    // InternalMyDsl.g:311:6: lv_operation_2_0= '||'
            	    {
            	    lv_operation_2_0=(Token)match(input,14,FOLLOW_9); 

            	    						newLeafNode(lv_operation_2_0, grammarAccess.getOrAccess().getOperationVerticalLineVerticalLineKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getOrRule());
            	    						}
            	    						setWithLastConsumed(current, "operation", lv_operation_2_0, "||");
            	    					

            	    }


            	    }

            	    // InternalMyDsl.g:323:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalMyDsl.g:324:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalMyDsl.g:324:5: (lv_right_3_0= ruleAnd )
            	    // InternalMyDsl.g:325:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl1.MyDsl.And");
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalMyDsl.g:347:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalMyDsl.g:347:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalMyDsl.g:348:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalMyDsl.g:354:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () ( (lv_operation_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token lv_operation_2_0=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:360:2: ( (this_Equality_0= ruleEquality ( () ( (lv_operation_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalMyDsl.g:361:2: (this_Equality_0= ruleEquality ( () ( (lv_operation_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalMyDsl.g:361:2: (this_Equality_0= ruleEquality ( () ( (lv_operation_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalMyDsl.g:362:3: this_Equality_0= ruleEquality ( () ( (lv_operation_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_Equality_0=ruleEquality();

            state._fsp--;


            			current = this_Equality_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:370:3: ( () ( (lv_operation_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:371:4: () ( (lv_operation_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalMyDsl.g:371:4: ()
            	    // InternalMyDsl.g:372:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMyDsl.g:378:4: ( (lv_operation_2_0= '&&' ) )
            	    // InternalMyDsl.g:379:5: (lv_operation_2_0= '&&' )
            	    {
            	    // InternalMyDsl.g:379:5: (lv_operation_2_0= '&&' )
            	    // InternalMyDsl.g:380:6: lv_operation_2_0= '&&'
            	    {
            	    lv_operation_2_0=(Token)match(input,15,FOLLOW_9); 

            	    						newLeafNode(lv_operation_2_0, grammarAccess.getAndAccess().getOperationAmpersandAmpersandKeyword_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAndRule());
            	    						}
            	    						setWithLastConsumed(current, "operation", lv_operation_2_0, "&&");
            	    					

            	    }


            	    }

            	    // InternalMyDsl.g:392:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalMyDsl.g:393:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalMyDsl.g:393:5: (lv_right_3_0= ruleEquality )
            	    // InternalMyDsl.g:394:6: lv_right_3_0= ruleEquality
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl1.MyDsl.Equality");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalMyDsl.g:416:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalMyDsl.g:416:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalMyDsl.g:417:2: iv_ruleEquality= ruleEquality EOF
            {
             newCompositeNode(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;

             current =iv_ruleEquality; 
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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalMyDsl.g:423:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_operation_2_1= '==' | lv_operation_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_operation_2_1=null;
        Token lv_operation_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:429:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_operation_2_1= '==' | lv_operation_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalMyDsl.g:430:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_operation_2_1= '==' | lv_operation_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalMyDsl.g:430:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_operation_2_1= '==' | lv_operation_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalMyDsl.g:431:3: this_Comparison_0= ruleComparison ( () ( ( (lv_operation_2_1= '==' | lv_operation_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {

            			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
            		
            pushFollow(FOLLOW_11);
            this_Comparison_0=ruleComparison();

            state._fsp--;


            			current = this_Comparison_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:439:3: ( () ( ( (lv_operation_2_1= '==' | lv_operation_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=16 && LA8_0<=17)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:440:4: () ( ( (lv_operation_2_1= '==' | lv_operation_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalMyDsl.g:440:4: ()
            	    // InternalMyDsl.g:441:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEqualityAccess().getExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMyDsl.g:447:4: ( ( (lv_operation_2_1= '==' | lv_operation_2_2= '!=' ) ) )
            	    // InternalMyDsl.g:448:5: ( (lv_operation_2_1= '==' | lv_operation_2_2= '!=' ) )
            	    {
            	    // InternalMyDsl.g:448:5: ( (lv_operation_2_1= '==' | lv_operation_2_2= '!=' ) )
            	    // InternalMyDsl.g:449:6: (lv_operation_2_1= '==' | lv_operation_2_2= '!=' )
            	    {
            	    // InternalMyDsl.g:449:6: (lv_operation_2_1= '==' | lv_operation_2_2= '!=' )
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==16) ) {
            	        alt7=1;
            	    }
            	    else if ( (LA7_0==17) ) {
            	        alt7=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 7, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalMyDsl.g:450:7: lv_operation_2_1= '=='
            	            {
            	            lv_operation_2_1=(Token)match(input,16,FOLLOW_9); 

            	            							newLeafNode(lv_operation_2_1, grammarAccess.getEqualityAccess().getOperationEqualsSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "operation", lv_operation_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:461:7: lv_operation_2_2= '!='
            	            {
            	            lv_operation_2_2=(Token)match(input,17,FOLLOW_9); 

            	            							newLeafNode(lv_operation_2_2, grammarAccess.getEqualityAccess().getOperationExclamationMarkEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEqualityRule());
            	            							}
            	            							setWithLastConsumed(current, "operation", lv_operation_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMyDsl.g:474:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalMyDsl.g:475:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalMyDsl.g:475:5: (lv_right_3_0= ruleComparison )
            	    // InternalMyDsl.g:476:6: lv_right_3_0= ruleComparison
            	    {

            	    						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl1.MyDsl.Comparison");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalMyDsl.g:498:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalMyDsl.g:498:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalMyDsl.g:499:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalMyDsl.g:505:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_operation_2_1= '>=' | lv_operation_2_2= '<=' | lv_operation_2_3= '>' | lv_operation_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_operation_2_1=null;
        Token lv_operation_2_2=null;
        Token lv_operation_2_3=null;
        Token lv_operation_2_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:511:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_operation_2_1= '>=' | lv_operation_2_2= '<=' | lv_operation_2_3= '>' | lv_operation_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalMyDsl.g:512:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_operation_2_1= '>=' | lv_operation_2_2= '<=' | lv_operation_2_3= '>' | lv_operation_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalMyDsl.g:512:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_operation_2_1= '>=' | lv_operation_2_2= '<=' | lv_operation_2_3= '>' | lv_operation_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalMyDsl.g:513:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_operation_2_1= '>=' | lv_operation_2_2= '<=' | lv_operation_2_3= '>' | lv_operation_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {

            			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
            		
            pushFollow(FOLLOW_12);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;


            			current = this_PlusOrMinus_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:521:3: ( () ( ( (lv_operation_2_1= '>=' | lv_operation_2_2= '<=' | lv_operation_2_3= '>' | lv_operation_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=18 && LA10_0<=21)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:522:4: () ( ( (lv_operation_2_1= '>=' | lv_operation_2_2= '<=' | lv_operation_2_3= '>' | lv_operation_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalMyDsl.g:522:4: ()
            	    // InternalMyDsl.g:523:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getComparisonAccess().getExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMyDsl.g:529:4: ( ( (lv_operation_2_1= '>=' | lv_operation_2_2= '<=' | lv_operation_2_3= '>' | lv_operation_2_4= '<' ) ) )
            	    // InternalMyDsl.g:530:5: ( (lv_operation_2_1= '>=' | lv_operation_2_2= '<=' | lv_operation_2_3= '>' | lv_operation_2_4= '<' ) )
            	    {
            	    // InternalMyDsl.g:530:5: ( (lv_operation_2_1= '>=' | lv_operation_2_2= '<=' | lv_operation_2_3= '>' | lv_operation_2_4= '<' ) )
            	    // InternalMyDsl.g:531:6: (lv_operation_2_1= '>=' | lv_operation_2_2= '<=' | lv_operation_2_3= '>' | lv_operation_2_4= '<' )
            	    {
            	    // InternalMyDsl.g:531:6: (lv_operation_2_1= '>=' | lv_operation_2_2= '<=' | lv_operation_2_3= '>' | lv_operation_2_4= '<' )
            	    int alt9=4;
            	    switch ( input.LA(1) ) {
            	    case 18:
            	        {
            	        alt9=1;
            	        }
            	        break;
            	    case 19:
            	        {
            	        alt9=2;
            	        }
            	        break;
            	    case 20:
            	        {
            	        alt9=3;
            	        }
            	        break;
            	    case 21:
            	        {
            	        alt9=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt9) {
            	        case 1 :
            	            // InternalMyDsl.g:532:7: lv_operation_2_1= '>='
            	            {
            	            lv_operation_2_1=(Token)match(input,18,FOLLOW_9); 

            	            							newLeafNode(lv_operation_2_1, grammarAccess.getComparisonAccess().getOperationGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "operation", lv_operation_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:543:7: lv_operation_2_2= '<='
            	            {
            	            lv_operation_2_2=(Token)match(input,19,FOLLOW_9); 

            	            							newLeafNode(lv_operation_2_2, grammarAccess.getComparisonAccess().getOperationLessThanSignEqualsSignKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "operation", lv_operation_2_2, null);
            	            						

            	            }
            	            break;
            	        case 3 :
            	            // InternalMyDsl.g:554:7: lv_operation_2_3= '>'
            	            {
            	            lv_operation_2_3=(Token)match(input,20,FOLLOW_9); 

            	            							newLeafNode(lv_operation_2_3, grammarAccess.getComparisonAccess().getOperationGreaterThanSignKeyword_1_1_0_2());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "operation", lv_operation_2_3, null);
            	            						

            	            }
            	            break;
            	        case 4 :
            	            // InternalMyDsl.g:565:7: lv_operation_2_4= '<'
            	            {
            	            lv_operation_2_4=(Token)match(input,21,FOLLOW_9); 

            	            							newLeafNode(lv_operation_2_4, grammarAccess.getComparisonAccess().getOperationLessThanSignKeyword_1_1_0_3());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getComparisonRule());
            	            							}
            	            							setWithLastConsumed(current, "operation", lv_operation_2_4, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMyDsl.g:578:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalMyDsl.g:579:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalMyDsl.g:579:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalMyDsl.g:580:6: lv_right_3_0= rulePlusOrMinus
            	    {

            	    						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.xtext.example.mydsl1.MyDsl.PlusOrMinus");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleIf"
    // InternalMyDsl.g:602:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalMyDsl.g:602:43: (iv_ruleIf= ruleIf EOF )
            // InternalMyDsl.g:603:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalMyDsl.g:609:1: ruleIf returns [EObject current=null] : ( () ( (lv_operation_1_0= 'if' ) ) ( (lv_left_2_0= ruleExpression ) ) ( (lv_right_3_0= ruleThen ) ) ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token lv_operation_1_0=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:615:2: ( ( () ( (lv_operation_1_0= 'if' ) ) ( (lv_left_2_0= ruleExpression ) ) ( (lv_right_3_0= ruleThen ) ) ) )
            // InternalMyDsl.g:616:2: ( () ( (lv_operation_1_0= 'if' ) ) ( (lv_left_2_0= ruleExpression ) ) ( (lv_right_3_0= ruleThen ) ) )
            {
            // InternalMyDsl.g:616:2: ( () ( (lv_operation_1_0= 'if' ) ) ( (lv_left_2_0= ruleExpression ) ) ( (lv_right_3_0= ruleThen ) ) )
            // InternalMyDsl.g:617:3: () ( (lv_operation_1_0= 'if' ) ) ( (lv_left_2_0= ruleExpression ) ) ( (lv_right_3_0= ruleThen ) )
            {
            // InternalMyDsl.g:617:3: ()
            // InternalMyDsl.g:618:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIfAccess().getExpressionAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:624:3: ( (lv_operation_1_0= 'if' ) )
            // InternalMyDsl.g:625:4: (lv_operation_1_0= 'if' )
            {
            // InternalMyDsl.g:625:4: (lv_operation_1_0= 'if' )
            // InternalMyDsl.g:626:5: lv_operation_1_0= 'if'
            {
            lv_operation_1_0=(Token)match(input,22,FOLLOW_13); 

            					newLeafNode(lv_operation_1_0, grammarAccess.getIfAccess().getOperationIfKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIfRule());
            					}
            					setWithLastConsumed(current, "operation", lv_operation_1_0, "if");
            				

            }


            }

            // InternalMyDsl.g:638:3: ( (lv_left_2_0= ruleExpression ) )
            // InternalMyDsl.g:639:4: (lv_left_2_0= ruleExpression )
            {
            // InternalMyDsl.g:639:4: (lv_left_2_0= ruleExpression )
            // InternalMyDsl.g:640:5: lv_left_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getIfAccess().getLeftExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_left_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_2_0,
            						"org.xtext.example.mydsl1.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:657:3: ( (lv_right_3_0= ruleThen ) )
            // InternalMyDsl.g:658:4: (lv_right_3_0= ruleThen )
            {
            // InternalMyDsl.g:658:4: (lv_right_3_0= ruleThen )
            // InternalMyDsl.g:659:5: lv_right_3_0= ruleThen
            {

            					newCompositeNode(grammarAccess.getIfAccess().getRightThenParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_3_0=ruleThen();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_3_0,
            						"org.xtext.example.mydsl1.MyDsl.Then");
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
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleThen"
    // InternalMyDsl.g:680:1: entryRuleThen returns [EObject current=null] : iv_ruleThen= ruleThen EOF ;
    public final EObject entryRuleThen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThen = null;


        try {
            // InternalMyDsl.g:680:45: (iv_ruleThen= ruleThen EOF )
            // InternalMyDsl.g:681:2: iv_ruleThen= ruleThen EOF
            {
             newCompositeNode(grammarAccess.getThenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleThen=ruleThen();

            state._fsp--;

             current =iv_ruleThen; 
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
    // $ANTLR end "entryRuleThen"


    // $ANTLR start "ruleThen"
    // InternalMyDsl.g:687:1: ruleThen returns [EObject current=null] : ( () ( (lv_operation_1_0= 'then' ) ) ( (lv_left_2_0= ruleExpression ) ) ( (lv_right_3_0= ruleElse ) ) ) ;
    public final EObject ruleThen() throws RecognitionException {
        EObject current = null;

        Token lv_operation_1_0=null;
        EObject lv_left_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:693:2: ( ( () ( (lv_operation_1_0= 'then' ) ) ( (lv_left_2_0= ruleExpression ) ) ( (lv_right_3_0= ruleElse ) ) ) )
            // InternalMyDsl.g:694:2: ( () ( (lv_operation_1_0= 'then' ) ) ( (lv_left_2_0= ruleExpression ) ) ( (lv_right_3_0= ruleElse ) ) )
            {
            // InternalMyDsl.g:694:2: ( () ( (lv_operation_1_0= 'then' ) ) ( (lv_left_2_0= ruleExpression ) ) ( (lv_right_3_0= ruleElse ) ) )
            // InternalMyDsl.g:695:3: () ( (lv_operation_1_0= 'then' ) ) ( (lv_left_2_0= ruleExpression ) ) ( (lv_right_3_0= ruleElse ) )
            {
            // InternalMyDsl.g:695:3: ()
            // InternalMyDsl.g:696:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getThenAccess().getExpressionAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:702:3: ( (lv_operation_1_0= 'then' ) )
            // InternalMyDsl.g:703:4: (lv_operation_1_0= 'then' )
            {
            // InternalMyDsl.g:703:4: (lv_operation_1_0= 'then' )
            // InternalMyDsl.g:704:5: lv_operation_1_0= 'then'
            {
            lv_operation_1_0=(Token)match(input,23,FOLLOW_14); 

            					newLeafNode(lv_operation_1_0, grammarAccess.getThenAccess().getOperationThenKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getThenRule());
            					}
            					setWithLastConsumed(current, "operation", lv_operation_1_0, "then");
            				

            }


            }

            // InternalMyDsl.g:716:3: ( (lv_left_2_0= ruleExpression ) )
            // InternalMyDsl.g:717:4: (lv_left_2_0= ruleExpression )
            {
            // InternalMyDsl.g:717:4: (lv_left_2_0= ruleExpression )
            // InternalMyDsl.g:718:5: lv_left_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getThenAccess().getLeftExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
            lv_left_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThenRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_2_0,
            						"org.xtext.example.mydsl1.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:735:3: ( (lv_right_3_0= ruleElse ) )
            // InternalMyDsl.g:736:4: (lv_right_3_0= ruleElse )
            {
            // InternalMyDsl.g:736:4: (lv_right_3_0= ruleElse )
            // InternalMyDsl.g:737:5: lv_right_3_0= ruleElse
            {

            					newCompositeNode(grammarAccess.getThenAccess().getRightElseParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_3_0=ruleElse();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getThenRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_3_0,
            						"org.xtext.example.mydsl1.MyDsl.Else");
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
    // $ANTLR end "ruleThen"


    // $ANTLR start "entryRuleElse"
    // InternalMyDsl.g:758:1: entryRuleElse returns [EObject current=null] : iv_ruleElse= ruleElse EOF ;
    public final EObject entryRuleElse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElse = null;


        try {
            // InternalMyDsl.g:758:45: (iv_ruleElse= ruleElse EOF )
            // InternalMyDsl.g:759:2: iv_ruleElse= ruleElse EOF
            {
             newCompositeNode(grammarAccess.getElseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElse=ruleElse();

            state._fsp--;

             current =iv_ruleElse; 
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
    // $ANTLR end "entryRuleElse"


    // $ANTLR start "ruleElse"
    // InternalMyDsl.g:765:1: ruleElse returns [EObject current=null] : ( () ( (lv_operation_1_0= 'else' ) ) ( (lv_left_2_0= ruleExpression ) ) ) ;
    public final EObject ruleElse() throws RecognitionException {
        EObject current = null;

        Token lv_operation_1_0=null;
        EObject lv_left_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:771:2: ( ( () ( (lv_operation_1_0= 'else' ) ) ( (lv_left_2_0= ruleExpression ) ) ) )
            // InternalMyDsl.g:772:2: ( () ( (lv_operation_1_0= 'else' ) ) ( (lv_left_2_0= ruleExpression ) ) )
            {
            // InternalMyDsl.g:772:2: ( () ( (lv_operation_1_0= 'else' ) ) ( (lv_left_2_0= ruleExpression ) ) )
            // InternalMyDsl.g:773:3: () ( (lv_operation_1_0= 'else' ) ) ( (lv_left_2_0= ruleExpression ) )
            {
            // InternalMyDsl.g:773:3: ()
            // InternalMyDsl.g:774:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getElseAccess().getExpressionAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:780:3: ( (lv_operation_1_0= 'else' ) )
            // InternalMyDsl.g:781:4: (lv_operation_1_0= 'else' )
            {
            // InternalMyDsl.g:781:4: (lv_operation_1_0= 'else' )
            // InternalMyDsl.g:782:5: lv_operation_1_0= 'else'
            {
            lv_operation_1_0=(Token)match(input,24,FOLLOW_15); 

            					newLeafNode(lv_operation_1_0, grammarAccess.getElseAccess().getOperationElseKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getElseRule());
            					}
            					setWithLastConsumed(current, "operation", lv_operation_1_0, "else");
            				

            }


            }

            // InternalMyDsl.g:794:3: ( (lv_left_2_0= ruleExpression ) )
            // InternalMyDsl.g:795:4: (lv_left_2_0= ruleExpression )
            {
            // InternalMyDsl.g:795:4: (lv_left_2_0= ruleExpression )
            // InternalMyDsl.g:796:5: lv_left_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getElseAccess().getLeftExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_left_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElseRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_2_0,
            						"org.xtext.example.mydsl1.MyDsl.Expression");
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
    // $ANTLR end "ruleElse"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalMyDsl.g:817:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalMyDsl.g:817:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalMyDsl.g:818:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
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
    // InternalMyDsl.g:824:1: rulePlusOrMinus returns [EObject current=null] : (this_MultOrDiv_0= ruleMultOrDiv ( ( () ( ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleMultOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token lv_operation_2_1=null;
        Token lv_operation_2_2=null;
        EObject this_MultOrDiv_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:830:2: ( (this_MultOrDiv_0= ruleMultOrDiv ( ( () ( ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleMultOrDiv ) ) )* ) )
            // InternalMyDsl.g:831:2: (this_MultOrDiv_0= ruleMultOrDiv ( ( () ( ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleMultOrDiv ) ) )* )
            {
            // InternalMyDsl.g:831:2: (this_MultOrDiv_0= ruleMultOrDiv ( ( () ( ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleMultOrDiv ) ) )* )
            // InternalMyDsl.g:832:3: this_MultOrDiv_0= ruleMultOrDiv ( ( () ( ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleMultOrDiv ) ) )*
            {

            			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMultOrDivParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_MultOrDiv_0=ruleMultOrDiv();

            state._fsp--;


            			current = this_MultOrDiv_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:840:3: ( ( () ( ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleMultOrDiv ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==12||LA12_0==25) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:841:4: ( () ( ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) ) ) ) ( (lv_right_3_0= ruleMultOrDiv ) )
            	    {
            	    // InternalMyDsl.g:841:4: ( () ( ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) ) ) )
            	    // InternalMyDsl.g:842:5: () ( ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) ) )
            	    {
            	    // InternalMyDsl.g:842:5: ()
            	    // InternalMyDsl.g:843:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getPlusOrMinusAccess().getExpressionLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    // InternalMyDsl.g:849:5: ( ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) ) )
            	    // InternalMyDsl.g:850:6: ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) )
            	    {
            	    // InternalMyDsl.g:850:6: ( (lv_operation_2_1= '+' | lv_operation_2_2= '-' ) )
            	    // InternalMyDsl.g:851:7: (lv_operation_2_1= '+' | lv_operation_2_2= '-' )
            	    {
            	    // InternalMyDsl.g:851:7: (lv_operation_2_1= '+' | lv_operation_2_2= '-' )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==25) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==12) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalMyDsl.g:852:8: lv_operation_2_1= '+'
            	            {
            	            lv_operation_2_1=(Token)match(input,25,FOLLOW_9); 

            	            								newLeafNode(lv_operation_2_1, grammarAccess.getPlusOrMinusAccess().getOperationPlusSignKeyword_1_0_1_0_0());
            	            							

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getPlusOrMinusRule());
            	            								}
            	            								setWithLastConsumed(current, "operation", lv_operation_2_1, null);
            	            							

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:863:8: lv_operation_2_2= '-'
            	            {
            	            lv_operation_2_2=(Token)match(input,12,FOLLOW_9); 

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

            	    // InternalMyDsl.g:877:4: ( (lv_right_3_0= ruleMultOrDiv ) )
            	    // InternalMyDsl.g:878:5: (lv_right_3_0= ruleMultOrDiv )
            	    {
            	    // InternalMyDsl.g:878:5: (lv_right_3_0= ruleMultOrDiv )
            	    // InternalMyDsl.g:879:6: lv_right_3_0= ruleMultOrDiv
            	    {

            	    						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMultOrDivParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
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
            	    break loop12;
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
    // InternalMyDsl.g:901:1: entryRuleMultOrDiv returns [EObject current=null] : iv_ruleMultOrDiv= ruleMultOrDiv EOF ;
    public final EObject entryRuleMultOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultOrDiv = null;


        try {
            // InternalMyDsl.g:901:50: (iv_ruleMultOrDiv= ruleMultOrDiv EOF )
            // InternalMyDsl.g:902:2: iv_ruleMultOrDiv= ruleMultOrDiv EOF
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
    // InternalMyDsl.g:908:1: ruleMultOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_operation_2_1= '*' | lv_operation_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMultOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_operation_2_1=null;
        Token lv_operation_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:914:2: ( (this_Primary_0= rulePrimary ( () ( ( (lv_operation_2_1= '*' | lv_operation_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalMyDsl.g:915:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operation_2_1= '*' | lv_operation_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalMyDsl.g:915:2: (this_Primary_0= rulePrimary ( () ( ( (lv_operation_2_1= '*' | lv_operation_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalMyDsl.g:916:3: this_Primary_0= rulePrimary ( () ( ( (lv_operation_2_1= '*' | lv_operation_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultOrDivAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_17);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMyDsl.g:924:3: ( () ( ( (lv_operation_2_1= '*' | lv_operation_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=26 && LA14_0<=27)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:925:4: () ( ( (lv_operation_2_1= '*' | lv_operation_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalMyDsl.g:925:4: ()
            	    // InternalMyDsl.g:926:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getMultOrDivAccess().getExpressionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMyDsl.g:932:4: ( ( (lv_operation_2_1= '*' | lv_operation_2_2= '/' ) ) )
            	    // InternalMyDsl.g:933:5: ( (lv_operation_2_1= '*' | lv_operation_2_2= '/' ) )
            	    {
            	    // InternalMyDsl.g:933:5: ( (lv_operation_2_1= '*' | lv_operation_2_2= '/' ) )
            	    // InternalMyDsl.g:934:6: (lv_operation_2_1= '*' | lv_operation_2_2= '/' )
            	    {
            	    // InternalMyDsl.g:934:6: (lv_operation_2_1= '*' | lv_operation_2_2= '/' )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==26) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==27) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalMyDsl.g:935:7: lv_operation_2_1= '*'
            	            {
            	            lv_operation_2_1=(Token)match(input,26,FOLLOW_9); 

            	            							newLeafNode(lv_operation_2_1, grammarAccess.getMultOrDivAccess().getOperationAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getMultOrDivRule());
            	            							}
            	            							setWithLastConsumed(current, "operation", lv_operation_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMyDsl.g:946:7: lv_operation_2_2= '/'
            	            {
            	            lv_operation_2_2=(Token)match(input,27,FOLLOW_9); 

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

            	    // InternalMyDsl.g:959:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalMyDsl.g:960:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalMyDsl.g:960:5: (lv_right_3_0= rulePrimary )
            	    // InternalMyDsl.g:961:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getMultOrDivAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
            	    break loop14;
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
    // InternalMyDsl.g:983:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMyDsl.g:983:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMyDsl.g:984:2: iv_rulePrimary= rulePrimary EOF
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
    // InternalMyDsl.g:990:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_operation_4_0= '!' ) ) ( (lv_left_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_operation_4_0=null;
        EObject this_Expression_1 = null;

        EObject lv_left_5_0 = null;

        EObject this_Atomic_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:996:2: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_operation_4_0= '!' ) ) ( (lv_left_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // InternalMyDsl.g:997:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_operation_4_0= '!' ) ) ( (lv_left_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // InternalMyDsl.g:997:2: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () ( (lv_operation_4_0= '!' ) ) ( (lv_left_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt15=1;
                }
                break;
            case 30:
                {
                alt15=2;
                }
                break;
            case RULE_INT:
            case 31:
            case 32:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:998:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // InternalMyDsl.g:998:3: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // InternalMyDsl.g:999:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,28,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_19);
                    this_Expression_1=ruleExpression();

                    state._fsp--;


                    				current = this_Expression_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1017:3: ( () ( (lv_operation_4_0= '!' ) ) ( (lv_left_5_0= rulePrimary ) ) )
                    {
                    // InternalMyDsl.g:1017:3: ( () ( (lv_operation_4_0= '!' ) ) ( (lv_left_5_0= rulePrimary ) ) )
                    // InternalMyDsl.g:1018:4: () ( (lv_operation_4_0= '!' ) ) ( (lv_left_5_0= rulePrimary ) )
                    {
                    // InternalMyDsl.g:1018:4: ()
                    // InternalMyDsl.g:1019:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMyDsl.g:1025:4: ( (lv_operation_4_0= '!' ) )
                    // InternalMyDsl.g:1026:5: (lv_operation_4_0= '!' )
                    {
                    // InternalMyDsl.g:1026:5: (lv_operation_4_0= '!' )
                    // InternalMyDsl.g:1027:6: lv_operation_4_0= '!'
                    {
                    lv_operation_4_0=(Token)match(input,30,FOLLOW_9); 

                    						newLeafNode(lv_operation_4_0, grammarAccess.getPrimaryAccess().getOperationExclamationMarkKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(current, "operation", lv_operation_4_0, "!");
                    					

                    }


                    }

                    // InternalMyDsl.g:1039:4: ( (lv_left_5_0= rulePrimary ) )
                    // InternalMyDsl.g:1040:5: (lv_left_5_0= rulePrimary )
                    {
                    // InternalMyDsl.g:1040:5: (lv_left_5_0= rulePrimary )
                    // InternalMyDsl.g:1041:6: lv_left_5_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getLeftPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_left_5_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_5_0,
                    							"org.xtext.example.mydsl1.MyDsl.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1060:3: this_Atomic_6= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_6;
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
    // InternalMyDsl.g:1072:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalMyDsl.g:1072:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalMyDsl.g:1073:2: iv_ruleAtomic= ruleAtomic EOF
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
    // InternalMyDsl.g:1079:1: ruleAtomic returns [EObject current=null] : ( () ( ( (lv_value_1_0= RULE_INT ) ) | (otherlv_2= 'TRUE' | otherlv_3= 'FALSE' ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1085:2: ( ( () ( ( (lv_value_1_0= RULE_INT ) ) | (otherlv_2= 'TRUE' | otherlv_3= 'FALSE' ) ) ) )
            // InternalMyDsl.g:1086:2: ( () ( ( (lv_value_1_0= RULE_INT ) ) | (otherlv_2= 'TRUE' | otherlv_3= 'FALSE' ) ) )
            {
            // InternalMyDsl.g:1086:2: ( () ( ( (lv_value_1_0= RULE_INT ) ) | (otherlv_2= 'TRUE' | otherlv_3= 'FALSE' ) ) )
            // InternalMyDsl.g:1087:3: () ( ( (lv_value_1_0= RULE_INT ) ) | (otherlv_2= 'TRUE' | otherlv_3= 'FALSE' ) )
            {
            // InternalMyDsl.g:1087:3: ()
            // InternalMyDsl.g:1088:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAtomicAccess().getExpressionAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1094:3: ( ( (lv_value_1_0= RULE_INT ) ) | (otherlv_2= 'TRUE' | otherlv_3= 'FALSE' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_INT) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=31 && LA17_0<=32)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1095:4: ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMyDsl.g:1095:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMyDsl.g:1096:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMyDsl.g:1096:5: (lv_value_1_0= RULE_INT )
                    // InternalMyDsl.g:1097:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1114:4: (otherlv_2= 'TRUE' | otherlv_3= 'FALSE' )
                    {
                    // InternalMyDsl.g:1114:4: (otherlv_2= 'TRUE' | otherlv_3= 'FALSE' )
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==31) ) {
                        alt16=1;
                    }
                    else if ( (LA16_0==32) ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 0, input);

                        throw nvae;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalMyDsl.g:1115:5: otherlv_2= 'TRUE'
                            {
                            otherlv_2=(Token)match(input,31,FOLLOW_2); 

                            					newLeafNode(otherlv_2, grammarAccess.getAtomicAccess().getTRUEKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:1120:5: otherlv_3= 'FALSE'
                            {
                            otherlv_3=(Token)match(input,32,FOLLOW_2); 

                            					newLeafNode(otherlv_3, grammarAccess.getAtomicAccess().getFALSEKeyword_1_1_1());
                            				

                            }
                            break;

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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleEvent"
    // InternalMyDsl.g:1130:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalMyDsl.g:1130:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalMyDsl.g:1131:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalMyDsl.g:1137:1: ruleEvent returns [EObject current=null] : ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'conditions:' ( ( ruleEString ) ) (otherlv_5= 'and' ( ( ruleEString ) ) )* )? (otherlv_7= 'actions:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? ) ;
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
            // InternalMyDsl.g:1143:2: ( ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'conditions:' ( ( ruleEString ) ) (otherlv_5= 'and' ( ( ruleEString ) ) )* )? (otherlv_7= 'actions:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? ) )
            // InternalMyDsl.g:1144:2: ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'conditions:' ( ( ruleEString ) ) (otherlv_5= 'and' ( ( ruleEString ) ) )* )? (otherlv_7= 'actions:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? )
            {
            // InternalMyDsl.g:1144:2: ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'conditions:' ( ( ruleEString ) ) (otherlv_5= 'and' ( ( ruleEString ) ) )* )? (otherlv_7= 'actions:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )? )
            // InternalMyDsl.g:1145:3: () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'conditions:' ( ( ruleEString ) ) (otherlv_5= 'and' ( ( ruleEString ) ) )* )? (otherlv_7= 'actions:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )?
            {
            // InternalMyDsl.g:1145:3: ()
            // InternalMyDsl.g:1146:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventAccess().getEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEventKeyword_1());
            		
            // InternalMyDsl.g:1156:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:1157:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:1157:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:1158:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalMyDsl.g:1175:3: (otherlv_3= 'conditions:' ( ( ruleEString ) ) (otherlv_5= 'and' ( ( ruleEString ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1176:4: otherlv_3= 'conditions:' ( ( ruleEString ) ) (otherlv_5= 'and' ( ( ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,34,FOLLOW_20); 

                    				newLeafNode(otherlv_3, grammarAccess.getEventAccess().getConditionsKeyword_3_0());
                    			
                    // InternalMyDsl.g:1180:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1181:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1181:5: ( ruleEString )
                    // InternalMyDsl.g:1182:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEventAccess().getConditionsConditionCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1196:4: (otherlv_5= 'and' ( ( ruleEString ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==35) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMyDsl.g:1197:5: otherlv_5= 'and' ( ( ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,35,FOLLOW_20); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEventAccess().getAndKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:1201:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1202:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1202:6: ( ruleEString )
                    	    // InternalMyDsl.g:1203:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEventRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEventAccess().getConditionsConditionCrossReference_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMyDsl.g:1219:3: (otherlv_7= 'actions:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==36) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1220:4: otherlv_7= 'actions:' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_20); 

                    				newLeafNode(otherlv_7, grammarAccess.getEventAccess().getActionsKeyword_4_0());
                    			
                    // InternalMyDsl.g:1224:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1225:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1225:5: ( ruleEString )
                    // InternalMyDsl.g:1226:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEventAccess().getActionsActionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1240:4: (otherlv_9= ',' ( ( ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==37) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalMyDsl.g:1241:5: otherlv_9= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_9=(Token)match(input,37,FOLLOW_20); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getEventAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:1245:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1246:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1246:6: ( ruleEString )
                    	    // InternalMyDsl.g:1247:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEventRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEventAccess().getActionsActionCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
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
    // InternalMyDsl.g:1267:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:1267:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:1268:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalMyDsl.g:1274:1: ruleCondition returns [EObject current=null] : (this_Button_0= ruleButton | this_Sensor_1= ruleSensor | this_Sound_2= ruleSound | this_Tap_3= ruleTap ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Button_0 = null;

        EObject this_Sensor_1 = null;

        EObject this_Sound_2 = null;

        EObject this_Tap_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1280:2: ( (this_Button_0= ruleButton | this_Sensor_1= ruleSensor | this_Sound_2= ruleSound | this_Tap_3= ruleTap ) )
            // InternalMyDsl.g:1281:2: (this_Button_0= ruleButton | this_Sensor_1= ruleSensor | this_Sound_2= ruleSound | this_Tap_3= ruleTap )
            {
            // InternalMyDsl.g:1281:2: (this_Button_0= ruleButton | this_Sensor_1= ruleSensor | this_Sound_2= ruleSound | this_Tap_3= ruleTap )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt22=1;
                }
                break;
            case 41:
                {
                alt22=2;
                }
                break;
            case 38:
                {
                alt22=3;
                }
                break;
            case 44:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1282:3: this_Button_0= ruleButton
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
                    // InternalMyDsl.g:1291:3: this_Sensor_1= ruleSensor
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
                    // InternalMyDsl.g:1300:3: this_Sound_2= ruleSound
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
                    // InternalMyDsl.g:1309:3: this_Tap_3= ruleTap
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
    // InternalMyDsl.g:1321:1: entryRuleSound returns [EObject current=null] : iv_ruleSound= ruleSound EOF ;
    public final EObject entryRuleSound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSound = null;


        try {
            // InternalMyDsl.g:1321:46: (iv_ruleSound= ruleSound EOF )
            // InternalMyDsl.g:1322:2: iv_ruleSound= ruleSound EOF
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
    // InternalMyDsl.g:1328:1: ruleSound returns [EObject current=null] : ( () otherlv_1= 'Sound' ( (lv_conditionname_2_0= ruleEString ) ) ) ;
    public final EObject ruleSound() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_conditionname_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1334:2: ( ( () otherlv_1= 'Sound' ( (lv_conditionname_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:1335:2: ( () otherlv_1= 'Sound' ( (lv_conditionname_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:1335:2: ( () otherlv_1= 'Sound' ( (lv_conditionname_2_0= ruleEString ) ) )
            // InternalMyDsl.g:1336:3: () otherlv_1= 'Sound' ( (lv_conditionname_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:1336:3: ()
            // InternalMyDsl.g:1337:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSoundAccess().getSoundAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSoundAccess().getSoundKeyword_1());
            		
            // InternalMyDsl.g:1347:3: ( (lv_conditionname_2_0= ruleEString ) )
            // InternalMyDsl.g:1348:4: (lv_conditionname_2_0= ruleEString )
            {
            // InternalMyDsl.g:1348:4: (lv_conditionname_2_0= ruleEString )
            // InternalMyDsl.g:1349:5: lv_conditionname_2_0= ruleEString
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
    // InternalMyDsl.g:1370:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalMyDsl.g:1370:47: (iv_ruleButton= ruleButton EOF )
            // InternalMyDsl.g:1371:2: iv_ruleButton= ruleButton EOF
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
    // InternalMyDsl.g:1377:1: ruleButton returns [EObject current=null] : ( () otherlv_1= 'Button' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'button' ( (lv_button_4_0= ruleButtonType ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_conditionname_2_0 = null;

        Enumerator lv_button_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1383:2: ( ( () otherlv_1= 'Button' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'button' ( (lv_button_4_0= ruleButtonType ) ) ) )
            // InternalMyDsl.g:1384:2: ( () otherlv_1= 'Button' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'button' ( (lv_button_4_0= ruleButtonType ) ) )
            {
            // InternalMyDsl.g:1384:2: ( () otherlv_1= 'Button' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'button' ( (lv_button_4_0= ruleButtonType ) ) )
            // InternalMyDsl.g:1385:3: () otherlv_1= 'Button' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'button' ( (lv_button_4_0= ruleButtonType ) )
            {
            // InternalMyDsl.g:1385:3: ()
            // InternalMyDsl.g:1386:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getButtonAccess().getButtonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getButtonKeyword_1());
            		
            // InternalMyDsl.g:1396:3: ( (lv_conditionname_2_0= ruleEString ) )
            // InternalMyDsl.g:1397:4: (lv_conditionname_2_0= ruleEString )
            {
            // InternalMyDsl.g:1397:4: (lv_conditionname_2_0= ruleEString )
            // InternalMyDsl.g:1398:5: lv_conditionname_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getButtonAccess().getConditionnameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_24);
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

            otherlv_3=(Token)match(input,40,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getButtonAccess().getButtonKeyword_3());
            		
            // InternalMyDsl.g:1419:3: ( (lv_button_4_0= ruleButtonType ) )
            // InternalMyDsl.g:1420:4: (lv_button_4_0= ruleButtonType )
            {
            // InternalMyDsl.g:1420:4: (lv_button_4_0= ruleButtonType )
            // InternalMyDsl.g:1421:5: lv_button_4_0= ruleButtonType
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
    // InternalMyDsl.g:1442:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalMyDsl.g:1442:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalMyDsl.g:1443:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalMyDsl.g:1449:1: ruleSensor returns [EObject current=null] : ( () otherlv_1= 'Sensor' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'sensorPos' ( (lv_sensorPos_4_0= ruleEInt ) ) otherlv_5= 'distance' ( (lv_distance_6_0= ruleDistance ) ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_conditionname_2_0 = null;

        AntlrDatatypeRuleToken lv_sensorPos_4_0 = null;

        Enumerator lv_distance_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1455:2: ( ( () otherlv_1= 'Sensor' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'sensorPos' ( (lv_sensorPos_4_0= ruleEInt ) ) otherlv_5= 'distance' ( (lv_distance_6_0= ruleDistance ) ) ) )
            // InternalMyDsl.g:1456:2: ( () otherlv_1= 'Sensor' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'sensorPos' ( (lv_sensorPos_4_0= ruleEInt ) ) otherlv_5= 'distance' ( (lv_distance_6_0= ruleDistance ) ) )
            {
            // InternalMyDsl.g:1456:2: ( () otherlv_1= 'Sensor' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'sensorPos' ( (lv_sensorPos_4_0= ruleEInt ) ) otherlv_5= 'distance' ( (lv_distance_6_0= ruleDistance ) ) )
            // InternalMyDsl.g:1457:3: () otherlv_1= 'Sensor' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'sensorPos' ( (lv_sensorPos_4_0= ruleEInt ) ) otherlv_5= 'distance' ( (lv_distance_6_0= ruleDistance ) )
            {
            // InternalMyDsl.g:1457:3: ()
            // InternalMyDsl.g:1458:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorAccess().getSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
            		
            // InternalMyDsl.g:1468:3: ( (lv_conditionname_2_0= ruleEString ) )
            // InternalMyDsl.g:1469:4: (lv_conditionname_2_0= ruleEString )
            {
            // InternalMyDsl.g:1469:4: (lv_conditionname_2_0= ruleEString )
            // InternalMyDsl.g:1470:5: lv_conditionname_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getConditionnameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_3=(Token)match(input,42,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getSensorPosKeyword_3());
            		
            // InternalMyDsl.g:1491:3: ( (lv_sensorPos_4_0= ruleEInt ) )
            // InternalMyDsl.g:1492:4: (lv_sensorPos_4_0= ruleEInt )
            {
            // InternalMyDsl.g:1492:4: (lv_sensorPos_4_0= ruleEInt )
            // InternalMyDsl.g:1493:5: lv_sensorPos_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getSensorPosEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_28);
            lv_sensorPos_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"sensorPos",
            						lv_sensorPos_4_0,
            						"org.xtext.example.mydsl1.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,43,FOLLOW_29); 

            			newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getDistanceKeyword_5());
            		
            // InternalMyDsl.g:1514:3: ( (lv_distance_6_0= ruleDistance ) )
            // InternalMyDsl.g:1515:4: (lv_distance_6_0= ruleDistance )
            {
            // InternalMyDsl.g:1515:4: (lv_distance_6_0= ruleDistance )
            // InternalMyDsl.g:1516:5: lv_distance_6_0= ruleDistance
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
    // InternalMyDsl.g:1537:1: entryRuleTap returns [EObject current=null] : iv_ruleTap= ruleTap EOF ;
    public final EObject entryRuleTap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTap = null;


        try {
            // InternalMyDsl.g:1537:44: (iv_ruleTap= ruleTap EOF )
            // InternalMyDsl.g:1538:2: iv_ruleTap= ruleTap EOF
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
    // InternalMyDsl.g:1544:1: ruleTap returns [EObject current=null] : ( () otherlv_1= 'Tap' ( (lv_conditionname_2_0= ruleEString ) ) ) ;
    public final EObject ruleTap() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_conditionname_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1550:2: ( ( () otherlv_1= 'Tap' ( (lv_conditionname_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:1551:2: ( () otherlv_1= 'Tap' ( (lv_conditionname_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:1551:2: ( () otherlv_1= 'Tap' ( (lv_conditionname_2_0= ruleEString ) ) )
            // InternalMyDsl.g:1552:3: () otherlv_1= 'Tap' ( (lv_conditionname_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:1552:3: ()
            // InternalMyDsl.g:1553:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTapAccess().getTapAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getTapAccess().getTapKeyword_1());
            		
            // InternalMyDsl.g:1563:3: ( (lv_conditionname_2_0= ruleEString ) )
            // InternalMyDsl.g:1564:4: (lv_conditionname_2_0= ruleEString )
            {
            // InternalMyDsl.g:1564:4: (lv_conditionname_2_0= ruleEString )
            // InternalMyDsl.g:1565:5: lv_conditionname_2_0= ruleEString
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
    // InternalMyDsl.g:1586:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDsl.g:1586:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDsl.g:1587:2: iv_ruleAction= ruleAction EOF
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
    // InternalMyDsl.g:1593:1: ruleAction returns [EObject current=null] : (this_MotorAction_0= ruleMotorAction | this_SoundAction_1= ruleSoundAction | this_LightAction_2= ruleLightAction ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_MotorAction_0 = null;

        EObject this_SoundAction_1 = null;

        EObject this_LightAction_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1599:2: ( (this_MotorAction_0= ruleMotorAction | this_SoundAction_1= ruleSoundAction | this_LightAction_2= ruleLightAction ) )
            // InternalMyDsl.g:1600:2: (this_MotorAction_0= ruleMotorAction | this_SoundAction_1= ruleSoundAction | this_LightAction_2= ruleLightAction )
            {
            // InternalMyDsl.g:1600:2: (this_MotorAction_0= ruleMotorAction | this_SoundAction_1= ruleSoundAction | this_LightAction_2= ruleLightAction )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt23=1;
                }
                break;
            case 48:
                {
                alt23=2;
                }
                break;
            case 50:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:1601:3: this_MotorAction_0= ruleMotorAction
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
                    // InternalMyDsl.g:1610:3: this_SoundAction_1= ruleSoundAction
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
                    // InternalMyDsl.g:1619:3: this_LightAction_2= ruleLightAction
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
    // InternalMyDsl.g:1631:1: entryRuleMotorAction returns [EObject current=null] : iv_ruleMotorAction= ruleMotorAction EOF ;
    public final EObject entryRuleMotorAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotorAction = null;


        try {
            // InternalMyDsl.g:1631:52: (iv_ruleMotorAction= ruleMotorAction EOF )
            // InternalMyDsl.g:1632:2: iv_ruleMotorAction= ruleMotorAction EOF
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
    // InternalMyDsl.g:1638:1: ruleMotorAction returns [EObject current=null] : ( () otherlv_1= 'MotorAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'motorLeft' ( (lv_motorLeft_4_0= ruleEInt ) ) )? (otherlv_5= 'motorRight' ( (lv_motorRight_6_0= ruleEInt ) ) )? ) ;
    public final EObject ruleMotorAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_actionname_2_0 = null;

        AntlrDatatypeRuleToken lv_motorLeft_4_0 = null;

        AntlrDatatypeRuleToken lv_motorRight_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1644:2: ( ( () otherlv_1= 'MotorAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'motorLeft' ( (lv_motorLeft_4_0= ruleEInt ) ) )? (otherlv_5= 'motorRight' ( (lv_motorRight_6_0= ruleEInt ) ) )? ) )
            // InternalMyDsl.g:1645:2: ( () otherlv_1= 'MotorAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'motorLeft' ( (lv_motorLeft_4_0= ruleEInt ) ) )? (otherlv_5= 'motorRight' ( (lv_motorRight_6_0= ruleEInt ) ) )? )
            {
            // InternalMyDsl.g:1645:2: ( () otherlv_1= 'MotorAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'motorLeft' ( (lv_motorLeft_4_0= ruleEInt ) ) )? (otherlv_5= 'motorRight' ( (lv_motorRight_6_0= ruleEInt ) ) )? )
            // InternalMyDsl.g:1646:3: () otherlv_1= 'MotorAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'motorLeft' ( (lv_motorLeft_4_0= ruleEInt ) ) )? (otherlv_5= 'motorRight' ( (lv_motorRight_6_0= ruleEInt ) ) )?
            {
            // InternalMyDsl.g:1646:3: ()
            // InternalMyDsl.g:1647:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMotorActionAccess().getMotorActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getMotorActionAccess().getMotorActionKeyword_1());
            		
            // InternalMyDsl.g:1657:3: ( (lv_actionname_2_0= ruleEString ) )
            // InternalMyDsl.g:1658:4: (lv_actionname_2_0= ruleEString )
            {
            // InternalMyDsl.g:1658:4: (lv_actionname_2_0= ruleEString )
            // InternalMyDsl.g:1659:5: lv_actionname_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMotorActionAccess().getActionnameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_30);
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

            // InternalMyDsl.g:1676:3: (otherlv_3= 'motorLeft' ( (lv_motorLeft_4_0= ruleEInt ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==46) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1677:4: otherlv_3= 'motorLeft' ( (lv_motorLeft_4_0= ruleEInt ) )
                    {
                    otherlv_3=(Token)match(input,46,FOLLOW_27); 

                    				newLeafNode(otherlv_3, grammarAccess.getMotorActionAccess().getMotorLeftKeyword_3_0());
                    			
                    // InternalMyDsl.g:1681:4: ( (lv_motorLeft_4_0= ruleEInt ) )
                    // InternalMyDsl.g:1682:5: (lv_motorLeft_4_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1682:5: (lv_motorLeft_4_0= ruleEInt )
                    // InternalMyDsl.g:1683:6: lv_motorLeft_4_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMotorActionAccess().getMotorLeftEIntParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_motorLeft_4_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMotorActionRule());
                    						}
                    						set(
                    							current,
                    							"motorLeft",
                    							lv_motorLeft_4_0,
                    							"org.xtext.example.mydsl1.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1701:3: (otherlv_5= 'motorRight' ( (lv_motorRight_6_0= ruleEInt ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==47) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1702:4: otherlv_5= 'motorRight' ( (lv_motorRight_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,47,FOLLOW_27); 

                    				newLeafNode(otherlv_5, grammarAccess.getMotorActionAccess().getMotorRightKeyword_4_0());
                    			
                    // InternalMyDsl.g:1706:4: ( (lv_motorRight_6_0= ruleEInt ) )
                    // InternalMyDsl.g:1707:5: (lv_motorRight_6_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1707:5: (lv_motorRight_6_0= ruleEInt )
                    // InternalMyDsl.g:1708:6: lv_motorRight_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getMotorActionAccess().getMotorRightEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_motorRight_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMotorActionRule());
                    						}
                    						set(
                    							current,
                    							"motorRight",
                    							lv_motorRight_6_0,
                    							"org.xtext.example.mydsl1.MyDsl.EInt");
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
    // InternalMyDsl.g:1730:1: entryRuleSoundAction returns [EObject current=null] : iv_ruleSoundAction= ruleSoundAction EOF ;
    public final EObject entryRuleSoundAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoundAction = null;


        try {
            // InternalMyDsl.g:1730:52: (iv_ruleSoundAction= ruleSoundAction EOF )
            // InternalMyDsl.g:1731:2: iv_ruleSoundAction= ruleSoundAction EOF
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
    // InternalMyDsl.g:1737:1: ruleSoundAction returns [EObject current=null] : ( () otherlv_1= 'SoundAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'set:' ( (lv_musicsettings_4_0= ruleMusicSetting ) ) (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )* )? ) ;
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
            // InternalMyDsl.g:1743:2: ( ( () otherlv_1= 'SoundAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'set:' ( (lv_musicsettings_4_0= ruleMusicSetting ) ) (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )* )? ) )
            // InternalMyDsl.g:1744:2: ( () otherlv_1= 'SoundAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'set:' ( (lv_musicsettings_4_0= ruleMusicSetting ) ) (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )* )? )
            {
            // InternalMyDsl.g:1744:2: ( () otherlv_1= 'SoundAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'set:' ( (lv_musicsettings_4_0= ruleMusicSetting ) ) (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )* )? )
            // InternalMyDsl.g:1745:3: () otherlv_1= 'SoundAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'set:' ( (lv_musicsettings_4_0= ruleMusicSetting ) ) (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )* )?
            {
            // InternalMyDsl.g:1745:3: ()
            // InternalMyDsl.g:1746:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSoundActionAccess().getSoundActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getSoundActionAccess().getSoundActionKeyword_1());
            		
            // InternalMyDsl.g:1756:3: ( (lv_actionname_2_0= ruleEString ) )
            // InternalMyDsl.g:1757:4: (lv_actionname_2_0= ruleEString )
            {
            // InternalMyDsl.g:1757:4: (lv_actionname_2_0= ruleEString )
            // InternalMyDsl.g:1758:5: lv_actionname_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSoundActionAccess().getActionnameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_32);
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

            // InternalMyDsl.g:1775:3: (otherlv_3= 'set:' ( (lv_musicsettings_4_0= ruleMusicSetting ) ) (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )* )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==49) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1776:4: otherlv_3= 'set:' ( (lv_musicsettings_4_0= ruleMusicSetting ) ) (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )*
                    {
                    otherlv_3=(Token)match(input,49,FOLLOW_33); 

                    				newLeafNode(otherlv_3, grammarAccess.getSoundActionAccess().getSetKeyword_3_0());
                    			
                    // InternalMyDsl.g:1780:4: ( (lv_musicsettings_4_0= ruleMusicSetting ) )
                    // InternalMyDsl.g:1781:5: (lv_musicsettings_4_0= ruleMusicSetting )
                    {
                    // InternalMyDsl.g:1781:5: (lv_musicsettings_4_0= ruleMusicSetting )
                    // InternalMyDsl.g:1782:6: lv_musicsettings_4_0= ruleMusicSetting
                    {

                    						newCompositeNode(grammarAccess.getSoundActionAccess().getMusicsettingsMusicSettingParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

                    // InternalMyDsl.g:1799:4: (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==37) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalMyDsl.g:1800:5: otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) )
                    	    {
                    	    otherlv_5=(Token)match(input,37,FOLLOW_33); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getSoundActionAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:1804:5: ( (lv_musicsettings_6_0= ruleMusicSetting ) )
                    	    // InternalMyDsl.g:1805:6: (lv_musicsettings_6_0= ruleMusicSetting )
                    	    {
                    	    // InternalMyDsl.g:1805:6: (lv_musicsettings_6_0= ruleMusicSetting )
                    	    // InternalMyDsl.g:1806:7: lv_musicsettings_6_0= ruleMusicSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getSoundActionAccess().getMusicsettingsMusicSettingParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_23);
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
                    	    break loop26;
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
    // InternalMyDsl.g:1829:1: entryRuleLightAction returns [EObject current=null] : iv_ruleLightAction= ruleLightAction EOF ;
    public final EObject entryRuleLightAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightAction = null;


        try {
            // InternalMyDsl.g:1829:52: (iv_ruleLightAction= ruleLightAction EOF )
            // InternalMyDsl.g:1830:2: iv_ruleLightAction= ruleLightAction EOF
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
    // InternalMyDsl.g:1836:1: ruleLightAction returns [EObject current=null] : ( () otherlv_1= 'LightAction' ( (lv_actionname_2_0= ruleEString ) ) otherlv_3= 'pos:' ( (lv_pos_4_0= ruleLightPos ) ) (otherlv_5= 'red:' ( (lv_red_6_0= ruleEInt ) ) )? (otherlv_7= 'green:' ( (lv_green_8_0= ruleEInt ) ) )? (otherlv_9= 'blue:' ( (lv_blue_10_0= ruleEInt ) ) )? ) ;
    public final EObject ruleLightAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_actionname_2_0 = null;

        Enumerator lv_pos_4_0 = null;

        AntlrDatatypeRuleToken lv_red_6_0 = null;

        AntlrDatatypeRuleToken lv_green_8_0 = null;

        AntlrDatatypeRuleToken lv_blue_10_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1842:2: ( ( () otherlv_1= 'LightAction' ( (lv_actionname_2_0= ruleEString ) ) otherlv_3= 'pos:' ( (lv_pos_4_0= ruleLightPos ) ) (otherlv_5= 'red:' ( (lv_red_6_0= ruleEInt ) ) )? (otherlv_7= 'green:' ( (lv_green_8_0= ruleEInt ) ) )? (otherlv_9= 'blue:' ( (lv_blue_10_0= ruleEInt ) ) )? ) )
            // InternalMyDsl.g:1843:2: ( () otherlv_1= 'LightAction' ( (lv_actionname_2_0= ruleEString ) ) otherlv_3= 'pos:' ( (lv_pos_4_0= ruleLightPos ) ) (otherlv_5= 'red:' ( (lv_red_6_0= ruleEInt ) ) )? (otherlv_7= 'green:' ( (lv_green_8_0= ruleEInt ) ) )? (otherlv_9= 'blue:' ( (lv_blue_10_0= ruleEInt ) ) )? )
            {
            // InternalMyDsl.g:1843:2: ( () otherlv_1= 'LightAction' ( (lv_actionname_2_0= ruleEString ) ) otherlv_3= 'pos:' ( (lv_pos_4_0= ruleLightPos ) ) (otherlv_5= 'red:' ( (lv_red_6_0= ruleEInt ) ) )? (otherlv_7= 'green:' ( (lv_green_8_0= ruleEInt ) ) )? (otherlv_9= 'blue:' ( (lv_blue_10_0= ruleEInt ) ) )? )
            // InternalMyDsl.g:1844:3: () otherlv_1= 'LightAction' ( (lv_actionname_2_0= ruleEString ) ) otherlv_3= 'pos:' ( (lv_pos_4_0= ruleLightPos ) ) (otherlv_5= 'red:' ( (lv_red_6_0= ruleEInt ) ) )? (otherlv_7= 'green:' ( (lv_green_8_0= ruleEInt ) ) )? (otherlv_9= 'blue:' ( (lv_blue_10_0= ruleEInt ) ) )?
            {
            // InternalMyDsl.g:1844:3: ()
            // InternalMyDsl.g:1845:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLightActionAccess().getLightActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,50,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getLightActionAccess().getLightActionKeyword_1());
            		
            // InternalMyDsl.g:1855:3: ( (lv_actionname_2_0= ruleEString ) )
            // InternalMyDsl.g:1856:4: (lv_actionname_2_0= ruleEString )
            {
            // InternalMyDsl.g:1856:4: (lv_actionname_2_0= ruleEString )
            // InternalMyDsl.g:1857:5: lv_actionname_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLightActionAccess().getActionnameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
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

            otherlv_3=(Token)match(input,51,FOLLOW_35); 

            			newLeafNode(otherlv_3, grammarAccess.getLightActionAccess().getPosKeyword_3());
            		
            // InternalMyDsl.g:1878:3: ( (lv_pos_4_0= ruleLightPos ) )
            // InternalMyDsl.g:1879:4: (lv_pos_4_0= ruleLightPos )
            {
            // InternalMyDsl.g:1879:4: (lv_pos_4_0= ruleLightPos )
            // InternalMyDsl.g:1880:5: lv_pos_4_0= ruleLightPos
            {

            					newCompositeNode(grammarAccess.getLightActionAccess().getPosLightPosEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_36);
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

            // InternalMyDsl.g:1897:3: (otherlv_5= 'red:' ( (lv_red_6_0= ruleEInt ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==52) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1898:4: otherlv_5= 'red:' ( (lv_red_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,52,FOLLOW_27); 

                    				newLeafNode(otherlv_5, grammarAccess.getLightActionAccess().getRedKeyword_5_0());
                    			
                    // InternalMyDsl.g:1902:4: ( (lv_red_6_0= ruleEInt ) )
                    // InternalMyDsl.g:1903:5: (lv_red_6_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1903:5: (lv_red_6_0= ruleEInt )
                    // InternalMyDsl.g:1904:6: lv_red_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getLightActionAccess().getRedEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_red_6_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLightActionRule());
                    						}
                    						set(
                    							current,
                    							"red",
                    							lv_red_6_0,
                    							"org.xtext.example.mydsl1.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1922:3: (otherlv_7= 'green:' ( (lv_green_8_0= ruleEInt ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==53) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1923:4: otherlv_7= 'green:' ( (lv_green_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,53,FOLLOW_27); 

                    				newLeafNode(otherlv_7, grammarAccess.getLightActionAccess().getGreenKeyword_6_0());
                    			
                    // InternalMyDsl.g:1927:4: ( (lv_green_8_0= ruleEInt ) )
                    // InternalMyDsl.g:1928:5: (lv_green_8_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1928:5: (lv_green_8_0= ruleEInt )
                    // InternalMyDsl.g:1929:6: lv_green_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getLightActionAccess().getGreenEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    lv_green_8_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLightActionRule());
                    						}
                    						set(
                    							current,
                    							"green",
                    							lv_green_8_0,
                    							"org.xtext.example.mydsl1.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1947:3: (otherlv_9= 'blue:' ( (lv_blue_10_0= ruleEInt ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==54) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1948:4: otherlv_9= 'blue:' ( (lv_blue_10_0= ruleEInt ) )
                    {
                    otherlv_9=(Token)match(input,54,FOLLOW_27); 

                    				newLeafNode(otherlv_9, grammarAccess.getLightActionAccess().getBlueKeyword_7_0());
                    			
                    // InternalMyDsl.g:1952:4: ( (lv_blue_10_0= ruleEInt ) )
                    // InternalMyDsl.g:1953:5: (lv_blue_10_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1953:5: (lv_blue_10_0= ruleEInt )
                    // InternalMyDsl.g:1954:6: lv_blue_10_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getLightActionAccess().getBlueEIntParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_blue_10_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLightActionRule());
                    						}
                    						set(
                    							current,
                    							"blue",
                    							lv_blue_10_0,
                    							"org.xtext.example.mydsl1.MyDsl.EInt");
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
    // InternalMyDsl.g:1976:1: entryRuleMusicSetting returns [EObject current=null] : iv_ruleMusicSetting= ruleMusicSetting EOF ;
    public final EObject entryRuleMusicSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMusicSetting = null;


        try {
            // InternalMyDsl.g:1976:53: (iv_ruleMusicSetting= ruleMusicSetting EOF )
            // InternalMyDsl.g:1977:2: iv_ruleMusicSetting= ruleMusicSetting EOF
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
    // InternalMyDsl.g:1983:1: ruleMusicSetting returns [EObject current=null] : ( () otherlv_1= '(' ( (lv_note_2_0= ruleEInt ) ) otherlv_3= ',' ( (lv_duration_4_0= ruleDuration ) ) otherlv_5= ',' ( (lv_pos_6_0= ruleEInt ) ) otherlv_7= ')' ) ;
    public final EObject ruleMusicSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_note_2_0 = null;

        Enumerator lv_duration_4_0 = null;

        AntlrDatatypeRuleToken lv_pos_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1989:2: ( ( () otherlv_1= '(' ( (lv_note_2_0= ruleEInt ) ) otherlv_3= ',' ( (lv_duration_4_0= ruleDuration ) ) otherlv_5= ',' ( (lv_pos_6_0= ruleEInt ) ) otherlv_7= ')' ) )
            // InternalMyDsl.g:1990:2: ( () otherlv_1= '(' ( (lv_note_2_0= ruleEInt ) ) otherlv_3= ',' ( (lv_duration_4_0= ruleDuration ) ) otherlv_5= ',' ( (lv_pos_6_0= ruleEInt ) ) otherlv_7= ')' )
            {
            // InternalMyDsl.g:1990:2: ( () otherlv_1= '(' ( (lv_note_2_0= ruleEInt ) ) otherlv_3= ',' ( (lv_duration_4_0= ruleDuration ) ) otherlv_5= ',' ( (lv_pos_6_0= ruleEInt ) ) otherlv_7= ')' )
            // InternalMyDsl.g:1991:3: () otherlv_1= '(' ( (lv_note_2_0= ruleEInt ) ) otherlv_3= ',' ( (lv_duration_4_0= ruleDuration ) ) otherlv_5= ',' ( (lv_pos_6_0= ruleEInt ) ) otherlv_7= ')'
            {
            // InternalMyDsl.g:1991:3: ()
            // InternalMyDsl.g:1992:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMusicSettingAccess().getMusicSettingAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_27); 

            			newLeafNode(otherlv_1, grammarAccess.getMusicSettingAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMyDsl.g:2002:3: ( (lv_note_2_0= ruleEInt ) )
            // InternalMyDsl.g:2003:4: (lv_note_2_0= ruleEInt )
            {
            // InternalMyDsl.g:2003:4: (lv_note_2_0= ruleEInt )
            // InternalMyDsl.g:2004:5: lv_note_2_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMusicSettingAccess().getNoteEIntParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_39);
            lv_note_2_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMusicSettingRule());
            					}
            					set(
            						current,
            						"note",
            						lv_note_2_0,
            						"org.xtext.example.mydsl1.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,37,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getMusicSettingAccess().getCommaKeyword_3());
            		
            // InternalMyDsl.g:2025:3: ( (lv_duration_4_0= ruleDuration ) )
            // InternalMyDsl.g:2026:4: (lv_duration_4_0= ruleDuration )
            {
            // InternalMyDsl.g:2026:4: (lv_duration_4_0= ruleDuration )
            // InternalMyDsl.g:2027:5: lv_duration_4_0= ruleDuration
            {

            					newCompositeNode(grammarAccess.getMusicSettingAccess().getDurationDurationEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_39);
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

            otherlv_5=(Token)match(input,37,FOLLOW_27); 

            			newLeafNode(otherlv_5, grammarAccess.getMusicSettingAccess().getCommaKeyword_5());
            		
            // InternalMyDsl.g:2048:3: ( (lv_pos_6_0= ruleEInt ) )
            // InternalMyDsl.g:2049:4: (lv_pos_6_0= ruleEInt )
            {
            // InternalMyDsl.g:2049:4: (lv_pos_6_0= ruleEInt )
            // InternalMyDsl.g:2050:5: lv_pos_6_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMusicSettingAccess().getPosEIntParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_19);
            lv_pos_6_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMusicSettingRule());
            					}
            					set(
            						current,
            						"pos",
            						lv_pos_6_0,
            						"org.xtext.example.mydsl1.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,29,FOLLOW_2); 

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
    // InternalMyDsl.g:2075:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:2075:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:2076:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalMyDsl.g:2082:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2088:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:2089:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:2089:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:2090:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:2090:3: (kw= '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==12) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:2091:4: kw= '-'
                    {
                    kw=(Token)match(input,12,FOLLOW_41); 

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
    // InternalMyDsl.g:2108:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:2108:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:2109:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:2115:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2121:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:2122:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:2122:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_ID) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:2123:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2131:3: this_ID_1= RULE_ID
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
    // InternalMyDsl.g:2142:1: ruleDuration returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LONG' ) ) ;
    public final Enumerator ruleDuration() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2148:2: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LONG' ) ) )
            // InternalMyDsl.g:2149:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LONG' ) )
            {
            // InternalMyDsl.g:2149:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LONG' ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt33=1;
                }
                break;
            case 56:
                {
                alt33=2;
                }
                break;
            case 57:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:2150:3: (enumLiteral_0= 'NONE' )
                    {
                    // InternalMyDsl.g:2150:3: (enumLiteral_0= 'NONE' )
                    // InternalMyDsl.g:2151:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getDurationAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDurationAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2158:3: (enumLiteral_1= 'MEDIUM' )
                    {
                    // InternalMyDsl.g:2158:3: (enumLiteral_1= 'MEDIUM' )
                    // InternalMyDsl.g:2159:4: enumLiteral_1= 'MEDIUM'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getDurationAccess().getMEDIUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDurationAccess().getMEDIUMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2166:3: (enumLiteral_2= 'LONG' )
                    {
                    // InternalMyDsl.g:2166:3: (enumLiteral_2= 'LONG' )
                    // InternalMyDsl.g:2167:4: enumLiteral_2= 'LONG'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

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
    // InternalMyDsl.g:2177:1: ruleLightPos returns [Enumerator current=null] : ( (enumLiteral_0= 'TOP' ) | (enumLiteral_1= 'BOT' ) ) ;
    public final Enumerator ruleLightPos() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2183:2: ( ( (enumLiteral_0= 'TOP' ) | (enumLiteral_1= 'BOT' ) ) )
            // InternalMyDsl.g:2184:2: ( (enumLiteral_0= 'TOP' ) | (enumLiteral_1= 'BOT' ) )
            {
            // InternalMyDsl.g:2184:2: ( (enumLiteral_0= 'TOP' ) | (enumLiteral_1= 'BOT' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==58) ) {
                alt34=1;
            }
            else if ( (LA34_0==59) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:2185:3: (enumLiteral_0= 'TOP' )
                    {
                    // InternalMyDsl.g:2185:3: (enumLiteral_0= 'TOP' )
                    // InternalMyDsl.g:2186:4: enumLiteral_0= 'TOP'
                    {
                    enumLiteral_0=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getLightPosAccess().getTOPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLightPosAccess().getTOPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2193:3: (enumLiteral_1= 'BOT' )
                    {
                    // InternalMyDsl.g:2193:3: (enumLiteral_1= 'BOT' )
                    // InternalMyDsl.g:2194:4: enumLiteral_1= 'BOT'
                    {
                    enumLiteral_1=(Token)match(input,59,FOLLOW_2); 

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
    // InternalMyDsl.g:2204:1: ruleDistance returns [Enumerator current=null] : ( (enumLiteral_0= 'FAR' ) | (enumLiteral_1= 'CLOSE' ) ) ;
    public final Enumerator ruleDistance() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2210:2: ( ( (enumLiteral_0= 'FAR' ) | (enumLiteral_1= 'CLOSE' ) ) )
            // InternalMyDsl.g:2211:2: ( (enumLiteral_0= 'FAR' ) | (enumLiteral_1= 'CLOSE' ) )
            {
            // InternalMyDsl.g:2211:2: ( (enumLiteral_0= 'FAR' ) | (enumLiteral_1= 'CLOSE' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==60) ) {
                alt35=1;
            }
            else if ( (LA35_0==61) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:2212:3: (enumLiteral_0= 'FAR' )
                    {
                    // InternalMyDsl.g:2212:3: (enumLiteral_0= 'FAR' )
                    // InternalMyDsl.g:2213:4: enumLiteral_0= 'FAR'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getDistanceAccess().getFAREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDistanceAccess().getFAREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2220:3: (enumLiteral_1= 'CLOSE' )
                    {
                    // InternalMyDsl.g:2220:3: (enumLiteral_1= 'CLOSE' )
                    // InternalMyDsl.g:2221:4: enumLiteral_1= 'CLOSE'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

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
    // InternalMyDsl.g:2231:1: ruleButtonType returns [Enumerator current=null] : ( (enumLiteral_0= 'BACKWARD' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) | (enumLiteral_3= 'CENTER' ) | (enumLiteral_4= 'FORWARD' ) ) ;
    public final Enumerator ruleButtonType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:2237:2: ( ( (enumLiteral_0= 'BACKWARD' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) | (enumLiteral_3= 'CENTER' ) | (enumLiteral_4= 'FORWARD' ) ) )
            // InternalMyDsl.g:2238:2: ( (enumLiteral_0= 'BACKWARD' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) | (enumLiteral_3= 'CENTER' ) | (enumLiteral_4= 'FORWARD' ) )
            {
            // InternalMyDsl.g:2238:2: ( (enumLiteral_0= 'BACKWARD' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) | (enumLiteral_3= 'CENTER' ) | (enumLiteral_4= 'FORWARD' ) )
            int alt36=5;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt36=1;
                }
                break;
            case 63:
                {
                alt36=2;
                }
                break;
            case 64:
                {
                alt36=3;
                }
                break;
            case 65:
                {
                alt36=4;
                }
                break;
            case 66:
                {
                alt36=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:2239:3: (enumLiteral_0= 'BACKWARD' )
                    {
                    // InternalMyDsl.g:2239:3: (enumLiteral_0= 'BACKWARD' )
                    // InternalMyDsl.g:2240:4: enumLiteral_0= 'BACKWARD'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getButtonTypeAccess().getBACKWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getButtonTypeAccess().getBACKWARDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:2247:3: (enumLiteral_1= 'LEFT' )
                    {
                    // InternalMyDsl.g:2247:3: (enumLiteral_1= 'LEFT' )
                    // InternalMyDsl.g:2248:4: enumLiteral_1= 'LEFT'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getButtonTypeAccess().getLEFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getButtonTypeAccess().getLEFTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:2255:3: (enumLiteral_2= 'RIGHT' )
                    {
                    // InternalMyDsl.g:2255:3: (enumLiteral_2= 'RIGHT' )
                    // InternalMyDsl.g:2256:4: enumLiteral_2= 'RIGHT'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getButtonTypeAccess().getRIGHTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getButtonTypeAccess().getRIGHTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:2263:3: (enumLiteral_3= 'CENTER' )
                    {
                    // InternalMyDsl.g:2263:3: (enumLiteral_3= 'CENTER' )
                    // InternalMyDsl.g:2264:4: enumLiteral_3= 'CENTER'
                    {
                    enumLiteral_3=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getButtonTypeAccess().getCENTEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getButtonTypeAccess().getCENTEREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:2271:3: (enumLiteral_4= 'FORWARD' )
                    {
                    // InternalMyDsl.g:2271:3: (enumLiteral_4= 'FORWARD' )
                    // InternalMyDsl.g:2272:4: enumLiteral_4= 'FORWARD'
                    {
                    enumLiteral_4=(Token)match(input,66,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000003D0402812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0005200000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000003D0403812L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000012C000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000001D0000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000003C0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000003D0C02810L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000003D1402810L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000003D0402810L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002001002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000003F0402810L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001400000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x3000000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0070000000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0380000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000010L});

}