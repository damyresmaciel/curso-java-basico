package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;

public class Exercício30 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com tabuada de: ");
		int num = scan.nextInt();

		int numInicio, numFinal;
		boolean invalido= true;
		do {
			System.out.print("Entre como inicio da tabuada: ");
			numInicio= scan.nextInt();
			
			System.out.print("Entre como final da tabuada: ");
			numFinal =scan.nextInt();
			
		
			if(numFinal>numInicio) {
			 invalido=false;
		}
			
		} while (invalido);
		
		System.out.println("Tabuada de " + num + ":");
		System.out.println("Começar por: "+ numInicio + ".");
		System.out.println("Terminar em: "+ numFinal + ".");
		System.out.println();
		
		for(int i=numInicio; i<=numFinal; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
	   }
		scan.close();
	}
}
