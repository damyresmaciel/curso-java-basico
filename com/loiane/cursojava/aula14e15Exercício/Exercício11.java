package com.loiane.cursojava.aula14e15Exercício;

import java.util.Scanner;

public class Exercício11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um salario");
		double salario = scan.nextDouble();

		  
		  double salarioAjustado;
		  double ajuste1 = 0.20;
		  double ajuste2 = 0.15;
		  double ajuste3 = 0.10;
		  double ajuste4 = 0.05;
		 
		  System.out.println("Qual salario ? ");
		  salario = scan.nextInt();
		  
		if (salario <= 280) {
			salarioAjustado = salario + (salario * ajuste1);
			System.out.println("O salario antigo " + salario);
			System.out.println("O percentual de aumento é: " + ajuste1);
			System.out.println("O valor do aumento é: " + salario * ajuste1);
			System.out.println("O novo salario é : " + salarioAjustado);
		} else if (salario > 280 && salario <= 700){
			salarioAjustado = salario + (salario * ajuste2);
			System.out.println("O salario antigo " + salario);
			System.out.println("O percentual de aumento é: " + ajuste2);
			System.out.println("O valor de aumento é: " + salario *ajuste2);
			System.out.println("O novo salario é: " + salarioAjustado);
		} else if ( salario > 700 && salario  <= 1500) {
			salarioAjustado = salario + (salario * ajuste3);
			System.out.println("O salario antigo " + salario);
			System.out.println("O percentual de aumento é: " + ajuste3);
			System.out.println("O valor de aumento é: " + salario * ajuste3);
			System.out.println("O salario é: " + salarioAjustado);
		} else if(salario > 1500) {
			salarioAjustado = salario + (salario* ajuste4);
			System.out.println("O salario antigo " + salario);
			System.out.println("O percentua de aumento é: " + ajuste4);
			System.out.println("O valor de aumento é: " + salario * ajuste4);
			System.out.println("O novo salario é: "+ salarioAjustado);
		}scan.close();
	}
}
