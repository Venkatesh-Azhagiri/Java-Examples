package treeSetExample1;

import java.util.Set;
import java.util.TreeSet;

public class SetLowerHigher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(123);
		set.add(124);
		set.add(125);
		set.add(126);
		System.out.println("Lower value***"+set.lower(124));
		System.out.println("Higher value***"+set.higher(124));

	}

}
