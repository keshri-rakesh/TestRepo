import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

@Test
public class TestCalc {
	
	private Calculator calc;
	
	public void init() {
		calc = new Calculator();
	}
	
	//Test1 return zero for empty string
	public void test1emptystring() {
		
		assertEquals(calc.calculate(""), 0);
	}
	
	//Test2 return value for single input
	public void test2returnsinglevalue() {
		assertEquals(calc.calculate("1"), 1);
	}
}
