package com.loiane.cursojava.aula20Exercícios;

import java.util.Random;

public class Exercício002 {

	public static void main(String[] args) {

		int[][] numerosAleatorios = new int[10][10];
		Random numeroRandom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios.length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
			}

		}
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios.length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}
		
		
		int maiorL5 = 0;
		int menorL5 = 101;
		int linha5 = 5;
		for (int i = 0; i < numerosAleatorios[5].length; i++) {
			if (numerosAleatorios[5][i] > maiorL5) {
				maiorL5 = numerosAleatorios[linha5][i];
			}
			if (numerosAleatorios[5][i] < menorL5) {
				menorL5 = numerosAleatorios[linha5][i];
			}

		}
		System.out.println("Maior valor da linha 5= " + maiorL5);
		System.out.println("Menor valor da linha 5= " + menorL5);
		int maiorCol7 = 0;
		int menorCol7 = 0;
		int coluna7 = 7;
		for (int i = 0; i < numerosAleatorios.length; i++) {
			if (numerosAleatorios[i][coluna7] > maiorCol7) {
				maiorCol7 = numerosAleatorios[i][coluna7];
			}
			if (numerosAleatorios[i][7] < menorCol7) {
				menorCol7 = numerosAleatorios[i][coluna7];
			}
		
		}
		System.out.println("Maior valor da caluna 7= " + maiorCol7);
		System.out.println("mnor valor da coluna 7= " + menorCol7);

	}

}
