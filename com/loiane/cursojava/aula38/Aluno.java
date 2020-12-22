package com.loiane.cursojava.aula38;

public class Aluno extends Pessoa {

	//ATRIBUTOS
	
	private String cursos;
	private double[] notas;
	
	//CONSTRUTOR
	public Aluno() {
		super();
	}
	
	public Aluno(String nome,String endereco,String telefone, String cursos) {
		super(nome, endereco,telefone);
		this.cursos = cursos;
	}
	//MÉTODOS
	public void calcularMedia(double calucularMedia) {
		
	}
	public void verificarAprovado(double verificarAprovado) {
		
	}
	public void metodoQualquer() {
	super.setCpf("55555");
	this.setCpf("6666");
	}
	
	//MÉTODOS ESPECIAIS
	
	public String getCursos() {
		return this.cursos;
	}
	public void setCursos(String cursos) {
		this.cursos = cursos;
	}
	public double[] getNotas() {
		return this.notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	                                
}
