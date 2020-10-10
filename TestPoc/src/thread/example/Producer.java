package thread.example;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	private BlockingQueue<Integer> queue;
	
	Producer(BlockingQueue<Integer> queue){
		this.queue = queue;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + " produced " + i); 
				queue.put(i);
				Thread.sleep(200); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}

}
