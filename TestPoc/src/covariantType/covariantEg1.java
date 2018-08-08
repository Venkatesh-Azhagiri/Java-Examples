package covariantType;



class A{
	public int get(){
		return 1;
	}
}
class B extends A{
	public synchronized int get(){
		try {
			wait();
		} catch (InterruptedException e) {
			System.out.println("catch");
			e.printStackTrace();
		}
		return 1;
	}
}
public class covariantEg1 {
	
	/**
	 * @param are
	 */
	public static void main(String are[]){ 
		B  b = new B();
		System.out.println("Before wait");
		b.get();		
		System.out.println("after wait");
	}

} 
