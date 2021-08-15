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
	
	//Test3 sum two values with comma delimited
	public void test3returnsumoftwoinput() {
		assertEquals(calc.calculate("1,2"), 3);
	}
	
	//Test4 sum two values with newline delimited
	public void test4returnssumwithnewlinedelimiter() {
		assertEquals(calc.calculate("1\n2"), 3);
	}
}
