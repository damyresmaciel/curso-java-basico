package com.loiane.cursojava.aula46_Exerc�cios;

public class Teste {

	public static void main(String[] args) {

		Quadrado f1 = new Quadrado();
		f1.setLado(4);
		f1.setCor("Azul");
		f1.setNome("Quadrado");
		
		Circulo f2 = new Circulo();
		f2.setCor("Azul");
		f2.setRaio(2);
		f2.setNome("C�rculo");
		
		Triangulo f3 = new Triangulo();
		f3.setAltura(2);
		f3.setBase(3);
		f3.setNome("Triangulo");
		
		Cubo f4 = new Cubo();
		f4.setLado(3);
		f4.setNome("Cubo");
		
		Cilindro f5 = new Cilindro();
		f5.setAltura(3);
		f5.setRaio(2);
		f5.setNome("Cilindro");
		
		Piramide f6 = new Piramide();
		f6.setAltura(3);
		f6.setApotema(4);
		f6.setArestaBase(2);
		f6.setNumPoliBase(4);
		f6.setBase(f1);
		f6.setNome("Piramide");
		
		
		FiguraGeometrica [] figuras = new FiguraGeometrica[6];
		figuras[0]= f1;
		figuras[1]= f2;
		figuras[2]= f3;
		figuras[3]= f4;
		figuras[4]= f5;
		figuras[5]= f6;
		
		for(FiguraGeometrica figura : figuras) {
			System.out.println("--------------");
			System.out.println(figura.getNome());
			
			if(figura instanceof Figura2d) {    //downcasting
				Figura2d f2d = (Figura2d) figura;
				System.out.println(f2d.calcularArea());
			}
			if(figura instanceof Figura3d) {
				Figura3d f3d = (Figura3d) figura;
				System.out.println(f3d.calcularArea());
				System.out.println(f3d.calcularVolume());
			}
		}
	}

}
