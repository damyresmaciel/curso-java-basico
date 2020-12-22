package com.loiane.cursojava.aula14e15Exercício;

import java.util.Scanner;

public class Exercício15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Lado 1");
		int l1 = scan.nextInt();
		
		System.out.println("Lado 2");
		int l2 = scan.nextInt();
		
		System.out.println("Lado 3");
		int l3 = scan.nextInt();
	

		if(((l1 + l2) > l3) || ((l1 + l3)> l2)||((l2 + l3)>l1)){
			if(l1==l2 && l1==l3 && l2==l3) {
				System.out.println("Triangulo Equilatero");
			} else if(l1!= l2 && l1!=l3 && l3!=l2) {
				System.out.println("Triangulo Escaleno");
			} else if(l1==l2 || l1==l3 || l2==l3) {
				System.out.println("Triangulo Isoceles");
			}
		} else {
			System.out.println("Nao é um triangulo");
		}scan.close();
	   }
	}

