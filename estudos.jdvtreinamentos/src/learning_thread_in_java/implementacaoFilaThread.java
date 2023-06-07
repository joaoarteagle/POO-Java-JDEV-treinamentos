package learning_thread_in_java;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class implementacaoFilaThread extends Thread{
	
	private static ConcurrentLinkedQueue<ObjetoFilaThread> pilha_filha = 
			new ConcurrentLinkedQueue<ObjetoFilaThread>();

	
	public static void add(ObjetoFilaThread objetoFilaThread) {
	pilha_filha.add(objetoFilaThread);
		
	}
	
	@Override
	public void run() {
		Iterator iteracao  = pilha_filha.iterator();
		
		synchronized (iteracao) {/*Bloquear o acesso a esta lista por outro processo*/

			while (iteracao.hasNext()) { //enquanto conter dados na lista ira processar 
				
				ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next(); //pega o objeto atual
				
				/*processar 10 mil notas fiscais como por exemplo*/
				
				iteracao.remove();
				
				try {
					Thread.sleep(1000);//processou toda a lista da um tempo para limpesa de memoria
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
