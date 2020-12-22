package com.loiane.cursojava.aula43Exercicio;

public class Teste_01 {

	public static void main(String[] args) {

		System.out.println("*** TESTE CONTA POUPAN�A***");
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Cliente Conta Poupan�a");
		contaPoupanca.setNumConta("22222");
		contaPoupanca.setDiaRendimento(2);
		

		contaPoupanca.depositar(100);
		
		realizarSaque(contaPoupanca, 50);
		
		realizarSaque(contaPoupanca, 70);
		
		if(contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo �= " + contaPoupanca.getSaldo());
		} else {
			System.out.println("Hoje n�o � dia de rendimento,novo saldo n�o calculado");
		}
		
		System.out.println(contaPoupanca);
	}

	private static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso, novo saldo= " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de= " + conta.getSaldo());
		}
	}

}
