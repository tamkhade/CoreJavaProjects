package multithreading;

public class ThreadType extends Thread{

	
	public void run()
	{
		
		for(int i=0;i<10;i++)
		{
		//System.out.println("hii mahesh");
			System.out.println(Thread.currentThread().getName());
		
	}
	}	
	public static void main(String[] args)
	{
		//Thread t=new Thread();
		ThreadType th=new ThreadType();
	
		Thread.currentThread().setName("1st name");
		System.out.println(Thread.currentThread().getName());
	
		th.start();
		/*for(int i=0;i<10;i++)
		{
			System.out.println("hii tamkhade");
		}
		*/
		
	}
	

}
