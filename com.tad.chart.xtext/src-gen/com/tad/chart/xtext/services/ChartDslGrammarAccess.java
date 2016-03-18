/*
 * generated by Xtext 2.9.2
 */
package com.tad.chart.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ChartDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class CompanyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.tad.chart.xtext.ChartDsl.Company");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCompanyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cEmployeesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cEmployeesEmployeeParserRuleCall_3_0 = (RuleCall)cEmployeesAssignment_3.eContents().get(0);
		private final Assignment cProjectsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cProjectsProjectParserRuleCall_4_0 = (RuleCall)cProjectsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Company:
		//	'Company' name=ID '{'
		//	employees+=Employee*
		//	projects+=Project*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Company' name=ID '{' employees+=Employee* projects+=Project* '}'
		public Group getGroup() { return cGroup; }
		
		//'Company'
		public Keyword getCompanyKeyword_0() { return cCompanyKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//employees+=Employee*
		public Assignment getEmployeesAssignment_3() { return cEmployeesAssignment_3; }
		
		//Employee
		public RuleCall getEmployeesEmployeeParserRuleCall_3_0() { return cEmployeesEmployeeParserRuleCall_3_0; }
		
		//projects+=Project*
		public Assignment getProjectsAssignment_4() { return cProjectsAssignment_4; }
		
		//Project
		public RuleCall getProjectsProjectParserRuleCall_4_0() { return cProjectsProjectParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class EmployeeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.tad.chart.xtext.ChartDsl.Employee");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEmployeeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cWeigthKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cHeigthKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_3_1 = (RuleCall)cGroup_3.eContents().get(1);
		
		//Employee:
		//	'employee' name=ID ('weigth' INT)? ('heigth' INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'employee' name=ID ('weigth' INT)? ('heigth' INT)?
		public Group getGroup() { return cGroup; }
		
		//'employee'
		public Keyword getEmployeeKeyword_0() { return cEmployeeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('weigth' INT)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'weigth'
		public Keyword getWeigthKeyword_2_0() { return cWeigthKeyword_2_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2_1() { return cINTTerminalRuleCall_2_1; }
		
		//('heigth' INT)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'heigth'
		public Keyword getHeigthKeyword_3_0() { return cHeigthKeyword_3_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_3_1() { return cINTTerminalRuleCall_3_1; }
	}
	public class ProjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.tad.chart.xtext.ChartDsl.Project");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProjectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cTypeKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cProjectTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cProjectTypeProjectTypeEnumRuleCall_3_0 = (RuleCall)cProjectTypeAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cTasksAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cTasksTaskParserRuleCall_5_0 = (RuleCall)cTasksAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Project:
		//	'Project' name=ID 'type' projectType=ProjectType '{'
		//	tasks+=Task*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Project' name=ID 'type' projectType=ProjectType '{' tasks+=Task* '}'
		public Group getGroup() { return cGroup; }
		
		//'Project'
		public Keyword getProjectKeyword_0() { return cProjectKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'type'
		public Keyword getTypeKeyword_2() { return cTypeKeyword_2; }
		
		//projectType=ProjectType
		public Assignment getProjectTypeAssignment_3() { return cProjectTypeAssignment_3; }
		
		//ProjectType
		public RuleCall getProjectTypeProjectTypeEnumRuleCall_3_0() { return cProjectTypeProjectTypeEnumRuleCall_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//tasks+=Task*
		public Assignment getTasksAssignment_5() { return cTasksAssignment_5; }
		
		//Task
		public RuleCall getTasksTaskParserRuleCall_5_0() { return cTasksTaskParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class TaskElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.tad.chart.xtext.ChartDsl.Task");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTaskKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cResponsableKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cResponsableAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cResponsableEmployeeCrossReference_3_0 = (CrossReference)cResponsableAssignment_3.eContents().get(0);
		private final RuleCall cResponsableEmployeeIDTerminalRuleCall_3_0_1 = (RuleCall)cResponsableEmployeeCrossReference_3_0.eContents().get(1);
		
		//Task:
		//	'Task' name=ID 'responsable' responsable=[Employee];
		@Override public ParserRule getRule() { return rule; }
		
		//'Task' name=ID 'responsable' responsable=[Employee]
		public Group getGroup() { return cGroup; }
		
		//'Task'
		public Keyword getTaskKeyword_0() { return cTaskKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'responsable'
		public Keyword getResponsableKeyword_2() { return cResponsableKeyword_2; }
		
		//responsable=[Employee]
		public Assignment getResponsableAssignment_3() { return cResponsableAssignment_3; }
		
		//[Employee]
		public CrossReference getResponsableEmployeeCrossReference_3_0() { return cResponsableEmployeeCrossReference_3_0; }
		
		//ID
		public RuleCall getResponsableEmployeeIDTerminalRuleCall_3_0_1() { return cResponsableEmployeeIDTerminalRuleCall_3_0_1; }
	}
	
	public class ProjectTypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "com.tad.chart.xtext.ChartDsl.ProjectType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cDevelopmentEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cDevelopmentDevelopmentKeyword_0_0 = (Keyword)cDevelopmentEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cRegieEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cRegieRegieKeyword_1_0 = (Keyword)cRegieEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum ProjectType:
		//	Development | Regie;
		public EnumRule getRule() { return rule; }
		
		//Development | Regie
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Development
		public EnumLiteralDeclaration getDevelopmentEnumLiteralDeclaration_0() { return cDevelopmentEnumLiteralDeclaration_0; }
		
		//'Development'
		public Keyword getDevelopmentDevelopmentKeyword_0_0() { return cDevelopmentDevelopmentKeyword_0_0; }
		
		//Regie
		public EnumLiteralDeclaration getRegieEnumLiteralDeclaration_1() { return cRegieEnumLiteralDeclaration_1; }
		
		//'Regie'
		public Keyword getRegieRegieKeyword_1_0() { return cRegieRegieKeyword_1_0; }
	}
	
	private final CompanyElements pCompany;
	private final EmployeeElements pEmployee;
	private final ProjectElements pProject;
	private final TaskElements pTask;
	private final ProjectTypeElements eProjectType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ChartDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pCompany = new CompanyElements();
		this.pEmployee = new EmployeeElements();
		this.pProject = new ProjectElements();
		this.pTask = new TaskElements();
		this.eProjectType = new ProjectTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.tad.chart.xtext.ChartDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Company:
	//	'Company' name=ID '{'
	//	employees+=Employee*
	//	projects+=Project*
	//	'}';
	public CompanyElements getCompanyAccess() {
		return pCompany;
	}
	
	public ParserRule getCompanyRule() {
		return getCompanyAccess().getRule();
	}
	
	//Employee:
	//	'employee' name=ID ('weigth' INT)? ('heigth' INT)?;
	public EmployeeElements getEmployeeAccess() {
		return pEmployee;
	}
	
	public ParserRule getEmployeeRule() {
		return getEmployeeAccess().getRule();
	}
	
	//Project:
	//	'Project' name=ID 'type' projectType=ProjectType '{'
	//	tasks+=Task*
	//	'}';
	public ProjectElements getProjectAccess() {
		return pProject;
	}
	
	public ParserRule getProjectRule() {
		return getProjectAccess().getRule();
	}
	
	//Task:
	//	'Task' name=ID 'responsable' responsable=[Employee];
	public TaskElements getTaskAccess() {
		return pTask;
	}
	
	public ParserRule getTaskRule() {
		return getTaskAccess().getRule();
	}
	
	//enum ProjectType:
	//	Development | Regie;
	public ProjectTypeElements getProjectTypeAccess() {
		return eProjectType;
	}
	
	public EnumRule getProjectTypeRule() {
		return getProjectTypeAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}