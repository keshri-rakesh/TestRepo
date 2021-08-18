import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class TestCalc {
	
	private Calculator calc;
	
	@BeforeTest
	public void init() {
		calc = new Calculator();
	}
	
	//Test 1 return zero for empty string
	public void test1emptystring() throws Exception {
		
		assertEquals(calc.calculate(""), 0);
	}
	
	//Test 2 return value for single input
	public void test2returnsinglevalue() throws Exception {
		assertEquals(calc.calculate("1"), 1);
		assertEquals(calc.calculate("5"), 5);
	}
	
	//Test 3 sum two values with comma delimited
	public void test3returnsumoftwoinput() throws Exception {
		assertEquals(calc.calculate("//;\n1;2"), 3);
	}
	
	//Test 4 sum two values with newline delimited
	public void test4returnssumwithnewlinedelimiter() throws Exception {
		assertEquals(calc.calculate("1\n2"), 3);
		assertEquals(calc.calculate("1;2"), 3);
		assertEquals(calc.calculate("1,2"), 3);
	}
	
	//Test 5 sum three numbers anyway delimited
	public void test5threenumsum() throws Exception {
		assertEquals(calc.calculate("1,2;3"), 6);
		assertEquals(calc.calculate("1\n2,3"), 6);
		assertEquals(calc.calculate("1;2\n3"), 6);
	}
	
	//Test 6 throw Exception for negative input 
	@Test(expectedExceptions = Exception.class)
	public void test6throwsexceptionfornegativeinputs() throws Exception {
		calc.calculate("-1");
		calc.calculate("-3");
		calc.calculate("-5");
	}
	
	//Test 7 ignore numbers greater than 1000
	public void test7ignorenumbergreaterthan1000() throws Exception {
		assertEquals(calc.calculate("1000,2"), 2);
		assertEquals(calc.calculate("1998,9"), 9);
	}
	
	//Test 8 multiple negatives
	@Test(expectedExceptions = Exception.class)
	public void test8formultiplenegatives() throws Exception{
		calc.calculate("-1,-2");
	}
	
	//Test9 no of times add method invoked
	public void test9addmethodinvokedcount() throws Exception {
		assertEquals(calc.getCalledCount(), 11);
	}
}
