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
	
	private void checkfornegativeinputs(String numbers[]) throws Exception { //to check negative inputs
		for(String count : numbers) {
			if(stringtoInt(count)<0) {
				throw new Exception("Negatives not allowed");
			}
		}
	}
	
	private int add(String numbers[]) throws Exception { //add method to handle multiple inputs
		
		checkfornegativeinputs(numbers);
		
		int sum=0;
		for(String count : numbers) {
			if(stringtoInt(count) >=1000) {
				continue;
			}
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
