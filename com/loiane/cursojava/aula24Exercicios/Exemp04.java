package com.loiane.cursojava.aula24Exercicios;

import java.util.Date;

public class Exemp04 {

	public static void main(String[] args) {

		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		livro.paginas= 998;
		livro.editora= "Deitel";
		livro.idioma= "Português";
		livro.pesoLivro= 2;
		livro.autor= "Paul Deitel, Harvey Deitel";
		
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadoA = "Damyres";
		
	
		
		System.out.println("Editora do livro="+ livro.paginas);
		System.out.println("Idioma= " + livro.idioma);
		System.out.println("Autor do livro=" + livro.autor);
		System.out.println("Paginas= " + livro.paginas);
		System.out.println("Peso= " + livro.pesoLivro);
		System.out.println("Emprestimo= " + livro.emprestado);
		System.out.println("Devolucao= " + livro.dataEntrega);
		System.out.println("Emprestado= " + livro.emprestadoA);
		
		
	}

}
