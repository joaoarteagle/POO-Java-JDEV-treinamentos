package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasCalendar {

	public static void main(String[] args) throws ParseException {
		Calendar calendar = Calendar.getInstance();// pega a data atual

		// simular que a data vem do banco de dados

		calendar.setTime(new SimpleDateFormat("dd/MM/yyyy").parse("10/03/2023"));
		// ==================================================================================================================
		calendar.add(Calendar.DAY_OF_MONTH, 40);

		System.out.println("Somando dia do mes " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));// somando
																													// dia
																													// do
																													// mes
		// ==================================================================================================================
		calendar.add(calendar.MONTH, 3);

		System.out.println("Somando mês " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));// somando
																											// mes
		// ==================================================================================================================
		calendar.add(calendar.YEAR, 1);

		System.out.println("Somando ano " + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));// somando
																											// ano
	}
}
