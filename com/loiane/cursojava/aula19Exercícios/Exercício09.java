package com.loiane.cursojava.aula19Exercícios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercício09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		double[] vetorC = new double[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a posicao: " + i);
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Entre com a posiçao: " + i);
			vetorB[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] / (vetorB[i]);
		}
		System.out.println();

		System.out.print("Vetor A= ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor B= ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("###,###.###");

		System.out.print("Vetor C= ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		scan.close();
	}
}
