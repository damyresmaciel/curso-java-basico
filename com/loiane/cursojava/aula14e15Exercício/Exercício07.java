package com.loiane.cursojava.aula14e15Exerc�cio;

import java.util.Scanner;

public class Exerc�cio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um primeiro  valor");
		int v1 = scan.nextInt();
		
		System.out.println("Entre com o segundo valor");
		int v2 = scan.nextInt();
		
		System.out.println("entre com o terceiro valor");
		int v3 = scan.nextInt();
		
		if (v1 >= v2 && v1 >= v3) {
			System.out.println("v1 � maior " + v1);
		} else if(v2 >= v1 && v2 >= v3) {
			System.out.println("v2 � maior " + v2);
		} else if (v3 >= v1 && v3 >= v2) {	
			System.out.println("v3 � maior " + v3);
			scan.close();
		}
		
		

	}

}
