package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;

public class Exercício12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int i=1, max= 10;
		int tabuada;
		int resultado;
		System.out.println("Entre com a tabuade de: ");
		tabuada = scan.nextInt();
		
		while (i<=max) {
			resultado = i*tabuada;
			System.out.println( i + " * "+ tabuada + " = " + resultado);
			i++;	
		}
     scan.close();
	}

}
