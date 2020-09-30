package thread.example;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureEg1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<String> task =()->{
			Thread.sleep(200);
			return "Current thread::"+Thread.currentThread().getName();
		};
		
		ExecutorService service = Executors.newFixedThreadPool(5);
		try {
			for(int i=0; i<10; ++i) {
				Future<String> future = service.submit(task);
				System.out.println("Submitted task::"+future.get());
			}
		}finally {
			service.shutdown();
		}

	}

}
