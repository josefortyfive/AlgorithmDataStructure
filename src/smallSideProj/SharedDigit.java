package smallSideProj;

public class SharedDigit {
	public static boolean hasSharedDigit(int firstNumber, int lastNumber) {
		
		if(firstNumber < 10 || firstNumber > 99 || lastNumber < 10 || lastNumber > 99) {
			
			return false;
		}
		
		else {
			return (firstNumber % 10 == lastNumber % 10 || firstNumber % 10 == lastNumber / 10 || firstNumber / 10 == lastNumber % 10 || firstNumber / 10 == lastNumber / 10);
		}
	}
	
	public static void main(String args[]) {
		
		
		System.out.println(hasSharedDigit(12, 23));
		System.out.println(hasSharedDigit(9, 99));
		System.out.println(hasSharedDigit(15, 55));
		
	}
}
