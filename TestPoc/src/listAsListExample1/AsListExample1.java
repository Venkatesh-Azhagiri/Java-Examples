package listAsListExample1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AsListExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] s = {"a", "b", "c", "d"};
		System.out.println("First string array");
		for(String value:s){
			System.out.print(value+" ");
		}
		System.out.println();
		List<String> lst = Arrays.asList(s);
		lst.set(2, "h");
		s[1] = "venkatesh";
		System.out.println("List Iteration");
		for(String a:lst){
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("String array");
		for(String h:s){
			System.out.print(h+" ");
		}
		
		

	}

}
