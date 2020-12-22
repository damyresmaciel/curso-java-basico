package com.loiane.cursojava.aula19Exercícios;

import java.util.Scanner;

public class Exercício019 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double[] nota1 = new double[10];
		double[] nota2 = new double[nota1.length];
		double[] resultados = new double[nota1.length];

		for (int i = 0; i < nota1.length; i++) {
			System.out.println("Entre com a primeira nota: " + (i + 1));
			nota1[i] = scan.nextInt();

			System.out.println("Entre co a segunda nota: " + (i + 1));
			nota2[i] = scan.nextInt();

			resultados[i] = (nota1[i] + nota2[i] / 2);
		}
		System.out.println();

		System.out.print("Nota1 = ");
		for (int i = 0; i < nota1.length; i++) {
			System.out.print(nota1[i] + " ");
		}
		System.out.println();

		System.out.print("Nota2 = ");
		for (int i = 0; i < nota2.length; i++) {
			System.out.print(nota2[i] + " ");
		}
		System.out.println();

		System.out.println("Resultados");
		for(int i=0;i<resultados.length;i++) {
			System.out.println(nota2[i]+ " ");
			if(resultados[i] >= 7){
					System.out.println(resultados[i]+ " Aprovado ");
			} else {
				System.out.println(resultados[i] + " Reprovado ");
			}
		}
		scan.close();
	}

}
