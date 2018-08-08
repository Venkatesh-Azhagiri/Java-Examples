package genericWildCardeEg1;

import java.util.ArrayList;
import java.util.List;

public class genericWildCardEg1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		Bar bar = new Bar();
		bar.insert(list);

	}	
}
class Bar {
	public void insert(List<?> list){
		//list.add("hai"); will not compile  List<?> means a list typed to an unknown type.Since the you do not know what type the List is typed to, you can only read from the collection, and you can only treat the objects read as being Object instances 
		for(Object o: list){
			System.out.println("Print***"+o);
		}
		
	}
	
}

