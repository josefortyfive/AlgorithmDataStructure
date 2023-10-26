package recursion;

public class RecursionExample2 {

	
	static int count = 0;
	
	static void recursionSample() {
		count++;
		
		if(count <= 5) {
			System.out.println("Hello "+count);
			recursionSample();
		}
	}
	
	public static void main(String args[]) {
		recursionSample();
	}
	
}
