package multithreading;

/**
 * @author Tamkhade
 *set priority using setpriority method max value or min value
 */
public class PriorityOfThread extends Thread{
	
	
	
	public void run()
	{		
	System.out.println(Thread.currentThread().getName());	
	}
	public static void main(String[] args)
	{
		PriorityOfThread p1=new PriorityOfThread();
		p1.setName("First");
		p1.setPriority(MIN_PRIORITY);
		p1.start();
		PriorityOfThread p2=new PriorityOfThread();
		p2.setName("second");
		p2.setPriority(MAX_PRIORITY);
		p2.start();
	}

}
