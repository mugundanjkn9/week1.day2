package week1.weekendassignment2;

public class ReverseEvenWords {
	
	/* Pseudo Code:
	 
	 * Declare the input as Follow
      		String test = "I am a software tester"; 
	a) split the words and have it in an array
	b) Traverse through each word (using loop)
	c) find the odd index within the loop (use mod operator)
	d)split the words and have it in an array
	e)print the even position words in reverse order using another loop (nested loop)
	f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
	
	 
*/
	
	public static String getReverseEvenWords(String s) {
		String[] str=s.split(" ");
		String r="";
		for(int i=0;i<str.length;i++) {
			if(i%2==1) {
				str[i]=reverse(str[i]);				
			}
			r=r+" "+str[i];
		}
		return r;
	}
	
	public static String reverse(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		return rev;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text= "I am a software tester";
		String result=getReverseEvenWords(text);
		System.out.println("The Reverse Even Words are : "+result);	

	}

}
