package java8Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		constructEmployeeData(employees);
		if(employees!=null){
			//Lamba Expression
			List<Employee> list=employees.stream()
					.filter(e->e.getSalary().equals(2000L))
					.collect(Collectors.toList());
			list.forEach(l->{
			System.out.println("Employee**"+l.toString());
			});
			
		}
	}	

	private static void constructEmployeeData(List<Employee> employees) {
		Employee e1 = new Employee();
		e1.setEmployeeId(1L);
		e1.setName("E1");
		e1.setSalary(1000L);
		Employee e2 = new Employee();
		e2.setEmployeeId(1L);
		e2.setName("E2");
		e2.setSalary(2000L);
		employees.add(e1);
		employees.add(e2);
	}

}
