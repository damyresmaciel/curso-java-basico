package com.loiane.cursojava.aula33Exercícios;

public class Lampada {

	//ATRIBUTOS
	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private String tipoCor;
	private int garantiaMeses;
	private String[] tipos;
	private boolean tipoAbajur;
	private boolean ligada;



	//MÉTODOS ESPECIAIS
	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTensao() {
		return this.tensao;
	}

	public void setTensao(String tensao) {
		this.tensao = tensao;
	}

	public int getPotencia() {
		return this.potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipoCor() {
		return this.tipoCor;
	}

	public void setTipoCor(String tipoCor) {
		this.tipoCor = tipoCor;
	}

	public int getGarantiaMeses() {
		return this.garantiaMeses;
	}

	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}

	public String[] getTipos() {
		return this.tipos;
	}

	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}

	public boolean isTipoAbajur() {
		return this.tipoAbajur;
	}

	public void setTipoAbajur(boolean tipoAbajur) {
		this.tipoAbajur = tipoAbajur;
	}

	public boolean isLigada() {
		return this.ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	//MÉTODOS
	public void ligar() {
		setLigada(true);
	}

	public void desligar() {
		setLigada(false);
	}

	public void mostrarEstado() {
		if (isLigada()) {
			System.out.println("Lampada está ligada");
		} else {
			System.out.println("Lampada está desligada");
		}
	}

	public void mudarEstado() {
		if (isLigada()) {
			desligar();
		} else {
			ligar();
		}
	}
}
