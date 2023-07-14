package modulo_datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LearnLocalTime {

	public static void main(String[] args) {

		
		//Nova API de data a partir do Java 8
		//--------------------------------------
		LocalDate dataAtual = LocalDate.now();

		System.out.println("teste: " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		//---------------------------------------
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("teste hora: " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		//-------------------------------------
		
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		
		System.out.println("Data e hora atual : " + dataHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		

	}

}
