package thread.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEg1 {
	static Lock lock = new ReentrantLock();
	public static void accessResource() {
		try {
		lock.lock();
		
		//access the resource, after accessing the resource release the unlock so other thread will use it.
		}finally {
			//always have unlock in finally so if any exception occurs it will unlock 
			 //which will allow other threads to continue 
		lock.unlock();
		}
		
	}
	public static void main(String are[]) {
		Thread t1 = new Thread(()->accessResource());
		t1.start();
		System.out.println("Thread::"+t1.currentThread().getName());
		Thread t2 = new Thread(()->accessResource());
		t2.start();
		System.out.println("Thread::"+Thread.currentThread().getName());
		Thread t3 = new Thread(()->accessResource());
		t3.start();
		System.out.println("Thread::"+Thread.currentThread().getName());
		
		
	}

}
