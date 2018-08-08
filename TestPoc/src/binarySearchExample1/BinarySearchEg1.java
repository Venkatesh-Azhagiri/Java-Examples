package binarySearchExample1;

import java.util.Arrays;



public class BinarySearchEg1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// if the key is not found the insertion point is calculated 
		// by (-(inserpoint)-1)
		String[] sa = {"hi", "the", "string", "using", "binarySearch"};
		Arrays.sort(sa);
		for(String s:sa){
			System.out.println("s****value****"+s);
		}
		System.out.println("search value****"+Arrays.binarySearch(sa, "i"));
		char c[] = {'a', 'b', 'c', 'd', 'e'};
		System.out.println("Character binary search***"+Arrays.binarySearch(c, 'p'));
		
	}

}
