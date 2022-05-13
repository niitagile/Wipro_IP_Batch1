package StreamsExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
	public static void main(String[] args) {
		ArrayList<Integer> numbersList 
	    = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));
	  
	List<Integer> listWithoutDuplicates = numbersList.stream().distinct().collect(Collectors.toList());
	  
	System.out.println(listWithoutDuplicates);
	}

}
//numberlist.stream()--> distict()-->collect(Collectors.toList())