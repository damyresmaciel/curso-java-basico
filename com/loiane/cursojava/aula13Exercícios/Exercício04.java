package com.loiane.cursojava.aula13Exerc�cios;

import java.util.Scanner;

public class Exerc�cio04 {

	public static void main(String[] args) {
		// soma + divisao
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a primeira nota");
		double n1 = s.nextDouble();
		
		System.out.println("Digite a segunda nota");
		double n2 = s.nextDouble();
		
		System.out.println("Digite a terceira nota");
		double n3 = s.nextDouble();
		
		System.out.println("Digite a quarta nota");
		double n4 = s.nextDouble();
		
		double media =( n1 + n2 + n3 +n4 )/ 4;
		System.out.println("Media: " + media);
		s.close();

	}

}

