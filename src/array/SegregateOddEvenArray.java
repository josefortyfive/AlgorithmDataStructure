package array;

public class SegregateOddEvenArray {
	
	static void arrayEvenAndOdd(int arr[]) {
		int n = arr.length;
		
		int i = -1;
		int j = 0;
		
		while (j != n) {
			if(arr[j] % 2 == 0) {
				i++;
			}
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		j++;
	}

}
