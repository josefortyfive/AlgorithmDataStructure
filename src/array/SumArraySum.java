package array;

public class SumArraySum {

	
	static void subArraySum(int arr[], int sum) {
		int lengthOfTheArray = arr.length;
		
		for(int i = 0; i < lengthOfTheArray; i++) {
			
			int currentSum = arr[i];
			
			if(currentSum == sum) {
				System.out.println("Sum found at index " +i);
			}
		}
		
	}
}
