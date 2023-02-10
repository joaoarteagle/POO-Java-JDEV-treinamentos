package jdev.treinamento;

import java.util.Dictionary;

import javax.swing.JOptionPane;

import poo.classes.Aluno;
import poo.classes.Disciplina;

public class Teste {

	public static void main(String[] args) {

		/* new Aluno() é uma instancia (criação de objeto) */
		/* aluno2 é umareferencia para o objeto Aluno */

		/* Agora temos um objeto real na memoria */

		Aluno aluno = new Aluno();
		String nome = JOptionPane.showInputDialog("Qual nome do aluno???");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno???");
		String dataNascimento = JOptionPane.showInputDialog("Qual data de nascimento do aluno???");

		aluno.setNome(nome);
		aluno.setIdade(Integer.valueOf(idade));
		aluno.setDataNascimento(dataNascimento);
		/*----------------------------------------------------------------*/
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de Dados");
		disciplina1.setNota(90);
		/*------------------------------------------------------------------------*/
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("matematica");
		disciplina2.setNota(80);
		/*------------------------------------------------------------------------*/
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("algoritmo");
		disciplina3.setNota(85);
		/*------------------------------------------------------------------------*/
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("eng. software");
		disciplina4.setNota(70);
		/*------------------------------------------------------------------------*/
		aluno.getDisciplinas().add(disciplina1);
		aluno.getDisciplinas().add(disciplina2);
		aluno.getDisciplinas().add(disciplina3);
		aluno.getDisciplinas().add(disciplina4);
		/*------------------------------------------------------------------------*/
		System.out.println(aluno.toString());
		System.out.println(aluno.getAlunoAprovado());

	}

}
