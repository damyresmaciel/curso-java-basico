package com.loiane.cursojava.aula19Exercícios;

import java.util.Scanner;

public class Exercício26 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com um numero da  posicao A= " + i);
			vetorA[i] = scan.nextInt();
		}
		for(int i=0; i<vetorB.length; i++) {
			System.out.println("Entre com um numero para posiçao B= " + i);
			vetorB[i]= scan.nextInt();
			
			if(vetorA[i]==vetorB[i]) {
				vetorC[i]=0;
			} else if(vetorA[i]>vetorB[i]) {
				vetorC[i]=1;
			}else {
				vetorC[i]=-1;
			}
		}
		System.out.print("Valor A= ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Valor B= ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();

		System.out.print("Valor C= ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		System.out.println();
		scan.close();
	}
}
