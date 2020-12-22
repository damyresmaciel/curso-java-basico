package com.loiane.cursojava.aula19Exercícios;

import java.util.Scanner;

public class Exercício31 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a posiçao " + i);
			vetorA[i] = scan.nextInt();
		}
		int posB = 0;

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}
		}
		for(int i=0; i<vetorA.length;i++) {
			if(vetorA[i]%2 !=0) {
				vetorB[posB]= vetorA[i];
				posB++;
			}
		}
		System.out.print("Valor A= ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Valor B= ");
		for (int i = 0; i <posB; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		scan.close();
	}

}
