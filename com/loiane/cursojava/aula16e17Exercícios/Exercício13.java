package com.loiane.cursojava.aula16e17Exerc�cios;

import java.util.Scanner;

public class Exerc�cio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double b; 
		double e;
		double resultado;
		
      System.out.println("Entre com n�mero para base");
      b = scan.nextDouble();
      
      System.out.println("Entre com n�mero para expoente");
      e = scan.nextDouble();
      resultado = b;
      for (int i=1; i<e; i++) {
      resultado = resultado* b;
      }
      System.out.println("O resultado da exponenciaco � "+ resultado);
      scan.close();
	}

}
