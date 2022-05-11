package collections;

import java.util.EmptyStackException;
import java.util.Stack;  
public class StackExample  
{  
public static void main(String[] args)   
{  
//creating an instance of Stack class  
Stack<Integer> stk= new Stack<>();  
// checking stack is empty or not  
  
System.out.println("Is the stack empty? " + stk.empty());  
// pushing elements into stack  
stk.push(78);  
stk.push(113);  
stk.push(90);  
stk.push(120); 
stk.push(null);
//prints elements of the stack  
System.out.println("Elements in Stack: " + stk);  
//stk.clear();
System.out.println("Is the stack empty? " + stk.empty()); 
//It throws EmptyStackException if the stack is empty.

	System.out.println((Integer)stk.pop());// reads top value and remove it from stack && returns value in object format
	System.out.println((Integer)stk.peek());// reads top value

System.out.println("Elements in Stack: " + stk);  
System.out.println(stk.search(113)+ " position");

}  
}  
