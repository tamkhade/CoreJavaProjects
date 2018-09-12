package flowcontrol;

public class SelectionSatement {
	public static void main(String[] args)
	{
		
		int x=30;
		boolean c=true;
		//1 condition
		if(x==40);//this is empty statement
		System.out.println("value exit");
		//2 condition
		if(c=false)
		{
			
			System.out.println("system exit");
		}else
		{
			
			System.out.println("System inn");
		}
		//switch statement
		final int y=40;
		switch (x) {
		case 30:
			System.out.println("1 st excuted");
			break;
		case y://constant expression required
			System.out.println("2 nd excuted");
			break;

		default:
			break;
		}
		
			
		
		
	}

}
