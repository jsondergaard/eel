// Generated from /Users/jacob/IdeaProjects/eel/src/main/resources/antlr/EelParser.g4 by ANTLR 4.12.0
package org.eel.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class EelParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, BEGINPROCEDURE=2, ENDPROCEDURE=3, RETURN=4, REPEATWHILE=5, ENDREPEAT=6, 
		IF=7, ENDIF=8, THEN=9, ELSE=10, PRINT=11, INTLIT=12, STRINGLIT=13, DECLIT=14, 
		PLUS=15, MINUS=16, ASTERISK=17, DIVISION=18, ASSIGN=19, LPAREN=20, RPAREN=21, 
		COMMA=22, GREATERTHAN=23, LESSTHAN=24, FUNCTIONS=25, METHODS=26, BOOLEANOPERATOR=27, 
		WS=28, ID=29;
	public static final int
		RULE_eelFile = 0, RULE_procedure = 1, RULE_parameters = 2, RULE_line = 3, 
		RULE_statement = 4, RULE_varDeclaration = 5, RULE_assignment = 6, RULE_return = 7, 
		RULE_expression = 8, RULE_ifStruct = 9, RULE_elseStructure = 10, RULE_function = 11, 
		RULE_print = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"eelFile", "procedure", "parameters", "line", "statement", "varDeclaration", 
			"assignment", "return", "expression", "ifStruct", "elseStructure", "function", 
			"print"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'let'", "'procedure'", "'endProcedure'", "'return'", "'repeat while'", 
			"'endRepeat'", "'if'", "'endIf'", "'then'", "'else'", "'print'", null, 
			null, null, "'+'", "'-'", "'*'", "'/'", "'='", "'('", "')'", "','", "'>'", 
			"'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "BEGINPROCEDURE", "ENDPROCEDURE", "RETURN", "REPEATWHILE", 
			"ENDREPEAT", "IF", "ENDIF", "THEN", "ELSE", "PRINT", "INTLIT", "STRINGLIT", 
			"DECLIT", "PLUS", "MINUS", "ASTERISK", "DIVISION", "ASSIGN", "LPAREN", 
			"RPAREN", "COMMA", "GREATERTHAN", "LESSTHAN", "FUNCTIONS", "METHODS", 
			"BOOLEANOPERATOR", "WS", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "EelParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EelParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EelFileContext extends ParserRuleContext {
		public ProcedureContext procedures;
		public TerminalNode EOF() { return getToken(EelParser.EOF, 0); }
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public EelFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eelFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterEelFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitEelFile(this);
		}
	}

	public final EelFileContext eelFile() throws RecognitionException {
		EelFileContext _localctx = new EelFileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_eelFile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				((EelFileContext)_localctx).procedures = procedure();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BEGINPROCEDURE );
			setState(31);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureContext extends ParserRuleContext {
		public LineContext lines;
		public TerminalNode BEGINPROCEDURE() { return getToken(EelParser.BEGINPROCEDURE, 0); }
		public TerminalNode ID() { return getToken(EelParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(EelParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EelParser.RPAREN, 0); }
		public TerminalNode ENDPROCEDURE() { return getToken(EelParser.ENDPROCEDURE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProcedureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitProcedure(this);
		}
	}

	public final ProcedureContext procedure() throws RecognitionException {
		ProcedureContext _localctx = new ProcedureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_procedure);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(BEGINPROCEDURE);
			setState(34);
			match(ID);
			setState(35);
			match(LPAREN);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(36);
				parameters();
				}
			}

			setState(39);
			match(RPAREN);
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				((ProcedureContext)_localctx).lines = line();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 538015890L) != 0) );
			setState(45);
			match(ENDPROCEDURE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(EelParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EelParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EelParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EelParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitParameters(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(ID);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(48);
				match(COMMA);
				setState(49);
				match(ID);
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends StatementContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PrintStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitPrintStatement(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends StatementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitAssignmentStatement(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStructureContext extends StatementContext {
		public IfStructContext ifStruct() {
			return getRuleContext(IfStructContext.class,0);
		}
		public IfStructureContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterIfStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitIfStructure(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends StatementContext {
		public ReturnContext return_() {
			return getRuleContext(ReturnContext.class,0);
		}
		public ReturnStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitReturnStatement(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationStatementContext extends StatementContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarDeclarationStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterVarDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitVarDeclarationStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new VarDeclarationStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				varDeclaration();
				}
				break;
			case 2:
				_localctx = new AssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				assignment();
				}
				break;
			case 3:
				_localctx = new PrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				print();
				}
				break;
			case 4:
				_localctx = new IfStructureContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				ifStruct();
				}
				break;
			case 5:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				return_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(EelParser.LET, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitVarDeclaration(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(LET);
			setState(65);
			assignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EelParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(EelParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(ID);
			setState(68);
			match(ASSIGN);
			setState(69);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(EelParser.RETURN, 0); }
		public ReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitReturn(this);
		}
	}

	public final ReturnContext return_() throws RecognitionException {
		ReturnContext _localctx = new ReturnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(71);
				match(RETURN);
				}
			}

			setState(74);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralContext extends ExpressionContext {
		public TerminalNode DECLIT() { return getToken(EelParser.DECLIT, 0); }
		public DecimalLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitDecimalLiteral(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusExpressionContext extends ExpressionContext {
		public TerminalNode MINUS() { return getToken(EelParser.MINUS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MinusExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitMinusExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ExpressionContext {
		public TerminalNode STRINGLIT() { return getToken(EelParser.STRINGLIT, 0); }
		public StringLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitStringLiteral(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLiteralContext extends ExpressionContext {
		public TerminalNode INTLIT() { return getToken(EelParser.INTLIT, 0); }
		public IntLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitIntLiteral(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExpressionContext extends ExpressionContext {
		public TerminalNode LPAREN() { return getToken(EelParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EelParser.RPAREN, 0); }
		public ParenExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterParenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitParenExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryOperationContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIVISION() { return getToken(EelParser.DIVISION, 0); }
		public TerminalNode ASTERISK() { return getToken(EelParser.ASTERISK, 0); }
		public TerminalNode PLUS() { return getToken(EelParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(EelParser.MINUS, 0); }
		public TerminalNode GREATERTHAN() { return getToken(EelParser.GREATERTHAN, 0); }
		public TerminalNode LESSTHAN() { return getToken(EelParser.LESSTHAN, 0); }
		public BinaryOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterBinaryOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitBinaryOperation(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarReferenceContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(EelParser.ID, 0); }
		public VarReferenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterVarReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitVarReference(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				_localctx = new ParenExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(77);
				match(LPAREN);
				setState(78);
				expression(0);
				setState(79);
				match(RPAREN);
				}
				break;
			case ID:
				{
				_localctx = new VarReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(ID);
				}
				break;
			case MINUS:
				{
				_localctx = new MinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(MINUS);
				setState(83);
				expression(4);
				}
				break;
			case INTLIT:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				match(INTLIT);
				}
				break;
			case DECLIT:
				{
				_localctx = new DecimalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(DECLIT);
				}
				break;
			case STRINGLIT:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				match(STRINGLIT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(98);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(89);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(90);
						((BinaryOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ASTERISK || _la==DIVISION) ) {
							((BinaryOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(91);
						((BinaryOperationContext)_localctx).right = expression(10);
						}
						break;
					case 2:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(92);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(93);
						((BinaryOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((BinaryOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(94);
						((BinaryOperationContext)_localctx).right = expression(9);
						}
						break;
					case 3:
						{
						_localctx = new BinaryOperationContext(new ExpressionContext(_parentctx, _parentState));
						((BinaryOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(95);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(96);
						((BinaryOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==GREATERTHAN || _la==LESSTHAN) ) {
							((BinaryOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(97);
						((BinaryOperationContext)_localctx).right = expression(8);
						}
						break;
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStructContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(EelParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(EelParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EelParser.RPAREN, 0); }
		public TerminalNode THEN() { return getToken(EelParser.THEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(EelParser.ENDIF, 0); }
		public ElseStructureContext elseStructure() {
			return getRuleContext(ElseStructureContext.class,0);
		}
		public IfStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterIfStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitIfStruct(this);
		}
	}

	public final IfStructContext ifStruct() throws RecognitionException {
		IfStructContext _localctx = new IfStructContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(IF);
			setState(104);
			match(LPAREN);
			setState(105);
			expression(0);
			setState(106);
			match(RPAREN);
			setState(107);
			match(THEN);
			setState(108);
			statement();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(109);
				elseStructure();
				}
			}

			setState(112);
			match(ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseStructureContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(EelParser.ELSE, 0); }
		public TerminalNode THEN() { return getToken(EelParser.THEN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ElseStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterElseStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitElseStructure(this);
		}
	}

	public final ElseStructureContext elseStructure() throws RecognitionException {
		ElseStructureContext _localctx = new ElseStructureContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elseStructure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(ELSE);
			setState(115);
			match(THEN);
			setState(116);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTIONS() { return getToken(EelParser.FUNCTIONS, 0); }
		public TerminalNode LPAREN() { return getToken(EelParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(EelParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(EelParser.RPAREN, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(FUNCTIONS);
			setState(119);
			match(LPAREN);
			setState(120);
			match(ID);
			setState(121);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(EelParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(EelParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EelParser.RPAREN, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(PRINT);
			setState(124);
			match(LPAREN);
			setState(125);
			expression(0);
			setState(126);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001d\u0081\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0004\u0000\u001c\b\u0000\u000b\u0000\f\u0000"+
		"\u001d\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001&\b\u0001\u0001\u0001\u0001\u0001\u0004\u0001*\b\u0001"+
		"\u000b\u0001\f\u0001+\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u00023\b\u0002\n\u0002\f\u00026\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004?\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0003\u0007I\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bX\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bc\b"+
		"\b\n\b\f\bf\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\to\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0000\u0001\u0010\r\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0003\u0001\u0000"+
		"\u0011\u0012\u0001\u0000\u000f\u0010\u0001\u0000\u0017\u0018\u0085\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0002!\u0001\u0000\u0000\u0000\u0004/\u0001"+
		"\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000\b>\u0001\u0000\u0000"+
		"\u0000\n@\u0001\u0000\u0000\u0000\fC\u0001\u0000\u0000\u0000\u000eH\u0001"+
		"\u0000\u0000\u0000\u0010W\u0001\u0000\u0000\u0000\u0012g\u0001\u0000\u0000"+
		"\u0000\u0014r\u0001\u0000\u0000\u0000\u0016v\u0001\u0000\u0000\u0000\u0018"+
		"{\u0001\u0000\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0000\u001b\u001a"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f"+
		"\u0001\u0000\u0000\u0000\u001f \u0005\u0000\u0000\u0001 \u0001\u0001\u0000"+
		"\u0000\u0000!\"\u0005\u0002\u0000\u0000\"#\u0005\u001d\u0000\u0000#%\u0005"+
		"\u0014\u0000\u0000$&\u0003\u0004\u0002\u0000%$\u0001\u0000\u0000\u0000"+
		"%&\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\')\u0005\u0015\u0000"+
		"\u0000(*\u0003\u0006\u0003\u0000)(\u0001\u0000\u0000\u0000*+\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-.\u0005\u0003\u0000\u0000.\u0003\u0001\u0000\u0000"+
		"\u0000/4\u0005\u001d\u0000\u000001\u0005\u0016\u0000\u000013\u0005\u001d"+
		"\u0000\u000020\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u00005\u0005\u0001\u0000\u0000"+
		"\u000064\u0001\u0000\u0000\u000078\u0003\b\u0004\u00008\u0007\u0001\u0000"+
		"\u0000\u00009?\u0003\n\u0005\u0000:?\u0003\f\u0006\u0000;?\u0003\u0018"+
		"\f\u0000<?\u0003\u0012\t\u0000=?\u0003\u000e\u0007\u0000>9\u0001\u0000"+
		"\u0000\u0000>:\u0001\u0000\u0000\u0000>;\u0001\u0000\u0000\u0000><\u0001"+
		"\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?\t\u0001\u0000\u0000\u0000"+
		"@A\u0005\u0001\u0000\u0000AB\u0003\f\u0006\u0000B\u000b\u0001\u0000\u0000"+
		"\u0000CD\u0005\u001d\u0000\u0000DE\u0005\u0013\u0000\u0000EF\u0003\u0010"+
		"\b\u0000F\r\u0001\u0000\u0000\u0000GI\u0005\u0004\u0000\u0000HG\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000"+
		"JK\u0003\u0010\b\u0000K\u000f\u0001\u0000\u0000\u0000LM\u0006\b\uffff"+
		"\uffff\u0000MN\u0005\u0014\u0000\u0000NO\u0003\u0010\b\u0000OP\u0005\u0015"+
		"\u0000\u0000PX\u0001\u0000\u0000\u0000QX\u0005\u001d\u0000\u0000RS\u0005"+
		"\u0010\u0000\u0000SX\u0003\u0010\b\u0004TX\u0005\f\u0000\u0000UX\u0005"+
		"\u000e\u0000\u0000VX\u0005\r\u0000\u0000WL\u0001\u0000\u0000\u0000WQ\u0001"+
		"\u0000\u0000\u0000WR\u0001\u0000\u0000\u0000WT\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000Xd\u0001\u0000\u0000"+
		"\u0000YZ\n\t\u0000\u0000Z[\u0007\u0000\u0000\u0000[c\u0003\u0010\b\n\\"+
		"]\n\b\u0000\u0000]^\u0007\u0001\u0000\u0000^c\u0003\u0010\b\t_`\n\u0007"+
		"\u0000\u0000`a\u0007\u0002\u0000\u0000ac\u0003\u0010\b\bbY\u0001\u0000"+
		"\u0000\u0000b\\\u0001\u0000\u0000\u0000b_\u0001\u0000\u0000\u0000cf\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"e\u0011\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gh\u0005\u0007"+
		"\u0000\u0000hi\u0005\u0014\u0000\u0000ij\u0003\u0010\b\u0000jk\u0005\u0015"+
		"\u0000\u0000kl\u0005\t\u0000\u0000ln\u0003\b\u0004\u0000mo\u0003\u0014"+
		"\n\u0000nm\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0001\u0000"+
		"\u0000\u0000pq\u0005\b\u0000\u0000q\u0013\u0001\u0000\u0000\u0000rs\u0005"+
		"\n\u0000\u0000st\u0005\t\u0000\u0000tu\u0003\b\u0004\u0000u\u0015\u0001"+
		"\u0000\u0000\u0000vw\u0005\u0019\u0000\u0000wx\u0005\u0014\u0000\u0000"+
		"xy\u0005\u001d\u0000\u0000yz\u0005\u0015\u0000\u0000z\u0017\u0001\u0000"+
		"\u0000\u0000{|\u0005\u000b\u0000\u0000|}\u0005\u0014\u0000\u0000}~\u0003"+
		"\u0010\b\u0000~\u007f\u0005\u0015\u0000\u0000\u007f\u0019\u0001\u0000"+
		"\u0000\u0000\n\u001d%+4>HWbdn";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}