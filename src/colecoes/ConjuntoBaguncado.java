package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho é "+ conjunto.size());
		
		//Não aceita elementos repetidos
		conjunto.add("Teste");
		System.out.println("Tamanho é "+ conjunto.size());
		
		System.out.println(conjunto.remove(1.2));
		System.out.println("Tamanho é "+ conjunto.size());
		System.out.println(conjunto.contains('x'));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); //União entre 2 conjuntos 
		conjunto.retainAll(nums); //Intersecção entre 2 conjuntos
		System.out.println(conjunto);
		conjunto.clear();
		System.out.println(conjunto);
		
	}

}
