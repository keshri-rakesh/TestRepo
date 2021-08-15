import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test
public class TestCalc {
	
	//Test1 return zero for empty string
	public void test1emptystring() {
		Calculator calc = new Calculator();
		assertEquals(calc.calculate(""), 0);
	}
	
	//Test2 return value for single input
	public void test2returnsinglevalue() {
		Calculator calc = new Calculator();
		assertEquals(calc.calculate("1"), 1);
	}
}
