package com.loiane.cursojava.aula14e15Exerc�cio;

import java.util.Scanner;

public class Exerc�cio02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor : ");
		int valor= scan.nextInt();
		
		if (valor >= 0) {
			System.out.println(valor + " � um  numero  positivo.");
		} else if( valor < 0){
			System.out.println(valor + " � um numero negativo.");
		}
		scan.close();
	}

}
