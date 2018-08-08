package programToInterfaceExample1;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		//ArrayList<String> list = new ArrayList<String>();
		
		list = doSomething();
		for(String s:list){
			System.out.println("value***"+s);			
		}
	}
	private static List<String> doSomething(){
		//private static ArrayList<String> doSomething(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		return list;

	}

}




