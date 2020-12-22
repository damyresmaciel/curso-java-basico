package com.loiane.cursojava.aula13Exercícios;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
		
		// soma
		 Scanner s = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int x = s.nextInt();
		
		System.out.print("Digite um segundo numero: ");
		int n = s.nextInt();
		
		int resultado = x + n;
		System.out.print("Resultado: " + resultado);
		s.close();

	}

}
