package comparatorMapExample2;

import java.util.Comparator;
import java.util.Map;

public class SortComparator implements Comparator<String> {
	Map<String, Person> map;
	
	public SortComparator(Map<String, Person> mp){
		this.map = mp;
	}
	
	
	@Override
	public int compare(String o1, String o2) {	
		return map.get(o1).getName().compareTo(map.get(o2).getName());
	}
	

}
