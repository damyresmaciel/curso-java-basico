package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;

public class Exercício28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero: ");
		int num = scan.nextInt();
		
		boolean primo = true;
		for(int i =2; i <num; i++) {
		if(num%i==0) {
		 System.out.println("Nao é primo - divisível por " + i);
		 primo = false;
		}
	  }
		if(primo) {
			System.out.println("É numero primo");
		}
		scan.close();
	}
}