package Lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		
		Calculo calc = (x,y)->{return x + y;};
		System.out.println(calc.executar(1, 2));
		
		calc = (x,y)-> x * y;
		System.out.println(calc.executar(2, 2));
	}
}
