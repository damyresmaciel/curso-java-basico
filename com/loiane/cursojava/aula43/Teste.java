package com.loiane.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setCurso("Ciência da computação");
		double[] notas= {10, 9, 8, 7};
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		String s1 = "lllllll";
		String s2 = "llllllL";
		
		//System.out.println(s1==s2); compara referencias e nao valores
		System.out.println(s1.equalsIgnoreCase(s2));
		
		Aluno aluno2 = new Aluno();
		aluno2.setCurso("Ciência da computação");
		double[] notas2 = {5, 8, 6, 7};
		aluno2.setNotas(notas2);
		
		//System.out.println(aluno == aluno2);
		System.out.println(aluno.equals(aluno2));
	}

}
