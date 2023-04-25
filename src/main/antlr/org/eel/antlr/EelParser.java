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
		WS=1, LET=2, BEGINPROCEDURE=3, ENDPROCEDURE=4, RETURN=5, REPEATWHILE=6, 
		ENDREPEAT=7, IF=8, ENDIF=9, THEN=10, ELSE=11, INTLIT=12, STRINGLIT=13, 
		PLUS=14, MINUS=15, ASTERISK=16, DIVISION=17, ASSIGN=18, LPAREN=19, RPAREN=20, 
		COMMA=21, FUNCTIONS=22, METHODS=23, BOOLEANOPERATOR=24, ID=25;
	public static final int
		RULE_program = 0, RULE_procedure = 1, RULE_formalParameters = 2, RULE_line = 3, 
		RULE_declaration = 4, RULE_assignment = 5, RULE_statement = 6, RULE_expression = 7, 
		RULE_operator = 8, RULE_binaryOperator = 9, RULE_boolOperator = 10, RULE_controlStructure = 11, 
		RULE_selectiveControlStructure = 12, RULE_ifStructure = 13, RULE_ifCondition = 14, 
		RULE_elseIfStructure = 15, RULE_elseStructure = 16, RULE_iterativeControlStructure = 17, 
		RULE_repeatStructure = 18, RULE_value = 19, RULE_staticValue = 20, RULE_function = 21, 
		RULE_userValue = 22, RULE_actualParameters = 23, RULE_method = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "procedure", "formalParameters", "line", "declaration", "assignment", 
			"statement", "expression", "operator", "binaryOperator", "boolOperator", 
			"controlStructure", "selectiveControlStructure", "ifStructure", "ifCondition", 
			"elseIfStructure", "elseStructure", "iterativeControlStructure", "repeatStructure", 
			"value", "staticValue", "function", "userValue", "actualParameters", 
			"method"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'let'", "'procedure'", "'endProcedure'", "'return'", "'repeat while'", 
			"'endRepeat'", "'if'", "'endIf'", "'then'", "'else'", null, null, "'+'", 
			"'-'", "'*'", "'/'", "'='", "'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "LET", "BEGINPROCEDURE", "ENDPROCEDURE", "RETURN", "REPEATWHILE", 
			"ENDREPEAT", "IF", "ENDIF", "THEN", "ELSE", "INTLIT", "STRINGLIT", "PLUS", 
			"MINUS", "ASTERISK", "DIVISION", "ASSIGN", "LPAREN", "RPAREN", "COMMA", 
			"FUNCTIONS", "METHODS", "BOOLEANOPERATOR", "ID"
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
	public static class ProgramContext extends ParserRuleContext {
		public ProcedureContext procedures;
		public TerminalNode EOF() { return getToken(EelParser.EOF, 0); }
		public List<ProcedureContext> procedure() {
			return getRuleContexts(ProcedureContext.class);
		}
		public ProcedureContext procedure(int i) {
			return getRuleContext(ProcedureContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				((ProgramContext)_localctx).procedures = procedure();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BEGINPROCEDURE );
			setState(55);
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
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
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
			setState(57);
			match(BEGINPROCEDURE);
			setState(58);
			match(ID);
			setState(59);
			match(LPAREN);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(60);
				formalParameters();
				}
			}

			setState(63);
			match(RPAREN);
			setState(65); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				((ProcedureContext)_localctx).lines = line();
				}
				}
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 37761380L) != 0) );
			setState(69);
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
	public static class FormalParametersContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(EelParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EelParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EelParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EelParser.COMMA, i);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(ID);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(72);
				match(COMMA);
				setState(73);
				match(ID);
				}
				}
				setState(78);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ControlStructureContext controlStructure() {
			return getRuleContext(ControlStructureContext.class,0);
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
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				{
				setState(79);
				declaration();
				}
				break;
			case RETURN:
			case INTLIT:
			case STRINGLIT:
			case FUNCTIONS:
			case ID:
				{
				setState(80);
				statement();
				}
				break;
			case REPEATWHILE:
			case IF:
				{
				setState(81);
				controlStructure();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDelarationContext extends DeclarationContext {
		public TerminalNode LET() { return getToken(EelParser.LET, 0); }
		public TerminalNode ID() { return getToken(EelParser.ID, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VarDelarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterVarDelaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitVarDelaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaration);
		int _la;
		try {
			_localctx = new VarDelarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(LET);
			setState(85);
			match(ID);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(86);
				assignment();
				}
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
	public static class AssignmentContext extends ParserRuleContext {
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
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ASSIGN);
			setState(90);
			expression();
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(EelParser.RETURN, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(92);
				match(RETURN);
				}
			}

			setState(95);
			expression();
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
		public UserValueContext userValue() {
			return getRuleContext(UserValueContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public StaticValueContext staticValue() {
			return getRuleContext(StaticValueContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expression);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				userValue();
				setState(107);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					setState(98);
					assignment();
					}
					break;
				case LET:
				case ENDPROCEDURE:
				case RETURN:
				case REPEATWHILE:
				case ENDREPEAT:
				case IF:
				case ENDIF:
				case ELSE:
				case INTLIT:
				case STRINGLIT:
				case PLUS:
				case MINUS:
				case ASTERISK:
				case DIVISION:
				case RPAREN:
				case FUNCTIONS:
				case BOOLEANOPERATOR:
				case ID:
					{
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17022976L) != 0)) {
						{
						{
						setState(99);
						operator();
						setState(100);
						value();
						}
						}
						setState(106);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case INTLIT:
			case STRINGLIT:
			case FUNCTIONS:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				staticValue();
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17022976L) != 0)) {
					{
					{
					setState(110);
					operator();
					setState(111);
					value();
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class OperatorContext extends ParserRuleContext {
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public BoolOperatorContext boolOperator() {
			return getRuleContext(BoolOperatorContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case ASTERISK:
			case DIVISION:
				{
				setState(120);
				binaryOperator();
				}
				break;
			case BOOLEANOPERATOR:
				{
				setState(121);
				boolOperator();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class BinaryOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(EelParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(EelParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(EelParser.ASTERISK, 0); }
		public TerminalNode DIVISION() { return getToken(EelParser.DIVISION, 0); }
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitBinaryOperator(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_binaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 245760L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class BoolOperatorContext extends ParserRuleContext {
		public TerminalNode BOOLEANOPERATOR() { return getToken(EelParser.BOOLEANOPERATOR, 0); }
		public BoolOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterBoolOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitBoolOperator(this);
		}
	}

	public final BoolOperatorContext boolOperator() throws RecognitionException {
		BoolOperatorContext _localctx = new BoolOperatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boolOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(BOOLEANOPERATOR);
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
	public static class ControlStructureContext extends ParserRuleContext {
		public IterativeControlStructureContext iterativeControlStructure() {
			return getRuleContext(IterativeControlStructureContext.class,0);
		}
		public SelectiveControlStructureContext selectiveControlStructure() {
			return getRuleContext(SelectiveControlStructureContext.class,0);
		}
		public ControlStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterControlStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitControlStructure(this);
		}
	}

	public final ControlStructureContext controlStructure() throws RecognitionException {
		ControlStructureContext _localctx = new ControlStructureContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_controlStructure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REPEATWHILE:
				{
				setState(128);
				iterativeControlStructure();
				}
				break;
			case IF:
				{
				setState(129);
				selectiveControlStructure();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class SelectiveControlStructureContext extends ParserRuleContext {
		public IfStructureContext ifStructure() {
			return getRuleContext(IfStructureContext.class,0);
		}
		public SelectiveControlStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectiveControlStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterSelectiveControlStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitSelectiveControlStructure(this);
		}
	}

	public final SelectiveControlStructureContext selectiveControlStructure() throws RecognitionException {
		SelectiveControlStructureContext _localctx = new SelectiveControlStructureContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_selectiveControlStructure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			ifStructure();
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
	public static class IfStructureContext extends ParserRuleContext {
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(EelParser.THEN, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public TerminalNode ENDIF() { return getToken(EelParser.ENDIF, 0); }
		public List<ElseIfStructureContext> elseIfStructure() {
			return getRuleContexts(ElseIfStructureContext.class);
		}
		public ElseIfStructureContext elseIfStructure(int i) {
			return getRuleContext(ElseIfStructureContext.class,i);
		}
		public ElseStructureContext elseStructure() {
			return getRuleContext(ElseStructureContext.class,0);
		}
		public IfStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterIfStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitIfStructure(this);
		}
	}

	public final IfStructureContext ifStructure() throws RecognitionException {
		IfStructureContext _localctx = new IfStructureContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStructure);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			ifCondition();
			setState(135);
			match(THEN);
			setState(136);
			line();
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(137);
					elseIfStructure();
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(143);
				elseStructure();
				}
			}

			setState(146);
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
	public static class IfConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(EelParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(EelParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EelParser.RPAREN, 0); }
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitIfCondition(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(IF);
			setState(149);
			match(LPAREN);
			setState(150);
			expression();
			setState(151);
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
	public static class ElseIfStructureContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(EelParser.ELSE, 0); }
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public ElseIfStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterElseIfStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitElseIfStructure(this);
		}
	}

	public final ElseIfStructureContext elseIfStructure() throws RecognitionException {
		ElseIfStructureContext _localctx = new ElseIfStructureContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elseIfStructure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(ELSE);
			setState(154);
			ifCondition();
			setState(155);
			line();
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
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
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
		enterRule(_localctx, 32, RULE_elseStructure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(ELSE);
			setState(158);
			match(THEN);
			setState(159);
			line();
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
	public static class IterativeControlStructureContext extends ParserRuleContext {
		public RepeatStructureContext repeatStructure() {
			return getRuleContext(RepeatStructureContext.class,0);
		}
		public IterativeControlStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterativeControlStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterIterativeControlStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitIterativeControlStructure(this);
		}
	}

	public final IterativeControlStructureContext iterativeControlStructure() throws RecognitionException {
		IterativeControlStructureContext _localctx = new IterativeControlStructureContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_iterativeControlStructure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			repeatStructure();
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
	public static class RepeatStructureContext extends ParserRuleContext {
		public TerminalNode REPEATWHILE() { return getToken(EelParser.REPEATWHILE, 0); }
		public TerminalNode LPAREN() { return getToken(EelParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(EelParser.RPAREN, 0); }
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public TerminalNode ENDREPEAT() { return getToken(EelParser.ENDREPEAT, 0); }
		public RepeatStructureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStructure; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterRepeatStructure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitRepeatStructure(this);
		}
	}

	public final RepeatStructureContext repeatStructure() throws RecognitionException {
		RepeatStructureContext _localctx = new RepeatStructureContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_repeatStructure);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(REPEATWHILE);
			setState(164);
			match(LPAREN);
			setState(165);
			expression();
			setState(166);
			match(RPAREN);
			setState(167);
			line();
			setState(168);
			match(ENDREPEAT);
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
	public static class ValueContext extends ParserRuleContext {
		public StaticValueContext staticValue() {
			return getRuleContext(StaticValueContext.class,0);
		}
		public UserValueContext userValue() {
			return getRuleContext(UserValueContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLIT:
			case STRINGLIT:
			case FUNCTIONS:
				{
				setState(170);
				staticValue();
				}
				break;
			case ID:
				{
				setState(171);
				userValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class StaticValueContext extends ParserRuleContext {
		public TerminalNode INTLIT() { return getToken(EelParser.INTLIT, 0); }
		public TerminalNode STRINGLIT() { return getToken(EelParser.STRINGLIT, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public StaticValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterStaticValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitStaticValue(this);
		}
	}

	public final StaticValueContext staticValue() throws RecognitionException {
		StaticValueContext _localctx = new StaticValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_staticValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTLIT:
				{
				setState(174);
				match(INTLIT);
				}
				break;
			case STRINGLIT:
				{
				setState(175);
				match(STRINGLIT);
				}
				break;
			case FUNCTIONS:
				{
				setState(176);
				function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==METHODS) {
				{
				{
				setState(179);
				method();
				}
				}
				setState(184);
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTIONS() { return getToken(EelParser.FUNCTIONS, 0); }
		public TerminalNode LPAREN() { return getToken(EelParser.LPAREN, 0); }
		public ActualParametersContext actualParameters() {
			return getRuleContext(ActualParametersContext.class,0);
		}
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
		enterRule(_localctx, 42, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(FUNCTIONS);
			setState(186);
			match(LPAREN);
			setState(187);
			actualParameters();
			setState(188);
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
	public static class UserValueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EelParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(EelParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EelParser.RPAREN, 0); }
		public ActualParametersContext actualParameters() {
			return getRuleContext(ActualParametersContext.class,0);
		}
		public UserValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterUserValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitUserValue(this);
		}
	}

	public final UserValueContext userValue() throws RecognitionException {
		UserValueContext _localctx = new UserValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_userValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(ID);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(191);
				match(LPAREN);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37761024L) != 0)) {
					{
					setState(192);
					actualParameters();
					}
				}

				setState(195);
				match(RPAREN);
				}
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
	public static class ActualParametersContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EelParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EelParser.COMMA, i);
		}
		public ActualParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterActualParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitActualParameters(this);
		}
	}

	public final ActualParametersContext actualParameters() throws RecognitionException {
		ActualParametersContext _localctx = new ActualParametersContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_actualParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			value();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(199);
				match(COMMA);
				setState(200);
				value();
				}
				}
				setState(205);
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
	public static class MethodContext extends ParserRuleContext {
		public TerminalNode METHODS() { return getToken(EelParser.METHODS, 0); }
		public TerminalNode LPAREN() { return getToken(EelParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(EelParser.RPAREN, 0); }
		public ActualParametersContext actualParameters() {
			return getRuleContext(ActualParametersContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EelParserListener ) ((EelParserListener)listener).exitMethod(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(METHODS);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(207);
				match(LPAREN);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37761024L) != 0)) {
					{
					setState(208);
					actualParameters();
					}
				}

				setState(211);
				match(RPAREN);
				}
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

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u00d7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0001\u0000\u0004\u00004\b\u0000\u000b\u0000\f\u00005\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		">\b\u0001\u0001\u0001\u0001\u0001\u0004\u0001B\b\u0001\u000b\u0001\f\u0001"+
		"C\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"K\b\u0002\n\u0002\f\u0002N\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003S\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"X\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006"+
		"^\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007g\b\u0007\n\u0007\f\u0007j\t\u0007"+
		"\u0003\u0007l\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007r\b\u0007\n\u0007\f\u0007u\t\u0007\u0003\u0007w\b\u0007\u0001"+
		"\b\u0001\b\u0003\b{\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0083\b\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0005\r\u008b\b\r\n\r\f\r\u008e\t\r\u0001\r\u0003\r\u0091\b"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00ad\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u00b2\b\u0014\u0001\u0014\u0005\u0014\u00b5\b\u0014"+
		"\n\u0014\f\u0014\u00b8\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00c2"+
		"\b\u0016\u0001\u0016\u0003\u0016\u00c5\b\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0005\u0017\u00ca\b\u0017\n\u0017\f\u0017\u00cd\t\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00d2\b\u0018\u0001\u0018\u0003"+
		"\u0018\u00d5\b\u0018\u0001\u0018\u0000\u0000\u0019\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"0\u0000\u0001\u0001\u0000\u000e\u0011\u00d6\u00003\u0001\u0000\u0000\u0000"+
		"\u00029\u0001\u0000\u0000\u0000\u0004G\u0001\u0000\u0000\u0000\u0006R"+
		"\u0001\u0000\u0000\u0000\bT\u0001\u0000\u0000\u0000\nY\u0001\u0000\u0000"+
		"\u0000\f]\u0001\u0000\u0000\u0000\u000ev\u0001\u0000\u0000\u0000\u0010"+
		"z\u0001\u0000\u0000\u0000\u0012|\u0001\u0000\u0000\u0000\u0014~\u0001"+
		"\u0000\u0000\u0000\u0016\u0082\u0001\u0000\u0000\u0000\u0018\u0084\u0001"+
		"\u0000\u0000\u0000\u001a\u0086\u0001\u0000\u0000\u0000\u001c\u0094\u0001"+
		"\u0000\u0000\u0000\u001e\u0099\u0001\u0000\u0000\u0000 \u009d\u0001\u0000"+
		"\u0000\u0000\"\u00a1\u0001\u0000\u0000\u0000$\u00a3\u0001\u0000\u0000"+
		"\u0000&\u00ac\u0001\u0000\u0000\u0000(\u00b1\u0001\u0000\u0000\u0000*"+
		"\u00b9\u0001\u0000\u0000\u0000,\u00be\u0001\u0000\u0000\u0000.\u00c6\u0001"+
		"\u0000\u0000\u00000\u00ce\u0001\u0000\u0000\u000024\u0003\u0002\u0001"+
		"\u000032\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000053\u0001\u0000"+
		"\u0000\u000056\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000078\u0005"+
		"\u0000\u0000\u00018\u0001\u0001\u0000\u0000\u00009:\u0005\u0003\u0000"+
		"\u0000:;\u0005\u0019\u0000\u0000;=\u0005\u0013\u0000\u0000<>\u0003\u0004"+
		"\u0002\u0000=<\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001"+
		"\u0000\u0000\u0000?A\u0005\u0014\u0000\u0000@B\u0003\u0006\u0003\u0000"+
		"A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0005\u0004"+
		"\u0000\u0000F\u0003\u0001\u0000\u0000\u0000GL\u0005\u0019\u0000\u0000"+
		"HI\u0005\u0015\u0000\u0000IK\u0005\u0019\u0000\u0000JH\u0001\u0000\u0000"+
		"\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000M\u0005\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"OS\u0003\b\u0004\u0000PS\u0003\f\u0006\u0000QS\u0003\u0016\u000b\u0000"+
		"RO\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000S\u0007\u0001\u0000\u0000\u0000TU\u0005\u0002\u0000\u0000UW\u0005"+
		"\u0019\u0000\u0000VX\u0003\n\u0005\u0000WV\u0001\u0000\u0000\u0000WX\u0001"+
		"\u0000\u0000\u0000X\t\u0001\u0000\u0000\u0000YZ\u0005\u0012\u0000\u0000"+
		"Z[\u0003\u000e\u0007\u0000[\u000b\u0001\u0000\u0000\u0000\\^\u0005\u0005"+
		"\u0000\u0000]\\\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^_\u0001"+
		"\u0000\u0000\u0000_`\u0003\u000e\u0007\u0000`\r\u0001\u0000\u0000\u0000"+
		"ak\u0003,\u0016\u0000bl\u0003\n\u0005\u0000cd\u0003\u0010\b\u0000de\u0003"+
		"&\u0013\u0000eg\u0001\u0000\u0000\u0000fc\u0001\u0000\u0000\u0000gj\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kb\u0001\u0000\u0000"+
		"\u0000kh\u0001\u0000\u0000\u0000lw\u0001\u0000\u0000\u0000ms\u0003(\u0014"+
		"\u0000no\u0003\u0010\b\u0000op\u0003&\u0013\u0000pr\u0001\u0000\u0000"+
		"\u0000qn\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000va\u0001\u0000\u0000\u0000vm\u0001\u0000\u0000\u0000"+
		"w\u000f\u0001\u0000\u0000\u0000x{\u0003\u0012\t\u0000y{\u0003\u0014\n"+
		"\u0000zx\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000{\u0011\u0001"+
		"\u0000\u0000\u0000|}\u0007\u0000\u0000\u0000}\u0013\u0001\u0000\u0000"+
		"\u0000~\u007f\u0005\u0018\u0000\u0000\u007f\u0015\u0001\u0000\u0000\u0000"+
		"\u0080\u0083\u0003\"\u0011\u0000\u0081\u0083\u0003\u0018\f\u0000\u0082"+
		"\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0017\u0001\u0000\u0000\u0000\u0084\u0085\u0003\u001a\r\u0000\u0085\u0019"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0003\u001c\u000e\u0000\u0087\u0088"+
		"\u0005\n\u0000\u0000\u0088\u008c\u0003\u0006\u0003\u0000\u0089\u008b\u0003"+
		"\u001e\u000f\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008e\u0001"+
		"\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001"+
		"\u0000\u0000\u0000\u008f\u0091\u0003 \u0010\u0000\u0090\u008f\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0005\t\u0000\u0000\u0093\u001b\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005\b\u0000\u0000\u0095\u0096\u0005\u0013\u0000\u0000"+
		"\u0096\u0097\u0003\u000e\u0007\u0000\u0097\u0098\u0005\u0014\u0000\u0000"+
		"\u0098\u001d\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u000b\u0000\u0000"+
		"\u009a\u009b\u0003\u001c\u000e\u0000\u009b\u009c\u0003\u0006\u0003\u0000"+
		"\u009c\u001f\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u000b\u0000\u0000"+
		"\u009e\u009f\u0005\n\u0000\u0000\u009f\u00a0\u0003\u0006\u0003\u0000\u00a0"+
		"!\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003$\u0012\u0000\u00a2#\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005\u0006\u0000\u0000\u00a4\u00a5\u0005"+
		"\u0013\u0000\u0000\u00a5\u00a6\u0003\u000e\u0007\u0000\u00a6\u00a7\u0005"+
		"\u0014\u0000\u0000\u00a7\u00a8\u0003\u0006\u0003\u0000\u00a8\u00a9\u0005"+
		"\u0007\u0000\u0000\u00a9%\u0001\u0000\u0000\u0000\u00aa\u00ad\u0003(\u0014"+
		"\u0000\u00ab\u00ad\u0003,\u0016\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\'\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b2\u0005\f\u0000\u0000\u00af\u00b2\u0005\r\u0000\u0000\u00b0\u00b2"+
		"\u0003*\u0015\u0000\u00b1\u00ae\u0001\u0000\u0000\u0000\u00b1\u00af\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b5\u00030\u0018\u0000\u00b4\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7)\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0016\u0000"+
		"\u0000\u00ba\u00bb\u0005\u0013\u0000\u0000\u00bb\u00bc\u0003.\u0017\u0000"+
		"\u00bc\u00bd\u0005\u0014\u0000\u0000\u00bd+\u0001\u0000\u0000\u0000\u00be"+
		"\u00c4\u0005\u0019\u0000\u0000\u00bf\u00c1\u0005\u0013\u0000\u0000\u00c0"+
		"\u00c2\u0003.\u0017\u0000\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c5"+
		"\u0005\u0014\u0000\u0000\u00c4\u00bf\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c5-\u0001\u0000\u0000\u0000\u00c6\u00cb\u0003"+
		"&\u0013\u0000\u00c7\u00c8\u0005\u0015\u0000\u0000\u00c8\u00ca\u0003&\u0013"+
		"\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cc/\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000"+
		"\u00ce\u00d4\u0005\u0017\u0000\u0000\u00cf\u00d1\u0005\u0013\u0000\u0000"+
		"\u00d0\u00d2\u0003.\u0017\u0000\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3"+
		"\u00d5\u0005\u0014\u0000\u0000\u00d4\u00cf\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d51\u0001\u0000\u0000\u0000\u00175="+
		"CLRW]hksvz\u0082\u008c\u0090\u00ac\u00b1\u00b6\u00c1\u00c4\u00cb\u00d1"+
		"\u00d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}