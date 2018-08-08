package priorityQueueExample;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEg1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = {2, 5, 8, 6};
		
		ComparatorSorting  comp = new ComparatorSorting();
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(10, comp); // 10 is the initial capacity
		for(int i:a){			
			pq.offer(i);  // will add elements to the queue			
		}
		System.out.println("Peek ****"+pq.peek());
		System.out.println("before poll Queue Size****"+pq.size());
		
		//System.out.println("Queue Elements before sorting****"+pq);
	
		for(int x: a){
			System.out.print(pq.poll()+ " ");
		}
		System.out.println("after poll Queue Size****"+pq.size());

	}
	
	 static class ComparatorSorting implements Comparator<Integer>{

		@Override
		public int compare(Integer o1, Integer o2) {	
		//	System.out.println("value1*****"+o1+"****value2****"+o2);
			//return o2-o1;
			return o1.compareTo(o2);	
		}
		
	}

}
