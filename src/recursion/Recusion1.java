package recursion;

public class Recusion1 {
	
	public static void printRe(int test) {
		if(test < 1) {
			return;
		}
		else {
			System.out.printf("%d ", test);
			printRe(test - 1);
			System.out.printf("%d ", test);
		}
	}
	
	public static void main(String args[]) {
		int test = 3;
		printRe(test);
	}

}
