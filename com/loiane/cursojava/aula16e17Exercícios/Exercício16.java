package com.loiane.cursojava.aula16e17Exerc�cios;

import java.util.Scanner;

public class Exerc�cio16 {

	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
       
		int primeiro=1;
		int segundo=2;
		int proximo=0;
		 while(proximo <= 8){
			 proximo = primeiro + segundo;
			 primeiro = segundo;
			 segundo = proximo;
			 System.out.println(proximo);
	   }
		scan.close(); 
	}
}
