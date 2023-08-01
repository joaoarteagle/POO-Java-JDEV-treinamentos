package Arquivos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ApachiPoi {

	public static void main(String[] args) throws IOException {
		
		File file = 
				new File("C:\\Users\\João Andrade\\git\\POO-Java-JDEV-treinamentos\\estudos.jdvtreinamentos\\src\\Arquivos\\arquivo_excel.xls");
		
		if(!file.exists()) {
			file.createNewFile();
			
		}
		
		//===========INSERTING DATES==================
		Pessoa_arquivo pessoa1  = new Pessoa_arquivo();
		pessoa1.setNome("Renan");
		pessoa1.setEmail("renan@gmail.com");
		pessoa1.setIdade(19);
		
		Pessoa_arquivo pessoa2  = new Pessoa_arquivo();
		pessoa2.setNome("Alisson");
		pessoa2.setEmail("alisson@gmail.com");
		pessoa2.setIdade(18);
		
		Pessoa_arquivo pessoa3  = new Pessoa_arquivo();
		pessoa3.setNome("Gustavo");
		pessoa3.setEmail("gustavo@gmail.com");
		pessoa3.setIdade(19);
		
		
		List<Pessoa_arquivo> pessoas = new ArrayList<Pessoa_arquivo>(); 
			pessoas.add(pessoa1);
			pessoas.add(pessoa2);
			pessoas.add(pessoa3);
	//===================================================================	
		
			
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook();// Usado para escrever a planilha
		
		
	}
	
}
