package com.loiane.cursojava.aula13Exerc�cios;

import java.util.Scanner;

public class Exerc�cio06 {

	public static void main(String[] args) {
		 // valor de pi
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o raio do circulo: ");
		double r = scan.nextDouble();
		double a = Math.PI * Math.pow (r,2);
		System.out.println(" A area do circulo �: " + a);
		scan.close();
	}
}
