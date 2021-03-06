/*
 * generated by Xtext 2.9.2
 */
package com.tad.chart.xtext.parser.antlr;

import com.google.inject.Inject;
import com.tad.chart.xtext.parser.antlr.internal.InternalChartDslParser;
import com.tad.chart.xtext.services.ChartDslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ChartDslParser extends AbstractAntlrParser {

	@Inject
	private ChartDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalChartDslParser createParser(XtextTokenStream stream) {
		return new InternalChartDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Company";
	}

	public ChartDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ChartDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
