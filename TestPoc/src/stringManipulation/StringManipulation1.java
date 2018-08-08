package stringManipulation;

import java.util.ArrayList;
import java.util.List;

public class StringManipulation1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*String s = "A1";
		String s1 = "A1,B1";
		if(s.contains(s1)){
			System.out.println("test");
		}*/
		List<String> lst = new ArrayList<String>();
		lst.add("A1");
		lst.add("B1");
		if(lst.contains("A1")){
			System.out.println("trye");
		}
		
	}

}
