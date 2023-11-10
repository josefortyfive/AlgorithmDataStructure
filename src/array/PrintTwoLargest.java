package array;

import java.util.*;
public class PrintTwoLargest {

	public static void print2Largest(int arr[]) {
		int first;
		int second;
		int n = arr.length;
		
		if(n < 2) {
			System.out.printf("Invalid Input ");
			return;
		}
		
		Arrays.sort(arr);
		
		
		for(int i = n - 2; i  >= 0; i--) {
			if(arr[i]  != arr[n - 1]) {
				System.out.printf("The second largest " + arr[i]);
				
				return;
			}
		}
		
		System.out.printf("No second largest array");
		
	}
	

}
