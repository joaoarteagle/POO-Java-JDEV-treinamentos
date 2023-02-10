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

		/*------------------------------------------------------------------------*/
		System.out.println(aluno.toString());
		System.out.println(aluno.getAlunoAprovado());

	}

}
