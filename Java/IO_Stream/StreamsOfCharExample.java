package StreamsExample;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsOfCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*IntStream stream = "12345_abcdefg".chars();
        stream.forEach(p -> System.out.println(p+" "+(char)p));*/
         
         
      Stream<String> stream1 = Stream.of("Hello Everyone".split(" "));
        stream1.forEach(p -> System.out.println(p));
        
        
     /*  String str="Hello World";
        String arr[]=str.split(" ");
        for(String a : arr){
        	System.out.println(a);
        }*/
        

	}

}


