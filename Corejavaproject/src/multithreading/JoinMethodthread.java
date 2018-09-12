package multithreading;

public class JoinMethodthread{

	public static void main(String[] args) throws InterruptedException
	{	
		Runnable r=new Firstthread();
		Runnable z=new SecondThread();
		Runnable c=new ThirdThread();
		Thread t1=new Thread(r);
		Thread t2=new Thread(z);
		Thread t3=new Thread(c);
		t1.start();
	    t1.join();
		t2.start();	
		t3.start();	
		
	}

}

 class Firstthread implements Runnable
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
		System.out.println("First Thread");
		
	    }
		
	}	
}
 class SecondThread implements Runnable
 {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
		System.out.println("Second Thread");
	    }
	}	 
 }
 class ThirdThread implements Runnable
 {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
		System.out.println("Third Thread");
	    }
	}
	 
	 
 }

