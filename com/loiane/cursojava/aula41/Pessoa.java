package com.loiane.cursojava.aula41;

public  abstract class Pessoa {

	// ATRIBUTOS
	private String nome;
	private String endereco;
	private String telefone;
	private String cpf;
	private String telefoneCelular;

	// default String nomeVisibilidade;
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

	// M�TODOS]
	public abstract String obterEtiquetaEndereco();
	
	public abstract void imprimirEtiquetaEndereco();

	// M�TODOS ESPECIAIS
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
