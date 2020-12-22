package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int popA = 80000;
		int	popB= 200000;
		int cont = 0;
      
		  while (popA <=popB) {
			  
			  popA += (popA /100 ) * 3;
			  popB += (popB/100) * 1.5;
			  cont++;
	     }
		  System.out.println("popA: " +  popA);
		  System.out.println("popB: " +  popB);
		  System.out.println("Qtd:  " +  cont);
		  scan.close();
	}
}
