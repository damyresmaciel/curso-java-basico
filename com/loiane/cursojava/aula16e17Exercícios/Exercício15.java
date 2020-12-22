package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;

public class Exercício15 {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
       
		System.out.println("Entre com o n-ésimo termo de finonacci");
	    int n= scan.nextInt();
	    //1,1,2,3,5
	    int primeiro=1;
	    int segundo =1;
	    int proximo;
	    
	    System.out.println(primeiro);
	    System.out.println(segundo);
	    
	    //1,1,2,3,5
	    //primeiro=1
	    //segundo=1
	    //poximo=2
	    
	    for( int i=3; i<=n;i++) {
	    	proximo = primeiro + segundo;
	    	primeiro = segundo;
	    	segundo = proximo;	
	    	
	    	System.out.println(proximo);
	}scan.close();
  }
}