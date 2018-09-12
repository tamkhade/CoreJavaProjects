package interviewprograms;

public class StringCountvowelsConsonants {
	
	public static void main(String[] args)
	{
	String s="mahesh";
	int count=0;
	char[] c=s.toCharArray();
	
	for(int i=0;i<s.length();i++)
	{
		if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
		{
			System.out.println("this are  vowel"+c[i]);
			
		}else
		{
			System.out.println("consonant "+c[i]);	
		}
	}
	System.out.println("vowel"+count);
	}
}
