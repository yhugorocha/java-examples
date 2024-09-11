package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
		
		Consumer<Integer> printl = System.out::println;
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Function<Integer, String> transfomar = n -> Integer.toBinaryString(n);
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> converter = valor -> Integer.parseInt(valor, 2);
		
		nums.stream()
			.map(transfomar)
			.map(inverter)
			.map(converter)
			.forEach(printl);
		
	}
	
}
