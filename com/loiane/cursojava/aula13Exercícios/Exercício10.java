package com.loiane.cursojava.aula13Exerc�cios;

import java.util.Scanner;

public class Exerc�cio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um valor para celsius: ");
		double celsius = scan.nextDouble();
        double farenheit = (celsius * 1.8) + 32;
		System.out.println("A temperatura " + celsius + " celsisus � igual a " + farenheit + " farenheit");
		scan.close();
	}

}
