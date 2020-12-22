package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;

public class Exercício06 {

	public static void main(String[] args) {
		// contando de 1-20
		Scanner scan = new Scanner (System.in);

		/*int i = 1; //count ou cont
		int max =20;
		
		System.out.println("Conte até: " +  max);
	    /*while(i <= max) {
		  System.out.println("Valor de i " + i);
		  i++; // i= i+1 ou i+=1
	    }
	    System.out.println(i);*/
		for (int i=1; i<=20; i++) {
			//System.out.println(i);
			System.out.print(i + "-");
		}
	    scan.close();
	}	
}


