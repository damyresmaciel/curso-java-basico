package com.loiane.cursojava.aula19Exerc�cios;

import java.util.Scanner;

public class Exerc�cio12 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a posi�ao: " + i);
			vetorA[i] = scan.nextInt();
		}
		int soma=0;
		for (int i = 0; i < vetorA.length; i++) {
			soma +=vetorA[i];

		}
		System.out.print("Vetor A= ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.println("A soma de vetor �: " + soma);
		scan.close();
	}

}
