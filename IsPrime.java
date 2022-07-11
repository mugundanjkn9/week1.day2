package week1.day1;

public class IsPrime {

	public static void main(String[] args) {

		int number = 17;
		boolean isPrime = true;
		
		for (int i=2;i<number;i++) {
			if(number%i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime)
			System.out.println("The given Number is Prime");
		else
			System.out.println("The given Number is Not a Prime");
	}
}
