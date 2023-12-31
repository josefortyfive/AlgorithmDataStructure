package sorting;

import java.util.Arrays;

public class PigeonHole {

	public static void pegeonhole_sort(int arr[]) {
		
		int n = arr.length;
		
		int min = arr[0];
		int max = arr[0];
		int range, i, j, index;
		
		for(int a = 0; a < n; a++ ) {
			if(arr[a] > max) {
				max = arr[a];
			}
			
			if(arr[a] < min) {
				min = arr[a];
			}
		}
		
		range = max - min + 1;
		
		int phole[] = new int[range];
		Arrays.fill(phole, 0);
		
		for(i = 0; i < n; i++) {
			phole[arr[i] - min]++;
		}
		
		index = 0;
		
		for(j = 0; j < range; j++) {
			while(phole[j]-->0) {
				arr[index++] = j + min;
			}
		}
	}
	
	
	public static void printArray(int arr[]) {
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print( arr[i]+" ");
		}
	}
	public static void main(String args[]) {
		int arr[] = {24, 55, 1, 12, 11};
		
		pegeonhole_sort(arr);
		printArray(arr);
	}
}
