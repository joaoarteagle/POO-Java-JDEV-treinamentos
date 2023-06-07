package learning_thread_in_java;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class implementacaoFilaThread extends Thread {

	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha = new ConcurrentLinkedQueue<ObjetoFilaThread>();

	public static void add(ObjetoFilaThread objetoFilaThread) {
		pilha_filha.add(objetoFilaThread);

	}

	@Override
	public void run() {

		System.out.println("fila rodando");


		while (true) {

			synchronized (pilha_filha) {/* Bloquear o acesso a esta lista por outro processo */

				Iterator iteracao = pilha_filha.iterator();
				while (iteracao.hasNext()) { // enquanto conter dados na lista ira processar

					ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); // pega o objeto atual

					System.out.println("==========================================================");
					System.out.println(processar.getNome());
					System.out.println(processar.getEmail());
					/* processar 10 mil notas fiscais como por exemplo */

					iteracao.remove();

					try {
						Thread.sleep(1000);// processou toda a lista da um tempo para limpesa de memoria
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}
