package com.loiane.cursojava.aula43Exercicio;

public class Teste_02 {

	public static void main(String[] args) {

		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("Contribuinte 01");
		p1.setRendaBruta(1000);
		p1.setCpf("859.801.170-32");
		
		PessoaJuridica p2 = new PessoaJuridica();
		p2.setNome("Contribuinte 02");
		p2.setRendaBruta(5000);
		p2.setCnpj("71.933.805/0001-36");
		
		PessoaFisica p3 = new PessoaFisica();
		p3.setNome("Contribuinte 03");
		p3.setRendaBruta(2000);
		p3.setCpf("294.734.940-76");
		
		PessoaJuridica p4 = new PessoaJuridica();
		p4.setNome("Contribuinte 04");
		p4.setRendaBruta(3000);
		p4.setCnpj("32.213.428/0001-09");
		
		PessoaFisica p5 = new PessoaFisica();
		p5.setNome("Contribuinte 05");
		p5.setRendaBruta(3700);
		p5.setCpf("514.074.840-10");
		
		PessoaJuridica p6 = new PessoaJuridica();
		p6.setNome("Contribuinte 06");
		p6.setRendaBruta(4000);
		p6.setCnpj("91.505.717/0001-40");
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0]= p1;
		contribuintes[1]= p2;
		contribuintes[2]= p3;
		contribuintes[3]= p4;
		contribuintes[4]= p5;
		contribuintes[5]= p6;
		
		for(Contribuinte c : contribuintes) {
			System.out.println(c.toString());
		}
	}

}
