package com.loiane.cursojava.aula13Exerc�cios;

import java.util.Scanner;

public class Exerc�cio03 {

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
