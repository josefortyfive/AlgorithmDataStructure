package sorting;

public class OddEvenSort {

	
	public static void oddEvenSort(int arr[]) {
		int n = arr.length;
		
		boolean isSorted = false;
		
		while(!isSorted) {
			isSorted = true;
			int temp = 0;
			
			for(int i = 1; i <= n-2; i = i + 2) {
				if(arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					isSorted = false;
				}
			}
			
			
			for(int i = 0; i <=n - 2; i = i + 2) {
				if(arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					isSorted = false;
				}
			}
		}
		
		return;
	}
	
	
	public static void printArray(int arr[]) {
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[]) {
		int arr[] = {232, 21, 11,100, 501, 9, 3, 2, 22, 10};
		
		oddEvenSort(arr);
		printArray(arr);
		
	}
	
}
