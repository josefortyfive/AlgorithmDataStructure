package search;

public class SentinelSearch {
	
	public static void sentinelSearch(int arr[], int n, int key) {
		
		int last = arr[n - 1];
		
		arr[n - 1] = key;
		int i = 0;
		
		while(arr[i] != key) {
			i++;
		}
		arr[n - 1] = last;
		
		if((i < n - 1) || (arr[n - 1] == key)) {
			System.out.println(key+" is present at index " + i);
		}
		else {
			System.out.println("Element is not present");
		}
	}
	
	public static void main(String args[]) {
		int arr[] = { 10 , 20, 190 ,434, 535};
		
		int n = arr.length;
		
		int key = 190;
		
		sentinelSearch(arr, n, key);
	}

}
