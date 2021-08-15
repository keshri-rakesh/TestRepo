public class Calculator {
	public int calculate(String userinput) {
		String[] numbers = userinput.split(",");
		
		if(checkisEmpty(userinput)) {
			return 0;
		}
		if(userinput.length() == 1) {
			return stringtoInt(userinput);
		}
		else {
			return stringtoInt(numbers[0]) + stringtoInt(numbers[1]);
		}
	}
	
	private boolean checkisEmpty(String userinput) {
		return userinput.isEmpty();
	}
	
	private int stringtoInt(String userinput) {
		return Integer.parseInt(userinput);
	}
}
