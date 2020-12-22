package com.loiane.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {

		double[][] notasAlunos = new double[4][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;

		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;

		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;

		notasAlunos[3][0] = 4;
		notasAlunos[3][1] = 6.5;
		notasAlunos[3][2] = 7.4;
		notasAlunos[3][3] = 5.5;

		for (int i = 0; i < notasAlunos.length; i++) {
			// System.out.println(notasAlunos[i]+ " ");
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();
		}
		System.out.println("Calculando a media de cada aluno: ");

		double soma;
		for (int i = 0; i < notasAlunos.length; i++) {
			soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			System.out.println("Media do aluno " + i + " é " + " = " + (soma / 4));
		}
		double[] notasAlunos1 = {7,8,9,10};
		
		double[][] noasalunos2 = {{7,8,9,10}, {8,6,7,10}};
		
		System.out.println("outuput da matriz notasAlunos2");
		
		for (int i =0; i<notasAlunos.length; i++) {
			for (int j =0; j<notasAlunos[i].length; j++) {
				System.out.println(notasAlunos[i][j] + " - ");
			}
		}
	}
}
