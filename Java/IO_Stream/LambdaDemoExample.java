package LambdaExamples;
interface message{
	void display(String msg);
}

/*class Test implements  message{

	@Override
	public void display(String msg) {
		System.out.println(msg);
		
	}
	
}*/
public class LambdaDemoExample {

	public static void main(String[] args) {
		/*Test t=new Test();
		t.display("Hello All");*/
		
		/*message obj=new Test();
		obj.display("Hello All");*/
		
		message obj= msg->System.out.println(msg);
		
		obj.display("Hello All");
		

	}

}
