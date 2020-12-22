package com.loiane.cursojava.aula19Exercícios;

import java.util.Scanner;

public class Exercício18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] idades = new int[10];

		for (int i = 0; i < idades.length; i++) {
			System.out.println("Entre com a idade: " + (i + 1));
			idades[i] = scan.nextInt();
		}
		int menor = idades[0];
		int indexMenor = 0;
		int maior = idades[0];
		int indexMaior = 0;
		for (int i = 1; i < idades.length; i++) {
			if (idades[i] > maior) {
				maior = idades[i];
				indexMaior = i;
			} else {
				menor = idades[i];
				indexMenor = i;
			}
		}
		System.out.print("Vetor de idades = ");
		for (int i = 0; i < idades.length; i++) {
			System.out.print(idades[i] + " ");
		}
		System.out.println();

		System.out.println("Menor idade: " + menor);
		System.out.println("Indice menor idade: " + indexMenor);
		System.out.println("Maior idade: " + maior);
		System.out.println("Indice de maior idade: " + indexMaior);
		scan.close();
	}
}
