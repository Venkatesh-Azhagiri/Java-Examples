package ThreadSynchronizedExample1;

import java.util.ArrayList;
import java.util.List;

 class Worker{
	 public List<Integer> list1 = new ArrayList<Integer>();
	 public List<Integer> list2 = new ArrayList<Integer>();
	 int count;
	 public synchronized  void increment(){// remove synchronized keyword run the program alternatively run different program to see different result
		 ++count;
	 }
	 
	 public  void doWork(){
	
	
		 Thread t = new Thread(new Runnable() {
			public void run() {
				for (int j = 0; j < 19870000; ++j){
					try {
						//Thread.sleep(1000);
						//list1.add(count);
						
						increment();
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//System.out.println("t2*****"+j);
				}
			}
		});

	 Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int j = 0; j < 10454000; ++j){
					try {
						//Thread.sleep(500);
						//list2.add(count);
						increment();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//System.out.println("t1*****"+j);
				}
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
		
	 }
}
public class ThreadSynchronizedEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker w = new Worker();
		w.doWork();
		System.out.println("count ***"+w.count);
		
	}

}
