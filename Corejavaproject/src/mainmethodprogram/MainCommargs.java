package mainmethodprogram;

public class MainCommargs {
	
	public static void main(String[] args)
	{
		
		String[] s={"x","y","z"};
		//you can pass s arrays value to String parameter
		args=s;
		for(String z:args)
		{
			System.out.println(z);
		}
		
		
		for(int i=0;i<=args.length;i++)//when we write <= then throw ArrayoutofboundException
		{
			
			System.out.println(args[i]);
		}
		
		
		for(int i=0;i<args.length;i++)//when we write < then there is no any exception
		{
			
			System.out.println(args[i]);
		}
		
	}

}
