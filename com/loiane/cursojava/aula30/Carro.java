package com.loiane.cursojava.aula30;

public class Carro {
	// ATRIBUTOS
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	// CONSTRUTOR
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}

	public Carro() {

	}

	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Chamando o construtor com 2 parametros.");
	}

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando o construtor com 3 parametros");
	}

	//M�TODOS
	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + this.capCombustivel * this.consumoCombustivel + "km");
	}

	double obterAutonomia() {
		System.out.println("M�todo obterAutonomia foi chamado. ");

		return this.capCombustivel * this.consumoCombustivel;
	}

	double calcularCombustivel(double km) {
		double qtdCombustivel = km / this.consumoCombustivel;

		return qtdCombustivel;
	}

}
