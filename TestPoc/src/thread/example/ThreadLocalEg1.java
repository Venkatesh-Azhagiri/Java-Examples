package thread.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalEg1 {
	public static void main(String are[]) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		HelloThread helloThread = new HelloThread();
		executorService.submit(helloThread);
		executorService.submit(helloThread);
		
	}

}
