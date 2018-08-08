package ReverStringExample;



public class RevereStringExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "venkatesh";
		String reverString = "";
		for(int i = s.length(); i > 0; --i){
			//System.out.println(s.charAt(i));
			reverString = reverString+s.charAt(i-1);
		}
		System.out.println("reverString****"+reverString);

	}

}
