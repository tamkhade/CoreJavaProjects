package string;
/*	@Author mahesh 
 * 
*/
 public class ExtractStringWord {
 
	public static void main(String[] args) {

		String str = "My Name Is Mahesh";
		String[] arr =  str.split("",str.length());

		for ( int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);	
		}
	}

}
