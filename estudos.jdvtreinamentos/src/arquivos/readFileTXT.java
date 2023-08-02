package Arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class readFileTXT {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream entradaDados = new FileInputStream(
				new File("C:\\Users\\João Andrade\\git\\POO-Java-JDEV-treinamentos\\estudos.jdvtreinamentos\\src\\Arquivos\\arquivo.txt"));
		
		
		Scanner readFile = new Scanner(entradaDados, "UTF-8");
		
		List<Pessoa_arquivo> pessoas = new ArrayList<Pessoa_arquivo>();// create a new Array of Pessoas 
		
		while(readFile.hasNext()) {
			
			String linha = readFile.nextLine();
			
			if (linha != null && !linha.isEmpty()) {
				
				String[] Data = linha.split("\\;");
				
				
				Pessoa_arquivo pessoa = new Pessoa_arquivo();//instance a new object Pessoa 
				pessoa.setNome(Data[0]);
				pessoa.setEmail(Data[1]);
				pessoa.setIdade(Integer.parseInt(Data[2]));
				pessoas.add(pessoa);
				
			}
		}
		for (Pessoa_arquivo pessoa_arquivo : pessoas) {
			System.out.println(pessoa_arquivo);
			
		}
	}
	 
}
