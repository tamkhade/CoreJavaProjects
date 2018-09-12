package interviewprograms;

public class StringAnagramwithoutArrays {

	public static void main(String[] args)
	{
		String s1="peek";
		char[] c1=s1.toCharArray();
		String s2="keep";
		 char[] c2=s2.toCharArray();
		 String s3="";
		 for(int i=0;i<c1.length;i++)
		 {
			 for(int j=0;j<c2.length;j++)
			 {
				 if(c1[i]==c2[j])
				 {
					 s3=s3+s2.charAt(j);
					 System.out.println(s3);
					break;
				 } 
			 }
			 
		 }
		 
		 if(s1.equals(s3))
		 {
			 System.out.println("String is palindrome");
		 }else
		 {
			 System.out.println("not palindrome");
		 }
	
	}
	
}
