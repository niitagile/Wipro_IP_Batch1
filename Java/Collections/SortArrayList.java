package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Viren");
		alist.add("Mukesh");
		alist.add("Manish");
		alist.add("Bobby");
		//Collections.sort(alist);
		Collections.sort(alist,Collections.reverseOrder());
		for(String s : alist)
			System.out.println(s);
			
		
	}

}
