package com.loiane.cursojava.aula19Exercícios;

import java.util.Scanner;

public class Exercício030 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];// pares
		int[] vetorC = new int[vetorA.length];// impares

		int posB = 0;
		int posC = 0;
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com un numero para posição A= " + i);
			vetorA[i] = scan.nextInt();
			if (vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			} else {
				vetorC[posC] = vetorA[i];
				posC++;
			}
		}
		System.out.println();

		System.out.print("Valor A= ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Valor B= ");
		for (int i = 0; i < posB; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();

		System.out.print("Valor C= ");
		for (int i = 0; i < posC; i++) {
			System.out.print(vetorC[i] + " ");
		}
		System.out.println();
		scan.close();
	}

}
