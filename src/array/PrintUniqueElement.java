package array;

import java.util.Arrays;

public class PrintUniqueElement {

	
	static void printDistrict(int arr[]) {
		
		int n = arr.length;
		Arrays.sort(arr);
		
		for(int i = 0; i < n; i++) {
			while(i < n - 1 && arr[i] == arr[i + 1]) {
				i++;
			}
			
			
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void main(String args[]) {
		
		int arr[] = {10, 6, 5, 4, 120, 9, 4, 6, 10, 120, 5};
		printDistrict(arr);
	}
}
