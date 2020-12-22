package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;

public class Exercício27 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double temperatura;
		double soma = 0;
		double maior = Double.MIN_VALUE;
		double menor = Double.MAX_VALUE;
		double media;

		System.out.println("Entre com a temperatura");
		double temperaturas = scan.nextDouble();
		for (int i = 0; i < temperaturas; i++) {

			System.out.println("A temperatura " + i);
			temperatura = scan.nextDouble();

			soma += temperatura;

			if (temperatura > maior) {
				maior = temperatura;
			}
			if (temperatura <= menor) {
				menor = temperatura;
			}
		}
		media = soma / temperaturas;
		System.out.println("A média é: " + media);
		System.out.println("Menor temperatura: " + menor);
		System.out.println("Maior temperatura: " + maior);
		scan.close();
	}
}
