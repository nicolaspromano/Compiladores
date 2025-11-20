
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collection;

// classe que representa a Tabela de simbolos usada na analise semantica.

public class TabelaSimbolos {
	private HashMap<String, Simbolos> tabela = new HashMap<>();

	public void add(Simbolos simbolo) {
		tabela.put(simbolo.getNome(), simbolo);
	}

	public boolean existe(String nome) {
		return tabela.containsKey(nome);
	}

	public Simbolos get(String nome) {
		return tabela.get(nome);
	}

// metodo para recuperar todas as variaveis armazenadas na tabela.	
	public ArrayList<Simbolos> getAll() {

		ArrayList<Simbolos> lista = new ArrayList<Simbolos>();
		for (Simbolos simbolos : tabela.values()) {
			lista.add(simbolos);
		}
		return lista;
	}

}
