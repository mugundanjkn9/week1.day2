package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Print the first value
		 * Initialize a vaiarble sum
		 * Add a first and sum 
		 */

		int first=0;
		int second=1;
		int finalseries=0;
		
		System.out.println("Fibbinocci Series for 0 to 56 :");
		System.out.print(first);
		for(int i=0;i<10;i++)
		{
			finalseries=first+second;
			second = first;
			first = finalseries;
			System.out.print(" "+finalseries);
		}
	}
}
