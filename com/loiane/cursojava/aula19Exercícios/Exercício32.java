package com.loiane.cursojava.aula19Exercícios;

import java.util.Scanner;

public class Exercício32 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[5];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posiçao A- " + i);
			vetorA[i] = scan.nextInt();
		}

		for (int i = 1; i < vetorA.length; i++) {
			System.out.println("tabuada de " + vetorA[i]);
			for (int j = 1; j <= 10; j++) {
				System.out.println(j + " * " + vetorA[i] + " = " + (vetorA[i] * j));
			}
		}
		System.out.println();
		scan.close();

	}

}
