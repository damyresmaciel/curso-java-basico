package com.loiane.cursojava.aula29;

public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro();

		van.marca = "Fiat";
		van.modelo = "Ducato";
		//van.numPassageiros= 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		System.out.println(van.numPassageiros);
		
		Carro van2 = new Carro("Fiat","Ducato", 10, 100, 0.2);
	
		System.out.println(van2.marca);
		System.out.println(van.modelo);
		System.out.println(van.numPassageiros);
		System.out.println(van.capCombustivel);
		System.out.println(van.consumoCombustivel);
		System.out.println();
		
	    Carro2 carro2 = new Carro2();
	    carro2.marca = "Honda";
	    carro2.modelo = "Ky";
	    carro2.capCombustivel=15;
	    
	    System.out.println(carro2.marca);
	    System.out.println(carro2.modelo);
	    System.out.println(carro2.capCombustivel);

	}
}
