package com.loiane.cursojava.aula16e17Exerc�cios;

import java.util.Scanner;

public class Exerc�cio20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Entre com um numero de idades: ");
		int idades = scan.nextInt();
		
		double idade=0;
		double media;
		double soma=0;
		
		for(int i=0; i<idades; i++) {
			System.out.println("Entre com a idade " + (i+1));
			idade = scan.nextInt();
			
			soma += idade;
		}
		media = soma/idades;
		if(media>=0 && media<=5) {
			System.out.println("A turma � jovem");
		} else if(media>25 && media<=60) {
			System.out.println("A turma � adulta");
		} else {
			System.out.println("A turma � idosa");
		}
		scan.close();
	}

}
