package com.loiane.cursojava.aula46_Exerc�cios;
 
public class Quadrado extends Figura2d{
    
	//atributos
	private int lado;
	
	//m�todos especias
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
