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
			return add(numbers);
		}
	}
	
	private int add(String numbers[]) {
		int sum=0;
		for(int count=0; count<numbers.length; count++) {
			sum+= stringtoInt(numbers[count]);
		}
		return sum;
	}
	
	private boolean checkisEmpty(String userinput) {
		return userinput.isEmpty();
	}
	
	private int stringtoInt(String userinput) {
		return Integer.parseInt(userinput);
	}
}
