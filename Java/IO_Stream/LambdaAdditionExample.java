package LambdaExamples;
interface calculate{
	int addition(int a, int b);
}
public class LambdaAdditionExample {

	public static void main(String[] args) {
		calculate calc= (a,b)->a+b;
		
		
		System.out.println(calc.addition(5, 6));

	}

}


interface convert{
	
	int count(String msg); // return total number alphabets in string
}