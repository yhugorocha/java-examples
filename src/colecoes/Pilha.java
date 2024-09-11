package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno príncipe");
		livros.push("Don quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.pop()); // retorna exce
		System.out.println(livros.poll()); // retorna boolean
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.remove()); // retorna exce
	}
}
