package com.loiane.cursojava.aula34Exercícios;

public class Calculadora {

	public static int soma(int num1, int num2) {
		return num1 + num2;
	}

	public static int subtrair(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}

	public static int dividir(int num1, int num2) {
		return num1 / num2;
	}

	// x^n
	// x*x*x*x*x*x(n vezes)
	public static int potencia(int num1, int num2) {
		// return Math.pow(num1,num2); double
		int total = 1;
		for (int i = 0; i < num2; i++) {
			total *= num1;
		}
		return total;
	}

	public static char[] fatorial(int num) {
		return null;
	}

}
