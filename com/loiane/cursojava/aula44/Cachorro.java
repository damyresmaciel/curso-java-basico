package com.loiane.cursojava.aula44;

public class Cachorro extends Mamifero implements AnimalDomesticado,AnimalEstimacao{

	//ATRIBUTOS
	private int tamanho;
	private String ra�a;
	
	//M�TODOS ESPECIAIS
	public int getTamanho() {
		return this.tamanho;
	}
	public void setTamanhho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String ra�a() {
		return this.ra�a;
	}
	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}
	@Override
	public void amamentar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void levarVeterinario() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void brincar() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void levarPassear() {
		// TODO Auto-generated method stub
		
	}
}
