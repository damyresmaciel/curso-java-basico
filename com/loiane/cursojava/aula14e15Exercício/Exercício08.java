package com.loiane.cursojava.aula14e15Exerc�cio;

import java.util.Scanner;

public class Exerc�cio08 {
 // pre�o do produto
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com preco do primeiro produto");
		double p1 = scan.nextDouble();
	
		System.out.println("Entre com o preco do segundo produto");
		double p2 = scan.nextDouble();
		
		System.out.println("Entre com o preco do terceiro produto");
		double p3 = scan.nextDouble();
		
		
		if (p1 >= p2 && p1 >= p3) {
			System.out.println("pre�o 1 � o maior ");
		} else if (p2 >= p1 && p2 >= p3) {
			System.out.println("pre�o 2 � o maior ");
		} else if(p3 >= p1 && p3 >= p2)	{
			System.out.println("pre�o 3 � o maior ");
		}
		if (p1 <= p2 && p2 <= p3) {
			System.out.println("pre�o 1 � o menor, entao leve � o mais barato ");
		} else if ( p2 <= p1 && p2 <= p3) {
			System.out.println("pre�o 2 � o menor, entao leve � o mais barato ");
		} else if (p3 <= p2 && p3 <= p1) {
			System.out.println("pre�o 3 � o menor, entao leve � o mais barato");
			scan.close();

        }
	}
}