package multithreading_new;
class MyNewThread implements Runnable{
	
	@Override
	public void run() {
	System.out.println("I am new Thread");
	
}


	
}
public class RunnableEXample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method start");
		Thread t=new Thread(new MyNewThread())	;
		t.start();
		t.start();//start() will call run()
		System.out.println("Main Method Stop");
		
	}

}
