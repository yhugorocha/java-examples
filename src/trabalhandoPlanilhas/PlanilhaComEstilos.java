package trabalhandoPlanilhas;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class PlanilhaComEstilos {
    public static void main(String[] args) {

        try(OutputStream output = new FileOutputStream("EstilosExcel.xlsx")){
            //CRIA PLANILA
            try(XSSFWorkbook planilha = new XSSFWorkbook()){
                //CRIA SHEET
                XSSFSheet sheet = planilha.createSheet();
                //CRIA LINHA
                XSSFRow linha = sheet.createRow(1);
                //CRIA COLUNA
                XSSFCell colunaNome = linha.createCell(1);
                XSSFCell colunaIdade = linha.createCell(2);

                //Configuração de estilo
                XSSFCellStyle estilo = planilha.createCellStyle();

                estilo.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
                estilo.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                estilo.setBorderBottom(BorderStyle.THIN);
                estilo.setBorderTop(BorderStyle.THIN);
                estilo.setBorderRight(BorderStyle.THIN);
                estilo.setBorderLeft(BorderStyle.THIN);

                //Configuração da coluna
                colunaNome.setCellValue("Estilo com apachePOI");
                colunaNome.setCellStyle(estilo);

                sheet.autoSizeColumn(1);

                planilha.write(output);

            }catch (Exception e){
                e.printStackTrace();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
