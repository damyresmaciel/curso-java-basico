package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;

public class Exercício08 {

	public static void main(String[] args) {
		/*double num1, num2,num3, num4, num5, m;*/
		Scanner scan =new Scanner(System.in);
		int num;
		double media;
		int soma =0;
		for(int i=0; i<5; i++) {
			System.out.println("Digite um numero: ");
			num = scan.nextInt();
			soma += num;
		}
        media = soma /5;
        System.out.println("Soma: "+ soma);
        System.out.println("Media: "+ media);
        
        
        
        /*System.out.println("Entre com um numero:");
        num1 = scan.nextInt();
        System.out.println("Entre com um segundo numero:");
        num2 = scan.nextInt();
        System.out.println("Entre com terceiro numero:");
        num3 = scan.nextInt();
        System.out.println("Entre com o quarto numero:");
        num4 = scan.nextInt();
        System.out.println("Entre com o quinto numero");
        num5 = scan.nextInt();
        m = (num1 + num2 + num3 + num4 + num5) / 2;
        System.out.println("A media é igual " + m);
        scan.close();*/
        scan.close();
	}

}
