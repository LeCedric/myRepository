package com.tad.chart.xtext.parser.antlr.internal;

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
import com.tad.chart.xtext.services.ChartDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalChartDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Company'", "'{'", "'}'", "'employee'", "'weigth'", "'heigth'", "'Project'", "'type'", "'Task'", "'responsable'", "'Development'", "'Regie'"
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
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

        public InternalChartDslParser(TokenStream input, ChartDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Company";
       	}

       	@Override
       	protected ChartDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCompany"
    // InternalChartDsl.g:65:1: entryRuleCompany returns [EObject current=null] : iv_ruleCompany= ruleCompany EOF ;
    public final EObject entryRuleCompany() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompany = null;


        try {
            // InternalChartDsl.g:65:48: (iv_ruleCompany= ruleCompany EOF )
            // InternalChartDsl.g:66:2: iv_ruleCompany= ruleCompany EOF
            {
             newCompositeNode(grammarAccess.getCompanyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompany=ruleCompany();

            state._fsp--;

             current =iv_ruleCompany; 
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
    // $ANTLR end "entryRuleCompany"


    // $ANTLR start "ruleCompany"
    // InternalChartDsl.g:72:1: ruleCompany returns [EObject current=null] : (otherlv_0= 'Company' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_employees_3_0= ruleEmployee ) )* ( (lv_projects_4_0= ruleProject ) )* otherlv_5= '}' ) ;
    public final EObject ruleCompany() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_employees_3_0 = null;

        EObject lv_projects_4_0 = null;



        	enterRule();

        try {
            // InternalChartDsl.g:78:2: ( (otherlv_0= 'Company' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_employees_3_0= ruleEmployee ) )* ( (lv_projects_4_0= ruleProject ) )* otherlv_5= '}' ) )
            // InternalChartDsl.g:79:2: (otherlv_0= 'Company' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_employees_3_0= ruleEmployee ) )* ( (lv_projects_4_0= ruleProject ) )* otherlv_5= '}' )
            {
            // InternalChartDsl.g:79:2: (otherlv_0= 'Company' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_employees_3_0= ruleEmployee ) )* ( (lv_projects_4_0= ruleProject ) )* otherlv_5= '}' )
            // InternalChartDsl.g:80:3: otherlv_0= 'Company' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_employees_3_0= ruleEmployee ) )* ( (lv_projects_4_0= ruleProject ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCompanyAccess().getCompanyKeyword_0());
            		
            // InternalChartDsl.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalChartDsl.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalChartDsl.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalChartDsl.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCompanyAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompanyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCompanyAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalChartDsl.g:106:3: ( (lv_employees_3_0= ruleEmployee ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalChartDsl.g:107:4: (lv_employees_3_0= ruleEmployee )
            	    {
            	    // InternalChartDsl.g:107:4: (lv_employees_3_0= ruleEmployee )
            	    // InternalChartDsl.g:108:5: lv_employees_3_0= ruleEmployee
            	    {

            	    					newCompositeNode(grammarAccess.getCompanyAccess().getEmployeesEmployeeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_employees_3_0=ruleEmployee();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompanyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"employees",
            	    						lv_employees_3_0,
            	    						"com.tad.chart.xtext.ChartDsl.Employee");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalChartDsl.g:125:3: ( (lv_projects_4_0= ruleProject ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalChartDsl.g:126:4: (lv_projects_4_0= ruleProject )
            	    {
            	    // InternalChartDsl.g:126:4: (lv_projects_4_0= ruleProject )
            	    // InternalChartDsl.g:127:5: lv_projects_4_0= ruleProject
            	    {

            	    					newCompositeNode(grammarAccess.getCompanyAccess().getProjectsProjectParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_projects_4_0=ruleProject();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCompanyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"projects",
            	    						lv_projects_4_0,
            	    						"com.tad.chart.xtext.ChartDsl.Project");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getCompanyAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCompany"


    // $ANTLR start "entryRuleEmployee"
    // InternalChartDsl.g:152:1: entryRuleEmployee returns [EObject current=null] : iv_ruleEmployee= ruleEmployee EOF ;
    public final EObject entryRuleEmployee() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmployee = null;


        try {
            // InternalChartDsl.g:152:49: (iv_ruleEmployee= ruleEmployee EOF )
            // InternalChartDsl.g:153:2: iv_ruleEmployee= ruleEmployee EOF
            {
             newCompositeNode(grammarAccess.getEmployeeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmployee=ruleEmployee();

            state._fsp--;

             current =iv_ruleEmployee; 
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
    // $ANTLR end "entryRuleEmployee"


    // $ANTLR start "ruleEmployee"
    // InternalChartDsl.g:159:1: ruleEmployee returns [EObject current=null] : (otherlv_0= 'employee' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'weigth' this_INT_3= RULE_INT )? (otherlv_4= 'heigth' this_INT_5= RULE_INT )? ) ;
    public final EObject ruleEmployee() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token this_INT_3=null;
        Token otherlv_4=null;
        Token this_INT_5=null;


        	enterRule();

        try {
            // InternalChartDsl.g:165:2: ( (otherlv_0= 'employee' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'weigth' this_INT_3= RULE_INT )? (otherlv_4= 'heigth' this_INT_5= RULE_INT )? ) )
            // InternalChartDsl.g:166:2: (otherlv_0= 'employee' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'weigth' this_INT_3= RULE_INT )? (otherlv_4= 'heigth' this_INT_5= RULE_INT )? )
            {
            // InternalChartDsl.g:166:2: (otherlv_0= 'employee' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'weigth' this_INT_3= RULE_INT )? (otherlv_4= 'heigth' this_INT_5= RULE_INT )? )
            // InternalChartDsl.g:167:3: otherlv_0= 'employee' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'weigth' this_INT_3= RULE_INT )? (otherlv_4= 'heigth' this_INT_5= RULE_INT )?
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEmployeeAccess().getEmployeeKeyword_0());
            		
            // InternalChartDsl.g:171:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalChartDsl.g:172:4: (lv_name_1_0= RULE_ID )
            {
            // InternalChartDsl.g:172:4: (lv_name_1_0= RULE_ID )
            // InternalChartDsl.g:173:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEmployeeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmployeeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalChartDsl.g:189:3: (otherlv_2= 'weigth' this_INT_3= RULE_INT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalChartDsl.g:190:4: otherlv_2= 'weigth' this_INT_3= RULE_INT
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getEmployeeAccess().getWeigthKeyword_2_0());
                    			
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_9); 

                    				newLeafNode(this_INT_3, grammarAccess.getEmployeeAccess().getINTTerminalRuleCall_2_1());
                    			

                    }
                    break;

            }

            // InternalChartDsl.g:199:3: (otherlv_4= 'heigth' this_INT_5= RULE_INT )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalChartDsl.g:200:4: otherlv_4= 'heigth' this_INT_5= RULE_INT
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getEmployeeAccess().getHeigthKeyword_3_0());
                    			
                    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				newLeafNode(this_INT_5, grammarAccess.getEmployeeAccess().getINTTerminalRuleCall_3_1());
                    			

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
    // $ANTLR end "ruleEmployee"


    // $ANTLR start "entryRuleProject"
    // InternalChartDsl.g:213:1: entryRuleProject returns [EObject current=null] : iv_ruleProject= ruleProject EOF ;
    public final EObject entryRuleProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProject = null;


        try {
            // InternalChartDsl.g:213:48: (iv_ruleProject= ruleProject EOF )
            // InternalChartDsl.g:214:2: iv_ruleProject= ruleProject EOF
            {
             newCompositeNode(grammarAccess.getProjectRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProject=ruleProject();

            state._fsp--;

             current =iv_ruleProject; 
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
    // $ANTLR end "entryRuleProject"


    // $ANTLR start "ruleProject"
    // InternalChartDsl.g:220:1: ruleProject returns [EObject current=null] : (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_projectType_3_0= ruleProjectType ) ) otherlv_4= '{' ( (lv_tasks_5_0= ruleTask ) )* otherlv_6= '}' ) ;
    public final EObject ruleProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_projectType_3_0 = null;

        EObject lv_tasks_5_0 = null;



        	enterRule();

        try {
            // InternalChartDsl.g:226:2: ( (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_projectType_3_0= ruleProjectType ) ) otherlv_4= '{' ( (lv_tasks_5_0= ruleTask ) )* otherlv_6= '}' ) )
            // InternalChartDsl.g:227:2: (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_projectType_3_0= ruleProjectType ) ) otherlv_4= '{' ( (lv_tasks_5_0= ruleTask ) )* otherlv_6= '}' )
            {
            // InternalChartDsl.g:227:2: (otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_projectType_3_0= ruleProjectType ) ) otherlv_4= '{' ( (lv_tasks_5_0= ruleTask ) )* otherlv_6= '}' )
            // InternalChartDsl.g:228:3: otherlv_0= 'Project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' ( (lv_projectType_3_0= ruleProjectType ) ) otherlv_4= '{' ( (lv_tasks_5_0= ruleTask ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProjectAccess().getProjectKeyword_0());
            		
            // InternalChartDsl.g:232:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalChartDsl.g:233:4: (lv_name_1_0= RULE_ID )
            {
            // InternalChartDsl.g:233:4: (lv_name_1_0= RULE_ID )
            // InternalChartDsl.g:234:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProjectAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProjectRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getProjectAccess().getTypeKeyword_2());
            		
            // InternalChartDsl.g:254:3: ( (lv_projectType_3_0= ruleProjectType ) )
            // InternalChartDsl.g:255:4: (lv_projectType_3_0= ruleProjectType )
            {
            // InternalChartDsl.g:255:4: (lv_projectType_3_0= ruleProjectType )
            // InternalChartDsl.g:256:5: lv_projectType_3_0= ruleProjectType
            {

            					newCompositeNode(grammarAccess.getProjectAccess().getProjectTypeProjectTypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_projectType_3_0=ruleProjectType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProjectRule());
            					}
            					set(
            						current,
            						"projectType",
            						lv_projectType_3_0,
            						"com.tad.chart.xtext.ChartDsl.ProjectType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getProjectAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalChartDsl.g:277:3: ( (lv_tasks_5_0= ruleTask ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalChartDsl.g:278:4: (lv_tasks_5_0= ruleTask )
            	    {
            	    // InternalChartDsl.g:278:4: (lv_tasks_5_0= ruleTask )
            	    // InternalChartDsl.g:279:5: lv_tasks_5_0= ruleTask
            	    {

            	    					newCompositeNode(grammarAccess.getProjectAccess().getTasksTaskParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_tasks_5_0=ruleTask();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProjectRule());
            	    					}
            	    					add(
            	    						current,
            	    						"tasks",
            	    						lv_tasks_5_0,
            	    						"com.tad.chart.xtext.ChartDsl.Task");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getProjectAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleProject"


    // $ANTLR start "entryRuleTask"
    // InternalChartDsl.g:304:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalChartDsl.g:304:45: (iv_ruleTask= ruleTask EOF )
            // InternalChartDsl.g:305:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalChartDsl.g:311:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'responsable' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalChartDsl.g:317:2: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'responsable' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalChartDsl.g:318:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'responsable' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalChartDsl.g:318:2: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'responsable' ( (otherlv_3= RULE_ID ) ) )
            // InternalChartDsl.g:319:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'responsable' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalChartDsl.g:323:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalChartDsl.g:324:4: (lv_name_1_0= RULE_ID )
            {
            // InternalChartDsl.g:324:4: (lv_name_1_0= RULE_ID )
            // InternalChartDsl.g:325:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getResponsableKeyword_2());
            		
            // InternalChartDsl.g:345:3: ( (otherlv_3= RULE_ID ) )
            // InternalChartDsl.g:346:4: (otherlv_3= RULE_ID )
            {
            // InternalChartDsl.g:346:4: (otherlv_3= RULE_ID )
            // InternalChartDsl.g:347:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getResponsableEmployeeCrossReference_3_0());
            				

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "ruleProjectType"
    // InternalChartDsl.g:362:1: ruleProjectType returns [Enumerator current=null] : ( (enumLiteral_0= 'Development' ) | (enumLiteral_1= 'Regie' ) ) ;
    public final Enumerator ruleProjectType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalChartDsl.g:368:2: ( ( (enumLiteral_0= 'Development' ) | (enumLiteral_1= 'Regie' ) ) )
            // InternalChartDsl.g:369:2: ( (enumLiteral_0= 'Development' ) | (enumLiteral_1= 'Regie' ) )
            {
            // InternalChartDsl.g:369:2: ( (enumLiteral_0= 'Development' ) | (enumLiteral_1= 'Regie' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==22) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalChartDsl.g:370:3: (enumLiteral_0= 'Development' )
                    {
                    // InternalChartDsl.g:370:3: (enumLiteral_0= 'Development' )
                    // InternalChartDsl.g:371:4: enumLiteral_0= 'Development'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getProjectTypeAccess().getDevelopmentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProjectTypeAccess().getDevelopmentEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalChartDsl.g:378:3: (enumLiteral_1= 'Regie' )
                    {
                    // InternalChartDsl.g:378:3: (enumLiteral_1= 'Regie' )
                    // InternalChartDsl.g:379:4: enumLiteral_1= 'Regie'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getProjectTypeAccess().getRegieEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getProjectTypeAccess().getRegieEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleProjectType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000026000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});

}