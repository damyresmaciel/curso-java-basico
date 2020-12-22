package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;

public class WhileDoWhile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		/*
		 * int cont=0; while(cont<5) { System.out.println(cont); cont++; }
		 */
		int i;
		boolean perguntar;

		do {
			System.out.println("Digite um numero: ");
			i = scan.nextInt();
			if (i > 10) {
				perguntar = true;
			} else {
				perguntar = false;
			}
		} while (perguntar);
	}
}
