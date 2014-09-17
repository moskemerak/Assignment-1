package calc;

public class ComplexCalculator {

	private double currentNumber;
	
	// constructor
	public ComplexCalculator(double d) {
		currentNumber = d;
	}
	
	// adds d to current number
	public void add(double d) {
		currentNumber = currentNumber + d;
	}
	
	// subtract()
	public void subtract(double d) {
		currentNumber = currentNumber - d;
	} 
	
	// multiply()
	public void multiply(double d) {
		currentNumber = currentNumber * d;
	} 
	
	// divide()
	public void divide(double d) {
		currentNumber = currentNumber / d;
	} 
	
	// clear()
	// TODO sets current number to 0
	public void clear() {
		currentNumber = 0;
	} 
	
	// power()
	// TODO raises current number to the power of a given number
	public void power(double d) {
		currentNumber = Math.pow(currentNumber, d);
	}
		
	public double getCurrentNumber() {
		return currentNumber;
	}
	
	//////////////////////////////////////////////////
	// EXTRA FUNCTIONS - not needed for full credit //
	
	// isEven()
	// TODO returns true is current number is even, false otherwise
	
	// isPrime()
	// TODO returns true if current number is a prime number, false otherwise
	
	////////////////////////////////////////////////////
	
}
