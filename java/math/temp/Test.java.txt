package jsm.utility.temp;

import java.util.ArrayList;

public class Test {

	private ArrayList<String> arrTest = new ArrayList<String>();
	
	public Test() {
		
		arrTest.add("1");
		arrTest.add("11");
		arrTest.add("111");
		
		System.out.println("\n" + arrTest + "\n");
		
		for(int i = 0; i < arrTest.size() ; i++ ) {
			System.out.println(arrTest.get(i));
		}
		
	}

}
