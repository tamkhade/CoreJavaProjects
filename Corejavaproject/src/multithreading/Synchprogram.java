package multithreading;

public class Synchprogram{
	
	public static void main(String[] args)
	{
        Thread t = new Thread() 
        {
        	Mythread f = new Mythread();
            public void run() 
            {
                f.increase(20);
            }
        };
       t.start();		
	    }
    }
class Mythread extends Thread
{
     	private int data = 23;
	    public void increase(int amt) 
	    {
	        int x = data;
	        data = x + amt;
	        System.out.println(data);        
	    }	
}