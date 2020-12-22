package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;

public class Exercício14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		int num;
		int pares=0;
		int impares=0;
		for(int i=0; i<=10; i++) {
			System.out.print("Entre com um numero: ");
			num= scan.nextInt();
			if(num%2==0) {
				pares++;
			} else {
				impares++;
			}
		}
		System.out.println("Pares: " + pares);
		System.out.println("Impares: " + impares);
		
		/*int num1, num2 , num3 , num4 , num5 ,num6 , num7, num8, num9,num10;
		int contePar=0,  conteImpar=0;
		System.out.print ("Entre com o primeiro numero ");
		num1= scan.nextInt();
		if(num1%2==0){
			contePar++;
		}else {
			conteImpar++;
		}
		System.out.print ("Entre com o segundo numero ");
		num2= scan.nextInt();
		if(num2%2==0){
			contePar++;
		}else {
			conteImpar++;
		}
		System.out.print ("Entre com o terceiro numero ");
		num3= scan.nextInt();
		if(num3%2==0){
			contePar++;
		}else {
			conteImpar++;
		}
		System.out.print("Entre com o quarto numero ");
		num4= scan.nextInt();
		if(num4%2==0){
			contePar++;
		}else {
			conteImpar++;
		}
		System.out.print ("Entre com o quinto numero ");
		num5= scan.nextInt();
		if(num5%2==0){
			contePar++;
		}else {
			conteImpar++;
		}
		System.out.print ("Entre com o sexto numero ");
		num6= scan.nextInt();
		if(num6%2==0){
			contePar++;
		}else {
			conteImpar++;
		}
		System.out.print("Entre com o setimo numero ");
		num7= scan.nextInt();
		if(num7%2==0){
			contePar++;
		}else {
			conteImpar++;
		}
		System.out.print("Entre com o oitavo numero ");
		num8= scan.nextInt();
		if(num8%2==0){
			contePar++;
		}else {
			conteImpar++;
		}
		System.out.print ("Entre com o nono numero ");
		num9= scan.nextInt();
		if(num9%2==0){
			contePar++;
		}else {
			conteImpar++;
		}
		System.out.print ("Entre com o decimo numero ");
		num10= scan.nextInt();
		if(num10%2==0){
			contePar++;
		}else {
			conteImpar++;
		}
		System.out.println("Quantidade de pares " + contePar);
		System.out.println("Quantidade de impares " + conteImpar);*/
		scan.close();
	
		}
	}

