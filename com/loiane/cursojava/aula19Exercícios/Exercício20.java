package com.loiane.cursojava.aula19Exerc�cios;

import java.util.Scanner;

public class Exerc�cio20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double[] vetorA = new double[20];
		double cota�ao;

		System.out.println("Entre com a cota�ao do d�lar: ");
		cota�ao = scan.nextDouble();

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = cota�ao * (i + 1);
		}
		System.out.println();
	
		System.out.print("Vetor A= ");
		for(int i =0; i<vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		scan.close();
	}

}
