package trabalhandoPlanilhas;

//import javafx.scene.control.DateCell;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import sun.util.calendar.BaseCalendar;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Iterator;

public class LendoPlanilhasLinhas {
    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\yhugo\\git\\repository2\\Estudando Java\\Dados.xlsx");

        try {
            InputStream input = new FileInputStream(arquivo);
            XSSFWorkbook planilha = new XSSFWorkbook(input);

            XSSFSheet sheet = planilha.getSheetAt(0);

            Row linha = sheet.getRow(4);

            Iterator<Cell> colunas = linha.cellIterator();

            while (colunas.hasNext()){
                Cell celula = colunas.next();

                if(celula.getCellType() == CellType.STRING.getCode()){
                    String valor = celula.getStringCellValue();
                }else if(celula.getCellType() == CellType.NUMERIC.getCode() ){
                    double valor = celula.getNumericCellValue();
                }

                if(celula.getCellType() == CellType.NUMERIC.getCode() && DateUtil.isCellDateFormatted(celula)){
                    Date date = celula.getDateCellValue();
                    System.out.println(date.getTime());
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
