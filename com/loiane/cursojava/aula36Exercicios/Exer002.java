package com.loiane.cursojava.aula36Exercicios;

import java.util.Scanner;

public class Exer002 {

	public static void main(String[] args) {
		//TODO corrigir as notas

		Scanner scan = new Scanner(System.in);
		String nome, horario, nomeProf, emailProf, departamentoProf;

		System.out.println("Entre com o nome do curso: ");
		nome = scan.nextLine();

		System.out.println("Entre com o horário do curso: ");
		horario = scan.nextLine();

		System.out.println("Entre com o nome do professor: ");
		nomeProf = scan.nextLine();

		System.out.println("Entre com email: ");
		emailProf = scan.nextLine();

		System.out.println("Entre com o departamento: ");
		departamentoProf = scan.nextLine();

		Curso curso = new Curso();
		curso.setNome(nome);
		curso.setHorario(horario);

		Professor professor = new Professor();
		professor.setNome(nomeProf);
		professor.setDepartamento(departamentoProf);
		professor.setEmail(emailProf);

		curso.setProfessor(professor);

		System.out.println("------Alunos-----");

		Aluno[] alunos = new Aluno[1];
		for (int i = 0; i < alunos.length; i++) {

			scan.nextLine();
			System.out.println("Entre com o nome do aluno: " + (i + 1));
			String nomeAluno = scan.nextLine();
			
			System.out.println("Entre com a matricula do ano");
			String matAluno = scan.nextLine();

			double[] notas = new double[1];

			for (int j = 0; j < notas.length; j++) {
				System.out.println("Entre com a nota: " + (j + 1));
				notas[j] = scan.nextDouble();
			}
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matAluno);
			aluno.setNotas(notas);

			alunos[i] = aluno;
		}
		curso.setAlunos(alunos);

		System.out.println(curso.obterInfo());
		scan.close();
	}
}
