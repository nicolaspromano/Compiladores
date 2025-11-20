grammar GramaticaGYH;

@header{
    import java.util.ArrayList;
}

@members {
    private int qtdDecl = 0;
    private int qtdCmd = 0;
    private int qtdAtrib = 0;
    private int qtdEntrada = 0;
    private int qtdSaida = 0;
    private int qtdCond = 0;
    private int qtdRept = 0;
    private int qtdSubAlg = 0;
    
    private TabelaSimbolos tabela = new TabelaSimbolos ();
    
    private String _writeVar;
    private ArrayList<Command> listCmd= new ArrayList<Command>();
    private GyhProgram programa = new GyhProgram();
    
      public void generateCommand(){
          programa.generateTarget();
          System.out.println("\n\n Gerando codigo");
          }
    
}

// ---------->  regras sintaticas (minusculas)
programa 
    : Delim 'DEC' listaDeclaracoes 
      Delim 'PROG' listaComandos 
      { 
      	  System.out.println("\n ");
          System.out.println("Declaracoes: " + qtdDecl);
          System.out.println("Total de comando: " + qtdCmd);
          System.out.println("   - Atribuicoes: " + qtdAtrib);
          System.out.println("   - Entradas: " + qtdEntrada);
          System.out.println("   - Saidas: " + qtdSaida);
          System.out.println("   - Condicoes: " + qtdCond);
          System.out.println("   - Repeticoes: " + qtdRept);
          System.out.println("   - Subalgoritmos: " + qtdSubAlg);
          System.out.println("\n ");
          
       
                
      }
    ;

listaDeclaracoes : ( declaracao { qtdDecl++; } )* ;
listaComandos : ( comando { qtdCmd++; } )* ;

tabelaDeclaracoes: listaDeclaracoes | ; // ε (vazio)

declaracao: Var Delim tipoVar;
tipoVar: 'INT' | 'REAL';

expressaoAritmetica: termoAritmetico expressaoAritmeticaAux;
expressaoAritmeticaAux: '+' termoAritmetico expressaoAritmeticaAux
                      | '-' termoAritmetico expressaoAritmeticaAux
                      | ; // ε

termoAritmetico: fatorAritmetico termoAritmeticoAux;
termoAritmeticoAux: '*' fatorAritmetico termoAritmeticoAux
                   | '/' fatorAritmetico termoAritmeticoAux
                   | ; // ε

fatorAritmetico: NumInt | NumReal | Var | AbrePar expressaoAritmetica FechaPar;

expressaoRelacional: termoRelacional expressaoRelacionalAux;
expressaoRelacionalAux: operadorBooleano termoRelacional expressaoRelacionalAux
                       | ; // ε

termoRelacional: expressaoAritmetica OpRel expressaoAritmetica 
               | AbrePar expressaoRelacional FechaPar;

operadorBooleano: OpBoolE | OpBoolOu;

tabelaComandos: listaComandos | ; // ε (vazio)

comando: comandoAtribuicao 
       | comandoEntrada 
       | comandoSaida 
       | comandoCondicao 
       | comandoRepeticao 
       | subAlgoritmo;


comandoAtribuicao: Var Atrib expressaoAritmetica { 
    qtdAtrib++; 
};
comandoEntrada: 'LER' Var { 
    qtdEntrada++; 
};
comandoSaidaAux: Var | Cadeia;
comandoSaida: 'IMPRIMIR' Espaco?  comandoSaidaAux { 
    qtdSaida++; 
    
};
comandoCondicao: 'SE' expressaoRelacional 'ENTAO' comando comandoCondicaoAux { 
    qtdCond++; 
};
comandoCondicaoAux: 'SENAO' comando | ; // ε
comandoRepeticao: 'ENQTO' expressaoRelacional comando { 
    qtdRept++; 
};
subAlgoritmo: 'INI' listaComandos 'FIM' { 
    qtdSubAlg++; 
};

// ---------->  regras lexicas (maiusculas)

// palavras-chave
PC: 'DEC' | 'PROG' | 'INT' | 'REAL' | 'LER' | 'IMPRIMIR' | 'SE' | 'SENAO' | 'ENTAO' | 'ENQTO' | 'INI' | 'FIM';

// operadores aritméticos
OpArit: '*' | '/' | '+' | '-';

// operadores relacionais
OpRel: '<' | '<=' | '>' | '>=' | '==' | '!=';

// operadores booleanos
OpBoolE: 'E';
OpBoolOu: 'OU';

// delimitadores
Delim: ':' ;

// atribuicao
Atrib: ':=';

// parenteses
AbrePar: '(';
FechaPar: ')';

// variaveis (letras ou numeros começando com minuscula)
Var: [a-z] ([a-z] | [A-Z] | [0-9])*;

// numeros inteiros
NumInt: [0-9]+;

// numeros reais
NumReal: [0-9]+ '.' [0-9]+;

// cadeia de caracteres
Cadeia: '"' (~["\r\n])* '"';

// espaços em branco (ignorados)
Espaco: (' ' | '\n' | '\r' | '\t') -> skip;

// comentarios (ignorados)
Coment: '#' ~[\r\n]* -> skip;

