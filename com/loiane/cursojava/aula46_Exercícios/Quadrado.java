package com.loiane.cursojava.aula46_Exercícios;
 
public class Quadrado extends Figura2d{
    
	//atributos
	private int lado;
	
	//métodos especias
	public int getLado() {
		return this.lado;
	}
	public void setLado(int lado) {
		this.lado = lado;
	}
	@Override
	public double calcularArea() {
		return lado*lado;
		//return Math.pow(lado, 2);
	}
}
