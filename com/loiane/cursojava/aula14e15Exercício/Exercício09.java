package com.loiane.cursojava.aula14e15Exercício;

import java.util.Scanner;

public class Exercício09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	    System.out.println("Entre com um numero");
	    int num1 = scan.nextInt();
	
	    System.out.println("Entre com um segundo numero");
	    int num2 = scan.nextInt();
	
	    System.out.println("Entre com um segundo numero");
	    int num3 = scan.nextInt();
		
        if (num1 > num2 && num2 > num3) {
        	System.out.println("ordem " +  num1+ num2 + num3);
        } else if (num2 > num3 && num3 > num1 ) {
        	System.out.println("ordem "  + num2 + num3+ num1);
        } else if (num3 > num2 && num2 > num1) {
        	System.out.println("ordem " + num3 + num2 + num1);
        } else if(num2 > num1 && num1 > num3) {
        	System.out.println( "Ordem " + num2 + num1 + num3);
        }
        scan.close();
	}

}
