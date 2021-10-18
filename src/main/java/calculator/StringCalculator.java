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
    
    
    
    
public int addFour(String input) {
    	
    	String [] arr = input.split(",|\n");
    	
        if(input.isEmpty()) {
        	return 0;
        }else if(arr.length == 1) {
    		return Integer.parseInt(arr[0]);
    	}
    	else  {
    		return getSumFour(arr);
    	}
    }
    
    private int getSumFour(String[] numbers)  {
    	int sum = 0;
    	for(int index = 0; index < numbers.length;index++) {
    		sum = stringToIntFour(numbers[index]) + sum;
    		
    	}
    	
    	return sum;
    }
    private int stringToIntFour(String number) {
        int num = Integer.parseInt(number);
        if (num < 0) {
            throw new IllegalArgumentException("Negative no not allowed");
        } else {
            return num;
        }
    }

    
    
    
    
    
public int addFive(String input) {
    	
    	String [] arr = input.split(",|\n");
    	
        if(input.isEmpty()) {
        	return 0;
        }else if(arr.length == 1) {
    		return Integer.parseInt(arr[0]);
    	}
    	else  {
    		return getSumFive(arr);
    	}
    }
    
    private int getSumFive(String[] numbers)  {
    	int sum = 0;
    	for(int index = 0; index < numbers.length;index++) {
    		if(stringToIntFive(numbers[index])<=1000) {
    			sum = Integer.parseInt(numbers[index]) + sum;
    		}
    		
    	}
    	
    	return sum;
    }
    private int stringToIntFive(String number) {
        int num = Integer.parseInt(number);
        if (num < 0) {
            throw new IllegalArgumentException("Negative no not allowed");
        } else {
            return num;
        }
    }
    
    
    

}