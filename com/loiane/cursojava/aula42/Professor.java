package com.loiane.cursojava.aula42;

public class Professor  {

	// ATRIBUTOS
	private String departamento;
	private double salario;
	private String nomeCurso;

	// MÉTODOS
	public String obterEtiquetaEndereco() {
		String s = "Endereço do professor: ";
		//s += super.getEndereco();
		return s;
	}

	public void calcularSalarioliq(double calcularsalarioLiq) {

	}

	public void verificarAcesso() {
		//this.nomeVisibilidade = "hhhhh";
		//super.nomeVisibilidade = "hhhhh";
	}

	// MÉTODOS ESPECIAIS

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
	// System.out.println("Imprimindo o endereço do professor ");
	// System.out.println(this.obterEtiquetaEndereco());

}
