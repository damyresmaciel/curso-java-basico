package com.loiane.cursojava.aula19Exerc�cios;

import java.util.Scanner;

public class Exerc�cio034 {
//modificado por Damyressssssssss
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a posi�ao: " + i);
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Analaziando o n�mero " + vetorA[i]);
			for (int j = 0; j < vetorA[i]; j++) {
				if (j % 2 == 0) {
					System.out.println(j + " � par");
				} else {
					System.out.println(j + " � impar");
				}

			}
			System.out.println();
			scan.close();
		}
	}

}
