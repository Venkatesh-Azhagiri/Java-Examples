package ThreadVolatileExample1;

import java.util.Scanner;

class Thread1 extends Thread{
	
	private volatile int count;
	private boolean running = true;
	
	public void run(){
		 while(running){
			 try {
				Thread.sleep(1000);
				System.out.println("Count****"+count);
				++count;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
	}
	
	public void process(){
		running = false;
	}
	
	
}



public class ThreadVolatileEg1 {

	public static void main(String[] args) {
		Thread1 t  = new Thread1();
		t.start();
		System.out.println("Please enter");
		Scanner s = new Scanner(System.in);
		s.nextLine();
		t.process();
		

	}

}
