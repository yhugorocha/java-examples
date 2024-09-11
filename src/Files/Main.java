package Files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String path = "/Users/yhugo/Desktop/teste.csv";
        List<Nomes> list = new ArrayList<>();

        File sourceFile = new File(path);
        String sourceFolder = sourceFile.getParent();

        File cam = new File(sourceFolder +"\\out");

        if(!cam.exists()){
            cam.mkdir();
        }
        String targetFileStr = sourceFolder + "\\out\\summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(sourceFile))){

            String itemCsv = br.readLine();
            while(itemCsv != null){

                String[] fields = itemCsv.split(";");
                String name = fields[0];
                int valor = Integer.parseInt(fields[1]);

                list.add(new Nomes(name, valor));
                itemCsv = br.readLine();
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){

                for(Nomes nomes:list){
                    bw.write(nomes.getNome() + ","+ nomes.getNumero());
                    bw.newLine();
                }
            }catch (IOException e){
                System.out.println("ERROR WRITING FILE"+ e.getMessage());
            }

        }catch (IOException e){
            System.out.println("ERROR WRITING FILE"+ e.getMessage());
        }

    }
}
