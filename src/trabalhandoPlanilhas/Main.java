package trabalhandoPlanilhas;

import lombok.var;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Hugo Silva", 26, "123456789"));
        pessoas.add(new Pessoa("Igor Rocha Silva", 23, "852963147"));
        pessoas.add(new Pessoa("Polly Costa", 26, "321789654"));
        pessoas.add(new Pessoa("José Hugo Rocha Silva", 26, "123456789"));
        pessoas.add(new Pessoa("Igor Rocha Silva", 23, "852963147"));
        pessoas.add(new Pessoa("Pollyanne", 26, "321789654"));

        try(OutputStream out = new FileOutputStream("PlanilhaCriada.xlsx")){
            /* Criar uma planilha
             *
             *   XSSFWorkbook planilha = new XSSFWorkbook(); // .xlsx
             *   XSSFWorkbook planilha = new HSSFWorkbook(); //  .xls
             */
            try(XSSFWorkbook planilha = new XSSFWorkbook()){
                //Criar um sheet
                XSSFSheet s = planilha.createSheet();
                //Criar uma linha
                XSSFRow linhaCabecario = s.createRow(0);

                //Configuração de estilo
                XSSFCellStyle estilo = planilha.createCellStyle();

                estilo.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
                estilo.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                estilo.setBorderBottom(BorderStyle.THIN);
                estilo.setBorderTop(BorderStyle.THIN);
                estilo.setBorderRight(BorderStyle.THIN);
                estilo.setBorderLeft(BorderStyle.THIN);

                //Criar uma coluna
                XSSFCell colunaNome = linhaCabecario.createCell(0);
                colunaNome.setCellValue("NOME");
                colunaNome.setCellStyle(estilo);
                XSSFCell colunaIdade = linhaCabecario.createCell(1);
                colunaIdade.setCellValue("IDADE");
                colunaIdade.setCellStyle(estilo);
                XSSFCell colunaCpf = linhaCabecario.createCell(2);
                colunaCpf.setCellValue("CPF");
                colunaCpf.setCellStyle(estilo);

                int contador = 1;
                for (Pessoa p : pessoas){
                    XSSFRow linha = s.createRow(contador);
                    XSSFCell colNome = linha.createCell(0);
                    colNome.setCellValue(p.getNome());
                    XSSFCell colIdade = linha.createCell(1);
                    colIdade.setCellValue(p.getIdade());
                    XSSFCell colCpf = linha.createCell(2);
                    colCpf.setCellValue(p.getCpf());

                    contador++;
                }

                //Define a coluna como tamanho do conteúdo
                s.autoSizeColumn(0);
                s.autoSizeColumn(1);
                s.autoSizeColumn(2);

                planilha.write(out);
            }
            System.out.println("Criei");

            //FAz A BUSCA E DELETA O ARQUIVO CRIADO
            File arquivo = new File(searchFile(new File(Main.class.getResource("").toURI()), "PlanilhaCriada.xlsx"));

            if(arquivo.exists()){
                arquivo.delete();
                System.out.println("Deletei");
            }

        }catch (Exception e){
            e.printStackTrace();
        }


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

    public static class Pessoa{

        private String nome;
        private int idade;
        private String cpf;

        public Pessoa(String nome, int idade, String cpf) {
            this.nome = nome;
            this.idade = idade;
            this.cpf = cpf;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
    }
}
