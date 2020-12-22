package com.loiane.cursojava.aula46_Exercícios;

public class Triangulo extends Figura2d {
	// ATRIBUTOS
	private double base;
	private double altura;

	// MÉTODOS ESPECIAIS
	public double getBase() {
		return this.base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return this.altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return ((altura*base)/2);
	}

}
