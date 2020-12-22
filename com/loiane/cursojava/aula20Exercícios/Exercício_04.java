package com.loiane.cursojava.aula20Exerc�cios;

import java.util.Scanner;

public class Exerc�cio_04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[][] compromissos = new String[31][24];

		boolean sair = false;
		byte opcao;
		while (!sair) {
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair");
			opcao = scan.nextByte();

			if (opcao == 1) {// adicionar compromisso

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do m�s: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia invalido, digite novamente");
					}
				}
				boolean horaValido = false;
				int hora = 0;
				while (!horaValido) {
					System.out.println("Entre com a hora do compromisso : ");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 24) {
						horaValido = true;
					} else {
						System.out.println("Hora invalido, digite novamente");
					}
				}
				dia--;
				System.out.println("Digite o compromisso: ");
				compromissos[dia][hora] = scan.next();
			} else if (opcao == 2) {// verificar compromisso
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do m�s: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia invalido, digite novamente");
					}
				}
				boolean horaValido = false;
				int hora = 0;
				while (!horaValido) {
					System.out.println("Entre com a hora do compromisso : ");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 24) {
						horaValido = true;
					} else {
						System.out.println("Hora invalido, digite novamente");
					}
				}
				dia--;
				System.out.println("O compromisso agendado �: ");
				System.out.println(compromissos[dia][hora]);

			} else if (opcao == 0) {
				sair = true;
			} else {
				System.out.println("Opcao invalida, digite novamente: ");
			}
		}
		scan.close();
	}
}
