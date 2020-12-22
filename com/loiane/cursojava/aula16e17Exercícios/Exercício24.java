package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;

public class Exercício24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Preco do pao;: 0.18");
		System.out.println("Panificadora Pao de ontem - Tabela de precos: ");
		for( int i=1; i<=50; i++) {
			System.out.println(i + " -R$ "+ (0.18*i));
			scan.close();
		}
	}

}
