package recursion;

import java.util.*;

public class Fibonacci {

	
	public static int fib(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1 || n == 2) {
			return 1;
		}
		else {
			return(fib(n - 1) + fib(n - 2));
		}
	}
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		int n = in.nextInt();
		
		System.out.println("Fibonacci: ");
		
		for(int i = 0; i < n; i++) {
			System.out.print(fib(i)+ " ");
			 
		}
	}
}
