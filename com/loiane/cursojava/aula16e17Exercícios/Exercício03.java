package com.loiane.cursojava.aula16e17Exercícios;

import java.util.Scanner;
 
public class Exercício03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome, sexo, estCivil;
		int idade;
		double salario;
		do {
		System.out.println("Entre com um nome:");
		nome = scan.next();
		if (nome.length() >=3) {
		   infoValida = true;
		} else {
			System.out.println("Nome precisa no minimo 3 caracteres");
		}
		} while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Entre com a idade:");
			idade = scan.nextInt();
			if(idade >=0 && idade <=150) {
				infoValida = true;
			} else {
				System.out.println(" Idade precisa ser entre 0 e 150.");
			}
		} while (!infoValida);
		
		infoValida = false;
		do {
			System.out.println("Entre com o salario:");
			salario = scan.nextDouble();
			if(salario >= 0) {
				infoValida = true;
			} else {
				System.out.println("O salario tem que ser maior que 0.");
			}
		} while (!infoValida);
		infoValida= false;
		do {
			System.out.println("Entre com sexo (f ou m)");
			sexo = scan.next();
			if(sexo.equalsIgnoreCase("f")) {
				infoValida = true;
			} else if(sexo.equalsIgnoreCase("m")) {
				infoValida= true;
			} else {
				System.out.println("o sexo precisa ser 'f' ou 'm'.");
			}
		} while (!infoValida);
		infoValida= false;
		do {
			System.out.println("Entre com o  estado civil:");
			estCivil = scan.next();
			if(estCivil.equalsIgnoreCase("s")) {
				infoValida= true;
			} else if(estCivil.equalsIgnoreCase("c")) {
				infoValida= true;
			} else if(estCivil.equalsIgnoreCase("v")) {
				infoValida= true;
			} else if(estCivil.equalsIgnoreCase("d")) {
				infoValida= true;
			} else {
				System.out.println("Estado civil precisa ser 's' , 'c', 'v' ou 'd'.");
			}
		} while(!infoValida);
		System.out.println("As seguintes informacoes foram coletadas:");
		System.out.println("Nome: "+ nome); 
		System.out.println("Idade: "+ idade); 
		System.out.println("Salario: "+ salario); 
		System.out.println("Sexo: "+ sexo); 
		System.out.println("Estado civil: "+ estCivil); 
		scan.close();
		} 
	}
  

