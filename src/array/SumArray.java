package array;

public class SumArray {

	
	public static void sumArray(int arr[]) {
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("The total sum of the arrays is: "+sum);
	}
	public static void main(String args[]) {
		
		int arr[] = {12, 11, 55, 1};
		
		sumArray(arr);
	}
}
