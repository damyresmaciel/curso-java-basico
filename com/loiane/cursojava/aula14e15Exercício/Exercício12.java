package com.loiane.cursojava.aula14e15Exercício;

import java.util.Scanner;

public class Exercício12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Qual valor da hora? ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Quantidade de horas trabalhada no mês? ");
		double horasTrabalhadas = scan.nextDouble();
        double  salarioBruto = valorHora * horasTrabalhadas;
       
        int percentualIr =0;
        if (salarioBruto <= 900){
    	  percentualIr=0;
        } else if (salarioBruto >900 && salarioBruto <= 1500) {
    	  percentualIr = 5;
        } else if (salarioBruto >1500 && salarioBruto <=2500) {
    	  percentualIr = 10;
        } else if (salarioBruto > 2500){
    	 percentualIr = 20;
        }
        double ir = (salarioBruto/100)* percentualIr;
        double inss = (salarioBruto/100)*10;
        double fgts = (salarioBruto/100)*11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;
     
        System.out.println("Salario bruto: ("+ valorHora + " * " + horasTrabalhadas + "):" + salarioBruto);
        System.out.println("(-) ir (" + percentualIr + " %):" + ir);
        System.out.println("(-) inss (10%): " + inss);
        System.out.println("fgts(11%): "+ fgts);
        System.out.println("Total de descontos: " + totalDescontos);
        System.out.println("Salario liquido: " + salarioLiquido);
        scan.close();
	}
	
}
