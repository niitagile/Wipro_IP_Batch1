package exception_Handling.Arrays;

import java.util.Scanner;

public class Demo5 {
	
	static void calculate(){
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
		catch(ArithmeticException e){
			
			e.printStackTrace();
			//System.exit(0);
		}
		finally{
			System.out.println("Try finished");
		}
	}

	public static void main(String[] args) {
		calculate();
		
		/*try{
			calculate();
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}*/

	}

}
