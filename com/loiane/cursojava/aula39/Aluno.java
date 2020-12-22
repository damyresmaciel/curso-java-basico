package com.loiane.cursojava.aula39;

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
	public void verificarVisibilidade() {
		//this.nomeVisibilidade = "ggggg";      private em metodo
		//super.nomeVisibilidade = "ggggggg";   private em metodo
		
		super.setNomeVisibilidade("kkkk");//public get e set
	}
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
}
