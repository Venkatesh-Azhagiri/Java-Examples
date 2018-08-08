import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;



public class testMap {
	public static void main(String are[]){
		Map<String, String> mp = new TreeMap<String, String>();
		mp.put("1", "l2");
		mp.put("1","l3");
		Iterator entries = mp.entrySet().iterator();
		while (entries.hasNext()) {
		    Map.Entry<String, String> entry = (Map.Entry<String, String>) entries.next();
		    String key = entry.getKey();
		    String value = entry.getValue();
		    System.out.println("Key = " + key + ", Value = " + value);
		}
		/*testMap1 t1 = new testMap1();
		int i = 0;
		t1.b(i);
		System.out.println("i****"+i);
		t1.a(mp);
		System.out.println(mp.get("1"));*/
	}
	 
}
