package com.loiane.cursojava.aula16e17Exerc�cios;

import java.util.Scanner;

public class Exerc�cio18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int num;
		System.out.println("Entre com um numero");
		num = scan.nextInt();
		
		boolean primo = true;
		
		for(int i=2; i<num; i++) {
		if(num % i==0) {
			System.out.println("Nao � primo - divis�vel por " + i );
			primo = false;
			//break;
		} 
	}
		if(primo) {
		System.out.println("� numero primo");
		
     scan.close();
	}
   } 
}
