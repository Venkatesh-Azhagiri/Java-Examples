package mapExample;

import java.util.HashMap;
import java.util.Map;

public class MapEg1 {

	public static void main(String[] args) {
	Map<String, Integer> map = new HashMap<String, Integer>();
	map.put("s1", 12);
	System.out.println(map.containsKey("s"));
	System.out.println(map.containsKey("s1"));
			
	}

}
