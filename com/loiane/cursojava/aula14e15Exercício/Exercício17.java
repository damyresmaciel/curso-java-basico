package com.loiane.cursojava.aula14e15Exerc�cio;

import java.util.Scanner;

public class Exerc�cio17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o ano");
		int ano = scan.nextInt();
		
		if (ano%4==0 && ano%100!=0 || ano%400==0){
			System.out.println(ano + " � bissexto");
		} else { 
			System.out.println(ano + " nao � bissexto");
		}
		scan.close();
		}
	}
