package comparableMapExample1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import comparableMapExample1.Car;

public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Sort By key
		Car carModel = new Car();
		carModel.setVehicleNumber(1325);
		Car carModel1 = new Car();
		carModel1.setVehicleNumber(124);
		Map<Car, String> map = new HashMap<Car, String>();
		map.put(carModel, "a");
		map.put(carModel1, "b");		
		Map<Car, String> treeMap = new TreeMap<Car, String>(map);
		treeMap.putAll(map);
		
	for(Map.Entry<Car, String> m: treeMap.entrySet()){
			System.out.println("get key***"+m.getKey().getVehicleNumber()+"*****"+m.getValue());
		}
				

	}

}
