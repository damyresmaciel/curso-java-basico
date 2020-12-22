package com.loiane.cursojava.aula14e15Exercício; 

 import java.util.Scanner;
 
public class Exercício20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		  int s=0, n = 0;
		  
		System.out.println("Telefonou para vitima(S ou N):? ");
		String telefonouVitima = scan.next();
		if(telefonouVitima.equalsIgnoreCase("S")){
		    s++;
		} else {
			n++;
		}
		System.out.println("Esteve no local do crime(S ou N):? ");
		String esteveNoLocal = scan.next();
		if(esteveNoLocal.equalsIgnoreCase("S")){
			s++;
		} else {
			n++;
		}
		System.out.println("Mora perto da vítima(S ou N):? ");
		String moraPerto = scan.next();
		if(moraPerto.equalsIgnoreCase("S")){
			s++;
		} else {
			n++;
		}
		System.out.println("Devia para vítima:(S ou N)? ");
		String deviaVitima  = scan.next();
		if(deviaVitima.equalsIgnoreCase("S")){
			s++;
		} else {
			n++;
		}
		System.out.println("Já trabalhou para vítima(S ou N):?");
		String trabalhouVitima = scan.next();
		if(trabalhouVitima.equalsIgnoreCase("S")){
			s++;
		} else {
			n++;
		}
		if(s == 2){
			System.out.println("Suspeita");
		} else if(s >= 3 && s <= 4) {
			System.out.println("Cumplices");
		} else if(s == 5){
		   System.out.println("Assassino");
		} else {
			System.out.println("Inocente");
		} scan.close();
		
		}
	}

