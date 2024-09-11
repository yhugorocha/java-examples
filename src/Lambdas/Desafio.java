package Lambdas;


import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		Produto p1 = new Produto("iPad", 3235.89, 0.13);
		
		Function<Produto, Double> precoReal = p -> p.preco * (1 - p.desconto);
		UnaryOperator<Double> impostoMun = num -> num >= 2500 ? num + (num/100 * 8.5 ): num;
		UnaryOperator<Double> frete = num -> num >= 3000 ? num + 100: num + 50;
		Function<Double, String> arrendondar = num -> String.format("%.2f", num);
		UnaryOperator<String> formatar = valor -> "R$"+valor;
		
		String resultado = precoReal
				.andThen(impostoMun)
				.andThen(frete)
				.andThen(arrendondar)
				.andThen(formatar)
				.apply(p1);
		
		System.out.println(resultado);
		
	}
}
