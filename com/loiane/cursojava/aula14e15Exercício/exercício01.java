package com.loiane.cursojava.aula14e15Exerc�cio;

import java.util.Scanner;

public class exerc�cio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um valor");
		int v1 = scan.nextInt();

		System.out.println("Digite um segundo valor");
		int v2 = scan.nextInt();

		if (v1 > v2) {
			System.out.println("O valor maior � o primeiro.");
		} else {
			System.out.println("O valor maior � o segundo.");
		}
		scan.close();
	}

}
