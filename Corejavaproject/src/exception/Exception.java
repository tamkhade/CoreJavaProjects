package exception;

public class Exception {
	
	
	int m1()
	{
		
			System.out.println("hiii mahesh");
			int x=10/0;
			throw new ArithmeticException("arithmtic ecxception");
			//System.out.println("hii tamkhade");
	}
	
	public static void main(String[] args)
	{
		/*try{
		
		System.out.println("1 statement");
		System.out.println("2 statement");
		int x1=10/0;
		System.out.println("3 statement");
		
		}catch(ArithmeticException e)
		{
			
			int x1=10/0;
			System.out.println(x1);
		  }
		int x1=10/0;
		System.out.println(x1);
		System.out.println("statement 5");*/
		Exception e=new Exception();
		int z=e.m1();
		System.out.println(z);
	}

}
