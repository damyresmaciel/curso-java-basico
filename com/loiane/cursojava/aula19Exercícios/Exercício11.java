package com.loiane.cursojava.aula19Exercícios;

import java.util.Scanner;

public class Exercício11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor da posiçao: " + i);
			vetorA[i] = scan.nextInt();
		}
		int qtdpares = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				// qtdpares = qtdpares+1;
				// qtdpares +=1;
				qtdpares++;
			}
		}
		System.out.print("Vetor A=");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Qtd números pares: " + qtdpares);
		
		scan.close();
	}
}
