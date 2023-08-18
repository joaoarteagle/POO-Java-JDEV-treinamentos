package arquivos;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;



public class AulaJson {

	public static void main(String[] args) throws IOException {
		
		//add User1
		UsuarioJson usuario1 = new UsuarioJson();
		usuario1.setNome("Joao Paulo");
		usuario1.setCpf("123456789");
		usuario1.setLogin("joaoao");
		usuario1.setSenha("456789123");
		
		//add User2
		UsuarioJson usuario2 = new UsuarioJson();
		usuario2.setNome("Pedro");
		usuario2.setCpf("4564545656");
		usuario2.setLogin("Pedroteste");
		usuario2.setSenha("senhasenha");
		
		List<UsuarioJson> usuarios = new ArrayList<UsuarioJson>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		String jsonUser = new Gson().toJson(usuarios);
		
		System.out.println(jsonUser);
		
		FileWriter fileWriter = 
				new FileWriter("C:\\Users\\João Andrade\\git\\POO-Java-JDEV-treinamentos\\estudos.jdvtreinamentos\\src\\arquivos\\filejson.json");
	
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
		
		//==============================READ .JSON=================================================
		
		FileReader fileReader = new FileReader("C:\\Users\\João Andrade\\git\\POO-Java-JDEV-treinamentos\\estudos.jdvtreinamentos\\src\\arquivos\\filejson.json");
		
		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);
	     
		List<UsuarioJson> leUsuarios = new ArrayList<UsuarioJson>();
		
		for (JsonElement jsonElement : jsonArray) {
			
			
			
		}
	}
	
	
}
