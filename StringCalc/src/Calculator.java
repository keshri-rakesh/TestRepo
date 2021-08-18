public class Calculator {
	static int counter=0;
	public int calculate(String userinput) throws Exception {
		if(checkisEmpty(userinput)) {
			return 0;
		}
		else {
			String delimiters = ",|\n|;";
			
			if(userinput.matches("//(.*)\n(.*)")){
				delimiters = Character.toString(userinput.charAt(2));
				userinput = userinput.substring(4);
			}
			String[] numbers = splitNumbers(userinput, delimiters);
			return add(numbers);
		}
	}
	
	private static String[] splitNumbers(String numbers, String divider) {
		return numbers.split(divider);
	}
	
	private void checkfornegativeinputs(String numbers[]) throws Exception {
		String negString="";
		for(String count : numbers)
			if(stringtoInt(count)<0) {
				if(negString.equals(""))
					negString = count;
				else{
					negString+= ("," +count);
				}
			}
			if(!negString.equals("")){
				throw new Exception("Negatives not allowed \n Negative numbers: "+negString);
			}
	}
	
	private int add(String numbers[]) throws Exception { //add method to handle multiple inputs
		int sum=0;
		checkfornegativeinputs(numbers);
		
		for(String count : numbers) {
			if(stringtoInt(count) >=1000) {
				continue;
			}
			sum+= stringtoInt(count);
		}
		counter++;
		return sum;
	}
	
	public static int getCalledCount(){
		return counter;
	}
	
	private boolean checkisEmpty(String userinput) {
		return userinput.isEmpty();
	}
	
	private int stringtoInt(String userinput) {
		return Integer.parseInt(userinput);
	}
}
