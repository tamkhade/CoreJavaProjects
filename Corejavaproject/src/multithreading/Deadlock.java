package multithreading;


class Parent
{

	public synchronized void foo(Child a)
	{
		
		System.out.println("Thread start excution foo method");
		System.out.println(Thread.currentThread().getName());
		try
		{
			Thread.sleep(100000000);
			
		}catch(InterruptedException e)
		{
		
			System.out.println("foo is excute");
		}
		a.last();
	}
	
	
	public static void last()
	{
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("Inside parent last() method");
	}
}
class Child
{
	public synchronized void bar(Parent s) throws InterruptedException
	{
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("Thread start excution of bar");
		Thread.sleep(6000);
		
		System.out.println("thread trying to calla.last method");
		Parent.last();	
	}
	
	public synchronized void last()
	{
		System.out.println(Thread.currentThread().getName());
	System.out.println("inside child last method");
	}
	
}

public class Deadlock extends Thread {	
	
	Parent p=new Parent();
	Child c=new Child();
	
	
	public void m1()
	{
		this.start();
		p.foo(c);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	
	 try {
		c.bar(p);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	     }
	
	
	public static void main(String[] args)
	{
		Deadlock d=new Deadlock();
	
		d.m1();

	}
	
}