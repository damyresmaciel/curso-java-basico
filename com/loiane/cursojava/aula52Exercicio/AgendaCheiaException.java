package com.loiane.cursojava.aula52Exercicio;

public class AgendaCheiaException extends Exception{

	@Override
	public String getMessage() {
		return "Agenda já esta cheia";
	}
	
}
