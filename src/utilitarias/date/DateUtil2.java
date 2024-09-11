package utilitarias.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateUtil2 {
    public static void main(String[] args) {

        //TRABALHANDO COM DATAS
        // dd/MM/yyyy
        LocalDate agora = LocalDate.now();
        System.out.println(agora);

        System.out.println(LocalDate.of(2024,8,10));
        System.out.println(LocalDate.parse("2024-08-10"));

        // adicionando dias/semanas/meses/anos
        System.out.println(agora.plusDays(30));

        //removendo dias/semanas/meses/anos
        System.out.println(agora.minus(1, ChronoUnit.WEEKS));

        System.out.println("#################################");
        //TRABALHANDO COM HORARIOS
        LocalTime agorah = LocalTime.now();
        System.out.println(agorah);

        System.out.println(agorah.plusMinutes(20));
        System.out.println(agorah.minusMinutes(50));


        System.out.println("#################################");
        LocalDateTime agoraCompleto = LocalDateTime.now();
        System.out.println(agoraCompleto);
        System.out.println(agoraCompleto.plusDays(20));
        System.out.println(agoraCompleto.plusMinutes(30));
        System.out.println(agoraCompleto.minusDays(10));
        System.out.println(agoraCompleto.plus(2, ChronoUnit.WEEKS));


        //TBM TEM FUSOS HORARIOS
        //ZONEID
        //ZONEDATETIME
        //OFFSETDATETIME
        //OFFSETDATERIME
    }
}
