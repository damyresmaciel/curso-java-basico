package com.loiane.cursojava.aula27Exercícios;

import java.util.Scanner;

public class Exemp04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		JogoVelha jogo = new JogoVelha();
		
		System.out.println("Jogador 1= X");
		System.out.println("Jogador 2= O");
		
		boolean ganhou = false;
		char sinal;
		int linha = 0, coluna = 0;
		
		while(!ganhou) {
			if(jogo.vezJogador1()) {
				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3). ");
				sinal= 'X';
			} else {
				System.out.println("Vez do jogador 2. Ecolha linha e coluna (1-3).");
				sinal = 'O';
			}
			
		}
	}
   int valor(String tipoValor, Scanner scan) {
	   int valor=0;
	   boolean valorValida = false;
		while (!valorValida) {
			System.out.println("Entre com a " + tipoValor + "(1, 2 ou 3 )");
			valor = scan.nextInt();
			if (valor >= 1 && valor <= 3) {
				valorValida = true;
			} else {
				System.out.println("Entrada inválida, tente novamente ");
				valorValida = false;
			}
		}
		return valor;
   }
}
