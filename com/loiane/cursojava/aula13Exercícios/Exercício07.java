package com.loiane.cursojava.aula13Exerc�cios;

import java.util.Scanner;

public class Exerc�cio07 {

	public static void main(String[] args) {
		
		// area = lado * lado
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o lado do quadrado: ");
		double lado = scan.nextDouble();
		 
		double area = Math.pow (lado,2);
		System.out.println("A area do quadrado �: " + area);
		System.out.println("O dobro do quadrado �: " + (area *2));
		scan.close();
	}
}
