package com.loiane.cursojava.aula16e17Exerc�cios;

import java.util.Scanner;

public class Exerc�cio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in);
		
       double popA = 80000,
    	      popB= 200000;
       double taxaA,
              taxaB;
       boolean valido = false;
       
       do {
    	   System.out.println("Entre com a popula�ao A:");
    	   popA = scan.nextDouble();
    	   
    	   if(popA > 0) {
    		   valido = true;
    	   } else {
    		   System.out.println("Populacao a precisa ser maior que 0.");
    	   }
       } while (!valido);
        valido = false;
        do {
        	 System.out.println("Entre com a popula�ao B:");
      	     popB = scan.nextDouble();
      	   
      	   if(popB > 0) {
      		   valido = true;
      	   } else {
      		   System.out.println("Populacao b precisa ser maior que 0.");
        }
        } while (!valido);
      	   valido = false;
      	   do {
      		   System.out.println("Entre com a taxa de crescimento da popula�ao A:");
      		   taxaA = scan.nextDouble();
      		   if(taxaA > 0) {
      			   valido = true;
      		   } else {
      			   System.out.println("Taxa de crescimento A precisa ser maior que 0.");
      		   }
      	   } while (!valido);
      	   valido = false;
      	   do { 
      		   System.out.println("Entre com a taxa de crescimento da popula�ao B");
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
          System.out.println("Popula�ao A: " +  popA);
          System.out.println("Popula�ao B: " +  popB);
          System.out.println("Qtd anos:  " +  cont);
      	  scan.close();
        }  
     }
