package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;

public class Exercício23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Loja Quase dois - Tabela de preços");

		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$ " + (1.99 * i));
		}
		scan.close();
	}

}
