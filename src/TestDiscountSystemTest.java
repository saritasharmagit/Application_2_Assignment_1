import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDiscountSystemTest {
	DiscountRate dr=new DiscountRate();

	@Test
	void test() {
		double rate=dr.getProductDiscountRate("Silver");
		assertEquals("Silver","Silver");
		
	}
	void test1() {
		Customer v= new Customer("srt", true, "Gold");
		String s=v.toString();
		assertEquals("uuu",s);
		
	}
	
}
