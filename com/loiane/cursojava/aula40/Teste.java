package com.loiane.cursojava.aula40;

public class Teste {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();
		
		pessoa.setEndereco("Rua 1, n�mero 400");
		aluno.setEndereco("Rua 2, n�mero 300");
		professor.setEndereco("Rua 3, n�mero 200");
		
		System.out.println(pessoa.obterEtiquetaEndereco());
		System.out.println(aluno.obterEtiquetaEndereco());
		System.out.println(professor.obterEtiquetaEndereco());
		
		
	}

}
