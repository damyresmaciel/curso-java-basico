package com.loiane.cursojava.aula14e15Exerc�cio;

import java.util.Scanner;

public class exercic�o05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Primeira nota:");
		double n1 = scan.nextDouble();
		
		System.out.println("segunda nota:");
		double n2 = scan.nextDouble();
		
		double m = (n1 + n2)/2;
		System.out.println("A media �: " + m);
		
		if(m >= 7 && m <9) {
			System.out.println("Aluno aprovado.");
		} else if (m < 7) {
			System.out.println("Aluno reprovado.");
		} else if (m == 10) {
			System.out.println("Aprovado com distin�ao");
			scan.close();
		}
	}
}