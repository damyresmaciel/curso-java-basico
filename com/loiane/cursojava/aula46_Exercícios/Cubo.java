package com.loiane.cursojava.aula46_Exercícios;

public class Cubo extends Figura3d{

	//ATRIBUTOS
	private int lado;
	
	//MÉTODOS ESPECIAIS
	public int getLado() {
		return this.lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	@Override
	public double calcularArea() {
		return 6*Math.pow(lado, 2);
		//return 6* (lado*lado);
	}
	@Override
	public double calcularVolume() {
		//return lado*lado*lado;
		return Math.pow(lado, 3);
	}
}
