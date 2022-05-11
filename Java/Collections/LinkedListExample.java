package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list=new LinkedList<>();
		list.add(78);
		list.add(89);
		list.add(45);
		list.add(78);
		System.out.println(list);
		/*Iterator <Integer> itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}*/
		
		for(Integer obj : list){
			System.out.println(obj);
		}
		
		
	}

}
