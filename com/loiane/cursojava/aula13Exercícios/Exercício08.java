package com.loiane.cursojava.aula13Exerc�cios;

import java.util.Scanner;

public class Exerc�cio08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Qual � o valor da hora? ");
		double valorHora = scan.nextDouble();
		
		System.out.print("Qual � o quantidades de horas trabalhadas no mes? ");
		double horasMes= scan.nextDouble();
		
		double salario = horasMes * valorHora;
		System.out.println("Seu sal�rio no fim do mes �: " + salario);
		scan.close();
	}

}
