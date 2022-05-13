package Day5;
/*Volatile keyword is used to modify the value of a variable by different threads.
 *  It is also used to make classes thread safe. 
 *  It means that multiple threads can use a method and instance of the classes at the same time without any problem. 
 *  The volatile keyword can be used either with primitive type or objects.

The volatile keyword does not cache the value of the variable and always read the variable from the main memory.*/


class VolatileData   
{  
	private volatile int counter = 0;   
	public int getCounter()   
	{  
		return counter;  
	}  
	public void increaseCounter()   
	{  
		++counter;      //increases the value of counter by 1   
	}  
}  

class VolatileThread extends Thread   
{  
	private final VolatileData data;  
	public VolatileThread(VolatileData data)   
	{  
		this.data = data;         
	}  
	@Override  
	public void run()  
	{  
		int oldValue = data.getCounter();  
		System.out.println("[Thread " + Thread.currentThread().getId() + "]: Old value = " + oldValue);  
		data.increaseCounter();  
		int newValue = data.getCounter();  
		System.out.println("[Thread " + Thread.currentThread().getId() + "]: New value = " + newValue);  
	}  
}  
public class VolatileMain   
{  
      

public static void main(String[] args) throws InterruptedException  
{  
	VolatileData volatileData = new VolatileData();     //object of VolatileData class  

	VolatileThread t1 = new VolatileThread(volatileData);  
      t1.start();
      VolatileThread t2 = new VolatileThread(volatileData);  
      t2.start();
      t1.join();
      t2.join();
}  
}  