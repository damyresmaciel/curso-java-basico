package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;

public class Exercício10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1, num2;
        System.out.println("Entre com numero:");
        num1 = scan.nextInt();
     
        System.out.println("Entre com um segundo numero");
        num2 = scan.nextInt();
        for(int i=num1; i<=num2; i++ ) {
        	System.out.println(i);
	   }  scan.close();
	}
}
