package com.loiane.cursojava.aula39;

public class Professor extends Pessoa {

	// ATRIBUTOS
	private String departamento;
	private double salario;
	private String nomeCurso;

	// M�TODOS
	public void calcularSalarioliq(double calcularsalarioLiq) {

	}
	public void verificarAcesso() {
		this.nomeVisibilidade= "hhhhh";
		super.nomeVisibilidade = "hhhhh";
	}

	// M�TODOS ESPECIAIS
	
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

}
