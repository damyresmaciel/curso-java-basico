package com.loiane.cursojava.aula16e17Exerc�cios;

import java.util.Scanner;

public class Exerc�cio29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com um numero: ");
		int num = scan.nextInt();
		for(int i =1; i<=num; i++) {
			
			boolean primo= true;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					//System.out.println("Nao � primo - divisivel por "+i);
					primo = false;
				}
			}
			if(primo) {
				System.out.println(i);
			}
		}
   scan.close();
	}

}
