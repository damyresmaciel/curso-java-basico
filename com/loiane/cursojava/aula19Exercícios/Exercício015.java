package com.loiane.cursojava.aula19Exerc�cios;

import java.util.Scanner;

public class Exerc�cio015 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a posi��o: " + i);
			vetorA[i] = scan.nextInt();
		}
		int impares = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				impares++;
			}
		}
		int par = vetorA.length - impares;
		int porcPares = (par * 100) / vetorA.length;
		int porcImpares = 100 - porcPares;
		System.out.println();

		System.out.print("Valor A= ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("Porcentagem pares: " + porcPares + "%");
		System.out.println("Porcentagem impares: " + porcImpares + "%");
		scan.close();
	}

}
