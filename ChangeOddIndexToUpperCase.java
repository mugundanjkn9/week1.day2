package week1.weekendassignment2;

public class ChangeOddIndexToUpperCase {
	
	/*
	 Pseudo Code
	 * Declare String Input as Follow
	 * String test = "changeme";
	 * a) Convert the String to character array
	 * b) Traverse through each character (using loop)
	 * c)find the odd index within the loop (use mod operator)
	 * d)within the loop, change the character to uppercase, if the index is odd else don't change
	 */
	
	private static String getOddtoUpperCase(String s) {
		
		String empty="";
		char arr[] = s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			char c=arr[i];
			if(i%2!=0) {
				c=Character.toUpperCase(c);
			}
			empty =empty+c;
		}
		return empty;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="changeme";
		System.out.println("The Given String is : " +str);
		System.out.println("Modified Odd Index to Uppercase: "+getOddtoUpperCase(str));
		
	}
}
