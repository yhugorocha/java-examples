package Files;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;

public class BuscaArquivo {

    public static void main(String[] args) throws IOException {

        String directoryPath = "/Users/yhugo/Desktop";
        String fileNameToSearch = "arquivo.html";
        File directory = new File("/Users/yhugo/Desktop/PARECER_SUDECO.html");

        File path = new File(searchFile(directory, fileNameToSearch));
        System.out.println(path.toString());



    }

    public static String searchFile(File directory, String fileNameToSearch) {
        // Lista todos os arquivos e diretórios no diretório atual
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    // Se for um diretório, faz a busca recursivamente
                    searchFile(file, fileNameToSearch);
                } else if (file.getName().equals(fileNameToSearch)) {
                    // Se for um arquivo e o nome corresponde ao procurado, imprime o caminho
                    System.out.println("Arquivo encontrado: " + file.getAbsolutePath());
                    return file.getAbsolutePath();
                }
            }
        }
        return fileNameToSearch;
    }
}
