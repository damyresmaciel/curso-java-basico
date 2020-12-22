package com.loiane.cursojava.aula41;

public class Teste {

	public static void main(String[] args) {

		// Pessoa pessoa = new Pessoa(); Classe mae abstrata nao pode ser instanciada
		
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		//pessoa.setEndereco("Rua 1, número 2");
		aluno.setEndereco("Rua 2, número 3");
		professor.setEndereco("Rua 3, número 4");
		
		//System.out.println(aluno.obterEtiquetaEndereco());
		//System.out.println(professor.obterEtiquetaEndereco());
		
		aluno.imprimirEtiquetaEndereco();
		professor.imprimirEtiquetaEndereco();
	}

}
