/*
 * generated by Xtext 2.9.2
 */
package com.tad.chart.xtext.serializer;

import com.google.inject.Inject;
import com.tad.chart.xtext.services.ChartDslGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class ChartDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected ChartDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Employee___HeigthKeyword_3_0_INTTerminalRuleCall_3_1__q;
	protected AbstractElementAlias match_Employee___WeigthKeyword_2_0_INTTerminalRuleCall_2_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (ChartDslGrammarAccess) access;
		match_Employee___HeigthKeyword_3_0_INTTerminalRuleCall_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEmployeeAccess().getHeigthKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getEmployeeAccess().getINTTerminalRuleCall_3_1()));
		match_Employee___WeigthKeyword_2_0_INTTerminalRuleCall_2_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEmployeeAccess().getWeigthKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getEmployeeAccess().getINTTerminalRuleCall_2_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Employee___HeigthKeyword_3_0_INTTerminalRuleCall_3_1__q.equals(syntax))
				emit_Employee___HeigthKeyword_3_0_INTTerminalRuleCall_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Employee___WeigthKeyword_2_0_INTTerminalRuleCall_2_1__q.equals(syntax))
				emit_Employee___WeigthKeyword_2_0_INTTerminalRuleCall_2_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('heigth' INT)?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID ('weigth' INT)? (ambiguity) (rule end)
	 */
	protected void emit_Employee___HeigthKeyword_3_0_INTTerminalRuleCall_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('weigth' INT)?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) ('heigth' INT)? (rule end)
	 */
	protected void emit_Employee___WeigthKeyword_2_0_INTTerminalRuleCall_2_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
