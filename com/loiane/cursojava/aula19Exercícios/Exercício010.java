package com.loiane.cursojava.aula19Exerc�cios;

import java.util.Scanner;

public class Exerc�cio010 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		double[] vetorB = new double[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a posi�ao: " + i);
			vetorA[i] = scan.nextInt();
		}
		System.out.println();

		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Entre com a posi�ao: " + i);
			vetorB[i] = scan.nextInt();
		}
		System.out.println();

		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] % 2;
		}

		System.out.print("Valor A= ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Valor  B= ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		scan.close();
	}

}
