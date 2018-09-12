package multithreading;

public class IntrruptThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			
			Thread.sleep(500);
			System.out.println("exception catch");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
                  	}
	      }
	
	public static void main(String[] args)
	{
	
		IntrruptThread t1=new IntrruptThread();
		t1.interrupt();
		t1.start();
		IntrruptThread t2=new IntrruptThread();
		t2.start();
	}

}
