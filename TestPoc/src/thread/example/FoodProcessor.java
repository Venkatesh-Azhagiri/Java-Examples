package thread.example;

import java.util.concurrent.CountDownLatch;

public class FoodProcessor implements Runnable {
	private CountDownLatch latchCount;
	private String foodItem;
	
	
	FoodProcessor(CountDownLatch countDown, String item){
		this.latchCount=countDown;	
		this.foodItem=item;
	}

	@Override
	public void run() {
		try {			
			System.out.println("Before processing::Item::"+this.foodItem+"::Latch Count"+this.latchCount.getCount()+"::Thread::"+Thread.currentThread().getName());
			Thread.sleep(10000);
			this.latchCount.countDown();
			System.out.println("After processing:::Item::"+this.foodItem+":::Latch count::"+this.latchCount.getCount()+"::Thread::"+Thread.currentThread().getName());
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
		
	}

}
