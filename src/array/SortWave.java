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
}
