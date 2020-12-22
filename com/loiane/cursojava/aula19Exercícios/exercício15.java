package com.loiane.cursojava.aula19Exercícios;

import java.util.Scanner;

public class exercício15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a posição: " + i);
			vetorA[i] = scan.nextInt();
		}
		int impar = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				impar++;
			}
		}
		int par = vetorA.length - impar;
		// vetorA.length-100%
		// par - x
		// = X*vetorA.length == par*100
		// = (par*100)/vetorA.length
		int porcPar = (par * 100) / vetorA.length;
		int porcImpar = 100 - porcPar;

		System.out.print("Vetor A=");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.println("Porcentagem Pares: " + porcPar + " % ");
		System.out.println("Porcentagem Impares: " + porcImpar+ " % ");
		scan.close();
	}
}
