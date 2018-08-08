package HashCodeExample2;

public class ExampleMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test(2);
		Test t2 = new Test(3);
		
		System.out.println("Equals method ****"+t1.equals(t2));
		System.out.println("Hash Code value of t1*****"+t1.hashCode());
		System.out.println("Hash Code value of t2******"+t2.hashCode());

	}

}
