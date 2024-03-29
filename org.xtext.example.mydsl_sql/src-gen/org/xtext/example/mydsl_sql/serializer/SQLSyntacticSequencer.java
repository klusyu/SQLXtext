/*
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl_sql.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl_sql.services.SQLGrammarAccess;

@SuppressWarnings("all")
public class SQLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected SQLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_OpFunctionArgAgregate_ALLKeyword_0_0_or_DISTINCTKeyword_0_1;
	protected AbstractElementAlias match_OperandGroup_LeftParenthesisKeyword_1_0_q;
	protected AbstractElementAlias match_OrderByClauseArg___ASCKeyword_1_0_or_DESCKeyword_1_1__q;
	protected AbstractElementAlias match_OrderByClauseArg___NULLSKeyword_2_0___FIRSTKeyword_2_1_0_or_LASTKeyword_2_1_1____q;
	protected AbstractElementAlias match_OrderByClause___ORDERKeyword_0_0_0_BYKeyword_0_0_1___or___ORDERKeyword_0_1_0_SIBLINGSKeyword_0_1_1_BYKeyword_0_1_2__;
	protected AbstractElementAlias match_PivotColumns_LeftParenthesisKeyword_1_0_q;
	protected AbstractElementAlias match_PivotFunction_ASKeyword_4_q;
	protected AbstractElementAlias match_PivotTable_XMLKeyword_1_q;
	protected AbstractElementAlias match_SelectStatement_JRNPARAMTerminalRuleCall_0_q;
	protected AbstractElementAlias match_Select_DISTINCTKeyword_1_q;
	protected AbstractElementAlias match_Select___TOPKeyword_2_0___INTTerminalRuleCall_2_1_0_or_SIGNED_DOUBLETerminalRuleCall_2_1_1___PERCENTKeyword_2_2_q___WITHKeyword_2_3_0_TIESKeyword_2_3_1__q__q;
	protected AbstractElementAlias match_UnpivotTable_____EXCLUDEKeyword_1_0_1_or_INCLUDEKeyword_1_0_0___NULLSKeyword_1_1__q;
	protected AbstractElementAlias match_WindowingClauseOperandFollowing_FOLLOWINGKeyword_1_2_1_1_or_PRECEDINGKeyword_1_2_1_0;
	protected AbstractElementAlias match_WindowingClauseOperandFollowing___CURRENTKeyword_1_1_0_ROWKeyword_1_1_1___or___UNBOUNDEDKeyword_1_0_0_FOLLOWINGKeyword_1_0_1__;
	protected AbstractElementAlias match_WindowingClauseOperandPreceding_FOLLOWINGKeyword_1_2_1_1_or_PRECEDINGKeyword_1_2_1_0;
	protected AbstractElementAlias match_WindowingClauseOperandPreceding___CURRENTKeyword_1_1_0_ROWKeyword_1_1_1___or___UNBOUNDEDKeyword_1_0_0_PRECEDINGKeyword_1_0_1__;
	protected AbstractElementAlias match_WindowingClause_RANGEKeyword_0_1_or_ROWSKeyword_0_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SQLGrammarAccess) access;
		match_OpFunctionArgAgregate_ALLKeyword_0_0_or_DISTINCTKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getOpFunctionArgAgregateAccess().getALLKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getOpFunctionArgAgregateAccess().getDISTINCTKeyword_0_1()));
		match_OperandGroup_LeftParenthesisKeyword_1_0_q = new TokenAlias(false, true, grammarAccess.getOperandGroupAccess().getLeftParenthesisKeyword_1_0());
		match_OrderByClauseArg___ASCKeyword_1_0_or_DESCKeyword_1_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getOrderByClauseArgAccess().getASCKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getOrderByClauseArgAccess().getDESCKeyword_1_1()));
		match_OrderByClauseArg___NULLSKeyword_2_0___FIRSTKeyword_2_1_0_or_LASTKeyword_2_1_1____q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getOrderByClauseArgAccess().getNULLSKeyword_2_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getOrderByClauseArgAccess().getFIRSTKeyword_2_1_0()), new TokenAlias(false, false, grammarAccess.getOrderByClauseArgAccess().getLASTKeyword_2_1_1())));
		match_OrderByClause___ORDERKeyword_0_0_0_BYKeyword_0_0_1___or___ORDERKeyword_0_1_0_SIBLINGSKeyword_0_1_1_BYKeyword_0_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getOrderByClauseAccess().getORDERKeyword_0_0_0()), new TokenAlias(false, false, grammarAccess.getOrderByClauseAccess().getBYKeyword_0_0_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getOrderByClauseAccess().getORDERKeyword_0_1_0()), new TokenAlias(false, false, grammarAccess.getOrderByClauseAccess().getSIBLINGSKeyword_0_1_1()), new TokenAlias(false, false, grammarAccess.getOrderByClauseAccess().getBYKeyword_0_1_2())));
		match_PivotColumns_LeftParenthesisKeyword_1_0_q = new TokenAlias(false, true, grammarAccess.getPivotColumnsAccess().getLeftParenthesisKeyword_1_0());
		match_PivotFunction_ASKeyword_4_q = new TokenAlias(false, true, grammarAccess.getPivotFunctionAccess().getASKeyword_4());
		match_PivotTable_XMLKeyword_1_q = new TokenAlias(false, true, grammarAccess.getPivotTableAccess().getXMLKeyword_1());
		match_SelectStatement_JRNPARAMTerminalRuleCall_0_q = new TokenAlias(false, true, grammarAccess.getSelectStatementAccess().getJRNPARAMTerminalRuleCall_0());
		match_Select_DISTINCTKeyword_1_q = new TokenAlias(false, true, grammarAccess.getSelectAccess().getDISTINCTKeyword_1());
		match_Select___TOPKeyword_2_0___INTTerminalRuleCall_2_1_0_or_SIGNED_DOUBLETerminalRuleCall_2_1_1___PERCENTKeyword_2_2_q___WITHKeyword_2_3_0_TIESKeyword_2_3_1__q__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSelectAccess().getTOPKeyword_2_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getSelectAccess().getINTTerminalRuleCall_2_1_0()), new TokenAlias(false, false, grammarAccess.getSelectAccess().getSIGNED_DOUBLETerminalRuleCall_2_1_1())), new TokenAlias(false, true, grammarAccess.getSelectAccess().getPERCENTKeyword_2_2()), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getSelectAccess().getWITHKeyword_2_3_0()), new TokenAlias(false, false, grammarAccess.getSelectAccess().getTIESKeyword_2_3_1())));
		match_UnpivotTable_____EXCLUDEKeyword_1_0_1_or_INCLUDEKeyword_1_0_0___NULLSKeyword_1_1__q = new GroupAlias(false, true, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getUnpivotTableAccess().getEXCLUDEKeyword_1_0_1()), new TokenAlias(false, false, grammarAccess.getUnpivotTableAccess().getINCLUDEKeyword_1_0_0())), new TokenAlias(false, false, grammarAccess.getUnpivotTableAccess().getNULLSKeyword_1_1()));
		match_WindowingClauseOperandFollowing_FOLLOWINGKeyword_1_2_1_1_or_PRECEDINGKeyword_1_2_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getWindowingClauseOperandFollowingAccess().getFOLLOWINGKeyword_1_2_1_1()), new TokenAlias(false, false, grammarAccess.getWindowingClauseOperandFollowingAccess().getPRECEDINGKeyword_1_2_1_0()));
		match_WindowingClauseOperandFollowing___CURRENTKeyword_1_1_0_ROWKeyword_1_1_1___or___UNBOUNDEDKeyword_1_0_0_FOLLOWINGKeyword_1_0_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getWindowingClauseOperandFollowingAccess().getCURRENTKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getWindowingClauseOperandFollowingAccess().getROWKeyword_1_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getWindowingClauseOperandFollowingAccess().getUNBOUNDEDKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getWindowingClauseOperandFollowingAccess().getFOLLOWINGKeyword_1_0_1())));
		match_WindowingClauseOperandPreceding_FOLLOWINGKeyword_1_2_1_1_or_PRECEDINGKeyword_1_2_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getWindowingClauseOperandPrecedingAccess().getFOLLOWINGKeyword_1_2_1_1()), new TokenAlias(false, false, grammarAccess.getWindowingClauseOperandPrecedingAccess().getPRECEDINGKeyword_1_2_1_0()));
		match_WindowingClauseOperandPreceding___CURRENTKeyword_1_1_0_ROWKeyword_1_1_1___or___UNBOUNDEDKeyword_1_0_0_PRECEDINGKeyword_1_0_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getWindowingClauseOperandPrecedingAccess().getCURRENTKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getWindowingClauseOperandPrecedingAccess().getROWKeyword_1_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getWindowingClauseOperandPrecedingAccess().getUNBOUNDEDKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getWindowingClauseOperandPrecedingAccess().getPRECEDINGKeyword_1_0_1())));
		match_WindowingClause_RANGEKeyword_0_1_or_ROWSKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getWindowingClauseAccess().getRANGEKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getWindowingClauseAccess().getROWSKeyword_0_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getJRNPARAMRule())
			return getJRNPARAMToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSIGNED_DOUBLERule())
			return getSIGNED_DOUBLEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSTARRule())
			return getSTARToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * @Override 
	 * terminal ID:
	 * 	('a'..'z' | 'A'..'Z' | 'À'..'ÿ' | 'Ā'..'ſ' |
	 * 	'ƀ'..'ɏ' | 'А'..'я' | '_' | '$' | 'ぁ'..'ゟ' | '゠'..'ヿ' | 'ㇰ'..'ㇿ' | '一'..'鿿' | '歴'..'す' | 'ア'..'ン' | '豈'..'﫿' |
	 * 	'㐀'..'䶿' | '＿') ('a'..'z' | 'A'..'Z' | 'À'..'ÿ' | 'Ā'..'ſ' | 'ƀ'..'ɏ' | 'А'..'я' | '_' | '-' |
	 * 	'$' | 'ぁ'..'ゟ' | '゠'..'ヿ' | 'ㇰ'..'ㇿ' | '一'..'鿿' | '歴'..'す' | 'ア'..'ン' | '豈'..'﫿' | '㐀'..'䶿' | '＿' | '0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * @Override 
	 * terminal INT returns ecore::EInt:
	 * 	('-')? UNSIGNED;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal JRNPARAM:
	 * 	'$P!{'->'}';
	 */
	protected String getJRNPARAMToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "$P!{";
	}
	
	/**
	 * terminal SIGNED_DOUBLE returns ecore::EBigDecimal:
	 * 	'-'? UNSIGNED ('.'
	 * 	UNSIGNED)?;
	 */
	protected String getSIGNED_DOUBLEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal STAR:
	 * 	"*";
	 */
	protected String getSTARToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "*";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_OpFunctionArgAgregate_ALLKeyword_0_0_or_DISTINCTKeyword_0_1.equals(syntax))
				emit_OpFunctionArgAgregate_ALLKeyword_0_0_or_DISTINCTKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OperandGroup_LeftParenthesisKeyword_1_0_q.equals(syntax))
				emit_OperandGroup_LeftParenthesisKeyword_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OrderByClauseArg___ASCKeyword_1_0_or_DESCKeyword_1_1__q.equals(syntax))
				emit_OrderByClauseArg___ASCKeyword_1_0_or_DESCKeyword_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OrderByClauseArg___NULLSKeyword_2_0___FIRSTKeyword_2_1_0_or_LASTKeyword_2_1_1____q.equals(syntax))
				emit_OrderByClauseArg___NULLSKeyword_2_0___FIRSTKeyword_2_1_0_or_LASTKeyword_2_1_1____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_OrderByClause___ORDERKeyword_0_0_0_BYKeyword_0_0_1___or___ORDERKeyword_0_1_0_SIBLINGSKeyword_0_1_1_BYKeyword_0_1_2__.equals(syntax))
				emit_OrderByClause___ORDERKeyword_0_0_0_BYKeyword_0_0_1___or___ORDERKeyword_0_1_0_SIBLINGSKeyword_0_1_1_BYKeyword_0_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PivotColumns_LeftParenthesisKeyword_1_0_q.equals(syntax))
				emit_PivotColumns_LeftParenthesisKeyword_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PivotFunction_ASKeyword_4_q.equals(syntax))
				emit_PivotFunction_ASKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PivotTable_XMLKeyword_1_q.equals(syntax))
				emit_PivotTable_XMLKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_SelectStatement_JRNPARAMTerminalRuleCall_0_q.equals(syntax))
				emit_SelectStatement_JRNPARAMTerminalRuleCall_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Select_DISTINCTKeyword_1_q.equals(syntax))
				emit_Select_DISTINCTKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Select___TOPKeyword_2_0___INTTerminalRuleCall_2_1_0_or_SIGNED_DOUBLETerminalRuleCall_2_1_1___PERCENTKeyword_2_2_q___WITHKeyword_2_3_0_TIESKeyword_2_3_1__q__q.equals(syntax))
				emit_Select___TOPKeyword_2_0___INTTerminalRuleCall_2_1_0_or_SIGNED_DOUBLETerminalRuleCall_2_1_1___PERCENTKeyword_2_2_q___WITHKeyword_2_3_0_TIESKeyword_2_3_1__q__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_UnpivotTable_____EXCLUDEKeyword_1_0_1_or_INCLUDEKeyword_1_0_0___NULLSKeyword_1_1__q.equals(syntax))
				emit_UnpivotTable_____EXCLUDEKeyword_1_0_1_or_INCLUDEKeyword_1_0_0___NULLSKeyword_1_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_WindowingClauseOperandFollowing_FOLLOWINGKeyword_1_2_1_1_or_PRECEDINGKeyword_1_2_1_0.equals(syntax))
				emit_WindowingClauseOperandFollowing_FOLLOWINGKeyword_1_2_1_1_or_PRECEDINGKeyword_1_2_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_WindowingClauseOperandFollowing___CURRENTKeyword_1_1_0_ROWKeyword_1_1_1___or___UNBOUNDEDKeyword_1_0_0_FOLLOWINGKeyword_1_0_1__.equals(syntax))
				emit_WindowingClauseOperandFollowing___CURRENTKeyword_1_1_0_ROWKeyword_1_1_1___or___UNBOUNDEDKeyword_1_0_0_FOLLOWINGKeyword_1_0_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_WindowingClauseOperandPreceding_FOLLOWINGKeyword_1_2_1_1_or_PRECEDINGKeyword_1_2_1_0.equals(syntax))
				emit_WindowingClauseOperandPreceding_FOLLOWINGKeyword_1_2_1_1_or_PRECEDINGKeyword_1_2_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_WindowingClauseOperandPreceding___CURRENTKeyword_1_1_0_ROWKeyword_1_1_1___or___UNBOUNDEDKeyword_1_0_0_PRECEDINGKeyword_1_0_1__.equals(syntax))
				emit_WindowingClauseOperandPreceding___CURRENTKeyword_1_1_0_ROWKeyword_1_1_1___or___UNBOUNDEDKeyword_1_0_0_PRECEDINGKeyword_1_0_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_WindowingClause_RANGEKeyword_0_1_or_ROWSKeyword_0_0.equals(syntax))
				emit_WindowingClause_RANGEKeyword_0_1_or_ROWSKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'ALL' | 'DISTINCT'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) op1=OperandFragment
	 *     (rule start) (ambiguity) {Concat.left=}
	 *     (rule start) (ambiguity) {Division.left=}
	 *     (rule start) (ambiguity) {Minus.left=}
	 *     (rule start) (ambiguity) {Multiply.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 
	 * </pre>
	 */
	protected void emit_OpFunctionArgAgregate_ALLKeyword_0_0_or_DISTINCTKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) op1=OperandFragment
	 *     (rule start) (ambiguity) {Concat.left=}
	 *     (rule start) (ambiguity) {Division.left=}
	 *     (rule start) (ambiguity) {Minus.left=}
	 *     (rule start) (ambiguity) {Multiply.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 
	 * </pre>
	 */
	protected void emit_OperandGroup_LeftParenthesisKeyword_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('ASC' | 'DESC')?
	 *
	 * This ambiguous syntax occurs at:
	 *     col=AnalyticExprArg (ambiguity) ('NULLS' ('FIRST' | 'LAST'))? (rule end)
	 
	 * </pre>
	 */
	protected void emit_OrderByClauseArg___ASCKeyword_1_0_or_DESCKeyword_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('NULLS' ('FIRST' | 'LAST'))?
	 *
	 * This ambiguous syntax occurs at:
	 *     col=AnalyticExprArg ('ASC' | 'DESC')? (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_OrderByClauseArg___NULLSKeyword_2_0___FIRSTKeyword_2_1_0_or_LASTKeyword_2_1_1____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('ORDER' 'BY') | ('ORDER' 'SIBLINGS' 'BY')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) args=OrderByClauseArgs
	 
	 * </pre>
	 */
	protected void emit_OrderByClause___ORDERKeyword_0_0_0_BYKeyword_0_0_1___or___ORDERKeyword_0_1_0_SIBLINGSKeyword_0_1_1_BYKeyword_0_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     '('?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) dbname=DBID
	 *     (rule start) (ambiguity) {pcols.entries+=}
	 
	 * </pre>
	 */
	protected void emit_PivotColumns_LeftParenthesisKeyword_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'AS'?
	 *
	 * This ambiguous syntax occurs at:
	 *     dbname=DBID ')' (ambiguity) ID (rule end)
	 *     entries+=DbObjectName ')' (ambiguity) ID (rule end)
	 
	 * </pre>
	 */
	protected void emit_PivotFunction_ASKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'XML'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'PIVOT' (ambiguity) '(' pfun=PivotFunctions
	 
	 * </pre>
	 */
	protected void emit_PivotTable_XMLKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     JRNPARAM?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) query=SelectQuery
	 *     (rule start) (ambiguity) wq=WithQuery
	 
	 * </pre>
	 */
	protected void emit_SelectStatement_JRNPARAMTerminalRuleCall_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'DISTINCT'?
	 *
	 * This ambiguous syntax occurs at:
	 *     select='SELECT' (ambiguity) ('TOP' (INT | SIGNED_DOUBLE) 'PERCENT'? ('WITH' 'TIES')?)? cols=Columns
	 
	 * </pre>
	 */
	protected void emit_Select_DISTINCTKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('TOP' (INT | SIGNED_DOUBLE) 'PERCENT'? ('WITH' 'TIES')?)?
	 *
	 * This ambiguous syntax occurs at:
	 *     select='SELECT' 'DISTINCT'? (ambiguity) cols=Columns
	 
	 * </pre>
	 */
	protected void emit_Select___TOPKeyword_2_0___INTTerminalRuleCall_2_1_0_or_SIGNED_DOUBLETerminalRuleCall_2_1_1___PERCENTKeyword_2_2_q___WITHKeyword_2_3_0_TIESKeyword_2_3_1__q__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     (('INCLUDE' | 'EXCLUDE') 'NULLS')?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'UNPIVOT' (ambiguity) '(' pcols=PivotColumns
	 
	 * </pre>
	 */
	protected void emit_UnpivotTable_____EXCLUDEKeyword_1_0_1_or_INCLUDEKeyword_1_0_0___NULLSKeyword_1_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'PRECEDING' | 'FOLLOWING'
	 *
	 * This ambiguous syntax occurs at:
	 *     exp=AnalyticExprArg (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_WindowingClauseOperandFollowing_FOLLOWINGKeyword_1_2_1_1_or_PRECEDINGKeyword_1_2_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('UNBOUNDED' 'FOLLOWING') | ('CURRENT' 'ROW')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) (rule start)
	 
	 * </pre>
	 */
	protected void emit_WindowingClauseOperandFollowing___CURRENTKeyword_1_1_0_ROWKeyword_1_1_1___or___UNBOUNDEDKeyword_1_0_0_FOLLOWINGKeyword_1_0_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'PRECEDING' | 'FOLLOWING'
	 *
	 * This ambiguous syntax occurs at:
	 *     expr=AnalyticExprArg (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_WindowingClauseOperandPreceding_FOLLOWINGKeyword_1_2_1_1_or_PRECEDINGKeyword_1_2_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     ('UNBOUNDED' 'PRECEDING') | ('CURRENT' 'ROW')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) ('ROWS' | 'RANGE') (ambiguity) (rule start)
	 *     (rule start) (ambiguity) (rule start)
	 
	 * </pre>
	 */
	protected void emit_WindowingClauseOperandPreceding___CURRENTKeyword_1_1_0_ROWKeyword_1_1_1___or___UNBOUNDEDKeyword_1_0_0_PRECEDINGKeyword_1_0_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     'ROWS' | 'RANGE'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'BETWEEN' wcoP=WindowingClauseOperandPreceding
	 *     (rule start) (ambiguity) (('UNBOUNDED' 'PRECEDING') | ('CURRENT' 'ROW')) (rule start)
	 *     (rule start) (ambiguity) expr=AnalyticExprArg
	 
	 * </pre>
	 */
	protected void emit_WindowingClause_RANGEKeyword_0_1_or_ROWSKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
