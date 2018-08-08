package programToInterfaceExample1;

import java.util.LinkedHashSet;
import java.util.Set;

public class Example2 {

	/**
	 * @param args
	 */
	static Set<Integer> set = new LinkedHashSet<Integer>();
	public static void main(String[] args) {
		for(Integer i : getValues()){
			System.out.println("values***"+i);
		}
		

	}
	
	
	private static Set<Integer> getValues(){	
		set.add(1);
		set.add(2);
		set.add(3);
		return set;
	}
	
	/*static HashSet<Integer> hashSet = new HashSet<Integer>();
	public static void main(String[] are){
		for(Integer i : getValues()){
			System.out.println("values***"+i);
		}
	}
	
	private static HashSet<Integer> getValues(){	
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		return hashSet;
	}*/

}

