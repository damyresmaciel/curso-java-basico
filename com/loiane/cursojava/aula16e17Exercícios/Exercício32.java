package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;

public class Exercício32 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean naoTerminar = true;
		int cod, qtd;
		double total = 0;
		String output = "";

		do {
			System.out.println("Digite o codigo e a quantidade. Digite ");
			cod = scan.nextInt();
			qtd = scan.nextInt();
			if (cod == 00 && qtd == 00) {
				naoTerminar = false;
				output += "Total a pagar = " + total;
			} else {
				if (cod == 100) {
					output += "cachorro Quente -> 1.20 * " + qtd;
					output += " = " + (1.2 * qtd) + "\n";
					total += 1.2 * qtd;
				} else if (cod == 101) {
					output += "Bauru Simples  -> 1.30 * " + qtd;
					output += " = " + (1.3 * qtd) + "\n";
					total += 1.3 * qtd;
				} else if (cod == 102) {
					output += "Bauru com ovo -> 1.50 * " + qtd;
					output += " = " + (1.5 * qtd) + "\n";
					total += 1.5 * qtd;
				} else if (cod == 103) {
					output += "Hambúrguer -> 1.20 * " + qtd;
					output += " = " + (1.2 * qtd) + "\n";
					total += 1.2 * qtd;
				} else if (cod == 104) {
					output += "Cheeseburguer -> * 1.30 " + qtd;
					output += " = " + (1.3 * qtd) + "\n";
					total += 1.3 * qtd;
				} else if (cod == 105) {
					output += "Refrigerante -> * 1.00 " + qtd;
					output += " = " + (1.0 * qtd) + "\n";
					total += 1.0 * qtd;
				}

			}
		} while (naoTerminar);
		System.out.println(output);
		scan.close();
	}
}
