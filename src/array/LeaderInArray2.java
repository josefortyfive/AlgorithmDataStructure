package array;

public class LeaderInArray2 {
	
	static void printLeaders(int arr[]) {
		
		int n = arr.length;
		
		int max_from_right = arr[n - 1];
		
		System.out.print(max_from_right + " ");
		
		for(int i = n - 2; i >= 0; i--) {
			if(max_from_right < arr[i]) {
				max_from_right = arr[i];
				System.out.print(max_from_right + " ");
			}
		}
	}
	
	
	public static void main(String args[]) {
		
		int arr[] = {16, 17, 4, 3, 5, 2};
		printLeaders(arr);
		
		
	}

}
