package com.loiane.cursojava.aula16e17Exerc�cios;

import java.util.Scanner;

public class Exerc�cio26 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Digite um numero: ");
		num = scan.nextInt();

		System.out.println("Fatorial de " + num);

		System.out.print(num + "!= ");

		int fatorial = 1;
		for (int i = num; i > 1; i--) {
			fatorial *= i;
			System.out.print(i + ".");
		}
		System.out.print("1 = " + fatorial);
		scan.close();
	}

}
