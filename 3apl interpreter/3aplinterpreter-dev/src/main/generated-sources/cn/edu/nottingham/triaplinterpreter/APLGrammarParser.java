// Generated from java-escape by ANTLR 4.11.1
package cn.edu.nottingham.triaplinterpreter;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class APLGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, LOAD=2, CBASE=3, BBASE=4, GBASE=5, PBASE=6, PGRULE=7, PRRULE=8, 
		QUOTE=9, SEMI=10, LBRACE=11, RBRACE=12, DOT=13, BARROW=14, COMMA=15, AND=16, 
		OR=17, LPAREN=18, RPAREN=19, SEND=20, JAVA=21, QUESTION=22, IF=23, THEN=24, 
		ELSE=25, WHILE=26, DO=27, SEMICOLON=28, PARROW=29, ORS=30, NOT=31, TRUE=32, 
		IDENT=33, CAPVAR=34, NAMEVAR=35, ALPHA=36, DIGIT=37, WS=38, ALPHANUMERIC=39;
	public static final int
		RULE_program = 0, RULE_capabilities = 1, RULE_capability = 2, RULE_beliefs = 3, 
		RULE_belief = 4, RULE_goals = 5, RULE_goal = 6, RULE_plans = 7, RULE_plan = 8, 
		RULE_basicaction = 9, RULE_plant = 10, RULE_p_rules = 11, RULE_p_rule = 12, 
		RULE_r_rules = 13, RULE_r_rule = 14, RULE_literals = 15, RULE_literal = 16, 
		RULE_wff = 17, RULE_query = 18, RULE_iv = 19, RULE_ident = 20, RULE_var = 21, 
		RULE_atom = 22, RULE_argument = 23, RULE_aatom = 24, RULE_pvarval = 25, 
		RULE_pvar = 26, RULE_pname = 27, RULE_pval = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "capabilities", "capability", "beliefs", "belief", "goals", 
			"goal", "plans", "plan", "basicaction", "plant", "p_rules", "p_rule", 
			"r_rules", "r_rule", "literals", "literal", "wff", "query", "iv", "ident", 
			"var", "atom", "argument", "aatom", "pvarval", "pvar", "pname", "pval"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'LOAD'", "'CAPABILITIES'", "'BELIEFBASE'", "'GOALBASE'", 
			"'PLANBASE'", "'PG-RULES'", "'PR-RULES'", "'\"'", "':'", "'{'", "'}'", 
			"'.'", "':-'", "','", "'AND'", "'OR'", "'('", "')'", "'SEND'", "'JAVA'", 
			"'?'", "'IF'", "'THEN'", "'ELSE'", "'WHILE'", "'DO'", "';'", "'<-'", 
			"'|'", "'NOT'", "'TRUE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PROGRAM", "LOAD", "CBASE", "BBASE", "GBASE", "PBASE", "PGRULE", 
			"PRRULE", "QUOTE", "SEMI", "LBRACE", "RBRACE", "DOT", "BARROW", "COMMA", 
			"AND", "OR", "LPAREN", "RPAREN", "SEND", "JAVA", "QUESTION", "IF", "THEN", 
			"ELSE", "WHILE", "DO", "SEMICOLON", "PARROW", "ORS", "NOT", "TRUE", "IDENT", 
			"CAPVAR", "NAMEVAR", "ALPHA", "DIGIT", "WS", "ALPHANUMERIC"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public APLGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(APLGrammarParser.PROGRAM, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode CBASE() { return getToken(APLGrammarParser.CBASE, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(APLGrammarParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(APLGrammarParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(APLGrammarParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(APLGrammarParser.RBRACE, i);
		}
		public TerminalNode BBASE() { return getToken(APLGrammarParser.BBASE, 0); }
		public TerminalNode GBASE() { return getToken(APLGrammarParser.GBASE, 0); }
		public TerminalNode PBASE() { return getToken(APLGrammarParser.PBASE, 0); }
		public TerminalNode PGRULE() { return getToken(APLGrammarParser.PGRULE, 0); }
		public TerminalNode PRRULE() { return getToken(APLGrammarParser.PRRULE, 0); }
		public TerminalNode LOAD() { return getToken(APLGrammarParser.LOAD, 0); }
		public CapabilitiesContext capabilities() {
			return getRuleContext(CapabilitiesContext.class,0);
		}
		public BeliefsContext beliefs() {
			return getRuleContext(BeliefsContext.class,0);
		}
		public GoalsContext goals() {
			return getRuleContext(GoalsContext.class,0);
		}
		public PlansContext plans() {
			return getRuleContext(PlansContext.class,0);
		}
		public P_rulesContext p_rules() {
			return getRuleContext(P_rulesContext.class,0);
		}
		public R_rulesContext r_rules() {
			return getRuleContext(R_rulesContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(PROGRAM);
			setState(59);
			ident();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOAD) {
				{
				setState(60);
				match(LOAD);
				setState(61);
				ident();
				}
			}

			setState(64);
			match(CBASE);
			setState(65);
			match(LBRACE);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(66);
				capabilities();
				}
			}

			setState(69);
			match(RBRACE);
			setState(70);
			match(BBASE);
			setState(71);
			match(LBRACE);
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(72);
				beliefs();
				}
				break;
			}
			setState(75);
			match(RBRACE);
			setState(76);
			match(GBASE);
			setState(77);
			match(LBRACE);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAMEVAR) {
				{
				setState(78);
				goals();
				}
			}

			setState(81);
			match(RBRACE);
			setState(82);
			match(PBASE);
			setState(83);
			match(LBRACE);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(84);
				plans();
				}
			}

			setState(87);
			match(RBRACE);
			setState(88);
			match(PGRULE);
			setState(89);
			match(LBRACE);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARROW || _la==NAMEVAR) {
				{
				setState(90);
				p_rules();
				}
			}

			setState(93);
			match(RBRACE);
			setState(94);
			match(PRRULE);
			setState(95);
			match(LBRACE);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 53765734400L) != 0) {
				{
				setState(96);
				r_rules();
				}
			}

			setState(99);
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
	public static class CapabilitiesContext extends ParserRuleContext {
		public List<CapabilityContext> capability() {
			return getRuleContexts(CapabilityContext.class);
		}
		public CapabilityContext capability(int i) {
			return getRuleContext(CapabilityContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(APLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(APLGrammarParser.COMMA, i);
		}
		public CapabilitiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capabilities; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterCapabilities(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitCapabilities(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitCapabilities(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CapabilitiesContext capabilities() throws RecognitionException {
		CapabilitiesContext _localctx = new CapabilitiesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_capabilities);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			capability();
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(102);
				match(COMMA);
				setState(103);
				capability();
				}
				}
				setState(108);
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
	public static class CapabilityContext extends ParserRuleContext {
		public List<TerminalNode> LBRACE() { return getTokens(APLGrammarParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(APLGrammarParser.LBRACE, i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<TerminalNode> RBRACE() { return getTokens(APLGrammarParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(APLGrammarParser.RBRACE, i);
		}
		public AatomContext aatom() {
			return getRuleContext(AatomContext.class,0);
		}
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public CapabilityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capability; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterCapability(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitCapability(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitCapability(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CapabilityContext capability() throws RecognitionException {
		CapabilityContext _localctx = new CapabilityContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_capability);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(LBRACE);
			setState(110);
			query();
			setState(111);
			match(RBRACE);
			setState(112);
			aatom();
			setState(113);
			match(LBRACE);
			setState(114);
			literals();
			setState(115);
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
	public static class BeliefsContext extends ParserRuleContext {
		public List<BeliefContext> belief() {
			return getRuleContexts(BeliefContext.class);
		}
		public BeliefContext belief(int i) {
			return getRuleContext(BeliefContext.class,i);
		}
		public BeliefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beliefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterBeliefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitBeliefs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitBeliefs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeliefsContext beliefs() throws RecognitionException {
		BeliefsContext _localctx = new BeliefsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_beliefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAMEVAR) {
				{
				{
				setState(117);
				belief();
				}
				}
				setState(122);
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
	public static class BeliefContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode DOT() { return getToken(APLGrammarParser.DOT, 0); }
		public TerminalNode BARROW() { return getToken(APLGrammarParser.BARROW, 0); }
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public BeliefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_belief; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterBelief(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitBelief(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitBelief(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BeliefContext belief() throws RecognitionException {
		BeliefContext _localctx = new BeliefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_belief);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				atom();
				setState(124);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				atom();
				setState(127);
				match(BARROW);
				setState(128);
				literals();
				setState(129);
				match(DOT);
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
	public static class GoalsContext extends ParserRuleContext {
		public List<GoalContext> goal() {
			return getRuleContexts(GoalContext.class);
		}
		public GoalContext goal(int i) {
			return getRuleContext(GoalContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(APLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(APLGrammarParser.COMMA, i);
		}
		public GoalsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterGoals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitGoals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitGoals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalsContext goals() throws RecognitionException {
		GoalsContext _localctx = new GoalsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_goals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			goal();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(134);
				match(COMMA);
				setState(135);
				goal();
				}
				}
				setState(140);
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
	public static class GoalContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(APLGrammarParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(APLGrammarParser.AND, i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitGoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitGoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			atom();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(142);
				match(AND);
				setState(143);
				atom();
				}
				}
				setState(148);
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
	public static class PlansContext extends ParserRuleContext {
		public List<TerminalNode> LBRACE() { return getTokens(APLGrammarParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(APLGrammarParser.LBRACE, i);
		}
		public List<PlanContext> plan() {
			return getRuleContexts(PlanContext.class);
		}
		public PlanContext plan(int i) {
			return getRuleContext(PlanContext.class,i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(APLGrammarParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(APLGrammarParser.RBRACE, i);
		}
		public PlansContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterPlans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitPlans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitPlans(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlansContext plans() throws RecognitionException {
		PlansContext _localctx = new PlansContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_plans);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(LBRACE);
			setState(150);
			plan();
			setState(151);
			match(RBRACE);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACE) {
				{
				{
				setState(152);
				match(LBRACE);
				setState(153);
				plan();
				setState(154);
				match(RBRACE);
				}
				}
				setState(160);
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
	public static class PlanContext extends ParserRuleContext {
		public BasicactionContext basicaction() {
			return getRuleContext(BasicactionContext.class,0);
		}
		public List<PlantContext> plant() {
			return getRuleContexts(PlantContext.class);
		}
		public PlantContext plant(int i) {
			return getRuleContext(PlantContext.class,i);
		}
		public PlanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterPlan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitPlan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitPlan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlanContext plan() throws RecognitionException {
		PlanContext _localctx = new PlanContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_plan);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			basicaction();
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(162);
					plant();
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
	public static class BasicactionContext extends ParserRuleContext {
		public BasicactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicaction; }
	 
		public BasicactionContext() { }
		public void copyFrom(BasicactionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AatomActionContext extends BasicactionContext {
		public AatomContext aatom() {
			return getRuleContext(AatomContext.class,0);
		}
		public AatomActionContext(BasicactionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterAatomAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitAatomAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitAatomAction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomActionContext extends BasicactionContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomActionContext(BasicactionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterAtomAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitAtomAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitAtomAction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfActionContext extends BasicactionContext {
		public TerminalNode IF() { return getToken(APLGrammarParser.IF, 0); }
		public WffContext wff() {
			return getRuleContext(WffContext.class,0);
		}
		public TerminalNode THEN() { return getToken(APLGrammarParser.THEN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(APLGrammarParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(APLGrammarParser.LBRACE, i);
		}
		public List<PlanContext> plan() {
			return getRuleContexts(PlanContext.class);
		}
		public PlanContext plan(int i) {
			return getRuleContext(PlanContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(APLGrammarParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(APLGrammarParser.SEMICOLON, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(APLGrammarParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(APLGrammarParser.RBRACE, i);
		}
		public TerminalNode ELSE() { return getToken(APLGrammarParser.ELSE, 0); }
		public IfActionContext(BasicactionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterIfAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitIfAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitIfAction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileActionContext extends BasicactionContext {
		public TerminalNode WHILE() { return getToken(APLGrammarParser.WHILE, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode DO() { return getToken(APLGrammarParser.DO, 0); }
		public TerminalNode LBRACE() { return getToken(APLGrammarParser.LBRACE, 0); }
		public PlanContext plan() {
			return getRuleContext(PlanContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(APLGrammarParser.SEMICOLON, 0); }
		public TerminalNode RBRACE() { return getToken(APLGrammarParser.RBRACE, 0); }
		public WhileActionContext(BasicactionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterWhileAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitWhileAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitWhileAction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JavaActionContext extends BasicactionContext {
		public TerminalNode JAVA() { return getToken(APLGrammarParser.JAVA, 0); }
		public TerminalNode LPAREN() { return getToken(APLGrammarParser.LPAREN, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(APLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(APLGrammarParser.COMMA, i);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(APLGrammarParser.RPAREN, 0); }
		public JavaActionContext(BasicactionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterJavaAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitJavaAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitJavaAction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WffActionContext extends BasicactionContext {
		public WffContext wff() {
			return getRuleContext(WffContext.class,0);
		}
		public TerminalNode QUESTION() { return getToken(APLGrammarParser.QUESTION, 0); }
		public WffActionContext(BasicactionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterWffAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitWffAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitWffAction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SendActionContext extends BasicactionContext {
		public TerminalNode SEND() { return getToken(APLGrammarParser.SEND, 0); }
		public TerminalNode LPAREN() { return getToken(APLGrammarParser.LPAREN, 0); }
		public List<IvContext> iv() {
			return getRuleContexts(IvContext.class);
		}
		public IvContext iv(int i) {
			return getRuleContext(IvContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(APLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(APLGrammarParser.COMMA, i);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(APLGrammarParser.RPAREN, 0); }
		public SendActionContext(BasicactionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterSendAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitSendAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitSendAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicactionContext basicaction() throws RecognitionException {
		BasicactionContext _localctx = new BasicactionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_basicaction);
		int _la;
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new AatomActionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				aatom();
				}
				break;
			case 2:
				_localctx = new SendActionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(SEND);
				setState(170);
				match(LPAREN);
				setState(171);
				iv();
				setState(172);
				match(COMMA);
				setState(173);
				iv();
				setState(174);
				match(COMMA);
				setState(175);
				atom();
				setState(176);
				match(RPAREN);
				}
				break;
			case 3:
				_localctx = new JavaActionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(JAVA);
				setState(179);
				match(LPAREN);
				setState(180);
				ident();
				setState(181);
				match(COMMA);
				setState(182);
				atom();
				setState(183);
				match(COMMA);
				setState(184);
				var();
				setState(185);
				match(RPAREN);
				}
				break;
			case 4:
				_localctx = new WffActionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(187);
				wff(0);
				setState(188);
				match(QUESTION);
				}
				break;
			case 5:
				_localctx = new AtomActionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(190);
				atom();
				}
				break;
			case 6:
				_localctx = new IfActionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(191);
				match(IF);
				setState(192);
				wff(0);
				setState(193);
				match(THEN);
				setState(194);
				match(LBRACE);
				setState(195);
				plan();
				setState(196);
				match(SEMICOLON);
				setState(197);
				match(RBRACE);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(198);
					match(ELSE);
					setState(199);
					match(LBRACE);
					setState(200);
					plan();
					setState(201);
					match(SEMICOLON);
					setState(202);
					match(RBRACE);
					}
				}

				}
				break;
			case 7:
				_localctx = new WhileActionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(206);
				match(WHILE);
				setState(207);
				query();
				setState(208);
				match(DO);
				setState(209);
				match(LBRACE);
				setState(210);
				plan();
				setState(211);
				match(SEMICOLON);
				setState(212);
				match(RBRACE);
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
	public static class PlantContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(APLGrammarParser.SEMICOLON, 0); }
		public PlanContext plan() {
			return getRuleContext(PlanContext.class,0);
		}
		public PlantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterPlant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitPlant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitPlant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlantContext plant() throws RecognitionException {
		PlantContext _localctx = new PlantContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_plant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(SEMICOLON);
			setState(217);
			plan();
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
	public static class P_rulesContext extends ParserRuleContext {
		public List<P_ruleContext> p_rule() {
			return getRuleContexts(P_ruleContext.class);
		}
		public P_ruleContext p_rule(int i) {
			return getRuleContext(P_ruleContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(APLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(APLGrammarParser.COMMA, i);
		}
		public P_rulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterP_rules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitP_rules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitP_rules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_rulesContext p_rules() throws RecognitionException {
		P_rulesContext _localctx = new P_rulesContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_p_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			p_rule();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(220);
				match(COMMA);
				setState(221);
				p_rule();
				}
				}
				setState(226);
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
	public static class P_ruleContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode PARROW() { return getToken(APLGrammarParser.PARROW, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode ORS() { return getToken(APLGrammarParser.ORS, 0); }
		public TerminalNode LBRACE() { return getToken(APLGrammarParser.LBRACE, 0); }
		public PlanContext plan() {
			return getRuleContext(PlanContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(APLGrammarParser.RBRACE, 0); }
		public P_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_p_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterP_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitP_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitP_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final P_ruleContext p_rule() throws RecognitionException {
		P_ruleContext _localctx = new P_ruleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_p_rule);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMEVAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				atom();
				setState(228);
				match(PARROW);
				setState(229);
				query();
				setState(230);
				match(ORS);
				setState(231);
				match(LBRACE);
				setState(232);
				plan();
				setState(233);
				match(RBRACE);
				}
				break;
			case PARROW:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(PARROW);
				setState(236);
				query();
				setState(237);
				match(ORS);
				setState(238);
				match(LBRACE);
				setState(239);
				plan();
				setState(240);
				match(RBRACE);
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
	public static class R_rulesContext extends ParserRuleContext {
		public List<R_ruleContext> r_rule() {
			return getRuleContexts(R_ruleContext.class);
		}
		public R_ruleContext r_rule(int i) {
			return getRuleContext(R_ruleContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(APLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(APLGrammarParser.COMMA, i);
		}
		public R_rulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterR_rules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitR_rules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitR_rules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_rulesContext r_rules() throws RecognitionException {
		R_rulesContext _localctx = new R_rulesContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_r_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			r_rule();
			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(245);
				match(COMMA);
				setState(246);
				r_rule();
				}
				}
				setState(251);
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
	public static class R_ruleContext extends ParserRuleContext {
		public List<PlanContext> plan() {
			return getRuleContexts(PlanContext.class);
		}
		public PlanContext plan(int i) {
			return getRuleContext(PlanContext.class,i);
		}
		public TerminalNode PARROW() { return getToken(APLGrammarParser.PARROW, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode ORS() { return getToken(APLGrammarParser.ORS, 0); }
		public TerminalNode LBRACE() { return getToken(APLGrammarParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(APLGrammarParser.RBRACE, 0); }
		public R_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterR_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitR_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitR_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_ruleContext r_rule() throws RecognitionException {
		R_ruleContext _localctx = new R_ruleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_r_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			plan();
			setState(253);
			match(PARROW);
			setState(254);
			query();
			setState(255);
			match(ORS);
			setState(256);
			match(LBRACE);
			setState(257);
			plan();
			setState(258);
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
	public static class LiteralsContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(APLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(APLGrammarParser.COMMA, i);
		}
		public LiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_literals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			literal();
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(261);
				match(COMMA);
				setState(262);
				literal();
				}
				}
				setState(267);
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
	public static class LiteralContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode NOT() { return getToken(APLGrammarParser.NOT, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		try {
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMEVAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				atom();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(269);
				match(NOT);
				setState(270);
				atom();
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
	public static class WffContext extends ParserRuleContext {
		public WffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wff; }
	 
		public WffContext() { }
		public void copyFrom(WffContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndWffContext extends WffContext {
		public List<WffContext> wff() {
			return getRuleContexts(WffContext.class);
		}
		public WffContext wff(int i) {
			return getRuleContext(WffContext.class,i);
		}
		public TerminalNode AND() { return getToken(APLGrammarParser.AND, 0); }
		public AndWffContext(WffContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterAndWff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitAndWff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitAndWff(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralWffContext extends WffContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralWffContext(WffContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterLiteralWff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitLiteralWff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitLiteralWff(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrWffContext extends WffContext {
		public List<WffContext> wff() {
			return getRuleContexts(WffContext.class);
		}
		public WffContext wff(int i) {
			return getRuleContext(WffContext.class,i);
		}
		public TerminalNode OR() { return getToken(APLGrammarParser.OR, 0); }
		public OrWffContext(WffContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterOrWff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitOrWff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitOrWff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WffContext wff() throws RecognitionException {
		return wff(0);
	}

	private WffContext wff(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		WffContext _localctx = new WffContext(_ctx, _parentState);
		WffContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_wff, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new LiteralWffContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(274);
			literal();
			}
			_ctx.stop = _input.LT(-1);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(282);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new AndWffContext(new WffContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wff);
						setState(276);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(277);
						match(AND);
						setState(278);
						wff(3);
						}
						break;
					case 2:
						{
						_localctx = new OrWffContext(new WffContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_wff);
						setState(279);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(280);
						match(OR);
						setState(281);
						wff(2);
						}
						break;
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
	public static class QueryContext extends ParserRuleContext {
		public WffContext wff() {
			return getRuleContext(WffContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(APLGrammarParser.TRUE, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_query);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case NAMEVAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				wff(0);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				match(TRUE);
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
	public static class IvContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public PvarvalContext pvarval() {
			return getRuleContext(PvarvalContext.class,0);
		}
		public IvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterIv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitIv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitIv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IvContext iv() throws RecognitionException {
		IvContext _localctx = new IvContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_iv);
		try {
			setState(293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				ident();
				}
				break;
			case CAPVAR:
			case NAMEVAR:
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				pvarval();
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
	public static class IdentContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(APLGrammarParser.IDENT, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(IDENT);
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
	public static class VarContext extends ParserRuleContext {
		public TerminalNode ALPHA() { return getToken(APLGrammarParser.ALPHA, 0); }
		public List<TerminalNode> ALPHANUMERIC() { return getTokens(APLGrammarParser.ALPHANUMERIC); }
		public TerminalNode ALPHANUMERIC(int i) {
			return getToken(APLGrammarParser.ALPHANUMERIC, i);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(ALPHA);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ALPHANUMERIC) {
				{
				{
				setState(298);
				match(ALPHANUMERIC);
				}
				}
				setState(303);
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
	public static class AtomContext extends ParserRuleContext {
		public PnameContext pname() {
			return getRuleContext(PnameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(APLGrammarParser.LPAREN, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(APLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(APLGrammarParser.COMMA, i);
		}
		public TerminalNode RPAREN() { return getToken(APLGrammarParser.RPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_atom);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			pname();
			setState(305);
			match(LPAREN);
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(306);
				argument();
				}
				break;
			}
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(309);
					match(COMMA);
					setState(310);
					argument();
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(316);
				match(RPAREN);
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
	public static class ArgumentContext extends ParserRuleContext {
		public PvarvalContext pvarval() {
			return getRuleContext(PvarvalContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_argument);
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(319);
				pvarval();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				atom();
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
	public static class AatomContext extends ParserRuleContext {
		public PvarContext pvar() {
			return getRuleContext(PvarContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(APLGrammarParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(APLGrammarParser.RPAREN, 0); }
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(APLGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(APLGrammarParser.COMMA, i);
		}
		public AatomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aatom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterAatom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitAatom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitAatom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AatomContext aatom() throws RecognitionException {
		AatomContext _localctx = new AatomContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_aatom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			pvar();
			setState(324);
			match(LPAREN);
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 188978561024L) != 0) {
				{
				setState(325);
				argument();
				}
			}

			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(328);
				match(COMMA);
				setState(329);
				argument();
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
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
	public static class PvarvalContext extends ParserRuleContext {
		public PvarContext pvar() {
			return getRuleContext(PvarContext.class,0);
		}
		public PvalContext pval() {
			return getRuleContext(PvalContext.class,0);
		}
		public PvarvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pvarval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterPvarval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitPvarval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitPvarval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PvarvalContext pvarval() throws RecognitionException {
		PvarvalContext _localctx = new PvarvalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_pvarval);
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAPVAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				pvar();
				}
				break;
			case NAMEVAR:
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				pval();
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
	public static class PvarContext extends ParserRuleContext {
		public TerminalNode CAPVAR() { return getToken(APLGrammarParser.CAPVAR, 0); }
		public PvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterPvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitPvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitPvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PvarContext pvar() throws RecognitionException {
		PvarContext _localctx = new PvarContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_pvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(CAPVAR);
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
	public static class PnameContext extends ParserRuleContext {
		public TerminalNode NAMEVAR() { return getToken(APLGrammarParser.NAMEVAR, 0); }
		public PnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterPname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitPname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitPname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PnameContext pname() throws RecognitionException {
		PnameContext _localctx = new PnameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_pname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(NAMEVAR);
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
	public static class PvalContext extends ParserRuleContext {
		public PnameContext pname() {
			return getRuleContext(PnameContext.class,0);
		}
		public List<TerminalNode> DIGIT() { return getTokens(APLGrammarParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(APLGrammarParser.DIGIT, i);
		}
		public PvalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).enterPval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof APLGrammarListener ) ((APLGrammarListener)listener).exitPval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof APLGrammarVisitor ) return ((APLGrammarVisitor<? extends T>)visitor).visitPval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PvalContext pval() throws RecognitionException {
		PvalContext _localctx = new PvalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_pval);
		try {
			int _alt;
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAMEVAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				pname();
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(347); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(346);
						match(DIGIT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(349); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return wff_sempred((WffContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean wff_sempred(WffContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\'\u0162\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0003\u0000?\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"D\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"J\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"P\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"V\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"\\\b\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"b\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001i\b\u0001\n\u0001\f\u0001l\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0005\u0003w\b\u0003\n\u0003\f\u0003z\t\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u0084\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u0089\b\u0005\n\u0005\f\u0005\u008c\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u0091\b\u0006\n\u0006\f\u0006\u0094\t\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0005\u0007\u009d\b\u0007\n\u0007\f\u0007\u00a0\t\u0007\u0001"+
		"\b\u0001\b\u0005\b\u00a4\b\b\n\b\f\b\u00a7\t\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00cd\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d7"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u00df\b\u000b\n\u000b\f\u000b\u00e2\t\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00f3\b\f\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u00f8\b\r\n\r\f\r\u00fb\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0108\b\u000f\n\u000f\f\u000f\u010b\t\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0110\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u011b\b\u0011\n\u0011\f\u0011\u011e"+
		"\t\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u0122\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u0126\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u012c\b\u0015\n\u0015\f\u0015\u012f\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0134\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u0138\b\u0016\n\u0016\f\u0016\u013b\t\u0016\u0001\u0016"+
		"\u0003\u0016\u013e\b\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u0142\b"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0147\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u014b\b\u0018\n\u0018\f\u0018\u014e\t\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0003\u0019\u0154\b\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0004\u001c\u015c\b\u001c\u000b\u001c\f\u001c\u015d\u0003\u001c\u0160"+
		"\b\u001c\u0001\u001c\u0000\u0001\"\u001d\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468\u0000"+
		"\u0000\u016c\u0000:\u0001\u0000\u0000\u0000\u0002e\u0001\u0000\u0000\u0000"+
		"\u0004m\u0001\u0000\u0000\u0000\u0006x\u0001\u0000\u0000\u0000\b\u0083"+
		"\u0001\u0000\u0000\u0000\n\u0085\u0001\u0000\u0000\u0000\f\u008d\u0001"+
		"\u0000\u0000\u0000\u000e\u0095\u0001\u0000\u0000\u0000\u0010\u00a1\u0001"+
		"\u0000\u0000\u0000\u0012\u00d6\u0001\u0000\u0000\u0000\u0014\u00d8\u0001"+
		"\u0000\u0000\u0000\u0016\u00db\u0001\u0000\u0000\u0000\u0018\u00f2\u0001"+
		"\u0000\u0000\u0000\u001a\u00f4\u0001\u0000\u0000\u0000\u001c\u00fc\u0001"+
		"\u0000\u0000\u0000\u001e\u0104\u0001\u0000\u0000\u0000 \u010f\u0001\u0000"+
		"\u0000\u0000\"\u0111\u0001\u0000\u0000\u0000$\u0121\u0001\u0000\u0000"+
		"\u0000&\u0125\u0001\u0000\u0000\u0000(\u0127\u0001\u0000\u0000\u0000*"+
		"\u0129\u0001\u0000\u0000\u0000,\u0130\u0001\u0000\u0000\u0000.\u0141\u0001"+
		"\u0000\u0000\u00000\u0143\u0001\u0000\u0000\u00002\u0153\u0001\u0000\u0000"+
		"\u00004\u0155\u0001\u0000\u0000\u00006\u0157\u0001\u0000\u0000\u00008"+
		"\u015f\u0001\u0000\u0000\u0000:;\u0005\u0001\u0000\u0000;>\u0003(\u0014"+
		"\u0000<=\u0005\u0002\u0000\u0000=?\u0003(\u0014\u0000><\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@A\u0005\u0003"+
		"\u0000\u0000AC\u0005\u000b\u0000\u0000BD\u0003\u0002\u0001\u0000CB\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EF\u0005\f\u0000\u0000FG\u0005\u0004\u0000\u0000GI\u0005\u000b\u0000\u0000"+
		"HJ\u0003\u0006\u0003\u0000IH\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000KL\u0005\f\u0000\u0000LM\u0005\u0005\u0000"+
		"\u0000MO\u0005\u000b\u0000\u0000NP\u0003\n\u0005\u0000ON\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0005\f\u0000"+
		"\u0000RS\u0005\u0006\u0000\u0000SU\u0005\u000b\u0000\u0000TV\u0003\u000e"+
		"\u0007\u0000UT\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WX\u0005\f\u0000\u0000XY\u0005\u0007\u0000\u0000Y[\u0005"+
		"\u000b\u0000\u0000Z\\\u0003\u0016\u000b\u0000[Z\u0001\u0000\u0000\u0000"+
		"[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]^\u0005\f\u0000"+
		"\u0000^_\u0005\b\u0000\u0000_a\u0005\u000b\u0000\u0000`b\u0003\u001a\r"+
		"\u0000a`\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000cd\u0005\f\u0000\u0000d\u0001\u0001\u0000\u0000\u0000ej\u0003"+
		"\u0004\u0002\u0000fg\u0005\u000f\u0000\u0000gi\u0003\u0004\u0002\u0000"+
		"hf\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000k\u0003\u0001\u0000\u0000\u0000lj\u0001"+
		"\u0000\u0000\u0000mn\u0005\u000b\u0000\u0000no\u0003$\u0012\u0000op\u0005"+
		"\f\u0000\u0000pq\u00030\u0018\u0000qr\u0005\u000b\u0000\u0000rs\u0003"+
		"\u001e\u000f\u0000st\u0005\f\u0000\u0000t\u0005\u0001\u0000\u0000\u0000"+
		"uw\u0003\b\u0004\u0000vu\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000"+
		"xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u0007\u0001\u0000"+
		"\u0000\u0000zx\u0001\u0000\u0000\u0000{|\u0003,\u0016\u0000|}\u0005\r"+
		"\u0000\u0000}\u0084\u0001\u0000\u0000\u0000~\u007f\u0003,\u0016\u0000"+
		"\u007f\u0080\u0005\u000e\u0000\u0000\u0080\u0081\u0003\u001e\u000f\u0000"+
		"\u0081\u0082\u0005\r\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083"+
		"{\u0001\u0000\u0000\u0000\u0083~\u0001\u0000\u0000\u0000\u0084\t\u0001"+
		"\u0000\u0000\u0000\u0085\u008a\u0003\f\u0006\u0000\u0086\u0087\u0005\u000f"+
		"\u0000\u0000\u0087\u0089\u0003\f\u0006\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u000b\u0001\u0000\u0000"+
		"\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u0092\u0003,\u0016\u0000"+
		"\u008e\u008f\u0005\u0010\u0000\u0000\u008f\u0091\u0003,\u0016\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000\u0092"+
		"\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093"+
		"\r\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096"+
		"\u0005\u000b\u0000\u0000\u0096\u0097\u0003\u0010\b\u0000\u0097\u009e\u0005"+
		"\f\u0000\u0000\u0098\u0099\u0005\u000b\u0000\u0000\u0099\u009a\u0003\u0010"+
		"\b\u0000\u009a\u009b\u0005\f\u0000\u0000\u009b\u009d\u0001\u0000\u0000"+
		"\u0000\u009c\u0098\u0001\u0000\u0000\u0000\u009d\u00a0\u0001\u0000\u0000"+
		"\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u000f\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a5\u0003\u0012\t\u0000\u00a2\u00a4\u0003\u0014\n\u0000"+
		"\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u0011\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a8\u00d7\u00030\u0018\u0000\u00a9\u00aa\u0005\u0014\u0000\u0000\u00aa"+
		"\u00ab\u0005\u0012\u0000\u0000\u00ab\u00ac\u0003&\u0013\u0000\u00ac\u00ad"+
		"\u0005\u000f\u0000\u0000\u00ad\u00ae\u0003&\u0013\u0000\u00ae\u00af\u0005"+
		"\u000f\u0000\u0000\u00af\u00b0\u0003,\u0016\u0000\u00b0\u00b1\u0005\u0013"+
		"\u0000\u0000\u00b1\u00d7\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0015"+
		"\u0000\u0000\u00b3\u00b4\u0005\u0012\u0000\u0000\u00b4\u00b5\u0003(\u0014"+
		"\u0000\u00b5\u00b6\u0005\u000f\u0000\u0000\u00b6\u00b7\u0003,\u0016\u0000"+
		"\u00b7\u00b8\u0005\u000f\u0000\u0000\u00b8\u00b9\u0003*\u0015\u0000\u00b9"+
		"\u00ba\u0005\u0013\u0000\u0000\u00ba\u00d7\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0003\"\u0011\u0000\u00bc\u00bd\u0005\u0016\u0000\u0000\u00bd\u00d7"+
		"\u0001\u0000\u0000\u0000\u00be\u00d7\u0003,\u0016\u0000\u00bf\u00c0\u0005"+
		"\u0017\u0000\u0000\u00c0\u00c1\u0003\"\u0011\u0000\u00c1\u00c2\u0005\u0018"+
		"\u0000\u0000\u00c2\u00c3\u0005\u000b\u0000\u0000\u00c3\u00c4\u0003\u0010"+
		"\b\u0000\u00c4\u00c5\u0005\u001c\u0000\u0000\u00c5\u00cc\u0005\f\u0000"+
		"\u0000\u00c6\u00c7\u0005\u0019\u0000\u0000\u00c7\u00c8\u0005\u000b\u0000"+
		"\u0000\u00c8\u00c9\u0003\u0010\b\u0000\u00c9\u00ca\u0005\u001c\u0000\u0000"+
		"\u00ca\u00cb\u0005\f\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc"+
		"\u00c6\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd"+
		"\u00d7\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u001a\u0000\u0000\u00cf"+
		"\u00d0\u0003$\u0012\u0000\u00d0\u00d1\u0005\u001b\u0000\u0000\u00d1\u00d2"+
		"\u0005\u000b\u0000\u0000\u00d2\u00d3\u0003\u0010\b\u0000\u00d3\u00d4\u0005"+
		"\u001c\u0000\u0000\u00d4\u00d5\u0005\f\u0000\u0000\u00d5\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d6\u00a8\u0001\u0000\u0000\u0000\u00d6\u00a9\u0001\u0000"+
		"\u0000\u0000\u00d6\u00b2\u0001\u0000\u0000\u0000\u00d6\u00bb\u0001\u0000"+
		"\u0000\u0000\u00d6\u00be\u0001\u0000\u0000\u0000\u00d6\u00bf\u0001\u0000"+
		"\u0000\u0000\u00d6\u00ce\u0001\u0000\u0000\u0000\u00d7\u0013\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d9\u0005\u001c\u0000\u0000\u00d9\u00da\u0003\u0010"+
		"\b\u0000\u00da\u0015\u0001\u0000\u0000\u0000\u00db\u00e0\u0003\u0018\f"+
		"\u0000\u00dc\u00dd\u0005\u000f\u0000\u0000\u00dd\u00df\u0003\u0018\f\u0000"+
		"\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e0\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e1\u0017\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0003,\u0016\u0000\u00e4\u00e5\u0005\u001d\u0000\u0000\u00e5"+
		"\u00e6\u0003$\u0012\u0000\u00e6\u00e7\u0005\u001e\u0000\u0000\u00e7\u00e8"+
		"\u0005\u000b\u0000\u0000\u00e8\u00e9\u0003\u0010\b\u0000\u00e9\u00ea\u0005"+
		"\f\u0000\u0000\u00ea\u00f3\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u001d"+
		"\u0000\u0000\u00ec\u00ed\u0003$\u0012\u0000\u00ed\u00ee\u0005\u001e\u0000"+
		"\u0000\u00ee\u00ef\u0005\u000b\u0000\u0000\u00ef\u00f0\u0003\u0010\b\u0000"+
		"\u00f0\u00f1\u0005\f\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2"+
		"\u00e3\u0001\u0000\u0000\u0000\u00f2\u00eb\u0001\u0000\u0000\u0000\u00f3"+
		"\u0019\u0001\u0000\u0000\u0000\u00f4\u00f9\u0003\u001c\u000e\u0000\u00f5"+
		"\u00f6\u0005\u000f\u0000\u0000\u00f6\u00f8\u0003\u001c\u000e\u0000\u00f7"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001\u0000\u0000\u0000\u00f9"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa"+
		"\u001b\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0003\u0010\b\u0000\u00fd\u00fe\u0005\u001d\u0000\u0000\u00fe\u00ff"+
		"\u0003$\u0012\u0000\u00ff\u0100\u0005\u001e\u0000\u0000\u0100\u0101\u0005"+
		"\u000b\u0000\u0000\u0101\u0102\u0003\u0010\b\u0000\u0102\u0103\u0005\f"+
		"\u0000\u0000\u0103\u001d\u0001\u0000\u0000\u0000\u0104\u0109\u0003 \u0010"+
		"\u0000\u0105\u0106\u0005\u000f\u0000\u0000\u0106\u0108\u0003 \u0010\u0000"+
		"\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000"+
		"\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000"+
		"\u010a\u001f\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000\u0000"+
		"\u010c\u0110\u0003,\u0016\u0000\u010d\u010e\u0005\u001f\u0000\u0000\u010e"+
		"\u0110\u0003,\u0016\u0000\u010f\u010c\u0001\u0000\u0000\u0000\u010f\u010d"+
		"\u0001\u0000\u0000\u0000\u0110!\u0001\u0000\u0000\u0000\u0111\u0112\u0006"+
		"\u0011\uffff\uffff\u0000\u0112\u0113\u0003 \u0010\u0000\u0113\u011c\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\n\u0002\u0000\u0000\u0115\u0116\u0005\u0010"+
		"\u0000\u0000\u0116\u011b\u0003\"\u0011\u0003\u0117\u0118\n\u0001\u0000"+
		"\u0000\u0118\u0119\u0005\u0011\u0000\u0000\u0119\u011b\u0003\"\u0011\u0002"+
		"\u011a\u0114\u0001\u0000\u0000\u0000\u011a\u0117\u0001\u0000\u0000\u0000"+
		"\u011b\u011e\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u0001\u0000\u0000\u0000\u011d#\u0001\u0000\u0000\u0000\u011e"+
		"\u011c\u0001\u0000\u0000\u0000\u011f\u0122\u0003\"\u0011\u0000\u0120\u0122"+
		"\u0005 \u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0120\u0001"+
		"\u0000\u0000\u0000\u0122%\u0001\u0000\u0000\u0000\u0123\u0126\u0003(\u0014"+
		"\u0000\u0124\u0126\u00032\u0019\u0000\u0125\u0123\u0001\u0000\u0000\u0000"+
		"\u0125\u0124\u0001\u0000\u0000\u0000\u0126\'\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0005!\u0000\u0000\u0128)\u0001\u0000\u0000\u0000\u0129\u012d\u0005"+
		"$\u0000\u0000\u012a\u012c\u0005\'\u0000\u0000\u012b\u012a\u0001\u0000"+
		"\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000"+
		"\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e+\u0001\u0000\u0000"+
		"\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0131\u00036\u001b\u0000"+
		"\u0131\u0133\u0005\u0012\u0000\u0000\u0132\u0134\u0003.\u0017\u0000\u0133"+
		"\u0132\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134"+
		"\u0139\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u000f\u0000\u0000\u0136"+
		"\u0138\u0003.\u0017\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0138\u013b"+
		"\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0001\u0000\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000\u013b\u0139"+
		"\u0001\u0000\u0000\u0000\u013c\u013e\u0005\u0013\u0000\u0000\u013d\u013c"+
		"\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e-\u0001"+
		"\u0000\u0000\u0000\u013f\u0142\u00032\u0019\u0000\u0140\u0142\u0003,\u0016"+
		"\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0140\u0001\u0000\u0000"+
		"\u0000\u0142/\u0001\u0000\u0000\u0000\u0143\u0144\u00034\u001a\u0000\u0144"+
		"\u0146\u0005\u0012\u0000\u0000\u0145\u0147\u0003.\u0017\u0000\u0146\u0145"+
		"\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u014c"+
		"\u0001\u0000\u0000\u0000\u0148\u0149\u0005\u000f\u0000\u0000\u0149\u014b"+
		"\u0003.\u0017\u0000\u014a\u0148\u0001\u0000\u0000\u0000\u014b\u014e\u0001"+
		"\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014c\u014d\u0001"+
		"\u0000\u0000\u0000\u014d\u014f\u0001\u0000\u0000\u0000\u014e\u014c\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u0005\u0013\u0000\u0000\u01501\u0001\u0000"+
		"\u0000\u0000\u0151\u0154\u00034\u001a\u0000\u0152\u0154\u00038\u001c\u0000"+
		"\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0152\u0001\u0000\u0000\u0000"+
		"\u01543\u0001\u0000\u0000\u0000\u0155\u0156\u0005\"\u0000\u0000\u0156"+
		"5\u0001\u0000\u0000\u0000\u0157\u0158\u0005#\u0000\u0000\u01587\u0001"+
		"\u0000\u0000\u0000\u0159\u0160\u00036\u001b\u0000\u015a\u015c\u0005%\u0000"+
		"\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000"+
		"\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000"+
		"\u0000\u015e\u0160\u0001\u0000\u0000\u0000\u015f\u0159\u0001\u0000\u0000"+
		"\u0000\u015f\u015b\u0001\u0000\u0000\u0000\u01609\u0001\u0000\u0000\u0000"+
		"#>CIOU[ajx\u0083\u008a\u0092\u009e\u00a5\u00cc\u00d6\u00e0\u00f2\u00f9"+
		"\u0109\u010f\u011a\u011c\u0121\u0125\u012d\u0133\u0139\u013d\u0141\u0146"+
		"\u014c\u0153\u015d\u015f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}