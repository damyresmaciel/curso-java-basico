package com.loiane.cursojava.aula13Exercícios;

import java.util.Scanner;

public class Exercício07 {

	public static void main(String[] args) {
		
		// area = lado * lado
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o lado do quadrado: ");
		double lado = scan.nextDouble();
		 
		double area = Math.pow (lado,2);
		System.out.println("A area do quadrado é: " + area);
		System.out.println("O dobro do quadrado é: " + (area *2));
		scan.close();
	}
}
