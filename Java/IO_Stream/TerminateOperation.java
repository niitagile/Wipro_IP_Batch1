package StreamsExample;

import java.util.ArrayList;
import java.util.List;

public class TerminateOperation {
	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		/*boolean matchedResult = memberNames.stream()
		        .anyMatch((s) -> s.startsWith("A"));
		 
		System.out.println(matchedResult);*/
		 
		boolean matchedResult = memberNames.stream()
		        .allMatch((s) -> s.startsWith("A"));
		 
		System.out.println(matchedResult);
		 
		/*boolean matchedResult = memberNames.stream()
		        .noneMatch((s) -> s.startsWith("A"));
		 
		System.out.println(matchedResult);*/
		
		/*long totalMatched = memberNames.stream()
			    .filter((s) -> s.startsWith("A"))
			    .count();
			 
			System.out.println(totalMatched);*/
		
	}

}
