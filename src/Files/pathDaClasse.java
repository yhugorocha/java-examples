package Files;

import testes.Teste1;

import java.io.File;
import java.net.URISyntaxException;

public class pathDaClasse {
    public static void main(String[] args) throws URISyntaxException {
        File file = new File(Teste1.class.getResource("").toURI());
        System.out.println(file.getAbsolutePath());
    }
}
