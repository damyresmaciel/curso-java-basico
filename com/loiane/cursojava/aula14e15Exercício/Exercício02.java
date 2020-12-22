package com.loiane.cursojava.aula14e15Exercício;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um valor : ");
		int valor= scan.nextInt();
		
		if (valor >= 0) {
			System.out.println(valor + " É um  numero  positivo.");
		} else if( valor < 0){
			System.out.println(valor + " É um numero negativo.");
		}
		scan.close();
	}

}
