package com.loiane.cursojava.aula19Exercícios;

import java.util.Scanner;

public class Exercício25 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		
		int[] vetorA = new int [10];
		int[] vetorB = new int [vetorA.length];
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com a posicao " + i);
			vetorA[i]= scan.nextInt();
			
			vetorB[i]=(vetorA[i] %2==0)? 1 : 0;
			
		}
		
		System.out.print("Vetor A= ");
		for( int i=0; i<vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Valor B= ");
		for(int i=0; i<vetorB.length;i++) {
			System.out.print(vetorB[i] + " " );
		}
		System.out.println();
		scan.close();
	}

}
