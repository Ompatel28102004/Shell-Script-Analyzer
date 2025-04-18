// Generated from c:/Users/okpat/Desktop/Laptop/coding/Project/Final-Shell-Script-Analyzer/ShellScript.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ShellScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, ELSE=3, ELIF=4, FI=5, WHILE=6, DO=7, DONE=8, FOR=9, IN=10, 
		FUNCTION=11, LPAREN=12, RPAREN=13, LBRACE=14, RBRACE=15, LBRACK=16, RBRACK=17, 
		SEMI=18, PIPE=19, GREATER=20, LESS=21, GREATER_GREATER=22, EQUALS=23, 
		DOLLAR=24, ARRAY_INDEX=25, ARITH_OP=26, OPERATOR=27, WORD=28, NUMBER=29, 
		STRING=30, WS=31, COMMENT=32;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_simpleCommand = 2, RULE_pipeline = 3, 
		RULE_compoundStatement = 4, RULE_ifStatement = 5, RULE_whileStatement = 6, 
		RULE_forStatement = 7, RULE_functionDefinition = 8, RULE_testClause = 9, 
		RULE_expression = 10, RULE_assignment = 11, RULE_arrayAssignment = 12, 
		RULE_variable = 13, RULE_arithmeticExpansion = 14, RULE_arithExpr = 15, 
		RULE_redirection = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "simpleCommand", "pipeline", "compoundStatement", 
			"ifStatement", "whileStatement", "forStatement", "functionDefinition", 
			"testClause", "expression", "assignment", "arrayAssignment", "variable", 
			"arithmeticExpansion", "arithExpr", "redirection"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'else'", "'elif'", "'fi'", "'while'", "'do'", 
			"'done'", "'for'", "'in'", "'function'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'", "';'", "'|'", "'>'", "'<'", "'>>'", "'='", "'$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "THEN", "ELSE", "ELIF", "FI", "WHILE", "DO", "DONE", "FOR", 
			"IN", "FUNCTION", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
			"SEMI", "PIPE", "GREATER", "LESS", "GREATER_GREATER", "EQUALS", "DOLLAR", 
			"ARRAY_INDEX", "ARITH_OP", "OPERATOR", "WORD", "NUMBER", "STRING", "WS", 
			"COMMENT"
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
	public String getGrammarFileName() { return "ShellScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ShellScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ShellScriptParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268700226L) != 0)) {
				{
				{
				setState(34);
				statement();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
	public static class StatementContext extends ParserRuleContext {
		public SimpleCommandContext simpleCommand() {
			return getRuleContext(SimpleCommandContext.class,0);
		}
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ArrayAssignmentContext arrayAssignment() {
			return getRuleContext(ArrayAssignmentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ShellScriptParser.SEMI, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				simpleCommand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				pipeline();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				compoundStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				assignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				arrayAssignment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(47);
				match(SEMI);
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
	public static class SimpleCommandContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(ShellScriptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ShellScriptParser.WORD, i);
		}
		public List<TerminalNode> STRING() { return getTokens(ShellScriptParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ShellScriptParser.STRING, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ShellScriptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ShellScriptParser.NUMBER, i);
		}
		public List<RedirectionContext> redirection() {
			return getRuleContexts(RedirectionContext.class);
		}
		public RedirectionContext redirection(int i) {
			return getRuleContext(RedirectionContext.class,i);
		}
		public SimpleCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCommand; }
	}

	public final SimpleCommandContext simpleCommand() throws RecognitionException {
		SimpleCommandContext _localctx = new SimpleCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_simpleCommand);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(WORD);
			setState(57);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(55);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case WORD:
						{
						setState(51);
						match(WORD);
						}
						break;
					case STRING:
						{
						setState(52);
						match(STRING);
						}
						break;
					case DOLLAR:
						{
						setState(53);
						variable();
						}
						break;
					case NUMBER:
						{
						setState(54);
						match(NUMBER);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) {
				{
				{
				setState(60);
				redirection();
				}
				}
				setState(65);
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
	public static class PipelineContext extends ParserRuleContext {
		public List<SimpleCommandContext> simpleCommand() {
			return getRuleContexts(SimpleCommandContext.class);
		}
		public SimpleCommandContext simpleCommand(int i) {
			return getRuleContext(SimpleCommandContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(ShellScriptParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(ShellScriptParser.PIPE, i);
		}
		public PipelineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeline; }
	}

	public final PipelineContext pipeline() throws RecognitionException {
		PipelineContext _localctx = new PipelineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pipeline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			simpleCommand();
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(67);
				match(PIPE);
				setState(68);
				simpleCommand();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PIPE );
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
	public static class CompoundStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compoundStatement);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				ifStatement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				whileStatement();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				forStatement();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				functionDefinition();
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ShellScriptParser.IF, 0); }
		public List<TestClauseContext> testClause() {
			return getRuleContexts(TestClauseContext.class);
		}
		public TestClauseContext testClause(int i) {
			return getRuleContext(TestClauseContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(ShellScriptParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(ShellScriptParser.THEN, i);
		}
		public TerminalNode FI() { return getToken(ShellScriptParser.FI, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> ELIF() { return getTokens(ShellScriptParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(ShellScriptParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(ShellScriptParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(IF);
			setState(80);
			testClause();
			setState(81);
			match(THEN);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268700226L) != 0)) {
				{
				{
				setState(82);
				statement();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(88);
				match(ELIF);
				setState(89);
				testClause();
				setState(90);
				match(THEN);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268700226L) != 0)) {
					{
					{
					setState(91);
					statement();
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(102);
				match(ELSE);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268700226L) != 0)) {
					{
					{
					setState(103);
					statement();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(111);
			match(FI);
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(ShellScriptParser.WHILE, 0); }
		public TestClauseContext testClause() {
			return getRuleContext(TestClauseContext.class,0);
		}
		public TerminalNode DO() { return getToken(ShellScriptParser.DO, 0); }
		public TerminalNode DONE() { return getToken(ShellScriptParser.DONE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(WHILE);
			setState(114);
			testClause();
			setState(115);
			match(DO);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268700226L) != 0)) {
				{
				{
				setState(116);
				statement();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
			match(DONE);
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
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ShellScriptParser.FOR, 0); }
		public List<TerminalNode> WORD() { return getTokens(ShellScriptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ShellScriptParser.WORD, i);
		}
		public TerminalNode IN() { return getToken(ShellScriptParser.IN, 0); }
		public TerminalNode DO() { return getToken(ShellScriptParser.DO, 0); }
		public TerminalNode DONE() { return getToken(ShellScriptParser.DONE, 0); }
		public List<TerminalNode> STRING() { return getTokens(ShellScriptParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ShellScriptParser.STRING, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ShellScriptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ShellScriptParser.NUMBER, i);
		}
		public TerminalNode SEMI() { return getToken(ShellScriptParser.SEMI, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(FOR);
			setState(125);
			match(WORD);
			setState(126);
			match(IN);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1895825408L) != 0)) {
				{
				setState(131);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRING:
					{
					setState(127);
					match(STRING);
					}
					break;
				case DOLLAR:
					{
					setState(128);
					variable();
					}
					break;
				case WORD:
					{
					setState(129);
					match(WORD);
					}
					break;
				case NUMBER:
					{
					setState(130);
					match(NUMBER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(136);
				match(SEMI);
				}
			}

			setState(139);
			match(DO);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268700226L) != 0)) {
				{
				{
				setState(140);
				statement();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(DONE);
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
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(ShellScriptParser.FUNCTION, 0); }
		public TerminalNode WORD() { return getToken(ShellScriptParser.WORD, 0); }
		public TerminalNode LPAREN() { return getToken(ShellScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ShellScriptParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ShellScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ShellScriptParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(FUNCTION);
			setState(149);
			match(WORD);
			setState(150);
			match(LPAREN);
			setState(151);
			match(RPAREN);
			setState(152);
			match(LBRACE);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 268700226L) != 0)) {
				{
				{
				setState(153);
				statement();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
			match(RBRACE);
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
	public static class TestClauseContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(ShellScriptParser.LBRACK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(ShellScriptParser.RBRACK, 0); }
		public TestClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testClause; }
	}

	public final TestClauseContext testClause() throws RecognitionException {
		TestClauseContext _localctx = new TestClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_testClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(LBRACK);
			setState(162);
			expression();
			setState(163);
			match(RBRACK);
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
		public TerminalNode OPERATOR() { return getToken(ShellScriptParser.OPERATOR, 0); }
		public TerminalNode EQUALS() { return getToken(ShellScriptParser.EQUALS, 0); }
		public List<TerminalNode> WORD() { return getTokens(ShellScriptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ShellScriptParser.WORD, i);
		}
		public List<TerminalNode> STRING() { return getTokens(ShellScriptParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ShellScriptParser.STRING, i);
		}
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ShellScriptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ShellScriptParser.NUMBER, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				{
				setState(165);
				match(WORD);
				}
				break;
			case STRING:
				{
				setState(166);
				match(STRING);
				}
				break;
			case DOLLAR:
				{
				setState(167);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(168);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(171);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==OPERATOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				{
				setState(172);
				match(WORD);
				}
				break;
			case STRING:
				{
				setState(173);
				match(STRING);
				}
				break;
			case DOLLAR:
				{
				setState(174);
				variable();
				}
				break;
			case NUMBER:
				{
				setState(175);
				match(NUMBER);
				}
				break;
			case RBRACK:
				break;
			default:
				break;
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
		public List<TerminalNode> WORD() { return getTokens(ShellScriptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ShellScriptParser.WORD, i);
		}
		public TerminalNode EQUALS() { return getToken(ShellScriptParser.EQUALS, 0); }
		public TerminalNode STRING() { return getToken(ShellScriptParser.STRING, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ShellScriptParser.NUMBER, 0); }
		public ArithmeticExpansionContext arithmeticExpansion() {
			return getRuleContext(ArithmeticExpansionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(WORD);
			setState(179);
			match(EQUALS);
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(180);
				match(WORD);
				}
				break;
			case 2:
				{
				setState(181);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(182);
				variable();
				}
				break;
			case 4:
				{
				setState(183);
				match(NUMBER);
				}
				break;
			case 5:
				{
				setState(184);
				arithmeticExpansion();
				}
				break;
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
	public static class ArrayAssignmentContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(ShellScriptParser.WORD, 0); }
		public TerminalNode EQUALS() { return getToken(ShellScriptParser.EQUALS, 0); }
		public TerminalNode LPAREN() { return getToken(ShellScriptParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ShellScriptParser.RPAREN, 0); }
		public List<TerminalNode> STRING() { return getTokens(ShellScriptParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ShellScriptParser.STRING, i);
		}
		public ArrayAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignment; }
	}

	public final ArrayAssignmentContext arrayAssignment() throws RecognitionException {
		ArrayAssignmentContext _localctx = new ArrayAssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(WORD);
			setState(188);
			match(EQUALS);
			setState(189);
			match(LPAREN);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(190);
				match(STRING);
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(ShellScriptParser.DOLLAR, 0); }
		public TerminalNode WORD() { return getToken(ShellScriptParser.WORD, 0); }
		public TerminalNode LBRACE() { return getToken(ShellScriptParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ShellScriptParser.RBRACE, 0); }
		public TerminalNode ARRAY_INDEX() { return getToken(ShellScriptParser.ARRAY_INDEX, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(DOLLAR);
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WORD:
				{
				setState(199);
				match(WORD);
				}
				break;
			case LBRACE:
				{
				setState(200);
				match(LBRACE);
				setState(201);
				match(WORD);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAY_INDEX) {
					{
					setState(202);
					match(ARRAY_INDEX);
					}
				}

				setState(205);
				match(RBRACE);
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
	public static class ArithmeticExpansionContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(ShellScriptParser.DOLLAR, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(ShellScriptParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ShellScriptParser.LPAREN, i);
		}
		public ArithExprContext arithExpr() {
			return getRuleContext(ArithExprContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ShellScriptParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ShellScriptParser.RPAREN, i);
		}
		public ArithmeticExpansionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpansion; }
	}

	public final ArithmeticExpansionContext arithmeticExpansion() throws RecognitionException {
		ArithmeticExpansionContext _localctx = new ArithmeticExpansionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arithmeticExpansion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(DOLLAR);
			setState(209);
			match(LPAREN);
			setState(210);
			match(LPAREN);
			setState(211);
			arithExpr();
			setState(212);
			match(RPAREN);
			setState(213);
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
	public static class ArithExprContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(ShellScriptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(ShellScriptParser.WORD, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ShellScriptParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ShellScriptParser.NUMBER, i);
		}
		public List<TerminalNode> ARITH_OP() { return getTokens(ShellScriptParser.ARITH_OP); }
		public TerminalNode ARITH_OP(int i) {
			return getToken(ShellScriptParser.ARITH_OP, i);
		}
		public ArithExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExpr; }
	}

	public final ArithExprContext arithExpr() throws RecognitionException {
		ArithExprContext _localctx = new ArithExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arithExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARITH_OP) {
				{
				{
				setState(216);
				match(ARITH_OP);
				setState(217);
				_la = _input.LA(1);
				if ( !(_la==WORD || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(222);
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
	public static class RedirectionContext extends ParserRuleContext {
		public TerminalNode GREATER() { return getToken(ShellScriptParser.GREATER, 0); }
		public TerminalNode LESS() { return getToken(ShellScriptParser.LESS, 0); }
		public TerminalNode GREATER_GREATER() { return getToken(ShellScriptParser.GREATER_GREATER, 0); }
		public TerminalNode WORD() { return getToken(ShellScriptParser.WORD, 0); }
		public TerminalNode STRING() { return getToken(ShellScriptParser.STRING, 0); }
		public RedirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redirection; }
	}

	public final RedirectionContext redirection() throws RecognitionException {
		RedirectionContext _localctx = new RedirectionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_redirection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(224);
			_la = _input.LA(1);
			if ( !(_la==WORD || _la==STRING) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001 \u00e3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000"+
		"\'\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00028\b\u0002"+
		"\n\u0002\f\u0002;\t\u0002\u0001\u0002\u0005\u0002>\b\u0002\n\u0002\f\u0002"+
		"A\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003F\b\u0003\u000b"+
		"\u0003\f\u0003G\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004N\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005T\b\u0005\n\u0005\f\u0005W\t\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005]\b\u0005\n\u0005\f\u0005`\t\u0005\u0005"+
		"\u0005b\b\u0005\n\u0005\f\u0005e\t\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005i\b\u0005\n\u0005\f\u0005l\t\u0005\u0003\u0005n\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"v\b\u0006\n\u0006\f\u0006y\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u0084\b\u0007\n\u0007\f\u0007\u0087\t\u0007\u0001\u0007\u0003"+
		"\u0007\u008a\b\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u008e\b\u0007"+
		"\n\u0007\f\u0007\u0091\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u009b\b\b\n\b\f\b\u009e\t\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u00aa\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b1"+
		"\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00ba\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u00c0\b\f\n\f\f\f\u00c3\t\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u00cc\b\r\u0001\r\u0003\r\u00cf\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00db\b\u000f\n"+
		"\u000f\f\u000f\u00de\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0000\u0000\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0004\u0002\u0000\u0017\u0017"+
		"\u001b\u001b\u0001\u0000\u001c\u001d\u0001\u0000\u0014\u0016\u0002\u0000"+
		"\u001c\u001c\u001e\u001e\u00fc\u0000%\u0001\u0000\u0000\u0000\u00020\u0001"+
		"\u0000\u0000\u0000\u00042\u0001\u0000\u0000\u0000\u0006B\u0001\u0000\u0000"+
		"\u0000\bM\u0001\u0000\u0000\u0000\nO\u0001\u0000\u0000\u0000\fq\u0001"+
		"\u0000\u0000\u0000\u000e|\u0001\u0000\u0000\u0000\u0010\u0094\u0001\u0000"+
		"\u0000\u0000\u0012\u00a1\u0001\u0000\u0000\u0000\u0014\u00a9\u0001\u0000"+
		"\u0000\u0000\u0016\u00b2\u0001\u0000\u0000\u0000\u0018\u00bb\u0001\u0000"+
		"\u0000\u0000\u001a\u00c6\u0001\u0000\u0000\u0000\u001c\u00d0\u0001\u0000"+
		"\u0000\u0000\u001e\u00d7\u0001\u0000\u0000\u0000 \u00df\u0001\u0000\u0000"+
		"\u0000\"$\u0003\u0002\u0001\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001"+
		"\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"&(\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000()\u0005\u0000\u0000"+
		"\u0001)\u0001\u0001\u0000\u0000\u0000*1\u0003\u0004\u0002\u0000+1\u0003"+
		"\u0006\u0003\u0000,1\u0003\b\u0004\u0000-1\u0003\u0016\u000b\u0000.1\u0003"+
		"\u0018\f\u0000/1\u0005\u0012\u0000\u00000*\u0001\u0000\u0000\u00000+\u0001"+
		"\u0000\u0000\u00000,\u0001\u0000\u0000\u00000-\u0001\u0000\u0000\u0000"+
		"0.\u0001\u0000\u0000\u00000/\u0001\u0000\u0000\u00001\u0003\u0001\u0000"+
		"\u0000\u000029\u0005\u001c\u0000\u000038\u0005\u001c\u0000\u000048\u0005"+
		"\u001e\u0000\u000058\u0003\u001a\r\u000068\u0005\u001d\u0000\u000073\u0001"+
		"\u0000\u0000\u000074\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u0000"+
		"76\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001\u0000\u0000"+
		"\u00009:\u0001\u0000\u0000\u0000:?\u0001\u0000\u0000\u0000;9\u0001\u0000"+
		"\u0000\u0000<>\u0003 \u0010\u0000=<\u0001\u0000\u0000\u0000>A\u0001\u0000"+
		"\u0000\u0000?=\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@\u0005"+
		"\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BE\u0003\u0004\u0002"+
		"\u0000CD\u0005\u0013\u0000\u0000DF\u0003\u0004\u0002\u0000EC\u0001\u0000"+
		"\u0000\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000H\u0007\u0001\u0000\u0000\u0000IN\u0003\n\u0005\u0000"+
		"JN\u0003\f\u0006\u0000KN\u0003\u000e\u0007\u0000LN\u0003\u0010\b\u0000"+
		"MI\u0001\u0000\u0000\u0000MJ\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000ML\u0001\u0000\u0000\u0000N\t\u0001\u0000\u0000\u0000OP\u0005\u0001"+
		"\u0000\u0000PQ\u0003\u0012\t\u0000QU\u0005\u0002\u0000\u0000RT\u0003\u0002"+
		"\u0001\u0000SR\u0001\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000Vc\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000XY\u0005\u0004\u0000\u0000YZ\u0003\u0012\t\u0000"+
		"Z^\u0005\u0002\u0000\u0000[]\u0003\u0002\u0001\u0000\\[\u0001\u0000\u0000"+
		"\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000aX\u0001"+
		"\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000dm\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000"+
		"\u0000fj\u0005\u0003\u0000\u0000gi\u0003\u0002\u0001\u0000hg\u0001\u0000"+
		"\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000"+
		"mf\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000op\u0005\u0005\u0000\u0000p\u000b\u0001\u0000\u0000\u0000qr\u0005"+
		"\u0006\u0000\u0000rs\u0003\u0012\t\u0000sw\u0005\u0007\u0000\u0000tv\u0003"+
		"\u0002\u0001\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000"+
		"wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000z{\u0005\b\u0000\u0000{\r\u0001\u0000"+
		"\u0000\u0000|}\u0005\t\u0000\u0000}~\u0005\u001c\u0000\u0000~\u0085\u0005"+
		"\n\u0000\u0000\u007f\u0084\u0005\u001e\u0000\u0000\u0080\u0084\u0003\u001a"+
		"\r\u0000\u0081\u0084\u0005\u001c\u0000\u0000\u0082\u0084\u0005\u001d\u0000"+
		"\u0000\u0083\u007f\u0001\u0000\u0000\u0000\u0083\u0080\u0001\u0000\u0000"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u008a\u0005\u0012\u0000"+
		"\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008f\u0005\u0007\u0000"+
		"\u0000\u008c\u008e\u0003\u0002\u0001\u0000\u008d\u008c\u0001\u0000\u0000"+
		"\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000"+
		"\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0093\u0005\b\u0000\u0000"+
		"\u0093\u000f\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u000b\u0000\u0000"+
		"\u0095\u0096\u0005\u001c\u0000\u0000\u0096\u0097\u0005\f\u0000\u0000\u0097"+
		"\u0098\u0005\r\u0000\u0000\u0098\u009c\u0005\u000e\u0000\u0000\u0099\u009b"+
		"\u0003\u0002\u0001\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009e"+
		"\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u000f\u0000\u0000\u00a0\u0011"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u0010\u0000\u0000\u00a2\u00a3"+
		"\u0003\u0014\n\u0000\u00a3\u00a4\u0005\u0011\u0000\u0000\u00a4\u0013\u0001"+
		"\u0000\u0000\u0000\u00a5\u00aa\u0005\u001c\u0000\u0000\u00a6\u00aa\u0005"+
		"\u001e\u0000\u0000\u00a7\u00aa\u0003\u001a\r\u0000\u00a8\u00aa\u0005\u001d"+
		"\u0000\u0000\u00a9\u00a5\u0001\u0000\u0000\u0000\u00a9\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00a8\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00b0\u0007\u0000"+
		"\u0000\u0000\u00ac\u00b1\u0005\u001c\u0000\u0000\u00ad\u00b1\u0005\u001e"+
		"\u0000\u0000\u00ae\u00b1\u0003\u001a\r\u0000\u00af\u00b1\u0005\u001d\u0000"+
		"\u0000\u00b0\u00ac\u0001\u0000\u0000\u0000\u00b0\u00ad\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u0015\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0005\u001c\u0000\u0000\u00b3\u00b9\u0005\u0017\u0000"+
		"\u0000\u00b4\u00ba\u0005\u001c\u0000\u0000\u00b5\u00ba\u0005\u001e\u0000"+
		"\u0000\u00b6\u00ba\u0003\u001a\r\u0000\u00b7\u00ba\u0005\u001d\u0000\u0000"+
		"\u00b8\u00ba\u0003\u001c\u000e\u0000\u00b9\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b9\u00b5\u0001\u0000\u0000\u0000\u00b9\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000"+
		"\u00ba\u0017\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u001c\u0000\u0000"+
		"\u00bc\u00bd\u0005\u0017\u0000\u0000\u00bd\u00c1\u0005\f\u0000\u0000\u00be"+
		"\u00c0\u0005\u001e\u0000\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\r\u0000\u0000\u00c5\u0019"+
		"\u0001\u0000\u0000\u0000\u00c6\u00ce\u0005\u0018\u0000\u0000\u00c7\u00cf"+
		"\u0005\u001c\u0000\u0000\u00c8\u00c9\u0005\u000e\u0000\u0000\u00c9\u00cb"+
		"\u0005\u001c\u0000\u0000\u00ca\u00cc\u0005\u0019\u0000\u0000\u00cb\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cf\u0005\u000f\u0000\u0000\u00ce\u00c7"+
		"\u0001\u0000\u0000\u0000\u00ce\u00c8\u0001\u0000\u0000\u0000\u00cf\u001b"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u0018\u0000\u0000\u00d1\u00d2"+
		"\u0005\f\u0000\u0000\u00d2\u00d3\u0005\f\u0000\u0000\u00d3\u00d4\u0003"+
		"\u001e\u000f\u0000\u00d4\u00d5\u0005\r\u0000\u0000\u00d5\u00d6\u0005\r"+
		"\u0000\u0000\u00d6\u001d\u0001\u0000\u0000\u0000\u00d7\u00dc\u0007\u0001"+
		"\u0000\u0000\u00d8\u00d9\u0005\u001a\u0000\u0000\u00d9\u00db\u0007\u0001"+
		"\u0000\u0000\u00da\u00d8\u0001\u0000\u0000\u0000\u00db\u00de\u0001\u0000"+
		"\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000"+
		"\u0000\u0000\u00dd\u001f\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000"+
		"\u0000\u0000\u00df\u00e0\u0007\u0002\u0000\u0000\u00e0\u00e1\u0007\u0003"+
		"\u0000\u0000\u00e1!\u0001\u0000\u0000\u0000\u0019%079?GMU^cjmw\u0083\u0085"+
		"\u0089\u008f\u009c\u00a9\u00b0\u00b9\u00c1\u00cb\u00ce\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}