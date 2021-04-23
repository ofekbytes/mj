/**
 * 
 */
package jsm.utility.lottery;

import java.util.ArrayList;

/**
 * @author yaron
 *
 */
public interface InterfaceLoto {
	//
	// // Lottery Numbers // //
	// // loto numbers mark 6, range (1-37) // //
	final int lotteryMinimumRangeNumber = 1;
	final int lotteryMaximumRangeNumber = 37;
	final int lotteryMaximumChosenNumbers = 6;

	//
	// // Lottery strong Number // //
	// // loto strong number: mark 1, range (1-7) // //
	final int strongLotteryMinimumRangeNumber = 1;
	final int strongLotteryMaximumRangeNumber = 7;
	final int strongLotteryMaximumChosenNumbers = 1;

//	void createLotoNumbers();
//
//	int createRandomNumber(int intMinNumber, int intMaxNumber);
//
//	boolean checkIfNumberExists(int number);
//
//	// if not exist add to array
//	// else create a new number
//	void createLotoStrongNumber();

	// loop 1-6
	// create a random number
	// check if not exist in the array.
	// add to array.
	// create a random strong number;
	// add to array.
}
