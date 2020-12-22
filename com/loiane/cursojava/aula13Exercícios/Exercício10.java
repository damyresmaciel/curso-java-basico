package com.loiane.cursojava.aula13Exercícios;

import java.util.Scanner;

public class Exercício10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor para celsius: ");
		double celsius = scan.nextDouble();
        double farenheit = (celsius * 1.8) + 32;
		System.out.println("A temperatura " + celsius + " celsisus é igual a " + farenheit + " farenheit");
		scan.close();
	}

}
