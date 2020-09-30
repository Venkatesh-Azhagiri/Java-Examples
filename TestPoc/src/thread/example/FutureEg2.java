package thread.example;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureEg2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<String> task =()->{			
			throw new IllegalStateException(" Callable task exception");
		};
		
		ExecutorService service = Executors.newFixedThreadPool(5);
		try {
			for(int i=0; i<10; ++i) {
				Future<String> future = service.submit(task);
				System.out.println("Submitted task::"+future.get());
			}
		}catch(Exception e){
			System.out.println("Exception message::"+e.getMessage());
		}finally {
			service.shutdown();
		}

	}

}
