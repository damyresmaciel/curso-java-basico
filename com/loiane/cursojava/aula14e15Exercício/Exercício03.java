package com.loiane.cursojava.aula14e15Exercício;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com uma letra (F ou M):");
		String input = scan.next();
		
		if (input.equalsIgnoreCase("f")){
			System.out.println("sexo feminino");
		} else if (input.equalsIgnoreCase("m")) {
			System.out.println("sexo masculino");
		} else {
			System.out.println("sexo inválido");
		} 
		scan.close();	
	}
	
			
	}
		
	

