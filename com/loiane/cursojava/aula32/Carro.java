package com.loiane.cursojava.aula32;

public class Carro {

	// ATRIBUTOS
	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capCombustivel;
	private double consumoCombustivel;

	// MÉTODOS ESPECIAIS
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumPassageiros() {
		return this.numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

	public double getCapCombustivel() {
		return this.capCombustivel;
	}

	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}

	public double getConsumpCombustivel() {
		return this.consumoCombustivel;
	}

	public void setConsumpCombustivel(double consumpCombustivel) {
		this.consumoCombustivel = consumpCombustivel;
	}

}
