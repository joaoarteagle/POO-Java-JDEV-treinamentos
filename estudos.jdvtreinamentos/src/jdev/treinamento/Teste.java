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
        String rg = JOptionPane.showInputDialog("Qual o RG do aluno?");
		String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno?");
		String mae = JOptionPane.showInputDialog("Qual o nome da mãe?");
		String pai = JOptionPane.showInputDialog("Qual o nome do pai?");
		String matricula = JOptionPane.showInputDialog("Dia da matricula:");
		
		aluno.setNome(nome);
		aluno.setIdade(Integer.valueOf(idade));
		aluno.setDataNascimento(dataNascimento);
		aluno.setRegistroGeral(rg);
		aluno.setNumeroCpf(cpf);
		aluno.setNomeMae(mae);
		aluno.setNomePai(pai);
		aluno.setDataMatricula(matricula);
		/*----------------------------------------------------------------*/
            for (int posi = 1; posi<=4; posi++) {
            	
            	String nomeDisciplina = JOptionPane.showInputDialog("nome da Disciplina "+posi+" ?");
            	String notaDisciplina = JOptionPane.showInputDialog("Qual nota da disciplina " +posi+ " ?");
            	
            	
            	Disciplina disciplina = new Disciplina();
            	disciplina.setDisciplina(nomeDisciplina);
            	disciplina.setNota(Double.valueOf(notaDisciplina));
            	
            	aluno.getDisciplinas().add(disciplina);
            }
		/*------------------------------------------------------------------------*/
		System.out.println(aluno.toString());
		System.out.println(aluno.getAlunoAprovado());

	}

}
