package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("NootBook", 3259.50, 0.22, true);
		Produto p2 = new Produto("PC Gamer", 2800.80, 0.10, false);
		Produto p3 = new Produto("Teclado", 280.00, 0.20, true);
		Produto p4 = new Produto("Monitor 165hz", 1400.80, 0.25, false);
		Produto p5 = new Produto("Mouse Pad", 150.20, 0.10, true);
		Produto p6 = new Produto("HeadSet", 480.30, 0.20, false);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		Predicate<Produto> freteGratis = p -> p.freteGratis;
		Function<Double, Double> conversor = v ->  100 * v;
		Function<Produto, String> promocao = valor -> valor.nome+" COM FRETE GRATIS ,por apenas "+valor.preco+" e DESCONTO DE "+conversor.apply(valor.desconto).intValue()+"%";
		Predicate<Produto> valor = p -> p.preco >= 200;
		
		produtos.stream()
			.filter(freteGratis)
			.filter(valor)
			.map(promocao)
			.forEach(System.out::println);
	}
	
}
