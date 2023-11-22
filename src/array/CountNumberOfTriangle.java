package array;


import java.util.Arrays;

public class CountNumberOfTriangle {

	static int findNumberOfTriangles(int arr[], int n) {
		
		Arrays.sort(arr);
		
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				for(int k = j + 1; k < n; k++) {
					if(arr[i] + arr[j] > arr[k]) {
						count++;
					}
				}
			}
		}
		
		return count;
	}

	public static void main(String args[]) {
		int arr[] = {10, 22, 55, 1, 52, 100, 96};
		int n = arr.length;
		
		
		System.out.print("Total number of triagles possibles is: "+findNumberOfTriangles(arr, n));
	}

}
