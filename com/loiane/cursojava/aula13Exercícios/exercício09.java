package com.loiane.cursojava.aula13Exerc�cios;

import java.util.Scanner;

public class exerc�cio09 {

	public static void main(String[] args) {
	 
		Scanner scan = new Scanner (System.in);

		// farenheit / celsius
		System.out.println("Digite um valor para farenheit: ");
		double farenheit = scan.nextDouble();
		
	    double celsius = (5* (farenheit - 32)) / 9;
		
		System.out.println("A temperatura " + farenheit + " farenheit � igual a " + celsius + " celsius ");
		scan.close();
	}
}
