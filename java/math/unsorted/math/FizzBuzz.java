package jsm.utility.math;

//import java.util.logging.Logger;

public class FizzBuzz {

	public FizzBuzz() {
		
		// Task 1: Even -or- odd number //
//		 numberEvenOrOdd();

		// Task #2: zig -or- zag //
//		zigZagChecker();

		// Task 3: number divided by 2, 3 ,5 ,10 print result. //
//		 dividedNumberByX();

		// Task 4: number divided by 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 print result.
//		 dividedNumberByoneToZero();

		// Task 5: like Task 4 with a nice logic
		dividedNumberByoneToZeroNL();
	}
//
// Task 1: Even -or- odd  number.
	
// even (%2==0) , odd (!(%==2))
	private void numberEvenOrOdd() {
		System.out.println("");
		for (int number = 1; number < 99; number++) {
			System.out.print(" . " + number + " . is ");
			if ((number % 2 == 0)) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
		}
	}

// Task #2: zig -or- zag.
// iterate numbers between: 1-100 and print:
// number x3 == "zig"
// number x5 == "zag"
// number x3 and x5 == "zag"	
	public void zigZagChecker() {
		System.out.println("");
		for (int number = 1; number < 99; number++) {
			System.out.print(" . " + number + " . ");
			if (((number % 3) == 0) && ((number % 5) == 0)) {
				System.out.print(" 'zig-zag' ");
			} else if ((number % 3) == 0) {
				System.out.print(" 'zig' ");
			} else if ((number % 5) == 0) {
				System.out.print(" 'zag' ");
			}
			System.out.println(" "); // new line
		}

	}

	// Task 3: number divided by 2, 3 ,5 ,10 print result.
	private void dividedNumberByX() {
		for (int number = 1; number <= 100; number++) {
			System.out.print(" . " + number + " . dived by :::");
			if ((number % 2) == 0) {
				System.out.print(" ,2 ");
			}
			if ((number % 3) == 0) {
				System.out.print(" ,3 ");
			}
			if ((number % 5) == 0) {
				System.out.print(" ,5 ");
			}
			if ((number % 10) == 0) {
				System.out.print(" ,10 ");
			}
			System.out.println(" ");
		}
	} // dividedNumberByX() //

	// Task 4: number divided by 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 print result.
	private void dividedNumberByoneToZero() {
		for (int number = 1; number <= 100; number++) {
			System.out.print(" . " + number + " . dived by :::");
			if ((number % 1) == 0) {
				System.out.print(" ,1 ");
			}
			if ((number % 2) == 0) {
				System.out.print(" ,2 ");
			}
			if ((number % 3) == 0) {
				System.out.print(" ,3 ");
			}
			if ((number % 4) == 0) {
				System.out.print(" ,4 ");
			}
			if ((number % 5) == 0) {
				System.out.print(" ,5 ");
			}
			if ((number % 6) == 0) {
				System.out.print(" ,6 ");
			}
			if ((number % 7) == 0) {
				System.out.print(" ,7 ");
			}
			if ((number % 8) == 0) {
				System.out.print(" ,8 ");
			}
			if ((number % 9) == 0) {
				System.out.print(" ,9 ");
			}
			if ((number % 10) == 0) {
				System.out.print(" ,10 ");
			}
			System.out.println(" ");
		}
	} // dividedNumberByoneToZero() //

	
	// Task 5: like Task 4 with a nice logic
	private void dividedNumberByoneToZeroNL() {
		for (int number = 1; number <= 100; number++) {
			System.out.print(+number);
			for (int i = 1; i <= 10; i++) {
				if ((number % i) == 0) {
					System.out.print(" ," + i + " ");
				}
			}
			System.out.println(" ");
		}
	} // dividedNumberByoneToZeroNL() //

} //class

