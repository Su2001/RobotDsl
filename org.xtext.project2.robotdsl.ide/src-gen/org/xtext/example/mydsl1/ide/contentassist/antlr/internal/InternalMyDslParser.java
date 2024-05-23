package org.xtext.example.mydsl1.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl1.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'+'", "'-'", "'*'", "'/'", "'NONE'", "'MEDIUM'", "'LONG'", "'TOP'", "'BOT'", "'OBSTACLE'", "'NOOBSTACLE'", "'BACKWARD'", "'LEFT'", "'RIGHT'", "'CENTER'", "'FORWARD'", "'Action:'", "'Condition:'", "'('", "')'", "'Event'", "'conditions:'", "'and'", "'actions:'", "','", "'Sound'", "'Button'", "'button'", "'Sensor'", "'sensorPos'", "'detectObstacle'", "'Tap'", "'MotorAction'", "'motorLeft'", "'motorRight'", "'SoundAction'", "'set:'", "'LightAction'", "'pos:'", "'red:'", "'green:'", "'blue:'"
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
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRobotModel"
    // InternalMyDsl.g:53:1: entryRuleRobotModel : ruleRobotModel EOF ;
    public final void entryRuleRobotModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleRobotModel EOF )
            // InternalMyDsl.g:55:1: ruleRobotModel EOF
            {
             before(grammarAccess.getRobotModelRule()); 
            pushFollow(FOLLOW_1);
            ruleRobotModel();

            state._fsp--;

             after(grammarAccess.getRobotModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRobotModel"


    // $ANTLR start "ruleRobotModel"
    // InternalMyDsl.g:62:1: ruleRobotModel : ( ( rule__RobotModel__Group__0 ) ) ;
    public final void ruleRobotModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__RobotModel__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__RobotModel__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__RobotModel__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__RobotModel__Group__0 )
            {
             before(grammarAccess.getRobotModelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__RobotModel__Group__0 )
            // InternalMyDsl.g:69:4: rule__RobotModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RobotModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRobotModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRobotModel"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:78:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleExpression EOF )
            // InternalMyDsl.g:80:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:87:1: ruleExpression : ( rulePlusOrMinus ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( rulePlusOrMinus ) )
            // InternalMyDsl.g:92:2: ( rulePlusOrMinus )
            {
            // InternalMyDsl.g:92:2: ( rulePlusOrMinus )
            // InternalMyDsl.g:93:3: rulePlusOrMinus
            {
             before(grammarAccess.getExpressionAccess().getPlusOrMinusParserRuleCall()); 
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getPlusOrMinusParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalMyDsl.g:103:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( rulePlusOrMinus EOF )
            // InternalMyDsl.g:105:1: rulePlusOrMinus EOF
            {
             before(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalMyDsl.g:112:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__PlusOrMinus__Group__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__PlusOrMinus__Group__0 )
            // InternalMyDsl.g:119:4: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMultOrDiv"
    // InternalMyDsl.g:128:1: entryRuleMultOrDiv : ruleMultOrDiv EOF ;
    public final void entryRuleMultOrDiv() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleMultOrDiv EOF )
            // InternalMyDsl.g:130:1: ruleMultOrDiv EOF
            {
             before(grammarAccess.getMultOrDivRule()); 
            pushFollow(FOLLOW_1);
            ruleMultOrDiv();

            state._fsp--;

             after(grammarAccess.getMultOrDivRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultOrDiv"


    // $ANTLR start "ruleMultOrDiv"
    // InternalMyDsl.g:137:1: ruleMultOrDiv : ( ( rule__MultOrDiv__Group__0 ) ) ;
    public final void ruleMultOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__MultOrDiv__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__MultOrDiv__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__MultOrDiv__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__MultOrDiv__Group__0 )
            {
             before(grammarAccess.getMultOrDivAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__MultOrDiv__Group__0 )
            // InternalMyDsl.g:144:4: rule__MultOrDiv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultOrDiv__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultOrDivAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalMyDsl.g:153:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( rulePrimary EOF )
            // InternalMyDsl.g:155:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMyDsl.g:162:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Primary__Alternatives ) )
            // InternalMyDsl.g:168:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMyDsl.g:169:3: ( rule__Primary__Alternatives )
            // InternalMyDsl.g:169:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalMyDsl.g:178:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleAtomic EOF )
            // InternalMyDsl.g:180:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalMyDsl.g:187:1: ruleAtomic : ( ( rule__Atomic__Group__0 ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Atomic__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Atomic__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Atomic__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Atomic__Group__0 )
            {
             before(grammarAccess.getAtomicAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Atomic__Group__0 )
            // InternalMyDsl.g:194:4: rule__Atomic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleEvent"
    // InternalMyDsl.g:203:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleEvent EOF )
            // InternalMyDsl.g:205:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalMyDsl.g:212:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Event__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Event__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Event__Group__0 )
            // InternalMyDsl.g:219:4: rule__Event__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:228:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleCondition EOF )
            // InternalMyDsl.g:230:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyDsl.g:237:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Condition__Alternatives ) )
            // InternalMyDsl.g:243:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalMyDsl.g:244:3: ( rule__Condition__Alternatives )
            // InternalMyDsl.g:244:4: rule__Condition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleSound"
    // InternalMyDsl.g:253:1: entryRuleSound : ruleSound EOF ;
    public final void entryRuleSound() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleSound EOF )
            // InternalMyDsl.g:255:1: ruleSound EOF
            {
             before(grammarAccess.getSoundRule()); 
            pushFollow(FOLLOW_1);
            ruleSound();

            state._fsp--;

             after(grammarAccess.getSoundRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSound"


    // $ANTLR start "ruleSound"
    // InternalMyDsl.g:262:1: ruleSound : ( ( rule__Sound__Group__0 ) ) ;
    public final void ruleSound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Sound__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Sound__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Sound__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Sound__Group__0 )
            {
             before(grammarAccess.getSoundAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Sound__Group__0 )
            // InternalMyDsl.g:269:4: rule__Sound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sound__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSoundAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSound"


    // $ANTLR start "entryRuleButton"
    // InternalMyDsl.g:278:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleButton EOF )
            // InternalMyDsl.g:280:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_1);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // InternalMyDsl.g:287:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Button__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Button__Group__0 )
            // InternalMyDsl.g:294:4: rule__Button__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleSensor"
    // InternalMyDsl.g:303:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleSensor EOF )
            // InternalMyDsl.g:305:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalMyDsl.g:312:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Sensor__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Sensor__Group__0 )
            // InternalMyDsl.g:319:4: rule__Sensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleTap"
    // InternalMyDsl.g:328:1: entryRuleTap : ruleTap EOF ;
    public final void entryRuleTap() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleTap EOF )
            // InternalMyDsl.g:330:1: ruleTap EOF
            {
             before(grammarAccess.getTapRule()); 
            pushFollow(FOLLOW_1);
            ruleTap();

            state._fsp--;

             after(grammarAccess.getTapRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTap"


    // $ANTLR start "ruleTap"
    // InternalMyDsl.g:337:1: ruleTap : ( ( rule__Tap__Group__0 ) ) ;
    public final void ruleTap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Tap__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Tap__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Tap__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Tap__Group__0 )
            {
             before(grammarAccess.getTapAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Tap__Group__0 )
            // InternalMyDsl.g:344:4: rule__Tap__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Tap__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTapAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTap"


    // $ANTLR start "entryRuleAction"
    // InternalMyDsl.g:353:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleAction EOF )
            // InternalMyDsl.g:355:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMyDsl.g:362:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Action__Alternatives ) )
            // InternalMyDsl.g:368:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalMyDsl.g:369:3: ( rule__Action__Alternatives )
            // InternalMyDsl.g:369:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleMotorAction"
    // InternalMyDsl.g:378:1: entryRuleMotorAction : ruleMotorAction EOF ;
    public final void entryRuleMotorAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleMotorAction EOF )
            // InternalMyDsl.g:380:1: ruleMotorAction EOF
            {
             before(grammarAccess.getMotorActionRule()); 
            pushFollow(FOLLOW_1);
            ruleMotorAction();

            state._fsp--;

             after(grammarAccess.getMotorActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMotorAction"


    // $ANTLR start "ruleMotorAction"
    // InternalMyDsl.g:387:1: ruleMotorAction : ( ( rule__MotorAction__Group__0 ) ) ;
    public final void ruleMotorAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__MotorAction__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__MotorAction__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__MotorAction__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__MotorAction__Group__0 )
            {
             before(grammarAccess.getMotorActionAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__MotorAction__Group__0 )
            // InternalMyDsl.g:394:4: rule__MotorAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MotorAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMotorActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMotorAction"


    // $ANTLR start "entryRuleSoundAction"
    // InternalMyDsl.g:403:1: entryRuleSoundAction : ruleSoundAction EOF ;
    public final void entryRuleSoundAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleSoundAction EOF )
            // InternalMyDsl.g:405:1: ruleSoundAction EOF
            {
             before(grammarAccess.getSoundActionRule()); 
            pushFollow(FOLLOW_1);
            ruleSoundAction();

            state._fsp--;

             after(grammarAccess.getSoundActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSoundAction"


    // $ANTLR start "ruleSoundAction"
    // InternalMyDsl.g:412:1: ruleSoundAction : ( ( rule__SoundAction__Group__0 ) ) ;
    public final void ruleSoundAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__SoundAction__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__SoundAction__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__SoundAction__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__SoundAction__Group__0 )
            {
             before(grammarAccess.getSoundActionAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__SoundAction__Group__0 )
            // InternalMyDsl.g:419:4: rule__SoundAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SoundAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSoundActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSoundAction"


    // $ANTLR start "entryRuleLightAction"
    // InternalMyDsl.g:428:1: entryRuleLightAction : ruleLightAction EOF ;
    public final void entryRuleLightAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleLightAction EOF )
            // InternalMyDsl.g:430:1: ruleLightAction EOF
            {
             before(grammarAccess.getLightActionRule()); 
            pushFollow(FOLLOW_1);
            ruleLightAction();

            state._fsp--;

             after(grammarAccess.getLightActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLightAction"


    // $ANTLR start "ruleLightAction"
    // InternalMyDsl.g:437:1: ruleLightAction : ( ( rule__LightAction__Group__0 ) ) ;
    public final void ruleLightAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__LightAction__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__LightAction__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__LightAction__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__LightAction__Group__0 )
            {
             before(grammarAccess.getLightActionAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__LightAction__Group__0 )
            // InternalMyDsl.g:444:4: rule__LightAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LightAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLightActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLightAction"


    // $ANTLR start "entryRuleMusicSetting"
    // InternalMyDsl.g:453:1: entryRuleMusicSetting : ruleMusicSetting EOF ;
    public final void entryRuleMusicSetting() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleMusicSetting EOF )
            // InternalMyDsl.g:455:1: ruleMusicSetting EOF
            {
             before(grammarAccess.getMusicSettingRule()); 
            pushFollow(FOLLOW_1);
            ruleMusicSetting();

            state._fsp--;

             after(grammarAccess.getMusicSettingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMusicSetting"


    // $ANTLR start "ruleMusicSetting"
    // InternalMyDsl.g:462:1: ruleMusicSetting : ( ( rule__MusicSetting__Group__0 ) ) ;
    public final void ruleMusicSetting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__MusicSetting__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__MusicSetting__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__MusicSetting__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__MusicSetting__Group__0 )
            {
             before(grammarAccess.getMusicSettingAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__MusicSetting__Group__0 )
            // InternalMyDsl.g:469:4: rule__MusicSetting__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MusicSetting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMusicSettingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMusicSetting"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:478:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleEInt EOF )
            // InternalMyDsl.g:480:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:487:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:494:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:503:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleEString EOF )
            // InternalMyDsl.g:505:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:512:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:518:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:519:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:519:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleDuration"
    // InternalMyDsl.g:528:1: ruleDuration : ( ( rule__Duration__Alternatives ) ) ;
    public final void ruleDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:532:1: ( ( ( rule__Duration__Alternatives ) ) )
            // InternalMyDsl.g:533:2: ( ( rule__Duration__Alternatives ) )
            {
            // InternalMyDsl.g:533:2: ( ( rule__Duration__Alternatives ) )
            // InternalMyDsl.g:534:3: ( rule__Duration__Alternatives )
            {
             before(grammarAccess.getDurationAccess().getAlternatives()); 
            // InternalMyDsl.g:535:3: ( rule__Duration__Alternatives )
            // InternalMyDsl.g:535:4: rule__Duration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Duration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDurationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDuration"


    // $ANTLR start "ruleLightPos"
    // InternalMyDsl.g:544:1: ruleLightPos : ( ( rule__LightPos__Alternatives ) ) ;
    public final void ruleLightPos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:548:1: ( ( ( rule__LightPos__Alternatives ) ) )
            // InternalMyDsl.g:549:2: ( ( rule__LightPos__Alternatives ) )
            {
            // InternalMyDsl.g:549:2: ( ( rule__LightPos__Alternatives ) )
            // InternalMyDsl.g:550:3: ( rule__LightPos__Alternatives )
            {
             before(grammarAccess.getLightPosAccess().getAlternatives()); 
            // InternalMyDsl.g:551:3: ( rule__LightPos__Alternatives )
            // InternalMyDsl.g:551:4: rule__LightPos__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LightPos__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLightPosAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLightPos"


    // $ANTLR start "ruleDistance"
    // InternalMyDsl.g:560:1: ruleDistance : ( ( rule__Distance__Alternatives ) ) ;
    public final void ruleDistance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:564:1: ( ( ( rule__Distance__Alternatives ) ) )
            // InternalMyDsl.g:565:2: ( ( rule__Distance__Alternatives ) )
            {
            // InternalMyDsl.g:565:2: ( ( rule__Distance__Alternatives ) )
            // InternalMyDsl.g:566:3: ( rule__Distance__Alternatives )
            {
             before(grammarAccess.getDistanceAccess().getAlternatives()); 
            // InternalMyDsl.g:567:3: ( rule__Distance__Alternatives )
            // InternalMyDsl.g:567:4: rule__Distance__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Distance__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDistanceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDistance"


    // $ANTLR start "ruleButtonType"
    // InternalMyDsl.g:576:1: ruleButtonType : ( ( rule__ButtonType__Alternatives ) ) ;
    public final void ruleButtonType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:580:1: ( ( ( rule__ButtonType__Alternatives ) ) )
            // InternalMyDsl.g:581:2: ( ( rule__ButtonType__Alternatives ) )
            {
            // InternalMyDsl.g:581:2: ( ( rule__ButtonType__Alternatives ) )
            // InternalMyDsl.g:582:3: ( rule__ButtonType__Alternatives )
            {
             before(grammarAccess.getButtonTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:583:3: ( rule__ButtonType__Alternatives )
            // InternalMyDsl.g:583:4: rule__ButtonType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ButtonType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getButtonTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButtonType"


    // $ANTLR start "rule__RobotModel__Alternatives_1"
    // InternalMyDsl.g:591:1: rule__RobotModel__Alternatives_1 : ( ( ( rule__RobotModel__EventsAssignment_1_0 ) ) | ( ( rule__RobotModel__Group_1_1__0 ) ) | ( ( rule__RobotModel__Group_1_2__0 ) ) | ( ( rule__RobotModel__ExpressionsAssignment_1_3 ) ) );
    public final void rule__RobotModel__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:595:1: ( ( ( rule__RobotModel__EventsAssignment_1_0 ) ) | ( ( rule__RobotModel__Group_1_1__0 ) ) | ( ( rule__RobotModel__Group_1_2__0 ) ) | ( ( rule__RobotModel__ExpressionsAssignment_1_3 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt1=1;
                }
                break;
            case 27:
                {
                alt1=2;
                }
                break;
            case 28:
                {
                alt1=3;
                }
                break;
            case RULE_INT:
            case 12:
            case 29:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:596:2: ( ( rule__RobotModel__EventsAssignment_1_0 ) )
                    {
                    // InternalMyDsl.g:596:2: ( ( rule__RobotModel__EventsAssignment_1_0 ) )
                    // InternalMyDsl.g:597:3: ( rule__RobotModel__EventsAssignment_1_0 )
                    {
                     before(grammarAccess.getRobotModelAccess().getEventsAssignment_1_0()); 
                    // InternalMyDsl.g:598:3: ( rule__RobotModel__EventsAssignment_1_0 )
                    // InternalMyDsl.g:598:4: rule__RobotModel__EventsAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RobotModel__EventsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRobotModelAccess().getEventsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:602:2: ( ( rule__RobotModel__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:602:2: ( ( rule__RobotModel__Group_1_1__0 ) )
                    // InternalMyDsl.g:603:3: ( rule__RobotModel__Group_1_1__0 )
                    {
                     before(grammarAccess.getRobotModelAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:604:3: ( rule__RobotModel__Group_1_1__0 )
                    // InternalMyDsl.g:604:4: rule__RobotModel__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RobotModel__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRobotModelAccess().getGroup_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:608:2: ( ( rule__RobotModel__Group_1_2__0 ) )
                    {
                    // InternalMyDsl.g:608:2: ( ( rule__RobotModel__Group_1_2__0 ) )
                    // InternalMyDsl.g:609:3: ( rule__RobotModel__Group_1_2__0 )
                    {
                     before(grammarAccess.getRobotModelAccess().getGroup_1_2()); 
                    // InternalMyDsl.g:610:3: ( rule__RobotModel__Group_1_2__0 )
                    // InternalMyDsl.g:610:4: rule__RobotModel__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RobotModel__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRobotModelAccess().getGroup_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:614:2: ( ( rule__RobotModel__ExpressionsAssignment_1_3 ) )
                    {
                    // InternalMyDsl.g:614:2: ( ( rule__RobotModel__ExpressionsAssignment_1_3 ) )
                    // InternalMyDsl.g:615:3: ( rule__RobotModel__ExpressionsAssignment_1_3 )
                    {
                     before(grammarAccess.getRobotModelAccess().getExpressionsAssignment_1_3()); 
                    // InternalMyDsl.g:616:3: ( rule__RobotModel__ExpressionsAssignment_1_3 )
                    // InternalMyDsl.g:616:4: rule__RobotModel__ExpressionsAssignment_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__RobotModel__ExpressionsAssignment_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getRobotModelAccess().getExpressionsAssignment_1_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Alternatives_1"


    // $ANTLR start "rule__PlusOrMinus__OperationAlternatives_1_0_1_0"
    // InternalMyDsl.g:624:1: rule__PlusOrMinus__OperationAlternatives_1_0_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__PlusOrMinus__OperationAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:628:1: ( ( '+' ) | ( '-' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:629:2: ( '+' )
                    {
                    // InternalMyDsl.g:629:2: ( '+' )
                    // InternalMyDsl.g:630:3: '+'
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getOperationPlusSignKeyword_1_0_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPlusOrMinusAccess().getOperationPlusSignKeyword_1_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:635:2: ( '-' )
                    {
                    // InternalMyDsl.g:635:2: ( '-' )
                    // InternalMyDsl.g:636:3: '-'
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getOperationHyphenMinusKeyword_1_0_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPlusOrMinusAccess().getOperationHyphenMinusKeyword_1_0_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__OperationAlternatives_1_0_1_0"


    // $ANTLR start "rule__MultOrDiv__OperationAlternatives_1_1_0"
    // InternalMyDsl.g:645:1: rule__MultOrDiv__OperationAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MultOrDiv__OperationAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:649:1: ( ( '*' ) | ( '/' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:650:2: ( '*' )
                    {
                    // InternalMyDsl.g:650:2: ( '*' )
                    // InternalMyDsl.g:651:3: '*'
                    {
                     before(grammarAccess.getMultOrDivAccess().getOperationAsteriskKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getMultOrDivAccess().getOperationAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:656:2: ( '/' )
                    {
                    // InternalMyDsl.g:656:2: ( '/' )
                    // InternalMyDsl.g:657:3: '/'
                    {
                     before(grammarAccess.getMultOrDivAccess().getOperationSolidusKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getMultOrDivAccess().getOperationSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOrDiv__OperationAlternatives_1_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMyDsl.g:666:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:670:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ruleAtomic ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT||LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:671:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:671:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalMyDsl.g:672:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalMyDsl.g:673:3: ( rule__Primary__Group_0__0 )
                    // InternalMyDsl.g:673:4: rule__Primary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:677:2: ( ruleAtomic )
                    {
                    // InternalMyDsl.g:677:2: ( ruleAtomic )
                    // InternalMyDsl.g:678:3: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalMyDsl.g:687:1: rule__Condition__Alternatives : ( ( ruleButton ) | ( ruleSensor ) | ( ruleSound ) | ( ruleTap ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:1: ( ( ruleButton ) | ( ruleSensor ) | ( ruleSound ) | ( ruleTap ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt5=1;
                }
                break;
            case 39:
                {
                alt5=2;
                }
                break;
            case 36:
                {
                alt5=3;
                }
                break;
            case 42:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:692:2: ( ruleButton )
                    {
                    // InternalMyDsl.g:692:2: ( ruleButton )
                    // InternalMyDsl.g:693:3: ruleButton
                    {
                     before(grammarAccess.getConditionAccess().getButtonParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getButtonParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:698:2: ( ruleSensor )
                    {
                    // InternalMyDsl.g:698:2: ( ruleSensor )
                    // InternalMyDsl.g:699:3: ruleSensor
                    {
                     before(grammarAccess.getConditionAccess().getSensorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSensor();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getSensorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:704:2: ( ruleSound )
                    {
                    // InternalMyDsl.g:704:2: ( ruleSound )
                    // InternalMyDsl.g:705:3: ruleSound
                    {
                     before(grammarAccess.getConditionAccess().getSoundParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSound();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getSoundParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:710:2: ( ruleTap )
                    {
                    // InternalMyDsl.g:710:2: ( ruleTap )
                    // InternalMyDsl.g:711:3: ruleTap
                    {
                     before(grammarAccess.getConditionAccess().getTapParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTap();

                    state._fsp--;

                     after(grammarAccess.getConditionAccess().getTapParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalMyDsl.g:720:1: rule__Action__Alternatives : ( ( ruleMotorAction ) | ( ruleSoundAction ) | ( ruleLightAction ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:724:1: ( ( ruleMotorAction ) | ( ruleSoundAction ) | ( ruleLightAction ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt6=1;
                }
                break;
            case 46:
                {
                alt6=2;
                }
                break;
            case 48:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:725:2: ( ruleMotorAction )
                    {
                    // InternalMyDsl.g:725:2: ( ruleMotorAction )
                    // InternalMyDsl.g:726:3: ruleMotorAction
                    {
                     before(grammarAccess.getActionAccess().getMotorActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMotorAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getMotorActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:731:2: ( ruleSoundAction )
                    {
                    // InternalMyDsl.g:731:2: ( ruleSoundAction )
                    // InternalMyDsl.g:732:3: ruleSoundAction
                    {
                     before(grammarAccess.getActionAccess().getSoundActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSoundAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getSoundActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:737:2: ( ruleLightAction )
                    {
                    // InternalMyDsl.g:737:2: ( ruleLightAction )
                    // InternalMyDsl.g:738:3: ruleLightAction
                    {
                     before(grammarAccess.getActionAccess().getLightActionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLightAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getLightActionParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:747:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:751:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:752:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:752:2: ( RULE_STRING )
                    // InternalMyDsl.g:753:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:758:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:758:2: ( RULE_ID )
                    // InternalMyDsl.g:759:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Duration__Alternatives"
    // InternalMyDsl.g:768:1: rule__Duration__Alternatives : ( ( ( 'NONE' ) ) | ( ( 'MEDIUM' ) ) | ( ( 'LONG' ) ) );
    public final void rule__Duration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:772:1: ( ( ( 'NONE' ) ) | ( ( 'MEDIUM' ) ) | ( ( 'LONG' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt8=1;
                }
                break;
            case 16:
                {
                alt8=2;
                }
                break;
            case 17:
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
                    // InternalMyDsl.g:773:2: ( ( 'NONE' ) )
                    {
                    // InternalMyDsl.g:773:2: ( ( 'NONE' ) )
                    // InternalMyDsl.g:774:3: ( 'NONE' )
                    {
                     before(grammarAccess.getDurationAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:775:3: ( 'NONE' )
                    // InternalMyDsl.g:775:4: 'NONE'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getDurationAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:779:2: ( ( 'MEDIUM' ) )
                    {
                    // InternalMyDsl.g:779:2: ( ( 'MEDIUM' ) )
                    // InternalMyDsl.g:780:3: ( 'MEDIUM' )
                    {
                     before(grammarAccess.getDurationAccess().getMEDIUMEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:781:3: ( 'MEDIUM' )
                    // InternalMyDsl.g:781:4: 'MEDIUM'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getDurationAccess().getMEDIUMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:785:2: ( ( 'LONG' ) )
                    {
                    // InternalMyDsl.g:785:2: ( ( 'LONG' ) )
                    // InternalMyDsl.g:786:3: ( 'LONG' )
                    {
                     before(grammarAccess.getDurationAccess().getLONGEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:787:3: ( 'LONG' )
                    // InternalMyDsl.g:787:4: 'LONG'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getDurationAccess().getLONGEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Duration__Alternatives"


    // $ANTLR start "rule__LightPos__Alternatives"
    // InternalMyDsl.g:795:1: rule__LightPos__Alternatives : ( ( ( 'TOP' ) ) | ( ( 'BOT' ) ) );
    public final void rule__LightPos__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:799:1: ( ( ( 'TOP' ) ) | ( ( 'BOT' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==19) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:800:2: ( ( 'TOP' ) )
                    {
                    // InternalMyDsl.g:800:2: ( ( 'TOP' ) )
                    // InternalMyDsl.g:801:3: ( 'TOP' )
                    {
                     before(grammarAccess.getLightPosAccess().getTOPEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:802:3: ( 'TOP' )
                    // InternalMyDsl.g:802:4: 'TOP'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getLightPosAccess().getTOPEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:806:2: ( ( 'BOT' ) )
                    {
                    // InternalMyDsl.g:806:2: ( ( 'BOT' ) )
                    // InternalMyDsl.g:807:3: ( 'BOT' )
                    {
                     before(grammarAccess.getLightPosAccess().getBOTEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:808:3: ( 'BOT' )
                    // InternalMyDsl.g:808:4: 'BOT'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getLightPosAccess().getBOTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightPos__Alternatives"


    // $ANTLR start "rule__Distance__Alternatives"
    // InternalMyDsl.g:816:1: rule__Distance__Alternatives : ( ( ( 'OBSTACLE' ) ) | ( ( 'NOOBSTACLE' ) ) );
    public final void rule__Distance__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:820:1: ( ( ( 'OBSTACLE' ) ) | ( ( 'NOOBSTACLE' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            else if ( (LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:821:2: ( ( 'OBSTACLE' ) )
                    {
                    // InternalMyDsl.g:821:2: ( ( 'OBSTACLE' ) )
                    // InternalMyDsl.g:822:3: ( 'OBSTACLE' )
                    {
                     before(grammarAccess.getDistanceAccess().getFAREnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:823:3: ( 'OBSTACLE' )
                    // InternalMyDsl.g:823:4: 'OBSTACLE'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistanceAccess().getFAREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:827:2: ( ( 'NOOBSTACLE' ) )
                    {
                    // InternalMyDsl.g:827:2: ( ( 'NOOBSTACLE' ) )
                    // InternalMyDsl.g:828:3: ( 'NOOBSTACLE' )
                    {
                     before(grammarAccess.getDistanceAccess().getCLOSEEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:829:3: ( 'NOOBSTACLE' )
                    // InternalMyDsl.g:829:4: 'NOOBSTACLE'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistanceAccess().getCLOSEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Distance__Alternatives"


    // $ANTLR start "rule__ButtonType__Alternatives"
    // InternalMyDsl.g:837:1: rule__ButtonType__Alternatives : ( ( ( 'BACKWARD' ) ) | ( ( 'LEFT' ) ) | ( ( 'RIGHT' ) ) | ( ( 'CENTER' ) ) | ( ( 'FORWARD' ) ) );
    public final void rule__ButtonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:1: ( ( ( 'BACKWARD' ) ) | ( ( 'LEFT' ) ) | ( ( 'RIGHT' ) ) | ( ( 'CENTER' ) ) | ( ( 'FORWARD' ) ) )
            int alt11=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 24:
                {
                alt11=3;
                }
                break;
            case 25:
                {
                alt11=4;
                }
                break;
            case 26:
                {
                alt11=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:842:2: ( ( 'BACKWARD' ) )
                    {
                    // InternalMyDsl.g:842:2: ( ( 'BACKWARD' ) )
                    // InternalMyDsl.g:843:3: ( 'BACKWARD' )
                    {
                     before(grammarAccess.getButtonTypeAccess().getBACKWARDEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:844:3: ( 'BACKWARD' )
                    // InternalMyDsl.g:844:4: 'BACKWARD'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getButtonTypeAccess().getBACKWARDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:848:2: ( ( 'LEFT' ) )
                    {
                    // InternalMyDsl.g:848:2: ( ( 'LEFT' ) )
                    // InternalMyDsl.g:849:3: ( 'LEFT' )
                    {
                     before(grammarAccess.getButtonTypeAccess().getLEFTEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:850:3: ( 'LEFT' )
                    // InternalMyDsl.g:850:4: 'LEFT'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getButtonTypeAccess().getLEFTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:854:2: ( ( 'RIGHT' ) )
                    {
                    // InternalMyDsl.g:854:2: ( ( 'RIGHT' ) )
                    // InternalMyDsl.g:855:3: ( 'RIGHT' )
                    {
                     before(grammarAccess.getButtonTypeAccess().getRIGHTEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:856:3: ( 'RIGHT' )
                    // InternalMyDsl.g:856:4: 'RIGHT'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getButtonTypeAccess().getRIGHTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:860:2: ( ( 'CENTER' ) )
                    {
                    // InternalMyDsl.g:860:2: ( ( 'CENTER' ) )
                    // InternalMyDsl.g:861:3: ( 'CENTER' )
                    {
                     before(grammarAccess.getButtonTypeAccess().getCENTEREnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:862:3: ( 'CENTER' )
                    // InternalMyDsl.g:862:4: 'CENTER'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getButtonTypeAccess().getCENTEREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:866:2: ( ( 'FORWARD' ) )
                    {
                    // InternalMyDsl.g:866:2: ( ( 'FORWARD' ) )
                    // InternalMyDsl.g:867:3: ( 'FORWARD' )
                    {
                     before(grammarAccess.getButtonTypeAccess().getFORWARDEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:868:3: ( 'FORWARD' )
                    // InternalMyDsl.g:868:4: 'FORWARD'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getButtonTypeAccess().getFORWARDEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ButtonType__Alternatives"


    // $ANTLR start "rule__RobotModel__Group__0"
    // InternalMyDsl.g:876:1: rule__RobotModel__Group__0 : rule__RobotModel__Group__0__Impl rule__RobotModel__Group__1 ;
    public final void rule__RobotModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:880:1: ( rule__RobotModel__Group__0__Impl rule__RobotModel__Group__1 )
            // InternalMyDsl.g:881:2: rule__RobotModel__Group__0__Impl rule__RobotModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RobotModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group__0"


    // $ANTLR start "rule__RobotModel__Group__0__Impl"
    // InternalMyDsl.g:888:1: rule__RobotModel__Group__0__Impl : ( () ) ;
    public final void rule__RobotModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:892:1: ( ( () ) )
            // InternalMyDsl.g:893:1: ( () )
            {
            // InternalMyDsl.g:893:1: ( () )
            // InternalMyDsl.g:894:2: ()
            {
             before(grammarAccess.getRobotModelAccess().getRobotModelAction_0()); 
            // InternalMyDsl.g:895:2: ()
            // InternalMyDsl.g:895:3: 
            {
            }

             after(grammarAccess.getRobotModelAccess().getRobotModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group__0__Impl"


    // $ANTLR start "rule__RobotModel__Group__1"
    // InternalMyDsl.g:903:1: rule__RobotModel__Group__1 : rule__RobotModel__Group__1__Impl ;
    public final void rule__RobotModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:907:1: ( rule__RobotModel__Group__1__Impl )
            // InternalMyDsl.g:908:2: rule__RobotModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RobotModel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group__1"


    // $ANTLR start "rule__RobotModel__Group__1__Impl"
    // InternalMyDsl.g:914:1: rule__RobotModel__Group__1__Impl : ( ( rule__RobotModel__Alternatives_1 )* ) ;
    public final void rule__RobotModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:918:1: ( ( ( rule__RobotModel__Alternatives_1 )* ) )
            // InternalMyDsl.g:919:1: ( ( rule__RobotModel__Alternatives_1 )* )
            {
            // InternalMyDsl.g:919:1: ( ( rule__RobotModel__Alternatives_1 )* )
            // InternalMyDsl.g:920:2: ( rule__RobotModel__Alternatives_1 )*
            {
             before(grammarAccess.getRobotModelAccess().getAlternatives_1()); 
            // InternalMyDsl.g:921:2: ( rule__RobotModel__Alternatives_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_INT||LA12_0==12||(LA12_0>=27 && LA12_0<=29)||LA12_0==31) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:921:3: rule__RobotModel__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__RobotModel__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRobotModelAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group__1__Impl"


    // $ANTLR start "rule__RobotModel__Group_1_1__0"
    // InternalMyDsl.g:930:1: rule__RobotModel__Group_1_1__0 : rule__RobotModel__Group_1_1__0__Impl rule__RobotModel__Group_1_1__1 ;
    public final void rule__RobotModel__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:934:1: ( rule__RobotModel__Group_1_1__0__Impl rule__RobotModel__Group_1_1__1 )
            // InternalMyDsl.g:935:2: rule__RobotModel__Group_1_1__0__Impl rule__RobotModel__Group_1_1__1
            {
            pushFollow(FOLLOW_5);
            rule__RobotModel__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotModel__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_1__0"


    // $ANTLR start "rule__RobotModel__Group_1_1__0__Impl"
    // InternalMyDsl.g:942:1: rule__RobotModel__Group_1_1__0__Impl : ( 'Action:' ) ;
    public final void rule__RobotModel__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:946:1: ( ( 'Action:' ) )
            // InternalMyDsl.g:947:1: ( 'Action:' )
            {
            // InternalMyDsl.g:947:1: ( 'Action:' )
            // InternalMyDsl.g:948:2: 'Action:'
            {
             before(grammarAccess.getRobotModelAccess().getActionKeyword_1_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRobotModelAccess().getActionKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_1__0__Impl"


    // $ANTLR start "rule__RobotModel__Group_1_1__1"
    // InternalMyDsl.g:957:1: rule__RobotModel__Group_1_1__1 : rule__RobotModel__Group_1_1__1__Impl rule__RobotModel__Group_1_1__2 ;
    public final void rule__RobotModel__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:961:1: ( rule__RobotModel__Group_1_1__1__Impl rule__RobotModel__Group_1_1__2 )
            // InternalMyDsl.g:962:2: rule__RobotModel__Group_1_1__1__Impl rule__RobotModel__Group_1_1__2
            {
            pushFollow(FOLLOW_6);
            rule__RobotModel__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotModel__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_1__1"


    // $ANTLR start "rule__RobotModel__Group_1_1__1__Impl"
    // InternalMyDsl.g:969:1: rule__RobotModel__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__RobotModel__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:973:1: ( ( '-' ) )
            // InternalMyDsl.g:974:1: ( '-' )
            {
            // InternalMyDsl.g:974:1: ( '-' )
            // InternalMyDsl.g:975:2: '-'
            {
             before(grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_1_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_1__1__Impl"


    // $ANTLR start "rule__RobotModel__Group_1_1__2"
    // InternalMyDsl.g:984:1: rule__RobotModel__Group_1_1__2 : rule__RobotModel__Group_1_1__2__Impl rule__RobotModel__Group_1_1__3 ;
    public final void rule__RobotModel__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:988:1: ( rule__RobotModel__Group_1_1__2__Impl rule__RobotModel__Group_1_1__3 )
            // InternalMyDsl.g:989:2: rule__RobotModel__Group_1_1__2__Impl rule__RobotModel__Group_1_1__3
            {
            pushFollow(FOLLOW_5);
            rule__RobotModel__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotModel__Group_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_1__2"


    // $ANTLR start "rule__RobotModel__Group_1_1__2__Impl"
    // InternalMyDsl.g:996:1: rule__RobotModel__Group_1_1__2__Impl : ( ( rule__RobotModel__ActionsAssignment_1_1_2 ) ) ;
    public final void rule__RobotModel__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1000:1: ( ( ( rule__RobotModel__ActionsAssignment_1_1_2 ) ) )
            // InternalMyDsl.g:1001:1: ( ( rule__RobotModel__ActionsAssignment_1_1_2 ) )
            {
            // InternalMyDsl.g:1001:1: ( ( rule__RobotModel__ActionsAssignment_1_1_2 ) )
            // InternalMyDsl.g:1002:2: ( rule__RobotModel__ActionsAssignment_1_1_2 )
            {
             before(grammarAccess.getRobotModelAccess().getActionsAssignment_1_1_2()); 
            // InternalMyDsl.g:1003:2: ( rule__RobotModel__ActionsAssignment_1_1_2 )
            // InternalMyDsl.g:1003:3: rule__RobotModel__ActionsAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__RobotModel__ActionsAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotModelAccess().getActionsAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_1__2__Impl"


    // $ANTLR start "rule__RobotModel__Group_1_1__3"
    // InternalMyDsl.g:1011:1: rule__RobotModel__Group_1_1__3 : rule__RobotModel__Group_1_1__3__Impl ;
    public final void rule__RobotModel__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1015:1: ( rule__RobotModel__Group_1_1__3__Impl )
            // InternalMyDsl.g:1016:2: rule__RobotModel__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RobotModel__Group_1_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_1__3"


    // $ANTLR start "rule__RobotModel__Group_1_1__3__Impl"
    // InternalMyDsl.g:1022:1: rule__RobotModel__Group_1_1__3__Impl : ( ( rule__RobotModel__Group_1_1_3__0 )* ) ;
    public final void rule__RobotModel__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1026:1: ( ( ( rule__RobotModel__Group_1_1_3__0 )* ) )
            // InternalMyDsl.g:1027:1: ( ( rule__RobotModel__Group_1_1_3__0 )* )
            {
            // InternalMyDsl.g:1027:1: ( ( rule__RobotModel__Group_1_1_3__0 )* )
            // InternalMyDsl.g:1028:2: ( rule__RobotModel__Group_1_1_3__0 )*
            {
             before(grammarAccess.getRobotModelAccess().getGroup_1_1_3()); 
            // InternalMyDsl.g:1029:2: ( rule__RobotModel__Group_1_1_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==12) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==43||LA13_2==46||LA13_2==48) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1029:3: rule__RobotModel__Group_1_1_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RobotModel__Group_1_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRobotModelAccess().getGroup_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_1__3__Impl"


    // $ANTLR start "rule__RobotModel__Group_1_1_3__0"
    // InternalMyDsl.g:1038:1: rule__RobotModel__Group_1_1_3__0 : rule__RobotModel__Group_1_1_3__0__Impl rule__RobotModel__Group_1_1_3__1 ;
    public final void rule__RobotModel__Group_1_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1042:1: ( rule__RobotModel__Group_1_1_3__0__Impl rule__RobotModel__Group_1_1_3__1 )
            // InternalMyDsl.g:1043:2: rule__RobotModel__Group_1_1_3__0__Impl rule__RobotModel__Group_1_1_3__1
            {
            pushFollow(FOLLOW_6);
            rule__RobotModel__Group_1_1_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotModel__Group_1_1_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_1_3__0"


    // $ANTLR start "rule__RobotModel__Group_1_1_3__0__Impl"
    // InternalMyDsl.g:1050:1: rule__RobotModel__Group_1_1_3__0__Impl : ( '-' ) ;
    public final void rule__RobotModel__Group_1_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1054:1: ( ( '-' ) )
            // InternalMyDsl.g:1055:1: ( '-' )
            {
            // InternalMyDsl.g:1055:1: ( '-' )
            // InternalMyDsl.g:1056:2: '-'
            {
             before(grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_1_3_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_1_3__0__Impl"


    // $ANTLR start "rule__RobotModel__Group_1_1_3__1"
    // InternalMyDsl.g:1065:1: rule__RobotModel__Group_1_1_3__1 : rule__RobotModel__Group_1_1_3__1__Impl ;
    public final void rule__RobotModel__Group_1_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1069:1: ( rule__RobotModel__Group_1_1_3__1__Impl )
            // InternalMyDsl.g:1070:2: rule__RobotModel__Group_1_1_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RobotModel__Group_1_1_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_1_3__1"


    // $ANTLR start "rule__RobotModel__Group_1_1_3__1__Impl"
    // InternalMyDsl.g:1076:1: rule__RobotModel__Group_1_1_3__1__Impl : ( ( rule__RobotModel__ActionsAssignment_1_1_3_1 ) ) ;
    public final void rule__RobotModel__Group_1_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1080:1: ( ( ( rule__RobotModel__ActionsAssignment_1_1_3_1 ) ) )
            // InternalMyDsl.g:1081:1: ( ( rule__RobotModel__ActionsAssignment_1_1_3_1 ) )
            {
            // InternalMyDsl.g:1081:1: ( ( rule__RobotModel__ActionsAssignment_1_1_3_1 ) )
            // InternalMyDsl.g:1082:2: ( rule__RobotModel__ActionsAssignment_1_1_3_1 )
            {
             before(grammarAccess.getRobotModelAccess().getActionsAssignment_1_1_3_1()); 
            // InternalMyDsl.g:1083:2: ( rule__RobotModel__ActionsAssignment_1_1_3_1 )
            // InternalMyDsl.g:1083:3: rule__RobotModel__ActionsAssignment_1_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RobotModel__ActionsAssignment_1_1_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotModelAccess().getActionsAssignment_1_1_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_1_3__1__Impl"


    // $ANTLR start "rule__RobotModel__Group_1_2__0"
    // InternalMyDsl.g:1092:1: rule__RobotModel__Group_1_2__0 : rule__RobotModel__Group_1_2__0__Impl rule__RobotModel__Group_1_2__1 ;
    public final void rule__RobotModel__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1096:1: ( rule__RobotModel__Group_1_2__0__Impl rule__RobotModel__Group_1_2__1 )
            // InternalMyDsl.g:1097:2: rule__RobotModel__Group_1_2__0__Impl rule__RobotModel__Group_1_2__1
            {
            pushFollow(FOLLOW_5);
            rule__RobotModel__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotModel__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_2__0"


    // $ANTLR start "rule__RobotModel__Group_1_2__0__Impl"
    // InternalMyDsl.g:1104:1: rule__RobotModel__Group_1_2__0__Impl : ( 'Condition:' ) ;
    public final void rule__RobotModel__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1108:1: ( ( 'Condition:' ) )
            // InternalMyDsl.g:1109:1: ( 'Condition:' )
            {
            // InternalMyDsl.g:1109:1: ( 'Condition:' )
            // InternalMyDsl.g:1110:2: 'Condition:'
            {
             before(grammarAccess.getRobotModelAccess().getConditionKeyword_1_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRobotModelAccess().getConditionKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_2__0__Impl"


    // $ANTLR start "rule__RobotModel__Group_1_2__1"
    // InternalMyDsl.g:1119:1: rule__RobotModel__Group_1_2__1 : rule__RobotModel__Group_1_2__1__Impl rule__RobotModel__Group_1_2__2 ;
    public final void rule__RobotModel__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1123:1: ( rule__RobotModel__Group_1_2__1__Impl rule__RobotModel__Group_1_2__2 )
            // InternalMyDsl.g:1124:2: rule__RobotModel__Group_1_2__1__Impl rule__RobotModel__Group_1_2__2
            {
            pushFollow(FOLLOW_8);
            rule__RobotModel__Group_1_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotModel__Group_1_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_2__1"


    // $ANTLR start "rule__RobotModel__Group_1_2__1__Impl"
    // InternalMyDsl.g:1131:1: rule__RobotModel__Group_1_2__1__Impl : ( '-' ) ;
    public final void rule__RobotModel__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1135:1: ( ( '-' ) )
            // InternalMyDsl.g:1136:1: ( '-' )
            {
            // InternalMyDsl.g:1136:1: ( '-' )
            // InternalMyDsl.g:1137:2: '-'
            {
             before(grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_2_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_2__1__Impl"


    // $ANTLR start "rule__RobotModel__Group_1_2__2"
    // InternalMyDsl.g:1146:1: rule__RobotModel__Group_1_2__2 : rule__RobotModel__Group_1_2__2__Impl rule__RobotModel__Group_1_2__3 ;
    public final void rule__RobotModel__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1150:1: ( rule__RobotModel__Group_1_2__2__Impl rule__RobotModel__Group_1_2__3 )
            // InternalMyDsl.g:1151:2: rule__RobotModel__Group_1_2__2__Impl rule__RobotModel__Group_1_2__3
            {
            pushFollow(FOLLOW_5);
            rule__RobotModel__Group_1_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotModel__Group_1_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_2__2"


    // $ANTLR start "rule__RobotModel__Group_1_2__2__Impl"
    // InternalMyDsl.g:1158:1: rule__RobotModel__Group_1_2__2__Impl : ( ( rule__RobotModel__ConditionsAssignment_1_2_2 ) ) ;
    public final void rule__RobotModel__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1162:1: ( ( ( rule__RobotModel__ConditionsAssignment_1_2_2 ) ) )
            // InternalMyDsl.g:1163:1: ( ( rule__RobotModel__ConditionsAssignment_1_2_2 ) )
            {
            // InternalMyDsl.g:1163:1: ( ( rule__RobotModel__ConditionsAssignment_1_2_2 ) )
            // InternalMyDsl.g:1164:2: ( rule__RobotModel__ConditionsAssignment_1_2_2 )
            {
             before(grammarAccess.getRobotModelAccess().getConditionsAssignment_1_2_2()); 
            // InternalMyDsl.g:1165:2: ( rule__RobotModel__ConditionsAssignment_1_2_2 )
            // InternalMyDsl.g:1165:3: rule__RobotModel__ConditionsAssignment_1_2_2
            {
            pushFollow(FOLLOW_2);
            rule__RobotModel__ConditionsAssignment_1_2_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotModelAccess().getConditionsAssignment_1_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_2__2__Impl"


    // $ANTLR start "rule__RobotModel__Group_1_2__3"
    // InternalMyDsl.g:1173:1: rule__RobotModel__Group_1_2__3 : rule__RobotModel__Group_1_2__3__Impl ;
    public final void rule__RobotModel__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1177:1: ( rule__RobotModel__Group_1_2__3__Impl )
            // InternalMyDsl.g:1178:2: rule__RobotModel__Group_1_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RobotModel__Group_1_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_2__3"


    // $ANTLR start "rule__RobotModel__Group_1_2__3__Impl"
    // InternalMyDsl.g:1184:1: rule__RobotModel__Group_1_2__3__Impl : ( ( rule__RobotModel__Group_1_2_3__0 )* ) ;
    public final void rule__RobotModel__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1188:1: ( ( ( rule__RobotModel__Group_1_2_3__0 )* ) )
            // InternalMyDsl.g:1189:1: ( ( rule__RobotModel__Group_1_2_3__0 )* )
            {
            // InternalMyDsl.g:1189:1: ( ( rule__RobotModel__Group_1_2_3__0 )* )
            // InternalMyDsl.g:1190:2: ( rule__RobotModel__Group_1_2_3__0 )*
            {
             before(grammarAccess.getRobotModelAccess().getGroup_1_2_3()); 
            // InternalMyDsl.g:1191:2: ( rule__RobotModel__Group_1_2_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==12) ) {
                    int LA14_2 = input.LA(2);

                    if ( ((LA14_2>=36 && LA14_2<=37)||LA14_2==39||LA14_2==42) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1191:3: rule__RobotModel__Group_1_2_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RobotModel__Group_1_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getRobotModelAccess().getGroup_1_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_2__3__Impl"


    // $ANTLR start "rule__RobotModel__Group_1_2_3__0"
    // InternalMyDsl.g:1200:1: rule__RobotModel__Group_1_2_3__0 : rule__RobotModel__Group_1_2_3__0__Impl rule__RobotModel__Group_1_2_3__1 ;
    public final void rule__RobotModel__Group_1_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1204:1: ( rule__RobotModel__Group_1_2_3__0__Impl rule__RobotModel__Group_1_2_3__1 )
            // InternalMyDsl.g:1205:2: rule__RobotModel__Group_1_2_3__0__Impl rule__RobotModel__Group_1_2_3__1
            {
            pushFollow(FOLLOW_8);
            rule__RobotModel__Group_1_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotModel__Group_1_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_2_3__0"


    // $ANTLR start "rule__RobotModel__Group_1_2_3__0__Impl"
    // InternalMyDsl.g:1212:1: rule__RobotModel__Group_1_2_3__0__Impl : ( '-' ) ;
    public final void rule__RobotModel__Group_1_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:1: ( ( '-' ) )
            // InternalMyDsl.g:1217:1: ( '-' )
            {
            // InternalMyDsl.g:1217:1: ( '-' )
            // InternalMyDsl.g:1218:2: '-'
            {
             before(grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_2_3_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_2_3__0__Impl"


    // $ANTLR start "rule__RobotModel__Group_1_2_3__1"
    // InternalMyDsl.g:1227:1: rule__RobotModel__Group_1_2_3__1 : rule__RobotModel__Group_1_2_3__1__Impl ;
    public final void rule__RobotModel__Group_1_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1231:1: ( rule__RobotModel__Group_1_2_3__1__Impl )
            // InternalMyDsl.g:1232:2: rule__RobotModel__Group_1_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RobotModel__Group_1_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_2_3__1"


    // $ANTLR start "rule__RobotModel__Group_1_2_3__1__Impl"
    // InternalMyDsl.g:1238:1: rule__RobotModel__Group_1_2_3__1__Impl : ( ( rule__RobotModel__ConditionsAssignment_1_2_3_1 ) ) ;
    public final void rule__RobotModel__Group_1_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1242:1: ( ( ( rule__RobotModel__ConditionsAssignment_1_2_3_1 ) ) )
            // InternalMyDsl.g:1243:1: ( ( rule__RobotModel__ConditionsAssignment_1_2_3_1 ) )
            {
            // InternalMyDsl.g:1243:1: ( ( rule__RobotModel__ConditionsAssignment_1_2_3_1 ) )
            // InternalMyDsl.g:1244:2: ( rule__RobotModel__ConditionsAssignment_1_2_3_1 )
            {
             before(grammarAccess.getRobotModelAccess().getConditionsAssignment_1_2_3_1()); 
            // InternalMyDsl.g:1245:2: ( rule__RobotModel__ConditionsAssignment_1_2_3_1 )
            // InternalMyDsl.g:1245:3: rule__RobotModel__ConditionsAssignment_1_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RobotModel__ConditionsAssignment_1_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotModelAccess().getConditionsAssignment_1_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__Group_1_2_3__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // InternalMyDsl.g:1254:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1258:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalMyDsl.g:1259:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0"


    // $ANTLR start "rule__PlusOrMinus__Group__0__Impl"
    // InternalMyDsl.g:1266:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMultOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1270:1: ( ( ruleMultOrDiv ) )
            // InternalMyDsl.g:1271:1: ( ruleMultOrDiv )
            {
            // InternalMyDsl.g:1271:1: ( ruleMultOrDiv )
            // InternalMyDsl.g:1272:2: ruleMultOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getMultOrDivParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getMultOrDivParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__1"
    // InternalMyDsl.g:1281:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1285:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalMyDsl.g:1286:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1"


    // $ANTLR start "rule__PlusOrMinus__Group__1__Impl"
    // InternalMyDsl.g:1292:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1296:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalMyDsl.g:1297:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalMyDsl.g:1297:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalMyDsl.g:1298:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // InternalMyDsl.g:1299:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==12) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==12||LA15_2==29) ) {
                        alt15=1;
                    }
                    else if ( (LA15_2==RULE_INT) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==11) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1299:3: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0"
    // InternalMyDsl.g:1308:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1312:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalMyDsl.g:1313:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0__Impl"
    // InternalMyDsl.g:1320:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Group_1_0__0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1324:1: ( ( ( rule__PlusOrMinus__Group_1_0__0 ) ) )
            // InternalMyDsl.g:1325:1: ( ( rule__PlusOrMinus__Group_1_0__0 ) )
            {
            // InternalMyDsl.g:1325:1: ( ( rule__PlusOrMinus__Group_1_0__0 ) )
            // InternalMyDsl.g:1326:2: ( rule__PlusOrMinus__Group_1_0__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0()); 
            // InternalMyDsl.g:1327:2: ( rule__PlusOrMinus__Group_1_0__0 )
            // InternalMyDsl.g:1327:3: rule__PlusOrMinus__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1"
    // InternalMyDsl.g:1335:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1339:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalMyDsl.g:1340:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1__Impl"
    // InternalMyDsl.g:1346:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1350:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalMyDsl.g:1351:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1351:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalMyDsl.g:1352:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // InternalMyDsl.g:1353:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalMyDsl.g:1353:3: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0__0"
    // InternalMyDsl.g:1362:1: rule__PlusOrMinus__Group_1_0__0 : rule__PlusOrMinus__Group_1_0__0__Impl rule__PlusOrMinus__Group_1_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1366:1: ( rule__PlusOrMinus__Group_1_0__0__Impl rule__PlusOrMinus__Group_1_0__1 )
            // InternalMyDsl.g:1367:2: rule__PlusOrMinus__Group_1_0__0__Impl rule__PlusOrMinus__Group_1_0__1
            {
            pushFollow(FOLLOW_9);
            rule__PlusOrMinus__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0__0__Impl"
    // InternalMyDsl.g:1374:1: rule__PlusOrMinus__Group_1_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1378:1: ( ( () ) )
            // InternalMyDsl.g:1379:1: ( () )
            {
            // InternalMyDsl.g:1379:1: ( () )
            // InternalMyDsl.g:1380:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getExpressionLeftAction_1_0_0()); 
            // InternalMyDsl.g:1381:2: ()
            // InternalMyDsl.g:1381:3: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getExpressionLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0__1"
    // InternalMyDsl.g:1389:1: rule__PlusOrMinus__Group_1_0__1 : rule__PlusOrMinus__Group_1_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1393:1: ( rule__PlusOrMinus__Group_1_0__1__Impl )
            // InternalMyDsl.g:1394:2: rule__PlusOrMinus__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0__1__Impl"
    // InternalMyDsl.g:1400:1: rule__PlusOrMinus__Group_1_0__1__Impl : ( ( rule__PlusOrMinus__OperationAssignment_1_0_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1404:1: ( ( ( rule__PlusOrMinus__OperationAssignment_1_0_1 ) ) )
            // InternalMyDsl.g:1405:1: ( ( rule__PlusOrMinus__OperationAssignment_1_0_1 ) )
            {
            // InternalMyDsl.g:1405:1: ( ( rule__PlusOrMinus__OperationAssignment_1_0_1 ) )
            // InternalMyDsl.g:1406:2: ( rule__PlusOrMinus__OperationAssignment_1_0_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getOperationAssignment_1_0_1()); 
            // InternalMyDsl.g:1407:2: ( rule__PlusOrMinus__OperationAssignment_1_0_1 )
            // InternalMyDsl.g:1407:3: rule__PlusOrMinus__OperationAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__OperationAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getOperationAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0__1__Impl"


    // $ANTLR start "rule__MultOrDiv__Group__0"
    // InternalMyDsl.g:1416:1: rule__MultOrDiv__Group__0 : rule__MultOrDiv__Group__0__Impl rule__MultOrDiv__Group__1 ;
    public final void rule__MultOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1420:1: ( rule__MultOrDiv__Group__0__Impl rule__MultOrDiv__Group__1 )
            // InternalMyDsl.g:1421:2: rule__MultOrDiv__Group__0__Impl rule__MultOrDiv__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__MultOrDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultOrDiv__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOrDiv__Group__0"


    // $ANTLR start "rule__MultOrDiv__Group__0__Impl"
    // InternalMyDsl.g:1428:1: rule__MultOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MultOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1432:1: ( ( rulePrimary ) )
            // InternalMyDsl.g:1433:1: ( rulePrimary )
            {
            // InternalMyDsl.g:1433:1: ( rulePrimary )
            // InternalMyDsl.g:1434:2: rulePrimary
            {
             before(grammarAccess.getMultOrDivAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultOrDivAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOrDiv__Group__0__Impl"


    // $ANTLR start "rule__MultOrDiv__Group__1"
    // InternalMyDsl.g:1443:1: rule__MultOrDiv__Group__1 : rule__MultOrDiv__Group__1__Impl ;
    public final void rule__MultOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1447:1: ( rule__MultOrDiv__Group__1__Impl )
            // InternalMyDsl.g:1448:2: rule__MultOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultOrDiv__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOrDiv__Group__1"


    // $ANTLR start "rule__MultOrDiv__Group__1__Impl"
    // InternalMyDsl.g:1454:1: rule__MultOrDiv__Group__1__Impl : ( ( rule__MultOrDiv__Group_1__0 )* ) ;
    public final void rule__MultOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1458:1: ( ( ( rule__MultOrDiv__Group_1__0 )* ) )
            // InternalMyDsl.g:1459:1: ( ( rule__MultOrDiv__Group_1__0 )* )
            {
            // InternalMyDsl.g:1459:1: ( ( rule__MultOrDiv__Group_1__0 )* )
            // InternalMyDsl.g:1460:2: ( rule__MultOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMultOrDivAccess().getGroup_1()); 
            // InternalMyDsl.g:1461:2: ( rule__MultOrDiv__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=13 && LA16_0<=14)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1461:3: rule__MultOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__MultOrDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMultOrDivAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOrDiv__Group__1__Impl"


    // $ANTLR start "rule__MultOrDiv__Group_1__0"
    // InternalMyDsl.g:1470:1: rule__MultOrDiv__Group_1__0 : rule__MultOrDiv__Group_1__0__Impl rule__MultOrDiv__Group_1__1 ;
    public final void rule__MultOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1474:1: ( rule__MultOrDiv__Group_1__0__Impl rule__MultOrDiv__Group_1__1 )
            // InternalMyDsl.g:1475:2: rule__MultOrDiv__Group_1__0__Impl rule__MultOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__MultOrDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultOrDiv__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOrDiv__Group_1__0"


    // $ANTLR start "rule__MultOrDiv__Group_1__0__Impl"
    // InternalMyDsl.g:1482:1: rule__MultOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MultOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1486:1: ( ( () ) )
            // InternalMyDsl.g:1487:1: ( () )
            {
            // InternalMyDsl.g:1487:1: ( () )
            // InternalMyDsl.g:1488:2: ()
            {
             before(grammarAccess.getMultOrDivAccess().getExpressionLeftAction_1_0()); 
            // InternalMyDsl.g:1489:2: ()
            // InternalMyDsl.g:1489:3: 
            {
            }

             after(grammarAccess.getMultOrDivAccess().getExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOrDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MultOrDiv__Group_1__1"
    // InternalMyDsl.g:1497:1: rule__MultOrDiv__Group_1__1 : rule__MultOrDiv__Group_1__1__Impl rule__MultOrDiv__Group_1__2 ;
    public final void rule__MultOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1501:1: ( rule__MultOrDiv__Group_1__1__Impl rule__MultOrDiv__Group_1__2 )
            // InternalMyDsl.g:1502:2: rule__MultOrDiv__Group_1__1__Impl rule__MultOrDiv__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__MultOrDiv__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultOrDiv__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOrDiv__Group_1__1"


    // $ANTLR start "rule__MultOrDiv__Group_1__1__Impl"
    // InternalMyDsl.g:1509:1: rule__MultOrDiv__Group_1__1__Impl : ( ( rule__MultOrDiv__OperationAssignment_1_1 ) ) ;
    public final void rule__MultOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1513:1: ( ( ( rule__MultOrDiv__OperationAssignment_1_1 ) ) )
            // InternalMyDsl.g:1514:1: ( ( rule__MultOrDiv__OperationAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1514:1: ( ( rule__MultOrDiv__OperationAssignment_1_1 ) )
            // InternalMyDsl.g:1515:2: ( rule__MultOrDiv__OperationAssignment_1_1 )
            {
             before(grammarAccess.getMultOrDivAccess().getOperationAssignment_1_1()); 
            // InternalMyDsl.g:1516:2: ( rule__MultOrDiv__OperationAssignment_1_1 )
            // InternalMyDsl.g:1516:3: rule__MultOrDiv__OperationAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MultOrDiv__OperationAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultOrDivAccess().getOperationAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOrDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MultOrDiv__Group_1__2"
    // InternalMyDsl.g:1524:1: rule__MultOrDiv__Group_1__2 : rule__MultOrDiv__Group_1__2__Impl ;
    public final void rule__MultOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1528:1: ( rule__MultOrDiv__Group_1__2__Impl )
            // InternalMyDsl.g:1529:2: rule__MultOrDiv__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultOrDiv__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOrDiv__Group_1__2"


    // $ANTLR start "rule__MultOrDiv__Group_1__2__Impl"
    // InternalMyDsl.g:1535:1: rule__MultOrDiv__Group_1__2__Impl : ( ( rule__MultOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MultOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1539:1: ( ( ( rule__MultOrDiv__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:1540:1: ( ( rule__MultOrDiv__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:1540:1: ( ( rule__MultOrDiv__RightAssignment_1_2 ) )
            // InternalMyDsl.g:1541:2: ( rule__MultOrDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultOrDivAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:1542:2: ( rule__MultOrDiv__RightAssignment_1_2 )
            // InternalMyDsl.g:1542:3: rule__MultOrDiv__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MultOrDiv__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultOrDivAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOrDiv__Group_1__2__Impl"


    // $ANTLR start "rule__Primary__Group_0__0"
    // InternalMyDsl.g:1551:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1555:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalMyDsl.g:1556:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__Primary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0"


    // $ANTLR start "rule__Primary__Group_0__0__Impl"
    // InternalMyDsl.g:1563:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1567:1: ( ( '(' ) )
            // InternalMyDsl.g:1568:1: ( '(' )
            {
            // InternalMyDsl.g:1568:1: ( '(' )
            // InternalMyDsl.g:1569:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__0__Impl"


    // $ANTLR start "rule__Primary__Group_0__1"
    // InternalMyDsl.g:1578:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1582:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalMyDsl.g:1583:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_13);
            rule__Primary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1"


    // $ANTLR start "rule__Primary__Group_0__1__Impl"
    // InternalMyDsl.g:1590:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1594:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:1595:1: ( ruleExpression )
            {
            // InternalMyDsl.g:1595:1: ( ruleExpression )
            // InternalMyDsl.g:1596:2: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_0__2"
    // InternalMyDsl.g:1605:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1609:1: ( rule__Primary__Group_0__2__Impl )
            // InternalMyDsl.g:1610:2: rule__Primary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2"


    // $ANTLR start "rule__Primary__Group_0__2__Impl"
    // InternalMyDsl.g:1616:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1620:1: ( ( ')' ) )
            // InternalMyDsl.g:1621:1: ( ')' )
            {
            // InternalMyDsl.g:1621:1: ( ')' )
            // InternalMyDsl.g:1622:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_0__2__Impl"


    // $ANTLR start "rule__Atomic__Group__0"
    // InternalMyDsl.g:1632:1: rule__Atomic__Group__0 : rule__Atomic__Group__0__Impl rule__Atomic__Group__1 ;
    public final void rule__Atomic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1636:1: ( rule__Atomic__Group__0__Impl rule__Atomic__Group__1 )
            // InternalMyDsl.g:1637:2: rule__Atomic__Group__0__Impl rule__Atomic__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Atomic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group__0"


    // $ANTLR start "rule__Atomic__Group__0__Impl"
    // InternalMyDsl.g:1644:1: rule__Atomic__Group__0__Impl : ( () ) ;
    public final void rule__Atomic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1648:1: ( ( () ) )
            // InternalMyDsl.g:1649:1: ( () )
            {
            // InternalMyDsl.g:1649:1: ( () )
            // InternalMyDsl.g:1650:2: ()
            {
             before(grammarAccess.getAtomicAccess().getExpressionAction_0()); 
            // InternalMyDsl.g:1651:2: ()
            // InternalMyDsl.g:1651:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group__0__Impl"


    // $ANTLR start "rule__Atomic__Group__1"
    // InternalMyDsl.g:1659:1: rule__Atomic__Group__1 : rule__Atomic__Group__1__Impl ;
    public final void rule__Atomic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1663:1: ( rule__Atomic__Group__1__Impl )
            // InternalMyDsl.g:1664:2: rule__Atomic__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group__1"


    // $ANTLR start "rule__Atomic__Group__1__Impl"
    // InternalMyDsl.g:1670:1: rule__Atomic__Group__1__Impl : ( ( rule__Atomic__ValueAssignment_1 ) ) ;
    public final void rule__Atomic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1674:1: ( ( ( rule__Atomic__ValueAssignment_1 ) ) )
            // InternalMyDsl.g:1675:1: ( ( rule__Atomic__ValueAssignment_1 ) )
            {
            // InternalMyDsl.g:1675:1: ( ( rule__Atomic__ValueAssignment_1 ) )
            // InternalMyDsl.g:1676:2: ( rule__Atomic__ValueAssignment_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_1()); 
            // InternalMyDsl.g:1677:2: ( rule__Atomic__ValueAssignment_1 )
            // InternalMyDsl.g:1677:3: rule__Atomic__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // InternalMyDsl.g:1686:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1690:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalMyDsl.g:1691:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Event__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // InternalMyDsl.g:1698:1: rule__Event__Group__0__Impl : ( () ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1702:1: ( ( () ) )
            // InternalMyDsl.g:1703:1: ( () )
            {
            // InternalMyDsl.g:1703:1: ( () )
            // InternalMyDsl.g:1704:2: ()
            {
             before(grammarAccess.getEventAccess().getEventAction_0()); 
            // InternalMyDsl.g:1705:2: ()
            // InternalMyDsl.g:1705:3: 
            {
            }

             after(grammarAccess.getEventAccess().getEventAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // InternalMyDsl.g:1713:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1717:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalMyDsl.g:1718:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Event__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // InternalMyDsl.g:1725:1: rule__Event__Group__1__Impl : ( 'Event' ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1729:1: ( ( 'Event' ) )
            // InternalMyDsl.g:1730:1: ( 'Event' )
            {
            // InternalMyDsl.g:1730:1: ( 'Event' )
            // InternalMyDsl.g:1731:2: 'Event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getEventKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // InternalMyDsl.g:1740:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1744:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // InternalMyDsl.g:1745:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Event__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // InternalMyDsl.g:1752:1: rule__Event__Group__2__Impl : ( ( rule__Event__NameAssignment_2 ) ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1756:1: ( ( ( rule__Event__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1757:1: ( ( rule__Event__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1757:1: ( ( rule__Event__NameAssignment_2 ) )
            // InternalMyDsl.g:1758:2: ( rule__Event__NameAssignment_2 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1759:2: ( rule__Event__NameAssignment_2 )
            // InternalMyDsl.g:1759:3: rule__Event__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Event__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__3"
    // InternalMyDsl.g:1767:1: rule__Event__Group__3 : rule__Event__Group__3__Impl rule__Event__Group__4 ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1771:1: ( rule__Event__Group__3__Impl rule__Event__Group__4 )
            // InternalMyDsl.g:1772:2: rule__Event__Group__3__Impl rule__Event__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Event__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3"


    // $ANTLR start "rule__Event__Group__3__Impl"
    // InternalMyDsl.g:1779:1: rule__Event__Group__3__Impl : ( ( rule__Event__Group_3__0 )? ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1783:1: ( ( ( rule__Event__Group_3__0 )? ) )
            // InternalMyDsl.g:1784:1: ( ( rule__Event__Group_3__0 )? )
            {
            // InternalMyDsl.g:1784:1: ( ( rule__Event__Group_3__0 )? )
            // InternalMyDsl.g:1785:2: ( rule__Event__Group_3__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_3()); 
            // InternalMyDsl.g:1786:2: ( rule__Event__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1786:3: rule__Event__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3__Impl"


    // $ANTLR start "rule__Event__Group__4"
    // InternalMyDsl.g:1794:1: rule__Event__Group__4 : rule__Event__Group__4__Impl ;
    public final void rule__Event__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1798:1: ( rule__Event__Group__4__Impl )
            // InternalMyDsl.g:1799:2: rule__Event__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4"


    // $ANTLR start "rule__Event__Group__4__Impl"
    // InternalMyDsl.g:1805:1: rule__Event__Group__4__Impl : ( ( rule__Event__Group_4__0 )? ) ;
    public final void rule__Event__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1809:1: ( ( ( rule__Event__Group_4__0 )? ) )
            // InternalMyDsl.g:1810:1: ( ( rule__Event__Group_4__0 )? )
            {
            // InternalMyDsl.g:1810:1: ( ( rule__Event__Group_4__0 )? )
            // InternalMyDsl.g:1811:2: ( rule__Event__Group_4__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_4()); 
            // InternalMyDsl.g:1812:2: ( rule__Event__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1812:3: rule__Event__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEventAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__4__Impl"


    // $ANTLR start "rule__Event__Group_3__0"
    // InternalMyDsl.g:1821:1: rule__Event__Group_3__0 : rule__Event__Group_3__0__Impl rule__Event__Group_3__1 ;
    public final void rule__Event__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1825:1: ( rule__Event__Group_3__0__Impl rule__Event__Group_3__1 )
            // InternalMyDsl.g:1826:2: rule__Event__Group_3__0__Impl rule__Event__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Event__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_3__0"


    // $ANTLR start "rule__Event__Group_3__0__Impl"
    // InternalMyDsl.g:1833:1: rule__Event__Group_3__0__Impl : ( 'conditions:' ) ;
    public final void rule__Event__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1837:1: ( ( 'conditions:' ) )
            // InternalMyDsl.g:1838:1: ( 'conditions:' )
            {
            // InternalMyDsl.g:1838:1: ( 'conditions:' )
            // InternalMyDsl.g:1839:2: 'conditions:'
            {
             before(grammarAccess.getEventAccess().getConditionsKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getConditionsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_3__0__Impl"


    // $ANTLR start "rule__Event__Group_3__1"
    // InternalMyDsl.g:1848:1: rule__Event__Group_3__1 : rule__Event__Group_3__1__Impl rule__Event__Group_3__2 ;
    public final void rule__Event__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1852:1: ( rule__Event__Group_3__1__Impl rule__Event__Group_3__2 )
            // InternalMyDsl.g:1853:2: rule__Event__Group_3__1__Impl rule__Event__Group_3__2
            {
            pushFollow(FOLLOW_17);
            rule__Event__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_3__1"


    // $ANTLR start "rule__Event__Group_3__1__Impl"
    // InternalMyDsl.g:1860:1: rule__Event__Group_3__1__Impl : ( ( rule__Event__ConditionsAssignment_3_1 ) ) ;
    public final void rule__Event__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1864:1: ( ( ( rule__Event__ConditionsAssignment_3_1 ) ) )
            // InternalMyDsl.g:1865:1: ( ( rule__Event__ConditionsAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1865:1: ( ( rule__Event__ConditionsAssignment_3_1 ) )
            // InternalMyDsl.g:1866:2: ( rule__Event__ConditionsAssignment_3_1 )
            {
             before(grammarAccess.getEventAccess().getConditionsAssignment_3_1()); 
            // InternalMyDsl.g:1867:2: ( rule__Event__ConditionsAssignment_3_1 )
            // InternalMyDsl.g:1867:3: rule__Event__ConditionsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__ConditionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getConditionsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_3__1__Impl"


    // $ANTLR start "rule__Event__Group_3__2"
    // InternalMyDsl.g:1875:1: rule__Event__Group_3__2 : rule__Event__Group_3__2__Impl ;
    public final void rule__Event__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1879:1: ( rule__Event__Group_3__2__Impl )
            // InternalMyDsl.g:1880:2: rule__Event__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_3__2"


    // $ANTLR start "rule__Event__Group_3__2__Impl"
    // InternalMyDsl.g:1886:1: rule__Event__Group_3__2__Impl : ( ( rule__Event__Group_3_2__0 )* ) ;
    public final void rule__Event__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1890:1: ( ( ( rule__Event__Group_3_2__0 )* ) )
            // InternalMyDsl.g:1891:1: ( ( rule__Event__Group_3_2__0 )* )
            {
            // InternalMyDsl.g:1891:1: ( ( rule__Event__Group_3_2__0 )* )
            // InternalMyDsl.g:1892:2: ( rule__Event__Group_3_2__0 )*
            {
             before(grammarAccess.getEventAccess().getGroup_3_2()); 
            // InternalMyDsl.g:1893:2: ( rule__Event__Group_3_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==33) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1893:3: rule__Event__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Event__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_3__2__Impl"


    // $ANTLR start "rule__Event__Group_3_2__0"
    // InternalMyDsl.g:1902:1: rule__Event__Group_3_2__0 : rule__Event__Group_3_2__0__Impl rule__Event__Group_3_2__1 ;
    public final void rule__Event__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1906:1: ( rule__Event__Group_3_2__0__Impl rule__Event__Group_3_2__1 )
            // InternalMyDsl.g:1907:2: rule__Event__Group_3_2__0__Impl rule__Event__Group_3_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Event__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_3_2__0"


    // $ANTLR start "rule__Event__Group_3_2__0__Impl"
    // InternalMyDsl.g:1914:1: rule__Event__Group_3_2__0__Impl : ( 'and' ) ;
    public final void rule__Event__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1918:1: ( ( 'and' ) )
            // InternalMyDsl.g:1919:1: ( 'and' )
            {
            // InternalMyDsl.g:1919:1: ( 'and' )
            // InternalMyDsl.g:1920:2: 'and'
            {
             before(grammarAccess.getEventAccess().getAndKeyword_3_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getAndKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_3_2__0__Impl"


    // $ANTLR start "rule__Event__Group_3_2__1"
    // InternalMyDsl.g:1929:1: rule__Event__Group_3_2__1 : rule__Event__Group_3_2__1__Impl ;
    public final void rule__Event__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1933:1: ( rule__Event__Group_3_2__1__Impl )
            // InternalMyDsl.g:1934:2: rule__Event__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_3_2__1"


    // $ANTLR start "rule__Event__Group_3_2__1__Impl"
    // InternalMyDsl.g:1940:1: rule__Event__Group_3_2__1__Impl : ( ( rule__Event__ConditionsAssignment_3_2_1 ) ) ;
    public final void rule__Event__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1944:1: ( ( ( rule__Event__ConditionsAssignment_3_2_1 ) ) )
            // InternalMyDsl.g:1945:1: ( ( rule__Event__ConditionsAssignment_3_2_1 ) )
            {
            // InternalMyDsl.g:1945:1: ( ( rule__Event__ConditionsAssignment_3_2_1 ) )
            // InternalMyDsl.g:1946:2: ( rule__Event__ConditionsAssignment_3_2_1 )
            {
             before(grammarAccess.getEventAccess().getConditionsAssignment_3_2_1()); 
            // InternalMyDsl.g:1947:2: ( rule__Event__ConditionsAssignment_3_2_1 )
            // InternalMyDsl.g:1947:3: rule__Event__ConditionsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__ConditionsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getConditionsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_3_2__1__Impl"


    // $ANTLR start "rule__Event__Group_4__0"
    // InternalMyDsl.g:1956:1: rule__Event__Group_4__0 : rule__Event__Group_4__0__Impl rule__Event__Group_4__1 ;
    public final void rule__Event__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1960:1: ( rule__Event__Group_4__0__Impl rule__Event__Group_4__1 )
            // InternalMyDsl.g:1961:2: rule__Event__Group_4__0__Impl rule__Event__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Event__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4__0"


    // $ANTLR start "rule__Event__Group_4__0__Impl"
    // InternalMyDsl.g:1968:1: rule__Event__Group_4__0__Impl : ( 'actions:' ) ;
    public final void rule__Event__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1972:1: ( ( 'actions:' ) )
            // InternalMyDsl.g:1973:1: ( 'actions:' )
            {
            // InternalMyDsl.g:1973:1: ( 'actions:' )
            // InternalMyDsl.g:1974:2: 'actions:'
            {
             before(grammarAccess.getEventAccess().getActionsKeyword_4_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getActionsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4__0__Impl"


    // $ANTLR start "rule__Event__Group_4__1"
    // InternalMyDsl.g:1983:1: rule__Event__Group_4__1 : rule__Event__Group_4__1__Impl rule__Event__Group_4__2 ;
    public final void rule__Event__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1987:1: ( rule__Event__Group_4__1__Impl rule__Event__Group_4__2 )
            // InternalMyDsl.g:1988:2: rule__Event__Group_4__1__Impl rule__Event__Group_4__2
            {
            pushFollow(FOLLOW_19);
            rule__Event__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4__1"


    // $ANTLR start "rule__Event__Group_4__1__Impl"
    // InternalMyDsl.g:1995:1: rule__Event__Group_4__1__Impl : ( ( rule__Event__ActionsAssignment_4_1 ) ) ;
    public final void rule__Event__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1999:1: ( ( ( rule__Event__ActionsAssignment_4_1 ) ) )
            // InternalMyDsl.g:2000:1: ( ( rule__Event__ActionsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2000:1: ( ( rule__Event__ActionsAssignment_4_1 ) )
            // InternalMyDsl.g:2001:2: ( rule__Event__ActionsAssignment_4_1 )
            {
             before(grammarAccess.getEventAccess().getActionsAssignment_4_1()); 
            // InternalMyDsl.g:2002:2: ( rule__Event__ActionsAssignment_4_1 )
            // InternalMyDsl.g:2002:3: rule__Event__ActionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__ActionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getActionsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4__1__Impl"


    // $ANTLR start "rule__Event__Group_4__2"
    // InternalMyDsl.g:2010:1: rule__Event__Group_4__2 : rule__Event__Group_4__2__Impl ;
    public final void rule__Event__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2014:1: ( rule__Event__Group_4__2__Impl )
            // InternalMyDsl.g:2015:2: rule__Event__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4__2"


    // $ANTLR start "rule__Event__Group_4__2__Impl"
    // InternalMyDsl.g:2021:1: rule__Event__Group_4__2__Impl : ( ( rule__Event__Group_4_2__0 )* ) ;
    public final void rule__Event__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2025:1: ( ( ( rule__Event__Group_4_2__0 )* ) )
            // InternalMyDsl.g:2026:1: ( ( rule__Event__Group_4_2__0 )* )
            {
            // InternalMyDsl.g:2026:1: ( ( rule__Event__Group_4_2__0 )* )
            // InternalMyDsl.g:2027:2: ( rule__Event__Group_4_2__0 )*
            {
             before(grammarAccess.getEventAccess().getGroup_4_2()); 
            // InternalMyDsl.g:2028:2: ( rule__Event__Group_4_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==35) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2028:3: rule__Event__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Event__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getEventAccess().getGroup_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4__2__Impl"


    // $ANTLR start "rule__Event__Group_4_2__0"
    // InternalMyDsl.g:2037:1: rule__Event__Group_4_2__0 : rule__Event__Group_4_2__0__Impl rule__Event__Group_4_2__1 ;
    public final void rule__Event__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2041:1: ( rule__Event__Group_4_2__0__Impl rule__Event__Group_4_2__1 )
            // InternalMyDsl.g:2042:2: rule__Event__Group_4_2__0__Impl rule__Event__Group_4_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Event__Group_4_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Event__Group_4_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4_2__0"


    // $ANTLR start "rule__Event__Group_4_2__0__Impl"
    // InternalMyDsl.g:2049:1: rule__Event__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2053:1: ( ( ',' ) )
            // InternalMyDsl.g:2054:1: ( ',' )
            {
            // InternalMyDsl.g:2054:1: ( ',' )
            // InternalMyDsl.g:2055:2: ','
            {
             before(grammarAccess.getEventAccess().getCommaKeyword_4_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getCommaKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4_2__0__Impl"


    // $ANTLR start "rule__Event__Group_4_2__1"
    // InternalMyDsl.g:2064:1: rule__Event__Group_4_2__1 : rule__Event__Group_4_2__1__Impl ;
    public final void rule__Event__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2068:1: ( rule__Event__Group_4_2__1__Impl )
            // InternalMyDsl.g:2069:2: rule__Event__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_4_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4_2__1"


    // $ANTLR start "rule__Event__Group_4_2__1__Impl"
    // InternalMyDsl.g:2075:1: rule__Event__Group_4_2__1__Impl : ( ( rule__Event__ActionsAssignment_4_2_1 ) ) ;
    public final void rule__Event__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2079:1: ( ( ( rule__Event__ActionsAssignment_4_2_1 ) ) )
            // InternalMyDsl.g:2080:1: ( ( rule__Event__ActionsAssignment_4_2_1 ) )
            {
            // InternalMyDsl.g:2080:1: ( ( rule__Event__ActionsAssignment_4_2_1 ) )
            // InternalMyDsl.g:2081:2: ( rule__Event__ActionsAssignment_4_2_1 )
            {
             before(grammarAccess.getEventAccess().getActionsAssignment_4_2_1()); 
            // InternalMyDsl.g:2082:2: ( rule__Event__ActionsAssignment_4_2_1 )
            // InternalMyDsl.g:2082:3: rule__Event__ActionsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__ActionsAssignment_4_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getActionsAssignment_4_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_4_2__1__Impl"


    // $ANTLR start "rule__Sound__Group__0"
    // InternalMyDsl.g:2091:1: rule__Sound__Group__0 : rule__Sound__Group__0__Impl rule__Sound__Group__1 ;
    public final void rule__Sound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2095:1: ( rule__Sound__Group__0__Impl rule__Sound__Group__1 )
            // InternalMyDsl.g:2096:2: rule__Sound__Group__0__Impl rule__Sound__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Sound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sound__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group__0"


    // $ANTLR start "rule__Sound__Group__0__Impl"
    // InternalMyDsl.g:2103:1: rule__Sound__Group__0__Impl : ( () ) ;
    public final void rule__Sound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2107:1: ( ( () ) )
            // InternalMyDsl.g:2108:1: ( () )
            {
            // InternalMyDsl.g:2108:1: ( () )
            // InternalMyDsl.g:2109:2: ()
            {
             before(grammarAccess.getSoundAccess().getSoundAction_0()); 
            // InternalMyDsl.g:2110:2: ()
            // InternalMyDsl.g:2110:3: 
            {
            }

             after(grammarAccess.getSoundAccess().getSoundAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group__0__Impl"


    // $ANTLR start "rule__Sound__Group__1"
    // InternalMyDsl.g:2118:1: rule__Sound__Group__1 : rule__Sound__Group__1__Impl rule__Sound__Group__2 ;
    public final void rule__Sound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2122:1: ( rule__Sound__Group__1__Impl rule__Sound__Group__2 )
            // InternalMyDsl.g:2123:2: rule__Sound__Group__1__Impl rule__Sound__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Sound__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sound__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group__1"


    // $ANTLR start "rule__Sound__Group__1__Impl"
    // InternalMyDsl.g:2130:1: rule__Sound__Group__1__Impl : ( 'Sound' ) ;
    public final void rule__Sound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2134:1: ( ( 'Sound' ) )
            // InternalMyDsl.g:2135:1: ( 'Sound' )
            {
            // InternalMyDsl.g:2135:1: ( 'Sound' )
            // InternalMyDsl.g:2136:2: 'Sound'
            {
             before(grammarAccess.getSoundAccess().getSoundKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSoundAccess().getSoundKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group__1__Impl"


    // $ANTLR start "rule__Sound__Group__2"
    // InternalMyDsl.g:2145:1: rule__Sound__Group__2 : rule__Sound__Group__2__Impl ;
    public final void rule__Sound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2149:1: ( rule__Sound__Group__2__Impl )
            // InternalMyDsl.g:2150:2: rule__Sound__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sound__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group__2"


    // $ANTLR start "rule__Sound__Group__2__Impl"
    // InternalMyDsl.g:2156:1: rule__Sound__Group__2__Impl : ( ( rule__Sound__ConditionnameAssignment_2 ) ) ;
    public final void rule__Sound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2160:1: ( ( ( rule__Sound__ConditionnameAssignment_2 ) ) )
            // InternalMyDsl.g:2161:1: ( ( rule__Sound__ConditionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:2161:1: ( ( rule__Sound__ConditionnameAssignment_2 ) )
            // InternalMyDsl.g:2162:2: ( rule__Sound__ConditionnameAssignment_2 )
            {
             before(grammarAccess.getSoundAccess().getConditionnameAssignment_2()); 
            // InternalMyDsl.g:2163:2: ( rule__Sound__ConditionnameAssignment_2 )
            // InternalMyDsl.g:2163:3: rule__Sound__ConditionnameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sound__ConditionnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSoundAccess().getConditionnameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__Group__2__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // InternalMyDsl.g:2172:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2176:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalMyDsl.g:2177:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0"


    // $ANTLR start "rule__Button__Group__0__Impl"
    // InternalMyDsl.g:2184:1: rule__Button__Group__0__Impl : ( () ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2188:1: ( ( () ) )
            // InternalMyDsl.g:2189:1: ( () )
            {
            // InternalMyDsl.g:2189:1: ( () )
            // InternalMyDsl.g:2190:2: ()
            {
             before(grammarAccess.getButtonAccess().getButtonAction_0()); 
            // InternalMyDsl.g:2191:2: ()
            // InternalMyDsl.g:2191:3: 
            {
            }

             after(grammarAccess.getButtonAccess().getButtonAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0__Impl"


    // $ANTLR start "rule__Button__Group__1"
    // InternalMyDsl.g:2199:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2203:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalMyDsl.g:2204:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Button__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1"


    // $ANTLR start "rule__Button__Group__1__Impl"
    // InternalMyDsl.g:2211:1: rule__Button__Group__1__Impl : ( 'Button' ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2215:1: ( ( 'Button' ) )
            // InternalMyDsl.g:2216:1: ( 'Button' )
            {
            // InternalMyDsl.g:2216:1: ( 'Button' )
            // InternalMyDsl.g:2217:2: 'Button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1__Impl"


    // $ANTLR start "rule__Button__Group__2"
    // InternalMyDsl.g:2226:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2230:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalMyDsl.g:2231:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__Button__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__2"


    // $ANTLR start "rule__Button__Group__2__Impl"
    // InternalMyDsl.g:2238:1: rule__Button__Group__2__Impl : ( ( rule__Button__ConditionnameAssignment_2 ) ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2242:1: ( ( ( rule__Button__ConditionnameAssignment_2 ) ) )
            // InternalMyDsl.g:2243:1: ( ( rule__Button__ConditionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:2243:1: ( ( rule__Button__ConditionnameAssignment_2 ) )
            // InternalMyDsl.g:2244:2: ( rule__Button__ConditionnameAssignment_2 )
            {
             before(grammarAccess.getButtonAccess().getConditionnameAssignment_2()); 
            // InternalMyDsl.g:2245:2: ( rule__Button__ConditionnameAssignment_2 )
            // InternalMyDsl.g:2245:3: rule__Button__ConditionnameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Button__ConditionnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getConditionnameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__2__Impl"


    // $ANTLR start "rule__Button__Group__3"
    // InternalMyDsl.g:2253:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2257:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // InternalMyDsl.g:2258:2: rule__Button__Group__3__Impl rule__Button__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Button__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Button__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__3"


    // $ANTLR start "rule__Button__Group__3__Impl"
    // InternalMyDsl.g:2265:1: rule__Button__Group__3__Impl : ( 'button' ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2269:1: ( ( 'button' ) )
            // InternalMyDsl.g:2270:1: ( 'button' )
            {
            // InternalMyDsl.g:2270:1: ( 'button' )
            // InternalMyDsl.g:2271:2: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__3__Impl"


    // $ANTLR start "rule__Button__Group__4"
    // InternalMyDsl.g:2280:1: rule__Button__Group__4 : rule__Button__Group__4__Impl ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2284:1: ( rule__Button__Group__4__Impl )
            // InternalMyDsl.g:2285:2: rule__Button__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Button__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__4"


    // $ANTLR start "rule__Button__Group__4__Impl"
    // InternalMyDsl.g:2291:1: rule__Button__Group__4__Impl : ( ( rule__Button__ButtonAssignment_4 ) ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2295:1: ( ( ( rule__Button__ButtonAssignment_4 ) ) )
            // InternalMyDsl.g:2296:1: ( ( rule__Button__ButtonAssignment_4 ) )
            {
            // InternalMyDsl.g:2296:1: ( ( rule__Button__ButtonAssignment_4 ) )
            // InternalMyDsl.g:2297:2: ( rule__Button__ButtonAssignment_4 )
            {
             before(grammarAccess.getButtonAccess().getButtonAssignment_4()); 
            // InternalMyDsl.g:2298:2: ( rule__Button__ButtonAssignment_4 )
            // InternalMyDsl.g:2298:3: rule__Button__ButtonAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Button__ButtonAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getButtonAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__4__Impl"


    // $ANTLR start "rule__Sensor__Group__0"
    // InternalMyDsl.g:2307:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2311:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalMyDsl.g:2312:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Sensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0"


    // $ANTLR start "rule__Sensor__Group__0__Impl"
    // InternalMyDsl.g:2319:1: rule__Sensor__Group__0__Impl : ( () ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2323:1: ( ( () ) )
            // InternalMyDsl.g:2324:1: ( () )
            {
            // InternalMyDsl.g:2324:1: ( () )
            // InternalMyDsl.g:2325:2: ()
            {
             before(grammarAccess.getSensorAccess().getSensorAction_0()); 
            // InternalMyDsl.g:2326:2: ()
            // InternalMyDsl.g:2326:3: 
            {
            }

             after(grammarAccess.getSensorAccess().getSensorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__0__Impl"


    // $ANTLR start "rule__Sensor__Group__1"
    // InternalMyDsl.g:2334:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2338:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalMyDsl.g:2339:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Sensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1"


    // $ANTLR start "rule__Sensor__Group__1__Impl"
    // InternalMyDsl.g:2346:1: rule__Sensor__Group__1__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2350:1: ( ( 'Sensor' ) )
            // InternalMyDsl.g:2351:1: ( 'Sensor' )
            {
            // InternalMyDsl.g:2351:1: ( 'Sensor' )
            // InternalMyDsl.g:2352:2: 'Sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__1__Impl"


    // $ANTLR start "rule__Sensor__Group__2"
    // InternalMyDsl.g:2361:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2365:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalMyDsl.g:2366:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Sensor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2"


    // $ANTLR start "rule__Sensor__Group__2__Impl"
    // InternalMyDsl.g:2373:1: rule__Sensor__Group__2__Impl : ( ( rule__Sensor__ConditionnameAssignment_2 ) ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2377:1: ( ( ( rule__Sensor__ConditionnameAssignment_2 ) ) )
            // InternalMyDsl.g:2378:1: ( ( rule__Sensor__ConditionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:2378:1: ( ( rule__Sensor__ConditionnameAssignment_2 ) )
            // InternalMyDsl.g:2379:2: ( rule__Sensor__ConditionnameAssignment_2 )
            {
             before(grammarAccess.getSensorAccess().getConditionnameAssignment_2()); 
            // InternalMyDsl.g:2380:2: ( rule__Sensor__ConditionnameAssignment_2 )
            // InternalMyDsl.g:2380:3: rule__Sensor__ConditionnameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__ConditionnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getConditionnameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__2__Impl"


    // $ANTLR start "rule__Sensor__Group__3"
    // InternalMyDsl.g:2388:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl rule__Sensor__Group__4 ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2392:1: ( rule__Sensor__Group__3__Impl rule__Sensor__Group__4 )
            // InternalMyDsl.g:2393:2: rule__Sensor__Group__3__Impl rule__Sensor__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Sensor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3"


    // $ANTLR start "rule__Sensor__Group__3__Impl"
    // InternalMyDsl.g:2400:1: rule__Sensor__Group__3__Impl : ( 'sensorPos' ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2404:1: ( ( 'sensorPos' ) )
            // InternalMyDsl.g:2405:1: ( 'sensorPos' )
            {
            // InternalMyDsl.g:2405:1: ( 'sensorPos' )
            // InternalMyDsl.g:2406:2: 'sensorPos'
            {
             before(grammarAccess.getSensorAccess().getSensorPosKeyword_3()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getSensorPosKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__3__Impl"


    // $ANTLR start "rule__Sensor__Group__4"
    // InternalMyDsl.g:2415:1: rule__Sensor__Group__4 : rule__Sensor__Group__4__Impl rule__Sensor__Group__5 ;
    public final void rule__Sensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2419:1: ( rule__Sensor__Group__4__Impl rule__Sensor__Group__5 )
            // InternalMyDsl.g:2420:2: rule__Sensor__Group__4__Impl rule__Sensor__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Sensor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__4"


    // $ANTLR start "rule__Sensor__Group__4__Impl"
    // InternalMyDsl.g:2427:1: rule__Sensor__Group__4__Impl : ( ( rule__Sensor__PosExAssignment_4 ) ) ;
    public final void rule__Sensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2431:1: ( ( ( rule__Sensor__PosExAssignment_4 ) ) )
            // InternalMyDsl.g:2432:1: ( ( rule__Sensor__PosExAssignment_4 ) )
            {
            // InternalMyDsl.g:2432:1: ( ( rule__Sensor__PosExAssignment_4 ) )
            // InternalMyDsl.g:2433:2: ( rule__Sensor__PosExAssignment_4 )
            {
             before(grammarAccess.getSensorAccess().getPosExAssignment_4()); 
            // InternalMyDsl.g:2434:2: ( rule__Sensor__PosExAssignment_4 )
            // InternalMyDsl.g:2434:3: rule__Sensor__PosExAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__PosExAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getPosExAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__4__Impl"


    // $ANTLR start "rule__Sensor__Group__5"
    // InternalMyDsl.g:2442:1: rule__Sensor__Group__5 : rule__Sensor__Group__5__Impl rule__Sensor__Group__6 ;
    public final void rule__Sensor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2446:1: ( rule__Sensor__Group__5__Impl rule__Sensor__Group__6 )
            // InternalMyDsl.g:2447:2: rule__Sensor__Group__5__Impl rule__Sensor__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__Sensor__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__5"


    // $ANTLR start "rule__Sensor__Group__5__Impl"
    // InternalMyDsl.g:2454:1: rule__Sensor__Group__5__Impl : ( 'detectObstacle' ) ;
    public final void rule__Sensor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2458:1: ( ( 'detectObstacle' ) )
            // InternalMyDsl.g:2459:1: ( 'detectObstacle' )
            {
            // InternalMyDsl.g:2459:1: ( 'detectObstacle' )
            // InternalMyDsl.g:2460:2: 'detectObstacle'
            {
             before(grammarAccess.getSensorAccess().getDetectObstacleKeyword_5()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getDetectObstacleKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__5__Impl"


    // $ANTLR start "rule__Sensor__Group__6"
    // InternalMyDsl.g:2469:1: rule__Sensor__Group__6 : rule__Sensor__Group__6__Impl ;
    public final void rule__Sensor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2473:1: ( rule__Sensor__Group__6__Impl )
            // InternalMyDsl.g:2474:2: rule__Sensor__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__6"


    // $ANTLR start "rule__Sensor__Group__6__Impl"
    // InternalMyDsl.g:2480:1: rule__Sensor__Group__6__Impl : ( ( rule__Sensor__DistanceAssignment_6 ) ) ;
    public final void rule__Sensor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2484:1: ( ( ( rule__Sensor__DistanceAssignment_6 ) ) )
            // InternalMyDsl.g:2485:1: ( ( rule__Sensor__DistanceAssignment_6 ) )
            {
            // InternalMyDsl.g:2485:1: ( ( rule__Sensor__DistanceAssignment_6 ) )
            // InternalMyDsl.g:2486:2: ( rule__Sensor__DistanceAssignment_6 )
            {
             before(grammarAccess.getSensorAccess().getDistanceAssignment_6()); 
            // InternalMyDsl.g:2487:2: ( rule__Sensor__DistanceAssignment_6 )
            // InternalMyDsl.g:2487:3: rule__Sensor__DistanceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__DistanceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getDistanceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Group__6__Impl"


    // $ANTLR start "rule__Tap__Group__0"
    // InternalMyDsl.g:2496:1: rule__Tap__Group__0 : rule__Tap__Group__0__Impl rule__Tap__Group__1 ;
    public final void rule__Tap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2500:1: ( rule__Tap__Group__0__Impl rule__Tap__Group__1 )
            // InternalMyDsl.g:2501:2: rule__Tap__Group__0__Impl rule__Tap__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Tap__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tap__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tap__Group__0"


    // $ANTLR start "rule__Tap__Group__0__Impl"
    // InternalMyDsl.g:2508:1: rule__Tap__Group__0__Impl : ( () ) ;
    public final void rule__Tap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2512:1: ( ( () ) )
            // InternalMyDsl.g:2513:1: ( () )
            {
            // InternalMyDsl.g:2513:1: ( () )
            // InternalMyDsl.g:2514:2: ()
            {
             before(grammarAccess.getTapAccess().getTapAction_0()); 
            // InternalMyDsl.g:2515:2: ()
            // InternalMyDsl.g:2515:3: 
            {
            }

             after(grammarAccess.getTapAccess().getTapAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tap__Group__0__Impl"


    // $ANTLR start "rule__Tap__Group__1"
    // InternalMyDsl.g:2523:1: rule__Tap__Group__1 : rule__Tap__Group__1__Impl rule__Tap__Group__2 ;
    public final void rule__Tap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2527:1: ( rule__Tap__Group__1__Impl rule__Tap__Group__2 )
            // InternalMyDsl.g:2528:2: rule__Tap__Group__1__Impl rule__Tap__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Tap__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Tap__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tap__Group__1"


    // $ANTLR start "rule__Tap__Group__1__Impl"
    // InternalMyDsl.g:2535:1: rule__Tap__Group__1__Impl : ( 'Tap' ) ;
    public final void rule__Tap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2539:1: ( ( 'Tap' ) )
            // InternalMyDsl.g:2540:1: ( 'Tap' )
            {
            // InternalMyDsl.g:2540:1: ( 'Tap' )
            // InternalMyDsl.g:2541:2: 'Tap'
            {
             before(grammarAccess.getTapAccess().getTapKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getTapAccess().getTapKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tap__Group__1__Impl"


    // $ANTLR start "rule__Tap__Group__2"
    // InternalMyDsl.g:2550:1: rule__Tap__Group__2 : rule__Tap__Group__2__Impl ;
    public final void rule__Tap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2554:1: ( rule__Tap__Group__2__Impl )
            // InternalMyDsl.g:2555:2: rule__Tap__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Tap__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tap__Group__2"


    // $ANTLR start "rule__Tap__Group__2__Impl"
    // InternalMyDsl.g:2561:1: rule__Tap__Group__2__Impl : ( ( rule__Tap__ConditionnameAssignment_2 ) ) ;
    public final void rule__Tap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2565:1: ( ( ( rule__Tap__ConditionnameAssignment_2 ) ) )
            // InternalMyDsl.g:2566:1: ( ( rule__Tap__ConditionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:2566:1: ( ( rule__Tap__ConditionnameAssignment_2 ) )
            // InternalMyDsl.g:2567:2: ( rule__Tap__ConditionnameAssignment_2 )
            {
             before(grammarAccess.getTapAccess().getConditionnameAssignment_2()); 
            // InternalMyDsl.g:2568:2: ( rule__Tap__ConditionnameAssignment_2 )
            // InternalMyDsl.g:2568:3: rule__Tap__ConditionnameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Tap__ConditionnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTapAccess().getConditionnameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tap__Group__2__Impl"


    // $ANTLR start "rule__MotorAction__Group__0"
    // InternalMyDsl.g:2577:1: rule__MotorAction__Group__0 : rule__MotorAction__Group__0__Impl rule__MotorAction__Group__1 ;
    public final void rule__MotorAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2581:1: ( rule__MotorAction__Group__0__Impl rule__MotorAction__Group__1 )
            // InternalMyDsl.g:2582:2: rule__MotorAction__Group__0__Impl rule__MotorAction__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__MotorAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MotorAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MotorAction__Group__0"


    // $ANTLR start "rule__MotorAction__Group__0__Impl"
    // InternalMyDsl.g:2589:1: rule__MotorAction__Group__0__Impl : ( () ) ;
    public final void rule__MotorAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2593:1: ( ( () ) )
            // InternalMyDsl.g:2594:1: ( () )
            {
            // InternalMyDsl.g:2594:1: ( () )
            // InternalMyDsl.g:2595:2: ()
            {
             before(grammarAccess.getMotorActionAccess().getMotorActionAction_0()); 
            // InternalMyDsl.g:2596:2: ()
            // InternalMyDsl.g:2596:3: 
            {
            }

             after(grammarAccess.getMotorActionAccess().getMotorActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MotorAction__Group__0__Impl"


    // $ANTLR start "rule__MotorAction__Group__1"
    // InternalMyDsl.g:2604:1: rule__MotorAction__Group__1 : rule__MotorAction__Group__1__Impl rule__MotorAction__Group__2 ;
    public final void rule__MotorAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2608:1: ( rule__MotorAction__Group__1__Impl rule__MotorAction__Group__2 )
            // InternalMyDsl.g:2609:2: rule__MotorAction__Group__1__Impl rule__MotorAction__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__MotorAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MotorAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MotorAction__Group__1"


    // $ANTLR start "rule__MotorAction__Group__1__Impl"
    // InternalMyDsl.g:2616:1: rule__MotorAction__Group__1__Impl : ( 'MotorAction' ) ;
    public final void rule__MotorAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2620:1: ( ( 'MotorAction' ) )
            // InternalMyDsl.g:2621:1: ( 'MotorAction' )
            {
            // InternalMyDsl.g:2621:1: ( 'MotorAction' )
            // InternalMyDsl.g:2622:2: 'MotorAction'
            {
             before(grammarAccess.getMotorActionAccess().getMotorActionKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMotorActionAccess().getMotorActionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MotorAction__Group__1__Impl"


    // $ANTLR start "rule__MotorAction__Group__2"
    // InternalMyDsl.g:2631:1: rule__MotorAction__Group__2 : rule__MotorAction__Group__2__Impl rule__MotorAction__Group__3 ;
    public final void rule__MotorAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2635:1: ( rule__MotorAction__Group__2__Impl rule__MotorAction__Group__3 )
            // InternalMyDsl.g:2636:2: rule__MotorAction__Group__2__Impl rule__MotorAction__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__MotorAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MotorAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MotorAction__Group__2"


    // $ANTLR start "rule__MotorAction__Group__2__Impl"
    // InternalMyDsl.g:2643:1: rule__MotorAction__Group__2__Impl : ( ( rule__MotorAction__ActionnameAssignment_2 ) ) ;
    public final void rule__MotorAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2647:1: ( ( ( rule__MotorAction__ActionnameAssignment_2 ) ) )
            // InternalMyDsl.g:2648:1: ( ( rule__MotorAction__ActionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:2648:1: ( ( rule__MotorAction__ActionnameAssignment_2 ) )
            // InternalMyDsl.g:2649:2: ( rule__MotorAction__ActionnameAssignment_2 )
            {
             before(grammarAccess.getMotorActionAccess().getActionnameAssignment_2()); 
            // InternalMyDsl.g:2650:2: ( rule__MotorAction__ActionnameAssignment_2 )
            // InternalMyDsl.g:2650:3: rule__MotorAction__ActionnameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MotorAction__ActionnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMotorActionAccess().getActionnameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MotorAction__Group__2__Impl"


    // $ANTLR start "rule__MotorAction__Group__3"
    // InternalMyDsl.g:2658:1: rule__MotorAction__Group__3 : rule__MotorAction__Group__3__Impl rule__MotorAction__Group__4 ;
    public final void rule__MotorAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2662:1: ( rule__MotorAction__Group__3__Impl rule__MotorAction__Group__4 )
            // InternalMyDsl.g:2663:2: rule__MotorAction__Group__3__Impl rule__MotorAction__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__MotorAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MotorAction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MotorAction__Group__3"


    // $ANTLR start "rule__MotorAction__Group__3__Impl"
    // InternalMyDsl.g:2670:1: rule__MotorAction__Group__3__Impl : ( ( rule__MotorAction__Group_3__0 )? ) ;
    public final void rule__MotorAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2674:1: ( ( ( rule__MotorAction__Group_3__0 )? ) )
            // InternalMyDsl.g:2675:1: ( ( rule__MotorAction__Group_3__0 )? )
            {
            // InternalMyDsl.g:2675:1: ( ( rule__MotorAction__Group_3__0 )? )
            // InternalMyDsl.g:2676:2: ( rule__MotorAction__Group_3__0 )?
            {
             before(grammarAccess.getMotorActionAccess().getGroup_3()); 
            // InternalMyDsl.g:2677:2: ( rule__MotorAction__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==44) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:2677:3: rule__MotorAction__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MotorAction__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMotorActionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MotorAction__Group__3__Impl"


    // $ANTLR start "rule__MotorAction__Group__4"
    // InternalMyDsl.g:2685:1: rule__MotorAction__Group__4 : rule__MotorAction__Group__4__Impl ;
    public final void rule__MotorAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2689:1: ( rule__MotorAction__Group__4__Impl )
            // InternalMyDsl.g:2690:2: rule__MotorAction__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MotorAction__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MotorAction__Group__4"


    // $ANTLR start "rule__MotorAction__Group__4__Impl"
    // InternalMyDsl.g:2696:1: rule__MotorAction__Group__4__Impl : ( ( rule__MotorAction__Group_4__0 )? ) ;
    public final void rule__MotorAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2700:1: ( ( ( rule__MotorAction__Group_4__0 )? ) )
            // InternalMyDsl.g:2701:1: ( ( rule__MotorAction__Group_4__0 )? )
            {
            // InternalMyDsl.g:2701:1: ( ( rule__MotorAction__Group_4__0 )? )
            // InternalMyDsl.g:2702:2: ( rule__MotorAction__Group_4__0 )?
            {
             before(grammarAccess.getMotorActionAccess().getGroup_4()); 
            // InternalMyDsl.g:2703:2: ( rule__MotorAction__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:2703:3: rule__MotorAction__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MotorAction__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMotorActionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MotorAction__Group__4__Impl"


    // $ANTLR start "rule__MotorAction__Group_3__0"
    // InternalMyDsl.g:2712:1: rule__MotorAction__Group_3__0 : rule__MotorAction__Group_3__0__Impl rule__MotorAction__Group_3__1 ;
    public final void rule__MotorAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2716:1: ( rule__MotorAction__Group_3__0__Impl rule__MotorAction__Group_3__1 )
            // InternalMyDsl.g:2717:2: rule__MotorAction__Group_3__0__Impl rule__MotorAction__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__MotorAction__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MotorAction__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MotorAction__Group_3__0"


    // $ANTLR start "rule__MotorAction__Group_3__0__Impl"
    // InternalMyDsl.g:2724:1: rule__MotorAction__Group_3__0__Impl : ( 'motorLeft' ) ;
    public final void rule__MotorAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2728:1: ( ( 'motorLeft' ) )
            // InternalMyDsl.g:2729:1: ( 'motorLeft' )
            {
            // InternalMyDsl.g:2729:1: ( 'motorLeft' )
            // InternalMyDsl.g:2730:2: 'motorLeft'
            {
             before(grammarAccess.getMotorActionAccess().getMotorLeftKeyword_3_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMotorActionAccess().getMotorLeftKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MotorAction__Group_3__0__Impl"


    // $ANTLR start "rule__MotorAction__Group_3__1"
    // InternalMyDsl.g:2739:1: rule__MotorAction__Group_3__1 : rule__MotorAction__Group_3__1__Impl ;
    public final void rule__MotorAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2743:1: ( rule__MotorAction__Group_3__1__Impl )
            // InternalMyDsl.g:2744:2: rule__MotorAction__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MotorAction__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MotorAction__Group_3__1"


    // $ANTLR start "rule__MotorAction__Group_3__1__Impl"
    // InternalMyDsl.g:2750:1: rule__MotorAction__Group_3__1__Impl : ( ( rule__MotorAction__LeftAssignment_3_1 ) ) ;
    public final void rule__MotorAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2754:1: ( ( ( rule__MotorAction__LeftAssignment_3_1 ) ) )
            // InternalMyDsl.g:2755:1: ( ( rule__MotorAction__LeftAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2755:1: ( ( rule__MotorAction__LeftAssignment_3_1 ) )
            // InternalMyDsl.g:2756:2: ( rule__MotorAction__LeftAssignment_3_1 )
            {
             before(grammarAccess.getMotorActionAccess().getLeftAssignment_3_1()); 
            // InternalMyDsl.g:2757:2: ( rule__MotorAction__LeftAssignment_3_1 )
            // InternalMyDsl.g:2757:3: rule__MotorAction__LeftAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MotorAction__LeftAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMotorActionAccess().getLeftAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MotorAction__Group_3__1__Impl"


    // $ANTLR start "rule__MotorAction__Group_4__0"
    // InternalMyDsl.g:2766:1: rule__MotorAction__Group_4__0 : rule__MotorAction__Group_4__0__Impl rule__MotorAction__Group_4__1 ;
    public final void rule__MotorAction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2770:1: ( rule__MotorAction__Group_4__0__Impl rule__MotorAction__Group_4__1 )
            // InternalMyDsl.g:2771:2: rule__MotorAction__Group_4__0__Impl rule__MotorAction__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__MotorAction__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MotorAction__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MotorAction__Group_4__0"


    // $ANTLR start "rule__MotorAction__Group_4__0__Impl"
    // InternalMyDsl.g:2778:1: rule__MotorAction__Group_4__0__Impl : ( 'motorRight' ) ;
    public final void rule__MotorAction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2782:1: ( ( 'motorRight' ) )
            // InternalMyDsl.g:2783:1: ( 'motorRight' )
            {
            // InternalMyDsl.g:2783:1: ( 'motorRight' )
            // InternalMyDsl.g:2784:2: 'motorRight'
            {
             before(grammarAccess.getMotorActionAccess().getMotorRightKeyword_4_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMotorActionAccess().getMotorRightKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MotorAction__Group_4__0__Impl"


    // $ANTLR start "rule__MotorAction__Group_4__1"
    // InternalMyDsl.g:2793:1: rule__MotorAction__Group_4__1 : rule__MotorAction__Group_4__1__Impl ;
    public final void rule__MotorAction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2797:1: ( rule__MotorAction__Group_4__1__Impl )
            // InternalMyDsl.g:2798:2: rule__MotorAction__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MotorAction__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MotorAction__Group_4__1"


    // $ANTLR start "rule__MotorAction__Group_4__1__Impl"
    // InternalMyDsl.g:2804:1: rule__MotorAction__Group_4__1__Impl : ( ( rule__MotorAction__RightAssignment_4_1 ) ) ;
    public final void rule__MotorAction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2808:1: ( ( ( rule__MotorAction__RightAssignment_4_1 ) ) )
            // InternalMyDsl.g:2809:1: ( ( rule__MotorAction__RightAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2809:1: ( ( rule__MotorAction__RightAssignment_4_1 ) )
            // InternalMyDsl.g:2810:2: ( rule__MotorAction__RightAssignment_4_1 )
            {
             before(grammarAccess.getMotorActionAccess().getRightAssignment_4_1()); 
            // InternalMyDsl.g:2811:2: ( rule__MotorAction__RightAssignment_4_1 )
            // InternalMyDsl.g:2811:3: rule__MotorAction__RightAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MotorAction__RightAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMotorActionAccess().getRightAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MotorAction__Group_4__1__Impl"


    // $ANTLR start "rule__SoundAction__Group__0"
    // InternalMyDsl.g:2820:1: rule__SoundAction__Group__0 : rule__SoundAction__Group__0__Impl rule__SoundAction__Group__1 ;
    public final void rule__SoundAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2824:1: ( rule__SoundAction__Group__0__Impl rule__SoundAction__Group__1 )
            // InternalMyDsl.g:2825:2: rule__SoundAction__Group__0__Impl rule__SoundAction__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__SoundAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoundAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoundAction__Group__0"


    // $ANTLR start "rule__SoundAction__Group__0__Impl"
    // InternalMyDsl.g:2832:1: rule__SoundAction__Group__0__Impl : ( () ) ;
    public final void rule__SoundAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2836:1: ( ( () ) )
            // InternalMyDsl.g:2837:1: ( () )
            {
            // InternalMyDsl.g:2837:1: ( () )
            // InternalMyDsl.g:2838:2: ()
            {
             before(grammarAccess.getSoundActionAccess().getSoundActionAction_0()); 
            // InternalMyDsl.g:2839:2: ()
            // InternalMyDsl.g:2839:3: 
            {
            }

             after(grammarAccess.getSoundActionAccess().getSoundActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoundAction__Group__0__Impl"


    // $ANTLR start "rule__SoundAction__Group__1"
    // InternalMyDsl.g:2847:1: rule__SoundAction__Group__1 : rule__SoundAction__Group__1__Impl rule__SoundAction__Group__2 ;
    public final void rule__SoundAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2851:1: ( rule__SoundAction__Group__1__Impl rule__SoundAction__Group__2 )
            // InternalMyDsl.g:2852:2: rule__SoundAction__Group__1__Impl rule__SoundAction__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__SoundAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoundAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoundAction__Group__1"


    // $ANTLR start "rule__SoundAction__Group__1__Impl"
    // InternalMyDsl.g:2859:1: rule__SoundAction__Group__1__Impl : ( 'SoundAction' ) ;
    public final void rule__SoundAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2863:1: ( ( 'SoundAction' ) )
            // InternalMyDsl.g:2864:1: ( 'SoundAction' )
            {
            // InternalMyDsl.g:2864:1: ( 'SoundAction' )
            // InternalMyDsl.g:2865:2: 'SoundAction'
            {
             before(grammarAccess.getSoundActionAccess().getSoundActionKeyword_1()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSoundActionAccess().getSoundActionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoundAction__Group__1__Impl"


    // $ANTLR start "rule__SoundAction__Group__2"
    // InternalMyDsl.g:2874:1: rule__SoundAction__Group__2 : rule__SoundAction__Group__2__Impl rule__SoundAction__Group__3 ;
    public final void rule__SoundAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2878:1: ( rule__SoundAction__Group__2__Impl rule__SoundAction__Group__3 )
            // InternalMyDsl.g:2879:2: rule__SoundAction__Group__2__Impl rule__SoundAction__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__SoundAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoundAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoundAction__Group__2"


    // $ANTLR start "rule__SoundAction__Group__2__Impl"
    // InternalMyDsl.g:2886:1: rule__SoundAction__Group__2__Impl : ( ( rule__SoundAction__ActionnameAssignment_2 ) ) ;
    public final void rule__SoundAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2890:1: ( ( ( rule__SoundAction__ActionnameAssignment_2 ) ) )
            // InternalMyDsl.g:2891:1: ( ( rule__SoundAction__ActionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:2891:1: ( ( rule__SoundAction__ActionnameAssignment_2 ) )
            // InternalMyDsl.g:2892:2: ( rule__SoundAction__ActionnameAssignment_2 )
            {
             before(grammarAccess.getSoundActionAccess().getActionnameAssignment_2()); 
            // InternalMyDsl.g:2893:2: ( rule__SoundAction__ActionnameAssignment_2 )
            // InternalMyDsl.g:2893:3: rule__SoundAction__ActionnameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SoundAction__ActionnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSoundActionAccess().getActionnameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoundAction__Group__2__Impl"


    // $ANTLR start "rule__SoundAction__Group__3"
    // InternalMyDsl.g:2901:1: rule__SoundAction__Group__3 : rule__SoundAction__Group__3__Impl ;
    public final void rule__SoundAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2905:1: ( rule__SoundAction__Group__3__Impl )
            // InternalMyDsl.g:2906:2: rule__SoundAction__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SoundAction__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoundAction__Group__3"


    // $ANTLR start "rule__SoundAction__Group__3__Impl"
    // InternalMyDsl.g:2912:1: rule__SoundAction__Group__3__Impl : ( ( rule__SoundAction__Group_3__0 )? ) ;
    public final void rule__SoundAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2916:1: ( ( ( rule__SoundAction__Group_3__0 )? ) )
            // InternalMyDsl.g:2917:1: ( ( rule__SoundAction__Group_3__0 )? )
            {
            // InternalMyDsl.g:2917:1: ( ( rule__SoundAction__Group_3__0 )? )
            // InternalMyDsl.g:2918:2: ( rule__SoundAction__Group_3__0 )?
            {
             before(grammarAccess.getSoundActionAccess().getGroup_3()); 
            // InternalMyDsl.g:2919:2: ( rule__SoundAction__Group_3__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMyDsl.g:2919:3: rule__SoundAction__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SoundAction__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSoundActionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoundAction__Group__3__Impl"


    // $ANTLR start "rule__SoundAction__Group_3__0"
    // InternalMyDsl.g:2928:1: rule__SoundAction__Group_3__0 : rule__SoundAction__Group_3__0__Impl rule__SoundAction__Group_3__1 ;
    public final void rule__SoundAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2932:1: ( rule__SoundAction__Group_3__0__Impl rule__SoundAction__Group_3__1 )
            // InternalMyDsl.g:2933:2: rule__SoundAction__Group_3__0__Impl rule__SoundAction__Group_3__1
            {
            pushFollow(FOLLOW_33);
            rule__SoundAction__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoundAction__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoundAction__Group_3__0"


    // $ANTLR start "rule__SoundAction__Group_3__0__Impl"
    // InternalMyDsl.g:2940:1: rule__SoundAction__Group_3__0__Impl : ( 'set:' ) ;
    public final void rule__SoundAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2944:1: ( ( 'set:' ) )
            // InternalMyDsl.g:2945:1: ( 'set:' )
            {
            // InternalMyDsl.g:2945:1: ( 'set:' )
            // InternalMyDsl.g:2946:2: 'set:'
            {
             before(grammarAccess.getSoundActionAccess().getSetKeyword_3_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSoundActionAccess().getSetKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoundAction__Group_3__0__Impl"


    // $ANTLR start "rule__SoundAction__Group_3__1"
    // InternalMyDsl.g:2955:1: rule__SoundAction__Group_3__1 : rule__SoundAction__Group_3__1__Impl rule__SoundAction__Group_3__2 ;
    public final void rule__SoundAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2959:1: ( rule__SoundAction__Group_3__1__Impl rule__SoundAction__Group_3__2 )
            // InternalMyDsl.g:2960:2: rule__SoundAction__Group_3__1__Impl rule__SoundAction__Group_3__2
            {
            pushFollow(FOLLOW_19);
            rule__SoundAction__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoundAction__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoundAction__Group_3__1"


    // $ANTLR start "rule__SoundAction__Group_3__1__Impl"
    // InternalMyDsl.g:2967:1: rule__SoundAction__Group_3__1__Impl : ( ( rule__SoundAction__MusicsettingsAssignment_3_1 ) ) ;
    public final void rule__SoundAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2971:1: ( ( ( rule__SoundAction__MusicsettingsAssignment_3_1 ) ) )
            // InternalMyDsl.g:2972:1: ( ( rule__SoundAction__MusicsettingsAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2972:1: ( ( rule__SoundAction__MusicsettingsAssignment_3_1 ) )
            // InternalMyDsl.g:2973:2: ( rule__SoundAction__MusicsettingsAssignment_3_1 )
            {
             before(grammarAccess.getSoundActionAccess().getMusicsettingsAssignment_3_1()); 
            // InternalMyDsl.g:2974:2: ( rule__SoundAction__MusicsettingsAssignment_3_1 )
            // InternalMyDsl.g:2974:3: rule__SoundAction__MusicsettingsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SoundAction__MusicsettingsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSoundActionAccess().getMusicsettingsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoundAction__Group_3__1__Impl"


    // $ANTLR start "rule__SoundAction__Group_3__2"
    // InternalMyDsl.g:2982:1: rule__SoundAction__Group_3__2 : rule__SoundAction__Group_3__2__Impl ;
    public final void rule__SoundAction__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2986:1: ( rule__SoundAction__Group_3__2__Impl )
            // InternalMyDsl.g:2987:2: rule__SoundAction__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SoundAction__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoundAction__Group_3__2"


    // $ANTLR start "rule__SoundAction__Group_3__2__Impl"
    // InternalMyDsl.g:2993:1: rule__SoundAction__Group_3__2__Impl : ( ( rule__SoundAction__Group_3_2__0 )* ) ;
    public final void rule__SoundAction__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2997:1: ( ( ( rule__SoundAction__Group_3_2__0 )* ) )
            // InternalMyDsl.g:2998:1: ( ( rule__SoundAction__Group_3_2__0 )* )
            {
            // InternalMyDsl.g:2998:1: ( ( rule__SoundAction__Group_3_2__0 )* )
            // InternalMyDsl.g:2999:2: ( rule__SoundAction__Group_3_2__0 )*
            {
             before(grammarAccess.getSoundActionAccess().getGroup_3_2()); 
            // InternalMyDsl.g:3000:2: ( rule__SoundAction__Group_3_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==35) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:3000:3: rule__SoundAction__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__SoundAction__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getSoundActionAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoundAction__Group_3__2__Impl"


    // $ANTLR start "rule__SoundAction__Group_3_2__0"
    // InternalMyDsl.g:3009:1: rule__SoundAction__Group_3_2__0 : rule__SoundAction__Group_3_2__0__Impl rule__SoundAction__Group_3_2__1 ;
    public final void rule__SoundAction__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3013:1: ( rule__SoundAction__Group_3_2__0__Impl rule__SoundAction__Group_3_2__1 )
            // InternalMyDsl.g:3014:2: rule__SoundAction__Group_3_2__0__Impl rule__SoundAction__Group_3_2__1
            {
            pushFollow(FOLLOW_33);
            rule__SoundAction__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SoundAction__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoundAction__Group_3_2__0"


    // $ANTLR start "rule__SoundAction__Group_3_2__0__Impl"
    // InternalMyDsl.g:3021:1: rule__SoundAction__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__SoundAction__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3025:1: ( ( ',' ) )
            // InternalMyDsl.g:3026:1: ( ',' )
            {
            // InternalMyDsl.g:3026:1: ( ',' )
            // InternalMyDsl.g:3027:2: ','
            {
             before(grammarAccess.getSoundActionAccess().getCommaKeyword_3_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSoundActionAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoundAction__Group_3_2__0__Impl"


    // $ANTLR start "rule__SoundAction__Group_3_2__1"
    // InternalMyDsl.g:3036:1: rule__SoundAction__Group_3_2__1 : rule__SoundAction__Group_3_2__1__Impl ;
    public final void rule__SoundAction__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3040:1: ( rule__SoundAction__Group_3_2__1__Impl )
            // InternalMyDsl.g:3041:2: rule__SoundAction__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SoundAction__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoundAction__Group_3_2__1"


    // $ANTLR start "rule__SoundAction__Group_3_2__1__Impl"
    // InternalMyDsl.g:3047:1: rule__SoundAction__Group_3_2__1__Impl : ( ( rule__SoundAction__MusicsettingsAssignment_3_2_1 ) ) ;
    public final void rule__SoundAction__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3051:1: ( ( ( rule__SoundAction__MusicsettingsAssignment_3_2_1 ) ) )
            // InternalMyDsl.g:3052:1: ( ( rule__SoundAction__MusicsettingsAssignment_3_2_1 ) )
            {
            // InternalMyDsl.g:3052:1: ( ( rule__SoundAction__MusicsettingsAssignment_3_2_1 ) )
            // InternalMyDsl.g:3053:2: ( rule__SoundAction__MusicsettingsAssignment_3_2_1 )
            {
             before(grammarAccess.getSoundActionAccess().getMusicsettingsAssignment_3_2_1()); 
            // InternalMyDsl.g:3054:2: ( rule__SoundAction__MusicsettingsAssignment_3_2_1 )
            // InternalMyDsl.g:3054:3: rule__SoundAction__MusicsettingsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SoundAction__MusicsettingsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSoundActionAccess().getMusicsettingsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoundAction__Group_3_2__1__Impl"


    // $ANTLR start "rule__LightAction__Group__0"
    // InternalMyDsl.g:3063:1: rule__LightAction__Group__0 : rule__LightAction__Group__0__Impl rule__LightAction__Group__1 ;
    public final void rule__LightAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3067:1: ( rule__LightAction__Group__0__Impl rule__LightAction__Group__1 )
            // InternalMyDsl.g:3068:2: rule__LightAction__Group__0__Impl rule__LightAction__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__LightAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group__0"


    // $ANTLR start "rule__LightAction__Group__0__Impl"
    // InternalMyDsl.g:3075:1: rule__LightAction__Group__0__Impl : ( () ) ;
    public final void rule__LightAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3079:1: ( ( () ) )
            // InternalMyDsl.g:3080:1: ( () )
            {
            // InternalMyDsl.g:3080:1: ( () )
            // InternalMyDsl.g:3081:2: ()
            {
             before(grammarAccess.getLightActionAccess().getLightActionAction_0()); 
            // InternalMyDsl.g:3082:2: ()
            // InternalMyDsl.g:3082:3: 
            {
            }

             after(grammarAccess.getLightActionAccess().getLightActionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group__0__Impl"


    // $ANTLR start "rule__LightAction__Group__1"
    // InternalMyDsl.g:3090:1: rule__LightAction__Group__1 : rule__LightAction__Group__1__Impl rule__LightAction__Group__2 ;
    public final void rule__LightAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3094:1: ( rule__LightAction__Group__1__Impl rule__LightAction__Group__2 )
            // InternalMyDsl.g:3095:2: rule__LightAction__Group__1__Impl rule__LightAction__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__LightAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group__1"


    // $ANTLR start "rule__LightAction__Group__1__Impl"
    // InternalMyDsl.g:3102:1: rule__LightAction__Group__1__Impl : ( 'LightAction' ) ;
    public final void rule__LightAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3106:1: ( ( 'LightAction' ) )
            // InternalMyDsl.g:3107:1: ( 'LightAction' )
            {
            // InternalMyDsl.g:3107:1: ( 'LightAction' )
            // InternalMyDsl.g:3108:2: 'LightAction'
            {
             before(grammarAccess.getLightActionAccess().getLightActionKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getLightActionAccess().getLightActionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group__1__Impl"


    // $ANTLR start "rule__LightAction__Group__2"
    // InternalMyDsl.g:3117:1: rule__LightAction__Group__2 : rule__LightAction__Group__2__Impl rule__LightAction__Group__3 ;
    public final void rule__LightAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3121:1: ( rule__LightAction__Group__2__Impl rule__LightAction__Group__3 )
            // InternalMyDsl.g:3122:2: rule__LightAction__Group__2__Impl rule__LightAction__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__LightAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group__2"


    // $ANTLR start "rule__LightAction__Group__2__Impl"
    // InternalMyDsl.g:3129:1: rule__LightAction__Group__2__Impl : ( ( rule__LightAction__ActionnameAssignment_2 ) ) ;
    public final void rule__LightAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3133:1: ( ( ( rule__LightAction__ActionnameAssignment_2 ) ) )
            // InternalMyDsl.g:3134:1: ( ( rule__LightAction__ActionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:3134:1: ( ( rule__LightAction__ActionnameAssignment_2 ) )
            // InternalMyDsl.g:3135:2: ( rule__LightAction__ActionnameAssignment_2 )
            {
             before(grammarAccess.getLightActionAccess().getActionnameAssignment_2()); 
            // InternalMyDsl.g:3136:2: ( rule__LightAction__ActionnameAssignment_2 )
            // InternalMyDsl.g:3136:3: rule__LightAction__ActionnameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LightAction__ActionnameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLightActionAccess().getActionnameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group__2__Impl"


    // $ANTLR start "rule__LightAction__Group__3"
    // InternalMyDsl.g:3144:1: rule__LightAction__Group__3 : rule__LightAction__Group__3__Impl rule__LightAction__Group__4 ;
    public final void rule__LightAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3148:1: ( rule__LightAction__Group__3__Impl rule__LightAction__Group__4 )
            // InternalMyDsl.g:3149:2: rule__LightAction__Group__3__Impl rule__LightAction__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__LightAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightAction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group__3"


    // $ANTLR start "rule__LightAction__Group__3__Impl"
    // InternalMyDsl.g:3156:1: rule__LightAction__Group__3__Impl : ( 'pos:' ) ;
    public final void rule__LightAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3160:1: ( ( 'pos:' ) )
            // InternalMyDsl.g:3161:1: ( 'pos:' )
            {
            // InternalMyDsl.g:3161:1: ( 'pos:' )
            // InternalMyDsl.g:3162:2: 'pos:'
            {
             before(grammarAccess.getLightActionAccess().getPosKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getLightActionAccess().getPosKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group__3__Impl"


    // $ANTLR start "rule__LightAction__Group__4"
    // InternalMyDsl.g:3171:1: rule__LightAction__Group__4 : rule__LightAction__Group__4__Impl rule__LightAction__Group__5 ;
    public final void rule__LightAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3175:1: ( rule__LightAction__Group__4__Impl rule__LightAction__Group__5 )
            // InternalMyDsl.g:3176:2: rule__LightAction__Group__4__Impl rule__LightAction__Group__5
            {
            pushFollow(FOLLOW_36);
            rule__LightAction__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightAction__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group__4"


    // $ANTLR start "rule__LightAction__Group__4__Impl"
    // InternalMyDsl.g:3183:1: rule__LightAction__Group__4__Impl : ( ( rule__LightAction__PosAssignment_4 ) ) ;
    public final void rule__LightAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3187:1: ( ( ( rule__LightAction__PosAssignment_4 ) ) )
            // InternalMyDsl.g:3188:1: ( ( rule__LightAction__PosAssignment_4 ) )
            {
            // InternalMyDsl.g:3188:1: ( ( rule__LightAction__PosAssignment_4 ) )
            // InternalMyDsl.g:3189:2: ( rule__LightAction__PosAssignment_4 )
            {
             before(grammarAccess.getLightActionAccess().getPosAssignment_4()); 
            // InternalMyDsl.g:3190:2: ( rule__LightAction__PosAssignment_4 )
            // InternalMyDsl.g:3190:3: rule__LightAction__PosAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LightAction__PosAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLightActionAccess().getPosAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group__4__Impl"


    // $ANTLR start "rule__LightAction__Group__5"
    // InternalMyDsl.g:3198:1: rule__LightAction__Group__5 : rule__LightAction__Group__5__Impl rule__LightAction__Group__6 ;
    public final void rule__LightAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3202:1: ( rule__LightAction__Group__5__Impl rule__LightAction__Group__6 )
            // InternalMyDsl.g:3203:2: rule__LightAction__Group__5__Impl rule__LightAction__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__LightAction__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightAction__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group__5"


    // $ANTLR start "rule__LightAction__Group__5__Impl"
    // InternalMyDsl.g:3210:1: rule__LightAction__Group__5__Impl : ( ( rule__LightAction__Group_5__0 )? ) ;
    public final void rule__LightAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3214:1: ( ( ( rule__LightAction__Group_5__0 )? ) )
            // InternalMyDsl.g:3215:1: ( ( rule__LightAction__Group_5__0 )? )
            {
            // InternalMyDsl.g:3215:1: ( ( rule__LightAction__Group_5__0 )? )
            // InternalMyDsl.g:3216:2: ( rule__LightAction__Group_5__0 )?
            {
             before(grammarAccess.getLightActionAccess().getGroup_5()); 
            // InternalMyDsl.g:3217:2: ( rule__LightAction__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==50) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:3217:3: rule__LightAction__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LightAction__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLightActionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group__5__Impl"


    // $ANTLR start "rule__LightAction__Group__6"
    // InternalMyDsl.g:3225:1: rule__LightAction__Group__6 : rule__LightAction__Group__6__Impl rule__LightAction__Group__7 ;
    public final void rule__LightAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3229:1: ( rule__LightAction__Group__6__Impl rule__LightAction__Group__7 )
            // InternalMyDsl.g:3230:2: rule__LightAction__Group__6__Impl rule__LightAction__Group__7
            {
            pushFollow(FOLLOW_36);
            rule__LightAction__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightAction__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group__6"


    // $ANTLR start "rule__LightAction__Group__6__Impl"
    // InternalMyDsl.g:3237:1: rule__LightAction__Group__6__Impl : ( ( rule__LightAction__Group_6__0 )? ) ;
    public final void rule__LightAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3241:1: ( ( ( rule__LightAction__Group_6__0 )? ) )
            // InternalMyDsl.g:3242:1: ( ( rule__LightAction__Group_6__0 )? )
            {
            // InternalMyDsl.g:3242:1: ( ( rule__LightAction__Group_6__0 )? )
            // InternalMyDsl.g:3243:2: ( rule__LightAction__Group_6__0 )?
            {
             before(grammarAccess.getLightActionAccess().getGroup_6()); 
            // InternalMyDsl.g:3244:2: ( rule__LightAction__Group_6__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==51) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:3244:3: rule__LightAction__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LightAction__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLightActionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group__6__Impl"


    // $ANTLR start "rule__LightAction__Group__7"
    // InternalMyDsl.g:3252:1: rule__LightAction__Group__7 : rule__LightAction__Group__7__Impl ;
    public final void rule__LightAction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3256:1: ( rule__LightAction__Group__7__Impl )
            // InternalMyDsl.g:3257:2: rule__LightAction__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LightAction__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group__7"


    // $ANTLR start "rule__LightAction__Group__7__Impl"
    // InternalMyDsl.g:3263:1: rule__LightAction__Group__7__Impl : ( ( rule__LightAction__Group_7__0 )? ) ;
    public final void rule__LightAction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3267:1: ( ( ( rule__LightAction__Group_7__0 )? ) )
            // InternalMyDsl.g:3268:1: ( ( rule__LightAction__Group_7__0 )? )
            {
            // InternalMyDsl.g:3268:1: ( ( rule__LightAction__Group_7__0 )? )
            // InternalMyDsl.g:3269:2: ( rule__LightAction__Group_7__0 )?
            {
             before(grammarAccess.getLightActionAccess().getGroup_7()); 
            // InternalMyDsl.g:3270:2: ( rule__LightAction__Group_7__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==52) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:3270:3: rule__LightAction__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LightAction__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLightActionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group__7__Impl"


    // $ANTLR start "rule__LightAction__Group_5__0"
    // InternalMyDsl.g:3279:1: rule__LightAction__Group_5__0 : rule__LightAction__Group_5__0__Impl rule__LightAction__Group_5__1 ;
    public final void rule__LightAction__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3283:1: ( rule__LightAction__Group_5__0__Impl rule__LightAction__Group_5__1 )
            // InternalMyDsl.g:3284:2: rule__LightAction__Group_5__0__Impl rule__LightAction__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__LightAction__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightAction__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group_5__0"


    // $ANTLR start "rule__LightAction__Group_5__0__Impl"
    // InternalMyDsl.g:3291:1: rule__LightAction__Group_5__0__Impl : ( 'red:' ) ;
    public final void rule__LightAction__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3295:1: ( ( 'red:' ) )
            // InternalMyDsl.g:3296:1: ( 'red:' )
            {
            // InternalMyDsl.g:3296:1: ( 'red:' )
            // InternalMyDsl.g:3297:2: 'red:'
            {
             before(grammarAccess.getLightActionAccess().getRedKeyword_5_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getLightActionAccess().getRedKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group_5__0__Impl"


    // $ANTLR start "rule__LightAction__Group_5__1"
    // InternalMyDsl.g:3306:1: rule__LightAction__Group_5__1 : rule__LightAction__Group_5__1__Impl ;
    public final void rule__LightAction__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3310:1: ( rule__LightAction__Group_5__1__Impl )
            // InternalMyDsl.g:3311:2: rule__LightAction__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LightAction__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group_5__1"


    // $ANTLR start "rule__LightAction__Group_5__1__Impl"
    // InternalMyDsl.g:3317:1: rule__LightAction__Group_5__1__Impl : ( ( rule__LightAction__RedExAssignment_5_1 ) ) ;
    public final void rule__LightAction__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3321:1: ( ( ( rule__LightAction__RedExAssignment_5_1 ) ) )
            // InternalMyDsl.g:3322:1: ( ( rule__LightAction__RedExAssignment_5_1 ) )
            {
            // InternalMyDsl.g:3322:1: ( ( rule__LightAction__RedExAssignment_5_1 ) )
            // InternalMyDsl.g:3323:2: ( rule__LightAction__RedExAssignment_5_1 )
            {
             before(grammarAccess.getLightActionAccess().getRedExAssignment_5_1()); 
            // InternalMyDsl.g:3324:2: ( rule__LightAction__RedExAssignment_5_1 )
            // InternalMyDsl.g:3324:3: rule__LightAction__RedExAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__LightAction__RedExAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLightActionAccess().getRedExAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group_5__1__Impl"


    // $ANTLR start "rule__LightAction__Group_6__0"
    // InternalMyDsl.g:3333:1: rule__LightAction__Group_6__0 : rule__LightAction__Group_6__0__Impl rule__LightAction__Group_6__1 ;
    public final void rule__LightAction__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3337:1: ( rule__LightAction__Group_6__0__Impl rule__LightAction__Group_6__1 )
            // InternalMyDsl.g:3338:2: rule__LightAction__Group_6__0__Impl rule__LightAction__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__LightAction__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightAction__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group_6__0"


    // $ANTLR start "rule__LightAction__Group_6__0__Impl"
    // InternalMyDsl.g:3345:1: rule__LightAction__Group_6__0__Impl : ( 'green:' ) ;
    public final void rule__LightAction__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3349:1: ( ( 'green:' ) )
            // InternalMyDsl.g:3350:1: ( 'green:' )
            {
            // InternalMyDsl.g:3350:1: ( 'green:' )
            // InternalMyDsl.g:3351:2: 'green:'
            {
             before(grammarAccess.getLightActionAccess().getGreenKeyword_6_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLightActionAccess().getGreenKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group_6__0__Impl"


    // $ANTLR start "rule__LightAction__Group_6__1"
    // InternalMyDsl.g:3360:1: rule__LightAction__Group_6__1 : rule__LightAction__Group_6__1__Impl ;
    public final void rule__LightAction__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3364:1: ( rule__LightAction__Group_6__1__Impl )
            // InternalMyDsl.g:3365:2: rule__LightAction__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LightAction__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group_6__1"


    // $ANTLR start "rule__LightAction__Group_6__1__Impl"
    // InternalMyDsl.g:3371:1: rule__LightAction__Group_6__1__Impl : ( ( rule__LightAction__GreenExAssignment_6_1 ) ) ;
    public final void rule__LightAction__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3375:1: ( ( ( rule__LightAction__GreenExAssignment_6_1 ) ) )
            // InternalMyDsl.g:3376:1: ( ( rule__LightAction__GreenExAssignment_6_1 ) )
            {
            // InternalMyDsl.g:3376:1: ( ( rule__LightAction__GreenExAssignment_6_1 ) )
            // InternalMyDsl.g:3377:2: ( rule__LightAction__GreenExAssignment_6_1 )
            {
             before(grammarAccess.getLightActionAccess().getGreenExAssignment_6_1()); 
            // InternalMyDsl.g:3378:2: ( rule__LightAction__GreenExAssignment_6_1 )
            // InternalMyDsl.g:3378:3: rule__LightAction__GreenExAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__LightAction__GreenExAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLightActionAccess().getGreenExAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group_6__1__Impl"


    // $ANTLR start "rule__LightAction__Group_7__0"
    // InternalMyDsl.g:3387:1: rule__LightAction__Group_7__0 : rule__LightAction__Group_7__0__Impl rule__LightAction__Group_7__1 ;
    public final void rule__LightAction__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3391:1: ( rule__LightAction__Group_7__0__Impl rule__LightAction__Group_7__1 )
            // InternalMyDsl.g:3392:2: rule__LightAction__Group_7__0__Impl rule__LightAction__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__LightAction__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightAction__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group_7__0"


    // $ANTLR start "rule__LightAction__Group_7__0__Impl"
    // InternalMyDsl.g:3399:1: rule__LightAction__Group_7__0__Impl : ( 'blue:' ) ;
    public final void rule__LightAction__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3403:1: ( ( 'blue:' ) )
            // InternalMyDsl.g:3404:1: ( 'blue:' )
            {
            // InternalMyDsl.g:3404:1: ( 'blue:' )
            // InternalMyDsl.g:3405:2: 'blue:'
            {
             before(grammarAccess.getLightActionAccess().getBlueKeyword_7_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getLightActionAccess().getBlueKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group_7__0__Impl"


    // $ANTLR start "rule__LightAction__Group_7__1"
    // InternalMyDsl.g:3414:1: rule__LightAction__Group_7__1 : rule__LightAction__Group_7__1__Impl ;
    public final void rule__LightAction__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3418:1: ( rule__LightAction__Group_7__1__Impl )
            // InternalMyDsl.g:3419:2: rule__LightAction__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LightAction__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group_7__1"


    // $ANTLR start "rule__LightAction__Group_7__1__Impl"
    // InternalMyDsl.g:3425:1: rule__LightAction__Group_7__1__Impl : ( ( rule__LightAction__BlueExAssignment_7_1 ) ) ;
    public final void rule__LightAction__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3429:1: ( ( ( rule__LightAction__BlueExAssignment_7_1 ) ) )
            // InternalMyDsl.g:3430:1: ( ( rule__LightAction__BlueExAssignment_7_1 ) )
            {
            // InternalMyDsl.g:3430:1: ( ( rule__LightAction__BlueExAssignment_7_1 ) )
            // InternalMyDsl.g:3431:2: ( rule__LightAction__BlueExAssignment_7_1 )
            {
             before(grammarAccess.getLightActionAccess().getBlueExAssignment_7_1()); 
            // InternalMyDsl.g:3432:2: ( rule__LightAction__BlueExAssignment_7_1 )
            // InternalMyDsl.g:3432:3: rule__LightAction__BlueExAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__LightAction__BlueExAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getLightActionAccess().getBlueExAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__Group_7__1__Impl"


    // $ANTLR start "rule__MusicSetting__Group__0"
    // InternalMyDsl.g:3441:1: rule__MusicSetting__Group__0 : rule__MusicSetting__Group__0__Impl rule__MusicSetting__Group__1 ;
    public final void rule__MusicSetting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3445:1: ( rule__MusicSetting__Group__0__Impl rule__MusicSetting__Group__1 )
            // InternalMyDsl.g:3446:2: rule__MusicSetting__Group__0__Impl rule__MusicSetting__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__MusicSetting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MusicSetting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSetting__Group__0"


    // $ANTLR start "rule__MusicSetting__Group__0__Impl"
    // InternalMyDsl.g:3453:1: rule__MusicSetting__Group__0__Impl : ( () ) ;
    public final void rule__MusicSetting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3457:1: ( ( () ) )
            // InternalMyDsl.g:3458:1: ( () )
            {
            // InternalMyDsl.g:3458:1: ( () )
            // InternalMyDsl.g:3459:2: ()
            {
             before(grammarAccess.getMusicSettingAccess().getMusicSettingAction_0()); 
            // InternalMyDsl.g:3460:2: ()
            // InternalMyDsl.g:3460:3: 
            {
            }

             after(grammarAccess.getMusicSettingAccess().getMusicSettingAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSetting__Group__0__Impl"


    // $ANTLR start "rule__MusicSetting__Group__1"
    // InternalMyDsl.g:3468:1: rule__MusicSetting__Group__1 : rule__MusicSetting__Group__1__Impl rule__MusicSetting__Group__2 ;
    public final void rule__MusicSetting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3472:1: ( rule__MusicSetting__Group__1__Impl rule__MusicSetting__Group__2 )
            // InternalMyDsl.g:3473:2: rule__MusicSetting__Group__1__Impl rule__MusicSetting__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MusicSetting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MusicSetting__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSetting__Group__1"


    // $ANTLR start "rule__MusicSetting__Group__1__Impl"
    // InternalMyDsl.g:3480:1: rule__MusicSetting__Group__1__Impl : ( '(' ) ;
    public final void rule__MusicSetting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3484:1: ( ( '(' ) )
            // InternalMyDsl.g:3485:1: ( '(' )
            {
            // InternalMyDsl.g:3485:1: ( '(' )
            // InternalMyDsl.g:3486:2: '('
            {
             before(grammarAccess.getMusicSettingAccess().getLeftParenthesisKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMusicSettingAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSetting__Group__1__Impl"


    // $ANTLR start "rule__MusicSetting__Group__2"
    // InternalMyDsl.g:3495:1: rule__MusicSetting__Group__2 : rule__MusicSetting__Group__2__Impl rule__MusicSetting__Group__3 ;
    public final void rule__MusicSetting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3499:1: ( rule__MusicSetting__Group__2__Impl rule__MusicSetting__Group__3 )
            // InternalMyDsl.g:3500:2: rule__MusicSetting__Group__2__Impl rule__MusicSetting__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__MusicSetting__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MusicSetting__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSetting__Group__2"


    // $ANTLR start "rule__MusicSetting__Group__2__Impl"
    // InternalMyDsl.g:3507:1: rule__MusicSetting__Group__2__Impl : ( ( rule__MusicSetting__NoteExAssignment_2 ) ) ;
    public final void rule__MusicSetting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3511:1: ( ( ( rule__MusicSetting__NoteExAssignment_2 ) ) )
            // InternalMyDsl.g:3512:1: ( ( rule__MusicSetting__NoteExAssignment_2 ) )
            {
            // InternalMyDsl.g:3512:1: ( ( rule__MusicSetting__NoteExAssignment_2 ) )
            // InternalMyDsl.g:3513:2: ( rule__MusicSetting__NoteExAssignment_2 )
            {
             before(grammarAccess.getMusicSettingAccess().getNoteExAssignment_2()); 
            // InternalMyDsl.g:3514:2: ( rule__MusicSetting__NoteExAssignment_2 )
            // InternalMyDsl.g:3514:3: rule__MusicSetting__NoteExAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MusicSetting__NoteExAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMusicSettingAccess().getNoteExAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSetting__Group__2__Impl"


    // $ANTLR start "rule__MusicSetting__Group__3"
    // InternalMyDsl.g:3522:1: rule__MusicSetting__Group__3 : rule__MusicSetting__Group__3__Impl rule__MusicSetting__Group__4 ;
    public final void rule__MusicSetting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3526:1: ( rule__MusicSetting__Group__3__Impl rule__MusicSetting__Group__4 )
            // InternalMyDsl.g:3527:2: rule__MusicSetting__Group__3__Impl rule__MusicSetting__Group__4
            {
            pushFollow(FOLLOW_37);
            rule__MusicSetting__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MusicSetting__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSetting__Group__3"


    // $ANTLR start "rule__MusicSetting__Group__3__Impl"
    // InternalMyDsl.g:3534:1: rule__MusicSetting__Group__3__Impl : ( ',' ) ;
    public final void rule__MusicSetting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3538:1: ( ( ',' ) )
            // InternalMyDsl.g:3539:1: ( ',' )
            {
            // InternalMyDsl.g:3539:1: ( ',' )
            // InternalMyDsl.g:3540:2: ','
            {
             before(grammarAccess.getMusicSettingAccess().getCommaKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMusicSettingAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSetting__Group__3__Impl"


    // $ANTLR start "rule__MusicSetting__Group__4"
    // InternalMyDsl.g:3549:1: rule__MusicSetting__Group__4 : rule__MusicSetting__Group__4__Impl rule__MusicSetting__Group__5 ;
    public final void rule__MusicSetting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3553:1: ( rule__MusicSetting__Group__4__Impl rule__MusicSetting__Group__5 )
            // InternalMyDsl.g:3554:2: rule__MusicSetting__Group__4__Impl rule__MusicSetting__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__MusicSetting__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MusicSetting__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSetting__Group__4"


    // $ANTLR start "rule__MusicSetting__Group__4__Impl"
    // InternalMyDsl.g:3561:1: rule__MusicSetting__Group__4__Impl : ( ( rule__MusicSetting__DurationAssignment_4 ) ) ;
    public final void rule__MusicSetting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3565:1: ( ( ( rule__MusicSetting__DurationAssignment_4 ) ) )
            // InternalMyDsl.g:3566:1: ( ( rule__MusicSetting__DurationAssignment_4 ) )
            {
            // InternalMyDsl.g:3566:1: ( ( rule__MusicSetting__DurationAssignment_4 ) )
            // InternalMyDsl.g:3567:2: ( rule__MusicSetting__DurationAssignment_4 )
            {
             before(grammarAccess.getMusicSettingAccess().getDurationAssignment_4()); 
            // InternalMyDsl.g:3568:2: ( rule__MusicSetting__DurationAssignment_4 )
            // InternalMyDsl.g:3568:3: rule__MusicSetting__DurationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MusicSetting__DurationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMusicSettingAccess().getDurationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSetting__Group__4__Impl"


    // $ANTLR start "rule__MusicSetting__Group__5"
    // InternalMyDsl.g:3576:1: rule__MusicSetting__Group__5 : rule__MusicSetting__Group__5__Impl rule__MusicSetting__Group__6 ;
    public final void rule__MusicSetting__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3580:1: ( rule__MusicSetting__Group__5__Impl rule__MusicSetting__Group__6 )
            // InternalMyDsl.g:3581:2: rule__MusicSetting__Group__5__Impl rule__MusicSetting__Group__6
            {
            pushFollow(FOLLOW_3);
            rule__MusicSetting__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MusicSetting__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSetting__Group__5"


    // $ANTLR start "rule__MusicSetting__Group__5__Impl"
    // InternalMyDsl.g:3588:1: rule__MusicSetting__Group__5__Impl : ( ',' ) ;
    public final void rule__MusicSetting__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3592:1: ( ( ',' ) )
            // InternalMyDsl.g:3593:1: ( ',' )
            {
            // InternalMyDsl.g:3593:1: ( ',' )
            // InternalMyDsl.g:3594:2: ','
            {
             before(grammarAccess.getMusicSettingAccess().getCommaKeyword_5()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMusicSettingAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSetting__Group__5__Impl"


    // $ANTLR start "rule__MusicSetting__Group__6"
    // InternalMyDsl.g:3603:1: rule__MusicSetting__Group__6 : rule__MusicSetting__Group__6__Impl rule__MusicSetting__Group__7 ;
    public final void rule__MusicSetting__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3607:1: ( rule__MusicSetting__Group__6__Impl rule__MusicSetting__Group__7 )
            // InternalMyDsl.g:3608:2: rule__MusicSetting__Group__6__Impl rule__MusicSetting__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__MusicSetting__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MusicSetting__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSetting__Group__6"


    // $ANTLR start "rule__MusicSetting__Group__6__Impl"
    // InternalMyDsl.g:3615:1: rule__MusicSetting__Group__6__Impl : ( ( rule__MusicSetting__PosExAssignment_6 ) ) ;
    public final void rule__MusicSetting__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3619:1: ( ( ( rule__MusicSetting__PosExAssignment_6 ) ) )
            // InternalMyDsl.g:3620:1: ( ( rule__MusicSetting__PosExAssignment_6 ) )
            {
            // InternalMyDsl.g:3620:1: ( ( rule__MusicSetting__PosExAssignment_6 ) )
            // InternalMyDsl.g:3621:2: ( rule__MusicSetting__PosExAssignment_6 )
            {
             before(grammarAccess.getMusicSettingAccess().getPosExAssignment_6()); 
            // InternalMyDsl.g:3622:2: ( rule__MusicSetting__PosExAssignment_6 )
            // InternalMyDsl.g:3622:3: rule__MusicSetting__PosExAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__MusicSetting__PosExAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMusicSettingAccess().getPosExAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSetting__Group__6__Impl"


    // $ANTLR start "rule__MusicSetting__Group__7"
    // InternalMyDsl.g:3630:1: rule__MusicSetting__Group__7 : rule__MusicSetting__Group__7__Impl ;
    public final void rule__MusicSetting__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3634:1: ( rule__MusicSetting__Group__7__Impl )
            // InternalMyDsl.g:3635:2: rule__MusicSetting__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MusicSetting__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSetting__Group__7"


    // $ANTLR start "rule__MusicSetting__Group__7__Impl"
    // InternalMyDsl.g:3641:1: rule__MusicSetting__Group__7__Impl : ( ')' ) ;
    public final void rule__MusicSetting__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3645:1: ( ( ')' ) )
            // InternalMyDsl.g:3646:1: ( ')' )
            {
            // InternalMyDsl.g:3646:1: ( ')' )
            // InternalMyDsl.g:3647:2: ')'
            {
             before(grammarAccess.getMusicSettingAccess().getRightParenthesisKeyword_7()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMusicSettingAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSetting__Group__7__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:3657:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3661:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:3662:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:3669:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3673:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:3674:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:3674:1: ( ( '-' )? )
            // InternalMyDsl.g:3675:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:3676:2: ( '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==12) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:3676:3: '-'
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:3684:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3688:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:3689:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:3695:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3699:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3700:1: ( RULE_INT )
            {
            // InternalMyDsl.g:3700:1: ( RULE_INT )
            // InternalMyDsl.g:3701:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__RobotModel__EventsAssignment_1_0"
    // InternalMyDsl.g:3711:1: rule__RobotModel__EventsAssignment_1_0 : ( ruleEvent ) ;
    public final void rule__RobotModel__EventsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3715:1: ( ( ruleEvent ) )
            // InternalMyDsl.g:3716:2: ( ruleEvent )
            {
            // InternalMyDsl.g:3716:2: ( ruleEvent )
            // InternalMyDsl.g:3717:3: ruleEvent
            {
             before(grammarAccess.getRobotModelAccess().getEventsEventParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getRobotModelAccess().getEventsEventParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__EventsAssignment_1_0"


    // $ANTLR start "rule__RobotModel__ActionsAssignment_1_1_2"
    // InternalMyDsl.g:3726:1: rule__RobotModel__ActionsAssignment_1_1_2 : ( ruleAction ) ;
    public final void rule__RobotModel__ActionsAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3730:1: ( ( ruleAction ) )
            // InternalMyDsl.g:3731:2: ( ruleAction )
            {
            // InternalMyDsl.g:3731:2: ( ruleAction )
            // InternalMyDsl.g:3732:3: ruleAction
            {
             before(grammarAccess.getRobotModelAccess().getActionsActionParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getRobotModelAccess().getActionsActionParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__ActionsAssignment_1_1_2"


    // $ANTLR start "rule__RobotModel__ActionsAssignment_1_1_3_1"
    // InternalMyDsl.g:3741:1: rule__RobotModel__ActionsAssignment_1_1_3_1 : ( ruleAction ) ;
    public final void rule__RobotModel__ActionsAssignment_1_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3745:1: ( ( ruleAction ) )
            // InternalMyDsl.g:3746:2: ( ruleAction )
            {
            // InternalMyDsl.g:3746:2: ( ruleAction )
            // InternalMyDsl.g:3747:3: ruleAction
            {
             before(grammarAccess.getRobotModelAccess().getActionsActionParserRuleCall_1_1_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getRobotModelAccess().getActionsActionParserRuleCall_1_1_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__ActionsAssignment_1_1_3_1"


    // $ANTLR start "rule__RobotModel__ConditionsAssignment_1_2_2"
    // InternalMyDsl.g:3756:1: rule__RobotModel__ConditionsAssignment_1_2_2 : ( ruleCondition ) ;
    public final void rule__RobotModel__ConditionsAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3760:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:3761:2: ( ruleCondition )
            {
            // InternalMyDsl.g:3761:2: ( ruleCondition )
            // InternalMyDsl.g:3762:3: ruleCondition
            {
             before(grammarAccess.getRobotModelAccess().getConditionsConditionParserRuleCall_1_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getRobotModelAccess().getConditionsConditionParserRuleCall_1_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__ConditionsAssignment_1_2_2"


    // $ANTLR start "rule__RobotModel__ConditionsAssignment_1_2_3_1"
    // InternalMyDsl.g:3771:1: rule__RobotModel__ConditionsAssignment_1_2_3_1 : ( ruleCondition ) ;
    public final void rule__RobotModel__ConditionsAssignment_1_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3775:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:3776:2: ( ruleCondition )
            {
            // InternalMyDsl.g:3776:2: ( ruleCondition )
            // InternalMyDsl.g:3777:3: ruleCondition
            {
             before(grammarAccess.getRobotModelAccess().getConditionsConditionParserRuleCall_1_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getRobotModelAccess().getConditionsConditionParserRuleCall_1_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__ConditionsAssignment_1_2_3_1"


    // $ANTLR start "rule__RobotModel__ExpressionsAssignment_1_3"
    // InternalMyDsl.g:3786:1: rule__RobotModel__ExpressionsAssignment_1_3 : ( ruleExpression ) ;
    public final void rule__RobotModel__ExpressionsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3790:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3791:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3791:2: ( ruleExpression )
            // InternalMyDsl.g:3792:3: ruleExpression
            {
             before(grammarAccess.getRobotModelAccess().getExpressionsExpressionParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getRobotModelAccess().getExpressionsExpressionParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotModel__ExpressionsAssignment_1_3"


    // $ANTLR start "rule__PlusOrMinus__OperationAssignment_1_0_1"
    // InternalMyDsl.g:3801:1: rule__PlusOrMinus__OperationAssignment_1_0_1 : ( ( rule__PlusOrMinus__OperationAlternatives_1_0_1_0 ) ) ;
    public final void rule__PlusOrMinus__OperationAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3805:1: ( ( ( rule__PlusOrMinus__OperationAlternatives_1_0_1_0 ) ) )
            // InternalMyDsl.g:3806:2: ( ( rule__PlusOrMinus__OperationAlternatives_1_0_1_0 ) )
            {
            // InternalMyDsl.g:3806:2: ( ( rule__PlusOrMinus__OperationAlternatives_1_0_1_0 ) )
            // InternalMyDsl.g:3807:3: ( rule__PlusOrMinus__OperationAlternatives_1_0_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getOperationAlternatives_1_0_1_0()); 
            // InternalMyDsl.g:3808:3: ( rule__PlusOrMinus__OperationAlternatives_1_0_1_0 )
            // InternalMyDsl.g:3808:4: rule__PlusOrMinus__OperationAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__OperationAlternatives_1_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getOperationAlternatives_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__OperationAssignment_1_0_1"


    // $ANTLR start "rule__PlusOrMinus__RightAssignment_1_1"
    // InternalMyDsl.g:3816:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMultOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3820:1: ( ( ruleMultOrDiv ) )
            // InternalMyDsl.g:3821:2: ( ruleMultOrDiv )
            {
            // InternalMyDsl.g:3821:2: ( ruleMultOrDiv )
            // InternalMyDsl.g:3822:3: ruleMultOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightMultOrDivParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getRightMultOrDivParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__RightAssignment_1_1"


    // $ANTLR start "rule__MultOrDiv__OperationAssignment_1_1"
    // InternalMyDsl.g:3831:1: rule__MultOrDiv__OperationAssignment_1_1 : ( ( rule__MultOrDiv__OperationAlternatives_1_1_0 ) ) ;
    public final void rule__MultOrDiv__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3835:1: ( ( ( rule__MultOrDiv__OperationAlternatives_1_1_0 ) ) )
            // InternalMyDsl.g:3836:2: ( ( rule__MultOrDiv__OperationAlternatives_1_1_0 ) )
            {
            // InternalMyDsl.g:3836:2: ( ( rule__MultOrDiv__OperationAlternatives_1_1_0 ) )
            // InternalMyDsl.g:3837:3: ( rule__MultOrDiv__OperationAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultOrDivAccess().getOperationAlternatives_1_1_0()); 
            // InternalMyDsl.g:3838:3: ( rule__MultOrDiv__OperationAlternatives_1_1_0 )
            // InternalMyDsl.g:3838:4: rule__MultOrDiv__OperationAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MultOrDiv__OperationAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMultOrDivAccess().getOperationAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOrDiv__OperationAssignment_1_1"


    // $ANTLR start "rule__MultOrDiv__RightAssignment_1_2"
    // InternalMyDsl.g:3846:1: rule__MultOrDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MultOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3850:1: ( ( rulePrimary ) )
            // InternalMyDsl.g:3851:2: ( rulePrimary )
            {
            // InternalMyDsl.g:3851:2: ( rulePrimary )
            // InternalMyDsl.g:3852:3: rulePrimary
            {
             before(grammarAccess.getMultOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultOrDiv__RightAssignment_1_2"


    // $ANTLR start "rule__Atomic__ValueAssignment_1"
    // InternalMyDsl.g:3861:1: rule__Atomic__ValueAssignment_1 : ( ruleEInt ) ;
    public final void rule__Atomic__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3865:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:3866:2: ( ruleEInt )
            {
            // InternalMyDsl.g:3866:2: ( ruleEInt )
            // InternalMyDsl.g:3867:3: ruleEInt
            {
             before(grammarAccess.getAtomicAccess().getValueEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAtomicAccess().getValueEIntParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_1"


    // $ANTLR start "rule__Event__NameAssignment_2"
    // InternalMyDsl.g:3876:1: rule__Event__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Event__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3880:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3881:2: ( ruleEString )
            {
            // InternalMyDsl.g:3881:2: ( ruleEString )
            // InternalMyDsl.g:3882:3: ruleEString
            {
             before(grammarAccess.getEventAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment_2"


    // $ANTLR start "rule__Event__ConditionsAssignment_3_1"
    // InternalMyDsl.g:3891:1: rule__Event__ConditionsAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Event__ConditionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3895:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:3896:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:3896:2: ( ( ruleEString ) )
            // InternalMyDsl.g:3897:3: ( ruleEString )
            {
             before(grammarAccess.getEventAccess().getConditionsConditionCrossReference_3_1_0()); 
            // InternalMyDsl.g:3898:3: ( ruleEString )
            // InternalMyDsl.g:3899:4: ruleEString
            {
             before(grammarAccess.getEventAccess().getConditionsConditionEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getConditionsConditionEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEventAccess().getConditionsConditionCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ConditionsAssignment_3_1"


    // $ANTLR start "rule__Event__ConditionsAssignment_3_2_1"
    // InternalMyDsl.g:3910:1: rule__Event__ConditionsAssignment_3_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Event__ConditionsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3914:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:3915:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:3915:2: ( ( ruleEString ) )
            // InternalMyDsl.g:3916:3: ( ruleEString )
            {
             before(grammarAccess.getEventAccess().getConditionsConditionCrossReference_3_2_1_0()); 
            // InternalMyDsl.g:3917:3: ( ruleEString )
            // InternalMyDsl.g:3918:4: ruleEString
            {
             before(grammarAccess.getEventAccess().getConditionsConditionEStringParserRuleCall_3_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getConditionsConditionEStringParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getEventAccess().getConditionsConditionCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ConditionsAssignment_3_2_1"


    // $ANTLR start "rule__Event__ActionsAssignment_4_1"
    // InternalMyDsl.g:3929:1: rule__Event__ActionsAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Event__ActionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3933:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:3934:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:3934:2: ( ( ruleEString ) )
            // InternalMyDsl.g:3935:3: ( ruleEString )
            {
             before(grammarAccess.getEventAccess().getActionsActionCrossReference_4_1_0()); 
            // InternalMyDsl.g:3936:3: ( ruleEString )
            // InternalMyDsl.g:3937:4: ruleEString
            {
             before(grammarAccess.getEventAccess().getActionsActionEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getActionsActionEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getEventAccess().getActionsActionCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ActionsAssignment_4_1"


    // $ANTLR start "rule__Event__ActionsAssignment_4_2_1"
    // InternalMyDsl.g:3948:1: rule__Event__ActionsAssignment_4_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Event__ActionsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3952:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:3953:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:3953:2: ( ( ruleEString ) )
            // InternalMyDsl.g:3954:3: ( ruleEString )
            {
             before(grammarAccess.getEventAccess().getActionsActionCrossReference_4_2_1_0()); 
            // InternalMyDsl.g:3955:3: ( ruleEString )
            // InternalMyDsl.g:3956:4: ruleEString
            {
             before(grammarAccess.getEventAccess().getActionsActionEStringParserRuleCall_4_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getActionsActionEStringParserRuleCall_4_2_1_0_1()); 

            }

             after(grammarAccess.getEventAccess().getActionsActionCrossReference_4_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ActionsAssignment_4_2_1"


    // $ANTLR start "rule__Sound__ConditionnameAssignment_2"
    // InternalMyDsl.g:3967:1: rule__Sound__ConditionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__Sound__ConditionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3971:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3972:2: ( ruleEString )
            {
            // InternalMyDsl.g:3972:2: ( ruleEString )
            // InternalMyDsl.g:3973:3: ruleEString
            {
             before(grammarAccess.getSoundAccess().getConditionnameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSoundAccess().getConditionnameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sound__ConditionnameAssignment_2"


    // $ANTLR start "rule__Button__ConditionnameAssignment_2"
    // InternalMyDsl.g:3982:1: rule__Button__ConditionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__Button__ConditionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3986:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3987:2: ( ruleEString )
            {
            // InternalMyDsl.g:3987:2: ( ruleEString )
            // InternalMyDsl.g:3988:3: ruleEString
            {
             before(grammarAccess.getButtonAccess().getConditionnameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getConditionnameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__ConditionnameAssignment_2"


    // $ANTLR start "rule__Button__ButtonAssignment_4"
    // InternalMyDsl.g:3997:1: rule__Button__ButtonAssignment_4 : ( ruleButtonType ) ;
    public final void rule__Button__ButtonAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4001:1: ( ( ruleButtonType ) )
            // InternalMyDsl.g:4002:2: ( ruleButtonType )
            {
            // InternalMyDsl.g:4002:2: ( ruleButtonType )
            // InternalMyDsl.g:4003:3: ruleButtonType
            {
             before(grammarAccess.getButtonAccess().getButtonButtonTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleButtonType();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getButtonButtonTypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__ButtonAssignment_4"


    // $ANTLR start "rule__Sensor__ConditionnameAssignment_2"
    // InternalMyDsl.g:4012:1: rule__Sensor__ConditionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__Sensor__ConditionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4016:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4017:2: ( ruleEString )
            {
            // InternalMyDsl.g:4017:2: ( ruleEString )
            // InternalMyDsl.g:4018:3: ruleEString
            {
             before(grammarAccess.getSensorAccess().getConditionnameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getConditionnameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__ConditionnameAssignment_2"


    // $ANTLR start "rule__Sensor__PosExAssignment_4"
    // InternalMyDsl.g:4027:1: rule__Sensor__PosExAssignment_4 : ( ruleExpression ) ;
    public final void rule__Sensor__PosExAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4031:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:4032:2: ( ruleExpression )
            {
            // InternalMyDsl.g:4032:2: ( ruleExpression )
            // InternalMyDsl.g:4033:3: ruleExpression
            {
             before(grammarAccess.getSensorAccess().getPosExExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getPosExExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__PosExAssignment_4"


    // $ANTLR start "rule__Sensor__DistanceAssignment_6"
    // InternalMyDsl.g:4042:1: rule__Sensor__DistanceAssignment_6 : ( ruleDistance ) ;
    public final void rule__Sensor__DistanceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4046:1: ( ( ruleDistance ) )
            // InternalMyDsl.g:4047:2: ( ruleDistance )
            {
            // InternalMyDsl.g:4047:2: ( ruleDistance )
            // InternalMyDsl.g:4048:3: ruleDistance
            {
             before(grammarAccess.getSensorAccess().getDistanceDistanceEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDistance();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getDistanceDistanceEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__DistanceAssignment_6"


    // $ANTLR start "rule__Tap__ConditionnameAssignment_2"
    // InternalMyDsl.g:4057:1: rule__Tap__ConditionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__Tap__ConditionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4061:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4062:2: ( ruleEString )
            {
            // InternalMyDsl.g:4062:2: ( ruleEString )
            // InternalMyDsl.g:4063:3: ruleEString
            {
             before(grammarAccess.getTapAccess().getConditionnameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTapAccess().getConditionnameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tap__ConditionnameAssignment_2"


    // $ANTLR start "rule__MotorAction__ActionnameAssignment_2"
    // InternalMyDsl.g:4072:1: rule__MotorAction__ActionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__MotorAction__ActionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4076:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4077:2: ( ruleEString )
            {
            // InternalMyDsl.g:4077:2: ( ruleEString )
            // InternalMyDsl.g:4078:3: ruleEString
            {
             before(grammarAccess.getMotorActionAccess().getActionnameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMotorActionAccess().getActionnameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MotorAction__ActionnameAssignment_2"


    // $ANTLR start "rule__MotorAction__LeftAssignment_3_1"
    // InternalMyDsl.g:4087:1: rule__MotorAction__LeftAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__MotorAction__LeftAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4091:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:4092:2: ( ruleExpression )
            {
            // InternalMyDsl.g:4092:2: ( ruleExpression )
            // InternalMyDsl.g:4093:3: ruleExpression
            {
             before(grammarAccess.getMotorActionAccess().getLeftExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMotorActionAccess().getLeftExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MotorAction__LeftAssignment_3_1"


    // $ANTLR start "rule__MotorAction__RightAssignment_4_1"
    // InternalMyDsl.g:4102:1: rule__MotorAction__RightAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__MotorAction__RightAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4106:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:4107:2: ( ruleExpression )
            {
            // InternalMyDsl.g:4107:2: ( ruleExpression )
            // InternalMyDsl.g:4108:3: ruleExpression
            {
             before(grammarAccess.getMotorActionAccess().getRightExpressionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMotorActionAccess().getRightExpressionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MotorAction__RightAssignment_4_1"


    // $ANTLR start "rule__SoundAction__ActionnameAssignment_2"
    // InternalMyDsl.g:4117:1: rule__SoundAction__ActionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__SoundAction__ActionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4121:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4122:2: ( ruleEString )
            {
            // InternalMyDsl.g:4122:2: ( ruleEString )
            // InternalMyDsl.g:4123:3: ruleEString
            {
             before(grammarAccess.getSoundActionAccess().getActionnameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSoundActionAccess().getActionnameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoundAction__ActionnameAssignment_2"


    // $ANTLR start "rule__SoundAction__MusicsettingsAssignment_3_1"
    // InternalMyDsl.g:4132:1: rule__SoundAction__MusicsettingsAssignment_3_1 : ( ruleMusicSetting ) ;
    public final void rule__SoundAction__MusicsettingsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4136:1: ( ( ruleMusicSetting ) )
            // InternalMyDsl.g:4137:2: ( ruleMusicSetting )
            {
            // InternalMyDsl.g:4137:2: ( ruleMusicSetting )
            // InternalMyDsl.g:4138:3: ruleMusicSetting
            {
             before(grammarAccess.getSoundActionAccess().getMusicsettingsMusicSettingParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMusicSetting();

            state._fsp--;

             after(grammarAccess.getSoundActionAccess().getMusicsettingsMusicSettingParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoundAction__MusicsettingsAssignment_3_1"


    // $ANTLR start "rule__SoundAction__MusicsettingsAssignment_3_2_1"
    // InternalMyDsl.g:4147:1: rule__SoundAction__MusicsettingsAssignment_3_2_1 : ( ruleMusicSetting ) ;
    public final void rule__SoundAction__MusicsettingsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4151:1: ( ( ruleMusicSetting ) )
            // InternalMyDsl.g:4152:2: ( ruleMusicSetting )
            {
            // InternalMyDsl.g:4152:2: ( ruleMusicSetting )
            // InternalMyDsl.g:4153:3: ruleMusicSetting
            {
             before(grammarAccess.getSoundActionAccess().getMusicsettingsMusicSettingParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMusicSetting();

            state._fsp--;

             after(grammarAccess.getSoundActionAccess().getMusicsettingsMusicSettingParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SoundAction__MusicsettingsAssignment_3_2_1"


    // $ANTLR start "rule__LightAction__ActionnameAssignment_2"
    // InternalMyDsl.g:4162:1: rule__LightAction__ActionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__LightAction__ActionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4166:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4167:2: ( ruleEString )
            {
            // InternalMyDsl.g:4167:2: ( ruleEString )
            // InternalMyDsl.g:4168:3: ruleEString
            {
             before(grammarAccess.getLightActionAccess().getActionnameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLightActionAccess().getActionnameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__ActionnameAssignment_2"


    // $ANTLR start "rule__LightAction__PosAssignment_4"
    // InternalMyDsl.g:4177:1: rule__LightAction__PosAssignment_4 : ( ruleLightPos ) ;
    public final void rule__LightAction__PosAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4181:1: ( ( ruleLightPos ) )
            // InternalMyDsl.g:4182:2: ( ruleLightPos )
            {
            // InternalMyDsl.g:4182:2: ( ruleLightPos )
            // InternalMyDsl.g:4183:3: ruleLightPos
            {
             before(grammarAccess.getLightActionAccess().getPosLightPosEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLightPos();

            state._fsp--;

             after(grammarAccess.getLightActionAccess().getPosLightPosEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__PosAssignment_4"


    // $ANTLR start "rule__LightAction__RedExAssignment_5_1"
    // InternalMyDsl.g:4192:1: rule__LightAction__RedExAssignment_5_1 : ( ruleExpression ) ;
    public final void rule__LightAction__RedExAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4196:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:4197:2: ( ruleExpression )
            {
            // InternalMyDsl.g:4197:2: ( ruleExpression )
            // InternalMyDsl.g:4198:3: ruleExpression
            {
             before(grammarAccess.getLightActionAccess().getRedExExpressionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLightActionAccess().getRedExExpressionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__RedExAssignment_5_1"


    // $ANTLR start "rule__LightAction__GreenExAssignment_6_1"
    // InternalMyDsl.g:4207:1: rule__LightAction__GreenExAssignment_6_1 : ( ruleExpression ) ;
    public final void rule__LightAction__GreenExAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4211:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:4212:2: ( ruleExpression )
            {
            // InternalMyDsl.g:4212:2: ( ruleExpression )
            // InternalMyDsl.g:4213:3: ruleExpression
            {
             before(grammarAccess.getLightActionAccess().getGreenExExpressionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLightActionAccess().getGreenExExpressionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__GreenExAssignment_6_1"


    // $ANTLR start "rule__LightAction__BlueExAssignment_7_1"
    // InternalMyDsl.g:4222:1: rule__LightAction__BlueExAssignment_7_1 : ( ruleExpression ) ;
    public final void rule__LightAction__BlueExAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4226:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:4227:2: ( ruleExpression )
            {
            // InternalMyDsl.g:4227:2: ( ruleExpression )
            // InternalMyDsl.g:4228:3: ruleExpression
            {
             before(grammarAccess.getLightActionAccess().getBlueExExpressionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLightActionAccess().getBlueExExpressionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightAction__BlueExAssignment_7_1"


    // $ANTLR start "rule__MusicSetting__NoteExAssignment_2"
    // InternalMyDsl.g:4237:1: rule__MusicSetting__NoteExAssignment_2 : ( ruleExpression ) ;
    public final void rule__MusicSetting__NoteExAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4241:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:4242:2: ( ruleExpression )
            {
            // InternalMyDsl.g:4242:2: ( ruleExpression )
            // InternalMyDsl.g:4243:3: ruleExpression
            {
             before(grammarAccess.getMusicSettingAccess().getNoteExExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMusicSettingAccess().getNoteExExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSetting__NoteExAssignment_2"


    // $ANTLR start "rule__MusicSetting__DurationAssignment_4"
    // InternalMyDsl.g:4252:1: rule__MusicSetting__DurationAssignment_4 : ( ruleDuration ) ;
    public final void rule__MusicSetting__DurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4256:1: ( ( ruleDuration ) )
            // InternalMyDsl.g:4257:2: ( ruleDuration )
            {
            // InternalMyDsl.g:4257:2: ( ruleDuration )
            // InternalMyDsl.g:4258:3: ruleDuration
            {
             before(grammarAccess.getMusicSettingAccess().getDurationDurationEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getMusicSettingAccess().getDurationDurationEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSetting__DurationAssignment_4"


    // $ANTLR start "rule__MusicSetting__PosExAssignment_6"
    // InternalMyDsl.g:4267:1: rule__MusicSetting__PosExAssignment_6 : ( ruleExpression ) ;
    public final void rule__MusicSetting__PosExAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4271:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:4272:2: ( ruleExpression )
            {
            // InternalMyDsl.g:4272:2: ( ruleExpression )
            // InternalMyDsl.g:4273:3: ruleExpression
            {
             before(grammarAccess.getMusicSettingAccess().getPosExExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMusicSettingAccess().getPosExExpressionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSetting__PosExAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000B8001040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000B8001042L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0001480000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000004B000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000038000L});

}