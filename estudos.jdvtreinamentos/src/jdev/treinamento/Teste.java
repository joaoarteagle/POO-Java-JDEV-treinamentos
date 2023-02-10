package jdev.treinamento;

import javax.swing.JOptionPane;

import poo.classes.Aluno;
import poo.classes.Disciplina;

public class Teste {

	public static void main(String[] args) {

		/* new Aluno() é uma instancia (criação de objeto) */
		/* aluno2 é umareferencia para o objeto Aluno */

		/* Agora temos um objeto real na memoria */

		Aluno aluno4 = new Aluno();
		String nome = JOptionPane.showInputDialog("Qual nome do aluno???");
		String idade = JOptionPane.showInputDialog("Qual a idade do aluno???");
		String dataNascimento = JOptionPane.showInputDialog("Qual data de nascimento do aluno???");
		

		aluno4.setNome(nome);
		aluno4.setIdade(Integer.valueOf(idade));
		aluno4.setDataNascimento(dataNascimento);
/*----------------------------------------------------------------*/
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de Dados");
		
		aluno4.getDisciplinas().add(disciplina1);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("matematica");
		
		
		System.out.println(aluno4.toString());
		System.out.println(aluno4.getAlunoAprovado());

	}

}
