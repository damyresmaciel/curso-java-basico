package com.loiane.cursojava.aula35Exercicios;

public class Calculadora {

	public static int fibonacci(int num) {
		if(num<2) {
			return 1;
		}
		return fibonacci(num-1) + fibonacci(num-2);
		
	}
}
