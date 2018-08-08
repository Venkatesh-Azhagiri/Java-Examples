package collectionArrayListExample;

import java.util.ArrayList;

public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList arrayList  = new ArrayList();
		ArrayList list1 = arrayList;
		ArrayList list2 = arrayList;
		list1.add(0, "Hello");
		System.out.println("value of list1  "+list1.get(0));
		

	}

}
