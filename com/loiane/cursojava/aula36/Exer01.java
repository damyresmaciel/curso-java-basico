package com.loiane.cursojava.aula36;

public class Exer01 {

	public static void main(String[] args) {

		Contato contato = new Contato();

		contato.setNome("Tyrion");
		// contato.setTelefone("99999");
		// contato.setEndereco("Kings landing");

		// CRIAR OBJETO ENDERECO
		Endereco end = new Endereco();
		end.setNomeRua("Game of Thrones");
		end.setNumero("n/a");
		end.setComplemento("-");
		end.setCidade("Kings Landing");
		end.setEstado("Westeros");
		end.setCep("999999");

		contato.setEndereco(end);
		//RELACIONAMENTO TEM UM TEFELEFONE
		Telefone telefone = new Telefone();
		telefone.setTipo("celular");
	    telefone.setDdd("11");
	    telefone.setNumero("95555");

		// TESTE SAÍDA NO CONSOLE
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefones());

		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}

	}

}
