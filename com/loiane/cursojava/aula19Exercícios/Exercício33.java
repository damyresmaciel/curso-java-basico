package com.loiane.cursojava.aula19Exerc�cios;

import java.util.Scanner;

public class Exerc�cio33 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com a posi�ao A= " + i);
			vetorA[i] = scan.nextInt();
		}
		boolean primo;
		String msg;
		for (int i = 0; i < vetorA.length; i++) {
			primo = true;
			for (int j = 2; j < vetorA[i]; j++) {
				if (vetorA[i] % j == 0)
					primo = false;
				break;
			}

			msg = " ";
			if (primo) {
				msg = " primo";
			} else {
				msg = "N�o � primo";
			}

			System.out.println(vetorA[i] + msg);
			scan.close();
		}
	}
}
