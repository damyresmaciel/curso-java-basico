package com.loiane.cursojava.aula19Exercícios;

import java.util.Scanner;

public class Exercício037 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com uma posiçao para A= ");
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {

			vetorB[i] = 1;// opcional
			for (int j = 1; j < vetorA[i]; j++) {
				vetorB[i] *= j;
			}
		}
		System.out.print("Valor A= ");
		for (int i = 1; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Valor B= ");
		for (int i = 1; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		scan.close();
	}

}
