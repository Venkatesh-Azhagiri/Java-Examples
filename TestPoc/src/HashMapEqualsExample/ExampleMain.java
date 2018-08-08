package HashMapEqualsExample;

import java.util.HashMap;
import java.util.Map;

public class ExampleMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Car, Person> map = new HashMap<Car, Person>();
		Car c1 = new Car("blue", 124);
		Car c2 = new Car("red", 125);
		Person p1 = new Person("venkatesh", 26);		
		Person p2 = new Person("venky", 25);
		Car c3 = new Car();
		c3.setVehicleNumber(124);
		map.put(c1, p1);
		map.put(c2, p2);
		//System.out.println("c1 system hashcode****"+System.identityHashCode(c1));
		//System.out.println("c3 system hashcode****"+System.identityHashCode(c3));
		for(Map.Entry<Car, Person> entry: map.entrySet()){
			Car carModel = (Car)entry.getKey();			
			if(carModel.equals(c3)){
				System.out.println("hashcode c1*****"+c1.hashCode());
				System.out.println("hashcode c3*****"+c3.hashCode());
				Person p = (Person)entry.getValue();
				System.out.println(" "+ p);
			}
		
		}
		

	}
	
	

}
