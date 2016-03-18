package com.tad.chart.xtext.ide.contentassist.antlr.internal;

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
import com.tad.chart.xtext.services.ChartDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChartDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Development'", "'Regie'", "'Company'", "'{'", "'}'", "'employee'", "'weigth'", "'heigth'", "'Project'", "'type'", "'Task'", "'responsable'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalChartDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalChartDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalChartDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalChartDsl.g"; }


    	private ChartDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(ChartDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleCompany"
    // InternalChartDsl.g:53:1: entryRuleCompany : ruleCompany EOF ;
    public final void entryRuleCompany() throws RecognitionException {
        try {
            // InternalChartDsl.g:54:1: ( ruleCompany EOF )
            // InternalChartDsl.g:55:1: ruleCompany EOF
            {
             before(grammarAccess.getCompanyRule()); 
            pushFollow(FOLLOW_1);
            ruleCompany();

            state._fsp--;

             after(grammarAccess.getCompanyRule()); 
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
    // $ANTLR end "entryRuleCompany"


    // $ANTLR start "ruleCompany"
    // InternalChartDsl.g:62:1: ruleCompany : ( ( rule__Company__Group__0 ) ) ;
    public final void ruleCompany() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:66:2: ( ( ( rule__Company__Group__0 ) ) )
            // InternalChartDsl.g:67:2: ( ( rule__Company__Group__0 ) )
            {
            // InternalChartDsl.g:67:2: ( ( rule__Company__Group__0 ) )
            // InternalChartDsl.g:68:3: ( rule__Company__Group__0 )
            {
             before(grammarAccess.getCompanyAccess().getGroup()); 
            // InternalChartDsl.g:69:3: ( rule__Company__Group__0 )
            // InternalChartDsl.g:69:4: rule__Company__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Company__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompany"


    // $ANTLR start "entryRuleEmployee"
    // InternalChartDsl.g:78:1: entryRuleEmployee : ruleEmployee EOF ;
    public final void entryRuleEmployee() throws RecognitionException {
        try {
            // InternalChartDsl.g:79:1: ( ruleEmployee EOF )
            // InternalChartDsl.g:80:1: ruleEmployee EOF
            {
             before(grammarAccess.getEmployeeRule()); 
            pushFollow(FOLLOW_1);
            ruleEmployee();

            state._fsp--;

             after(grammarAccess.getEmployeeRule()); 
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
    // $ANTLR end "entryRuleEmployee"


    // $ANTLR start "ruleEmployee"
    // InternalChartDsl.g:87:1: ruleEmployee : ( ( rule__Employee__Group__0 ) ) ;
    public final void ruleEmployee() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:91:2: ( ( ( rule__Employee__Group__0 ) ) )
            // InternalChartDsl.g:92:2: ( ( rule__Employee__Group__0 ) )
            {
            // InternalChartDsl.g:92:2: ( ( rule__Employee__Group__0 ) )
            // InternalChartDsl.g:93:3: ( rule__Employee__Group__0 )
            {
             before(grammarAccess.getEmployeeAccess().getGroup()); 
            // InternalChartDsl.g:94:3: ( rule__Employee__Group__0 )
            // InternalChartDsl.g:94:4: rule__Employee__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Employee__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmployee"


    // $ANTLR start "entryRuleProject"
    // InternalChartDsl.g:103:1: entryRuleProject : ruleProject EOF ;
    public final void entryRuleProject() throws RecognitionException {
        try {
            // InternalChartDsl.g:104:1: ( ruleProject EOF )
            // InternalChartDsl.g:105:1: ruleProject EOF
            {
             before(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getProjectRule()); 
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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalChartDsl.g:112:1: ruleProject : ( ( rule__Project__Group__0 ) ) ;
    public final void ruleProject() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:116:2: ( ( ( rule__Project__Group__0 ) ) )
            // InternalChartDsl.g:117:2: ( ( rule__Project__Group__0 ) )
            {
            // InternalChartDsl.g:117:2: ( ( rule__Project__Group__0 ) )
            // InternalChartDsl.g:118:3: ( rule__Project__Group__0 )
            {
             before(grammarAccess.getProjectAccess().getGroup()); 
            // InternalChartDsl.g:119:3: ( rule__Project__Group__0 )
            // InternalChartDsl.g:119:4: rule__Project__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleTask"
    // InternalChartDsl.g:128:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalChartDsl.g:129:1: ( ruleTask EOF )
            // InternalChartDsl.g:130:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalChartDsl.g:137:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:141:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalChartDsl.g:142:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalChartDsl.g:142:2: ( ( rule__Task__Group__0 ) )
            // InternalChartDsl.g:143:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalChartDsl.g:144:3: ( rule__Task__Group__0 )
            // InternalChartDsl.g:144:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "ruleProjectType"
    // InternalChartDsl.g:153:1: ruleProjectType : ( ( rule__ProjectType__Alternatives ) ) ;
    public final void ruleProjectType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:157:1: ( ( ( rule__ProjectType__Alternatives ) ) )
            // InternalChartDsl.g:158:2: ( ( rule__ProjectType__Alternatives ) )
            {
            // InternalChartDsl.g:158:2: ( ( rule__ProjectType__Alternatives ) )
            // InternalChartDsl.g:159:3: ( rule__ProjectType__Alternatives )
            {
             before(grammarAccess.getProjectTypeAccess().getAlternatives()); 
            // InternalChartDsl.g:160:3: ( rule__ProjectType__Alternatives )
            // InternalChartDsl.g:160:4: rule__ProjectType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ProjectType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProjectTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProjectType"


    // $ANTLR start "rule__ProjectType__Alternatives"
    // InternalChartDsl.g:168:1: rule__ProjectType__Alternatives : ( ( ( 'Development' ) ) | ( ( 'Regie' ) ) );
    public final void rule__ProjectType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:172:1: ( ( ( 'Development' ) ) | ( ( 'Regie' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalChartDsl.g:173:2: ( ( 'Development' ) )
                    {
                    // InternalChartDsl.g:173:2: ( ( 'Development' ) )
                    // InternalChartDsl.g:174:3: ( 'Development' )
                    {
                     before(grammarAccess.getProjectTypeAccess().getDevelopmentEnumLiteralDeclaration_0()); 
                    // InternalChartDsl.g:175:3: ( 'Development' )
                    // InternalChartDsl.g:175:4: 'Development'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getProjectTypeAccess().getDevelopmentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalChartDsl.g:179:2: ( ( 'Regie' ) )
                    {
                    // InternalChartDsl.g:179:2: ( ( 'Regie' ) )
                    // InternalChartDsl.g:180:3: ( 'Regie' )
                    {
                     before(grammarAccess.getProjectTypeAccess().getRegieEnumLiteralDeclaration_1()); 
                    // InternalChartDsl.g:181:3: ( 'Regie' )
                    // InternalChartDsl.g:181:4: 'Regie'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getProjectTypeAccess().getRegieEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__ProjectType__Alternatives"


    // $ANTLR start "rule__Company__Group__0"
    // InternalChartDsl.g:189:1: rule__Company__Group__0 : rule__Company__Group__0__Impl rule__Company__Group__1 ;
    public final void rule__Company__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:193:1: ( rule__Company__Group__0__Impl rule__Company__Group__1 )
            // InternalChartDsl.g:194:2: rule__Company__Group__0__Impl rule__Company__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Company__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__0"


    // $ANTLR start "rule__Company__Group__0__Impl"
    // InternalChartDsl.g:201:1: rule__Company__Group__0__Impl : ( 'Company' ) ;
    public final void rule__Company__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:205:1: ( ( 'Company' ) )
            // InternalChartDsl.g:206:1: ( 'Company' )
            {
            // InternalChartDsl.g:206:1: ( 'Company' )
            // InternalChartDsl.g:207:2: 'Company'
            {
             before(grammarAccess.getCompanyAccess().getCompanyKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getCompanyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__0__Impl"


    // $ANTLR start "rule__Company__Group__1"
    // InternalChartDsl.g:216:1: rule__Company__Group__1 : rule__Company__Group__1__Impl rule__Company__Group__2 ;
    public final void rule__Company__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:220:1: ( rule__Company__Group__1__Impl rule__Company__Group__2 )
            // InternalChartDsl.g:221:2: rule__Company__Group__1__Impl rule__Company__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Company__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__1"


    // $ANTLR start "rule__Company__Group__1__Impl"
    // InternalChartDsl.g:228:1: rule__Company__Group__1__Impl : ( ( rule__Company__NameAssignment_1 ) ) ;
    public final void rule__Company__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:232:1: ( ( ( rule__Company__NameAssignment_1 ) ) )
            // InternalChartDsl.g:233:1: ( ( rule__Company__NameAssignment_1 ) )
            {
            // InternalChartDsl.g:233:1: ( ( rule__Company__NameAssignment_1 ) )
            // InternalChartDsl.g:234:2: ( rule__Company__NameAssignment_1 )
            {
             before(grammarAccess.getCompanyAccess().getNameAssignment_1()); 
            // InternalChartDsl.g:235:2: ( rule__Company__NameAssignment_1 )
            // InternalChartDsl.g:235:3: rule__Company__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Company__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCompanyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__1__Impl"


    // $ANTLR start "rule__Company__Group__2"
    // InternalChartDsl.g:243:1: rule__Company__Group__2 : rule__Company__Group__2__Impl rule__Company__Group__3 ;
    public final void rule__Company__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:247:1: ( rule__Company__Group__2__Impl rule__Company__Group__3 )
            // InternalChartDsl.g:248:2: rule__Company__Group__2__Impl rule__Company__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Company__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__2"


    // $ANTLR start "rule__Company__Group__2__Impl"
    // InternalChartDsl.g:255:1: rule__Company__Group__2__Impl : ( '{' ) ;
    public final void rule__Company__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:259:1: ( ( '{' ) )
            // InternalChartDsl.g:260:1: ( '{' )
            {
            // InternalChartDsl.g:260:1: ( '{' )
            // InternalChartDsl.g:261:2: '{'
            {
             before(grammarAccess.getCompanyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__2__Impl"


    // $ANTLR start "rule__Company__Group__3"
    // InternalChartDsl.g:270:1: rule__Company__Group__3 : rule__Company__Group__3__Impl rule__Company__Group__4 ;
    public final void rule__Company__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:274:1: ( rule__Company__Group__3__Impl rule__Company__Group__4 )
            // InternalChartDsl.g:275:2: rule__Company__Group__3__Impl rule__Company__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Company__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__3"


    // $ANTLR start "rule__Company__Group__3__Impl"
    // InternalChartDsl.g:282:1: rule__Company__Group__3__Impl : ( ( rule__Company__EmployeesAssignment_3 )* ) ;
    public final void rule__Company__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:286:1: ( ( ( rule__Company__EmployeesAssignment_3 )* ) )
            // InternalChartDsl.g:287:1: ( ( rule__Company__EmployeesAssignment_3 )* )
            {
            // InternalChartDsl.g:287:1: ( ( rule__Company__EmployeesAssignment_3 )* )
            // InternalChartDsl.g:288:2: ( rule__Company__EmployeesAssignment_3 )*
            {
             before(grammarAccess.getCompanyAccess().getEmployeesAssignment_3()); 
            // InternalChartDsl.g:289:2: ( rule__Company__EmployeesAssignment_3 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalChartDsl.g:289:3: rule__Company__EmployeesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Company__EmployeesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getCompanyAccess().getEmployeesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__3__Impl"


    // $ANTLR start "rule__Company__Group__4"
    // InternalChartDsl.g:297:1: rule__Company__Group__4 : rule__Company__Group__4__Impl rule__Company__Group__5 ;
    public final void rule__Company__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:301:1: ( rule__Company__Group__4__Impl rule__Company__Group__5 )
            // InternalChartDsl.g:302:2: rule__Company__Group__4__Impl rule__Company__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Company__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Company__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__4"


    // $ANTLR start "rule__Company__Group__4__Impl"
    // InternalChartDsl.g:309:1: rule__Company__Group__4__Impl : ( ( rule__Company__ProjectsAssignment_4 )* ) ;
    public final void rule__Company__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:313:1: ( ( ( rule__Company__ProjectsAssignment_4 )* ) )
            // InternalChartDsl.g:314:1: ( ( rule__Company__ProjectsAssignment_4 )* )
            {
            // InternalChartDsl.g:314:1: ( ( rule__Company__ProjectsAssignment_4 )* )
            // InternalChartDsl.g:315:2: ( rule__Company__ProjectsAssignment_4 )*
            {
             before(grammarAccess.getCompanyAccess().getProjectsAssignment_4()); 
            // InternalChartDsl.g:316:2: ( rule__Company__ProjectsAssignment_4 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalChartDsl.g:316:3: rule__Company__ProjectsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Company__ProjectsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getCompanyAccess().getProjectsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__4__Impl"


    // $ANTLR start "rule__Company__Group__5"
    // InternalChartDsl.g:324:1: rule__Company__Group__5 : rule__Company__Group__5__Impl ;
    public final void rule__Company__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:328:1: ( rule__Company__Group__5__Impl )
            // InternalChartDsl.g:329:2: rule__Company__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Company__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__5"


    // $ANTLR start "rule__Company__Group__5__Impl"
    // InternalChartDsl.g:335:1: rule__Company__Group__5__Impl : ( '}' ) ;
    public final void rule__Company__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:339:1: ( ( '}' ) )
            // InternalChartDsl.g:340:1: ( '}' )
            {
            // InternalChartDsl.g:340:1: ( '}' )
            // InternalChartDsl.g:341:2: '}'
            {
             before(grammarAccess.getCompanyAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__Group__5__Impl"


    // $ANTLR start "rule__Employee__Group__0"
    // InternalChartDsl.g:351:1: rule__Employee__Group__0 : rule__Employee__Group__0__Impl rule__Employee__Group__1 ;
    public final void rule__Employee__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:355:1: ( rule__Employee__Group__0__Impl rule__Employee__Group__1 )
            // InternalChartDsl.g:356:2: rule__Employee__Group__0__Impl rule__Employee__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Employee__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__0"


    // $ANTLR start "rule__Employee__Group__0__Impl"
    // InternalChartDsl.g:363:1: rule__Employee__Group__0__Impl : ( 'employee' ) ;
    public final void rule__Employee__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:367:1: ( ( 'employee' ) )
            // InternalChartDsl.g:368:1: ( 'employee' )
            {
            // InternalChartDsl.g:368:1: ( 'employee' )
            // InternalChartDsl.g:369:2: 'employee'
            {
             before(grammarAccess.getEmployeeAccess().getEmployeeKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getEmployeeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__0__Impl"


    // $ANTLR start "rule__Employee__Group__1"
    // InternalChartDsl.g:378:1: rule__Employee__Group__1 : rule__Employee__Group__1__Impl rule__Employee__Group__2 ;
    public final void rule__Employee__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:382:1: ( rule__Employee__Group__1__Impl rule__Employee__Group__2 )
            // InternalChartDsl.g:383:2: rule__Employee__Group__1__Impl rule__Employee__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Employee__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__1"


    // $ANTLR start "rule__Employee__Group__1__Impl"
    // InternalChartDsl.g:390:1: rule__Employee__Group__1__Impl : ( ( rule__Employee__NameAssignment_1 ) ) ;
    public final void rule__Employee__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:394:1: ( ( ( rule__Employee__NameAssignment_1 ) ) )
            // InternalChartDsl.g:395:1: ( ( rule__Employee__NameAssignment_1 ) )
            {
            // InternalChartDsl.g:395:1: ( ( rule__Employee__NameAssignment_1 ) )
            // InternalChartDsl.g:396:2: ( rule__Employee__NameAssignment_1 )
            {
             before(grammarAccess.getEmployeeAccess().getNameAssignment_1()); 
            // InternalChartDsl.g:397:2: ( rule__Employee__NameAssignment_1 )
            // InternalChartDsl.g:397:3: rule__Employee__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Employee__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEmployeeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__1__Impl"


    // $ANTLR start "rule__Employee__Group__2"
    // InternalChartDsl.g:405:1: rule__Employee__Group__2 : rule__Employee__Group__2__Impl rule__Employee__Group__3 ;
    public final void rule__Employee__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:409:1: ( rule__Employee__Group__2__Impl rule__Employee__Group__3 )
            // InternalChartDsl.g:410:2: rule__Employee__Group__2__Impl rule__Employee__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Employee__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__2"


    // $ANTLR start "rule__Employee__Group__2__Impl"
    // InternalChartDsl.g:417:1: rule__Employee__Group__2__Impl : ( ( rule__Employee__Group_2__0 )? ) ;
    public final void rule__Employee__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:421:1: ( ( ( rule__Employee__Group_2__0 )? ) )
            // InternalChartDsl.g:422:1: ( ( rule__Employee__Group_2__0 )? )
            {
            // InternalChartDsl.g:422:1: ( ( rule__Employee__Group_2__0 )? )
            // InternalChartDsl.g:423:2: ( rule__Employee__Group_2__0 )?
            {
             before(grammarAccess.getEmployeeAccess().getGroup_2()); 
            // InternalChartDsl.g:424:2: ( rule__Employee__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalChartDsl.g:424:3: rule__Employee__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Employee__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmployeeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__2__Impl"


    // $ANTLR start "rule__Employee__Group__3"
    // InternalChartDsl.g:432:1: rule__Employee__Group__3 : rule__Employee__Group__3__Impl ;
    public final void rule__Employee__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:436:1: ( rule__Employee__Group__3__Impl )
            // InternalChartDsl.g:437:2: rule__Employee__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Employee__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__3"


    // $ANTLR start "rule__Employee__Group__3__Impl"
    // InternalChartDsl.g:443:1: rule__Employee__Group__3__Impl : ( ( rule__Employee__Group_3__0 )? ) ;
    public final void rule__Employee__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:447:1: ( ( ( rule__Employee__Group_3__0 )? ) )
            // InternalChartDsl.g:448:1: ( ( rule__Employee__Group_3__0 )? )
            {
            // InternalChartDsl.g:448:1: ( ( rule__Employee__Group_3__0 )? )
            // InternalChartDsl.g:449:2: ( rule__Employee__Group_3__0 )?
            {
             before(grammarAccess.getEmployeeAccess().getGroup_3()); 
            // InternalChartDsl.g:450:2: ( rule__Employee__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalChartDsl.g:450:3: rule__Employee__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Employee__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmployeeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group__3__Impl"


    // $ANTLR start "rule__Employee__Group_2__0"
    // InternalChartDsl.g:459:1: rule__Employee__Group_2__0 : rule__Employee__Group_2__0__Impl rule__Employee__Group_2__1 ;
    public final void rule__Employee__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:463:1: ( rule__Employee__Group_2__0__Impl rule__Employee__Group_2__1 )
            // InternalChartDsl.g:464:2: rule__Employee__Group_2__0__Impl rule__Employee__Group_2__1
            {
            pushFollow(FOLLOW_9);
            rule__Employee__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_2__0"


    // $ANTLR start "rule__Employee__Group_2__0__Impl"
    // InternalChartDsl.g:471:1: rule__Employee__Group_2__0__Impl : ( 'weigth' ) ;
    public final void rule__Employee__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:475:1: ( ( 'weigth' ) )
            // InternalChartDsl.g:476:1: ( 'weigth' )
            {
            // InternalChartDsl.g:476:1: ( 'weigth' )
            // InternalChartDsl.g:477:2: 'weigth'
            {
             before(grammarAccess.getEmployeeAccess().getWeigthKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getWeigthKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_2__0__Impl"


    // $ANTLR start "rule__Employee__Group_2__1"
    // InternalChartDsl.g:486:1: rule__Employee__Group_2__1 : rule__Employee__Group_2__1__Impl ;
    public final void rule__Employee__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:490:1: ( rule__Employee__Group_2__1__Impl )
            // InternalChartDsl.g:491:2: rule__Employee__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Employee__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_2__1"


    // $ANTLR start "rule__Employee__Group_2__1__Impl"
    // InternalChartDsl.g:497:1: rule__Employee__Group_2__1__Impl : ( RULE_INT ) ;
    public final void rule__Employee__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:501:1: ( ( RULE_INT ) )
            // InternalChartDsl.g:502:1: ( RULE_INT )
            {
            // InternalChartDsl.g:502:1: ( RULE_INT )
            // InternalChartDsl.g:503:2: RULE_INT
            {
             before(grammarAccess.getEmployeeAccess().getINTTerminalRuleCall_2_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getINTTerminalRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_2__1__Impl"


    // $ANTLR start "rule__Employee__Group_3__0"
    // InternalChartDsl.g:513:1: rule__Employee__Group_3__0 : rule__Employee__Group_3__0__Impl rule__Employee__Group_3__1 ;
    public final void rule__Employee__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:517:1: ( rule__Employee__Group_3__0__Impl rule__Employee__Group_3__1 )
            // InternalChartDsl.g:518:2: rule__Employee__Group_3__0__Impl rule__Employee__Group_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Employee__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Employee__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_3__0"


    // $ANTLR start "rule__Employee__Group_3__0__Impl"
    // InternalChartDsl.g:525:1: rule__Employee__Group_3__0__Impl : ( 'heigth' ) ;
    public final void rule__Employee__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:529:1: ( ( 'heigth' ) )
            // InternalChartDsl.g:530:1: ( 'heigth' )
            {
            // InternalChartDsl.g:530:1: ( 'heigth' )
            // InternalChartDsl.g:531:2: 'heigth'
            {
             before(grammarAccess.getEmployeeAccess().getHeigthKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getHeigthKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_3__0__Impl"


    // $ANTLR start "rule__Employee__Group_3__1"
    // InternalChartDsl.g:540:1: rule__Employee__Group_3__1 : rule__Employee__Group_3__1__Impl ;
    public final void rule__Employee__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:544:1: ( rule__Employee__Group_3__1__Impl )
            // InternalChartDsl.g:545:2: rule__Employee__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Employee__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_3__1"


    // $ANTLR start "rule__Employee__Group_3__1__Impl"
    // InternalChartDsl.g:551:1: rule__Employee__Group_3__1__Impl : ( RULE_INT ) ;
    public final void rule__Employee__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:555:1: ( ( RULE_INT ) )
            // InternalChartDsl.g:556:1: ( RULE_INT )
            {
            // InternalChartDsl.g:556:1: ( RULE_INT )
            // InternalChartDsl.g:557:2: RULE_INT
            {
             before(grammarAccess.getEmployeeAccess().getINTTerminalRuleCall_3_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getINTTerminalRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__Group_3__1__Impl"


    // $ANTLR start "rule__Project__Group__0"
    // InternalChartDsl.g:567:1: rule__Project__Group__0 : rule__Project__Group__0__Impl rule__Project__Group__1 ;
    public final void rule__Project__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:571:1: ( rule__Project__Group__0__Impl rule__Project__Group__1 )
            // InternalChartDsl.g:572:2: rule__Project__Group__0__Impl rule__Project__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Project__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0"


    // $ANTLR start "rule__Project__Group__0__Impl"
    // InternalChartDsl.g:579:1: rule__Project__Group__0__Impl : ( 'Project' ) ;
    public final void rule__Project__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:583:1: ( ( 'Project' ) )
            // InternalChartDsl.g:584:1: ( 'Project' )
            {
            // InternalChartDsl.g:584:1: ( 'Project' )
            // InternalChartDsl.g:585:2: 'Project'
            {
             before(grammarAccess.getProjectAccess().getProjectKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getProjectKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__0__Impl"


    // $ANTLR start "rule__Project__Group__1"
    // InternalChartDsl.g:594:1: rule__Project__Group__1 : rule__Project__Group__1__Impl rule__Project__Group__2 ;
    public final void rule__Project__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:598:1: ( rule__Project__Group__1__Impl rule__Project__Group__2 )
            // InternalChartDsl.g:599:2: rule__Project__Group__1__Impl rule__Project__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Project__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1"


    // $ANTLR start "rule__Project__Group__1__Impl"
    // InternalChartDsl.g:606:1: rule__Project__Group__1__Impl : ( ( rule__Project__NameAssignment_1 ) ) ;
    public final void rule__Project__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:610:1: ( ( ( rule__Project__NameAssignment_1 ) ) )
            // InternalChartDsl.g:611:1: ( ( rule__Project__NameAssignment_1 ) )
            {
            // InternalChartDsl.g:611:1: ( ( rule__Project__NameAssignment_1 ) )
            // InternalChartDsl.g:612:2: ( rule__Project__NameAssignment_1 )
            {
             before(grammarAccess.getProjectAccess().getNameAssignment_1()); 
            // InternalChartDsl.g:613:2: ( rule__Project__NameAssignment_1 )
            // InternalChartDsl.g:613:3: rule__Project__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Project__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__1__Impl"


    // $ANTLR start "rule__Project__Group__2"
    // InternalChartDsl.g:621:1: rule__Project__Group__2 : rule__Project__Group__2__Impl rule__Project__Group__3 ;
    public final void rule__Project__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:625:1: ( rule__Project__Group__2__Impl rule__Project__Group__3 )
            // InternalChartDsl.g:626:2: rule__Project__Group__2__Impl rule__Project__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Project__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2"


    // $ANTLR start "rule__Project__Group__2__Impl"
    // InternalChartDsl.g:633:1: rule__Project__Group__2__Impl : ( 'type' ) ;
    public final void rule__Project__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:637:1: ( ( 'type' ) )
            // InternalChartDsl.g:638:1: ( 'type' )
            {
            // InternalChartDsl.g:638:1: ( 'type' )
            // InternalChartDsl.g:639:2: 'type'
            {
             before(grammarAccess.getProjectAccess().getTypeKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__2__Impl"


    // $ANTLR start "rule__Project__Group__3"
    // InternalChartDsl.g:648:1: rule__Project__Group__3 : rule__Project__Group__3__Impl rule__Project__Group__4 ;
    public final void rule__Project__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:652:1: ( rule__Project__Group__3__Impl rule__Project__Group__4 )
            // InternalChartDsl.g:653:2: rule__Project__Group__3__Impl rule__Project__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Project__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__3"


    // $ANTLR start "rule__Project__Group__3__Impl"
    // InternalChartDsl.g:660:1: rule__Project__Group__3__Impl : ( ( rule__Project__ProjectTypeAssignment_3 ) ) ;
    public final void rule__Project__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:664:1: ( ( ( rule__Project__ProjectTypeAssignment_3 ) ) )
            // InternalChartDsl.g:665:1: ( ( rule__Project__ProjectTypeAssignment_3 ) )
            {
            // InternalChartDsl.g:665:1: ( ( rule__Project__ProjectTypeAssignment_3 ) )
            // InternalChartDsl.g:666:2: ( rule__Project__ProjectTypeAssignment_3 )
            {
             before(grammarAccess.getProjectAccess().getProjectTypeAssignment_3()); 
            // InternalChartDsl.g:667:2: ( rule__Project__ProjectTypeAssignment_3 )
            // InternalChartDsl.g:667:3: rule__Project__ProjectTypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Project__ProjectTypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProjectAccess().getProjectTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__3__Impl"


    // $ANTLR start "rule__Project__Group__4"
    // InternalChartDsl.g:675:1: rule__Project__Group__4 : rule__Project__Group__4__Impl rule__Project__Group__5 ;
    public final void rule__Project__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:679:1: ( rule__Project__Group__4__Impl rule__Project__Group__5 )
            // InternalChartDsl.g:680:2: rule__Project__Group__4__Impl rule__Project__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Project__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__4"


    // $ANTLR start "rule__Project__Group__4__Impl"
    // InternalChartDsl.g:687:1: rule__Project__Group__4__Impl : ( '{' ) ;
    public final void rule__Project__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:691:1: ( ( '{' ) )
            // InternalChartDsl.g:692:1: ( '{' )
            {
            // InternalChartDsl.g:692:1: ( '{' )
            // InternalChartDsl.g:693:2: '{'
            {
             before(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__4__Impl"


    // $ANTLR start "rule__Project__Group__5"
    // InternalChartDsl.g:702:1: rule__Project__Group__5 : rule__Project__Group__5__Impl rule__Project__Group__6 ;
    public final void rule__Project__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:706:1: ( rule__Project__Group__5__Impl rule__Project__Group__6 )
            // InternalChartDsl.g:707:2: rule__Project__Group__5__Impl rule__Project__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Project__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Project__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__5"


    // $ANTLR start "rule__Project__Group__5__Impl"
    // InternalChartDsl.g:714:1: rule__Project__Group__5__Impl : ( ( rule__Project__TasksAssignment_5 )* ) ;
    public final void rule__Project__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:718:1: ( ( ( rule__Project__TasksAssignment_5 )* ) )
            // InternalChartDsl.g:719:1: ( ( rule__Project__TasksAssignment_5 )* )
            {
            // InternalChartDsl.g:719:1: ( ( rule__Project__TasksAssignment_5 )* )
            // InternalChartDsl.g:720:2: ( rule__Project__TasksAssignment_5 )*
            {
             before(grammarAccess.getProjectAccess().getTasksAssignment_5()); 
            // InternalChartDsl.g:721:2: ( rule__Project__TasksAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalChartDsl.g:721:3: rule__Project__TasksAssignment_5
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Project__TasksAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getProjectAccess().getTasksAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__5__Impl"


    // $ANTLR start "rule__Project__Group__6"
    // InternalChartDsl.g:729:1: rule__Project__Group__6 : rule__Project__Group__6__Impl ;
    public final void rule__Project__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:733:1: ( rule__Project__Group__6__Impl )
            // InternalChartDsl.g:734:2: rule__Project__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Project__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__6"


    // $ANTLR start "rule__Project__Group__6__Impl"
    // InternalChartDsl.g:740:1: rule__Project__Group__6__Impl : ( '}' ) ;
    public final void rule__Project__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:744:1: ( ( '}' ) )
            // InternalChartDsl.g:745:1: ( '}' )
            {
            // InternalChartDsl.g:745:1: ( '}' )
            // InternalChartDsl.g:746:2: '}'
            {
             before(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__Group__6__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalChartDsl.g:756:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:760:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalChartDsl.g:761:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalChartDsl.g:768:1: rule__Task__Group__0__Impl : ( 'Task' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:772:1: ( ( 'Task' ) )
            // InternalChartDsl.g:773:1: ( 'Task' )
            {
            // InternalChartDsl.g:773:1: ( 'Task' )
            // InternalChartDsl.g:774:2: 'Task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalChartDsl.g:783:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:787:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalChartDsl.g:788:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalChartDsl.g:795:1: rule__Task__Group__1__Impl : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:799:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // InternalChartDsl.g:800:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // InternalChartDsl.g:800:1: ( ( rule__Task__NameAssignment_1 ) )
            // InternalChartDsl.g:801:2: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // InternalChartDsl.g:802:2: ( rule__Task__NameAssignment_1 )
            // InternalChartDsl.g:802:3: rule__Task__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalChartDsl.g:810:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:814:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalChartDsl.g:815:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Task__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalChartDsl.g:822:1: rule__Task__Group__2__Impl : ( 'responsable' ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:826:1: ( ( 'responsable' ) )
            // InternalChartDsl.g:827:1: ( 'responsable' )
            {
            // InternalChartDsl.g:827:1: ( 'responsable' )
            // InternalChartDsl.g:828:2: 'responsable'
            {
             before(grammarAccess.getTaskAccess().getResponsableKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getResponsableKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__3"
    // InternalChartDsl.g:837:1: rule__Task__Group__3 : rule__Task__Group__3__Impl ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:841:1: ( rule__Task__Group__3__Impl )
            // InternalChartDsl.g:842:2: rule__Task__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3"


    // $ANTLR start "rule__Task__Group__3__Impl"
    // InternalChartDsl.g:848:1: rule__Task__Group__3__Impl : ( ( rule__Task__ResponsableAssignment_3 ) ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:852:1: ( ( ( rule__Task__ResponsableAssignment_3 ) ) )
            // InternalChartDsl.g:853:1: ( ( rule__Task__ResponsableAssignment_3 ) )
            {
            // InternalChartDsl.g:853:1: ( ( rule__Task__ResponsableAssignment_3 ) )
            // InternalChartDsl.g:854:2: ( rule__Task__ResponsableAssignment_3 )
            {
             before(grammarAccess.getTaskAccess().getResponsableAssignment_3()); 
            // InternalChartDsl.g:855:2: ( rule__Task__ResponsableAssignment_3 )
            // InternalChartDsl.g:855:3: rule__Task__ResponsableAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Task__ResponsableAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getResponsableAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3__Impl"


    // $ANTLR start "rule__Company__NameAssignment_1"
    // InternalChartDsl.g:864:1: rule__Company__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Company__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:868:1: ( ( RULE_ID ) )
            // InternalChartDsl.g:869:2: ( RULE_ID )
            {
            // InternalChartDsl.g:869:2: ( RULE_ID )
            // InternalChartDsl.g:870:3: RULE_ID
            {
             before(grammarAccess.getCompanyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCompanyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__NameAssignment_1"


    // $ANTLR start "rule__Company__EmployeesAssignment_3"
    // InternalChartDsl.g:879:1: rule__Company__EmployeesAssignment_3 : ( ruleEmployee ) ;
    public final void rule__Company__EmployeesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:883:1: ( ( ruleEmployee ) )
            // InternalChartDsl.g:884:2: ( ruleEmployee )
            {
            // InternalChartDsl.g:884:2: ( ruleEmployee )
            // InternalChartDsl.g:885:3: ruleEmployee
            {
             before(grammarAccess.getCompanyAccess().getEmployeesEmployeeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEmployee();

            state._fsp--;

             after(grammarAccess.getCompanyAccess().getEmployeesEmployeeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__EmployeesAssignment_3"


    // $ANTLR start "rule__Company__ProjectsAssignment_4"
    // InternalChartDsl.g:894:1: rule__Company__ProjectsAssignment_4 : ( ruleProject ) ;
    public final void rule__Company__ProjectsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:898:1: ( ( ruleProject ) )
            // InternalChartDsl.g:899:2: ( ruleProject )
            {
            // InternalChartDsl.g:899:2: ( ruleProject )
            // InternalChartDsl.g:900:3: ruleProject
            {
             before(grammarAccess.getCompanyAccess().getProjectsProjectParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleProject();

            state._fsp--;

             after(grammarAccess.getCompanyAccess().getProjectsProjectParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Company__ProjectsAssignment_4"


    // $ANTLR start "rule__Employee__NameAssignment_1"
    // InternalChartDsl.g:909:1: rule__Employee__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Employee__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:913:1: ( ( RULE_ID ) )
            // InternalChartDsl.g:914:2: ( RULE_ID )
            {
            // InternalChartDsl.g:914:2: ( RULE_ID )
            // InternalChartDsl.g:915:3: RULE_ID
            {
             before(grammarAccess.getEmployeeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEmployeeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Employee__NameAssignment_1"


    // $ANTLR start "rule__Project__NameAssignment_1"
    // InternalChartDsl.g:924:1: rule__Project__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Project__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:928:1: ( ( RULE_ID ) )
            // InternalChartDsl.g:929:2: ( RULE_ID )
            {
            // InternalChartDsl.g:929:2: ( RULE_ID )
            // InternalChartDsl.g:930:3: RULE_ID
            {
             before(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__NameAssignment_1"


    // $ANTLR start "rule__Project__ProjectTypeAssignment_3"
    // InternalChartDsl.g:939:1: rule__Project__ProjectTypeAssignment_3 : ( ruleProjectType ) ;
    public final void rule__Project__ProjectTypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:943:1: ( ( ruleProjectType ) )
            // InternalChartDsl.g:944:2: ( ruleProjectType )
            {
            // InternalChartDsl.g:944:2: ( ruleProjectType )
            // InternalChartDsl.g:945:3: ruleProjectType
            {
             before(grammarAccess.getProjectAccess().getProjectTypeProjectTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleProjectType();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getProjectTypeProjectTypeEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__ProjectTypeAssignment_3"


    // $ANTLR start "rule__Project__TasksAssignment_5"
    // InternalChartDsl.g:954:1: rule__Project__TasksAssignment_5 : ( ruleTask ) ;
    public final void rule__Project__TasksAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:958:1: ( ( ruleTask ) )
            // InternalChartDsl.g:959:2: ( ruleTask )
            {
            // InternalChartDsl.g:959:2: ( ruleTask )
            // InternalChartDsl.g:960:3: ruleTask
            {
             before(grammarAccess.getProjectAccess().getTasksTaskParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getProjectAccess().getTasksTaskParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Project__TasksAssignment_5"


    // $ANTLR start "rule__Task__NameAssignment_1"
    // InternalChartDsl.g:969:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:973:1: ( ( RULE_ID ) )
            // InternalChartDsl.g:974:2: ( RULE_ID )
            {
            // InternalChartDsl.g:974:2: ( RULE_ID )
            // InternalChartDsl.g:975:3: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__NameAssignment_1"


    // $ANTLR start "rule__Task__ResponsableAssignment_3"
    // InternalChartDsl.g:984:1: rule__Task__ResponsableAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Task__ResponsableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalChartDsl.g:988:1: ( ( ( RULE_ID ) ) )
            // InternalChartDsl.g:989:2: ( ( RULE_ID ) )
            {
            // InternalChartDsl.g:989:2: ( ( RULE_ID ) )
            // InternalChartDsl.g:990:3: ( RULE_ID )
            {
             before(grammarAccess.getTaskAccess().getResponsableEmployeeCrossReference_3_0()); 
            // InternalChartDsl.g:991:3: ( RULE_ID )
            // InternalChartDsl.g:992:4: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getResponsableEmployeeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getResponsableEmployeeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTaskAccess().getResponsableEmployeeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__ResponsableAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000098000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});

}