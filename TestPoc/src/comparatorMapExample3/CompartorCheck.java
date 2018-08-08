package comparatorMapExample3;

import java.util.Comparator;
import java.util.Set;

public class CompartorCheck implements Comparator<Car> {
	

	@Override
	public int compare(Car o1,Car o2) {
		
		return  o1.getVehicleNumber().compareTo(o2.getVehicleNumber());
	}

}
