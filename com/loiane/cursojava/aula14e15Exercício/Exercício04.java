package com.loiane.cursojava.aula14e15Exercício;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com uma letra ");
		String input = scan.next();
		
		/*if (input.equalsIgnoreCase("a")){
			System.out.println("vogal");
		} else if(input.equalsIgnoreCase("e")) {
			System.out.println("vogal");
		} else if(input.equalsIgnoreCase("i")) {
			System.out.println("vogal");
		} else if(input.equalsIgnoreCase("o")) {
			System.out.println("vogal");
		} else if(input.equalsIgnoreCase("u")) {
			System.out.println("vogal");
		} else {
			System.out.println("consoante");
	}*/
	   if(input.length() >1) {
		   System.out.println("Nao é uma letra valida");
	   } else {
	   
	   switch (input) {
	   case "a" : System.out.println("vogal");break;
	   case "e" : System.out.println("vogal");break;
	   case "i" : System.out.println("vogal");break;
	   case "o" : System.out.println("vogal");break;
	   case "u" : System.out.println("vogal");break;
	   default: System.out.println("consoante");
	   scan.close();
	}
}
	}
}

