package com.loiane.cursojava.aula34Exerc�cios;

import java.util.Scanner;

public class Exerc�cio03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		do {
			System.out.println("Entre com um numero positivo");
			num = scan.nextInt();
			if(num<0) {
				System.out.println("N�mero inv�lido. Tente novamente ");
			}
		} while(num<0);
		
		System.out.println(Calculadora.fatorial(num));
		
    }
}
