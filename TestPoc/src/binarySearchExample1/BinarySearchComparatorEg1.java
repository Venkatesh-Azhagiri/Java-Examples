package binarySearchExample1;

import java.util.Arrays;

public class BinarySearchComparatorEg1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Using Comparator binary search
		Person personModel = new Person();
		personModel.setName("venkat");
		personModel.setAge(25);
		
		Person personModel1 = new Person();
		personModel1.setName("alex");
		personModel1.setAge(26);
		
		Person[] personModelAr =  {personModel, personModel1};
		SortArrays  comp = new SortArrays();
		System.out.println("Before using comparator ");
		for(Person p :personModelAr){
			System.out.println("Comparator before sorting Name****"+p.getName());
		}
		
		Arrays.sort(personModelAr, comp);		
		
		for(Person p :personModelAr){
			System.out.println("Comparator After sorting Name****"+p.getName());
		}	
		
		System.out.println("Binary Search*****"+Arrays.binarySearch(personModelAr, new Person("venkat"), comp));
		

	}

}
