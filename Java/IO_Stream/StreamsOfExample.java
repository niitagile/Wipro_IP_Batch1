package StreamsExample;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;
public class StreamsOfExample {
//Stream.of()-- to build stream of data
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);
        stream.forEach(p -> System.out.println(p));*/
       
       
        
       /* Stream<Integer> stream = Stream.of( new Integer[]{1,2,3,4,5,6,7,8,9} );
        stream.forEach(p -> System.out.println(p)); */
        
        
     
		
		List<String> list = new ArrayList<String>();
        
        list.add("Ram");
        list.add("Sunil");
        list.add("Nisha");

        Stream<String> stream = list.stream();
        stream.forEach(p -> System.out.println(p));
		
        
	}

}
