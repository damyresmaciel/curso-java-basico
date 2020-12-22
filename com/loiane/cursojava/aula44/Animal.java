package com.loiane.cursojava.aula44;

public abstract class Animal {

	//ATRIBUTOS
	private String nome;
	
	//M�TODO
	public abstract void emitirSom();
	
	//M�TODOS ESPECIAIS
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
