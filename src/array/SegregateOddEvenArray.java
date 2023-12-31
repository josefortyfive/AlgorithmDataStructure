package array;

public class SegregateOddEvenArray {
	
	static void arrayEvenAndOdd(int arr[]) {
		int n = arr.length;
		
		int i = -1;
		int j = 0;
		
		while (j != n) {
			if(arr[j] % 2 == 0) {
				i++;
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

			j++;

		}
		
	}
	
	static void printArray(int arr[]) {
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	
	public static void main(String args[]) {
		int arr[] = {1 ,3, 2, 4, 7, 6, 9, 8};
		
		arrayEvenAndOdd(arr);
		printArray(arr);
	}
}
