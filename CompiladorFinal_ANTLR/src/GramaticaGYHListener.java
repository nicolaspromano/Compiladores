

// Generated from GramaticaGYH.g4 by ANTLR 4.7.2

    import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaGYHParser}.
 */
public interface GramaticaGYHListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GramaticaGYHParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GramaticaGYHParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaracoes(GramaticaGYHParser.ListaDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaracoes(GramaticaGYHParser.ListaDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void enterListaComandos(GramaticaGYHParser.ListaComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void exitListaComandos(GramaticaGYHParser.ListaComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#tabelaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterTabelaDeclaracoes(GramaticaGYHParser.TabelaDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#tabelaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitTabelaDeclaracoes(GramaticaGYHParser.TabelaDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(GramaticaGYHParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(GramaticaGYHParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#tipoVar}.
	 * @param ctx the parse tree
	 */
	void enterTipoVar(GramaticaGYHParser.TipoVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#tipoVar}.
	 * @param ctx the parse tree
	 */
	void exitTipoVar(GramaticaGYHParser.TipoVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(GramaticaGYHParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(GramaticaGYHParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#expressaoAritmeticaAux}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmeticaAux(GramaticaGYHParser.ExpressaoAritmeticaAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#expressaoAritmeticaAux}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmeticaAux(GramaticaGYHParser.ExpressaoAritmeticaAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterTermoAritmetico(GramaticaGYHParser.TermoAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitTermoAritmetico(GramaticaGYHParser.TermoAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#termoAritmeticoAux}.
	 * @param ctx the parse tree
	 */
	void enterTermoAritmeticoAux(GramaticaGYHParser.TermoAritmeticoAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#termoAritmeticoAux}.
	 * @param ctx the parse tree
	 */
	void exitTermoAritmeticoAux(GramaticaGYHParser.TermoAritmeticoAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterFatorAritmetico(GramaticaGYHParser.FatorAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitFatorAritmetico(GramaticaGYHParser.FatorAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(GramaticaGYHParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(GramaticaGYHParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#expressaoRelacionalAux}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacionalAux(GramaticaGYHParser.ExpressaoRelacionalAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#expressaoRelacionalAux}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacionalAux(GramaticaGYHParser.ExpressaoRelacionalAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterTermoRelacional(GramaticaGYHParser.TermoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitTermoRelacional(GramaticaGYHParser.TermoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#operadorBooleano}.
	 * @param ctx the parse tree
	 */
	void enterOperadorBooleano(GramaticaGYHParser.OperadorBooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#operadorBooleano}.
	 * @param ctx the parse tree
	 */
	void exitOperadorBooleano(GramaticaGYHParser.OperadorBooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#tabelaComandos}.
	 * @param ctx the parse tree
	 */
	void enterTabelaComandos(GramaticaGYHParser.TabelaComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#tabelaComandos}.
	 * @param ctx the parse tree
	 */
	void exitTabelaComandos(GramaticaGYHParser.TabelaComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(GramaticaGYHParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(GramaticaGYHParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoAtribuicao(GramaticaGYHParser.ComandoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoAtribuicao(GramaticaGYHParser.ComandoAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterComandoEntrada(GramaticaGYHParser.ComandoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitComandoEntrada(GramaticaGYHParser.ComandoEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#comandoSaidaAux}.
	 * @param ctx the parse tree
	 */
	void enterComandoSaidaAux(GramaticaGYHParser.ComandoSaidaAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#comandoSaidaAux}.
	 * @param ctx the parse tree
	 */
	void exitComandoSaidaAux(GramaticaGYHParser.ComandoSaidaAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void enterComandoSaida(GramaticaGYHParser.ComandoSaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void exitComandoSaida(GramaticaGYHParser.ComandoSaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicao(GramaticaGYHParser.ComandoCondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicao(GramaticaGYHParser.ComandoCondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#comandoCondicaoAux}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicaoAux(GramaticaGYHParser.ComandoCondicaoAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#comandoCondicaoAux}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicaoAux(GramaticaGYHParser.ComandoCondicaoAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void enterComandoRepeticao(GramaticaGYHParser.ComandoRepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void exitComandoRepeticao(GramaticaGYHParser.ComandoRepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void enterSubAlgoritmo(GramaticaGYHParser.SubAlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void exitSubAlgoritmo(GramaticaGYHParser.SubAlgoritmoContext ctx);
}