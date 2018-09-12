package multithreading;

/**
 * @author Tamkhade
 *you can set demonthread using set method
 */
public class DemonThread implements Runnable{

	
	@Override
	public void run() {
		
		if(Thread.currentThread().isDaemon())
		{
		System.out.println("Daemon Thread");
		}else
		{
			System.out.println("not Daemon Thread");
		}           
	}
	
	
	public static void main(String[] args)
	{
		
		Runnable r=new DemonThread();
		Thread t1=new Thread(r);
		t1.setDaemon(true);
		t1.start();
	
	}

}
