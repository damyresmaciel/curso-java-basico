package com.loiane.cursojava.aula13Exerc�cios;

 import java.util.Scanner;
 
public class Exerc�cio12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Entre com a altura: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal= (72.7*altura)- 58;
		System.out.print("O peso ideal �: " + pesoIdeal);
		scan.close();
	}
} 
			
