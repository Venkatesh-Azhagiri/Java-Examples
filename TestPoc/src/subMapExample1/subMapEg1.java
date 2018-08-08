package subMapExample1;

import java.util.SortedMap;
import java.util.TreeMap;

public class subMapEg1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("1", "a");
		treeMap.put("3", "c");
		treeMap.put("5", "e");
		SortedMap<String, String> sortMap;
		sortMap = treeMap.subMap("1", "3"); // subMap argument fromkey(inclusive), to(exclusive)
		System.out.println("1st level treeMap****"+treeMap+"  "+sortMap);
		sortMap.put("2", "b");
		//sortMap.put("5", "b"); will throw an exception
		System.out.println("2nd level treeMap****"+treeMap+"  "+sortMap);
		treeMap.put("4", "d");
		sortMap = treeMap.subMap("1", "5");
		System.out.println("3rd level treeMap****"+treeMap+"  "+sortMap);
	}

}
