package HashMapExample1;

import java.util.HashMap;
import java.util.Map;

public class Example1Main {

	/**
	 * @param args
	 */	
	public static void main(String[] args) {
		Map<Person, String> map = new HashMap<Person, String>();
		Person p1 = new Person();
		p1.setName("venkatesh");
		p1.setAge("25");
		Person p2 = new Person();
		p2.setName("venkatesh1");
		p2.setAge("25");
		
		
		map.put(p1, "value1");
		map.put(p2, "value2");
	
		System.out.println("get value****"+"***vv***"+map.get(p1)+"********KEY 2****"+map.get(p2)+"**********"+map.get(p1).equals(map.get(p2))+"***p1****"+p1.hashCode() +"***p2*****"+p2.hashCode());
		
	}

}
