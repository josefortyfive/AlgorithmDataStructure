package array;

public class SearchElementSortAndRotatedArray2 {

	public static int searchRotatedArray(int arr[], int key) {
		int n = arr.length;
	
		for(int i = 0; i < n; i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String args[]) {
		
		int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
		
		int key = 3;
		int index = searchRotatedArray(arr, key);
		
		if(index != -1) {
			System.out.println("Found at index " +index);
		} else {
			System.out.println("Not found ");
		}
		
	}
}
