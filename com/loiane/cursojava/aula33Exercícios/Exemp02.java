package com.loiane.cursojava.aula33Exerc�cios;


public class Exemp02 {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente();
		conta.setNumero("123456");
		conta.setAgencia("1234");
		conta.setEspecial(true);
		conta.setLimiteEspecial(500);
		conta.setSaldo(-10);

		System.out.println("Saldo da conta " + conta.getNumero() + "=" + conta.getSaldo());

		boolean saqueEfetuado = conta.realizarSaque(10);

		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
		} else {
			System.out.println("N�o foi possivel realizar saque. Saldo insuficiente");
		}
		saqueEfetuado = conta.realizarSaque(500);
		System.out.println("Tentativa de saque de 500 reais");
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso");
			conta.consultarSaldo();
		} else {
			System.out.println("N�o foi possivel realizar saque. Saldo insuficiente");
		}
		System.out.println("Deposito de 500 reais");
		conta.depositar(500);
		conta.consultarSaldo();

		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Esta usando cheque especial");
		} else {
			System.out.println("N�o est� usando cheque especial");
		}
		conta.realizarSaque(600);
		conta.consultarSaldo();

		if (conta.verificarUsoChequeEspecial()) {
			System.out.println("Esta usando cheque especial");
		} else {
			System.out.println("N�o est� usando cheque especial");
		}
		
	}

}
