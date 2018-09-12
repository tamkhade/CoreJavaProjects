package operatorandassignement;

public class Unaryperator {

	public static void main(String[] args)
	{
		
	
	//1.increment decerement operartor
		int x=10;
		int y=10;
		System.out.println(++x+"pre incement value");
		System.out.println("post incremented value"+y++);//post increment output will be 10
		System.out.println("post incremented value of y only"+y);//post increment output is 11
		
		byte b=10;
		byte c=20;
		byte z=(byte) (b+c);//explicitly cast 
		System.out.println("in byte form"+z);//output z is 30
		System.out.println("output is "+12/0.0);//output is infinity
		System.out.println("output is "+-12/0.0);//output is -infinity
		System.out.println(false==true);//output is false
		System.out.println(false==false);//output is true
		System.out.println(true==true);//output is true
		
		
	}
}
