package com.loiane.cursojava.aula27Exerc�cios;

public class Exemp01 {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();

		lampada.ligar();
		
		lampada.mostrarEstado();
		
		lampada.desligar();
		
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		
		lampada.mostrarEstado();
	}
}
