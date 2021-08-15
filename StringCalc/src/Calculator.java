public class Calculator {
	
	private final String delimiters = ",|\n";
	
	public int calculate(String userinput) {
		String[] numbers = userinput.split(delimiters);
		
		if(checkisEmpty(userinput)) {
			return 0;
		}
		if(userinput.length() == 1) {
			return stringtoInt(userinput);
		}
		else {
			return add(numbers[0],numbers[1]);
		}
	}
	
	private int add(String input1, String input2) {
		return stringtoInt(input1) + stringtoInt(input2);
	}
	
	private boolean checkisEmpty(String userinput) {
		return userinput.isEmpty();
	}
	
	private int stringtoInt(String userinput) {
		return Integer.parseInt(userinput);
	}
}
