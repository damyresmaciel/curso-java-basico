package com.loiane.cursojava.aula19Exerc�cios;

import java.util.Scanner;

public class Exerc�cio035 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posi��o A= " + i);
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Analizando o n�mero " + vetorA[i]);
			for (int j = 1; j < vetorA.length; j++) {
				if (vetorA[i] % j == 0) {
					System.out.println(j + " � divisor");
				}
			}
		}
		System.out.println();
		scan.close();
	}

}
