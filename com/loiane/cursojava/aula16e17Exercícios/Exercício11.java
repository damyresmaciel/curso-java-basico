package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;

public class Exercício11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
	
        System.out.println("Entre com um número:");
       int num1= scan.nextInt();
     
        System.out.println("Entre com um número máximo");
        int  num2 = scan.nextInt();
        
        int soma = 0;
        for( int i=num1; i<= num2; i++) {
        	soma += i;
        	
        }
        System.out.println("Soma: " + soma);
        scan.close();
	}
}
