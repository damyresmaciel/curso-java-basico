package com.loiane.cursojava.aula19Exercícios;

import java.util.Scanner;

public class Exercício024 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a posiçao: " + i);
			vetorA[i] = scan.nextInt();
		}
		//1221
		//i=0
		boolean palindromo = true;
		for (int i = 0; i < (vetorA.length/2); i++) {
			if (vetorA[i] != vetorA[vetorA.length-1-i]) {
				palindromo = false;
				break;
			}
		}
		System.out.print("Valor A= ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		if (palindromo) {
			System.out.println("Palindromo");
		} else {
			System.out.println("Não é palindromo");
		}
		scan.close();
	}
}
