package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set<String> lista = new HashSet<>();
		SortedSet<String> lista = new TreeSet<>();
		
		lista.add("Ana");
		lista.add("Carlos");
		lista.add("Luca");
		lista.add("Pedro");
		
		for(String candidato: lista) {
			System.out.println(candidato);
		}
	}

}
