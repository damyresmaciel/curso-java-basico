package com.loiane.cursojava.aula13Exerc�cios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Qual � o valor da hora? ");
		double valorHora = scan.nextDouble();

		System.out.print("Qual � o quantidades de horas trabalhadas no mes? ");
		double horasMes = scan.nextDouble();

		double salarioBruto = horasMes * valorHora;
		double impostoRenda = salarioBruto * 0.11;
		salarioBruto -= impostoRenda;
		double inss = salarioBruto * 0.08;
		salarioBruto-= inss;
		double sindicato = salarioBruto * 0.05;
		salarioBruto -= sindicato;
		
		System.out.println("Imposto de Renda: " + impostoRenda);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("INSS: " + inss);
		System.out.println("Seu sal�rio liquido: " + salarioBruto);
		scan.close();
	   }
}
