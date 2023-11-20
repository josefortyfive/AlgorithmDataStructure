package array;

import java.util.Arrays;

public class SortWave {

	static void swap(int arr[], int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	static void sortInWave(int arr[], int n) {
		Arrays.sort(arr);
		
		for(int i = 0; i < n - 1; i += 2) {
			swap(arr, i, i + 1);
		}
	}
	
	public static void main(String args[]) {
		int arr[] = {10, 90, 49, 2, 1, 5, 23};
		int n = arr.length;
		
		sortInWave(arr, n);
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
