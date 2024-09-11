package Lambdas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {
	public static void main(String[] args) {

		String validadeAnos = "1";
		String validadeMeses = "6";
		String data = "2023-01-21 00:00:00.0";
	    
		String[]  dataSemHora = data.split(" ");
		data = dataSemHora[0];

		String validade = LocalDate.parse(data).plusYears(Long.parseLong(validadeAnos)).plusMonths(Long.parseLong(validadeMeses)).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.println(validade);
	}
}
