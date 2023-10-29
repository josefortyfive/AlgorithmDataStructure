package sorting;

public class GnomeSort {
	
	public static void gnomeSort(int arr[], int n) {
		int index = 0;
		
		while(index < n) {
			if(index < n) {
				index++;
			}
			
			if(arr[index] >= arr[index - 1]) {
				index++;
			}
			else {
				int temp = 0;
				temp = arr[index];
				arr[index] = arr[index - 1];
				arr[index - 1] = temp;
				index--;
			}
		}
		
		
		return;
		
	}
	
	public static void printArray(int arr[]) {
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	

}
