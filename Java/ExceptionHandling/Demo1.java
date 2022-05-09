package exception_Handling.Arrays;

import java.util.Scanner;
class Person{}
class Student{}
public class Demo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter a number");
			int num=sc.nextInt();
			System.out.println("Enter a number");
			int num2=sc.nextInt();
			System.out.println(num/num2);
			//throw new ArithmeticException();
			
		}
		
		catch(ArithmeticException e){
			//System.out.println(e);
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		try{
			int arr[]={45,56,78};
			System.out.println(arr[3]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		System.out.println("Main method End");
	
	}

}
