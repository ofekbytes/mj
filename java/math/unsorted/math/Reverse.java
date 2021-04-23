package jsm.utility.math;

public class Reverse {
	
	// constructor //
	public Reverse() {
		ReversePrimitiveNumber(123450);
	}

	// constructor + argument //
	public Reverse(int sourceNumber) {
		ReversePrimitiveNumber(sourceNumber);
	}

	
	/**
	 **
	 ** @param sourceNumber
	 **/
	private void ReversePrimitiveNumber(int sourceNumber) {
		int totalDigits = 0;
		int tragetNumber = 0;

		System.out.println("The primitive number Entered: " + sourceNumber);
		
		totalDigits = countTotalDigitsInNumber(sourceNumber);
		tragetNumber = reverseNumber (totalDigits, sourceNumber);
		
		System.out.println("The primitive number Entered After reverse: " + sourceNumber +  "  "  + tragetNumber); 
	}
	
	
	/***
	 * 
	 * @param totalDigits
	 * @param sourceNumber
	 * @return
	 */
	private int reverseNumber(int totalDigits, int sourceNumber) {
		
		int srcNumber = sourceNumber;
		int returnNumber = 0;
		int currentDigit;
		
		System.out.println("totalDigits::: " + totalDigits);
		
		for (int number=totalDigits-1; number>-1; number--) {
			
			currentDigit = srcNumber % 10;
			
			returnNumber += (currentDigit * powerOf(number)) ;
			srcNumber = srcNumber / 10; 
			
			System.out.println("currentDigit >> " + currentDigit + "  " + returnNumber);						
		}
		
		return returnNumber;
	}

	
	
	/**
	 **
	 ** @param source - a number entered by the user.
	 ** @return int - total Digits.
	 **/
	private int countTotalDigitsInNumber(int source) {

		int totalDigits = 0;

		while (source > 0) {

			source = source / 10;
			totalDigits++;
		}
		System.out.println("source: " + source + "  have total Digits: " + totalDigits);
		return totalDigits;
	}

	
	/***
	 * 
	 * @param powerOf
	 * @return
	 */
	private int powerOf(int powerOf) {
		return ((int)Math.pow(10, powerOf));
	}

	
	/****
	 * 
	 * @param args
	 */
	public static void main(String [] args) {
		//Reverse r = new Reverse();		
		Reverse r = new Reverse(1995);
	}

	
	
}// class

