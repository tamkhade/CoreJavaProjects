package interviewprograms;

public class UsingFinalSatic {

	public int q=9;
    static int a=2;
	
	static int z=3;
	
	//byte d=10;
/*
	public void m1() throws ArithmeticException
	{
		try{
		int i=3/0;
		throw new ArithmeticException();
		}
		catch(ArithmeticException e)
		{
		System.out.println("hiii");	
		}
	}
	byte g=-10;*/

	public static void main(String[] args)
	{
		UsingFinalSatic s=new UsingFinalSatic();
		UsingFinalSatic.z=4;
		UsingFinalSatic.a=8;
		//s.q;
		//s.m1();
		//s.q;
		System.out.println(""+z);
		System.out.println(""+a);
		//System.out.println("");
		
	}
	
	
}
