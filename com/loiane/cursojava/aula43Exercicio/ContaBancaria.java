package com.loiane.cursojava.aula43Exercicio;

public class ContaBancaria {

	// ATRIBUTOS
	private String nomeCliente;
	private String numConta;
	private double saldo;

	// MÉTODOS
	public boolean sacar(double valor) {
       if((saldo-valor) >=0) {
    	   saldo-= valor;
    	   return true;
       }
       return false;
		
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	// MÉTODOS ESPECIAS
	public String getNomeConta() {
		return this.nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumConta() {
		return this.numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		String s = " ";
		s += "nome Cliente= "+ nomeCliente;
		 s+= "\n num Conta= " + numConta;
		 s+= "\n saldo= " + saldo;
		return s;
	}
	
}
