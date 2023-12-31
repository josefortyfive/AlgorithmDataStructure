package sorting;

public class BubbleSort {

	public void bubbleSort(int arr[]) {
		
		int n = arr.length;
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                     
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
 
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
	}
	
	public static void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.print(" "+arr[i]);
		}
	}
	
	public static void main(String args[]) {
		
		int arr[] = { 2323, 94, 2, 61, 10, 30};
		
		BubbleSort bubsort = new BubbleSort();
		
		bubsort.bubbleSort(arr);
		printArray(arr);
	}
}
