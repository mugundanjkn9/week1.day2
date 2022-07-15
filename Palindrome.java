package week1.weekendassignment2;

public class Palindrome {
	
	public static void getPalindrome(String s) {
		String result="";
			System.out.println("The given string is " +s);
		char c[] = s.toCharArray();
			System.out.print("The reversed string is ");
		for(int i=c.length-1; i>=0;i--) {
			result=result+c[i];
		}
		System.out.println(result);
		if(result.equals(s)) 
			System.out.println("The given string is Palindrome");
		else 
			System.out.println("The given string is not a Palindrome");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sir";
		getPalindrome(str);
	}

}
