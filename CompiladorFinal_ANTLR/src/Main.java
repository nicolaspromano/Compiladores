/*
 * video de explicação: https://www.canva.com/design/DAGffA3P8rM/07wSYxqejhRc3sThY_eagA/watch?utm_content=DAGffA3P8rM&utm_campaign=designshare&utm_medium=link2&utm_source=uniquelinks&utlId=hfd6c108d13
 */

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;


 // classe principal que executa o analisador lexico, sintatico e semantico.
 
public class Main {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromFileName("programa1.gyh"); // programa que vai passar pelas analises
            GramaticaGYHLexer lexer = new GramaticaGYHLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GramaticaGYHParser parser = new GramaticaGYHParser(tokens);
            ParseTree tree = parser.programa();

            // analise semantica
            ParseTreeWalker walker = new ParseTreeWalker();
            AnalisadorSemanticoListener analisador = new AnalisadorSemanticoListener();
            walker.walk(analisador, tree);

            // gerador de codigo em c
            GyhProgram programa = new GyhProgram(analisador.getTabelaSimbolos());
            programa.setComandos(analisador.getComandos()); 
            programa.generateTarget(); // gera codigo em c 

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}