package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;

public class Exercício17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int num = scan.nextInt();

		System.out.print(num + "!= ");

		int fatorial = 1;
		for (int i = num; i > 1; i--) {
			fatorial *= i;
			System.out.print(i + ".");
		}
		System.out.println("1 =" + fatorial);
		scan.close();
	}

}
