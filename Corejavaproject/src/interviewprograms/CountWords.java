package interviewprograms;

public class CountWords {

	public static void main(String[] args)
	{
		String input="Welcome to Java Session Session Session"; 
		int count=1;
		String[] words=input.split(" ");
		//System.out.println(words.toString());
		
		for(int i=0;i<words.length;i++)
		{
		//	System.out.println(words[0]);
		for(int j=i+1;j<words.length;j++)
		{
		//	System.out.println(words[j]);
			if(words[i].equals(words[j]))
			{
				words[j]="0";
				count=count+1;
				
				//System.out.println("hiii"+words[j]);
			}
		}
		if(words[i]!="0")
			System.out.println(words[i]+" "+count);
			
		}
		
	}
	
	
}
