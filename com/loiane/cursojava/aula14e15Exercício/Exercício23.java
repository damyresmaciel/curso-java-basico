package com.loiane.cursojava.aula14e15Exerc�cio;

import java.util.Scanner;

public class Exerc�cio23 {

	public static void main(String[] args) {
		double v= 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o tipo de carne: ");
		System.out.println("1 - File duplo");
		System.out.println("2- alcatra");
		System.out.println("3 - picanha");
		int tipo = scan.nextInt();
		
		System.out.println("Entre com a quantidade (kg):");
		double qtd = scan.nextDouble();
		
		double precoKg= 0;
		
		if(tipo==1) {
			
			System.out.println(qtd + "Kg - alcatra");
		
			if(qtd <5) {
				precoKg = 4.9;
			} else {
				precoKg = 5.8;
			}
			
		} else if(tipo==2) {
		    System.out.println(qtd + "Kg - file duplo");
		    
			if(qtd <5){
				precoKg= 5.9;
			} else {
				precoKg= 6.8;	
			}
	    } else if(tipo==3) {
	    	
	        System.out.println(qtd + "Kg - picanha");
	    	
		    if(qtd <5) {
				precoKg= 6.9;
			}else {
				precoKg=7.8;
			}
		}
		double total = qtd * precoKg;
		System.out.println(qtd + "Kg * " + precoKg + "=" + total);
		
		System.out.println("Compra no cartao? digite 1 para sim: ");
		int cartao = scan.nextInt();
		
		if(cartao == 1) {
			double desconto = (total/100) * 5;
			System.out.println("Desconto de: " + desconto);
			System.out.println("Valor a pagar: " + (total - desconto));
		} else {
			System.out.println("Valor a pagar: " + total);
		} scan.close(); 
	}
}



