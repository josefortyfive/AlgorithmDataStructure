package array;

public class PushZero {

	public static void pushZerosToEnd(int arr[]) {
		
		int n = arr.length;
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[count++] = arr[i];
			}
		}
		
		while(count < n) {
			arr[count++] = 0;
		}
	}
	
	public static void printArray(int arr[]) {
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	
	public static void main(String args[]) {
		int arr[] = { 1, 9, 4, 55, 0, 0, 2, 0, 8, 0 };
		
		pushZerosToEnd(arr);
		
		printArray(arr);
		
	}
	
}
