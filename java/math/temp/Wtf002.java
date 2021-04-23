//package jsm.utility.temp;

public class Wtf002 {
	public static void main(String[] args) {
		Machine m1 = new Machine() {
			@Override
			public void start() {
				System.out.println("Wooooo");
			}
		};
		Machine m2 = new Machine();
		m2.start();
		m1.start();
	}
}

class Machine {
	public void start() {
		System.out.println("Starting...");
	}
}
