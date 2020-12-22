package com.loiane.cursojava.aula13Exercícios;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
		 // valor de pi
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o raio do circulo: ");
		double r = scan.nextDouble();
		double a = Math.PI * Math.pow (r,2);
		System.out.println(" A area do circulo é: " + a);
		scan.close();
	}
}
