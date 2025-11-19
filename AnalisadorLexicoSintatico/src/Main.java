import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Erro: Nenhum arquivo de entrada foi fornecido para analise.");
            return;
        }

        // parte 1 - analise lexica 
        System.out.println("---> Iniciando analise lexica\n");
        Lexico lex = new Lexico(args[0]);

    
        List<Token> tokens = lex.gerarTokens();

        // lista de tokens gerados depois da analise lexica 
        System.out.println("Lista de Tokens gerados:");
        for (Token token : tokens) {
            System.out.println(token);
        }
        System.out.println("\n\n ---> Analise lexica concluida! ");

        // parte 2 - analsie sintatica 
        System.out.println("\n\n---> Iniciando analise sintatica\n");
        Sintatico sintatico = new Sintatico(tokens);
        sintatico.analisar();
        System.out.println("\n---> Analise sintatica concluida");
    }
}
