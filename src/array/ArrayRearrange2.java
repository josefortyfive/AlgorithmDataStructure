package array;

public class ArrayRearrange2 {

	static void rearrange(int arr[]) {
		int n = arr.length;
		
		int temp[] = arr.clone();
		
		
		int small = 0;
		int large = n - 1;
		
		boolean flag = true;
		
		
		for(int i = 0; i < n; i++) {
			if(flag) {
				arr[i] = temp[large--];
			}
			else {
				arr[i] = temp[small++];
			}
			
			flag = !flag;
		}
	}
	
	static void printArray(int arr[]) {
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void main(String args[]) {
		int arr[] = {1, 2, 3, 4, 5, 6};
		
		System.out.println("Original Array");
		printArray(arr);
		
		
		rearrange(arr);
		
		System.out.println("Modified Array");
		printArray(arr);
	}
}
