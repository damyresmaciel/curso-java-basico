package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;

public class Exercício19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int notas;
		System.out.println("Entre com o numero de notas");
		notas = scan.nextInt();
		
		double soma=0;
		double media;
		double nota = 0;
		for(int i=0; i<notas; i++) {
			System.out.println("Entre com a nota "+ (i+1));
			nota = scan.nextDouble();
			
			soma += nota;
		}
		media= soma/notas;
		System.out.println("A media por turma: "+ media);
		scan.close();
	}
}
