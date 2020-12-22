package com.loiane.cursojava.aula42;

public class Teste {

	public static void main(String[] args) {

		
		//Pessoa aluno = new Aluno();  CLASSE FINAL NAO PODE SER EXTENDES, NAO TEM HERENÇA.
		
		//Pessoa professor = new Professor();  CLASSE FINAL NAO PODE SER EXTENDES,NAO TEM HERENÇA.
		
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		//EXEMPLO 02
		System.out.println(Constantes.URL_BLOG);
		//Constantes.URL_BLOG = "kkkkkkk"; classe final nao pode ser modificada
		System.out.println(Constantes.URL_BLOG);
		
		final int total = 1;
		//total = total=1; final nao pode ser modificado
		System.out.println(total);
	}

}
