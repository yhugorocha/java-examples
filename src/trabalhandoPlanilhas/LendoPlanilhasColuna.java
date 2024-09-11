package trabalhandoPlanilhas;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;

public class LendoPlanilhasColuna {
    public static void main(String[] args) {

        File arquivo = new File("C:\\Users\\yhugo\\git\\repository2\\Estudando Java\\Dados.xlsx");

        try {
            InputStream input = new FileInputStream(arquivo);
            XSSFWorkbook planilha = new XSSFWorkbook(input);

            XSSFSheet sheet = planilha.getSheetAt(0);

            //Pega somente 1 linha
            //Row linha = sheet.getRow(0);
            Iterator<Row> linhas = sheet.rowIterator();

            Cell coluna = null;
            while (linhas.hasNext()){
                coluna = linhas.next().getCell(0);
                System.out.println(coluna.getStringCellValue());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
