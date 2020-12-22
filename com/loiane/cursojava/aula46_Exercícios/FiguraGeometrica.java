package com.loiane.cursojava.aula46_Exercícios;

public abstract class FiguraGeometrica {

	//ATRIBUTOS
	private String nome;
	private String cor;
	
	//MÉTODOS ESPECIAIS
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return this.cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
}
