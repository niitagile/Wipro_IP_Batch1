package exception_Handling.Arrays;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter a number");
			int num=sc.nextInt();
			System.out.println("Enter a number");
			int num2=sc.nextInt();
			System.out.println(num/num2);
			//throw new ArithmeticException();
			int arr[]={45,56,78};
			System.out.println(arr[3]);

		}
		
		catch(ArithmeticException|ArrayIndexOutOfBoundsException e){
			//System.out.println(e);
			e.printStackTrace();
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
	}		

}
