package trabalhandoPlanilhas;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Iterator;

public class LendoPlanilhaCompleta {
    public static void main(String[] args) {

        File arquivo = new File("C:\\Users\\yhugo\\git\\repository2\\Estudando Java\\Dados.xlsx");
        try(InputStream input = new FileInputStream(arquivo)){
            try(XSSFWorkbook planilha = new XSSFWorkbook(input)){

                XSSFSheet sheet = planilha.getSheetAt(0);
                Iterator<Row> filas = sheet.rowIterator();
                Iterator<Cell> colunas = null;
                Row linhaAtual = null;
                Cell colunaAtual = null;
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

                while (filas.hasNext()){
                    linhaAtual = filas.next();
                    colunas = linhaAtual.cellIterator();
                    while (colunas.hasNext()){
                        colunaAtual = colunas.next();

                        if(colunaAtual.getCellType() == Cell.CELL_TYPE_STRING){
                            String valor = colunaAtual.getStringCellValue();
                            System.out.println(valor);
                        }

                        if (colunaAtual.getCellType() == Cell.CELL_TYPE_NUMERIC && DateUtil.isCellDateFormatted(colunaAtual)) {
                            String valor = dateFormat.format(colunaAtual.getDateCellValue());
                            System.out.println(valor);
                        }

                        if(colunaAtual.getCellType() == Cell.CELL_TYPE_NUMERIC){
                            Double valor = colunaAtual.getNumericCellValue();
                            System.out.println(valor);
                        }


                    }
                    System.out.println("--------------------------------");
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
