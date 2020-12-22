package com.loiane.cursojava.aula13Exercícios;

import java.util.Scanner;

public class Exercício11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

	      // numeros inteiros e real
    	System.out.print("Digite um primeiro valor para inteiro: ");
		int v1 = scan.nextInt();
		
		System.out.print("Digite um segundo valor para inteiro: ");
		int v2 = scan.nextInt();
		
		System.out.print("Digite um valor para real: ");
		double r = scan.nextDouble();
		
		int resultado1 = (v1*2) * (v2/2);
	    double resultado2 = (v1 * 3) + r;
	    double resultado3 =Math.pow (r,r);
	    System.out.println("resultado1 "+ resultado1);
	    System.out.println("resultado2 "+ resultado2);
	    System.out.println("resultado3 "+ resultado3);
	    scan.close();
	}
	
}
