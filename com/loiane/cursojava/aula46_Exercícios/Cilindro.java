package com.loiane.cursojava.aula46_Exercícios;

public class Cilindro extends Figura3d {

	//ATRIBUTOS
	private int altura;
	private double raio;
	
	//MÉTODOS ESPECIAIS 
	public double getAltura() {
		return this.altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public double getRaio() {
		return this.raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	@Override
	public double calcularArea() {
		double altura=0;
		double areaBase = Math.PI *(raio * raio);
		double areaLateral = 2 * Math.PI * raio * altura;
		double areaTotal = (2 * areaBase ) + areaLateral;
		return areaTotal;
	}
	@Override
	public double calcularVolume() {
		double altura = 0;
		return Math.PI * (raio * raio) * altura;
	
	}
}
