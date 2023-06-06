package learning_thread_in_java;

import javax.swing.JOptionPane;

public class class_thread {

	public static void main(String[] args) throws InterruptedException {

		
		/*thread processamento paralelo 1.0*/
	Thread threadEmail = new Thread(thread1);
	threadEmail.start();	
		
	
//===================================DIVISÃO DAS THREADS==============================================		
		/*thread processamento paralelo 2.0*/
	Thread threadNF = new Thread(thread2);
	threadNF.start();
//===================================DIVISÃO DAS THREADS==============================================		
		

		/* codigo do sistema do usuario continua o fluxo de trabalho */
		System.out.println("CHEGOU AO FINAL DO TESTE NO FOR");
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuario");

	}
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			/* código da rotina que sera executada em paralelo */
			for (int pos = 0; pos < 10; pos++) {

				/*
				 * quero executar esse envio de algo com tempo de parada ou com tempo
				 * determinado
				 */
				System.out.println("executando algo como exemplo NOTA FISCAL");

				try {
					Thread.sleep(1000); // DA UM TEMPO A CADA EXECUÇÃO (RECEBE EM MILI-SEGUNDOS)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			} // fim do código
			
		}
	};
	
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			/* código da rotina que sera executada em paralelo */
			for (int pos = 0; pos < 10; pos++) {

				/*
				 * quero executar esse envio de algo com tempo de parada ou com tempo
				 * determinado
				 */
				System.out.println("executando algo como exemplo EMAIL");

				try {
					Thread.sleep(1000); // DA UM TEMPO A CADA EXECUÇÃO (RECEBE EM MILI-SEGUNDOS)
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			} // fim do código

			
		}
	};

}
