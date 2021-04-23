package lottoery;

// unit test 4 //

import static org.junit.Assert.*;

import org.junit.Test;

public class JuTest {

	@Test
	public void test() {
		Lottoery l = new Lottoery();
		int intOutputSquare = l.square(5);
		assertEquals(25, intOutputSquare); //expected-value, actual-value
		
	    l.square(5);
		assertEquals(25, intOutputSquare); //expected-value, actual-value
		
	}

}
