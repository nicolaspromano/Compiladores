import java.util.ArrayList;
import java.util.List;

public class Lexico {
    LeitorArquivo ldat;
    List<Token> tokens;
    int numLinha;
    ConexaoToken conexaoToken; // responsavel por fazer a conexao entre lexema e token 

    public Lexico(String arquivo) {
        this.ldat = new LeitorArquivo(arquivo);
        this.tokens = new ArrayList<>();
        this.numLinha = 0;
        this.conexaoToken = new ConexaoToken(); 
    }

    public Token proximoToken() {
        if (!tokens.isEmpty()) {
            return tokens.remove(0); // retorna o proximo token
        }

        String linha;
        int parenBalance = 0; // contador de parenteses

        // le linha por linha
        while ((linha = ldat.lerProximaLinha()) != null) {
            numLinha++;  // incrementa o numero da linha

            for (int i = 0; i < linha.length(); i++) {
                char ch = linha.charAt(i); // caractere atual

                // verifica operadores relacionais
                if (ch == '<' || ch == '>' || ch == '=' || ch == '!') {
                    StringBuilder sb = new StringBuilder();
                    sb.append(ch);

                    if (i + 1 < linha.length() && (linha.charAt(i + 1) == '=')) {
                        sb.append(linha.charAt(i + 1));
                        i++;
                    }

                    String lexema = sb.toString();

                    // verificaçao de erro 
                    if (conexaoToken.match(lexema)) {
                        TipoToken tipo = conexaoToken.getTipoToken(lexema);
                        tokens.add(new Token(lexema, tipo, numLinha));
                    } else {
                        System.out.println("Erro Lexico: Operador relacional desconhecido '" + lexema + "' na linha " + numLinha); 
                    }
                }
                
             // verifica operadores aritmeticos
                else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                    StringBuilder sb = new StringBuilder();
                    sb.append(ch); // add o operador atual

                    String lexema = sb.toString();

                    // verificaçao de erro
                    if (conexaoToken.match(lexema)) {
                        TipoToken tipo = conexaoToken.getTipoToken(lexema);
                        tokens.add(new Token(lexema, tipo, numLinha));
                    } else {
                        System.out.println("Erro Lexico: Operador aritmetico desconhecido '" + lexema + "' na linha " + numLinha);
                    }
                }


                // verifica palavras-chave 
                else if (Character.isUpperCase(ch)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(ch);
                    i++;

                    while (i < linha.length() && Character.isLetter(linha.charAt(i))) {
                        sb.append(linha.charAt(i));
                        i++;
                    }

                    i--;
                    String lexema = sb.toString();

                    // verificação de erro palavra chave 
                    if (conexaoToken.match(lexema)) {
                        TipoToken tipo = conexaoToken.getTipoToken(lexema);
                        tokens.add(new Token(lexema, tipo, numLinha));
                    } else {
                        System.out.println("Erro Lexico: Palavra-chave desconhecida '" + lexema + "' na linha " + numLinha);
                    }
                }

             // verifica diferença entre ':' (delimitador) e ':=' (atribuição)
                else if (ch == ':') {
                    if (i + 1 < linha.length() && linha.charAt(i + 1) == '=') {
                        tokens.add(new Token(":=", TipoToken.Atrib, numLinha)); 
                        i++; 
                    } else {
                        tokens.add(new Token(":", TipoToken.Delim, numLinha)); 
                    }
                }

                // verifica cadeia de Caracteres
                else if (ch == '"') {
                    StringBuilder sb = new StringBuilder();
                    sb.append(ch);
                    i++;
                    boolean terminou = false;

                    while (i < linha.length()) {
                        sb.append(linha.charAt(i));
                        if (linha.charAt(i) == '"') {
                            terminou = true;
                            break;
                        }
                        i++;
                    }

                    if (!terminou) {
                        System.out.println("Erro Lexico: Cadeia de caracteres nao terminada na linha " + numLinha); // verificação de erro 
                    } else {
                        tokens.add(new Token(sb.toString(), TipoToken.Cadeia, numLinha));
                    }
                }

                // numero real ou inteiro
                else if (Character.isDigit(ch)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(ch);
                    boolean Real = false;
                    boolean malformado = false;

                    i++;
                    while (i < linha.length() && (Character.isDigit(linha.charAt(i)) || linha.charAt(i) == '.')) {
                        if (linha.charAt(i) == '.') {
                            if (Real) {
                                malformado = true;
                            }
                            Real = true;
                        }
                        sb.append(linha.charAt(i));
                        i++;
                    }
                    i--;

                    String lexema = sb.toString();
                    if (malformado) {
                        System.out.println("Erro Lexico: Numero malformado '" + lexema + "' na linha " + numLinha); // verificação de erro 
                    } else if (Real) {
                        tokens.add(new Token(lexema, TipoToken.NumReal, numLinha));
                    } else {
                        tokens.add(new Token(lexema, TipoToken.NumInt, numLinha));
                    }
                }

             // verifica parenteses 
                else if (ch == '(') {
                    parenBalance++; 
                    String lexema = "(";
                    tokens.add(new Token(lexema, TipoToken.AbrePar, numLinha));
                } else if (ch == ')') {
                    parenBalance--; 
                    String lexema = ")";
                    tokens.add(new Token(lexema, TipoToken.FechaPar, numLinha));
                    if (parenBalance < 0) {
                        System.out.println("Erro Lexico: Parentese fechado, mas nao foi aberto na linha " + numLinha + "\n");
                        parenBalance = 0; // Reseta o balanceamento para evitar propagação de erro
                    }
                }

              
                
             // identifica variaveis
                else if (Character.isLowerCase(ch)) { // variaveis começam com letras minusculas
                    StringBuilder sb = new StringBuilder();
                    sb.append(ch);
                    i++;

                    // continua enquanto for letra, numero ou sublinhado
                    while (i < linha.length() && (Character.isLetterOrDigit(linha.charAt(i)) || linha.charAt(i) == '_')) {
                        sb.append(linha.charAt(i));
                        i++;
                    }
                    i--; 
                    String lexema = sb.toString();

                    // verifica se a variavel é uma palavra-chave ou reservada
                    if (conexaoToken.match(lexema)) {
                        // é uma palavra-chave, faz analise como palavra chave 
                        TipoToken tipo = conexaoToken.getTipoToken(lexema);
                        tokens.add(new Token(lexema, tipo, numLinha));
                    } else {
                        // caso contrario, faz analise como variavel 
                        tokens.add(new Token(lexema, TipoToken.Var, numLinha));
                    }
                }


                // verifica comentario de linha com #
                else if (ch == '#') {
                    StringBuilder sb = new StringBuilder();
                    sb.append(ch);
                    i++;
                    
                    while (i < linha.length()) {
                        sb.append(linha.charAt(i));
                        i++;
                    }
                    
                    tokens.add(new Token(sb.toString(), TipoToken.ComentLinha, numLinha));
                }
            }

            // verifica se ha parenteses abertos sem fechar ao final da linha
            if (parenBalance != 0) {
                System.out.println("Erro Lexico: Parenteses desbalanceados na linha " + numLinha + "\n"); // verificação de erro 
                parenBalance = 0; // inicia novamente o balanceamento para a próxima linha
            }

            if (!tokens.isEmpty()) {
                return tokens.remove(0);
            }
            
            // Apos processar a linha, verificar se ha parenteses abertos sem fechamento
            if (parenBalance > 0 ) { // Substituir linhaTerminou() por sua lógica de fim de entrada, se necessário
                System.out.println("Erro Léxico: Parêntese aberto e não fechado na linha " + numLinha + "\n");
                parenBalance = 0; // Reseta o balanceamento para a próxima linha
            }
        }

        return null;
    }

    // gerador de tokens
    public List<Token> gerarTokens() {
        List<Token> todosTokens = new ArrayList<>();
        Token t = proximoToken();  //  primeiro token
        while (t != null) {
            todosTokens.add(t);  // add o token à lista
            t = proximoToken();  //  proximo token
        }
        return todosTokens;  //  lista completa 
    }

    public List<Token> getTokens() {
        return new ArrayList<>(tokens); 
    }
}
