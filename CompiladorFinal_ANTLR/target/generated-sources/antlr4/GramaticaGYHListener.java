// Generated from GramaticaGYH.g4 by ANTLR 4.4

    import java.util.ArrayList;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaGYHParser}.
 */
public interface GramaticaGYHListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#operadorBooleano}.
	 * @param ctx the parse tree
	 */
	void enterOperadorBooleano(@NotNull GramaticaGYHParser.OperadorBooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#operadorBooleano}.
	 * @param ctx the parse tree
	 */
	void exitOperadorBooleano(@NotNull GramaticaGYHParser.OperadorBooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(@NotNull GramaticaGYHParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(@NotNull GramaticaGYHParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterTermoRelacional(@NotNull GramaticaGYHParser.TermoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitTermoRelacional(@NotNull GramaticaGYHParser.TermoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#tabelaComandos}.
	 * @param ctx the parse tree
	 */
	void enterTabelaComandos(@NotNull GramaticaGYHParser.TabelaComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#tabelaComandos}.
	 * @param ctx the parse tree
	 */
	void exitTabelaComandos(@NotNull GramaticaGYHParser.TabelaComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(@NotNull GramaticaGYHParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(@NotNull GramaticaGYHParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#comandoCondicaoAux}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicaoAux(@NotNull GramaticaGYHParser.ComandoCondicaoAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#comandoCondicaoAux}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicaoAux(@NotNull GramaticaGYHParser.ComandoCondicaoAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#tipoVar}.
	 * @param ctx the parse tree
	 */
	void enterTipoVar(@NotNull GramaticaGYHParser.TipoVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#tipoVar}.
	 * @param ctx the parse tree
	 */
	void exitTipoVar(@NotNull GramaticaGYHParser.TipoVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#termoAritmeticoAux}.
	 * @param ctx the parse tree
	 */
	void enterTermoAritmeticoAux(@NotNull GramaticaGYHParser.TermoAritmeticoAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#termoAritmeticoAux}.
	 * @param ctx the parse tree
	 */
	void exitTermoAritmeticoAux(@NotNull GramaticaGYHParser.TermoAritmeticoAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#tabelaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterTabelaDeclaracoes(@NotNull GramaticaGYHParser.TabelaDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#tabelaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitTabelaDeclaracoes(@NotNull GramaticaGYHParser.TabelaDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void enterComandoRepeticao(@NotNull GramaticaGYHParser.ComandoRepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void exitComandoRepeticao(@NotNull GramaticaGYHParser.ComandoRepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#expressaoRelacionalAux}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacionalAux(@NotNull GramaticaGYHParser.ExpressaoRelacionalAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#expressaoRelacionalAux}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacionalAux(@NotNull GramaticaGYHParser.ExpressaoRelacionalAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(@NotNull GramaticaGYHParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(@NotNull GramaticaGYHParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#expressaoAritmeticaAux}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmeticaAux(@NotNull GramaticaGYHParser.ExpressaoAritmeticaAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#expressaoAritmeticaAux}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmeticaAux(@NotNull GramaticaGYHParser.ExpressaoAritmeticaAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterTermoAritmetico(@NotNull GramaticaGYHParser.TermoAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitTermoAritmetico(@NotNull GramaticaGYHParser.TermoAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void enterListaComandos(@NotNull GramaticaGYHParser.ListaComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#listaComandos}.
	 * @param ctx the parse tree
	 */
	void exitListaComandos(@NotNull GramaticaGYHParser.ListaComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoAtribuicao(@NotNull GramaticaGYHParser.ComandoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoAtribuicao(@NotNull GramaticaGYHParser.ComandoAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicao(@NotNull GramaticaGYHParser.ComandoCondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicao(@NotNull GramaticaGYHParser.ComandoCondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaracoes(@NotNull GramaticaGYHParser.ListaDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaracoes(@NotNull GramaticaGYHParser.ListaDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(@NotNull GramaticaGYHParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(@NotNull GramaticaGYHParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void enterComandoSaida(@NotNull GramaticaGYHParser.ComandoSaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void exitComandoSaida(@NotNull GramaticaGYHParser.ComandoSaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterFatorAritmetico(@NotNull GramaticaGYHParser.FatorAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitFatorAritmetico(@NotNull GramaticaGYHParser.FatorAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterComandoEntrada(@NotNull GramaticaGYHParser.ComandoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitComandoEntrada(@NotNull GramaticaGYHParser.ComandoEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#comandoSaidaAux}.
	 * @param ctx the parse tree
	 */
	void enterComandoSaidaAux(@NotNull GramaticaGYHParser.ComandoSaidaAuxContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#comandoSaidaAux}.
	 * @param ctx the parse tree
	 */
	void exitComandoSaidaAux(@NotNull GramaticaGYHParser.ComandoSaidaAuxContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(@NotNull GramaticaGYHParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(@NotNull GramaticaGYHParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaGYHParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void enterSubAlgoritmo(@NotNull GramaticaGYHParser.SubAlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaGYHParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void exitSubAlgoritmo(@NotNull GramaticaGYHParser.SubAlgoritmoContext ctx);
}