package arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

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
		
		
	}
	
	
}
