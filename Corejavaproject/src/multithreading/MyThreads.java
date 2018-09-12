package multithreading;

public class MyThreads  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test() 
	        {
	
	            public void run() 
	            {
	                System.out.println(" foo");
	            }
	        };
	        t.start();
         }
    }

class Test extends Thread
{
	public Test() {
		// TODO Auto-generated constructor stub
		 System.out.print("Hello");
	          }
	
	    public void run() 
	    {
	        System.out.print(" bar");
	    }
	    public void run(String s) 
	    {
	        System.out.println(" baz");
	    }
	
}