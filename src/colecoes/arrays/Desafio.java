package colecoes.arrays;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int qtdNotas = 0;
		
		System.out.println("Digite a quantidade de notas que deseja ver a média");
		qtdNotas = entrada.nextInt();
		
		double[] notasAluno = new double[qtdNotas];
		for (int i = 0; i < qtdNotas; i++) {
			System.out.println("Digite a "+(i+1)+" nota!");
			notasAluno[i] = entrada.nextDouble();
		}
		
		double total =0;
		for(double nota: notasAluno) {
			total += nota;
		}
		
		System.out.println("Média desse aluno é: "+total/notasAluno.length);
		
		entrada.close();
	}

}
