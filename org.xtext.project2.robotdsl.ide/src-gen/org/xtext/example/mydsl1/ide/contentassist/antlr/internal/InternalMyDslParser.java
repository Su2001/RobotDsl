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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NONE'", "'MEDIUM'", "'LONG'", "'TOP'", "'BOT'", "'BACKWARD'", "'LEFT'", "'RIGHT'", "'CENTER'", "'FORWARD'", "'Action:'", "'-'", "'Condition:'", "'Event'", "'condition:'", "'actions:'", "','", "'Sound'", "'Button'", "'button'", "'Sensor'", "'sensorPos'", "'Tap'", "'MotorAction'", "'motorLeft'", "'motorRight'", "'SoundAction'", "'set:'", "'LightAction'", "'pos:'", "'red:'", "'green:'", "'blue:'", "'('", "')'"
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


    // $ANTLR start "entryRuleEvent"
    // InternalMyDsl.g:78:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEvent EOF )
            // InternalMyDsl.g:80:1: ruleEvent EOF
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
    // InternalMyDsl.g:87:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Event__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Event__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Event__Group__0 )
            // InternalMyDsl.g:94:4: rule__Event__Group__0
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
    // InternalMyDsl.g:103:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleCondition EOF )
            // InternalMyDsl.g:105:1: ruleCondition EOF
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
    // InternalMyDsl.g:112:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Condition__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__Condition__Alternatives )
            // InternalMyDsl.g:119:4: rule__Condition__Alternatives
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
    // InternalMyDsl.g:128:1: entryRuleSound : ruleSound EOF ;
    public final void entryRuleSound() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleSound EOF )
            // InternalMyDsl.g:130:1: ruleSound EOF
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
    // InternalMyDsl.g:137:1: ruleSound : ( ( rule__Sound__Group__0 ) ) ;
    public final void ruleSound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Sound__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Sound__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Sound__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Sound__Group__0 )
            {
             before(grammarAccess.getSoundAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Sound__Group__0 )
            // InternalMyDsl.g:144:4: rule__Sound__Group__0
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
    // InternalMyDsl.g:153:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleButton EOF )
            // InternalMyDsl.g:155:1: ruleButton EOF
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
    // InternalMyDsl.g:162:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Button__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Button__Group__0 )
            // InternalMyDsl.g:169:4: rule__Button__Group__0
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
    // InternalMyDsl.g:178:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleSensor EOF )
            // InternalMyDsl.g:180:1: ruleSensor EOF
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
    // InternalMyDsl.g:187:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Sensor__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Sensor__Group__0 )
            // InternalMyDsl.g:194:4: rule__Sensor__Group__0
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
    // InternalMyDsl.g:203:1: entryRuleTap : ruleTap EOF ;
    public final void entryRuleTap() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleTap EOF )
            // InternalMyDsl.g:205:1: ruleTap EOF
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
    // InternalMyDsl.g:212:1: ruleTap : ( ( rule__Tap__Group__0 ) ) ;
    public final void ruleTap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Tap__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Tap__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Tap__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Tap__Group__0 )
            {
             before(grammarAccess.getTapAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Tap__Group__0 )
            // InternalMyDsl.g:219:4: rule__Tap__Group__0
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
    // InternalMyDsl.g:228:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleAction EOF )
            // InternalMyDsl.g:230:1: ruleAction EOF
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
    // InternalMyDsl.g:237:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Action__Alternatives ) )
            // InternalMyDsl.g:243:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalMyDsl.g:244:3: ( rule__Action__Alternatives )
            // InternalMyDsl.g:244:4: rule__Action__Alternatives
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
    // InternalMyDsl.g:253:1: entryRuleMotorAction : ruleMotorAction EOF ;
    public final void entryRuleMotorAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleMotorAction EOF )
            // InternalMyDsl.g:255:1: ruleMotorAction EOF
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
    // InternalMyDsl.g:262:1: ruleMotorAction : ( ( rule__MotorAction__Group__0 ) ) ;
    public final void ruleMotorAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__MotorAction__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__MotorAction__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__MotorAction__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__MotorAction__Group__0 )
            {
             before(grammarAccess.getMotorActionAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__MotorAction__Group__0 )
            // InternalMyDsl.g:269:4: rule__MotorAction__Group__0
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
    // InternalMyDsl.g:278:1: entryRuleSoundAction : ruleSoundAction EOF ;
    public final void entryRuleSoundAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleSoundAction EOF )
            // InternalMyDsl.g:280:1: ruleSoundAction EOF
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
    // InternalMyDsl.g:287:1: ruleSoundAction : ( ( rule__SoundAction__Group__0 ) ) ;
    public final void ruleSoundAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__SoundAction__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__SoundAction__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__SoundAction__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__SoundAction__Group__0 )
            {
             before(grammarAccess.getSoundActionAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__SoundAction__Group__0 )
            // InternalMyDsl.g:294:4: rule__SoundAction__Group__0
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
    // InternalMyDsl.g:303:1: entryRuleLightAction : ruleLightAction EOF ;
    public final void entryRuleLightAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleLightAction EOF )
            // InternalMyDsl.g:305:1: ruleLightAction EOF
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
    // InternalMyDsl.g:312:1: ruleLightAction : ( ( rule__LightAction__Group__0 ) ) ;
    public final void ruleLightAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__LightAction__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__LightAction__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__LightAction__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__LightAction__Group__0 )
            {
             before(grammarAccess.getLightActionAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__LightAction__Group__0 )
            // InternalMyDsl.g:319:4: rule__LightAction__Group__0
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
    // InternalMyDsl.g:328:1: entryRuleMusicSetting : ruleMusicSetting EOF ;
    public final void entryRuleMusicSetting() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleMusicSetting EOF )
            // InternalMyDsl.g:330:1: ruleMusicSetting EOF
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
    // InternalMyDsl.g:337:1: ruleMusicSetting : ( ( rule__MusicSetting__Group__0 ) ) ;
    public final void ruleMusicSetting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__MusicSetting__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__MusicSetting__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__MusicSetting__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__MusicSetting__Group__0 )
            {
             before(grammarAccess.getMusicSettingAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__MusicSetting__Group__0 )
            // InternalMyDsl.g:344:4: rule__MusicSetting__Group__0
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
    // InternalMyDsl.g:353:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleEInt EOF )
            // InternalMyDsl.g:355:1: ruleEInt EOF
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
    // InternalMyDsl.g:362:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:369:4: rule__EInt__Group__0
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
    // InternalMyDsl.g:378:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleEString EOF )
            // InternalMyDsl.g:380:1: ruleEString EOF
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
    // InternalMyDsl.g:387:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:393:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:394:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:394:4: rule__EString__Alternatives
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
    // InternalMyDsl.g:403:1: ruleDuration : ( ( rule__Duration__Alternatives ) ) ;
    public final void ruleDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:407:1: ( ( ( rule__Duration__Alternatives ) ) )
            // InternalMyDsl.g:408:2: ( ( rule__Duration__Alternatives ) )
            {
            // InternalMyDsl.g:408:2: ( ( rule__Duration__Alternatives ) )
            // InternalMyDsl.g:409:3: ( rule__Duration__Alternatives )
            {
             before(grammarAccess.getDurationAccess().getAlternatives()); 
            // InternalMyDsl.g:410:3: ( rule__Duration__Alternatives )
            // InternalMyDsl.g:410:4: rule__Duration__Alternatives
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
    // InternalMyDsl.g:419:1: ruleLightPos : ( ( rule__LightPos__Alternatives ) ) ;
    public final void ruleLightPos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:423:1: ( ( ( rule__LightPos__Alternatives ) ) )
            // InternalMyDsl.g:424:2: ( ( rule__LightPos__Alternatives ) )
            {
            // InternalMyDsl.g:424:2: ( ( rule__LightPos__Alternatives ) )
            // InternalMyDsl.g:425:3: ( rule__LightPos__Alternatives )
            {
             before(grammarAccess.getLightPosAccess().getAlternatives()); 
            // InternalMyDsl.g:426:3: ( rule__LightPos__Alternatives )
            // InternalMyDsl.g:426:4: rule__LightPos__Alternatives
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


    // $ANTLR start "ruleButtonType"
    // InternalMyDsl.g:435:1: ruleButtonType : ( ( rule__ButtonType__Alternatives ) ) ;
    public final void ruleButtonType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:439:1: ( ( ( rule__ButtonType__Alternatives ) ) )
            // InternalMyDsl.g:440:2: ( ( rule__ButtonType__Alternatives ) )
            {
            // InternalMyDsl.g:440:2: ( ( rule__ButtonType__Alternatives ) )
            // InternalMyDsl.g:441:3: ( rule__ButtonType__Alternatives )
            {
             before(grammarAccess.getButtonTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:442:3: ( rule__ButtonType__Alternatives )
            // InternalMyDsl.g:442:4: rule__ButtonType__Alternatives
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
    // InternalMyDsl.g:450:1: rule__RobotModel__Alternatives_1 : ( ( ( rule__RobotModel__EventsAssignment_1_0 ) ) | ( ( rule__RobotModel__Group_1_1__0 ) ) | ( ( rule__RobotModel__Group_1_2__0 ) ) );
    public final void rule__RobotModel__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:454:1: ( ( ( rule__RobotModel__EventsAssignment_1_0 ) ) | ( ( rule__RobotModel__Group_1_1__0 ) ) | ( ( rule__RobotModel__Group_1_2__0 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case 23:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:455:2: ( ( rule__RobotModel__EventsAssignment_1_0 ) )
                    {
                    // InternalMyDsl.g:455:2: ( ( rule__RobotModel__EventsAssignment_1_0 ) )
                    // InternalMyDsl.g:456:3: ( rule__RobotModel__EventsAssignment_1_0 )
                    {
                     before(grammarAccess.getRobotModelAccess().getEventsAssignment_1_0()); 
                    // InternalMyDsl.g:457:3: ( rule__RobotModel__EventsAssignment_1_0 )
                    // InternalMyDsl.g:457:4: rule__RobotModel__EventsAssignment_1_0
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
                    // InternalMyDsl.g:461:2: ( ( rule__RobotModel__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:461:2: ( ( rule__RobotModel__Group_1_1__0 ) )
                    // InternalMyDsl.g:462:3: ( rule__RobotModel__Group_1_1__0 )
                    {
                     before(grammarAccess.getRobotModelAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:463:3: ( rule__RobotModel__Group_1_1__0 )
                    // InternalMyDsl.g:463:4: rule__RobotModel__Group_1_1__0
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
                    // InternalMyDsl.g:467:2: ( ( rule__RobotModel__Group_1_2__0 ) )
                    {
                    // InternalMyDsl.g:467:2: ( ( rule__RobotModel__Group_1_2__0 ) )
                    // InternalMyDsl.g:468:3: ( rule__RobotModel__Group_1_2__0 )
                    {
                     before(grammarAccess.getRobotModelAccess().getGroup_1_2()); 
                    // InternalMyDsl.g:469:3: ( rule__RobotModel__Group_1_2__0 )
                    // InternalMyDsl.g:469:4: rule__RobotModel__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RobotModel__Group_1_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRobotModelAccess().getGroup_1_2()); 

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


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalMyDsl.g:477:1: rule__Condition__Alternatives : ( ( ruleButton ) | ( ruleSensor ) | ( ruleSound ) | ( ruleTap ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:481:1: ( ( ruleButton ) | ( ruleSensor ) | ( ruleSound ) | ( ruleTap ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt2=1;
                }
                break;
            case 31:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 33:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:482:2: ( ruleButton )
                    {
                    // InternalMyDsl.g:482:2: ( ruleButton )
                    // InternalMyDsl.g:483:3: ruleButton
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
                    // InternalMyDsl.g:488:2: ( ruleSensor )
                    {
                    // InternalMyDsl.g:488:2: ( ruleSensor )
                    // InternalMyDsl.g:489:3: ruleSensor
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
                    // InternalMyDsl.g:494:2: ( ruleSound )
                    {
                    // InternalMyDsl.g:494:2: ( ruleSound )
                    // InternalMyDsl.g:495:3: ruleSound
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
                    // InternalMyDsl.g:500:2: ( ruleTap )
                    {
                    // InternalMyDsl.g:500:2: ( ruleTap )
                    // InternalMyDsl.g:501:3: ruleTap
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
    // InternalMyDsl.g:510:1: rule__Action__Alternatives : ( ( ruleMotorAction ) | ( ruleSoundAction ) | ( ruleLightAction ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:514:1: ( ( ruleMotorAction ) | ( ruleSoundAction ) | ( ruleLightAction ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt3=1;
                }
                break;
            case 37:
                {
                alt3=2;
                }
                break;
            case 39:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:515:2: ( ruleMotorAction )
                    {
                    // InternalMyDsl.g:515:2: ( ruleMotorAction )
                    // InternalMyDsl.g:516:3: ruleMotorAction
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
                    // InternalMyDsl.g:521:2: ( ruleSoundAction )
                    {
                    // InternalMyDsl.g:521:2: ( ruleSoundAction )
                    // InternalMyDsl.g:522:3: ruleSoundAction
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
                    // InternalMyDsl.g:527:2: ( ruleLightAction )
                    {
                    // InternalMyDsl.g:527:2: ( ruleLightAction )
                    // InternalMyDsl.g:528:3: ruleLightAction
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
    // InternalMyDsl.g:537:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:542:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:542:2: ( RULE_STRING )
                    // InternalMyDsl.g:543:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:548:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:548:2: ( RULE_ID )
                    // InternalMyDsl.g:549:3: RULE_ID
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
    // InternalMyDsl.g:558:1: rule__Duration__Alternatives : ( ( ( 'NONE' ) ) | ( ( 'MEDIUM' ) ) | ( ( 'LONG' ) ) );
    public final void rule__Duration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:562:1: ( ( ( 'NONE' ) ) | ( ( 'MEDIUM' ) ) | ( ( 'LONG' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:563:2: ( ( 'NONE' ) )
                    {
                    // InternalMyDsl.g:563:2: ( ( 'NONE' ) )
                    // InternalMyDsl.g:564:3: ( 'NONE' )
                    {
                     before(grammarAccess.getDurationAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:565:3: ( 'NONE' )
                    // InternalMyDsl.g:565:4: 'NONE'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getDurationAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:569:2: ( ( 'MEDIUM' ) )
                    {
                    // InternalMyDsl.g:569:2: ( ( 'MEDIUM' ) )
                    // InternalMyDsl.g:570:3: ( 'MEDIUM' )
                    {
                     before(grammarAccess.getDurationAccess().getMEDIUMEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:571:3: ( 'MEDIUM' )
                    // InternalMyDsl.g:571:4: 'MEDIUM'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getDurationAccess().getMEDIUMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:575:2: ( ( 'LONG' ) )
                    {
                    // InternalMyDsl.g:575:2: ( ( 'LONG' ) )
                    // InternalMyDsl.g:576:3: ( 'LONG' )
                    {
                     before(grammarAccess.getDurationAccess().getLONGEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:577:3: ( 'LONG' )
                    // InternalMyDsl.g:577:4: 'LONG'
                    {
                    match(input,13,FOLLOW_2); 

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
    // InternalMyDsl.g:585:1: rule__LightPos__Alternatives : ( ( ( 'TOP' ) ) | ( ( 'BOT' ) ) );
    public final void rule__LightPos__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:589:1: ( ( ( 'TOP' ) ) | ( ( 'BOT' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:590:2: ( ( 'TOP' ) )
                    {
                    // InternalMyDsl.g:590:2: ( ( 'TOP' ) )
                    // InternalMyDsl.g:591:3: ( 'TOP' )
                    {
                     before(grammarAccess.getLightPosAccess().getTOPEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:592:3: ( 'TOP' )
                    // InternalMyDsl.g:592:4: 'TOP'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getLightPosAccess().getTOPEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:596:2: ( ( 'BOT' ) )
                    {
                    // InternalMyDsl.g:596:2: ( ( 'BOT' ) )
                    // InternalMyDsl.g:597:3: ( 'BOT' )
                    {
                     before(grammarAccess.getLightPosAccess().getBOTEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:598:3: ( 'BOT' )
                    // InternalMyDsl.g:598:4: 'BOT'
                    {
                    match(input,15,FOLLOW_2); 

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


    // $ANTLR start "rule__ButtonType__Alternatives"
    // InternalMyDsl.g:606:1: rule__ButtonType__Alternatives : ( ( ( 'BACKWARD' ) ) | ( ( 'LEFT' ) ) | ( ( 'RIGHT' ) ) | ( ( 'CENTER' ) ) | ( ( 'FORWARD' ) ) );
    public final void rule__ButtonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:610:1: ( ( ( 'BACKWARD' ) ) | ( ( 'LEFT' ) ) | ( ( 'RIGHT' ) ) | ( ( 'CENTER' ) ) | ( ( 'FORWARD' ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            case 19:
                {
                alt7=4;
                }
                break;
            case 20:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:611:2: ( ( 'BACKWARD' ) )
                    {
                    // InternalMyDsl.g:611:2: ( ( 'BACKWARD' ) )
                    // InternalMyDsl.g:612:3: ( 'BACKWARD' )
                    {
                     before(grammarAccess.getButtonTypeAccess().getBACKWARDEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:613:3: ( 'BACKWARD' )
                    // InternalMyDsl.g:613:4: 'BACKWARD'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getButtonTypeAccess().getBACKWARDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:617:2: ( ( 'LEFT' ) )
                    {
                    // InternalMyDsl.g:617:2: ( ( 'LEFT' ) )
                    // InternalMyDsl.g:618:3: ( 'LEFT' )
                    {
                     before(grammarAccess.getButtonTypeAccess().getLEFTEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:619:3: ( 'LEFT' )
                    // InternalMyDsl.g:619:4: 'LEFT'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getButtonTypeAccess().getLEFTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:623:2: ( ( 'RIGHT' ) )
                    {
                    // InternalMyDsl.g:623:2: ( ( 'RIGHT' ) )
                    // InternalMyDsl.g:624:3: ( 'RIGHT' )
                    {
                     before(grammarAccess.getButtonTypeAccess().getRIGHTEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:625:3: ( 'RIGHT' )
                    // InternalMyDsl.g:625:4: 'RIGHT'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getButtonTypeAccess().getRIGHTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:629:2: ( ( 'CENTER' ) )
                    {
                    // InternalMyDsl.g:629:2: ( ( 'CENTER' ) )
                    // InternalMyDsl.g:630:3: ( 'CENTER' )
                    {
                     before(grammarAccess.getButtonTypeAccess().getCENTEREnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:631:3: ( 'CENTER' )
                    // InternalMyDsl.g:631:4: 'CENTER'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getButtonTypeAccess().getCENTEREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:635:2: ( ( 'FORWARD' ) )
                    {
                    // InternalMyDsl.g:635:2: ( ( 'FORWARD' ) )
                    // InternalMyDsl.g:636:3: ( 'FORWARD' )
                    {
                     before(grammarAccess.getButtonTypeAccess().getFORWARDEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:637:3: ( 'FORWARD' )
                    // InternalMyDsl.g:637:4: 'FORWARD'
                    {
                    match(input,20,FOLLOW_2); 

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
    // InternalMyDsl.g:645:1: rule__RobotModel__Group__0 : rule__RobotModel__Group__0__Impl rule__RobotModel__Group__1 ;
    public final void rule__RobotModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:649:1: ( rule__RobotModel__Group__0__Impl rule__RobotModel__Group__1 )
            // InternalMyDsl.g:650:2: rule__RobotModel__Group__0__Impl rule__RobotModel__Group__1
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
    // InternalMyDsl.g:657:1: rule__RobotModel__Group__0__Impl : ( () ) ;
    public final void rule__RobotModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:661:1: ( ( () ) )
            // InternalMyDsl.g:662:1: ( () )
            {
            // InternalMyDsl.g:662:1: ( () )
            // InternalMyDsl.g:663:2: ()
            {
             before(grammarAccess.getRobotModelAccess().getRobotModelAction_0()); 
            // InternalMyDsl.g:664:2: ()
            // InternalMyDsl.g:664:3: 
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
    // InternalMyDsl.g:672:1: rule__RobotModel__Group__1 : rule__RobotModel__Group__1__Impl ;
    public final void rule__RobotModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:676:1: ( rule__RobotModel__Group__1__Impl )
            // InternalMyDsl.g:677:2: rule__RobotModel__Group__1__Impl
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
    // InternalMyDsl.g:683:1: rule__RobotModel__Group__1__Impl : ( ( rule__RobotModel__Alternatives_1 )* ) ;
    public final void rule__RobotModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:687:1: ( ( ( rule__RobotModel__Alternatives_1 )* ) )
            // InternalMyDsl.g:688:1: ( ( rule__RobotModel__Alternatives_1 )* )
            {
            // InternalMyDsl.g:688:1: ( ( rule__RobotModel__Alternatives_1 )* )
            // InternalMyDsl.g:689:2: ( rule__RobotModel__Alternatives_1 )*
            {
             before(grammarAccess.getRobotModelAccess().getAlternatives_1()); 
            // InternalMyDsl.g:690:2: ( rule__RobotModel__Alternatives_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21||(LA8_0>=23 && LA8_0<=24)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:690:3: rule__RobotModel__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__RobotModel__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalMyDsl.g:699:1: rule__RobotModel__Group_1_1__0 : rule__RobotModel__Group_1_1__0__Impl rule__RobotModel__Group_1_1__1 ;
    public final void rule__RobotModel__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:703:1: ( rule__RobotModel__Group_1_1__0__Impl rule__RobotModel__Group_1_1__1 )
            // InternalMyDsl.g:704:2: rule__RobotModel__Group_1_1__0__Impl rule__RobotModel__Group_1_1__1
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
    // InternalMyDsl.g:711:1: rule__RobotModel__Group_1_1__0__Impl : ( 'Action:' ) ;
    public final void rule__RobotModel__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:715:1: ( ( 'Action:' ) )
            // InternalMyDsl.g:716:1: ( 'Action:' )
            {
            // InternalMyDsl.g:716:1: ( 'Action:' )
            // InternalMyDsl.g:717:2: 'Action:'
            {
             before(grammarAccess.getRobotModelAccess().getActionKeyword_1_1_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:726:1: rule__RobotModel__Group_1_1__1 : rule__RobotModel__Group_1_1__1__Impl rule__RobotModel__Group_1_1__2 ;
    public final void rule__RobotModel__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:730:1: ( rule__RobotModel__Group_1_1__1__Impl rule__RobotModel__Group_1_1__2 )
            // InternalMyDsl.g:731:2: rule__RobotModel__Group_1_1__1__Impl rule__RobotModel__Group_1_1__2
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
    // InternalMyDsl.g:738:1: rule__RobotModel__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__RobotModel__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:742:1: ( ( '-' ) )
            // InternalMyDsl.g:743:1: ( '-' )
            {
            // InternalMyDsl.g:743:1: ( '-' )
            // InternalMyDsl.g:744:2: '-'
            {
             before(grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_1_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:753:1: rule__RobotModel__Group_1_1__2 : rule__RobotModel__Group_1_1__2__Impl rule__RobotModel__Group_1_1__3 ;
    public final void rule__RobotModel__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:757:1: ( rule__RobotModel__Group_1_1__2__Impl rule__RobotModel__Group_1_1__3 )
            // InternalMyDsl.g:758:2: rule__RobotModel__Group_1_1__2__Impl rule__RobotModel__Group_1_1__3
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
    // InternalMyDsl.g:765:1: rule__RobotModel__Group_1_1__2__Impl : ( ( rule__RobotModel__ActionsAssignment_1_1_2 ) ) ;
    public final void rule__RobotModel__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:769:1: ( ( ( rule__RobotModel__ActionsAssignment_1_1_2 ) ) )
            // InternalMyDsl.g:770:1: ( ( rule__RobotModel__ActionsAssignment_1_1_2 ) )
            {
            // InternalMyDsl.g:770:1: ( ( rule__RobotModel__ActionsAssignment_1_1_2 ) )
            // InternalMyDsl.g:771:2: ( rule__RobotModel__ActionsAssignment_1_1_2 )
            {
             before(grammarAccess.getRobotModelAccess().getActionsAssignment_1_1_2()); 
            // InternalMyDsl.g:772:2: ( rule__RobotModel__ActionsAssignment_1_1_2 )
            // InternalMyDsl.g:772:3: rule__RobotModel__ActionsAssignment_1_1_2
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
    // InternalMyDsl.g:780:1: rule__RobotModel__Group_1_1__3 : rule__RobotModel__Group_1_1__3__Impl ;
    public final void rule__RobotModel__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:784:1: ( rule__RobotModel__Group_1_1__3__Impl )
            // InternalMyDsl.g:785:2: rule__RobotModel__Group_1_1__3__Impl
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
    // InternalMyDsl.g:791:1: rule__RobotModel__Group_1_1__3__Impl : ( ( rule__RobotModel__Group_1_1_3__0 )* ) ;
    public final void rule__RobotModel__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:795:1: ( ( ( rule__RobotModel__Group_1_1_3__0 )* ) )
            // InternalMyDsl.g:796:1: ( ( rule__RobotModel__Group_1_1_3__0 )* )
            {
            // InternalMyDsl.g:796:1: ( ( rule__RobotModel__Group_1_1_3__0 )* )
            // InternalMyDsl.g:797:2: ( rule__RobotModel__Group_1_1_3__0 )*
            {
             before(grammarAccess.getRobotModelAccess().getGroup_1_1_3()); 
            // InternalMyDsl.g:798:2: ( rule__RobotModel__Group_1_1_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:798:3: rule__RobotModel__Group_1_1_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RobotModel__Group_1_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalMyDsl.g:807:1: rule__RobotModel__Group_1_1_3__0 : rule__RobotModel__Group_1_1_3__0__Impl rule__RobotModel__Group_1_1_3__1 ;
    public final void rule__RobotModel__Group_1_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:811:1: ( rule__RobotModel__Group_1_1_3__0__Impl rule__RobotModel__Group_1_1_3__1 )
            // InternalMyDsl.g:812:2: rule__RobotModel__Group_1_1_3__0__Impl rule__RobotModel__Group_1_1_3__1
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
    // InternalMyDsl.g:819:1: rule__RobotModel__Group_1_1_3__0__Impl : ( '-' ) ;
    public final void rule__RobotModel__Group_1_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:823:1: ( ( '-' ) )
            // InternalMyDsl.g:824:1: ( '-' )
            {
            // InternalMyDsl.g:824:1: ( '-' )
            // InternalMyDsl.g:825:2: '-'
            {
             before(grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_1_3_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:834:1: rule__RobotModel__Group_1_1_3__1 : rule__RobotModel__Group_1_1_3__1__Impl ;
    public final void rule__RobotModel__Group_1_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:838:1: ( rule__RobotModel__Group_1_1_3__1__Impl )
            // InternalMyDsl.g:839:2: rule__RobotModel__Group_1_1_3__1__Impl
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
    // InternalMyDsl.g:845:1: rule__RobotModel__Group_1_1_3__1__Impl : ( ( rule__RobotModel__ActionsAssignment_1_1_3_1 ) ) ;
    public final void rule__RobotModel__Group_1_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:849:1: ( ( ( rule__RobotModel__ActionsAssignment_1_1_3_1 ) ) )
            // InternalMyDsl.g:850:1: ( ( rule__RobotModel__ActionsAssignment_1_1_3_1 ) )
            {
            // InternalMyDsl.g:850:1: ( ( rule__RobotModel__ActionsAssignment_1_1_3_1 ) )
            // InternalMyDsl.g:851:2: ( rule__RobotModel__ActionsAssignment_1_1_3_1 )
            {
             before(grammarAccess.getRobotModelAccess().getActionsAssignment_1_1_3_1()); 
            // InternalMyDsl.g:852:2: ( rule__RobotModel__ActionsAssignment_1_1_3_1 )
            // InternalMyDsl.g:852:3: rule__RobotModel__ActionsAssignment_1_1_3_1
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
    // InternalMyDsl.g:861:1: rule__RobotModel__Group_1_2__0 : rule__RobotModel__Group_1_2__0__Impl rule__RobotModel__Group_1_2__1 ;
    public final void rule__RobotModel__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:865:1: ( rule__RobotModel__Group_1_2__0__Impl rule__RobotModel__Group_1_2__1 )
            // InternalMyDsl.g:866:2: rule__RobotModel__Group_1_2__0__Impl rule__RobotModel__Group_1_2__1
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
    // InternalMyDsl.g:873:1: rule__RobotModel__Group_1_2__0__Impl : ( 'Condition:' ) ;
    public final void rule__RobotModel__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:877:1: ( ( 'Condition:' ) )
            // InternalMyDsl.g:878:1: ( 'Condition:' )
            {
            // InternalMyDsl.g:878:1: ( 'Condition:' )
            // InternalMyDsl.g:879:2: 'Condition:'
            {
             before(grammarAccess.getRobotModelAccess().getConditionKeyword_1_2_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalMyDsl.g:888:1: rule__RobotModel__Group_1_2__1 : rule__RobotModel__Group_1_2__1__Impl rule__RobotModel__Group_1_2__2 ;
    public final void rule__RobotModel__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:892:1: ( rule__RobotModel__Group_1_2__1__Impl rule__RobotModel__Group_1_2__2 )
            // InternalMyDsl.g:893:2: rule__RobotModel__Group_1_2__1__Impl rule__RobotModel__Group_1_2__2
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
    // InternalMyDsl.g:900:1: rule__RobotModel__Group_1_2__1__Impl : ( '-' ) ;
    public final void rule__RobotModel__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:904:1: ( ( '-' ) )
            // InternalMyDsl.g:905:1: ( '-' )
            {
            // InternalMyDsl.g:905:1: ( '-' )
            // InternalMyDsl.g:906:2: '-'
            {
             before(grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_2_1()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:915:1: rule__RobotModel__Group_1_2__2 : rule__RobotModel__Group_1_2__2__Impl rule__RobotModel__Group_1_2__3 ;
    public final void rule__RobotModel__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:919:1: ( rule__RobotModel__Group_1_2__2__Impl rule__RobotModel__Group_1_2__3 )
            // InternalMyDsl.g:920:2: rule__RobotModel__Group_1_2__2__Impl rule__RobotModel__Group_1_2__3
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
    // InternalMyDsl.g:927:1: rule__RobotModel__Group_1_2__2__Impl : ( ( rule__RobotModel__ConditionsAssignment_1_2_2 ) ) ;
    public final void rule__RobotModel__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:931:1: ( ( ( rule__RobotModel__ConditionsAssignment_1_2_2 ) ) )
            // InternalMyDsl.g:932:1: ( ( rule__RobotModel__ConditionsAssignment_1_2_2 ) )
            {
            // InternalMyDsl.g:932:1: ( ( rule__RobotModel__ConditionsAssignment_1_2_2 ) )
            // InternalMyDsl.g:933:2: ( rule__RobotModel__ConditionsAssignment_1_2_2 )
            {
             before(grammarAccess.getRobotModelAccess().getConditionsAssignment_1_2_2()); 
            // InternalMyDsl.g:934:2: ( rule__RobotModel__ConditionsAssignment_1_2_2 )
            // InternalMyDsl.g:934:3: rule__RobotModel__ConditionsAssignment_1_2_2
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
    // InternalMyDsl.g:942:1: rule__RobotModel__Group_1_2__3 : rule__RobotModel__Group_1_2__3__Impl ;
    public final void rule__RobotModel__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:946:1: ( rule__RobotModel__Group_1_2__3__Impl )
            // InternalMyDsl.g:947:2: rule__RobotModel__Group_1_2__3__Impl
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
    // InternalMyDsl.g:953:1: rule__RobotModel__Group_1_2__3__Impl : ( ( rule__RobotModel__Group_1_2_3__0 )* ) ;
    public final void rule__RobotModel__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:957:1: ( ( ( rule__RobotModel__Group_1_2_3__0 )* ) )
            // InternalMyDsl.g:958:1: ( ( rule__RobotModel__Group_1_2_3__0 )* )
            {
            // InternalMyDsl.g:958:1: ( ( rule__RobotModel__Group_1_2_3__0 )* )
            // InternalMyDsl.g:959:2: ( rule__RobotModel__Group_1_2_3__0 )*
            {
             before(grammarAccess.getRobotModelAccess().getGroup_1_2_3()); 
            // InternalMyDsl.g:960:2: ( rule__RobotModel__Group_1_2_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:960:3: rule__RobotModel__Group_1_2_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RobotModel__Group_1_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // InternalMyDsl.g:969:1: rule__RobotModel__Group_1_2_3__0 : rule__RobotModel__Group_1_2_3__0__Impl rule__RobotModel__Group_1_2_3__1 ;
    public final void rule__RobotModel__Group_1_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:973:1: ( rule__RobotModel__Group_1_2_3__0__Impl rule__RobotModel__Group_1_2_3__1 )
            // InternalMyDsl.g:974:2: rule__RobotModel__Group_1_2_3__0__Impl rule__RobotModel__Group_1_2_3__1
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
    // InternalMyDsl.g:981:1: rule__RobotModel__Group_1_2_3__0__Impl : ( '-' ) ;
    public final void rule__RobotModel__Group_1_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:985:1: ( ( '-' ) )
            // InternalMyDsl.g:986:1: ( '-' )
            {
            // InternalMyDsl.g:986:1: ( '-' )
            // InternalMyDsl.g:987:2: '-'
            {
             before(grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_2_3_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalMyDsl.g:996:1: rule__RobotModel__Group_1_2_3__1 : rule__RobotModel__Group_1_2_3__1__Impl ;
    public final void rule__RobotModel__Group_1_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1000:1: ( rule__RobotModel__Group_1_2_3__1__Impl )
            // InternalMyDsl.g:1001:2: rule__RobotModel__Group_1_2_3__1__Impl
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
    // InternalMyDsl.g:1007:1: rule__RobotModel__Group_1_2_3__1__Impl : ( ( rule__RobotModel__ConditionsAssignment_1_2_3_1 ) ) ;
    public final void rule__RobotModel__Group_1_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1011:1: ( ( ( rule__RobotModel__ConditionsAssignment_1_2_3_1 ) ) )
            // InternalMyDsl.g:1012:1: ( ( rule__RobotModel__ConditionsAssignment_1_2_3_1 ) )
            {
            // InternalMyDsl.g:1012:1: ( ( rule__RobotModel__ConditionsAssignment_1_2_3_1 ) )
            // InternalMyDsl.g:1013:2: ( rule__RobotModel__ConditionsAssignment_1_2_3_1 )
            {
             before(grammarAccess.getRobotModelAccess().getConditionsAssignment_1_2_3_1()); 
            // InternalMyDsl.g:1014:2: ( rule__RobotModel__ConditionsAssignment_1_2_3_1 )
            // InternalMyDsl.g:1014:3: rule__RobotModel__ConditionsAssignment_1_2_3_1
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


    // $ANTLR start "rule__Event__Group__0"
    // InternalMyDsl.g:1023:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1027:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalMyDsl.g:1028:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalMyDsl.g:1035:1: rule__Event__Group__0__Impl : ( () ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1039:1: ( ( () ) )
            // InternalMyDsl.g:1040:1: ( () )
            {
            // InternalMyDsl.g:1040:1: ( () )
            // InternalMyDsl.g:1041:2: ()
            {
             before(grammarAccess.getEventAccess().getEventAction_0()); 
            // InternalMyDsl.g:1042:2: ()
            // InternalMyDsl.g:1042:3: 
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
    // InternalMyDsl.g:1050:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1054:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalMyDsl.g:1055:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1062:1: rule__Event__Group__1__Impl : ( 'Event' ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1066:1: ( ( 'Event' ) )
            // InternalMyDsl.g:1067:1: ( 'Event' )
            {
            // InternalMyDsl.g:1067:1: ( 'Event' )
            // InternalMyDsl.g:1068:2: 'Event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMyDsl.g:1077:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1081:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // InternalMyDsl.g:1082:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1089:1: rule__Event__Group__2__Impl : ( ( rule__Event__NameAssignment_2 ) ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1093:1: ( ( ( rule__Event__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1094:1: ( ( rule__Event__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1094:1: ( ( rule__Event__NameAssignment_2 ) )
            // InternalMyDsl.g:1095:2: ( rule__Event__NameAssignment_2 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1096:2: ( rule__Event__NameAssignment_2 )
            // InternalMyDsl.g:1096:3: rule__Event__NameAssignment_2
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
    // InternalMyDsl.g:1104:1: rule__Event__Group__3 : rule__Event__Group__3__Impl rule__Event__Group__4 ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1108:1: ( rule__Event__Group__3__Impl rule__Event__Group__4 )
            // InternalMyDsl.g:1109:2: rule__Event__Group__3__Impl rule__Event__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:1116:1: rule__Event__Group__3__Impl : ( ( rule__Event__Group_3__0 )? ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1120:1: ( ( ( rule__Event__Group_3__0 )? ) )
            // InternalMyDsl.g:1121:1: ( ( rule__Event__Group_3__0 )? )
            {
            // InternalMyDsl.g:1121:1: ( ( rule__Event__Group_3__0 )? )
            // InternalMyDsl.g:1122:2: ( rule__Event__Group_3__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_3()); 
            // InternalMyDsl.g:1123:2: ( rule__Event__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1123:3: rule__Event__Group_3__0
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
    // InternalMyDsl.g:1131:1: rule__Event__Group__4 : rule__Event__Group__4__Impl ;
    public final void rule__Event__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1135:1: ( rule__Event__Group__4__Impl )
            // InternalMyDsl.g:1136:2: rule__Event__Group__4__Impl
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
    // InternalMyDsl.g:1142:1: rule__Event__Group__4__Impl : ( ( rule__Event__Group_4__0 )? ) ;
    public final void rule__Event__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1146:1: ( ( ( rule__Event__Group_4__0 )? ) )
            // InternalMyDsl.g:1147:1: ( ( rule__Event__Group_4__0 )? )
            {
            // InternalMyDsl.g:1147:1: ( ( rule__Event__Group_4__0 )? )
            // InternalMyDsl.g:1148:2: ( rule__Event__Group_4__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_4()); 
            // InternalMyDsl.g:1149:2: ( rule__Event__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1149:3: rule__Event__Group_4__0
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
    // InternalMyDsl.g:1158:1: rule__Event__Group_3__0 : rule__Event__Group_3__0__Impl rule__Event__Group_3__1 ;
    public final void rule__Event__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1162:1: ( rule__Event__Group_3__0__Impl rule__Event__Group_3__1 )
            // InternalMyDsl.g:1163:2: rule__Event__Group_3__0__Impl rule__Event__Group_3__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1170:1: rule__Event__Group_3__0__Impl : ( 'condition:' ) ;
    public final void rule__Event__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1174:1: ( ( 'condition:' ) )
            // InternalMyDsl.g:1175:1: ( 'condition:' )
            {
            // InternalMyDsl.g:1175:1: ( 'condition:' )
            // InternalMyDsl.g:1176:2: 'condition:'
            {
             before(grammarAccess.getEventAccess().getConditionKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getConditionKeyword_3_0()); 

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
    // InternalMyDsl.g:1185:1: rule__Event__Group_3__1 : rule__Event__Group_3__1__Impl ;
    public final void rule__Event__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1189:1: ( rule__Event__Group_3__1__Impl )
            // InternalMyDsl.g:1190:2: rule__Event__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_3__1__Impl();

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
    // InternalMyDsl.g:1196:1: rule__Event__Group_3__1__Impl : ( ( rule__Event__ConditionAssignment_3_1 ) ) ;
    public final void rule__Event__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1200:1: ( ( ( rule__Event__ConditionAssignment_3_1 ) ) )
            // InternalMyDsl.g:1201:1: ( ( rule__Event__ConditionAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1201:1: ( ( rule__Event__ConditionAssignment_3_1 ) )
            // InternalMyDsl.g:1202:2: ( rule__Event__ConditionAssignment_3_1 )
            {
             before(grammarAccess.getEventAccess().getConditionAssignment_3_1()); 
            // InternalMyDsl.g:1203:2: ( rule__Event__ConditionAssignment_3_1 )
            // InternalMyDsl.g:1203:3: rule__Event__ConditionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__ConditionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getConditionAssignment_3_1()); 

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


    // $ANTLR start "rule__Event__Group_4__0"
    // InternalMyDsl.g:1212:1: rule__Event__Group_4__0 : rule__Event__Group_4__0__Impl rule__Event__Group_4__1 ;
    public final void rule__Event__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:1: ( rule__Event__Group_4__0__Impl rule__Event__Group_4__1 )
            // InternalMyDsl.g:1217:2: rule__Event__Group_4__0__Impl rule__Event__Group_4__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1224:1: rule__Event__Group_4__0__Impl : ( 'actions:' ) ;
    public final void rule__Event__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1228:1: ( ( 'actions:' ) )
            // InternalMyDsl.g:1229:1: ( 'actions:' )
            {
            // InternalMyDsl.g:1229:1: ( 'actions:' )
            // InternalMyDsl.g:1230:2: 'actions:'
            {
             before(grammarAccess.getEventAccess().getActionsKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalMyDsl.g:1239:1: rule__Event__Group_4__1 : rule__Event__Group_4__1__Impl rule__Event__Group_4__2 ;
    public final void rule__Event__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1243:1: ( rule__Event__Group_4__1__Impl rule__Event__Group_4__2 )
            // InternalMyDsl.g:1244:2: rule__Event__Group_4__1__Impl rule__Event__Group_4__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:1251:1: rule__Event__Group_4__1__Impl : ( ( rule__Event__ActionsAssignment_4_1 ) ) ;
    public final void rule__Event__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1255:1: ( ( ( rule__Event__ActionsAssignment_4_1 ) ) )
            // InternalMyDsl.g:1256:1: ( ( rule__Event__ActionsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1256:1: ( ( rule__Event__ActionsAssignment_4_1 ) )
            // InternalMyDsl.g:1257:2: ( rule__Event__ActionsAssignment_4_1 )
            {
             before(grammarAccess.getEventAccess().getActionsAssignment_4_1()); 
            // InternalMyDsl.g:1258:2: ( rule__Event__ActionsAssignment_4_1 )
            // InternalMyDsl.g:1258:3: rule__Event__ActionsAssignment_4_1
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
    // InternalMyDsl.g:1266:1: rule__Event__Group_4__2 : rule__Event__Group_4__2__Impl ;
    public final void rule__Event__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1270:1: ( rule__Event__Group_4__2__Impl )
            // InternalMyDsl.g:1271:2: rule__Event__Group_4__2__Impl
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
    // InternalMyDsl.g:1277:1: rule__Event__Group_4__2__Impl : ( ( rule__Event__Group_4_2__0 )* ) ;
    public final void rule__Event__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1281:1: ( ( ( rule__Event__Group_4_2__0 )* ) )
            // InternalMyDsl.g:1282:1: ( ( rule__Event__Group_4_2__0 )* )
            {
            // InternalMyDsl.g:1282:1: ( ( rule__Event__Group_4_2__0 )* )
            // InternalMyDsl.g:1283:2: ( rule__Event__Group_4_2__0 )*
            {
             before(grammarAccess.getEventAccess().getGroup_4_2()); 
            // InternalMyDsl.g:1284:2: ( rule__Event__Group_4_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==27) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1284:3: rule__Event__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Event__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalMyDsl.g:1293:1: rule__Event__Group_4_2__0 : rule__Event__Group_4_2__0__Impl rule__Event__Group_4_2__1 ;
    public final void rule__Event__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1297:1: ( rule__Event__Group_4_2__0__Impl rule__Event__Group_4_2__1 )
            // InternalMyDsl.g:1298:2: rule__Event__Group_4_2__0__Impl rule__Event__Group_4_2__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1305:1: rule__Event__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1309:1: ( ( ',' ) )
            // InternalMyDsl.g:1310:1: ( ',' )
            {
            // InternalMyDsl.g:1310:1: ( ',' )
            // InternalMyDsl.g:1311:2: ','
            {
             before(grammarAccess.getEventAccess().getCommaKeyword_4_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:1320:1: rule__Event__Group_4_2__1 : rule__Event__Group_4_2__1__Impl ;
    public final void rule__Event__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1324:1: ( rule__Event__Group_4_2__1__Impl )
            // InternalMyDsl.g:1325:2: rule__Event__Group_4_2__1__Impl
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
    // InternalMyDsl.g:1331:1: rule__Event__Group_4_2__1__Impl : ( ( rule__Event__ActionsAssignment_4_2_1 ) ) ;
    public final void rule__Event__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1335:1: ( ( ( rule__Event__ActionsAssignment_4_2_1 ) ) )
            // InternalMyDsl.g:1336:1: ( ( rule__Event__ActionsAssignment_4_2_1 ) )
            {
            // InternalMyDsl.g:1336:1: ( ( rule__Event__ActionsAssignment_4_2_1 ) )
            // InternalMyDsl.g:1337:2: ( rule__Event__ActionsAssignment_4_2_1 )
            {
             before(grammarAccess.getEventAccess().getActionsAssignment_4_2_1()); 
            // InternalMyDsl.g:1338:2: ( rule__Event__ActionsAssignment_4_2_1 )
            // InternalMyDsl.g:1338:3: rule__Event__ActionsAssignment_4_2_1
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
    // InternalMyDsl.g:1347:1: rule__Sound__Group__0 : rule__Sound__Group__0__Impl rule__Sound__Group__1 ;
    public final void rule__Sound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1351:1: ( rule__Sound__Group__0__Impl rule__Sound__Group__1 )
            // InternalMyDsl.g:1352:2: rule__Sound__Group__0__Impl rule__Sound__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1359:1: rule__Sound__Group__0__Impl : ( () ) ;
    public final void rule__Sound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1363:1: ( ( () ) )
            // InternalMyDsl.g:1364:1: ( () )
            {
            // InternalMyDsl.g:1364:1: ( () )
            // InternalMyDsl.g:1365:2: ()
            {
             before(grammarAccess.getSoundAccess().getSoundAction_0()); 
            // InternalMyDsl.g:1366:2: ()
            // InternalMyDsl.g:1366:3: 
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
    // InternalMyDsl.g:1374:1: rule__Sound__Group__1 : rule__Sound__Group__1__Impl rule__Sound__Group__2 ;
    public final void rule__Sound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1378:1: ( rule__Sound__Group__1__Impl rule__Sound__Group__2 )
            // InternalMyDsl.g:1379:2: rule__Sound__Group__1__Impl rule__Sound__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1386:1: rule__Sound__Group__1__Impl : ( 'Sound' ) ;
    public final void rule__Sound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1390:1: ( ( 'Sound' ) )
            // InternalMyDsl.g:1391:1: ( 'Sound' )
            {
            // InternalMyDsl.g:1391:1: ( 'Sound' )
            // InternalMyDsl.g:1392:2: 'Sound'
            {
             before(grammarAccess.getSoundAccess().getSoundKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // InternalMyDsl.g:1401:1: rule__Sound__Group__2 : rule__Sound__Group__2__Impl ;
    public final void rule__Sound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1405:1: ( rule__Sound__Group__2__Impl )
            // InternalMyDsl.g:1406:2: rule__Sound__Group__2__Impl
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
    // InternalMyDsl.g:1412:1: rule__Sound__Group__2__Impl : ( ( rule__Sound__ConditionnameAssignment_2 ) ) ;
    public final void rule__Sound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1416:1: ( ( ( rule__Sound__ConditionnameAssignment_2 ) ) )
            // InternalMyDsl.g:1417:1: ( ( rule__Sound__ConditionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:1417:1: ( ( rule__Sound__ConditionnameAssignment_2 ) )
            // InternalMyDsl.g:1418:2: ( rule__Sound__ConditionnameAssignment_2 )
            {
             before(grammarAccess.getSoundAccess().getConditionnameAssignment_2()); 
            // InternalMyDsl.g:1419:2: ( rule__Sound__ConditionnameAssignment_2 )
            // InternalMyDsl.g:1419:3: rule__Sound__ConditionnameAssignment_2
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
    // InternalMyDsl.g:1428:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1432:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalMyDsl.g:1433:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1440:1: rule__Button__Group__0__Impl : ( () ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1444:1: ( ( () ) )
            // InternalMyDsl.g:1445:1: ( () )
            {
            // InternalMyDsl.g:1445:1: ( () )
            // InternalMyDsl.g:1446:2: ()
            {
             before(grammarAccess.getButtonAccess().getButtonAction_0()); 
            // InternalMyDsl.g:1447:2: ()
            // InternalMyDsl.g:1447:3: 
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
    // InternalMyDsl.g:1455:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1459:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalMyDsl.g:1460:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1467:1: rule__Button__Group__1__Impl : ( 'Button' ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1471:1: ( ( 'Button' ) )
            // InternalMyDsl.g:1472:1: ( 'Button' )
            {
            // InternalMyDsl.g:1472:1: ( 'Button' )
            // InternalMyDsl.g:1473:2: 'Button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalMyDsl.g:1482:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1486:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalMyDsl.g:1487:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalMyDsl.g:1494:1: rule__Button__Group__2__Impl : ( ( rule__Button__ConditionnameAssignment_2 ) ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1498:1: ( ( ( rule__Button__ConditionnameAssignment_2 ) ) )
            // InternalMyDsl.g:1499:1: ( ( rule__Button__ConditionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:1499:1: ( ( rule__Button__ConditionnameAssignment_2 ) )
            // InternalMyDsl.g:1500:2: ( rule__Button__ConditionnameAssignment_2 )
            {
             before(grammarAccess.getButtonAccess().getConditionnameAssignment_2()); 
            // InternalMyDsl.g:1501:2: ( rule__Button__ConditionnameAssignment_2 )
            // InternalMyDsl.g:1501:3: rule__Button__ConditionnameAssignment_2
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
    // InternalMyDsl.g:1509:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1513:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // InternalMyDsl.g:1514:2: rule__Button__Group__3__Impl rule__Button__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalMyDsl.g:1521:1: rule__Button__Group__3__Impl : ( 'button' ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1525:1: ( ( 'button' ) )
            // InternalMyDsl.g:1526:1: ( 'button' )
            {
            // InternalMyDsl.g:1526:1: ( 'button' )
            // InternalMyDsl.g:1527:2: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_3()); 
            match(input,30,FOLLOW_2); 
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
    // InternalMyDsl.g:1536:1: rule__Button__Group__4 : rule__Button__Group__4__Impl ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1540:1: ( rule__Button__Group__4__Impl )
            // InternalMyDsl.g:1541:2: rule__Button__Group__4__Impl
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
    // InternalMyDsl.g:1547:1: rule__Button__Group__4__Impl : ( ( rule__Button__ButtonAssignment_4 ) ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1551:1: ( ( ( rule__Button__ButtonAssignment_4 ) ) )
            // InternalMyDsl.g:1552:1: ( ( rule__Button__ButtonAssignment_4 ) )
            {
            // InternalMyDsl.g:1552:1: ( ( rule__Button__ButtonAssignment_4 ) )
            // InternalMyDsl.g:1553:2: ( rule__Button__ButtonAssignment_4 )
            {
             before(grammarAccess.getButtonAccess().getButtonAssignment_4()); 
            // InternalMyDsl.g:1554:2: ( rule__Button__ButtonAssignment_4 )
            // InternalMyDsl.g:1554:3: rule__Button__ButtonAssignment_4
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
    // InternalMyDsl.g:1563:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1567:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalMyDsl.g:1568:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalMyDsl.g:1575:1: rule__Sensor__Group__0__Impl : ( () ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1579:1: ( ( () ) )
            // InternalMyDsl.g:1580:1: ( () )
            {
            // InternalMyDsl.g:1580:1: ( () )
            // InternalMyDsl.g:1581:2: ()
            {
             before(grammarAccess.getSensorAccess().getSensorAction_0()); 
            // InternalMyDsl.g:1582:2: ()
            // InternalMyDsl.g:1582:3: 
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
    // InternalMyDsl.g:1590:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1594:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalMyDsl.g:1595:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1602:1: rule__Sensor__Group__1__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1606:1: ( ( 'Sensor' ) )
            // InternalMyDsl.g:1607:1: ( 'Sensor' )
            {
            // InternalMyDsl.g:1607:1: ( 'Sensor' )
            // InternalMyDsl.g:1608:2: 'Sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalMyDsl.g:1617:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1621:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalMyDsl.g:1622:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:1629:1: rule__Sensor__Group__2__Impl : ( ( rule__Sensor__ConditionnameAssignment_2 ) ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1633:1: ( ( ( rule__Sensor__ConditionnameAssignment_2 ) ) )
            // InternalMyDsl.g:1634:1: ( ( rule__Sensor__ConditionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:1634:1: ( ( rule__Sensor__ConditionnameAssignment_2 ) )
            // InternalMyDsl.g:1635:2: ( rule__Sensor__ConditionnameAssignment_2 )
            {
             before(grammarAccess.getSensorAccess().getConditionnameAssignment_2()); 
            // InternalMyDsl.g:1636:2: ( rule__Sensor__ConditionnameAssignment_2 )
            // InternalMyDsl.g:1636:3: rule__Sensor__ConditionnameAssignment_2
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
    // InternalMyDsl.g:1644:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl rule__Sensor__Group__4 ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1648:1: ( rule__Sensor__Group__3__Impl rule__Sensor__Group__4 )
            // InternalMyDsl.g:1649:2: rule__Sensor__Group__3__Impl rule__Sensor__Group__4
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1656:1: rule__Sensor__Group__3__Impl : ( 'sensorPos' ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1660:1: ( ( 'sensorPos' ) )
            // InternalMyDsl.g:1661:1: ( 'sensorPos' )
            {
            // InternalMyDsl.g:1661:1: ( 'sensorPos' )
            // InternalMyDsl.g:1662:2: 'sensorPos'
            {
             before(grammarAccess.getSensorAccess().getSensorPosKeyword_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalMyDsl.g:1671:1: rule__Sensor__Group__4 : rule__Sensor__Group__4__Impl ;
    public final void rule__Sensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1675:1: ( rule__Sensor__Group__4__Impl )
            // InternalMyDsl.g:1676:2: rule__Sensor__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Group__4__Impl();

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
    // InternalMyDsl.g:1682:1: rule__Sensor__Group__4__Impl : ( ( rule__Sensor__SensorPosAssignment_4 ) ) ;
    public final void rule__Sensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1686:1: ( ( ( rule__Sensor__SensorPosAssignment_4 ) ) )
            // InternalMyDsl.g:1687:1: ( ( rule__Sensor__SensorPosAssignment_4 ) )
            {
            // InternalMyDsl.g:1687:1: ( ( rule__Sensor__SensorPosAssignment_4 ) )
            // InternalMyDsl.g:1688:2: ( rule__Sensor__SensorPosAssignment_4 )
            {
             before(grammarAccess.getSensorAccess().getSensorPosAssignment_4()); 
            // InternalMyDsl.g:1689:2: ( rule__Sensor__SensorPosAssignment_4 )
            // InternalMyDsl.g:1689:3: rule__Sensor__SensorPosAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__SensorPosAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getSensorPosAssignment_4()); 

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


    // $ANTLR start "rule__Tap__Group__0"
    // InternalMyDsl.g:1698:1: rule__Tap__Group__0 : rule__Tap__Group__0__Impl rule__Tap__Group__1 ;
    public final void rule__Tap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1702:1: ( rule__Tap__Group__0__Impl rule__Tap__Group__1 )
            // InternalMyDsl.g:1703:2: rule__Tap__Group__0__Impl rule__Tap__Group__1
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
    // InternalMyDsl.g:1710:1: rule__Tap__Group__0__Impl : ( () ) ;
    public final void rule__Tap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1714:1: ( ( () ) )
            // InternalMyDsl.g:1715:1: ( () )
            {
            // InternalMyDsl.g:1715:1: ( () )
            // InternalMyDsl.g:1716:2: ()
            {
             before(grammarAccess.getTapAccess().getTapAction_0()); 
            // InternalMyDsl.g:1717:2: ()
            // InternalMyDsl.g:1717:3: 
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
    // InternalMyDsl.g:1725:1: rule__Tap__Group__1 : rule__Tap__Group__1__Impl rule__Tap__Group__2 ;
    public final void rule__Tap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1729:1: ( rule__Tap__Group__1__Impl rule__Tap__Group__2 )
            // InternalMyDsl.g:1730:2: rule__Tap__Group__1__Impl rule__Tap__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1737:1: rule__Tap__Group__1__Impl : ( 'Tap' ) ;
    public final void rule__Tap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1741:1: ( ( 'Tap' ) )
            // InternalMyDsl.g:1742:1: ( 'Tap' )
            {
            // InternalMyDsl.g:1742:1: ( 'Tap' )
            // InternalMyDsl.g:1743:2: 'Tap'
            {
             before(grammarAccess.getTapAccess().getTapKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:1752:1: rule__Tap__Group__2 : rule__Tap__Group__2__Impl ;
    public final void rule__Tap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1756:1: ( rule__Tap__Group__2__Impl )
            // InternalMyDsl.g:1757:2: rule__Tap__Group__2__Impl
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
    // InternalMyDsl.g:1763:1: rule__Tap__Group__2__Impl : ( ( rule__Tap__ConditionnameAssignment_2 ) ) ;
    public final void rule__Tap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1767:1: ( ( ( rule__Tap__ConditionnameAssignment_2 ) ) )
            // InternalMyDsl.g:1768:1: ( ( rule__Tap__ConditionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:1768:1: ( ( rule__Tap__ConditionnameAssignment_2 ) )
            // InternalMyDsl.g:1769:2: ( rule__Tap__ConditionnameAssignment_2 )
            {
             before(grammarAccess.getTapAccess().getConditionnameAssignment_2()); 
            // InternalMyDsl.g:1770:2: ( rule__Tap__ConditionnameAssignment_2 )
            // InternalMyDsl.g:1770:3: rule__Tap__ConditionnameAssignment_2
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
    // InternalMyDsl.g:1779:1: rule__MotorAction__Group__0 : rule__MotorAction__Group__0__Impl rule__MotorAction__Group__1 ;
    public final void rule__MotorAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1783:1: ( rule__MotorAction__Group__0__Impl rule__MotorAction__Group__1 )
            // InternalMyDsl.g:1784:2: rule__MotorAction__Group__0__Impl rule__MotorAction__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:1791:1: rule__MotorAction__Group__0__Impl : ( () ) ;
    public final void rule__MotorAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1795:1: ( ( () ) )
            // InternalMyDsl.g:1796:1: ( () )
            {
            // InternalMyDsl.g:1796:1: ( () )
            // InternalMyDsl.g:1797:2: ()
            {
             before(grammarAccess.getMotorActionAccess().getMotorActionAction_0()); 
            // InternalMyDsl.g:1798:2: ()
            // InternalMyDsl.g:1798:3: 
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
    // InternalMyDsl.g:1806:1: rule__MotorAction__Group__1 : rule__MotorAction__Group__1__Impl rule__MotorAction__Group__2 ;
    public final void rule__MotorAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1810:1: ( rule__MotorAction__Group__1__Impl rule__MotorAction__Group__2 )
            // InternalMyDsl.g:1811:2: rule__MotorAction__Group__1__Impl rule__MotorAction__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:1818:1: rule__MotorAction__Group__1__Impl : ( 'MotorAction' ) ;
    public final void rule__MotorAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1822:1: ( ( 'MotorAction' ) )
            // InternalMyDsl.g:1823:1: ( 'MotorAction' )
            {
            // InternalMyDsl.g:1823:1: ( 'MotorAction' )
            // InternalMyDsl.g:1824:2: 'MotorAction'
            {
             before(grammarAccess.getMotorActionAccess().getMotorActionKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:1833:1: rule__MotorAction__Group__2 : rule__MotorAction__Group__2__Impl rule__MotorAction__Group__3 ;
    public final void rule__MotorAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1837:1: ( rule__MotorAction__Group__2__Impl rule__MotorAction__Group__3 )
            // InternalMyDsl.g:1838:2: rule__MotorAction__Group__2__Impl rule__MotorAction__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:1845:1: rule__MotorAction__Group__2__Impl : ( ( rule__MotorAction__ActionnameAssignment_2 ) ) ;
    public final void rule__MotorAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1849:1: ( ( ( rule__MotorAction__ActionnameAssignment_2 ) ) )
            // InternalMyDsl.g:1850:1: ( ( rule__MotorAction__ActionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:1850:1: ( ( rule__MotorAction__ActionnameAssignment_2 ) )
            // InternalMyDsl.g:1851:2: ( rule__MotorAction__ActionnameAssignment_2 )
            {
             before(grammarAccess.getMotorActionAccess().getActionnameAssignment_2()); 
            // InternalMyDsl.g:1852:2: ( rule__MotorAction__ActionnameAssignment_2 )
            // InternalMyDsl.g:1852:3: rule__MotorAction__ActionnameAssignment_2
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
    // InternalMyDsl.g:1860:1: rule__MotorAction__Group__3 : rule__MotorAction__Group__3__Impl rule__MotorAction__Group__4 ;
    public final void rule__MotorAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1864:1: ( rule__MotorAction__Group__3__Impl rule__MotorAction__Group__4 )
            // InternalMyDsl.g:1865:2: rule__MotorAction__Group__3__Impl rule__MotorAction__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:1872:1: rule__MotorAction__Group__3__Impl : ( ( rule__MotorAction__Group_3__0 ) ) ;
    public final void rule__MotorAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1876:1: ( ( ( rule__MotorAction__Group_3__0 ) ) )
            // InternalMyDsl.g:1877:1: ( ( rule__MotorAction__Group_3__0 ) )
            {
            // InternalMyDsl.g:1877:1: ( ( rule__MotorAction__Group_3__0 ) )
            // InternalMyDsl.g:1878:2: ( rule__MotorAction__Group_3__0 )
            {
             before(grammarAccess.getMotorActionAccess().getGroup_3()); 
            // InternalMyDsl.g:1879:2: ( rule__MotorAction__Group_3__0 )
            // InternalMyDsl.g:1879:3: rule__MotorAction__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__MotorAction__Group_3__0();

            state._fsp--;


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
    // InternalMyDsl.g:1887:1: rule__MotorAction__Group__4 : rule__MotorAction__Group__4__Impl ;
    public final void rule__MotorAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1891:1: ( rule__MotorAction__Group__4__Impl )
            // InternalMyDsl.g:1892:2: rule__MotorAction__Group__4__Impl
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
    // InternalMyDsl.g:1898:1: rule__MotorAction__Group__4__Impl : ( ( rule__MotorAction__Group_4__0 ) ) ;
    public final void rule__MotorAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1902:1: ( ( ( rule__MotorAction__Group_4__0 ) ) )
            // InternalMyDsl.g:1903:1: ( ( rule__MotorAction__Group_4__0 ) )
            {
            // InternalMyDsl.g:1903:1: ( ( rule__MotorAction__Group_4__0 ) )
            // InternalMyDsl.g:1904:2: ( rule__MotorAction__Group_4__0 )
            {
             before(grammarAccess.getMotorActionAccess().getGroup_4()); 
            // InternalMyDsl.g:1905:2: ( rule__MotorAction__Group_4__0 )
            // InternalMyDsl.g:1905:3: rule__MotorAction__Group_4__0
            {
            pushFollow(FOLLOW_2);
            rule__MotorAction__Group_4__0();

            state._fsp--;


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
    // InternalMyDsl.g:1914:1: rule__MotorAction__Group_3__0 : rule__MotorAction__Group_3__0__Impl rule__MotorAction__Group_3__1 ;
    public final void rule__MotorAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1918:1: ( rule__MotorAction__Group_3__0__Impl rule__MotorAction__Group_3__1 )
            // InternalMyDsl.g:1919:2: rule__MotorAction__Group_3__0__Impl rule__MotorAction__Group_3__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1926:1: rule__MotorAction__Group_3__0__Impl : ( 'motorLeft' ) ;
    public final void rule__MotorAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1930:1: ( ( 'motorLeft' ) )
            // InternalMyDsl.g:1931:1: ( 'motorLeft' )
            {
            // InternalMyDsl.g:1931:1: ( 'motorLeft' )
            // InternalMyDsl.g:1932:2: 'motorLeft'
            {
             before(grammarAccess.getMotorActionAccess().getMotorLeftKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:1941:1: rule__MotorAction__Group_3__1 : rule__MotorAction__Group_3__1__Impl ;
    public final void rule__MotorAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1945:1: ( rule__MotorAction__Group_3__1__Impl )
            // InternalMyDsl.g:1946:2: rule__MotorAction__Group_3__1__Impl
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
    // InternalMyDsl.g:1952:1: rule__MotorAction__Group_3__1__Impl : ( ( rule__MotorAction__MotorLeftAssignment_3_1 ) ) ;
    public final void rule__MotorAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1956:1: ( ( ( rule__MotorAction__MotorLeftAssignment_3_1 ) ) )
            // InternalMyDsl.g:1957:1: ( ( rule__MotorAction__MotorLeftAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1957:1: ( ( rule__MotorAction__MotorLeftAssignment_3_1 ) )
            // InternalMyDsl.g:1958:2: ( rule__MotorAction__MotorLeftAssignment_3_1 )
            {
             before(grammarAccess.getMotorActionAccess().getMotorLeftAssignment_3_1()); 
            // InternalMyDsl.g:1959:2: ( rule__MotorAction__MotorLeftAssignment_3_1 )
            // InternalMyDsl.g:1959:3: rule__MotorAction__MotorLeftAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MotorAction__MotorLeftAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMotorActionAccess().getMotorLeftAssignment_3_1()); 

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
    // InternalMyDsl.g:1968:1: rule__MotorAction__Group_4__0 : rule__MotorAction__Group_4__0__Impl rule__MotorAction__Group_4__1 ;
    public final void rule__MotorAction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1972:1: ( rule__MotorAction__Group_4__0__Impl rule__MotorAction__Group_4__1 )
            // InternalMyDsl.g:1973:2: rule__MotorAction__Group_4__0__Impl rule__MotorAction__Group_4__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:1980:1: rule__MotorAction__Group_4__0__Impl : ( 'motorRight' ) ;
    public final void rule__MotorAction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1984:1: ( ( 'motorRight' ) )
            // InternalMyDsl.g:1985:1: ( 'motorRight' )
            {
            // InternalMyDsl.g:1985:1: ( 'motorRight' )
            // InternalMyDsl.g:1986:2: 'motorRight'
            {
             before(grammarAccess.getMotorActionAccess().getMotorRightKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:1995:1: rule__MotorAction__Group_4__1 : rule__MotorAction__Group_4__1__Impl ;
    public final void rule__MotorAction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1999:1: ( rule__MotorAction__Group_4__1__Impl )
            // InternalMyDsl.g:2000:2: rule__MotorAction__Group_4__1__Impl
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
    // InternalMyDsl.g:2006:1: rule__MotorAction__Group_4__1__Impl : ( ( rule__MotorAction__MotorRightAssignment_4_1 ) ) ;
    public final void rule__MotorAction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2010:1: ( ( ( rule__MotorAction__MotorRightAssignment_4_1 ) ) )
            // InternalMyDsl.g:2011:1: ( ( rule__MotorAction__MotorRightAssignment_4_1 ) )
            {
            // InternalMyDsl.g:2011:1: ( ( rule__MotorAction__MotorRightAssignment_4_1 ) )
            // InternalMyDsl.g:2012:2: ( rule__MotorAction__MotorRightAssignment_4_1 )
            {
             before(grammarAccess.getMotorActionAccess().getMotorRightAssignment_4_1()); 
            // InternalMyDsl.g:2013:2: ( rule__MotorAction__MotorRightAssignment_4_1 )
            // InternalMyDsl.g:2013:3: rule__MotorAction__MotorRightAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MotorAction__MotorRightAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getMotorActionAccess().getMotorRightAssignment_4_1()); 

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
    // InternalMyDsl.g:2022:1: rule__SoundAction__Group__0 : rule__SoundAction__Group__0__Impl rule__SoundAction__Group__1 ;
    public final void rule__SoundAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2026:1: ( rule__SoundAction__Group__0__Impl rule__SoundAction__Group__1 )
            // InternalMyDsl.g:2027:2: rule__SoundAction__Group__0__Impl rule__SoundAction__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2034:1: rule__SoundAction__Group__0__Impl : ( () ) ;
    public final void rule__SoundAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2038:1: ( ( () ) )
            // InternalMyDsl.g:2039:1: ( () )
            {
            // InternalMyDsl.g:2039:1: ( () )
            // InternalMyDsl.g:2040:2: ()
            {
             before(grammarAccess.getSoundActionAccess().getSoundActionAction_0()); 
            // InternalMyDsl.g:2041:2: ()
            // InternalMyDsl.g:2041:3: 
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
    // InternalMyDsl.g:2049:1: rule__SoundAction__Group__1 : rule__SoundAction__Group__1__Impl rule__SoundAction__Group__2 ;
    public final void rule__SoundAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2053:1: ( rule__SoundAction__Group__1__Impl rule__SoundAction__Group__2 )
            // InternalMyDsl.g:2054:2: rule__SoundAction__Group__1__Impl rule__SoundAction__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:2061:1: rule__SoundAction__Group__1__Impl : ( 'SoundAction' ) ;
    public final void rule__SoundAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2065:1: ( ( 'SoundAction' ) )
            // InternalMyDsl.g:2066:1: ( 'SoundAction' )
            {
            // InternalMyDsl.g:2066:1: ( 'SoundAction' )
            // InternalMyDsl.g:2067:2: 'SoundAction'
            {
             before(grammarAccess.getSoundActionAccess().getSoundActionKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:2076:1: rule__SoundAction__Group__2 : rule__SoundAction__Group__2__Impl rule__SoundAction__Group__3 ;
    public final void rule__SoundAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2080:1: ( rule__SoundAction__Group__2__Impl rule__SoundAction__Group__3 )
            // InternalMyDsl.g:2081:2: rule__SoundAction__Group__2__Impl rule__SoundAction__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalMyDsl.g:2088:1: rule__SoundAction__Group__2__Impl : ( ( rule__SoundAction__ActionnameAssignment_2 ) ) ;
    public final void rule__SoundAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2092:1: ( ( ( rule__SoundAction__ActionnameAssignment_2 ) ) )
            // InternalMyDsl.g:2093:1: ( ( rule__SoundAction__ActionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:2093:1: ( ( rule__SoundAction__ActionnameAssignment_2 ) )
            // InternalMyDsl.g:2094:2: ( rule__SoundAction__ActionnameAssignment_2 )
            {
             before(grammarAccess.getSoundActionAccess().getActionnameAssignment_2()); 
            // InternalMyDsl.g:2095:2: ( rule__SoundAction__ActionnameAssignment_2 )
            // InternalMyDsl.g:2095:3: rule__SoundAction__ActionnameAssignment_2
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
    // InternalMyDsl.g:2103:1: rule__SoundAction__Group__3 : rule__SoundAction__Group__3__Impl ;
    public final void rule__SoundAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2107:1: ( rule__SoundAction__Group__3__Impl )
            // InternalMyDsl.g:2108:2: rule__SoundAction__Group__3__Impl
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
    // InternalMyDsl.g:2114:1: rule__SoundAction__Group__3__Impl : ( ( rule__SoundAction__Group_3__0 )? ) ;
    public final void rule__SoundAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2118:1: ( ( ( rule__SoundAction__Group_3__0 )? ) )
            // InternalMyDsl.g:2119:1: ( ( rule__SoundAction__Group_3__0 )? )
            {
            // InternalMyDsl.g:2119:1: ( ( rule__SoundAction__Group_3__0 )? )
            // InternalMyDsl.g:2120:2: ( rule__SoundAction__Group_3__0 )?
            {
             before(grammarAccess.getSoundActionAccess().getGroup_3()); 
            // InternalMyDsl.g:2121:2: ( rule__SoundAction__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:2121:3: rule__SoundAction__Group_3__0
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
    // InternalMyDsl.g:2130:1: rule__SoundAction__Group_3__0 : rule__SoundAction__Group_3__0__Impl rule__SoundAction__Group_3__1 ;
    public final void rule__SoundAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2134:1: ( rule__SoundAction__Group_3__0__Impl rule__SoundAction__Group_3__1 )
            // InternalMyDsl.g:2135:2: rule__SoundAction__Group_3__0__Impl rule__SoundAction__Group_3__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2142:1: rule__SoundAction__Group_3__0__Impl : ( 'set:' ) ;
    public final void rule__SoundAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2146:1: ( ( 'set:' ) )
            // InternalMyDsl.g:2147:1: ( 'set:' )
            {
            // InternalMyDsl.g:2147:1: ( 'set:' )
            // InternalMyDsl.g:2148:2: 'set:'
            {
             before(grammarAccess.getSoundActionAccess().getSetKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:2157:1: rule__SoundAction__Group_3__1 : rule__SoundAction__Group_3__1__Impl rule__SoundAction__Group_3__2 ;
    public final void rule__SoundAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2161:1: ( rule__SoundAction__Group_3__1__Impl rule__SoundAction__Group_3__2 )
            // InternalMyDsl.g:2162:2: rule__SoundAction__Group_3__1__Impl rule__SoundAction__Group_3__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:2169:1: rule__SoundAction__Group_3__1__Impl : ( ( rule__SoundAction__MusicsettingsAssignment_3_1 ) ) ;
    public final void rule__SoundAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2173:1: ( ( ( rule__SoundAction__MusicsettingsAssignment_3_1 ) ) )
            // InternalMyDsl.g:2174:1: ( ( rule__SoundAction__MusicsettingsAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2174:1: ( ( rule__SoundAction__MusicsettingsAssignment_3_1 ) )
            // InternalMyDsl.g:2175:2: ( rule__SoundAction__MusicsettingsAssignment_3_1 )
            {
             before(grammarAccess.getSoundActionAccess().getMusicsettingsAssignment_3_1()); 
            // InternalMyDsl.g:2176:2: ( rule__SoundAction__MusicsettingsAssignment_3_1 )
            // InternalMyDsl.g:2176:3: rule__SoundAction__MusicsettingsAssignment_3_1
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
    // InternalMyDsl.g:2184:1: rule__SoundAction__Group_3__2 : rule__SoundAction__Group_3__2__Impl ;
    public final void rule__SoundAction__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2188:1: ( rule__SoundAction__Group_3__2__Impl )
            // InternalMyDsl.g:2189:2: rule__SoundAction__Group_3__2__Impl
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
    // InternalMyDsl.g:2195:1: rule__SoundAction__Group_3__2__Impl : ( ( rule__SoundAction__Group_3_2__0 )* ) ;
    public final void rule__SoundAction__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2199:1: ( ( ( rule__SoundAction__Group_3_2__0 )* ) )
            // InternalMyDsl.g:2200:1: ( ( rule__SoundAction__Group_3_2__0 )* )
            {
            // InternalMyDsl.g:2200:1: ( ( rule__SoundAction__Group_3_2__0 )* )
            // InternalMyDsl.g:2201:2: ( rule__SoundAction__Group_3_2__0 )*
            {
             before(grammarAccess.getSoundActionAccess().getGroup_3_2()); 
            // InternalMyDsl.g:2202:2: ( rule__SoundAction__Group_3_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==27) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:2202:3: rule__SoundAction__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SoundAction__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalMyDsl.g:2211:1: rule__SoundAction__Group_3_2__0 : rule__SoundAction__Group_3_2__0__Impl rule__SoundAction__Group_3_2__1 ;
    public final void rule__SoundAction__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2215:1: ( rule__SoundAction__Group_3_2__0__Impl rule__SoundAction__Group_3_2__1 )
            // InternalMyDsl.g:2216:2: rule__SoundAction__Group_3_2__0__Impl rule__SoundAction__Group_3_2__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2223:1: rule__SoundAction__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__SoundAction__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2227:1: ( ( ',' ) )
            // InternalMyDsl.g:2228:1: ( ',' )
            {
            // InternalMyDsl.g:2228:1: ( ',' )
            // InternalMyDsl.g:2229:2: ','
            {
             before(grammarAccess.getSoundActionAccess().getCommaKeyword_3_2_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalMyDsl.g:2238:1: rule__SoundAction__Group_3_2__1 : rule__SoundAction__Group_3_2__1__Impl ;
    public final void rule__SoundAction__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2242:1: ( rule__SoundAction__Group_3_2__1__Impl )
            // InternalMyDsl.g:2243:2: rule__SoundAction__Group_3_2__1__Impl
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
    // InternalMyDsl.g:2249:1: rule__SoundAction__Group_3_2__1__Impl : ( ( rule__SoundAction__MusicsettingsAssignment_3_2_1 ) ) ;
    public final void rule__SoundAction__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2253:1: ( ( ( rule__SoundAction__MusicsettingsAssignment_3_2_1 ) ) )
            // InternalMyDsl.g:2254:1: ( ( rule__SoundAction__MusicsettingsAssignment_3_2_1 ) )
            {
            // InternalMyDsl.g:2254:1: ( ( rule__SoundAction__MusicsettingsAssignment_3_2_1 ) )
            // InternalMyDsl.g:2255:2: ( rule__SoundAction__MusicsettingsAssignment_3_2_1 )
            {
             before(grammarAccess.getSoundActionAccess().getMusicsettingsAssignment_3_2_1()); 
            // InternalMyDsl.g:2256:2: ( rule__SoundAction__MusicsettingsAssignment_3_2_1 )
            // InternalMyDsl.g:2256:3: rule__SoundAction__MusicsettingsAssignment_3_2_1
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
    // InternalMyDsl.g:2265:1: rule__LightAction__Group__0 : rule__LightAction__Group__0__Impl rule__LightAction__Group__1 ;
    public final void rule__LightAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2269:1: ( rule__LightAction__Group__0__Impl rule__LightAction__Group__1 )
            // InternalMyDsl.g:2270:2: rule__LightAction__Group__0__Impl rule__LightAction__Group__1
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
    // InternalMyDsl.g:2277:1: rule__LightAction__Group__0__Impl : ( () ) ;
    public final void rule__LightAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2281:1: ( ( () ) )
            // InternalMyDsl.g:2282:1: ( () )
            {
            // InternalMyDsl.g:2282:1: ( () )
            // InternalMyDsl.g:2283:2: ()
            {
             before(grammarAccess.getLightActionAccess().getLightActionAction_0()); 
            // InternalMyDsl.g:2284:2: ()
            // InternalMyDsl.g:2284:3: 
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
    // InternalMyDsl.g:2292:1: rule__LightAction__Group__1 : rule__LightAction__Group__1__Impl rule__LightAction__Group__2 ;
    public final void rule__LightAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2296:1: ( rule__LightAction__Group__1__Impl rule__LightAction__Group__2 )
            // InternalMyDsl.g:2297:2: rule__LightAction__Group__1__Impl rule__LightAction__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalMyDsl.g:2304:1: rule__LightAction__Group__1__Impl : ( 'LightAction' ) ;
    public final void rule__LightAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2308:1: ( ( 'LightAction' ) )
            // InternalMyDsl.g:2309:1: ( 'LightAction' )
            {
            // InternalMyDsl.g:2309:1: ( 'LightAction' )
            // InternalMyDsl.g:2310:2: 'LightAction'
            {
             before(grammarAccess.getLightActionAccess().getLightActionKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:2319:1: rule__LightAction__Group__2 : rule__LightAction__Group__2__Impl rule__LightAction__Group__3 ;
    public final void rule__LightAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2323:1: ( rule__LightAction__Group__2__Impl rule__LightAction__Group__3 )
            // InternalMyDsl.g:2324:2: rule__LightAction__Group__2__Impl rule__LightAction__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:2331:1: rule__LightAction__Group__2__Impl : ( ( rule__LightAction__ActionnameAssignment_2 ) ) ;
    public final void rule__LightAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2335:1: ( ( ( rule__LightAction__ActionnameAssignment_2 ) ) )
            // InternalMyDsl.g:2336:1: ( ( rule__LightAction__ActionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:2336:1: ( ( rule__LightAction__ActionnameAssignment_2 ) )
            // InternalMyDsl.g:2337:2: ( rule__LightAction__ActionnameAssignment_2 )
            {
             before(grammarAccess.getLightActionAccess().getActionnameAssignment_2()); 
            // InternalMyDsl.g:2338:2: ( rule__LightAction__ActionnameAssignment_2 )
            // InternalMyDsl.g:2338:3: rule__LightAction__ActionnameAssignment_2
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
    // InternalMyDsl.g:2346:1: rule__LightAction__Group__3 : rule__LightAction__Group__3__Impl rule__LightAction__Group__4 ;
    public final void rule__LightAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2350:1: ( rule__LightAction__Group__3__Impl rule__LightAction__Group__4 )
            // InternalMyDsl.g:2351:2: rule__LightAction__Group__3__Impl rule__LightAction__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:2358:1: rule__LightAction__Group__3__Impl : ( 'pos:' ) ;
    public final void rule__LightAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2362:1: ( ( 'pos:' ) )
            // InternalMyDsl.g:2363:1: ( 'pos:' )
            {
            // InternalMyDsl.g:2363:1: ( 'pos:' )
            // InternalMyDsl.g:2364:2: 'pos:'
            {
             before(grammarAccess.getLightActionAccess().getPosKeyword_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:2373:1: rule__LightAction__Group__4 : rule__LightAction__Group__4__Impl rule__LightAction__Group__5 ;
    public final void rule__LightAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2377:1: ( rule__LightAction__Group__4__Impl rule__LightAction__Group__5 )
            // InternalMyDsl.g:2378:2: rule__LightAction__Group__4__Impl rule__LightAction__Group__5
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:2385:1: rule__LightAction__Group__4__Impl : ( ( rule__LightAction__PosAssignment_4 ) ) ;
    public final void rule__LightAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2389:1: ( ( ( rule__LightAction__PosAssignment_4 ) ) )
            // InternalMyDsl.g:2390:1: ( ( rule__LightAction__PosAssignment_4 ) )
            {
            // InternalMyDsl.g:2390:1: ( ( rule__LightAction__PosAssignment_4 ) )
            // InternalMyDsl.g:2391:2: ( rule__LightAction__PosAssignment_4 )
            {
             before(grammarAccess.getLightActionAccess().getPosAssignment_4()); 
            // InternalMyDsl.g:2392:2: ( rule__LightAction__PosAssignment_4 )
            // InternalMyDsl.g:2392:3: rule__LightAction__PosAssignment_4
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
    // InternalMyDsl.g:2400:1: rule__LightAction__Group__5 : rule__LightAction__Group__5__Impl rule__LightAction__Group__6 ;
    public final void rule__LightAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2404:1: ( rule__LightAction__Group__5__Impl rule__LightAction__Group__6 )
            // InternalMyDsl.g:2405:2: rule__LightAction__Group__5__Impl rule__LightAction__Group__6
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:2412:1: rule__LightAction__Group__5__Impl : ( ( rule__LightAction__Group_5__0 )? ) ;
    public final void rule__LightAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2416:1: ( ( ( rule__LightAction__Group_5__0 )? ) )
            // InternalMyDsl.g:2417:1: ( ( rule__LightAction__Group_5__0 )? )
            {
            // InternalMyDsl.g:2417:1: ( ( rule__LightAction__Group_5__0 )? )
            // InternalMyDsl.g:2418:2: ( rule__LightAction__Group_5__0 )?
            {
             before(grammarAccess.getLightActionAccess().getGroup_5()); 
            // InternalMyDsl.g:2419:2: ( rule__LightAction__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:2419:3: rule__LightAction__Group_5__0
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
    // InternalMyDsl.g:2427:1: rule__LightAction__Group__6 : rule__LightAction__Group__6__Impl rule__LightAction__Group__7 ;
    public final void rule__LightAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2431:1: ( rule__LightAction__Group__6__Impl rule__LightAction__Group__7 )
            // InternalMyDsl.g:2432:2: rule__LightAction__Group__6__Impl rule__LightAction__Group__7
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:2439:1: rule__LightAction__Group__6__Impl : ( ( rule__LightAction__Group_6__0 )? ) ;
    public final void rule__LightAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2443:1: ( ( ( rule__LightAction__Group_6__0 )? ) )
            // InternalMyDsl.g:2444:1: ( ( rule__LightAction__Group_6__0 )? )
            {
            // InternalMyDsl.g:2444:1: ( ( rule__LightAction__Group_6__0 )? )
            // InternalMyDsl.g:2445:2: ( rule__LightAction__Group_6__0 )?
            {
             before(grammarAccess.getLightActionAccess().getGroup_6()); 
            // InternalMyDsl.g:2446:2: ( rule__LightAction__Group_6__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==42) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:2446:3: rule__LightAction__Group_6__0
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
    // InternalMyDsl.g:2454:1: rule__LightAction__Group__7 : rule__LightAction__Group__7__Impl ;
    public final void rule__LightAction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2458:1: ( rule__LightAction__Group__7__Impl )
            // InternalMyDsl.g:2459:2: rule__LightAction__Group__7__Impl
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
    // InternalMyDsl.g:2465:1: rule__LightAction__Group__7__Impl : ( ( rule__LightAction__Group_7__0 )? ) ;
    public final void rule__LightAction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2469:1: ( ( ( rule__LightAction__Group_7__0 )? ) )
            // InternalMyDsl.g:2470:1: ( ( rule__LightAction__Group_7__0 )? )
            {
            // InternalMyDsl.g:2470:1: ( ( rule__LightAction__Group_7__0 )? )
            // InternalMyDsl.g:2471:2: ( rule__LightAction__Group_7__0 )?
            {
             before(grammarAccess.getLightActionAccess().getGroup_7()); 
            // InternalMyDsl.g:2472:2: ( rule__LightAction__Group_7__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==43) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:2472:3: rule__LightAction__Group_7__0
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
    // InternalMyDsl.g:2481:1: rule__LightAction__Group_5__0 : rule__LightAction__Group_5__0__Impl rule__LightAction__Group_5__1 ;
    public final void rule__LightAction__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2485:1: ( rule__LightAction__Group_5__0__Impl rule__LightAction__Group_5__1 )
            // InternalMyDsl.g:2486:2: rule__LightAction__Group_5__0__Impl rule__LightAction__Group_5__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2493:1: rule__LightAction__Group_5__0__Impl : ( 'red:' ) ;
    public final void rule__LightAction__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2497:1: ( ( 'red:' ) )
            // InternalMyDsl.g:2498:1: ( 'red:' )
            {
            // InternalMyDsl.g:2498:1: ( 'red:' )
            // InternalMyDsl.g:2499:2: 'red:'
            {
             before(grammarAccess.getLightActionAccess().getRedKeyword_5_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:2508:1: rule__LightAction__Group_5__1 : rule__LightAction__Group_5__1__Impl ;
    public final void rule__LightAction__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2512:1: ( rule__LightAction__Group_5__1__Impl )
            // InternalMyDsl.g:2513:2: rule__LightAction__Group_5__1__Impl
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
    // InternalMyDsl.g:2519:1: rule__LightAction__Group_5__1__Impl : ( ( rule__LightAction__RedAssignment_5_1 ) ) ;
    public final void rule__LightAction__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2523:1: ( ( ( rule__LightAction__RedAssignment_5_1 ) ) )
            // InternalMyDsl.g:2524:1: ( ( rule__LightAction__RedAssignment_5_1 ) )
            {
            // InternalMyDsl.g:2524:1: ( ( rule__LightAction__RedAssignment_5_1 ) )
            // InternalMyDsl.g:2525:2: ( rule__LightAction__RedAssignment_5_1 )
            {
             before(grammarAccess.getLightActionAccess().getRedAssignment_5_1()); 
            // InternalMyDsl.g:2526:2: ( rule__LightAction__RedAssignment_5_1 )
            // InternalMyDsl.g:2526:3: rule__LightAction__RedAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__LightAction__RedAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getLightActionAccess().getRedAssignment_5_1()); 

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
    // InternalMyDsl.g:2535:1: rule__LightAction__Group_6__0 : rule__LightAction__Group_6__0__Impl rule__LightAction__Group_6__1 ;
    public final void rule__LightAction__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2539:1: ( rule__LightAction__Group_6__0__Impl rule__LightAction__Group_6__1 )
            // InternalMyDsl.g:2540:2: rule__LightAction__Group_6__0__Impl rule__LightAction__Group_6__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2547:1: rule__LightAction__Group_6__0__Impl : ( 'green:' ) ;
    public final void rule__LightAction__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2551:1: ( ( 'green:' ) )
            // InternalMyDsl.g:2552:1: ( 'green:' )
            {
            // InternalMyDsl.g:2552:1: ( 'green:' )
            // InternalMyDsl.g:2553:2: 'green:'
            {
             before(grammarAccess.getLightActionAccess().getGreenKeyword_6_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyDsl.g:2562:1: rule__LightAction__Group_6__1 : rule__LightAction__Group_6__1__Impl ;
    public final void rule__LightAction__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2566:1: ( rule__LightAction__Group_6__1__Impl )
            // InternalMyDsl.g:2567:2: rule__LightAction__Group_6__1__Impl
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
    // InternalMyDsl.g:2573:1: rule__LightAction__Group_6__1__Impl : ( ( rule__LightAction__GreenAssignment_6_1 ) ) ;
    public final void rule__LightAction__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2577:1: ( ( ( rule__LightAction__GreenAssignment_6_1 ) ) )
            // InternalMyDsl.g:2578:1: ( ( rule__LightAction__GreenAssignment_6_1 ) )
            {
            // InternalMyDsl.g:2578:1: ( ( rule__LightAction__GreenAssignment_6_1 ) )
            // InternalMyDsl.g:2579:2: ( rule__LightAction__GreenAssignment_6_1 )
            {
             before(grammarAccess.getLightActionAccess().getGreenAssignment_6_1()); 
            // InternalMyDsl.g:2580:2: ( rule__LightAction__GreenAssignment_6_1 )
            // InternalMyDsl.g:2580:3: rule__LightAction__GreenAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__LightAction__GreenAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getLightActionAccess().getGreenAssignment_6_1()); 

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
    // InternalMyDsl.g:2589:1: rule__LightAction__Group_7__0 : rule__LightAction__Group_7__0__Impl rule__LightAction__Group_7__1 ;
    public final void rule__LightAction__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2593:1: ( rule__LightAction__Group_7__0__Impl rule__LightAction__Group_7__1 )
            // InternalMyDsl.g:2594:2: rule__LightAction__Group_7__0__Impl rule__LightAction__Group_7__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2601:1: rule__LightAction__Group_7__0__Impl : ( 'blue:' ) ;
    public final void rule__LightAction__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2605:1: ( ( 'blue:' ) )
            // InternalMyDsl.g:2606:1: ( 'blue:' )
            {
            // InternalMyDsl.g:2606:1: ( 'blue:' )
            // InternalMyDsl.g:2607:2: 'blue:'
            {
             before(grammarAccess.getLightActionAccess().getBlueKeyword_7_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:2616:1: rule__LightAction__Group_7__1 : rule__LightAction__Group_7__1__Impl ;
    public final void rule__LightAction__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2620:1: ( rule__LightAction__Group_7__1__Impl )
            // InternalMyDsl.g:2621:2: rule__LightAction__Group_7__1__Impl
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
    // InternalMyDsl.g:2627:1: rule__LightAction__Group_7__1__Impl : ( ( rule__LightAction__BlueAssignment_7_1 ) ) ;
    public final void rule__LightAction__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2631:1: ( ( ( rule__LightAction__BlueAssignment_7_1 ) ) )
            // InternalMyDsl.g:2632:1: ( ( rule__LightAction__BlueAssignment_7_1 ) )
            {
            // InternalMyDsl.g:2632:1: ( ( rule__LightAction__BlueAssignment_7_1 ) )
            // InternalMyDsl.g:2633:2: ( rule__LightAction__BlueAssignment_7_1 )
            {
             before(grammarAccess.getLightActionAccess().getBlueAssignment_7_1()); 
            // InternalMyDsl.g:2634:2: ( rule__LightAction__BlueAssignment_7_1 )
            // InternalMyDsl.g:2634:3: rule__LightAction__BlueAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__LightAction__BlueAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getLightActionAccess().getBlueAssignment_7_1()); 

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
    // InternalMyDsl.g:2643:1: rule__MusicSetting__Group__0 : rule__MusicSetting__Group__0__Impl rule__MusicSetting__Group__1 ;
    public final void rule__MusicSetting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2647:1: ( rule__MusicSetting__Group__0__Impl rule__MusicSetting__Group__1 )
            // InternalMyDsl.g:2648:2: rule__MusicSetting__Group__0__Impl rule__MusicSetting__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2655:1: rule__MusicSetting__Group__0__Impl : ( '(' ) ;
    public final void rule__MusicSetting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2659:1: ( ( '(' ) )
            // InternalMyDsl.g:2660:1: ( '(' )
            {
            // InternalMyDsl.g:2660:1: ( '(' )
            // InternalMyDsl.g:2661:2: '('
            {
             before(grammarAccess.getMusicSettingAccess().getLeftParenthesisKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMusicSettingAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__MusicSetting__Group__0__Impl"


    // $ANTLR start "rule__MusicSetting__Group__1"
    // InternalMyDsl.g:2670:1: rule__MusicSetting__Group__1 : rule__MusicSetting__Group__1__Impl rule__MusicSetting__Group__2 ;
    public final void rule__MusicSetting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2674:1: ( rule__MusicSetting__Group__1__Impl rule__MusicSetting__Group__2 )
            // InternalMyDsl.g:2675:2: rule__MusicSetting__Group__1__Impl rule__MusicSetting__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:2682:1: rule__MusicSetting__Group__1__Impl : ( ( rule__MusicSetting__NoteAssignment_1 ) ) ;
    public final void rule__MusicSetting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2686:1: ( ( ( rule__MusicSetting__NoteAssignment_1 ) ) )
            // InternalMyDsl.g:2687:1: ( ( rule__MusicSetting__NoteAssignment_1 ) )
            {
            // InternalMyDsl.g:2687:1: ( ( rule__MusicSetting__NoteAssignment_1 ) )
            // InternalMyDsl.g:2688:2: ( rule__MusicSetting__NoteAssignment_1 )
            {
             before(grammarAccess.getMusicSettingAccess().getNoteAssignment_1()); 
            // InternalMyDsl.g:2689:2: ( rule__MusicSetting__NoteAssignment_1 )
            // InternalMyDsl.g:2689:3: rule__MusicSetting__NoteAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MusicSetting__NoteAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMusicSettingAccess().getNoteAssignment_1()); 

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
    // InternalMyDsl.g:2697:1: rule__MusicSetting__Group__2 : rule__MusicSetting__Group__2__Impl rule__MusicSetting__Group__3 ;
    public final void rule__MusicSetting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2701:1: ( rule__MusicSetting__Group__2__Impl rule__MusicSetting__Group__3 )
            // InternalMyDsl.g:2702:2: rule__MusicSetting__Group__2__Impl rule__MusicSetting__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalMyDsl.g:2709:1: rule__MusicSetting__Group__2__Impl : ( ',' ) ;
    public final void rule__MusicSetting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2713:1: ( ( ',' ) )
            // InternalMyDsl.g:2714:1: ( ',' )
            {
            // InternalMyDsl.g:2714:1: ( ',' )
            // InternalMyDsl.g:2715:2: ','
            {
             before(grammarAccess.getMusicSettingAccess().getCommaKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMusicSettingAccess().getCommaKeyword_2()); 

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
    // InternalMyDsl.g:2724:1: rule__MusicSetting__Group__3 : rule__MusicSetting__Group__3__Impl rule__MusicSetting__Group__4 ;
    public final void rule__MusicSetting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2728:1: ( rule__MusicSetting__Group__3__Impl rule__MusicSetting__Group__4 )
            // InternalMyDsl.g:2729:2: rule__MusicSetting__Group__3__Impl rule__MusicSetting__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalMyDsl.g:2736:1: rule__MusicSetting__Group__3__Impl : ( ( rule__MusicSetting__DurationAssignment_3 ) ) ;
    public final void rule__MusicSetting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2740:1: ( ( ( rule__MusicSetting__DurationAssignment_3 ) ) )
            // InternalMyDsl.g:2741:1: ( ( rule__MusicSetting__DurationAssignment_3 ) )
            {
            // InternalMyDsl.g:2741:1: ( ( rule__MusicSetting__DurationAssignment_3 ) )
            // InternalMyDsl.g:2742:2: ( rule__MusicSetting__DurationAssignment_3 )
            {
             before(grammarAccess.getMusicSettingAccess().getDurationAssignment_3()); 
            // InternalMyDsl.g:2743:2: ( rule__MusicSetting__DurationAssignment_3 )
            // InternalMyDsl.g:2743:3: rule__MusicSetting__DurationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MusicSetting__DurationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMusicSettingAccess().getDurationAssignment_3()); 

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
    // InternalMyDsl.g:2751:1: rule__MusicSetting__Group__4 : rule__MusicSetting__Group__4__Impl rule__MusicSetting__Group__5 ;
    public final void rule__MusicSetting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2755:1: ( rule__MusicSetting__Group__4__Impl rule__MusicSetting__Group__5 )
            // InternalMyDsl.g:2756:2: rule__MusicSetting__Group__4__Impl rule__MusicSetting__Group__5
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2763:1: rule__MusicSetting__Group__4__Impl : ( ',' ) ;
    public final void rule__MusicSetting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2767:1: ( ( ',' ) )
            // InternalMyDsl.g:2768:1: ( ',' )
            {
            // InternalMyDsl.g:2768:1: ( ',' )
            // InternalMyDsl.g:2769:2: ','
            {
             before(grammarAccess.getMusicSettingAccess().getCommaKeyword_4()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMusicSettingAccess().getCommaKeyword_4()); 

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
    // InternalMyDsl.g:2778:1: rule__MusicSetting__Group__5 : rule__MusicSetting__Group__5__Impl rule__MusicSetting__Group__6 ;
    public final void rule__MusicSetting__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2782:1: ( rule__MusicSetting__Group__5__Impl rule__MusicSetting__Group__6 )
            // InternalMyDsl.g:2783:2: rule__MusicSetting__Group__5__Impl rule__MusicSetting__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:2790:1: rule__MusicSetting__Group__5__Impl : ( ( rule__MusicSetting__PosAssignment_5 ) ) ;
    public final void rule__MusicSetting__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2794:1: ( ( ( rule__MusicSetting__PosAssignment_5 ) ) )
            // InternalMyDsl.g:2795:1: ( ( rule__MusicSetting__PosAssignment_5 ) )
            {
            // InternalMyDsl.g:2795:1: ( ( rule__MusicSetting__PosAssignment_5 ) )
            // InternalMyDsl.g:2796:2: ( rule__MusicSetting__PosAssignment_5 )
            {
             before(grammarAccess.getMusicSettingAccess().getPosAssignment_5()); 
            // InternalMyDsl.g:2797:2: ( rule__MusicSetting__PosAssignment_5 )
            // InternalMyDsl.g:2797:3: rule__MusicSetting__PosAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__MusicSetting__PosAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMusicSettingAccess().getPosAssignment_5()); 

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
    // InternalMyDsl.g:2805:1: rule__MusicSetting__Group__6 : rule__MusicSetting__Group__6__Impl ;
    public final void rule__MusicSetting__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2809:1: ( rule__MusicSetting__Group__6__Impl )
            // InternalMyDsl.g:2810:2: rule__MusicSetting__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MusicSetting__Group__6__Impl();

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
    // InternalMyDsl.g:2816:1: rule__MusicSetting__Group__6__Impl : ( ')' ) ;
    public final void rule__MusicSetting__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2820:1: ( ( ')' ) )
            // InternalMyDsl.g:2821:1: ( ')' )
            {
            // InternalMyDsl.g:2821:1: ( ')' )
            // InternalMyDsl.g:2822:2: ')'
            {
             before(grammarAccess.getMusicSettingAccess().getRightParenthesisKeyword_6()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMusicSettingAccess().getRightParenthesisKeyword_6()); 

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


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:2832:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2836:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:2837:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2844:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2848:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:2849:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:2849:1: ( ( '-' )? )
            // InternalMyDsl.g:2850:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:2851:2: ( '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:2851:3: '-'
                    {
                    match(input,22,FOLLOW_2); 

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
    // InternalMyDsl.g:2859:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2863:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:2864:2: rule__EInt__Group__1__Impl
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
    // InternalMyDsl.g:2870:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2874:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2875:1: ( RULE_INT )
            {
            // InternalMyDsl.g:2875:1: ( RULE_INT )
            // InternalMyDsl.g:2876:2: RULE_INT
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
    // InternalMyDsl.g:2886:1: rule__RobotModel__EventsAssignment_1_0 : ( ruleEvent ) ;
    public final void rule__RobotModel__EventsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2890:1: ( ( ruleEvent ) )
            // InternalMyDsl.g:2891:2: ( ruleEvent )
            {
            // InternalMyDsl.g:2891:2: ( ruleEvent )
            // InternalMyDsl.g:2892:3: ruleEvent
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
    // InternalMyDsl.g:2901:1: rule__RobotModel__ActionsAssignment_1_1_2 : ( ruleAction ) ;
    public final void rule__RobotModel__ActionsAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2905:1: ( ( ruleAction ) )
            // InternalMyDsl.g:2906:2: ( ruleAction )
            {
            // InternalMyDsl.g:2906:2: ( ruleAction )
            // InternalMyDsl.g:2907:3: ruleAction
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
    // InternalMyDsl.g:2916:1: rule__RobotModel__ActionsAssignment_1_1_3_1 : ( ruleAction ) ;
    public final void rule__RobotModel__ActionsAssignment_1_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2920:1: ( ( ruleAction ) )
            // InternalMyDsl.g:2921:2: ( ruleAction )
            {
            // InternalMyDsl.g:2921:2: ( ruleAction )
            // InternalMyDsl.g:2922:3: ruleAction
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
    // InternalMyDsl.g:2931:1: rule__RobotModel__ConditionsAssignment_1_2_2 : ( ruleCondition ) ;
    public final void rule__RobotModel__ConditionsAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2935:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:2936:2: ( ruleCondition )
            {
            // InternalMyDsl.g:2936:2: ( ruleCondition )
            // InternalMyDsl.g:2937:3: ruleCondition
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
    // InternalMyDsl.g:2946:1: rule__RobotModel__ConditionsAssignment_1_2_3_1 : ( ruleCondition ) ;
    public final void rule__RobotModel__ConditionsAssignment_1_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2950:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:2951:2: ( ruleCondition )
            {
            // InternalMyDsl.g:2951:2: ( ruleCondition )
            // InternalMyDsl.g:2952:3: ruleCondition
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


    // $ANTLR start "rule__Event__NameAssignment_2"
    // InternalMyDsl.g:2961:1: rule__Event__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Event__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2965:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2966:2: ( ruleEString )
            {
            // InternalMyDsl.g:2966:2: ( ruleEString )
            // InternalMyDsl.g:2967:3: ruleEString
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


    // $ANTLR start "rule__Event__ConditionAssignment_3_1"
    // InternalMyDsl.g:2976:1: rule__Event__ConditionAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Event__ConditionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2980:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:2981:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:2981:2: ( ( ruleEString ) )
            // InternalMyDsl.g:2982:3: ( ruleEString )
            {
             before(grammarAccess.getEventAccess().getConditionConditionCrossReference_3_1_0()); 
            // InternalMyDsl.g:2983:3: ( ruleEString )
            // InternalMyDsl.g:2984:4: ruleEString
            {
             before(grammarAccess.getEventAccess().getConditionConditionEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEventAccess().getConditionConditionEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getEventAccess().getConditionConditionCrossReference_3_1_0()); 

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
    // $ANTLR end "rule__Event__ConditionAssignment_3_1"


    // $ANTLR start "rule__Event__ActionsAssignment_4_1"
    // InternalMyDsl.g:2995:1: rule__Event__ActionsAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Event__ActionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2999:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:3000:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:3000:2: ( ( ruleEString ) )
            // InternalMyDsl.g:3001:3: ( ruleEString )
            {
             before(grammarAccess.getEventAccess().getActionsActionCrossReference_4_1_0()); 
            // InternalMyDsl.g:3002:3: ( ruleEString )
            // InternalMyDsl.g:3003:4: ruleEString
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
    // InternalMyDsl.g:3014:1: rule__Event__ActionsAssignment_4_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Event__ActionsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3018:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:3019:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:3019:2: ( ( ruleEString ) )
            // InternalMyDsl.g:3020:3: ( ruleEString )
            {
             before(grammarAccess.getEventAccess().getActionsActionCrossReference_4_2_1_0()); 
            // InternalMyDsl.g:3021:3: ( ruleEString )
            // InternalMyDsl.g:3022:4: ruleEString
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
    // InternalMyDsl.g:3033:1: rule__Sound__ConditionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__Sound__ConditionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3037:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3038:2: ( ruleEString )
            {
            // InternalMyDsl.g:3038:2: ( ruleEString )
            // InternalMyDsl.g:3039:3: ruleEString
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
    // InternalMyDsl.g:3048:1: rule__Button__ConditionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__Button__ConditionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3052:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3053:2: ( ruleEString )
            {
            // InternalMyDsl.g:3053:2: ( ruleEString )
            // InternalMyDsl.g:3054:3: ruleEString
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
    // InternalMyDsl.g:3063:1: rule__Button__ButtonAssignment_4 : ( ruleButtonType ) ;
    public final void rule__Button__ButtonAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3067:1: ( ( ruleButtonType ) )
            // InternalMyDsl.g:3068:2: ( ruleButtonType )
            {
            // InternalMyDsl.g:3068:2: ( ruleButtonType )
            // InternalMyDsl.g:3069:3: ruleButtonType
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
    // InternalMyDsl.g:3078:1: rule__Sensor__ConditionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__Sensor__ConditionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3082:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3083:2: ( ruleEString )
            {
            // InternalMyDsl.g:3083:2: ( ruleEString )
            // InternalMyDsl.g:3084:3: ruleEString
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


    // $ANTLR start "rule__Sensor__SensorPosAssignment_4"
    // InternalMyDsl.g:3093:1: rule__Sensor__SensorPosAssignment_4 : ( ruleEInt ) ;
    public final void rule__Sensor__SensorPosAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3097:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:3098:2: ( ruleEInt )
            {
            // InternalMyDsl.g:3098:2: ( ruleEInt )
            // InternalMyDsl.g:3099:3: ruleEInt
            {
             before(grammarAccess.getSensorAccess().getSensorPosEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSensorAccess().getSensorPosEIntParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Sensor__SensorPosAssignment_4"


    // $ANTLR start "rule__Tap__ConditionnameAssignment_2"
    // InternalMyDsl.g:3108:1: rule__Tap__ConditionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__Tap__ConditionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3112:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3113:2: ( ruleEString )
            {
            // InternalMyDsl.g:3113:2: ( ruleEString )
            // InternalMyDsl.g:3114:3: ruleEString
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
    // InternalMyDsl.g:3123:1: rule__MotorAction__ActionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__MotorAction__ActionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3127:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3128:2: ( ruleEString )
            {
            // InternalMyDsl.g:3128:2: ( ruleEString )
            // InternalMyDsl.g:3129:3: ruleEString
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


    // $ANTLR start "rule__MotorAction__MotorLeftAssignment_3_1"
    // InternalMyDsl.g:3138:1: rule__MotorAction__MotorLeftAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__MotorAction__MotorLeftAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3142:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:3143:2: ( ruleEInt )
            {
            // InternalMyDsl.g:3143:2: ( ruleEInt )
            // InternalMyDsl.g:3144:3: ruleEInt
            {
             before(grammarAccess.getMotorActionAccess().getMotorLeftEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMotorActionAccess().getMotorLeftEIntParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__MotorAction__MotorLeftAssignment_3_1"


    // $ANTLR start "rule__MotorAction__MotorRightAssignment_4_1"
    // InternalMyDsl.g:3153:1: rule__MotorAction__MotorRightAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__MotorAction__MotorRightAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3157:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:3158:2: ( ruleEInt )
            {
            // InternalMyDsl.g:3158:2: ( ruleEInt )
            // InternalMyDsl.g:3159:3: ruleEInt
            {
             before(grammarAccess.getMotorActionAccess().getMotorRightEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMotorActionAccess().getMotorRightEIntParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__MotorAction__MotorRightAssignment_4_1"


    // $ANTLR start "rule__SoundAction__ActionnameAssignment_2"
    // InternalMyDsl.g:3168:1: rule__SoundAction__ActionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__SoundAction__ActionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3172:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3173:2: ( ruleEString )
            {
            // InternalMyDsl.g:3173:2: ( ruleEString )
            // InternalMyDsl.g:3174:3: ruleEString
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
    // InternalMyDsl.g:3183:1: rule__SoundAction__MusicsettingsAssignment_3_1 : ( ruleMusicSetting ) ;
    public final void rule__SoundAction__MusicsettingsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3187:1: ( ( ruleMusicSetting ) )
            // InternalMyDsl.g:3188:2: ( ruleMusicSetting )
            {
            // InternalMyDsl.g:3188:2: ( ruleMusicSetting )
            // InternalMyDsl.g:3189:3: ruleMusicSetting
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
    // InternalMyDsl.g:3198:1: rule__SoundAction__MusicsettingsAssignment_3_2_1 : ( ruleMusicSetting ) ;
    public final void rule__SoundAction__MusicsettingsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3202:1: ( ( ruleMusicSetting ) )
            // InternalMyDsl.g:3203:2: ( ruleMusicSetting )
            {
            // InternalMyDsl.g:3203:2: ( ruleMusicSetting )
            // InternalMyDsl.g:3204:3: ruleMusicSetting
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
    // InternalMyDsl.g:3213:1: rule__LightAction__ActionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__LightAction__ActionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3217:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3218:2: ( ruleEString )
            {
            // InternalMyDsl.g:3218:2: ( ruleEString )
            // InternalMyDsl.g:3219:3: ruleEString
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
    // InternalMyDsl.g:3228:1: rule__LightAction__PosAssignment_4 : ( ruleLightPos ) ;
    public final void rule__LightAction__PosAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3232:1: ( ( ruleLightPos ) )
            // InternalMyDsl.g:3233:2: ( ruleLightPos )
            {
            // InternalMyDsl.g:3233:2: ( ruleLightPos )
            // InternalMyDsl.g:3234:3: ruleLightPos
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


    // $ANTLR start "rule__LightAction__RedAssignment_5_1"
    // InternalMyDsl.g:3243:1: rule__LightAction__RedAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__LightAction__RedAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3247:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:3248:2: ( ruleEInt )
            {
            // InternalMyDsl.g:3248:2: ( ruleEInt )
            // InternalMyDsl.g:3249:3: ruleEInt
            {
             before(grammarAccess.getLightActionAccess().getRedEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getLightActionAccess().getRedEIntParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__LightAction__RedAssignment_5_1"


    // $ANTLR start "rule__LightAction__GreenAssignment_6_1"
    // InternalMyDsl.g:3258:1: rule__LightAction__GreenAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__LightAction__GreenAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3262:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:3263:2: ( ruleEInt )
            {
            // InternalMyDsl.g:3263:2: ( ruleEInt )
            // InternalMyDsl.g:3264:3: ruleEInt
            {
             before(grammarAccess.getLightActionAccess().getGreenEIntParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getLightActionAccess().getGreenEIntParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__LightAction__GreenAssignment_6_1"


    // $ANTLR start "rule__LightAction__BlueAssignment_7_1"
    // InternalMyDsl.g:3273:1: rule__LightAction__BlueAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__LightAction__BlueAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3277:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:3278:2: ( ruleEInt )
            {
            // InternalMyDsl.g:3278:2: ( ruleEInt )
            // InternalMyDsl.g:3279:3: ruleEInt
            {
             before(grammarAccess.getLightActionAccess().getBlueEIntParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getLightActionAccess().getBlueEIntParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__LightAction__BlueAssignment_7_1"


    // $ANTLR start "rule__MusicSetting__NoteAssignment_1"
    // InternalMyDsl.g:3288:1: rule__MusicSetting__NoteAssignment_1 : ( ruleEInt ) ;
    public final void rule__MusicSetting__NoteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3292:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:3293:2: ( ruleEInt )
            {
            // InternalMyDsl.g:3293:2: ( ruleEInt )
            // InternalMyDsl.g:3294:3: ruleEInt
            {
             before(grammarAccess.getMusicSettingAccess().getNoteEIntParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMusicSettingAccess().getNoteEIntParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__MusicSetting__NoteAssignment_1"


    // $ANTLR start "rule__MusicSetting__DurationAssignment_3"
    // InternalMyDsl.g:3303:1: rule__MusicSetting__DurationAssignment_3 : ( ruleDuration ) ;
    public final void rule__MusicSetting__DurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3307:1: ( ( ruleDuration ) )
            // InternalMyDsl.g:3308:2: ( ruleDuration )
            {
            // InternalMyDsl.g:3308:2: ( ruleDuration )
            // InternalMyDsl.g:3309:3: ruleDuration
            {
             before(grammarAccess.getMusicSettingAccess().getDurationDurationEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDuration();

            state._fsp--;

             after(grammarAccess.getMusicSettingAccess().getDurationDurationEnumRuleCall_3_0()); 

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
    // $ANTLR end "rule__MusicSetting__DurationAssignment_3"


    // $ANTLR start "rule__MusicSetting__PosAssignment_5"
    // InternalMyDsl.g:3318:1: rule__MusicSetting__PosAssignment_5 : ( ruleEInt ) ;
    public final void rule__MusicSetting__PosAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3322:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:3323:2: ( ruleEInt )
            {
            // InternalMyDsl.g:3323:2: ( ruleEInt )
            // InternalMyDsl.g:3324:3: ruleEInt
            {
             before(grammarAccess.getMusicSettingAccess().getPosEIntParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMusicSettingAccess().getPosEIntParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__MusicSetting__PosAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001A00002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000A400000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000002B0000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000001F0000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});

}