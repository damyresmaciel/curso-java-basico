package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class ifElse2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com sua idade");

		int idade = scan.nextInt();

		if (idade >= 18) {
			System.out.println("� maior idade.");
		} else {
			System.out.println("Nao � maior de idade");

		}

		// barato <= 10
		// 10 < 15 - pedir desconto
		// 15 <= valor 17 - pequisar mais
		// >= 17 - muito caro
		System.out.println();
		System.out.println("Entre com o pre�o do item: ");
		double valor = scan.nextDouble();

		if (valor <= 10) {
			System.out.println("Esta barato, pode comprar");
		} else if (valor < 10 && valor < 15) {
			System.out.println("Voc� pode pedir um desconto");
		} else if (valor >= 15 && valor < 17) {
			System.out.println("Pode pesquisar mais");
		} else { // valor >= 17
			System.out.println("Muito caro");
		}
		
		scan.close();

	}

}
