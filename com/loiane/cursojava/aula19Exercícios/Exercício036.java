package com.loiane.cursojava.aula19Exercícios;

import java.util.Scanner;

public class Exercício036 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double[] vetorA = new double[11];

		for (int i = 0; i < vetorA.length; i++) {

			vetorA[i] = Math.pow(2, i);
		}
		System.out.println("Valor A= ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		System.out.println();
		scan.close();
	}

}
