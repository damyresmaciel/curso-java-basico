package com.loiane.cursojava.aula24Exercicios;

public class Exemp03 {

	public static void main(String[] args) {
		
     LivroDeLivraria livroDeLivraria = new LivroDeLivraria();

		livroDeLivraria.editora = "Person Universidades, Edi�ao10";
		livroDeLivraria.idioma = "Portugu�s";
		livroDeLivraria.dimensoeslivro = 28;
		livroDeLivraria.autor = "Paul Deitel, Harvey Deitel";
		livroDeLivraria.paginas = 968;
		livroDeLivraria.pesoLivro = 2.2;
		livroDeLivraria.preco= 314;
		
		System.out.println("Editora do livro=" + livroDeLivraria.editora);
		System.out.println("Idioma= " + livroDeLivraria.idioma);
		System.out.println("Dimens�o= "+ livroDeLivraria.dimensoeslivro);
		System.out.println("Autor do livro= " + livroDeLivraria.autor);
		System.out.println("Paginas= " + livroDeLivraria.paginas);
		System.out.println("Peso= " + livroDeLivraria.pesoLivro);
		System.out.println("Pre�o= "+ livroDeLivraria.preco);
	}

}
