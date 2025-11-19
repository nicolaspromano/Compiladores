import java.util.List;
import java.util.Stack;

public class Sintatico {
	private Token lookahead;
	private List<Token> tokens;
	private int currentIndex;

	public Sintatico(List<Token> tokens) {
		this.tokens = tokens;
		this.currentIndex = 0;
		this.lookahead = getNextToken(); // inicializa o lookahead

	}

	private Token getNextToken() {
		while (currentIndex < tokens.size()) {
			Token tokenAtual = tokens.get(currentIndex++);
			if (tokenAtual.getTipo() != TipoToken.ComentLinha) {
				return tokenAtual; // proximo token, não comentario
			}
			System.out
					.println("Ignorando comentario na linha " + tokenAtual.getLinha() + ": " + tokenAtual.getLexema());
		}
		return new Token("$", TipoToken.PCFim, -1); // fim entrada
	}

	private boolean validarParenteses() {
		int contador = 0; // contador para balancear parenteses

		for (Token token : tokens) {
			if (token.getTipo() == TipoToken.AbrePar) {
				contador++;
			} else if (token.getTipo() == TipoToken.FechaPar) {
				contador--;
				if (contador < 0) {
					// caso encontre um ')' sem correspondente '('
					System.out.println("Erro: Parentese fechado ')' sem correspondente '(' na linha " + token.getLinha());
					return false;
				}
			}
		}

		if (contador != 0) {
			// se parentese não fechado
			System.out.println("Erro: Parenteses nao balanceados no codigo.");
			return false;
		}

		return true; // parenteses balanceados, tudo certo 
	}

	// debuga o codigo analisado
	private void debugToken() {
		System.out.println("Token atual: " + lookahead.getLexema() + " (" + lookahead.getTipo() + "), Linha: " + lookahead.getLinha());
	}

	private boolean verificar(TipoToken esperado) {
		return lookahead.getTipo() == esperado;
	}

	private void consumir() {
		lookahead = getNextToken();
		debugToken(); // mostra o proximo token apos consumir
	}

	public void analisar() {
		try {
			// valida os parenteses antes de iniciar a analise
			if (!validarParenteses()) {
				throw new RuntimeException("Parnteses inconsistentes no codigo.");
			}

			programa(); // inicia analise
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

	// menssagem caso haja erro na analise 
	private void erro(String mensagem) {
		throw new RuntimeException("Erro: " + mensagem + " na linha " + lookahead.getLinha());
	}

	private void programa() {
		System.out.println("\nAnalisando Programa...\n");

		// Programa → ':' 'DEC' ListaDeclaracoes ':' 'PROG' ListaComandos;

		if (verificar(TipoToken.Delim)) { // espera :
			consumir();
		} else {
			erro("esperado ':'");
		}

		if (verificar(TipoToken.PCDec)) { // espera DEC
			consumir();
		} else {
			erro("esperado 'DEC'");
		}

		listaDeclaracoes();

		if (verificar(TipoToken.Delim)) { // espera :
			consumir();
		} else {
			erro("esperado ':'");
		}

		if (verificar(TipoToken.PCProg)) { // espera PROG
			consumir();
		} else {
			erro("esperado 'PROG'");
		}

		listaComandos();
	}

	private void listaDeclaracoes() {
		// ListaDeclaracoes → Declaracao TabelaDeclaracoes;
		declaracao();
		tabelaDeclaracoes();
	}

	private void tabelaDeclaracoes() {
		// TabelaDeclaracoes → ListaDeclaracoes
		// | ε;
		if (verificar(TipoToken.Var)) {
			listaDeclaracoes();
		}
	}

	private void declaracao() {
		// Declaracao → VARIAVEL ':' TipoVar;
		if (verificar(TipoToken.Var)) {
			consumir();
		} else {
			erro("esperado uma variavel");
		}

		if (verificar(TipoToken.Delim)) { // Espera ':'
			consumir();
		} else {
			erro("esperado ':' apos a variavel");
		}

		tipoVar();
	}

	private void tipoVar() {
		// TipoVar → 'INT'
		// | 'REAL';
		if (verificar(TipoToken.PCInt) || verificar(TipoToken.PCReal)) {
			consumir();
		} else {
			erro("esperado 'INT' ou 'REAL'");
		}
	}

	private void expressaoAritmetica() {
		// ExpressaoAritmetica → TermoAritmetico ExpressaoAritmeticaAux;
		termoAritmetico();
		expressaoAritmeticaAux();
	}

	private void expressaoAritmeticaAux() {
		// ExpressaoAritmeticaAux → '+' TermoAritmetico ExpressaoAritmeticaAux
		// | '-' TermoAritmetico ExpressaoAritmeticaAux
		// | ε
		if (verificar(TipoToken.OpAritSoma) || verificar(TipoToken.OpAritSub)) {
			consumir();
			termoAritmetico();
			expressaoAritmeticaAux();
		}

	}

	private void termoAritmetico() {
		// TermoAritmetico → FatorAritmetico TermoAritmeticoAux;
		fatorAritmetico();
		termoAritmeticoAux();
	}

	private void termoAritmeticoAux() {
		// TermoAritmeticoAux → '*' FatorAritmetico TermoAritmeticoAux
		// | '/' FatorAritmetico TermoAritmeticoAux
		// | ε
		if (verificar(TipoToken.OpAritMult) || verificar(TipoToken.OpAritDiv)) {
			consumir();
			fatorAritmetico();
			termoAritmeticoAux();
		}

	}

	private void fatorAritmetico() {
		// FatorAritmetico → NUMINT | NUMREAL | VARIAVEL | '(' ExpressaoAritmetica ')'
		if (verificar(TipoToken.NumInt) || verificar(TipoToken.NumReal) || verificar(TipoToken.Var)) {
			consumir();
		} else if (verificar(TipoToken.AbrePar)) {
			consumir();
			expressaoAritmetica();
			if (verificar(TipoToken.FechaPar)) {
				consumir();
			} else {
				erro("Esperado ')' apos a expressao entre parenteses");
			}
		} else {
			erro("Esperado numero, variavel ou expressao entre parenteses");
		}
	}

	private void expressaoRelacional() {
		// ExpressaoRelacional → TermoRelacional ExpressaoRelacionalAux;
		termoRelacional();
		expressaoRelacionalAux();
	}

	private void expressaoRelacionalAux() {
		// ExpressaoRelacionalAux → OperadorBooleano TermoRelacional
		// ExpressaoRelacionalAux
		// | ε
		if (verificar(TipoToken.OpBoolE) || verificar(TipoToken.OpBoolOu)) {
			operadorBooleano();
			termoRelacional();
			expressaoRelacionalAux();
		}

	}

	private void termoRelacional() {
		// TermoRelacional → ExpressaoAritmetica OP_REL ExpressaoAritmetica
		// | '(' ExpressaoRelacional ')'
		if (verificar(TipoToken.AbrePar)) {
			consumir(); 
			expressaoRelacional(); 
			if (verificar(TipoToken.FechaPar)) {
				consumir(); 
			} else {
				erro("Esperado ')' apos a expressao relacional");
			}
		} else {
			expressaoAritmetica(); 
			if (isOperadorRelacional()) {
				consumir(); 
				expressaoAritmetica(); 
			} else {
				erro("Esperado operador relacional");
			}
		}
	}

	private boolean isOperadorRelacional() {

		return verificar(TipoToken.OpRelMenor) || verificar(TipoToken.OpRelMenorIgual)
				|| verificar(TipoToken.OpRelMaior) || verificar(TipoToken.OpRelMaiorIgual)
				|| verificar(TipoToken.OpRelIgual) || verificar(TipoToken.OpRelDif);
	}

	private void operadorBooleano() {
		// OperadorBooleano → 'E' | 'OU';
		if (verificar(TipoToken.OpBoolE) || verificar(TipoToken.OpBoolOu)) {
			consumir();
		}

	}

	private void listaComandos() {
		// ListaComandos → Comando TabelaComandos;
		while (!verificar(TipoToken.PCFim) && currentIndex < tokens.size()) { 															
			comando(); 
			tabelaComandos(); 
		}

		if (!verificar(TipoToken.PCFim)) {
			erro("Esperado 'FIM' apos comandos");
		}
	}

	private void tabelaComandos() {
		// TabelaComandos → ListaComandos
		// | ε;
		if (List.of(TipoToken.Var, TipoToken.PCLer, TipoToken.PCImprimir, TipoToken.PCSe, TipoToken.PCEnqto,
				TipoToken.PCIni).contains(lookahead.getTipo())) {
			listaComandos();
		}
	}

	private void comando() {
		// Comando → ComandoAtribuicao
		//          | ComandoEntrada
		//          | ComandoSaida
		//          | ComandoCondicao
		//          | ComandoRepeticao
		//          | SubAlgoritmo;

		switch (lookahead.getTipo()) {
		case Var -> comandoAtribuicao();
		case PCLer -> comandoEntrada();
		case PCImprimir -> comandoSaida();
		case PCSe -> comandoCondicao();
		case PCEnqto -> comandoRepeticao();
		case PCIni -> subAlgoritmo();
		default -> erro("Comando invalido ou inesperado");
		}
	}

	private void comandoAtribuicao() {
		// ComandoAtribuicao → VARIAVEL ':=' ExpressaoAritmetica;
		if (verificar(TipoToken.Var)) {
			consumir();
		} else {
			erro("esperado uma variavel para atribuicao");
		}

		if (verificar(TipoToken.Atrib)) { // Espera ':='
			consumir();
		} else {
			erro("esperado ':=' na atribuicao");
		}

		expressaoAritmetica();
	}

	private void comandoEntrada() {
		// ComandoEntrada → 'LER' VARIAVEL;
		if (verificar(TipoToken.PCLer)) {
			consumir();
		} else {
			erro("esperado 'LER'");
		}

		if (verificar(TipoToken.Var)) {
			consumir();
		} else {
			erro("esperado uma variavel apos 'LER'");
		}
	}

	private void comandoSaida() {
		// ComandoSaida → 'IMPRIMIR' ComandoSaidaAux;

		if (verificar(TipoToken.PCImprimir)) {
			consumir();
		} else {
			erro("esperado 'IMPRIMIR'");
		}

		// ComandoSaidaAux → VARIAVEL | CADEIA;
		if (verificar(TipoToken.Var) || verificar(TipoToken.Cadeia)) {
			consumir();
		} else {
			erro("esperado variavel ou cadeia de caracteres para 'IMPRIMIR'");
		}
	}

	private void comandoCondicao() {
		// ComandoCondicao → 'SE' ExpressaoRelacional 'ENTAO' Comando
		// ComandoCondicaoAux;
		if (verificar(TipoToken.PCSe)) { // espera SE
			consumir();
		} else {
			erro("esperado 'SE'");
		}

		expressaoRelacional();

		if (verificar(TipoToken.PCEntao)) { // espera ENTAO
			consumir();
			comando();
		} else {
			erro("esperado 'ENTAO'");
		}

		if (verificar(TipoToken.PCSenao)) { // verifica SENAO
			comandoCondicaoAux();
		}

	}

	private void comandoCondicaoAux() {
		// ComandoCondicaoAux → 'SENAO' Comando
		// | ε;
		consumir();
		comando();
	}

	private void comandoRepeticao() {
		// ComandoRepeticao → 'ENQTO' ExpressaoRelacional Comando;
		if (verificar(TipoToken.PCEnqto)) { // espera ENQTO
			consumir();
		} else {
			erro("esperado 'ENQTO'");
		}

		expressaoRelacional();
		comando();
	}

	private void subAlgoritmo() {
		if (verificar(TipoToken.PCIni)) { // espera INI
			consumir();
			listaComandos();
		} else {
			erro("Esperado 'INI' para iniciar o subalgoritmo");
		}

		if (!verificar(TipoToken.PCFim)) { // verifica se tem FIM
			erro("Esperado 'FIM' para finalizar o subalgoritmo iniciado por 'INI'");
		} else {
			consumir();
		}
	}

}