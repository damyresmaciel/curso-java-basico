package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in);
		
       double popA = 80000,
    	      popB= 200000;
       double taxaA,
              taxaB;
       boolean valido = false;
       
       do {
    	   System.out.println("Entre com a populaçao A:");
    	   popA = scan.nextDouble();
    	   
    	   if(popA > 0) {
    		   valido = true;
    	   } else {
    		   System.out.println("Populacao a precisa ser maior que 0.");
    	   }
       } while (!valido);
        valido = false;
        do {
        	 System.out.println("Entre com a populaçao B:");
      	     popB = scan.nextDouble();
      	   
      	   if(popB > 0) {
      		   valido = true;
      	   } else {
      		   System.out.println("Populacao b precisa ser maior que 0.");
        }
        } while (!valido);
      	   valido = false;
      	   do {
      		   System.out.println("Entre com a taxa de crescimento da populaçao A:");
      		   taxaA = scan.nextDouble();
      		   if(taxaA > 0) {
      			   valido = true;
      		   } else {
      			   System.out.println("Taxa de crescimento A precisa ser maior que 0.");
      		   }
      	   } while (!valido);
      	   valido = false;
      	   do { 
      		   System.out.println("Entre com a taxa de crescimento da populaçao B");
      		   taxaB = scan.nextDouble();
      		   if(taxaB >0) {
      			   valido= true;
      		   } else {
      			   System.out.println("Taxa de crescimento B precisa ser maior que 0.");
      		   }
      	   } while (!valido);
      	   
      	   int cont= 0;
      	   
     	  while(popA < popB) {
	       
      	  popA += (popA /100 ) * taxaA;
		  popB += (popB/100) * taxaB;
		  cont++;
          }
          System.out.println("Populaçao A: " +  popA);
          System.out.println("Populaçao B: " +  popB);
          System.out.println("Qtd anos:  " +  cont);
      	  scan.close();
        }  
     }
