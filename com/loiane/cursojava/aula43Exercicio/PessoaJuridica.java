package com.loiane.cursojava.aula43Exercicio;

public class PessoaJuridica extends Contribuinte {

	// ATRIBUTOS
	private String cnpj;

	// MÉTODOS ESPECIAIS
	public String getCnpj() {
		return this.cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {
		return this.getRendaBruta() * 0.1;
		// return (this.getRendaBruta()/100 * 10;
	}

	public String toString() {
		String s = "Pessoa Juridica[";
	    s += super.toString();
		s += " ;Cnpj: " + cnpj;
		s += " Imposto a ser pago: " + calcularImposto();
	    s += "]";
		return s;
	}
}
