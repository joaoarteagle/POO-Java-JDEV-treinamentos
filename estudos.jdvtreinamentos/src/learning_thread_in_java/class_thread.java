package learning_thread_in_java;

public class class_thread {
	
  public static void main(String[] args) throws InterruptedException {
	
	  for (int pos = 0; pos < 10; pos ++ ) {
	  
		  
		  /*quero executar esse envio de algo com tempo de parada ou com tempo determinado*/
		  System.out.println("executando algo como exemplo");
		  Thread.sleep(100);  //DA UM TEMPO A CADA EXECUÇÃO (RECEBE EM MILI-SEGUNDOS)
	  }
	  
	  
	  System.out.println("CHEGOU AO FINAL DO TESTE NO FOR");
}

}
