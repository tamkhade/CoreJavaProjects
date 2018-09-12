package mainmethodprogram;

public class Checkreturntype {
	static void add()
	{
		String s=null;
		
		String z=null;
		
		if(null==null)// when you check null==null theire is no any compile time error
		{	
			System.out.println("hii gorakh");
		}
		if(s==z)// if you check null object theire is no any compile time error
		{	
			System.out.println("jiii tamkhade");
		}
	
	}

	static public void  main(String... args)
	{	
		System.out.println("hii mahesh");
		add();
	}
	
	//when we overload main method
	
	void main()//no compile time or runtime error
	{
		
		System.out.println("only overload no args");
	}
	
	/*void main(String... args)//dublicate method found
	{
		
		System.out.println("overloading excute");
	}
	*/
}
//note-
//passing the int type value-error should be
//Main method not found in class mainmethodprogram
//you can write public static or static public
//when return type is int then runtime error
/*static public int  main(int... args)
{	
	System.out.println("hii mahesh");
	return 0;
	
}*/
//Main method must return a value of type void in class main method program



















