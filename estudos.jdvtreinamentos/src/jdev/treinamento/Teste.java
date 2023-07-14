package jdev.treinamento;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

import javax.swing.JOptionPane;

import poo.classes.Aluno;
import poo.classes.Disciplina;

public class Teste {

	public static void main(String[] args) {

		/* new Aluno() � uma instancia (cria��o de objeto) */
		/* aluno2 � umareferencia para o objeto Aluno */

		/* Agora temos um objeto real na memoria */

		List<Aluno> alunos = new ArrayList<Aluno>();
         
		for (int qnt = 1; qnt <= 2; qnt++) {

		Aluno aluno = new Aluno();//é uma instancia (criação de objeto)
		
			String nome = JOptionPane.showInputDialog("Qual nome do aluno " + qnt + " ???");
			aluno.setNome(nome);
			
			/*
			  String idade = JOptionPane.showInputDialog("Qual a idade do aluno???");
			  String dataNascimento = JOptionPane.showInputDialog("Qual data de nascimento do aluno???");
			  String rg = JOptionPane.showInputDialog("Qual o RG do aluno?"); 
			  String cpf = JOptionPane.showInputDialog("Qual o CPF do aluno?"); 
			  String mae = JOptionPane.showInputDialog("Qual o nome da m�e?"); 
			  String pai = JOptionPane.showInputDialog("Qual o nome do pai?");
			  String matricula = JOptionPane.showInputDialog("Dia da matricula:");
			  
			  aluno.setIdade(Integer.valueOf(idade));
			  aluno.setDataNascimento(dataNascimento); 
			  aluno.setRegistroGeral(rg);
			  aluno.setNumeroCpf(cpf);
			  aluno.setNomeMae(mae); 
			  aluno.setNomePai(pai);
			  aluno.setDataMatricula(matricula);
			*/ 
		/*----------------------------------------------------------------*/
			for (int posi = 1; posi <= 4; posi++) {

				String nomeDisciplina = JOptionPane.showInputDialog("nome da Disciplina " + posi + " ?");
				String notaDisciplina = JOptionPane.showInputDialog("Qual nota da disciplina " + posi + " ?");

				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina(nomeDisciplina);
				disciplina.setNota(Double.valueOf(notaDisciplina));

				aluno.getDisciplinas().add(disciplina);
			}

			int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
			if (escolha == 0) {

				int continuarRemover = 0;/* op��o sim � zero */

				int posicao = 1;

				while (continuarRemover == 0) {
					String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1 , 2 , 3 , 4 ?");
					aluno.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
					posicao++;

					continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar Remover?");
				}

			}
           alunos.add(aluno);
			
		}
		/*------------------------------------------------------------------------*/
		for (Aluno aluno : alunos) {
			
			if(aluno.getNome().equalsIgnoreCase("alex")) {
			alunos.remove(aluno);
			break;
			}else {
		System.out.println(aluno.toString());
		System.out.println(aluno.getAlunoAprovado());
			System.out.println("====================================================================");
			}
			
			}
			
		for (Aluno aluno: alunos) {
			System.out.println("Alunos que sobraram na lista:");
			System.out.println(aluno.getNome());
			System.out.println("Suas dicliplinas: ");

		for	(Disciplina disciplina : aluno.getDisciplinas()) {
			System.out.println(disciplina.getDisciplina());
       
		}
			
		}

       

	}

}
