//package jsm.utility.temp;

import java.util.ArrayList;

public class ArrColor {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Orange");
		colors.remove("Green");

		System.out.println(colors);

		colors.remove(colors.indexOf("Red"));

		System.out.println(colors);

	}
}