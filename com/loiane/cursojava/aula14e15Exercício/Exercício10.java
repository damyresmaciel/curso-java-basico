package com.loiane.cursojava.aula14e15Exercício;

import java.util.Scanner;

public class Exercício10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual turno voce trabalha? ");
		String turno = scan.next();
		
		/*if(input.equalsIgnoreCase("M")) {
			System.out.println("matutino. Bom dia!");
		} else if(input.equalsIgnoreCase("V")) {
			System.out.println("Vespertino. Boa tarde!");
		} else if(input.equalsIgnoreCase("N")) {
			System.out.println("Noturno. Boa noite!");
		} else {
			System.out.println("Inválido");*/

		switch(turno) {
		case "m":
		case "M":System.out.println("Bom dia!");break;
		case "v":
		case "V":System.out.println("Boa tarde!");break;
		case "n": 
		case "N":System.out.println("Boa noite!");break;
		default:System.out.println("Valor ínvalido");
		}scan.close();
       System.out.println("Turno que voce trabalha" + turno);
	}

}
