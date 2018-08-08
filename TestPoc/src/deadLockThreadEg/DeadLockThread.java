package deadLockThreadEg;

public class DeadLockThread {

	public static Object lock1 = new Object();
	public static Object lock2 = new Object();
	
	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		t1.start();
		t2.start();

	}
	
	public static class Thread1 extends Thread
	{
		public void run(){
			synchronized(lock1){
				System.out.println("Thread 1 Lock 1");
				try{
					Thread.sleep(10);
				}catch(InterruptedException e){
					System.out.println("Catch block thread 1");
				}
				System.out.println("Thread 1 Lock 1 running");
				synchronized(lock2){
					System.out.println(" Hold Thread 1 lock 2");
				}
			}
		}
		
	}
	public static class Thread2 extends Thread
	{
		public void run(){
			synchronized(lock2){ //Deadlock condition to solve replace as lock1
				System.out.println("Thread 2 Lock 2");
				try{
					Thread.sleep(10);
				}catch(InterruptedException e){
					System.out.println("Catch block thread 2");
				}
				System.out.println("Thread 2 Lock 2 running");
				synchronized(lock1){
					System.out.println(" Hold Thread 2 lock 1");
				}
			}
		}
	}
}
