package com.loiane.cursojava.aula42;

public class Professor  {

	// ATRIBUTOS
	private String departamento;
	private double salario;
	private String nomeCurso;

	// M�TODOS
	public String obterEtiquetaEndereco() {
		String s = "Endere�o do professor: ";
		//s += super.getEndereco();
		return s;
	}

	public void calcularSalarioliq(double calcularsalarioLiq) {

	}

	public void verificarAcesso() {
		//this.nomeVisibilidade = "hhhhh";
		//super.nomeVisibilidade = "hhhhh";
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

	// @Override
	// public void imprimirEtiquetaEndereco() {
	// System.out.println("Imprimindo o endere�o do professor ");
	// System.out.println(this.obterEtiquetaEndereco());

}
