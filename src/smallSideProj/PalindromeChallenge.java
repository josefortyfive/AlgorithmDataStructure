package smallSideProj;

public class PalindromeChallenge {

	public static boolean isPalindrome(int number) {
		
		int reverse = 0;
		int original = number;
		boolean palindrome = false;
		
		while(original != 0) {			
			int lastDigit = original % 10;
			reverse = (reverse * 10) + (lastDigit);
			original /= 10;
			
		}
		
		
		palindrome = reverse == number;
		
		return palindrome;
		
	}
	public static void main(String args[]) {
		
		
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(111));
		System.out.println(isPalindrome(13451));
		System.out.println(isPalindrome(12321));
		System.out.println(isPalindrome(1211));
		
	}
	
}
