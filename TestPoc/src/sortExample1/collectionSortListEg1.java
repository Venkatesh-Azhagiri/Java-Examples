package sortExample1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class collectionSortListEg1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> ls = new ArrayList<String>();
		ls.add("LIB11950");
		ls.add("LIB11951");
		ls.add("LIB11959");
		ls.add("LIB11961");
		ls.add("LIB11949");
		ls.add("LIB11948");
		ls.add("LIB11960");
		ls.add("LIB11958");
		ls.add("LIB11951");
		ls.add("LIB11958");	
		
		Collections.sort(ls);
		System.out.println("ls*****"+ls);
		String[] s = {"LIB11949", "LIB11948"};
		Arrays.sort(s);
		for(String s1:s){
			System.out.println("s****"+s1);
		}
	}

}

