package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {
		
		Programador p1 = new Programador("Hugo", 2000.00, "Júnior");
		Programador p2 = new Programador("Keviny", 3000.00, "Júnior");
		Programador p3 = new Programador("Pedro", 4500.00, "Pleno");
		Programador p4 = new Programador("Andrew", 1900.00, "Júnior");
		Programador p5 = new Programador("Alan", 10000.00, "Senior");
		
		List<Programador> programadores = Arrays.asList(p1,p2,p3,p4,p5);
		String filtro = "J";
		Predicate<Programador> filterCargo = p -> p.cargo.contains(filtro);
		Predicate<Programador> salarioAlto = p -> p.salario <= 4000;
		Function<Programador, String> imprimir = v -> "O programador "+v.nome+", tem o salário de R$"+v.salario+", sendo "+v.cargo;
		
		
		programadores.stream()
			.filter(filterCargo)
			.filter(salarioAlto)
			.map(imprimir)
			.forEach(System.out::println);
		
	}
}
