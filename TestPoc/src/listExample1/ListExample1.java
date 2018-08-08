package listExample1;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("a");
		lst.add("b");
		lst.add("c");
		lst.add("d");		
		
		lst.add(1, "z");
		// set will replace the object at the specified index whereas add will move to the right
		System.out.println("Add method");
		for(String s:lst){
			System.out.print(" "+s);
		}
		
		lst.clear();
		
		lst.add("a");
		lst.add("b");
		lst.add("c");
		lst.add("d");
		
		lst.set(1, "z");
		System.out.println();
		System.out.println("Set Method");
		for(String s:lst){			
			System.out.print(" "+s);
		}
		
		
		
		
		

	}

}
