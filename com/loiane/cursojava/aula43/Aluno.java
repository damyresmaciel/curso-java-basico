package com.loiane.cursojava.aula43;

import java.util.Arrays;

public class Aluno {

	// ATRIBUTOS

	private String curso;
	private double[] notas;

	// CONSTRUTOR
	public Aluno() {
		super();
	}

	public Aluno(String nome, String endereco, String telefone, String curso) {
		// super(nome, endereco,telefone);
		this.curso = curso;
	}

	// MÉTODOS
	public String obterEtiquetaEndereco() {
		// return this.endereco;
		String s = "Endereço do aluno: ";
		// s+= this.getEndereco();
		return s;
	}

	public void verificarVisibilidade() {
		// this.nomeVisibilidade = "ggggg"; private em metodo
		// super.nomeVisibilidade = "ggggggg"; private em metodo

		// super.setNomeVisibilidade("kkkk");//public get e set
	}

	public void calcularMedia(double calucularMedia) {

	}

	public void verificarAprovado(double verificarAprovado) {

	}

	public void metodoQualquer() {
		// super.setCpf("55555");
		// this.setCpf("6666");
	}

	// MÉTODOS ESPECIAIS

	public String getCurso() {
		return this.curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double[] getNotas() {
		return this.notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	// @Override
	public void imprimirEtiquetaEndereco() {

		// System.out.println(this.obterEtiquetaEndereco());
	}
	/*
	 * public String toString() { String s = curso + "\n"; for(double nota : notas)
	 * { s+= nota + " "; } return s; }
	 */

	@Override
	public String toString() {
		return "Aluno [curso=" + curso + ", notas=" + Arrays.toString(notas) + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Aluno other = (Aluno) obj;
		if (curso.equalsIgnoreCase(other.getCurso())) {
			return true;
		}
		return false;
	}

}
