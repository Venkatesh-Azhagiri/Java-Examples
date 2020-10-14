package lambda.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortingMain {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		createEmployees(employees);
		//Ascending Order
	    // employees.sort((Employee e1, Employee e2)->e1.getSalary().compareTo(e2.getSalary()));
	     //employees.forEach(e->System.out.println("Ascending::"+e.toString()));
		//Descending Order
		//employees.sort((Employee e1, Employee e2)->e2.getSalary().compareTo(e1.getSalary()));
		//employees.forEach(e->System.out.println("Descending::"+e.toString()));
		Collections.sort(employees, Comparator.comparing(Employee::getSalary));
		employees.forEach(e->System.out.println("Ascending lambda::"+e.toString()));
		

	}

	private static void createEmployees(List<Employee> employees) {
		Employee e = new Employee();
		e.setEmployeeId(1000L);
		e.setName("Ashok");
		e.setAge(30L);
		e.setSalary(1500000L);
		employees.add(e);
		e = new Employee();
		e.setEmployeeId(1001L);
		e.setName("Jay");
		e.setAge(31L);
		e.setSalary(1600000L);
		employees.add(e);
		
		
		
		
	}

}
