package com.loiane.cursojava.aula13Exercícios;

import java.util.Scanner;

public class Exercício08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Qual é o valor da hora? ");
		double valorHora = scan.nextDouble();
		
		System.out.print("Qual é o quantidades de horas trabalhadas no mes? ");
		double horasMes= scan.nextDouble();
		
		double salario = horasMes * valorHora;
		System.out.println("Seu salário no fim do mes é: " + salario);
		scan.close();
	}

}
