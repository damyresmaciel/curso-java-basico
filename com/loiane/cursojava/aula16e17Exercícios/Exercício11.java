package com.loiane.cursojava.aula16e17Exerc�cios;

import java.util.Scanner;

public class Exerc�cio11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
	
        System.out.println("Entre com um n�mero:");
       int num1= scan.nextInt();
     
        System.out.println("Entre com um n�mero m�ximo");
        int  num2 = scan.nextInt();
        
        int soma = 0;
        for( int i=num1; i<= num2; i++) {
        	soma += i;
        	
        }
        System.out.println("Soma: " + soma);
        scan.close();
	}
}
