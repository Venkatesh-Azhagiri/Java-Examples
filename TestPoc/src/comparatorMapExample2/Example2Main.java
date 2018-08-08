package comparatorMapExample2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example2Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Sort by value custom object
		Person personModel = new Person();
		personModel.setName("venkat");
		personModel.setAge(24);
		
		
		Person personModel1 = new Person();
		personModel1.setName("genkatesh");
		personModel1.setAge(25);
		
		Map<String, Person> map = new HashMap<String, Person>();
		SortComparator sort1 = new SortComparator(map);
		Map<String, Person> treeMap = new TreeMap<String, Person>(sort1);
		map.put("B", personModel);
		map.put("A", personModel1);
		
		treeMap.putAll(map);
		//System.out.println("treeMap ****"+treeMap);
		for(Map.Entry<String, Person> mp : treeMap.entrySet()){
			System.out.println("Key*******"+mp.getKey()+"*******Value*******"+mp.getValue().getName());
			
		}
		

	}

}
