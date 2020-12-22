package com.loiane.cursojava.aula35Exercicios;

public class Somatorio {
	//SOMATORIO
     //5 = 5+4+3+2+1//
	// 4 = 4+3+2+1
	// 3 = 3+2+1
	// 2 = 2+1
	// 1 = 1
	public static int soma(int num) {
		if(num==1) {
			return 1;
		}
		return num + soma(num-1);
	}
}
