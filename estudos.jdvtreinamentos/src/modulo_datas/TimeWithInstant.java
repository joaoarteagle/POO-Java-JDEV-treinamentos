package modulo_datas;

import java.time.Duration;
import java.time.Instant;

public class TimeWithInstant {

	public static void main(String[] args) throws InterruptedException {
		
		Instant inicio = Instant.now();
		
		
		
		Thread.sleep(2000);//simula um processo que tem um tempo indeterminado
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println("Duração em nano-Segundos: " + duracao.toNanos());
		
		System.out.println("Duração em minutos: " + duracao.toMinutes());
		
		System.out.println("Duração em Horas: " + duracao.toHours());
		
		System.out.println("Duração em Mili-Segundos: " + duracao.toMillis());
		
		System.out.println("Duração em Dias: " + duracao.toDays());
		
	}
	
}
