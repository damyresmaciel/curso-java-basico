package com.loiane.cursojava.aula44;

public abstract class Animal {

	//ATRIBUTOS
	private String nome;
	
	//MÉTODO
	public abstract void emitirSom();
	
	//MÉTODOS ESPECIAIS
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
