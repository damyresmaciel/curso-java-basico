package com.loiane.cursojava.aula19Exerc�cios;

import java.util.Scanner;

public class Exerc�cio014 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a posi�ao: " + i);
			vetorA[i] = scan.nextInt();
		}
		int soma = 0;
		int impares = 0;

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 != 0) {
				soma += vetorA[i];
				impares++;
			}
		}
		System.out.println();

		System.out.print("Valor A= ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.println("Soma = " + soma);
		System.out.println("Impares = " + impares);
		scan.close();
	}
}
