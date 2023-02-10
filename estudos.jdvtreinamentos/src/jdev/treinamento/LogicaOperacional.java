package jdev.treinamento;

import javax.swing.JOptionPane;

public class LogicaOperacional {

	public static void main(String[] args) {
		String carros = JOptionPane.showInputDialog("informe a quantidade de carros: ");
		String pessoa = JOptionPane.showInputDialog("informe a quantidade de pessoas:");

		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoa);

		int divisao = (int) (carroNumero / pessoaNumero);

		double resto = carroNumero % pessoaNumero;

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");

		if (resposta == 0) {

			JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao);

		}

		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão ?");
		if (resposta == 0) {

			JOptionPane.showMessageDialog(null, "O resto da Divisão deu " + resto);
		}

	}
}
