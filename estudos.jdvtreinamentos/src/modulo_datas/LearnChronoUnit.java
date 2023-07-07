package modulo_datas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.text.ParseException;
public class LearnChronoUnit {

	public static void main(String[] args) throws ParseException {
		
		long Day = ChronoUnit.DAYS.between(LocalDate.parse("2019-07-07"), LocalDate.now());//total de dias de um dia até hoje
		
		System.out.println("Possui " + Day + " dias entre a faixa de data");
		
		

		long Week = ChronoUnit.WEEKS.between(LocalDate.parse("2019-07-07"), LocalDate.now());//total de dias de um dia até hoje
		
		System.out.println("Possui " + Week + " Semanas entre a faixa de data");
		
		
		

		long Month = ChronoUnit.MONTHS.between(LocalDate.parse("2019-07-07"), LocalDate.now());//total de dias de um dia até hoje
		
		System.out.println("Possui " + Month + " meses entre a faixa de data");
		
		
		

		long Year = ChronoUnit.YEARS.between(LocalDate.parse("2019-07-07"), LocalDate.now());//total de dias de um dia até hoje
		
		System.out.println("Possui " + Year + " anos entre a faixa de data");
		
	}
	
}
