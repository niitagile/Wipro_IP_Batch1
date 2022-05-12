package multithreading_new;
/*class Thread implements Runnable{
	
}*/
class MyThread extends Thread{
	public void run(){
		System.out.println(this.getId()+"My Thread");
		
		//System.out.println("My thread");
	}
}
public class ThreadClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MyThread th=new MyThread();
			th.setPriority(4);
			th.start();
			//Thread t=new Thread(new MyNewThread())	
			System.out.println("Main Method");
	}

}
