package ThreadSynchronizedExample1;

import java.util.ArrayList;
import java.util.List;

 class Worker1{
	 public List<Integer> list1 = new ArrayList<Integer>();
	 public List<Integer> list2 = new ArrayList<Integer>();
	 public Object lock1 = new Object();
	 public Object lock2 = new Object();
	 int count;
	 
	 public  void stage1(){
		 synchronized(lock1){
			 for(int i =0; i< 100;++i){
				 list1.add(i);
			 }
		
		 }
	 }
	 public  void stage2(){
		 synchronized(lock2){
			 for(int i =0; i< 100;++i){
				 list2.add(i);
			 }
		}
	 }
	 
	 public void call(){
		 for(int i = 0; i < 10000; ++i){
			 stage1();
			 stage2();
		 }
	 }
	 public void go(){
		 Thread t = new Thread(new Runnable() {
				public void run() {
					call();
				}
			});
			
			Thread t1 = new Thread(new Runnable() {
				public void run() {
					call();
				}			
			});
			t.start();
			t1.start();
			try {
				t.join();
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("list1****"+list1.size());
			System.out.println("list2****"+list2.size());
		 
	 }
	
	
}
public class ThreadSynchronizedEg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker1 w = new Worker1();
		w.go();

		//System.out.println("List1 size***"+w.count);
		//System.out.println("List2 size***"+w.count);

	}

}
