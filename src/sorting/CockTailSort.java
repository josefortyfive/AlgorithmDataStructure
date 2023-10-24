package sorting;

public class CockTailSort {

	public static void cockTailSort(int arr[]) {
		boolean swapped = true;
		int start = 0;
		int end = arr.length;
		
		while(swapped == true) {
			
			swapped = false;
			
			for(int i = start; i < end - 1; i++) {
				if(arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swapped = true;
				}
			}
			
			if(swapped == false) {
				break;
			}
			
			swapped = false;
			
			end = end - 1;
			
			for(int i = end - 1; i >= start; i--) {
				if(arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					swapped = true;
				}
			}
			
			start = start + 1;
		}	
	}
	
	
	
	public static void printArray(int arr[]) {
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[]) {
		
		int arr[] = {4, 11, 2, 5, 10, 12};
		cockTailSort(arr);
		printArray(arr);
	
	}
	
	
}
