package operatorandassignement;

public class Explicittypecasting {
	//programmer  responsible for this casting
		//byte<-short<-int<-long<-float<-double
		//            |
		          //char

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=30;
		byte z=(byte) x;//these may be chance of loss of information
		System.out.println(z);//output is 30

	}

}
