package smallSideProj;

public class FirstLastDigitSum {
	
	public static int sumFirstAndLastDigit(int number) {
		
		if(number < 0) {
			return -1;
		}
		
		int firstDigit = 0;
		int lastDigit = (number % 10);
		
		while(number >= 10) {		
			number /=10;
		}
		
		firstDigit = number;
		return firstDigit + lastDigit;
		
	}
	
	public static void main(String args[]) {
		
		System.out.println("The sum of the last 2 digit is "+sumFirstAndLastDigit(252));
		System.out.println("The sum of the last 2 digit is "+sumFirstAndLastDigit(257));
		System.out.println("The sum of the last 2 digit is "+sumFirstAndLastDigit(0));
		System.out.println("The sum of the last 2 digit is "+sumFirstAndLastDigit(5));
		System.out.println("The sum of the last 2 digit is "+sumFirstAndLastDigit(-10));
		
		
		
	}

}
