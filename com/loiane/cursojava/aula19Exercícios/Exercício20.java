package com.loiane.cursojava.aula19Exercícios;

import java.util.Scanner;

public class Exercício20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double[] vetorA = new double[20];
		double cotaçao;

		System.out.println("Entre com a cotaçao do dólar: ");
		cotaçao = scan.nextDouble();

		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = cotaçao * (i + 1);
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
