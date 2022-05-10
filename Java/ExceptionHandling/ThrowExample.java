package exception_Handling.Arrays;

public class ThrowExample {
	static void calculate(int num, int num1){
		if(num1==0)
			throw new ArithmeticException();
		else
			System.out.println(num/num1);
	}
	public static void main(String[] args) {
		try{
			calculate(5,0);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}

	}

}
