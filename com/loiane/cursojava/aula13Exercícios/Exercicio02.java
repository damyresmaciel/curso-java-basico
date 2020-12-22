package com.loiane.cursojava.aula13Exercícios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
        // digite um numero
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		String x = s.next();
		System.out.println("Voce digitou: " + x);
		
		s.close();
	}

}
