package multithreading;



/**
 * @author Tamkhade
 *set sleep method and add millisecond values
 */
class A implements Runnable
{

	
	public void run()
	{
		
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread A "+i);
		}
		
	}
}

class B implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Thread B "+i);
		}
	
	}
	
}


/**
 * @author Tamkhade
 *create Runnable interface refrence and pass into Threadclass 
 *
 */

public class SleepMethod extends Thread {
	
	public static void main(String[] args) throws InterruptedException
	{
		Runnable e=new A();
		Runnable z=new B();
		Thread t1=new Thread(e);
		Thread t2=new Thread(z);
		t1.start();
		t2.start();
		
	}
	
}
