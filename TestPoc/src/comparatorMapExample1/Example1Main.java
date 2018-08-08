package comparatorMapExample1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Example1Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Sort By Value
		Map<String, Double> map  = new HashMap<String, Double>();
		System.out.println("First");
		ValueComparator valueComp = new ValueComparator(map);
		System.out.println("Second");
		Map<String, Double> treeMap = new TreeMap<String, Double>(valueComp);
		
		
		System.out.println("Test 1");
		   map.put("A",99.5);
	       map.put("B",67.4);
	       map.put("C",67.4);
	       map.put("D",67.3);
	       System.out.println("Test 2");   
	       System.out.println("unsorted map: "+map);
	      System.out.println("valueComp****"+valueComp);
	      treeMap.putAll(map);
	      
	       /*
	       // 2nd approach Sorting by adding to list 
	       List lst = new ArrayList(map.entrySet());
	       Collections.sort(lst, new Comparator() {
	    	   public int compare(Object o1, Object o2) {
					return ((Comparable) ((Map.Entry) (o1)).getValue())
	                                       .compareTo(((Map.Entry) (o2)).getValue());
				}
		});
		System.out.println("results: "+lst);
		*/
	       
	       System.out.println("results: "+treeMap);
		

	}

}
