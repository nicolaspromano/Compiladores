import java.util.ArrayList;
import java.util.List;

public class Lexico {
    LeitorArquivo ldat;
    List<Token> tokens;
    int numLinha;
    ConexaoToken conexaoToken; // responsável por fazer a conexão entre lexema e token 

    public Lexico(String arquivo) {
        this.ldat = new LeitorArquivo(arquivo);
        this.tokens = new ArrayList<>();
        this.numLinha = 0;
        this.conexaoToken = new ConexaoToken(); 
    }

    public Token proximoToken() {
        if (!tokens.isEmpty()) {
            return tokens.remove(0); // retorna o próximo token
        }

        String linha;
        int parenBalance = 0; // contador de parênteses

        // lê linha por linha
        while ((linha = ldat.lerProximaLinha()) != null) {
            numLinha++;  // incrementa o número da linha

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

                 // verificação de erro 
                    if (conexaoToken.match(lexema)) {
                        TipoToken tipo = conexaoToken.getTipoToken(lexema);
                        tokens.add(new Token(lexema, tipo, numLinha));
                    } else {
                        System.out.println("Erro Léxico: Operador relacional desconhecido '" + lexema + "' na linha " + numLinha); 
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
                        System.out.println("Erro Léxico: Palavra-chave desconhecida '" + lexema + "' na linha " + numLinha);
                    }
                }

                // verifica diferença entre ':' (delimitador) e ':=' (atribuição)
                else if (ch == ':' && i + 1 < linha.length() && linha.charAt(i + 1) == '=') {
                    if (i + 2 < linha.length() && linha.charAt(i + 2) == ':') {
                        System.out.println("Erro Léxico: Operador de atribuição malformado ':=:' na linha " + numLinha); // verificação de erro 
                        i += 2;
                    } else {
                        tokens.add(new Token(":=", TipoToken.Atrib, numLinha));
                        i++;
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
                        System.out.println("Erro Léxico: Cadeia de caracteres não terminada na linha " + numLinha); // verificação de erro 
                    } else {
                        tokens.add(new Token(sb.toString(), TipoToken.Cadeia, numLinha));
                    }
                }

                // número real ou inteiro
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
                        System.out.println("Erro Léxico: Número malformado '" + lexema + "' na linha " + numLinha); // verificação de erro 
                    } else if (Real) {
                        tokens.add(new Token(lexema, TipoToken.NumReal, numLinha));
                    } else {
                        tokens.add(new Token(lexema, TipoToken.NumInt, numLinha));
                    }
                }
                
                //verifica parênteses 
                else if (ch == '(') {
                    parenBalance++; // Abre parêntese, incrementa contador
                } else if (ch == ')') {
                    parenBalance--; // Fecha parêntese, decrementa contador
                    if (parenBalance < 0) {
                        System.out.println("Erro Léxico: Parênteses desbalanceados na linha " + numLinha);
                    }
                }

                // verifica comentário de linha com #
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

            // Verifica se há parênteses abertos sem fechamento ao final da linha
            if (parenBalance != 0) {
                System.out.println("Erro Léxico: Parênteses desbalanceados na linha " + numLinha); // verificação de erro 
                parenBalance = 0; // Reseta o balanceamento para a próxima linha
            }

            if (!tokens.isEmpty()) {
                return tokens.remove(0);
            }
        }

        return null;
    }
}