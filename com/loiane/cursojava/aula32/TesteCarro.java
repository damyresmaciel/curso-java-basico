package com.loiane.cursojava.aula32;

public class TesteCarro {

	public static void main(String[] args) {

		Carro van = new Carro();

		van.setMarca("Fiat");
		
		van.setModelo("Ducato");
		
		van.setNumPassageiros(10);
		
		van.setCapCombustivel(100);
		
		van.setConsumpCombustivel(0.2);

		System.out.println(van.getMarca());
		System.out.println(van.getModelo());
		System.out.println(van.getNumPassageiros());
		System.out.println(van.getCapCombustivel());
		System.out.println(van.getConsumpCombustivel());


	}
}
