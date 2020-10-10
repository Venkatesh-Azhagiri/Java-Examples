package thread.example;

public class ThreadLocalCounter {
	private static final ThreadLocal<ThreadLocalCounter> threadLocal = ThreadLocal
			.withInitial(() -> new ThreadLocalCounter(0));
	private static int count;

	public ThreadLocalCounter(int count) {
		this.count = count;
	}

	public int increment() {
		return ++count;
	}

	
	
	  public static ThreadLocalCounter get() { return threadLocal.get(); }
	 
	
	
	/* public static int get() { return count; } */
	 
}