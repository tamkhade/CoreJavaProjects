package multithreading;

public class Runnabletype implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hii mahesh");
		System.out.println(Thread.currentThread().getName());
	
		
	}
	
	public static void main(String[] args)
	{
		Runnable r=new Runnabletype();
		/**
		 we can write as direclty 
		 Runnable rc=new Runnable();
		 */
		Thread t=new Thread(r,"mahesh thread");  
		/**passing string name means thread name or u can set name */
	Thread.currentThread().setName("abhi");
	
		
		t.start();
		
	}

}
