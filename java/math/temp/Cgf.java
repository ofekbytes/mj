//package jsm.utility.temp;

// jron: fix it //

class GFG {

	public static void main(String arg[]) {

		// size = 10
		int a, b, size = 15;

		/* FOR THE APEX OF HEART */
		for (a = size / 2; a <= size; a = a + 2) {

			for (b = 1; b < size - a; b = b + 2)
				System.out.print(" ");

			for (b = 1; b <= a; b++)
				System.out.print("b");

			for (b = 1; b <= size - a; b++)
				System.out.print(" ");

			for (b = 1; b <= a - 1; b++)
				System.out.print("x ");
			System.out.print("\n");
		}

		/* THE INVERTED TRIANGLE */

		for (a = size; a >= 0; a--) {

			// THE INVERTED TRIANGLE
			for (b = a; b < size; b++)
				System.out.print(" ");

			// THE BASE OF TRIANGLE
			for (b = 1; b <= ((a * 2) - 1); b++)
				System.out.print("V");

			System.out.print("\n");
		}
	}
}
