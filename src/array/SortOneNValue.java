package array;

public class SortOneNValue {

	
	
	static void sort(int arr[]) {
		int i = 0;
		
		while ( i < arr.length) {
			int correct = arr[i] - 1;
			
			if(arr[correct] != arr[i]) {
				swap(arr, i, correct);
			}
			
			else {
				i++;
			}
		}
	}
	
}
