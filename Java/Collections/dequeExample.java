package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class dequeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*Deque<String> name=new ArrayDeque<>();
			name.add("Kavita");
			name.add("Sunil");
			name.offer("Suresh");
			name.add("Nisha");
			name.addFirst("Monica");
			System.out.println(name);
			
			
			System.out.println(name.poll());
			System.out.println(name.poll());
			System.out.println(name.poll());
			System.out.println(name.poll());
			System.out.println(name.poll());//poll returns null if value is not available 
			
			System.out.println(name.isEmpty());*/
		/* Priorty Queue follows FIFO. Sometimes - priorty, priorty heap , arranging data according to natural ordering
		 * or using Comparator, heap sort*/
		PriorityQueue<String> name=new PriorityQueue<>();
		name.add("Kavita");
		name.add("Sunil");
		name.add("Nisha");
		name.add("Monica");
		name.add("Sunil");
		name.add("Sunil");
		//name.add(null); //throw exception
		System.out.println(name);
		System.out.println(name.peek());//returns Ist value*/
		
	}

}
