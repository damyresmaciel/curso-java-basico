package com.loiane.cursojava.aula40;

public class Pessoa {

	// ATRIBUTOS
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private String telefoneCelular;

	// default
	protected String nomeVisibilidade;

	// CONSTRUTOR
	public Pessoa() {
	}

	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	// MÉTODOS
	public String obterEtiquetaEndereco() {
		return this.endereco;
	}

	// MÉTODOS ESPECIAIS
	public String getNomeVisibilidade() {
		return nomeVisibilidade;
	}

	public void setNomeVisibilidade(String nomeVisibilidade) {
		this.nomeVisibilidade = nomeVisibilidade;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
