

import java.util.ArrayList;
import java.util.List;

public class AnalisadorSemanticoListener extends GramaticaGYHBaseListener {
    // tabela de simbolos para armazenar variaveis
    private TabelaSimbolos tabela = new TabelaSimbolos();
    // lista de comandos gerados pela analise
    private List<Command> comandos = new ArrayList<>();
    private List<Command> comandosAtuais = comandos;
    // armazenam comandos de condicao e repeticao atualmente processados
    private CommandCondicao comandoCondicaoAtual = null;
    private CommandRepeticao comandoRepeticaoAtual = null;
    // flags para controle de contexto dentro de condicao
    private boolean dentroCondicao = false;
    private boolean dentroSenao = false;

    // retorna a lista de comandos processados
    public List<Command> getComandos() {
        return comandos;
    }

    // chamado ao encontrar uma declaracao de variavel
    // adiciona a variavel na tabela de simbolos e verifica se ja foi declarada
    @Override
    public void enterDeclaracao(GramaticaGYHParser.DeclaracaoContext ctx) {
        String nomeVar = ctx.Var().getText(); // nome da variavel
        String tipoTexto = ctx.tipoVar().getText(); // tipo da variavel (int ou real)
        int tipo = tipoTexto.equals("INT") ? Simbolos.INT : Simbolos.REAL; // converte o tipo para representacao interna

        if (tabela.existe(nomeVar)) {
            System.err.println("Erro Semantico: Variavel '" + nomeVar + "' ja foi declarada.");
        } else {
            tabela.add(new Simbolos(nomeVar, tipo, null)); // adiciona na tabela de simbolos
        }
    }

    // chamado ao encontrar um comando de atribuicao
    // verifica se a variavel foi declarada, se ha divisao por zero e se os tipos sao compativeis
    @Override
    public void enterComandoAtribuicao(GramaticaGYHParser.ComandoAtribuicaoContext ctx) {
        String nomeVar = ctx.Var().getText(); // nome da variavel
        String expressao = ctx.expressaoAritmetica().getText(); // expressao atribuida

        if (!tabela.existe(nomeVar)) {
            System.err.println("Erro Semantico: Variavel '" + nomeVar + "' nao foi declarada antes da atribuicao.");
            return;
        }

        Simbolos simbolo = tabela.get(nomeVar);
        String valor = expressao;

        if (valor.contains("/0")) {
            System.err.println("Erro Semantico: Divisao por zero na expressao atribuida a '" + nomeVar + "'.");
        }

        if (simbolo.getTipo() == Simbolos.INT && valor.matches(".*[.]\\d+.*")) {
            System.err.println("Erro Semantico: Variavel '" + nomeVar + "' e do tipo INT, mas recebeu um REAL.");
        } else if (simbolo.getTipo() == Simbolos.REAL && valor.matches("\\d+")) {
            System.out.println("Aviso: Conversao impropria de INT para REAL em '" + nomeVar + "'.");
        }

        simbolo.setValor(valor); // atualiza o valor da variavel
        comandosAtuais.add(new CommandAtribuicao(nomeVar, expressao));
    }
    
// chamado quando indentifica uma expressao aritmemtica ou relacional
// verifica se a variavel foi declarada antes da expressao 
    
    @Override
    public void enterExpressaoAritmetica(GramaticaGYHParser.ExpressaoAritmeticaContext ctx) {
        String expr = ctx.getText();
        
        // remover espaços extras
        expr = expr.replaceAll("\\s+", "");
        
        // dividir a expressao por operadores aritmeticos
        String[] tokens = expr.split("[+\\-*/]");
        
        for (String token : tokens) {
            if (token.isEmpty()) continue;

            // se for um identificador (variavel), verificar na tabela de simbolos
            if (token.matches("[a-zA-Z_][a-zA-Z0-9_]*")) {
                if (tabela.existe(token)) {
                    Simbolos simbolo = tabela.get(token);

                    // se for um INT e contem ponto decimal, há erro de tipo
                    if (simbolo.getTipo() == Simbolos.INT && token.matches(".*\\.\\d+.*")) {
                        System.err.println("Erro Semantico: Operacao entre tipos incompativeis envolvendo '" + token + "'.");
                    }
                } else {
                    System.err.println("Erro Semantico: Variavel '" + token + "' usada em expressao aritmetica ou relacional sem ter sido declarada.");
                }
            }
        }
    }


    // chamado ao encontrar um comando de entrada (leitura de variavel)
    // verifica se a variavel foi declarada antes de ser lida
    @Override
    public void enterComandoEntrada(GramaticaGYHParser.ComandoEntradaContext ctx) {
        String nomeVar = ctx.Var().getText();
        if (!tabela.existe(nomeVar)) {
            System.err.println("Erro Semantico: Variavel '" + nomeVar + "' nao foi declarada antes da leitura.");
            return;
        }
        comandosAtuais.add(new CommandLeitura(nomeVar));
    }

    // chamado ao encontrar um comando de saida (impressao)
    // verifica se a saida e valida (string ou variavel declarada e inicializada)
    @Override
    public void enterComandoSaida(GramaticaGYHParser.ComandoSaidaContext ctx) {
        String saida = ctx.comandoSaidaAux().getText();

        if (saida.startsWith("\"") && saida.endsWith("\"")) {
            return; // se for string, nao ha erro
        }

        if (!tabela.existe(saida)) {
            System.err.println("Erro Semantico: Tentativa de imprimir variavel '" + saida + "' que nao foi declarada.");
        } else {
            Simbolos simbolo = tabela.get(saida);
            if (simbolo.getValor() == null) {
                System.err.println("Erro Semantico: Variavel '" + saida + "' nao foi inicializada antes da saida.");
            }
        }

        comandosAtuais.add(new CommandEscrita(saida));
    }

    // chamado ao encontrar um comando de condicao (if-else)
    @Override
    public void enterComandoCondicao(GramaticaGYHParser.ComandoCondicaoContext ctx) {
        String condicao = ctx.expressaoRelacional().getText();
        comandoCondicaoAtual = new CommandCondicao(condicao, new ArrayList<>(), new ArrayList<>());
        comandosAtuais.add(comandoCondicaoAtual);
        comandosAtuais = comandoCondicaoAtual.getListaVerdadeira();
        dentroCondicao = true;
        dentroSenao = false;
    }

    @Override
    public void exitComandoCondicao(GramaticaGYHParser.ComandoCondicaoContext ctx) {
        comandosAtuais = comandos;
        comandoCondicaoAtual = null;
        dentroCondicao = false;
        dentroSenao = false;
    }

    @Override
    public void enterComandoCondicaoAux(GramaticaGYHParser.ComandoCondicaoAuxContext ctx) {
        if (ctx.getText().equals("SENAO")) {
            comandosAtuais = comandoCondicaoAtual.getListaFalsa();
            dentroSenao = true;
        }
    }

    @Override
    public void exitComandoCondicaoAux(GramaticaGYHParser.ComandoCondicaoAuxContext ctx) {
        if (dentroSenao) {
            comandosAtuais = comandos;
            dentroSenao = false;
        }
    }

    // chamado ao encontrar um comando de repeticao (while)
    @Override
    public void enterComandoRepeticao(GramaticaGYHParser.ComandoRepeticaoContext ctx) {
        String condicao = ctx.expressaoRelacional().getText();
        comandoRepeticaoAtual = new CommandRepeticao(condicao, new ArrayList<>());
        comandosAtuais.add(comandoRepeticaoAtual);
        comandosAtuais = comandoRepeticaoAtual.getCorpo();
    }

    @Override
    public void exitComandoRepeticao(GramaticaGYHParser.ComandoRepeticaoContext ctx) {
        comandosAtuais = comandos;
        comandoRepeticaoAtual = null;
    }

    // retorna a tabela de simbolos apos a analise
    public TabelaSimbolos getTabelaSimbolos() {
        return tabela;
    }
}