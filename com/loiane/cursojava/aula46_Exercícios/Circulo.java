package com.loiane.cursojava.aula46_Exerc�cios;

public class Circulo extends Figura2d {

	//ATRIBUTOS
	private double raio;
	
	//M�TODOS ESPECIAIS
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
