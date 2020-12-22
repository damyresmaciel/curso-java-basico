package com.loiane.cursojava.aula19Exercícios;

import java.util.Scanner;

public class Exercício13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a posiçao");
			vetorA[i] = scan.nextInt();
		}
		int soma = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 5 == 0) {
				soma += vetorA[i];
			}
		}
		System.out.print("Vetor A=");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.println("Soma " + soma);
		scan.close();
	}

}
