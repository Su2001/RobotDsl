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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'TRUE'", "'FALSE'", "'NONE'", "'MEDIUM'", "'LONG'", "'TOP'", "'BOT'", "'BACKWARD'", "'LEFT'", "'RIGHT'", "'CENTER'", "'FORWARD'", "'Action:'", "'Condition:'", "'('", "')'", "'Event'", "'condition:'", "'actions:'", "','", "'Sound'", "'Button'", "'button'", "'Sensor'", "'sensorPos'", "'Tap'", "'MotorAction'", "'motorLeft'", "'motorRight'", "'SoundAction'", "'set:'", "'LightAction'", "'pos:'", "'red:'", "'green:'", "'blue:'", "'||'", "'&&'", "'if'", "'then'", "'else'", "'!'"
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
    public static final int T__62=62;
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
    // InternalMyDsl.g:87:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Expression__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Expression__Alternatives )
            // InternalMyDsl.g:94:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleOr"
    // InternalMyDsl.g:103:1: entryRuleOr : ruleOr EOF ;
    public final void entryRuleOr() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleOr EOF )
            // InternalMyDsl.g:105:1: ruleOr EOF
            {
             before(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            ruleOr();

            state._fsp--;

             after(grammarAccess.getOrRule()); 
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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalMyDsl.g:112:1: ruleOr : ( ( rule__Or__Group__0 ) ) ;
    public final void ruleOr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Or__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Or__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Or__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Or__Group__0 )
            {
             before(grammarAccess.getOrAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Or__Group__0 )
            // InternalMyDsl.g:119:4: rule__Or__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalMyDsl.g:128:1: entryRuleAnd : ruleAnd EOF ;
    public final void entryRuleAnd() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleAnd EOF )
            // InternalMyDsl.g:130:1: ruleAnd EOF
            {
             before(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getAndRule()); 
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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalMyDsl.g:137:1: ruleAnd : ( ( rule__And__Group__0 ) ) ;
    public final void ruleAnd() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__And__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__And__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__And__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__And__Group__0 )
            {
             before(grammarAccess.getAndAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__And__Group__0 )
            // InternalMyDsl.g:144:4: rule__And__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalMyDsl.g:153:1: entryRuleEquality : ruleEquality EOF ;
    public final void entryRuleEquality() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleEquality EOF )
            // InternalMyDsl.g:155:1: ruleEquality EOF
            {
             before(grammarAccess.getEqualityRule()); 
            pushFollow(FOLLOW_1);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getEqualityRule()); 
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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalMyDsl.g:162:1: ruleEquality : ( ( rule__Equality__Group__0 ) ) ;
    public final void ruleEquality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Equality__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Equality__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Equality__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Equality__Group__0 )
            {
             before(grammarAccess.getEqualityAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Equality__Group__0 )
            // InternalMyDsl.g:169:4: rule__Equality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalMyDsl.g:178:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleComparison EOF )
            // InternalMyDsl.g:180:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalMyDsl.g:187:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Comparison__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Comparison__Group__0 )
            // InternalMyDsl.g:194:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleIf"
    // InternalMyDsl.g:203:1: entryRuleIf : ruleIf EOF ;
    public final void entryRuleIf() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleIf EOF )
            // InternalMyDsl.g:205:1: ruleIf EOF
            {
             before(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            ruleIf();

            state._fsp--;

             after(grammarAccess.getIfRule()); 
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
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalMyDsl.g:212:1: ruleIf : ( ( rule__If__Group__0 ) ) ;
    public final void ruleIf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__If__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__If__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__If__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__If__Group__0 )
            {
             before(grammarAccess.getIfAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__If__Group__0 )
            // InternalMyDsl.g:219:4: rule__If__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleThen"
    // InternalMyDsl.g:228:1: entryRuleThen : ruleThen EOF ;
    public final void entryRuleThen() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleThen EOF )
            // InternalMyDsl.g:230:1: ruleThen EOF
            {
             before(grammarAccess.getThenRule()); 
            pushFollow(FOLLOW_1);
            ruleThen();

            state._fsp--;

             after(grammarAccess.getThenRule()); 
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
    // $ANTLR end "entryRuleThen"


    // $ANTLR start "ruleThen"
    // InternalMyDsl.g:237:1: ruleThen : ( ( rule__Then__Group__0 ) ) ;
    public final void ruleThen() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Then__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Then__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Then__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Then__Group__0 )
            {
             before(grammarAccess.getThenAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Then__Group__0 )
            // InternalMyDsl.g:244:4: rule__Then__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Then__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleThen"


    // $ANTLR start "entryRuleElse"
    // InternalMyDsl.g:253:1: entryRuleElse : ruleElse EOF ;
    public final void entryRuleElse() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleElse EOF )
            // InternalMyDsl.g:255:1: ruleElse EOF
            {
             before(grammarAccess.getElseRule()); 
            pushFollow(FOLLOW_1);
            ruleElse();

            state._fsp--;

             after(grammarAccess.getElseRule()); 
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
    // $ANTLR end "entryRuleElse"


    // $ANTLR start "ruleElse"
    // InternalMyDsl.g:262:1: ruleElse : ( ( rule__Else__Group__0 ) ) ;
    public final void ruleElse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Else__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Else__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Else__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Else__Group__0 )
            {
             before(grammarAccess.getElseAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Else__Group__0 )
            // InternalMyDsl.g:269:4: rule__Else__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Else__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElse"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalMyDsl.g:278:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( rulePlusOrMinus EOF )
            // InternalMyDsl.g:280:1: rulePlusOrMinus EOF
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
    // InternalMyDsl.g:287:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__PlusOrMinus__Group__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__PlusOrMinus__Group__0 )
            // InternalMyDsl.g:294:4: rule__PlusOrMinus__Group__0
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
    // InternalMyDsl.g:303:1: entryRuleMultOrDiv : ruleMultOrDiv EOF ;
    public final void entryRuleMultOrDiv() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleMultOrDiv EOF )
            // InternalMyDsl.g:305:1: ruleMultOrDiv EOF
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
    // InternalMyDsl.g:312:1: ruleMultOrDiv : ( ( rule__MultOrDiv__Group__0 ) ) ;
    public final void ruleMultOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__MultOrDiv__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__MultOrDiv__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__MultOrDiv__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__MultOrDiv__Group__0 )
            {
             before(grammarAccess.getMultOrDivAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__MultOrDiv__Group__0 )
            // InternalMyDsl.g:319:4: rule__MultOrDiv__Group__0
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
    // InternalMyDsl.g:328:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( rulePrimary EOF )
            // InternalMyDsl.g:330:1: rulePrimary EOF
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
    // InternalMyDsl.g:337:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Primary__Alternatives ) )
            // InternalMyDsl.g:343:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMyDsl.g:344:3: ( rule__Primary__Alternatives )
            // InternalMyDsl.g:344:4: rule__Primary__Alternatives
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
    // InternalMyDsl.g:353:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleAtomic EOF )
            // InternalMyDsl.g:355:1: ruleAtomic EOF
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
    // InternalMyDsl.g:362:1: ruleAtomic : ( ( rule__Atomic__Group__0 ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Atomic__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Atomic__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Atomic__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Atomic__Group__0 )
            {
             before(grammarAccess.getAtomicAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Atomic__Group__0 )
            // InternalMyDsl.g:369:4: rule__Atomic__Group__0
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
    // InternalMyDsl.g:378:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleEvent EOF )
            // InternalMyDsl.g:380:1: ruleEvent EOF
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
    // InternalMyDsl.g:387:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Event__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Event__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Event__Group__0 )
            // InternalMyDsl.g:394:4: rule__Event__Group__0
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
    // InternalMyDsl.g:403:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleCondition EOF )
            // InternalMyDsl.g:405:1: ruleCondition EOF
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
    // InternalMyDsl.g:412:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Condition__Alternatives ) )
            // InternalMyDsl.g:418:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalMyDsl.g:419:3: ( rule__Condition__Alternatives )
            // InternalMyDsl.g:419:4: rule__Condition__Alternatives
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
    // InternalMyDsl.g:428:1: entryRuleSound : ruleSound EOF ;
    public final void entryRuleSound() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleSound EOF )
            // InternalMyDsl.g:430:1: ruleSound EOF
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
    // InternalMyDsl.g:437:1: ruleSound : ( ( rule__Sound__Group__0 ) ) ;
    public final void ruleSound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Sound__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Sound__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Sound__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__Sound__Group__0 )
            {
             before(grammarAccess.getSoundAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__Sound__Group__0 )
            // InternalMyDsl.g:444:4: rule__Sound__Group__0
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
    // InternalMyDsl.g:453:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleButton EOF )
            // InternalMyDsl.g:455:1: ruleButton EOF
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
    // InternalMyDsl.g:462:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Button__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Button__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Button__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__Button__Group__0 )
            // InternalMyDsl.g:469:4: rule__Button__Group__0
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
    // InternalMyDsl.g:478:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleSensor EOF )
            // InternalMyDsl.g:480:1: ruleSensor EOF
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
    // InternalMyDsl.g:487:1: ruleSensor : ( ( rule__Sensor__Group__0 ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Sensor__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Sensor__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Sensor__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__Sensor__Group__0 )
            {
             before(grammarAccess.getSensorAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__Sensor__Group__0 )
            // InternalMyDsl.g:494:4: rule__Sensor__Group__0
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
    // InternalMyDsl.g:503:1: entryRuleTap : ruleTap EOF ;
    public final void entryRuleTap() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleTap EOF )
            // InternalMyDsl.g:505:1: ruleTap EOF
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
    // InternalMyDsl.g:512:1: ruleTap : ( ( rule__Tap__Group__0 ) ) ;
    public final void ruleTap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Tap__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Tap__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Tap__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Tap__Group__0 )
            {
             before(grammarAccess.getTapAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Tap__Group__0 )
            // InternalMyDsl.g:519:4: rule__Tap__Group__0
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
    // InternalMyDsl.g:528:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleAction EOF )
            // InternalMyDsl.g:530:1: ruleAction EOF
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
    // InternalMyDsl.g:537:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Action__Alternatives ) )
            // InternalMyDsl.g:543:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalMyDsl.g:544:3: ( rule__Action__Alternatives )
            // InternalMyDsl.g:544:4: rule__Action__Alternatives
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
    // InternalMyDsl.g:553:1: entryRuleMotorAction : ruleMotorAction EOF ;
    public final void entryRuleMotorAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleMotorAction EOF )
            // InternalMyDsl.g:555:1: ruleMotorAction EOF
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
    // InternalMyDsl.g:562:1: ruleMotorAction : ( ( rule__MotorAction__Group__0 ) ) ;
    public final void ruleMotorAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__MotorAction__Group__0 ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__MotorAction__Group__0 ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__MotorAction__Group__0 ) )
            // InternalMyDsl.g:568:3: ( rule__MotorAction__Group__0 )
            {
             before(grammarAccess.getMotorActionAccess().getGroup()); 
            // InternalMyDsl.g:569:3: ( rule__MotorAction__Group__0 )
            // InternalMyDsl.g:569:4: rule__MotorAction__Group__0
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
    // InternalMyDsl.g:578:1: entryRuleSoundAction : ruleSoundAction EOF ;
    public final void entryRuleSoundAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleSoundAction EOF )
            // InternalMyDsl.g:580:1: ruleSoundAction EOF
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
    // InternalMyDsl.g:587:1: ruleSoundAction : ( ( rule__SoundAction__Group__0 ) ) ;
    public final void ruleSoundAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__SoundAction__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__SoundAction__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__SoundAction__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__SoundAction__Group__0 )
            {
             before(grammarAccess.getSoundActionAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__SoundAction__Group__0 )
            // InternalMyDsl.g:594:4: rule__SoundAction__Group__0
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
    // InternalMyDsl.g:603:1: entryRuleLightAction : ruleLightAction EOF ;
    public final void entryRuleLightAction() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleLightAction EOF )
            // InternalMyDsl.g:605:1: ruleLightAction EOF
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
    // InternalMyDsl.g:612:1: ruleLightAction : ( ( rule__LightAction__Group__0 ) ) ;
    public final void ruleLightAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__LightAction__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__LightAction__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__LightAction__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__LightAction__Group__0 )
            {
             before(grammarAccess.getLightActionAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__LightAction__Group__0 )
            // InternalMyDsl.g:619:4: rule__LightAction__Group__0
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
    // InternalMyDsl.g:628:1: entryRuleMusicSetting : ruleMusicSetting EOF ;
    public final void entryRuleMusicSetting() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleMusicSetting EOF )
            // InternalMyDsl.g:630:1: ruleMusicSetting EOF
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
    // InternalMyDsl.g:637:1: ruleMusicSetting : ( ( rule__MusicSetting__Group__0 ) ) ;
    public final void ruleMusicSetting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__MusicSetting__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__MusicSetting__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__MusicSetting__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__MusicSetting__Group__0 )
            {
             before(grammarAccess.getMusicSettingAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__MusicSetting__Group__0 )
            // InternalMyDsl.g:644:4: rule__MusicSetting__Group__0
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
    // InternalMyDsl.g:653:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleEInt EOF )
            // InternalMyDsl.g:655:1: ruleEInt EOF
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
    // InternalMyDsl.g:662:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:668:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:669:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:669:4: rule__EInt__Group__0
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
    // InternalMyDsl.g:678:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleEString EOF )
            // InternalMyDsl.g:680:1: ruleEString EOF
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
    // InternalMyDsl.g:687:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:693:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:694:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:694:4: rule__EString__Alternatives
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
    // InternalMyDsl.g:703:1: ruleDuration : ( ( rule__Duration__Alternatives ) ) ;
    public final void ruleDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:707:1: ( ( ( rule__Duration__Alternatives ) ) )
            // InternalMyDsl.g:708:2: ( ( rule__Duration__Alternatives ) )
            {
            // InternalMyDsl.g:708:2: ( ( rule__Duration__Alternatives ) )
            // InternalMyDsl.g:709:3: ( rule__Duration__Alternatives )
            {
             before(grammarAccess.getDurationAccess().getAlternatives()); 
            // InternalMyDsl.g:710:3: ( rule__Duration__Alternatives )
            // InternalMyDsl.g:710:4: rule__Duration__Alternatives
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
    // InternalMyDsl.g:719:1: ruleLightPos : ( ( rule__LightPos__Alternatives ) ) ;
    public final void ruleLightPos() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:723:1: ( ( ( rule__LightPos__Alternatives ) ) )
            // InternalMyDsl.g:724:2: ( ( rule__LightPos__Alternatives ) )
            {
            // InternalMyDsl.g:724:2: ( ( rule__LightPos__Alternatives ) )
            // InternalMyDsl.g:725:3: ( rule__LightPos__Alternatives )
            {
             before(grammarAccess.getLightPosAccess().getAlternatives()); 
            // InternalMyDsl.g:726:3: ( rule__LightPos__Alternatives )
            // InternalMyDsl.g:726:4: rule__LightPos__Alternatives
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
    // InternalMyDsl.g:735:1: ruleButtonType : ( ( rule__ButtonType__Alternatives ) ) ;
    public final void ruleButtonType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:739:1: ( ( ( rule__ButtonType__Alternatives ) ) )
            // InternalMyDsl.g:740:2: ( ( rule__ButtonType__Alternatives ) )
            {
            // InternalMyDsl.g:740:2: ( ( rule__ButtonType__Alternatives ) )
            // InternalMyDsl.g:741:3: ( rule__ButtonType__Alternatives )
            {
             before(grammarAccess.getButtonTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:742:3: ( rule__ButtonType__Alternatives )
            // InternalMyDsl.g:742:4: rule__ButtonType__Alternatives
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
    // InternalMyDsl.g:750:1: rule__RobotModel__Alternatives_1 : ( ( ( rule__RobotModel__EventsAssignment_1_0 ) ) | ( ( rule__RobotModel__Group_1_1__0 ) ) | ( ( rule__RobotModel__Group_1_2__0 ) ) | ( ( rule__RobotModel__ExpressionsAssignment_1_3 ) ) );
    public final void rule__RobotModel__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:754:1: ( ( ( rule__RobotModel__EventsAssignment_1_0 ) ) | ( ( rule__RobotModel__Group_1_1__0 ) ) | ( ( rule__RobotModel__Group_1_2__0 ) ) | ( ( rule__RobotModel__ExpressionsAssignment_1_3 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt1=1;
                }
                break;
            case 33:
                {
                alt1=2;
                }
                break;
            case 34:
                {
                alt1=3;
                }
                break;
            case RULE_INT:
            case 21:
            case 22:
            case 35:
            case 59:
            case 62:
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
                    // InternalMyDsl.g:755:2: ( ( rule__RobotModel__EventsAssignment_1_0 ) )
                    {
                    // InternalMyDsl.g:755:2: ( ( rule__RobotModel__EventsAssignment_1_0 ) )
                    // InternalMyDsl.g:756:3: ( rule__RobotModel__EventsAssignment_1_0 )
                    {
                     before(grammarAccess.getRobotModelAccess().getEventsAssignment_1_0()); 
                    // InternalMyDsl.g:757:3: ( rule__RobotModel__EventsAssignment_1_0 )
                    // InternalMyDsl.g:757:4: rule__RobotModel__EventsAssignment_1_0
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
                    // InternalMyDsl.g:761:2: ( ( rule__RobotModel__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:761:2: ( ( rule__RobotModel__Group_1_1__0 ) )
                    // InternalMyDsl.g:762:3: ( rule__RobotModel__Group_1_1__0 )
                    {
                     before(grammarAccess.getRobotModelAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:763:3: ( rule__RobotModel__Group_1_1__0 )
                    // InternalMyDsl.g:763:4: rule__RobotModel__Group_1_1__0
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
                    // InternalMyDsl.g:767:2: ( ( rule__RobotModel__Group_1_2__0 ) )
                    {
                    // InternalMyDsl.g:767:2: ( ( rule__RobotModel__Group_1_2__0 ) )
                    // InternalMyDsl.g:768:3: ( rule__RobotModel__Group_1_2__0 )
                    {
                     before(grammarAccess.getRobotModelAccess().getGroup_1_2()); 
                    // InternalMyDsl.g:769:3: ( rule__RobotModel__Group_1_2__0 )
                    // InternalMyDsl.g:769:4: rule__RobotModel__Group_1_2__0
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
                    // InternalMyDsl.g:773:2: ( ( rule__RobotModel__ExpressionsAssignment_1_3 ) )
                    {
                    // InternalMyDsl.g:773:2: ( ( rule__RobotModel__ExpressionsAssignment_1_3 ) )
                    // InternalMyDsl.g:774:3: ( rule__RobotModel__ExpressionsAssignment_1_3 )
                    {
                     before(grammarAccess.getRobotModelAccess().getExpressionsAssignment_1_3()); 
                    // InternalMyDsl.g:775:3: ( rule__RobotModel__ExpressionsAssignment_1_3 )
                    // InternalMyDsl.g:775:4: rule__RobotModel__ExpressionsAssignment_1_3
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


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalMyDsl.g:783:1: rule__Expression__Alternatives : ( ( ruleOr ) | ( ruleIf ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:787:1: ( ( ruleOr ) | ( ruleIf ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT||(LA2_0>=21 && LA2_0<=22)||LA2_0==35||LA2_0==62) ) {
                alt2=1;
            }
            else if ( (LA2_0==59) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:788:2: ( ruleOr )
                    {
                    // InternalMyDsl.g:788:2: ( ruleOr )
                    // InternalMyDsl.g:789:3: ruleOr
                    {
                     before(grammarAccess.getExpressionAccess().getOrParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOr();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getOrParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:794:2: ( ruleIf )
                    {
                    // InternalMyDsl.g:794:2: ( ruleIf )
                    // InternalMyDsl.g:795:3: ruleIf
                    {
                     before(grammarAccess.getExpressionAccess().getIfParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleIf();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getIfParserRuleCall_1()); 

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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Equality__OperationAlternatives_1_1_0"
    // InternalMyDsl.g:804:1: rule__Equality__OperationAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__Equality__OperationAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:808:1: ( ( '==' ) | ( '!=' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:809:2: ( '==' )
                    {
                    // InternalMyDsl.g:809:2: ( '==' )
                    // InternalMyDsl.g:810:3: '=='
                    {
                     before(grammarAccess.getEqualityAccess().getOperationEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOperationEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:815:2: ( '!=' )
                    {
                    // InternalMyDsl.g:815:2: ( '!=' )
                    // InternalMyDsl.g:816:3: '!='
                    {
                     before(grammarAccess.getEqualityAccess().getOperationExclamationMarkEqualsSignKeyword_1_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOperationExclamationMarkEqualsSignKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Equality__OperationAlternatives_1_1_0"


    // $ANTLR start "rule__Comparison__OperationAlternatives_1_1_0"
    // InternalMyDsl.g:825:1: rule__Comparison__OperationAlternatives_1_1_0 : ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public final void rule__Comparison__OperationAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:829:1: ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt4=1;
                }
                break;
            case 14:
                {
                alt4=2;
                }
                break;
            case 15:
                {
                alt4=3;
                }
                break;
            case 16:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:830:2: ( '>=' )
                    {
                    // InternalMyDsl.g:830:2: ( '>=' )
                    // InternalMyDsl.g:831:3: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getOperationGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOperationGreaterThanSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:836:2: ( '<=' )
                    {
                    // InternalMyDsl.g:836:2: ( '<=' )
                    // InternalMyDsl.g:837:3: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getOperationLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOperationLessThanSignEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:842:2: ( '>' )
                    {
                    // InternalMyDsl.g:842:2: ( '>' )
                    // InternalMyDsl.g:843:3: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getOperationGreaterThanSignKeyword_1_1_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOperationGreaterThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:848:2: ( '<' )
                    {
                    // InternalMyDsl.g:848:2: ( '<' )
                    // InternalMyDsl.g:849:3: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getOperationLessThanSignKeyword_1_1_0_3()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOperationLessThanSignKeyword_1_1_0_3()); 

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
    // $ANTLR end "rule__Comparison__OperationAlternatives_1_1_0"


    // $ANTLR start "rule__PlusOrMinus__OperationAlternatives_1_0_1_0"
    // InternalMyDsl.g:858:1: rule__PlusOrMinus__OperationAlternatives_1_0_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__PlusOrMinus__OperationAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:862:1: ( ( '+' ) | ( '-' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:863:2: ( '+' )
                    {
                    // InternalMyDsl.g:863:2: ( '+' )
                    // InternalMyDsl.g:864:3: '+'
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getOperationPlusSignKeyword_1_0_1_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPlusOrMinusAccess().getOperationPlusSignKeyword_1_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:869:2: ( '-' )
                    {
                    // InternalMyDsl.g:869:2: ( '-' )
                    // InternalMyDsl.g:870:3: '-'
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getOperationHyphenMinusKeyword_1_0_1_0_1()); 
                    match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:879:1: rule__MultOrDiv__OperationAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MultOrDiv__OperationAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:883:1: ( ( '*' ) | ( '/' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:884:2: ( '*' )
                    {
                    // InternalMyDsl.g:884:2: ( '*' )
                    // InternalMyDsl.g:885:3: '*'
                    {
                     before(grammarAccess.getMultOrDivAccess().getOperationAsteriskKeyword_1_1_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getMultOrDivAccess().getOperationAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:890:2: ( '/' )
                    {
                    // InternalMyDsl.g:890:2: ( '/' )
                    // InternalMyDsl.g:891:3: '/'
                    {
                     before(grammarAccess.getMultOrDivAccess().getOperationSolidusKeyword_1_1_0_1()); 
                    match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:900:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:904:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt7=1;
                }
                break;
            case 62:
                {
                alt7=2;
                }
                break;
            case RULE_INT:
            case 21:
            case 22:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:905:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:905:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalMyDsl.g:906:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalMyDsl.g:907:3: ( rule__Primary__Group_0__0 )
                    // InternalMyDsl.g:907:4: rule__Primary__Group_0__0
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
                    // InternalMyDsl.g:911:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:911:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalMyDsl.g:912:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalMyDsl.g:913:3: ( rule__Primary__Group_1__0 )
                    // InternalMyDsl.g:913:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:917:2: ( ruleAtomic )
                    {
                    // InternalMyDsl.g:917:2: ( ruleAtomic )
                    // InternalMyDsl.g:918:3: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 

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


    // $ANTLR start "rule__Atomic__Alternatives_1"
    // InternalMyDsl.g:927:1: rule__Atomic__Alternatives_1 : ( ( ( rule__Atomic__ValueAssignment_1_0 ) ) | ( ( rule__Atomic__Alternatives_1_1 ) ) );
    public final void rule__Atomic__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:931:1: ( ( ( rule__Atomic__ValueAssignment_1_0 ) ) | ( ( rule__Atomic__Alternatives_1_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=21 && LA8_0<=22)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:932:2: ( ( rule__Atomic__ValueAssignment_1_0 ) )
                    {
                    // InternalMyDsl.g:932:2: ( ( rule__Atomic__ValueAssignment_1_0 ) )
                    // InternalMyDsl.g:933:3: ( rule__Atomic__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getAtomicAccess().getValueAssignment_1_0()); 
                    // InternalMyDsl.g:934:3: ( rule__Atomic__ValueAssignment_1_0 )
                    // InternalMyDsl.g:934:4: rule__Atomic__ValueAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__ValueAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getValueAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:938:2: ( ( rule__Atomic__Alternatives_1_1 ) )
                    {
                    // InternalMyDsl.g:938:2: ( ( rule__Atomic__Alternatives_1_1 ) )
                    // InternalMyDsl.g:939:3: ( rule__Atomic__Alternatives_1_1 )
                    {
                     before(grammarAccess.getAtomicAccess().getAlternatives_1_1()); 
                    // InternalMyDsl.g:940:3: ( rule__Atomic__Alternatives_1_1 )
                    // InternalMyDsl.g:940:4: rule__Atomic__Alternatives_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Alternatives_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getAlternatives_1_1()); 

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
    // $ANTLR end "rule__Atomic__Alternatives_1"


    // $ANTLR start "rule__Atomic__Alternatives_1_1"
    // InternalMyDsl.g:948:1: rule__Atomic__Alternatives_1_1 : ( ( 'TRUE' ) | ( 'FALSE' ) );
    public final void rule__Atomic__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:952:1: ( ( 'TRUE' ) | ( 'FALSE' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:953:2: ( 'TRUE' )
                    {
                    // InternalMyDsl.g:953:2: ( 'TRUE' )
                    // InternalMyDsl.g:954:3: 'TRUE'
                    {
                     before(grammarAccess.getAtomicAccess().getTRUEKeyword_1_1_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getTRUEKeyword_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:959:2: ( 'FALSE' )
                    {
                    // InternalMyDsl.g:959:2: ( 'FALSE' )
                    // InternalMyDsl.g:960:3: 'FALSE'
                    {
                     before(grammarAccess.getAtomicAccess().getFALSEKeyword_1_1_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getFALSEKeyword_1_1_1()); 

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
    // $ANTLR end "rule__Atomic__Alternatives_1_1"


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalMyDsl.g:969:1: rule__Condition__Alternatives : ( ( ruleButton ) | ( ruleSensor ) | ( ruleSound ) | ( ruleTap ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:973:1: ( ( ruleButton ) | ( ruleSensor ) | ( ruleSound ) | ( ruleTap ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt10=1;
                }
                break;
            case 44:
                {
                alt10=2;
                }
                break;
            case 41:
                {
                alt10=3;
                }
                break;
            case 46:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:974:2: ( ruleButton )
                    {
                    // InternalMyDsl.g:974:2: ( ruleButton )
                    // InternalMyDsl.g:975:3: ruleButton
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
                    // InternalMyDsl.g:980:2: ( ruleSensor )
                    {
                    // InternalMyDsl.g:980:2: ( ruleSensor )
                    // InternalMyDsl.g:981:3: ruleSensor
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
                    // InternalMyDsl.g:986:2: ( ruleSound )
                    {
                    // InternalMyDsl.g:986:2: ( ruleSound )
                    // InternalMyDsl.g:987:3: ruleSound
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
                    // InternalMyDsl.g:992:2: ( ruleTap )
                    {
                    // InternalMyDsl.g:992:2: ( ruleTap )
                    // InternalMyDsl.g:993:3: ruleTap
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
    // InternalMyDsl.g:1002:1: rule__Action__Alternatives : ( ( ruleMotorAction ) | ( ruleSoundAction ) | ( ruleLightAction ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1006:1: ( ( ruleMotorAction ) | ( ruleSoundAction ) | ( ruleLightAction ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt11=1;
                }
                break;
            case 50:
                {
                alt11=2;
                }
                break;
            case 52:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1007:2: ( ruleMotorAction )
                    {
                    // InternalMyDsl.g:1007:2: ( ruleMotorAction )
                    // InternalMyDsl.g:1008:3: ruleMotorAction
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
                    // InternalMyDsl.g:1013:2: ( ruleSoundAction )
                    {
                    // InternalMyDsl.g:1013:2: ( ruleSoundAction )
                    // InternalMyDsl.g:1014:3: ruleSoundAction
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
                    // InternalMyDsl.g:1019:2: ( ruleLightAction )
                    {
                    // InternalMyDsl.g:1019:2: ( ruleLightAction )
                    // InternalMyDsl.g:1020:3: ruleLightAction
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
    // InternalMyDsl.g:1029:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1033:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ID) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1034:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:1034:2: ( RULE_STRING )
                    // InternalMyDsl.g:1035:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1040:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:1040:2: ( RULE_ID )
                    // InternalMyDsl.g:1041:3: RULE_ID
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
    // InternalMyDsl.g:1050:1: rule__Duration__Alternatives : ( ( ( 'NONE' ) ) | ( ( 'MEDIUM' ) ) | ( ( 'LONG' ) ) );
    public final void rule__Duration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1054:1: ( ( ( 'NONE' ) ) | ( ( 'MEDIUM' ) ) | ( ( 'LONG' ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt13=1;
                }
                break;
            case 24:
                {
                alt13=2;
                }
                break;
            case 25:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1055:2: ( ( 'NONE' ) )
                    {
                    // InternalMyDsl.g:1055:2: ( ( 'NONE' ) )
                    // InternalMyDsl.g:1056:3: ( 'NONE' )
                    {
                     before(grammarAccess.getDurationAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1057:3: ( 'NONE' )
                    // InternalMyDsl.g:1057:4: 'NONE'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDurationAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1061:2: ( ( 'MEDIUM' ) )
                    {
                    // InternalMyDsl.g:1061:2: ( ( 'MEDIUM' ) )
                    // InternalMyDsl.g:1062:3: ( 'MEDIUM' )
                    {
                     before(grammarAccess.getDurationAccess().getMEDIUMEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1063:3: ( 'MEDIUM' )
                    // InternalMyDsl.g:1063:4: 'MEDIUM'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDurationAccess().getMEDIUMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1067:2: ( ( 'LONG' ) )
                    {
                    // InternalMyDsl.g:1067:2: ( ( 'LONG' ) )
                    // InternalMyDsl.g:1068:3: ( 'LONG' )
                    {
                     before(grammarAccess.getDurationAccess().getLONGEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1069:3: ( 'LONG' )
                    // InternalMyDsl.g:1069:4: 'LONG'
                    {
                    match(input,25,FOLLOW_2); 

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
    // InternalMyDsl.g:1077:1: rule__LightPos__Alternatives : ( ( ( 'TOP' ) ) | ( ( 'BOT' ) ) );
    public final void rule__LightPos__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1081:1: ( ( ( 'TOP' ) ) | ( ( 'BOT' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            else if ( (LA14_0==27) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1082:2: ( ( 'TOP' ) )
                    {
                    // InternalMyDsl.g:1082:2: ( ( 'TOP' ) )
                    // InternalMyDsl.g:1083:3: ( 'TOP' )
                    {
                     before(grammarAccess.getLightPosAccess().getTOPEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1084:3: ( 'TOP' )
                    // InternalMyDsl.g:1084:4: 'TOP'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getLightPosAccess().getTOPEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1088:2: ( ( 'BOT' ) )
                    {
                    // InternalMyDsl.g:1088:2: ( ( 'BOT' ) )
                    // InternalMyDsl.g:1089:3: ( 'BOT' )
                    {
                     before(grammarAccess.getLightPosAccess().getBOTEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1090:3: ( 'BOT' )
                    // InternalMyDsl.g:1090:4: 'BOT'
                    {
                    match(input,27,FOLLOW_2); 

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
    // InternalMyDsl.g:1098:1: rule__ButtonType__Alternatives : ( ( ( 'BACKWARD' ) ) | ( ( 'LEFT' ) ) | ( ( 'RIGHT' ) ) | ( ( 'CENTER' ) ) | ( ( 'FORWARD' ) ) );
    public final void rule__ButtonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1102:1: ( ( ( 'BACKWARD' ) ) | ( ( 'LEFT' ) ) | ( ( 'RIGHT' ) ) | ( ( 'CENTER' ) ) | ( ( 'FORWARD' ) ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt15=1;
                }
                break;
            case 29:
                {
                alt15=2;
                }
                break;
            case 30:
                {
                alt15=3;
                }
                break;
            case 31:
                {
                alt15=4;
                }
                break;
            case 32:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1103:2: ( ( 'BACKWARD' ) )
                    {
                    // InternalMyDsl.g:1103:2: ( ( 'BACKWARD' ) )
                    // InternalMyDsl.g:1104:3: ( 'BACKWARD' )
                    {
                     before(grammarAccess.getButtonTypeAccess().getBACKWARDEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1105:3: ( 'BACKWARD' )
                    // InternalMyDsl.g:1105:4: 'BACKWARD'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getButtonTypeAccess().getBACKWARDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1109:2: ( ( 'LEFT' ) )
                    {
                    // InternalMyDsl.g:1109:2: ( ( 'LEFT' ) )
                    // InternalMyDsl.g:1110:3: ( 'LEFT' )
                    {
                     before(grammarAccess.getButtonTypeAccess().getLEFTEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1111:3: ( 'LEFT' )
                    // InternalMyDsl.g:1111:4: 'LEFT'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getButtonTypeAccess().getLEFTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1115:2: ( ( 'RIGHT' ) )
                    {
                    // InternalMyDsl.g:1115:2: ( ( 'RIGHT' ) )
                    // InternalMyDsl.g:1116:3: ( 'RIGHT' )
                    {
                     before(grammarAccess.getButtonTypeAccess().getRIGHTEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1117:3: ( 'RIGHT' )
                    // InternalMyDsl.g:1117:4: 'RIGHT'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getButtonTypeAccess().getRIGHTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1121:2: ( ( 'CENTER' ) )
                    {
                    // InternalMyDsl.g:1121:2: ( ( 'CENTER' ) )
                    // InternalMyDsl.g:1122:3: ( 'CENTER' )
                    {
                     before(grammarAccess.getButtonTypeAccess().getCENTEREnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:1123:3: ( 'CENTER' )
                    // InternalMyDsl.g:1123:4: 'CENTER'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getButtonTypeAccess().getCENTEREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1127:2: ( ( 'FORWARD' ) )
                    {
                    // InternalMyDsl.g:1127:2: ( ( 'FORWARD' ) )
                    // InternalMyDsl.g:1128:3: ( 'FORWARD' )
                    {
                     before(grammarAccess.getButtonTypeAccess().getFORWARDEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:1129:3: ( 'FORWARD' )
                    // InternalMyDsl.g:1129:4: 'FORWARD'
                    {
                    match(input,32,FOLLOW_2); 

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
    // InternalMyDsl.g:1137:1: rule__RobotModel__Group__0 : rule__RobotModel__Group__0__Impl rule__RobotModel__Group__1 ;
    public final void rule__RobotModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1141:1: ( rule__RobotModel__Group__0__Impl rule__RobotModel__Group__1 )
            // InternalMyDsl.g:1142:2: rule__RobotModel__Group__0__Impl rule__RobotModel__Group__1
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
    // InternalMyDsl.g:1149:1: rule__RobotModel__Group__0__Impl : ( () ) ;
    public final void rule__RobotModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1153:1: ( ( () ) )
            // InternalMyDsl.g:1154:1: ( () )
            {
            // InternalMyDsl.g:1154:1: ( () )
            // InternalMyDsl.g:1155:2: ()
            {
             before(grammarAccess.getRobotModelAccess().getRobotModelAction_0()); 
            // InternalMyDsl.g:1156:2: ()
            // InternalMyDsl.g:1156:3: 
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
    // InternalMyDsl.g:1164:1: rule__RobotModel__Group__1 : rule__RobotModel__Group__1__Impl ;
    public final void rule__RobotModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1168:1: ( rule__RobotModel__Group__1__Impl )
            // InternalMyDsl.g:1169:2: rule__RobotModel__Group__1__Impl
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
    // InternalMyDsl.g:1175:1: rule__RobotModel__Group__1__Impl : ( ( rule__RobotModel__Alternatives_1 )* ) ;
    public final void rule__RobotModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1179:1: ( ( ( rule__RobotModel__Alternatives_1 )* ) )
            // InternalMyDsl.g:1180:1: ( ( rule__RobotModel__Alternatives_1 )* )
            {
            // InternalMyDsl.g:1180:1: ( ( rule__RobotModel__Alternatives_1 )* )
            // InternalMyDsl.g:1181:2: ( rule__RobotModel__Alternatives_1 )*
            {
             before(grammarAccess.getRobotModelAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1182:2: ( rule__RobotModel__Alternatives_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_INT||(LA16_0>=21 && LA16_0<=22)||(LA16_0>=33 && LA16_0<=35)||LA16_0==37||LA16_0==59||LA16_0==62) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1182:3: rule__RobotModel__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__RobotModel__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalMyDsl.g:1191:1: rule__RobotModel__Group_1_1__0 : rule__RobotModel__Group_1_1__0__Impl rule__RobotModel__Group_1_1__1 ;
    public final void rule__RobotModel__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1195:1: ( rule__RobotModel__Group_1_1__0__Impl rule__RobotModel__Group_1_1__1 )
            // InternalMyDsl.g:1196:2: rule__RobotModel__Group_1_1__0__Impl rule__RobotModel__Group_1_1__1
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
    // InternalMyDsl.g:1203:1: rule__RobotModel__Group_1_1__0__Impl : ( 'Action:' ) ;
    public final void rule__RobotModel__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1207:1: ( ( 'Action:' ) )
            // InternalMyDsl.g:1208:1: ( 'Action:' )
            {
            // InternalMyDsl.g:1208:1: ( 'Action:' )
            // InternalMyDsl.g:1209:2: 'Action:'
            {
             before(grammarAccess.getRobotModelAccess().getActionKeyword_1_1_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalMyDsl.g:1218:1: rule__RobotModel__Group_1_1__1 : rule__RobotModel__Group_1_1__1__Impl rule__RobotModel__Group_1_1__2 ;
    public final void rule__RobotModel__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1222:1: ( rule__RobotModel__Group_1_1__1__Impl rule__RobotModel__Group_1_1__2 )
            // InternalMyDsl.g:1223:2: rule__RobotModel__Group_1_1__1__Impl rule__RobotModel__Group_1_1__2
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
    // InternalMyDsl.g:1230:1: rule__RobotModel__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__RobotModel__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1234:1: ( ( '-' ) )
            // InternalMyDsl.g:1235:1: ( '-' )
            {
            // InternalMyDsl.g:1235:1: ( '-' )
            // InternalMyDsl.g:1236:2: '-'
            {
             before(grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_1_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:1245:1: rule__RobotModel__Group_1_1__2 : rule__RobotModel__Group_1_1__2__Impl rule__RobotModel__Group_1_1__3 ;
    public final void rule__RobotModel__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1249:1: ( rule__RobotModel__Group_1_1__2__Impl rule__RobotModel__Group_1_1__3 )
            // InternalMyDsl.g:1250:2: rule__RobotModel__Group_1_1__2__Impl rule__RobotModel__Group_1_1__3
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
    // InternalMyDsl.g:1257:1: rule__RobotModel__Group_1_1__2__Impl : ( ( rule__RobotModel__ActionsAssignment_1_1_2 ) ) ;
    public final void rule__RobotModel__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1261:1: ( ( ( rule__RobotModel__ActionsAssignment_1_1_2 ) ) )
            // InternalMyDsl.g:1262:1: ( ( rule__RobotModel__ActionsAssignment_1_1_2 ) )
            {
            // InternalMyDsl.g:1262:1: ( ( rule__RobotModel__ActionsAssignment_1_1_2 ) )
            // InternalMyDsl.g:1263:2: ( rule__RobotModel__ActionsAssignment_1_1_2 )
            {
             before(grammarAccess.getRobotModelAccess().getActionsAssignment_1_1_2()); 
            // InternalMyDsl.g:1264:2: ( rule__RobotModel__ActionsAssignment_1_1_2 )
            // InternalMyDsl.g:1264:3: rule__RobotModel__ActionsAssignment_1_1_2
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
    // InternalMyDsl.g:1272:1: rule__RobotModel__Group_1_1__3 : rule__RobotModel__Group_1_1__3__Impl ;
    public final void rule__RobotModel__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1276:1: ( rule__RobotModel__Group_1_1__3__Impl )
            // InternalMyDsl.g:1277:2: rule__RobotModel__Group_1_1__3__Impl
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
    // InternalMyDsl.g:1283:1: rule__RobotModel__Group_1_1__3__Impl : ( ( rule__RobotModel__Group_1_1_3__0 )* ) ;
    public final void rule__RobotModel__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1287:1: ( ( ( rule__RobotModel__Group_1_1_3__0 )* ) )
            // InternalMyDsl.g:1288:1: ( ( rule__RobotModel__Group_1_1_3__0 )* )
            {
            // InternalMyDsl.g:1288:1: ( ( rule__RobotModel__Group_1_1_3__0 )* )
            // InternalMyDsl.g:1289:2: ( rule__RobotModel__Group_1_1_3__0 )*
            {
             before(grammarAccess.getRobotModelAccess().getGroup_1_1_3()); 
            // InternalMyDsl.g:1290:2: ( rule__RobotModel__Group_1_1_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==18) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1290:3: rule__RobotModel__Group_1_1_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RobotModel__Group_1_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalMyDsl.g:1299:1: rule__RobotModel__Group_1_1_3__0 : rule__RobotModel__Group_1_1_3__0__Impl rule__RobotModel__Group_1_1_3__1 ;
    public final void rule__RobotModel__Group_1_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1303:1: ( rule__RobotModel__Group_1_1_3__0__Impl rule__RobotModel__Group_1_1_3__1 )
            // InternalMyDsl.g:1304:2: rule__RobotModel__Group_1_1_3__0__Impl rule__RobotModel__Group_1_1_3__1
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
    // InternalMyDsl.g:1311:1: rule__RobotModel__Group_1_1_3__0__Impl : ( '-' ) ;
    public final void rule__RobotModel__Group_1_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1315:1: ( ( '-' ) )
            // InternalMyDsl.g:1316:1: ( '-' )
            {
            // InternalMyDsl.g:1316:1: ( '-' )
            // InternalMyDsl.g:1317:2: '-'
            {
             before(grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_1_3_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:1326:1: rule__RobotModel__Group_1_1_3__1 : rule__RobotModel__Group_1_1_3__1__Impl ;
    public final void rule__RobotModel__Group_1_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1330:1: ( rule__RobotModel__Group_1_1_3__1__Impl )
            // InternalMyDsl.g:1331:2: rule__RobotModel__Group_1_1_3__1__Impl
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
    // InternalMyDsl.g:1337:1: rule__RobotModel__Group_1_1_3__1__Impl : ( ( rule__RobotModel__ActionsAssignment_1_1_3_1 ) ) ;
    public final void rule__RobotModel__Group_1_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1341:1: ( ( ( rule__RobotModel__ActionsAssignment_1_1_3_1 ) ) )
            // InternalMyDsl.g:1342:1: ( ( rule__RobotModel__ActionsAssignment_1_1_3_1 ) )
            {
            // InternalMyDsl.g:1342:1: ( ( rule__RobotModel__ActionsAssignment_1_1_3_1 ) )
            // InternalMyDsl.g:1343:2: ( rule__RobotModel__ActionsAssignment_1_1_3_1 )
            {
             before(grammarAccess.getRobotModelAccess().getActionsAssignment_1_1_3_1()); 
            // InternalMyDsl.g:1344:2: ( rule__RobotModel__ActionsAssignment_1_1_3_1 )
            // InternalMyDsl.g:1344:3: rule__RobotModel__ActionsAssignment_1_1_3_1
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
    // InternalMyDsl.g:1353:1: rule__RobotModel__Group_1_2__0 : rule__RobotModel__Group_1_2__0__Impl rule__RobotModel__Group_1_2__1 ;
    public final void rule__RobotModel__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1357:1: ( rule__RobotModel__Group_1_2__0__Impl rule__RobotModel__Group_1_2__1 )
            // InternalMyDsl.g:1358:2: rule__RobotModel__Group_1_2__0__Impl rule__RobotModel__Group_1_2__1
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
    // InternalMyDsl.g:1365:1: rule__RobotModel__Group_1_2__0__Impl : ( 'Condition:' ) ;
    public final void rule__RobotModel__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1369:1: ( ( 'Condition:' ) )
            // InternalMyDsl.g:1370:1: ( 'Condition:' )
            {
            // InternalMyDsl.g:1370:1: ( 'Condition:' )
            // InternalMyDsl.g:1371:2: 'Condition:'
            {
             before(grammarAccess.getRobotModelAccess().getConditionKeyword_1_2_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalMyDsl.g:1380:1: rule__RobotModel__Group_1_2__1 : rule__RobotModel__Group_1_2__1__Impl rule__RobotModel__Group_1_2__2 ;
    public final void rule__RobotModel__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1384:1: ( rule__RobotModel__Group_1_2__1__Impl rule__RobotModel__Group_1_2__2 )
            // InternalMyDsl.g:1385:2: rule__RobotModel__Group_1_2__1__Impl rule__RobotModel__Group_1_2__2
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
    // InternalMyDsl.g:1392:1: rule__RobotModel__Group_1_2__1__Impl : ( '-' ) ;
    public final void rule__RobotModel__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1396:1: ( ( '-' ) )
            // InternalMyDsl.g:1397:1: ( '-' )
            {
            // InternalMyDsl.g:1397:1: ( '-' )
            // InternalMyDsl.g:1398:2: '-'
            {
             before(grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_2_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:1407:1: rule__RobotModel__Group_1_2__2 : rule__RobotModel__Group_1_2__2__Impl rule__RobotModel__Group_1_2__3 ;
    public final void rule__RobotModel__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1411:1: ( rule__RobotModel__Group_1_2__2__Impl rule__RobotModel__Group_1_2__3 )
            // InternalMyDsl.g:1412:2: rule__RobotModel__Group_1_2__2__Impl rule__RobotModel__Group_1_2__3
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
    // InternalMyDsl.g:1419:1: rule__RobotModel__Group_1_2__2__Impl : ( ( rule__RobotModel__ConditionsAssignment_1_2_2 ) ) ;
    public final void rule__RobotModel__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1423:1: ( ( ( rule__RobotModel__ConditionsAssignment_1_2_2 ) ) )
            // InternalMyDsl.g:1424:1: ( ( rule__RobotModel__ConditionsAssignment_1_2_2 ) )
            {
            // InternalMyDsl.g:1424:1: ( ( rule__RobotModel__ConditionsAssignment_1_2_2 ) )
            // InternalMyDsl.g:1425:2: ( rule__RobotModel__ConditionsAssignment_1_2_2 )
            {
             before(grammarAccess.getRobotModelAccess().getConditionsAssignment_1_2_2()); 
            // InternalMyDsl.g:1426:2: ( rule__RobotModel__ConditionsAssignment_1_2_2 )
            // InternalMyDsl.g:1426:3: rule__RobotModel__ConditionsAssignment_1_2_2
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
    // InternalMyDsl.g:1434:1: rule__RobotModel__Group_1_2__3 : rule__RobotModel__Group_1_2__3__Impl ;
    public final void rule__RobotModel__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1438:1: ( rule__RobotModel__Group_1_2__3__Impl )
            // InternalMyDsl.g:1439:2: rule__RobotModel__Group_1_2__3__Impl
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
    // InternalMyDsl.g:1445:1: rule__RobotModel__Group_1_2__3__Impl : ( ( rule__RobotModel__Group_1_2_3__0 )* ) ;
    public final void rule__RobotModel__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1449:1: ( ( ( rule__RobotModel__Group_1_2_3__0 )* ) )
            // InternalMyDsl.g:1450:1: ( ( rule__RobotModel__Group_1_2_3__0 )* )
            {
            // InternalMyDsl.g:1450:1: ( ( rule__RobotModel__Group_1_2_3__0 )* )
            // InternalMyDsl.g:1451:2: ( rule__RobotModel__Group_1_2_3__0 )*
            {
             before(grammarAccess.getRobotModelAccess().getGroup_1_2_3()); 
            // InternalMyDsl.g:1452:2: ( rule__RobotModel__Group_1_2_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==18) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1452:3: rule__RobotModel__Group_1_2_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RobotModel__Group_1_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMyDsl.g:1461:1: rule__RobotModel__Group_1_2_3__0 : rule__RobotModel__Group_1_2_3__0__Impl rule__RobotModel__Group_1_2_3__1 ;
    public final void rule__RobotModel__Group_1_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1465:1: ( rule__RobotModel__Group_1_2_3__0__Impl rule__RobotModel__Group_1_2_3__1 )
            // InternalMyDsl.g:1466:2: rule__RobotModel__Group_1_2_3__0__Impl rule__RobotModel__Group_1_2_3__1
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
    // InternalMyDsl.g:1473:1: rule__RobotModel__Group_1_2_3__0__Impl : ( '-' ) ;
    public final void rule__RobotModel__Group_1_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1477:1: ( ( '-' ) )
            // InternalMyDsl.g:1478:1: ( '-' )
            {
            // InternalMyDsl.g:1478:1: ( '-' )
            // InternalMyDsl.g:1479:2: '-'
            {
             before(grammarAccess.getRobotModelAccess().getHyphenMinusKeyword_1_2_3_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:1488:1: rule__RobotModel__Group_1_2_3__1 : rule__RobotModel__Group_1_2_3__1__Impl ;
    public final void rule__RobotModel__Group_1_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1492:1: ( rule__RobotModel__Group_1_2_3__1__Impl )
            // InternalMyDsl.g:1493:2: rule__RobotModel__Group_1_2_3__1__Impl
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
    // InternalMyDsl.g:1499:1: rule__RobotModel__Group_1_2_3__1__Impl : ( ( rule__RobotModel__ConditionsAssignment_1_2_3_1 ) ) ;
    public final void rule__RobotModel__Group_1_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1503:1: ( ( ( rule__RobotModel__ConditionsAssignment_1_2_3_1 ) ) )
            // InternalMyDsl.g:1504:1: ( ( rule__RobotModel__ConditionsAssignment_1_2_3_1 ) )
            {
            // InternalMyDsl.g:1504:1: ( ( rule__RobotModel__ConditionsAssignment_1_2_3_1 ) )
            // InternalMyDsl.g:1505:2: ( rule__RobotModel__ConditionsAssignment_1_2_3_1 )
            {
             before(grammarAccess.getRobotModelAccess().getConditionsAssignment_1_2_3_1()); 
            // InternalMyDsl.g:1506:2: ( rule__RobotModel__ConditionsAssignment_1_2_3_1 )
            // InternalMyDsl.g:1506:3: rule__RobotModel__ConditionsAssignment_1_2_3_1
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


    // $ANTLR start "rule__Or__Group__0"
    // InternalMyDsl.g:1515:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1519:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalMyDsl.g:1520:2: rule__Or__Group__0__Impl rule__Or__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Or__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group__1();

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
    // $ANTLR end "rule__Or__Group__0"


    // $ANTLR start "rule__Or__Group__0__Impl"
    // InternalMyDsl.g:1527:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1531:1: ( ( ruleAnd ) )
            // InternalMyDsl.g:1532:1: ( ruleAnd )
            {
            // InternalMyDsl.g:1532:1: ( ruleAnd )
            // InternalMyDsl.g:1533:2: ruleAnd
            {
             before(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__0__Impl"


    // $ANTLR start "rule__Or__Group__1"
    // InternalMyDsl.g:1542:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1546:1: ( rule__Or__Group__1__Impl )
            // InternalMyDsl.g:1547:2: rule__Or__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group__1__Impl();

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
    // $ANTLR end "rule__Or__Group__1"


    // $ANTLR start "rule__Or__Group__1__Impl"
    // InternalMyDsl.g:1553:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1557:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalMyDsl.g:1558:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalMyDsl.g:1558:1: ( ( rule__Or__Group_1__0 )* )
            // InternalMyDsl.g:1559:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalMyDsl.g:1560:2: ( rule__Or__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==57) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1560:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getOrAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group__1__Impl"


    // $ANTLR start "rule__Or__Group_1__0"
    // InternalMyDsl.g:1569:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1573:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalMyDsl.g:1574:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
            {
            pushFollow(FOLLOW_9);
            rule__Or__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__1();

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
    // $ANTLR end "rule__Or__Group_1__0"


    // $ANTLR start "rule__Or__Group_1__0__Impl"
    // InternalMyDsl.g:1581:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1585:1: ( ( () ) )
            // InternalMyDsl.g:1586:1: ( () )
            {
            // InternalMyDsl.g:1586:1: ( () )
            // InternalMyDsl.g:1587:2: ()
            {
             before(grammarAccess.getOrAccess().getExpressionLeftAction_1_0()); 
            // InternalMyDsl.g:1588:2: ()
            // InternalMyDsl.g:1588:3: 
            {
            }

             after(grammarAccess.getOrAccess().getExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__0__Impl"


    // $ANTLR start "rule__Or__Group_1__1"
    // InternalMyDsl.g:1596:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1600:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalMyDsl.g:1601:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__Or__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2();

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
    // $ANTLR end "rule__Or__Group_1__1"


    // $ANTLR start "rule__Or__Group_1__1__Impl"
    // InternalMyDsl.g:1608:1: rule__Or__Group_1__1__Impl : ( ( rule__Or__OperationAssignment_1_1 ) ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1612:1: ( ( ( rule__Or__OperationAssignment_1_1 ) ) )
            // InternalMyDsl.g:1613:1: ( ( rule__Or__OperationAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1613:1: ( ( rule__Or__OperationAssignment_1_1 ) )
            // InternalMyDsl.g:1614:2: ( rule__Or__OperationAssignment_1_1 )
            {
             before(grammarAccess.getOrAccess().getOperationAssignment_1_1()); 
            // InternalMyDsl.g:1615:2: ( rule__Or__OperationAssignment_1_1 )
            // InternalMyDsl.g:1615:3: rule__Or__OperationAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Or__OperationAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getOperationAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__1__Impl"


    // $ANTLR start "rule__Or__Group_1__2"
    // InternalMyDsl.g:1623:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1627:1: ( rule__Or__Group_1__2__Impl )
            // InternalMyDsl.g:1628:2: rule__Or__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Or__Group_1__2__Impl();

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
    // $ANTLR end "rule__Or__Group_1__2"


    // $ANTLR start "rule__Or__Group_1__2__Impl"
    // InternalMyDsl.g:1634:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1638:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:1639:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:1639:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalMyDsl.g:1640:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:1641:2: ( rule__Or__RightAssignment_1_2 )
            // InternalMyDsl.g:1641:3: rule__Or__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Or__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOrAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__Group_1__2__Impl"


    // $ANTLR start "rule__And__Group__0"
    // InternalMyDsl.g:1650:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1654:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalMyDsl.g:1655:2: rule__And__Group__0__Impl rule__And__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__And__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group__1();

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
    // $ANTLR end "rule__And__Group__0"


    // $ANTLR start "rule__And__Group__0__Impl"
    // InternalMyDsl.g:1662:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1666:1: ( ( ruleEquality ) )
            // InternalMyDsl.g:1667:1: ( ruleEquality )
            {
            // InternalMyDsl.g:1667:1: ( ruleEquality )
            // InternalMyDsl.g:1668:2: ruleEquality
            {
             before(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__0__Impl"


    // $ANTLR start "rule__And__Group__1"
    // InternalMyDsl.g:1677:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1681:1: ( rule__And__Group__1__Impl )
            // InternalMyDsl.g:1682:2: rule__And__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group__1__Impl();

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
    // $ANTLR end "rule__And__Group__1"


    // $ANTLR start "rule__And__Group__1__Impl"
    // InternalMyDsl.g:1688:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1692:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalMyDsl.g:1693:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalMyDsl.g:1693:1: ( ( rule__And__Group_1__0 )* )
            // InternalMyDsl.g:1694:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalMyDsl.g:1695:2: ( rule__And__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==58) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:1695:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getAndAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group__1__Impl"


    // $ANTLR start "rule__And__Group_1__0"
    // InternalMyDsl.g:1704:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1708:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalMyDsl.g:1709:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__And__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__1();

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
    // $ANTLR end "rule__And__Group_1__0"


    // $ANTLR start "rule__And__Group_1__0__Impl"
    // InternalMyDsl.g:1716:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1720:1: ( ( () ) )
            // InternalMyDsl.g:1721:1: ( () )
            {
            // InternalMyDsl.g:1721:1: ( () )
            // InternalMyDsl.g:1722:2: ()
            {
             before(grammarAccess.getAndAccess().getExpressionLeftAction_1_0()); 
            // InternalMyDsl.g:1723:2: ()
            // InternalMyDsl.g:1723:3: 
            {
            }

             after(grammarAccess.getAndAccess().getExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__0__Impl"


    // $ANTLR start "rule__And__Group_1__1"
    // InternalMyDsl.g:1731:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1735:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalMyDsl.g:1736:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__And__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__And__Group_1__2();

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
    // $ANTLR end "rule__And__Group_1__1"


    // $ANTLR start "rule__And__Group_1__1__Impl"
    // InternalMyDsl.g:1743:1: rule__And__Group_1__1__Impl : ( ( rule__And__OperationAssignment_1_1 ) ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1747:1: ( ( ( rule__And__OperationAssignment_1_1 ) ) )
            // InternalMyDsl.g:1748:1: ( ( rule__And__OperationAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1748:1: ( ( rule__And__OperationAssignment_1_1 ) )
            // InternalMyDsl.g:1749:2: ( rule__And__OperationAssignment_1_1 )
            {
             before(grammarAccess.getAndAccess().getOperationAssignment_1_1()); 
            // InternalMyDsl.g:1750:2: ( rule__And__OperationAssignment_1_1 )
            // InternalMyDsl.g:1750:3: rule__And__OperationAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__And__OperationAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getOperationAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__1__Impl"


    // $ANTLR start "rule__And__Group_1__2"
    // InternalMyDsl.g:1758:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1762:1: ( rule__And__Group_1__2__Impl )
            // InternalMyDsl.g:1763:2: rule__And__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__And__Group_1__2__Impl();

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
    // $ANTLR end "rule__And__Group_1__2"


    // $ANTLR start "rule__And__Group_1__2__Impl"
    // InternalMyDsl.g:1769:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1773:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:1774:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:1774:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalMyDsl.g:1775:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:1776:2: ( rule__And__RightAssignment_1_2 )
            // InternalMyDsl.g:1776:3: rule__And__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__And__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAndAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__Group_1__2__Impl"


    // $ANTLR start "rule__Equality__Group__0"
    // InternalMyDsl.g:1785:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1789:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalMyDsl.g:1790:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Equality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group__1();

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
    // $ANTLR end "rule__Equality__Group__0"


    // $ANTLR start "rule__Equality__Group__0__Impl"
    // InternalMyDsl.g:1797:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1801:1: ( ( ruleComparison ) )
            // InternalMyDsl.g:1802:1: ( ruleComparison )
            {
            // InternalMyDsl.g:1802:1: ( ruleComparison )
            // InternalMyDsl.g:1803:2: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__0__Impl"


    // $ANTLR start "rule__Equality__Group__1"
    // InternalMyDsl.g:1812:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1816:1: ( rule__Equality__Group__1__Impl )
            // InternalMyDsl.g:1817:2: rule__Equality__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group__1__Impl();

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
    // $ANTLR end "rule__Equality__Group__1"


    // $ANTLR start "rule__Equality__Group__1__Impl"
    // InternalMyDsl.g:1823:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1827:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalMyDsl.g:1828:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalMyDsl.g:1828:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalMyDsl.g:1829:2: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // InternalMyDsl.g:1830:2: ( rule__Equality__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=11 && LA21_0<=12)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:1830:3: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getEqualityAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__0"
    // InternalMyDsl.g:1839:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1843:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalMyDsl.g:1844:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Equality__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__1();

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
    // $ANTLR end "rule__Equality__Group_1__0"


    // $ANTLR start "rule__Equality__Group_1__0__Impl"
    // InternalMyDsl.g:1851:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1855:1: ( ( () ) )
            // InternalMyDsl.g:1856:1: ( () )
            {
            // InternalMyDsl.g:1856:1: ( () )
            // InternalMyDsl.g:1857:2: ()
            {
             before(grammarAccess.getEqualityAccess().getExpressionLeftAction_1_0()); 
            // InternalMyDsl.g:1858:2: ()
            // InternalMyDsl.g:1858:3: 
            {
            }

             after(grammarAccess.getEqualityAccess().getExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__0__Impl"


    // $ANTLR start "rule__Equality__Group_1__1"
    // InternalMyDsl.g:1866:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1870:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // InternalMyDsl.g:1871:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__Equality__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__2();

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
    // $ANTLR end "rule__Equality__Group_1__1"


    // $ANTLR start "rule__Equality__Group_1__1__Impl"
    // InternalMyDsl.g:1878:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OperationAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1882:1: ( ( ( rule__Equality__OperationAssignment_1_1 ) ) )
            // InternalMyDsl.g:1883:1: ( ( rule__Equality__OperationAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1883:1: ( ( rule__Equality__OperationAssignment_1_1 ) )
            // InternalMyDsl.g:1884:2: ( rule__Equality__OperationAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOperationAssignment_1_1()); 
            // InternalMyDsl.g:1885:2: ( rule__Equality__OperationAssignment_1_1 )
            // InternalMyDsl.g:1885:3: rule__Equality__OperationAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Equality__OperationAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOperationAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__1__Impl"


    // $ANTLR start "rule__Equality__Group_1__2"
    // InternalMyDsl.g:1893:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1897:1: ( rule__Equality__Group_1__2__Impl )
            // InternalMyDsl.g:1898:2: rule__Equality__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Equality__Group_1__2__Impl();

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
    // $ANTLR end "rule__Equality__Group_1__2"


    // $ANTLR start "rule__Equality__Group_1__2__Impl"
    // InternalMyDsl.g:1904:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1908:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:1909:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:1909:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // InternalMyDsl.g:1910:2: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:1911:2: ( rule__Equality__RightAssignment_1_2 )
            // InternalMyDsl.g:1911:3: rule__Equality__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Equality__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__Group_1__2__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalMyDsl.g:1920:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1924:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalMyDsl.g:1925:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

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
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalMyDsl.g:1932:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1936:1: ( ( rulePlusOrMinus ) )
            // InternalMyDsl.g:1937:1: ( rulePlusOrMinus )
            {
            // InternalMyDsl.g:1937:1: ( rulePlusOrMinus )
            // InternalMyDsl.g:1938:2: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalMyDsl.g:1947:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1951:1: ( rule__Comparison__Group__1__Impl )
            // InternalMyDsl.g:1952:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1__Impl();

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
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalMyDsl.g:1958:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1962:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalMyDsl.g:1963:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalMyDsl.g:1963:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalMyDsl.g:1964:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalMyDsl.g:1965:2: ( rule__Comparison__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=13 && LA22_0<=16)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1965:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getComparisonAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__0"
    // InternalMyDsl.g:1974:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1978:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalMyDsl.g:1979:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Comparison__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__1();

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
    // $ANTLR end "rule__Comparison__Group_1__0"


    // $ANTLR start "rule__Comparison__Group_1__0__Impl"
    // InternalMyDsl.g:1986:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1990:1: ( ( () ) )
            // InternalMyDsl.g:1991:1: ( () )
            {
            // InternalMyDsl.g:1991:1: ( () )
            // InternalMyDsl.g:1992:2: ()
            {
             before(grammarAccess.getComparisonAccess().getExpressionLeftAction_1_0()); 
            // InternalMyDsl.g:1993:2: ()
            // InternalMyDsl.g:1993:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getExpressionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1__1"
    // InternalMyDsl.g:2001:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2005:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // InternalMyDsl.g:2006:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__Comparison__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__2();

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
    // $ANTLR end "rule__Comparison__Group_1__1"


    // $ANTLR start "rule__Comparison__Group_1__1__Impl"
    // InternalMyDsl.g:2013:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OperationAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2017:1: ( ( ( rule__Comparison__OperationAssignment_1_1 ) ) )
            // InternalMyDsl.g:2018:1: ( ( rule__Comparison__OperationAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2018:1: ( ( rule__Comparison__OperationAssignment_1_1 ) )
            // InternalMyDsl.g:2019:2: ( rule__Comparison__OperationAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOperationAssignment_1_1()); 
            // InternalMyDsl.g:2020:2: ( rule__Comparison__OperationAssignment_1_1 )
            // InternalMyDsl.g:2020:3: rule__Comparison__OperationAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OperationAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOperationAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1__2"
    // InternalMyDsl.g:2028:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2032:1: ( rule__Comparison__Group_1__2__Impl )
            // InternalMyDsl.g:2033:2: rule__Comparison__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1__2__Impl();

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
    // $ANTLR end "rule__Comparison__Group_1__2"


    // $ANTLR start "rule__Comparison__Group_1__2__Impl"
    // InternalMyDsl.g:2039:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2043:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:2044:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:2044:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // InternalMyDsl.g:2045:2: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:2046:2: ( rule__Comparison__RightAssignment_1_2 )
            // InternalMyDsl.g:2046:3: rule__Comparison__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1__2__Impl"


    // $ANTLR start "rule__If__Group__0"
    // InternalMyDsl.g:2055:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2059:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalMyDsl.g:2060:2: rule__If__Group__0__Impl rule__If__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__If__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__1();

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
    // $ANTLR end "rule__If__Group__0"


    // $ANTLR start "rule__If__Group__0__Impl"
    // InternalMyDsl.g:2067:1: rule__If__Group__0__Impl : ( () ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2071:1: ( ( () ) )
            // InternalMyDsl.g:2072:1: ( () )
            {
            // InternalMyDsl.g:2072:1: ( () )
            // InternalMyDsl.g:2073:2: ()
            {
             before(grammarAccess.getIfAccess().getExpressionAction_0()); 
            // InternalMyDsl.g:2074:2: ()
            // InternalMyDsl.g:2074:3: 
            {
            }

             after(grammarAccess.getIfAccess().getExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__0__Impl"


    // $ANTLR start "rule__If__Group__1"
    // InternalMyDsl.g:2082:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2086:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalMyDsl.g:2087:2: rule__If__Group__1__Impl rule__If__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__If__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__2();

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
    // $ANTLR end "rule__If__Group__1"


    // $ANTLR start "rule__If__Group__1__Impl"
    // InternalMyDsl.g:2094:1: rule__If__Group__1__Impl : ( ( rule__If__OperationAssignment_1 ) ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2098:1: ( ( ( rule__If__OperationAssignment_1 ) ) )
            // InternalMyDsl.g:2099:1: ( ( rule__If__OperationAssignment_1 ) )
            {
            // InternalMyDsl.g:2099:1: ( ( rule__If__OperationAssignment_1 ) )
            // InternalMyDsl.g:2100:2: ( rule__If__OperationAssignment_1 )
            {
             before(grammarAccess.getIfAccess().getOperationAssignment_1()); 
            // InternalMyDsl.g:2101:2: ( rule__If__OperationAssignment_1 )
            // InternalMyDsl.g:2101:3: rule__If__OperationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__If__OperationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getOperationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__1__Impl"


    // $ANTLR start "rule__If__Group__2"
    // InternalMyDsl.g:2109:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2113:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalMyDsl.g:2114:2: rule__If__Group__2__Impl rule__If__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__If__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__If__Group__3();

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
    // $ANTLR end "rule__If__Group__2"


    // $ANTLR start "rule__If__Group__2__Impl"
    // InternalMyDsl.g:2121:1: rule__If__Group__2__Impl : ( ( rule__If__LeftAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2125:1: ( ( ( rule__If__LeftAssignment_2 ) ) )
            // InternalMyDsl.g:2126:1: ( ( rule__If__LeftAssignment_2 ) )
            {
            // InternalMyDsl.g:2126:1: ( ( rule__If__LeftAssignment_2 ) )
            // InternalMyDsl.g:2127:2: ( rule__If__LeftAssignment_2 )
            {
             before(grammarAccess.getIfAccess().getLeftAssignment_2()); 
            // InternalMyDsl.g:2128:2: ( rule__If__LeftAssignment_2 )
            // InternalMyDsl.g:2128:3: rule__If__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__If__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getLeftAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__2__Impl"


    // $ANTLR start "rule__If__Group__3"
    // InternalMyDsl.g:2136:1: rule__If__Group__3 : rule__If__Group__3__Impl ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2140:1: ( rule__If__Group__3__Impl )
            // InternalMyDsl.g:2141:2: rule__If__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__If__Group__3__Impl();

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
    // $ANTLR end "rule__If__Group__3"


    // $ANTLR start "rule__If__Group__3__Impl"
    // InternalMyDsl.g:2147:1: rule__If__Group__3__Impl : ( ( rule__If__RightAssignment_3 ) ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2151:1: ( ( ( rule__If__RightAssignment_3 ) ) )
            // InternalMyDsl.g:2152:1: ( ( rule__If__RightAssignment_3 ) )
            {
            // InternalMyDsl.g:2152:1: ( ( rule__If__RightAssignment_3 ) )
            // InternalMyDsl.g:2153:2: ( rule__If__RightAssignment_3 )
            {
             before(grammarAccess.getIfAccess().getRightAssignment_3()); 
            // InternalMyDsl.g:2154:2: ( rule__If__RightAssignment_3 )
            // InternalMyDsl.g:2154:3: rule__If__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__If__RightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIfAccess().getRightAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__Group__3__Impl"


    // $ANTLR start "rule__Then__Group__0"
    // InternalMyDsl.g:2163:1: rule__Then__Group__0 : rule__Then__Group__0__Impl rule__Then__Group__1 ;
    public final void rule__Then__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2167:1: ( rule__Then__Group__0__Impl rule__Then__Group__1 )
            // InternalMyDsl.g:2168:2: rule__Then__Group__0__Impl rule__Then__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Then__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group__1();

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
    // $ANTLR end "rule__Then__Group__0"


    // $ANTLR start "rule__Then__Group__0__Impl"
    // InternalMyDsl.g:2175:1: rule__Then__Group__0__Impl : ( () ) ;
    public final void rule__Then__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2179:1: ( ( () ) )
            // InternalMyDsl.g:2180:1: ( () )
            {
            // InternalMyDsl.g:2180:1: ( () )
            // InternalMyDsl.g:2181:2: ()
            {
             before(grammarAccess.getThenAccess().getExpressionAction_0()); 
            // InternalMyDsl.g:2182:2: ()
            // InternalMyDsl.g:2182:3: 
            {
            }

             after(grammarAccess.getThenAccess().getExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__0__Impl"


    // $ANTLR start "rule__Then__Group__1"
    // InternalMyDsl.g:2190:1: rule__Then__Group__1 : rule__Then__Group__1__Impl rule__Then__Group__2 ;
    public final void rule__Then__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2194:1: ( rule__Then__Group__1__Impl rule__Then__Group__2 )
            // InternalMyDsl.g:2195:2: rule__Then__Group__1__Impl rule__Then__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Then__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group__2();

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
    // $ANTLR end "rule__Then__Group__1"


    // $ANTLR start "rule__Then__Group__1__Impl"
    // InternalMyDsl.g:2202:1: rule__Then__Group__1__Impl : ( ( rule__Then__OperationAssignment_1 ) ) ;
    public final void rule__Then__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2206:1: ( ( ( rule__Then__OperationAssignment_1 ) ) )
            // InternalMyDsl.g:2207:1: ( ( rule__Then__OperationAssignment_1 ) )
            {
            // InternalMyDsl.g:2207:1: ( ( rule__Then__OperationAssignment_1 ) )
            // InternalMyDsl.g:2208:2: ( rule__Then__OperationAssignment_1 )
            {
             before(grammarAccess.getThenAccess().getOperationAssignment_1()); 
            // InternalMyDsl.g:2209:2: ( rule__Then__OperationAssignment_1 )
            // InternalMyDsl.g:2209:3: rule__Then__OperationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Then__OperationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getOperationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__1__Impl"


    // $ANTLR start "rule__Then__Group__2"
    // InternalMyDsl.g:2217:1: rule__Then__Group__2 : rule__Then__Group__2__Impl rule__Then__Group__3 ;
    public final void rule__Then__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2221:1: ( rule__Then__Group__2__Impl rule__Then__Group__3 )
            // InternalMyDsl.g:2222:2: rule__Then__Group__2__Impl rule__Then__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Then__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Then__Group__3();

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
    // $ANTLR end "rule__Then__Group__2"


    // $ANTLR start "rule__Then__Group__2__Impl"
    // InternalMyDsl.g:2229:1: rule__Then__Group__2__Impl : ( ( rule__Then__LeftAssignment_2 ) ) ;
    public final void rule__Then__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2233:1: ( ( ( rule__Then__LeftAssignment_2 ) ) )
            // InternalMyDsl.g:2234:1: ( ( rule__Then__LeftAssignment_2 ) )
            {
            // InternalMyDsl.g:2234:1: ( ( rule__Then__LeftAssignment_2 ) )
            // InternalMyDsl.g:2235:2: ( rule__Then__LeftAssignment_2 )
            {
             before(grammarAccess.getThenAccess().getLeftAssignment_2()); 
            // InternalMyDsl.g:2236:2: ( rule__Then__LeftAssignment_2 )
            // InternalMyDsl.g:2236:3: rule__Then__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Then__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getLeftAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__2__Impl"


    // $ANTLR start "rule__Then__Group__3"
    // InternalMyDsl.g:2244:1: rule__Then__Group__3 : rule__Then__Group__3__Impl ;
    public final void rule__Then__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2248:1: ( rule__Then__Group__3__Impl )
            // InternalMyDsl.g:2249:2: rule__Then__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Then__Group__3__Impl();

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
    // $ANTLR end "rule__Then__Group__3"


    // $ANTLR start "rule__Then__Group__3__Impl"
    // InternalMyDsl.g:2255:1: rule__Then__Group__3__Impl : ( ( rule__Then__RightAssignment_3 ) ) ;
    public final void rule__Then__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2259:1: ( ( ( rule__Then__RightAssignment_3 ) ) )
            // InternalMyDsl.g:2260:1: ( ( rule__Then__RightAssignment_3 ) )
            {
            // InternalMyDsl.g:2260:1: ( ( rule__Then__RightAssignment_3 ) )
            // InternalMyDsl.g:2261:2: ( rule__Then__RightAssignment_3 )
            {
             before(grammarAccess.getThenAccess().getRightAssignment_3()); 
            // InternalMyDsl.g:2262:2: ( rule__Then__RightAssignment_3 )
            // InternalMyDsl.g:2262:3: rule__Then__RightAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Then__RightAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getThenAccess().getRightAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__Group__3__Impl"


    // $ANTLR start "rule__Else__Group__0"
    // InternalMyDsl.g:2271:1: rule__Else__Group__0 : rule__Else__Group__0__Impl rule__Else__Group__1 ;
    public final void rule__Else__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2275:1: ( rule__Else__Group__0__Impl rule__Else__Group__1 )
            // InternalMyDsl.g:2276:2: rule__Else__Group__0__Impl rule__Else__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Else__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Else__Group__1();

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
    // $ANTLR end "rule__Else__Group__0"


    // $ANTLR start "rule__Else__Group__0__Impl"
    // InternalMyDsl.g:2283:1: rule__Else__Group__0__Impl : ( () ) ;
    public final void rule__Else__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2287:1: ( ( () ) )
            // InternalMyDsl.g:2288:1: ( () )
            {
            // InternalMyDsl.g:2288:1: ( () )
            // InternalMyDsl.g:2289:2: ()
            {
             before(grammarAccess.getElseAccess().getExpressionAction_0()); 
            // InternalMyDsl.g:2290:2: ()
            // InternalMyDsl.g:2290:3: 
            {
            }

             after(grammarAccess.getElseAccess().getExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__0__Impl"


    // $ANTLR start "rule__Else__Group__1"
    // InternalMyDsl.g:2298:1: rule__Else__Group__1 : rule__Else__Group__1__Impl rule__Else__Group__2 ;
    public final void rule__Else__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2302:1: ( rule__Else__Group__1__Impl rule__Else__Group__2 )
            // InternalMyDsl.g:2303:2: rule__Else__Group__1__Impl rule__Else__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Else__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Else__Group__2();

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
    // $ANTLR end "rule__Else__Group__1"


    // $ANTLR start "rule__Else__Group__1__Impl"
    // InternalMyDsl.g:2310:1: rule__Else__Group__1__Impl : ( ( rule__Else__OperationAssignment_1 ) ) ;
    public final void rule__Else__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2314:1: ( ( ( rule__Else__OperationAssignment_1 ) ) )
            // InternalMyDsl.g:2315:1: ( ( rule__Else__OperationAssignment_1 ) )
            {
            // InternalMyDsl.g:2315:1: ( ( rule__Else__OperationAssignment_1 ) )
            // InternalMyDsl.g:2316:2: ( rule__Else__OperationAssignment_1 )
            {
             before(grammarAccess.getElseAccess().getOperationAssignment_1()); 
            // InternalMyDsl.g:2317:2: ( rule__Else__OperationAssignment_1 )
            // InternalMyDsl.g:2317:3: rule__Else__OperationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Else__OperationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getElseAccess().getOperationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__1__Impl"


    // $ANTLR start "rule__Else__Group__2"
    // InternalMyDsl.g:2325:1: rule__Else__Group__2 : rule__Else__Group__2__Impl ;
    public final void rule__Else__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2329:1: ( rule__Else__Group__2__Impl )
            // InternalMyDsl.g:2330:2: rule__Else__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Else__Group__2__Impl();

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
    // $ANTLR end "rule__Else__Group__2"


    // $ANTLR start "rule__Else__Group__2__Impl"
    // InternalMyDsl.g:2336:1: rule__Else__Group__2__Impl : ( ( rule__Else__LeftAssignment_2 ) ) ;
    public final void rule__Else__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2340:1: ( ( ( rule__Else__LeftAssignment_2 ) ) )
            // InternalMyDsl.g:2341:1: ( ( rule__Else__LeftAssignment_2 ) )
            {
            // InternalMyDsl.g:2341:1: ( ( rule__Else__LeftAssignment_2 ) )
            // InternalMyDsl.g:2342:2: ( rule__Else__LeftAssignment_2 )
            {
             before(grammarAccess.getElseAccess().getLeftAssignment_2()); 
            // InternalMyDsl.g:2343:2: ( rule__Else__LeftAssignment_2 )
            // InternalMyDsl.g:2343:3: rule__Else__LeftAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Else__LeftAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElseAccess().getLeftAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__Group__2__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // InternalMyDsl.g:2352:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2356:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalMyDsl.g:2357:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2364:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMultOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2368:1: ( ( ruleMultOrDiv ) )
            // InternalMyDsl.g:2369:1: ( ruleMultOrDiv )
            {
            // InternalMyDsl.g:2369:1: ( ruleMultOrDiv )
            // InternalMyDsl.g:2370:2: ruleMultOrDiv
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
    // InternalMyDsl.g:2379:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2383:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalMyDsl.g:2384:2: rule__PlusOrMinus__Group__1__Impl
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
    // InternalMyDsl.g:2390:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2394:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalMyDsl.g:2395:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalMyDsl.g:2395:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalMyDsl.g:2396:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // InternalMyDsl.g:2397:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=17 && LA23_0<=18)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:2397:3: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalMyDsl.g:2406:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2410:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalMyDsl.g:2411:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:2418:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Group_1_0__0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2422:1: ( ( ( rule__PlusOrMinus__Group_1_0__0 ) ) )
            // InternalMyDsl.g:2423:1: ( ( rule__PlusOrMinus__Group_1_0__0 ) )
            {
            // InternalMyDsl.g:2423:1: ( ( rule__PlusOrMinus__Group_1_0__0 ) )
            // InternalMyDsl.g:2424:2: ( rule__PlusOrMinus__Group_1_0__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0()); 
            // InternalMyDsl.g:2425:2: ( rule__PlusOrMinus__Group_1_0__0 )
            // InternalMyDsl.g:2425:3: rule__PlusOrMinus__Group_1_0__0
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
    // InternalMyDsl.g:2433:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2437:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalMyDsl.g:2438:2: rule__PlusOrMinus__Group_1__1__Impl
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
    // InternalMyDsl.g:2444:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2448:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalMyDsl.g:2449:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2449:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalMyDsl.g:2450:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // InternalMyDsl.g:2451:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalMyDsl.g:2451:3: rule__PlusOrMinus__RightAssignment_1_1
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
    // InternalMyDsl.g:2460:1: rule__PlusOrMinus__Group_1_0__0 : rule__PlusOrMinus__Group_1_0__0__Impl rule__PlusOrMinus__Group_1_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2464:1: ( rule__PlusOrMinus__Group_1_0__0__Impl rule__PlusOrMinus__Group_1_0__1 )
            // InternalMyDsl.g:2465:2: rule__PlusOrMinus__Group_1_0__0__Impl rule__PlusOrMinus__Group_1_0__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2472:1: rule__PlusOrMinus__Group_1_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2476:1: ( ( () ) )
            // InternalMyDsl.g:2477:1: ( () )
            {
            // InternalMyDsl.g:2477:1: ( () )
            // InternalMyDsl.g:2478:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getExpressionLeftAction_1_0_0()); 
            // InternalMyDsl.g:2479:2: ()
            // InternalMyDsl.g:2479:3: 
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
    // InternalMyDsl.g:2487:1: rule__PlusOrMinus__Group_1_0__1 : rule__PlusOrMinus__Group_1_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2491:1: ( rule__PlusOrMinus__Group_1_0__1__Impl )
            // InternalMyDsl.g:2492:2: rule__PlusOrMinus__Group_1_0__1__Impl
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
    // InternalMyDsl.g:2498:1: rule__PlusOrMinus__Group_1_0__1__Impl : ( ( rule__PlusOrMinus__OperationAssignment_1_0_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2502:1: ( ( ( rule__PlusOrMinus__OperationAssignment_1_0_1 ) ) )
            // InternalMyDsl.g:2503:1: ( ( rule__PlusOrMinus__OperationAssignment_1_0_1 ) )
            {
            // InternalMyDsl.g:2503:1: ( ( rule__PlusOrMinus__OperationAssignment_1_0_1 ) )
            // InternalMyDsl.g:2504:2: ( rule__PlusOrMinus__OperationAssignment_1_0_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getOperationAssignment_1_0_1()); 
            // InternalMyDsl.g:2505:2: ( rule__PlusOrMinus__OperationAssignment_1_0_1 )
            // InternalMyDsl.g:2505:3: rule__PlusOrMinus__OperationAssignment_1_0_1
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
    // InternalMyDsl.g:2514:1: rule__MultOrDiv__Group__0 : rule__MultOrDiv__Group__0__Impl rule__MultOrDiv__Group__1 ;
    public final void rule__MultOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2518:1: ( rule__MultOrDiv__Group__0__Impl rule__MultOrDiv__Group__1 )
            // InternalMyDsl.g:2519:2: rule__MultOrDiv__Group__0__Impl rule__MultOrDiv__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2526:1: rule__MultOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MultOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2530:1: ( ( rulePrimary ) )
            // InternalMyDsl.g:2531:1: ( rulePrimary )
            {
            // InternalMyDsl.g:2531:1: ( rulePrimary )
            // InternalMyDsl.g:2532:2: rulePrimary
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
    // InternalMyDsl.g:2541:1: rule__MultOrDiv__Group__1 : rule__MultOrDiv__Group__1__Impl ;
    public final void rule__MultOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2545:1: ( rule__MultOrDiv__Group__1__Impl )
            // InternalMyDsl.g:2546:2: rule__MultOrDiv__Group__1__Impl
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
    // InternalMyDsl.g:2552:1: rule__MultOrDiv__Group__1__Impl : ( ( rule__MultOrDiv__Group_1__0 )* ) ;
    public final void rule__MultOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2556:1: ( ( ( rule__MultOrDiv__Group_1__0 )* ) )
            // InternalMyDsl.g:2557:1: ( ( rule__MultOrDiv__Group_1__0 )* )
            {
            // InternalMyDsl.g:2557:1: ( ( rule__MultOrDiv__Group_1__0 )* )
            // InternalMyDsl.g:2558:2: ( rule__MultOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMultOrDivAccess().getGroup_1()); 
            // InternalMyDsl.g:2559:2: ( rule__MultOrDiv__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=19 && LA24_0<=20)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:2559:3: rule__MultOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__MultOrDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalMyDsl.g:2568:1: rule__MultOrDiv__Group_1__0 : rule__MultOrDiv__Group_1__0__Impl rule__MultOrDiv__Group_1__1 ;
    public final void rule__MultOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2572:1: ( rule__MultOrDiv__Group_1__0__Impl rule__MultOrDiv__Group_1__1 )
            // InternalMyDsl.g:2573:2: rule__MultOrDiv__Group_1__0__Impl rule__MultOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2580:1: rule__MultOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MultOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2584:1: ( ( () ) )
            // InternalMyDsl.g:2585:1: ( () )
            {
            // InternalMyDsl.g:2585:1: ( () )
            // InternalMyDsl.g:2586:2: ()
            {
             before(grammarAccess.getMultOrDivAccess().getExpressionLeftAction_1_0()); 
            // InternalMyDsl.g:2587:2: ()
            // InternalMyDsl.g:2587:3: 
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
    // InternalMyDsl.g:2595:1: rule__MultOrDiv__Group_1__1 : rule__MultOrDiv__Group_1__1__Impl rule__MultOrDiv__Group_1__2 ;
    public final void rule__MultOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2599:1: ( rule__MultOrDiv__Group_1__1__Impl rule__MultOrDiv__Group_1__2 )
            // InternalMyDsl.g:2600:2: rule__MultOrDiv__Group_1__1__Impl rule__MultOrDiv__Group_1__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:2607:1: rule__MultOrDiv__Group_1__1__Impl : ( ( rule__MultOrDiv__OperationAssignment_1_1 ) ) ;
    public final void rule__MultOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2611:1: ( ( ( rule__MultOrDiv__OperationAssignment_1_1 ) ) )
            // InternalMyDsl.g:2612:1: ( ( rule__MultOrDiv__OperationAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2612:1: ( ( rule__MultOrDiv__OperationAssignment_1_1 ) )
            // InternalMyDsl.g:2613:2: ( rule__MultOrDiv__OperationAssignment_1_1 )
            {
             before(grammarAccess.getMultOrDivAccess().getOperationAssignment_1_1()); 
            // InternalMyDsl.g:2614:2: ( rule__MultOrDiv__OperationAssignment_1_1 )
            // InternalMyDsl.g:2614:3: rule__MultOrDiv__OperationAssignment_1_1
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
    // InternalMyDsl.g:2622:1: rule__MultOrDiv__Group_1__2 : rule__MultOrDiv__Group_1__2__Impl ;
    public final void rule__MultOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2626:1: ( rule__MultOrDiv__Group_1__2__Impl )
            // InternalMyDsl.g:2627:2: rule__MultOrDiv__Group_1__2__Impl
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
    // InternalMyDsl.g:2633:1: rule__MultOrDiv__Group_1__2__Impl : ( ( rule__MultOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MultOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2637:1: ( ( ( rule__MultOrDiv__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:2638:1: ( ( rule__MultOrDiv__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:2638:1: ( ( rule__MultOrDiv__RightAssignment_1_2 ) )
            // InternalMyDsl.g:2639:2: ( rule__MultOrDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultOrDivAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:2640:2: ( rule__MultOrDiv__RightAssignment_1_2 )
            // InternalMyDsl.g:2640:3: rule__MultOrDiv__RightAssignment_1_2
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
    // InternalMyDsl.g:2649:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2653:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalMyDsl.g:2654:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
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
    // InternalMyDsl.g:2661:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2665:1: ( ( '(' ) )
            // InternalMyDsl.g:2666:1: ( '(' )
            {
            // InternalMyDsl.g:2666:1: ( '(' )
            // InternalMyDsl.g:2667:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:2676:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2680:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalMyDsl.g:2681:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:2688:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2692:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2693:1: ( ruleExpression )
            {
            // InternalMyDsl.g:2693:1: ( ruleExpression )
            // InternalMyDsl.g:2694:2: ruleExpression
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
    // InternalMyDsl.g:2703:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2707:1: ( rule__Primary__Group_0__2__Impl )
            // InternalMyDsl.g:2708:2: rule__Primary__Group_0__2__Impl
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
    // InternalMyDsl.g:2714:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2718:1: ( ( ')' ) )
            // InternalMyDsl.g:2719:1: ( ')' )
            {
            // InternalMyDsl.g:2719:1: ( ')' )
            // InternalMyDsl.g:2720:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,36,FOLLOW_2); 
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


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalMyDsl.g:2730:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2734:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalMyDsl.g:2735:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

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
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalMyDsl.g:2742:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2746:1: ( ( () ) )
            // InternalMyDsl.g:2747:1: ( () )
            {
            // InternalMyDsl.g:2747:1: ( () )
            // InternalMyDsl.g:2748:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAction_1_0()); 
            // InternalMyDsl.g:2749:2: ()
            // InternalMyDsl.g:2749:3: 
            {
            }

             after(grammarAccess.getPrimaryAccess().getExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalMyDsl.g:2757:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2761:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalMyDsl.g:2762:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

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
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalMyDsl.g:2769:1: rule__Primary__Group_1__1__Impl : ( ( rule__Primary__OperationAssignment_1_1 ) ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2773:1: ( ( ( rule__Primary__OperationAssignment_1_1 ) ) )
            // InternalMyDsl.g:2774:1: ( ( rule__Primary__OperationAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2774:1: ( ( rule__Primary__OperationAssignment_1_1 ) )
            // InternalMyDsl.g:2775:2: ( rule__Primary__OperationAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryAccess().getOperationAssignment_1_1()); 
            // InternalMyDsl.g:2776:2: ( rule__Primary__OperationAssignment_1_1 )
            // InternalMyDsl.g:2776:3: rule__Primary__OperationAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Primary__OperationAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getOperationAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalMyDsl.g:2784:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2788:1: ( rule__Primary__Group_1__2__Impl )
            // InternalMyDsl.g:2789:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalMyDsl.g:2795:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__LeftAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2799:1: ( ( ( rule__Primary__LeftAssignment_1_2 ) ) )
            // InternalMyDsl.g:2800:1: ( ( rule__Primary__LeftAssignment_1_2 ) )
            {
            // InternalMyDsl.g:2800:1: ( ( rule__Primary__LeftAssignment_1_2 ) )
            // InternalMyDsl.g:2801:2: ( rule__Primary__LeftAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getLeftAssignment_1_2()); 
            // InternalMyDsl.g:2802:2: ( rule__Primary__LeftAssignment_1_2 )
            // InternalMyDsl.g:2802:3: rule__Primary__LeftAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Primary__LeftAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getLeftAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Atomic__Group__0"
    // InternalMyDsl.g:2811:1: rule__Atomic__Group__0 : rule__Atomic__Group__0__Impl rule__Atomic__Group__1 ;
    public final void rule__Atomic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2815:1: ( rule__Atomic__Group__0__Impl rule__Atomic__Group__1 )
            // InternalMyDsl.g:2816:2: rule__Atomic__Group__0__Impl rule__Atomic__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:2823:1: rule__Atomic__Group__0__Impl : ( () ) ;
    public final void rule__Atomic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2827:1: ( ( () ) )
            // InternalMyDsl.g:2828:1: ( () )
            {
            // InternalMyDsl.g:2828:1: ( () )
            // InternalMyDsl.g:2829:2: ()
            {
             before(grammarAccess.getAtomicAccess().getExpressionAction_0()); 
            // InternalMyDsl.g:2830:2: ()
            // InternalMyDsl.g:2830:3: 
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
    // InternalMyDsl.g:2838:1: rule__Atomic__Group__1 : rule__Atomic__Group__1__Impl ;
    public final void rule__Atomic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2842:1: ( rule__Atomic__Group__1__Impl )
            // InternalMyDsl.g:2843:2: rule__Atomic__Group__1__Impl
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
    // InternalMyDsl.g:2849:1: rule__Atomic__Group__1__Impl : ( ( rule__Atomic__Alternatives_1 ) ) ;
    public final void rule__Atomic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2853:1: ( ( ( rule__Atomic__Alternatives_1 ) ) )
            // InternalMyDsl.g:2854:1: ( ( rule__Atomic__Alternatives_1 ) )
            {
            // InternalMyDsl.g:2854:1: ( ( rule__Atomic__Alternatives_1 ) )
            // InternalMyDsl.g:2855:2: ( rule__Atomic__Alternatives_1 )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives_1()); 
            // InternalMyDsl.g:2856:2: ( rule__Atomic__Alternatives_1 )
            // InternalMyDsl.g:2856:3: rule__Atomic__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAlternatives_1()); 

            }


            }

        }
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
    // InternalMyDsl.g:2865:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2869:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalMyDsl.g:2870:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalMyDsl.g:2877:1: rule__Event__Group__0__Impl : ( () ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2881:1: ( ( () ) )
            // InternalMyDsl.g:2882:1: ( () )
            {
            // InternalMyDsl.g:2882:1: ( () )
            // InternalMyDsl.g:2883:2: ()
            {
             before(grammarAccess.getEventAccess().getEventAction_0()); 
            // InternalMyDsl.g:2884:2: ()
            // InternalMyDsl.g:2884:3: 
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
    // InternalMyDsl.g:2892:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2896:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalMyDsl.g:2897:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:2904:1: rule__Event__Group__1__Impl : ( 'Event' ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2908:1: ( ( 'Event' ) )
            // InternalMyDsl.g:2909:1: ( 'Event' )
            {
            // InternalMyDsl.g:2909:1: ( 'Event' )
            // InternalMyDsl.g:2910:2: 'Event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:2919:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2923:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // InternalMyDsl.g:2924:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:2931:1: rule__Event__Group__2__Impl : ( ( rule__Event__NameAssignment_2 ) ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2935:1: ( ( ( rule__Event__NameAssignment_2 ) ) )
            // InternalMyDsl.g:2936:1: ( ( rule__Event__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:2936:1: ( ( rule__Event__NameAssignment_2 ) )
            // InternalMyDsl.g:2937:2: ( rule__Event__NameAssignment_2 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2938:2: ( rule__Event__NameAssignment_2 )
            // InternalMyDsl.g:2938:3: rule__Event__NameAssignment_2
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
    // InternalMyDsl.g:2946:1: rule__Event__Group__3 : rule__Event__Group__3__Impl rule__Event__Group__4 ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2950:1: ( rule__Event__Group__3__Impl rule__Event__Group__4 )
            // InternalMyDsl.g:2951:2: rule__Event__Group__3__Impl rule__Event__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalMyDsl.g:2958:1: rule__Event__Group__3__Impl : ( ( rule__Event__Group_3__0 )? ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2962:1: ( ( ( rule__Event__Group_3__0 )? ) )
            // InternalMyDsl.g:2963:1: ( ( rule__Event__Group_3__0 )? )
            {
            // InternalMyDsl.g:2963:1: ( ( rule__Event__Group_3__0 )? )
            // InternalMyDsl.g:2964:2: ( rule__Event__Group_3__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_3()); 
            // InternalMyDsl.g:2965:2: ( rule__Event__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:2965:3: rule__Event__Group_3__0
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
    // InternalMyDsl.g:2973:1: rule__Event__Group__4 : rule__Event__Group__4__Impl ;
    public final void rule__Event__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2977:1: ( rule__Event__Group__4__Impl )
            // InternalMyDsl.g:2978:2: rule__Event__Group__4__Impl
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
    // InternalMyDsl.g:2984:1: rule__Event__Group__4__Impl : ( ( rule__Event__Group_4__0 )? ) ;
    public final void rule__Event__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2988:1: ( ( ( rule__Event__Group_4__0 )? ) )
            // InternalMyDsl.g:2989:1: ( ( rule__Event__Group_4__0 )? )
            {
            // InternalMyDsl.g:2989:1: ( ( rule__Event__Group_4__0 )? )
            // InternalMyDsl.g:2990:2: ( rule__Event__Group_4__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_4()); 
            // InternalMyDsl.g:2991:2: ( rule__Event__Group_4__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:2991:3: rule__Event__Group_4__0
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
    // InternalMyDsl.g:3000:1: rule__Event__Group_3__0 : rule__Event__Group_3__0__Impl rule__Event__Group_3__1 ;
    public final void rule__Event__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3004:1: ( rule__Event__Group_3__0__Impl rule__Event__Group_3__1 )
            // InternalMyDsl.g:3005:2: rule__Event__Group_3__0__Impl rule__Event__Group_3__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3012:1: rule__Event__Group_3__0__Impl : ( 'condition:' ) ;
    public final void rule__Event__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3016:1: ( ( 'condition:' ) )
            // InternalMyDsl.g:3017:1: ( 'condition:' )
            {
            // InternalMyDsl.g:3017:1: ( 'condition:' )
            // InternalMyDsl.g:3018:2: 'condition:'
            {
             before(grammarAccess.getEventAccess().getConditionKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:3027:1: rule__Event__Group_3__1 : rule__Event__Group_3__1__Impl ;
    public final void rule__Event__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3031:1: ( rule__Event__Group_3__1__Impl )
            // InternalMyDsl.g:3032:2: rule__Event__Group_3__1__Impl
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
    // InternalMyDsl.g:3038:1: rule__Event__Group_3__1__Impl : ( ( rule__Event__ConditionAssignment_3_1 ) ) ;
    public final void rule__Event__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3042:1: ( ( ( rule__Event__ConditionAssignment_3_1 ) ) )
            // InternalMyDsl.g:3043:1: ( ( rule__Event__ConditionAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3043:1: ( ( rule__Event__ConditionAssignment_3_1 ) )
            // InternalMyDsl.g:3044:2: ( rule__Event__ConditionAssignment_3_1 )
            {
             before(grammarAccess.getEventAccess().getConditionAssignment_3_1()); 
            // InternalMyDsl.g:3045:2: ( rule__Event__ConditionAssignment_3_1 )
            // InternalMyDsl.g:3045:3: rule__Event__ConditionAssignment_3_1
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
    // InternalMyDsl.g:3054:1: rule__Event__Group_4__0 : rule__Event__Group_4__0__Impl rule__Event__Group_4__1 ;
    public final void rule__Event__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3058:1: ( rule__Event__Group_4__0__Impl rule__Event__Group_4__1 )
            // InternalMyDsl.g:3059:2: rule__Event__Group_4__0__Impl rule__Event__Group_4__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3066:1: rule__Event__Group_4__0__Impl : ( 'actions:' ) ;
    public final void rule__Event__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3070:1: ( ( 'actions:' ) )
            // InternalMyDsl.g:3071:1: ( 'actions:' )
            {
            // InternalMyDsl.g:3071:1: ( 'actions:' )
            // InternalMyDsl.g:3072:2: 'actions:'
            {
             before(grammarAccess.getEventAccess().getActionsKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:3081:1: rule__Event__Group_4__1 : rule__Event__Group_4__1__Impl rule__Event__Group_4__2 ;
    public final void rule__Event__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3085:1: ( rule__Event__Group_4__1__Impl rule__Event__Group_4__2 )
            // InternalMyDsl.g:3086:2: rule__Event__Group_4__1__Impl rule__Event__Group_4__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3093:1: rule__Event__Group_4__1__Impl : ( ( rule__Event__ActionsAssignment_4_1 ) ) ;
    public final void rule__Event__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3097:1: ( ( ( rule__Event__ActionsAssignment_4_1 ) ) )
            // InternalMyDsl.g:3098:1: ( ( rule__Event__ActionsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:3098:1: ( ( rule__Event__ActionsAssignment_4_1 ) )
            // InternalMyDsl.g:3099:2: ( rule__Event__ActionsAssignment_4_1 )
            {
             before(grammarAccess.getEventAccess().getActionsAssignment_4_1()); 
            // InternalMyDsl.g:3100:2: ( rule__Event__ActionsAssignment_4_1 )
            // InternalMyDsl.g:3100:3: rule__Event__ActionsAssignment_4_1
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
    // InternalMyDsl.g:3108:1: rule__Event__Group_4__2 : rule__Event__Group_4__2__Impl ;
    public final void rule__Event__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3112:1: ( rule__Event__Group_4__2__Impl )
            // InternalMyDsl.g:3113:2: rule__Event__Group_4__2__Impl
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
    // InternalMyDsl.g:3119:1: rule__Event__Group_4__2__Impl : ( ( rule__Event__Group_4_2__0 )* ) ;
    public final void rule__Event__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3123:1: ( ( ( rule__Event__Group_4_2__0 )* ) )
            // InternalMyDsl.g:3124:1: ( ( rule__Event__Group_4_2__0 )* )
            {
            // InternalMyDsl.g:3124:1: ( ( rule__Event__Group_4_2__0 )* )
            // InternalMyDsl.g:3125:2: ( rule__Event__Group_4_2__0 )*
            {
             before(grammarAccess.getEventAccess().getGroup_4_2()); 
            // InternalMyDsl.g:3126:2: ( rule__Event__Group_4_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==40) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMyDsl.g:3126:3: rule__Event__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Event__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalMyDsl.g:3135:1: rule__Event__Group_4_2__0 : rule__Event__Group_4_2__0__Impl rule__Event__Group_4_2__1 ;
    public final void rule__Event__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3139:1: ( rule__Event__Group_4_2__0__Impl rule__Event__Group_4_2__1 )
            // InternalMyDsl.g:3140:2: rule__Event__Group_4_2__0__Impl rule__Event__Group_4_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3147:1: rule__Event__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3151:1: ( ( ',' ) )
            // InternalMyDsl.g:3152:1: ( ',' )
            {
            // InternalMyDsl.g:3152:1: ( ',' )
            // InternalMyDsl.g:3153:2: ','
            {
             before(grammarAccess.getEventAccess().getCommaKeyword_4_2_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:3162:1: rule__Event__Group_4_2__1 : rule__Event__Group_4_2__1__Impl ;
    public final void rule__Event__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3166:1: ( rule__Event__Group_4_2__1__Impl )
            // InternalMyDsl.g:3167:2: rule__Event__Group_4_2__1__Impl
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
    // InternalMyDsl.g:3173:1: rule__Event__Group_4_2__1__Impl : ( ( rule__Event__ActionsAssignment_4_2_1 ) ) ;
    public final void rule__Event__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3177:1: ( ( ( rule__Event__ActionsAssignment_4_2_1 ) ) )
            // InternalMyDsl.g:3178:1: ( ( rule__Event__ActionsAssignment_4_2_1 ) )
            {
            // InternalMyDsl.g:3178:1: ( ( rule__Event__ActionsAssignment_4_2_1 ) )
            // InternalMyDsl.g:3179:2: ( rule__Event__ActionsAssignment_4_2_1 )
            {
             before(grammarAccess.getEventAccess().getActionsAssignment_4_2_1()); 
            // InternalMyDsl.g:3180:2: ( rule__Event__ActionsAssignment_4_2_1 )
            // InternalMyDsl.g:3180:3: rule__Event__ActionsAssignment_4_2_1
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
    // InternalMyDsl.g:3189:1: rule__Sound__Group__0 : rule__Sound__Group__0__Impl rule__Sound__Group__1 ;
    public final void rule__Sound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3193:1: ( rule__Sound__Group__0__Impl rule__Sound__Group__1 )
            // InternalMyDsl.g:3194:2: rule__Sound__Group__0__Impl rule__Sound__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:3201:1: rule__Sound__Group__0__Impl : ( () ) ;
    public final void rule__Sound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3205:1: ( ( () ) )
            // InternalMyDsl.g:3206:1: ( () )
            {
            // InternalMyDsl.g:3206:1: ( () )
            // InternalMyDsl.g:3207:2: ()
            {
             before(grammarAccess.getSoundAccess().getSoundAction_0()); 
            // InternalMyDsl.g:3208:2: ()
            // InternalMyDsl.g:3208:3: 
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
    // InternalMyDsl.g:3216:1: rule__Sound__Group__1 : rule__Sound__Group__1__Impl rule__Sound__Group__2 ;
    public final void rule__Sound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3220:1: ( rule__Sound__Group__1__Impl rule__Sound__Group__2 )
            // InternalMyDsl.g:3221:2: rule__Sound__Group__1__Impl rule__Sound__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3228:1: rule__Sound__Group__1__Impl : ( 'Sound' ) ;
    public final void rule__Sound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3232:1: ( ( 'Sound' ) )
            // InternalMyDsl.g:3233:1: ( 'Sound' )
            {
            // InternalMyDsl.g:3233:1: ( 'Sound' )
            // InternalMyDsl.g:3234:2: 'Sound'
            {
             before(grammarAccess.getSoundAccess().getSoundKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:3243:1: rule__Sound__Group__2 : rule__Sound__Group__2__Impl ;
    public final void rule__Sound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3247:1: ( rule__Sound__Group__2__Impl )
            // InternalMyDsl.g:3248:2: rule__Sound__Group__2__Impl
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
    // InternalMyDsl.g:3254:1: rule__Sound__Group__2__Impl : ( ( rule__Sound__ConditionnameAssignment_2 ) ) ;
    public final void rule__Sound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3258:1: ( ( ( rule__Sound__ConditionnameAssignment_2 ) ) )
            // InternalMyDsl.g:3259:1: ( ( rule__Sound__ConditionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:3259:1: ( ( rule__Sound__ConditionnameAssignment_2 ) )
            // InternalMyDsl.g:3260:2: ( rule__Sound__ConditionnameAssignment_2 )
            {
             before(grammarAccess.getSoundAccess().getConditionnameAssignment_2()); 
            // InternalMyDsl.g:3261:2: ( rule__Sound__ConditionnameAssignment_2 )
            // InternalMyDsl.g:3261:3: rule__Sound__ConditionnameAssignment_2
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
    // InternalMyDsl.g:3270:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3274:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalMyDsl.g:3275:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalMyDsl.g:3282:1: rule__Button__Group__0__Impl : ( () ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3286:1: ( ( () ) )
            // InternalMyDsl.g:3287:1: ( () )
            {
            // InternalMyDsl.g:3287:1: ( () )
            // InternalMyDsl.g:3288:2: ()
            {
             before(grammarAccess.getButtonAccess().getButtonAction_0()); 
            // InternalMyDsl.g:3289:2: ()
            // InternalMyDsl.g:3289:3: 
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
    // InternalMyDsl.g:3297:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3301:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalMyDsl.g:3302:2: rule__Button__Group__1__Impl rule__Button__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3309:1: rule__Button__Group__1__Impl : ( 'Button' ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3313:1: ( ( 'Button' ) )
            // InternalMyDsl.g:3314:1: ( 'Button' )
            {
            // InternalMyDsl.g:3314:1: ( 'Button' )
            // InternalMyDsl.g:3315:2: 'Button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyDsl.g:3324:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3328:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalMyDsl.g:3329:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3336:1: rule__Button__Group__2__Impl : ( ( rule__Button__ConditionnameAssignment_2 ) ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3340:1: ( ( ( rule__Button__ConditionnameAssignment_2 ) ) )
            // InternalMyDsl.g:3341:1: ( ( rule__Button__ConditionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:3341:1: ( ( rule__Button__ConditionnameAssignment_2 ) )
            // InternalMyDsl.g:3342:2: ( rule__Button__ConditionnameAssignment_2 )
            {
             before(grammarAccess.getButtonAccess().getConditionnameAssignment_2()); 
            // InternalMyDsl.g:3343:2: ( rule__Button__ConditionnameAssignment_2 )
            // InternalMyDsl.g:3343:3: rule__Button__ConditionnameAssignment_2
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
    // InternalMyDsl.g:3351:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3355:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // InternalMyDsl.g:3356:2: rule__Button__Group__3__Impl rule__Button__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:3363:1: rule__Button__Group__3__Impl : ( 'button' ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3367:1: ( ( 'button' ) )
            // InternalMyDsl.g:3368:1: ( 'button' )
            {
            // InternalMyDsl.g:3368:1: ( 'button' )
            // InternalMyDsl.g:3369:2: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:3378:1: rule__Button__Group__4 : rule__Button__Group__4__Impl ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3382:1: ( rule__Button__Group__4__Impl )
            // InternalMyDsl.g:3383:2: rule__Button__Group__4__Impl
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
    // InternalMyDsl.g:3389:1: rule__Button__Group__4__Impl : ( ( rule__Button__ButtonAssignment_4 ) ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3393:1: ( ( ( rule__Button__ButtonAssignment_4 ) ) )
            // InternalMyDsl.g:3394:1: ( ( rule__Button__ButtonAssignment_4 ) )
            {
            // InternalMyDsl.g:3394:1: ( ( rule__Button__ButtonAssignment_4 ) )
            // InternalMyDsl.g:3395:2: ( rule__Button__ButtonAssignment_4 )
            {
             before(grammarAccess.getButtonAccess().getButtonAssignment_4()); 
            // InternalMyDsl.g:3396:2: ( rule__Button__ButtonAssignment_4 )
            // InternalMyDsl.g:3396:3: rule__Button__ButtonAssignment_4
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
    // InternalMyDsl.g:3405:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3409:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalMyDsl.g:3410:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:3417:1: rule__Sensor__Group__0__Impl : ( () ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3421:1: ( ( () ) )
            // InternalMyDsl.g:3422:1: ( () )
            {
            // InternalMyDsl.g:3422:1: ( () )
            // InternalMyDsl.g:3423:2: ()
            {
             before(grammarAccess.getSensorAccess().getSensorAction_0()); 
            // InternalMyDsl.g:3424:2: ()
            // InternalMyDsl.g:3424:3: 
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
    // InternalMyDsl.g:3432:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3436:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalMyDsl.g:3437:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3444:1: rule__Sensor__Group__1__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3448:1: ( ( 'Sensor' ) )
            // InternalMyDsl.g:3449:1: ( 'Sensor' )
            {
            // InternalMyDsl.g:3449:1: ( 'Sensor' )
            // InternalMyDsl.g:3450:2: 'Sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMyDsl.g:3459:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3463:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalMyDsl.g:3464:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyDsl.g:3471:1: rule__Sensor__Group__2__Impl : ( ( rule__Sensor__ConditionnameAssignment_2 ) ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3475:1: ( ( ( rule__Sensor__ConditionnameAssignment_2 ) ) )
            // InternalMyDsl.g:3476:1: ( ( rule__Sensor__ConditionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:3476:1: ( ( rule__Sensor__ConditionnameAssignment_2 ) )
            // InternalMyDsl.g:3477:2: ( rule__Sensor__ConditionnameAssignment_2 )
            {
             before(grammarAccess.getSensorAccess().getConditionnameAssignment_2()); 
            // InternalMyDsl.g:3478:2: ( rule__Sensor__ConditionnameAssignment_2 )
            // InternalMyDsl.g:3478:3: rule__Sensor__ConditionnameAssignment_2
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
    // InternalMyDsl.g:3486:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl rule__Sensor__Group__4 ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3490:1: ( rule__Sensor__Group__3__Impl rule__Sensor__Group__4 )
            // InternalMyDsl.g:3491:2: rule__Sensor__Group__3__Impl rule__Sensor__Group__4
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:3498:1: rule__Sensor__Group__3__Impl : ( 'sensorPos' ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3502:1: ( ( 'sensorPos' ) )
            // InternalMyDsl.g:3503:1: ( 'sensorPos' )
            {
            // InternalMyDsl.g:3503:1: ( 'sensorPos' )
            // InternalMyDsl.g:3504:2: 'sensorPos'
            {
             before(grammarAccess.getSensorAccess().getSensorPosKeyword_3()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:3513:1: rule__Sensor__Group__4 : rule__Sensor__Group__4__Impl ;
    public final void rule__Sensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3517:1: ( rule__Sensor__Group__4__Impl )
            // InternalMyDsl.g:3518:2: rule__Sensor__Group__4__Impl
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
    // InternalMyDsl.g:3524:1: rule__Sensor__Group__4__Impl : ( ( rule__Sensor__SensorPosAssignment_4 ) ) ;
    public final void rule__Sensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3528:1: ( ( ( rule__Sensor__SensorPosAssignment_4 ) ) )
            // InternalMyDsl.g:3529:1: ( ( rule__Sensor__SensorPosAssignment_4 ) )
            {
            // InternalMyDsl.g:3529:1: ( ( rule__Sensor__SensorPosAssignment_4 ) )
            // InternalMyDsl.g:3530:2: ( rule__Sensor__SensorPosAssignment_4 )
            {
             before(grammarAccess.getSensorAccess().getSensorPosAssignment_4()); 
            // InternalMyDsl.g:3531:2: ( rule__Sensor__SensorPosAssignment_4 )
            // InternalMyDsl.g:3531:3: rule__Sensor__SensorPosAssignment_4
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
    // InternalMyDsl.g:3540:1: rule__Tap__Group__0 : rule__Tap__Group__0__Impl rule__Tap__Group__1 ;
    public final void rule__Tap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3544:1: ( rule__Tap__Group__0__Impl rule__Tap__Group__1 )
            // InternalMyDsl.g:3545:2: rule__Tap__Group__0__Impl rule__Tap__Group__1
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
    // InternalMyDsl.g:3552:1: rule__Tap__Group__0__Impl : ( () ) ;
    public final void rule__Tap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3556:1: ( ( () ) )
            // InternalMyDsl.g:3557:1: ( () )
            {
            // InternalMyDsl.g:3557:1: ( () )
            // InternalMyDsl.g:3558:2: ()
            {
             before(grammarAccess.getTapAccess().getTapAction_0()); 
            // InternalMyDsl.g:3559:2: ()
            // InternalMyDsl.g:3559:3: 
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
    // InternalMyDsl.g:3567:1: rule__Tap__Group__1 : rule__Tap__Group__1__Impl rule__Tap__Group__2 ;
    public final void rule__Tap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3571:1: ( rule__Tap__Group__1__Impl rule__Tap__Group__2 )
            // InternalMyDsl.g:3572:2: rule__Tap__Group__1__Impl rule__Tap__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3579:1: rule__Tap__Group__1__Impl : ( 'Tap' ) ;
    public final void rule__Tap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3583:1: ( ( 'Tap' ) )
            // InternalMyDsl.g:3584:1: ( 'Tap' )
            {
            // InternalMyDsl.g:3584:1: ( 'Tap' )
            // InternalMyDsl.g:3585:2: 'Tap'
            {
             before(grammarAccess.getTapAccess().getTapKeyword_1()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:3594:1: rule__Tap__Group__2 : rule__Tap__Group__2__Impl ;
    public final void rule__Tap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3598:1: ( rule__Tap__Group__2__Impl )
            // InternalMyDsl.g:3599:2: rule__Tap__Group__2__Impl
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
    // InternalMyDsl.g:3605:1: rule__Tap__Group__2__Impl : ( ( rule__Tap__ConditionnameAssignment_2 ) ) ;
    public final void rule__Tap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3609:1: ( ( ( rule__Tap__ConditionnameAssignment_2 ) ) )
            // InternalMyDsl.g:3610:1: ( ( rule__Tap__ConditionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:3610:1: ( ( rule__Tap__ConditionnameAssignment_2 ) )
            // InternalMyDsl.g:3611:2: ( rule__Tap__ConditionnameAssignment_2 )
            {
             before(grammarAccess.getTapAccess().getConditionnameAssignment_2()); 
            // InternalMyDsl.g:3612:2: ( rule__Tap__ConditionnameAssignment_2 )
            // InternalMyDsl.g:3612:3: rule__Tap__ConditionnameAssignment_2
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
    // InternalMyDsl.g:3621:1: rule__MotorAction__Group__0 : rule__MotorAction__Group__0__Impl rule__MotorAction__Group__1 ;
    public final void rule__MotorAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3625:1: ( rule__MotorAction__Group__0__Impl rule__MotorAction__Group__1 )
            // InternalMyDsl.g:3626:2: rule__MotorAction__Group__0__Impl rule__MotorAction__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:3633:1: rule__MotorAction__Group__0__Impl : ( () ) ;
    public final void rule__MotorAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3637:1: ( ( () ) )
            // InternalMyDsl.g:3638:1: ( () )
            {
            // InternalMyDsl.g:3638:1: ( () )
            // InternalMyDsl.g:3639:2: ()
            {
             before(grammarAccess.getMotorActionAccess().getMotorActionAction_0()); 
            // InternalMyDsl.g:3640:2: ()
            // InternalMyDsl.g:3640:3: 
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
    // InternalMyDsl.g:3648:1: rule__MotorAction__Group__1 : rule__MotorAction__Group__1__Impl rule__MotorAction__Group__2 ;
    public final void rule__MotorAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3652:1: ( rule__MotorAction__Group__1__Impl rule__MotorAction__Group__2 )
            // InternalMyDsl.g:3653:2: rule__MotorAction__Group__1__Impl rule__MotorAction__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3660:1: rule__MotorAction__Group__1__Impl : ( 'MotorAction' ) ;
    public final void rule__MotorAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3664:1: ( ( 'MotorAction' ) )
            // InternalMyDsl.g:3665:1: ( 'MotorAction' )
            {
            // InternalMyDsl.g:3665:1: ( 'MotorAction' )
            // InternalMyDsl.g:3666:2: 'MotorAction'
            {
             before(grammarAccess.getMotorActionAccess().getMotorActionKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:3675:1: rule__MotorAction__Group__2 : rule__MotorAction__Group__2__Impl rule__MotorAction__Group__3 ;
    public final void rule__MotorAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3679:1: ( rule__MotorAction__Group__2__Impl rule__MotorAction__Group__3 )
            // InternalMyDsl.g:3680:2: rule__MotorAction__Group__2__Impl rule__MotorAction__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:3687:1: rule__MotorAction__Group__2__Impl : ( ( rule__MotorAction__ActionnameAssignment_2 ) ) ;
    public final void rule__MotorAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3691:1: ( ( ( rule__MotorAction__ActionnameAssignment_2 ) ) )
            // InternalMyDsl.g:3692:1: ( ( rule__MotorAction__ActionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:3692:1: ( ( rule__MotorAction__ActionnameAssignment_2 ) )
            // InternalMyDsl.g:3693:2: ( rule__MotorAction__ActionnameAssignment_2 )
            {
             before(grammarAccess.getMotorActionAccess().getActionnameAssignment_2()); 
            // InternalMyDsl.g:3694:2: ( rule__MotorAction__ActionnameAssignment_2 )
            // InternalMyDsl.g:3694:3: rule__MotorAction__ActionnameAssignment_2
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
    // InternalMyDsl.g:3702:1: rule__MotorAction__Group__3 : rule__MotorAction__Group__3__Impl rule__MotorAction__Group__4 ;
    public final void rule__MotorAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3706:1: ( rule__MotorAction__Group__3__Impl rule__MotorAction__Group__4 )
            // InternalMyDsl.g:3707:2: rule__MotorAction__Group__3__Impl rule__MotorAction__Group__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:3714:1: rule__MotorAction__Group__3__Impl : ( ( rule__MotorAction__Group_3__0 )? ) ;
    public final void rule__MotorAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3718:1: ( ( ( rule__MotorAction__Group_3__0 )? ) )
            // InternalMyDsl.g:3719:1: ( ( rule__MotorAction__Group_3__0 )? )
            {
            // InternalMyDsl.g:3719:1: ( ( rule__MotorAction__Group_3__0 )? )
            // InternalMyDsl.g:3720:2: ( rule__MotorAction__Group_3__0 )?
            {
             before(grammarAccess.getMotorActionAccess().getGroup_3()); 
            // InternalMyDsl.g:3721:2: ( rule__MotorAction__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==48) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:3721:3: rule__MotorAction__Group_3__0
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
    // InternalMyDsl.g:3729:1: rule__MotorAction__Group__4 : rule__MotorAction__Group__4__Impl ;
    public final void rule__MotorAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3733:1: ( rule__MotorAction__Group__4__Impl )
            // InternalMyDsl.g:3734:2: rule__MotorAction__Group__4__Impl
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
    // InternalMyDsl.g:3740:1: rule__MotorAction__Group__4__Impl : ( ( rule__MotorAction__Group_4__0 )? ) ;
    public final void rule__MotorAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3744:1: ( ( ( rule__MotorAction__Group_4__0 )? ) )
            // InternalMyDsl.g:3745:1: ( ( rule__MotorAction__Group_4__0 )? )
            {
            // InternalMyDsl.g:3745:1: ( ( rule__MotorAction__Group_4__0 )? )
            // InternalMyDsl.g:3746:2: ( rule__MotorAction__Group_4__0 )?
            {
             before(grammarAccess.getMotorActionAccess().getGroup_4()); 
            // InternalMyDsl.g:3747:2: ( rule__MotorAction__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:3747:3: rule__MotorAction__Group_4__0
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
    // InternalMyDsl.g:3756:1: rule__MotorAction__Group_3__0 : rule__MotorAction__Group_3__0__Impl rule__MotorAction__Group_3__1 ;
    public final void rule__MotorAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3760:1: ( rule__MotorAction__Group_3__0__Impl rule__MotorAction__Group_3__1 )
            // InternalMyDsl.g:3761:2: rule__MotorAction__Group_3__0__Impl rule__MotorAction__Group_3__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:3768:1: rule__MotorAction__Group_3__0__Impl : ( 'motorLeft' ) ;
    public final void rule__MotorAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3772:1: ( ( 'motorLeft' ) )
            // InternalMyDsl.g:3773:1: ( 'motorLeft' )
            {
            // InternalMyDsl.g:3773:1: ( 'motorLeft' )
            // InternalMyDsl.g:3774:2: 'motorLeft'
            {
             before(grammarAccess.getMotorActionAccess().getMotorLeftKeyword_3_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:3783:1: rule__MotorAction__Group_3__1 : rule__MotorAction__Group_3__1__Impl ;
    public final void rule__MotorAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3787:1: ( rule__MotorAction__Group_3__1__Impl )
            // InternalMyDsl.g:3788:2: rule__MotorAction__Group_3__1__Impl
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
    // InternalMyDsl.g:3794:1: rule__MotorAction__Group_3__1__Impl : ( ( rule__MotorAction__MotorLeftAssignment_3_1 ) ) ;
    public final void rule__MotorAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3798:1: ( ( ( rule__MotorAction__MotorLeftAssignment_3_1 ) ) )
            // InternalMyDsl.g:3799:1: ( ( rule__MotorAction__MotorLeftAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3799:1: ( ( rule__MotorAction__MotorLeftAssignment_3_1 ) )
            // InternalMyDsl.g:3800:2: ( rule__MotorAction__MotorLeftAssignment_3_1 )
            {
             before(grammarAccess.getMotorActionAccess().getMotorLeftAssignment_3_1()); 
            // InternalMyDsl.g:3801:2: ( rule__MotorAction__MotorLeftAssignment_3_1 )
            // InternalMyDsl.g:3801:3: rule__MotorAction__MotorLeftAssignment_3_1
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
    // InternalMyDsl.g:3810:1: rule__MotorAction__Group_4__0 : rule__MotorAction__Group_4__0__Impl rule__MotorAction__Group_4__1 ;
    public final void rule__MotorAction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3814:1: ( rule__MotorAction__Group_4__0__Impl rule__MotorAction__Group_4__1 )
            // InternalMyDsl.g:3815:2: rule__MotorAction__Group_4__0__Impl rule__MotorAction__Group_4__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:3822:1: rule__MotorAction__Group_4__0__Impl : ( 'motorRight' ) ;
    public final void rule__MotorAction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3826:1: ( ( 'motorRight' ) )
            // InternalMyDsl.g:3827:1: ( 'motorRight' )
            {
            // InternalMyDsl.g:3827:1: ( 'motorRight' )
            // InternalMyDsl.g:3828:2: 'motorRight'
            {
             before(grammarAccess.getMotorActionAccess().getMotorRightKeyword_4_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalMyDsl.g:3837:1: rule__MotorAction__Group_4__1 : rule__MotorAction__Group_4__1__Impl ;
    public final void rule__MotorAction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3841:1: ( rule__MotorAction__Group_4__1__Impl )
            // InternalMyDsl.g:3842:2: rule__MotorAction__Group_4__1__Impl
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
    // InternalMyDsl.g:3848:1: rule__MotorAction__Group_4__1__Impl : ( ( rule__MotorAction__MotorRightAssignment_4_1 ) ) ;
    public final void rule__MotorAction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3852:1: ( ( ( rule__MotorAction__MotorRightAssignment_4_1 ) ) )
            // InternalMyDsl.g:3853:1: ( ( rule__MotorAction__MotorRightAssignment_4_1 ) )
            {
            // InternalMyDsl.g:3853:1: ( ( rule__MotorAction__MotorRightAssignment_4_1 ) )
            // InternalMyDsl.g:3854:2: ( rule__MotorAction__MotorRightAssignment_4_1 )
            {
             before(grammarAccess.getMotorActionAccess().getMotorRightAssignment_4_1()); 
            // InternalMyDsl.g:3855:2: ( rule__MotorAction__MotorRightAssignment_4_1 )
            // InternalMyDsl.g:3855:3: rule__MotorAction__MotorRightAssignment_4_1
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
    // InternalMyDsl.g:3864:1: rule__SoundAction__Group__0 : rule__SoundAction__Group__0__Impl rule__SoundAction__Group__1 ;
    public final void rule__SoundAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3868:1: ( rule__SoundAction__Group__0__Impl rule__SoundAction__Group__1 )
            // InternalMyDsl.g:3869:2: rule__SoundAction__Group__0__Impl rule__SoundAction__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:3876:1: rule__SoundAction__Group__0__Impl : ( () ) ;
    public final void rule__SoundAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3880:1: ( ( () ) )
            // InternalMyDsl.g:3881:1: ( () )
            {
            // InternalMyDsl.g:3881:1: ( () )
            // InternalMyDsl.g:3882:2: ()
            {
             before(grammarAccess.getSoundActionAccess().getSoundActionAction_0()); 
            // InternalMyDsl.g:3883:2: ()
            // InternalMyDsl.g:3883:3: 
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
    // InternalMyDsl.g:3891:1: rule__SoundAction__Group__1 : rule__SoundAction__Group__1__Impl rule__SoundAction__Group__2 ;
    public final void rule__SoundAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3895:1: ( rule__SoundAction__Group__1__Impl rule__SoundAction__Group__2 )
            // InternalMyDsl.g:3896:2: rule__SoundAction__Group__1__Impl rule__SoundAction__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3903:1: rule__SoundAction__Group__1__Impl : ( 'SoundAction' ) ;
    public final void rule__SoundAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3907:1: ( ( 'SoundAction' ) )
            // InternalMyDsl.g:3908:1: ( 'SoundAction' )
            {
            // InternalMyDsl.g:3908:1: ( 'SoundAction' )
            // InternalMyDsl.g:3909:2: 'SoundAction'
            {
             before(grammarAccess.getSoundActionAccess().getSoundActionKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyDsl.g:3918:1: rule__SoundAction__Group__2 : rule__SoundAction__Group__2__Impl rule__SoundAction__Group__3 ;
    public final void rule__SoundAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3922:1: ( rule__SoundAction__Group__2__Impl rule__SoundAction__Group__3 )
            // InternalMyDsl.g:3923:2: rule__SoundAction__Group__2__Impl rule__SoundAction__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyDsl.g:3930:1: rule__SoundAction__Group__2__Impl : ( ( rule__SoundAction__ActionnameAssignment_2 ) ) ;
    public final void rule__SoundAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3934:1: ( ( ( rule__SoundAction__ActionnameAssignment_2 ) ) )
            // InternalMyDsl.g:3935:1: ( ( rule__SoundAction__ActionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:3935:1: ( ( rule__SoundAction__ActionnameAssignment_2 ) )
            // InternalMyDsl.g:3936:2: ( rule__SoundAction__ActionnameAssignment_2 )
            {
             before(grammarAccess.getSoundActionAccess().getActionnameAssignment_2()); 
            // InternalMyDsl.g:3937:2: ( rule__SoundAction__ActionnameAssignment_2 )
            // InternalMyDsl.g:3937:3: rule__SoundAction__ActionnameAssignment_2
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
    // InternalMyDsl.g:3945:1: rule__SoundAction__Group__3 : rule__SoundAction__Group__3__Impl ;
    public final void rule__SoundAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3949:1: ( rule__SoundAction__Group__3__Impl )
            // InternalMyDsl.g:3950:2: rule__SoundAction__Group__3__Impl
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
    // InternalMyDsl.g:3956:1: rule__SoundAction__Group__3__Impl : ( ( rule__SoundAction__Group_3__0 )? ) ;
    public final void rule__SoundAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3960:1: ( ( ( rule__SoundAction__Group_3__0 )? ) )
            // InternalMyDsl.g:3961:1: ( ( rule__SoundAction__Group_3__0 )? )
            {
            // InternalMyDsl.g:3961:1: ( ( rule__SoundAction__Group_3__0 )? )
            // InternalMyDsl.g:3962:2: ( rule__SoundAction__Group_3__0 )?
            {
             before(grammarAccess.getSoundActionAccess().getGroup_3()); 
            // InternalMyDsl.g:3963:2: ( rule__SoundAction__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==51) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:3963:3: rule__SoundAction__Group_3__0
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
    // InternalMyDsl.g:3972:1: rule__SoundAction__Group_3__0 : rule__SoundAction__Group_3__0__Impl rule__SoundAction__Group_3__1 ;
    public final void rule__SoundAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3976:1: ( rule__SoundAction__Group_3__0__Impl rule__SoundAction__Group_3__1 )
            // InternalMyDsl.g:3977:2: rule__SoundAction__Group_3__0__Impl rule__SoundAction__Group_3__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyDsl.g:3984:1: rule__SoundAction__Group_3__0__Impl : ( 'set:' ) ;
    public final void rule__SoundAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3988:1: ( ( 'set:' ) )
            // InternalMyDsl.g:3989:1: ( 'set:' )
            {
            // InternalMyDsl.g:3989:1: ( 'set:' )
            // InternalMyDsl.g:3990:2: 'set:'
            {
             before(grammarAccess.getSoundActionAccess().getSetKeyword_3_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:3999:1: rule__SoundAction__Group_3__1 : rule__SoundAction__Group_3__1__Impl rule__SoundAction__Group_3__2 ;
    public final void rule__SoundAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4003:1: ( rule__SoundAction__Group_3__1__Impl rule__SoundAction__Group_3__2 )
            // InternalMyDsl.g:4004:2: rule__SoundAction__Group_3__1__Impl rule__SoundAction__Group_3__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:4011:1: rule__SoundAction__Group_3__1__Impl : ( ( rule__SoundAction__MusicsettingsAssignment_3_1 ) ) ;
    public final void rule__SoundAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4015:1: ( ( ( rule__SoundAction__MusicsettingsAssignment_3_1 ) ) )
            // InternalMyDsl.g:4016:1: ( ( rule__SoundAction__MusicsettingsAssignment_3_1 ) )
            {
            // InternalMyDsl.g:4016:1: ( ( rule__SoundAction__MusicsettingsAssignment_3_1 ) )
            // InternalMyDsl.g:4017:2: ( rule__SoundAction__MusicsettingsAssignment_3_1 )
            {
             before(grammarAccess.getSoundActionAccess().getMusicsettingsAssignment_3_1()); 
            // InternalMyDsl.g:4018:2: ( rule__SoundAction__MusicsettingsAssignment_3_1 )
            // InternalMyDsl.g:4018:3: rule__SoundAction__MusicsettingsAssignment_3_1
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
    // InternalMyDsl.g:4026:1: rule__SoundAction__Group_3__2 : rule__SoundAction__Group_3__2__Impl ;
    public final void rule__SoundAction__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4030:1: ( rule__SoundAction__Group_3__2__Impl )
            // InternalMyDsl.g:4031:2: rule__SoundAction__Group_3__2__Impl
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
    // InternalMyDsl.g:4037:1: rule__SoundAction__Group_3__2__Impl : ( ( rule__SoundAction__Group_3_2__0 )* ) ;
    public final void rule__SoundAction__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4041:1: ( ( ( rule__SoundAction__Group_3_2__0 )* ) )
            // InternalMyDsl.g:4042:1: ( ( rule__SoundAction__Group_3_2__0 )* )
            {
            // InternalMyDsl.g:4042:1: ( ( rule__SoundAction__Group_3_2__0 )* )
            // InternalMyDsl.g:4043:2: ( rule__SoundAction__Group_3_2__0 )*
            {
             before(grammarAccess.getSoundActionAccess().getGroup_3_2()); 
            // InternalMyDsl.g:4044:2: ( rule__SoundAction__Group_3_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==40) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:4044:3: rule__SoundAction__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__SoundAction__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalMyDsl.g:4053:1: rule__SoundAction__Group_3_2__0 : rule__SoundAction__Group_3_2__0__Impl rule__SoundAction__Group_3_2__1 ;
    public final void rule__SoundAction__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4057:1: ( rule__SoundAction__Group_3_2__0__Impl rule__SoundAction__Group_3_2__1 )
            // InternalMyDsl.g:4058:2: rule__SoundAction__Group_3_2__0__Impl rule__SoundAction__Group_3_2__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyDsl.g:4065:1: rule__SoundAction__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__SoundAction__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4069:1: ( ( ',' ) )
            // InternalMyDsl.g:4070:1: ( ',' )
            {
            // InternalMyDsl.g:4070:1: ( ',' )
            // InternalMyDsl.g:4071:2: ','
            {
             before(grammarAccess.getSoundActionAccess().getCommaKeyword_3_2_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:4080:1: rule__SoundAction__Group_3_2__1 : rule__SoundAction__Group_3_2__1__Impl ;
    public final void rule__SoundAction__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4084:1: ( rule__SoundAction__Group_3_2__1__Impl )
            // InternalMyDsl.g:4085:2: rule__SoundAction__Group_3_2__1__Impl
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
    // InternalMyDsl.g:4091:1: rule__SoundAction__Group_3_2__1__Impl : ( ( rule__SoundAction__MusicsettingsAssignment_3_2_1 ) ) ;
    public final void rule__SoundAction__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4095:1: ( ( ( rule__SoundAction__MusicsettingsAssignment_3_2_1 ) ) )
            // InternalMyDsl.g:4096:1: ( ( rule__SoundAction__MusicsettingsAssignment_3_2_1 ) )
            {
            // InternalMyDsl.g:4096:1: ( ( rule__SoundAction__MusicsettingsAssignment_3_2_1 ) )
            // InternalMyDsl.g:4097:2: ( rule__SoundAction__MusicsettingsAssignment_3_2_1 )
            {
             before(grammarAccess.getSoundActionAccess().getMusicsettingsAssignment_3_2_1()); 
            // InternalMyDsl.g:4098:2: ( rule__SoundAction__MusicsettingsAssignment_3_2_1 )
            // InternalMyDsl.g:4098:3: rule__SoundAction__MusicsettingsAssignment_3_2_1
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
    // InternalMyDsl.g:4107:1: rule__LightAction__Group__0 : rule__LightAction__Group__0__Impl rule__LightAction__Group__1 ;
    public final void rule__LightAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4111:1: ( rule__LightAction__Group__0__Impl rule__LightAction__Group__1 )
            // InternalMyDsl.g:4112:2: rule__LightAction__Group__0__Impl rule__LightAction__Group__1
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
    // InternalMyDsl.g:4119:1: rule__LightAction__Group__0__Impl : ( () ) ;
    public final void rule__LightAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4123:1: ( ( () ) )
            // InternalMyDsl.g:4124:1: ( () )
            {
            // InternalMyDsl.g:4124:1: ( () )
            // InternalMyDsl.g:4125:2: ()
            {
             before(grammarAccess.getLightActionAccess().getLightActionAction_0()); 
            // InternalMyDsl.g:4126:2: ()
            // InternalMyDsl.g:4126:3: 
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
    // InternalMyDsl.g:4134:1: rule__LightAction__Group__1 : rule__LightAction__Group__1__Impl rule__LightAction__Group__2 ;
    public final void rule__LightAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4138:1: ( rule__LightAction__Group__1__Impl rule__LightAction__Group__2 )
            // InternalMyDsl.g:4139:2: rule__LightAction__Group__1__Impl rule__LightAction__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:4146:1: rule__LightAction__Group__1__Impl : ( 'LightAction' ) ;
    public final void rule__LightAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4150:1: ( ( 'LightAction' ) )
            // InternalMyDsl.g:4151:1: ( 'LightAction' )
            {
            // InternalMyDsl.g:4151:1: ( 'LightAction' )
            // InternalMyDsl.g:4152:2: 'LightAction'
            {
             before(grammarAccess.getLightActionAccess().getLightActionKeyword_1()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:4161:1: rule__LightAction__Group__2 : rule__LightAction__Group__2__Impl rule__LightAction__Group__3 ;
    public final void rule__LightAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4165:1: ( rule__LightAction__Group__2__Impl rule__LightAction__Group__3 )
            // InternalMyDsl.g:4166:2: rule__LightAction__Group__2__Impl rule__LightAction__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:4173:1: rule__LightAction__Group__2__Impl : ( ( rule__LightAction__ActionnameAssignment_2 ) ) ;
    public final void rule__LightAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4177:1: ( ( ( rule__LightAction__ActionnameAssignment_2 ) ) )
            // InternalMyDsl.g:4178:1: ( ( rule__LightAction__ActionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:4178:1: ( ( rule__LightAction__ActionnameAssignment_2 ) )
            // InternalMyDsl.g:4179:2: ( rule__LightAction__ActionnameAssignment_2 )
            {
             before(grammarAccess.getLightActionAccess().getActionnameAssignment_2()); 
            // InternalMyDsl.g:4180:2: ( rule__LightAction__ActionnameAssignment_2 )
            // InternalMyDsl.g:4180:3: rule__LightAction__ActionnameAssignment_2
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
    // InternalMyDsl.g:4188:1: rule__LightAction__Group__3 : rule__LightAction__Group__3__Impl rule__LightAction__Group__4 ;
    public final void rule__LightAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4192:1: ( rule__LightAction__Group__3__Impl rule__LightAction__Group__4 )
            // InternalMyDsl.g:4193:2: rule__LightAction__Group__3__Impl rule__LightAction__Group__4
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:4200:1: rule__LightAction__Group__3__Impl : ( 'pos:' ) ;
    public final void rule__LightAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4204:1: ( ( 'pos:' ) )
            // InternalMyDsl.g:4205:1: ( 'pos:' )
            {
            // InternalMyDsl.g:4205:1: ( 'pos:' )
            // InternalMyDsl.g:4206:2: 'pos:'
            {
             before(grammarAccess.getLightActionAccess().getPosKeyword_3()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:4215:1: rule__LightAction__Group__4 : rule__LightAction__Group__4__Impl rule__LightAction__Group__5 ;
    public final void rule__LightAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4219:1: ( rule__LightAction__Group__4__Impl rule__LightAction__Group__5 )
            // InternalMyDsl.g:4220:2: rule__LightAction__Group__4__Impl rule__LightAction__Group__5
            {
            pushFollow(FOLLOW_45);
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
    // InternalMyDsl.g:4227:1: rule__LightAction__Group__4__Impl : ( ( rule__LightAction__PosAssignment_4 ) ) ;
    public final void rule__LightAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4231:1: ( ( ( rule__LightAction__PosAssignment_4 ) ) )
            // InternalMyDsl.g:4232:1: ( ( rule__LightAction__PosAssignment_4 ) )
            {
            // InternalMyDsl.g:4232:1: ( ( rule__LightAction__PosAssignment_4 ) )
            // InternalMyDsl.g:4233:2: ( rule__LightAction__PosAssignment_4 )
            {
             before(grammarAccess.getLightActionAccess().getPosAssignment_4()); 
            // InternalMyDsl.g:4234:2: ( rule__LightAction__PosAssignment_4 )
            // InternalMyDsl.g:4234:3: rule__LightAction__PosAssignment_4
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
    // InternalMyDsl.g:4242:1: rule__LightAction__Group__5 : rule__LightAction__Group__5__Impl rule__LightAction__Group__6 ;
    public final void rule__LightAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4246:1: ( rule__LightAction__Group__5__Impl rule__LightAction__Group__6 )
            // InternalMyDsl.g:4247:2: rule__LightAction__Group__5__Impl rule__LightAction__Group__6
            {
            pushFollow(FOLLOW_45);
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
    // InternalMyDsl.g:4254:1: rule__LightAction__Group__5__Impl : ( ( rule__LightAction__Group_5__0 )? ) ;
    public final void rule__LightAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4258:1: ( ( ( rule__LightAction__Group_5__0 )? ) )
            // InternalMyDsl.g:4259:1: ( ( rule__LightAction__Group_5__0 )? )
            {
            // InternalMyDsl.g:4259:1: ( ( rule__LightAction__Group_5__0 )? )
            // InternalMyDsl.g:4260:2: ( rule__LightAction__Group_5__0 )?
            {
             before(grammarAccess.getLightActionAccess().getGroup_5()); 
            // InternalMyDsl.g:4261:2: ( rule__LightAction__Group_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==54) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:4261:3: rule__LightAction__Group_5__0
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
    // InternalMyDsl.g:4269:1: rule__LightAction__Group__6 : rule__LightAction__Group__6__Impl rule__LightAction__Group__7 ;
    public final void rule__LightAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4273:1: ( rule__LightAction__Group__6__Impl rule__LightAction__Group__7 )
            // InternalMyDsl.g:4274:2: rule__LightAction__Group__6__Impl rule__LightAction__Group__7
            {
            pushFollow(FOLLOW_45);
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
    // InternalMyDsl.g:4281:1: rule__LightAction__Group__6__Impl : ( ( rule__LightAction__Group_6__0 )? ) ;
    public final void rule__LightAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4285:1: ( ( ( rule__LightAction__Group_6__0 )? ) )
            // InternalMyDsl.g:4286:1: ( ( rule__LightAction__Group_6__0 )? )
            {
            // InternalMyDsl.g:4286:1: ( ( rule__LightAction__Group_6__0 )? )
            // InternalMyDsl.g:4287:2: ( rule__LightAction__Group_6__0 )?
            {
             before(grammarAccess.getLightActionAccess().getGroup_6()); 
            // InternalMyDsl.g:4288:2: ( rule__LightAction__Group_6__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==55) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:4288:3: rule__LightAction__Group_6__0
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
    // InternalMyDsl.g:4296:1: rule__LightAction__Group__7 : rule__LightAction__Group__7__Impl ;
    public final void rule__LightAction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4300:1: ( rule__LightAction__Group__7__Impl )
            // InternalMyDsl.g:4301:2: rule__LightAction__Group__7__Impl
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
    // InternalMyDsl.g:4307:1: rule__LightAction__Group__7__Impl : ( ( rule__LightAction__Group_7__0 )? ) ;
    public final void rule__LightAction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4311:1: ( ( ( rule__LightAction__Group_7__0 )? ) )
            // InternalMyDsl.g:4312:1: ( ( rule__LightAction__Group_7__0 )? )
            {
            // InternalMyDsl.g:4312:1: ( ( rule__LightAction__Group_7__0 )? )
            // InternalMyDsl.g:4313:2: ( rule__LightAction__Group_7__0 )?
            {
             before(grammarAccess.getLightActionAccess().getGroup_7()); 
            // InternalMyDsl.g:4314:2: ( rule__LightAction__Group_7__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==56) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:4314:3: rule__LightAction__Group_7__0
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
    // InternalMyDsl.g:4323:1: rule__LightAction__Group_5__0 : rule__LightAction__Group_5__0__Impl rule__LightAction__Group_5__1 ;
    public final void rule__LightAction__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4327:1: ( rule__LightAction__Group_5__0__Impl rule__LightAction__Group_5__1 )
            // InternalMyDsl.g:4328:2: rule__LightAction__Group_5__0__Impl rule__LightAction__Group_5__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:4335:1: rule__LightAction__Group_5__0__Impl : ( 'red:' ) ;
    public final void rule__LightAction__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4339:1: ( ( 'red:' ) )
            // InternalMyDsl.g:4340:1: ( 'red:' )
            {
            // InternalMyDsl.g:4340:1: ( 'red:' )
            // InternalMyDsl.g:4341:2: 'red:'
            {
             before(grammarAccess.getLightActionAccess().getRedKeyword_5_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMyDsl.g:4350:1: rule__LightAction__Group_5__1 : rule__LightAction__Group_5__1__Impl ;
    public final void rule__LightAction__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4354:1: ( rule__LightAction__Group_5__1__Impl )
            // InternalMyDsl.g:4355:2: rule__LightAction__Group_5__1__Impl
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
    // InternalMyDsl.g:4361:1: rule__LightAction__Group_5__1__Impl : ( ( rule__LightAction__RedAssignment_5_1 ) ) ;
    public final void rule__LightAction__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4365:1: ( ( ( rule__LightAction__RedAssignment_5_1 ) ) )
            // InternalMyDsl.g:4366:1: ( ( rule__LightAction__RedAssignment_5_1 ) )
            {
            // InternalMyDsl.g:4366:1: ( ( rule__LightAction__RedAssignment_5_1 ) )
            // InternalMyDsl.g:4367:2: ( rule__LightAction__RedAssignment_5_1 )
            {
             before(grammarAccess.getLightActionAccess().getRedAssignment_5_1()); 
            // InternalMyDsl.g:4368:2: ( rule__LightAction__RedAssignment_5_1 )
            // InternalMyDsl.g:4368:3: rule__LightAction__RedAssignment_5_1
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
    // InternalMyDsl.g:4377:1: rule__LightAction__Group_6__0 : rule__LightAction__Group_6__0__Impl rule__LightAction__Group_6__1 ;
    public final void rule__LightAction__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4381:1: ( rule__LightAction__Group_6__0__Impl rule__LightAction__Group_6__1 )
            // InternalMyDsl.g:4382:2: rule__LightAction__Group_6__0__Impl rule__LightAction__Group_6__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:4389:1: rule__LightAction__Group_6__0__Impl : ( 'green:' ) ;
    public final void rule__LightAction__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4393:1: ( ( 'green:' ) )
            // InternalMyDsl.g:4394:1: ( 'green:' )
            {
            // InternalMyDsl.g:4394:1: ( 'green:' )
            // InternalMyDsl.g:4395:2: 'green:'
            {
             before(grammarAccess.getLightActionAccess().getGreenKeyword_6_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMyDsl.g:4404:1: rule__LightAction__Group_6__1 : rule__LightAction__Group_6__1__Impl ;
    public final void rule__LightAction__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4408:1: ( rule__LightAction__Group_6__1__Impl )
            // InternalMyDsl.g:4409:2: rule__LightAction__Group_6__1__Impl
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
    // InternalMyDsl.g:4415:1: rule__LightAction__Group_6__1__Impl : ( ( rule__LightAction__GreenAssignment_6_1 ) ) ;
    public final void rule__LightAction__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4419:1: ( ( ( rule__LightAction__GreenAssignment_6_1 ) ) )
            // InternalMyDsl.g:4420:1: ( ( rule__LightAction__GreenAssignment_6_1 ) )
            {
            // InternalMyDsl.g:4420:1: ( ( rule__LightAction__GreenAssignment_6_1 ) )
            // InternalMyDsl.g:4421:2: ( rule__LightAction__GreenAssignment_6_1 )
            {
             before(grammarAccess.getLightActionAccess().getGreenAssignment_6_1()); 
            // InternalMyDsl.g:4422:2: ( rule__LightAction__GreenAssignment_6_1 )
            // InternalMyDsl.g:4422:3: rule__LightAction__GreenAssignment_6_1
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
    // InternalMyDsl.g:4431:1: rule__LightAction__Group_7__0 : rule__LightAction__Group_7__0__Impl rule__LightAction__Group_7__1 ;
    public final void rule__LightAction__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4435:1: ( rule__LightAction__Group_7__0__Impl rule__LightAction__Group_7__1 )
            // InternalMyDsl.g:4436:2: rule__LightAction__Group_7__0__Impl rule__LightAction__Group_7__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:4443:1: rule__LightAction__Group_7__0__Impl : ( 'blue:' ) ;
    public final void rule__LightAction__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4447:1: ( ( 'blue:' ) )
            // InternalMyDsl.g:4448:1: ( 'blue:' )
            {
            // InternalMyDsl.g:4448:1: ( 'blue:' )
            // InternalMyDsl.g:4449:2: 'blue:'
            {
             before(grammarAccess.getLightActionAccess().getBlueKeyword_7_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMyDsl.g:4458:1: rule__LightAction__Group_7__1 : rule__LightAction__Group_7__1__Impl ;
    public final void rule__LightAction__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4462:1: ( rule__LightAction__Group_7__1__Impl )
            // InternalMyDsl.g:4463:2: rule__LightAction__Group_7__1__Impl
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
    // InternalMyDsl.g:4469:1: rule__LightAction__Group_7__1__Impl : ( ( rule__LightAction__BlueAssignment_7_1 ) ) ;
    public final void rule__LightAction__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4473:1: ( ( ( rule__LightAction__BlueAssignment_7_1 ) ) )
            // InternalMyDsl.g:4474:1: ( ( rule__LightAction__BlueAssignment_7_1 ) )
            {
            // InternalMyDsl.g:4474:1: ( ( rule__LightAction__BlueAssignment_7_1 ) )
            // InternalMyDsl.g:4475:2: ( rule__LightAction__BlueAssignment_7_1 )
            {
             before(grammarAccess.getLightActionAccess().getBlueAssignment_7_1()); 
            // InternalMyDsl.g:4476:2: ( rule__LightAction__BlueAssignment_7_1 )
            // InternalMyDsl.g:4476:3: rule__LightAction__BlueAssignment_7_1
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
    // InternalMyDsl.g:4485:1: rule__MusicSetting__Group__0 : rule__MusicSetting__Group__0__Impl rule__MusicSetting__Group__1 ;
    public final void rule__MusicSetting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4489:1: ( rule__MusicSetting__Group__0__Impl rule__MusicSetting__Group__1 )
            // InternalMyDsl.g:4490:2: rule__MusicSetting__Group__0__Impl rule__MusicSetting__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:4497:1: rule__MusicSetting__Group__0__Impl : ( '(' ) ;
    public final void rule__MusicSetting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4501:1: ( ( '(' ) )
            // InternalMyDsl.g:4502:1: ( '(' )
            {
            // InternalMyDsl.g:4502:1: ( '(' )
            // InternalMyDsl.g:4503:2: '('
            {
             before(grammarAccess.getMusicSettingAccess().getLeftParenthesisKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:4512:1: rule__MusicSetting__Group__1 : rule__MusicSetting__Group__1__Impl rule__MusicSetting__Group__2 ;
    public final void rule__MusicSetting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4516:1: ( rule__MusicSetting__Group__1__Impl rule__MusicSetting__Group__2 )
            // InternalMyDsl.g:4517:2: rule__MusicSetting__Group__1__Impl rule__MusicSetting__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:4524:1: rule__MusicSetting__Group__1__Impl : ( ( rule__MusicSetting__NoteAssignment_1 ) ) ;
    public final void rule__MusicSetting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4528:1: ( ( ( rule__MusicSetting__NoteAssignment_1 ) ) )
            // InternalMyDsl.g:4529:1: ( ( rule__MusicSetting__NoteAssignment_1 ) )
            {
            // InternalMyDsl.g:4529:1: ( ( rule__MusicSetting__NoteAssignment_1 ) )
            // InternalMyDsl.g:4530:2: ( rule__MusicSetting__NoteAssignment_1 )
            {
             before(grammarAccess.getMusicSettingAccess().getNoteAssignment_1()); 
            // InternalMyDsl.g:4531:2: ( rule__MusicSetting__NoteAssignment_1 )
            // InternalMyDsl.g:4531:3: rule__MusicSetting__NoteAssignment_1
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
    // InternalMyDsl.g:4539:1: rule__MusicSetting__Group__2 : rule__MusicSetting__Group__2__Impl rule__MusicSetting__Group__3 ;
    public final void rule__MusicSetting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4543:1: ( rule__MusicSetting__Group__2__Impl rule__MusicSetting__Group__3 )
            // InternalMyDsl.g:4544:2: rule__MusicSetting__Group__2__Impl rule__MusicSetting__Group__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalMyDsl.g:4551:1: rule__MusicSetting__Group__2__Impl : ( ',' ) ;
    public final void rule__MusicSetting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4555:1: ( ( ',' ) )
            // InternalMyDsl.g:4556:1: ( ',' )
            {
            // InternalMyDsl.g:4556:1: ( ',' )
            // InternalMyDsl.g:4557:2: ','
            {
             before(grammarAccess.getMusicSettingAccess().getCommaKeyword_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:4566:1: rule__MusicSetting__Group__3 : rule__MusicSetting__Group__3__Impl rule__MusicSetting__Group__4 ;
    public final void rule__MusicSetting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4570:1: ( rule__MusicSetting__Group__3__Impl rule__MusicSetting__Group__4 )
            // InternalMyDsl.g:4571:2: rule__MusicSetting__Group__3__Impl rule__MusicSetting__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:4578:1: rule__MusicSetting__Group__3__Impl : ( ( rule__MusicSetting__DurationAssignment_3 ) ) ;
    public final void rule__MusicSetting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4582:1: ( ( ( rule__MusicSetting__DurationAssignment_3 ) ) )
            // InternalMyDsl.g:4583:1: ( ( rule__MusicSetting__DurationAssignment_3 ) )
            {
            // InternalMyDsl.g:4583:1: ( ( rule__MusicSetting__DurationAssignment_3 ) )
            // InternalMyDsl.g:4584:2: ( rule__MusicSetting__DurationAssignment_3 )
            {
             before(grammarAccess.getMusicSettingAccess().getDurationAssignment_3()); 
            // InternalMyDsl.g:4585:2: ( rule__MusicSetting__DurationAssignment_3 )
            // InternalMyDsl.g:4585:3: rule__MusicSetting__DurationAssignment_3
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
    // InternalMyDsl.g:4593:1: rule__MusicSetting__Group__4 : rule__MusicSetting__Group__4__Impl rule__MusicSetting__Group__5 ;
    public final void rule__MusicSetting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4597:1: ( rule__MusicSetting__Group__4__Impl rule__MusicSetting__Group__5 )
            // InternalMyDsl.g:4598:2: rule__MusicSetting__Group__4__Impl rule__MusicSetting__Group__5
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:4605:1: rule__MusicSetting__Group__4__Impl : ( ',' ) ;
    public final void rule__MusicSetting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4609:1: ( ( ',' ) )
            // InternalMyDsl.g:4610:1: ( ',' )
            {
            // InternalMyDsl.g:4610:1: ( ',' )
            // InternalMyDsl.g:4611:2: ','
            {
             before(grammarAccess.getMusicSettingAccess().getCommaKeyword_4()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:4620:1: rule__MusicSetting__Group__5 : rule__MusicSetting__Group__5__Impl rule__MusicSetting__Group__6 ;
    public final void rule__MusicSetting__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4624:1: ( rule__MusicSetting__Group__5__Impl rule__MusicSetting__Group__6 )
            // InternalMyDsl.g:4625:2: rule__MusicSetting__Group__5__Impl rule__MusicSetting__Group__6
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:4632:1: rule__MusicSetting__Group__5__Impl : ( ( rule__MusicSetting__PosAssignment_5 ) ) ;
    public final void rule__MusicSetting__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4636:1: ( ( ( rule__MusicSetting__PosAssignment_5 ) ) )
            // InternalMyDsl.g:4637:1: ( ( rule__MusicSetting__PosAssignment_5 ) )
            {
            // InternalMyDsl.g:4637:1: ( ( rule__MusicSetting__PosAssignment_5 ) )
            // InternalMyDsl.g:4638:2: ( rule__MusicSetting__PosAssignment_5 )
            {
             before(grammarAccess.getMusicSettingAccess().getPosAssignment_5()); 
            // InternalMyDsl.g:4639:2: ( rule__MusicSetting__PosAssignment_5 )
            // InternalMyDsl.g:4639:3: rule__MusicSetting__PosAssignment_5
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
    // InternalMyDsl.g:4647:1: rule__MusicSetting__Group__6 : rule__MusicSetting__Group__6__Impl ;
    public final void rule__MusicSetting__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4651:1: ( rule__MusicSetting__Group__6__Impl )
            // InternalMyDsl.g:4652:2: rule__MusicSetting__Group__6__Impl
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
    // InternalMyDsl.g:4658:1: rule__MusicSetting__Group__6__Impl : ( ')' ) ;
    public final void rule__MusicSetting__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4662:1: ( ( ')' ) )
            // InternalMyDsl.g:4663:1: ( ')' )
            {
            // InternalMyDsl.g:4663:1: ( ')' )
            // InternalMyDsl.g:4664:2: ')'
            {
             before(grammarAccess.getMusicSettingAccess().getRightParenthesisKeyword_6()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:4674:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4678:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:4679:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:4686:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4690:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:4691:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:4691:1: ( ( '-' )? )
            // InternalMyDsl.g:4692:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:4693:2: ( '-' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==18) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:4693:3: '-'
                    {
                    match(input,18,FOLLOW_2); 

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
    // InternalMyDsl.g:4701:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4705:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:4706:2: rule__EInt__Group__1__Impl
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
    // InternalMyDsl.g:4712:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4716:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4717:1: ( RULE_INT )
            {
            // InternalMyDsl.g:4717:1: ( RULE_INT )
            // InternalMyDsl.g:4718:2: RULE_INT
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
    // InternalMyDsl.g:4728:1: rule__RobotModel__EventsAssignment_1_0 : ( ruleEvent ) ;
    public final void rule__RobotModel__EventsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4732:1: ( ( ruleEvent ) )
            // InternalMyDsl.g:4733:2: ( ruleEvent )
            {
            // InternalMyDsl.g:4733:2: ( ruleEvent )
            // InternalMyDsl.g:4734:3: ruleEvent
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
    // InternalMyDsl.g:4743:1: rule__RobotModel__ActionsAssignment_1_1_2 : ( ruleAction ) ;
    public final void rule__RobotModel__ActionsAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4747:1: ( ( ruleAction ) )
            // InternalMyDsl.g:4748:2: ( ruleAction )
            {
            // InternalMyDsl.g:4748:2: ( ruleAction )
            // InternalMyDsl.g:4749:3: ruleAction
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
    // InternalMyDsl.g:4758:1: rule__RobotModel__ActionsAssignment_1_1_3_1 : ( ruleAction ) ;
    public final void rule__RobotModel__ActionsAssignment_1_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4762:1: ( ( ruleAction ) )
            // InternalMyDsl.g:4763:2: ( ruleAction )
            {
            // InternalMyDsl.g:4763:2: ( ruleAction )
            // InternalMyDsl.g:4764:3: ruleAction
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
    // InternalMyDsl.g:4773:1: rule__RobotModel__ConditionsAssignment_1_2_2 : ( ruleCondition ) ;
    public final void rule__RobotModel__ConditionsAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4777:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:4778:2: ( ruleCondition )
            {
            // InternalMyDsl.g:4778:2: ( ruleCondition )
            // InternalMyDsl.g:4779:3: ruleCondition
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
    // InternalMyDsl.g:4788:1: rule__RobotModel__ConditionsAssignment_1_2_3_1 : ( ruleCondition ) ;
    public final void rule__RobotModel__ConditionsAssignment_1_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4792:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:4793:2: ( ruleCondition )
            {
            // InternalMyDsl.g:4793:2: ( ruleCondition )
            // InternalMyDsl.g:4794:3: ruleCondition
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
    // InternalMyDsl.g:4803:1: rule__RobotModel__ExpressionsAssignment_1_3 : ( ruleExpression ) ;
    public final void rule__RobotModel__ExpressionsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4807:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:4808:2: ( ruleExpression )
            {
            // InternalMyDsl.g:4808:2: ( ruleExpression )
            // InternalMyDsl.g:4809:3: ruleExpression
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


    // $ANTLR start "rule__Or__OperationAssignment_1_1"
    // InternalMyDsl.g:4818:1: rule__Or__OperationAssignment_1_1 : ( ( '||' ) ) ;
    public final void rule__Or__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4822:1: ( ( ( '||' ) ) )
            // InternalMyDsl.g:4823:2: ( ( '||' ) )
            {
            // InternalMyDsl.g:4823:2: ( ( '||' ) )
            // InternalMyDsl.g:4824:3: ( '||' )
            {
             before(grammarAccess.getOrAccess().getOperationVerticalLineVerticalLineKeyword_1_1_0()); 
            // InternalMyDsl.g:4825:3: ( '||' )
            // InternalMyDsl.g:4826:4: '||'
            {
             before(grammarAccess.getOrAccess().getOperationVerticalLineVerticalLineKeyword_1_1_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getOrAccess().getOperationVerticalLineVerticalLineKeyword_1_1_0()); 

            }

             after(grammarAccess.getOrAccess().getOperationVerticalLineVerticalLineKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__OperationAssignment_1_1"


    // $ANTLR start "rule__Or__RightAssignment_1_2"
    // InternalMyDsl.g:4837:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4841:1: ( ( ruleAnd ) )
            // InternalMyDsl.g:4842:2: ( ruleAnd )
            {
            // InternalMyDsl.g:4842:2: ( ruleAnd )
            // InternalMyDsl.g:4843:3: ruleAnd
            {
             before(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAnd();

            state._fsp--;

             after(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or__RightAssignment_1_2"


    // $ANTLR start "rule__And__OperationAssignment_1_1"
    // InternalMyDsl.g:4852:1: rule__And__OperationAssignment_1_1 : ( ( '&&' ) ) ;
    public final void rule__And__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4856:1: ( ( ( '&&' ) ) )
            // InternalMyDsl.g:4857:2: ( ( '&&' ) )
            {
            // InternalMyDsl.g:4857:2: ( ( '&&' ) )
            // InternalMyDsl.g:4858:3: ( '&&' )
            {
             before(grammarAccess.getAndAccess().getOperationAmpersandAmpersandKeyword_1_1_0()); 
            // InternalMyDsl.g:4859:3: ( '&&' )
            // InternalMyDsl.g:4860:4: '&&'
            {
             before(grammarAccess.getAndAccess().getOperationAmpersandAmpersandKeyword_1_1_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getAndAccess().getOperationAmpersandAmpersandKeyword_1_1_0()); 

            }

             after(grammarAccess.getAndAccess().getOperationAmpersandAmpersandKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__OperationAssignment_1_1"


    // $ANTLR start "rule__And__RightAssignment_1_2"
    // InternalMyDsl.g:4871:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4875:1: ( ( ruleEquality ) )
            // InternalMyDsl.g:4876:2: ( ruleEquality )
            {
            // InternalMyDsl.g:4876:2: ( ruleEquality )
            // InternalMyDsl.g:4877:3: ruleEquality
            {
             before(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEquality();

            state._fsp--;

             after(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And__RightAssignment_1_2"


    // $ANTLR start "rule__Equality__OperationAssignment_1_1"
    // InternalMyDsl.g:4886:1: rule__Equality__OperationAssignment_1_1 : ( ( rule__Equality__OperationAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4890:1: ( ( ( rule__Equality__OperationAlternatives_1_1_0 ) ) )
            // InternalMyDsl.g:4891:2: ( ( rule__Equality__OperationAlternatives_1_1_0 ) )
            {
            // InternalMyDsl.g:4891:2: ( ( rule__Equality__OperationAlternatives_1_1_0 ) )
            // InternalMyDsl.g:4892:3: ( rule__Equality__OperationAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOperationAlternatives_1_1_0()); 
            // InternalMyDsl.g:4893:3: ( rule__Equality__OperationAlternatives_1_1_0 )
            // InternalMyDsl.g:4893:4: rule__Equality__OperationAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Equality__OperationAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEqualityAccess().getOperationAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__OperationAssignment_1_1"


    // $ANTLR start "rule__Equality__RightAssignment_1_2"
    // InternalMyDsl.g:4901:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4905:1: ( ( ruleComparison ) )
            // InternalMyDsl.g:4906:2: ( ruleComparison )
            {
            // InternalMyDsl.g:4906:2: ( ruleComparison )
            // InternalMyDsl.g:4907:3: ruleComparison
            {
             before(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equality__RightAssignment_1_2"


    // $ANTLR start "rule__Comparison__OperationAssignment_1_1"
    // InternalMyDsl.g:4916:1: rule__Comparison__OperationAssignment_1_1 : ( ( rule__Comparison__OperationAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4920:1: ( ( ( rule__Comparison__OperationAlternatives_1_1_0 ) ) )
            // InternalMyDsl.g:4921:2: ( ( rule__Comparison__OperationAlternatives_1_1_0 ) )
            {
            // InternalMyDsl.g:4921:2: ( ( rule__Comparison__OperationAlternatives_1_1_0 ) )
            // InternalMyDsl.g:4922:3: ( rule__Comparison__OperationAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOperationAlternatives_1_1_0()); 
            // InternalMyDsl.g:4923:3: ( rule__Comparison__OperationAlternatives_1_1_0 )
            // InternalMyDsl.g:4923:4: rule__Comparison__OperationAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__OperationAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getOperationAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__OperationAssignment_1_1"


    // $ANTLR start "rule__Comparison__RightAssignment_1_2"
    // InternalMyDsl.g:4931:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4935:1: ( ( rulePlusOrMinus ) )
            // InternalMyDsl.g:4936:2: ( rulePlusOrMinus )
            {
            // InternalMyDsl.g:4936:2: ( rulePlusOrMinus )
            // InternalMyDsl.g:4937:3: rulePlusOrMinus
            {
             before(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__RightAssignment_1_2"


    // $ANTLR start "rule__If__OperationAssignment_1"
    // InternalMyDsl.g:4946:1: rule__If__OperationAssignment_1 : ( ( 'if' ) ) ;
    public final void rule__If__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4950:1: ( ( ( 'if' ) ) )
            // InternalMyDsl.g:4951:2: ( ( 'if' ) )
            {
            // InternalMyDsl.g:4951:2: ( ( 'if' ) )
            // InternalMyDsl.g:4952:3: ( 'if' )
            {
             before(grammarAccess.getIfAccess().getOperationIfKeyword_1_0()); 
            // InternalMyDsl.g:4953:3: ( 'if' )
            // InternalMyDsl.g:4954:4: 'if'
            {
             before(grammarAccess.getIfAccess().getOperationIfKeyword_1_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getIfAccess().getOperationIfKeyword_1_0()); 

            }

             after(grammarAccess.getIfAccess().getOperationIfKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__OperationAssignment_1"


    // $ANTLR start "rule__If__LeftAssignment_2"
    // InternalMyDsl.g:4965:1: rule__If__LeftAssignment_2 : ( ruleExpression ) ;
    public final void rule__If__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4969:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:4970:2: ( ruleExpression )
            {
            // InternalMyDsl.g:4970:2: ( ruleExpression )
            // InternalMyDsl.g:4971:3: ruleExpression
            {
             before(grammarAccess.getIfAccess().getLeftExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfAccess().getLeftExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__LeftAssignment_2"


    // $ANTLR start "rule__If__RightAssignment_3"
    // InternalMyDsl.g:4980:1: rule__If__RightAssignment_3 : ( ruleThen ) ;
    public final void rule__If__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4984:1: ( ( ruleThen ) )
            // InternalMyDsl.g:4985:2: ( ruleThen )
            {
            // InternalMyDsl.g:4985:2: ( ruleThen )
            // InternalMyDsl.g:4986:3: ruleThen
            {
             before(grammarAccess.getIfAccess().getRightThenParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleThen();

            state._fsp--;

             after(grammarAccess.getIfAccess().getRightThenParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__If__RightAssignment_3"


    // $ANTLR start "rule__Then__OperationAssignment_1"
    // InternalMyDsl.g:4995:1: rule__Then__OperationAssignment_1 : ( ( 'then' ) ) ;
    public final void rule__Then__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4999:1: ( ( ( 'then' ) ) )
            // InternalMyDsl.g:5000:2: ( ( 'then' ) )
            {
            // InternalMyDsl.g:5000:2: ( ( 'then' ) )
            // InternalMyDsl.g:5001:3: ( 'then' )
            {
             before(grammarAccess.getThenAccess().getOperationThenKeyword_1_0()); 
            // InternalMyDsl.g:5002:3: ( 'then' )
            // InternalMyDsl.g:5003:4: 'then'
            {
             before(grammarAccess.getThenAccess().getOperationThenKeyword_1_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getThenAccess().getOperationThenKeyword_1_0()); 

            }

             after(grammarAccess.getThenAccess().getOperationThenKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__OperationAssignment_1"


    // $ANTLR start "rule__Then__LeftAssignment_2"
    // InternalMyDsl.g:5014:1: rule__Then__LeftAssignment_2 : ( ruleExpression ) ;
    public final void rule__Then__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5018:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5019:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5019:2: ( ruleExpression )
            // InternalMyDsl.g:5020:3: ruleExpression
            {
             before(grammarAccess.getThenAccess().getLeftExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getThenAccess().getLeftExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__LeftAssignment_2"


    // $ANTLR start "rule__Then__RightAssignment_3"
    // InternalMyDsl.g:5029:1: rule__Then__RightAssignment_3 : ( ruleElse ) ;
    public final void rule__Then__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5033:1: ( ( ruleElse ) )
            // InternalMyDsl.g:5034:2: ( ruleElse )
            {
            // InternalMyDsl.g:5034:2: ( ruleElse )
            // InternalMyDsl.g:5035:3: ruleElse
            {
             before(grammarAccess.getThenAccess().getRightElseParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleElse();

            state._fsp--;

             after(grammarAccess.getThenAccess().getRightElseParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Then__RightAssignment_3"


    // $ANTLR start "rule__Else__OperationAssignment_1"
    // InternalMyDsl.g:5044:1: rule__Else__OperationAssignment_1 : ( ( 'else' ) ) ;
    public final void rule__Else__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5048:1: ( ( ( 'else' ) ) )
            // InternalMyDsl.g:5049:2: ( ( 'else' ) )
            {
            // InternalMyDsl.g:5049:2: ( ( 'else' ) )
            // InternalMyDsl.g:5050:3: ( 'else' )
            {
             before(grammarAccess.getElseAccess().getOperationElseKeyword_1_0()); 
            // InternalMyDsl.g:5051:3: ( 'else' )
            // InternalMyDsl.g:5052:4: 'else'
            {
             before(grammarAccess.getElseAccess().getOperationElseKeyword_1_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getElseAccess().getOperationElseKeyword_1_0()); 

            }

             after(grammarAccess.getElseAccess().getOperationElseKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__OperationAssignment_1"


    // $ANTLR start "rule__Else__LeftAssignment_2"
    // InternalMyDsl.g:5063:1: rule__Else__LeftAssignment_2 : ( ruleExpression ) ;
    public final void rule__Else__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5067:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5068:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5068:2: ( ruleExpression )
            // InternalMyDsl.g:5069:3: ruleExpression
            {
             before(grammarAccess.getElseAccess().getLeftExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getElseAccess().getLeftExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Else__LeftAssignment_2"


    // $ANTLR start "rule__PlusOrMinus__OperationAssignment_1_0_1"
    // InternalMyDsl.g:5078:1: rule__PlusOrMinus__OperationAssignment_1_0_1 : ( ( rule__PlusOrMinus__OperationAlternatives_1_0_1_0 ) ) ;
    public final void rule__PlusOrMinus__OperationAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5082:1: ( ( ( rule__PlusOrMinus__OperationAlternatives_1_0_1_0 ) ) )
            // InternalMyDsl.g:5083:2: ( ( rule__PlusOrMinus__OperationAlternatives_1_0_1_0 ) )
            {
            // InternalMyDsl.g:5083:2: ( ( rule__PlusOrMinus__OperationAlternatives_1_0_1_0 ) )
            // InternalMyDsl.g:5084:3: ( rule__PlusOrMinus__OperationAlternatives_1_0_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getOperationAlternatives_1_0_1_0()); 
            // InternalMyDsl.g:5085:3: ( rule__PlusOrMinus__OperationAlternatives_1_0_1_0 )
            // InternalMyDsl.g:5085:4: rule__PlusOrMinus__OperationAlternatives_1_0_1_0
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
    // InternalMyDsl.g:5093:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMultOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5097:1: ( ( ruleMultOrDiv ) )
            // InternalMyDsl.g:5098:2: ( ruleMultOrDiv )
            {
            // InternalMyDsl.g:5098:2: ( ruleMultOrDiv )
            // InternalMyDsl.g:5099:3: ruleMultOrDiv
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
    // InternalMyDsl.g:5108:1: rule__MultOrDiv__OperationAssignment_1_1 : ( ( rule__MultOrDiv__OperationAlternatives_1_1_0 ) ) ;
    public final void rule__MultOrDiv__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5112:1: ( ( ( rule__MultOrDiv__OperationAlternatives_1_1_0 ) ) )
            // InternalMyDsl.g:5113:2: ( ( rule__MultOrDiv__OperationAlternatives_1_1_0 ) )
            {
            // InternalMyDsl.g:5113:2: ( ( rule__MultOrDiv__OperationAlternatives_1_1_0 ) )
            // InternalMyDsl.g:5114:3: ( rule__MultOrDiv__OperationAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultOrDivAccess().getOperationAlternatives_1_1_0()); 
            // InternalMyDsl.g:5115:3: ( rule__MultOrDiv__OperationAlternatives_1_1_0 )
            // InternalMyDsl.g:5115:4: rule__MultOrDiv__OperationAlternatives_1_1_0
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
    // InternalMyDsl.g:5123:1: rule__MultOrDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MultOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5127:1: ( ( rulePrimary ) )
            // InternalMyDsl.g:5128:2: ( rulePrimary )
            {
            // InternalMyDsl.g:5128:2: ( rulePrimary )
            // InternalMyDsl.g:5129:3: rulePrimary
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


    // $ANTLR start "rule__Primary__OperationAssignment_1_1"
    // InternalMyDsl.g:5138:1: rule__Primary__OperationAssignment_1_1 : ( ( '!' ) ) ;
    public final void rule__Primary__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5142:1: ( ( ( '!' ) ) )
            // InternalMyDsl.g:5143:2: ( ( '!' ) )
            {
            // InternalMyDsl.g:5143:2: ( ( '!' ) )
            // InternalMyDsl.g:5144:3: ( '!' )
            {
             before(grammarAccess.getPrimaryAccess().getOperationExclamationMarkKeyword_1_1_0()); 
            // InternalMyDsl.g:5145:3: ( '!' )
            // InternalMyDsl.g:5146:4: '!'
            {
             before(grammarAccess.getPrimaryAccess().getOperationExclamationMarkKeyword_1_1_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getOperationExclamationMarkKeyword_1_1_0()); 

            }

             after(grammarAccess.getPrimaryAccess().getOperationExclamationMarkKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__OperationAssignment_1_1"


    // $ANTLR start "rule__Primary__LeftAssignment_1_2"
    // InternalMyDsl.g:5157:1: rule__Primary__LeftAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__LeftAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5161:1: ( ( rulePrimary ) )
            // InternalMyDsl.g:5162:2: ( rulePrimary )
            {
            // InternalMyDsl.g:5162:2: ( rulePrimary )
            // InternalMyDsl.g:5163:3: rulePrimary
            {
             before(grammarAccess.getPrimaryAccess().getLeftPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getLeftPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__LeftAssignment_1_2"


    // $ANTLR start "rule__Atomic__ValueAssignment_1_0"
    // InternalMyDsl.g:5172:1: rule__Atomic__ValueAssignment_1_0 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5176:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:5177:2: ( RULE_INT )
            {
            // InternalMyDsl.g:5177:2: ( RULE_INT )
            // InternalMyDsl.g:5178:3: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__ValueAssignment_1_0"


    // $ANTLR start "rule__Event__NameAssignment_2"
    // InternalMyDsl.g:5187:1: rule__Event__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Event__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5191:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5192:2: ( ruleEString )
            {
            // InternalMyDsl.g:5192:2: ( ruleEString )
            // InternalMyDsl.g:5193:3: ruleEString
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
    // InternalMyDsl.g:5202:1: rule__Event__ConditionAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Event__ConditionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5206:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:5207:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:5207:2: ( ( ruleEString ) )
            // InternalMyDsl.g:5208:3: ( ruleEString )
            {
             before(grammarAccess.getEventAccess().getConditionConditionCrossReference_3_1_0()); 
            // InternalMyDsl.g:5209:3: ( ruleEString )
            // InternalMyDsl.g:5210:4: ruleEString
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
    // InternalMyDsl.g:5221:1: rule__Event__ActionsAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Event__ActionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5225:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:5226:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:5226:2: ( ( ruleEString ) )
            // InternalMyDsl.g:5227:3: ( ruleEString )
            {
             before(grammarAccess.getEventAccess().getActionsActionCrossReference_4_1_0()); 
            // InternalMyDsl.g:5228:3: ( ruleEString )
            // InternalMyDsl.g:5229:4: ruleEString
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
    // InternalMyDsl.g:5240:1: rule__Event__ActionsAssignment_4_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Event__ActionsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5244:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:5245:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:5245:2: ( ( ruleEString ) )
            // InternalMyDsl.g:5246:3: ( ruleEString )
            {
             before(grammarAccess.getEventAccess().getActionsActionCrossReference_4_2_1_0()); 
            // InternalMyDsl.g:5247:3: ( ruleEString )
            // InternalMyDsl.g:5248:4: ruleEString
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
    // InternalMyDsl.g:5259:1: rule__Sound__ConditionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__Sound__ConditionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5263:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5264:2: ( ruleEString )
            {
            // InternalMyDsl.g:5264:2: ( ruleEString )
            // InternalMyDsl.g:5265:3: ruleEString
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
    // InternalMyDsl.g:5274:1: rule__Button__ConditionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__Button__ConditionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5278:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5279:2: ( ruleEString )
            {
            // InternalMyDsl.g:5279:2: ( ruleEString )
            // InternalMyDsl.g:5280:3: ruleEString
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
    // InternalMyDsl.g:5289:1: rule__Button__ButtonAssignment_4 : ( ruleButtonType ) ;
    public final void rule__Button__ButtonAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5293:1: ( ( ruleButtonType ) )
            // InternalMyDsl.g:5294:2: ( ruleButtonType )
            {
            // InternalMyDsl.g:5294:2: ( ruleButtonType )
            // InternalMyDsl.g:5295:3: ruleButtonType
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
    // InternalMyDsl.g:5304:1: rule__Sensor__ConditionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__Sensor__ConditionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5308:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5309:2: ( ruleEString )
            {
            // InternalMyDsl.g:5309:2: ( ruleEString )
            // InternalMyDsl.g:5310:3: ruleEString
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
    // InternalMyDsl.g:5319:1: rule__Sensor__SensorPosAssignment_4 : ( ruleEInt ) ;
    public final void rule__Sensor__SensorPosAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5323:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:5324:2: ( ruleEInt )
            {
            // InternalMyDsl.g:5324:2: ( ruleEInt )
            // InternalMyDsl.g:5325:3: ruleEInt
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
    // InternalMyDsl.g:5334:1: rule__Tap__ConditionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__Tap__ConditionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5338:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5339:2: ( ruleEString )
            {
            // InternalMyDsl.g:5339:2: ( ruleEString )
            // InternalMyDsl.g:5340:3: ruleEString
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
    // InternalMyDsl.g:5349:1: rule__MotorAction__ActionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__MotorAction__ActionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5353:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5354:2: ( ruleEString )
            {
            // InternalMyDsl.g:5354:2: ( ruleEString )
            // InternalMyDsl.g:5355:3: ruleEString
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
    // InternalMyDsl.g:5364:1: rule__MotorAction__MotorLeftAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__MotorAction__MotorLeftAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5368:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:5369:2: ( ruleEInt )
            {
            // InternalMyDsl.g:5369:2: ( ruleEInt )
            // InternalMyDsl.g:5370:3: ruleEInt
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
    // InternalMyDsl.g:5379:1: rule__MotorAction__MotorRightAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__MotorAction__MotorRightAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5383:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:5384:2: ( ruleEInt )
            {
            // InternalMyDsl.g:5384:2: ( ruleEInt )
            // InternalMyDsl.g:5385:3: ruleEInt
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
    // InternalMyDsl.g:5394:1: rule__SoundAction__ActionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__SoundAction__ActionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5398:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5399:2: ( ruleEString )
            {
            // InternalMyDsl.g:5399:2: ( ruleEString )
            // InternalMyDsl.g:5400:3: ruleEString
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
    // InternalMyDsl.g:5409:1: rule__SoundAction__MusicsettingsAssignment_3_1 : ( ruleMusicSetting ) ;
    public final void rule__SoundAction__MusicsettingsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5413:1: ( ( ruleMusicSetting ) )
            // InternalMyDsl.g:5414:2: ( ruleMusicSetting )
            {
            // InternalMyDsl.g:5414:2: ( ruleMusicSetting )
            // InternalMyDsl.g:5415:3: ruleMusicSetting
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
    // InternalMyDsl.g:5424:1: rule__SoundAction__MusicsettingsAssignment_3_2_1 : ( ruleMusicSetting ) ;
    public final void rule__SoundAction__MusicsettingsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5428:1: ( ( ruleMusicSetting ) )
            // InternalMyDsl.g:5429:2: ( ruleMusicSetting )
            {
            // InternalMyDsl.g:5429:2: ( ruleMusicSetting )
            // InternalMyDsl.g:5430:3: ruleMusicSetting
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
    // InternalMyDsl.g:5439:1: rule__LightAction__ActionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__LightAction__ActionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5443:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5444:2: ( ruleEString )
            {
            // InternalMyDsl.g:5444:2: ( ruleEString )
            // InternalMyDsl.g:5445:3: ruleEString
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
    // InternalMyDsl.g:5454:1: rule__LightAction__PosAssignment_4 : ( ruleLightPos ) ;
    public final void rule__LightAction__PosAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5458:1: ( ( ruleLightPos ) )
            // InternalMyDsl.g:5459:2: ( ruleLightPos )
            {
            // InternalMyDsl.g:5459:2: ( ruleLightPos )
            // InternalMyDsl.g:5460:3: ruleLightPos
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
    // InternalMyDsl.g:5469:1: rule__LightAction__RedAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__LightAction__RedAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5473:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:5474:2: ( ruleEInt )
            {
            // InternalMyDsl.g:5474:2: ( ruleEInt )
            // InternalMyDsl.g:5475:3: ruleEInt
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
    // InternalMyDsl.g:5484:1: rule__LightAction__GreenAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__LightAction__GreenAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5488:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:5489:2: ( ruleEInt )
            {
            // InternalMyDsl.g:5489:2: ( ruleEInt )
            // InternalMyDsl.g:5490:3: ruleEInt
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
    // InternalMyDsl.g:5499:1: rule__LightAction__BlueAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__LightAction__BlueAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5503:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:5504:2: ( ruleEInt )
            {
            // InternalMyDsl.g:5504:2: ( ruleEInt )
            // InternalMyDsl.g:5505:3: ruleEInt
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
    // InternalMyDsl.g:5514:1: rule__MusicSetting__NoteAssignment_1 : ( ruleEInt ) ;
    public final void rule__MusicSetting__NoteAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5518:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:5519:2: ( ruleEInt )
            {
            // InternalMyDsl.g:5519:2: ( ruleEInt )
            // InternalMyDsl.g:5520:3: ruleEInt
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
    // InternalMyDsl.g:5529:1: rule__MusicSetting__DurationAssignment_3 : ( ruleDuration ) ;
    public final void rule__MusicSetting__DurationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5533:1: ( ( ruleDuration ) )
            // InternalMyDsl.g:5534:2: ( ruleDuration )
            {
            // InternalMyDsl.g:5534:2: ( ruleDuration )
            // InternalMyDsl.g:5535:3: ruleDuration
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
    // InternalMyDsl.g:5544:1: rule__MusicSetting__PosAssignment_5 : ( ruleEInt ) ;
    public final void rule__MusicSetting__PosAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5548:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:5549:2: ( ruleEInt )
            {
            // InternalMyDsl.g:5549:2: ( ruleEInt )
            // InternalMyDsl.g:5550:3: ruleEInt
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x4800002E00600040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x4800002E00600042L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0014800000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000560000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x4000000800600040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000001F0000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000003800000L});

}