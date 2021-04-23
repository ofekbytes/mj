package lottoery;

import java.util.Random;

public class Lottoery implements I_LotteryConstantValue {

	private int[] arrLotoNumbers = new int[7]; 
	/*
	 * constructor
	 */
	public Lottoery() {
		// TODO create a constructor.
	}

	/*
	 * square root of a number.
	 */
	public int square(int number) {
		
		return number*number;
	}
	
	
	private boolean validateMinMaxValue(int min, int max) {
		if (min >= max) {
			//throw new IllegalArgumentException("max must be greater than min");
//			System.out.println("\n\n min ==> " + min + " max ==> " + max);
//			System.out.println("false");
			return false;
		}
		
//		System.out.println("true");
		return true;
	}
	
	/*
	 * generate Random Number
	 */
	private int generateRandomNumber(int min, int max) 	{
		
		int generateRandomNumber = 0;
		
//		System.out.println("\n\n min ==> " + min + " max ==> " + max);
		
		Random r = new Random();
		generateRandomNumber =  r.nextInt((max - min) + 1) + min;
		
		
		
//		System.out.print("generateRandomNumber ==> " + generateRandomNumber);
		
		return generateRandomNumber;
	}
	
	/*
	 * validate Number Not Already Exists
	 */
	private void validateNumberNotAlreadyExists() {
		
		
	}
	
	/*
	 * store new value in array 
	 */
	private void storeNewValueInArray(int index, int value) {
		
		if (index < 0 || index > 7) {
			index = 0;
		}
		
		if (index == 0) {
			arrLotoNumbers[index] = value;
			System.out.println("\nfirst array.");
		}

		//find if "value" in the array.
		if (index > 0) {
			if(arrLotoNumbers.equals(value))  {
				// return true-number exist,
				arrLotoNumbers[index] = 0;
				System.out.println("number exists");
			}
			else {
				arrLotoNumbers[index] = value;
//				System.out.println("number is not exists.");
			}
		}
//		System.out.println("\n\nindex ==> " + index + " value ==> " + value);
	}
	
	/*
	 * Print Array
	 */
	private void printArray() {
		int index = 0;
		System.out.println("\nLOTO Numbers ==> ");
		
		for(index=0; index < arrLotoNumbers.length ; index++)
		{
			System.out.print(arrLotoNumbers[index] + ",");
		}
		
	}
	
	/*
	 * Generate Seven Numbers
	 */
	private void GenerateSevenNumbers() {
		//regular number (1,37)
		int index = 0;
		int currentRandomNumber = 0;
		
		for (index=0; index <= 6; index++) {
			validateMinMaxValue(getRegularNumberMinimumValue(),getRegularNumberMaximumValue());
			currentRandomNumber = generateRandomNumber(getRegularNumberMinimumValue(),getRegularNumberMaximumValue());
//			validateNumberNotAlreadyExists();
			
			storeNewValueInArray(index,currentRandomNumber);
		}
		printArray();
// TODO: no need for-loop //
		//strong number (1-7)
		//return 0;
	}



	/*
	 * main
	 */
	public static void main(String[] args) {
		
		Lottoery l = new Lottoery();
		System.out.println("start");
		l.GenerateSevenNumbers();
		
//		System.out.println(l.getRegularNumberMinimumValue());
//		System.out.println(l.getRegularNumberMaximumValue());
		
//		int min=1, max=37;
		
//		l.generateRandomNumber(min, max);
//		l.generateRandomNumber(min, max);
	}

}
