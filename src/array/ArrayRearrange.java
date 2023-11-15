package array;

import java.util.Arrays;
import sorting.*;

public class ArrayRearrange {

	BubbleSort bubSort = new BubbleSort();
	
	public void assign(int arr[]) {
		

		bubSort.bubbleSort(arr);
		int n = arr.length;
		
		//Arrays.sort(arr);
		int ans[] = new int[n];
		int p = 0;
		int q = n - 1;
		
		
		for(int i = 0; i < n; i++) {
			if((i + 1) % 2 == 0) {
				
				ans[i] = arr[q--];
			}
			else {
				ans[i] = arr[p++];
			}
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(ans[i] + " ");
		}
		
	}
	
	
	
	public static void main(String args[]) {
		int arr[] = {1, 3, 2, 2, 5};
		
		//BubbleSort bubSort = new BubbleSort();
		ArrayRearrange arrayRearrange = new ArrayRearrange();
		arrayRearrange.assign(arr);
		
		//arrayRearrange.assign(arr);
		//bubSort.printArray(arr);
		
		
	}
}
