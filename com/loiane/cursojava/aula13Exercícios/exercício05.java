package com.loiane.cursojava.aula13Exerc�cios;

import java.util.Scanner;

public class exerc�cio05 {
         // metro para cm
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
	
		System.out.print("Digite um valor metros: ");
		double metros = scan.nextDouble();
				
		double cm = metros * 100;
		System.out.print(metros + " metros � igual a: " + cm + " cm ");
		scan.close();
	
	}

}
