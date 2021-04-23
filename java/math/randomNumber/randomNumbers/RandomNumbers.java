/// package jsm.utility.randomNumber;

import java.util.Random;

public class RandomNumbers extends RandomNumbersVariableGS {

	/*
	 * RandomNumbers - constructor
	 */

//	private int minNumber = 1;
//	private int maxNumber = 42;
//	private int intResult;
//	private int totalNumber;

	public RandomNumbers() {
        // 6 (1-37) + 1 (1-7)
		setMinimumNumber(1);
		setMaximumNumber(37);
		setTotalNumbers(6);
		GenerateRandomNumbers();
		printRandomNumber();
	}

	public void GenerateRandomNumbers() {

		for (int i = 0; i < getTotalNumbers(); i++) {
			RandomNumber();
		}
	}

	public void RandomNumber() {
		Random random = new Random();

		do {
			setIntResult(random.nextInt(getMaximumNumber() + 1 - getMinimumNumber()) + getMinimumNumber());
		} while (listRadmonNumber.contains(getIntResult()) == true);

		listRadmonNumber.add(getIntResult());
	}

	@Override
	public void printRandomNumber() {
		for (int i = 0; i < listRadmonNumber.size(); i++) {

			// if i bing then zero/0 add print ','
			if (i > 0) {
				System.out.print(", ");
			}

			// print random numbers //
			System.out.print(listRadmonNumber.get(i));

			// end random number with a dot '.' //
			if (i == (listRadmonNumber.size() - 1)) {
				System.out.println(" ... ");
			}

		}

	}

}
