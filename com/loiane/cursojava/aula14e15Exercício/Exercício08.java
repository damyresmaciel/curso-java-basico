package com.loiane.cursojava.aula14e15Exercício;

import java.util.Scanner;

public class Exercício08 {
 // preço do produto
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com preco do primeiro produto");
		double p1 = scan.nextDouble();
	
		System.out.println("Entre com o preco do segundo produto");
		double p2 = scan.nextDouble();
		
		System.out.println("Entre com o preco do terceiro produto");
		double p3 = scan.nextDouble();
		
		
		if (p1 >= p2 && p1 >= p3) {
			System.out.println("preço 1 é o maior ");
		} else if (p2 >= p1 && p2 >= p3) {
			System.out.println("preço 2 é o maior ");
		} else if(p3 >= p1 && p3 >= p2)	{
			System.out.println("preço 3 é o maior ");
		}
		if (p1 <= p2 && p2 <= p3) {
			System.out.println("preço 1 é o menor, entao leve é o mais barato ");
		} else if ( p2 <= p1 && p2 <= p3) {
			System.out.println("preço 2 é o menor, entao leve é o mais barato ");
		} else if (p3 <= p2 && p3 <= p1) {
			System.out.println("preço 3 é o menor, entao leve é o mais barato");
			scan.close();

        }
	}
}