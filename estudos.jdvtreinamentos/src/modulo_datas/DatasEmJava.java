package modulo_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatasEmJava {

	
		public static void main(String[] args) {
			
			LocalDate localDate = LocalDate.now();
			
			
			System.out.println("Data atual: " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) );//mostra a data atual
			
			System.out.println("Dia da Semana: " + localDate.getDayOfWeek().name());//mostra o dia da semana da data atual
			
			System.out.println("Dia do Mês: " + localDate.getDayOfMonth());//mostra o dia do mes da data atual
			
			System.out.println("Dia do Ano: " + localDate.getDayOfYear());//mostra o dia do ano da data atual
			
			
			
			System.out.println("Mês do Ano: " + localDate.getMonth());//mostra a mês por extenso
			System.out.println("Ano: " + localDate.getYear());//mostra o ano
			
		}
}
