package oopsconcept;


public class Childclass extends Parentclass {

	void m2()
	{
		System.out.println("childss");
	}
	
	void m1()
	{
		System.out.println("child");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parentclass t=new Childclass();
		   t.m1();
	}
	
}

