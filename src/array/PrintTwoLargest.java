package array;

import java.util.*;
public class PrintTwoLargest {

	public static void print2Largest(int arr[], int arr_size) {
		int first;
		int second;
		
		if(arr_size < 2) {
			System.out.printf("Invalid Input ");
			return;
		}
		
		Arrays.sort(arr);
		
		
		for(int i = arr_size - 2; i  >= 0; i--) {
			if(arr[i]  != arr[arr_size - 1]) {
				System.out.printf("The second largest " + arr[i]);
				
				return;
			}
		}
		
		System.out.printf("No second largest array");
		
	}
	
	
	public static void main(String args[]) {
		int arr[] = {12, 25, 111, 1, 9, 11 };
		int n = arr.length;
		
		print2Largest(arr, n);
	}

}
