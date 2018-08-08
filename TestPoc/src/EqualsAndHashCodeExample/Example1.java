package EqualsAndHashCodeExample;

public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger t1 = new Tiger("Blue1", "Vertical", 10);
		Tiger t2 = new Tiger("Blue", "Vertical", 20);
		System.out.println("Return value****"+t2.equals(t2));		

	}

}
