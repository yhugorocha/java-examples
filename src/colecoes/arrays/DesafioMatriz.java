package colecoes.arrays;

import java.util.Scanner;

public class DesafioMatriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int qtdAlunos = 0;
		int qtdNotas = 0;
		
		System.out.println("Digite a quantidade de alunos!");
		qtdAlunos = entrada.nextInt();
		System.out.println("Digite a quantidade de notas por aluno!");
		qtdNotas = entrada.nextInt();
		
		double[][] notasAluno = new double[qtdAlunos][qtdNotas];
		for (int i = 0; i < qtdAlunos; i++) {
			
			for(int j = 0; j < qtdNotas; j++) {
				System.out.println("Digite a "+(j+1)+" nota do "+(i+1)+" aluno!");
				notasAluno[i][j] = entrada.nextDouble();
			}
		}
		
		
		for(int i=0; i<qtdAlunos; i++) {
			double total = 0;
			for(int j = 0;j<qtdNotas; j++) {
				total += notasAluno[i][j];
			}
			System.out.println("Média do "+(i+1)+" aluno: "+total/qtdNotas);
		}
		

		entrada.close();
	}
}
