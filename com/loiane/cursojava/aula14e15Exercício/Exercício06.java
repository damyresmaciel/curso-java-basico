package com.loiane.cursojava.aula14e15Exerc�cio;

import java.util.Scanner;

public class Exerc�cio06 {

	public static void main(String[] args) {
		// maior valor de numeros
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Primeiro valor:");
		int v1 = scan.nextInt();
		
		System.out.println("Segundo valor:");
		int v2 = scan.nextInt();
		
		System.out.println("Terceiro valor:");
		int v3 = scan.nextInt();
		
		if (v1 >= v2 && v1 >= v3) {
			System.out.println("v1 � maior valor " + v1);
		} else if(v2 >= v1 && v2 >= v3) {
			System.out.println("v2 � maior valor " + v2);
		} else if (v3 >= v1 && v3 >= v2) {	
			System.out.println("v3 � maior valor " + v3);
		}
		
        if (v1 <= v2 && v1 <= v3) {
        	System.out.println("v1 � o menor valor " + v1);
        } else if(v2 <= v1 && v2 <= v3) {
        	System.out.println("v2 � o menor valor " + v2);
        } else if(v3 <= v1 && v3 <= v1) {
        	System.out.println("v3 � o menor valor " + v3);
        	scan.close();
        }
	}

}
