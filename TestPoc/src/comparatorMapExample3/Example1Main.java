package comparatorMapExample3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class Example1Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	//Sort Map by key	
	Car carModel = new Car();
	carModel.setVehicleNumber(135);
	Car carModel1 = new Car();
	carModel1.setVehicleNumber(128);
	
	
	CompartorCheck comp = new CompartorCheck();
	Map<Car, Double> map = new HashMap<Car, Double>();
	map.put(carModel,80.00 );
	map.put(carModel1,70.00 );
	Map<Car, Double> treemap = new TreeMap<Car, Double>(comp);
	/*List lst = new ArrayList(map.entrySet());
	
	
	Collections.sort(lst, comp);*/
	treemap.putAll(map);
	System.out.println("lst***"+treemap);
	for(Map.Entry<Car, Double> m: treemap.entrySet()){
		System.out.println("key*****"+m.getKey().getVehicleNumber()+"****value****"+m.getValue());
		
	}
		/*for(Car m: lst){
	
			System.out.println("lst value is "+m.getVehicleNumber());
		}*/
	}
}
		