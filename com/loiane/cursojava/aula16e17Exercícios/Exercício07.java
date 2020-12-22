package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;

public class Exercício07 {

	public static void main(String[] args) {
		// mostre 5 numero e mostre o maior
		Scanner scan = new Scanner(System.in);
		int num;
		int maior = Integer.MIN_VALUE;
		
		for(int i=0; i<5; i++) {
			System.out.println("Entre com um numero:");
			num = scan.nextInt();
			if(num > maior) {
				maior = num;
			  }
			}
		System.out.println("O maior numero digitado foi: "+ maior);
		
        /* int num1,num2, num3,num4,num5;
         
         /* System.out.println("Entre com um numero:");
          num1 = scan.nextInt();
          System.out.println("Entre com um segundo numero:");
          num2 = scan.nextInt();
          System.out.println("Entre com terceiro numero:");
          num3 = scan.nextInt();
          System.out.println("Entre com o quarto numero:");
          num4 = scan.nextInt();
          System.out.println("Entre com o quinto numero");
          num5 = scan.nextInt();
          if(num1>=num2 && num1>=num3 &&num1>=num4 && num1>=num5) {
        	  System.out.println("Numero 1 é o maior " + num1);
          } else if(num2>=num1 && num2>=num3 && num2>=num4 && num2>=num5) {
        	  System.out.println("Numero 2 é o maior " + num2);
          } else if(num3>=num1 && num3>=num2 && num3>=num4 && num3>=num5) {
        	  System.out.println("Numero 3 é o maior " + num3);
          } else if(num4>=num1 && num4>=num2 && num4>=num3 && num4>=num5) {
        	  System.out.println("Numero 4 é o maior " + num4);
          } else if(num5>=num1 && num5>=num2 && num5>=num3 && num5>=num4) {
        	  System.out.println("Numero 5 é o maior " + num5);*/
		scan.close();
          }
	
	}

