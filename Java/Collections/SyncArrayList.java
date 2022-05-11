package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SyncArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<String> alist=new ArrayList<>();
			Collections.synchronizedList(alist);
			
			alist.add("Hello");
			
			
	}

}
