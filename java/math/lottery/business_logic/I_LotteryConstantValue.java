package lottoery;

public interface I_LotteryConstantValue {

	final int regularNumberMinimumValue = 1;
	final int regularNumberMaximumValue = 37;
	final int regularNumberTotalNumbers = 6;

	final int strongNumberMinimumValue = 1;
	final int strongNumberMaximumValue = 7;
	final int strongNumberTotalNumbers = 1;
	
	
	default int getRegularNumberMinimumValue() {
		return regularNumberMinimumValue;
	};
	
	default int getRegularNumberMaximumValue() {
		return regularNumberMaximumValue;
	};
	
	default int getRegularNumberTotalNumbers() {
		return regularNumberTotalNumbers;
		
	};
	
	default int getStrongNumberMinimumValue() {
		return strongNumberMinimumValue;
	};
	
	default int getStrongNumberMaximumValue() {
		return strongNumberMaximumValue;};
	
	default int getStrongNumberTotalNumbers() {
		return strongNumberTotalNumbers;};
}
