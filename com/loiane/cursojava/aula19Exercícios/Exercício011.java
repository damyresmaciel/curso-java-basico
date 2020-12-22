package com.loiane.cursojava.aula19Exercícios;

import java.util.Scanner;

public class Exercício011 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um valor: " + i);
			vetorA[i] = scan.nextInt();
		}
		
        int qtdPares=0;
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				qtdPares++;
			} 
		}
		System.out.println();

		System.out.print("Valor A= ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Qtd de pares " + qtdPares);
		
		scan.close();
	}

}
