package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class ClassDatasEmJava {

	
	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		
		Date date = new Date();
		
	/*	System.out.println("Datas em Mi lisegundos " + date.getTime());
		
		System.out.println("Dia do Mês " + date.getDate());
		
		System.out.println("Dia da Semana " + date.getDay());
		
		System.out.println("Da as Horas " + date.getHours());
		
		System.out.println("Da os Minutos " + date.getMinutes());
		
		System.out.println("Nome do Mês " + date.getMonth());
		
		System.out.println("Data em segundos" + date.getSeconds());
		
		System.out.println("ano " + (date.getYear() + 1900));
		
		/*====================SIMPLE DATE FORMAT============================*/
		
		Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2023");
		
		long days = ChronoUnit.DAYS.between(LocalDate.parse("2023-04-01"), LocalDate.now());
		
		System.out.println("Possui " + days + " dias entre a faicha de data \n\n");
		
		
	
		
	}
	
}
