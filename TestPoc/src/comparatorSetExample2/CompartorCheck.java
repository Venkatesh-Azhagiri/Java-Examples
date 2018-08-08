package comparatorSetExample2;

import java.util.Comparator;

public class CompartorCheck implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		System.out.println("test*****");
		return  o1.getEmpNo().compareTo(o2.getEmpNo());
	}

}
