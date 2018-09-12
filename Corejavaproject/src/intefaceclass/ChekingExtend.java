package intefaceclass;

public class ChekingExtend implements Firstinterface,Secondinterface {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("hii mahesh");
	}
	
	@Override
	public void m2()//when change return type of overloading compile time error
	{
		// TODO Auto-generated method stub
		
	 }
	
	public static void main(String[] args)
	{
	ChekingExtend c=new ChekingExtend();
	c.m1();	
	}
	
}
