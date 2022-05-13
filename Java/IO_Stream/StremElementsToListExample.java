package StreamsExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;




//creating a stream on integers 1 to 10. Then we are processing the stream elements to find all even numbers.

public class StremElementsToListExample 
{
     public static void main(String[] args)
     {
         List<Integer> list = new ArrayList<Integer>();
 
         for(int i = 1; i< 10; i++){
             list.add(i);
         }
 
         Stream<Integer> stream = list.stream();
         List<Integer> evenNumbersList = stream.filter(i -> i%2 == 0)
                                                .collect(Collectors.toList());
         System.out.print(evenNumbersList);
     }
}