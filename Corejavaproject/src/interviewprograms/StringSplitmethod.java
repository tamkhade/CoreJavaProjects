package interviewprograms;

public class StringSplitmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="mahesh gorakh tamkhade";
		String s2[]=s.split("\\s");
		
		int count=1;
		for(String s3:s2)
		{
			System.out.print(s3);
			count++;
		}
		

	}

}
