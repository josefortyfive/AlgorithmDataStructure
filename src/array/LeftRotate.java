package array;

public class LeftRotate {

	static void leftRotate(int arr[], int d) {
		if(d == 0) {
			return;
		}
		
		int n = arr.length;
		
		d = d % n;
		
		reverseArray(arr, 0, d - 1);
		reverseArray(arr, d, n - 1);
		reverseArray(arr, 0, n - 1);
		
	}
	
	static void reverseArray(int arr[], int start, int end) {
		int temp;
		
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	
	
}
