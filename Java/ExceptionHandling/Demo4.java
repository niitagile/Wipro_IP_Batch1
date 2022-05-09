package exception_Handling.Arrays;

import java.util.Scanner;

public class Demo4 {
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
			e.printStackTrace();
		}
		finally{
			System.out.println("Try finished");
		}
		System.out.println("Program ends");
	}

}
