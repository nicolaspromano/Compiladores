// Generated from GramaticaGYH.g4 by ANTLR 4.4

    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaGYHParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		PC=17, OpArit=18, OpRel=19, OpBoolE=20, OpBoolOu=21, Delim=22, Atrib=23, 
		AbrePar=24, FechaPar=25, Var=26, NumInt=27, NumReal=28, Cadeia=29, Espaco=30, 
		Coment=31;
	public static final String[] tokenNames = {
		"<INVALID>", "'/'", "'SE'", "'LER'", "'PROG'", "'IMPRIMIR'", "'INT'", 
		"'ENTAO'", "'REAL'", "'INI'", "'ENQTO'", "'DEC'", "'*'", "'+'", "'FIM'", 
		"'SENAO'", "'-'", "PC", "OpArit", "OpRel", "'E'", "'OU'", "':'", "':='", 
		"'('", "')'", "Var", "NumInt", "NumReal", "Cadeia", "Espaco", "Coment"
	};
	public static final int
		RULE_programa = 0, RULE_listaDeclaracoes = 1, RULE_listaComandos = 2, 
		RULE_tabelaDeclaracoes = 3, RULE_declaracao = 4, RULE_tipoVar = 5, RULE_expressaoAritmetica = 6, 
		RULE_expressaoAritmeticaAux = 7, RULE_termoAritmetico = 8, RULE_termoAritmeticoAux = 9, 
		RULE_fatorAritmetico = 10, RULE_expressaoRelacional = 11, RULE_expressaoRelacionalAux = 12, 
		RULE_termoRelacional = 13, RULE_operadorBooleano = 14, RULE_tabelaComandos = 15, 
		RULE_comando = 16, RULE_comandoAtribuicao = 17, RULE_comandoEntrada = 18, 
		RULE_comandoSaidaAux = 19, RULE_comandoSaida = 20, RULE_comandoCondicao = 21, 
		RULE_comandoCondicaoAux = 22, RULE_comandoRepeticao = 23, RULE_subAlgoritmo = 24;
	public static final String[] ruleNames = {
		"programa", "listaDeclaracoes", "listaComandos", "tabelaDeclaracoes", 
		"declaracao", "tipoVar", "expressaoAritmetica", "expressaoAritmeticaAux", 
		"termoAritmetico", "termoAritmeticoAux", "fatorAritmetico", "expressaoRelacional", 
		"expressaoRelacionalAux", "termoRelacional", "operadorBooleano", "tabelaComandos", 
		"comando", "comandoAtribuicao", "comandoEntrada", "comandoSaidaAux", "comandoSaida", 
		"comandoCondicao", "comandoCondicaoAux", "comandoRepeticao", "subAlgoritmo"
	};

	@Override
	public String getGrammarFileName() { return "GramaticaGYH.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private int qtdDecl = 0;
	    private int qtdCmd = 0;
	    private int qtdAtrib = 0;
	    private int qtdEntrada = 0;
	    private int qtdSaida = 0;
	    private int qtdCond = 0;
	    private int qtdRept = 0;
	    private int qtdSubAlg = 0;
	    
	    private TabelaSimbolos tabela = new TabelaSimbolos ();
	    
	    private String _writeVar;
	    private ArrayList<Command> listCmd= new ArrayList<Command>();
	    private GyhProgram programa = new GyhProgram();
	    
	      public void generateCommand(){
	          programa.generateTarget();
	          System.out.println("\n\n Gerando codigo");
	          }
	    

	public GramaticaGYHParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public ListaDeclaracoesContext listaDeclaracoes() {
			return getRuleContext(ListaDeclaracoesContext.class,0);
		}
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public TerminalNode Delim(int i) {
			return getToken(GramaticaGYHParser.Delim, i);
		}
		public List<TerminalNode> Delim() { return getTokens(GramaticaGYHParser.Delim); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(Delim);
			setState(51); match(T__5);
			setState(52); listaDeclaracoes();
			setState(53); match(Delim);
			setState(54); match(T__12);
			setState(55); listaComandos();
			 
			      	  System.out.println("\n ");
			          System.out.println("Declaracoes: " + qtdDecl);
			          System.out.println("Total de comando: " + qtdCmd);
			          System.out.println("   - Atribuicoes: " + qtdAtrib);
			          System.out.println("   - Entradas: " + qtdEntrada);
			          System.out.println("   - Saidas: " + qtdSaida);
			          System.out.println("   - Condicoes: " + qtdCond);
			          System.out.println("   - Repeticoes: " + qtdRept);
			          System.out.println("   - Subalgoritmos: " + qtdSubAlg);
			          System.out.println("\n ");
			          
			       
			                
			      
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

	public static class ListaDeclaracoesContext extends ParserRuleContext {
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public ListaDeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDeclaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterListaDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitListaDeclaracoes(this);
		}
	}

	public final ListaDeclaracoesContext listaDeclaracoes() throws RecognitionException {
		ListaDeclaracoesContext _localctx = new ListaDeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listaDeclaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Var) {
				{
				{
				setState(58); declaracao();
				 qtdDecl++; 
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

	public static class ListaComandosContext extends ParserRuleContext {
		public ComandoContext comando(int i) {
			return getRuleContext(ComandoContext.class,i);
		}
		public List<ComandoContext> comando() {
			return getRuleContexts(ComandoContext.class);
		}
		public ListaComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaComandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterListaComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitListaComandos(this);
		}
	}

	public final ListaComandosContext listaComandos() throws RecognitionException {
		ListaComandosContext _localctx = new ListaComandosContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listaComandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__13) | (1L << T__11) | (1L << T__7) | (1L << T__6) | (1L << Var))) != 0)) {
				{
				{
				setState(66); comando();
				 qtdCmd++; 
				}
				}
				setState(73);
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

	public static class TabelaDeclaracoesContext extends ParserRuleContext {
		public ListaDeclaracoesContext listaDeclaracoes() {
			return getRuleContext(ListaDeclaracoesContext.class,0);
		}
		public TabelaDeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabelaDeclaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterTabelaDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitTabelaDeclaracoes(this);
		}
	}

	public final TabelaDeclaracoesContext tabelaDeclaracoes() throws RecognitionException {
		TabelaDeclaracoesContext _localctx = new TabelaDeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tabelaDeclaracoes);
		try {
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); listaDeclaracoes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public TipoVarContext tipoVar() {
			return getRuleContext(TipoVarContext.class,0);
		}
		public TerminalNode Var() { return getToken(GramaticaGYHParser.Var, 0); }
		public TerminalNode Delim() { return getToken(GramaticaGYHParser.Delim, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(Var);
			setState(79); match(Delim);
			setState(80); tipoVar();
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

	public static class TipoVarContext extends ParserRuleContext {
		public TipoVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterTipoVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitTipoVar(this);
		}
	}

	public final TipoVarContext tipoVar() throws RecognitionException {
		TipoVarContext _localctx = new TipoVarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipoVar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !(_la==T__10 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public ExpressaoAritmeticaAuxContext expressaoAritmeticaAux() {
			return getRuleContext(ExpressaoAritmeticaAuxContext.class,0);
		}
		public TermoAritmeticoContext termoAritmetico() {
			return getRuleContext(TermoAritmeticoContext.class,0);
		}
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterExpressaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitExpressaoAritmetica(this);
		}
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expressaoAritmetica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); termoAritmetico();
			setState(85); expressaoAritmeticaAux();
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

	public static class ExpressaoAritmeticaAuxContext extends ParserRuleContext {
		public ExpressaoAritmeticaAuxContext expressaoAritmeticaAux() {
			return getRuleContext(ExpressaoAritmeticaAuxContext.class,0);
		}
		public TermoAritmeticoContext termoAritmetico() {
			return getRuleContext(TermoAritmeticoContext.class,0);
		}
		public ExpressaoAritmeticaAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmeticaAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterExpressaoAritmeticaAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitExpressaoAritmeticaAux(this);
		}
	}

	public final ExpressaoAritmeticaAuxContext expressaoAritmeticaAux() throws RecognitionException {
		ExpressaoAritmeticaAuxContext _localctx = new ExpressaoAritmeticaAuxContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expressaoAritmeticaAux);
		try {
			setState(96);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(87); match(T__3);
				setState(88); termoAritmetico();
				setState(89); expressaoAritmeticaAux();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(91); match(T__0);
				setState(92); termoAritmetico();
				setState(93); expressaoAritmeticaAux();
				}
				break;
			case EOF:
			case T__14:
			case T__13:
			case T__11:
			case T__9:
			case T__7:
			case T__6:
			case T__2:
			case T__1:
			case OpRel:
			case OpBoolE:
			case OpBoolOu:
			case FechaPar:
			case Var:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class TermoAritmeticoContext extends ParserRuleContext {
		public TermoAritmeticoAuxContext termoAritmeticoAux() {
			return getRuleContext(TermoAritmeticoAuxContext.class,0);
		}
		public FatorAritmeticoContext fatorAritmetico() {
			return getRuleContext(FatorAritmeticoContext.class,0);
		}
		public TermoAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoAritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterTermoAritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitTermoAritmetico(this);
		}
	}

	public final TermoAritmeticoContext termoAritmetico() throws RecognitionException {
		TermoAritmeticoContext _localctx = new TermoAritmeticoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_termoAritmetico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98); fatorAritmetico();
			setState(99); termoAritmeticoAux();
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

	public static class TermoAritmeticoAuxContext extends ParserRuleContext {
		public TermoAritmeticoAuxContext termoAritmeticoAux() {
			return getRuleContext(TermoAritmeticoAuxContext.class,0);
		}
		public FatorAritmeticoContext fatorAritmetico() {
			return getRuleContext(FatorAritmeticoContext.class,0);
		}
		public TermoAritmeticoAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoAritmeticoAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterTermoAritmeticoAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitTermoAritmeticoAux(this);
		}
	}

	public final TermoAritmeticoAuxContext termoAritmeticoAux() throws RecognitionException {
		TermoAritmeticoAuxContext _localctx = new TermoAritmeticoAuxContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_termoAritmeticoAux);
		try {
			setState(110);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); match(T__4);
				setState(102); fatorAritmetico();
				setState(103); termoAritmeticoAux();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(105); match(T__15);
				setState(106); fatorAritmetico();
				setState(107); termoAritmeticoAux();
				}
				break;
			case EOF:
			case T__14:
			case T__13:
			case T__11:
			case T__9:
			case T__7:
			case T__6:
			case T__3:
			case T__2:
			case T__1:
			case T__0:
			case OpRel:
			case OpBoolE:
			case OpBoolOu:
			case FechaPar:
			case Var:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class FatorAritmeticoContext extends ParserRuleContext {
		public TerminalNode NumInt() { return getToken(GramaticaGYHParser.NumInt, 0); }
		public TerminalNode NumReal() { return getToken(GramaticaGYHParser.NumReal, 0); }
		public TerminalNode FechaPar() { return getToken(GramaticaGYHParser.FechaPar, 0); }
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode AbrePar() { return getToken(GramaticaGYHParser.AbrePar, 0); }
		public TerminalNode Var() { return getToken(GramaticaGYHParser.Var, 0); }
		public FatorAritmeticoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fatorAritmetico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterFatorAritmetico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitFatorAritmetico(this);
		}
	}

	public final FatorAritmeticoContext fatorAritmetico() throws RecognitionException {
		FatorAritmeticoContext _localctx = new FatorAritmeticoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fatorAritmetico);
		try {
			setState(119);
			switch (_input.LA(1)) {
			case NumInt:
				enterOuterAlt(_localctx, 1);
				{
				setState(112); match(NumInt);
				}
				break;
			case NumReal:
				enterOuterAlt(_localctx, 2);
				{
				setState(113); match(NumReal);
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 3);
				{
				setState(114); match(Var);
				}
				break;
			case AbrePar:
				enterOuterAlt(_localctx, 4);
				{
				setState(115); match(AbrePar);
				setState(116); expressaoAritmetica();
				setState(117); match(FechaPar);
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

	public static class ExpressaoRelacionalContext extends ParserRuleContext {
		public TermoRelacionalContext termoRelacional() {
			return getRuleContext(TermoRelacionalContext.class,0);
		}
		public ExpressaoRelacionalAuxContext expressaoRelacionalAux() {
			return getRuleContext(ExpressaoRelacionalAuxContext.class,0);
		}
		public ExpressaoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterExpressaoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitExpressaoRelacional(this);
		}
	}

	public final ExpressaoRelacionalContext expressaoRelacional() throws RecognitionException {
		ExpressaoRelacionalContext _localctx = new ExpressaoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressaoRelacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); termoRelacional();
			setState(122); expressaoRelacionalAux();
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

	public static class ExpressaoRelacionalAuxContext extends ParserRuleContext {
		public OperadorBooleanoContext operadorBooleano() {
			return getRuleContext(OperadorBooleanoContext.class,0);
		}
		public TermoRelacionalContext termoRelacional() {
			return getRuleContext(TermoRelacionalContext.class,0);
		}
		public ExpressaoRelacionalAuxContext expressaoRelacionalAux() {
			return getRuleContext(ExpressaoRelacionalAuxContext.class,0);
		}
		public ExpressaoRelacionalAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoRelacionalAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterExpressaoRelacionalAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitExpressaoRelacionalAux(this);
		}
	}

	public final ExpressaoRelacionalAuxContext expressaoRelacionalAux() throws RecognitionException {
		ExpressaoRelacionalAuxContext _localctx = new ExpressaoRelacionalAuxContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expressaoRelacionalAux);
		try {
			setState(129);
			switch (_input.LA(1)) {
			case OpBoolE:
			case OpBoolOu:
				enterOuterAlt(_localctx, 1);
				{
				setState(124); operadorBooleano();
				setState(125); termoRelacional();
				setState(126); expressaoRelacionalAux();
				}
				break;
			case T__14:
			case T__13:
			case T__11:
			case T__9:
			case T__7:
			case T__6:
			case FechaPar:
			case Var:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class TermoRelacionalContext extends ParserRuleContext {
		public ExpressaoAritmeticaContext expressaoAritmetica(int i) {
			return getRuleContext(ExpressaoAritmeticaContext.class,i);
		}
		public TerminalNode FechaPar() { return getToken(GramaticaGYHParser.FechaPar, 0); }
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public List<ExpressaoAritmeticaContext> expressaoAritmetica() {
			return getRuleContexts(ExpressaoAritmeticaContext.class);
		}
		public TerminalNode OpRel() { return getToken(GramaticaGYHParser.OpRel, 0); }
		public TerminalNode AbrePar() { return getToken(GramaticaGYHParser.AbrePar, 0); }
		public TermoRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterTermoRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitTermoRelacional(this);
		}
	}

	public final TermoRelacionalContext termoRelacional() throws RecognitionException {
		TermoRelacionalContext _localctx = new TermoRelacionalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_termoRelacional);
		try {
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131); expressaoAritmetica();
				setState(132); match(OpRel);
				setState(133); expressaoAritmetica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135); match(AbrePar);
				setState(136); expressaoRelacional();
				setState(137); match(FechaPar);
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

	public static class OperadorBooleanoContext extends ParserRuleContext {
		public TerminalNode OpBoolE() { return getToken(GramaticaGYHParser.OpBoolE, 0); }
		public TerminalNode OpBoolOu() { return getToken(GramaticaGYHParser.OpBoolOu, 0); }
		public OperadorBooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorBooleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterOperadorBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitOperadorBooleano(this);
		}
	}

	public final OperadorBooleanoContext operadorBooleano() throws RecognitionException {
		OperadorBooleanoContext _localctx = new OperadorBooleanoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_operadorBooleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			_la = _input.LA(1);
			if ( !(_la==OpBoolE || _la==OpBoolOu) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class TabelaComandosContext extends ParserRuleContext {
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public TabelaComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabelaComandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterTabelaComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitTabelaComandos(this);
		}
	}

	public final TabelaComandosContext tabelaComandos() throws RecognitionException {
		TabelaComandosContext _localctx = new TabelaComandosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tabelaComandos);
		try {
			setState(145);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143); listaComandos();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ComandoContext extends ParserRuleContext {
		public ComandoAtribuicaoContext comandoAtribuicao() {
			return getRuleContext(ComandoAtribuicaoContext.class,0);
		}
		public ComandoEntradaContext comandoEntrada() {
			return getRuleContext(ComandoEntradaContext.class,0);
		}
		public ComandoRepeticaoContext comandoRepeticao() {
			return getRuleContext(ComandoRepeticaoContext.class,0);
		}
		public ComandoSaidaContext comandoSaida() {
			return getRuleContext(ComandoSaidaContext.class,0);
		}
		public ComandoCondicaoContext comandoCondicao() {
			return getRuleContext(ComandoCondicaoContext.class,0);
		}
		public SubAlgoritmoContext subAlgoritmo() {
			return getRuleContext(SubAlgoritmoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_comando);
		try {
			setState(153);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(147); comandoAtribuicao();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(148); comandoEntrada();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(149); comandoSaida();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 4);
				{
				setState(150); comandoCondicao();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 5);
				{
				setState(151); comandoRepeticao();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 6);
				{
				setState(152); subAlgoritmo();
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

	public static class ComandoAtribuicaoContext extends ParserRuleContext {
		public TerminalNode Atrib() { return getToken(GramaticaGYHParser.Atrib, 0); }
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode Var() { return getToken(GramaticaGYHParser.Var, 0); }
		public ComandoAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterComandoAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitComandoAtribuicao(this);
		}
	}

	public final ComandoAtribuicaoContext comandoAtribuicao() throws RecognitionException {
		ComandoAtribuicaoContext _localctx = new ComandoAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comandoAtribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(Var);
			setState(156); match(Atrib);
			setState(157); expressaoAritmetica();
			 
			    qtdAtrib++; 

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

	public static class ComandoEntradaContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(GramaticaGYHParser.Var, 0); }
		public ComandoEntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoEntrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterComandoEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitComandoEntrada(this);
		}
	}

	public final ComandoEntradaContext comandoEntrada() throws RecognitionException {
		ComandoEntradaContext _localctx = new ComandoEntradaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comandoEntrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(T__13);
			setState(161); match(Var);
			 
			    qtdEntrada++; 

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

	public static class ComandoSaidaAuxContext extends ParserRuleContext {
		public TerminalNode Cadeia() { return getToken(GramaticaGYHParser.Cadeia, 0); }
		public TerminalNode Var() { return getToken(GramaticaGYHParser.Var, 0); }
		public ComandoSaidaAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoSaidaAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterComandoSaidaAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitComandoSaidaAux(this);
		}
	}

	public final ComandoSaidaAuxContext comandoSaidaAux() throws RecognitionException {
		ComandoSaidaAuxContext _localctx = new ComandoSaidaAuxContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comandoSaidaAux);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !(_la==Var || _la==Cadeia) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ComandoSaidaContext extends ParserRuleContext {
		public ComandoSaidaAuxContext comandoSaidaAux() {
			return getRuleContext(ComandoSaidaAuxContext.class,0);
		}
		public TerminalNode Espaco() { return getToken(GramaticaGYHParser.Espaco, 0); }
		public ComandoSaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoSaida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterComandoSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitComandoSaida(this);
		}
	}

	public final ComandoSaidaContext comandoSaida() throws RecognitionException {
		ComandoSaidaContext _localctx = new ComandoSaidaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_comandoSaida);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(T__11);
			setState(168);
			_la = _input.LA(1);
			if (_la==Espaco) {
				{
				setState(167); match(Espaco);
				}
			}

			setState(170); comandoSaidaAux();
			 
			    qtdSaida++; 
			    

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

	public static class ComandoCondicaoContext extends ParserRuleContext {
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public ComandoCondicaoAuxContext comandoCondicaoAux() {
			return getRuleContext(ComandoCondicaoAuxContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandoCondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoCondicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterComandoCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitComandoCondicao(this);
		}
	}

	public final ComandoCondicaoContext comandoCondicao() throws RecognitionException {
		ComandoCondicaoContext _localctx = new ComandoCondicaoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comandoCondicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); match(T__14);
			setState(174); expressaoRelacional();
			setState(175); match(T__9);
			setState(176); comando();
			setState(177); comandoCondicaoAux();
			 
			    qtdCond++; 

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

	public static class ComandoCondicaoAuxContext extends ParserRuleContext {
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandoCondicaoAuxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoCondicaoAux; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterComandoCondicaoAux(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitComandoCondicaoAux(this);
		}
	}

	public final ComandoCondicaoAuxContext comandoCondicaoAux() throws RecognitionException {
		ComandoCondicaoAuxContext _localctx = new ComandoCondicaoAuxContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_comandoCondicaoAux);
		try {
			setState(183);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180); match(T__1);
				setState(181); comando();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ComandoRepeticaoContext extends ParserRuleContext {
		public ExpressaoRelacionalContext expressaoRelacional() {
			return getRuleContext(ExpressaoRelacionalContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public ComandoRepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandoRepeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterComandoRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitComandoRepeticao(this);
		}
	}

	public final ComandoRepeticaoContext comandoRepeticao() throws RecognitionException {
		ComandoRepeticaoContext _localctx = new ComandoRepeticaoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comandoRepeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); match(T__6);
			setState(186); expressaoRelacional();
			setState(187); comando();
			 
			    qtdRept++; 

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

	public static class SubAlgoritmoContext extends ParserRuleContext {
		public ListaComandosContext listaComandos() {
			return getRuleContext(ListaComandosContext.class,0);
		}
		public SubAlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subAlgoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).enterSubAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaGYHListener ) ((GramaticaGYHListener)listener).exitSubAlgoritmo(this);
		}
	}

	public final SubAlgoritmoContext subAlgoritmo() throws RecognitionException {
		SubAlgoritmoContext _localctx = new SubAlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_subAlgoritmo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); match(T__7);
			setState(191); listaComandos();
			setState(192); match(T__2);
			 
			    qtdSubAlg++; 

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3!\u00c6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3@\n\3\f\3\16"+
		"\3C\13\3\3\4\3\4\3\4\7\4H\n\4\f\4\16\4K\13\4\3\5\3\5\5\5O\n\5\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tc"+
		"\n\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13q\n"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\fz\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u0084\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u008e\n\17\3\20\3\20\3\21\3\21\5\21\u0094\n\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\5\22\u009c\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\5\26\u00ab\n\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u00ba\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\2\5\4\2\b\b\n\n\3\2\26\27\4\2\34\34\37\37\u00c0"+
		"\2\64\3\2\2\2\4A\3\2\2\2\6I\3\2\2\2\bN\3\2\2\2\nP\3\2\2\2\fT\3\2\2\2\16"+
		"V\3\2\2\2\20b\3\2\2\2\22d\3\2\2\2\24p\3\2\2\2\26y\3\2\2\2\30{\3\2\2\2"+
		"\32\u0083\3\2\2\2\34\u008d\3\2\2\2\36\u008f\3\2\2\2 \u0093\3\2\2\2\"\u009b"+
		"\3\2\2\2$\u009d\3\2\2\2&\u00a2\3\2\2\2(\u00a6\3\2\2\2*\u00a8\3\2\2\2,"+
		"\u00af\3\2\2\2.\u00b9\3\2\2\2\60\u00bb\3\2\2\2\62\u00c0\3\2\2\2\64\65"+
		"\7\30\2\2\65\66\7\r\2\2\66\67\5\4\3\2\678\7\30\2\289\7\6\2\29:\5\6\4\2"+
		":;\b\2\1\2;\3\3\2\2\2<=\5\n\6\2=>\b\3\1\2>@\3\2\2\2?<\3\2\2\2@C\3\2\2"+
		"\2A?\3\2\2\2AB\3\2\2\2B\5\3\2\2\2CA\3\2\2\2DE\5\"\22\2EF\b\4\1\2FH\3\2"+
		"\2\2GD\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\7\3\2\2\2KI\3\2\2\2LO\5"+
		"\4\3\2MO\3\2\2\2NL\3\2\2\2NM\3\2\2\2O\t\3\2\2\2PQ\7\34\2\2QR\7\30\2\2"+
		"RS\5\f\7\2S\13\3\2\2\2TU\t\2\2\2U\r\3\2\2\2VW\5\22\n\2WX\5\20\t\2X\17"+
		"\3\2\2\2YZ\7\17\2\2Z[\5\22\n\2[\\\5\20\t\2\\c\3\2\2\2]^\7\22\2\2^_\5\22"+
		"\n\2_`\5\20\t\2`c\3\2\2\2ac\3\2\2\2bY\3\2\2\2b]\3\2\2\2ba\3\2\2\2c\21"+
		"\3\2\2\2de\5\26\f\2ef\5\24\13\2f\23\3\2\2\2gh\7\16\2\2hi\5\26\f\2ij\5"+
		"\24\13\2jq\3\2\2\2kl\7\3\2\2lm\5\26\f\2mn\5\24\13\2nq\3\2\2\2oq\3\2\2"+
		"\2pg\3\2\2\2pk\3\2\2\2po\3\2\2\2q\25\3\2\2\2rz\7\35\2\2sz\7\36\2\2tz\7"+
		"\34\2\2uv\7\32\2\2vw\5\16\b\2wx\7\33\2\2xz\3\2\2\2yr\3\2\2\2ys\3\2\2\2"+
		"yt\3\2\2\2yu\3\2\2\2z\27\3\2\2\2{|\5\34\17\2|}\5\32\16\2}\31\3\2\2\2~"+
		"\177\5\36\20\2\177\u0080\5\34\17\2\u0080\u0081\5\32\16\2\u0081\u0084\3"+
		"\2\2\2\u0082\u0084\3\2\2\2\u0083~\3\2\2\2\u0083\u0082\3\2\2\2\u0084\33"+
		"\3\2\2\2\u0085\u0086\5\16\b\2\u0086\u0087\7\25\2\2\u0087\u0088\5\16\b"+
		"\2\u0088\u008e\3\2\2\2\u0089\u008a\7\32\2\2\u008a\u008b\5\30\r\2\u008b"+
		"\u008c\7\33\2\2\u008c\u008e\3\2\2\2\u008d\u0085\3\2\2\2\u008d\u0089\3"+
		"\2\2\2\u008e\35\3\2\2\2\u008f\u0090\t\3\2\2\u0090\37\3\2\2\2\u0091\u0094"+
		"\5\6\4\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094"+
		"!\3\2\2\2\u0095\u009c\5$\23\2\u0096\u009c\5&\24\2\u0097\u009c\5*\26\2"+
		"\u0098\u009c\5,\27\2\u0099\u009c\5\60\31\2\u009a\u009c\5\62\32\2\u009b"+
		"\u0095\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u0097\3\2\2\2\u009b\u0098\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c#\3\2\2\2\u009d\u009e"+
		"\7\34\2\2\u009e\u009f\7\31\2\2\u009f\u00a0\5\16\b\2\u00a0\u00a1\b\23\1"+
		"\2\u00a1%\3\2\2\2\u00a2\u00a3\7\5\2\2\u00a3\u00a4\7\34\2\2\u00a4\u00a5"+
		"\b\24\1\2\u00a5\'\3\2\2\2\u00a6\u00a7\t\4\2\2\u00a7)\3\2\2\2\u00a8\u00aa"+
		"\7\7\2\2\u00a9\u00ab\7 \2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\5(\25\2\u00ad\u00ae\b\26\1\2\u00ae+\3\2\2\2"+
		"\u00af\u00b0\7\4\2\2\u00b0\u00b1\5\30\r\2\u00b1\u00b2\7\t\2\2\u00b2\u00b3"+
		"\5\"\22\2\u00b3\u00b4\5.\30\2\u00b4\u00b5\b\27\1\2\u00b5-\3\2\2\2\u00b6"+
		"\u00b7\7\21\2\2\u00b7\u00ba\5\"\22\2\u00b8\u00ba\3\2\2\2\u00b9\u00b6\3"+
		"\2\2\2\u00b9\u00b8\3\2\2\2\u00ba/\3\2\2\2\u00bb\u00bc\7\f\2\2\u00bc\u00bd"+
		"\5\30\r\2\u00bd\u00be\5\"\22\2\u00be\u00bf\b\31\1\2\u00bf\61\3\2\2\2\u00c0"+
		"\u00c1\7\13\2\2\u00c1\u00c2\5\6\4\2\u00c2\u00c3\7\20\2\2\u00c3\u00c4\b"+
		"\32\1\2\u00c4\63\3\2\2\2\16AINbpy\u0083\u008d\u0093\u009b\u00aa\u00b9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}