package utilitarias.number;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatUtil {
    public static void main(String[] args) {

        //1.000,00 - Brasil
        //1,000.00 - EUA
        Locale pt = Locale.getDefault();
        Locale.setDefault(pt);
        NumberFormat nf = NumberFormat.getNumberInstance(pt);

        String num = nf.format(1100.99);
        System.out.println(num);

        //MOEDA
        NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());
        String valor = moeda.format(100.99);
        System.out.println(valor);

        //PORCENTAGEM
        NumberFormat porcent = NumberFormat.getPercentInstance();
        String porcentagem = porcent.format(99.898); //Esse valor /100;
        System.out.println(porcentagem);

        //ARREDONDAMENTO
        nf = NumberFormat.getNumberInstance();
        nf.setRoundingMode(RoundingMode.UP); //arredondar para cima para baixo entre outros
        nf.setMaximumFractionDigits(0); //obrigatorio para arrendondar
        nf.setMinimumFractionDigits(0); //obrigatorio para arrendondar
        System.out.println(nf.format(99.50));
    }
}
