package thread.example;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	private BlockingQueue<Integer> queue;
	
	Consumer(BlockingQueue<Integer> queue){
		this.queue = queue;
	}

	@Override
	public void run() {
		while(true) {
			Integer item=null;
			try {
				item = queue.take();				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" Consumer Item ::"+item);
		}
		
	}
}
