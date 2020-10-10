package thread.example;

public class HelloThread implements Runnable{
	private static Integer value =1;
	//ThreadLocal<Integer> value = ThreadLocal.withInitial(() -> getInitialValue());

	public HelloThread(){
		this.value=getInitialValue();
		//this.value.set(this.value.get()+1);
	}

	private Integer getInitialValue() {
		System.out.println("Thread initial Value::"+Thread.currentThread().getName());
		return ++value;
	}

	@Override
	public void run() {
		System.out.println("Value::"+this.value+"::Thread Name::"+Thread.currentThread().getName());		
	}
	
	

}
