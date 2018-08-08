package SetExample1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example1Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<Integer> set5 = new HashSet<Integer>();
		set5.add(1);
		set5.add(2);
		set5.add(3);
		set5.add(5);
		
		Set<String> set1 = new HashSet<String>();
		set1.add("a");
		set1.add("b");
		set1.add("c");
		set1.add("d");
		
		if(set5.contains(5)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		
		Set<String> set2 = new HashSet<String>();
		set2.add("a");
		set2.add("b");
		set2.add("e");
		set2.add("f");
		
		//Get the duplicates between two sets
		Set<String> set3 = new HashSet<String>(set2);
		set3.retainAll(set1);
		
		System.out.println("Set which has duplicates***"+set3);
		/*********************/
		
		
		//Get elements without duplicates
		Set<String> set4 = new HashSet<String>(set2);
		set4.removeAll(set1);
		
		System.out.println("set without duplicates***"+set4);
		
		
		

	}

}
