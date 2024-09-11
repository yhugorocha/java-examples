package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();

		//Offer e add -> adicionam elementos na fila
		//Diferença e o comportamento ocorre quando a fila está cheia
		
		fila.add("Ana");//Lança uma exceção
		fila.offer("Bia");//retorna boolean
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//peek e element -> obter proximo da fila sem remover
		//Diferença e o comportamento ocorre quando a fila está vazia
		System.out.println(fila.peek()); //retorna false
		System.out.println(fila.element()); //lança uma exceção
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains();
		
		//poll e remove -> obter proximo da fila e remove
		//Diferença e o comportamento ocorre quando a fila está vazia
		System.out.println(fila.poll());//retorna um boolean
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());//lança uma exceção
		
	}

}
