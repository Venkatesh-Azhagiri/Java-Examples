package comparableSetExample1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DVDInfo1 dvd  = new DVDInfo1();
		dvd.setTitle("mariyan");
		DVDInfo1 dvd1  = new DVDInfo1();
		dvd1.setTitle("arambam");
		
		Set<DVDInfo1> set  = new HashSet<DVDInfo1>();
		set.add(dvd);
		set.add(dvd1);
		List<DVDInfo1> lst = new ArrayList<DVDInfo1>(set);
		
		
		Collections.sort(lst);
		for(DVDInfo1 d : lst){
			System.out.println("sorted set****"+d.getTitle());
		}
		
		
		
	}

}
