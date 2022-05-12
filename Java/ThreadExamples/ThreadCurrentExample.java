package multithreading_new;

public class ThreadCurrentExample {

	public static void main(String[] args) {
	
		Thread t=Thread.currentThread();//public static Thread currentThread()
		System.out.println(t);//
		t.setName("My thread");
		t.setPriority(10);
		System.out.println(t);
	}

}
