package com.loiane.cursojava.aula14e15Exercício;

import java.util.Scanner;

public class Exercício19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com primeiro numero: ");
		int num1 = scan.nextInt();

		System.out.println("Entre com segundo numero: ");
		int num2 = scan.nextInt();

		System.out.println("Qual é a operaçao? ");
		 String operacao = scan.next();

		switch (operacao) {
		case "+":
			int resultado = num1 + num2;
			System.out.println("O resultado  é: " + num1 + " + " + num2 + " = " + resultado);
	
			if (resultado % 2 == 0) {
				System.out.println("par");
			} else {
				System.out.println("impar");
			}

			if (resultado == 0) {
				System.out.println("zero");
			} else if (resultado < 0) {
				System.out.println("negativo");
			}else {
				System.out.println("positivo");
			}
			break;

		case "-":
			resultado = num1 - num2;
			System.out.println("O resultado é; " + num1 + " - " + num2 + " = " + resultado);
			if(resultado % 2==0) {
				System.out.println("par");
			} else {
				System.out.println("impar");
			}
			if(resultado ==0){
				System.out.println("zero");
			} else if(resultado < 0) {
				System.out.println("negativo");
			} else {
				System.out.println("positivo");
				
			}
			break;
			
		case "*":
			resultado = num1 * num2;
			System.out.println("O resultado é: " + num1 +  " * " + num2 + " = " + resultado);
			if(resultado % 2==0) {
				System.out.println("par");
			} else {
				System.out.println("impar");
			}
			if(resultado==0){
				System.out.println("zero");
			} else if(resultado < 0){
				System.out.println("negativo");
			}else {
				System.out.println("positivo");
			}
			break;
			
		case "/":
			resultado = num1 / num2;
			System.out.println("O resultado é: " + num1 + " / "+ num2 + " = " + resultado);
			if(resultado %2==0){
				System.out.println("par");
			} else {
				System.out.println("impar");
			}
			if(resultado ==0) {
				System.out.println("zero");
			} else if(resultado < 0) {
				System.out.println("negativo");
			}else {
				System.out.println("positivo");	
			}
			break;
		}
		scan.close();

	}
}
