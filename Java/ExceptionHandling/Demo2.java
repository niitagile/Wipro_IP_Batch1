package exception_Handling.Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try{
			System.out.println("Enter a number");
			int num1=0,num2=0;
			try{
			num1=sc.nextInt();
			System.out.println("Enter a number");
			num2=sc.nextInt();
			String s=null;
			System.out.println(s.toUpperCase());
			}
			catch(InputMismatchException e){
				e.printStackTrace();
			}
			
			System.out.println(num1/num2);
			//throw new ArithmeticException();
			
		}
		
		catch(ArithmeticException e){
			//System.out.println(e);
			e.printStackTrace();
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}

	}

}
