package multithreading;

public class Overridestartmethod  extends Thread{
/*do not override start method*/
	
	 /**
     * This method is not invoked for the main method thread or "system"
     * group threads created/set up by the VM. Any new functionality added
     * to this method in the future may have to also be added to the VM.
     *
     * A zero status value corresponds to state "NEW".
     */
	public void start()
	{
		
		System.out.println("excute normal method so do not override start method");
	}
	
	public static void main(String[] rgs)
	{
		Overridestartmethod o=new  Overridestartmethod();
		o.start();
	}
}
