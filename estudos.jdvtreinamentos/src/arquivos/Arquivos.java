package arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {

	public static void main(String[] args) throws IOException {
		
		Pessoa_arquivo pessoa1  = new Pessoa_arquivo();
		pessoa1.setNome("alan");
		pessoa1.setEmail("alex@gmail.com");
		pessoa1.setIdade(25);
		
		Pessoa_arquivo pessoa2  = new Pessoa_arquivo();
		pessoa2.setNome("Alex");
		pessoa2.setEmail("alex@gmail.com");
		pessoa2.setIdade(25);
		
		Pessoa_arquivo pessoa3  = new Pessoa_arquivo();
		pessoa3.setNome("Alex");
		pessoa3.setEmail("alex@gmail.com");
		pessoa3.setIdade(25);
		
		
		List<Pessoa_arquivo> pessoas = new ArrayList<Pessoa_arquivo>(); 
			pessoas.add(pessoa1);
			pessoas.add(pessoa2);
			pessoas.add(pessoa3);
			
		
		
		
		File arquivo = new File("C:\\Users\\João Andrade\\git\\POO-Java-JDEV-treinamentos\\estudos.jdvtreinamentos\\src\\Arquivos\\arquivo.txt");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
			
		}
		FileWriter escrever_arquivo = new FileWriter(arquivo);
		
		
		for (Pessoa_arquivo pessoa_arquivo : pessoas) {
			escrever_arquivo.write(pessoa_arquivo.getNome() + ";" + pessoa_arquivo.getEmail() + ";" + pessoa_arquivo.getIdade() + "\n\n");
			
			
		}
		
		
		escrever_arquivo.flush();
		escrever_arquivo.close();
	}
}
