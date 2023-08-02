package arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

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
		
			
		try (HSSFWorkbook Teste = new HSSFWorkbook()) {
			HSSFSheet rowPessoas = Teste.createSheet("Planilha de Pessoas Jdev Treinamentos");//STARTING THE SPREADSHEET
			
			int nRow = 0;//AUX
			
			for (Pessoa_arquivo P : pessoas) {
				Row row = rowPessoas.createRow(nRow ++);
				
				int cell = 0;
//======================START CELLS===================//
				//NAME-CELL01
				Cell celNome = row.createCell(cell++);
				celNome.setCellValue(P.getNome());
				//EMAIL-CELL02
				Cell celEmail = row.createCell(cell++);
				celEmail.setCellValue(P.getEmail());
				//AGE-CELL03
				Cell celIdade = row.createCell(cell++);
				celIdade.setCellValue(P.getIdade());
//=========================END========================//
			}//FINISHING TO ASSEMBLE THE SPREADSHEET
			
			FileOutputStream Exit = new FileOutputStream(file);
			Teste.write(Exit);//Write the Spreadsheet to file
			Exit.flush();
			Exit.close();
		}

		
		System.out.println("Planilha foi criada");
		
	}
	
}
