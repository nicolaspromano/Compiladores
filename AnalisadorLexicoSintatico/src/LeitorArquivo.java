import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeitorArquivo {
    private BufferedReader reader;

    public LeitorArquivo(String arquivo) {
        try {
            reader = new BufferedReader(new FileReader(arquivo));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String lerProximaLinha() {
        String linha = null;
        try {
            linha = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return linha;
    }

    public void fechar() {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}