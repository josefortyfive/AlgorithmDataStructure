package sorting;

public class CombSort {
	
	public static int getNextGap(int gap) {
		gap = (gap * 10) / 13;
		if(gap < 1) { // Checks the value of the input if greater than 1
			return 1; 
		}
		
		return gap;
	}

	// Sort function for CombSort
	public static void combSort(int arr[]) {
		
		int n = arr.length; // get the length of the array to loop 
		
		
		int gap = n; // initialize gap
		
		
		boolean swapped = true; // swaps the value if it's true
		
		while(gap != 1 || swapped == true) {
			
			// Find next gap
			
			gap = getNextGap(gap);
			
			
			swapped = false; // Swapped if false to check if it happend or not
			
			for(int i = 0; i < n - gap; i++) {
				if(arr[i]> arr[i + gap]) {
					int temp = arr[i];
					arr[i] = arr[i + gap];
					arr[i + gap] = temp;
				}

			}	
		}	
	}
	
	
	public static void printArray(int arr[]) {
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			System.out.print(" "+arr[i]);
		}
	}
	
	public static void main(String args[]) {
		
		int arr[] = {14, 1, 11, 9, 20, 30, 15};
		
		combSort(arr);
		printArray(arr);
	}
}
