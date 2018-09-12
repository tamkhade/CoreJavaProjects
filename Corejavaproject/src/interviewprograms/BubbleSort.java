package interviewprograms;
public class BubbleSort {
	public static void main(String[] args)
	{
		int temp=0;
		int arr[] ={433,12,206,115,444};  
		int n=arr.length;
		int[] arr1=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr1.length-1;j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
				    arr[j]=temp;
				}
	           }

			arr1[i]=arr[i];
		}
		
		for(int x:arr1)
		{
			System.out.print(" ascending order "+x);
		}
		System.out.println();
		
		for(int k= arr1.length-1;k>=0;k--)
		{
			System.out.print(" descending order "+arr1[k]);
		}
		
		
	}
	

}
