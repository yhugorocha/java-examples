package html;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

public class TestesHtml {
    public static void main(String[] args) throws IOException {
        File directory = new File("/Users/yhugo/Desktop/PARECER_SUDECO.html");

        //ENTRA DENTRO DO HTML
        Document doc =  Jsoup.parse(directory, "UTF-8");
        //System.out.println(doc.outerHtml());
        System.out.println(doc.body().children().outerHtml());
    }

    public static String getArquivoBase64(File arquivo){
        String base64Image = "";
        try (FileInputStream imageInFile = new FileInputStream(arquivo)) {
            byte[] imageData = new byte[(int) arquivo.length()];
            imageInFile.read(imageData);
            base64Image = Base64.getEncoder().encodeToString(imageData);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return base64Image;
    }
}
