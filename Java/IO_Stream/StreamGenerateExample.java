package StreamsExample;

import java.util.stream.*;
import java.util.Random;

public class StreamGenerateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Random r=new Random();
		r.nextInt(100);*/
		     
		         Stream<Integer> randomNumbers = Stream
		             .generate(() -> (new Random()).nextInt(100));
		            randomNumbers.limit(5)
		             .forEach(System.out::println);
		            
		            
		          
		     }
		
	}


