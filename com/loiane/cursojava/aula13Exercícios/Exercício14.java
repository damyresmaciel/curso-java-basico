package com.loiane.cursojava.aula13Exerc�cios;

import java.util.Scanner;

public class Exerc�cio14 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Entre com o tamnaho do arquivo: ");
		double tamArquivo = scan.nextDouble();
		
		System.out.println("Entre com a velocidade da internet: ");
		double velocidade = scan.nextDouble();
		
		double tempo = tamArquivo / velocidade;
		
		System.out.println("Tempo de download: "+ tempo);
		scan.close();
	}
}
