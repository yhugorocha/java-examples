package Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TransferirArquivo {

	public static void main(String[] args) {
		Path imagemNova = Paths.get("C:/Users/yhugo/Desktop/arquivosJava/imagemNova.jpg");
		Path imagemAntiga = Paths.get("C:/Users/yhugo/Desktop/arquivosJava/imagemAntiga.png");
		
		try {
			if(Files.exists(imagemAntiga)) {
				System.out.println("existe");
			}else {
				System.out.println("Não existe");
			}
			
			byte[] bytesImagemNova = Files.readAllBytes(imagemNova);
			Files.write(imagemAntiga, bytesImagemNova);
			
		} catch (Exception e) {
			
			System.out.println("ERRO");
		}
	}

}
