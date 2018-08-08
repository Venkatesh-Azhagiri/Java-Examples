package logicalPrograms;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class LogicalNonrepeated {

	public static void main(String[] args) {
		String s = "ghghgga";
		char[] c = s.toCharArray();
		HashMap<Character, Integer> h = new HashMap<Character, Integer>();
		for(int i=0;i <c.length;++i){
			if(h.containsKey(c[i])){
				h.put(c[i], h.get(c[i])+1);
			}else{
				h.put(c[i], 1);
			}
			
		}
		System.out.println("Map "+h+" "+h.values());
		Character nonRepeatedChar = null; 
		
		for(Entry<Character, Integer> map:h.entrySet()){
			if(map.getValue() == 1){
				nonRepeatedChar = map.getKey();
			}
			
		}
		System.out.println("nonRepeatedChar "+nonRepeatedChar);
		
		

	}

}
