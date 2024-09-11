package Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LendoArquivos {
	public static void main(String[] args) {
		
		Path diretorio = Paths.get("C:/Users/yhugo/Desktop/arquivosJava");
		Path arquivo = Paths.get("C:/Users/yhugo/Desktop/arquivosJava/texto.txt");

		try {
			if(Files.exists(arquivo)) {
				System.out.println("existe");
			}
			if(Files.isDirectory(diretorio)) {
				System.out.println("existe");
			}
			
			List<String> linhas = Files.readAllLines(arquivo);
			
			for(String linha:linhas) {
				System.out.println(linha);
			}
			System.out.println("------------------");
			
			linhas.forEach(linha -> System.out.println(linha));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
