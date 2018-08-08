package EqualsAndHashCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String>  map = new HashMap<String, String>();
		String s = new String("abc");
		String s1 = new String("abc");
		map.put(s, "hi");
		map.put(s1, "hello");
		for(Map.Entry<String, String> entry: map.entrySet()){
			System.out.println("key***"+entry.getKey()+"*** value****"+entry.getValue());
		}
		List<String> list = new ArrayList<String>();
		list.add(s);
		list.add(s1);
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println("list value***"+it.next());
		}
		
		
		

	}

}
