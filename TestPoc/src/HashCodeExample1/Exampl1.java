package HashCodeExample1;

public class Exampl1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc";
		String s1 = new String("abc");
		System.out.println("== method value****"+(s == s1));
		System.out.println("Equals method value****"+(s.equals(s1)));
		System.out.println("Hash Code of  == "+s.hashCode());
		System.out.println("Hash code of equals***"+s1.hashCode());
		System.out.println("Test equals method*****"+s1.equals(new String("abc")));
	}

}
