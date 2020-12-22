package com.loiane.cursojava.aula43Exercicio;

public class PessoaFisica extends Contribuinte {

	// ATRIBUTOS
	private String cpf;

	// MÉTODOS ESPECIAIS
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public double calcularImposto() {
		double renda = this.getRendaBruta();
		if (renda <= 1400) {
			return 0;
		} else if (renda > 1400 && renda <= 2100) {
			return (renda * 0.1) - 100;
		} else if (renda > 2100 && renda <= 2800) {
			return (renda * 0.15) - 270;
		} else if (renda > 2800 && renda <= 3600) {
			return (renda * 0.25) - 500;
		}
		// MAIOR QUE 3600
		return (renda * 0.3) - 700;

	}

	public String toString() {
		String s = "Pessoa Física[";
		s += super.toString();
		s += " ; Cpf: "+ cpf;
		s += " ; Imposto a ser pago: "+ calcularImposto();
		s += "]";
		return s;
	}

}
