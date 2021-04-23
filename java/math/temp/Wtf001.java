//package jsm.utility.temp;

public class Wtf001 {

	static int year;
	private boolean teal;

	public Wtf001() {
		String name = "David";
		int age = 42;
		double score = 15.9;
		char group = 'Z';
		year = 1977;
		System.out.println(year + " " + age);
	}

	public static void main(String[] args) {
		Wtf001 my = new Wtf001();
		my.teal = true;
		System.out.println(my.teal);
	}

}
