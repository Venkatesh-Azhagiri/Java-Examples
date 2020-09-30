package thread.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableEg1 {
	public static void main(String ar[]) {
		int availableProcessor = Runtime.getRuntime().availableProcessors();
		System.out.println("AvailableProcessor::"+availableProcessor);
		Runnable r =()->System.out.println("Thread current thread::"+Thread.currentThread().getName());
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		//ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		for(int i=0; i<10; ++i) {
			//Difference between executing as thread and executor service
			//new Thread(r).start();
			executorService.execute(r);
		}
		executorService.shutdown();
		
	}
 
}

