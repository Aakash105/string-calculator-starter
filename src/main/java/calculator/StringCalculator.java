package calculator;

class StringCalculator {

	 public int add(String input) {
	        if(input.isEmpty()) {
	        	return 0;
	        }
	    	return Integer.parseInt(input);
	    }

	public int addTwo(String input) {
    	
    	String [] arr = input.split(",");
    	
        if(input.isEmpty()) {
        	return 0;
        }else if(arr.length == 1) {
    		return Integer.parseInt(arr[0]);
    	}
    	else  {
    		return getSumTwo(arr);
    	}
    }
    
    private int getSumTwo(String[] numbers)  {
    	int sum = 0;
    	for(int index = 0; index < numbers.length;index++) {
    		sum = Integer.parseInt(numbers[index]) + sum;
    	}
    	return sum;
    }
    
    public int addThree(String input) {
    	
    	String [] arr = input.split(",|\n");
    	
        if(input.isEmpty()) {
        	return 0;
        }else if(arr.length == 1) {
    		return Integer.parseInt(arr[0]);
    	}
    	else  {
    		return getSumThree(arr);
    	}
    }
    
    private int getSumThree(String[] numbers)  {
    	int sum = 0;
    	for(int index = 0; index < numbers.length;index++) {
    		sum = Integer.parseInt(numbers[index]) + sum;
    		
    	}
    	
    	return sum;
    }

    
    
    

}