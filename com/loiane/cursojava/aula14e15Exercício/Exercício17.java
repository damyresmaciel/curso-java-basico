package com.loiane.cursojava.aula14e15Exercício;

import java.util.Scanner;

public class Exercício17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o ano");
		int ano = scan.nextInt();
		
		if (ano%4==0 && ano%100!=0 || ano%400==0){
			System.out.println(ano + " é bissexto");
		} else { 
			System.out.println(ano + " nao é bissexto");
		}
		scan.close();
		}
	}
