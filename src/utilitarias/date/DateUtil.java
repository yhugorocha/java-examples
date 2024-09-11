package utilitarias.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateUtil {
    public static void main(String[] args) {

        //USANDO CALENDAR
        Calendar hojeC = Calendar.getInstance();
        System.out.println(hojeC);

        System.out.println(hojeC.get(Calendar.DAY_OF_MONTH));
        System.out.println(hojeC.get(Calendar.MONTH));
        System.out.println(hojeC.get(Calendar.YEAR));

        System.out.println(hojeC.get(Calendar.HOUR_OF_DAY));
        System.out.println(hojeC.get(Calendar.MINUTE));
        System.out.println(hojeC.get(Calendar.SECOND));

        //ADICIONAR OU REMOVER VALORES
        hojeC.add(Calendar.DAY_OF_MONTH, 60); //adicionando 5 dias
        System.out.println(hojeC.getTime());

        //USANDO GREGORIANCALENDAR
        GregorianCalendar hojeG = new GregorianCalendar();

        //Retorna se é um ano bisexto
        System.out.println(hojeG.isLeapYear(2023));

        //FORMATANDO DATAS
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss Z");
        System.out.println(sdf.format(hojeC.getTime()));

        //Trasformando string em data
        SimpleDateFormat sds = new SimpleDateFormat("dd/MM/yyyy");
        String dataString = "24/05/2023";
        try {
            Date novaData = sds.parse(dataString);
            System.out.println(novaData);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Calendar.getInstance().get(Calendar.YEAR));

        //FORMATANDO COM LOCALE
        Date hoje = new Date();
        System.out.println(hoje);

        // 10/09/2024 19:42
        String hojeFormatado = DateFormat.getInstance().format(hoje);
        System.out.println(hojeFormatado);

        //19:45:03
        String hojeFormatado1 = DateFormat.getTimeInstance().format(hoje);
        System.out.println(hojeFormatado1);

        // style 1 ou DateFormat.LONG = 10 de setembro de 2024
        // style 2 ou DateFormat.MEDIUM = 10 de set de 2024
        // style 3 ou DateFormat.SHORT = 10/09/2024
        String hojeFormatado2 = DateFormat.getDateInstance(DateFormat.LONG, Locale.getDefault()).format(hoje);
        System.out.println(hojeFormatado2);
    }
}
