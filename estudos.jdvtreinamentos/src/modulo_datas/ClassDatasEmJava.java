package modulo_datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassDatasEmJava {

	
	public static void main(String[] args) {
		
		Date date = new Date();
		
		System.out.println("Datas em Mi lisegundos " + date.getTime());
		
		System.out.println("Dia do Mês " + date.getDate());
		
		System.out.println("Dia da Semana " + date.getDay());
		
		System.out.println("Da as Horas " + date.getHours());
		
		System.out.println("Da os Minutos " + date.getMinutes());
		
		System.out.println("Nome do Mês " + date.getMonth());
		
		System.out.println("Data em segundos" + date.getSeconds());
		
		System.out.println("ano " + (date.getYear() + 1900));
		
		/*====================SIMPLE DATE FORMAT============================*/
		
		SimpleDateFormat simpleDateFormat =  new SimpleDateFormat("dd/MM/yyy");
		
		System.out.println("Data atual: " + simpleDateFormat.format(date));
		
	}
	
}
