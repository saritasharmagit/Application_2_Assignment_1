import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Assignment_1Test {
	Assignment_1 obj=new Assignment_1();
	@Test
	void test() {
		int t = obj.upperCase("thesan");
		assertEquals(-1,t);
	}
	void test2() {
		int t = obj.lowerCase("thesan");
		assertEquals(1,t);
		
	}
	void test3() {
		int t = obj.specialChar("thesan@");
		assertEquals(1,t);
		
	}
}
