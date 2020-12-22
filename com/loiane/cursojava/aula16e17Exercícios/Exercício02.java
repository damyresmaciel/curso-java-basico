package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean infoValidas = false;
		String nomeUser,
		       senha;

		do {
			System.out.println("Entre com nome do usuario");
		    nomeUser = scan.next();
			
			System.out.println("Entre com a senha do usuario");
			senha = scan.next();
		
			if(nomeUser.equalsIgnoreCase(senha)) {
				infoValidas = false;
				System.out.println("Senha igual usuario , digite novamente");
			} else {
				infoValidas = true;
				System.out.println("Senha e usuarios validos. ");
			}
		} while(!infoValidas);
		scan.close();
	} 
}	
