package com.loiane.cursojava.aula19Exerc�cios;

import java.util.Scanner;

public class Exerc�cio007 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

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

		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] - vetorB[i];
		}
		System.out.println();

		System.out.print("Vetor A= ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor B= ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor C= ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		scan.close();
	}

}
