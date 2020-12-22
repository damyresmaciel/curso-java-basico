package com.loiane.cursojava.aula33Exercícios;

public class Exemp01 {

	public static void main(String[] args) {

		Lampada lampada = new Lampada();
		
		lampada.desligar();
		
        lampada.mostrarEstado();
		
		lampada.desligar();
		
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		
		lampada.mostrarEstado();
	}

}
