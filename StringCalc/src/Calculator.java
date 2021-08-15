
public class Calculator {
	public int calculate(String userinput) {
		if(checkisEmpty(userinput)) {
			return 0;
		}
		return stringtoInt(userinput);
	}
	
	private boolean checkisEmpty(String userinput) {
		return userinput.isEmpty();
	}
	
	private int stringtoInt(String userinput) {
		return Integer.parseInt(userinput);
	}
}
