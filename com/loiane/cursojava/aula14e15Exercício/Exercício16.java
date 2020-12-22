package com.loiane.cursojava.aula14e15Exercício;

import java.util.Scanner;

public class Exercício16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 
		System.out.println("Entre com valor de a:");
		int a = scan.nextInt();
		if(a==0) {
			System.out.println("Nao é equacao do segundo grau");
		} else {
			
			System.out.println("Entre com valor de b:");
			int b =scan.nextInt();
			
			System.out.println("Entre com o valor de c:");
			int c = scan.nextInt();
			
			int delta = (b*b) - ( 4 * a * c);

			if(delta<0) {
				System.out.println("Delta negativo");
			} else {
				System.out.println("Delta: "+ delta);
				double x1= (-b + Math.sqrt(delta))/( 2*a);
				double x2 =(b + Math.sqrt(delta))/ (2*a);
				System.out.println("X1 = " + x1);
				System.out.println("X2 = " + x2);
			}
		}scan.close();
	}

}
