package com.loiane.cursojava.aula43Exercicio;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{

	// ATRIBUTOS
	private int diaRendimento;

	// MÉTODOS
	boolean calcularNovoSaldo(double taxaRendimento) {
       Calendar hoje = Calendar.getInstance();
       if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)) {
    	   //setSaldo += saldo * taxaRendimento;
    	   this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
    	   return true;
       }
       return false;
	}


	// MÉTODOS ESPECIAIS
	public int getDiaRendimento() {
		return this.diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	@Override
	public String toString() {
		String s = "Conta poupança [";
		s+= "Dia rendimento= " + diaRendimento;
		s+= super.toString();
		s+= "]";
		return s;
	}
	
}
