package com.loiane.cursojava.aula24Exercicios;

public class Exemp02 {

	public static void main(String[] args) {

		Livro livro = new Livro();
		
		livro.nome= "Java";
		livro.autor= "Paul Deitel, Harvey Deitel";
		livro.qtdPaginas = 968;
		livro.anoLancamento = 2014;
		livro.isbn = "12456";
		
		System.out.println("Nome = "+ livro.nome);
		System.out.println("Autor do livro = " + livro.autor);
		System.out.println("Paginas = " + livro.qtdPaginas);
		System.out.println("Ano de lancamento = " + livro.anoLancamento);
		System.out.println("Ibsan = " + livro.isbn);
	}

}
