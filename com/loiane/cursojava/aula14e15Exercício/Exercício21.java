package com.loiane.cursojava.aula14e15Exerc�cio;

import java.util.Scanner;

public class Exerc�cio21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double litro, precoAjustado, precoTotal;
		double ajuste1 = 0.03;
		double ajuste2 = 0.05;
		double ajuste3 = 0.04;
		double ajuste4 = 0.06;
		double precoGasolina = 2.50;
		double precoAlcool = 1.90;
		System.out.println("Quantos litros de alcool: ? ");
		litro  = scan.nextDouble();
	
		if (litro <= 20){
			precoAjustado = precoAlcool + (precoAlcool *ajuste1);
			System.out.println("O desconto por litro ser� de  " +  ajuste1);
			System.out.println("O valor por litro ser� de " + (precoAlcool - ajuste1));
			precoTotal = litro * precoAjustado;
			System.out.println("O valor total �: " + precoTotal);
		} else if(litro > 20) {
			precoAjustado = precoAlcool + (precoAlcool * ajuste2);
			System.out.println("O desconto por litro ser� de " + ajuste2);
			System.out.println("O valor sera por litro sera de " + (precoAlcool  - ajuste2));
			precoTotal = litro * precoAjustado;
			System.out.println("O valor total �: " + precoTotal);
		}
		 
		System.out.println("Quantos litros de gasolina? ");
		litro = scan.nextDouble();
		
		if(litro <= 20) {
			precoAjustado = precoGasolina + (precoGasolina * ajuste3);
			System.out.println("O desconto por litro sera de " + ajuste3);
			System.out.println("O valor por litro sera de " + (precoGasolina - ajuste3));
			precoTotal = litro * precoAjustado;
			System.out.println("O valor total � " + precoTotal);
		} else if  (litro > 20) {
			precoAjustado = precoGasolina + (precoGasolina * ajuste4);
			System.out.println("O desconto por litro de gasolina ser� de " + ajuste4);
			System.out.println("O valor por litro sera de " + (precoGasolina - ajuste4));
			precoTotal = litro * precoAjustado;
			System.out.println("O valor total � " + precoTotal);
		}
		scan.close();
	   }
	}
	


