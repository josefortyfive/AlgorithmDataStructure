package array;


import java.util.*;

public class LeaderInArray3 {

	
	static void printLeaders(int arr[]) {
		
		int sizeOfTheArray = arr.length;
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(arr[sizeOfTheArray - 1]);
		
		for(int i = sizeOfTheArray - 2; i >= 0; i--) {
			if(arr[i] >= stack.peek()) {
				stack.push(arr[i]);
			}
		}
		
		
		while(!stack.empty()) {
			System.out.print(stack.pop()+ " ");
		}
	}
	
	public static void main(String args[]) {
		int arr[] = {16, 17, 4, 3, 5, 2};
		
		printLeaders(arr);
		
	}
}
