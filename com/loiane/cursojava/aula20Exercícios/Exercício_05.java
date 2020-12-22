package com.loiane.cursojava.aula20Exerc�cios;

import java.util.Scanner;

public class Exerc�cio_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][][] compromissos = new String[12][31][8];
		boolean sair = false;
		byte opcao;
		while (!sair) {
			System.out.println("Digite 1 para adicionar compromisso. ");
			System.out.println("Digite 2 para verificar compromisso. ");
			System.out.println("Digite 0 para sair. ");

			opcao = scan.nextByte();
			if (opcao == 1) {// adicionar compromisso
				boolean mesValido = false;
				int mes = 0;
				while (!mesValido) {
					System.out.println("Entre com o m�s: ");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12) {
						mesValido = true;
					} else {
						System.out.println("M�s inv�lido, digite novamente: ");
					}
				}
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia: ");
					if (dia > 0 && dia >= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido, digite novamente: ");
					}
				}
				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Entre com a hora do compromisso: ");
					hora = scan.nextInt();
					if (hora >= 0 && hora <= 8) {
						horaValida = true;
					} else {
						System.out.println("Hora invalida, digite novamente: ");
					}
				}
				dia--;
				mes--;
				System.out.println("Digite o compromisso");
				compromissos[mes][dia][hora] = scan.next();
			}
			if (opcao == 2) {
				boolean mesValido = false;
				int mes = 0;
				while (!mesValido) {
					if (mes >= 0 && mes >= 12) {
						mesValido = true;
					} else {
						System.out.println("M�s inv�lido, digite novamente:");
					}
				}
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					if (dia >= 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido, digite novamente: ");
					}
				}
				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					if (hora >= 0 && hora <= 8) {
						horaValida = true;
					} else {
						System.out.println("Hora inv�lida, digite novamente: ");
					}
				}
				dia--;
				mes--;
				System.out.println("Digite o compromisso: ");
				System.out.println(compromissos[mes][dia][hora]);
			}
			if (opcao == 0) {
				sair = true;
			} else {
				System.out.println("Op��o inv�lida, digite novamente: ");
			}
		}
		scan.close();
	}
}
