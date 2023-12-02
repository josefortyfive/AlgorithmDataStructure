package array;

public class SumArraySum {

	
	static void subArraySum(int arr[], int sum) {
		int lengthOfTheArray = arr.length;
		
		for(int i = 0; i < lengthOfTheArray; i++) {
			
			int currentSum = arr[i];
			
			if(currentSum == sum) {
				System.out.println("Sum found at index " +i);
			}
			
			else {
				
				for(int j = i + 1; j < lengthOfTheArray; i++) {
					
					currentSum += arr[j];
					
					if(currentSum == sum) {
						System.out.println("Sum found between indexes " + " and " +j);

						return;
					}
					
				}
			}
		}
		System.out.println("No subArray found ");
		return;
	}
	
	public static void main(String args[]) {
		
		int arr[] = {15, 2, 4, 8, 9, 5, 10, 23 };
		int n = arr.length;
		int sum = 23;
		subArraySum(arr, sum);
		
	}
}
