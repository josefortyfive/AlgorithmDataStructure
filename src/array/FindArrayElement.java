package array;

public class FindArrayElement {

	
	static int findSingle(int arr[]) {
		
		int sizeOfArray = arr.length;
		
		for(int i = 0; i < sizeOfArray; i++) {
			int count = 0;
			
			for(int j = 0; j < sizeOfArray; i++) {
				
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
	
	
}
