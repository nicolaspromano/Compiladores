
// classe para comandos de leitura (LEIA)
public class CommandLeitura extends Command {
	private String id;

	public CommandLeitura(String id) {
		this.id = id;
	}

	@Override
	public String generateCode() {
		return "scanf(\"%d\", &" + id + ");\n";
	}
}