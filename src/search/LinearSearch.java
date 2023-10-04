package search;

public class LinearSearch {
	
	public static int search(int arr[], int n, int x) {
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == x) {
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = { 62, 9, 11, 101, 420};
		int number = 101;
		
		int result = search(arr, arr.length, number);
		
		if(result == -1) {
			System.out.println("The number is not in the array.");
		}
		else {
			System.out.println("The number in is in index: "+result);
		}
		
	}
}
