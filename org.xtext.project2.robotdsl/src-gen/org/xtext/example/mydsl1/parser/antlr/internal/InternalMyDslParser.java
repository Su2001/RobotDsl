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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Action:'", "'-'", "'Condition:'", "'Event'", "'condition:'", "'actions:'", "','", "'Sound'", "'Button'", "'button'", "'Sensor'", "'sensorPos'", "'Tap'", "'MotorAction'", "'motorLeft'", "'motorRight'", "'SoundAction'", "'set:'", "'LightAction'", "'pos:'", "'red:'", "'green:'", "'blue:'", "'('", "')'", "'NONE'", "'MEDIUM'", "'LONG'", "'TOP'", "'BOT'", "'BACKWARD'", "'LEFT'", "'RIGHT'", "'CENTER'", "'FORWARD'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
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
    public static final int T__44=44;
    public static final int T__45=45;
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
    // InternalMyDsl.g:72:1: ruleRobotModel returns [EObject current=null] : ( () ( ( (lv_events_1_0= ruleEvent ) ) | (otherlv_2= 'Action:' otherlv_3= '-' ( (lv_actions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_actions_6_0= ruleAction ) ) )* ) | (otherlv_7= 'Condition:' otherlv_8= '-' ( (lv_conditions_9_0= ruleCondition ) ) (otherlv_10= '-' ( (lv_conditions_11_0= ruleCondition ) ) )* ) )* ) ;
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



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( () ( ( (lv_events_1_0= ruleEvent ) ) | (otherlv_2= 'Action:' otherlv_3= '-' ( (lv_actions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_actions_6_0= ruleAction ) ) )* ) | (otherlv_7= 'Condition:' otherlv_8= '-' ( (lv_conditions_9_0= ruleCondition ) ) (otherlv_10= '-' ( (lv_conditions_11_0= ruleCondition ) ) )* ) )* ) )
            // InternalMyDsl.g:79:2: ( () ( ( (lv_events_1_0= ruleEvent ) ) | (otherlv_2= 'Action:' otherlv_3= '-' ( (lv_actions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_actions_6_0= ruleAction ) ) )* ) | (otherlv_7= 'Condition:' otherlv_8= '-' ( (lv_conditions_9_0= ruleCondition ) ) (otherlv_10= '-' ( (lv_conditions_11_0= ruleCondition ) ) )* ) )* )
            {
            // InternalMyDsl.g:79:2: ( () ( ( (lv_events_1_0= ruleEvent ) ) | (otherlv_2= 'Action:' otherlv_3= '-' ( (lv_actions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_actions_6_0= ruleAction ) ) )* ) | (otherlv_7= 'Condition:' otherlv_8= '-' ( (lv_conditions_9_0= ruleCondition ) ) (otherlv_10= '-' ( (lv_conditions_11_0= ruleCondition ) ) )* ) )* )
            // InternalMyDsl.g:80:3: () ( ( (lv_events_1_0= ruleEvent ) ) | (otherlv_2= 'Action:' otherlv_3= '-' ( (lv_actions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_actions_6_0= ruleAction ) ) )* ) | (otherlv_7= 'Condition:' otherlv_8= '-' ( (lv_conditions_9_0= ruleCondition ) ) (otherlv_10= '-' ( (lv_conditions_11_0= ruleCondition ) ) )* ) )*
            {
            // InternalMyDsl.g:80:3: ()
            // InternalMyDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotModelAccess().getRobotModelAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:87:3: ( ( (lv_events_1_0= ruleEvent ) ) | (otherlv_2= 'Action:' otherlv_3= '-' ( (lv_actions_4_0= ruleAction ) ) (otherlv_5= '-' ( (lv_actions_6_0= ruleAction ) ) )* ) | (otherlv_7= 'Condition:' otherlv_8= '-' ( (lv_conditions_9_0= ruleCondition ) ) (otherlv_10= '-' ( (lv_conditions_11_0= ruleCondition ) ) )* ) )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case 14:
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


    // $ANTLR start "entryRuleEvent"
    // InternalMyDsl.g:222:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalMyDsl.g:222:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalMyDsl.g:223:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalMyDsl.g:229:1: ruleEvent returns [EObject current=null] : ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'condition:' ( ( ruleEString ) ) )? (otherlv_5= 'actions:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:235:2: ( ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'condition:' ( ( ruleEString ) ) )? (otherlv_5= 'actions:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? ) )
            // InternalMyDsl.g:236:2: ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'condition:' ( ( ruleEString ) ) )? (otherlv_5= 'actions:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? )
            {
            // InternalMyDsl.g:236:2: ( () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'condition:' ( ( ruleEString ) ) )? (otherlv_5= 'actions:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? )
            // InternalMyDsl.g:237:3: () otherlv_1= 'Event' ( (lv_name_2_0= ruleEString ) ) (otherlv_3= 'condition:' ( ( ruleEString ) ) )? (otherlv_5= 'actions:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
            {
            // InternalMyDsl.g:237:3: ()
            // InternalMyDsl.g:238:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEventAccess().getEventAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getEventAccess().getEventKeyword_1());
            		
            // InternalMyDsl.g:248:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:249:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:249:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:250:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEventAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
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

            // InternalMyDsl.g:267:3: (otherlv_3= 'condition:' ( ( ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:268:4: otherlv_3= 'condition:' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getEventAccess().getConditionKeyword_3_0());
                    			
                    // InternalMyDsl.g:272:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:273:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:273:5: ( ruleEString )
                    // InternalMyDsl.g:274:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEventAccess().getConditionConditionCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:289:3: (otherlv_5= 'actions:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:290:4: otherlv_5= 'actions:' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getEventAccess().getActionsKeyword_4_0());
                    			
                    // InternalMyDsl.g:294:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:295:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:295:5: ( ruleEString )
                    // InternalMyDsl.g:296:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getEventAccess().getActionsActionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:310:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==17) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:311:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FOLLOW_8); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEventAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalMyDsl.g:315:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:316:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:316:6: ( ruleEString )
                    	    // InternalMyDsl.g:317:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getEventRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getEventAccess().getActionsActionCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    ruleEString();

                    	    state._fsp--;


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
    // InternalMyDsl.g:337:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:337:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:338:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalMyDsl.g:344:1: ruleCondition returns [EObject current=null] : (this_Button_0= ruleButton | this_Sensor_1= ruleSensor | this_Sound_2= ruleSound | this_Tap_3= ruleTap ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_Button_0 = null;

        EObject this_Sensor_1 = null;

        EObject this_Sound_2 = null;

        EObject this_Tap_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:350:2: ( (this_Button_0= ruleButton | this_Sensor_1= ruleSensor | this_Sound_2= ruleSound | this_Tap_3= ruleTap ) )
            // InternalMyDsl.g:351:2: (this_Button_0= ruleButton | this_Sensor_1= ruleSensor | this_Sound_2= ruleSound | this_Tap_3= ruleTap )
            {
            // InternalMyDsl.g:351:2: (this_Button_0= ruleButton | this_Sensor_1= ruleSensor | this_Sound_2= ruleSound | this_Tap_3= ruleTap )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 23:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:352:3: this_Button_0= ruleButton
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
                    // InternalMyDsl.g:361:3: this_Sensor_1= ruleSensor
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
                    // InternalMyDsl.g:370:3: this_Sound_2= ruleSound
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
                    // InternalMyDsl.g:379:3: this_Tap_3= ruleTap
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
    // InternalMyDsl.g:391:1: entryRuleSound returns [EObject current=null] : iv_ruleSound= ruleSound EOF ;
    public final EObject entryRuleSound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSound = null;


        try {
            // InternalMyDsl.g:391:46: (iv_ruleSound= ruleSound EOF )
            // InternalMyDsl.g:392:2: iv_ruleSound= ruleSound EOF
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
    // InternalMyDsl.g:398:1: ruleSound returns [EObject current=null] : ( () otherlv_1= 'Sound' ( (lv_conditionname_2_0= ruleEString ) ) ) ;
    public final EObject ruleSound() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_conditionname_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:404:2: ( ( () otherlv_1= 'Sound' ( (lv_conditionname_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:405:2: ( () otherlv_1= 'Sound' ( (lv_conditionname_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:405:2: ( () otherlv_1= 'Sound' ( (lv_conditionname_2_0= ruleEString ) ) )
            // InternalMyDsl.g:406:3: () otherlv_1= 'Sound' ( (lv_conditionname_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:406:3: ()
            // InternalMyDsl.g:407:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSoundAccess().getSoundAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSoundAccess().getSoundKeyword_1());
            		
            // InternalMyDsl.g:417:3: ( (lv_conditionname_2_0= ruleEString ) )
            // InternalMyDsl.g:418:4: (lv_conditionname_2_0= ruleEString )
            {
            // InternalMyDsl.g:418:4: (lv_conditionname_2_0= ruleEString )
            // InternalMyDsl.g:419:5: lv_conditionname_2_0= ruleEString
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
    // InternalMyDsl.g:440:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // InternalMyDsl.g:440:47: (iv_ruleButton= ruleButton EOF )
            // InternalMyDsl.g:441:2: iv_ruleButton= ruleButton EOF
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
    // InternalMyDsl.g:447:1: ruleButton returns [EObject current=null] : ( () otherlv_1= 'Button' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'button' ( (lv_button_4_0= ruleButtonType ) ) ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_conditionname_2_0 = null;

        Enumerator lv_button_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:453:2: ( ( () otherlv_1= 'Button' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'button' ( (lv_button_4_0= ruleButtonType ) ) ) )
            // InternalMyDsl.g:454:2: ( () otherlv_1= 'Button' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'button' ( (lv_button_4_0= ruleButtonType ) ) )
            {
            // InternalMyDsl.g:454:2: ( () otherlv_1= 'Button' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'button' ( (lv_button_4_0= ruleButtonType ) ) )
            // InternalMyDsl.g:455:3: () otherlv_1= 'Button' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'button' ( (lv_button_4_0= ruleButtonType ) )
            {
            // InternalMyDsl.g:455:3: ()
            // InternalMyDsl.g:456:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getButtonAccess().getButtonAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getButtonAccess().getButtonKeyword_1());
            		
            // InternalMyDsl.g:466:3: ( (lv_conditionname_2_0= ruleEString ) )
            // InternalMyDsl.g:467:4: (lv_conditionname_2_0= ruleEString )
            {
            // InternalMyDsl.g:467:4: (lv_conditionname_2_0= ruleEString )
            // InternalMyDsl.g:468:5: lv_conditionname_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getButtonAccess().getConditionnameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_3=(Token)match(input,20,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getButtonAccess().getButtonKeyword_3());
            		
            // InternalMyDsl.g:489:3: ( (lv_button_4_0= ruleButtonType ) )
            // InternalMyDsl.g:490:4: (lv_button_4_0= ruleButtonType )
            {
            // InternalMyDsl.g:490:4: (lv_button_4_0= ruleButtonType )
            // InternalMyDsl.g:491:5: lv_button_4_0= ruleButtonType
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
    // InternalMyDsl.g:512:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalMyDsl.g:512:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalMyDsl.g:513:2: iv_ruleSensor= ruleSensor EOF
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
    // InternalMyDsl.g:519:1: ruleSensor returns [EObject current=null] : ( () otherlv_1= 'Sensor' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'sensorPos' ( (lv_sensorPos_4_0= ruleEInt ) ) ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_conditionname_2_0 = null;

        AntlrDatatypeRuleToken lv_sensorPos_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:525:2: ( ( () otherlv_1= 'Sensor' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'sensorPos' ( (lv_sensorPos_4_0= ruleEInt ) ) ) )
            // InternalMyDsl.g:526:2: ( () otherlv_1= 'Sensor' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'sensorPos' ( (lv_sensorPos_4_0= ruleEInt ) ) )
            {
            // InternalMyDsl.g:526:2: ( () otherlv_1= 'Sensor' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'sensorPos' ( (lv_sensorPos_4_0= ruleEInt ) ) )
            // InternalMyDsl.g:527:3: () otherlv_1= 'Sensor' ( (lv_conditionname_2_0= ruleEString ) ) otherlv_3= 'sensorPos' ( (lv_sensorPos_4_0= ruleEInt ) )
            {
            // InternalMyDsl.g:527:3: ()
            // InternalMyDsl.g:528:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorAccess().getSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorAccess().getSensorKeyword_1());
            		
            // InternalMyDsl.g:538:3: ( (lv_conditionname_2_0= ruleEString ) )
            // InternalMyDsl.g:539:4: (lv_conditionname_2_0= ruleEString )
            {
            // InternalMyDsl.g:539:4: (lv_conditionname_2_0= ruleEString )
            // InternalMyDsl.g:540:5: lv_conditionname_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getConditionnameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_14);
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

            otherlv_3=(Token)match(input,22,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getSensorPosKeyword_3());
            		
            // InternalMyDsl.g:561:3: ( (lv_sensorPos_4_0= ruleEInt ) )
            // InternalMyDsl.g:562:4: (lv_sensorPos_4_0= ruleEInt )
            {
            // InternalMyDsl.g:562:4: (lv_sensorPos_4_0= ruleEInt )
            // InternalMyDsl.g:563:5: lv_sensorPos_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getSensorPosEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
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
    // InternalMyDsl.g:584:1: entryRuleTap returns [EObject current=null] : iv_ruleTap= ruleTap EOF ;
    public final EObject entryRuleTap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTap = null;


        try {
            // InternalMyDsl.g:584:44: (iv_ruleTap= ruleTap EOF )
            // InternalMyDsl.g:585:2: iv_ruleTap= ruleTap EOF
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
    // InternalMyDsl.g:591:1: ruleTap returns [EObject current=null] : ( () otherlv_1= 'Tap' ( (lv_conditionname_2_0= ruleEString ) ) ) ;
    public final EObject ruleTap() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_conditionname_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:597:2: ( ( () otherlv_1= 'Tap' ( (lv_conditionname_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:598:2: ( () otherlv_1= 'Tap' ( (lv_conditionname_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:598:2: ( () otherlv_1= 'Tap' ( (lv_conditionname_2_0= ruleEString ) ) )
            // InternalMyDsl.g:599:3: () otherlv_1= 'Tap' ( (lv_conditionname_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:599:3: ()
            // InternalMyDsl.g:600:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTapAccess().getTapAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getTapAccess().getTapKeyword_1());
            		
            // InternalMyDsl.g:610:3: ( (lv_conditionname_2_0= ruleEString ) )
            // InternalMyDsl.g:611:4: (lv_conditionname_2_0= ruleEString )
            {
            // InternalMyDsl.g:611:4: (lv_conditionname_2_0= ruleEString )
            // InternalMyDsl.g:612:5: lv_conditionname_2_0= ruleEString
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
    // InternalMyDsl.g:633:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMyDsl.g:633:47: (iv_ruleAction= ruleAction EOF )
            // InternalMyDsl.g:634:2: iv_ruleAction= ruleAction EOF
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
    // InternalMyDsl.g:640:1: ruleAction returns [EObject current=null] : (this_MotorAction_0= ruleMotorAction | this_SoundAction_1= ruleSoundAction | this_LightAction_2= ruleLightAction ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_MotorAction_0 = null;

        EObject this_SoundAction_1 = null;

        EObject this_LightAction_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:646:2: ( (this_MotorAction_0= ruleMotorAction | this_SoundAction_1= ruleSoundAction | this_LightAction_2= ruleLightAction ) )
            // InternalMyDsl.g:647:2: (this_MotorAction_0= ruleMotorAction | this_SoundAction_1= ruleSoundAction | this_LightAction_2= ruleLightAction )
            {
            // InternalMyDsl.g:647:2: (this_MotorAction_0= ruleMotorAction | this_SoundAction_1= ruleSoundAction | this_LightAction_2= ruleLightAction )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt8=1;
                }
                break;
            case 27:
                {
                alt8=2;
                }
                break;
            case 29:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:648:3: this_MotorAction_0= ruleMotorAction
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
                    // InternalMyDsl.g:657:3: this_SoundAction_1= ruleSoundAction
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
                    // InternalMyDsl.g:666:3: this_LightAction_2= ruleLightAction
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
    // InternalMyDsl.g:678:1: entryRuleMotorAction returns [EObject current=null] : iv_ruleMotorAction= ruleMotorAction EOF ;
    public final EObject entryRuleMotorAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotorAction = null;


        try {
            // InternalMyDsl.g:678:52: (iv_ruleMotorAction= ruleMotorAction EOF )
            // InternalMyDsl.g:679:2: iv_ruleMotorAction= ruleMotorAction EOF
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
    // InternalMyDsl.g:685:1: ruleMotorAction returns [EObject current=null] : ( () otherlv_1= 'MotorAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'motorLeft' ( (lv_motorLeft_4_0= ruleEInt ) ) ) (otherlv_5= 'motorRight' ( (lv_motorRight_6_0= ruleEInt ) ) ) ) ;
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
            // InternalMyDsl.g:691:2: ( ( () otherlv_1= 'MotorAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'motorLeft' ( (lv_motorLeft_4_0= ruleEInt ) ) ) (otherlv_5= 'motorRight' ( (lv_motorRight_6_0= ruleEInt ) ) ) ) )
            // InternalMyDsl.g:692:2: ( () otherlv_1= 'MotorAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'motorLeft' ( (lv_motorLeft_4_0= ruleEInt ) ) ) (otherlv_5= 'motorRight' ( (lv_motorRight_6_0= ruleEInt ) ) ) )
            {
            // InternalMyDsl.g:692:2: ( () otherlv_1= 'MotorAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'motorLeft' ( (lv_motorLeft_4_0= ruleEInt ) ) ) (otherlv_5= 'motorRight' ( (lv_motorRight_6_0= ruleEInt ) ) ) )
            // InternalMyDsl.g:693:3: () otherlv_1= 'MotorAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'motorLeft' ( (lv_motorLeft_4_0= ruleEInt ) ) ) (otherlv_5= 'motorRight' ( (lv_motorRight_6_0= ruleEInt ) ) )
            {
            // InternalMyDsl.g:693:3: ()
            // InternalMyDsl.g:694:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMotorActionAccess().getMotorActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getMotorActionAccess().getMotorActionKeyword_1());
            		
            // InternalMyDsl.g:704:3: ( (lv_actionname_2_0= ruleEString ) )
            // InternalMyDsl.g:705:4: (lv_actionname_2_0= ruleEString )
            {
            // InternalMyDsl.g:705:4: (lv_actionname_2_0= ruleEString )
            // InternalMyDsl.g:706:5: lv_actionname_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMotorActionAccess().getActionnameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalMyDsl.g:723:3: (otherlv_3= 'motorLeft' ( (lv_motorLeft_4_0= ruleEInt ) ) )
            // InternalMyDsl.g:724:4: otherlv_3= 'motorLeft' ( (lv_motorLeft_4_0= ruleEInt ) )
            {
            otherlv_3=(Token)match(input,25,FOLLOW_15); 

            				newLeafNode(otherlv_3, grammarAccess.getMotorActionAccess().getMotorLeftKeyword_3_0());
            			
            // InternalMyDsl.g:728:4: ( (lv_motorLeft_4_0= ruleEInt ) )
            // InternalMyDsl.g:729:5: (lv_motorLeft_4_0= ruleEInt )
            {
            // InternalMyDsl.g:729:5: (lv_motorLeft_4_0= ruleEInt )
            // InternalMyDsl.g:730:6: lv_motorLeft_4_0= ruleEInt
            {

            						newCompositeNode(grammarAccess.getMotorActionAccess().getMotorLeftEIntParserRuleCall_3_1_0());
            					
            pushFollow(FOLLOW_17);
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

            // InternalMyDsl.g:748:3: (otherlv_5= 'motorRight' ( (lv_motorRight_6_0= ruleEInt ) ) )
            // InternalMyDsl.g:749:4: otherlv_5= 'motorRight' ( (lv_motorRight_6_0= ruleEInt ) )
            {
            otherlv_5=(Token)match(input,26,FOLLOW_15); 

            				newLeafNode(otherlv_5, grammarAccess.getMotorActionAccess().getMotorRightKeyword_4_0());
            			
            // InternalMyDsl.g:753:4: ( (lv_motorRight_6_0= ruleEInt ) )
            // InternalMyDsl.g:754:5: (lv_motorRight_6_0= ruleEInt )
            {
            // InternalMyDsl.g:754:5: (lv_motorRight_6_0= ruleEInt )
            // InternalMyDsl.g:755:6: lv_motorRight_6_0= ruleEInt
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
    // InternalMyDsl.g:777:1: entryRuleSoundAction returns [EObject current=null] : iv_ruleSoundAction= ruleSoundAction EOF ;
    public final EObject entryRuleSoundAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoundAction = null;


        try {
            // InternalMyDsl.g:777:52: (iv_ruleSoundAction= ruleSoundAction EOF )
            // InternalMyDsl.g:778:2: iv_ruleSoundAction= ruleSoundAction EOF
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
    // InternalMyDsl.g:784:1: ruleSoundAction returns [EObject current=null] : ( () otherlv_1= 'SoundAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'set:' ( (lv_musicsettings_4_0= ruleMusicSetting ) ) (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )* )? ) ;
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
            // InternalMyDsl.g:790:2: ( ( () otherlv_1= 'SoundAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'set:' ( (lv_musicsettings_4_0= ruleMusicSetting ) ) (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )* )? ) )
            // InternalMyDsl.g:791:2: ( () otherlv_1= 'SoundAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'set:' ( (lv_musicsettings_4_0= ruleMusicSetting ) ) (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )* )? )
            {
            // InternalMyDsl.g:791:2: ( () otherlv_1= 'SoundAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'set:' ( (lv_musicsettings_4_0= ruleMusicSetting ) ) (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )* )? )
            // InternalMyDsl.g:792:3: () otherlv_1= 'SoundAction' ( (lv_actionname_2_0= ruleEString ) ) (otherlv_3= 'set:' ( (lv_musicsettings_4_0= ruleMusicSetting ) ) (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )* )?
            {
            // InternalMyDsl.g:792:3: ()
            // InternalMyDsl.g:793:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSoundActionAccess().getSoundActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSoundActionAccess().getSoundActionKeyword_1());
            		
            // InternalMyDsl.g:803:3: ( (lv_actionname_2_0= ruleEString ) )
            // InternalMyDsl.g:804:4: (lv_actionname_2_0= ruleEString )
            {
            // InternalMyDsl.g:804:4: (lv_actionname_2_0= ruleEString )
            // InternalMyDsl.g:805:5: lv_actionname_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSoundActionAccess().getActionnameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalMyDsl.g:822:3: (otherlv_3= 'set:' ( (lv_musicsettings_4_0= ruleMusicSetting ) ) (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:823:4: otherlv_3= 'set:' ( (lv_musicsettings_4_0= ruleMusicSetting ) ) (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )*
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getSoundActionAccess().getSetKeyword_3_0());
                    			
                    // InternalMyDsl.g:827:4: ( (lv_musicsettings_4_0= ruleMusicSetting ) )
                    // InternalMyDsl.g:828:5: (lv_musicsettings_4_0= ruleMusicSetting )
                    {
                    // InternalMyDsl.g:828:5: (lv_musicsettings_4_0= ruleMusicSetting )
                    // InternalMyDsl.g:829:6: lv_musicsettings_4_0= ruleMusicSetting
                    {

                    						newCompositeNode(grammarAccess.getSoundActionAccess().getMusicsettingsMusicSettingParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    // InternalMyDsl.g:846:4: (otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==17) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:847:5: otherlv_5= ',' ( (lv_musicsettings_6_0= ruleMusicSetting ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_19); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getSoundActionAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMyDsl.g:851:5: ( (lv_musicsettings_6_0= ruleMusicSetting ) )
                    	    // InternalMyDsl.g:852:6: (lv_musicsettings_6_0= ruleMusicSetting )
                    	    {
                    	    // InternalMyDsl.g:852:6: (lv_musicsettings_6_0= ruleMusicSetting )
                    	    // InternalMyDsl.g:853:7: lv_musicsettings_6_0= ruleMusicSetting
                    	    {

                    	    							newCompositeNode(grammarAccess.getSoundActionAccess().getMusicsettingsMusicSettingParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
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
                    	    break loop9;
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
    // InternalMyDsl.g:876:1: entryRuleLightAction returns [EObject current=null] : iv_ruleLightAction= ruleLightAction EOF ;
    public final EObject entryRuleLightAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightAction = null;


        try {
            // InternalMyDsl.g:876:52: (iv_ruleLightAction= ruleLightAction EOF )
            // InternalMyDsl.g:877:2: iv_ruleLightAction= ruleLightAction EOF
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
    // InternalMyDsl.g:883:1: ruleLightAction returns [EObject current=null] : ( () otherlv_1= 'LightAction' ( (lv_actionname_2_0= ruleEString ) ) otherlv_3= 'pos:' ( (lv_pos_4_0= ruleLightPos ) ) (otherlv_5= 'red:' ( (lv_red_6_0= ruleEInt ) ) )? (otherlv_7= 'green:' ( (lv_green_8_0= ruleEInt ) ) )? (otherlv_9= 'blue:' ( (lv_blue_10_0= ruleEInt ) ) )? ) ;
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
            // InternalMyDsl.g:889:2: ( ( () otherlv_1= 'LightAction' ( (lv_actionname_2_0= ruleEString ) ) otherlv_3= 'pos:' ( (lv_pos_4_0= ruleLightPos ) ) (otherlv_5= 'red:' ( (lv_red_6_0= ruleEInt ) ) )? (otherlv_7= 'green:' ( (lv_green_8_0= ruleEInt ) ) )? (otherlv_9= 'blue:' ( (lv_blue_10_0= ruleEInt ) ) )? ) )
            // InternalMyDsl.g:890:2: ( () otherlv_1= 'LightAction' ( (lv_actionname_2_0= ruleEString ) ) otherlv_3= 'pos:' ( (lv_pos_4_0= ruleLightPos ) ) (otherlv_5= 'red:' ( (lv_red_6_0= ruleEInt ) ) )? (otherlv_7= 'green:' ( (lv_green_8_0= ruleEInt ) ) )? (otherlv_9= 'blue:' ( (lv_blue_10_0= ruleEInt ) ) )? )
            {
            // InternalMyDsl.g:890:2: ( () otherlv_1= 'LightAction' ( (lv_actionname_2_0= ruleEString ) ) otherlv_3= 'pos:' ( (lv_pos_4_0= ruleLightPos ) ) (otherlv_5= 'red:' ( (lv_red_6_0= ruleEInt ) ) )? (otherlv_7= 'green:' ( (lv_green_8_0= ruleEInt ) ) )? (otherlv_9= 'blue:' ( (lv_blue_10_0= ruleEInt ) ) )? )
            // InternalMyDsl.g:891:3: () otherlv_1= 'LightAction' ( (lv_actionname_2_0= ruleEString ) ) otherlv_3= 'pos:' ( (lv_pos_4_0= ruleLightPos ) ) (otherlv_5= 'red:' ( (lv_red_6_0= ruleEInt ) ) )? (otherlv_7= 'green:' ( (lv_green_8_0= ruleEInt ) ) )? (otherlv_9= 'blue:' ( (lv_blue_10_0= ruleEInt ) ) )?
            {
            // InternalMyDsl.g:891:3: ()
            // InternalMyDsl.g:892:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLightActionAccess().getLightActionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getLightActionAccess().getLightActionKeyword_1());
            		
            // InternalMyDsl.g:902:3: ( (lv_actionname_2_0= ruleEString ) )
            // InternalMyDsl.g:903:4: (lv_actionname_2_0= ruleEString )
            {
            // InternalMyDsl.g:903:4: (lv_actionname_2_0= ruleEString )
            // InternalMyDsl.g:904:5: lv_actionname_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLightActionAccess().getActionnameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
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

            otherlv_3=(Token)match(input,30,FOLLOW_21); 

            			newLeafNode(otherlv_3, grammarAccess.getLightActionAccess().getPosKeyword_3());
            		
            // InternalMyDsl.g:925:3: ( (lv_pos_4_0= ruleLightPos ) )
            // InternalMyDsl.g:926:4: (lv_pos_4_0= ruleLightPos )
            {
            // InternalMyDsl.g:926:4: (lv_pos_4_0= ruleLightPos )
            // InternalMyDsl.g:927:5: lv_pos_4_0= ruleLightPos
            {

            					newCompositeNode(grammarAccess.getLightActionAccess().getPosLightPosEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalMyDsl.g:944:3: (otherlv_5= 'red:' ( (lv_red_6_0= ruleEInt ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:945:4: otherlv_5= 'red:' ( (lv_red_6_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getLightActionAccess().getRedKeyword_5_0());
                    			
                    // InternalMyDsl.g:949:4: ( (lv_red_6_0= ruleEInt ) )
                    // InternalMyDsl.g:950:5: (lv_red_6_0= ruleEInt )
                    {
                    // InternalMyDsl.g:950:5: (lv_red_6_0= ruleEInt )
                    // InternalMyDsl.g:951:6: lv_red_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getLightActionAccess().getRedEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_23);
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

            // InternalMyDsl.g:969:3: (otherlv_7= 'green:' ( (lv_green_8_0= ruleEInt ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:970:4: otherlv_7= 'green:' ( (lv_green_8_0= ruleEInt ) )
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getLightActionAccess().getGreenKeyword_6_0());
                    			
                    // InternalMyDsl.g:974:4: ( (lv_green_8_0= ruleEInt ) )
                    // InternalMyDsl.g:975:5: (lv_green_8_0= ruleEInt )
                    {
                    // InternalMyDsl.g:975:5: (lv_green_8_0= ruleEInt )
                    // InternalMyDsl.g:976:6: lv_green_8_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getLightActionAccess().getGreenEIntParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_24);
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

            // InternalMyDsl.g:994:3: (otherlv_9= 'blue:' ( (lv_blue_10_0= ruleEInt ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:995:4: otherlv_9= 'blue:' ( (lv_blue_10_0= ruleEInt ) )
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getLightActionAccess().getBlueKeyword_7_0());
                    			
                    // InternalMyDsl.g:999:4: ( (lv_blue_10_0= ruleEInt ) )
                    // InternalMyDsl.g:1000:5: (lv_blue_10_0= ruleEInt )
                    {
                    // InternalMyDsl.g:1000:5: (lv_blue_10_0= ruleEInt )
                    // InternalMyDsl.g:1001:6: lv_blue_10_0= ruleEInt
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
    // InternalMyDsl.g:1023:1: entryRuleMusicSetting returns [EObject current=null] : iv_ruleMusicSetting= ruleMusicSetting EOF ;
    public final EObject entryRuleMusicSetting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMusicSetting = null;


        try {
            // InternalMyDsl.g:1023:53: (iv_ruleMusicSetting= ruleMusicSetting EOF )
            // InternalMyDsl.g:1024:2: iv_ruleMusicSetting= ruleMusicSetting EOF
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
    // InternalMyDsl.g:1030:1: ruleMusicSetting returns [EObject current=null] : (otherlv_0= '(' ( (lv_note_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_duration_3_0= ruleDuration ) ) otherlv_4= ',' ( (lv_pos_5_0= ruleEInt ) ) otherlv_6= ')' ) ;
    public final EObject ruleMusicSetting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_note_1_0 = null;

        Enumerator lv_duration_3_0 = null;

        AntlrDatatypeRuleToken lv_pos_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1036:2: ( (otherlv_0= '(' ( (lv_note_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_duration_3_0= ruleDuration ) ) otherlv_4= ',' ( (lv_pos_5_0= ruleEInt ) ) otherlv_6= ')' ) )
            // InternalMyDsl.g:1037:2: (otherlv_0= '(' ( (lv_note_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_duration_3_0= ruleDuration ) ) otherlv_4= ',' ( (lv_pos_5_0= ruleEInt ) ) otherlv_6= ')' )
            {
            // InternalMyDsl.g:1037:2: (otherlv_0= '(' ( (lv_note_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_duration_3_0= ruleDuration ) ) otherlv_4= ',' ( (lv_pos_5_0= ruleEInt ) ) otherlv_6= ')' )
            // InternalMyDsl.g:1038:3: otherlv_0= '(' ( (lv_note_1_0= ruleEInt ) ) otherlv_2= ',' ( (lv_duration_3_0= ruleDuration ) ) otherlv_4= ',' ( (lv_pos_5_0= ruleEInt ) ) otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getMusicSettingAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:1042:3: ( (lv_note_1_0= ruleEInt ) )
            // InternalMyDsl.g:1043:4: (lv_note_1_0= ruleEInt )
            {
            // InternalMyDsl.g:1043:4: (lv_note_1_0= ruleEInt )
            // InternalMyDsl.g:1044:5: lv_note_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMusicSettingAccess().getNoteEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_25);
            lv_note_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMusicSettingRule());
            					}
            					set(
            						current,
            						"note",
            						lv_note_1_0,
            						"org.xtext.example.mydsl1.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getMusicSettingAccess().getCommaKeyword_2());
            		
            // InternalMyDsl.g:1065:3: ( (lv_duration_3_0= ruleDuration ) )
            // InternalMyDsl.g:1066:4: (lv_duration_3_0= ruleDuration )
            {
            // InternalMyDsl.g:1066:4: (lv_duration_3_0= ruleDuration )
            // InternalMyDsl.g:1067:5: lv_duration_3_0= ruleDuration
            {

            					newCompositeNode(grammarAccess.getMusicSettingAccess().getDurationDurationEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_25);
            lv_duration_3_0=ruleDuration();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMusicSettingRule());
            					}
            					set(
            						current,
            						"duration",
            						lv_duration_3_0,
            						"org.xtext.example.mydsl1.MyDsl.Duration");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_4, grammarAccess.getMusicSettingAccess().getCommaKeyword_4());
            		
            // InternalMyDsl.g:1088:3: ( (lv_pos_5_0= ruleEInt ) )
            // InternalMyDsl.g:1089:4: (lv_pos_5_0= ruleEInt )
            {
            // InternalMyDsl.g:1089:4: (lv_pos_5_0= ruleEInt )
            // InternalMyDsl.g:1090:5: lv_pos_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getMusicSettingAccess().getPosEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_27);
            lv_pos_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMusicSettingRule());
            					}
            					set(
            						current,
            						"pos",
            						lv_pos_5_0,
            						"org.xtext.example.mydsl1.MyDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMusicSettingAccess().getRightParenthesisKeyword_6());
            		

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
    // InternalMyDsl.g:1115:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:1115:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:1116:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalMyDsl.g:1122:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1128:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:1129:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:1129:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:1130:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:1130:3: (kw= '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1131:4: kw= '-'
                    {
                    kw=(Token)match(input,12,FOLLOW_28); 

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
    // InternalMyDsl.g:1148:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:1148:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:1149:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:1155:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1161:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:1162:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:1162:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1163:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1171:3: this_ID_1= RULE_ID
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
    // InternalMyDsl.g:1182:1: ruleDuration returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LONG' ) ) ;
    public final Enumerator ruleDuration() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1188:2: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LONG' ) ) )
            // InternalMyDsl.g:1189:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LONG' ) )
            {
            // InternalMyDsl.g:1189:2: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LONG' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt16=1;
                }
                break;
            case 37:
                {
                alt16=2;
                }
                break;
            case 38:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1190:3: (enumLiteral_0= 'NONE' )
                    {
                    // InternalMyDsl.g:1190:3: (enumLiteral_0= 'NONE' )
                    // InternalMyDsl.g:1191:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getDurationAccess().getNONEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDurationAccess().getNONEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1198:3: (enumLiteral_1= 'MEDIUM' )
                    {
                    // InternalMyDsl.g:1198:3: (enumLiteral_1= 'MEDIUM' )
                    // InternalMyDsl.g:1199:4: enumLiteral_1= 'MEDIUM'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getDurationAccess().getMEDIUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDurationAccess().getMEDIUMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1206:3: (enumLiteral_2= 'LONG' )
                    {
                    // InternalMyDsl.g:1206:3: (enumLiteral_2= 'LONG' )
                    // InternalMyDsl.g:1207:4: enumLiteral_2= 'LONG'
                    {
                    enumLiteral_2=(Token)match(input,38,FOLLOW_2); 

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
    // InternalMyDsl.g:1217:1: ruleLightPos returns [Enumerator current=null] : ( (enumLiteral_0= 'TOP' ) | (enumLiteral_1= 'BOT' ) ) ;
    public final Enumerator ruleLightPos() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1223:2: ( ( (enumLiteral_0= 'TOP' ) | (enumLiteral_1= 'BOT' ) ) )
            // InternalMyDsl.g:1224:2: ( (enumLiteral_0= 'TOP' ) | (enumLiteral_1= 'BOT' ) )
            {
            // InternalMyDsl.g:1224:2: ( (enumLiteral_0= 'TOP' ) | (enumLiteral_1= 'BOT' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            else if ( (LA17_0==40) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1225:3: (enumLiteral_0= 'TOP' )
                    {
                    // InternalMyDsl.g:1225:3: (enumLiteral_0= 'TOP' )
                    // InternalMyDsl.g:1226:4: enumLiteral_0= 'TOP'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getLightPosAccess().getTOPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLightPosAccess().getTOPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1233:3: (enumLiteral_1= 'BOT' )
                    {
                    // InternalMyDsl.g:1233:3: (enumLiteral_1= 'BOT' )
                    // InternalMyDsl.g:1234:4: enumLiteral_1= 'BOT'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

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


    // $ANTLR start "ruleButtonType"
    // InternalMyDsl.g:1244:1: ruleButtonType returns [Enumerator current=null] : ( (enumLiteral_0= 'BACKWARD' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) | (enumLiteral_3= 'CENTER' ) | (enumLiteral_4= 'FORWARD' ) ) ;
    public final Enumerator ruleButtonType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1250:2: ( ( (enumLiteral_0= 'BACKWARD' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) | (enumLiteral_3= 'CENTER' ) | (enumLiteral_4= 'FORWARD' ) ) )
            // InternalMyDsl.g:1251:2: ( (enumLiteral_0= 'BACKWARD' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) | (enumLiteral_3= 'CENTER' ) | (enumLiteral_4= 'FORWARD' ) )
            {
            // InternalMyDsl.g:1251:2: ( (enumLiteral_0= 'BACKWARD' ) | (enumLiteral_1= 'LEFT' ) | (enumLiteral_2= 'RIGHT' ) | (enumLiteral_3= 'CENTER' ) | (enumLiteral_4= 'FORWARD' ) )
            int alt18=5;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt18=1;
                }
                break;
            case 42:
                {
                alt18=2;
                }
                break;
            case 43:
                {
                alt18=3;
                }
                break;
            case 44:
                {
                alt18=4;
                }
                break;
            case 45:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1252:3: (enumLiteral_0= 'BACKWARD' )
                    {
                    // InternalMyDsl.g:1252:3: (enumLiteral_0= 'BACKWARD' )
                    // InternalMyDsl.g:1253:4: enumLiteral_0= 'BACKWARD'
                    {
                    enumLiteral_0=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getButtonTypeAccess().getBACKWARDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getButtonTypeAccess().getBACKWARDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1260:3: (enumLiteral_1= 'LEFT' )
                    {
                    // InternalMyDsl.g:1260:3: (enumLiteral_1= 'LEFT' )
                    // InternalMyDsl.g:1261:4: enumLiteral_1= 'LEFT'
                    {
                    enumLiteral_1=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getButtonTypeAccess().getLEFTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getButtonTypeAccess().getLEFTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1268:3: (enumLiteral_2= 'RIGHT' )
                    {
                    // InternalMyDsl.g:1268:3: (enumLiteral_2= 'RIGHT' )
                    // InternalMyDsl.g:1269:4: enumLiteral_2= 'RIGHT'
                    {
                    enumLiteral_2=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getButtonTypeAccess().getRIGHTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getButtonTypeAccess().getRIGHTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1276:3: (enumLiteral_3= 'CENTER' )
                    {
                    // InternalMyDsl.g:1276:3: (enumLiteral_3= 'CENTER' )
                    // InternalMyDsl.g:1277:4: enumLiteral_3= 'CENTER'
                    {
                    enumLiteral_3=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getButtonTypeAccess().getCENTEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getButtonTypeAccess().getCENTEREnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1284:3: (enumLiteral_4= 'FORWARD' )
                    {
                    // InternalMyDsl.g:1284:3: (enumLiteral_4= 'FORWARD' )
                    // InternalMyDsl.g:1285:4: enumLiteral_4= 'FORWARD'
                    {
                    enumLiteral_4=(Token)match(input,45,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000006802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000029000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000007802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000AC0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00003E0000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000380000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000007000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000010L});

}