package java8Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
	static List<Employee> employees = new ArrayList<Employee>(); 
	public static void main(String[] args) {
		populate();
		System.out.println("employees size::"+employees.size());
		List<Employee> filteredEmployees = employees.stream().filter(new EmployeePredicate()).collect(Collectors.toList());
		if(filteredEmployees!=null) {
			filteredEmployees.forEach(e->{
				System.out.print(e);
			});
		}

	}
	
	public static void populate() {
		Employee e1 = new Employee("T1", "1", 200000);
		Employee e2 = new Employee("T2", "2", 300000);
		Employee e3 = new Employee("T3", "3", 400000);
		Employee e4 = new Employee("T4", "4", 500000);
		Employee e5 = new Employee("T5", "5", 600000);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);

		
	}

}