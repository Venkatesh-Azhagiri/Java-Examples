package arrayListLinkedListEg1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class arrayListLinkedListEg1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkList = new LinkedList<Integer>();
		System.out.println("ArrayList******");
		doTiming(arrayList);
		System.out.println("LinkList******");
		doTiming(linkList);
		
	}
	public static  void  doTiming(List<Integer> list){
		long start = System.currentTimeMillis();
		/*for(int i = 0; i < 1E5; ++i){
			list.add(i);
		}*/
		list.add(0, 9);
		long stop = System.currentTimeMillis();
		System.out.println("Time taken for access******"+(stop-start));
	}
	
	
	
	

}
