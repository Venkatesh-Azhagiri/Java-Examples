package programs;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s = "venkatesh";
		String s1 = "";
		System.out.println(""+s.length());
		for(int i = s.length()-1; i >=0 ; --i){
			s1 +=s.charAt(i);
		}
		System.out.println("s1*****"+s1);

	}

}
