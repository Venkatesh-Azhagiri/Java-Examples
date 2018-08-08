package genericExample2;

import java.util.ArrayList;
import java.util.List;

public class GenericExample2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		System.out.println("List****"+list);
		List<Integer> intList = new ArrayList<Integer>();
		List<Number> nmber = new ArrayList<Number>();
		List<Float> foat = new ArrayList<Float>();
		nmber.addAll(foat);
	}
	public static void insert(List list){
	//list.addAll(new String("30"));
		list.add(new String("30"));
	}
}
