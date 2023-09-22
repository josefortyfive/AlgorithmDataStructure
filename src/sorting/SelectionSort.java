package sorting;

public class SelectionSort {

	public static void selectionSort(int arr[]) {
		int n = arr.length;
		
		for(int i = 0; i < n -1; i++) {
			int min_index = i;
			
			for(int j = i + 1; j < n; j++) {
				if(arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void printArray(int arr[]) {
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print(" "+arr[i]);
		}
	}
	public static void main(String args[]) {
		int arr[] = {23, 10, 2 , 114, 51};
		
		selectionSort(arr);
		printArray(arr);
	}
	
}
