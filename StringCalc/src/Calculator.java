public class Calculator {
	
	private final String delimiters = ",|\n";
	
	public int calculate(String userinput) throws Exception {
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
	
	private int add(String numbers[]) throws Exception {
		
		for(String count : numbers) {
			if(stringtoInt(count)<0) {
				throw new Exception("Negatives not allowed");
			}
		}
		
		int sum=0;
		for(String count : numbers) {
			sum+= stringtoInt(count);
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
