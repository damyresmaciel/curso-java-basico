package com.loiane.cursojava.aula43Exercicio;

public class teste_03 {

	public static void main(String[] args) {
        System.out.println("ZOO");
       
		Animal camelo = new Animal();
		camelo.setNome("Camelo");
		camelo.setComprimento(150);
		//camelo.setPatas(4);
		camelo.setCor("Amarelo");
		camelo.setAmbiente("Terra");
		camelo.setVelocidade(2.0);
		
		
		System.out.println();
		Peixe tubarao = new Peixe();
		tubarao.setNome("Tubar�o");
		tubarao.setComprimento(300);
		tubarao.setVelocidade(1.5);
		
	
		
		Mamifero urso = new Mamifero();
		urso.setNome("Urso do canad�");
		urso.setComprimento(180);
		//urso.setPatas(4);
		urso.setCor("Vermelho");
		urso.setVelocidade(0.5);
		
		
		Animal[] animais = new Animal[3];
		animais[0]= camelo;
		animais[1]= tubarao;
		animais[2]= urso;
		
		System.out.println("------------------");
		for(Animal animal: animais) {
			System.out.println(animal.toString());
			System.out.println("--------------");
		}
		
		
		
	}

}
