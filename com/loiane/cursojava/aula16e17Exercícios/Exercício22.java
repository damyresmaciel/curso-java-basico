package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;

public class Exercício22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

	System.out.println("Entre com a quantidade  cd:");
	int cds = scan.nextInt();
	double preco;
	double soma=0;
	for(int i=1; i<=cds; i++) {
		System.out.println("Informe o valor do cde "+ i);
		preco = scan.nextDouble();
		
		soma +=preco;
	}
	double media = soma/cds;
	System.out.println("Media gasta com cada cd: "+ media);
	scan.close();
	}

}
