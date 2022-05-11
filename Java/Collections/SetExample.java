package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("TreeSet");
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(23);
		ts.add(34);
		//ts.add(null); //can't store null values
		ts.add(15);
		ts.add(23);
		System.out.println(ts);
		NavigableSet<Integer> ts1=ts.descendingSet();
		ts1.add(18);
		System.out.println(ts1);
		
		
		
		//LinkedHashSet
	/*	System.out.println("LinkedHashSet");
		LinkedHashSet<Integer> ts=new LinkedHashSet<>();
		ts.add(23);
		ts.add(34);
		ts.add(null);
		ts.add(15);
		ts.add(23);
		System.out.println(ts);*/
		
		//HashSet
		/*System.out.println("HashSet");
		HashSet<Integer> ts=new HashSet<>();
		ts.add(23);
		ts.add(34);
		ts.add(null);
		ts.add(15);
		ts.add(23);
		ts.add(12);
		ts.add(80);
		ts.add(19);
		System.out.println(ts);*/
		

	}

}
