package sorting;

public class StoogeSort {
	
	public static void stoogeSort(int arr[], int l, int h) {
		if( l >= h) {
			return;
		}
		
		// If first element is smaller than the last, swap them
		
		if(arr[l] > arr[h]) {
			int temp = arr[l];
			arr[l] = arr[h];
			arr[h] = temp;
		}
		
		// If there are more than 2 elements in the array
		
		if(h - l + 1 > 2) {
			int temp = (h - l + 1) / 3;
			
			stoogeSort(arr, l, h - temp);
			
			stoogeSort(arr, l + temp, h);
			
			stoogeSort(arr, l, h - temp);
			
		}
	}

	
	public static void printArray(int arr[]) {
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+ " " );
		}
	}
}
