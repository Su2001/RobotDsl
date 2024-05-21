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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'TRUE'", "'FALSE'", "'NONE'", "'MEDIUM'", "'LONG'", "'TOP'", "'BOT'", "'FAR'", "'CLOSE'", "'BACKWARD'", "'LEFT'", "'RIGHT'", "'CENTER'", "'FORWARD'", "'Action:'", "'Condition:'", "'('", "')'", "'Event'", "'conditions:'", "'and'", "'actions:'", "','", "'Sound'", "'Button'", "'button'", "'Sensor'", "'sensorPos'", "'distance'", "'Tap'", "'MotorAction'", "'motorLeft'", "'motorRight'", "'SoundAction'", "'set:'", "'LightAction'", "'pos:'", "'red:'", "'green:'", "'blue:'", "'||'", "'&&'", "'if'", "'then'", "'else'", "'!'"
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


    // $ANTLR start "ruleDistance"
    // InternalMyDsl.g:735:1: ruleDistance : ( ( rule__Distance__Alternatives ) ) ;
    public final void ruleDistance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:739:1: ( ( ( rule__Distance__Alternatives ) ) )
            // InternalMyDsl.g:740:2: ( ( rule__Distance__Alternatives ) )
            {
            // InternalMyDsl.g:740:2: ( ( rule__Distance__Alternatives ) )
            // InternalMyDsl.g:741:3: ( rule__Distance__Alternatives )
            {
             before(grammarAccess.getDistanceAccess().getAlternatives()); 
            // InternalMyDsl.g:742:3: ( rule__Distance__Alternatives )
            // InternalMyDsl.g:742:4: rule__Distance__Alternatives
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
    // InternalMyDsl.g:751:1: ruleButtonType : ( ( rule__ButtonType__Alternatives ) ) ;
    public final void ruleButtonType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:755:1: ( ( ( rule__ButtonType__Alternatives ) ) )
            // InternalMyDsl.g:756:2: ( ( rule__ButtonType__Alternatives ) )
            {
            // InternalMyDsl.g:756:2: ( ( rule__ButtonType__Alternatives ) )
            // InternalMyDsl.g:757:3: ( rule__ButtonType__Alternatives )
            {
             before(grammarAccess.getButtonTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:758:3: ( rule__ButtonType__Alternatives )
            // InternalMyDsl.g:758:4: rule__ButtonType__Alternatives
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
    // InternalMyDsl.g:766:1: rule__RobotModel__Alternatives_1 : ( ( ( rule__RobotModel__EventsAssignment_1_0 ) ) | ( ( rule__RobotModel__Group_1_1__0 ) ) | ( ( rule__RobotModel__Group_1_2__0 ) ) | ( ( rule__RobotModel__ExpressionsAssignment_1_3 ) ) );
    public final void rule__RobotModel__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:770:1: ( ( ( rule__RobotModel__EventsAssignment_1_0 ) ) | ( ( rule__RobotModel__Group_1_1__0 ) ) | ( ( rule__RobotModel__Group_1_2__0 ) ) | ( ( rule__RobotModel__ExpressionsAssignment_1_3 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt1=1;
                }
                break;
            case 35:
                {
                alt1=2;
                }
                break;
            case 36:
                {
                alt1=3;
                }
                break;
            case RULE_INT:
            case 18:
            case 21:
            case 22:
            case 37:
            case 63:
            case 66:
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
                    // InternalMyDsl.g:771:2: ( ( rule__RobotModel__EventsAssignment_1_0 ) )
                    {
                    // InternalMyDsl.g:771:2: ( ( rule__RobotModel__EventsAssignment_1_0 ) )
                    // InternalMyDsl.g:772:3: ( rule__RobotModel__EventsAssignment_1_0 )
                    {
                     before(grammarAccess.getRobotModelAccess().getEventsAssignment_1_0()); 
                    // InternalMyDsl.g:773:3: ( rule__RobotModel__EventsAssignment_1_0 )
                    // InternalMyDsl.g:773:4: rule__RobotModel__EventsAssignment_1_0
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
                    // InternalMyDsl.g:777:2: ( ( rule__RobotModel__Group_1_1__0 ) )
                    {
                    // InternalMyDsl.g:777:2: ( ( rule__RobotModel__Group_1_1__0 ) )
                    // InternalMyDsl.g:778:3: ( rule__RobotModel__Group_1_1__0 )
                    {
                     before(grammarAccess.getRobotModelAccess().getGroup_1_1()); 
                    // InternalMyDsl.g:779:3: ( rule__RobotModel__Group_1_1__0 )
                    // InternalMyDsl.g:779:4: rule__RobotModel__Group_1_1__0
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
                    // InternalMyDsl.g:783:2: ( ( rule__RobotModel__Group_1_2__0 ) )
                    {
                    // InternalMyDsl.g:783:2: ( ( rule__RobotModel__Group_1_2__0 ) )
                    // InternalMyDsl.g:784:3: ( rule__RobotModel__Group_1_2__0 )
                    {
                     before(grammarAccess.getRobotModelAccess().getGroup_1_2()); 
                    // InternalMyDsl.g:785:3: ( rule__RobotModel__Group_1_2__0 )
                    // InternalMyDsl.g:785:4: rule__RobotModel__Group_1_2__0
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
                    // InternalMyDsl.g:789:2: ( ( rule__RobotModel__ExpressionsAssignment_1_3 ) )
                    {
                    // InternalMyDsl.g:789:2: ( ( rule__RobotModel__ExpressionsAssignment_1_3 ) )
                    // InternalMyDsl.g:790:3: ( rule__RobotModel__ExpressionsAssignment_1_3 )
                    {
                     before(grammarAccess.getRobotModelAccess().getExpressionsAssignment_1_3()); 
                    // InternalMyDsl.g:791:3: ( rule__RobotModel__ExpressionsAssignment_1_3 )
                    // InternalMyDsl.g:791:4: rule__RobotModel__ExpressionsAssignment_1_3
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
    // InternalMyDsl.g:799:1: rule__Expression__Alternatives : ( ( ruleOr ) | ( ruleIf ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:803:1: ( ( ruleOr ) | ( ruleIf ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT||LA2_0==18||(LA2_0>=21 && LA2_0<=22)||LA2_0==37||LA2_0==66) ) {
                alt2=1;
            }
            else if ( (LA2_0==63) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:804:2: ( ruleOr )
                    {
                    // InternalMyDsl.g:804:2: ( ruleOr )
                    // InternalMyDsl.g:805:3: ruleOr
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
                    // InternalMyDsl.g:810:2: ( ruleIf )
                    {
                    // InternalMyDsl.g:810:2: ( ruleIf )
                    // InternalMyDsl.g:811:3: ruleIf
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
    // InternalMyDsl.g:820:1: rule__Equality__OperationAlternatives_1_1_0 : ( ( '==' ) | ( '!=' ) );
    public final void rule__Equality__OperationAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:824:1: ( ( '==' ) | ( '!=' ) )
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
                    // InternalMyDsl.g:825:2: ( '==' )
                    {
                    // InternalMyDsl.g:825:2: ( '==' )
                    // InternalMyDsl.g:826:3: '=='
                    {
                     before(grammarAccess.getEqualityAccess().getOperationEqualsSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEqualityAccess().getOperationEqualsSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:831:2: ( '!=' )
                    {
                    // InternalMyDsl.g:831:2: ( '!=' )
                    // InternalMyDsl.g:832:3: '!='
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
    // InternalMyDsl.g:841:1: rule__Comparison__OperationAlternatives_1_1_0 : ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) );
    public final void rule__Comparison__OperationAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:845:1: ( ( '>=' ) | ( '<=' ) | ( '>' ) | ( '<' ) )
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
                    // InternalMyDsl.g:846:2: ( '>=' )
                    {
                    // InternalMyDsl.g:846:2: ( '>=' )
                    // InternalMyDsl.g:847:3: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getOperationGreaterThanSignEqualsSignKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOperationGreaterThanSignEqualsSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:852:2: ( '<=' )
                    {
                    // InternalMyDsl.g:852:2: ( '<=' )
                    // InternalMyDsl.g:853:3: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getOperationLessThanSignEqualsSignKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOperationLessThanSignEqualsSignKeyword_1_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:858:2: ( '>' )
                    {
                    // InternalMyDsl.g:858:2: ( '>' )
                    // InternalMyDsl.g:859:3: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getOperationGreaterThanSignKeyword_1_1_0_2()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getOperationGreaterThanSignKeyword_1_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:864:2: ( '<' )
                    {
                    // InternalMyDsl.g:864:2: ( '<' )
                    // InternalMyDsl.g:865:3: '<'
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
    // InternalMyDsl.g:874:1: rule__PlusOrMinus__OperationAlternatives_1_0_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__PlusOrMinus__OperationAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:878:1: ( ( '+' ) | ( '-' ) )
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
                    // InternalMyDsl.g:879:2: ( '+' )
                    {
                    // InternalMyDsl.g:879:2: ( '+' )
                    // InternalMyDsl.g:880:3: '+'
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getOperationPlusSignKeyword_1_0_1_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPlusOrMinusAccess().getOperationPlusSignKeyword_1_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:885:2: ( '-' )
                    {
                    // InternalMyDsl.g:885:2: ( '-' )
                    // InternalMyDsl.g:886:3: '-'
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
    // InternalMyDsl.g:895:1: rule__MultOrDiv__OperationAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MultOrDiv__OperationAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:899:1: ( ( '*' ) | ( '/' ) )
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
                    // InternalMyDsl.g:900:2: ( '*' )
                    {
                    // InternalMyDsl.g:900:2: ( '*' )
                    // InternalMyDsl.g:901:3: '*'
                    {
                     before(grammarAccess.getMultOrDivAccess().getOperationAsteriskKeyword_1_1_0_0()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getMultOrDivAccess().getOperationAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:906:2: ( '/' )
                    {
                    // InternalMyDsl.g:906:2: ( '/' )
                    // InternalMyDsl.g:907:3: '/'
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
    // InternalMyDsl.g:916:1: rule__Primary__Alternatives : ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( ( ( rule__Primary__Group_0__0 ) ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAtomic ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt7=1;
                }
                break;
            case 66:
                {
                alt7=2;
                }
                break;
            case RULE_INT:
            case 18:
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
                    // InternalMyDsl.g:921:2: ( ( rule__Primary__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:921:2: ( ( rule__Primary__Group_0__0 ) )
                    // InternalMyDsl.g:922:3: ( rule__Primary__Group_0__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_0()); 
                    // InternalMyDsl.g:923:3: ( rule__Primary__Group_0__0 )
                    // InternalMyDsl.g:923:4: rule__Primary__Group_0__0
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
                    // InternalMyDsl.g:927:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:927:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalMyDsl.g:928:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalMyDsl.g:929:3: ( rule__Primary__Group_1__0 )
                    // InternalMyDsl.g:929:4: rule__Primary__Group_1__0
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
                    // InternalMyDsl.g:933:2: ( ruleAtomic )
                    {
                    // InternalMyDsl.g:933:2: ( ruleAtomic )
                    // InternalMyDsl.g:934:3: ruleAtomic
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
    // InternalMyDsl.g:943:1: rule__Atomic__Alternatives_1 : ( ( ( rule__Atomic__ValueAssignment_1_0 ) ) | ( ( rule__Atomic__BoolAssignment_1_1 ) ) );
    public final void rule__Atomic__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:947:1: ( ( ( rule__Atomic__ValueAssignment_1_0 ) ) | ( ( rule__Atomic__BoolAssignment_1_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_INT||LA8_0==18) ) {
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
                    // InternalMyDsl.g:948:2: ( ( rule__Atomic__ValueAssignment_1_0 ) )
                    {
                    // InternalMyDsl.g:948:2: ( ( rule__Atomic__ValueAssignment_1_0 ) )
                    // InternalMyDsl.g:949:3: ( rule__Atomic__ValueAssignment_1_0 )
                    {
                     before(grammarAccess.getAtomicAccess().getValueAssignment_1_0()); 
                    // InternalMyDsl.g:950:3: ( rule__Atomic__ValueAssignment_1_0 )
                    // InternalMyDsl.g:950:4: rule__Atomic__ValueAssignment_1_0
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
                    // InternalMyDsl.g:954:2: ( ( rule__Atomic__BoolAssignment_1_1 ) )
                    {
                    // InternalMyDsl.g:954:2: ( ( rule__Atomic__BoolAssignment_1_1 ) )
                    // InternalMyDsl.g:955:3: ( rule__Atomic__BoolAssignment_1_1 )
                    {
                     before(grammarAccess.getAtomicAccess().getBoolAssignment_1_1()); 
                    // InternalMyDsl.g:956:3: ( rule__Atomic__BoolAssignment_1_1 )
                    // InternalMyDsl.g:956:4: rule__Atomic__BoolAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__BoolAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getBoolAssignment_1_1()); 

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


    // $ANTLR start "rule__Atomic__BoolAlternatives_1_1_0"
    // InternalMyDsl.g:964:1: rule__Atomic__BoolAlternatives_1_1_0 : ( ( 'TRUE' ) | ( 'FALSE' ) );
    public final void rule__Atomic__BoolAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:968:1: ( ( 'TRUE' ) | ( 'FALSE' ) )
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
                    // InternalMyDsl.g:969:2: ( 'TRUE' )
                    {
                    // InternalMyDsl.g:969:2: ( 'TRUE' )
                    // InternalMyDsl.g:970:3: 'TRUE'
                    {
                     before(grammarAccess.getAtomicAccess().getBoolTRUEKeyword_1_1_0_0()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getBoolTRUEKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:975:2: ( 'FALSE' )
                    {
                    // InternalMyDsl.g:975:2: ( 'FALSE' )
                    // InternalMyDsl.g:976:3: 'FALSE'
                    {
                     before(grammarAccess.getAtomicAccess().getBoolFALSEKeyword_1_1_0_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getAtomicAccess().getBoolFALSEKeyword_1_1_0_1()); 

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
    // $ANTLR end "rule__Atomic__BoolAlternatives_1_1_0"


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalMyDsl.g:985:1: rule__Condition__Alternatives : ( ( ruleButton ) | ( ruleSensor ) | ( ruleSound ) | ( ruleTap ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:989:1: ( ( ruleButton ) | ( ruleSensor ) | ( ruleSound ) | ( ruleTap ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt10=1;
                }
                break;
            case 47:
                {
                alt10=2;
                }
                break;
            case 44:
                {
                alt10=3;
                }
                break;
            case 50:
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
                    // InternalMyDsl.g:990:2: ( ruleButton )
                    {
                    // InternalMyDsl.g:990:2: ( ruleButton )
                    // InternalMyDsl.g:991:3: ruleButton
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
                    // InternalMyDsl.g:996:2: ( ruleSensor )
                    {
                    // InternalMyDsl.g:996:2: ( ruleSensor )
                    // InternalMyDsl.g:997:3: ruleSensor
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
                    // InternalMyDsl.g:1002:2: ( ruleSound )
                    {
                    // InternalMyDsl.g:1002:2: ( ruleSound )
                    // InternalMyDsl.g:1003:3: ruleSound
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
                    // InternalMyDsl.g:1008:2: ( ruleTap )
                    {
                    // InternalMyDsl.g:1008:2: ( ruleTap )
                    // InternalMyDsl.g:1009:3: ruleTap
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
    // InternalMyDsl.g:1018:1: rule__Action__Alternatives : ( ( ruleMotorAction ) | ( ruleSoundAction ) | ( ruleLightAction ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1022:1: ( ( ruleMotorAction ) | ( ruleSoundAction ) | ( ruleLightAction ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt11=1;
                }
                break;
            case 54:
                {
                alt11=2;
                }
                break;
            case 56:
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
                    // InternalMyDsl.g:1023:2: ( ruleMotorAction )
                    {
                    // InternalMyDsl.g:1023:2: ( ruleMotorAction )
                    // InternalMyDsl.g:1024:3: ruleMotorAction
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
                    // InternalMyDsl.g:1029:2: ( ruleSoundAction )
                    {
                    // InternalMyDsl.g:1029:2: ( ruleSoundAction )
                    // InternalMyDsl.g:1030:3: ruleSoundAction
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
                    // InternalMyDsl.g:1035:2: ( ruleLightAction )
                    {
                    // InternalMyDsl.g:1035:2: ( ruleLightAction )
                    // InternalMyDsl.g:1036:3: ruleLightAction
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
    // InternalMyDsl.g:1045:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1049:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalMyDsl.g:1050:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:1050:2: ( RULE_STRING )
                    // InternalMyDsl.g:1051:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1056:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:1056:2: ( RULE_ID )
                    // InternalMyDsl.g:1057:3: RULE_ID
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
    // InternalMyDsl.g:1066:1: rule__Duration__Alternatives : ( ( ( 'NONE' ) ) | ( ( 'MEDIUM' ) ) | ( ( 'LONG' ) ) );
    public final void rule__Duration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1070:1: ( ( ( 'NONE' ) ) | ( ( 'MEDIUM' ) ) | ( ( 'LONG' ) ) )
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
                    // InternalMyDsl.g:1071:2: ( ( 'NONE' ) )
                    {
                    // InternalMyDsl.g:1071:2: ( ( 'NONE' ) )
                    // InternalMyDsl.g:1072:3: ( 'NONE' )
                    {
                     before(grammarAccess.getDurationAccess().getNONEEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1073:3: ( 'NONE' )
                    // InternalMyDsl.g:1073:4: 'NONE'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDurationAccess().getNONEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1077:2: ( ( 'MEDIUM' ) )
                    {
                    // InternalMyDsl.g:1077:2: ( ( 'MEDIUM' ) )
                    // InternalMyDsl.g:1078:3: ( 'MEDIUM' )
                    {
                     before(grammarAccess.getDurationAccess().getMEDIUMEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1079:3: ( 'MEDIUM' )
                    // InternalMyDsl.g:1079:4: 'MEDIUM'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDurationAccess().getMEDIUMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1083:2: ( ( 'LONG' ) )
                    {
                    // InternalMyDsl.g:1083:2: ( ( 'LONG' ) )
                    // InternalMyDsl.g:1084:3: ( 'LONG' )
                    {
                     before(grammarAccess.getDurationAccess().getLONGEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1085:3: ( 'LONG' )
                    // InternalMyDsl.g:1085:4: 'LONG'
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
    // InternalMyDsl.g:1093:1: rule__LightPos__Alternatives : ( ( ( 'TOP' ) ) | ( ( 'BOT' ) ) );
    public final void rule__LightPos__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1097:1: ( ( ( 'TOP' ) ) | ( ( 'BOT' ) ) )
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
                    // InternalMyDsl.g:1098:2: ( ( 'TOP' ) )
                    {
                    // InternalMyDsl.g:1098:2: ( ( 'TOP' ) )
                    // InternalMyDsl.g:1099:3: ( 'TOP' )
                    {
                     before(grammarAccess.getLightPosAccess().getTOPEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1100:3: ( 'TOP' )
                    // InternalMyDsl.g:1100:4: 'TOP'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getLightPosAccess().getTOPEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1104:2: ( ( 'BOT' ) )
                    {
                    // InternalMyDsl.g:1104:2: ( ( 'BOT' ) )
                    // InternalMyDsl.g:1105:3: ( 'BOT' )
                    {
                     before(grammarAccess.getLightPosAccess().getBOTEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1106:3: ( 'BOT' )
                    // InternalMyDsl.g:1106:4: 'BOT'
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


    // $ANTLR start "rule__Distance__Alternatives"
    // InternalMyDsl.g:1114:1: rule__Distance__Alternatives : ( ( ( 'FAR' ) ) | ( ( 'CLOSE' ) ) );
    public final void rule__Distance__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1118:1: ( ( ( 'FAR' ) ) | ( ( 'CLOSE' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            else if ( (LA15_0==29) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1119:2: ( ( 'FAR' ) )
                    {
                    // InternalMyDsl.g:1119:2: ( ( 'FAR' ) )
                    // InternalMyDsl.g:1120:3: ( 'FAR' )
                    {
                     before(grammarAccess.getDistanceAccess().getFAREnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1121:3: ( 'FAR' )
                    // InternalMyDsl.g:1121:4: 'FAR'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getDistanceAccess().getFAREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1125:2: ( ( 'CLOSE' ) )
                    {
                    // InternalMyDsl.g:1125:2: ( ( 'CLOSE' ) )
                    // InternalMyDsl.g:1126:3: ( 'CLOSE' )
                    {
                     before(grammarAccess.getDistanceAccess().getCLOSEEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1127:3: ( 'CLOSE' )
                    // InternalMyDsl.g:1127:4: 'CLOSE'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalMyDsl.g:1135:1: rule__ButtonType__Alternatives : ( ( ( 'BACKWARD' ) ) | ( ( 'LEFT' ) ) | ( ( 'RIGHT' ) ) | ( ( 'CENTER' ) ) | ( ( 'FORWARD' ) ) );
    public final void rule__ButtonType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1139:1: ( ( ( 'BACKWARD' ) ) | ( ( 'LEFT' ) ) | ( ( 'RIGHT' ) ) | ( ( 'CENTER' ) ) | ( ( 'FORWARD' ) ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt16=1;
                }
                break;
            case 31:
                {
                alt16=2;
                }
                break;
            case 32:
                {
                alt16=3;
                }
                break;
            case 33:
                {
                alt16=4;
                }
                break;
            case 34:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1140:2: ( ( 'BACKWARD' ) )
                    {
                    // InternalMyDsl.g:1140:2: ( ( 'BACKWARD' ) )
                    // InternalMyDsl.g:1141:3: ( 'BACKWARD' )
                    {
                     before(grammarAccess.getButtonTypeAccess().getBACKWARDEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1142:3: ( 'BACKWARD' )
                    // InternalMyDsl.g:1142:4: 'BACKWARD'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getButtonTypeAccess().getBACKWARDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1146:2: ( ( 'LEFT' ) )
                    {
                    // InternalMyDsl.g:1146:2: ( ( 'LEFT' ) )
                    // InternalMyDsl.g:1147:3: ( 'LEFT' )
                    {
                     before(grammarAccess.getButtonTypeAccess().getLEFTEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1148:3: ( 'LEFT' )
                    // InternalMyDsl.g:1148:4: 'LEFT'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getButtonTypeAccess().getLEFTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1152:2: ( ( 'RIGHT' ) )
                    {
                    // InternalMyDsl.g:1152:2: ( ( 'RIGHT' ) )
                    // InternalMyDsl.g:1153:3: ( 'RIGHT' )
                    {
                     before(grammarAccess.getButtonTypeAccess().getRIGHTEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1154:3: ( 'RIGHT' )
                    // InternalMyDsl.g:1154:4: 'RIGHT'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getButtonTypeAccess().getRIGHTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1158:2: ( ( 'CENTER' ) )
                    {
                    // InternalMyDsl.g:1158:2: ( ( 'CENTER' ) )
                    // InternalMyDsl.g:1159:3: ( 'CENTER' )
                    {
                     before(grammarAccess.getButtonTypeAccess().getCENTEREnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:1160:3: ( 'CENTER' )
                    // InternalMyDsl.g:1160:4: 'CENTER'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getButtonTypeAccess().getCENTEREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1164:2: ( ( 'FORWARD' ) )
                    {
                    // InternalMyDsl.g:1164:2: ( ( 'FORWARD' ) )
                    // InternalMyDsl.g:1165:3: ( 'FORWARD' )
                    {
                     before(grammarAccess.getButtonTypeAccess().getFORWARDEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:1166:3: ( 'FORWARD' )
                    // InternalMyDsl.g:1166:4: 'FORWARD'
                    {
                    match(input,34,FOLLOW_2); 

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
    // InternalMyDsl.g:1174:1: rule__RobotModel__Group__0 : rule__RobotModel__Group__0__Impl rule__RobotModel__Group__1 ;
    public final void rule__RobotModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1178:1: ( rule__RobotModel__Group__0__Impl rule__RobotModel__Group__1 )
            // InternalMyDsl.g:1179:2: rule__RobotModel__Group__0__Impl rule__RobotModel__Group__1
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
    // InternalMyDsl.g:1186:1: rule__RobotModel__Group__0__Impl : ( () ) ;
    public final void rule__RobotModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1190:1: ( ( () ) )
            // InternalMyDsl.g:1191:1: ( () )
            {
            // InternalMyDsl.g:1191:1: ( () )
            // InternalMyDsl.g:1192:2: ()
            {
             before(grammarAccess.getRobotModelAccess().getRobotModelAction_0()); 
            // InternalMyDsl.g:1193:2: ()
            // InternalMyDsl.g:1193:3: 
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
    // InternalMyDsl.g:1201:1: rule__RobotModel__Group__1 : rule__RobotModel__Group__1__Impl ;
    public final void rule__RobotModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1205:1: ( rule__RobotModel__Group__1__Impl )
            // InternalMyDsl.g:1206:2: rule__RobotModel__Group__1__Impl
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
    // InternalMyDsl.g:1212:1: rule__RobotModel__Group__1__Impl : ( ( rule__RobotModel__Alternatives_1 )* ) ;
    public final void rule__RobotModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:1: ( ( ( rule__RobotModel__Alternatives_1 )* ) )
            // InternalMyDsl.g:1217:1: ( ( rule__RobotModel__Alternatives_1 )* )
            {
            // InternalMyDsl.g:1217:1: ( ( rule__RobotModel__Alternatives_1 )* )
            // InternalMyDsl.g:1218:2: ( rule__RobotModel__Alternatives_1 )*
            {
             before(grammarAccess.getRobotModelAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1219:2: ( rule__RobotModel__Alternatives_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_INT||LA17_0==18||(LA17_0>=21 && LA17_0<=22)||(LA17_0>=35 && LA17_0<=37)||LA17_0==39||LA17_0==63||LA17_0==66) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:1219:3: rule__RobotModel__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__RobotModel__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalMyDsl.g:1228:1: rule__RobotModel__Group_1_1__0 : rule__RobotModel__Group_1_1__0__Impl rule__RobotModel__Group_1_1__1 ;
    public final void rule__RobotModel__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1232:1: ( rule__RobotModel__Group_1_1__0__Impl rule__RobotModel__Group_1_1__1 )
            // InternalMyDsl.g:1233:2: rule__RobotModel__Group_1_1__0__Impl rule__RobotModel__Group_1_1__1
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
    // InternalMyDsl.g:1240:1: rule__RobotModel__Group_1_1__0__Impl : ( 'Action:' ) ;
    public final void rule__RobotModel__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1244:1: ( ( 'Action:' ) )
            // InternalMyDsl.g:1245:1: ( 'Action:' )
            {
            // InternalMyDsl.g:1245:1: ( 'Action:' )
            // InternalMyDsl.g:1246:2: 'Action:'
            {
             before(grammarAccess.getRobotModelAccess().getActionKeyword_1_1_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalMyDsl.g:1255:1: rule__RobotModel__Group_1_1__1 : rule__RobotModel__Group_1_1__1__Impl rule__RobotModel__Group_1_1__2 ;
    public final void rule__RobotModel__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1259:1: ( rule__RobotModel__Group_1_1__1__Impl rule__RobotModel__Group_1_1__2 )
            // InternalMyDsl.g:1260:2: rule__RobotModel__Group_1_1__1__Impl rule__RobotModel__Group_1_1__2
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
    // InternalMyDsl.g:1267:1: rule__RobotModel__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__RobotModel__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1271:1: ( ( '-' ) )
            // InternalMyDsl.g:1272:1: ( '-' )
            {
            // InternalMyDsl.g:1272:1: ( '-' )
            // InternalMyDsl.g:1273:2: '-'
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
    // InternalMyDsl.g:1282:1: rule__RobotModel__Group_1_1__2 : rule__RobotModel__Group_1_1__2__Impl rule__RobotModel__Group_1_1__3 ;
    public final void rule__RobotModel__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1286:1: ( rule__RobotModel__Group_1_1__2__Impl rule__RobotModel__Group_1_1__3 )
            // InternalMyDsl.g:1287:2: rule__RobotModel__Group_1_1__2__Impl rule__RobotModel__Group_1_1__3
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
    // InternalMyDsl.g:1294:1: rule__RobotModel__Group_1_1__2__Impl : ( ( rule__RobotModel__ActionsAssignment_1_1_2 ) ) ;
    public final void rule__RobotModel__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1298:1: ( ( ( rule__RobotModel__ActionsAssignment_1_1_2 ) ) )
            // InternalMyDsl.g:1299:1: ( ( rule__RobotModel__ActionsAssignment_1_1_2 ) )
            {
            // InternalMyDsl.g:1299:1: ( ( rule__RobotModel__ActionsAssignment_1_1_2 ) )
            // InternalMyDsl.g:1300:2: ( rule__RobotModel__ActionsAssignment_1_1_2 )
            {
             before(grammarAccess.getRobotModelAccess().getActionsAssignment_1_1_2()); 
            // InternalMyDsl.g:1301:2: ( rule__RobotModel__ActionsAssignment_1_1_2 )
            // InternalMyDsl.g:1301:3: rule__RobotModel__ActionsAssignment_1_1_2
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
    // InternalMyDsl.g:1309:1: rule__RobotModel__Group_1_1__3 : rule__RobotModel__Group_1_1__3__Impl ;
    public final void rule__RobotModel__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1313:1: ( rule__RobotModel__Group_1_1__3__Impl )
            // InternalMyDsl.g:1314:2: rule__RobotModel__Group_1_1__3__Impl
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
    // InternalMyDsl.g:1320:1: rule__RobotModel__Group_1_1__3__Impl : ( ( rule__RobotModel__Group_1_1_3__0 )* ) ;
    public final void rule__RobotModel__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1324:1: ( ( ( rule__RobotModel__Group_1_1_3__0 )* ) )
            // InternalMyDsl.g:1325:1: ( ( rule__RobotModel__Group_1_1_3__0 )* )
            {
            // InternalMyDsl.g:1325:1: ( ( rule__RobotModel__Group_1_1_3__0 )* )
            // InternalMyDsl.g:1326:2: ( rule__RobotModel__Group_1_1_3__0 )*
            {
             before(grammarAccess.getRobotModelAccess().getGroup_1_1_3()); 
            // InternalMyDsl.g:1327:2: ( rule__RobotModel__Group_1_1_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==18) ) {
                    int LA18_2 = input.LA(2);

                    if ( (LA18_2==51||LA18_2==54||LA18_2==56) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1327:3: rule__RobotModel__Group_1_1_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RobotModel__Group_1_1_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalMyDsl.g:1336:1: rule__RobotModel__Group_1_1_3__0 : rule__RobotModel__Group_1_1_3__0__Impl rule__RobotModel__Group_1_1_3__1 ;
    public final void rule__RobotModel__Group_1_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1340:1: ( rule__RobotModel__Group_1_1_3__0__Impl rule__RobotModel__Group_1_1_3__1 )
            // InternalMyDsl.g:1341:2: rule__RobotModel__Group_1_1_3__0__Impl rule__RobotModel__Group_1_1_3__1
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
    // InternalMyDsl.g:1348:1: rule__RobotModel__Group_1_1_3__0__Impl : ( '-' ) ;
    public final void rule__RobotModel__Group_1_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1352:1: ( ( '-' ) )
            // InternalMyDsl.g:1353:1: ( '-' )
            {
            // InternalMyDsl.g:1353:1: ( '-' )
            // InternalMyDsl.g:1354:2: '-'
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
    // InternalMyDsl.g:1363:1: rule__RobotModel__Group_1_1_3__1 : rule__RobotModel__Group_1_1_3__1__Impl ;
    public final void rule__RobotModel__Group_1_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1367:1: ( rule__RobotModel__Group_1_1_3__1__Impl )
            // InternalMyDsl.g:1368:2: rule__RobotModel__Group_1_1_3__1__Impl
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
    // InternalMyDsl.g:1374:1: rule__RobotModel__Group_1_1_3__1__Impl : ( ( rule__RobotModel__ActionsAssignment_1_1_3_1 ) ) ;
    public final void rule__RobotModel__Group_1_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1378:1: ( ( ( rule__RobotModel__ActionsAssignment_1_1_3_1 ) ) )
            // InternalMyDsl.g:1379:1: ( ( rule__RobotModel__ActionsAssignment_1_1_3_1 ) )
            {
            // InternalMyDsl.g:1379:1: ( ( rule__RobotModel__ActionsAssignment_1_1_3_1 ) )
            // InternalMyDsl.g:1380:2: ( rule__RobotModel__ActionsAssignment_1_1_3_1 )
            {
             before(grammarAccess.getRobotModelAccess().getActionsAssignment_1_1_3_1()); 
            // InternalMyDsl.g:1381:2: ( rule__RobotModel__ActionsAssignment_1_1_3_1 )
            // InternalMyDsl.g:1381:3: rule__RobotModel__ActionsAssignment_1_1_3_1
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
    // InternalMyDsl.g:1390:1: rule__RobotModel__Group_1_2__0 : rule__RobotModel__Group_1_2__0__Impl rule__RobotModel__Group_1_2__1 ;
    public final void rule__RobotModel__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1394:1: ( rule__RobotModel__Group_1_2__0__Impl rule__RobotModel__Group_1_2__1 )
            // InternalMyDsl.g:1395:2: rule__RobotModel__Group_1_2__0__Impl rule__RobotModel__Group_1_2__1
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
    // InternalMyDsl.g:1402:1: rule__RobotModel__Group_1_2__0__Impl : ( 'Condition:' ) ;
    public final void rule__RobotModel__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1406:1: ( ( 'Condition:' ) )
            // InternalMyDsl.g:1407:1: ( 'Condition:' )
            {
            // InternalMyDsl.g:1407:1: ( 'Condition:' )
            // InternalMyDsl.g:1408:2: 'Condition:'
            {
             before(grammarAccess.getRobotModelAccess().getConditionKeyword_1_2_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:1417:1: rule__RobotModel__Group_1_2__1 : rule__RobotModel__Group_1_2__1__Impl rule__RobotModel__Group_1_2__2 ;
    public final void rule__RobotModel__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1421:1: ( rule__RobotModel__Group_1_2__1__Impl rule__RobotModel__Group_1_2__2 )
            // InternalMyDsl.g:1422:2: rule__RobotModel__Group_1_2__1__Impl rule__RobotModel__Group_1_2__2
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
    // InternalMyDsl.g:1429:1: rule__RobotModel__Group_1_2__1__Impl : ( '-' ) ;
    public final void rule__RobotModel__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1433:1: ( ( '-' ) )
            // InternalMyDsl.g:1434:1: ( '-' )
            {
            // InternalMyDsl.g:1434:1: ( '-' )
            // InternalMyDsl.g:1435:2: '-'
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
    // InternalMyDsl.g:1444:1: rule__RobotModel__Group_1_2__2 : rule__RobotModel__Group_1_2__2__Impl rule__RobotModel__Group_1_2__3 ;
    public final void rule__RobotModel__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1448:1: ( rule__RobotModel__Group_1_2__2__Impl rule__RobotModel__Group_1_2__3 )
            // InternalMyDsl.g:1449:2: rule__RobotModel__Group_1_2__2__Impl rule__RobotModel__Group_1_2__3
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
    // InternalMyDsl.g:1456:1: rule__RobotModel__Group_1_2__2__Impl : ( ( rule__RobotModel__ConditionsAssignment_1_2_2 ) ) ;
    public final void rule__RobotModel__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1460:1: ( ( ( rule__RobotModel__ConditionsAssignment_1_2_2 ) ) )
            // InternalMyDsl.g:1461:1: ( ( rule__RobotModel__ConditionsAssignment_1_2_2 ) )
            {
            // InternalMyDsl.g:1461:1: ( ( rule__RobotModel__ConditionsAssignment_1_2_2 ) )
            // InternalMyDsl.g:1462:2: ( rule__RobotModel__ConditionsAssignment_1_2_2 )
            {
             before(grammarAccess.getRobotModelAccess().getConditionsAssignment_1_2_2()); 
            // InternalMyDsl.g:1463:2: ( rule__RobotModel__ConditionsAssignment_1_2_2 )
            // InternalMyDsl.g:1463:3: rule__RobotModel__ConditionsAssignment_1_2_2
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
    // InternalMyDsl.g:1471:1: rule__RobotModel__Group_1_2__3 : rule__RobotModel__Group_1_2__3__Impl ;
    public final void rule__RobotModel__Group_1_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1475:1: ( rule__RobotModel__Group_1_2__3__Impl )
            // InternalMyDsl.g:1476:2: rule__RobotModel__Group_1_2__3__Impl
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
    // InternalMyDsl.g:1482:1: rule__RobotModel__Group_1_2__3__Impl : ( ( rule__RobotModel__Group_1_2_3__0 )* ) ;
    public final void rule__RobotModel__Group_1_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1486:1: ( ( ( rule__RobotModel__Group_1_2_3__0 )* ) )
            // InternalMyDsl.g:1487:1: ( ( rule__RobotModel__Group_1_2_3__0 )* )
            {
            // InternalMyDsl.g:1487:1: ( ( rule__RobotModel__Group_1_2_3__0 )* )
            // InternalMyDsl.g:1488:2: ( rule__RobotModel__Group_1_2_3__0 )*
            {
             before(grammarAccess.getRobotModelAccess().getGroup_1_2_3()); 
            // InternalMyDsl.g:1489:2: ( rule__RobotModel__Group_1_2_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==18) ) {
                    int LA19_2 = input.LA(2);

                    if ( ((LA19_2>=44 && LA19_2<=45)||LA19_2==47||LA19_2==50) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1489:3: rule__RobotModel__Group_1_2_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__RobotModel__Group_1_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalMyDsl.g:1498:1: rule__RobotModel__Group_1_2_3__0 : rule__RobotModel__Group_1_2_3__0__Impl rule__RobotModel__Group_1_2_3__1 ;
    public final void rule__RobotModel__Group_1_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1502:1: ( rule__RobotModel__Group_1_2_3__0__Impl rule__RobotModel__Group_1_2_3__1 )
            // InternalMyDsl.g:1503:2: rule__RobotModel__Group_1_2_3__0__Impl rule__RobotModel__Group_1_2_3__1
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
    // InternalMyDsl.g:1510:1: rule__RobotModel__Group_1_2_3__0__Impl : ( '-' ) ;
    public final void rule__RobotModel__Group_1_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1514:1: ( ( '-' ) )
            // InternalMyDsl.g:1515:1: ( '-' )
            {
            // InternalMyDsl.g:1515:1: ( '-' )
            // InternalMyDsl.g:1516:2: '-'
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
    // InternalMyDsl.g:1525:1: rule__RobotModel__Group_1_2_3__1 : rule__RobotModel__Group_1_2_3__1__Impl ;
    public final void rule__RobotModel__Group_1_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1529:1: ( rule__RobotModel__Group_1_2_3__1__Impl )
            // InternalMyDsl.g:1530:2: rule__RobotModel__Group_1_2_3__1__Impl
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
    // InternalMyDsl.g:1536:1: rule__RobotModel__Group_1_2_3__1__Impl : ( ( rule__RobotModel__ConditionsAssignment_1_2_3_1 ) ) ;
    public final void rule__RobotModel__Group_1_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1540:1: ( ( ( rule__RobotModel__ConditionsAssignment_1_2_3_1 ) ) )
            // InternalMyDsl.g:1541:1: ( ( rule__RobotModel__ConditionsAssignment_1_2_3_1 ) )
            {
            // InternalMyDsl.g:1541:1: ( ( rule__RobotModel__ConditionsAssignment_1_2_3_1 ) )
            // InternalMyDsl.g:1542:2: ( rule__RobotModel__ConditionsAssignment_1_2_3_1 )
            {
             before(grammarAccess.getRobotModelAccess().getConditionsAssignment_1_2_3_1()); 
            // InternalMyDsl.g:1543:2: ( rule__RobotModel__ConditionsAssignment_1_2_3_1 )
            // InternalMyDsl.g:1543:3: rule__RobotModel__ConditionsAssignment_1_2_3_1
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
    // InternalMyDsl.g:1552:1: rule__Or__Group__0 : rule__Or__Group__0__Impl rule__Or__Group__1 ;
    public final void rule__Or__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1556:1: ( rule__Or__Group__0__Impl rule__Or__Group__1 )
            // InternalMyDsl.g:1557:2: rule__Or__Group__0__Impl rule__Or__Group__1
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
    // InternalMyDsl.g:1564:1: rule__Or__Group__0__Impl : ( ruleAnd ) ;
    public final void rule__Or__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1568:1: ( ( ruleAnd ) )
            // InternalMyDsl.g:1569:1: ( ruleAnd )
            {
            // InternalMyDsl.g:1569:1: ( ruleAnd )
            // InternalMyDsl.g:1570:2: ruleAnd
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
    // InternalMyDsl.g:1579:1: rule__Or__Group__1 : rule__Or__Group__1__Impl ;
    public final void rule__Or__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1583:1: ( rule__Or__Group__1__Impl )
            // InternalMyDsl.g:1584:2: rule__Or__Group__1__Impl
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
    // InternalMyDsl.g:1590:1: rule__Or__Group__1__Impl : ( ( rule__Or__Group_1__0 )* ) ;
    public final void rule__Or__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1594:1: ( ( ( rule__Or__Group_1__0 )* ) )
            // InternalMyDsl.g:1595:1: ( ( rule__Or__Group_1__0 )* )
            {
            // InternalMyDsl.g:1595:1: ( ( rule__Or__Group_1__0 )* )
            // InternalMyDsl.g:1596:2: ( rule__Or__Group_1__0 )*
            {
             before(grammarAccess.getOrAccess().getGroup_1()); 
            // InternalMyDsl.g:1597:2: ( rule__Or__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==61) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:1597:3: rule__Or__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Or__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalMyDsl.g:1606:1: rule__Or__Group_1__0 : rule__Or__Group_1__0__Impl rule__Or__Group_1__1 ;
    public final void rule__Or__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1610:1: ( rule__Or__Group_1__0__Impl rule__Or__Group_1__1 )
            // InternalMyDsl.g:1611:2: rule__Or__Group_1__0__Impl rule__Or__Group_1__1
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
    // InternalMyDsl.g:1618:1: rule__Or__Group_1__0__Impl : ( () ) ;
    public final void rule__Or__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1622:1: ( ( () ) )
            // InternalMyDsl.g:1623:1: ( () )
            {
            // InternalMyDsl.g:1623:1: ( () )
            // InternalMyDsl.g:1624:2: ()
            {
             before(grammarAccess.getOrAccess().getExpressionLeftAction_1_0()); 
            // InternalMyDsl.g:1625:2: ()
            // InternalMyDsl.g:1625:3: 
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
    // InternalMyDsl.g:1633:1: rule__Or__Group_1__1 : rule__Or__Group_1__1__Impl rule__Or__Group_1__2 ;
    public final void rule__Or__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1637:1: ( rule__Or__Group_1__1__Impl rule__Or__Group_1__2 )
            // InternalMyDsl.g:1638:2: rule__Or__Group_1__1__Impl rule__Or__Group_1__2
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
    // InternalMyDsl.g:1645:1: rule__Or__Group_1__1__Impl : ( ( rule__Or__OperationAssignment_1_1 ) ) ;
    public final void rule__Or__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1649:1: ( ( ( rule__Or__OperationAssignment_1_1 ) ) )
            // InternalMyDsl.g:1650:1: ( ( rule__Or__OperationAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1650:1: ( ( rule__Or__OperationAssignment_1_1 ) )
            // InternalMyDsl.g:1651:2: ( rule__Or__OperationAssignment_1_1 )
            {
             before(grammarAccess.getOrAccess().getOperationAssignment_1_1()); 
            // InternalMyDsl.g:1652:2: ( rule__Or__OperationAssignment_1_1 )
            // InternalMyDsl.g:1652:3: rule__Or__OperationAssignment_1_1
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
    // InternalMyDsl.g:1660:1: rule__Or__Group_1__2 : rule__Or__Group_1__2__Impl ;
    public final void rule__Or__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1664:1: ( rule__Or__Group_1__2__Impl )
            // InternalMyDsl.g:1665:2: rule__Or__Group_1__2__Impl
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
    // InternalMyDsl.g:1671:1: rule__Or__Group_1__2__Impl : ( ( rule__Or__RightAssignment_1_2 ) ) ;
    public final void rule__Or__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1675:1: ( ( ( rule__Or__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:1676:1: ( ( rule__Or__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:1676:1: ( ( rule__Or__RightAssignment_1_2 ) )
            // InternalMyDsl.g:1677:2: ( rule__Or__RightAssignment_1_2 )
            {
             before(grammarAccess.getOrAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:1678:2: ( rule__Or__RightAssignment_1_2 )
            // InternalMyDsl.g:1678:3: rule__Or__RightAssignment_1_2
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
    // InternalMyDsl.g:1687:1: rule__And__Group__0 : rule__And__Group__0__Impl rule__And__Group__1 ;
    public final void rule__And__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1691:1: ( rule__And__Group__0__Impl rule__And__Group__1 )
            // InternalMyDsl.g:1692:2: rule__And__Group__0__Impl rule__And__Group__1
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
    // InternalMyDsl.g:1699:1: rule__And__Group__0__Impl : ( ruleEquality ) ;
    public final void rule__And__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1703:1: ( ( ruleEquality ) )
            // InternalMyDsl.g:1704:1: ( ruleEquality )
            {
            // InternalMyDsl.g:1704:1: ( ruleEquality )
            // InternalMyDsl.g:1705:2: ruleEquality
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
    // InternalMyDsl.g:1714:1: rule__And__Group__1 : rule__And__Group__1__Impl ;
    public final void rule__And__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1718:1: ( rule__And__Group__1__Impl )
            // InternalMyDsl.g:1719:2: rule__And__Group__1__Impl
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
    // InternalMyDsl.g:1725:1: rule__And__Group__1__Impl : ( ( rule__And__Group_1__0 )* ) ;
    public final void rule__And__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1729:1: ( ( ( rule__And__Group_1__0 )* ) )
            // InternalMyDsl.g:1730:1: ( ( rule__And__Group_1__0 )* )
            {
            // InternalMyDsl.g:1730:1: ( ( rule__And__Group_1__0 )* )
            // InternalMyDsl.g:1731:2: ( rule__And__Group_1__0 )*
            {
             before(grammarAccess.getAndAccess().getGroup_1()); 
            // InternalMyDsl.g:1732:2: ( rule__And__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==62) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:1732:3: rule__And__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__And__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalMyDsl.g:1741:1: rule__And__Group_1__0 : rule__And__Group_1__0__Impl rule__And__Group_1__1 ;
    public final void rule__And__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1745:1: ( rule__And__Group_1__0__Impl rule__And__Group_1__1 )
            // InternalMyDsl.g:1746:2: rule__And__Group_1__0__Impl rule__And__Group_1__1
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
    // InternalMyDsl.g:1753:1: rule__And__Group_1__0__Impl : ( () ) ;
    public final void rule__And__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1757:1: ( ( () ) )
            // InternalMyDsl.g:1758:1: ( () )
            {
            // InternalMyDsl.g:1758:1: ( () )
            // InternalMyDsl.g:1759:2: ()
            {
             before(grammarAccess.getAndAccess().getExpressionLeftAction_1_0()); 
            // InternalMyDsl.g:1760:2: ()
            // InternalMyDsl.g:1760:3: 
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
    // InternalMyDsl.g:1768:1: rule__And__Group_1__1 : rule__And__Group_1__1__Impl rule__And__Group_1__2 ;
    public final void rule__And__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1772:1: ( rule__And__Group_1__1__Impl rule__And__Group_1__2 )
            // InternalMyDsl.g:1773:2: rule__And__Group_1__1__Impl rule__And__Group_1__2
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
    // InternalMyDsl.g:1780:1: rule__And__Group_1__1__Impl : ( ( rule__And__OperationAssignment_1_1 ) ) ;
    public final void rule__And__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1784:1: ( ( ( rule__And__OperationAssignment_1_1 ) ) )
            // InternalMyDsl.g:1785:1: ( ( rule__And__OperationAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1785:1: ( ( rule__And__OperationAssignment_1_1 ) )
            // InternalMyDsl.g:1786:2: ( rule__And__OperationAssignment_1_1 )
            {
             before(grammarAccess.getAndAccess().getOperationAssignment_1_1()); 
            // InternalMyDsl.g:1787:2: ( rule__And__OperationAssignment_1_1 )
            // InternalMyDsl.g:1787:3: rule__And__OperationAssignment_1_1
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
    // InternalMyDsl.g:1795:1: rule__And__Group_1__2 : rule__And__Group_1__2__Impl ;
    public final void rule__And__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1799:1: ( rule__And__Group_1__2__Impl )
            // InternalMyDsl.g:1800:2: rule__And__Group_1__2__Impl
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
    // InternalMyDsl.g:1806:1: rule__And__Group_1__2__Impl : ( ( rule__And__RightAssignment_1_2 ) ) ;
    public final void rule__And__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1810:1: ( ( ( rule__And__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:1811:1: ( ( rule__And__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:1811:1: ( ( rule__And__RightAssignment_1_2 ) )
            // InternalMyDsl.g:1812:2: ( rule__And__RightAssignment_1_2 )
            {
             before(grammarAccess.getAndAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:1813:2: ( rule__And__RightAssignment_1_2 )
            // InternalMyDsl.g:1813:3: rule__And__RightAssignment_1_2
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
    // InternalMyDsl.g:1822:1: rule__Equality__Group__0 : rule__Equality__Group__0__Impl rule__Equality__Group__1 ;
    public final void rule__Equality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1826:1: ( rule__Equality__Group__0__Impl rule__Equality__Group__1 )
            // InternalMyDsl.g:1827:2: rule__Equality__Group__0__Impl rule__Equality__Group__1
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
    // InternalMyDsl.g:1834:1: rule__Equality__Group__0__Impl : ( ruleComparison ) ;
    public final void rule__Equality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1838:1: ( ( ruleComparison ) )
            // InternalMyDsl.g:1839:1: ( ruleComparison )
            {
            // InternalMyDsl.g:1839:1: ( ruleComparison )
            // InternalMyDsl.g:1840:2: ruleComparison
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
    // InternalMyDsl.g:1849:1: rule__Equality__Group__1 : rule__Equality__Group__1__Impl ;
    public final void rule__Equality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1853:1: ( rule__Equality__Group__1__Impl )
            // InternalMyDsl.g:1854:2: rule__Equality__Group__1__Impl
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
    // InternalMyDsl.g:1860:1: rule__Equality__Group__1__Impl : ( ( rule__Equality__Group_1__0 )* ) ;
    public final void rule__Equality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1864:1: ( ( ( rule__Equality__Group_1__0 )* ) )
            // InternalMyDsl.g:1865:1: ( ( rule__Equality__Group_1__0 )* )
            {
            // InternalMyDsl.g:1865:1: ( ( rule__Equality__Group_1__0 )* )
            // InternalMyDsl.g:1866:2: ( rule__Equality__Group_1__0 )*
            {
             before(grammarAccess.getEqualityAccess().getGroup_1()); 
            // InternalMyDsl.g:1867:2: ( rule__Equality__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=11 && LA22_0<=12)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1867:3: rule__Equality__Group_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Equality__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalMyDsl.g:1876:1: rule__Equality__Group_1__0 : rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 ;
    public final void rule__Equality__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1880:1: ( rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1 )
            // InternalMyDsl.g:1881:2: rule__Equality__Group_1__0__Impl rule__Equality__Group_1__1
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
    // InternalMyDsl.g:1888:1: rule__Equality__Group_1__0__Impl : ( () ) ;
    public final void rule__Equality__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1892:1: ( ( () ) )
            // InternalMyDsl.g:1893:1: ( () )
            {
            // InternalMyDsl.g:1893:1: ( () )
            // InternalMyDsl.g:1894:2: ()
            {
             before(grammarAccess.getEqualityAccess().getExpressionLeftAction_1_0()); 
            // InternalMyDsl.g:1895:2: ()
            // InternalMyDsl.g:1895:3: 
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
    // InternalMyDsl.g:1903:1: rule__Equality__Group_1__1 : rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 ;
    public final void rule__Equality__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1907:1: ( rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2 )
            // InternalMyDsl.g:1908:2: rule__Equality__Group_1__1__Impl rule__Equality__Group_1__2
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
    // InternalMyDsl.g:1915:1: rule__Equality__Group_1__1__Impl : ( ( rule__Equality__OperationAssignment_1_1 ) ) ;
    public final void rule__Equality__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1919:1: ( ( ( rule__Equality__OperationAssignment_1_1 ) ) )
            // InternalMyDsl.g:1920:1: ( ( rule__Equality__OperationAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1920:1: ( ( rule__Equality__OperationAssignment_1_1 ) )
            // InternalMyDsl.g:1921:2: ( rule__Equality__OperationAssignment_1_1 )
            {
             before(grammarAccess.getEqualityAccess().getOperationAssignment_1_1()); 
            // InternalMyDsl.g:1922:2: ( rule__Equality__OperationAssignment_1_1 )
            // InternalMyDsl.g:1922:3: rule__Equality__OperationAssignment_1_1
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
    // InternalMyDsl.g:1930:1: rule__Equality__Group_1__2 : rule__Equality__Group_1__2__Impl ;
    public final void rule__Equality__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1934:1: ( rule__Equality__Group_1__2__Impl )
            // InternalMyDsl.g:1935:2: rule__Equality__Group_1__2__Impl
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
    // InternalMyDsl.g:1941:1: rule__Equality__Group_1__2__Impl : ( ( rule__Equality__RightAssignment_1_2 ) ) ;
    public final void rule__Equality__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1945:1: ( ( ( rule__Equality__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:1946:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:1946:1: ( ( rule__Equality__RightAssignment_1_2 ) )
            // InternalMyDsl.g:1947:2: ( rule__Equality__RightAssignment_1_2 )
            {
             before(grammarAccess.getEqualityAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:1948:2: ( rule__Equality__RightAssignment_1_2 )
            // InternalMyDsl.g:1948:3: rule__Equality__RightAssignment_1_2
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
    // InternalMyDsl.g:1957:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1961:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalMyDsl.g:1962:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
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
    // InternalMyDsl.g:1969:1: rule__Comparison__Group__0__Impl : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1973:1: ( ( rulePlusOrMinus ) )
            // InternalMyDsl.g:1974:1: ( rulePlusOrMinus )
            {
            // InternalMyDsl.g:1974:1: ( rulePlusOrMinus )
            // InternalMyDsl.g:1975:2: rulePlusOrMinus
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
    // InternalMyDsl.g:1984:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1988:1: ( rule__Comparison__Group__1__Impl )
            // InternalMyDsl.g:1989:2: rule__Comparison__Group__1__Impl
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
    // InternalMyDsl.g:1995:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Group_1__0 )* ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1999:1: ( ( ( rule__Comparison__Group_1__0 )* ) )
            // InternalMyDsl.g:2000:1: ( ( rule__Comparison__Group_1__0 )* )
            {
            // InternalMyDsl.g:2000:1: ( ( rule__Comparison__Group_1__0 )* )
            // InternalMyDsl.g:2001:2: ( rule__Comparison__Group_1__0 )*
            {
             before(grammarAccess.getComparisonAccess().getGroup_1()); 
            // InternalMyDsl.g:2002:2: ( rule__Comparison__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=13 && LA23_0<=16)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:2002:3: rule__Comparison__Group_1__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Comparison__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalMyDsl.g:2011:1: rule__Comparison__Group_1__0 : rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 ;
    public final void rule__Comparison__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2015:1: ( rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1 )
            // InternalMyDsl.g:2016:2: rule__Comparison__Group_1__0__Impl rule__Comparison__Group_1__1
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
    // InternalMyDsl.g:2023:1: rule__Comparison__Group_1__0__Impl : ( () ) ;
    public final void rule__Comparison__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2027:1: ( ( () ) )
            // InternalMyDsl.g:2028:1: ( () )
            {
            // InternalMyDsl.g:2028:1: ( () )
            // InternalMyDsl.g:2029:2: ()
            {
             before(grammarAccess.getComparisonAccess().getExpressionLeftAction_1_0()); 
            // InternalMyDsl.g:2030:2: ()
            // InternalMyDsl.g:2030:3: 
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
    // InternalMyDsl.g:2038:1: rule__Comparison__Group_1__1 : rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 ;
    public final void rule__Comparison__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2042:1: ( rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2 )
            // InternalMyDsl.g:2043:2: rule__Comparison__Group_1__1__Impl rule__Comparison__Group_1__2
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
    // InternalMyDsl.g:2050:1: rule__Comparison__Group_1__1__Impl : ( ( rule__Comparison__OperationAssignment_1_1 ) ) ;
    public final void rule__Comparison__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2054:1: ( ( ( rule__Comparison__OperationAssignment_1_1 ) ) )
            // InternalMyDsl.g:2055:1: ( ( rule__Comparison__OperationAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2055:1: ( ( rule__Comparison__OperationAssignment_1_1 ) )
            // InternalMyDsl.g:2056:2: ( rule__Comparison__OperationAssignment_1_1 )
            {
             before(grammarAccess.getComparisonAccess().getOperationAssignment_1_1()); 
            // InternalMyDsl.g:2057:2: ( rule__Comparison__OperationAssignment_1_1 )
            // InternalMyDsl.g:2057:3: rule__Comparison__OperationAssignment_1_1
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
    // InternalMyDsl.g:2065:1: rule__Comparison__Group_1__2 : rule__Comparison__Group_1__2__Impl ;
    public final void rule__Comparison__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2069:1: ( rule__Comparison__Group_1__2__Impl )
            // InternalMyDsl.g:2070:2: rule__Comparison__Group_1__2__Impl
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
    // InternalMyDsl.g:2076:1: rule__Comparison__Group_1__2__Impl : ( ( rule__Comparison__RightAssignment_1_2 ) ) ;
    public final void rule__Comparison__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2080:1: ( ( ( rule__Comparison__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:2081:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:2081:1: ( ( rule__Comparison__RightAssignment_1_2 ) )
            // InternalMyDsl.g:2082:2: ( rule__Comparison__RightAssignment_1_2 )
            {
             before(grammarAccess.getComparisonAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:2083:2: ( rule__Comparison__RightAssignment_1_2 )
            // InternalMyDsl.g:2083:3: rule__Comparison__RightAssignment_1_2
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
    // InternalMyDsl.g:2092:1: rule__If__Group__0 : rule__If__Group__0__Impl rule__If__Group__1 ;
    public final void rule__If__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2096:1: ( rule__If__Group__0__Impl rule__If__Group__1 )
            // InternalMyDsl.g:2097:2: rule__If__Group__0__Impl rule__If__Group__1
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
    // InternalMyDsl.g:2104:1: rule__If__Group__0__Impl : ( () ) ;
    public final void rule__If__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2108:1: ( ( () ) )
            // InternalMyDsl.g:2109:1: ( () )
            {
            // InternalMyDsl.g:2109:1: ( () )
            // InternalMyDsl.g:2110:2: ()
            {
             before(grammarAccess.getIfAccess().getExpressionAction_0()); 
            // InternalMyDsl.g:2111:2: ()
            // InternalMyDsl.g:2111:3: 
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
    // InternalMyDsl.g:2119:1: rule__If__Group__1 : rule__If__Group__1__Impl rule__If__Group__2 ;
    public final void rule__If__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2123:1: ( rule__If__Group__1__Impl rule__If__Group__2 )
            // InternalMyDsl.g:2124:2: rule__If__Group__1__Impl rule__If__Group__2
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
    // InternalMyDsl.g:2131:1: rule__If__Group__1__Impl : ( ( rule__If__OperationAssignment_1 ) ) ;
    public final void rule__If__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2135:1: ( ( ( rule__If__OperationAssignment_1 ) ) )
            // InternalMyDsl.g:2136:1: ( ( rule__If__OperationAssignment_1 ) )
            {
            // InternalMyDsl.g:2136:1: ( ( rule__If__OperationAssignment_1 ) )
            // InternalMyDsl.g:2137:2: ( rule__If__OperationAssignment_1 )
            {
             before(grammarAccess.getIfAccess().getOperationAssignment_1()); 
            // InternalMyDsl.g:2138:2: ( rule__If__OperationAssignment_1 )
            // InternalMyDsl.g:2138:3: rule__If__OperationAssignment_1
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
    // InternalMyDsl.g:2146:1: rule__If__Group__2 : rule__If__Group__2__Impl rule__If__Group__3 ;
    public final void rule__If__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2150:1: ( rule__If__Group__2__Impl rule__If__Group__3 )
            // InternalMyDsl.g:2151:2: rule__If__Group__2__Impl rule__If__Group__3
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
    // InternalMyDsl.g:2158:1: rule__If__Group__2__Impl : ( ( rule__If__LeftAssignment_2 ) ) ;
    public final void rule__If__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2162:1: ( ( ( rule__If__LeftAssignment_2 ) ) )
            // InternalMyDsl.g:2163:1: ( ( rule__If__LeftAssignment_2 ) )
            {
            // InternalMyDsl.g:2163:1: ( ( rule__If__LeftAssignment_2 ) )
            // InternalMyDsl.g:2164:2: ( rule__If__LeftAssignment_2 )
            {
             before(grammarAccess.getIfAccess().getLeftAssignment_2()); 
            // InternalMyDsl.g:2165:2: ( rule__If__LeftAssignment_2 )
            // InternalMyDsl.g:2165:3: rule__If__LeftAssignment_2
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
    // InternalMyDsl.g:2173:1: rule__If__Group__3 : rule__If__Group__3__Impl ;
    public final void rule__If__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2177:1: ( rule__If__Group__3__Impl )
            // InternalMyDsl.g:2178:2: rule__If__Group__3__Impl
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
    // InternalMyDsl.g:2184:1: rule__If__Group__3__Impl : ( ( rule__If__RightAssignment_3 ) ) ;
    public final void rule__If__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2188:1: ( ( ( rule__If__RightAssignment_3 ) ) )
            // InternalMyDsl.g:2189:1: ( ( rule__If__RightAssignment_3 ) )
            {
            // InternalMyDsl.g:2189:1: ( ( rule__If__RightAssignment_3 ) )
            // InternalMyDsl.g:2190:2: ( rule__If__RightAssignment_3 )
            {
             before(grammarAccess.getIfAccess().getRightAssignment_3()); 
            // InternalMyDsl.g:2191:2: ( rule__If__RightAssignment_3 )
            // InternalMyDsl.g:2191:3: rule__If__RightAssignment_3
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
    // InternalMyDsl.g:2200:1: rule__Then__Group__0 : rule__Then__Group__0__Impl rule__Then__Group__1 ;
    public final void rule__Then__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2204:1: ( rule__Then__Group__0__Impl rule__Then__Group__1 )
            // InternalMyDsl.g:2205:2: rule__Then__Group__0__Impl rule__Then__Group__1
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
    // InternalMyDsl.g:2212:1: rule__Then__Group__0__Impl : ( () ) ;
    public final void rule__Then__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2216:1: ( ( () ) )
            // InternalMyDsl.g:2217:1: ( () )
            {
            // InternalMyDsl.g:2217:1: ( () )
            // InternalMyDsl.g:2218:2: ()
            {
             before(grammarAccess.getThenAccess().getExpressionAction_0()); 
            // InternalMyDsl.g:2219:2: ()
            // InternalMyDsl.g:2219:3: 
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
    // InternalMyDsl.g:2227:1: rule__Then__Group__1 : rule__Then__Group__1__Impl rule__Then__Group__2 ;
    public final void rule__Then__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2231:1: ( rule__Then__Group__1__Impl rule__Then__Group__2 )
            // InternalMyDsl.g:2232:2: rule__Then__Group__1__Impl rule__Then__Group__2
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
    // InternalMyDsl.g:2239:1: rule__Then__Group__1__Impl : ( ( rule__Then__OperationAssignment_1 ) ) ;
    public final void rule__Then__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2243:1: ( ( ( rule__Then__OperationAssignment_1 ) ) )
            // InternalMyDsl.g:2244:1: ( ( rule__Then__OperationAssignment_1 ) )
            {
            // InternalMyDsl.g:2244:1: ( ( rule__Then__OperationAssignment_1 ) )
            // InternalMyDsl.g:2245:2: ( rule__Then__OperationAssignment_1 )
            {
             before(grammarAccess.getThenAccess().getOperationAssignment_1()); 
            // InternalMyDsl.g:2246:2: ( rule__Then__OperationAssignment_1 )
            // InternalMyDsl.g:2246:3: rule__Then__OperationAssignment_1
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
    // InternalMyDsl.g:2254:1: rule__Then__Group__2 : rule__Then__Group__2__Impl rule__Then__Group__3 ;
    public final void rule__Then__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2258:1: ( rule__Then__Group__2__Impl rule__Then__Group__3 )
            // InternalMyDsl.g:2259:2: rule__Then__Group__2__Impl rule__Then__Group__3
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
    // InternalMyDsl.g:2266:1: rule__Then__Group__2__Impl : ( ( rule__Then__LeftAssignment_2 ) ) ;
    public final void rule__Then__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2270:1: ( ( ( rule__Then__LeftAssignment_2 ) ) )
            // InternalMyDsl.g:2271:1: ( ( rule__Then__LeftAssignment_2 ) )
            {
            // InternalMyDsl.g:2271:1: ( ( rule__Then__LeftAssignment_2 ) )
            // InternalMyDsl.g:2272:2: ( rule__Then__LeftAssignment_2 )
            {
             before(grammarAccess.getThenAccess().getLeftAssignment_2()); 
            // InternalMyDsl.g:2273:2: ( rule__Then__LeftAssignment_2 )
            // InternalMyDsl.g:2273:3: rule__Then__LeftAssignment_2
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
    // InternalMyDsl.g:2281:1: rule__Then__Group__3 : rule__Then__Group__3__Impl ;
    public final void rule__Then__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2285:1: ( rule__Then__Group__3__Impl )
            // InternalMyDsl.g:2286:2: rule__Then__Group__3__Impl
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
    // InternalMyDsl.g:2292:1: rule__Then__Group__3__Impl : ( ( rule__Then__RightAssignment_3 ) ) ;
    public final void rule__Then__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2296:1: ( ( ( rule__Then__RightAssignment_3 ) ) )
            // InternalMyDsl.g:2297:1: ( ( rule__Then__RightAssignment_3 ) )
            {
            // InternalMyDsl.g:2297:1: ( ( rule__Then__RightAssignment_3 ) )
            // InternalMyDsl.g:2298:2: ( rule__Then__RightAssignment_3 )
            {
             before(grammarAccess.getThenAccess().getRightAssignment_3()); 
            // InternalMyDsl.g:2299:2: ( rule__Then__RightAssignment_3 )
            // InternalMyDsl.g:2299:3: rule__Then__RightAssignment_3
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
    // InternalMyDsl.g:2308:1: rule__Else__Group__0 : rule__Else__Group__0__Impl rule__Else__Group__1 ;
    public final void rule__Else__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2312:1: ( rule__Else__Group__0__Impl rule__Else__Group__1 )
            // InternalMyDsl.g:2313:2: rule__Else__Group__0__Impl rule__Else__Group__1
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
    // InternalMyDsl.g:2320:1: rule__Else__Group__0__Impl : ( () ) ;
    public final void rule__Else__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2324:1: ( ( () ) )
            // InternalMyDsl.g:2325:1: ( () )
            {
            // InternalMyDsl.g:2325:1: ( () )
            // InternalMyDsl.g:2326:2: ()
            {
             before(grammarAccess.getElseAccess().getExpressionAction_0()); 
            // InternalMyDsl.g:2327:2: ()
            // InternalMyDsl.g:2327:3: 
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
    // InternalMyDsl.g:2335:1: rule__Else__Group__1 : rule__Else__Group__1__Impl rule__Else__Group__2 ;
    public final void rule__Else__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2339:1: ( rule__Else__Group__1__Impl rule__Else__Group__2 )
            // InternalMyDsl.g:2340:2: rule__Else__Group__1__Impl rule__Else__Group__2
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
    // InternalMyDsl.g:2347:1: rule__Else__Group__1__Impl : ( ( rule__Else__OperationAssignment_1 ) ) ;
    public final void rule__Else__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2351:1: ( ( ( rule__Else__OperationAssignment_1 ) ) )
            // InternalMyDsl.g:2352:1: ( ( rule__Else__OperationAssignment_1 ) )
            {
            // InternalMyDsl.g:2352:1: ( ( rule__Else__OperationAssignment_1 ) )
            // InternalMyDsl.g:2353:2: ( rule__Else__OperationAssignment_1 )
            {
             before(grammarAccess.getElseAccess().getOperationAssignment_1()); 
            // InternalMyDsl.g:2354:2: ( rule__Else__OperationAssignment_1 )
            // InternalMyDsl.g:2354:3: rule__Else__OperationAssignment_1
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
    // InternalMyDsl.g:2362:1: rule__Else__Group__2 : rule__Else__Group__2__Impl ;
    public final void rule__Else__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2366:1: ( rule__Else__Group__2__Impl )
            // InternalMyDsl.g:2367:2: rule__Else__Group__2__Impl
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
    // InternalMyDsl.g:2373:1: rule__Else__Group__2__Impl : ( ( rule__Else__LeftAssignment_2 ) ) ;
    public final void rule__Else__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2377:1: ( ( ( rule__Else__LeftAssignment_2 ) ) )
            // InternalMyDsl.g:2378:1: ( ( rule__Else__LeftAssignment_2 ) )
            {
            // InternalMyDsl.g:2378:1: ( ( rule__Else__LeftAssignment_2 ) )
            // InternalMyDsl.g:2379:2: ( rule__Else__LeftAssignment_2 )
            {
             before(grammarAccess.getElseAccess().getLeftAssignment_2()); 
            // InternalMyDsl.g:2380:2: ( rule__Else__LeftAssignment_2 )
            // InternalMyDsl.g:2380:3: rule__Else__LeftAssignment_2
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
    // InternalMyDsl.g:2389:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2393:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalMyDsl.g:2394:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
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
    // InternalMyDsl.g:2401:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMultOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2405:1: ( ( ruleMultOrDiv ) )
            // InternalMyDsl.g:2406:1: ( ruleMultOrDiv )
            {
            // InternalMyDsl.g:2406:1: ( ruleMultOrDiv )
            // InternalMyDsl.g:2407:2: ruleMultOrDiv
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
    // InternalMyDsl.g:2416:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2420:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalMyDsl.g:2421:2: rule__PlusOrMinus__Group__1__Impl
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
    // InternalMyDsl.g:2427:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2431:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalMyDsl.g:2432:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalMyDsl.g:2432:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalMyDsl.g:2433:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // InternalMyDsl.g:2434:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==18) ) {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==RULE_INT||LA24_2==18||(LA24_2>=21 && LA24_2<=22)||LA24_2==37||LA24_2==66) ) {
                        alt24=1;
                    }


                }
                else if ( (LA24_0==17) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMyDsl.g:2434:3: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalMyDsl.g:2443:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2447:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalMyDsl.g:2448:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
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
    // InternalMyDsl.g:2455:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Group_1_0__0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2459:1: ( ( ( rule__PlusOrMinus__Group_1_0__0 ) ) )
            // InternalMyDsl.g:2460:1: ( ( rule__PlusOrMinus__Group_1_0__0 ) )
            {
            // InternalMyDsl.g:2460:1: ( ( rule__PlusOrMinus__Group_1_0__0 ) )
            // InternalMyDsl.g:2461:2: ( rule__PlusOrMinus__Group_1_0__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0()); 
            // InternalMyDsl.g:2462:2: ( rule__PlusOrMinus__Group_1_0__0 )
            // InternalMyDsl.g:2462:3: rule__PlusOrMinus__Group_1_0__0
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
    // InternalMyDsl.g:2470:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2474:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalMyDsl.g:2475:2: rule__PlusOrMinus__Group_1__1__Impl
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
    // InternalMyDsl.g:2481:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2485:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalMyDsl.g:2486:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2486:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalMyDsl.g:2487:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // InternalMyDsl.g:2488:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalMyDsl.g:2488:3: rule__PlusOrMinus__RightAssignment_1_1
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
    // InternalMyDsl.g:2497:1: rule__PlusOrMinus__Group_1_0__0 : rule__PlusOrMinus__Group_1_0__0__Impl rule__PlusOrMinus__Group_1_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2501:1: ( rule__PlusOrMinus__Group_1_0__0__Impl rule__PlusOrMinus__Group_1_0__1 )
            // InternalMyDsl.g:2502:2: rule__PlusOrMinus__Group_1_0__0__Impl rule__PlusOrMinus__Group_1_0__1
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
    // InternalMyDsl.g:2509:1: rule__PlusOrMinus__Group_1_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2513:1: ( ( () ) )
            // InternalMyDsl.g:2514:1: ( () )
            {
            // InternalMyDsl.g:2514:1: ( () )
            // InternalMyDsl.g:2515:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getExpressionLeftAction_1_0_0()); 
            // InternalMyDsl.g:2516:2: ()
            // InternalMyDsl.g:2516:3: 
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
    // InternalMyDsl.g:2524:1: rule__PlusOrMinus__Group_1_0__1 : rule__PlusOrMinus__Group_1_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2528:1: ( rule__PlusOrMinus__Group_1_0__1__Impl )
            // InternalMyDsl.g:2529:2: rule__PlusOrMinus__Group_1_0__1__Impl
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
    // InternalMyDsl.g:2535:1: rule__PlusOrMinus__Group_1_0__1__Impl : ( ( rule__PlusOrMinus__OperationAssignment_1_0_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2539:1: ( ( ( rule__PlusOrMinus__OperationAssignment_1_0_1 ) ) )
            // InternalMyDsl.g:2540:1: ( ( rule__PlusOrMinus__OperationAssignment_1_0_1 ) )
            {
            // InternalMyDsl.g:2540:1: ( ( rule__PlusOrMinus__OperationAssignment_1_0_1 ) )
            // InternalMyDsl.g:2541:2: ( rule__PlusOrMinus__OperationAssignment_1_0_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getOperationAssignment_1_0_1()); 
            // InternalMyDsl.g:2542:2: ( rule__PlusOrMinus__OperationAssignment_1_0_1 )
            // InternalMyDsl.g:2542:3: rule__PlusOrMinus__OperationAssignment_1_0_1
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
    // InternalMyDsl.g:2551:1: rule__MultOrDiv__Group__0 : rule__MultOrDiv__Group__0__Impl rule__MultOrDiv__Group__1 ;
    public final void rule__MultOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2555:1: ( rule__MultOrDiv__Group__0__Impl rule__MultOrDiv__Group__1 )
            // InternalMyDsl.g:2556:2: rule__MultOrDiv__Group__0__Impl rule__MultOrDiv__Group__1
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
    // InternalMyDsl.g:2563:1: rule__MultOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MultOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2567:1: ( ( rulePrimary ) )
            // InternalMyDsl.g:2568:1: ( rulePrimary )
            {
            // InternalMyDsl.g:2568:1: ( rulePrimary )
            // InternalMyDsl.g:2569:2: rulePrimary
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
    // InternalMyDsl.g:2578:1: rule__MultOrDiv__Group__1 : rule__MultOrDiv__Group__1__Impl ;
    public final void rule__MultOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2582:1: ( rule__MultOrDiv__Group__1__Impl )
            // InternalMyDsl.g:2583:2: rule__MultOrDiv__Group__1__Impl
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
    // InternalMyDsl.g:2589:1: rule__MultOrDiv__Group__1__Impl : ( ( rule__MultOrDiv__Group_1__0 )* ) ;
    public final void rule__MultOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2593:1: ( ( ( rule__MultOrDiv__Group_1__0 )* ) )
            // InternalMyDsl.g:2594:1: ( ( rule__MultOrDiv__Group_1__0 )* )
            {
            // InternalMyDsl.g:2594:1: ( ( rule__MultOrDiv__Group_1__0 )* )
            // InternalMyDsl.g:2595:2: ( rule__MultOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMultOrDivAccess().getGroup_1()); 
            // InternalMyDsl.g:2596:2: ( rule__MultOrDiv__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=19 && LA25_0<=20)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:2596:3: rule__MultOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__MultOrDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalMyDsl.g:2605:1: rule__MultOrDiv__Group_1__0 : rule__MultOrDiv__Group_1__0__Impl rule__MultOrDiv__Group_1__1 ;
    public final void rule__MultOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2609:1: ( rule__MultOrDiv__Group_1__0__Impl rule__MultOrDiv__Group_1__1 )
            // InternalMyDsl.g:2610:2: rule__MultOrDiv__Group_1__0__Impl rule__MultOrDiv__Group_1__1
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
    // InternalMyDsl.g:2617:1: rule__MultOrDiv__Group_1__0__Impl : ( () ) ;
    public final void rule__MultOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2621:1: ( ( () ) )
            // InternalMyDsl.g:2622:1: ( () )
            {
            // InternalMyDsl.g:2622:1: ( () )
            // InternalMyDsl.g:2623:2: ()
            {
             before(grammarAccess.getMultOrDivAccess().getExpressionLeftAction_1_0()); 
            // InternalMyDsl.g:2624:2: ()
            // InternalMyDsl.g:2624:3: 
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
    // InternalMyDsl.g:2632:1: rule__MultOrDiv__Group_1__1 : rule__MultOrDiv__Group_1__1__Impl rule__MultOrDiv__Group_1__2 ;
    public final void rule__MultOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2636:1: ( rule__MultOrDiv__Group_1__1__Impl rule__MultOrDiv__Group_1__2 )
            // InternalMyDsl.g:2637:2: rule__MultOrDiv__Group_1__1__Impl rule__MultOrDiv__Group_1__2
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
    // InternalMyDsl.g:2644:1: rule__MultOrDiv__Group_1__1__Impl : ( ( rule__MultOrDiv__OperationAssignment_1_1 ) ) ;
    public final void rule__MultOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2648:1: ( ( ( rule__MultOrDiv__OperationAssignment_1_1 ) ) )
            // InternalMyDsl.g:2649:1: ( ( rule__MultOrDiv__OperationAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2649:1: ( ( rule__MultOrDiv__OperationAssignment_1_1 ) )
            // InternalMyDsl.g:2650:2: ( rule__MultOrDiv__OperationAssignment_1_1 )
            {
             before(grammarAccess.getMultOrDivAccess().getOperationAssignment_1_1()); 
            // InternalMyDsl.g:2651:2: ( rule__MultOrDiv__OperationAssignment_1_1 )
            // InternalMyDsl.g:2651:3: rule__MultOrDiv__OperationAssignment_1_1
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
    // InternalMyDsl.g:2659:1: rule__MultOrDiv__Group_1__2 : rule__MultOrDiv__Group_1__2__Impl ;
    public final void rule__MultOrDiv__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2663:1: ( rule__MultOrDiv__Group_1__2__Impl )
            // InternalMyDsl.g:2664:2: rule__MultOrDiv__Group_1__2__Impl
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
    // InternalMyDsl.g:2670:1: rule__MultOrDiv__Group_1__2__Impl : ( ( rule__MultOrDiv__RightAssignment_1_2 ) ) ;
    public final void rule__MultOrDiv__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2674:1: ( ( ( rule__MultOrDiv__RightAssignment_1_2 ) ) )
            // InternalMyDsl.g:2675:1: ( ( rule__MultOrDiv__RightAssignment_1_2 ) )
            {
            // InternalMyDsl.g:2675:1: ( ( rule__MultOrDiv__RightAssignment_1_2 ) )
            // InternalMyDsl.g:2676:2: ( rule__MultOrDiv__RightAssignment_1_2 )
            {
             before(grammarAccess.getMultOrDivAccess().getRightAssignment_1_2()); 
            // InternalMyDsl.g:2677:2: ( rule__MultOrDiv__RightAssignment_1_2 )
            // InternalMyDsl.g:2677:3: rule__MultOrDiv__RightAssignment_1_2
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
    // InternalMyDsl.g:2686:1: rule__Primary__Group_0__0 : rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 ;
    public final void rule__Primary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2690:1: ( rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1 )
            // InternalMyDsl.g:2691:2: rule__Primary__Group_0__0__Impl rule__Primary__Group_0__1
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
    // InternalMyDsl.g:2698:1: rule__Primary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2702:1: ( ( '(' ) )
            // InternalMyDsl.g:2703:1: ( '(' )
            {
            // InternalMyDsl.g:2703:1: ( '(' )
            // InternalMyDsl.g:2704:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:2713:1: rule__Primary__Group_0__1 : rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 ;
    public final void rule__Primary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2717:1: ( rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2 )
            // InternalMyDsl.g:2718:2: rule__Primary__Group_0__1__Impl rule__Primary__Group_0__2
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
    // InternalMyDsl.g:2725:1: rule__Primary__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2729:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2730:1: ( ruleExpression )
            {
            // InternalMyDsl.g:2730:1: ( ruleExpression )
            // InternalMyDsl.g:2731:2: ruleExpression
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
    // InternalMyDsl.g:2740:1: rule__Primary__Group_0__2 : rule__Primary__Group_0__2__Impl ;
    public final void rule__Primary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2744:1: ( rule__Primary__Group_0__2__Impl )
            // InternalMyDsl.g:2745:2: rule__Primary__Group_0__2__Impl
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
    // InternalMyDsl.g:2751:1: rule__Primary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2755:1: ( ( ')' ) )
            // InternalMyDsl.g:2756:1: ( ')' )
            {
            // InternalMyDsl.g:2756:1: ( ')' )
            // InternalMyDsl.g:2757:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:2767:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2771:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalMyDsl.g:2772:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
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
    // InternalMyDsl.g:2779:1: rule__Primary__Group_1__0__Impl : ( () ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2783:1: ( ( () ) )
            // InternalMyDsl.g:2784:1: ( () )
            {
            // InternalMyDsl.g:2784:1: ( () )
            // InternalMyDsl.g:2785:2: ()
            {
             before(grammarAccess.getPrimaryAccess().getExpressionAction_1_0()); 
            // InternalMyDsl.g:2786:2: ()
            // InternalMyDsl.g:2786:3: 
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
    // InternalMyDsl.g:2794:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2798:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalMyDsl.g:2799:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
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
    // InternalMyDsl.g:2806:1: rule__Primary__Group_1__1__Impl : ( ( rule__Primary__OperationAssignment_1_1 ) ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2810:1: ( ( ( rule__Primary__OperationAssignment_1_1 ) ) )
            // InternalMyDsl.g:2811:1: ( ( rule__Primary__OperationAssignment_1_1 ) )
            {
            // InternalMyDsl.g:2811:1: ( ( rule__Primary__OperationAssignment_1_1 ) )
            // InternalMyDsl.g:2812:2: ( rule__Primary__OperationAssignment_1_1 )
            {
             before(grammarAccess.getPrimaryAccess().getOperationAssignment_1_1()); 
            // InternalMyDsl.g:2813:2: ( rule__Primary__OperationAssignment_1_1 )
            // InternalMyDsl.g:2813:3: rule__Primary__OperationAssignment_1_1
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
    // InternalMyDsl.g:2821:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2825:1: ( rule__Primary__Group_1__2__Impl )
            // InternalMyDsl.g:2826:2: rule__Primary__Group_1__2__Impl
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
    // InternalMyDsl.g:2832:1: rule__Primary__Group_1__2__Impl : ( ( rule__Primary__LeftAssignment_1_2 ) ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2836:1: ( ( ( rule__Primary__LeftAssignment_1_2 ) ) )
            // InternalMyDsl.g:2837:1: ( ( rule__Primary__LeftAssignment_1_2 ) )
            {
            // InternalMyDsl.g:2837:1: ( ( rule__Primary__LeftAssignment_1_2 ) )
            // InternalMyDsl.g:2838:2: ( rule__Primary__LeftAssignment_1_2 )
            {
             before(grammarAccess.getPrimaryAccess().getLeftAssignment_1_2()); 
            // InternalMyDsl.g:2839:2: ( rule__Primary__LeftAssignment_1_2 )
            // InternalMyDsl.g:2839:3: rule__Primary__LeftAssignment_1_2
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
    // InternalMyDsl.g:2848:1: rule__Atomic__Group__0 : rule__Atomic__Group__0__Impl rule__Atomic__Group__1 ;
    public final void rule__Atomic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2852:1: ( rule__Atomic__Group__0__Impl rule__Atomic__Group__1 )
            // InternalMyDsl.g:2853:2: rule__Atomic__Group__0__Impl rule__Atomic__Group__1
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
    // InternalMyDsl.g:2860:1: rule__Atomic__Group__0__Impl : ( () ) ;
    public final void rule__Atomic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2864:1: ( ( () ) )
            // InternalMyDsl.g:2865:1: ( () )
            {
            // InternalMyDsl.g:2865:1: ( () )
            // InternalMyDsl.g:2866:2: ()
            {
             before(grammarAccess.getAtomicAccess().getExpressionAction_0()); 
            // InternalMyDsl.g:2867:2: ()
            // InternalMyDsl.g:2867:3: 
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
    // InternalMyDsl.g:2875:1: rule__Atomic__Group__1 : rule__Atomic__Group__1__Impl ;
    public final void rule__Atomic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2879:1: ( rule__Atomic__Group__1__Impl )
            // InternalMyDsl.g:2880:2: rule__Atomic__Group__1__Impl
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
    // InternalMyDsl.g:2886:1: rule__Atomic__Group__1__Impl : ( ( rule__Atomic__Alternatives_1 ) ) ;
    public final void rule__Atomic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2890:1: ( ( ( rule__Atomic__Alternatives_1 ) ) )
            // InternalMyDsl.g:2891:1: ( ( rule__Atomic__Alternatives_1 ) )
            {
            // InternalMyDsl.g:2891:1: ( ( rule__Atomic__Alternatives_1 ) )
            // InternalMyDsl.g:2892:2: ( rule__Atomic__Alternatives_1 )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives_1()); 
            // InternalMyDsl.g:2893:2: ( rule__Atomic__Alternatives_1 )
            // InternalMyDsl.g:2893:3: rule__Atomic__Alternatives_1
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
    // InternalMyDsl.g:2902:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2906:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalMyDsl.g:2907:2: rule__Event__Group__0__Impl rule__Event__Group__1
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
    // InternalMyDsl.g:2914:1: rule__Event__Group__0__Impl : ( () ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2918:1: ( ( () ) )
            // InternalMyDsl.g:2919:1: ( () )
            {
            // InternalMyDsl.g:2919:1: ( () )
            // InternalMyDsl.g:2920:2: ()
            {
             before(grammarAccess.getEventAccess().getEventAction_0()); 
            // InternalMyDsl.g:2921:2: ()
            // InternalMyDsl.g:2921:3: 
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
    // InternalMyDsl.g:2929:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2933:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalMyDsl.g:2934:2: rule__Event__Group__1__Impl rule__Event__Group__2
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
    // InternalMyDsl.g:2941:1: rule__Event__Group__1__Impl : ( 'Event' ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2945:1: ( ( 'Event' ) )
            // InternalMyDsl.g:2946:1: ( 'Event' )
            {
            // InternalMyDsl.g:2946:1: ( 'Event' )
            // InternalMyDsl.g:2947:2: 'Event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalMyDsl.g:2956:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2960:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // InternalMyDsl.g:2961:2: rule__Event__Group__2__Impl rule__Event__Group__3
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
    // InternalMyDsl.g:2968:1: rule__Event__Group__2__Impl : ( ( rule__Event__NameAssignment_2 ) ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2972:1: ( ( ( rule__Event__NameAssignment_2 ) ) )
            // InternalMyDsl.g:2973:1: ( ( rule__Event__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:2973:1: ( ( rule__Event__NameAssignment_2 ) )
            // InternalMyDsl.g:2974:2: ( rule__Event__NameAssignment_2 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2975:2: ( rule__Event__NameAssignment_2 )
            // InternalMyDsl.g:2975:3: rule__Event__NameAssignment_2
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
    // InternalMyDsl.g:2983:1: rule__Event__Group__3 : rule__Event__Group__3__Impl rule__Event__Group__4 ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2987:1: ( rule__Event__Group__3__Impl rule__Event__Group__4 )
            // InternalMyDsl.g:2988:2: rule__Event__Group__3__Impl rule__Event__Group__4
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
    // InternalMyDsl.g:2995:1: rule__Event__Group__3__Impl : ( ( rule__Event__Group_3__0 )? ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2999:1: ( ( ( rule__Event__Group_3__0 )? ) )
            // InternalMyDsl.g:3000:1: ( ( rule__Event__Group_3__0 )? )
            {
            // InternalMyDsl.g:3000:1: ( ( rule__Event__Group_3__0 )? )
            // InternalMyDsl.g:3001:2: ( rule__Event__Group_3__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_3()); 
            // InternalMyDsl.g:3002:2: ( rule__Event__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:3002:3: rule__Event__Group_3__0
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
    // InternalMyDsl.g:3010:1: rule__Event__Group__4 : rule__Event__Group__4__Impl ;
    public final void rule__Event__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3014:1: ( rule__Event__Group__4__Impl )
            // InternalMyDsl.g:3015:2: rule__Event__Group__4__Impl
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
    // InternalMyDsl.g:3021:1: rule__Event__Group__4__Impl : ( ( rule__Event__Group_4__0 )? ) ;
    public final void rule__Event__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3025:1: ( ( ( rule__Event__Group_4__0 )? ) )
            // InternalMyDsl.g:3026:1: ( ( rule__Event__Group_4__0 )? )
            {
            // InternalMyDsl.g:3026:1: ( ( rule__Event__Group_4__0 )? )
            // InternalMyDsl.g:3027:2: ( rule__Event__Group_4__0 )?
            {
             before(grammarAccess.getEventAccess().getGroup_4()); 
            // InternalMyDsl.g:3028:2: ( rule__Event__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:3028:3: rule__Event__Group_4__0
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
    // InternalMyDsl.g:3037:1: rule__Event__Group_3__0 : rule__Event__Group_3__0__Impl rule__Event__Group_3__1 ;
    public final void rule__Event__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3041:1: ( rule__Event__Group_3__0__Impl rule__Event__Group_3__1 )
            // InternalMyDsl.g:3042:2: rule__Event__Group_3__0__Impl rule__Event__Group_3__1
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
    // InternalMyDsl.g:3049:1: rule__Event__Group_3__0__Impl : ( 'conditions:' ) ;
    public final void rule__Event__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3053:1: ( ( 'conditions:' ) )
            // InternalMyDsl.g:3054:1: ( 'conditions:' )
            {
            // InternalMyDsl.g:3054:1: ( 'conditions:' )
            // InternalMyDsl.g:3055:2: 'conditions:'
            {
             before(grammarAccess.getEventAccess().getConditionsKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalMyDsl.g:3064:1: rule__Event__Group_3__1 : rule__Event__Group_3__1__Impl rule__Event__Group_3__2 ;
    public final void rule__Event__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3068:1: ( rule__Event__Group_3__1__Impl rule__Event__Group_3__2 )
            // InternalMyDsl.g:3069:2: rule__Event__Group_3__1__Impl rule__Event__Group_3__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalMyDsl.g:3076:1: rule__Event__Group_3__1__Impl : ( ( rule__Event__ConditionsAssignment_3_1 ) ) ;
    public final void rule__Event__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3080:1: ( ( ( rule__Event__ConditionsAssignment_3_1 ) ) )
            // InternalMyDsl.g:3081:1: ( ( rule__Event__ConditionsAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3081:1: ( ( rule__Event__ConditionsAssignment_3_1 ) )
            // InternalMyDsl.g:3082:2: ( rule__Event__ConditionsAssignment_3_1 )
            {
             before(grammarAccess.getEventAccess().getConditionsAssignment_3_1()); 
            // InternalMyDsl.g:3083:2: ( rule__Event__ConditionsAssignment_3_1 )
            // InternalMyDsl.g:3083:3: rule__Event__ConditionsAssignment_3_1
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
    // InternalMyDsl.g:3091:1: rule__Event__Group_3__2 : rule__Event__Group_3__2__Impl ;
    public final void rule__Event__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3095:1: ( rule__Event__Group_3__2__Impl )
            // InternalMyDsl.g:3096:2: rule__Event__Group_3__2__Impl
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
    // InternalMyDsl.g:3102:1: rule__Event__Group_3__2__Impl : ( ( rule__Event__Group_3_2__0 )* ) ;
    public final void rule__Event__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3106:1: ( ( ( rule__Event__Group_3_2__0 )* ) )
            // InternalMyDsl.g:3107:1: ( ( rule__Event__Group_3_2__0 )* )
            {
            // InternalMyDsl.g:3107:1: ( ( rule__Event__Group_3_2__0 )* )
            // InternalMyDsl.g:3108:2: ( rule__Event__Group_3_2__0 )*
            {
             before(grammarAccess.getEventAccess().getGroup_3_2()); 
            // InternalMyDsl.g:3109:2: ( rule__Event__Group_3_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==41) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:3109:3: rule__Event__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__Event__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalMyDsl.g:3118:1: rule__Event__Group_3_2__0 : rule__Event__Group_3_2__0__Impl rule__Event__Group_3_2__1 ;
    public final void rule__Event__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3122:1: ( rule__Event__Group_3_2__0__Impl rule__Event__Group_3_2__1 )
            // InternalMyDsl.g:3123:2: rule__Event__Group_3_2__0__Impl rule__Event__Group_3_2__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalMyDsl.g:3130:1: rule__Event__Group_3_2__0__Impl : ( 'and' ) ;
    public final void rule__Event__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3134:1: ( ( 'and' ) )
            // InternalMyDsl.g:3135:1: ( 'and' )
            {
            // InternalMyDsl.g:3135:1: ( 'and' )
            // InternalMyDsl.g:3136:2: 'and'
            {
             before(grammarAccess.getEventAccess().getAndKeyword_3_2_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:3145:1: rule__Event__Group_3_2__1 : rule__Event__Group_3_2__1__Impl ;
    public final void rule__Event__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3149:1: ( rule__Event__Group_3_2__1__Impl )
            // InternalMyDsl.g:3150:2: rule__Event__Group_3_2__1__Impl
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
    // InternalMyDsl.g:3156:1: rule__Event__Group_3_2__1__Impl : ( ( rule__Event__ConditionsAssignment_3_2_1 ) ) ;
    public final void rule__Event__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3160:1: ( ( ( rule__Event__ConditionsAssignment_3_2_1 ) ) )
            // InternalMyDsl.g:3161:1: ( ( rule__Event__ConditionsAssignment_3_2_1 ) )
            {
            // InternalMyDsl.g:3161:1: ( ( rule__Event__ConditionsAssignment_3_2_1 ) )
            // InternalMyDsl.g:3162:2: ( rule__Event__ConditionsAssignment_3_2_1 )
            {
             before(grammarAccess.getEventAccess().getConditionsAssignment_3_2_1()); 
            // InternalMyDsl.g:3163:2: ( rule__Event__ConditionsAssignment_3_2_1 )
            // InternalMyDsl.g:3163:3: rule__Event__ConditionsAssignment_3_2_1
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
    // InternalMyDsl.g:3172:1: rule__Event__Group_4__0 : rule__Event__Group_4__0__Impl rule__Event__Group_4__1 ;
    public final void rule__Event__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3176:1: ( rule__Event__Group_4__0__Impl rule__Event__Group_4__1 )
            // InternalMyDsl.g:3177:2: rule__Event__Group_4__0__Impl rule__Event__Group_4__1
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
    // InternalMyDsl.g:3184:1: rule__Event__Group_4__0__Impl : ( 'actions:' ) ;
    public final void rule__Event__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3188:1: ( ( 'actions:' ) )
            // InternalMyDsl.g:3189:1: ( 'actions:' )
            {
            // InternalMyDsl.g:3189:1: ( 'actions:' )
            // InternalMyDsl.g:3190:2: 'actions:'
            {
             before(grammarAccess.getEventAccess().getActionsKeyword_4_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyDsl.g:3199:1: rule__Event__Group_4__1 : rule__Event__Group_4__1__Impl rule__Event__Group_4__2 ;
    public final void rule__Event__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3203:1: ( rule__Event__Group_4__1__Impl rule__Event__Group_4__2 )
            // InternalMyDsl.g:3204:2: rule__Event__Group_4__1__Impl rule__Event__Group_4__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:3211:1: rule__Event__Group_4__1__Impl : ( ( rule__Event__ActionsAssignment_4_1 ) ) ;
    public final void rule__Event__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3215:1: ( ( ( rule__Event__ActionsAssignment_4_1 ) ) )
            // InternalMyDsl.g:3216:1: ( ( rule__Event__ActionsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:3216:1: ( ( rule__Event__ActionsAssignment_4_1 ) )
            // InternalMyDsl.g:3217:2: ( rule__Event__ActionsAssignment_4_1 )
            {
             before(grammarAccess.getEventAccess().getActionsAssignment_4_1()); 
            // InternalMyDsl.g:3218:2: ( rule__Event__ActionsAssignment_4_1 )
            // InternalMyDsl.g:3218:3: rule__Event__ActionsAssignment_4_1
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
    // InternalMyDsl.g:3226:1: rule__Event__Group_4__2 : rule__Event__Group_4__2__Impl ;
    public final void rule__Event__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3230:1: ( rule__Event__Group_4__2__Impl )
            // InternalMyDsl.g:3231:2: rule__Event__Group_4__2__Impl
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
    // InternalMyDsl.g:3237:1: rule__Event__Group_4__2__Impl : ( ( rule__Event__Group_4_2__0 )* ) ;
    public final void rule__Event__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3241:1: ( ( ( rule__Event__Group_4_2__0 )* ) )
            // InternalMyDsl.g:3242:1: ( ( rule__Event__Group_4_2__0 )* )
            {
            // InternalMyDsl.g:3242:1: ( ( rule__Event__Group_4_2__0 )* )
            // InternalMyDsl.g:3243:2: ( rule__Event__Group_4_2__0 )*
            {
             before(grammarAccess.getEventAccess().getGroup_4_2()); 
            // InternalMyDsl.g:3244:2: ( rule__Event__Group_4_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==43) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:3244:3: rule__Event__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__Event__Group_4_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalMyDsl.g:3253:1: rule__Event__Group_4_2__0 : rule__Event__Group_4_2__0__Impl rule__Event__Group_4_2__1 ;
    public final void rule__Event__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3257:1: ( rule__Event__Group_4_2__0__Impl rule__Event__Group_4_2__1 )
            // InternalMyDsl.g:3258:2: rule__Event__Group_4_2__0__Impl rule__Event__Group_4_2__1
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
    // InternalMyDsl.g:3265:1: rule__Event__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3269:1: ( ( ',' ) )
            // InternalMyDsl.g:3270:1: ( ',' )
            {
            // InternalMyDsl.g:3270:1: ( ',' )
            // InternalMyDsl.g:3271:2: ','
            {
             before(grammarAccess.getEventAccess().getCommaKeyword_4_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:3280:1: rule__Event__Group_4_2__1 : rule__Event__Group_4_2__1__Impl ;
    public final void rule__Event__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3284:1: ( rule__Event__Group_4_2__1__Impl )
            // InternalMyDsl.g:3285:2: rule__Event__Group_4_2__1__Impl
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
    // InternalMyDsl.g:3291:1: rule__Event__Group_4_2__1__Impl : ( ( rule__Event__ActionsAssignment_4_2_1 ) ) ;
    public final void rule__Event__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3295:1: ( ( ( rule__Event__ActionsAssignment_4_2_1 ) ) )
            // InternalMyDsl.g:3296:1: ( ( rule__Event__ActionsAssignment_4_2_1 ) )
            {
            // InternalMyDsl.g:3296:1: ( ( rule__Event__ActionsAssignment_4_2_1 ) )
            // InternalMyDsl.g:3297:2: ( rule__Event__ActionsAssignment_4_2_1 )
            {
             before(grammarAccess.getEventAccess().getActionsAssignment_4_2_1()); 
            // InternalMyDsl.g:3298:2: ( rule__Event__ActionsAssignment_4_2_1 )
            // InternalMyDsl.g:3298:3: rule__Event__ActionsAssignment_4_2_1
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
    // InternalMyDsl.g:3307:1: rule__Sound__Group__0 : rule__Sound__Group__0__Impl rule__Sound__Group__1 ;
    public final void rule__Sound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3311:1: ( rule__Sound__Group__0__Impl rule__Sound__Group__1 )
            // InternalMyDsl.g:3312:2: rule__Sound__Group__0__Impl rule__Sound__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalMyDsl.g:3319:1: rule__Sound__Group__0__Impl : ( () ) ;
    public final void rule__Sound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3323:1: ( ( () ) )
            // InternalMyDsl.g:3324:1: ( () )
            {
            // InternalMyDsl.g:3324:1: ( () )
            // InternalMyDsl.g:3325:2: ()
            {
             before(grammarAccess.getSoundAccess().getSoundAction_0()); 
            // InternalMyDsl.g:3326:2: ()
            // InternalMyDsl.g:3326:3: 
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
    // InternalMyDsl.g:3334:1: rule__Sound__Group__1 : rule__Sound__Group__1__Impl rule__Sound__Group__2 ;
    public final void rule__Sound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3338:1: ( rule__Sound__Group__1__Impl rule__Sound__Group__2 )
            // InternalMyDsl.g:3339:2: rule__Sound__Group__1__Impl rule__Sound__Group__2
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
    // InternalMyDsl.g:3346:1: rule__Sound__Group__1__Impl : ( 'Sound' ) ;
    public final void rule__Sound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3350:1: ( ( 'Sound' ) )
            // InternalMyDsl.g:3351:1: ( 'Sound' )
            {
            // InternalMyDsl.g:3351:1: ( 'Sound' )
            // InternalMyDsl.g:3352:2: 'Sound'
            {
             before(grammarAccess.getSoundAccess().getSoundKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalMyDsl.g:3361:1: rule__Sound__Group__2 : rule__Sound__Group__2__Impl ;
    public final void rule__Sound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3365:1: ( rule__Sound__Group__2__Impl )
            // InternalMyDsl.g:3366:2: rule__Sound__Group__2__Impl
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
    // InternalMyDsl.g:3372:1: rule__Sound__Group__2__Impl : ( ( rule__Sound__ConditionnameAssignment_2 ) ) ;
    public final void rule__Sound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3376:1: ( ( ( rule__Sound__ConditionnameAssignment_2 ) ) )
            // InternalMyDsl.g:3377:1: ( ( rule__Sound__ConditionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:3377:1: ( ( rule__Sound__ConditionnameAssignment_2 ) )
            // InternalMyDsl.g:3378:2: ( rule__Sound__ConditionnameAssignment_2 )
            {
             before(grammarAccess.getSoundAccess().getConditionnameAssignment_2()); 
            // InternalMyDsl.g:3379:2: ( rule__Sound__ConditionnameAssignment_2 )
            // InternalMyDsl.g:3379:3: rule__Sound__ConditionnameAssignment_2
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
    // InternalMyDsl.g:3388:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3392:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // InternalMyDsl.g:3393:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMyDsl.g:3400:1: rule__Button__Group__0__Impl : ( () ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3404:1: ( ( () ) )
            // InternalMyDsl.g:3405:1: ( () )
            {
            // InternalMyDsl.g:3405:1: ( () )
            // InternalMyDsl.g:3406:2: ()
            {
             before(grammarAccess.getButtonAccess().getButtonAction_0()); 
            // InternalMyDsl.g:3407:2: ()
            // InternalMyDsl.g:3407:3: 
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
    // InternalMyDsl.g:3415:1: rule__Button__Group__1 : rule__Button__Group__1__Impl rule__Button__Group__2 ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3419:1: ( rule__Button__Group__1__Impl rule__Button__Group__2 )
            // InternalMyDsl.g:3420:2: rule__Button__Group__1__Impl rule__Button__Group__2
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
    // InternalMyDsl.g:3427:1: rule__Button__Group__1__Impl : ( 'Button' ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3431:1: ( ( 'Button' ) )
            // InternalMyDsl.g:3432:1: ( 'Button' )
            {
            // InternalMyDsl.g:3432:1: ( 'Button' )
            // InternalMyDsl.g:3433:2: 'Button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalMyDsl.g:3442:1: rule__Button__Group__2 : rule__Button__Group__2__Impl rule__Button__Group__3 ;
    public final void rule__Button__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3446:1: ( rule__Button__Group__2__Impl rule__Button__Group__3 )
            // InternalMyDsl.g:3447:2: rule__Button__Group__2__Impl rule__Button__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalMyDsl.g:3454:1: rule__Button__Group__2__Impl : ( ( rule__Button__ConditionnameAssignment_2 ) ) ;
    public final void rule__Button__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3458:1: ( ( ( rule__Button__ConditionnameAssignment_2 ) ) )
            // InternalMyDsl.g:3459:1: ( ( rule__Button__ConditionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:3459:1: ( ( rule__Button__ConditionnameAssignment_2 ) )
            // InternalMyDsl.g:3460:2: ( rule__Button__ConditionnameAssignment_2 )
            {
             before(grammarAccess.getButtonAccess().getConditionnameAssignment_2()); 
            // InternalMyDsl.g:3461:2: ( rule__Button__ConditionnameAssignment_2 )
            // InternalMyDsl.g:3461:3: rule__Button__ConditionnameAssignment_2
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
    // InternalMyDsl.g:3469:1: rule__Button__Group__3 : rule__Button__Group__3__Impl rule__Button__Group__4 ;
    public final void rule__Button__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3473:1: ( rule__Button__Group__3__Impl rule__Button__Group__4 )
            // InternalMyDsl.g:3474:2: rule__Button__Group__3__Impl rule__Button__Group__4
            {
            pushFollow(FOLLOW_36);
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
    // InternalMyDsl.g:3481:1: rule__Button__Group__3__Impl : ( 'button' ) ;
    public final void rule__Button__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3485:1: ( ( 'button' ) )
            // InternalMyDsl.g:3486:1: ( 'button' )
            {
            // InternalMyDsl.g:3486:1: ( 'button' )
            // InternalMyDsl.g:3487:2: 'button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalMyDsl.g:3496:1: rule__Button__Group__4 : rule__Button__Group__4__Impl ;
    public final void rule__Button__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3500:1: ( rule__Button__Group__4__Impl )
            // InternalMyDsl.g:3501:2: rule__Button__Group__4__Impl
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
    // InternalMyDsl.g:3507:1: rule__Button__Group__4__Impl : ( ( rule__Button__ButtonAssignment_4 ) ) ;
    public final void rule__Button__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3511:1: ( ( ( rule__Button__ButtonAssignment_4 ) ) )
            // InternalMyDsl.g:3512:1: ( ( rule__Button__ButtonAssignment_4 ) )
            {
            // InternalMyDsl.g:3512:1: ( ( rule__Button__ButtonAssignment_4 ) )
            // InternalMyDsl.g:3513:2: ( rule__Button__ButtonAssignment_4 )
            {
             before(grammarAccess.getButtonAccess().getButtonAssignment_4()); 
            // InternalMyDsl.g:3514:2: ( rule__Button__ButtonAssignment_4 )
            // InternalMyDsl.g:3514:3: rule__Button__ButtonAssignment_4
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
    // InternalMyDsl.g:3523:1: rule__Sensor__Group__0 : rule__Sensor__Group__0__Impl rule__Sensor__Group__1 ;
    public final void rule__Sensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3527:1: ( rule__Sensor__Group__0__Impl rule__Sensor__Group__1 )
            // InternalMyDsl.g:3528:2: rule__Sensor__Group__0__Impl rule__Sensor__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalMyDsl.g:3535:1: rule__Sensor__Group__0__Impl : ( () ) ;
    public final void rule__Sensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3539:1: ( ( () ) )
            // InternalMyDsl.g:3540:1: ( () )
            {
            // InternalMyDsl.g:3540:1: ( () )
            // InternalMyDsl.g:3541:2: ()
            {
             before(grammarAccess.getSensorAccess().getSensorAction_0()); 
            // InternalMyDsl.g:3542:2: ()
            // InternalMyDsl.g:3542:3: 
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
    // InternalMyDsl.g:3550:1: rule__Sensor__Group__1 : rule__Sensor__Group__1__Impl rule__Sensor__Group__2 ;
    public final void rule__Sensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3554:1: ( rule__Sensor__Group__1__Impl rule__Sensor__Group__2 )
            // InternalMyDsl.g:3555:2: rule__Sensor__Group__1__Impl rule__Sensor__Group__2
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
    // InternalMyDsl.g:3562:1: rule__Sensor__Group__1__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3566:1: ( ( 'Sensor' ) )
            // InternalMyDsl.g:3567:1: ( 'Sensor' )
            {
            // InternalMyDsl.g:3567:1: ( 'Sensor' )
            // InternalMyDsl.g:3568:2: 'Sensor'
            {
             before(grammarAccess.getSensorAccess().getSensorKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalMyDsl.g:3577:1: rule__Sensor__Group__2 : rule__Sensor__Group__2__Impl rule__Sensor__Group__3 ;
    public final void rule__Sensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3581:1: ( rule__Sensor__Group__2__Impl rule__Sensor__Group__3 )
            // InternalMyDsl.g:3582:2: rule__Sensor__Group__2__Impl rule__Sensor__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalMyDsl.g:3589:1: rule__Sensor__Group__2__Impl : ( ( rule__Sensor__ConditionnameAssignment_2 ) ) ;
    public final void rule__Sensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3593:1: ( ( ( rule__Sensor__ConditionnameAssignment_2 ) ) )
            // InternalMyDsl.g:3594:1: ( ( rule__Sensor__ConditionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:3594:1: ( ( rule__Sensor__ConditionnameAssignment_2 ) )
            // InternalMyDsl.g:3595:2: ( rule__Sensor__ConditionnameAssignment_2 )
            {
             before(grammarAccess.getSensorAccess().getConditionnameAssignment_2()); 
            // InternalMyDsl.g:3596:2: ( rule__Sensor__ConditionnameAssignment_2 )
            // InternalMyDsl.g:3596:3: rule__Sensor__ConditionnameAssignment_2
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
    // InternalMyDsl.g:3604:1: rule__Sensor__Group__3 : rule__Sensor__Group__3__Impl rule__Sensor__Group__4 ;
    public final void rule__Sensor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3608:1: ( rule__Sensor__Group__3__Impl rule__Sensor__Group__4 )
            // InternalMyDsl.g:3609:2: rule__Sensor__Group__3__Impl rule__Sensor__Group__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:3616:1: rule__Sensor__Group__3__Impl : ( 'sensorPos' ) ;
    public final void rule__Sensor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3620:1: ( ( 'sensorPos' ) )
            // InternalMyDsl.g:3621:1: ( 'sensorPos' )
            {
            // InternalMyDsl.g:3621:1: ( 'sensorPos' )
            // InternalMyDsl.g:3622:2: 'sensorPos'
            {
             before(grammarAccess.getSensorAccess().getSensorPosKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalMyDsl.g:3631:1: rule__Sensor__Group__4 : rule__Sensor__Group__4__Impl rule__Sensor__Group__5 ;
    public final void rule__Sensor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3635:1: ( rule__Sensor__Group__4__Impl rule__Sensor__Group__5 )
            // InternalMyDsl.g:3636:2: rule__Sensor__Group__4__Impl rule__Sensor__Group__5
            {
            pushFollow(FOLLOW_40);
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
    // InternalMyDsl.g:3643:1: rule__Sensor__Group__4__Impl : ( ( rule__Sensor__SensorPosAssignment_4 ) ) ;
    public final void rule__Sensor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3647:1: ( ( ( rule__Sensor__SensorPosAssignment_4 ) ) )
            // InternalMyDsl.g:3648:1: ( ( rule__Sensor__SensorPosAssignment_4 ) )
            {
            // InternalMyDsl.g:3648:1: ( ( rule__Sensor__SensorPosAssignment_4 ) )
            // InternalMyDsl.g:3649:2: ( rule__Sensor__SensorPosAssignment_4 )
            {
             before(grammarAccess.getSensorAccess().getSensorPosAssignment_4()); 
            // InternalMyDsl.g:3650:2: ( rule__Sensor__SensorPosAssignment_4 )
            // InternalMyDsl.g:3650:3: rule__Sensor__SensorPosAssignment_4
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


    // $ANTLR start "rule__Sensor__Group__5"
    // InternalMyDsl.g:3658:1: rule__Sensor__Group__5 : rule__Sensor__Group__5__Impl rule__Sensor__Group__6 ;
    public final void rule__Sensor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3662:1: ( rule__Sensor__Group__5__Impl rule__Sensor__Group__6 )
            // InternalMyDsl.g:3663:2: rule__Sensor__Group__5__Impl rule__Sensor__Group__6
            {
            pushFollow(FOLLOW_41);
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
    // InternalMyDsl.g:3670:1: rule__Sensor__Group__5__Impl : ( 'distance' ) ;
    public final void rule__Sensor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3674:1: ( ( 'distance' ) )
            // InternalMyDsl.g:3675:1: ( 'distance' )
            {
            // InternalMyDsl.g:3675:1: ( 'distance' )
            // InternalMyDsl.g:3676:2: 'distance'
            {
             before(grammarAccess.getSensorAccess().getDistanceKeyword_5()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getSensorAccess().getDistanceKeyword_5()); 

            }


            }

        }
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
    // InternalMyDsl.g:3685:1: rule__Sensor__Group__6 : rule__Sensor__Group__6__Impl ;
    public final void rule__Sensor__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3689:1: ( rule__Sensor__Group__6__Impl )
            // InternalMyDsl.g:3690:2: rule__Sensor__Group__6__Impl
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
    // InternalMyDsl.g:3696:1: rule__Sensor__Group__6__Impl : ( ( rule__Sensor__DistanceAssignment_6 ) ) ;
    public final void rule__Sensor__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3700:1: ( ( ( rule__Sensor__DistanceAssignment_6 ) ) )
            // InternalMyDsl.g:3701:1: ( ( rule__Sensor__DistanceAssignment_6 ) )
            {
            // InternalMyDsl.g:3701:1: ( ( rule__Sensor__DistanceAssignment_6 ) )
            // InternalMyDsl.g:3702:2: ( rule__Sensor__DistanceAssignment_6 )
            {
             before(grammarAccess.getSensorAccess().getDistanceAssignment_6()); 
            // InternalMyDsl.g:3703:2: ( rule__Sensor__DistanceAssignment_6 )
            // InternalMyDsl.g:3703:3: rule__Sensor__DistanceAssignment_6
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
    // InternalMyDsl.g:3712:1: rule__Tap__Group__0 : rule__Tap__Group__0__Impl rule__Tap__Group__1 ;
    public final void rule__Tap__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3716:1: ( rule__Tap__Group__0__Impl rule__Tap__Group__1 )
            // InternalMyDsl.g:3717:2: rule__Tap__Group__0__Impl rule__Tap__Group__1
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
    // InternalMyDsl.g:3724:1: rule__Tap__Group__0__Impl : ( () ) ;
    public final void rule__Tap__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3728:1: ( ( () ) )
            // InternalMyDsl.g:3729:1: ( () )
            {
            // InternalMyDsl.g:3729:1: ( () )
            // InternalMyDsl.g:3730:2: ()
            {
             before(grammarAccess.getTapAccess().getTapAction_0()); 
            // InternalMyDsl.g:3731:2: ()
            // InternalMyDsl.g:3731:3: 
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
    // InternalMyDsl.g:3739:1: rule__Tap__Group__1 : rule__Tap__Group__1__Impl rule__Tap__Group__2 ;
    public final void rule__Tap__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3743:1: ( rule__Tap__Group__1__Impl rule__Tap__Group__2 )
            // InternalMyDsl.g:3744:2: rule__Tap__Group__1__Impl rule__Tap__Group__2
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
    // InternalMyDsl.g:3751:1: rule__Tap__Group__1__Impl : ( 'Tap' ) ;
    public final void rule__Tap__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3755:1: ( ( 'Tap' ) )
            // InternalMyDsl.g:3756:1: ( 'Tap' )
            {
            // InternalMyDsl.g:3756:1: ( 'Tap' )
            // InternalMyDsl.g:3757:2: 'Tap'
            {
             before(grammarAccess.getTapAccess().getTapKeyword_1()); 
            match(input,50,FOLLOW_2); 
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
    // InternalMyDsl.g:3766:1: rule__Tap__Group__2 : rule__Tap__Group__2__Impl ;
    public final void rule__Tap__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3770:1: ( rule__Tap__Group__2__Impl )
            // InternalMyDsl.g:3771:2: rule__Tap__Group__2__Impl
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
    // InternalMyDsl.g:3777:1: rule__Tap__Group__2__Impl : ( ( rule__Tap__ConditionnameAssignment_2 ) ) ;
    public final void rule__Tap__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3781:1: ( ( ( rule__Tap__ConditionnameAssignment_2 ) ) )
            // InternalMyDsl.g:3782:1: ( ( rule__Tap__ConditionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:3782:1: ( ( rule__Tap__ConditionnameAssignment_2 ) )
            // InternalMyDsl.g:3783:2: ( rule__Tap__ConditionnameAssignment_2 )
            {
             before(grammarAccess.getTapAccess().getConditionnameAssignment_2()); 
            // InternalMyDsl.g:3784:2: ( rule__Tap__ConditionnameAssignment_2 )
            // InternalMyDsl.g:3784:3: rule__Tap__ConditionnameAssignment_2
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
    // InternalMyDsl.g:3793:1: rule__MotorAction__Group__0 : rule__MotorAction__Group__0__Impl rule__MotorAction__Group__1 ;
    public final void rule__MotorAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3797:1: ( rule__MotorAction__Group__0__Impl rule__MotorAction__Group__1 )
            // InternalMyDsl.g:3798:2: rule__MotorAction__Group__0__Impl rule__MotorAction__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalMyDsl.g:3805:1: rule__MotorAction__Group__0__Impl : ( () ) ;
    public final void rule__MotorAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3809:1: ( ( () ) )
            // InternalMyDsl.g:3810:1: ( () )
            {
            // InternalMyDsl.g:3810:1: ( () )
            // InternalMyDsl.g:3811:2: ()
            {
             before(grammarAccess.getMotorActionAccess().getMotorActionAction_0()); 
            // InternalMyDsl.g:3812:2: ()
            // InternalMyDsl.g:3812:3: 
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
    // InternalMyDsl.g:3820:1: rule__MotorAction__Group__1 : rule__MotorAction__Group__1__Impl rule__MotorAction__Group__2 ;
    public final void rule__MotorAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3824:1: ( rule__MotorAction__Group__1__Impl rule__MotorAction__Group__2 )
            // InternalMyDsl.g:3825:2: rule__MotorAction__Group__1__Impl rule__MotorAction__Group__2
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
    // InternalMyDsl.g:3832:1: rule__MotorAction__Group__1__Impl : ( 'MotorAction' ) ;
    public final void rule__MotorAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3836:1: ( ( 'MotorAction' ) )
            // InternalMyDsl.g:3837:1: ( 'MotorAction' )
            {
            // InternalMyDsl.g:3837:1: ( 'MotorAction' )
            // InternalMyDsl.g:3838:2: 'MotorAction'
            {
             before(grammarAccess.getMotorActionAccess().getMotorActionKeyword_1()); 
            match(input,51,FOLLOW_2); 
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
    // InternalMyDsl.g:3847:1: rule__MotorAction__Group__2 : rule__MotorAction__Group__2__Impl rule__MotorAction__Group__3 ;
    public final void rule__MotorAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3851:1: ( rule__MotorAction__Group__2__Impl rule__MotorAction__Group__3 )
            // InternalMyDsl.g:3852:2: rule__MotorAction__Group__2__Impl rule__MotorAction__Group__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:3859:1: rule__MotorAction__Group__2__Impl : ( ( rule__MotorAction__ActionnameAssignment_2 ) ) ;
    public final void rule__MotorAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3863:1: ( ( ( rule__MotorAction__ActionnameAssignment_2 ) ) )
            // InternalMyDsl.g:3864:1: ( ( rule__MotorAction__ActionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:3864:1: ( ( rule__MotorAction__ActionnameAssignment_2 ) )
            // InternalMyDsl.g:3865:2: ( rule__MotorAction__ActionnameAssignment_2 )
            {
             before(grammarAccess.getMotorActionAccess().getActionnameAssignment_2()); 
            // InternalMyDsl.g:3866:2: ( rule__MotorAction__ActionnameAssignment_2 )
            // InternalMyDsl.g:3866:3: rule__MotorAction__ActionnameAssignment_2
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
    // InternalMyDsl.g:3874:1: rule__MotorAction__Group__3 : rule__MotorAction__Group__3__Impl rule__MotorAction__Group__4 ;
    public final void rule__MotorAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3878:1: ( rule__MotorAction__Group__3__Impl rule__MotorAction__Group__4 )
            // InternalMyDsl.g:3879:2: rule__MotorAction__Group__3__Impl rule__MotorAction__Group__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalMyDsl.g:3886:1: rule__MotorAction__Group__3__Impl : ( ( rule__MotorAction__Group_3__0 )? ) ;
    public final void rule__MotorAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3890:1: ( ( ( rule__MotorAction__Group_3__0 )? ) )
            // InternalMyDsl.g:3891:1: ( ( rule__MotorAction__Group_3__0 )? )
            {
            // InternalMyDsl.g:3891:1: ( ( rule__MotorAction__Group_3__0 )? )
            // InternalMyDsl.g:3892:2: ( rule__MotorAction__Group_3__0 )?
            {
             before(grammarAccess.getMotorActionAccess().getGroup_3()); 
            // InternalMyDsl.g:3893:2: ( rule__MotorAction__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==52) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:3893:3: rule__MotorAction__Group_3__0
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
    // InternalMyDsl.g:3901:1: rule__MotorAction__Group__4 : rule__MotorAction__Group__4__Impl ;
    public final void rule__MotorAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3905:1: ( rule__MotorAction__Group__4__Impl )
            // InternalMyDsl.g:3906:2: rule__MotorAction__Group__4__Impl
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
    // InternalMyDsl.g:3912:1: rule__MotorAction__Group__4__Impl : ( ( rule__MotorAction__Group_4__0 )? ) ;
    public final void rule__MotorAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3916:1: ( ( ( rule__MotorAction__Group_4__0 )? ) )
            // InternalMyDsl.g:3917:1: ( ( rule__MotorAction__Group_4__0 )? )
            {
            // InternalMyDsl.g:3917:1: ( ( rule__MotorAction__Group_4__0 )? )
            // InternalMyDsl.g:3918:2: ( rule__MotorAction__Group_4__0 )?
            {
             before(grammarAccess.getMotorActionAccess().getGroup_4()); 
            // InternalMyDsl.g:3919:2: ( rule__MotorAction__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==53) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:3919:3: rule__MotorAction__Group_4__0
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
    // InternalMyDsl.g:3928:1: rule__MotorAction__Group_3__0 : rule__MotorAction__Group_3__0__Impl rule__MotorAction__Group_3__1 ;
    public final void rule__MotorAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3932:1: ( rule__MotorAction__Group_3__0__Impl rule__MotorAction__Group_3__1 )
            // InternalMyDsl.g:3933:2: rule__MotorAction__Group_3__0__Impl rule__MotorAction__Group_3__1
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
    // InternalMyDsl.g:3940:1: rule__MotorAction__Group_3__0__Impl : ( 'motorLeft' ) ;
    public final void rule__MotorAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3944:1: ( ( 'motorLeft' ) )
            // InternalMyDsl.g:3945:1: ( 'motorLeft' )
            {
            // InternalMyDsl.g:3945:1: ( 'motorLeft' )
            // InternalMyDsl.g:3946:2: 'motorLeft'
            {
             before(grammarAccess.getMotorActionAccess().getMotorLeftKeyword_3_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalMyDsl.g:3955:1: rule__MotorAction__Group_3__1 : rule__MotorAction__Group_3__1__Impl ;
    public final void rule__MotorAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3959:1: ( rule__MotorAction__Group_3__1__Impl )
            // InternalMyDsl.g:3960:2: rule__MotorAction__Group_3__1__Impl
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
    // InternalMyDsl.g:3966:1: rule__MotorAction__Group_3__1__Impl : ( ( rule__MotorAction__LeftAssignment_3_1 ) ) ;
    public final void rule__MotorAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3970:1: ( ( ( rule__MotorAction__LeftAssignment_3_1 ) ) )
            // InternalMyDsl.g:3971:1: ( ( rule__MotorAction__LeftAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3971:1: ( ( rule__MotorAction__LeftAssignment_3_1 ) )
            // InternalMyDsl.g:3972:2: ( rule__MotorAction__LeftAssignment_3_1 )
            {
             before(grammarAccess.getMotorActionAccess().getLeftAssignment_3_1()); 
            // InternalMyDsl.g:3973:2: ( rule__MotorAction__LeftAssignment_3_1 )
            // InternalMyDsl.g:3973:3: rule__MotorAction__LeftAssignment_3_1
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
    // InternalMyDsl.g:3982:1: rule__MotorAction__Group_4__0 : rule__MotorAction__Group_4__0__Impl rule__MotorAction__Group_4__1 ;
    public final void rule__MotorAction__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3986:1: ( rule__MotorAction__Group_4__0__Impl rule__MotorAction__Group_4__1 )
            // InternalMyDsl.g:3987:2: rule__MotorAction__Group_4__0__Impl rule__MotorAction__Group_4__1
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
    // InternalMyDsl.g:3994:1: rule__MotorAction__Group_4__0__Impl : ( 'motorRight' ) ;
    public final void rule__MotorAction__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3998:1: ( ( 'motorRight' ) )
            // InternalMyDsl.g:3999:1: ( 'motorRight' )
            {
            // InternalMyDsl.g:3999:1: ( 'motorRight' )
            // InternalMyDsl.g:4000:2: 'motorRight'
            {
             before(grammarAccess.getMotorActionAccess().getMotorRightKeyword_4_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalMyDsl.g:4009:1: rule__MotorAction__Group_4__1 : rule__MotorAction__Group_4__1__Impl ;
    public final void rule__MotorAction__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4013:1: ( rule__MotorAction__Group_4__1__Impl )
            // InternalMyDsl.g:4014:2: rule__MotorAction__Group_4__1__Impl
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
    // InternalMyDsl.g:4020:1: rule__MotorAction__Group_4__1__Impl : ( ( rule__MotorAction__RightAssignment_4_1 ) ) ;
    public final void rule__MotorAction__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4024:1: ( ( ( rule__MotorAction__RightAssignment_4_1 ) ) )
            // InternalMyDsl.g:4025:1: ( ( rule__MotorAction__RightAssignment_4_1 ) )
            {
            // InternalMyDsl.g:4025:1: ( ( rule__MotorAction__RightAssignment_4_1 ) )
            // InternalMyDsl.g:4026:2: ( rule__MotorAction__RightAssignment_4_1 )
            {
             before(grammarAccess.getMotorActionAccess().getRightAssignment_4_1()); 
            // InternalMyDsl.g:4027:2: ( rule__MotorAction__RightAssignment_4_1 )
            // InternalMyDsl.g:4027:3: rule__MotorAction__RightAssignment_4_1
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
    // InternalMyDsl.g:4036:1: rule__SoundAction__Group__0 : rule__SoundAction__Group__0__Impl rule__SoundAction__Group__1 ;
    public final void rule__SoundAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4040:1: ( rule__SoundAction__Group__0__Impl rule__SoundAction__Group__1 )
            // InternalMyDsl.g:4041:2: rule__SoundAction__Group__0__Impl rule__SoundAction__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalMyDsl.g:4048:1: rule__SoundAction__Group__0__Impl : ( () ) ;
    public final void rule__SoundAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4052:1: ( ( () ) )
            // InternalMyDsl.g:4053:1: ( () )
            {
            // InternalMyDsl.g:4053:1: ( () )
            // InternalMyDsl.g:4054:2: ()
            {
             before(grammarAccess.getSoundActionAccess().getSoundActionAction_0()); 
            // InternalMyDsl.g:4055:2: ()
            // InternalMyDsl.g:4055:3: 
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
    // InternalMyDsl.g:4063:1: rule__SoundAction__Group__1 : rule__SoundAction__Group__1__Impl rule__SoundAction__Group__2 ;
    public final void rule__SoundAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4067:1: ( rule__SoundAction__Group__1__Impl rule__SoundAction__Group__2 )
            // InternalMyDsl.g:4068:2: rule__SoundAction__Group__1__Impl rule__SoundAction__Group__2
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
    // InternalMyDsl.g:4075:1: rule__SoundAction__Group__1__Impl : ( 'SoundAction' ) ;
    public final void rule__SoundAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4079:1: ( ( 'SoundAction' ) )
            // InternalMyDsl.g:4080:1: ( 'SoundAction' )
            {
            // InternalMyDsl.g:4080:1: ( 'SoundAction' )
            // InternalMyDsl.g:4081:2: 'SoundAction'
            {
             before(grammarAccess.getSoundActionAccess().getSoundActionKeyword_1()); 
            match(input,54,FOLLOW_2); 
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
    // InternalMyDsl.g:4090:1: rule__SoundAction__Group__2 : rule__SoundAction__Group__2__Impl rule__SoundAction__Group__3 ;
    public final void rule__SoundAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4094:1: ( rule__SoundAction__Group__2__Impl rule__SoundAction__Group__3 )
            // InternalMyDsl.g:4095:2: rule__SoundAction__Group__2__Impl rule__SoundAction__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalMyDsl.g:4102:1: rule__SoundAction__Group__2__Impl : ( ( rule__SoundAction__ActionnameAssignment_2 ) ) ;
    public final void rule__SoundAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4106:1: ( ( ( rule__SoundAction__ActionnameAssignment_2 ) ) )
            // InternalMyDsl.g:4107:1: ( ( rule__SoundAction__ActionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:4107:1: ( ( rule__SoundAction__ActionnameAssignment_2 ) )
            // InternalMyDsl.g:4108:2: ( rule__SoundAction__ActionnameAssignment_2 )
            {
             before(grammarAccess.getSoundActionAccess().getActionnameAssignment_2()); 
            // InternalMyDsl.g:4109:2: ( rule__SoundAction__ActionnameAssignment_2 )
            // InternalMyDsl.g:4109:3: rule__SoundAction__ActionnameAssignment_2
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
    // InternalMyDsl.g:4117:1: rule__SoundAction__Group__3 : rule__SoundAction__Group__3__Impl ;
    public final void rule__SoundAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4121:1: ( rule__SoundAction__Group__3__Impl )
            // InternalMyDsl.g:4122:2: rule__SoundAction__Group__3__Impl
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
    // InternalMyDsl.g:4128:1: rule__SoundAction__Group__3__Impl : ( ( rule__SoundAction__Group_3__0 )? ) ;
    public final void rule__SoundAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4132:1: ( ( ( rule__SoundAction__Group_3__0 )? ) )
            // InternalMyDsl.g:4133:1: ( ( rule__SoundAction__Group_3__0 )? )
            {
            // InternalMyDsl.g:4133:1: ( ( rule__SoundAction__Group_3__0 )? )
            // InternalMyDsl.g:4134:2: ( rule__SoundAction__Group_3__0 )?
            {
             before(grammarAccess.getSoundActionAccess().getGroup_3()); 
            // InternalMyDsl.g:4135:2: ( rule__SoundAction__Group_3__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==55) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:4135:3: rule__SoundAction__Group_3__0
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
    // InternalMyDsl.g:4144:1: rule__SoundAction__Group_3__0 : rule__SoundAction__Group_3__0__Impl rule__SoundAction__Group_3__1 ;
    public final void rule__SoundAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4148:1: ( rule__SoundAction__Group_3__0__Impl rule__SoundAction__Group_3__1 )
            // InternalMyDsl.g:4149:2: rule__SoundAction__Group_3__0__Impl rule__SoundAction__Group_3__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalMyDsl.g:4156:1: rule__SoundAction__Group_3__0__Impl : ( 'set:' ) ;
    public final void rule__SoundAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4160:1: ( ( 'set:' ) )
            // InternalMyDsl.g:4161:1: ( 'set:' )
            {
            // InternalMyDsl.g:4161:1: ( 'set:' )
            // InternalMyDsl.g:4162:2: 'set:'
            {
             before(grammarAccess.getSoundActionAccess().getSetKeyword_3_0()); 
            match(input,55,FOLLOW_2); 
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
    // InternalMyDsl.g:4171:1: rule__SoundAction__Group_3__1 : rule__SoundAction__Group_3__1__Impl rule__SoundAction__Group_3__2 ;
    public final void rule__SoundAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4175:1: ( rule__SoundAction__Group_3__1__Impl rule__SoundAction__Group_3__2 )
            // InternalMyDsl.g:4176:2: rule__SoundAction__Group_3__1__Impl rule__SoundAction__Group_3__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:4183:1: rule__SoundAction__Group_3__1__Impl : ( ( rule__SoundAction__MusicsettingsAssignment_3_1 ) ) ;
    public final void rule__SoundAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4187:1: ( ( ( rule__SoundAction__MusicsettingsAssignment_3_1 ) ) )
            // InternalMyDsl.g:4188:1: ( ( rule__SoundAction__MusicsettingsAssignment_3_1 ) )
            {
            // InternalMyDsl.g:4188:1: ( ( rule__SoundAction__MusicsettingsAssignment_3_1 ) )
            // InternalMyDsl.g:4189:2: ( rule__SoundAction__MusicsettingsAssignment_3_1 )
            {
             before(grammarAccess.getSoundActionAccess().getMusicsettingsAssignment_3_1()); 
            // InternalMyDsl.g:4190:2: ( rule__SoundAction__MusicsettingsAssignment_3_1 )
            // InternalMyDsl.g:4190:3: rule__SoundAction__MusicsettingsAssignment_3_1
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
    // InternalMyDsl.g:4198:1: rule__SoundAction__Group_3__2 : rule__SoundAction__Group_3__2__Impl ;
    public final void rule__SoundAction__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4202:1: ( rule__SoundAction__Group_3__2__Impl )
            // InternalMyDsl.g:4203:2: rule__SoundAction__Group_3__2__Impl
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
    // InternalMyDsl.g:4209:1: rule__SoundAction__Group_3__2__Impl : ( ( rule__SoundAction__Group_3_2__0 )* ) ;
    public final void rule__SoundAction__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4213:1: ( ( ( rule__SoundAction__Group_3_2__0 )* ) )
            // InternalMyDsl.g:4214:1: ( ( rule__SoundAction__Group_3_2__0 )* )
            {
            // InternalMyDsl.g:4214:1: ( ( rule__SoundAction__Group_3_2__0 )* )
            // InternalMyDsl.g:4215:2: ( rule__SoundAction__Group_3_2__0 )*
            {
             before(grammarAccess.getSoundActionAccess().getGroup_3_2()); 
            // InternalMyDsl.g:4216:2: ( rule__SoundAction__Group_3_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==43) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMyDsl.g:4216:3: rule__SoundAction__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__SoundAction__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalMyDsl.g:4225:1: rule__SoundAction__Group_3_2__0 : rule__SoundAction__Group_3_2__0__Impl rule__SoundAction__Group_3_2__1 ;
    public final void rule__SoundAction__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4229:1: ( rule__SoundAction__Group_3_2__0__Impl rule__SoundAction__Group_3_2__1 )
            // InternalMyDsl.g:4230:2: rule__SoundAction__Group_3_2__0__Impl rule__SoundAction__Group_3_2__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalMyDsl.g:4237:1: rule__SoundAction__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__SoundAction__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4241:1: ( ( ',' ) )
            // InternalMyDsl.g:4242:1: ( ',' )
            {
            // InternalMyDsl.g:4242:1: ( ',' )
            // InternalMyDsl.g:4243:2: ','
            {
             before(grammarAccess.getSoundActionAccess().getCommaKeyword_3_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:4252:1: rule__SoundAction__Group_3_2__1 : rule__SoundAction__Group_3_2__1__Impl ;
    public final void rule__SoundAction__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4256:1: ( rule__SoundAction__Group_3_2__1__Impl )
            // InternalMyDsl.g:4257:2: rule__SoundAction__Group_3_2__1__Impl
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
    // InternalMyDsl.g:4263:1: rule__SoundAction__Group_3_2__1__Impl : ( ( rule__SoundAction__MusicsettingsAssignment_3_2_1 ) ) ;
    public final void rule__SoundAction__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4267:1: ( ( ( rule__SoundAction__MusicsettingsAssignment_3_2_1 ) ) )
            // InternalMyDsl.g:4268:1: ( ( rule__SoundAction__MusicsettingsAssignment_3_2_1 ) )
            {
            // InternalMyDsl.g:4268:1: ( ( rule__SoundAction__MusicsettingsAssignment_3_2_1 ) )
            // InternalMyDsl.g:4269:2: ( rule__SoundAction__MusicsettingsAssignment_3_2_1 )
            {
             before(grammarAccess.getSoundActionAccess().getMusicsettingsAssignment_3_2_1()); 
            // InternalMyDsl.g:4270:2: ( rule__SoundAction__MusicsettingsAssignment_3_2_1 )
            // InternalMyDsl.g:4270:3: rule__SoundAction__MusicsettingsAssignment_3_2_1
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
    // InternalMyDsl.g:4279:1: rule__LightAction__Group__0 : rule__LightAction__Group__0__Impl rule__LightAction__Group__1 ;
    public final void rule__LightAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4283:1: ( rule__LightAction__Group__0__Impl rule__LightAction__Group__1 )
            // InternalMyDsl.g:4284:2: rule__LightAction__Group__0__Impl rule__LightAction__Group__1
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
    // InternalMyDsl.g:4291:1: rule__LightAction__Group__0__Impl : ( () ) ;
    public final void rule__LightAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4295:1: ( ( () ) )
            // InternalMyDsl.g:4296:1: ( () )
            {
            // InternalMyDsl.g:4296:1: ( () )
            // InternalMyDsl.g:4297:2: ()
            {
             before(grammarAccess.getLightActionAccess().getLightActionAction_0()); 
            // InternalMyDsl.g:4298:2: ()
            // InternalMyDsl.g:4298:3: 
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
    // InternalMyDsl.g:4306:1: rule__LightAction__Group__1 : rule__LightAction__Group__1__Impl rule__LightAction__Group__2 ;
    public final void rule__LightAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4310:1: ( rule__LightAction__Group__1__Impl rule__LightAction__Group__2 )
            // InternalMyDsl.g:4311:2: rule__LightAction__Group__1__Impl rule__LightAction__Group__2
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
    // InternalMyDsl.g:4318:1: rule__LightAction__Group__1__Impl : ( 'LightAction' ) ;
    public final void rule__LightAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4322:1: ( ( 'LightAction' ) )
            // InternalMyDsl.g:4323:1: ( 'LightAction' )
            {
            // InternalMyDsl.g:4323:1: ( 'LightAction' )
            // InternalMyDsl.g:4324:2: 'LightAction'
            {
             before(grammarAccess.getLightActionAccess().getLightActionKeyword_1()); 
            match(input,56,FOLLOW_2); 
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
    // InternalMyDsl.g:4333:1: rule__LightAction__Group__2 : rule__LightAction__Group__2__Impl rule__LightAction__Group__3 ;
    public final void rule__LightAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4337:1: ( rule__LightAction__Group__2__Impl rule__LightAction__Group__3 )
            // InternalMyDsl.g:4338:2: rule__LightAction__Group__2__Impl rule__LightAction__Group__3
            {
            pushFollow(FOLLOW_47);
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
    // InternalMyDsl.g:4345:1: rule__LightAction__Group__2__Impl : ( ( rule__LightAction__ActionnameAssignment_2 ) ) ;
    public final void rule__LightAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4349:1: ( ( ( rule__LightAction__ActionnameAssignment_2 ) ) )
            // InternalMyDsl.g:4350:1: ( ( rule__LightAction__ActionnameAssignment_2 ) )
            {
            // InternalMyDsl.g:4350:1: ( ( rule__LightAction__ActionnameAssignment_2 ) )
            // InternalMyDsl.g:4351:2: ( rule__LightAction__ActionnameAssignment_2 )
            {
             before(grammarAccess.getLightActionAccess().getActionnameAssignment_2()); 
            // InternalMyDsl.g:4352:2: ( rule__LightAction__ActionnameAssignment_2 )
            // InternalMyDsl.g:4352:3: rule__LightAction__ActionnameAssignment_2
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
    // InternalMyDsl.g:4360:1: rule__LightAction__Group__3 : rule__LightAction__Group__3__Impl rule__LightAction__Group__4 ;
    public final void rule__LightAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4364:1: ( rule__LightAction__Group__3__Impl rule__LightAction__Group__4 )
            // InternalMyDsl.g:4365:2: rule__LightAction__Group__3__Impl rule__LightAction__Group__4
            {
            pushFollow(FOLLOW_48);
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
    // InternalMyDsl.g:4372:1: rule__LightAction__Group__3__Impl : ( 'pos:' ) ;
    public final void rule__LightAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4376:1: ( ( 'pos:' ) )
            // InternalMyDsl.g:4377:1: ( 'pos:' )
            {
            // InternalMyDsl.g:4377:1: ( 'pos:' )
            // InternalMyDsl.g:4378:2: 'pos:'
            {
             before(grammarAccess.getLightActionAccess().getPosKeyword_3()); 
            match(input,57,FOLLOW_2); 
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
    // InternalMyDsl.g:4387:1: rule__LightAction__Group__4 : rule__LightAction__Group__4__Impl rule__LightAction__Group__5 ;
    public final void rule__LightAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4391:1: ( rule__LightAction__Group__4__Impl rule__LightAction__Group__5 )
            // InternalMyDsl.g:4392:2: rule__LightAction__Group__4__Impl rule__LightAction__Group__5
            {
            pushFollow(FOLLOW_49);
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
    // InternalMyDsl.g:4399:1: rule__LightAction__Group__4__Impl : ( ( rule__LightAction__PosAssignment_4 ) ) ;
    public final void rule__LightAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4403:1: ( ( ( rule__LightAction__PosAssignment_4 ) ) )
            // InternalMyDsl.g:4404:1: ( ( rule__LightAction__PosAssignment_4 ) )
            {
            // InternalMyDsl.g:4404:1: ( ( rule__LightAction__PosAssignment_4 ) )
            // InternalMyDsl.g:4405:2: ( rule__LightAction__PosAssignment_4 )
            {
             before(grammarAccess.getLightActionAccess().getPosAssignment_4()); 
            // InternalMyDsl.g:4406:2: ( rule__LightAction__PosAssignment_4 )
            // InternalMyDsl.g:4406:3: rule__LightAction__PosAssignment_4
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
    // InternalMyDsl.g:4414:1: rule__LightAction__Group__5 : rule__LightAction__Group__5__Impl rule__LightAction__Group__6 ;
    public final void rule__LightAction__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4418:1: ( rule__LightAction__Group__5__Impl rule__LightAction__Group__6 )
            // InternalMyDsl.g:4419:2: rule__LightAction__Group__5__Impl rule__LightAction__Group__6
            {
            pushFollow(FOLLOW_49);
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
    // InternalMyDsl.g:4426:1: rule__LightAction__Group__5__Impl : ( ( rule__LightAction__Group_5__0 )? ) ;
    public final void rule__LightAction__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4430:1: ( ( ( rule__LightAction__Group_5__0 )? ) )
            // InternalMyDsl.g:4431:1: ( ( rule__LightAction__Group_5__0 )? )
            {
            // InternalMyDsl.g:4431:1: ( ( rule__LightAction__Group_5__0 )? )
            // InternalMyDsl.g:4432:2: ( rule__LightAction__Group_5__0 )?
            {
             before(grammarAccess.getLightActionAccess().getGroup_5()); 
            // InternalMyDsl.g:4433:2: ( rule__LightAction__Group_5__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==58) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:4433:3: rule__LightAction__Group_5__0
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
    // InternalMyDsl.g:4441:1: rule__LightAction__Group__6 : rule__LightAction__Group__6__Impl rule__LightAction__Group__7 ;
    public final void rule__LightAction__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4445:1: ( rule__LightAction__Group__6__Impl rule__LightAction__Group__7 )
            // InternalMyDsl.g:4446:2: rule__LightAction__Group__6__Impl rule__LightAction__Group__7
            {
            pushFollow(FOLLOW_49);
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
    // InternalMyDsl.g:4453:1: rule__LightAction__Group__6__Impl : ( ( rule__LightAction__Group_6__0 )? ) ;
    public final void rule__LightAction__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4457:1: ( ( ( rule__LightAction__Group_6__0 )? ) )
            // InternalMyDsl.g:4458:1: ( ( rule__LightAction__Group_6__0 )? )
            {
            // InternalMyDsl.g:4458:1: ( ( rule__LightAction__Group_6__0 )? )
            // InternalMyDsl.g:4459:2: ( rule__LightAction__Group_6__0 )?
            {
             before(grammarAccess.getLightActionAccess().getGroup_6()); 
            // InternalMyDsl.g:4460:2: ( rule__LightAction__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==59) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:4460:3: rule__LightAction__Group_6__0
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
    // InternalMyDsl.g:4468:1: rule__LightAction__Group__7 : rule__LightAction__Group__7__Impl ;
    public final void rule__LightAction__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4472:1: ( rule__LightAction__Group__7__Impl )
            // InternalMyDsl.g:4473:2: rule__LightAction__Group__7__Impl
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
    // InternalMyDsl.g:4479:1: rule__LightAction__Group__7__Impl : ( ( rule__LightAction__Group_7__0 )? ) ;
    public final void rule__LightAction__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4483:1: ( ( ( rule__LightAction__Group_7__0 )? ) )
            // InternalMyDsl.g:4484:1: ( ( rule__LightAction__Group_7__0 )? )
            {
            // InternalMyDsl.g:4484:1: ( ( rule__LightAction__Group_7__0 )? )
            // InternalMyDsl.g:4485:2: ( rule__LightAction__Group_7__0 )?
            {
             before(grammarAccess.getLightActionAccess().getGroup_7()); 
            // InternalMyDsl.g:4486:2: ( rule__LightAction__Group_7__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==60) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:4486:3: rule__LightAction__Group_7__0
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
    // InternalMyDsl.g:4495:1: rule__LightAction__Group_5__0 : rule__LightAction__Group_5__0__Impl rule__LightAction__Group_5__1 ;
    public final void rule__LightAction__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4499:1: ( rule__LightAction__Group_5__0__Impl rule__LightAction__Group_5__1 )
            // InternalMyDsl.g:4500:2: rule__LightAction__Group_5__0__Impl rule__LightAction__Group_5__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:4507:1: rule__LightAction__Group_5__0__Impl : ( 'red:' ) ;
    public final void rule__LightAction__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4511:1: ( ( 'red:' ) )
            // InternalMyDsl.g:4512:1: ( 'red:' )
            {
            // InternalMyDsl.g:4512:1: ( 'red:' )
            // InternalMyDsl.g:4513:2: 'red:'
            {
             before(grammarAccess.getLightActionAccess().getRedKeyword_5_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalMyDsl.g:4522:1: rule__LightAction__Group_5__1 : rule__LightAction__Group_5__1__Impl ;
    public final void rule__LightAction__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4526:1: ( rule__LightAction__Group_5__1__Impl )
            // InternalMyDsl.g:4527:2: rule__LightAction__Group_5__1__Impl
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
    // InternalMyDsl.g:4533:1: rule__LightAction__Group_5__1__Impl : ( ( rule__LightAction__RedAssignment_5_1 ) ) ;
    public final void rule__LightAction__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4537:1: ( ( ( rule__LightAction__RedAssignment_5_1 ) ) )
            // InternalMyDsl.g:4538:1: ( ( rule__LightAction__RedAssignment_5_1 ) )
            {
            // InternalMyDsl.g:4538:1: ( ( rule__LightAction__RedAssignment_5_1 ) )
            // InternalMyDsl.g:4539:2: ( rule__LightAction__RedAssignment_5_1 )
            {
             before(grammarAccess.getLightActionAccess().getRedAssignment_5_1()); 
            // InternalMyDsl.g:4540:2: ( rule__LightAction__RedAssignment_5_1 )
            // InternalMyDsl.g:4540:3: rule__LightAction__RedAssignment_5_1
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
    // InternalMyDsl.g:4549:1: rule__LightAction__Group_6__0 : rule__LightAction__Group_6__0__Impl rule__LightAction__Group_6__1 ;
    public final void rule__LightAction__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4553:1: ( rule__LightAction__Group_6__0__Impl rule__LightAction__Group_6__1 )
            // InternalMyDsl.g:4554:2: rule__LightAction__Group_6__0__Impl rule__LightAction__Group_6__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:4561:1: rule__LightAction__Group_6__0__Impl : ( 'green:' ) ;
    public final void rule__LightAction__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4565:1: ( ( 'green:' ) )
            // InternalMyDsl.g:4566:1: ( 'green:' )
            {
            // InternalMyDsl.g:4566:1: ( 'green:' )
            // InternalMyDsl.g:4567:2: 'green:'
            {
             before(grammarAccess.getLightActionAccess().getGreenKeyword_6_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalMyDsl.g:4576:1: rule__LightAction__Group_6__1 : rule__LightAction__Group_6__1__Impl ;
    public final void rule__LightAction__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4580:1: ( rule__LightAction__Group_6__1__Impl )
            // InternalMyDsl.g:4581:2: rule__LightAction__Group_6__1__Impl
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
    // InternalMyDsl.g:4587:1: rule__LightAction__Group_6__1__Impl : ( ( rule__LightAction__GreenAssignment_6_1 ) ) ;
    public final void rule__LightAction__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4591:1: ( ( ( rule__LightAction__GreenAssignment_6_1 ) ) )
            // InternalMyDsl.g:4592:1: ( ( rule__LightAction__GreenAssignment_6_1 ) )
            {
            // InternalMyDsl.g:4592:1: ( ( rule__LightAction__GreenAssignment_6_1 ) )
            // InternalMyDsl.g:4593:2: ( rule__LightAction__GreenAssignment_6_1 )
            {
             before(grammarAccess.getLightActionAccess().getGreenAssignment_6_1()); 
            // InternalMyDsl.g:4594:2: ( rule__LightAction__GreenAssignment_6_1 )
            // InternalMyDsl.g:4594:3: rule__LightAction__GreenAssignment_6_1
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
    // InternalMyDsl.g:4603:1: rule__LightAction__Group_7__0 : rule__LightAction__Group_7__0__Impl rule__LightAction__Group_7__1 ;
    public final void rule__LightAction__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4607:1: ( rule__LightAction__Group_7__0__Impl rule__LightAction__Group_7__1 )
            // InternalMyDsl.g:4608:2: rule__LightAction__Group_7__0__Impl rule__LightAction__Group_7__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:4615:1: rule__LightAction__Group_7__0__Impl : ( 'blue:' ) ;
    public final void rule__LightAction__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4619:1: ( ( 'blue:' ) )
            // InternalMyDsl.g:4620:1: ( 'blue:' )
            {
            // InternalMyDsl.g:4620:1: ( 'blue:' )
            // InternalMyDsl.g:4621:2: 'blue:'
            {
             before(grammarAccess.getLightActionAccess().getBlueKeyword_7_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalMyDsl.g:4630:1: rule__LightAction__Group_7__1 : rule__LightAction__Group_7__1__Impl ;
    public final void rule__LightAction__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4634:1: ( rule__LightAction__Group_7__1__Impl )
            // InternalMyDsl.g:4635:2: rule__LightAction__Group_7__1__Impl
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
    // InternalMyDsl.g:4641:1: rule__LightAction__Group_7__1__Impl : ( ( rule__LightAction__BlueAssignment_7_1 ) ) ;
    public final void rule__LightAction__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4645:1: ( ( ( rule__LightAction__BlueAssignment_7_1 ) ) )
            // InternalMyDsl.g:4646:1: ( ( rule__LightAction__BlueAssignment_7_1 ) )
            {
            // InternalMyDsl.g:4646:1: ( ( rule__LightAction__BlueAssignment_7_1 ) )
            // InternalMyDsl.g:4647:2: ( rule__LightAction__BlueAssignment_7_1 )
            {
             before(grammarAccess.getLightActionAccess().getBlueAssignment_7_1()); 
            // InternalMyDsl.g:4648:2: ( rule__LightAction__BlueAssignment_7_1 )
            // InternalMyDsl.g:4648:3: rule__LightAction__BlueAssignment_7_1
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
    // InternalMyDsl.g:4657:1: rule__MusicSetting__Group__0 : rule__MusicSetting__Group__0__Impl rule__MusicSetting__Group__1 ;
    public final void rule__MusicSetting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4661:1: ( rule__MusicSetting__Group__0__Impl rule__MusicSetting__Group__1 )
            // InternalMyDsl.g:4662:2: rule__MusicSetting__Group__0__Impl rule__MusicSetting__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalMyDsl.g:4669:1: rule__MusicSetting__Group__0__Impl : ( () ) ;
    public final void rule__MusicSetting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4673:1: ( ( () ) )
            // InternalMyDsl.g:4674:1: ( () )
            {
            // InternalMyDsl.g:4674:1: ( () )
            // InternalMyDsl.g:4675:2: ()
            {
             before(grammarAccess.getMusicSettingAccess().getMusicSettingAction_0()); 
            // InternalMyDsl.g:4676:2: ()
            // InternalMyDsl.g:4676:3: 
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
    // InternalMyDsl.g:4684:1: rule__MusicSetting__Group__1 : rule__MusicSetting__Group__1__Impl rule__MusicSetting__Group__2 ;
    public final void rule__MusicSetting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4688:1: ( rule__MusicSetting__Group__1__Impl rule__MusicSetting__Group__2 )
            // InternalMyDsl.g:4689:2: rule__MusicSetting__Group__1__Impl rule__MusicSetting__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:4696:1: rule__MusicSetting__Group__1__Impl : ( '(' ) ;
    public final void rule__MusicSetting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4700:1: ( ( '(' ) )
            // InternalMyDsl.g:4701:1: ( '(' )
            {
            // InternalMyDsl.g:4701:1: ( '(' )
            // InternalMyDsl.g:4702:2: '('
            {
             before(grammarAccess.getMusicSettingAccess().getLeftParenthesisKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalMyDsl.g:4711:1: rule__MusicSetting__Group__2 : rule__MusicSetting__Group__2__Impl rule__MusicSetting__Group__3 ;
    public final void rule__MusicSetting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4715:1: ( rule__MusicSetting__Group__2__Impl rule__MusicSetting__Group__3 )
            // InternalMyDsl.g:4716:2: rule__MusicSetting__Group__2__Impl rule__MusicSetting__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:4723:1: rule__MusicSetting__Group__2__Impl : ( ( rule__MusicSetting__NoteAssignment_2 ) ) ;
    public final void rule__MusicSetting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4727:1: ( ( ( rule__MusicSetting__NoteAssignment_2 ) ) )
            // InternalMyDsl.g:4728:1: ( ( rule__MusicSetting__NoteAssignment_2 ) )
            {
            // InternalMyDsl.g:4728:1: ( ( rule__MusicSetting__NoteAssignment_2 ) )
            // InternalMyDsl.g:4729:2: ( rule__MusicSetting__NoteAssignment_2 )
            {
             before(grammarAccess.getMusicSettingAccess().getNoteAssignment_2()); 
            // InternalMyDsl.g:4730:2: ( rule__MusicSetting__NoteAssignment_2 )
            // InternalMyDsl.g:4730:3: rule__MusicSetting__NoteAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MusicSetting__NoteAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMusicSettingAccess().getNoteAssignment_2()); 

            }


            }

        }
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
    // InternalMyDsl.g:4738:1: rule__MusicSetting__Group__3 : rule__MusicSetting__Group__3__Impl rule__MusicSetting__Group__4 ;
    public final void rule__MusicSetting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4742:1: ( rule__MusicSetting__Group__3__Impl rule__MusicSetting__Group__4 )
            // InternalMyDsl.g:4743:2: rule__MusicSetting__Group__3__Impl rule__MusicSetting__Group__4
            {
            pushFollow(FOLLOW_50);
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
    // InternalMyDsl.g:4750:1: rule__MusicSetting__Group__3__Impl : ( ',' ) ;
    public final void rule__MusicSetting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4754:1: ( ( ',' ) )
            // InternalMyDsl.g:4755:1: ( ',' )
            {
            // InternalMyDsl.g:4755:1: ( ',' )
            // InternalMyDsl.g:4756:2: ','
            {
             before(grammarAccess.getMusicSettingAccess().getCommaKeyword_3()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:4765:1: rule__MusicSetting__Group__4 : rule__MusicSetting__Group__4__Impl rule__MusicSetting__Group__5 ;
    public final void rule__MusicSetting__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4769:1: ( rule__MusicSetting__Group__4__Impl rule__MusicSetting__Group__5 )
            // InternalMyDsl.g:4770:2: rule__MusicSetting__Group__4__Impl rule__MusicSetting__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalMyDsl.g:4777:1: rule__MusicSetting__Group__4__Impl : ( ( rule__MusicSetting__DurationAssignment_4 ) ) ;
    public final void rule__MusicSetting__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4781:1: ( ( ( rule__MusicSetting__DurationAssignment_4 ) ) )
            // InternalMyDsl.g:4782:1: ( ( rule__MusicSetting__DurationAssignment_4 ) )
            {
            // InternalMyDsl.g:4782:1: ( ( rule__MusicSetting__DurationAssignment_4 ) )
            // InternalMyDsl.g:4783:2: ( rule__MusicSetting__DurationAssignment_4 )
            {
             before(grammarAccess.getMusicSettingAccess().getDurationAssignment_4()); 
            // InternalMyDsl.g:4784:2: ( rule__MusicSetting__DurationAssignment_4 )
            // InternalMyDsl.g:4784:3: rule__MusicSetting__DurationAssignment_4
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
    // InternalMyDsl.g:4792:1: rule__MusicSetting__Group__5 : rule__MusicSetting__Group__5__Impl rule__MusicSetting__Group__6 ;
    public final void rule__MusicSetting__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4796:1: ( rule__MusicSetting__Group__5__Impl rule__MusicSetting__Group__6 )
            // InternalMyDsl.g:4797:2: rule__MusicSetting__Group__5__Impl rule__MusicSetting__Group__6
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:4804:1: rule__MusicSetting__Group__5__Impl : ( ',' ) ;
    public final void rule__MusicSetting__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4808:1: ( ( ',' ) )
            // InternalMyDsl.g:4809:1: ( ',' )
            {
            // InternalMyDsl.g:4809:1: ( ',' )
            // InternalMyDsl.g:4810:2: ','
            {
             before(grammarAccess.getMusicSettingAccess().getCommaKeyword_5()); 
            match(input,43,FOLLOW_2); 
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
    // InternalMyDsl.g:4819:1: rule__MusicSetting__Group__6 : rule__MusicSetting__Group__6__Impl rule__MusicSetting__Group__7 ;
    public final void rule__MusicSetting__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4823:1: ( rule__MusicSetting__Group__6__Impl rule__MusicSetting__Group__7 )
            // InternalMyDsl.g:4824:2: rule__MusicSetting__Group__6__Impl rule__MusicSetting__Group__7
            {
            pushFollow(FOLLOW_24);
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
    // InternalMyDsl.g:4831:1: rule__MusicSetting__Group__6__Impl : ( ( rule__MusicSetting__PosAssignment_6 ) ) ;
    public final void rule__MusicSetting__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4835:1: ( ( ( rule__MusicSetting__PosAssignment_6 ) ) )
            // InternalMyDsl.g:4836:1: ( ( rule__MusicSetting__PosAssignment_6 ) )
            {
            // InternalMyDsl.g:4836:1: ( ( rule__MusicSetting__PosAssignment_6 ) )
            // InternalMyDsl.g:4837:2: ( rule__MusicSetting__PosAssignment_6 )
            {
             before(grammarAccess.getMusicSettingAccess().getPosAssignment_6()); 
            // InternalMyDsl.g:4838:2: ( rule__MusicSetting__PosAssignment_6 )
            // InternalMyDsl.g:4838:3: rule__MusicSetting__PosAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__MusicSetting__PosAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMusicSettingAccess().getPosAssignment_6()); 

            }


            }

        }
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
    // InternalMyDsl.g:4846:1: rule__MusicSetting__Group__7 : rule__MusicSetting__Group__7__Impl ;
    public final void rule__MusicSetting__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4850:1: ( rule__MusicSetting__Group__7__Impl )
            // InternalMyDsl.g:4851:2: rule__MusicSetting__Group__7__Impl
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
    // InternalMyDsl.g:4857:1: rule__MusicSetting__Group__7__Impl : ( ')' ) ;
    public final void rule__MusicSetting__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4861:1: ( ( ')' ) )
            // InternalMyDsl.g:4862:1: ( ')' )
            {
            // InternalMyDsl.g:4862:1: ( ')' )
            // InternalMyDsl.g:4863:2: ')'
            {
             before(grammarAccess.getMusicSettingAccess().getRightParenthesisKeyword_7()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:4873:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4877:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:4878:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalMyDsl.g:4885:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4889:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:4890:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:4890:1: ( ( '-' )? )
            // InternalMyDsl.g:4891:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:4892:2: ( '-' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==18) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMyDsl.g:4892:3: '-'
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
    // InternalMyDsl.g:4900:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4904:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:4905:2: rule__EInt__Group__1__Impl
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
    // InternalMyDsl.g:4911:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4915:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4916:1: ( RULE_INT )
            {
            // InternalMyDsl.g:4916:1: ( RULE_INT )
            // InternalMyDsl.g:4917:2: RULE_INT
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
    // InternalMyDsl.g:4927:1: rule__RobotModel__EventsAssignment_1_0 : ( ruleEvent ) ;
    public final void rule__RobotModel__EventsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4931:1: ( ( ruleEvent ) )
            // InternalMyDsl.g:4932:2: ( ruleEvent )
            {
            // InternalMyDsl.g:4932:2: ( ruleEvent )
            // InternalMyDsl.g:4933:3: ruleEvent
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
    // InternalMyDsl.g:4942:1: rule__RobotModel__ActionsAssignment_1_1_2 : ( ruleAction ) ;
    public final void rule__RobotModel__ActionsAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4946:1: ( ( ruleAction ) )
            // InternalMyDsl.g:4947:2: ( ruleAction )
            {
            // InternalMyDsl.g:4947:2: ( ruleAction )
            // InternalMyDsl.g:4948:3: ruleAction
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
    // InternalMyDsl.g:4957:1: rule__RobotModel__ActionsAssignment_1_1_3_1 : ( ruleAction ) ;
    public final void rule__RobotModel__ActionsAssignment_1_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4961:1: ( ( ruleAction ) )
            // InternalMyDsl.g:4962:2: ( ruleAction )
            {
            // InternalMyDsl.g:4962:2: ( ruleAction )
            // InternalMyDsl.g:4963:3: ruleAction
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
    // InternalMyDsl.g:4972:1: rule__RobotModel__ConditionsAssignment_1_2_2 : ( ruleCondition ) ;
    public final void rule__RobotModel__ConditionsAssignment_1_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4976:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:4977:2: ( ruleCondition )
            {
            // InternalMyDsl.g:4977:2: ( ruleCondition )
            // InternalMyDsl.g:4978:3: ruleCondition
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
    // InternalMyDsl.g:4987:1: rule__RobotModel__ConditionsAssignment_1_2_3_1 : ( ruleCondition ) ;
    public final void rule__RobotModel__ConditionsAssignment_1_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4991:1: ( ( ruleCondition ) )
            // InternalMyDsl.g:4992:2: ( ruleCondition )
            {
            // InternalMyDsl.g:4992:2: ( ruleCondition )
            // InternalMyDsl.g:4993:3: ruleCondition
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
    // InternalMyDsl.g:5002:1: rule__RobotModel__ExpressionsAssignment_1_3 : ( ruleExpression ) ;
    public final void rule__RobotModel__ExpressionsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5006:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5007:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5007:2: ( ruleExpression )
            // InternalMyDsl.g:5008:3: ruleExpression
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
    // InternalMyDsl.g:5017:1: rule__Or__OperationAssignment_1_1 : ( ( '||' ) ) ;
    public final void rule__Or__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5021:1: ( ( ( '||' ) ) )
            // InternalMyDsl.g:5022:2: ( ( '||' ) )
            {
            // InternalMyDsl.g:5022:2: ( ( '||' ) )
            // InternalMyDsl.g:5023:3: ( '||' )
            {
             before(grammarAccess.getOrAccess().getOperationVerticalLineVerticalLineKeyword_1_1_0()); 
            // InternalMyDsl.g:5024:3: ( '||' )
            // InternalMyDsl.g:5025:4: '||'
            {
             before(grammarAccess.getOrAccess().getOperationVerticalLineVerticalLineKeyword_1_1_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalMyDsl.g:5036:1: rule__Or__RightAssignment_1_2 : ( ruleAnd ) ;
    public final void rule__Or__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5040:1: ( ( ruleAnd ) )
            // InternalMyDsl.g:5041:2: ( ruleAnd )
            {
            // InternalMyDsl.g:5041:2: ( ruleAnd )
            // InternalMyDsl.g:5042:3: ruleAnd
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
    // InternalMyDsl.g:5051:1: rule__And__OperationAssignment_1_1 : ( ( '&&' ) ) ;
    public final void rule__And__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5055:1: ( ( ( '&&' ) ) )
            // InternalMyDsl.g:5056:2: ( ( '&&' ) )
            {
            // InternalMyDsl.g:5056:2: ( ( '&&' ) )
            // InternalMyDsl.g:5057:3: ( '&&' )
            {
             before(grammarAccess.getAndAccess().getOperationAmpersandAmpersandKeyword_1_1_0()); 
            // InternalMyDsl.g:5058:3: ( '&&' )
            // InternalMyDsl.g:5059:4: '&&'
            {
             before(grammarAccess.getAndAccess().getOperationAmpersandAmpersandKeyword_1_1_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalMyDsl.g:5070:1: rule__And__RightAssignment_1_2 : ( ruleEquality ) ;
    public final void rule__And__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5074:1: ( ( ruleEquality ) )
            // InternalMyDsl.g:5075:2: ( ruleEquality )
            {
            // InternalMyDsl.g:5075:2: ( ruleEquality )
            // InternalMyDsl.g:5076:3: ruleEquality
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
    // InternalMyDsl.g:5085:1: rule__Equality__OperationAssignment_1_1 : ( ( rule__Equality__OperationAlternatives_1_1_0 ) ) ;
    public final void rule__Equality__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5089:1: ( ( ( rule__Equality__OperationAlternatives_1_1_0 ) ) )
            // InternalMyDsl.g:5090:2: ( ( rule__Equality__OperationAlternatives_1_1_0 ) )
            {
            // InternalMyDsl.g:5090:2: ( ( rule__Equality__OperationAlternatives_1_1_0 ) )
            // InternalMyDsl.g:5091:3: ( rule__Equality__OperationAlternatives_1_1_0 )
            {
             before(grammarAccess.getEqualityAccess().getOperationAlternatives_1_1_0()); 
            // InternalMyDsl.g:5092:3: ( rule__Equality__OperationAlternatives_1_1_0 )
            // InternalMyDsl.g:5092:4: rule__Equality__OperationAlternatives_1_1_0
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
    // InternalMyDsl.g:5100:1: rule__Equality__RightAssignment_1_2 : ( ruleComparison ) ;
    public final void rule__Equality__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5104:1: ( ( ruleComparison ) )
            // InternalMyDsl.g:5105:2: ( ruleComparison )
            {
            // InternalMyDsl.g:5105:2: ( ruleComparison )
            // InternalMyDsl.g:5106:3: ruleComparison
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
    // InternalMyDsl.g:5115:1: rule__Comparison__OperationAssignment_1_1 : ( ( rule__Comparison__OperationAlternatives_1_1_0 ) ) ;
    public final void rule__Comparison__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5119:1: ( ( ( rule__Comparison__OperationAlternatives_1_1_0 ) ) )
            // InternalMyDsl.g:5120:2: ( ( rule__Comparison__OperationAlternatives_1_1_0 ) )
            {
            // InternalMyDsl.g:5120:2: ( ( rule__Comparison__OperationAlternatives_1_1_0 ) )
            // InternalMyDsl.g:5121:3: ( rule__Comparison__OperationAlternatives_1_1_0 )
            {
             before(grammarAccess.getComparisonAccess().getOperationAlternatives_1_1_0()); 
            // InternalMyDsl.g:5122:3: ( rule__Comparison__OperationAlternatives_1_1_0 )
            // InternalMyDsl.g:5122:4: rule__Comparison__OperationAlternatives_1_1_0
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
    // InternalMyDsl.g:5130:1: rule__Comparison__RightAssignment_1_2 : ( rulePlusOrMinus ) ;
    public final void rule__Comparison__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5134:1: ( ( rulePlusOrMinus ) )
            // InternalMyDsl.g:5135:2: ( rulePlusOrMinus )
            {
            // InternalMyDsl.g:5135:2: ( rulePlusOrMinus )
            // InternalMyDsl.g:5136:3: rulePlusOrMinus
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
    // InternalMyDsl.g:5145:1: rule__If__OperationAssignment_1 : ( ( 'if' ) ) ;
    public final void rule__If__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5149:1: ( ( ( 'if' ) ) )
            // InternalMyDsl.g:5150:2: ( ( 'if' ) )
            {
            // InternalMyDsl.g:5150:2: ( ( 'if' ) )
            // InternalMyDsl.g:5151:3: ( 'if' )
            {
             before(grammarAccess.getIfAccess().getOperationIfKeyword_1_0()); 
            // InternalMyDsl.g:5152:3: ( 'if' )
            // InternalMyDsl.g:5153:4: 'if'
            {
             before(grammarAccess.getIfAccess().getOperationIfKeyword_1_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalMyDsl.g:5164:1: rule__If__LeftAssignment_2 : ( ruleExpression ) ;
    public final void rule__If__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5168:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5169:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5169:2: ( ruleExpression )
            // InternalMyDsl.g:5170:3: ruleExpression
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
    // InternalMyDsl.g:5179:1: rule__If__RightAssignment_3 : ( ruleThen ) ;
    public final void rule__If__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5183:1: ( ( ruleThen ) )
            // InternalMyDsl.g:5184:2: ( ruleThen )
            {
            // InternalMyDsl.g:5184:2: ( ruleThen )
            // InternalMyDsl.g:5185:3: ruleThen
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
    // InternalMyDsl.g:5194:1: rule__Then__OperationAssignment_1 : ( ( 'then' ) ) ;
    public final void rule__Then__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5198:1: ( ( ( 'then' ) ) )
            // InternalMyDsl.g:5199:2: ( ( 'then' ) )
            {
            // InternalMyDsl.g:5199:2: ( ( 'then' ) )
            // InternalMyDsl.g:5200:3: ( 'then' )
            {
             before(grammarAccess.getThenAccess().getOperationThenKeyword_1_0()); 
            // InternalMyDsl.g:5201:3: ( 'then' )
            // InternalMyDsl.g:5202:4: 'then'
            {
             before(grammarAccess.getThenAccess().getOperationThenKeyword_1_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalMyDsl.g:5213:1: rule__Then__LeftAssignment_2 : ( ruleExpression ) ;
    public final void rule__Then__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5217:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5218:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5218:2: ( ruleExpression )
            // InternalMyDsl.g:5219:3: ruleExpression
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
    // InternalMyDsl.g:5228:1: rule__Then__RightAssignment_3 : ( ruleElse ) ;
    public final void rule__Then__RightAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5232:1: ( ( ruleElse ) )
            // InternalMyDsl.g:5233:2: ( ruleElse )
            {
            // InternalMyDsl.g:5233:2: ( ruleElse )
            // InternalMyDsl.g:5234:3: ruleElse
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
    // InternalMyDsl.g:5243:1: rule__Else__OperationAssignment_1 : ( ( 'else' ) ) ;
    public final void rule__Else__OperationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5247:1: ( ( ( 'else' ) ) )
            // InternalMyDsl.g:5248:2: ( ( 'else' ) )
            {
            // InternalMyDsl.g:5248:2: ( ( 'else' ) )
            // InternalMyDsl.g:5249:3: ( 'else' )
            {
             before(grammarAccess.getElseAccess().getOperationElseKeyword_1_0()); 
            // InternalMyDsl.g:5250:3: ( 'else' )
            // InternalMyDsl.g:5251:4: 'else'
            {
             before(grammarAccess.getElseAccess().getOperationElseKeyword_1_0()); 
            match(input,65,FOLLOW_2); 
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
    // InternalMyDsl.g:5262:1: rule__Else__LeftAssignment_2 : ( ruleExpression ) ;
    public final void rule__Else__LeftAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5266:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5267:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5267:2: ( ruleExpression )
            // InternalMyDsl.g:5268:3: ruleExpression
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
    // InternalMyDsl.g:5277:1: rule__PlusOrMinus__OperationAssignment_1_0_1 : ( ( rule__PlusOrMinus__OperationAlternatives_1_0_1_0 ) ) ;
    public final void rule__PlusOrMinus__OperationAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5281:1: ( ( ( rule__PlusOrMinus__OperationAlternatives_1_0_1_0 ) ) )
            // InternalMyDsl.g:5282:2: ( ( rule__PlusOrMinus__OperationAlternatives_1_0_1_0 ) )
            {
            // InternalMyDsl.g:5282:2: ( ( rule__PlusOrMinus__OperationAlternatives_1_0_1_0 ) )
            // InternalMyDsl.g:5283:3: ( rule__PlusOrMinus__OperationAlternatives_1_0_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getOperationAlternatives_1_0_1_0()); 
            // InternalMyDsl.g:5284:3: ( rule__PlusOrMinus__OperationAlternatives_1_0_1_0 )
            // InternalMyDsl.g:5284:4: rule__PlusOrMinus__OperationAlternatives_1_0_1_0
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
    // InternalMyDsl.g:5292:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMultOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5296:1: ( ( ruleMultOrDiv ) )
            // InternalMyDsl.g:5297:2: ( ruleMultOrDiv )
            {
            // InternalMyDsl.g:5297:2: ( ruleMultOrDiv )
            // InternalMyDsl.g:5298:3: ruleMultOrDiv
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
    // InternalMyDsl.g:5307:1: rule__MultOrDiv__OperationAssignment_1_1 : ( ( rule__MultOrDiv__OperationAlternatives_1_1_0 ) ) ;
    public final void rule__MultOrDiv__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5311:1: ( ( ( rule__MultOrDiv__OperationAlternatives_1_1_0 ) ) )
            // InternalMyDsl.g:5312:2: ( ( rule__MultOrDiv__OperationAlternatives_1_1_0 ) )
            {
            // InternalMyDsl.g:5312:2: ( ( rule__MultOrDiv__OperationAlternatives_1_1_0 ) )
            // InternalMyDsl.g:5313:3: ( rule__MultOrDiv__OperationAlternatives_1_1_0 )
            {
             before(grammarAccess.getMultOrDivAccess().getOperationAlternatives_1_1_0()); 
            // InternalMyDsl.g:5314:3: ( rule__MultOrDiv__OperationAlternatives_1_1_0 )
            // InternalMyDsl.g:5314:4: rule__MultOrDiv__OperationAlternatives_1_1_0
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
    // InternalMyDsl.g:5322:1: rule__MultOrDiv__RightAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__MultOrDiv__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5326:1: ( ( rulePrimary ) )
            // InternalMyDsl.g:5327:2: ( rulePrimary )
            {
            // InternalMyDsl.g:5327:2: ( rulePrimary )
            // InternalMyDsl.g:5328:3: rulePrimary
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
    // InternalMyDsl.g:5337:1: rule__Primary__OperationAssignment_1_1 : ( ( '!' ) ) ;
    public final void rule__Primary__OperationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5341:1: ( ( ( '!' ) ) )
            // InternalMyDsl.g:5342:2: ( ( '!' ) )
            {
            // InternalMyDsl.g:5342:2: ( ( '!' ) )
            // InternalMyDsl.g:5343:3: ( '!' )
            {
             before(grammarAccess.getPrimaryAccess().getOperationExclamationMarkKeyword_1_1_0()); 
            // InternalMyDsl.g:5344:3: ( '!' )
            // InternalMyDsl.g:5345:4: '!'
            {
             before(grammarAccess.getPrimaryAccess().getOperationExclamationMarkKeyword_1_1_0()); 
            match(input,66,FOLLOW_2); 
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
    // InternalMyDsl.g:5356:1: rule__Primary__LeftAssignment_1_2 : ( rulePrimary ) ;
    public final void rule__Primary__LeftAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5360:1: ( ( rulePrimary ) )
            // InternalMyDsl.g:5361:2: ( rulePrimary )
            {
            // InternalMyDsl.g:5361:2: ( rulePrimary )
            // InternalMyDsl.g:5362:3: rulePrimary
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
    // InternalMyDsl.g:5371:1: rule__Atomic__ValueAssignment_1_0 : ( ruleEInt ) ;
    public final void rule__Atomic__ValueAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5375:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:5376:2: ( ruleEInt )
            {
            // InternalMyDsl.g:5376:2: ( ruleEInt )
            // InternalMyDsl.g:5377:3: ruleEInt
            {
             before(grammarAccess.getAtomicAccess().getValueEIntParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getAtomicAccess().getValueEIntParserRuleCall_1_0_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Atomic__BoolAssignment_1_1"
    // InternalMyDsl.g:5386:1: rule__Atomic__BoolAssignment_1_1 : ( ( rule__Atomic__BoolAlternatives_1_1_0 ) ) ;
    public final void rule__Atomic__BoolAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5390:1: ( ( ( rule__Atomic__BoolAlternatives_1_1_0 ) ) )
            // InternalMyDsl.g:5391:2: ( ( rule__Atomic__BoolAlternatives_1_1_0 ) )
            {
            // InternalMyDsl.g:5391:2: ( ( rule__Atomic__BoolAlternatives_1_1_0 ) )
            // InternalMyDsl.g:5392:3: ( rule__Atomic__BoolAlternatives_1_1_0 )
            {
             before(grammarAccess.getAtomicAccess().getBoolAlternatives_1_1_0()); 
            // InternalMyDsl.g:5393:3: ( rule__Atomic__BoolAlternatives_1_1_0 )
            // InternalMyDsl.g:5393:4: rule__Atomic__BoolAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__BoolAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getBoolAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__BoolAssignment_1_1"


    // $ANTLR start "rule__Event__NameAssignment_2"
    // InternalMyDsl.g:5401:1: rule__Event__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Event__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5405:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5406:2: ( ruleEString )
            {
            // InternalMyDsl.g:5406:2: ( ruleEString )
            // InternalMyDsl.g:5407:3: ruleEString
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
    // InternalMyDsl.g:5416:1: rule__Event__ConditionsAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Event__ConditionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5420:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:5421:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:5421:2: ( ( ruleEString ) )
            // InternalMyDsl.g:5422:3: ( ruleEString )
            {
             before(grammarAccess.getEventAccess().getConditionsConditionCrossReference_3_1_0()); 
            // InternalMyDsl.g:5423:3: ( ruleEString )
            // InternalMyDsl.g:5424:4: ruleEString
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
    // InternalMyDsl.g:5435:1: rule__Event__ConditionsAssignment_3_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Event__ConditionsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5439:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:5440:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:5440:2: ( ( ruleEString ) )
            // InternalMyDsl.g:5441:3: ( ruleEString )
            {
             before(grammarAccess.getEventAccess().getConditionsConditionCrossReference_3_2_1_0()); 
            // InternalMyDsl.g:5442:3: ( ruleEString )
            // InternalMyDsl.g:5443:4: ruleEString
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
    // InternalMyDsl.g:5454:1: rule__Event__ActionsAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Event__ActionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5458:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:5459:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:5459:2: ( ( ruleEString ) )
            // InternalMyDsl.g:5460:3: ( ruleEString )
            {
             before(grammarAccess.getEventAccess().getActionsActionCrossReference_4_1_0()); 
            // InternalMyDsl.g:5461:3: ( ruleEString )
            // InternalMyDsl.g:5462:4: ruleEString
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
    // InternalMyDsl.g:5473:1: rule__Event__ActionsAssignment_4_2_1 : ( ( ruleEString ) ) ;
    public final void rule__Event__ActionsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5477:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:5478:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:5478:2: ( ( ruleEString ) )
            // InternalMyDsl.g:5479:3: ( ruleEString )
            {
             before(grammarAccess.getEventAccess().getActionsActionCrossReference_4_2_1_0()); 
            // InternalMyDsl.g:5480:3: ( ruleEString )
            // InternalMyDsl.g:5481:4: ruleEString
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
    // InternalMyDsl.g:5492:1: rule__Sound__ConditionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__Sound__ConditionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5496:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5497:2: ( ruleEString )
            {
            // InternalMyDsl.g:5497:2: ( ruleEString )
            // InternalMyDsl.g:5498:3: ruleEString
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
    // InternalMyDsl.g:5507:1: rule__Button__ConditionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__Button__ConditionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5511:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5512:2: ( ruleEString )
            {
            // InternalMyDsl.g:5512:2: ( ruleEString )
            // InternalMyDsl.g:5513:3: ruleEString
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
    // InternalMyDsl.g:5522:1: rule__Button__ButtonAssignment_4 : ( ruleButtonType ) ;
    public final void rule__Button__ButtonAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5526:1: ( ( ruleButtonType ) )
            // InternalMyDsl.g:5527:2: ( ruleButtonType )
            {
            // InternalMyDsl.g:5527:2: ( ruleButtonType )
            // InternalMyDsl.g:5528:3: ruleButtonType
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
    // InternalMyDsl.g:5537:1: rule__Sensor__ConditionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__Sensor__ConditionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5541:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5542:2: ( ruleEString )
            {
            // InternalMyDsl.g:5542:2: ( ruleEString )
            // InternalMyDsl.g:5543:3: ruleEString
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
    // InternalMyDsl.g:5552:1: rule__Sensor__SensorPosAssignment_4 : ( ruleEInt ) ;
    public final void rule__Sensor__SensorPosAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5556:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:5557:2: ( ruleEInt )
            {
            // InternalMyDsl.g:5557:2: ( ruleEInt )
            // InternalMyDsl.g:5558:3: ruleEInt
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


    // $ANTLR start "rule__Sensor__DistanceAssignment_6"
    // InternalMyDsl.g:5567:1: rule__Sensor__DistanceAssignment_6 : ( ruleDistance ) ;
    public final void rule__Sensor__DistanceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5571:1: ( ( ruleDistance ) )
            // InternalMyDsl.g:5572:2: ( ruleDistance )
            {
            // InternalMyDsl.g:5572:2: ( ruleDistance )
            // InternalMyDsl.g:5573:3: ruleDistance
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
    // InternalMyDsl.g:5582:1: rule__Tap__ConditionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__Tap__ConditionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5586:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5587:2: ( ruleEString )
            {
            // InternalMyDsl.g:5587:2: ( ruleEString )
            // InternalMyDsl.g:5588:3: ruleEString
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
    // InternalMyDsl.g:5597:1: rule__MotorAction__ActionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__MotorAction__ActionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5601:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5602:2: ( ruleEString )
            {
            // InternalMyDsl.g:5602:2: ( ruleEString )
            // InternalMyDsl.g:5603:3: ruleEString
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
    // InternalMyDsl.g:5612:1: rule__MotorAction__LeftAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__MotorAction__LeftAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5616:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5617:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5617:2: ( ruleExpression )
            // InternalMyDsl.g:5618:3: ruleExpression
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
    // InternalMyDsl.g:5627:1: rule__MotorAction__RightAssignment_4_1 : ( ruleExpression ) ;
    public final void rule__MotorAction__RightAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5631:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5632:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5632:2: ( ruleExpression )
            // InternalMyDsl.g:5633:3: ruleExpression
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
    // InternalMyDsl.g:5642:1: rule__SoundAction__ActionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__SoundAction__ActionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5646:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5647:2: ( ruleEString )
            {
            // InternalMyDsl.g:5647:2: ( ruleEString )
            // InternalMyDsl.g:5648:3: ruleEString
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
    // InternalMyDsl.g:5657:1: rule__SoundAction__MusicsettingsAssignment_3_1 : ( ruleMusicSetting ) ;
    public final void rule__SoundAction__MusicsettingsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5661:1: ( ( ruleMusicSetting ) )
            // InternalMyDsl.g:5662:2: ( ruleMusicSetting )
            {
            // InternalMyDsl.g:5662:2: ( ruleMusicSetting )
            // InternalMyDsl.g:5663:3: ruleMusicSetting
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
    // InternalMyDsl.g:5672:1: rule__SoundAction__MusicsettingsAssignment_3_2_1 : ( ruleMusicSetting ) ;
    public final void rule__SoundAction__MusicsettingsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5676:1: ( ( ruleMusicSetting ) )
            // InternalMyDsl.g:5677:2: ( ruleMusicSetting )
            {
            // InternalMyDsl.g:5677:2: ( ruleMusicSetting )
            // InternalMyDsl.g:5678:3: ruleMusicSetting
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
    // InternalMyDsl.g:5687:1: rule__LightAction__ActionnameAssignment_2 : ( ruleEString ) ;
    public final void rule__LightAction__ActionnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5691:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5692:2: ( ruleEString )
            {
            // InternalMyDsl.g:5692:2: ( ruleEString )
            // InternalMyDsl.g:5693:3: ruleEString
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
    // InternalMyDsl.g:5702:1: rule__LightAction__PosAssignment_4 : ( ruleLightPos ) ;
    public final void rule__LightAction__PosAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5706:1: ( ( ruleLightPos ) )
            // InternalMyDsl.g:5707:2: ( ruleLightPos )
            {
            // InternalMyDsl.g:5707:2: ( ruleLightPos )
            // InternalMyDsl.g:5708:3: ruleLightPos
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
    // InternalMyDsl.g:5717:1: rule__LightAction__RedAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__LightAction__RedAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5721:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:5722:2: ( ruleEInt )
            {
            // InternalMyDsl.g:5722:2: ( ruleEInt )
            // InternalMyDsl.g:5723:3: ruleEInt
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
    // InternalMyDsl.g:5732:1: rule__LightAction__GreenAssignment_6_1 : ( ruleEInt ) ;
    public final void rule__LightAction__GreenAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5736:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:5737:2: ( ruleEInt )
            {
            // InternalMyDsl.g:5737:2: ( ruleEInt )
            // InternalMyDsl.g:5738:3: ruleEInt
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
    // InternalMyDsl.g:5747:1: rule__LightAction__BlueAssignment_7_1 : ( ruleEInt ) ;
    public final void rule__LightAction__BlueAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5751:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:5752:2: ( ruleEInt )
            {
            // InternalMyDsl.g:5752:2: ( ruleEInt )
            // InternalMyDsl.g:5753:3: ruleEInt
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


    // $ANTLR start "rule__MusicSetting__NoteAssignment_2"
    // InternalMyDsl.g:5762:1: rule__MusicSetting__NoteAssignment_2 : ( ruleEInt ) ;
    public final void rule__MusicSetting__NoteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5766:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:5767:2: ( ruleEInt )
            {
            // InternalMyDsl.g:5767:2: ( ruleEInt )
            // InternalMyDsl.g:5768:3: ruleEInt
            {
             before(grammarAccess.getMusicSettingAccess().getNoteEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMusicSettingAccess().getNoteEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSetting__NoteAssignment_2"


    // $ANTLR start "rule__MusicSetting__DurationAssignment_4"
    // InternalMyDsl.g:5777:1: rule__MusicSetting__DurationAssignment_4 : ( ruleDuration ) ;
    public final void rule__MusicSetting__DurationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5781:1: ( ( ruleDuration ) )
            // InternalMyDsl.g:5782:2: ( ruleDuration )
            {
            // InternalMyDsl.g:5782:2: ( ruleDuration )
            // InternalMyDsl.g:5783:3: ruleDuration
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


    // $ANTLR start "rule__MusicSetting__PosAssignment_6"
    // InternalMyDsl.g:5792:1: rule__MusicSetting__PosAssignment_6 : ( ruleEInt ) ;
    public final void rule__MusicSetting__PosAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5796:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:5797:2: ( ruleEInt )
            {
            // InternalMyDsl.g:5797:2: ( ruleEInt )
            // InternalMyDsl.g:5798:3: ruleEInt
            {
             before(grammarAccess.getMusicSettingAccess().getPosEIntParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMusicSettingAccess().getPosEIntParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MusicSetting__PosAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x800000B800640040L,0x0000000000000004L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x800000B800640042L,0x0000000000000004L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0148000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0004B00000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002000640040L,0x0000000000000004L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000001E000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000001E002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000007C0000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0030000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x1C00000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000003800000L});

}