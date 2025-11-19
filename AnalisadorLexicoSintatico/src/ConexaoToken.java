import java.util.HashMap;
import java.util.Map;

public class ConexaoToken {
    private Map<String, TipoToken> lexemas; // mapa de lexemas e tipos de token 

    public ConexaoToken() {
        lexemas = new HashMap<>();
        inicializarLexemas(); // Inicializa o mapa 
    }

   
    private void inicializarLexemas() {
    	
    	// operadores aritméticos 
        lexemas.put("+", TipoToken.OpAritSoma);
        lexemas.put("-", TipoToken.OpAritSub);
        lexemas.put("*", TipoToken.OpAritMult);
        lexemas.put("/", TipoToken.OpAritDiv);
        
        // operadores relacionais 
        lexemas.put("<", TipoToken.OpRelMenor);
        lexemas.put("<=", TipoToken.OpRelMenorIgual);
        lexemas.put(">", TipoToken.OpRelMaior);
        lexemas.put(">=", TipoToken.OpRelMaiorIgual);
        lexemas.put("==", TipoToken.OpRelIgual);
        lexemas.put("!=", TipoToken.OpRelDif);
        
        //Operadores booleanos 
        lexemas.put("E",TipoToken.OpBoolE);
        lexemas.put("OU", TipoToken.OpBoolOu);
        
        //Palavras-chave 
        lexemas.put("DEC", TipoToken.PCDec);
        lexemas.put("PROG", TipoToken.PCProg);
        lexemas.put("INT", TipoToken.PCInt);
        lexemas.put("LER", TipoToken.PCLer);
        lexemas.put("REAL", TipoToken.PCReal);
        lexemas.put("IMPRIMIR", TipoToken.PCImprimir);
        lexemas.put("SE", TipoToken.PCSe);
        lexemas.put("SENAO", TipoToken.PCSenao);
        lexemas.put("ENTAO", TipoToken.PCEntao);
        lexemas.put("ENQTO", TipoToken.PCEnqto);
        lexemas.put("INI", TipoToken.PCIni);
        lexemas.put("FIM", TipoToken.PCFim);
        
        //Parêntesis 
        lexemas.put("(", TipoToken.AbrePar);
        lexemas.put(")", TipoToken.FechaPar);
        
        // Atribuição 
        lexemas.put(":=", TipoToken.Atrib);
        
        //Delimitador 
        lexemas.put(":", TipoToken.Delim);
        
        
        
        
    }

    // Verifica conexao entre lexema e token 
    public boolean match(String lexema) {
    
    		return lexemas.containsKey(lexema);
    	
    }

    // Retorna o tipo de token associado a um lexema
    public TipoToken getTipoToken(String lexema) {
        return lexemas.get(lexema);
    }
}
