

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class GyhProgram {
    private List<Command> comandos;
    private TabelaSimbolos tabela;

    // construtor que inicializa a tabela de simbolos
    public GyhProgram(TabelaSimbolos tabela) {
        this.tabela = tabela;
    }

    // metodo para definir a lista de comandos do programa
    public void setComandos(List<Command> comandos) {
        this.comandos = comandos;
    }

    // metodo responsavel por gerar o codigo fonte em linguagem c
    public void generateTarget() {
        // cria um objeto stringbuilder para armazenar o codigo gerado
        StringBuilder codigoC = new StringBuilder();
        
        // inclui bibliotecas padrao necessarias
        codigoC.append("#include <stdio.h>\n\n");
        codigoC.append("#include <stdlib.h>\n\n");

        // define a funcao principal do programa em c
        codigoC.append("\nint main() {\n");
        
        // gera codigo para todas as variaveis da tabela de simbolos
        for(Simbolos simbolos: tabela.getAll()) {
            codigoC.append(simbolos.generateCode());
        }

        // gera codigo para cada comando do programa
        for (Command cmd : comandos) {
            codigoC.append("    " + cmd.generateCode());
        }

        // adiciona a instrucao de retorno padrao
        codigoC.append("   \n return 0;\n}\n");

        // tenta escrever o codigo gerado em um arquivo chamado programa.c
        try (FileWriter file = new FileWriter("programa.c")) {
            file.write(codigoC.toString());
            System.out.println("codigo c gerado com sucesso em programa.c");
        } catch (IOException e) {
            // exibe mensagem de erro caso ocorra um problema ao escrever o arquivo
            System.err.println("erro ao gerar codigo c: " + e.getMessage());
        }
    }
}
