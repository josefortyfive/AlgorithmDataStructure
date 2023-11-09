package array;

public class PrintLargest {

	public static void print3Largest(int arr[], int arr_size) {
		int first;
		int second;
		int third;
		
		if(arr_size < 3) {
			System.out.print(" Invalid Input ");
		}
		
		
		first = Integer.MIN_VALUE;
		second = Integer.MIN_VALUE;
		third = Integer.MIN_VALUE;
		
		
		for(int i = 0; i < arr_size; i++){
			
			if(arr[i] > first){
				third = second;
				second = first;
				first = arr[i];
			}
			
			else if (arr[i] > second){
				third = second;
				second = arr[i];
			}
			
			else if(arr[i] > third){
				third = arr[i];
			}
		}
		
		System.out.println("The three largest elements are " + first+ " "
				+second+ " " +third);
	}
	
	
	
	public static void main(String args[]) {
		int arr[] = { 12, 55, 15, 35, 1 };
		
		int n = arr.length;
		
		print3Largest(arr, n);
	}
	
}
