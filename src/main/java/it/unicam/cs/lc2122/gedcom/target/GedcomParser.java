// Generated from C:\Users\spacc\OneDrive\Desktop\LC2122-HIERRO-PIERO-APP3\Gedcom.g4 by ANTLR 4.10.1

package it.unicam.cs.lc2122.gedcom.target;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GedcomParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HEAD=1, GEDC=2, VERS=3, CHAR=4, TIME=5, FILE=6, LANG=7, INDI=8, NAME=9, 
		GIVN=10, SURN=11, SEX=12, BIRT=13, DATE=14, PLAC=15, DEAT=16, BURI=17, 
		FAMC=18, FAMS=19, FAM=20, HUSB=21, WIFE=22, CHIL=23, MARR=24, TRLR=25, 
		ANCE=26, DESC=27, ZERO=28, ONE=29, TWO=30, M=31, F=32, CODE=33, TIMEFORMAT=34, 
		VERSION=35, WS=36, NEWLINE=37, STRING=38;
	public static final int
		RULE_program = 0, RULE_header = 1, RULE_head = 2, RULE_gedc = 3, RULE_vers = 4, 
		RULE_charr = 5, RULE_datefile = 6, RULE_time = 7, RULE_file = 8, RULE_lang = 9, 
		RULE_record = 10, RULE_individual = 11, RULE_family = 12, RULE_indi = 13, 
		RULE_name = 14, RULE_givn = 15, RULE_surn = 16, RULE_sex = 17, RULE_birt = 18, 
		RULE_date = 19, RULE_plac = 20, RULE_deat = 21, RULE_buri = 22, RULE_famc = 23, 
		RULE_fams = 24, RULE_fam = 25, RULE_husb = 26, RULE_wife = 27, RULE_chil = 28, 
		RULE_marr = 29, RULE_trailer = 30, RULE_command = 31, RULE_ance = 32, 
		RULE_desc = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "header", "head", "gedc", "vers", "charr", "datefile", "time", 
			"file", "lang", "record", "individual", "family", "indi", "name", "givn", 
			"surn", "sex", "birt", "date", "plac", "deat", "buri", "famc", "fams", 
			"fam", "husb", "wife", "chil", "marr", "trailer", "command", "ance", 
			"desc"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'HEAD'", "'GEDC'", "'VERS'", "'CHAR'", "'TIME'", "'FILE'", "'LANG'", 
			"'INDI'", "'NAME'", "'GIVN'", "'SURN'", "'SEX'", "'BIRT'", "'DATE'", 
			"'PLAC'", "'DEAT'", "'BURI'", "'FAMC'", "'FAMS'", "'FAM'", "'HUSB'", 
			"'WIFE'", "'CHIL'", "'MARR'", "'TRLR'", "'ANCE'", "'DESC'", "'0'", "'1'", 
			"'2'", "'M'", "'F'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HEAD", "GEDC", "VERS", "CHAR", "TIME", "FILE", "LANG", "INDI", 
			"NAME", "GIVN", "SURN", "SEX", "BIRT", "DATE", "PLAC", "DEAT", "BURI", 
			"FAMC", "FAMS", "FAM", "HUSB", "WIFE", "CHIL", "MARR", "TRLR", "ANCE", 
			"DESC", "ZERO", "ONE", "TWO", "M", "F", "CODE", "TIMEFORMAT", "VERSION", 
			"WS", "NEWLINE", "STRING"
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
	public String getGrammarFileName() { return "Gedcom.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GedcomParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public RecordContext record() {
			return getRuleContext(RecordContext.class,0);
		}
		public TrailerContext trailer() {
			return getRuleContext(TrailerContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			header();
			setState(69);
			record();
			setState(70);
			trailer();
			setState(71);
			command();
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

	public static class HeaderContext extends ParserRuleContext {
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public List<GedcContext> gedc() {
			return getRuleContexts(GedcContext.class);
		}
		public GedcContext gedc(int i) {
			return getRuleContext(GedcContext.class,i);
		}
		public List<CharrContext> charr() {
			return getRuleContexts(CharrContext.class);
		}
		public CharrContext charr(int i) {
			return getRuleContext(CharrContext.class,i);
		}
		public List<DatefileContext> datefile() {
			return getRuleContexts(DatefileContext.class);
		}
		public DatefileContext datefile(int i) {
			return getRuleContext(DatefileContext.class,i);
		}
		public List<FileContext> file() {
			return getRuleContexts(FileContext.class);
		}
		public FileContext file(int i) {
			return getRuleContext(FileContext.class,i);
		}
		public List<LangContext> lang() {
			return getRuleContexts(LangContext.class);
		}
		public LangContext lang(int i) {
			return getRuleContext(LangContext.class,i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			head();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ONE) {
				{
				setState(79);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(74);
					gedc();
					}
					break;
				case 2:
					{
					setState(75);
					charr();
					}
					break;
				case 3:
					{
					setState(76);
					datefile();
					}
					break;
				case 4:
					{
					setState(77);
					file();
					}
					break;
				case 5:
					{
					setState(78);
					lang();
					}
					break;
				}
				}
				setState(83);
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

	public static class HeadContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(GedcomParser.ZERO, 0); }
		public TerminalNode WS() { return getToken(GedcomParser.WS, 0); }
		public TerminalNode HEAD() { return getToken(GedcomParser.HEAD, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ZERO);
			setState(85);
			match(WS);
			setState(86);
			match(HEAD);
			setState(87);
			match(NEWLINE);
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

	public static class GedcContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(GedcomParser.ONE, 0); }
		public TerminalNode WS() { return getToken(GedcomParser.WS, 0); }
		public TerminalNode GEDC() { return getToken(GedcomParser.GEDC, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public VersContext vers() {
			return getRuleContext(VersContext.class,0);
		}
		public GedcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gedc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitGedc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GedcContext gedc() throws RecognitionException {
		GedcContext _localctx = new GedcContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_gedc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ONE);
			setState(90);
			match(WS);
			setState(91);
			match(GEDC);
			setState(92);
			match(NEWLINE);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TWO) {
				{
				setState(93);
				vers();
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

	public static class VersContext extends ParserRuleContext {
		public TerminalNode TWO() { return getToken(GedcomParser.TWO, 0); }
		public List<TerminalNode> WS() { return getTokens(GedcomParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GedcomParser.WS, i);
		}
		public TerminalNode VERS() { return getToken(GedcomParser.VERS, 0); }
		public TerminalNode VERSION() { return getToken(GedcomParser.VERSION, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public VersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitVers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersContext vers() throws RecognitionException {
		VersContext _localctx = new VersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vers);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(TWO);
			setState(97);
			match(WS);
			setState(98);
			match(VERS);
			setState(99);
			match(WS);
			setState(100);
			match(VERSION);
			setState(101);
			match(NEWLINE);
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

	public static class CharrContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(GedcomParser.ONE, 0); }
		public List<TerminalNode> WS() { return getTokens(GedcomParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GedcomParser.WS, i);
		}
		public TerminalNode CHAR() { return getToken(GedcomParser.CHAR, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public VersContext vers() {
			return getRuleContext(VersContext.class,0);
		}
		public CharrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitCharr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharrContext charr() throws RecognitionException {
		CharrContext _localctx = new CharrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_charr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ONE);
			setState(104);
			match(WS);
			setState(105);
			match(CHAR);
			setState(106);
			match(WS);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(107);
					matchWildcard();
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(113);
			match(NEWLINE);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TWO) {
				{
				setState(114);
				vers();
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

	public static class DatefileContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(GedcomParser.ONE, 0); }
		public List<TerminalNode> WS() { return getTokens(GedcomParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GedcomParser.WS, i);
		}
		public TerminalNode DATE() { return getToken(GedcomParser.DATE, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public DatefileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datefile; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitDatefile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatefileContext datefile() throws RecognitionException {
		DatefileContext _localctx = new DatefileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_datefile);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(ONE);
			setState(118);
			match(WS);
			setState(119);
			match(DATE);
			setState(120);
			match(WS);
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(121);
					matchWildcard();
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(127);
			match(NEWLINE);
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TWO) {
				{
				setState(128);
				time();
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

	public static class TimeContext extends ParserRuleContext {
		public TerminalNode TWO() { return getToken(GedcomParser.TWO, 0); }
		public List<TerminalNode> WS() { return getTokens(GedcomParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GedcomParser.WS, i);
		}
		public TerminalNode TIME() { return getToken(GedcomParser.TIME, 0); }
		public TerminalNode TIMEFORMAT() { return getToken(GedcomParser.TIMEFORMAT, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(TWO);
			setState(132);
			match(WS);
			setState(133);
			match(TIME);
			setState(134);
			match(WS);
			setState(135);
			match(TIMEFORMAT);
			setState(136);
			match(NEWLINE);
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

	public static class FileContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(GedcomParser.ONE, 0); }
		public List<TerminalNode> WS() { return getTokens(GedcomParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GedcomParser.WS, i);
		}
		public TerminalNode FILE() { return getToken(GedcomParser.FILE, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_file);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(ONE);
			setState(139);
			match(WS);
			setState(140);
			match(FILE);
			setState(141);
			match(WS);
			setState(145);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(142);
					matchWildcard();
					}
					} 
				}
				setState(147);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(148);
			match(NEWLINE);
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

	public static class LangContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(GedcomParser.ONE, 0); }
		public List<TerminalNode> WS() { return getTokens(GedcomParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GedcomParser.WS, i);
		}
		public TerminalNode LANG() { return getToken(GedcomParser.LANG, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public LangContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lang; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitLang(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LangContext lang() throws RecognitionException {
		LangContext _localctx = new LangContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_lang);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(ONE);
			setState(151);
			match(WS);
			setState(152);
			match(LANG);
			setState(153);
			match(WS);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(154);
					matchWildcard();
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(160);
			match(NEWLINE);
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

	public static class RecordContext extends ParserRuleContext {
		public List<IndividualContext> individual() {
			return getRuleContexts(IndividualContext.class);
		}
		public IndividualContext individual(int i) {
			return getRuleContext(IndividualContext.class,i);
		}
		public List<FamilyContext> family() {
			return getRuleContexts(FamilyContext.class);
		}
		public FamilyContext family(int i) {
			return getRuleContext(FamilyContext.class,i);
		}
		public RecordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_record; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitRecord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordContext record() throws RecognitionException {
		RecordContext _localctx = new RecordContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_record);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(164);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						setState(162);
						individual();
						}
						break;
					case 2:
						{
						setState(163);
						family();
						}
						break;
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class IndividualContext extends ParserRuleContext {
		public IndiContext indi() {
			return getRuleContext(IndiContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<SexContext> sex() {
			return getRuleContexts(SexContext.class);
		}
		public SexContext sex(int i) {
			return getRuleContext(SexContext.class,i);
		}
		public List<BirtContext> birt() {
			return getRuleContexts(BirtContext.class);
		}
		public BirtContext birt(int i) {
			return getRuleContext(BirtContext.class,i);
		}
		public List<DeatContext> deat() {
			return getRuleContexts(DeatContext.class);
		}
		public DeatContext deat(int i) {
			return getRuleContext(DeatContext.class,i);
		}
		public List<BuriContext> buri() {
			return getRuleContexts(BuriContext.class);
		}
		public BuriContext buri(int i) {
			return getRuleContext(BuriContext.class,i);
		}
		public List<FamcContext> famc() {
			return getRuleContexts(FamcContext.class);
		}
		public FamcContext famc(int i) {
			return getRuleContext(FamcContext.class,i);
		}
		public List<FamsContext> fams() {
			return getRuleContexts(FamsContext.class);
		}
		public FamsContext fams(int i) {
			return getRuleContext(FamsContext.class,i);
		}
		public IndividualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_individual; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitIndividual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndividualContext individual() throws RecognitionException {
		IndividualContext _localctx = new IndividualContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_individual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			indi();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ONE) {
				{
				setState(177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(170);
					name();
					}
					break;
				case 2:
					{
					setState(171);
					sex();
					}
					break;
				case 3:
					{
					setState(172);
					birt();
					}
					break;
				case 4:
					{
					setState(173);
					deat();
					}
					break;
				case 5:
					{
					setState(174);
					buri();
					}
					break;
				case 6:
					{
					setState(175);
					famc();
					}
					break;
				case 7:
					{
					setState(176);
					fams();
					}
					break;
				}
				}
				setState(181);
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

	public static class FamilyContext extends ParserRuleContext {
		public FamContext fam() {
			return getRuleContext(FamContext.class,0);
		}
		public List<HusbContext> husb() {
			return getRuleContexts(HusbContext.class);
		}
		public HusbContext husb(int i) {
			return getRuleContext(HusbContext.class,i);
		}
		public List<WifeContext> wife() {
			return getRuleContexts(WifeContext.class);
		}
		public WifeContext wife(int i) {
			return getRuleContext(WifeContext.class,i);
		}
		public List<ChilContext> chil() {
			return getRuleContexts(ChilContext.class);
		}
		public ChilContext chil(int i) {
			return getRuleContext(ChilContext.class,i);
		}
		public List<MarrContext> marr() {
			return getRuleContexts(MarrContext.class);
		}
		public MarrContext marr(int i) {
			return getRuleContext(MarrContext.class,i);
		}
		public FamilyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_family; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitFamily(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FamilyContext family() throws RecognitionException {
		FamilyContext _localctx = new FamilyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_family);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			fam();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ONE) {
				{
				setState(187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(183);
					husb();
					}
					break;
				case 2:
					{
					setState(184);
					wife();
					}
					break;
				case 3:
					{
					setState(185);
					chil();
					}
					break;
				case 4:
					{
					setState(186);
					marr();
					}
					break;
				}
				}
				setState(191);
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

	public static class IndiContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(GedcomParser.ZERO, 0); }
		public List<TerminalNode> WS() { return getTokens(GedcomParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GedcomParser.WS, i);
		}
		public TerminalNode CODE() { return getToken(GedcomParser.CODE, 0); }
		public TerminalNode INDI() { return getToken(GedcomParser.INDI, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public IndiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indi; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitIndi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndiContext indi() throws RecognitionException {
		IndiContext _localctx = new IndiContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_indi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(ZERO);
			setState(193);
			match(WS);
			setState(194);
			match(CODE);
			setState(195);
			match(WS);
			setState(196);
			match(INDI);
			setState(197);
			match(NEWLINE);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(GedcomParser.ONE, 0); }
		public List<TerminalNode> WS() { return getTokens(GedcomParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GedcomParser.WS, i);
		}
		public TerminalNode NAME() { return getToken(GedcomParser.NAME, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public List<GivnContext> givn() {
			return getRuleContexts(GivnContext.class);
		}
		public GivnContext givn(int i) {
			return getRuleContext(GivnContext.class,i);
		}
		public List<SurnContext> surn() {
			return getRuleContexts(SurnContext.class);
		}
		public SurnContext surn(int i) {
			return getRuleContext(SurnContext.class,i);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_name);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(ONE);
			setState(200);
			match(WS);
			setState(201);
			match(NAME);
			setState(202);
			match(WS);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(203);
					matchWildcard();
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(209);
			match(NEWLINE);
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TWO) {
				{
				setState(212);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(210);
					givn();
					}
					break;
				case 2:
					{
					setState(211);
					surn();
					}
					break;
				}
				}
				setState(216);
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

	public static class GivnContext extends ParserRuleContext {
		public TerminalNode TWO() { return getToken(GedcomParser.TWO, 0); }
		public List<TerminalNode> WS() { return getTokens(GedcomParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GedcomParser.WS, i);
		}
		public TerminalNode GIVN() { return getToken(GedcomParser.GIVN, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public GivnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_givn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitGivn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GivnContext givn() throws RecognitionException {
		GivnContext _localctx = new GivnContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_givn);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(TWO);
			setState(218);
			match(WS);
			setState(219);
			match(GIVN);
			setState(220);
			match(WS);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(221);
					matchWildcard();
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(227);
			match(NEWLINE);
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

	public static class SurnContext extends ParserRuleContext {
		public TerminalNode TWO() { return getToken(GedcomParser.TWO, 0); }
		public List<TerminalNode> WS() { return getTokens(GedcomParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GedcomParser.WS, i);
		}
		public TerminalNode SURN() { return getToken(GedcomParser.SURN, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public SurnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_surn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitSurn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SurnContext surn() throws RecognitionException {
		SurnContext _localctx = new SurnContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_surn);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(TWO);
			setState(230);
			match(WS);
			setState(231);
			match(SURN);
			setState(232);
			match(WS);
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(233);
					matchWildcard();
					}
					} 
				}
				setState(238);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(239);
			match(NEWLINE);
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

	public static class SexContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(GedcomParser.ONE, 0); }
		public List<TerminalNode> WS() { return getTokens(GedcomParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GedcomParser.WS, i);
		}
		public TerminalNode SEX() { return getToken(GedcomParser.SEX, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public TerminalNode M() { return getToken(GedcomParser.M, 0); }
		public TerminalNode F() { return getToken(GedcomParser.F, 0); }
		public SexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sex; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitSex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SexContext sex() throws RecognitionException {
		SexContext _localctx = new SexContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(ONE);
			setState(242);
			match(WS);
			setState(243);
			match(SEX);
			setState(244);
			match(WS);
			setState(245);
			_la = _input.LA(1);
			if ( !(_la==M || _la==F) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(246);
			match(NEWLINE);
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

	public static class BirtContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(GedcomParser.ONE, 0); }
		public TerminalNode WS() { return getToken(GedcomParser.WS, 0); }
		public TerminalNode BIRT() { return getToken(GedcomParser.BIRT, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public List<DateContext> date() {
			return getRuleContexts(DateContext.class);
		}
		public DateContext date(int i) {
			return getRuleContext(DateContext.class,i);
		}
		public List<PlacContext> plac() {
			return getRuleContexts(PlacContext.class);
		}
		public PlacContext plac(int i) {
			return getRuleContext(PlacContext.class,i);
		}
		public BirtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_birt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitBirt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BirtContext birt() throws RecognitionException {
		BirtContext _localctx = new BirtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_birt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(ONE);
			setState(249);
			match(WS);
			setState(250);
			match(BIRT);
			setState(251);
			match(NEWLINE);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TWO) {
				{
				setState(254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(252);
					date();
					}
					break;
				case 2:
					{
					setState(253);
					plac();
					}
					break;
				}
				}
				setState(258);
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

	public static class DateContext extends ParserRuleContext {
		public TerminalNode TWO() { return getToken(GedcomParser.TWO, 0); }
		public List<TerminalNode> WS() { return getTokens(GedcomParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GedcomParser.WS, i);
		}
		public TerminalNode DATE() { return getToken(GedcomParser.DATE, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_date);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(TWO);
			setState(260);
			match(WS);
			setState(261);
			match(DATE);
			setState(262);
			match(WS);
			setState(266);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(263);
					matchWildcard();
					}
					} 
				}
				setState(268);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(269);
			match(NEWLINE);
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(270);
				time();
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

	public static class PlacContext extends ParserRuleContext {
		public TerminalNode TWO() { return getToken(GedcomParser.TWO, 0); }
		public List<TerminalNode> WS() { return getTokens(GedcomParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GedcomParser.WS, i);
		}
		public TerminalNode PLAC() { return getToken(GedcomParser.PLAC, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public PlacContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plac; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitPlac(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlacContext plac() throws RecognitionException {
		PlacContext _localctx = new PlacContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_plac);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(TWO);
			setState(274);
			match(WS);
			setState(275);
			match(PLAC);
			setState(276);
			match(WS);
			setState(280);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(277);
					matchWildcard();
					}
					} 
				}
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(283);
			match(NEWLINE);
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

	public static class DeatContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(GedcomParser.ONE, 0); }
		public TerminalNode WS() { return getToken(GedcomParser.WS, 0); }
		public TerminalNode DEAT() { return getToken(GedcomParser.DEAT, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public List<DateContext> date() {
			return getRuleContexts(DateContext.class);
		}
		public DateContext date(int i) {
			return getRuleContext(DateContext.class,i);
		}
		public List<PlacContext> plac() {
			return getRuleContexts(PlacContext.class);
		}
		public PlacContext plac(int i) {
			return getRuleContext(PlacContext.class,i);
		}
		public DeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitDeat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeatContext deat() throws RecognitionException {
		DeatContext _localctx = new DeatContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_deat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(ONE);
			setState(286);
			match(WS);
			setState(287);
			match(DEAT);
			setState(288);
			match(NEWLINE);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TWO) {
				{
				setState(291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(289);
					date();
					}
					break;
				case 2:
					{
					setState(290);
					plac();
					}
					break;
				}
				}
				setState(295);
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

	public static class BuriContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(GedcomParser.ONE, 0); }
		public TerminalNode WS() { return getToken(GedcomParser.WS, 0); }
		public TerminalNode BURI() { return getToken(GedcomParser.BURI, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public List<DateContext> date() {
			return getRuleContexts(DateContext.class);
		}
		public DateContext date(int i) {
			return getRuleContext(DateContext.class,i);
		}
		public List<PlacContext> plac() {
			return getRuleContexts(PlacContext.class);
		}
		public PlacContext plac(int i) {
			return getRuleContext(PlacContext.class,i);
		}
		public BuriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buri; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitBuri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuriContext buri() throws RecognitionException {
		BuriContext _localctx = new BuriContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_buri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(ONE);
			setState(297);
			match(WS);
			setState(298);
			match(BURI);
			setState(299);
			match(NEWLINE);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TWO) {
				{
				setState(302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(300);
					date();
					}
					break;
				case 2:
					{
					setState(301);
					plac();
					}
					break;
				}
				}
				setState(306);
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

	public static class FamcContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(GedcomParser.ONE, 0); }
		public List<TerminalNode> WS() { return getTokens(GedcomParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GedcomParser.WS, i);
		}
		public TerminalNode FAMC() { return getToken(GedcomParser.FAMC, 0); }
		public TerminalNode CODE() { return getToken(GedcomParser.CODE, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public FamcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_famc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitFamc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FamcContext famc() throws RecognitionException {
		FamcContext _localctx = new FamcContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_famc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(ONE);
			setState(308);
			match(WS);
			setState(309);
			match(FAMC);
			setState(310);
			match(WS);
			setState(311);
			match(CODE);
			setState(312);
			match(NEWLINE);
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

	public static class FamsContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(GedcomParser.ONE, 0); }
		public List<TerminalNode> WS() { return getTokens(GedcomParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GedcomParser.WS, i);
		}
		public TerminalNode FAMS() { return getToken(GedcomParser.FAMS, 0); }
		public TerminalNode CODE() { return getToken(GedcomParser.CODE, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public FamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fams; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitFams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FamsContext fams() throws RecognitionException {
		FamsContext _localctx = new FamsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(ONE);
			setState(315);
			match(WS);
			setState(316);
			match(FAMS);
			setState(317);
			match(WS);
			setState(318);
			match(CODE);
			setState(319);
			match(NEWLINE);
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

	public static class FamContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(GedcomParser.ZERO, 0); }
		public List<TerminalNode> WS() { return getTokens(GedcomParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GedcomParser.WS, i);
		}
		public TerminalNode CODE() { return getToken(GedcomParser.CODE, 0); }
		public TerminalNode FAM() { return getToken(GedcomParser.FAM, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public FamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fam; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitFam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FamContext fam() throws RecognitionException {
		FamContext _localctx = new FamContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(ZERO);
			setState(322);
			match(WS);
			setState(323);
			match(CODE);
			setState(324);
			match(WS);
			setState(325);
			match(FAM);
			setState(326);
			match(NEWLINE);
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

	public static class HusbContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(GedcomParser.ONE, 0); }
		public List<TerminalNode> WS() { return getTokens(GedcomParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GedcomParser.WS, i);
		}
		public TerminalNode HUSB() { return getToken(GedcomParser.HUSB, 0); }
		public TerminalNode CODE() { return getToken(GedcomParser.CODE, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public HusbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_husb; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitHusb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HusbContext husb() throws RecognitionException {
		HusbContext _localctx = new HusbContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_husb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(ONE);
			setState(329);
			match(WS);
			setState(330);
			match(HUSB);
			setState(331);
			match(WS);
			setState(332);
			match(CODE);
			setState(333);
			match(NEWLINE);
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

	public static class WifeContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(GedcomParser.ONE, 0); }
		public List<TerminalNode> WS() { return getTokens(GedcomParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GedcomParser.WS, i);
		}
		public TerminalNode WIFE() { return getToken(GedcomParser.WIFE, 0); }
		public TerminalNode CODE() { return getToken(GedcomParser.CODE, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public WifeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wife; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitWife(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WifeContext wife() throws RecognitionException {
		WifeContext _localctx = new WifeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_wife);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(ONE);
			setState(336);
			match(WS);
			setState(337);
			match(WIFE);
			setState(338);
			match(WS);
			setState(339);
			match(CODE);
			setState(340);
			match(NEWLINE);
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

	public static class ChilContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(GedcomParser.ONE, 0); }
		public List<TerminalNode> WS() { return getTokens(GedcomParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GedcomParser.WS, i);
		}
		public TerminalNode CHIL() { return getToken(GedcomParser.CHIL, 0); }
		public TerminalNode CODE() { return getToken(GedcomParser.CODE, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public ChilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chil; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitChil(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChilContext chil() throws RecognitionException {
		ChilContext _localctx = new ChilContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_chil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(ONE);
			setState(343);
			match(WS);
			setState(344);
			match(CHIL);
			setState(345);
			match(WS);
			setState(346);
			match(CODE);
			setState(347);
			match(NEWLINE);
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

	public static class MarrContext extends ParserRuleContext {
		public TerminalNode ONE() { return getToken(GedcomParser.ONE, 0); }
		public TerminalNode WS() { return getToken(GedcomParser.WS, 0); }
		public TerminalNode MARR() { return getToken(GedcomParser.MARR, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public List<DateContext> date() {
			return getRuleContexts(DateContext.class);
		}
		public DateContext date(int i) {
			return getRuleContext(DateContext.class,i);
		}
		public List<PlacContext> plac() {
			return getRuleContexts(PlacContext.class);
		}
		public PlacContext plac(int i) {
			return getRuleContext(PlacContext.class,i);
		}
		public MarrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_marr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitMarr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarrContext marr() throws RecognitionException {
		MarrContext _localctx = new MarrContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_marr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(ONE);
			setState(350);
			match(WS);
			setState(351);
			match(MARR);
			setState(352);
			match(NEWLINE);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TWO) {
				{
				setState(355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(353);
					date();
					}
					break;
				case 2:
					{
					setState(354);
					plac();
					}
					break;
				}
				}
				setState(359);
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

	public static class TrailerContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(GedcomParser.ZERO, 0); }
		public TerminalNode WS() { return getToken(GedcomParser.WS, 0); }
		public TerminalNode TRLR() { return getToken(GedcomParser.TRLR, 0); }
		public TerminalNode NEWLINE() { return getToken(GedcomParser.NEWLINE, 0); }
		public TrailerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trailer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitTrailer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrailerContext trailer() throws RecognitionException {
		TrailerContext _localctx = new TrailerContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_trailer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(ZERO);
			setState(361);
			match(WS);
			setState(362);
			match(TRLR);
			setState(363);
			match(NEWLINE);
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

	public static class CommandContext extends ParserRuleContext {
		public AnceContext ance() {
			return getRuleContext(AnceContext.class,0);
		}
		public DescContext desc() {
			return getRuleContext(DescContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(365);
				ance();
				}
				break;
			case 2:
				{
				setState(366);
				desc();
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

	public static class AnceContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(GedcomParser.ZERO, 0); }
		public List<TerminalNode> WS() { return getTokens(GedcomParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GedcomParser.WS, i);
		}
		public TerminalNode ANCE() { return getToken(GedcomParser.ANCE, 0); }
		public TerminalNode CODE() { return getToken(GedcomParser.CODE, 0); }
		public AnceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ance; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitAnce(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnceContext ance() throws RecognitionException {
		AnceContext _localctx = new AnceContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(ZERO);
			setState(370);
			match(WS);
			setState(371);
			match(ANCE);
			setState(372);
			match(WS);
			setState(373);
			match(CODE);
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

	public static class DescContext extends ParserRuleContext {
		public TerminalNode ZERO() { return getToken(GedcomParser.ZERO, 0); }
		public List<TerminalNode> WS() { return getTokens(GedcomParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(GedcomParser.WS, i);
		}
		public TerminalNode DESC() { return getToken(GedcomParser.DESC, 0); }
		public TerminalNode CODE() { return getToken(GedcomParser.CODE, 0); }
		public DescContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GedcomVisitor ) return ((GedcomVisitor<? extends T>)visitor).visitDesc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescContext desc() throws RecognitionException {
		DescContext _localctx = new DescContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_desc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(ZERO);
			setState(376);
			match(WS);
			setState(377);
			match(DESC);
			setState(378);
			match(WS);
			setState(379);
			match(CODE);
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
		"\u0004\u0001&\u017e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001P\b\u0001\n\u0001"+
		"\f\u0001S\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003_\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005m\b\u0005\n\u0005\f\u0005p\t\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005t\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006{\b\u0006\n\u0006\f\u0006~\t"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0082\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0090\b\b\n\b\f\b\u0093\t\b"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u009c"+
		"\b\t\n\t\f\t\u009f\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u00a5\b"+
		"\n\n\n\f\n\u00a8\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00b2\b\u000b\n"+
		"\u000b\f\u000b\u00b5\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u00bc\b\f\n\f\f\f\u00bf\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00cd\b\u000e\n\u000e\f\u000e\u00d0\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00d5\b\u000e\n\u000e\f\u000e\u00d8"+
		"\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u00df\b\u000f\n\u000f\f\u000f\u00e2\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010"+
		"\u00eb\b\u0010\n\u0010\f\u0010\u00ee\t\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u00ff\b\u0012\n\u0012\f\u0012\u0102\t\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0109\b\u0013"+
		"\n\u0013\f\u0013\u010c\t\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0110"+
		"\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0117\b\u0014\n\u0014\f\u0014\u011a\t\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u0124\b\u0015\n\u0015\f\u0015\u0127\t\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u012f"+
		"\b\u0016\n\u0016\f\u0016\u0132\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0164\b\u001d\n\u001d"+
		"\f\u001d\u0167\t\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u0170\b\u001f\u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\tn|\u0091\u009d\u00ce\u00e0\u00ec\u010a\u0118\u0000\""+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@B\u0000\u0001\u0001\u0000\u001f \u0185\u0000"+
		"D\u0001\u0000\u0000\u0000\u0002I\u0001\u0000\u0000\u0000\u0004T\u0001"+
		"\u0000\u0000\u0000\u0006Y\u0001\u0000\u0000\u0000\b`\u0001\u0000\u0000"+
		"\u0000\ng\u0001\u0000\u0000\u0000\fu\u0001\u0000\u0000\u0000\u000e\u0083"+
		"\u0001\u0000\u0000\u0000\u0010\u008a\u0001\u0000\u0000\u0000\u0012\u0096"+
		"\u0001\u0000\u0000\u0000\u0014\u00a6\u0001\u0000\u0000\u0000\u0016\u00a9"+
		"\u0001\u0000\u0000\u0000\u0018\u00b6\u0001\u0000\u0000\u0000\u001a\u00c0"+
		"\u0001\u0000\u0000\u0000\u001c\u00c7\u0001\u0000\u0000\u0000\u001e\u00d9"+
		"\u0001\u0000\u0000\u0000 \u00e5\u0001\u0000\u0000\u0000\"\u00f1\u0001"+
		"\u0000\u0000\u0000$\u00f8\u0001\u0000\u0000\u0000&\u0103\u0001\u0000\u0000"+
		"\u0000(\u0111\u0001\u0000\u0000\u0000*\u011d\u0001\u0000\u0000\u0000,"+
		"\u0128\u0001\u0000\u0000\u0000.\u0133\u0001\u0000\u0000\u00000\u013a\u0001"+
		"\u0000\u0000\u00002\u0141\u0001\u0000\u0000\u00004\u0148\u0001\u0000\u0000"+
		"\u00006\u014f\u0001\u0000\u0000\u00008\u0156\u0001\u0000\u0000\u0000:"+
		"\u015d\u0001\u0000\u0000\u0000<\u0168\u0001\u0000\u0000\u0000>\u016f\u0001"+
		"\u0000\u0000\u0000@\u0171\u0001\u0000\u0000\u0000B\u0177\u0001\u0000\u0000"+
		"\u0000DE\u0003\u0002\u0001\u0000EF\u0003\u0014\n\u0000FG\u0003<\u001e"+
		"\u0000GH\u0003>\u001f\u0000H\u0001\u0001\u0000\u0000\u0000IQ\u0003\u0004"+
		"\u0002\u0000JP\u0003\u0006\u0003\u0000KP\u0003\n\u0005\u0000LP\u0003\f"+
		"\u0006\u0000MP\u0003\u0010\b\u0000NP\u0003\u0012\t\u0000OJ\u0001\u0000"+
		"\u0000\u0000OK\u0001\u0000\u0000\u0000OL\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000R\u0003\u0001\u0000"+
		"\u0000\u0000SQ\u0001\u0000\u0000\u0000TU\u0005\u001c\u0000\u0000UV\u0005"+
		"$\u0000\u0000VW\u0005\u0001\u0000\u0000WX\u0005%\u0000\u0000X\u0005\u0001"+
		"\u0000\u0000\u0000YZ\u0005\u001d\u0000\u0000Z[\u0005$\u0000\u0000[\\\u0005"+
		"\u0002\u0000\u0000\\^\u0005%\u0000\u0000]_\u0003\b\u0004\u0000^]\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0007\u0001\u0000\u0000"+
		"\u0000`a\u0005\u001e\u0000\u0000ab\u0005$\u0000\u0000bc\u0005\u0003\u0000"+
		"\u0000cd\u0005$\u0000\u0000de\u0005#\u0000\u0000ef\u0005%\u0000\u0000"+
		"f\t\u0001\u0000\u0000\u0000gh\u0005\u001d\u0000\u0000hi\u0005$\u0000\u0000"+
		"ij\u0005\u0004\u0000\u0000jn\u0005$\u0000\u0000km\t\u0000\u0000\u0000"+
		"lk\u0001\u0000\u0000\u0000mp\u0001\u0000\u0000\u0000no\u0001\u0000\u0000"+
		"\u0000nl\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pn\u0001\u0000"+
		"\u0000\u0000qs\u0005%\u0000\u0000rt\u0003\b\u0004\u0000sr\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000t\u000b\u0001\u0000\u0000\u0000"+
		"uv\u0005\u001d\u0000\u0000vw\u0005$\u0000\u0000wx\u0005\u000e\u0000\u0000"+
		"x|\u0005$\u0000\u0000y{\t\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000"+
		"{~\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f"+
		"\u0081\u0005%\u0000\u0000\u0080\u0082\u0003\u000e\u0007\u0000\u0081\u0080"+
		"\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\r\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005\u001e\u0000\u0000\u0084\u0085\u0005"+
		"$\u0000\u0000\u0085\u0086\u0005\u0005\u0000\u0000\u0086\u0087\u0005$\u0000"+
		"\u0000\u0087\u0088\u0005\"\u0000\u0000\u0088\u0089\u0005%\u0000\u0000"+
		"\u0089\u000f\u0001\u0000\u0000\u0000\u008a\u008b\u0005\u001d\u0000\u0000"+
		"\u008b\u008c\u0005$\u0000\u0000\u008c\u008d\u0005\u0006\u0000\u0000\u008d"+
		"\u0091\u0005$\u0000\u0000\u008e\u0090\t\u0000\u0000\u0000\u008f\u008e"+
		"\u0001\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0094"+
		"\u0001\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0005%\u0000\u0000\u0095\u0011\u0001\u0000\u0000\u0000\u0096\u0097\u0005"+
		"\u001d\u0000\u0000\u0097\u0098\u0005$\u0000\u0000\u0098\u0099\u0005\u0007"+
		"\u0000\u0000\u0099\u009d\u0005$\u0000\u0000\u009a\u009c\t\u0000\u0000"+
		"\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0005%\u0000\u0000\u00a1\u0013\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a5\u0003\u0016\u000b\u0000\u00a3\u00a5\u0003\u0018\f\u0000\u00a4"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a7\u0015\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a9\u00b3\u0003\u001a\r\u0000\u00aa\u00b2"+
		"\u0003\u001c\u000e\u0000\u00ab\u00b2\u0003\"\u0011\u0000\u00ac\u00b2\u0003"+
		"$\u0012\u0000\u00ad\u00b2\u0003*\u0015\u0000\u00ae\u00b2\u0003,\u0016"+
		"\u0000\u00af\u00b2\u0003.\u0017\u0000\u00b0\u00b2\u00030\u0018\u0000\u00b1"+
		"\u00aa\u0001\u0000\u0000\u0000\u00b1\u00ab\u0001\u0000\u0000\u0000\u00b1"+
		"\u00ac\u0001\u0000\u0000\u0000\u00b1\u00ad\u0001\u0000\u0000\u0000\u00b1"+
		"\u00ae\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4"+
		"\u0017\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6"+
		"\u00bd\u00032\u0019\u0000\u00b7\u00bc\u00034\u001a\u0000\u00b8\u00bc\u0003"+
		"6\u001b\u0000\u00b9\u00bc\u00038\u001c\u0000\u00ba\u00bc\u0003:\u001d"+
		"\u0000\u00bb\u00b7\u0001\u0000\u0000\u0000\u00bb\u00b8\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00ba\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u0019\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u001c\u0000"+
		"\u0000\u00c1\u00c2\u0005$\u0000\u0000\u00c2\u00c3\u0005!\u0000\u0000\u00c3"+
		"\u00c4\u0005$\u0000\u0000\u00c4\u00c5\u0005\b\u0000\u0000\u00c5\u00c6"+
		"\u0005%\u0000\u0000\u00c6\u001b\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005"+
		"\u001d\u0000\u0000\u00c8\u00c9\u0005$\u0000\u0000\u00c9\u00ca\u0005\t"+
		"\u0000\u0000\u00ca\u00ce\u0005$\u0000\u0000\u00cb\u00cd\t\u0000\u0000"+
		"\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cd\u00d0\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d6\u0005%\u0000\u0000\u00d2\u00d5\u0003\u001e\u000f\u0000"+
		"\u00d3\u00d5\u0003 \u0010\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4"+
		"\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000\u00d7"+
		"\u001d\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0005\u001e\u0000\u0000\u00da\u00db\u0005$\u0000\u0000\u00db\u00dc"+
		"\u0005\n\u0000\u0000\u00dc\u00e0\u0005$\u0000\u0000\u00dd\u00df\t\u0000"+
		"\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e3\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\u0005%\u0000\u0000\u00e4\u001f\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0005\u001e\u0000\u0000\u00e6\u00e7\u0005$\u0000\u0000"+
		"\u00e7\u00e8\u0005\u000b\u0000\u0000\u00e8\u00ec\u0005$\u0000\u0000\u00e9"+
		"\u00eb\t\u0000\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ee"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ec\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00ec"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005%\u0000\u0000\u00f0!\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0005\u001d\u0000\u0000\u00f2\u00f3\u0005$\u0000"+
		"\u0000\u00f3\u00f4\u0005\f\u0000\u0000\u00f4\u00f5\u0005$\u0000\u0000"+
		"\u00f5\u00f6\u0007\u0000\u0000\u0000\u00f6\u00f7\u0005%\u0000\u0000\u00f7"+
		"#\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u001d\u0000\u0000\u00f9\u00fa"+
		"\u0005$\u0000\u0000\u00fa\u00fb\u0005\r\u0000\u0000\u00fb\u0100\u0005"+
		"%\u0000\u0000\u00fc\u00ff\u0003&\u0013\u0000\u00fd\u00ff\u0003(\u0014"+
		"\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000"+
		"\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101%\u0001\u0000\u0000\u0000"+
		"\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u001e\u0000\u0000"+
		"\u0104\u0105\u0005$\u0000\u0000\u0105\u0106\u0005\u000e\u0000\u0000\u0106"+
		"\u010a\u0005$\u0000\u0000\u0107\u0109\t\u0000\u0000\u0000\u0108\u0107"+
		"\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010d"+
		"\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u010f"+
		"\u0005%\u0000\u0000\u010e\u0110\u0003\u000e\u0007\u0000\u010f\u010e\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\'\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0005\u001e\u0000\u0000\u0112\u0113\u0005$\u0000"+
		"\u0000\u0113\u0114\u0005\u000f\u0000\u0000\u0114\u0118\u0005$\u0000\u0000"+
		"\u0115\u0117\t\u0000\u0000\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117"+
		"\u011a\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0118"+
		"\u0116\u0001\u0000\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a"+
		"\u0118\u0001\u0000\u0000\u0000\u011b\u011c\u0005%\u0000\u0000\u011c)\u0001"+
		"\u0000\u0000\u0000\u011d\u011e\u0005\u001d\u0000\u0000\u011e\u011f\u0005"+
		"$\u0000\u0000\u011f\u0120\u0005\u0010\u0000\u0000\u0120\u0125\u0005%\u0000"+
		"\u0000\u0121\u0124\u0003&\u0013\u0000\u0122\u0124\u0003(\u0014\u0000\u0123"+
		"\u0121\u0001\u0000\u0000\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0124"+
		"\u0127\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0001\u0000\u0000\u0000\u0126+\u0001\u0000\u0000\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0128\u0129\u0005\u001d\u0000\u0000\u0129\u012a"+
		"\u0005$\u0000\u0000\u012a\u012b\u0005\u0011\u0000\u0000\u012b\u0130\u0005"+
		"%\u0000\u0000\u012c\u012f\u0003&\u0013\u0000\u012d\u012f\u0003(\u0014"+
		"\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012d\u0001\u0000\u0000"+
		"\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131-\u0001\u0000\u0000\u0000"+
		"\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0134\u0005\u001d\u0000\u0000"+
		"\u0134\u0135\u0005$\u0000\u0000\u0135\u0136\u0005\u0012\u0000\u0000\u0136"+
		"\u0137\u0005$\u0000\u0000\u0137\u0138\u0005!\u0000\u0000\u0138\u0139\u0005"+
		"%\u0000\u0000\u0139/\u0001\u0000\u0000\u0000\u013a\u013b\u0005\u001d\u0000"+
		"\u0000\u013b\u013c\u0005$\u0000\u0000\u013c\u013d\u0005\u0013\u0000\u0000"+
		"\u013d\u013e\u0005$\u0000\u0000\u013e\u013f\u0005!\u0000\u0000\u013f\u0140"+
		"\u0005%\u0000\u0000\u01401\u0001\u0000\u0000\u0000\u0141\u0142\u0005\u001c"+
		"\u0000\u0000\u0142\u0143\u0005$\u0000\u0000\u0143\u0144\u0005!\u0000\u0000"+
		"\u0144\u0145\u0005$\u0000\u0000\u0145\u0146\u0005\u0014\u0000\u0000\u0146"+
		"\u0147\u0005%\u0000\u0000\u01473\u0001\u0000\u0000\u0000\u0148\u0149\u0005"+
		"\u001d\u0000\u0000\u0149\u014a\u0005$\u0000\u0000\u014a\u014b\u0005\u0015"+
		"\u0000\u0000\u014b\u014c\u0005$\u0000\u0000\u014c\u014d\u0005!\u0000\u0000"+
		"\u014d\u014e\u0005%\u0000\u0000\u014e5\u0001\u0000\u0000\u0000\u014f\u0150"+
		"\u0005\u001d\u0000\u0000\u0150\u0151\u0005$\u0000\u0000\u0151\u0152\u0005"+
		"\u0016\u0000\u0000\u0152\u0153\u0005$\u0000\u0000\u0153\u0154\u0005!\u0000"+
		"\u0000\u0154\u0155\u0005%\u0000\u0000\u01557\u0001\u0000\u0000\u0000\u0156"+
		"\u0157\u0005\u001d\u0000\u0000\u0157\u0158\u0005$\u0000\u0000\u0158\u0159"+
		"\u0005\u0017\u0000\u0000\u0159\u015a\u0005$\u0000\u0000\u015a\u015b\u0005"+
		"!\u0000\u0000\u015b\u015c\u0005%\u0000\u0000\u015c9\u0001\u0000\u0000"+
		"\u0000\u015d\u015e\u0005\u001d\u0000\u0000\u015e\u015f\u0005$\u0000\u0000"+
		"\u015f\u0160\u0005\u0018\u0000\u0000\u0160\u0165\u0005%\u0000\u0000\u0161"+
		"\u0164\u0003&\u0013\u0000\u0162\u0164\u0003(\u0014\u0000\u0163\u0161\u0001"+
		"\u0000\u0000\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0164\u0167\u0001"+
		"\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0166\u0001"+
		"\u0000\u0000\u0000\u0166;\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\u0005\u001c\u0000\u0000\u0169\u016a\u0005$\u0000"+
		"\u0000\u016a\u016b\u0005\u0019\u0000\u0000\u016b\u016c\u0005%\u0000\u0000"+
		"\u016c=\u0001\u0000\u0000\u0000\u016d\u0170\u0003@ \u0000\u016e\u0170"+
		"\u0003B!\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u016e\u0001\u0000"+
		"\u0000\u0000\u0170?\u0001\u0000\u0000\u0000\u0171\u0172\u0005\u001c\u0000"+
		"\u0000\u0172\u0173\u0005$\u0000\u0000\u0173\u0174\u0005\u001a\u0000\u0000"+
		"\u0174\u0175\u0005$\u0000\u0000\u0175\u0176\u0005!\u0000\u0000\u0176A"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\u0005\u001c\u0000\u0000\u0178\u0179"+
		"\u0005$\u0000\u0000\u0179\u017a\u0005\u001b\u0000\u0000\u017a\u017b\u0005"+
		"$\u0000\u0000\u017b\u017c\u0005!\u0000\u0000\u017cC\u0001\u0000\u0000"+
		"\u0000 OQ^ns|\u0081\u0091\u009d\u00a4\u00a6\u00b1\u00b3\u00bb\u00bd\u00ce"+
		"\u00d4\u00d6\u00e0\u00ec\u00fe\u0100\u010a\u010f\u0118\u0123\u0125\u012e"+
		"\u0130\u0163\u0165\u016f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}