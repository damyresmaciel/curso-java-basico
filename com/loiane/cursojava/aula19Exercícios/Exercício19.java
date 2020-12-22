package com.loiane.cursojava.aula19Exercícios;

import java.util.Scanner;

public class Exercício19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] resultados = new double[notas1.length];

		for (int i = 0; i < notas1.length; i++) {
			System.out.println("Entre com a nota do aluno 1: " + (i + 1));
			notas1[i] = scan.nextInt();

			System.out.println("Entre com a nota do aluno 2: " + (i + 1));
			notas2[i] = scan.nextInt();

			resultados[i] = (notas1[i] + notas2[i] / 2);
		}

		System.out.print("Nota1= ");
		for (int i = 0; i < notas1.length; i++) {
			System.out.print(notas1[i] + " ");
		}
		System.out.println();

		System.out.print("Nota2= ");
		for (int i = 0; i < notas2.length; i++) {
			System.out.print(notas2[i] + " ");
		}
		System.out.println();

		System.out.println("Resulatdos: ");
		for (int i = 0; i < resultados.length; i++) {
			System.out.println(notas2[i] + " ");
			if (resultados[i] >= 7) {
				System.out.println(resultados[i] + "-Aprovado");
			} else {
				System.out.println(resultados[i] + "- Reprovado");
			}

		}
		scan.close();
	}
}
