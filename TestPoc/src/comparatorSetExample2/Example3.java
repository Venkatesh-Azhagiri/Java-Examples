package comparatorSetExample2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class Example3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpNo(1221);
		Employee emp1 = new Employee();
		emp1.setEmpNo(1205);
		CompartorCheck comp = new CompartorCheck();
		
		Set<Employee> set = new HashSet<Employee>();
		
		set.add(emp);
		set.add(emp1);
		
		// 1st approach
		List<Employee> lst = new ArrayList<Employee>(set);
		
		Collections.sort(lst, comp);
		for(Employee e:lst){
			System.out.println("value in list***"+e.getEmpNo());
		}
		//2nd Comparator Approach 
		/*Set<Employee> treeSet = new TreeSet<Employeear>(comp);
		treeSet.addAll(set);*/
		/*Iterator<Employee> it  = treeset.iterator();
		while(it.hasNext()){
			System.out.println("Values******"+it.next().getEmpNo());
		}*/
		
		

	}

}
