package com.loiane.cursojava.aula19Exerc�cios;

import java.util.Scanner;

public class Exerc�cio025 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a posi��o " + i);
			vetorA[i] = scan.nextInt();

			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
		}

		System.out.print("Valor A= ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " " );
		}
		System.out.println();

		System.out.print("Valor B= ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		scan.close();

	}

}
