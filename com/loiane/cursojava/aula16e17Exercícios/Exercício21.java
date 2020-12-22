package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;

public class Exercício21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o numero de turmas: ");
		int numTurma = scan.nextInt();
		
		int numAluno;
		int soma=0;
		boolean invalido = true;
		for(int i=1; i<=numTurma;i++){
			
			do {
				
			   System.out.println("Entre com o numero de alunos da turma " + i);
			   numAluno = scan.nextInt();
			   if(numAluno<=40) {
				  invalido = false;
			   } else {
				   System.out.println("Numero de alunos invalidos. Digite novamente");
			   }
		    } while(invalido);
			 soma +=numAluno;
		}
		 
		   double media= soma/numTurma;
		   System.out.println("A media: "+ media);
		   scan.close();
	   }
  }
	


