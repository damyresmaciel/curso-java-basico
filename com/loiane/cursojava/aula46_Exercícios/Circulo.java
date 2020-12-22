package com.loiane.cursojava.aula46_Exercícios;

public class Circulo extends Figura2d {

	//ATRIBUTOS
	private double raio;
	
	//MÉTODOS ESPECIAIS
	public double getRaio() {
		return this.raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	public double calcularArea() {
		return (raio * raio) * Math.PI;
	}
}
