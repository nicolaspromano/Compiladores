
public enum TipoToken {
	
	PCDec, PCProg, PCInt, PCReal, PCLer, PCImprimir, PCSe, PCEntao, PCSenao, PCEnqto, PCIni, PCFim, // palavras chave 
	OpAritMult, OpAritDiv, OpAritSoma, OpAritSub, // operadores aritmŕticos 
	OpRelMenor, OpRelMenorIgual, OpRelMaior, OpRelMaiorIgual, OpRelIgual, OpRelDif, // operadores relacionais
	OpBoolE, OpBoolOu, // opereadores booleanos 
	Delim, // delimitador
	Atrib, // atribuiçõa
	AbrePar, FechaPar,  // parêntesis
	Var, // variavel 
	NumInt, // numero inteiro 
	NumReal, // numero real
	Cadeia, // cadeia 
	ComentLinha // comentário de linha

}
