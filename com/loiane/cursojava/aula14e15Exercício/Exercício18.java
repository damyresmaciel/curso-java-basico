package com.loiane.cursojava.aula14e15Exercício;

 import java.util.Scanner;

public class Exercício18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um valor");
		int v = scan.nextInt();
		
		if (v == 0) {
			System.out.println("O numero é igual zero ");
		} else if (v % 2 == 0 ){
			System.out.println ("E um numero par ");
		} else {
			System.out.println("É impar");
		}
		scan.close();
		}
	

}
