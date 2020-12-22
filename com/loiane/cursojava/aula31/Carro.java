package com.loiane.cursojava.aula31;

public class Carro {
	//ATRINUTOS
    String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
    private double consumoCombustivel;
	
    //MÉTODOS
	public void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + this.capCombustivel * consumoCombustivel + "km");
	}
    public double obterAutonomia() {
    	System.out.println("Método autonomia foi chamado");
    	return this.capCombustivel * consumoCombustivel;
    }
    
    private double dividirKmPorConsumoCombustivel(double km) {
    	return km/this.consumoCombustivel;
    }
    public double calcularCombustivel(double km) {
    	
    	
    	return this.dividirKmPorConsumoCombustivel(km);
    }
}
