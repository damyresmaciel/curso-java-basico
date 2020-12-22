package com.loiane.cursojava.aula29;

public class Carro {
    // ATRIBUTOS
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	//CONTRUTOR
	Carro() {
		System.out.println("Classe carro foi instanciada");
		numPassageiros = 4; //ATRIBUTO
	}
    //CONSTRUTOR (PASSAGEM DE PARAMETROS)
	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) {
		marca = marca_;
		modelo = modelo_;
		numPassageiros = numPassageiros_;
		capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;
	}
    //M�TODOS
	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + " km ");
	}

	double obterAutonomia() {
		System.out.println("M�todo obterAutonomia foi chamado.");

		return capCombustivel * consumoCombustivel;
	}

	double calcularCombustivel(double km) {

		double qtdCombustivel = km / consumoCombustivel;

		return qtdCombustivel;
	}

}
