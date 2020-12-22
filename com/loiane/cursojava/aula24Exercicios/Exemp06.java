package com.loiane.cursojava.aula24Exercicios;

public class Exemp06 {

	public static void main(String[] args) {
	

		Contato contato = new Contato();
		
	    contato.nome = "Damyres";
		contato.email = "damyresmaciel@hotamil.com";
		contato.endereco = "Avenida B, numero 3000";
		
		contato.telefone = new String[5];
		contato.telefone[0]= "999-999";
		contato.telefone[1]= "999-999";
		contato.telefone[2]= "999-999";
		
		
		
		System.out.println("Nome= "
		+contato.nome+ " " + "Email= "
	    +contato.email+ " " + " " + " " + "Endereço= "
		+contato.endereco+ " " + "Telefone= "+"" + " " + contato.telefone);
	}
}
