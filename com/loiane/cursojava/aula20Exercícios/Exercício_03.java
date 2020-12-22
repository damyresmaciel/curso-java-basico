package com.loiane.cursojava.aula20Exercícios;

import java.util.Scanner;

public class Exercício_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] numeros = new int[3][3];

		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {

				System.out.println("Entre com valor posição [" +i+ " , " +j+ "]");
				numeros[i][j] = scan.nextInt();
			}
		}
		int qtdPares = 0;
		int qtdImpares = 0;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {

				if (numeros[i][j] % 2 == 0) {
					qtdPares++;
				} else {
					qtdImpares++;
				}
			}
		}
		for(int i=0; i<numeros.length;i++) {
			for(int j=0; j<numeros[i].length;j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Quantidade de pares= " + qtdPares);
		System.out.println("Quantidade de impares= " + qtdImpares);
		scan.close();

	}
}
