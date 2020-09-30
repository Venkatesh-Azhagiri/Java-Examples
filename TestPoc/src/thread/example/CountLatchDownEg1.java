package thread.example;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountLatchDownEg1 {
	//Run as java application in run configuration arguments send the food items in space
	//Chettinad Karaikudi
	public static void main(String ar[]) throws InterruptedException {
		ExecutorService executorSerivce = Executors.newFixedThreadPool(2) ;
		CountDownLatch countDownLatch = new CountDownLatch(2);	
		
		for(int i =0; i<ar.length; ++i) {
			System.out.println("Arguments food::"+ar[i]);
			FoodProcessor foodProcessor = new FoodProcessor(countDownLatch, ar[i]);
			executorSerivce.submit(foodProcessor);	
		}
		countDownLatch.await();		
		System.out.println("Order processed successfully");	
		
	}

}


