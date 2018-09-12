package exception;

import java.io.IOException;

public class Exceptiondemo
{
 public static void main(String[] args) throws IOException
	{
		int age=11;
		if(age<18)
		{
			
		//	int z=10/0;
			//throw new ArithmeticException();
			
			//using throws keyword extend 
		MaheshException s=new MaheshException("you are not eligible");
		throw s;
			
			//using try catch block
			/*try
			{
			int z=age/0;
			}catch(ArithmeticException e)
			{
				
				System.out.println("perfect");
			}*/
			
		}
		System.out.println("exception");
		
	}

}
