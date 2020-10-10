package thread.example;

public class ThreadLocalEg2 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
		    @Override
		    public void run() {
		    	//Yet to clarify with static variables and ThreadLocal
		        ThreadLocalCounter threadLocalCounter =ThreadLocalCounter.get(); 
		        		//new ThreadLocalCounter(0) ;
		        		//ThreadLocalCounter.get();
		        int i =0;
		        while(i <=5) {
		            final int counter = threadLocalCounter.increment();
		            doSomeWork(counter);
		            ++i;
		        }
		    }

		    private void doSomeWork(int counter) {
		       System.out.println("Counter value::"+counter);
		    }
		});
		thread.start();

	}

}
