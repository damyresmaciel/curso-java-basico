package com.loiane.cursojava.aula19Exercícios;

import java.util.Scanner;

public class Exercício029 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length * 2];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a posiçao  A= " + i);
			vetorA[i] = scan.nextInt();
			vetorC[i] = vetorA[i];
		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a posição B= " + i);
			vetorB[i] = scan.nextInt();
			vetorC[vetorA.length+i] = vetorB[i];
		}
		System.out.print("Valor A= ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Valor B= ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();

		System.out.print("Valor C= ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		System.out.println();
		scan.close();

	}
}
