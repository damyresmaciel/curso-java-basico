package com.loiane.cursojava.aula19Exerc�cios;

import java.util.Scanner;

public class Exerc�cio032 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[5];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um valor para posi��o A= " + i);
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Tabuada de " + vetorA[i]);
			for (int j = 0; j < 10; j++) {
				System.out.println(j + "*" + vetorA[i] + "=" + (vetorA[i] * j));
			}
		}
		System.out.println();
		scan.close();
	}

}
