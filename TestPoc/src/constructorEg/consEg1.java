package constructorEg;


class consEg2{
	consEg2(){
		System.out.println("Test super");
		
	}
	void method(){
		System.out.println("method******");
	}
	
}
public class consEg1 extends consEg2 {

	void method1(){
		System.out.println("method1*****");
		super.method();
	}
	/**
	 * @param args
	 */
	consEg1(){
		
		System.out.println("Test child");
		//super(); will give compile time error
		super.method();
	
		
	}
	public static void main(String[] args) {
		consEg1 c = new consEg1();
		

	}

}
