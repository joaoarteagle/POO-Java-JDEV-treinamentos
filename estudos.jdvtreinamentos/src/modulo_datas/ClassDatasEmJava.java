package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class ClassDatasEmJava {

	public static void main(String[] args) throws ParseException {

		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date dataVencimento = simpleDateFormat.parse("11/04/2021");

		Date dataAtual = simpleDateFormat.parse("07/04/2021");

		/* se a dataVencimento é maior que a dataAtual */
		
		//After -> se data 1 é maior que data 2
		//Before -> se data 1 é menor que data 2
		
		if (dataAtual.before(dataVencimento)) {
			System.out.println("Boleto não vencido");
		} else {
			System.out.println("Boleto vencido... Pague urgente");
		}

	}

}
