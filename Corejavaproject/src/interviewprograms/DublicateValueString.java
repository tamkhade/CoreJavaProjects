package interviewprograms;

public class DublicateValueString {
	public static void main(String args[])
	{
	String s="mahesh";
	String n=s.substring(0,2)+s.substring(3+1);
	System.out.println(n);
	
	System.out.println();
	
	StringBuilder h=new StringBuilder(s); 
	for(int i=0;i<s.length();i++)
	{
		for(int j=i+1;j<s.length();j++)
		 {
			if(s.charAt(i)==s.charAt(j))
			{
	         // h.deleteCharAt(j);
	        //  h.delete(5, 6);
			}	
	     }	
     }
	//System.out.println("hiii mahesh "+h);
	}
	
   }
