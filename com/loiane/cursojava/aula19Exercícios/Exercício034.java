package com.loiane.cursojava.aula19Exercícios;

import java.util.Scanner;

public class Exercício034 {
//modificado por Damyressssssssss
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a posiçao: " + i);
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Analaziando o número " + vetorA[i]);
			for (int j = 0; j < vetorA[i]; j++) {
				if (j % 2 == 0) {
					System.out.println(j + " é par");
				} else {
					System.out.println(j + " é impar");
				}

			}
			System.out.println();
			scan.close();
		}
	}

}
