package array;

public class FindArrayElement {

	
	static int findSingle(int arr[]) {
		
		int sizeOfArray = arr.length;
		
		for(int i = 0; i < sizeOfArray; i++) {
			int count = 0;
			
			for(int j = 0; j < sizeOfArray; j++) {
				
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			
			
			if(count == 1) {
				return arr[i];
			}
		}
		
		
		return -1;
	}
	
	
	public static void main(String args[]) {
		int arr[] = {2, 3, 5, 4, 5, 3, 4};
		
		System.out.println("Element occuring once: " +findSingle(arr));
 	}
	
	
}
