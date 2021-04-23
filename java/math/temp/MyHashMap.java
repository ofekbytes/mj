//package jsm.utility.temp;

import java.util.HashMap;

import jsm.Jsm;

public class MyHashMap {

	public MyHashMap() {
		HashMap<String, Integer> points = new HashMap<String, Integer>();
		points.put("english", 60);
		points.put("math", 70);
		points.put("history", 90);

		System.out.println("### Grades ###");
		System.out.println("english = " + points.get("english"));
		System.out.println("math = " + points.get("math"));
		System.out.println("history = " + points.get("history"));
	}// constructor//

	public static void main(String[] args) {
		MyHashMap hm = new MyHashMap();
	}// main//

} // class//
