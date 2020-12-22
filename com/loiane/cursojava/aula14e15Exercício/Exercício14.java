package com.loiane.cursojava.aula14e15Exercício;

import java.util.Scanner;

public class Exercício14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Primeira nota");
		double n1 = scan.nextDouble();
		
		System.out.println("Segunda nota");
		double n2 = scan.nextDouble();
		
		double m = (n1 + n2)/2;
		String aproveitamento = "";
		System.out.println("Media é: " + m);
		if(m >= 9 && m <=10) {
			aproveitamento = "A";
		} else if (m >= 7.5 && m < 9){
			aproveitamento = "B";
		} else if (m >= 6 && m < 7.5){
			aproveitamento = "C";
		} else if (m >= 4 && m < 6){
			aproveitamento = "D";
		} else if (m >= 0 && m < 4) {
			aproveitamento = "E";
		}
		
		System.out.println("Nota 1: " + n1);
		System.out.println("Nota 2: " + n2);
		System.out.println("Media: " + m);
		System.out.println("Conceito: " + aproveitamento);
		
			
		switch (aproveitamento) {
		case "A":
		case "B":
		case "C": System.out.println("Aprovado");break;
		case "D":
		case "E":System.out.println("Reprovado");break;
		}
			scan.close();	
		}
		
		}
