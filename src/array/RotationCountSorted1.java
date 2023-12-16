package array;

public class RotationCountSorted1 {

	static int countRotations(int arr[]) {
		int n = arr.length; // gets the length of the array
		
		if(arr[0] > arr[n - 1]) {
			
			for(int i = 0; i < n; i++) {
				
				if(arr[i] > arr[i + 1]) {
					return i + 1;
				}
			}
			
		}
		
		return 0;
	}
	
	
	public static void main(String args[]) {
		int arr[] = {15, 18 , 2, 3, 6, 12};
		
		System.out.println(countRotations(arr));
				
	
	}
}
