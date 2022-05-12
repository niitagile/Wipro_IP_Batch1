package multithreading_new;

public class ThreadDemo1 {
	public static void main(String[] args) {
		Thread t= Thread.currentThread();//public static Thread currentThread()
		System.out.println("Thread Info:"+ t);
		t.setName("MyThread");
		t.setPriority(7);
		System.out.println("Thread id:"+t.getId());
		System.out.println("Thread changed Info:"+t);
		System.out.println("State:"+t.getState());
		System.out.println("Thread still in process:"+t.isAlive());
		
		
	}

}
