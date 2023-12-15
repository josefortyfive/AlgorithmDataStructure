package smallSideProj;

public class SimpleCalculator {

	private double firstNumber;
	private double secondNumber;
	
	public double getFirstNumber() {
		return firstNumber;
	}
	
	public void setFirstNumber(double firstNumber) {
		this.firstNumber = firstNumber;
	}
	
	
	public double getSecondNumber() {
		return secondNumber;
	}
	
	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}
	
	
	public double getAddFunction() {
		return firstNumber + secondNumber;
	}
	
	public double getSubstractFunction() {
		return firstNumber - secondNumber;
	}
	
	public double getMultiplicationFunction() {
		return firstNumber * secondNumber;
	}
	
	public double getDivision() {
		if(secondNumber == 0) {
			return 0;
		}
		else {
			return firstNumber/secondNumber;
		}
		
	}
}
