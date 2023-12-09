package smallSideProj;

import java.util.Scanner;

public class ReadingUserInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int counter = 1;
		double sum = 0;
		
		while(counter <= 5) {
			System.out.println("Enter number # "+counter);
			String input = scanner.nextLine();
			try {
				double number = Double.parseDouble(input);
				counter++;
				sum += number;
			} catch(NumberFormatException e) {
				System.out.println("Invalid Input ");
			}
		}
		System.out.println("The sum of the five number: "+sum);
	}

}
