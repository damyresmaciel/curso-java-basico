package com.loiane.cursojava.aula19Exerc�cios;

import java.util.Scanner;

public class Exerc�cio020 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double[] vetorA = new double[20];
		double cotacao;

		System.out.println("Entre com a cota��o do d�lar : ");
		cotacao = scan.nextDouble();

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = cotacao * (i + 1);
		}
		System.out.println();

		System.out.println("Vetor A= ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}

		System.out.println();
		scan.close();
	}
}