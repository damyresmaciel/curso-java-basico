package com.loiane.cursojava.aula19Exerc�cios;

import java.util.Scanner;

public class Exerc�cio016 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] vetorA = new int[10];
		
		for(int i=0;i<vetorA.length;i++) {
			System.out.println("Entre com a posi�ao "+ i);
			vetorA[i] = scan.nextInt();
		}
		int somaMenor15=0;
		int somaMaior15=0;
		int qtdMaior15=0;
		int igual15=0;
				
		for(int i=0; i<vetorA.length;i++) {
			if(vetorA[i]%15==0) {
				igual15++;
			} else if(vetorA[i]<15) {
				somaMenor15 += vetorA[i];
			} else {
				qtdMaior15++;
				somaMaior15 += vetorA[i];
			}
		}
		System.out.println();
		
		System.out.print("Valor A= ");
		for(int i=0; i<vetorA.length;i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("QTd n�meros == 15:  " + igual15);
		System.out.println("Soma dos n�meros < 15: " + somaMenor15);
		System.out.println("M�dia dos n�meros > 15: " +(somaMaior15/qtdMaior15) );
		scan.close();
	}

}
