package com.loiane.cursojava.aula52Exercicio;

public class ContatoNaoExisteException extends Exception {

	private String nomeContato;
	
	public ContatoNaoExisteException(String nomeContato) {
		
	}
	@Override
	public String getMessage() {
		return "Contato "+ nomeContato + "Não existe na agenda!" ;
	}
}
