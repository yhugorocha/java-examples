package Lambdas;

public class CalculoTeste {
	public static void main(String[] args) {
		
		Calculo soma = new Somar();
		Calculo multiplicacao = new Multiplicar();
		
		System.out.println(soma.executar(1, 2));
		System.out.println(multiplicacao.executar(2, 2));
	}
}
