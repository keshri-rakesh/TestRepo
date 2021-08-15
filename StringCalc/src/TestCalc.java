import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test
public class TestCalc {
	
	public void test1emptystring() {
		Calculator calc = new Calculator();
		assertEquals(calc.calculate(""), 0);
	}
}
