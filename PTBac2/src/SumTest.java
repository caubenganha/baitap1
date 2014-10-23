import static org.junit.Assert.*;

import org.junit.Test;


public class SumTest {

	@Test
	public void test() {
		Sum a = new Sum();
		int sum;
		sum = a.tinh(3,5);
		
		assertEquals(8,sum);
	}

}
