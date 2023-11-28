package array;

public class LeaderInArray {
	
	static void printLeaders(int arr[]) {
		
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			int j ;
			for(j = i + 1; j < n; j++) {
				if(arr[i] <= arr[j]) {
					break;
				}
			}
			
			if(j == n) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
	
	public static void main(String args[]) {
		
		int arr[] = {16,17, 4, 3, 5, 2};
		printLeaders(arr);
		
	}
	
}
