package com.loiane.cursojava.aula34Exerc�cios;

public class Fatorial {
	
	// 5! = 5*4*3*2*1 =120
	// !0 =1
	public static int fatorial(int num) {
		if(num==0) {
			return 1;
		}
		int total=1;
		for(int i=num;i>1; i--) {
			total *= i;
		}
		
		return total;
		
	}
}
