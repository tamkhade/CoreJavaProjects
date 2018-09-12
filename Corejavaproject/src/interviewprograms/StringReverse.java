package interviewprograms;

public class StringReverse {
	
	public static void main(String[] args)
	{
	String s="mahesh";
	String d="";
	for(int i=s.length()-1;i>=0;i--)
	{
		d=d+s.charAt(i);
	}
	System.out.println(d);
	}
}
