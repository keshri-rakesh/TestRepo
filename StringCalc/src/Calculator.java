
public class Calculator {
	public int calculate(String userinput) {
		if(userinput.isEmpty()) {
			return 0;
		}
		return Integer.parseInt(userinput);
		
	}
}
