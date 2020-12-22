package com.loiane.cursojava.aula20Exerc�cios;

import java.util.Scanner;

public class Exerc�cio006 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		char[][] jogoVelha = new char[3][3];
		System.out.println("jogador 1 = X ");
		System.out.println("jogador 2 = O ");

		boolean ganhou = false;
		int jogada = 0;
		char sinal;
		int linha = 0;
		int coluna = 0;
		while (!ganhou) {
			if (jogada % 2 == 1) {
				System.out.println("Vez do jogaodor 1. Escolha a linha e a coluna (1-3). ");
				sinal = 'X';
			} else {
				System.out.println("Vez do jogador 2. Escolha a linha e a coluna (1-3). ");
				sinal = 'O';
			}
			boolean linhaValida = false;
			while (!linhaValida) {
				System.out.println("Entre com a linha (1-3).");
				linha = scan.nextInt();
				if (linha >= 1 && linha <= 3) {
					linhaValida = true;
				} else {
					System.out.println("Entrada inv�lida, tente novamente. ");
				}
			}
			boolean colunaValida = false;
			while (!colunaValida) {
				System.out.println("Entre com a coluna (1-3). ");
				coluna = scan.nextInt();
				if (coluna >= 1 && coluna <= 3) {
					colunaValida = true;
				} else {
					System.out.println("Entrada inv�lida, tente novamente. ");
				}
			}
			linha--;
			coluna--;
			if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
				System.out.println("Posi��o j� usada. Tente novamente ");
			} else {// jogada v�lida
				jogoVelha[linha][coluna] = sinal;
				jogada++;
			}
			for (int i = 0; i < jogoVelha.length; i++) {
				for (int j = 0; j < jogoVelha[i].length; j++) {
					System.out.print(jogoVelha[i][j] + "|");
				}
				System.out.println();
			}
			// verificar ganhador
			if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X') || // linha 1
					(jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') || // linha2
					(jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') || // linha3
					(jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') || // coluna1
					(jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') || // coluna2
					(jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') || // coluna3
					(jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X')) { // diagonal
				ganhou = true;
				System.out.println("Parab�ns, jogador 1 ganhou!");

			} else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O') || // linha 1
					(jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') || // linha2
					(jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') || // linha3
					(jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') || // coluna1
					(jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') || // coluna2
					(jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') || // coluna3
					(jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O')) { // diagonal
				ganhou = true;
				System.out.println("Parab�ns, jogador 2 ganhou!");
			} else if (jogada > 9) {
				ganhou = true;
				System.out.println("Ningu�m ganhou essa partida.");

			}

		}
		scan.close();

	}
}