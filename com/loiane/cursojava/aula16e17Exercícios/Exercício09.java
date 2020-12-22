package com.loiane.cursojava.aula16e17Exercícios;

public class Exercício09 {

	public static void main(String[] args) {
		
		int i = 0;
		int max = 50;
		System.out.println("Mostre os impares ate " + max);
		while(i<=max) {
	
			if (i %2!=0 ) {
		    	  System.out.println(i);
		      }
			i++;
		}
	}
}

