package listAsListExample1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ToArrayExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> lst = new ArrayList<Integer>();
		for(int i = 0; i < 3; i++){
			lst.add(i);
		}
		Integer[] it = new Integer[3];
		it = lst.toArray(it);
		
		
		
		
	}

}
