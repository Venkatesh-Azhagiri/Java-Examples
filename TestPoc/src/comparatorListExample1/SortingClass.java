package comparatorListExample1;

import java.util.Comparator;

public class SortingClass implements Comparator<DVDInfo> {

	@Override
	public int compare(DVDInfo o1, DVDInfo o2) {
		//return o1.getTitle().compareTo(o2.getTitle());
		//return o1.getGenre().compareTo(o2.getGenre());
		return 1;
	}
	
}
