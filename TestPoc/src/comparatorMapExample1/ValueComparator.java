package comparatorMapExample1;

import java.util.Comparator;
import java.util.Map;

public class ValueComparator implements Comparator<String> {
	Map<String, Double> base;
	
	public ValueComparator(Map<String, Double> base){
		this.base = base;
	}

	@Override
	public int compare(String a, String b) {
		System.out.println("a key value****"+"key***"+a+"*********"+base.get(a));
		//System.out.println("b key value****key****"+b+"***********"+base.get(b));
		//Comparable valueA = base.get(a);
		//Comparable valueB = base.get(b);
		//return valueA.compareTo(valueB);
		return base.get(a).compareTo(base.get(b));
		
	}
	
	public String toString(){
		return base.toString();
	}

}

