package java8Predicate;

import java.util.function.Predicate;

public class EmployeePredicate implements Predicate<Employee> {

	@Override
	public boolean test(Employee t) {
		// TODO Auto-generated method stub
		return (t!=null && t.getSalary()>200000);
	}

}
