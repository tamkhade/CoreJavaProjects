package mainmethodprogram;

public class MainmethodOverriding {
	
	public static void main(String... args)//you can call method hiding
	{
		System.out.println("parent class excute");
		
	}

}

class Checkmain extends MainmethodOverriding //you can call method hiding
{
	
	public static void main(String... args)
	{
		System.out.println("Child class excute");
		
	}
	
}

//output-
//excute child class main method
//output is "child class exucuted"