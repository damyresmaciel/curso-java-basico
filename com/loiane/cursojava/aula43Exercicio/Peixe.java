package com.loiane.cursojava.aula43Exercicio;

public class Peixe  extends Animal{
	
    private String caracteristicas;
    
	public Peixe() {
		super();
		this.setPatas(0);
		this.setAmbiente("Mar");
		this.setCor("Cinzenta");
		this.caracteristicas= "Barbatanas e calda";

	}
	public String getCaracteristicas() {
		return this.caracteristicas;
	}
	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	@Override
	public String toString() {
		String s = super.toString();
		s += "\nCaracteristicas: " + caracteristicas;
		return s;
	}
}
